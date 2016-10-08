package com.tencent.open.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import com.tencent.open.a.f;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.util.List;

public class SystemUtils
{
  public static final String ACTION_LOGIN = "action_login";
  public static final String ACTION_REQUEST_API = "action_request";
  public static final String ACTION_SHARE = "action_share";
  public static final String H5_SHARE_DATA = "h5_share_data";
  public static final String IS_LOGIN = "is_login";
  public static final String IS_QQ_MOBILE_SHARE = "is_qq_mobile_share";
  public static final String QQDATALINE_CALLBACK_ACTION = "sendToMyComputer";
  public static final String QQFAVORITES_CALLBACK_ACTION = "addToQQFavorites";
  public static final String QQ_SHARE_CALLBACK_ACTION = "shareToQQ";
  public static final String QQ_VERSION_NAME_4_2_0 = "4.2.0";
  public static final String QQ_VERSION_NAME_4_3_0 = "4.3.0";
  public static final String QQ_VERSION_NAME_4_5_0 = "4.5.0";
  public static final String QQ_VERSION_NAME_4_6_0 = "4.6.0";
  public static final String QQ_VERSION_NAME_5_0_0 = "5.0.0";
  public static final String QQ_VERSION_NAME_5_1_0 = "5.1.0";
  public static final String QQ_VERSION_NAME_5_2_0 = "5.2.0";
  public static final String QQ_VERSION_NAME_5_3_0 = "5.3.0";
  public static final String QQ_VERSION_NAME_5_9_5 = "5.9.5";
  public static final String QZONE_SHARE_CALLBACK_ACTION = "shareToQzone";
  public static final String TROOPBAR_CALLBACK_ACTION = "shareToTroopBar";
  
  private static long a(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    long l = 0L;
    byte[] arrayOfByte = new byte[' '];
    for (;;)
    {
      int i = paramInputStream.read(arrayOfByte, 0, arrayOfByte.length);
      if (i == -1) {
        break;
      }
      paramOutputStream.write(arrayOfByte, 0, i);
      l += i;
    }
    f.c("openSDK_LOG.SystemUtils", "-->copy, copyed size is: " + l);
    return l;
  }
  
  public static boolean checkMobileQQ(Context paramContext)
  {
    boolean bool2 = false;
    paramContext = paramContext.getPackageManager();
    try
    {
      paramContext = paramContext.getPackageInfo("com.tencent.mobileqq", 0);
      bool1 = bool2;
      if (paramContext != null) {
        paramContext = paramContext.versionName;
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;)
      {
        try
        {
          boolean bool1;
          f.b("MobileQQ verson", paramContext);
          paramContext = paramContext.split("\\.");
          int i = Integer.parseInt(paramContext[0]);
          int j = Integer.parseInt(paramContext[1]);
          if (i <= 4)
          {
            bool1 = bool2;
            if (i == 4)
            {
              bool1 = bool2;
              if (j < 1) {}
            }
          }
          else
          {
            bool1 = true;
          }
          return bool1;
        }
        catch (Exception paramContext)
        {
          f.b("openSDK_LOG.SystemUtils", "checkMobileQQ Exception", paramContext);
          paramContext.printStackTrace();
        }
        paramContext = paramContext;
        f.b("openSDK_LOG.SystemUtils", "checkMobileQQ NameNotFoundException", paramContext);
        paramContext.printStackTrace();
        paramContext = null;
      }
    }
    return false;
  }
  
  public static int compareQQVersion(Context paramContext, String paramString)
  {
    return compareVersion(getAppVersionName(paramContext, "com.tencent.mobileqq"), paramString);
  }
  
  public static int compareVersion(String paramString1, String paramString2)
  {
    if ((paramString1 == null) && (paramString2 == null)) {
      return 0;
    }
    if ((paramString1 != null) && (paramString2 == null)) {
      return 1;
    }
    if ((paramString1 == null) && (paramString2 != null)) {
      return -1;
    }
    String[] arrayOfString1 = paramString1.split("\\.");
    String[] arrayOfString2 = paramString2.split("\\.");
    int i = 0;
    for (;;)
    {
      int j;
      int k;
      try
      {
        if ((i < arrayOfString1.length) && (i < arrayOfString2.length))
        {
          j = Integer.parseInt(arrayOfString1[i]);
          k = Integer.parseInt(arrayOfString2[i]);
          if (j < k) {
            return -1;
          }
        }
        else
        {
          if (arrayOfString1.length > i) {
            return 1;
          }
          j = arrayOfString2.length;
          if (j <= i) {
            break;
          }
          return -1;
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        return paramString1.compareTo(paramString2);
      }
      if (j > k) {
        return 1;
      }
      i += 1;
    }
  }
  
  /* Error */
  @SuppressLint({"SdCardPath"})
  public static boolean extractSecureLib(String paramString1, String paramString2, int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aconst_null
    //   4: astore_3
    //   5: aconst_null
    //   6: astore 6
    //   8: aconst_null
    //   9: astore 5
    //   11: ldc 86
    //   13: new 88	java/lang/StringBuilder
    //   16: dup
    //   17: invokespecial 89	java/lang/StringBuilder:<init>	()V
    //   20: ldc -69
    //   22: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   25: aload_0
    //   26: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   29: invokevirtual 102	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   32: invokestatic 108	com/tencent/open/a/f:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   35: invokestatic 193	com/tencent/open/utils/Global:getContext	()Landroid/content/Context;
    //   38: astore 8
    //   40: aload 8
    //   42: ifnonnull +12 -> 54
    //   45: ldc 86
    //   47: ldc -61
    //   49: invokestatic 108	com/tencent/open/a/f:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   52: iconst_0
    //   53: ireturn
    //   54: aload 8
    //   56: ldc -59
    //   58: iconst_0
    //   59: invokevirtual 201	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   62: astore 7
    //   64: new 203	java/io/File
    //   67: dup
    //   68: aload 8
    //   70: invokevirtual 207	android/content/Context:getFilesDir	()Ljava/io/File;
    //   73: aload_1
    //   74: invokespecial 210	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   77: astore 9
    //   79: aload 9
    //   81: invokevirtual 214	java/io/File:exists	()Z
    //   84: ifne +156 -> 240
    //   87: aload 9
    //   89: invokevirtual 217	java/io/File:getParentFile	()Ljava/io/File;
    //   92: astore 10
    //   94: aload 10
    //   96: ifnull +17 -> 113
    //   99: aload 10
    //   101: invokevirtual 220	java/io/File:mkdirs	()Z
    //   104: ifeq +9 -> 113
    //   107: aload 9
    //   109: invokevirtual 223	java/io/File:createNewFile	()Z
    //   112: pop
    //   113: aload 8
    //   115: invokevirtual 227	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   118: aload_0
    //   119: invokevirtual 233	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   122: astore_0
    //   123: aload_0
    //   124: astore 4
    //   126: aload_3
    //   127: astore_0
    //   128: aload 4
    //   130: astore_3
    //   131: aload 6
    //   133: astore 5
    //   135: aload 8
    //   137: aload_1
    //   138: iconst_0
    //   139: invokevirtual 237	android/content/Context:openFileOutput	(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    //   142: astore_1
    //   143: aload_1
    //   144: astore_0
    //   145: aload 4
    //   147: astore_3
    //   148: aload_1
    //   149: astore 5
    //   151: aload 4
    //   153: aload_1
    //   154: invokestatic 239	com/tencent/open/utils/SystemUtils:a	(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    //   157: pop2
    //   158: aload_1
    //   159: astore_0
    //   160: aload 4
    //   162: astore_3
    //   163: aload_1
    //   164: astore 5
    //   166: aload 7
    //   168: invokeinterface 245 1 0
    //   173: astore 6
    //   175: aload_1
    //   176: astore_0
    //   177: aload 4
    //   179: astore_3
    //   180: aload_1
    //   181: astore 5
    //   183: aload 6
    //   185: ldc -9
    //   187: iload_2
    //   188: invokeinterface 253 3 0
    //   193: pop
    //   194: aload_1
    //   195: astore_0
    //   196: aload 4
    //   198: astore_3
    //   199: aload_1
    //   200: astore 5
    //   202: aload 6
    //   204: invokeinterface 256 1 0
    //   209: pop
    //   210: aload 4
    //   212: ifnull +8 -> 220
    //   215: aload 4
    //   217: invokevirtual 259	java/io/InputStream:close	()V
    //   220: aload_1
    //   221: ifnull +7 -> 228
    //   224: aload_1
    //   225: invokevirtual 260	java/io/OutputStream:close	()V
    //   228: iconst_1
    //   229: ireturn
    //   230: astore 9
    //   232: aload 9
    //   234: invokevirtual 261	java/io/IOException:printStackTrace	()V
    //   237: goto -124 -> 113
    //   240: aload 7
    //   242: ldc -9
    //   244: iconst_0
    //   245: invokeinterface 265 3 0
    //   250: istore 11
    //   252: ldc 86
    //   254: new 88	java/lang/StringBuilder
    //   257: dup
    //   258: invokespecial 89	java/lang/StringBuilder:<init>	()V
    //   261: ldc_w 267
    //   264: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   267: iload_2
    //   268: invokevirtual 270	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   271: ldc_w 272
    //   274: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   277: iload 11
    //   279: invokevirtual 270	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   282: invokevirtual 102	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   285: invokestatic 108	com/tencent/open/a/f:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   288: iload_2
    //   289: iload 11
    //   291: if_icmpne -178 -> 113
    //   294: iconst_1
    //   295: ireturn
    //   296: astore_1
    //   297: aconst_null
    //   298: astore 4
    //   300: aload 5
    //   302: astore_0
    //   303: aload 4
    //   305: astore_3
    //   306: ldc 86
    //   308: ldc_w 274
    //   311: aload_1
    //   312: invokestatic 157	com/tencent/open/a/f:b	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   315: aload 4
    //   317: ifnull +8 -> 325
    //   320: aload 4
    //   322: invokevirtual 259	java/io/InputStream:close	()V
    //   325: aload 5
    //   327: ifnull -275 -> 52
    //   330: aload 5
    //   332: invokevirtual 260	java/io/OutputStream:close	()V
    //   335: iconst_0
    //   336: ireturn
    //   337: astore_0
    //   338: iconst_0
    //   339: ireturn
    //   340: astore_1
    //   341: aconst_null
    //   342: astore_3
    //   343: aload 4
    //   345: astore_0
    //   346: aload_3
    //   347: ifnull +7 -> 354
    //   350: aload_3
    //   351: invokevirtual 259	java/io/InputStream:close	()V
    //   354: aload_0
    //   355: ifnull +7 -> 362
    //   358: aload_0
    //   359: invokevirtual 260	java/io/OutputStream:close	()V
    //   362: aload_1
    //   363: athrow
    //   364: astore_0
    //   365: goto -145 -> 220
    //   368: astore_0
    //   369: goto -141 -> 228
    //   372: astore_0
    //   373: goto -48 -> 325
    //   376: astore_3
    //   377: goto -23 -> 354
    //   380: astore_0
    //   381: goto -19 -> 362
    //   384: astore_1
    //   385: goto -39 -> 346
    //   388: astore_1
    //   389: goto -89 -> 300
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	392	0	paramString1	String
    //   0	392	1	paramString2	String
    //   0	392	2	paramInt	int
    //   4	347	3	str1	String
    //   376	1	3	localIOException1	java.io.IOException
    //   1	343	4	str2	String
    //   9	322	5	localObject	Object
    //   6	197	6	localEditor	SharedPreferences.Editor
    //   62	179	7	localSharedPreferences	SharedPreferences
    //   38	98	8	localContext	Context
    //   77	31	9	localFile1	File
    //   230	3	9	localIOException2	java.io.IOException
    //   92	8	10	localFile2	File
    //   250	42	11	i	int
    // Exception table:
    //   from	to	target	type
    //   107	113	230	java/io/IOException
    //   113	123	296	java/lang/Exception
    //   330	335	337	java/io/IOException
    //   113	123	340	finally
    //   215	220	364	java/io/IOException
    //   224	228	368	java/io/IOException
    //   320	325	372	java/io/IOException
    //   350	354	376	java/io/IOException
    //   358	362	380	java/io/IOException
    //   135	143	384	finally
    //   151	158	384	finally
    //   166	175	384	finally
    //   183	194	384	finally
    //   202	210	384	finally
    //   306	315	384	finally
    //   135	143	388	java/lang/Exception
    //   151	158	388	java/lang/Exception
    //   166	175	388	java/lang/Exception
    //   183	194	388	java/lang/Exception
    //   202	210	388	java/lang/Exception
  }
  
  public static String getActionFromRequestcode(int paramInt)
  {
    if (paramInt == 10103) {
      return "shareToQQ";
    }
    if (paramInt == 10104) {
      return "shareToQzone";
    }
    if (paramInt == 10105) {
      return "addToQQFavorites";
    }
    if (paramInt == 10106) {
      return "sendToMyComputer";
    }
    if (paramInt == 10107) {
      return "shareToTroopBar";
    }
    if (paramInt == 11101) {
      return "action_login";
    }
    if (paramInt == 10100) {
      return "action_request";
    }
    return null;
  }
  
  public static int getAndroidSDKVersion()
  {
    try
    {
      int i = Integer.valueOf(Build.VERSION.SDK).intValue();
      return i;
    }
    catch (NumberFormatException localNumberFormatException) {}
    return 0;
  }
  
  public static String getAppName(Context paramContext)
  {
    return paramContext.getApplicationInfo().loadLabel(paramContext.getPackageManager()).toString();
  }
  
  public static String getAppSignatureMD5(Context paramContext, String paramString)
  {
    f.a("openSDK_LOG.SystemUtils", "OpenUi, getSignValidString");
    try
    {
      String str = paramContext.getPackageName();
      paramContext = paramContext.getPackageManager().getPackageInfo(str, 64).signatures;
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      localMessageDigest.update(paramContext[0].toByteArray());
      paramContext = Util.toHexString(localMessageDigest.digest());
      localMessageDigest.reset();
      f.a("openSDK_LOG.SystemUtils", "-->sign: " + paramContext);
      localMessageDigest.update(Util.getBytesUTF8(str + "_" + paramContext + "_" + paramString + ""));
      paramContext = Util.toHexString(localMessageDigest.digest());
      paramString.printStackTrace();
    }
    catch (Exception paramString)
    {
      try
      {
        localMessageDigest.reset();
        f.a("openSDK_LOG.SystemUtils", "-->signEncryped: " + paramContext);
        return paramContext;
      }
      catch (Exception paramString)
      {
        for (;;) {}
      }
      paramString = paramString;
      paramContext = "";
    }
    f.b("openSDK_LOG.SystemUtils", "OpenUi, getSignValidString error", paramString);
    return paramContext;
  }
  
  public static String getAppVersionName(Context paramContext, String paramString)
  {
    paramContext = paramContext.getPackageManager();
    try
    {
      paramContext = paramContext.getPackageInfo(paramString, 0).versionName;
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext) {}
    return null;
  }
  
  public static String getRealPathFromUri(Activity paramActivity, Uri paramUri)
  {
    Object localObject = null;
    paramUri = paramActivity.managedQuery(paramUri, new String[] { "_data" }, null, null, null);
    paramActivity = (Activity)localObject;
    if (paramUri != null)
    {
      int i = paramUri.getColumnIndexOrThrow("_data");
      paramUri.moveToFirst();
      paramActivity = paramUri.getString(i);
    }
    return paramActivity;
  }
  
  public static int getRequestCodeFromCallback(String paramString)
  {
    if ("shareToQQ".equals(paramString)) {
      return 10103;
    }
    if ("shareToQzone".equals(paramString)) {
      return 10104;
    }
    if ("addToQQFavorites".equals(paramString)) {
      return 10105;
    }
    if ("sendToMyComputer".equals(paramString)) {
      return 10106;
    }
    if ("shareToTroopBar".equals(paramString)) {
      return 10107;
    }
    if ("action_login".equals(paramString)) {
      return 11101;
    }
    if ("action_request".equals(paramString)) {
      return 10100;
    }
    return -1;
  }
  
  public static boolean isActivityExist(Context paramContext, Intent paramIntent)
  {
    if ((paramContext == null) || (paramIntent == null)) {}
    while (paramContext.getPackageManager().queryIntentActivities(paramIntent, 0).size() == 0) {
      return false;
    }
    return true;
  }
  
  public static boolean isAppSignatureValid(Context paramContext, String paramString1, String paramString2)
  {
    boolean bool2 = false;
    f.a("openSDK_LOG.SystemUtils", "OpenUi, validateAppSignatureForPackage");
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramString1, 64);
      paramContext = paramContext.signatures;
      int j = paramContext.length;
      int i = 0;
      for (;;)
      {
        boolean bool1 = bool2;
        if (i < j)
        {
          if (Util.encrypt(paramContext[i].toCharsString()).equals(paramString2)) {
            bool1 = true;
          }
        }
        else {
          return bool1;
        }
        i += 1;
      }
      return false;
    }
    catch (PackageManager.NameNotFoundException paramContext) {}
  }
  
  @SuppressLint({"SdCardPath"})
  public static boolean isLibExtracted(String paramString, int paramInt)
  {
    Object localObject = Global.getContext();
    if (localObject == null) {
      f.c("openSDK_LOG.SystemUtils", "-->isSecureLibExtracted, global context is null. ");
    }
    do
    {
      return false;
      paramString = new File(((Context)localObject).getFilesDir(), paramString);
      localObject = ((Context)localObject).getSharedPreferences("secure_lib", 0);
    } while (!paramString.exists());
    int i = ((SharedPreferences)localObject).getInt("version", 0);
    f.c("openSDK_LOG.SystemUtils", "-->extractSecureLib, libVersion: " + paramInt + " | oldVersion: " + i);
    if (paramInt == i) {
      return true;
    }
    paramString = ((SharedPreferences)localObject).edit();
    paramString.putInt("version", paramInt);
    paramString.commit();
    return false;
  }
  
  public static boolean isSupportMultiTouch()
  {
    Method[] arrayOfMethod = MotionEvent.class.getDeclaredMethods();
    int m = arrayOfMethod.length;
    int i = 0;
    int j = 0;
    int k = 0;
    while (i < m)
    {
      Method localMethod = arrayOfMethod[i];
      if (localMethod.getName().equals("getPointerCount")) {
        k = 1;
      }
      if (localMethod.getName().equals("getPointerId")) {
        j = 1;
      }
      i += 1;
    }
    return (getAndroidSDKVersion() >= 7) || ((k != 0) && (j != 0));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\open\utils\SystemUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */