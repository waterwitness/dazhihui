package tencent.tls.tools;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.os.Environment;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.zip.DeflaterOutputStream;
import tencent.tls.report.QLog;
import tencent.tls.request.req_global;

public class util
{
  public static final long BUILD_TIME = 1460985272L;
  public static final int D = 2;
  private static SimpleDateFormat DAYFORMAT;
  public static final int I = 1;
  public static String LIBWT;
  public static boolean LOGCAT_OUT = false;
  private static final String LOG_DIR = "tencent/tls";
  private static int LOG_LEVEL = 0;
  static final int MAX_CONTENT_SIZE = 4096;
  private static final int MAX_FILE_SIZE = 102400;
  public static int MAX_NAME_LEN = 0;
  @SuppressLint({"NewApi"})
  private static int MODE_MULTI_PROCESS = 0;
  public static final String SDK_VERSION = "1.1.1532";
  private static String SPFileName;
  public static final int SSO_VERSION = 1;
  public static final long SVN_VER = 1532L;
  public static final int S_ROLL_BACK = 180;
  private static final String TAG = "tls_sdk";
  public static final int W = 0;
  static final char[] base64_encode_chars = { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47 };
  static final char base64_pad_url = '_';
  static final short[] base64_reverse_table_url = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 63, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
  private static boolean libwtecdh_loaded;
  
  static
  {
    int i = 0;
    MAX_NAME_LEN = 128;
    LOG_LEVEL = 1;
    LOGCAT_OUT = true;
    DAYFORMAT = null;
    libwtecdh_loaded = false;
    LIBWT = "wtcrypto";
    SPFileName = "TLS_DEVICE_INFO";
    if (Build.VERSION.SDK_INT > 9) {
      i = 4;
    }
    MODE_MULTI_PROCESS = i;
  }
  
  public static boolean ExistSDCard()
  {
    return Environment.getExternalStorageState().equals("mounted");
  }
  
  public static void LOGI(String paramString)
  {
    try
    {
      if ((LOG_LEVEL >= 1) && (LOGCAT_OUT)) {
        Log.i("tls_sdk" + getLineInfo(2), paramString);
      }
      return;
    }
    catch (Exception paramString) {}
  }
  
  public static void LOGI(String paramString1, String paramString2)
  {
    try
    {
      if (LOG_LEVEL >= 1)
      {
        if (LOGCAT_OUT) {
          Log.i("tls_sdk" + getLineInfo(2), paramString1);
        }
        FileTracer.writeLog(req_global._context, paramString2, paramString1);
      }
      return;
    }
    catch (Exception paramString1) {}
  }
  
  public static void LOGW(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      if (LOG_LEVEL >= 0)
      {
        if (LOGCAT_OUT) {
          Log.w("tls_sdk" + getLineInfo(2), paramString1 + ":" + paramString2);
        }
        FileTracer.writeLog(req_global._context, paramString3, paramString1 + ":" + paramString2);
      }
      return;
    }
    catch (Exception paramString1) {}
  }
  
  public static byte[] base64_decode_url(byte[] paramArrayOfByte, int paramInt)
  {
    byte[] arrayOfByte = new byte[24];
    int n = 0;
    int m = 0;
    int i = 0;
    int j = 0;
    int k = paramInt;
    paramInt = n;
    n = k - 1;
    int i1 = i;
    if (k > 0)
    {
      i = j + 1;
      j = paramArrayOfByte[j];
      i1 = j;
      if (j != 0)
      {
        if (j != 95) {
          break label114;
        }
        i1 = j;
      }
    }
    if (i1 == 95)
    {
      i = paramInt;
      switch (m % 4)
      {
      }
    }
    for (;;)
    {
      return arrayOfByte;
      label114:
      k = j;
      if (j == 32) {
        k = 42;
      }
      j = base64_reverse_table_url[k];
      if (j < 0)
      {
        k = n;
        n = i;
        i = j;
        j = n;
        break;
      }
      switch (m % 4)
      {
      }
      for (;;)
      {
        i1 = m + 1;
        k = n;
        m = j;
        j = i;
        i = m;
        m = i1;
        break;
        arrayOfByte[paramInt] = ((byte)(j << 2));
        continue;
        k = paramInt + 1;
        arrayOfByte[paramInt] = ((byte)(arrayOfByte[paramInt] | j >> 4));
        arrayOfByte[k] = ((byte)((j & 0xF) << 4));
        paramInt = k;
        continue;
        k = paramInt + 1;
        arrayOfByte[paramInt] = ((byte)(arrayOfByte[paramInt] | j >> 2));
        arrayOfByte[k] = ((byte)((j & 0x3) << 6));
        paramInt = k;
        continue;
        k = paramInt + 1;
        arrayOfByte[paramInt] = ((byte)(arrayOfByte[paramInt] | j));
        paramInt = k;
      }
      return null;
      i = paramInt + 1;
      arrayOfByte[i] = 0;
    }
  }
  
  public static String base64_encode(byte[] paramArrayOfByte)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    int j = paramArrayOfByte.length;
    int i = 0;
    for (;;)
    {
      int n;
      int k;
      if (i < j)
      {
        n = i + 1;
        k = paramArrayOfByte[i] & 0xFF;
        if (n != j) {
          break label71;
        }
        localStringBuffer.append(base64_encode_chars[(k >>> 2)]);
        localStringBuffer.append(base64_encode_chars[((k & 0x3) << 4)]);
      }
      for (;;)
      {
        return localStringBuffer.toString();
        label71:
        m = n + 1;
        n = paramArrayOfByte[n] & 0xFF;
        if (m != j) {
          break;
        }
        localStringBuffer.append(base64_encode_chars[(k >>> 2)]);
        localStringBuffer.append(base64_encode_chars[((k & 0x3) << 4 | (n & 0xF0) >>> 4)]);
        localStringBuffer.append(base64_encode_chars[((n & 0xF) << 2)]);
      }
      i = m + 1;
      int m = paramArrayOfByte[m] & 0xFF;
      localStringBuffer.append(base64_encode_chars[(k >>> 2)]);
      localStringBuffer.append(base64_encode_chars[((k & 0x3) << 4 | (n & 0xF0) >>> 4)]);
      localStringBuffer.append(base64_encode_chars[((n & 0xF) << 2 | (m & 0xC0) >>> 6)]);
      localStringBuffer.append(base64_encode_chars[(m & 0x3F)]);
    }
  }
  
  public static long buf_len(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return 0L;
    }
    return paramArrayOfByte.length;
  }
  
  public static int buf_to_int16(byte[] paramArrayOfByte, int paramInt)
  {
    return (paramArrayOfByte[paramInt] << 8 & 0xFF00) + (paramArrayOfByte[(paramInt + 1)] << 0 & 0xFF);
  }
  
  public static int buf_to_int32(byte[] paramArrayOfByte, int paramInt)
  {
    return (paramArrayOfByte[paramInt] << 24 & 0xFF000000) + (paramArrayOfByte[(paramInt + 1)] << 16 & 0xFF0000) + (paramArrayOfByte[(paramInt + 2)] << 8 & 0xFF00) + (paramArrayOfByte[(paramInt + 3)] << 0 & 0xFF);
  }
  
  public static long buf_to_int64(byte[] paramArrayOfByte, int paramInt)
  {
    return 0L + (paramArrayOfByte[paramInt] << 56 & 0xFF00000000000000) + (paramArrayOfByte[(paramInt + 1)] << 48 & 0xFF000000000000) + (paramArrayOfByte[(paramInt + 2)] << 40 & 0xFF0000000000) + (paramArrayOfByte[(paramInt + 3)] << 32 & 0xFF00000000) + (paramArrayOfByte[(paramInt + 4)] << 24 & 0xFF000000) + (paramArrayOfByte[(paramInt + 5)] << 16 & 0xFF0000) + (paramArrayOfByte[(paramInt + 6)] << 8 & 0xFF00) + (paramArrayOfByte[(paramInt + 7)] << 0 & 0xFF);
  }
  
  public static int buf_to_int8(byte[] paramArrayOfByte, int paramInt)
  {
    return paramArrayOfByte[paramInt] & 0xFF;
  }
  
  public static String buf_to_string(byte[] paramArrayOfByte)
  {
    Object localObject;
    if (paramArrayOfByte == null)
    {
      localObject = "";
      return (String)localObject;
    }
    String str = "";
    int i = 0;
    for (;;)
    {
      localObject = str;
      if (i >= paramArrayOfByte.length) {
        break;
      }
      str = str + Integer.toHexString(paramArrayOfByte[i] >> 4 & 0xF);
      str = str + Integer.toHexString(paramArrayOfByte[i] & 0xF);
      i += 1;
    }
  }
  
  public static String buf_to_string(byte[] paramArrayOfByte, int paramInt)
  {
    Object localObject;
    if (paramArrayOfByte == null)
    {
      localObject = "";
      return (String)localObject;
    }
    int i = paramInt;
    if (paramInt > paramArrayOfByte.length) {
      i = paramArrayOfByte.length;
    }
    String str = "";
    paramInt = 0;
    for (;;)
    {
      localObject = str;
      if (paramInt >= i) {
        break;
      }
      str = str + Integer.toHexString(paramArrayOfByte[paramInt] >> 4 & 0xF);
      str = str + Integer.toHexString(paramArrayOfByte[paramInt] & 0xF);
      paramInt += 1;
    }
  }
  
  public static boolean checkInvalid(String paramString)
  {
    return (paramString == null) || (paramString.length() <= 0);
  }
  
  public static void chg_retry_type(Context paramContext)
  {
    if (get_net_retry_type(paramContext) == 0)
    {
      set_net_retry_type(paramContext, 1);
      return;
    }
    set_net_retry_type(paramContext, 0);
  }
  
  public static byte[] compress(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0)) {
      return paramArrayOfByte;
    }
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    try
    {
      DeflaterOutputStream localDeflaterOutputStream = new DeflaterOutputStream(localByteArrayOutputStream);
      localDeflaterOutputStream.write(paramArrayOfByte);
      localDeflaterOutputStream.close();
      paramArrayOfByte = localByteArrayOutputStream.toByteArray();
      return paramArrayOfByte;
    }
    catch (IOException paramArrayOfByte) {}
    return new byte[0];
  }
  
  public static void deleteExpireFile(String paramString, int paramInt)
  {
    if ((paramString == null) || (paramString.length() == 0)) {}
    for (;;)
    {
      return;
      LOGI("file path:" + paramString);
      try
      {
        paramString = new File(paramString);
        if (!paramString.isDirectory()) {
          continue;
        }
        paramString = paramString.listFiles();
        if (paramString == null) {
          continue;
        }
        int j = paramString.length;
        int i = 0;
        while (i < j)
        {
          if ((!paramString[i].isDirectory()) && ((System.currentTimeMillis() - paramString[i].lastModified()) / 1000L > paramInt)) {
            paramString[i].delete();
          }
          i += 1;
        }
        return;
      }
      catch (Exception paramString) {}
    }
  }
  
  public static void deleteExpireLog(Context paramContext)
  {
    if (paramContext == null) {
      return;
    }
    try
    {
      if (ExistSDCard())
      {
        File localFile = Environment.getExternalStorageDirectory();
        deleteExpireFile(localFile.getAbsolutePath() + "/" + "tencent/tls" + "/" + paramContext.getPackageName(), 691200);
        return;
      }
      paramContext = paramContext.getFilesDir().getPath();
      deleteExpireFile(paramContext + "/" + "tencent/tls", 259200);
      return;
    }
    catch (Exception paramContext) {}
  }
  
  public static String getCurrentDay()
  {
    try
    {
      if (DAYFORMAT == null) {
        DAYFORMAT = new SimpleDateFormat("yyyyMMdd");
      }
      String str = DAYFORMAT.format(new Date());
      return str;
    }
    catch (Exception localException) {}
    return null;
  }
  
  public static String getDate()
  {
    try
    {
      String str = "[" + System.currentTimeMillis() + "]";
      return str;
    }
    catch (Exception localException) {}
    return "";
  }
  
  public static int getFileSize(String paramString)
  {
    int j = 0;
    try
    {
      paramString = new File(paramString);
      int i = j;
      if (paramString.exists())
      {
        i = j;
        if (paramString.isFile())
        {
          long l = paramString.length();
          i = (int)l;
        }
      }
      return i;
    }
    catch (Exception paramString) {}
    return 0;
  }
  
  public static String getLineInfo(int paramInt)
  {
    if (paramInt < 0) {
      return "";
    }
    try
    {
      Object localObject = new Throwable().getStackTrace()[paramInt];
      localObject = "[" + ((StackTraceElement)localObject).getFileName() + ":" + ((StackTraceElement)localObject).getLineNumber() + "]";
      return (String)localObject;
    }
    catch (Throwable localThrowable) {}
    return "";
  }
  
  public static String getLogFileName(Context paramContext, String paramString)
  {
    if ((paramContext == null) || (paramString == null) || (paramString.length() == 0)) {
      return null;
    }
    try
    {
      if (ExistSDCard())
      {
        File localFile = Environment.getExternalStorageDirectory();
        return localFile.getAbsolutePath() + "/" + "tencent/tls" + "/" + paramContext.getPackageName() + "/" + base64_encode(paramString.getBytes());
      }
      paramContext = paramContext.getFilesDir().getPath();
      paramContext = paramContext + "/" + "tencent/tls" + "/" + base64_encode(paramString.getBytes());
      return paramContext;
    }
    catch (Exception paramContext) {}
    return null;
  }
  
  public static byte[] getPkgSigFromApkName(Context paramContext, String paramString)
  {
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramString, 64);
      if ((paramContext.signatures == null) || (paramContext.signatures.length <= 0) || (paramContext.signatures[0] == null)) {
        return new byte[0];
      }
      paramContext = MD5.toMD5Byte(paramContext.signatures[0].toByteArray());
      return paramContext;
    }
    catch (Throwable paramContext) {}
    return new byte[0];
  }
  
  public static byte[] getS2(byte[] paramArrayOfByte, long paramLong)
  {
    byte[] arrayOfByte = new byte[24];
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, paramArrayOfByte.length);
    int64_to_buf(arrayOfByte, 16, paramLong);
    return MD5.toMD5Byte(arrayOfByte);
  }
  
  public static String getSdkVersion()
  {
    return "[1]";
  }
  
  public static String getThreadId()
  {
    return "[" + Thread.currentThread().getId() + "]";
  }
  
  public static String getUser(String paramString)
  {
    if (paramString != null) {
      return "[" + paramString + "]";
    }
    return "[]";
  }
  
  public static byte[] get_IMEI(Context paramContext)
  {
    Object localObject3 = null;
    for (;;)
    {
      try
      {
        localObject1 = (TelephonyManager)paramContext.getSystemService("phone");
        if (localObject1 != null)
        {
          localObject1 = ((TelephonyManager)localObject1).getDeviceId();
          paramContext = (WifiManager)paramContext.getSystemService("wifi");
          Object localObject2 = localObject3;
          if (paramContext != null)
          {
            paramContext = paramContext.getConnectionInfo();
            localObject2 = localObject3;
            if (paramContext != null) {
              localObject2 = paramContext.getMacAddress();
            }
          }
          paramContext = "";
          if (localObject1 != null) {
            paramContext = "" + (String)localObject1;
          }
          localObject1 = paramContext;
          if (localObject2 != null) {
            localObject1 = paramContext + (String)localObject2;
          }
          if (((String)localObject1).length() <= 0) {
            return new byte[0];
          }
          paramContext = MD5.toMD5Byte(((String)localObject1).getBytes());
          return paramContext;
        }
      }
      catch (Throwable paramContext)
      {
        return new byte[0];
      }
      Object localObject1 = null;
    }
  }
  
  public static byte[] get_IMSI(Context paramContext)
  {
    try
    {
      paramContext = (TelephonyManager)paramContext.getSystemService("phone");
      if (paramContext != null)
      {
        paramContext = paramContext.getSubscriberId();
        if (paramContext != null)
        {
          paramContext = paramContext.getBytes();
          return paramContext;
        }
      }
    }
    catch (Throwable paramContext) {}
    return new byte[0];
  }
  
  @SuppressLint({"NewApi"})
  public static byte[] get_android_id(Context paramContext)
  {
    try
    {
      paramContext = Settings.Secure.getString(paramContext.getContentResolver(), "android_id");
      if (paramContext != null)
      {
        paramContext = paramContext.getBytes();
        return paramContext;
      }
    }
    catch (Throwable paramContext) {}
    return new byte[0];
  }
  
  public static byte[] get_apk_id(Context paramContext)
  {
    try
    {
      paramContext = paramContext.getPackageName().getBytes();
      return paramContext;
    }
    catch (Throwable paramContext) {}
    return new byte[0];
  }
  
  public static byte[] get_apk_v(Context paramContext, String paramString)
  {
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramString, 0).versionName.getBytes();
      return paramContext;
    }
    catch (Throwable paramContext) {}
    return new byte[0];
  }
  
  public static String get_apn_string(Context paramContext)
  {
    try
    {
      paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      if (paramContext.getType() == 0)
      {
        paramContext = paramContext.getExtraInfo();
        if (paramContext != null) {
          return paramContext;
        }
      }
      else
      {
        return "wifi";
      }
    }
    catch (Throwable paramContext) {}
    return "wifi";
  }
  
  public static byte get_char(byte paramByte)
  {
    if ((paramByte >= 48) && (paramByte <= 57)) {
      return (byte)(paramByte - 48);
    }
    if ((paramByte >= 97) && (paramByte <= 102)) {
      return (byte)(paramByte - 97 + 10);
    }
    if ((paramByte >= 65) && (paramByte <= 70)) {
      return (byte)(paramByte - 65 + 10);
    }
    return 0;
  }
  
  public static byte[] get_imei_id(Context paramContext)
  {
    try
    {
      paramContext = (TelephonyManager)paramContext.getSystemService("phone");
      if (paramContext != null)
      {
        paramContext = paramContext.getDeviceId();
        if (paramContext != null)
        {
          paramContext = paramContext.getBytes();
          return paramContext;
        }
      }
    }
    catch (Throwable paramContext) {}
    return new byte[0];
  }
  
  public static int get_last_flag(Context paramContext)
  {
    try
    {
      int i = paramContext.getSharedPreferences(SPFileName, MODE_MULTI_PROCESS).getInt("last_flag", 0);
      return i;
    }
    catch (Throwable paramContext) {}
    return 0;
  }
  
  public static byte[] get_last_guid(Context paramContext)
  {
    Object localObject = new byte[0];
    try
    {
      paramContext = string_to_buf(paramContext.getSharedPreferences(SPFileName, MODE_MULTI_PROCESS).getString("last_guid", ""));
      if (paramContext != null)
      {
        localObject = paramContext;
        if (paramContext.length > 0) {}
      }
      else
      {
        localObject = new byte[0];
      }
      return (byte[])localObject;
    }
    catch (Throwable paramContext)
    {
      for (;;)
      {
        paramContext = (Context)localObject;
      }
    }
  }
  
  public static byte[] get_last_imei(Context paramContext)
  {
    Object localObject = new byte[0];
    try
    {
      paramContext = string_to_buf(paramContext.getSharedPreferences(SPFileName, MODE_MULTI_PROCESS).getString("last_imei", ""));
      if (paramContext != null)
      {
        localObject = paramContext;
        if (paramContext.length > 0) {}
      }
      else
      {
        localObject = new byte[0];
      }
      return (byte[])localObject;
    }
    catch (Throwable paramContext)
    {
      for (;;)
      {
        paramContext = (Context)localObject;
      }
    }
  }
  
  public static byte[] get_last_mac(Context paramContext)
  {
    Object localObject = new byte[0];
    try
    {
      paramContext = string_to_buf(paramContext.getSharedPreferences(SPFileName, MODE_MULTI_PROCESS).getString("last_mac", ""));
      if (paramContext != null)
      {
        localObject = paramContext;
        if (paramContext.length > 0) {}
      }
      else
      {
        localObject = new byte[0];
      }
      return (byte[])localObject;
    }
    catch (Throwable paramContext)
    {
      for (;;)
      {
        paramContext = (Context)localObject;
      }
    }
  }
  
  public static byte[] get_mac_addr(Context paramContext)
  {
    try
    {
      paramContext = (WifiManager)paramContext.getSystemService("wifi");
      if (paramContext != null)
      {
        paramContext = paramContext.getConnectionInfo();
        if (paramContext != null)
        {
          paramContext = paramContext.getMacAddress();
          if (paramContext != null)
          {
            paramContext = paramContext.getBytes();
            return paramContext;
          }
        }
      }
    }
    catch (Throwable paramContext) {}
    return new byte[0];
  }
  
  public static String get_mpasswd()
  {
    try
    {
      byte[] arrayOfByte = SecureRandom.getSeed(16);
      int i = 0;
      String str1 = "";
      String str2 = str1;
      if (i < arrayOfByte.length)
      {
        boolean bool = new Random().nextBoolean();
        int k = Math.abs(arrayOfByte[i] % 26);
        if (bool) {}
        for (int j = 97;; j = 65)
        {
          str1 = str1 + String.valueOf((char)(j + k));
          i += 1;
          break;
        }
      }
      return str2;
    }
    catch (Throwable localThrowable)
    {
      str2 = "1234567890123456";
    }
  }
  
  public static int get_net_retry_type(Context paramContext)
  {
    try
    {
      int i = paramContext.getSharedPreferences(SPFileName, MODE_MULTI_PROCESS).getInt("netretry_type", 0);
      return i;
    }
    catch (Throwable paramContext) {}
    return 0;
  }
  
  public static int get_network_type(Context paramContext)
  {
    try
    {
      i = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo().getType();
      if (i == 0) {
        return 1;
      }
    }
    catch (Throwable paramContext)
    {
      int i;
      for (;;)
      {
        i = 0;
      }
      if (i == 1) {
        return 2;
      }
    }
    return 0;
  }
  
  public static byte[] get_os_type()
  {
    return "android".getBytes();
  }
  
  public static byte[] get_os_version()
  {
    return Build.VERSION.RELEASE.getBytes();
  }
  
  public static byte[] get_prand_16byte()
  {
    try
    {
      byte[] arrayOfByte = new byte[16];
      int32_to_buf(arrayOfByte, 0, (int)(Math.random() * 2.147483647E9D));
      int32_to_buf(arrayOfByte, 4, (int)(Math.random() * 2.147483647E9D));
      int32_to_buf(arrayOfByte, 8, (int)(Math.random() * 2.147483647E9D));
      int32_to_buf(arrayOfByte, 12, (int)(Math.random() * 2.147483647E9D));
      arrayOfByte = MD5.toMD5Byte(arrayOfByte);
      return arrayOfByte;
    }
    catch (Throwable localThrowable) {}
    return new byte[16];
  }
  
  public static String get_proxy_ip()
  {
    return System.getProperty("http.proxyHost");
  }
  
  public static int get_proxy_port()
  {
    try
    {
      int i = Integer.parseInt(System.getProperty("http.proxyPort"));
      return i;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      localNumberFormatException.printStackTrace();
    }
    return -1;
  }
  
  public static byte[] get_rand_16byte(byte[] paramArrayOfByte)
  {
    try
    {
      byte[] arrayOfByte1 = SecureRandom.getSeed(16);
      byte[] arrayOfByte2 = new byte[arrayOfByte1.length + paramArrayOfByte.length];
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, arrayOfByte1.length);
      System.arraycopy(paramArrayOfByte, 0, arrayOfByte2, arrayOfByte1.length, paramArrayOfByte.length);
      paramArrayOfByte = MD5.toMD5Byte(arrayOfByte2);
      return paramArrayOfByte;
    }
    catch (Throwable paramArrayOfByte) {}
    return get_prand_16byte();
  }
  
  public static int get_rand_32()
  {
    return (int)(Math.random() * 2.147483647E9D);
  }
  
  public static String get_release_time()
  {
    return "2015/11/09 17:10:19";
  }
  
  public static byte[] get_saved_imei(Context paramContext)
  {
    try
    {
      paramContext = string_to_buf(paramContext.getSharedPreferences(SPFileName, MODE_MULTI_PROCESS).getString("imei", ""));
      return paramContext;
    }
    catch (Throwable paramContext)
    {
      printThrowable(paramContext, "");
    }
    return new byte[0];
  }
  
  public static int get_saved_network_type(Context paramContext)
  {
    try
    {
      int i = paramContext.getSharedPreferences(SPFileName, MODE_MULTI_PROCESS).getInt("network_type", 0);
      return i;
    }
    catch (Throwable paramContext) {}
    return 0;
  }
  
  public static long get_server_cur_time()
  {
    return req_global.get_server_cur_time();
  }
  
  public static String get_server_host(Context paramContext, String paramString)
  {
    try
    {
      paramContext = paramContext.getSharedPreferences(SPFileName, MODE_MULTI_PROCESS).getString(paramString, "");
      return paramContext;
    }
    catch (Throwable paramContext) {}
    return null;
  }
  
  public static byte[] get_sim_operator_name(Context paramContext)
  {
    try
    {
      paramContext = (TelephonyManager)paramContext.getSystemService("phone");
      if (paramContext.getSimState() == 5)
      {
        paramContext = paramContext.getSimOperatorName().getBytes();
        return paramContext;
      }
    }
    catch (Throwable paramContext) {}
    return new byte[0];
  }
  
  public static void int16_to_buf(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramArrayOfByte[(paramInt1 + 1)] = ((byte)(paramInt2 >> 0));
    paramArrayOfByte[(paramInt1 + 0)] = ((byte)(paramInt2 >> 8));
  }
  
  public static void int32_to_buf(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramArrayOfByte[(paramInt1 + 3)] = ((byte)(paramInt2 >> 0));
    paramArrayOfByte[(paramInt1 + 2)] = ((byte)(paramInt2 >> 8));
    paramArrayOfByte[(paramInt1 + 1)] = ((byte)(paramInt2 >> 16));
    paramArrayOfByte[(paramInt1 + 0)] = ((byte)(paramInt2 >> 24));
  }
  
  public static void int64_to_buf(byte[] paramArrayOfByte, int paramInt, long paramLong)
  {
    paramArrayOfByte[(paramInt + 7)] = ((byte)(int)(paramLong >> 0));
    paramArrayOfByte[(paramInt + 6)] = ((byte)(int)(paramLong >> 8));
    paramArrayOfByte[(paramInt + 5)] = ((byte)(int)(paramLong >> 16));
    paramArrayOfByte[(paramInt + 4)] = ((byte)(int)(paramLong >> 24));
    paramArrayOfByte[(paramInt + 3)] = ((byte)(int)(paramLong >> 32));
    paramArrayOfByte[(paramInt + 2)] = ((byte)(int)(paramLong >> 40));
    paramArrayOfByte[(paramInt + 1)] = ((byte)(int)(paramLong >> 48));
    paramArrayOfByte[(paramInt + 0)] = ((byte)(int)(paramLong >> 56));
  }
  
  public static void int64_to_buf32(byte[] paramArrayOfByte, int paramInt, long paramLong)
  {
    paramArrayOfByte[(paramInt + 3)] = ((byte)(int)(paramLong >> 0));
    paramArrayOfByte[(paramInt + 2)] = ((byte)(int)(paramLong >> 8));
    paramArrayOfByte[(paramInt + 1)] = ((byte)(int)(paramLong >> 16));
    paramArrayOfByte[(paramInt + 0)] = ((byte)(int)(paramLong >> 24));
  }
  
  public static void int8_to_buf(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramArrayOfByte[(paramInt1 + 0)] = ((byte)(paramInt2 >> 0));
  }
  
  public static boolean isFileExist(String paramString)
  {
    try
    {
      boolean bool = new File(paramString).exists();
      return bool;
    }
    catch (Exception paramString) {}
    return false;
  }
  
  public static boolean is_wap_proxy_retry(Context paramContext)
  {
    try
    {
      paramContext = get_apn_string(paramContext);
      if (paramContext != null)
      {
        if (paramContext.equalsIgnoreCase("cmwap")) {
          return true;
        }
        if ((paramContext.equalsIgnoreCase("uniwap")) || (paramContext.equalsIgnoreCase("ctwap"))) {
          break label59;
        }
        boolean bool = paramContext.equalsIgnoreCase("3gwap");
        if (bool) {
          break label59;
        }
      }
    }
    catch (Throwable paramContext)
    {
      for (;;) {}
    }
    return false;
    label59:
    return true;
  }
  
  public static boolean is_wap_retry(Context paramContext)
  {
    return get_net_retry_type(paramContext) != 0;
  }
  
  public static boolean loadLibrary(String paramString, Context paramContext)
  {
    boolean bool2 = true;
    if (Build.VERSION.SDK_INT >= 23) {}
    do
    {
      return false;
      if (libwtecdh_loaded) {
        return true;
      }
    } while ((paramContext == null) || (paramString == null) || (paramString.length() == 0));
    try
    {
      paramContext = new File(paramContext.getFilesDir().getParent() + "/lib/lib" + paramString + ".so");
      if ((paramContext != null) && (paramContext.exists()))
      {
        try
        {
          System.load(paramContext.getAbsolutePath());
          bool1 = true;
        }
        catch (UnsatisfiedLinkError paramContext)
        {
          for (;;)
          {
            bool1 = false;
          }
        }
        if (!bool1)
        {
          try
          {
            System.loadLibrary(paramString);
            bool1 = bool2;
          }
          catch (UnsatisfiedLinkError paramString)
          {
            for (;;)
            {
              bool1 = false;
            }
          }
          libwtecdh_loaded = bool1;
          QLog.i("libwtcrypto loaded " + libwtecdh_loaded);
          return bool1;
        }
      }
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        paramContext = null;
        continue;
        boolean bool1 = false;
      }
    }
  }
  
  public static void printException(Exception paramException, String paramString)
  {
    StringWriter localStringWriter = new StringWriter();
    PrintWriter localPrintWriter = new PrintWriter(localStringWriter, true);
    paramException.printStackTrace(localPrintWriter);
    localPrintWriter.flush();
    localStringWriter.flush();
    LOGW("exception", localStringWriter.toString(), paramString);
  }
  
  public static void printThrowable(Throwable paramThrowable, String paramString)
  {
    StringWriter localStringWriter = new StringWriter();
    PrintWriter localPrintWriter = new PrintWriter(localStringWriter, true);
    paramThrowable.printStackTrace(localPrintWriter);
    localPrintWriter.flush();
    localStringWriter.flush();
    LOGW("throwable", localStringWriter.toString(), paramString);
  }
  
  public static void save_cur_flag(Context paramContext, int paramInt)
  {
    if (paramContext != null)
    {
      paramContext = paramContext.getSharedPreferences(SPFileName, MODE_MULTI_PROCESS).edit();
      paramContext.putInt("last_flag", paramInt);
      paramContext.commit();
    }
  }
  
  public static void save_cur_guid(Context paramContext, byte[] paramArrayOfByte)
  {
    if ((paramContext != null) && (paramArrayOfByte != null) && (paramArrayOfByte.length > 0))
    {
      paramContext = paramContext.getSharedPreferences(SPFileName, MODE_MULTI_PROCESS).edit();
      paramContext.putString("last_guid", buf_to_string(paramArrayOfByte));
      paramContext.commit();
    }
  }
  
  public static void save_cur_imei(Context paramContext, byte[] paramArrayOfByte)
  {
    if ((paramContext != null) && (paramArrayOfByte != null) && (paramArrayOfByte.length > 0))
    {
      paramContext = paramContext.getSharedPreferences(SPFileName, MODE_MULTI_PROCESS).edit();
      paramContext.putString("last_imei", buf_to_string(paramArrayOfByte));
      paramContext.commit();
    }
  }
  
  public static void save_cur_mac(Context paramContext, byte[] paramArrayOfByte)
  {
    if ((paramContext != null) && (paramArrayOfByte != null) && (paramArrayOfByte.length > 0))
    {
      paramContext = paramContext.getSharedPreferences(SPFileName, MODE_MULTI_PROCESS).edit();
      paramContext.putString("last_mac", buf_to_string(paramArrayOfByte));
      paramContext.commit();
    }
  }
  
  /* Error */
  public static void save_file_imei(Context paramContext, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnull +174 -> 175
    //   4: aload_1
    //   5: ifnull +170 -> 175
    //   8: aload_1
    //   9: arraylength
    //   10: ifle +165 -> 175
    //   13: aconst_null
    //   14: astore 6
    //   16: aconst_null
    //   17: astore 7
    //   19: aconst_null
    //   20: astore 5
    //   22: aload 6
    //   24: astore 4
    //   26: aload 7
    //   28: astore_2
    //   29: new 357	java/io/File
    //   32: dup
    //   33: new 225	java/lang/StringBuilder
    //   36: dup
    //   37: invokespecial 226	java/lang/StringBuilder:<init>	()V
    //   40: aload_0
    //   41: invokevirtual 403	android/content/Context:getFilesDir	()Ljava/io/File;
    //   44: invokevirtual 390	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   47: invokevirtual 230	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   50: ldc_w 392
    //   53: invokevirtual 230	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   56: ldc_w 804
    //   59: invokevirtual 230	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   62: invokevirtual 237	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   65: invokespecial 359	java/io/File:<init>	(Ljava/lang/String;)V
    //   68: astore 8
    //   70: aload 6
    //   72: astore 4
    //   74: aload 7
    //   76: astore_2
    //   77: aload 8
    //   79: invokevirtual 433	java/io/File:exists	()Z
    //   82: ifne +16 -> 98
    //   85: aload 6
    //   87: astore 4
    //   89: aload 7
    //   91: astore_2
    //   92: aload 8
    //   94: invokevirtual 807	java/io/File:createNewFile	()Z
    //   97: pop
    //   98: aload 5
    //   100: astore_3
    //   101: aload 6
    //   103: astore 4
    //   105: aload 7
    //   107: astore_2
    //   108: aload 8
    //   110: invokevirtual 433	java/io/File:exists	()Z
    //   113: ifeq +44 -> 157
    //   116: aload 5
    //   118: astore_3
    //   119: aload 6
    //   121: astore 4
    //   123: aload 7
    //   125: astore_2
    //   126: aload 8
    //   128: invokevirtual 810	java/io/File:canWrite	()Z
    //   131: ifeq +26 -> 157
    //   134: aload 6
    //   136: astore 4
    //   138: aload 7
    //   140: astore_2
    //   141: new 812	java/io/FileOutputStream
    //   144: dup
    //   145: aload 8
    //   147: iconst_0
    //   148: invokespecial 815	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   151: astore_3
    //   152: aload_3
    //   153: aload_1
    //   154: invokevirtual 816	java/io/FileOutputStream:write	([B)V
    //   157: aload_3
    //   158: astore 4
    //   160: aload_3
    //   161: astore_2
    //   162: aload_0
    //   163: aload_1
    //   164: invokestatic 819	tencent/tls/tools/util:save_imei	(Landroid/content/Context;[B)V
    //   167: aload_3
    //   168: ifnull +7 -> 175
    //   171: aload_3
    //   172: invokevirtual 820	java/io/FileOutputStream:close	()V
    //   175: return
    //   176: astore_0
    //   177: aload_0
    //   178: ldc_w 304
    //   181: invokestatic 822	tencent/tls/tools/util:printException	(Ljava/lang/Exception;Ljava/lang/String;)V
    //   184: return
    //   185: astore_0
    //   186: aload 4
    //   188: astore_2
    //   189: aload_0
    //   190: ldc_w 304
    //   193: invokestatic 822	tencent/tls/tools/util:printException	(Ljava/lang/Exception;Ljava/lang/String;)V
    //   196: aload 4
    //   198: ifnull -23 -> 175
    //   201: aload 4
    //   203: invokevirtual 820	java/io/FileOutputStream:close	()V
    //   206: return
    //   207: astore_0
    //   208: aload_0
    //   209: ldc_w 304
    //   212: invokestatic 822	tencent/tls/tools/util:printException	(Ljava/lang/Exception;Ljava/lang/String;)V
    //   215: return
    //   216: astore_0
    //   217: aload_2
    //   218: ifnull +7 -> 225
    //   221: aload_2
    //   222: invokevirtual 820	java/io/FileOutputStream:close	()V
    //   225: aload_0
    //   226: athrow
    //   227: astore_1
    //   228: aload_1
    //   229: ldc_w 304
    //   232: invokestatic 822	tencent/tls/tools/util:printException	(Ljava/lang/Exception;Ljava/lang/String;)V
    //   235: goto -10 -> 225
    //   238: astore_0
    //   239: aload_3
    //   240: astore_2
    //   241: goto -24 -> 217
    //   244: astore_0
    //   245: aload_3
    //   246: astore 4
    //   248: goto -62 -> 186
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	251	0	paramContext	Context
    //   0	251	1	paramArrayOfByte	byte[]
    //   28	213	2	localObject1	Object
    //   100	146	3	localObject2	Object
    //   24	223	4	localObject3	Object
    //   20	97	5	localObject4	Object
    //   14	121	6	localObject5	Object
    //   17	122	7	localObject6	Object
    //   68	78	8	localFile	File
    // Exception table:
    //   from	to	target	type
    //   171	175	176	java/io/IOException
    //   29	70	185	java/lang/Exception
    //   77	85	185	java/lang/Exception
    //   92	98	185	java/lang/Exception
    //   108	116	185	java/lang/Exception
    //   126	134	185	java/lang/Exception
    //   141	152	185	java/lang/Exception
    //   162	167	185	java/lang/Exception
    //   201	206	207	java/io/IOException
    //   29	70	216	finally
    //   77	85	216	finally
    //   92	98	216	finally
    //   108	116	216	finally
    //   126	134	216	finally
    //   141	152	216	finally
    //   162	167	216	finally
    //   189	196	216	finally
    //   221	225	227	java/io/IOException
    //   152	157	238	finally
    //   152	157	244	java/lang/Exception
  }
  
  public static void save_imei(Context paramContext, byte[] paramArrayOfByte)
  {
    if ((paramContext != null) && (paramArrayOfByte != null) && (paramArrayOfByte.length > 0))
    {
      paramContext = paramContext.getSharedPreferences(SPFileName, MODE_MULTI_PROCESS).edit();
      paramContext.putString("imei", buf_to_string(paramArrayOfByte));
      paramContext.commit();
    }
  }
  
  public static void save_network_type(Context paramContext, int paramInt)
  {
    if (paramContext != null)
    {
      paramContext = paramContext.getSharedPreferences(SPFileName, MODE_MULTI_PROCESS).edit();
      paramContext.putInt("network_type", paramInt);
      paramContext.commit();
    }
  }
  
  public static void set_net_retry_type(Context paramContext, int paramInt)
  {
    if (paramContext != null)
    {
      paramContext = paramContext.getSharedPreferences(SPFileName, MODE_MULTI_PROCESS).edit();
      paramContext.putInt("netretry_type", paramInt);
      paramContext.commit();
    }
  }
  
  public static void set_server_host(Context paramContext, byte[] paramArrayOfByte, String paramString)
  {
    if ((paramContext != null) && (paramArrayOfByte != null) && (paramArrayOfByte.length > 0))
    {
      paramContext = paramContext.getSharedPreferences(SPFileName, MODE_MULTI_PROCESS).edit();
      paramContext.putString(paramString, new String(paramArrayOfByte));
      paramContext.commit();
    }
  }
  
  public static byte[] string_to_buf(String paramString)
  {
    int i = 0;
    if (paramString == null) {
      return new byte[0];
    }
    byte[] arrayOfByte = new byte[paramString.length() / 2];
    while (i < paramString.length() / 2)
    {
      arrayOfByte[i] = ((byte)((get_char((byte)paramString.charAt(i * 2)) << 4) + get_char((byte)paramString.charAt(i * 2 + 1))));
      i += 1;
    }
    return arrayOfByte;
  }
  
  /* Error */
  public static void writeFile(String paramString, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: aload_0
    //   4: ifnull +14 -> 18
    //   7: aload_0
    //   8: invokevirtual 316	java/lang/String:length	()I
    //   11: istore 4
    //   13: iload 4
    //   15: ifne +7 -> 22
    //   18: ldc 2
    //   20: monitorexit
    //   21: return
    //   22: new 357	java/io/File
    //   25: dup
    //   26: aload_0
    //   27: invokespecial 359	java/io/File:<init>	(Ljava/lang/String;)V
    //   30: astore_2
    //   31: aload_2
    //   32: invokevirtual 433	java/io/File:exists	()Z
    //   35: ifne +26 -> 61
    //   38: aload_2
    //   39: invokevirtual 838	java/io/File:getParentFile	()Ljava/io/File;
    //   42: astore_3
    //   43: aload_3
    //   44: ifnull -26 -> 18
    //   47: aload_3
    //   48: invokevirtual 841	java/io/File:mkdirs	()Z
    //   51: ifne +10 -> 61
    //   54: aload_3
    //   55: invokevirtual 362	java/io/File:isDirectory	()Z
    //   58: ifeq -40 -> 18
    //   61: aload_0
    //   62: invokestatic 843	tencent/tls/tools/util:getFileSize	(Ljava/lang/String;)I
    //   65: ldc 27
    //   67: if_icmpge -49 -> 18
    //   70: new 812	java/io/FileOutputStream
    //   73: dup
    //   74: aload_2
    //   75: iconst_1
    //   76: invokespecial 815	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   79: astore_0
    //   80: aload_0
    //   81: aload_1
    //   82: invokevirtual 816	java/io/FileOutputStream:write	([B)V
    //   85: aload_0
    //   86: invokevirtual 820	java/io/FileOutputStream:close	()V
    //   89: goto -71 -> 18
    //   92: astore_0
    //   93: goto -75 -> 18
    //   96: astore_0
    //   97: ldc 2
    //   99: monitorexit
    //   100: aload_0
    //   101: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	102	0	paramString	String
    //   0	102	1	paramArrayOfByte	byte[]
    //   30	45	2	localFile1	File
    //   42	13	3	localFile2	File
    //   11	3	4	i	int
    // Exception table:
    //   from	to	target	type
    //   22	43	92	java/lang/Exception
    //   47	61	92	java/lang/Exception
    //   61	89	92	java/lang/Exception
    //   7	13	96	finally
    //   22	43	96	finally
    //   47	61	96	finally
    //   61	89	96	finally
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\tools\util.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */