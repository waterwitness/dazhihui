package com.android.thinkive.framework.util;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.StatFs;
import android.os.storage.StorageManager;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashMap;
import org.json.JSONObject;

public class DeviceUtil
{
  public static String NETWORK_IP = "";
  private static String SDCARD_EXTERNAL = "external";
  private static String SDCARD_INTERNAL = "internal";
  
  public static boolean checkSDCardMount14(Context paramContext, String paramString)
  {
    if (paramString == null) {
      return false;
    }
    paramContext = (StorageManager)paramContext.getSystemService("storage");
    try
    {
      boolean bool = "mounted".equals((String)paramContext.getClass().getMethod("getVolumeState", new Class[] { String.class }).invoke(paramContext, new Object[] { paramString }));
      return bool;
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
    }
    return false;
  }
  
  public static String getAndroidId(Context paramContext)
  {
    return Settings.Secure.getString(paramContext.getContentResolver(), "android_id");
  }
  
  public static long getAvailableExternalStorageSize()
  {
    if (isExternalStorageAvailable())
    {
      StatFs localStatFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
      long l = localStatFs.getBlockSize();
      return localStatFs.getAvailableBlocks() * l;
    }
    return -1L;
  }
  
  public static long getAvailableInternalStorageSize()
  {
    StatFs localStatFs = new StatFs(Environment.getDataDirectory().getPath());
    long l = localStatFs.getBlockSize();
    return localStatFs.getAvailableBlocks() * l;
  }
  
  public static String getBasebandVersion()
  {
    try
    {
      Object localObject1 = Class.forName("android.os.SystemProperties");
      Object localObject2 = ((Class)localObject1).newInstance();
      localObject1 = (String)((Class)localObject1).getMethod("get", new Class[] { String.class, String.class }).invoke(localObject2, new Object[] { "gsm.version.baseband", "no message" });
      return (String)localObject1;
    }
    catch (Exception localException) {}
    return "";
  }
  
  public static String getDeviceId(Context paramContext)
  {
    return ((TelephonyManager)paramContext.getSystemService("phone")).getDeviceId();
  }
  
  public static String getDeviceModel()
  {
    return Build.MODEL;
  }
  
  public static String getInnerVersion()
  {
    return Build.DISPLAY;
  }
  
  public static String getIpAddress(Context paramContext)
  {
    Object localObject2 = "";
    if (paramContext == null) {
      return "";
    }
    paramContext = (WifiManager)paramContext.getSystemService("wifi");
    if (paramContext.isWifiEnabled())
    {
      paramContext = paramContext.getConnectionInfo();
      int i = 0;
      if (paramContext != null) {
        i = paramContext.getIpAddress();
      }
      if (i != 0) {
        return intToIp(i);
      }
    }
    localObject1 = localObject2;
    try
    {
      Enumeration localEnumeration = NetworkInterface.getNetworkInterfaces();
      paramContext = (Context)localObject2;
      for (;;)
      {
        localObject1 = paramContext;
        if (!localEnumeration.hasMoreElements()) {
          return paramContext;
        }
        localObject1 = paramContext;
        localObject2 = ((NetworkInterface)localEnumeration.nextElement()).getInetAddresses();
        InetAddress localInetAddress;
        do
        {
          do
          {
            localObject1 = paramContext;
            if (!((Enumeration)localObject2).hasMoreElements()) {
              break;
            }
            localObject1 = paramContext;
            localInetAddress = (InetAddress)((Enumeration)localObject2).nextElement();
            localObject1 = paramContext;
          } while (localInetAddress.isLoopbackAddress());
          localObject1 = paramContext;
        } while (!(localInetAddress instanceof Inet4Address));
        localObject1 = paramContext;
        paramContext = localInetAddress.getHostAddress().toString();
      }
      return (String)localObject1;
    }
    catch (SocketException paramContext)
    {
      paramContext.printStackTrace();
    }
  }
  
  public static String getLinuxCoreVersion()
  {
    Object localObject1 = null;
    try
    {
      localObject2 = Runtime.getRuntime().exec("cat /proc/version");
      localObject1 = localObject2;
    }
    catch (IOException localIOException2)
    {
      for (;;)
      {
        try
        {
          Object localObject2 = localBufferedReader.readLine();
          if (localObject2 == null) {
            if (localObject1 == "") {
              break label173;
            }
          }
        }
        catch (IOException localIOException3)
        {
          int i;
          String str3;
          localIOException3.printStackTrace();
          continue;
        }
        try
        {
          i = ((String)localObject1).indexOf("version ");
          localObject1 = ((String)localObject1).substring("version ".length() + i);
          localObject1 = ((String)localObject1).substring(0, ((String)localObject1).indexOf(" "));
        }
        catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
        {
          localIndexOutOfBoundsException.printStackTrace();
          try
          {
            localBufferedReader.close();
            return "";
          }
          catch (IOException localIOException1)
          {
            localIOException1.printStackTrace();
            return "";
          }
        }
        finally
        {
          try
          {
            localBufferedReader.close();
            throw str1;
          }
          catch (IOException localIOException4)
          {
            for (;;)
            {
              localIOException4.printStackTrace();
            }
          }
        }
        try
        {
          localBufferedReader.close();
          return (String)localObject1;
        }
        catch (IOException localIOException5)
        {
          localIOException5.printStackTrace();
          return str1;
        }
        localIOException2 = localIOException2;
        localIOException2.printStackTrace();
        continue;
        str3 = localObject1 + localIOException2;
        localObject1 = str3;
      }
    }
    BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(((Process)localObject1).getInputStream()), 8192);
    label173:
    String str2;
    for (localObject1 = "";; str2 = "") {}
  }
  
  public static String getMIUI_VerCode()
  {
    if (!Build.MANUFACTURER.equals("Xiaomi")) {
      return "";
    }
    try
    {
      Object localObject1 = Class.forName("android.os.SystemProperties");
      Object localObject2 = ((Class)localObject1).newInstance();
      localObject1 = (String)((Class)localObject1).getMethod("get", new Class[] { String.class, String.class }).invoke(localObject2, new Object[] { "ro.miui.ui.version.code", "no message" });
      return (String)localObject1;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        String str = "";
      }
    }
  }
  
  public static String getMIUI_VerName()
  {
    if (!Build.MANUFACTURER.equals("Xiaomi")) {
      return "";
    }
    try
    {
      Object localObject1 = Class.forName("android.os.SystemProperties");
      Object localObject2 = ((Class)localObject1).newInstance();
      localObject1 = (String)((Class)localObject1).getMethod("get", new Class[] { String.class, String.class }).invoke(localObject2, new Object[] { "ro.miui.ui.version.name", "no message" });
      return (String)localObject1;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        String str = "";
      }
    }
  }
  
  public static String getMacAddress(Context paramContext)
  {
    if (paramContext == null) {
      return "";
    }
    paramContext = ((WifiManager)paramContext.getSystemService("wifi")).getConnectionInfo();
    if (paramContext != null) {}
    for (paramContext = paramContext.getMacAddress();; paramContext = "") {
      return paramContext;
    }
  }
  
  public static String getNetWorkIpAddress()
  {
    try
    {
      Object localObject = (HttpURLConnection)new URL("http://pv.sohu.com/cityjson?ie=utf-8").openConnection();
      ((HttpURLConnection)localObject).setReadTimeout(6000);
      ((HttpURLConnection)localObject).setConnectTimeout(6000);
      if (((HttpURLConnection)localObject).getResponseCode() == 200)
      {
        localObject = ((HttpURLConnection)localObject).getInputStream();
        BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader((InputStream)localObject, "utf-8"));
        StringBuilder localStringBuilder = new StringBuilder();
        for (;;)
        {
          String str = localBufferedReader.readLine();
          if (str == null)
          {
            ((InputStream)localObject).close();
            return new JSONObject(localStringBuilder.substring(localStringBuilder.indexOf("{"), localStringBuilder.indexOf("}") + 1).toString()).getString("cip");
          }
          localStringBuilder.append(str + "\n");
        }
      }
      return null;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public static String getRelease()
  {
    return Build.VERSION.RELEASE;
  }
  
  public static HashMap<String, SDCardInfo> getSDCardInfo(Context paramContext)
  {
    HashMap localHashMap = new HashMap();
    try
    {
      Object localObject1 = (StorageManager)paramContext.getSystemService("storage");
      localObject1 = (String[])localObject1.getClass().getMethod("getVolumePaths", new Class[0]).invoke(localObject1, new Object[0]);
      if ((localObject1 != null) && (localObject1.length > 0))
      {
        String str = localObject1[0];
        SDCardInfo localSDCardInfo = new SDCardInfo();
        localSDCardInfo.setMountPoint(str);
        localSDCardInfo.setMounted(checkSDCardMount14(paramContext, str));
        localHashMap.put(SDCARD_INTERNAL, localSDCardInfo);
        if (localObject1.length >= 2)
        {
          str = localObject1[1];
          localSDCardInfo = new SDCardInfo();
          localSDCardInfo.setMountPoint(localObject1[1]);
          localSDCardInfo.setMounted(checkSDCardMount14(paramContext, str));
          localHashMap.put(SDCARD_EXTERNAL, localSDCardInfo);
        }
      }
      return localHashMap;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
        Object localObject2 = null;
      }
    }
  }
  
  public static int getSdkVersion()
  {
    return Build.VERSION.SDK_INT;
  }
  
  public static long getTotalExternalStorageSize()
  {
    if (isExternalStorageAvailable())
    {
      StatFs localStatFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
      long l = localStatFs.getBlockSize();
      return localStatFs.getBlockCount() * l;
    }
    return -1L;
  }
  
  public static long getTotalInternalStorageSize()
  {
    StatFs localStatFs = new StatFs(Environment.getDataDirectory().getPath());
    long l = localStatFs.getBlockSize();
    return localStatFs.getBlockCount() * l;
  }
  
  private static String intToIp(int paramInt)
  {
    return (paramInt & 0xFF) + "." + (paramInt >> 8 & 0xFF) + "." + (paramInt >> 16 & 0xFF) + "." + (paramInt >> 24 & 0xFF);
  }
  
  public static boolean isExternalStorageAvailable()
  {
    return "mounted".equals(Environment.getExternalStorageState());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\util\DeviceUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */