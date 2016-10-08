package com.iflytek.sunflower;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.iflytek.sunflower.c.g;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class d
{
  private static long a = 2097152L;
  
  public static long a(Context paramContext, String paramString)
  {
    paramContext = new File(paramContext.getFilesDir(), paramString);
    if (!paramContext.exists()) {
      return 0L;
    }
    return paramContext.length();
  }
  
  public static SharedPreferences a(Context paramContext)
  {
    StringBuilder localStringBuilder = new StringBuilder("iflytek_state_");
    localStringBuilder.append(paramContext.getPackageName());
    return paramContext.getSharedPreferences(localStringBuilder.toString(), 0);
  }
  
  public static void a(Context paramContext, String paramString, Long paramLong)
  {
    paramContext = a(paramContext).edit();
    paramContext.putLong(paramString, paramLong.longValue());
    paramContext.commit();
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2, int paramInt)
  {
    if (paramString1 != null) {}
    for (;;)
    {
      String str;
      try
      {
        boolean bool = paramString1.equals("");
        if (bool) {
          return;
        }
        try
        {
          str = c(paramContext);
          if (paramString2 == null) {
            break label92;
          }
        }
        catch (IOException paramContext)
        {
          g.d("Collector", "write to file error.");
        }
        paramContext = paramContext.openFileOutput(paramString2, paramInt);
        paramContext.write(paramString1.getBytes());
        paramContext.flush();
        paramContext.close();
        g.a("Collector", "write to file success");
        continue;
        continue;
        paramInt = 0;
      }
      finally {}
      label92:
      do
      {
        break;
        paramString2 = str;
      } while (paramInt == 0);
    }
  }
  
  private static boolean a(File paramFile)
  {
    long l = paramFile.length();
    g.a("Collector", "file length:" + l);
    return (paramFile.exists()) && (l > a);
  }
  
  public static SharedPreferences b(Context paramContext)
  {
    StringBuilder localStringBuilder = new StringBuilder("iflytek_online_");
    localStringBuilder.append(paramContext.getPackageName());
    return paramContext.getSharedPreferences(localStringBuilder.toString(), 0);
  }
  
  public static String c(Context paramContext)
  {
    return "iflytek_cached_" + paramContext.getPackageName();
  }
  
  public static String d(Context paramContext)
  {
    return "iflytek_log_" + paramContext.getPackageName();
  }
  
  /* Error */
  public static org.json.JSONObject e(Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: ldc 2
    //   4: monitorenter
    //   5: aload_0
    //   6: invokestatic 95	com/iflytek/sunflower/d:c	(Landroid/content/Context;)Ljava/lang/String;
    //   9: astore_1
    //   10: new 16	java/io/File
    //   13: dup
    //   14: aload_0
    //   15: invokevirtual 22	android/content/Context:getFilesDir	()Ljava/io/File;
    //   18: aload_1
    //   19: invokespecial 26	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   22: astore_3
    //   23: aload_3
    //   24: invokestatic 156	com/iflytek/sunflower/d:a	(Ljava/io/File;)Z
    //   27: ifeq +22 -> 49
    //   30: aload_3
    //   31: invokevirtual 159	java/io/File:delete	()Z
    //   34: pop
    //   35: ldc 117
    //   37: ldc -95
    //   39: invokestatic 163	com/iflytek/sunflower/c/g:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   42: aload_2
    //   43: astore_1
    //   44: ldc 2
    //   46: monitorexit
    //   47: aload_1
    //   48: areturn
    //   49: aload_0
    //   50: aload_1
    //   51: invokevirtual 167	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   54: astore_1
    //   55: new 169	java/io/InputStreamReader
    //   58: dup
    //   59: aload_1
    //   60: invokespecial 172	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   63: astore_3
    //   64: sipush 1024
    //   67: newarray <illegal type>
    //   69: astore 4
    //   71: new 174	java/io/StringWriter
    //   74: dup
    //   75: invokespecial 175	java/io/StringWriter:<init>	()V
    //   78: astore 5
    //   80: aload_3
    //   81: aload 4
    //   83: invokevirtual 179	java/io/InputStreamReader:read	([C)I
    //   86: istore 6
    //   88: iconst_m1
    //   89: iload 6
    //   91: if_icmpeq +40 -> 131
    //   94: aload 5
    //   96: aload 4
    //   98: iconst_0
    //   99: iload 6
    //   101: invokevirtual 182	java/io/StringWriter:write	([CII)V
    //   104: goto -24 -> 80
    //   107: astore_3
    //   108: ldc 117
    //   110: ldc -72
    //   112: aload_3
    //   113: invokestatic 187	com/iflytek/sunflower/c/g:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   116: aload_1
    //   117: invokevirtual 190	java/io/FileInputStream:close	()V
    //   120: aload_2
    //   121: astore_1
    //   122: goto -78 -> 44
    //   125: astore_0
    //   126: aload_2
    //   127: astore_1
    //   128: goto -84 -> 44
    //   131: aload 5
    //   133: invokevirtual 191	java/io/StringWriter:toString	()Ljava/lang/String;
    //   136: astore_3
    //   137: aload_1
    //   138: invokevirtual 190	java/io/FileInputStream:close	()V
    //   141: new 193	org/json/JSONObject
    //   144: dup
    //   145: aload_3
    //   146: invokespecial 194	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   149: astore_3
    //   150: aload_2
    //   151: astore_1
    //   152: aload_3
    //   153: invokevirtual 197	org/json/JSONObject:length	()I
    //   156: ifeq -112 -> 44
    //   159: aload_3
    //   160: astore_1
    //   161: goto -117 -> 44
    //   164: astore_3
    //   165: aload_1
    //   166: invokevirtual 190	java/io/FileInputStream:close	()V
    //   169: aload_3
    //   170: athrow
    //   171: astore_0
    //   172: ldc 117
    //   174: aload_0
    //   175: invokevirtual 198	java/io/IOException:toString	()Ljava/lang/String;
    //   178: invokestatic 129	com/iflytek/sunflower/c/g:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   181: aload_2
    //   182: astore_1
    //   183: goto -139 -> 44
    //   186: astore_0
    //   187: ldc 2
    //   189: monitorexit
    //   190: aload_0
    //   191: athrow
    //   192: astore_1
    //   193: aload_0
    //   194: invokestatic 202	com/iflytek/sunflower/d:g	(Landroid/content/Context;)V
    //   197: ldc 117
    //   199: ldc -52
    //   201: aload_1
    //   202: invokestatic 187	com/iflytek/sunflower/c/g:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   205: aload_2
    //   206: astore_1
    //   207: goto -163 -> 44
    //   210: astore_0
    //   211: aload_2
    //   212: astore_1
    //   213: goto -169 -> 44
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	216	0	paramContext	Context
    //   9	174	1	localObject1	Object
    //   192	10	1	localJSONException	org.json.JSONException
    //   206	7	1	localObject2	Object
    //   1	211	2	localObject3	Object
    //   22	59	3	localObject4	Object
    //   107	6	3	localException	Exception
    //   136	24	3	localObject5	Object
    //   164	6	3	localObject6	Object
    //   69	28	4	arrayOfChar	char[]
    //   78	54	5	localStringWriter	java.io.StringWriter
    //   86	14	6	i	int
    // Exception table:
    //   from	to	target	type
    //   55	80	107	java/lang/Exception
    //   80	88	107	java/lang/Exception
    //   94	104	107	java/lang/Exception
    //   131	137	107	java/lang/Exception
    //   10	42	125	java/io/FileNotFoundException
    //   49	55	125	java/io/FileNotFoundException
    //   116	120	125	java/io/FileNotFoundException
    //   137	150	125	java/io/FileNotFoundException
    //   152	159	125	java/io/FileNotFoundException
    //   165	171	125	java/io/FileNotFoundException
    //   55	80	164	finally
    //   80	88	164	finally
    //   94	104	164	finally
    //   108	116	164	finally
    //   131	137	164	finally
    //   10	42	171	java/io/IOException
    //   49	55	171	java/io/IOException
    //   116	120	171	java/io/IOException
    //   137	150	171	java/io/IOException
    //   152	159	171	java/io/IOException
    //   165	171	171	java/io/IOException
    //   5	10	186	finally
    //   10	42	186	finally
    //   49	55	186	finally
    //   116	120	186	finally
    //   137	150	186	finally
    //   152	159	186	finally
    //   165	171	186	finally
    //   172	181	186	finally
    //   193	205	186	finally
    //   10	42	192	org/json/JSONException
    //   49	55	192	org/json/JSONException
    //   116	120	192	org/json/JSONException
    //   137	150	192	org/json/JSONException
    //   152	159	192	org/json/JSONException
    //   165	171	192	org/json/JSONException
    //   10	42	210	java/lang/Throwable
    //   49	55	210	java/lang/Throwable
    //   116	120	210	java/lang/Throwable
    //   137	150	210	java/lang/Throwable
    //   152	159	210	java/lang/Throwable
    //   165	171	210	java/lang/Throwable
  }
  
  /* Error */
  public static String f(Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc 2
    //   4: monitorenter
    //   5: aload_0
    //   6: invokestatic 207	com/iflytek/sunflower/d:d	(Landroid/content/Context;)Ljava/lang/String;
    //   9: astore_2
    //   10: new 16	java/io/File
    //   13: dup
    //   14: aload_0
    //   15: invokevirtual 22	android/content/Context:getFilesDir	()Ljava/io/File;
    //   18: aload_2
    //   19: invokespecial 26	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   22: astore_3
    //   23: aload_3
    //   24: invokestatic 156	com/iflytek/sunflower/d:a	(Ljava/io/File;)Z
    //   27: ifeq +22 -> 49
    //   30: aload_3
    //   31: invokevirtual 159	java/io/File:delete	()Z
    //   34: pop
    //   35: ldc 117
    //   37: ldc -95
    //   39: invokestatic 163	com/iflytek/sunflower/c/g:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   42: aload_1
    //   43: astore_0
    //   44: ldc 2
    //   46: monitorexit
    //   47: aload_0
    //   48: areturn
    //   49: aload_0
    //   50: aload_2
    //   51: invokevirtual 167	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   54: astore_2
    //   55: new 169	java/io/InputStreamReader
    //   58: dup
    //   59: aload_2
    //   60: invokespecial 172	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   63: astore_0
    //   64: sipush 1024
    //   67: newarray <illegal type>
    //   69: astore_3
    //   70: new 174	java/io/StringWriter
    //   73: dup
    //   74: invokespecial 175	java/io/StringWriter:<init>	()V
    //   77: astore 4
    //   79: aload_0
    //   80: aload_3
    //   81: invokevirtual 179	java/io/InputStreamReader:read	([C)I
    //   84: istore 5
    //   86: iconst_m1
    //   87: iload 5
    //   89: if_icmpeq +39 -> 128
    //   92: aload 4
    //   94: aload_3
    //   95: iconst_0
    //   96: iload 5
    //   98: invokevirtual 182	java/io/StringWriter:write	([CII)V
    //   101: goto -22 -> 79
    //   104: astore_0
    //   105: ldc 117
    //   107: ldc -72
    //   109: aload_0
    //   110: invokestatic 187	com/iflytek/sunflower/c/g:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   113: aload_2
    //   114: invokevirtual 190	java/io/FileInputStream:close	()V
    //   117: aload_1
    //   118: astore_0
    //   119: goto -75 -> 44
    //   122: astore_0
    //   123: aload_1
    //   124: astore_0
    //   125: goto -81 -> 44
    //   128: aload 4
    //   130: invokevirtual 191	java/io/StringWriter:toString	()Ljava/lang/String;
    //   133: astore_0
    //   134: aload_2
    //   135: invokevirtual 190	java/io/FileInputStream:close	()V
    //   138: goto -94 -> 44
    //   141: astore_0
    //   142: aload_2
    //   143: invokevirtual 190	java/io/FileInputStream:close	()V
    //   146: aload_0
    //   147: athrow
    //   148: astore_0
    //   149: ldc 117
    //   151: aload_0
    //   152: invokevirtual 198	java/io/IOException:toString	()Ljava/lang/String;
    //   155: invokestatic 129	com/iflytek/sunflower/c/g:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   158: aload_1
    //   159: astore_0
    //   160: goto -116 -> 44
    //   163: astore_0
    //   164: ldc 2
    //   166: monitorexit
    //   167: aload_0
    //   168: athrow
    //   169: astore_0
    //   170: aload_1
    //   171: astore_0
    //   172: goto -128 -> 44
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	175	0	paramContext	Context
    //   1	170	1	localObject1	Object
    //   9	134	2	localObject2	Object
    //   22	73	3	localObject3	Object
    //   77	52	4	localStringWriter	java.io.StringWriter
    //   84	13	5	i	int
    // Exception table:
    //   from	to	target	type
    //   55	79	104	java/lang/Exception
    //   79	86	104	java/lang/Exception
    //   92	101	104	java/lang/Exception
    //   128	134	104	java/lang/Exception
    //   10	42	122	java/io/FileNotFoundException
    //   49	55	122	java/io/FileNotFoundException
    //   113	117	122	java/io/FileNotFoundException
    //   134	138	122	java/io/FileNotFoundException
    //   142	148	122	java/io/FileNotFoundException
    //   55	79	141	finally
    //   79	86	141	finally
    //   92	101	141	finally
    //   105	113	141	finally
    //   128	134	141	finally
    //   10	42	148	java/io/IOException
    //   49	55	148	java/io/IOException
    //   113	117	148	java/io/IOException
    //   134	138	148	java/io/IOException
    //   142	148	148	java/io/IOException
    //   5	10	163	finally
    //   10	42	163	finally
    //   49	55	163	finally
    //   113	117	163	finally
    //   134	138	163	finally
    //   142	148	163	finally
    //   149	158	163	finally
    //   10	42	169	java/lang/Exception
    //   49	55	169	java/lang/Exception
    //   113	117	169	java/lang/Exception
    //   134	138	169	java/lang/Exception
    //   142	148	169	java/lang/Exception
  }
  
  public static void g(Context paramContext)
  {
    paramContext.deleteFile(c(paramContext));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\sunflower\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */