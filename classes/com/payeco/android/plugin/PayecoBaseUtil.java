package com.payeco.android.plugin;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.payeco.android.plugin.http.encryption.Base64;
import com.payeco.android.plugin.http.encryption.MD5;
import com.payeco.android.plugin.http.encryption.RSA;
import com.payeco.android.plugin.http.encryption.ThreeDES;
import com.payeco.android.plugin.http.parse.ConfigFileUtil;
import com.payeco.android.plugin.http.parse.ConfigParseService;
import com.payeco.android.plugin.util.IdcardUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.text.DecimalFormat;
import java.util.Enumeration;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.util.EncodingUtils;

public class PayecoBaseUtil
{
  private static String a()
  {
    for (;;)
    {
      char[] arrayOfChar;
      int i;
      synchronized (new Object())
      {
        Random localRandom = new Random();
        arrayOfChar = "0123456789abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        ??? = new char[24];
        i = 0;
        if (i >= ???.length) {
          return new String((char[])???);
        }
      }
      ???[i] = arrayOfChar[localObject2.nextInt(71)];
      i += 1;
    }
  }
  
  public static boolean checkAnsStr(String paramString)
  {
    return paramString.matches("[^<>&\"']{1,}");
  }
  
  public static boolean checkIdNum(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return false;
    }
    return IdcardUtils.validateCard(paramString);
  }
  
  public static boolean checkMobileNum(String paramString)
  {
    return Pattern.compile("[0-9]{11}").matcher(paramString).matches();
  }
  
  public static boolean checkNetWork(Context paramContext)
  {
    paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    return (paramContext != null) && (paramContext.getState() == NetworkInfo.State.CONNECTED) && (paramContext.isAvailable());
  }
  
  public static boolean checkPan(String paramString)
  {
    return paramString.matches("[0-9]{1,}");
  }
  
  public static boolean checkStrlength(String paramString, int paramInt)
  {
    return (!TextUtils.isEmpty(paramString)) && (paramString.length() == paramInt);
  }
  
  public static Dialog createWaitDialog(Context paramContext, boolean paramBoolean)
  {
    Resources localResources = paramContext.getResources();
    String str = paramContext.getPackageName();
    LinearLayout localLinearLayout = (LinearLayout)LayoutInflater.from(paramContext).inflate(localResources.getIdentifier("payeco_plugin_wait_dialog", "layout", str), null).findViewById(localResources.getIdentifier("payeco_waitHttpResDialog", "id", str));
    paramContext = new Dialog(paramContext, localResources.getIdentifier("payeco_fullHeightDialog", "style", str));
    paramContext.setCancelable(paramBoolean);
    paramContext.setContentView(localLinearLayout);
    return paramContext;
  }
  
  public static String encryptPin(Activity paramActivity, String paramString)
  {
    if (paramString == null) {
      return null;
    }
    return RSA.encryptForConfig(paramString, String.valueOf(getConfigValue(paramActivity, "frontModulus")), String.valueOf(getConfigValue(paramActivity, "frontPublicExponent")));
  }
  
  public static String fomatAmount(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      double d = Double.parseDouble(paramString);
      paramString = new DecimalFormat();
      paramString.applyPattern("0.00");
      return paramString.format(d);
    }
    return null;
  }
  
  public static String formatString(String paramString, int paramInt)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if ((paramString != null) && (paramString.length() > paramInt)) {
      localStringBuilder.append("**").append(paramString.substring(paramString.length() - paramInt, paramString.length()));
    }
    for (;;)
    {
      return localStringBuilder.toString();
      localStringBuilder.append(paramString);
    }
  }
  
  public static String formatTimeStr(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString.substring(0, 4));
    localStringBuilder.append("-").append(paramString.substring(4, 6));
    localStringBuilder.append("-").append(paramString.substring(6, 8));
    localStringBuilder.append(" ").append(paramString.substring(8, 10));
    localStringBuilder.append(":").append(paramString.substring(10, 12));
    localStringBuilder.append(":").append(paramString.substring(12, 14));
    return localStringBuilder.toString();
  }
  
  public static String getConfigFilePrivateKey(Context paramContext)
  {
    String str2 = getValueFromPreferences(paramContext, "configFilePrivateKey");
    String str1 = str2;
    if (str2 == null)
    {
      str1 = a();
      saveValueToPreferencs(paramContext, "configFilePrivateKey", str1);
    }
    return str1;
  }
  
  public static Object getConfigValue(Activity paramActivity, String paramString)
  {
    int i = 0;
    Object localObject2 = null;
    PayecoPluginApplication localPayecoPluginApplication = PayecoPluginApplication.getInstance();
    Map localMap2 = localPayecoPluginApplication.getConfigMap();
    localObject1 = localMap2;
    if (localMap2 == null)
    {
      localObject1 = localMap2;
      localMap1 = localMap2;
    }
    try
    {
      Object localObject3 = getConfigFilePrivateKey(paramActivity);
      localObject1 = localMap2;
      localMap1 = localMap2;
      byte[] arrayOfByte = ConfigFileUtil.readConfigFile(paramActivity.openFileInput("payeco_plugin_config.xml"));
      localObject1 = localMap2;
      localMap1 = localMap2;
      localObject3 = ThreeDES.decryptMode(((String)localObject3).getBytes(), arrayOfByte);
      localObject1 = localMap2;
      localMap1 = localMap2;
      arrayOfByte = new MD5().getMD5((byte[])localObject3);
      localObject1 = localMap2;
      localMap1 = localMap2;
      if (Base64.encodeLines(ConfigFileUtil.readConfigFile(paramActivity.openFileInput("payeco_plugin_config_md5.xml"))).equalsIgnoreCase(Base64.encodeLines(arrayOfByte))) {
        i = 1;
      }
      localObject1 = localMap2;
      if (i != 0)
      {
        localObject1 = localMap2;
        localMap1 = localMap2;
        ConfigFileUtil.writeConfigFile(paramActivity, EncodingUtils.getString((byte[])localObject3, "UTF-8"), "temp.xml", 0);
        localObject1 = localMap2;
        localMap1 = localMap2;
        localMap2 = new ConfigParseService().parseConfig(paramActivity.openFileInput("temp.xml"));
        localObject1 = localMap2;
        localMap1 = localMap2;
        localPayecoPluginApplication.setConfigMap(localMap2);
        localObject1 = localMap2;
        localMap1 = localMap2;
        paramActivity.deleteFile("temp.xml");
        localObject1 = localMap2;
      }
    }
    catch (IOException paramActivity)
    {
      for (;;)
      {
        paramActivity.printStackTrace();
      }
    }
    catch (Exception paramActivity)
    {
      for (;;)
      {
        paramActivity.printStackTrace();
        localObject1 = localMap1;
      }
    }
    paramActivity = (Activity)localObject2;
    if (localObject1 != null) {
      paramActivity = ((Map)localObject1).get(paramString);
    }
    return paramActivity;
  }
  
  public static String getIMEI(Context paramContext)
  {
    return ((TelephonyManager)paramContext.getSystemService("phone")).getDeviceId();
  }
  
  public static String getIMSI(Context paramContext)
  {
    return ((TelephonyManager)paramContext.getSystemService("phone")).getSubscriberId();
  }
  
  public static String getLocalMacAddress(Context paramContext)
  {
    return ((WifiManager)paramContext.getSystemService("wifi")).getConnectionInfo().getMacAddress();
  }
  
  public static String getValueFromPreferences(Context paramContext, String paramString)
  {
    return paramContext.getSharedPreferences("plugin_preference", 0).getString(paramString, null);
  }
  
  public static void saveFile(String paramString1, String paramString2)
  {
    try
    {
      paramString2 = new File(paramString2);
      if (!paramString2.exists())
      {
        new File(paramString2.getParent()).mkdirs();
        paramString2.createNewFile();
      }
      paramString2 = new FileOutputStream(paramString2, true);
      paramString2.write(paramString1.getBytes());
      paramString2.close();
      return;
    }
    catch (FileNotFoundException paramString1)
    {
      paramString1.printStackTrace();
      return;
    }
    catch (IOException paramString1)
    {
      paramString1.printStackTrace();
    }
  }
  
  public static void saveValueToPreferencs(Context paramContext, String paramString1, String paramString2)
  {
    paramContext = paramContext.getSharedPreferences("plugin_preference", 0).edit();
    paramContext.putString(paramString1, paramString2);
    paramContext.commit();
  }
  
  public static void showCommonDialog(Context paramContext, String paramString1, String paramString2, String paramString3, DialogInterface.OnClickListener paramOnClickListener1, String paramString4, DialogInterface.OnClickListener paramOnClickListener2, boolean paramBoolean)
  {
    paramContext = new AlertDialog.Builder(paramContext);
    paramContext.setMessage(paramString2);
    paramContext.setTitle(paramString1);
    paramContext.setPositiveButton(paramString3, paramOnClickListener1);
    paramContext.setNegativeButton(paramString4, paramOnClickListener2);
    paramContext.setCancelable(paramBoolean);
    paramContext.create().show();
  }
  
  public static void showToast(Context paramContext, int paramInt)
  {
    Toast.makeText(paramContext, paramInt, 0).show();
  }
  
  public static void showToast(Context paramContext, String paramString)
  {
    Toast.makeText(paramContext, paramString, 0).show();
  }
  
  public static void startActivity(Activity paramActivity, Class paramClass, String paramString, Serializable paramSerializable, boolean paramBoolean)
  {
    paramClass = new Intent(paramActivity, paramClass);
    paramClass.addFlags(131072);
    if (paramSerializable != null) {
      paramClass.putExtra(paramString, paramSerializable);
    }
    paramActivity.startActivity(paramClass);
    paramActivity.overridePendingTransition(17432576, 17432577);
    if (paramBoolean) {
      paramActivity.finish();
    }
  }
  
  public String getLocalIpAddress(Context paramContext)
  {
    try
    {
      InetAddress localInetAddress;
      do
      {
        paramContext = NetworkInterface.getNetworkInterfaces();
        Enumeration localEnumeration;
        while (!localEnumeration.hasMoreElements())
        {
          if (!paramContext.hasMoreElements()) {
            break;
          }
          localEnumeration = ((NetworkInterface)paramContext.nextElement()).getInetAddresses();
        }
        localInetAddress = (InetAddress)localEnumeration.nextElement();
      } while (localInetAddress.isLoopbackAddress());
      paramContext = localInetAddress.getHostAddress().toString();
      return paramContext;
    }
    catch (SocketException paramContext)
    {
      Log.e("WifiPreference IpAddress", paramContext.toString());
    }
    return null;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\PayecoBaseUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */