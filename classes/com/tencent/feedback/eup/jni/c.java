package com.tencent.feedback.eup.jni;

import android.content.Context;
import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class c
{
  public long a;
  public String b;
  public long c;
  public Map<String, String[]> d;
  
  /* Error */
  public static com.tencent.feedback.eup.e a(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: new 22	java/io/File
    //   3: dup
    //   4: aload_1
    //   5: ldc 24
    //   7: invokespecial 27	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   10: astore_1
    //   11: aload_1
    //   12: invokevirtual 31	java/io/File:exists	()Z
    //   15: ifeq +10 -> 25
    //   18: aload_1
    //   19: invokevirtual 34	java/io/File:canRead	()Z
    //   22: ifne +5 -> 27
    //   25: aconst_null
    //   26: areturn
    //   27: new 36	java/io/FileInputStream
    //   30: dup
    //   31: aload_1
    //   32: invokespecial 39	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   35: astore_3
    //   36: aload_3
    //   37: astore_1
    //   38: aload_3
    //   39: invokestatic 42	com/tencent/feedback/eup/jni/c:a	(Ljava/io/InputStream;)Ljava/lang/String;
    //   42: astore_2
    //   43: aload_2
    //   44: ifnull +14 -> 58
    //   47: aload_3
    //   48: astore_1
    //   49: aload_2
    //   50: ldc 44
    //   52: invokevirtual 50	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   55: ifne +31 -> 86
    //   58: aload_3
    //   59: astore_1
    //   60: ldc 52
    //   62: iconst_1
    //   63: anewarray 4	java/lang/Object
    //   66: dup
    //   67: iconst_0
    //   68: aload_2
    //   69: aastore
    //   70: invokestatic 57	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   73: aload_3
    //   74: invokevirtual 60	java/io/FileInputStream:close	()V
    //   77: aconst_null
    //   78: areturn
    //   79: astore_0
    //   80: aload_0
    //   81: invokevirtual 63	java/io/IOException:printStackTrace	()V
    //   84: aconst_null
    //   85: areturn
    //   86: aload_3
    //   87: astore_1
    //   88: new 65	java/util/HashMap
    //   91: dup
    //   92: invokespecial 66	java/util/HashMap:<init>	()V
    //   95: astore 5
    //   97: aconst_null
    //   98: astore_2
    //   99: aload_3
    //   100: astore_1
    //   101: aload_3
    //   102: invokestatic 42	com/tencent/feedback/eup/jni/c:a	(Ljava/io/InputStream;)Ljava/lang/String;
    //   105: astore 4
    //   107: aload 4
    //   109: ifnull +31 -> 140
    //   112: aload_2
    //   113: ifnonnull +9 -> 122
    //   116: aload 4
    //   118: astore_2
    //   119: goto -20 -> 99
    //   122: aload_3
    //   123: astore_1
    //   124: aload 5
    //   126: aload_2
    //   127: aload 4
    //   129: invokeinterface 72 3 0
    //   134: pop
    //   135: aconst_null
    //   136: astore_2
    //   137: goto -38 -> 99
    //   140: aload_2
    //   141: ifnull +31 -> 172
    //   144: aload_3
    //   145: astore_1
    //   146: ldc 74
    //   148: iconst_1
    //   149: anewarray 4	java/lang/Object
    //   152: dup
    //   153: iconst_0
    //   154: aload_2
    //   155: aastore
    //   156: invokestatic 57	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   159: aload_3
    //   160: invokevirtual 60	java/io/FileInputStream:close	()V
    //   163: aconst_null
    //   164: areturn
    //   165: astore_0
    //   166: aload_0
    //   167: invokevirtual 63	java/io/IOException:printStackTrace	()V
    //   170: aconst_null
    //   171: areturn
    //   172: aload_3
    //   173: astore_1
    //   174: aload_0
    //   175: aload 5
    //   177: invokestatic 77	com/tencent/feedback/eup/jni/c:a	(Landroid/content/Context;Ljava/util/Map;)Lcom/tencent/feedback/eup/e;
    //   180: astore_0
    //   181: aload_3
    //   182: invokevirtual 60	java/io/FileInputStream:close	()V
    //   185: aload_0
    //   186: areturn
    //   187: astore_1
    //   188: aload_1
    //   189: invokevirtual 63	java/io/IOException:printStackTrace	()V
    //   192: aload_0
    //   193: areturn
    //   194: astore_2
    //   195: aconst_null
    //   196: astore_0
    //   197: aload_0
    //   198: astore_1
    //   199: aload_2
    //   200: invokevirtual 63	java/io/IOException:printStackTrace	()V
    //   203: aload_0
    //   204: ifnull -179 -> 25
    //   207: aload_0
    //   208: invokevirtual 60	java/io/FileInputStream:close	()V
    //   211: aconst_null
    //   212: areturn
    //   213: astore_0
    //   214: aload_0
    //   215: invokevirtual 63	java/io/IOException:printStackTrace	()V
    //   218: aconst_null
    //   219: areturn
    //   220: astore_0
    //   221: aconst_null
    //   222: astore_1
    //   223: aload_1
    //   224: ifnull +7 -> 231
    //   227: aload_1
    //   228: invokevirtual 60	java/io/FileInputStream:close	()V
    //   231: aload_0
    //   232: athrow
    //   233: astore_1
    //   234: aload_1
    //   235: invokevirtual 63	java/io/IOException:printStackTrace	()V
    //   238: goto -7 -> 231
    //   241: astore_0
    //   242: goto -19 -> 223
    //   245: astore_2
    //   246: aload_3
    //   247: astore_0
    //   248: goto -51 -> 197
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	251	0	paramContext	Context
    //   0	251	1	paramString	String
    //   42	113	2	localObject	Object
    //   194	6	2	localIOException1	java.io.IOException
    //   245	1	2	localIOException2	java.io.IOException
    //   35	212	3	localFileInputStream	java.io.FileInputStream
    //   105	23	4	str	String
    //   95	81	5	localHashMap	HashMap
    // Exception table:
    //   from	to	target	type
    //   73	77	79	java/io/IOException
    //   159	163	165	java/io/IOException
    //   181	185	187	java/io/IOException
    //   27	36	194	java/io/IOException
    //   207	211	213	java/io/IOException
    //   27	36	220	finally
    //   227	231	233	java/io/IOException
    //   38	43	241	finally
    //   49	58	241	finally
    //   60	73	241	finally
    //   88	97	241	finally
    //   101	107	241	finally
    //   124	135	241	finally
    //   146	159	241	finally
    //   174	181	241	finally
    //   199	203	241	finally
    //   38	43	245	java/io/IOException
    //   49	58	245	java/io/IOException
    //   60	73	245	java/io/IOException
    //   88	97	245	java/io/IOException
    //   101	107	245	java/io/IOException
    //   124	135	245	java/io/IOException
    //   146	159	245	java/io/IOException
    //   174	181	245	java/io/IOException
  }
  
  private static com.tencent.feedback.eup.e a(Context paramContext, Map<String, String> paramMap)
  {
    if (paramMap == null)
    {
      paramContext = null;
      return paramContext;
    }
    if (com.tencent.feedback.common.c.a(paramContext) == null)
    {
      com.tencent.feedback.common.e.d("abnormal com info not created", new Object[0]);
      return null;
    }
    Object localObject = (String)paramMap.get("intStateStr");
    if ((localObject == null) || (((String)localObject).trim().length() <= 0))
    {
      com.tencent.feedback.common.e.d("no intStateStr", new Object[0]);
      return null;
    }
    localObject = b((String)localObject);
    if (localObject == null)
    {
      com.tencent.feedback.common.e.d("parse intSateMap fail", new Object[] { Integer.valueOf(paramMap.size()) });
      return null;
    }
    label475:
    label478:
    label481:
    label484:
    for (;;)
    {
      try
      {
        ((Integer)((Map)localObject).get("ep")).intValue();
        ((Integer)((Map)localObject).get("et")).intValue();
        ((Integer)((Map)localObject).get("sino")).intValue();
        int i = ((Integer)((Map)localObject).get("sico")).intValue();
        int j = ((Integer)((Map)localObject).get("spd")).intValue();
        ((Integer)((Map)localObject).get("sud")).intValue();
        long l1 = ((Integer)((Map)localObject).get("ets")).intValue();
        long l2 = ((Integer)((Map)localObject).get("etms")).intValue();
        String str5 = (String)paramMap.get("soVersion");
        if (str5 == null)
        {
          com.tencent.feedback.common.e.d("error format at version", new Object[0]);
          return null;
        }
        String str1 = (String)paramMap.get("errorAddr");
        if (str1 == null)
        {
          str1 = "unknown2";
          String str2 = (String)paramMap.get("codeMsg");
          if (str2 != null) {
            break label475;
          }
          str2 = "unknown2";
          String str3 = (String)paramMap.get("tombPath");
          if (str3 != null) {
            break label478;
          }
          str3 = "unknown2";
          String str4 = (String)paramMap.get("signalName");
          if (str4 != null) {
            break label481;
          }
          str4 = "unknown2";
          paramMap.get("errnoMsg");
          localObject = (String)paramMap.get("stack");
          if (localObject != null) {
            break label484;
          }
          localObject = "unknown2";
          String str6 = (String)paramMap.get("jstack");
          paramMap = (Map<String, String>)localObject;
          if (str6 != null) {
            paramMap = (String)localObject + "java:\n" + str6;
          }
          paramMap = b.a(paramContext, l2 / 1000L + 1000L * l1, str4, str1, paramMap, str3, i, str2, -j, null, null, str5);
          paramContext = paramMap;
          if (paramMap == null) {
            break;
          }
          paramMap.f(true);
          return paramMap;
        }
      }
      catch (Throwable paramContext)
      {
        com.tencent.feedback.common.e.d("error format", new Object[0]);
        paramContext.printStackTrace();
        return null;
      }
      continue;
      continue;
      continue;
    }
  }
  
  private static String a(InputStream paramInputStream)
  {
    if (paramInputStream == null) {
      return null;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    for (;;)
    {
      int i = paramInputStream.read();
      if (i == -1) {
        break;
      }
      if (i == 0) {
        return localStringBuilder.toString();
      }
      localStringBuilder.append((char)i);
    }
  }
  
  public static void a(String paramString)
  {
    paramString = new File(paramString, "rqd_record.eup");
    if ((!paramString.exists()) || (!paramString.canWrite())) {
      return;
    }
    paramString.delete();
    com.tencent.feedback.common.e.b("delete record file %s", new Object[] { paramString.getAbsoluteFile() });
  }
  
  private static Map<String, Integer> b(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    for (;;)
    {
      int i;
      String[] arrayOfString2;
      try
      {
        HashMap localHashMap = new HashMap();
        String[] arrayOfString1 = paramString.split(",");
        int j = arrayOfString1.length;
        i = 0;
        if (i >= j) {
          break;
        }
        String str = arrayOfString1[i];
        arrayOfString2 = str.split(":");
        if (arrayOfString2.length != 2)
        {
          com.tencent.feedback.common.e.d("error format at %s", new Object[] { str });
          return null;
        }
      }
      catch (Exception localException)
      {
        com.tencent.feedback.common.e.d("error format intStateStr %s", new Object[] { paramString });
        localException.printStackTrace();
        return null;
      }
      int k = Integer.parseInt(arrayOfString2[1]);
      localException.put(arrayOfString2[0], Integer.valueOf(k));
      i += 1;
    }
    return localException;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\feedback\eup\jni\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */