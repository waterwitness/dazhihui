package com.tencent.feedback.common;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import java.util.Iterator;
import java.util.List;

public final class a
{
  private static String a = null;
  private static Boolean b = null;
  private static Boolean c = null;
  
  /* Error */
  public static android.util.SparseArray<String> a(int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: iconst_0
    //   3: istore 6
    //   5: new 25	android/util/SparseArray
    //   8: dup
    //   9: invokespecial 28	android/util/SparseArray:<init>	()V
    //   12: astore_3
    //   13: invokestatic 34	java/lang/Runtime:getRuntime	()Ljava/lang/Runtime;
    //   16: ldc 36
    //   18: invokevirtual 40	java/lang/Runtime:exec	(Ljava/lang/String;)Ljava/lang/Process;
    //   21: astore_1
    //   22: aload_1
    //   23: ifnull +312 -> 335
    //   26: new 42	java/io/BufferedReader
    //   29: dup
    //   30: new 44	java/io/InputStreamReader
    //   33: dup
    //   34: aload_1
    //   35: invokevirtual 50	java/lang/Process:getInputStream	()Ljava/io/InputStream;
    //   38: invokespecial 53	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   41: invokespecial 56	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   44: astore_1
    //   45: ldc 58
    //   47: invokestatic 64	java/util/regex/Pattern:compile	(Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   50: astore 4
    //   52: aload_1
    //   53: invokevirtual 68	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   56: astore 5
    //   58: aload_1
    //   59: astore_2
    //   60: aload 5
    //   62: ifnull +275 -> 337
    //   65: iload 6
    //   67: iconst_1
    //   68: iadd
    //   69: istore 7
    //   71: iload 7
    //   73: istore 6
    //   75: iload 7
    //   77: iconst_1
    //   78: if_icmpeq -26 -> 52
    //   81: aload 4
    //   83: aload 5
    //   85: invokevirtual 72	java/util/regex/Pattern:matcher	(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   88: invokevirtual 78	java/util/regex/Matcher:matches	()Z
    //   91: ifne +30 -> 121
    //   94: ldc 80
    //   96: iconst_1
    //   97: anewarray 4	java/lang/Object
    //   100: dup
    //   101: iconst_0
    //   102: aload 5
    //   104: aastore
    //   105: invokestatic 85	com/tencent/feedback/common/e:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   108: aload_1
    //   109: invokevirtual 88	java/io/BufferedReader:close	()V
    //   112: aconst_null
    //   113: areturn
    //   114: astore_1
    //   115: aload_1
    //   116: invokevirtual 91	java/io/IOException:printStackTrace	()V
    //   119: aconst_null
    //   120: areturn
    //   121: aload 5
    //   123: invokevirtual 96	java/lang/String:trim	()Ljava/lang/String;
    //   126: ldc 98
    //   128: invokevirtual 102	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   131: astore_2
    //   132: aload_2
    //   133: ifnull +10 -> 143
    //   136: aload_2
    //   137: arraylength
    //   138: bipush 9
    //   140: if_icmpge +30 -> 170
    //   143: ldc 80
    //   145: iconst_1
    //   146: anewarray 4	java/lang/Object
    //   149: dup
    //   150: iconst_0
    //   151: aload 5
    //   153: aastore
    //   154: invokestatic 85	com/tencent/feedback/common/e:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   157: aload_1
    //   158: invokevirtual 88	java/io/BufferedReader:close	()V
    //   161: aconst_null
    //   162: areturn
    //   163: astore_1
    //   164: aload_1
    //   165: invokevirtual 91	java/io/IOException:printStackTrace	()V
    //   168: aconst_null
    //   169: areturn
    //   170: iload 7
    //   172: istore 6
    //   174: aload_2
    //   175: iconst_0
    //   176: aaload
    //   177: invokestatic 108	android/os/Process:getUidForName	(Ljava/lang/String;)I
    //   180: iload_0
    //   181: if_icmpne -129 -> 52
    //   184: new 110	java/lang/StringBuffer
    //   187: dup
    //   188: invokespecial 111	java/lang/StringBuffer:<init>	()V
    //   191: astore 5
    //   193: bipush 8
    //   195: istore 6
    //   197: iload 6
    //   199: aload_2
    //   200: arraylength
    //   201: if_icmpge +73 -> 274
    //   204: iload 6
    //   206: bipush 8
    //   208: if_icmple +31 -> 239
    //   211: aload 5
    //   213: new 113	java/lang/StringBuilder
    //   216: dup
    //   217: ldc 115
    //   219: invokespecial 118	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   222: aload_2
    //   223: iload 6
    //   225: aaload
    //   226: invokevirtual 122	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   229: invokevirtual 125	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   232: invokevirtual 128	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   235: pop
    //   236: goto +145 -> 381
    //   239: aload 5
    //   241: aload_2
    //   242: iload 6
    //   244: aaload
    //   245: invokevirtual 128	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   248: pop
    //   249: goto +132 -> 381
    //   252: astore_2
    //   253: aload_2
    //   254: invokevirtual 129	java/lang/Exception:printStackTrace	()V
    //   257: aload_1
    //   258: ifnull -146 -> 112
    //   261: aload_1
    //   262: invokevirtual 88	java/io/BufferedReader:close	()V
    //   265: aconst_null
    //   266: areturn
    //   267: astore_1
    //   268: aload_1
    //   269: invokevirtual 91	java/io/IOException:printStackTrace	()V
    //   272: aconst_null
    //   273: areturn
    //   274: aload 5
    //   276: invokevirtual 130	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   279: astore 5
    //   281: aload_3
    //   282: aload_2
    //   283: iconst_1
    //   284: aaload
    //   285: invokestatic 135	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   288: aload 5
    //   290: invokevirtual 139	android/util/SparseArray:put	(ILjava/lang/Object;)V
    //   293: ldc -115
    //   295: iconst_2
    //   296: anewarray 4	java/lang/Object
    //   299: dup
    //   300: iconst_0
    //   301: aload_2
    //   302: iconst_1
    //   303: aaload
    //   304: aastore
    //   305: dup
    //   306: iconst_1
    //   307: aload 5
    //   309: aastore
    //   310: invokestatic 143	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   313: iload 7
    //   315: istore 6
    //   317: goto -265 -> 52
    //   320: astore_3
    //   321: aload_1
    //   322: astore_2
    //   323: aload_3
    //   324: astore_1
    //   325: aload_2
    //   326: ifnull +7 -> 333
    //   329: aload_2
    //   330: invokevirtual 88	java/io/BufferedReader:close	()V
    //   333: aload_1
    //   334: athrow
    //   335: aconst_null
    //   336: astore_2
    //   337: aload_2
    //   338: ifnull +7 -> 345
    //   341: aload_2
    //   342: invokevirtual 88	java/io/BufferedReader:close	()V
    //   345: aload_3
    //   346: areturn
    //   347: astore_1
    //   348: aload_1
    //   349: invokevirtual 91	java/io/IOException:printStackTrace	()V
    //   352: goto -7 -> 345
    //   355: astore_2
    //   356: aload_2
    //   357: invokevirtual 91	java/io/IOException:printStackTrace	()V
    //   360: goto -27 -> 333
    //   363: astore_1
    //   364: goto -39 -> 325
    //   367: astore_3
    //   368: aload_1
    //   369: astore_2
    //   370: aload_3
    //   371: astore_1
    //   372: goto -47 -> 325
    //   375: astore_2
    //   376: aconst_null
    //   377: astore_1
    //   378: goto -125 -> 253
    //   381: iload 6
    //   383: iconst_1
    //   384: iadd
    //   385: istore 6
    //   387: goto -190 -> 197
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	390	0	paramInt	int
    //   21	88	1	localObject1	Object
    //   114	44	1	localIOException1	java.io.IOException
    //   163	99	1	localIOException2	java.io.IOException
    //   267	55	1	localIOException3	java.io.IOException
    //   324	10	1	localSparseArray1	android.util.SparseArray<String>
    //   347	2	1	localIOException4	java.io.IOException
    //   363	6	1	localObject2	Object
    //   371	7	1	localObject3	Object
    //   1	241	2	localObject4	Object
    //   252	50	2	localException1	Exception
    //   322	20	2	localObject5	Object
    //   355	2	2	localIOException5	java.io.IOException
    //   369	1	2	localObject6	Object
    //   375	1	2	localException2	Exception
    //   12	270	3	localSparseArray	android.util.SparseArray
    //   320	26	3	localSparseArray2	android.util.SparseArray<String>
    //   367	4	3	localObject7	Object
    //   50	32	4	localPattern	java.util.regex.Pattern
    //   56	252	5	localObject8	Object
    //   3	383	6	i	int
    //   69	245	7	j	int
    // Exception table:
    //   from	to	target	type
    //   108	112	114	java/io/IOException
    //   157	161	163	java/io/IOException
    //   45	52	252	java/lang/Exception
    //   52	58	252	java/lang/Exception
    //   81	108	252	java/lang/Exception
    //   121	132	252	java/lang/Exception
    //   136	143	252	java/lang/Exception
    //   143	157	252	java/lang/Exception
    //   174	193	252	java/lang/Exception
    //   197	204	252	java/lang/Exception
    //   211	236	252	java/lang/Exception
    //   239	249	252	java/lang/Exception
    //   274	313	252	java/lang/Exception
    //   261	265	267	java/io/IOException
    //   45	52	320	finally
    //   52	58	320	finally
    //   81	108	320	finally
    //   121	132	320	finally
    //   136	143	320	finally
    //   143	157	320	finally
    //   174	193	320	finally
    //   197	204	320	finally
    //   211	236	320	finally
    //   239	249	320	finally
    //   274	313	320	finally
    //   341	345	347	java/io/IOException
    //   329	333	355	java/io/IOException
    //   5	22	363	finally
    //   26	45	363	finally
    //   253	257	367	finally
    //   5	22	375	java/lang/Exception
    //   26	45	375	java/lang/Exception
  }
  
  public static String a(Context paramContext)
  {
    if (paramContext == null) {
      return "";
    }
    try
    {
      paramContext = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128).metaData.get("APPKEY_DENGTA");
      if (paramContext != null)
      {
        paramContext = paramContext.toString();
        return paramContext;
      }
    }
    catch (Throwable paramContext)
    {
      e.a("rqdp{  no appkey !!}", new Object[0]);
    }
    return "";
  }
  
  public static String a(Context paramContext, int paramInt)
  {
    paramContext = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses().iterator();
    while (paramContext.hasNext())
    {
      ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)paramContext.next();
      if (localRunningAppProcessInfo.pid == paramInt) {
        return localRunningAppProcessInfo.processName;
      }
    }
    return "unknown";
  }
  
  public static String a(Context paramContext, String paramString)
  {
    if ((paramContext == null) || (paramString == null)) {}
    for (;;)
    {
      return null;
      try
      {
        paramContext = paramContext.getPackageManager().getApplicationInfo(paramString, 0);
        if (paramContext != null)
        {
          paramContext = paramContext.sourceDir;
          return paramContext;
        }
      }
      catch (Throwable paramContext)
      {
        paramContext.printStackTrace();
      }
    }
    return null;
  }
  
  public static String b(Context paramContext)
  {
    if (paramContext == null) {
      return null;
    }
    return paramContext.getPackageName();
  }
  
  public static boolean b(Context paramContext, String paramString)
  {
    if ((paramContext == null) || (paramString == null) || (paramString.trim().length() <= 0)) {
      return false;
    }
    try
    {
      paramContext = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses();
      if ((paramContext == null) || (paramContext.size() == 0))
      {
        e.b("rqdp{  no running proc}", new Object[0]);
        return false;
      }
      paramContext = paramContext.iterator();
      while (paramContext.hasNext())
      {
        ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)paramContext.next();
        if (localRunningAppProcessInfo.importance == 100)
        {
          String[] arrayOfString = localRunningAppProcessInfo.pkgList;
          int j = arrayOfString.length;
          int i = 0;
          while (i < j)
          {
            if (paramString.equals(arrayOfString[i]))
            {
              e.b("rqdp{  current seen pn:}%s", new Object[] { localRunningAppProcessInfo.processName });
              return true;
            }
            i += 1;
          }
        }
      }
      return false;
    }
    catch (Throwable paramContext)
    {
      paramContext.printStackTrace();
      e.d("rqdp{  Failed to judge }[%s]", new Object[] { paramContext.getLocalizedMessage() });
      e.b("rqdp{  current unseen pn:}%s", new Object[] { paramString });
    }
  }
  
  public static String c(Context paramContext)
  {
    int j = 0;
    if (paramContext == null) {}
    for (Object localObject = null;; localObject = paramContext.getPackageName())
    {
      try
      {
        localObject = paramContext.getPackageManager().getPackageInfo((String)localObject, 0);
        paramContext = ((PackageInfo)localObject).versionName;
        m = ((PackageInfo)localObject).versionCode;
        if ((paramContext != null) && (paramContext.trim().length() > 0)) {
          break;
        }
        paramContext = "";
      }
      catch (Throwable paramContext)
      {
        for (;;)
        {
          int m;
          paramContext.printStackTrace();
          e.d(paramContext.toString(), new Object[0]);
          paramContext = null;
        }
      }
      finally {}
      return paramContext;
    }
    localObject = paramContext.toCharArray();
    int i = 0;
    for (;;)
    {
      int k;
      if (i < localObject.length)
      {
        k = j;
        if (localObject[i] == '.') {
          k = j + 1;
        }
      }
      else
      {
        if (j < 3) {
          paramContext = paramContext + "." + m;
        }
        for (;;)
        {
          e.a("rqdp{  version:} %s", new Object[] { paramContext });
          break;
        }
      }
      i += 1;
      j = k;
    }
  }
  
  private static boolean c(Context paramContext, String paramString)
  {
    e.b("rqdp{  AppInfo.isContainReadLogPermission() start}", new Object[0]);
    if ((paramContext == null) || (paramString == null) || (paramString.trim().length() <= 0)) {
      return false;
    }
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 4096).requestedPermissions;
      if (paramContext != null)
      {
        int j = paramContext.length;
        int i = 0;
        while (i < j)
        {
          boolean bool = paramString.equals(paramContext[i]);
          if (bool) {
            return true;
          }
          i += 1;
        }
      }
      return false;
    }
    catch (Throwable paramContext)
    {
      paramContext.printStackTrace();
      return false;
    }
    finally
    {
      e.b("rqdp{  AppInfo.isContainReadLogPermission() end}", new Object[0]);
    }
  }
  
  public static String d(Context paramContext)
  {
    e.b("rqdp{AppInfo.getUUID() Start}", new Object[0]);
    if (paramContext == null)
    {
      e.d("context == null", new Object[0]);
      return "";
    }
    for (;;)
    {
      try
      {
        paramContext = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128);
        if ((paramContext == null) || (paramContext.metaData == null))
        {
          e.d("appInfo == null || appInfo.metaData == null", new Object[0]);
          return "";
        }
        paramContext = paramContext.metaData.get("com.tencent.rdm.uuid");
        if (paramContext != null)
        {
          paramContext = paramContext.toString();
          Log.d("rqdp{ RDMUUID }:%s", paramContext);
          return paramContext;
        }
      }
      catch (Throwable paramContext)
      {
        paramContext.printStackTrace();
        e.d(paramContext.toString(), new Object[0]);
        return "";
      }
      paramContext = "";
    }
  }
  
  /* Error */
  public static boolean e(Context paramContext)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: ldc 2
    //   4: monitorenter
    //   5: ldc_w 311
    //   8: iconst_0
    //   9: anewarray 4	java/lang/Object
    //   12: invokestatic 143	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   15: aload_0
    //   16: ifnonnull +8 -> 24
    //   19: ldc 2
    //   21: monitorexit
    //   22: iload_1
    //   23: ireturn
    //   24: getstatic 15	com/tencent/feedback/common/a:b	Ljava/lang/Boolean;
    //   27: ifnonnull +16 -> 43
    //   30: aload_0
    //   31: ldc_w 313
    //   34: invokestatic 315	com/tencent/feedback/common/a:c	(Landroid/content/Context;Ljava/lang/String;)Z
    //   37: invokestatic 321	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   40: putstatic 15	com/tencent/feedback/common/a:b	Ljava/lang/Boolean;
    //   43: getstatic 15	com/tencent/feedback/common/a:b	Ljava/lang/Boolean;
    //   46: invokevirtual 324	java/lang/Boolean:booleanValue	()Z
    //   49: istore_1
    //   50: goto -31 -> 19
    //   53: astore_0
    //   54: ldc 2
    //   56: monitorexit
    //   57: aload_0
    //   58: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	59	0	paramContext	Context
    //   1	49	1	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   5	15	53	finally
    //   24	43	53	finally
    //   43	50	53	finally
  }
  
  /* Error */
  public static boolean f(Context paramContext)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: ldc 2
    //   4: monitorenter
    //   5: ldc_w 327
    //   8: iconst_0
    //   9: anewarray 4	java/lang/Object
    //   12: invokestatic 143	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   15: aload_0
    //   16: ifnonnull +8 -> 24
    //   19: ldc 2
    //   21: monitorexit
    //   22: iload_1
    //   23: ireturn
    //   24: getstatic 17	com/tencent/feedback/common/a:c	Ljava/lang/Boolean;
    //   27: ifnonnull +16 -> 43
    //   30: aload_0
    //   31: ldc_w 329
    //   34: invokestatic 315	com/tencent/feedback/common/a:c	(Landroid/content/Context;Ljava/lang/String;)Z
    //   37: invokestatic 321	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   40: putstatic 17	com/tencent/feedback/common/a:c	Ljava/lang/Boolean;
    //   43: getstatic 17	com/tencent/feedback/common/a:c	Ljava/lang/Boolean;
    //   46: invokevirtual 324	java/lang/Boolean:booleanValue	()Z
    //   49: istore_1
    //   50: goto -31 -> 19
    //   53: astore_0
    //   54: ldc 2
    //   56: monitorexit
    //   57: aload_0
    //   58: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	59	0	paramContext	Context
    //   1	49	1	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   5	15	53	finally
    //   24	43	53	finally
    //   43	50	53	finally
  }
  
  public static String g(Context paramContext)
  {
    if (paramContext == null) {
      return null;
    }
    paramContext = a(paramContext, paramContext.getPackageName());
    if (paramContext == null)
    {
      e.d("rqdp{  No found the apk file on the device,please check it!}", new Object[0]);
      return null;
    }
    return com.tencent.feedback.proguard.a.a(paramContext);
  }
  
  public static String h(Context paramContext)
  {
    try
    {
      paramContext = a(paramContext, Process.myPid());
      return paramContext;
    }
    catch (Throwable paramContext)
    {
      paramContext.printStackTrace();
    }
    return null;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\feedback\common\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */