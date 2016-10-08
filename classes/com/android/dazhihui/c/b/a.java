package com.android.dazhihui.c.b;

import android.app.Application;
import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public final class a
{
  private static a c = null;
  private Context a;
  private BlockingQueue<Object<?>> b = new LinkedBlockingDeque();
  
  private a(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public static a a(Application paramApplication)
  {
    try
    {
      if (c == null) {
        c = new a(paramApplication);
      }
      paramApplication = c;
      return paramApplication;
    }
    finally {}
  }
  
  public static List<File> a(String paramString, List<File> paramList)
  {
    paramString = new File(paramString);
    if (paramString.isDirectory())
    {
      paramString = paramString.listFiles();
      int j = paramString.length;
      int i = 0;
      if (i < j)
      {
        Object localObject = paramString[i];
        if (((File)localObject).isDirectory()) {
          a(((File)localObject).getAbsolutePath(), paramList);
        }
        for (;;)
        {
          i += 1;
          break;
          paramList.add(localObject);
        }
      }
    }
    return paramList;
  }
  
  private void a(String paramString, int paramInt)
  {
    paramString = b(paramString);
    if (paramString.size() >= paramInt)
    {
      int j = paramString.size();
      int i = 0;
      while (i < j - paramInt + 1)
      {
        ((File)paramString.get(i)).delete();
        i += 1;
      }
    }
  }
  
  public static List<File> b(String paramString)
  {
    paramString = a(paramString, new ArrayList());
    if ((paramString != null) && (paramString.size() > 0)) {
      Collections.sort(paramString, new b());
    }
    return paramString;
  }
  
  public <T> T a(String paramString, com.c.a.c.a<T> parama)
  {
    return (T)a(paramString, null, parama);
  }
  
  /* Error */
  public <T> T a(String paramString1, String paramString2, com.c.a.c.a<T> parama)
  {
    // Byte code:
    //   0: ldc 101
    //   2: astore 5
    //   4: aload 5
    //   6: astore 4
    //   8: aload_2
    //   9: ifnull +36 -> 45
    //   12: aload 5
    //   14: astore 4
    //   16: aload_2
    //   17: invokevirtual 106	java/lang/String:isEmpty	()Z
    //   20: ifne +25 -> 45
    //   23: new 108	java/lang/StringBuilder
    //   26: dup
    //   27: invokespecial 109	java/lang/StringBuilder:<init>	()V
    //   30: aload_2
    //   31: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   34: getstatic 117	java/io/File:separator	Ljava/lang/String;
    //   37: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   40: invokevirtual 120	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   43: astore 4
    //   45: invokestatic 124	com/android/dazhihui/c/b/c:a	()Z
    //   48: ifeq +163 -> 211
    //   51: aload_0
    //   52: getfield 27	com/android/dazhihui/c/b/a:a	Landroid/content/Context;
    //   55: ifnull +26 -> 81
    //   58: aload_0
    //   59: getfield 27	com/android/dazhihui/c/b/a:a	Landroid/content/Context;
    //   62: invokevirtual 130	android/content/Context:getExternalCacheDir	()Ljava/io/File;
    //   65: ifnull +16 -> 81
    //   68: aload_0
    //   69: getfield 27	com/android/dazhihui/c/b/a:a	Landroid/content/Context;
    //   72: invokevirtual 130	android/content/Context:getExternalCacheDir	()Ljava/io/File;
    //   75: invokevirtual 48	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   78: ifnonnull +5 -> 83
    //   81: aconst_null
    //   82: areturn
    //   83: new 33	java/io/File
    //   86: dup
    //   87: new 108	java/lang/StringBuilder
    //   90: dup
    //   91: invokespecial 109	java/lang/StringBuilder:<init>	()V
    //   94: aload_0
    //   95: getfield 27	com/android/dazhihui/c/b/a:a	Landroid/content/Context;
    //   98: invokevirtual 130	android/content/Context:getExternalCacheDir	()Ljava/io/File;
    //   101: invokevirtual 48	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   104: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   107: getstatic 117	java/io/File:separator	Ljava/lang/String;
    //   110: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   113: aload 4
    //   115: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   118: aload_1
    //   119: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   122: invokevirtual 120	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   125: invokespecial 36	java/io/File:<init>	(Ljava/lang/String;)V
    //   128: astore_1
    //   129: aload_1
    //   130: invokevirtual 133	java/io/File:exists	()Z
    //   133: ifeq -52 -> 81
    //   136: new 135	java/io/FileInputStream
    //   139: dup
    //   140: aload_1
    //   141: invokespecial 138	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   144: astore_2
    //   145: aload_2
    //   146: astore_1
    //   147: bipush 100
    //   149: newarray <illegal type>
    //   151: astore 5
    //   153: aload_2
    //   154: astore_1
    //   155: new 140	org/apache/http/util/ByteArrayBuffer
    //   158: dup
    //   159: iconst_0
    //   160: invokespecial 143	org/apache/http/util/ByteArrayBuffer:<init>	(I)V
    //   163: astore 4
    //   165: aload_2
    //   166: astore_1
    //   167: aload_2
    //   168: aload 5
    //   170: invokevirtual 147	java/io/FileInputStream:read	([B)I
    //   173: istore 6
    //   175: iload 6
    //   177: iconst_m1
    //   178: if_icmpeq +112 -> 290
    //   181: aload_2
    //   182: astore_1
    //   183: aload 4
    //   185: aload 5
    //   187: iconst_0
    //   188: iload 6
    //   190: invokevirtual 150	org/apache/http/util/ByteArrayBuffer:append	([BII)V
    //   193: goto -28 -> 165
    //   196: astore_3
    //   197: aload_2
    //   198: astore_1
    //   199: aload_3
    //   200: invokevirtual 153	java/io/FileNotFoundException:printStackTrace	()V
    //   203: aload_2
    //   204: invokestatic 158	com/android/dazhihui/d/bm:a	(Ljava/io/Closeable;)V
    //   207: aconst_null
    //   208: astore_1
    //   209: aload_1
    //   210: areturn
    //   211: aload_0
    //   212: getfield 27	com/android/dazhihui/c/b/a:a	Landroid/content/Context;
    //   215: ifnull -134 -> 81
    //   218: aload_0
    //   219: getfield 27	com/android/dazhihui/c/b/a:a	Landroid/content/Context;
    //   222: invokevirtual 161	android/content/Context:getCacheDir	()Ljava/io/File;
    //   225: ifnull -144 -> 81
    //   228: aload_0
    //   229: getfield 27	com/android/dazhihui/c/b/a:a	Landroid/content/Context;
    //   232: invokevirtual 161	android/content/Context:getCacheDir	()Ljava/io/File;
    //   235: invokevirtual 48	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   238: ifnull -157 -> 81
    //   241: new 33	java/io/File
    //   244: dup
    //   245: new 108	java/lang/StringBuilder
    //   248: dup
    //   249: invokespecial 109	java/lang/StringBuilder:<init>	()V
    //   252: aload_0
    //   253: getfield 27	com/android/dazhihui/c/b/a:a	Landroid/content/Context;
    //   256: invokevirtual 161	android/content/Context:getCacheDir	()Ljava/io/File;
    //   259: invokevirtual 48	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   262: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   265: getstatic 117	java/io/File:separator	Ljava/lang/String;
    //   268: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   271: aload 4
    //   273: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   276: aload_1
    //   277: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   280: invokevirtual 120	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   283: invokespecial 36	java/io/File:<init>	(Ljava/lang/String;)V
    //   286: astore_1
    //   287: goto -158 -> 129
    //   290: aload_2
    //   291: astore_1
    //   292: new 103	java/lang/String
    //   295: dup
    //   296: aload 4
    //   298: invokevirtual 165	org/apache/http/util/ByteArrayBuffer:toByteArray	()[B
    //   301: ldc -89
    //   303: invokespecial 170	java/lang/String:<init>	([BLjava/lang/String;)V
    //   306: astore 5
    //   308: aload_2
    //   309: astore_1
    //   310: aload 4
    //   312: invokevirtual 173	org/apache/http/util/ByteArrayBuffer:clear	()V
    //   315: aload_2
    //   316: astore_1
    //   317: new 175	com/c/a/k
    //   320: dup
    //   321: invokespecial 176	com/c/a/k:<init>	()V
    //   324: aload 5
    //   326: aload_3
    //   327: invokevirtual 182	com/c/a/c/a:getType	()Ljava/lang/reflect/Type;
    //   330: invokevirtual 185	com/c/a/k:a	(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    //   333: astore_3
    //   334: aload_3
    //   335: astore_1
    //   336: aload_2
    //   337: invokestatic 158	com/android/dazhihui/d/bm:a	(Ljava/io/Closeable;)V
    //   340: goto -131 -> 209
    //   343: astore_3
    //   344: aconst_null
    //   345: astore_2
    //   346: aload_2
    //   347: astore_1
    //   348: aload_3
    //   349: invokevirtual 186	java/io/OptionalDataException:printStackTrace	()V
    //   352: aload_2
    //   353: invokestatic 158	com/android/dazhihui/d/bm:a	(Ljava/io/Closeable;)V
    //   356: aconst_null
    //   357: astore_1
    //   358: goto -149 -> 209
    //   361: astore_3
    //   362: aconst_null
    //   363: astore_2
    //   364: aload_2
    //   365: astore_1
    //   366: aload_3
    //   367: invokevirtual 187	java/io/IOException:printStackTrace	()V
    //   370: aload_2
    //   371: invokestatic 158	com/android/dazhihui/d/bm:a	(Ljava/io/Closeable;)V
    //   374: aconst_null
    //   375: astore_1
    //   376: goto -167 -> 209
    //   379: astore_3
    //   380: aconst_null
    //   381: astore_2
    //   382: aload_2
    //   383: astore_1
    //   384: aload_3
    //   385: invokevirtual 188	com/c/a/ae:printStackTrace	()V
    //   388: aload_2
    //   389: invokestatic 158	com/android/dazhihui/d/bm:a	(Ljava/io/Closeable;)V
    //   392: aconst_null
    //   393: astore_1
    //   394: goto -185 -> 209
    //   397: astore_2
    //   398: aconst_null
    //   399: astore_1
    //   400: aload_1
    //   401: invokestatic 158	com/android/dazhihui/d/bm:a	(Ljava/io/Closeable;)V
    //   404: aload_2
    //   405: athrow
    //   406: astore_2
    //   407: goto -7 -> 400
    //   410: astore_3
    //   411: goto -29 -> 382
    //   414: astore_3
    //   415: goto -51 -> 364
    //   418: astore_3
    //   419: goto -73 -> 346
    //   422: astore_3
    //   423: aconst_null
    //   424: astore_2
    //   425: goto -228 -> 197
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	428	0	this	a
    //   0	428	1	paramString1	String
    //   0	428	2	paramString2	String
    //   0	428	3	parama	com.c.a.c.a<T>
    //   6	305	4	localObject1	Object
    //   2	323	5	localObject2	Object
    //   173	16	6	i	int
    // Exception table:
    //   from	to	target	type
    //   147	153	196	java/io/FileNotFoundException
    //   155	165	196	java/io/FileNotFoundException
    //   167	175	196	java/io/FileNotFoundException
    //   183	193	196	java/io/FileNotFoundException
    //   292	308	196	java/io/FileNotFoundException
    //   310	315	196	java/io/FileNotFoundException
    //   317	334	196	java/io/FileNotFoundException
    //   136	145	343	java/io/OptionalDataException
    //   136	145	361	java/io/IOException
    //   136	145	379	com/c/a/ae
    //   136	145	397	finally
    //   147	153	406	finally
    //   155	165	406	finally
    //   167	175	406	finally
    //   183	193	406	finally
    //   199	203	406	finally
    //   292	308	406	finally
    //   310	315	406	finally
    //   317	334	406	finally
    //   348	352	406	finally
    //   366	370	406	finally
    //   384	388	406	finally
    //   147	153	410	com/c/a/ae
    //   155	165	410	com/c/a/ae
    //   167	175	410	com/c/a/ae
    //   183	193	410	com/c/a/ae
    //   292	308	410	com/c/a/ae
    //   310	315	410	com/c/a/ae
    //   317	334	410	com/c/a/ae
    //   147	153	414	java/io/IOException
    //   155	165	414	java/io/IOException
    //   167	175	414	java/io/IOException
    //   183	193	414	java/io/IOException
    //   292	308	414	java/io/IOException
    //   310	315	414	java/io/IOException
    //   317	334	414	java/io/IOException
    //   147	153	418	java/io/OptionalDataException
    //   155	165	418	java/io/OptionalDataException
    //   167	175	418	java/io/OptionalDataException
    //   183	193	418	java/io/OptionalDataException
    //   292	308	418	java/io/OptionalDataException
    //   310	315	418	java/io/OptionalDataException
    //   317	334	418	java/io/OptionalDataException
    //   136	145	422	java/io/FileNotFoundException
  }
  
  public void a(String paramString)
  {
    if ((paramString != null) && (!paramString.isEmpty())) {}
    for (String str = paramString;; str = "")
    {
      if ((c.a()) && (this.a != null) && (this.a.getExternalCacheDir() != null)) {
        if (this.a.getExternalCacheDir().getAbsolutePath() == null) {
          paramString = null;
        }
      }
      for (;;)
      {
        Object localObject = paramString;
        if (paramString == null)
        {
          localObject = paramString;
          if (this.a != null)
          {
            localObject = paramString;
            if (this.a.getCacheDir() != null) {
              if (this.a.getCacheDir().getAbsolutePath() != null) {
                break label204;
              }
            }
          }
        }
        label204:
        for (localObject = paramString;; localObject = new File(this.a.getCacheDir().getAbsolutePath() + File.separator + str))
        {
          if ((localObject == null) || (!((File)localObject).exists()) || (!((File)localObject).isDirectory())) {
            break label248;
          }
          paramString = ((File)localObject).listFiles();
          if (paramString == null) {
            break label248;
          }
          int j = paramString.length;
          int i = 0;
          while (i < j)
          {
            str = paramString[i];
            if (!str.isDirectory()) {
              str.delete();
            }
            i += 1;
          }
          paramString = new File(this.a.getExternalCacheDir().getAbsolutePath() + File.separator + str);
          break;
        }
        label248:
        return;
        paramString = null;
      }
    }
  }
  
  public void a(String paramString, Object paramObject)
  {
    a(paramString, null, paramObject);
  }
  
  /* Error */
  public void a(String paramString1, String paramString2, Object paramObject)
  {
    // Byte code:
    //   0: aload_3
    //   1: ifnonnull +4 -> 5
    //   4: return
    //   5: aconst_null
    //   6: astore 5
    //   8: invokestatic 124	com/android/dazhihui/c/b/c:a	()Z
    //   11: ifeq +227 -> 238
    //   14: aload_0
    //   15: getfield 27	com/android/dazhihui/c/b/a:a	Landroid/content/Context;
    //   18: ifnull -14 -> 4
    //   21: aload_0
    //   22: getfield 27	com/android/dazhihui/c/b/a:a	Landroid/content/Context;
    //   25: invokevirtual 130	android/content/Context:getExternalCacheDir	()Ljava/io/File;
    //   28: ifnull -24 -> 4
    //   31: aload_0
    //   32: getfield 27	com/android/dazhihui/c/b/a:a	Landroid/content/Context;
    //   35: invokevirtual 130	android/content/Context:getExternalCacheDir	()Ljava/io/File;
    //   38: invokevirtual 48	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   41: ifnull -37 -> 4
    //   44: invokestatic 124	com/android/dazhihui/c/b/c:a	()Z
    //   47: ifeq +222 -> 269
    //   50: aload_0
    //   51: getfield 27	com/android/dazhihui/c/b/a:a	Landroid/content/Context;
    //   54: invokevirtual 130	android/content/Context:getExternalCacheDir	()Ljava/io/File;
    //   57: invokevirtual 48	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   60: astore 4
    //   62: aload_2
    //   63: ifnull +221 -> 284
    //   66: aload_2
    //   67: invokevirtual 106	java/lang/String:isEmpty	()Z
    //   70: ifne +214 -> 284
    //   73: new 33	java/io/File
    //   76: dup
    //   77: new 108	java/lang/StringBuilder
    //   80: dup
    //   81: invokespecial 109	java/lang/StringBuilder:<init>	()V
    //   84: aload 4
    //   86: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   89: getstatic 117	java/io/File:separator	Ljava/lang/String;
    //   92: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   95: aload_2
    //   96: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   99: invokevirtual 120	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   102: invokespecial 36	java/io/File:<init>	(Ljava/lang/String;)V
    //   105: astore 6
    //   107: new 33	java/io/File
    //   110: dup
    //   111: new 108	java/lang/StringBuilder
    //   114: dup
    //   115: invokespecial 109	java/lang/StringBuilder:<init>	()V
    //   118: aload 4
    //   120: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   123: getstatic 117	java/io/File:separator	Ljava/lang/String;
    //   126: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   129: aload_2
    //   130: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   133: getstatic 117	java/io/File:separator	Ljava/lang/String;
    //   136: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   139: aload_1
    //   140: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   143: invokevirtual 120	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   146: invokespecial 36	java/io/File:<init>	(Ljava/lang/String;)V
    //   149: astore_1
    //   150: aload 6
    //   152: astore 4
    //   154: aload 4
    //   156: invokevirtual 133	java/io/File:exists	()Z
    //   159: ifne +9 -> 168
    //   162: aload 4
    //   164: invokevirtual 196	java/io/File:mkdirs	()Z
    //   167: pop
    //   168: aload_2
    //   169: ifnull +21 -> 190
    //   172: aload_2
    //   173: invokevirtual 106	java/lang/String:isEmpty	()Z
    //   176: ifne +14 -> 190
    //   179: aload_0
    //   180: aload 4
    //   182: invokevirtual 48	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   185: bipush 30
    //   187: invokespecial 198	com/android/dazhihui/c/b/a:a	(Ljava/lang/String;I)V
    //   190: aload_1
    //   191: invokevirtual 133	java/io/File:exists	()Z
    //   194: ifne +8 -> 202
    //   197: aload_1
    //   198: invokevirtual 201	java/io/File:createNewFile	()Z
    //   201: pop
    //   202: new 175	com/c/a/k
    //   205: dup
    //   206: invokespecial 176	com/c/a/k:<init>	()V
    //   209: astore_2
    //   210: new 203	java/io/FileOutputStream
    //   213: dup
    //   214: aload_1
    //   215: invokespecial 204	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   218: astore_1
    //   219: aload_1
    //   220: aload_2
    //   221: aload_3
    //   222: invokevirtual 207	com/c/a/k:a	(Ljava/lang/Object;)Ljava/lang/String;
    //   225: ldc -89
    //   227: invokevirtual 211	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   230: invokevirtual 215	java/io/FileOutputStream:write	([B)V
    //   233: aload_1
    //   234: invokestatic 158	com/android/dazhihui/d/bm:a	(Ljava/io/Closeable;)V
    //   237: return
    //   238: aload_0
    //   239: getfield 27	com/android/dazhihui/c/b/a:a	Landroid/content/Context;
    //   242: ifnull -238 -> 4
    //   245: aload_0
    //   246: getfield 27	com/android/dazhihui/c/b/a:a	Landroid/content/Context;
    //   249: invokevirtual 161	android/content/Context:getCacheDir	()Ljava/io/File;
    //   252: ifnull -248 -> 4
    //   255: aload_0
    //   256: getfield 27	com/android/dazhihui/c/b/a:a	Landroid/content/Context;
    //   259: invokevirtual 161	android/content/Context:getCacheDir	()Ljava/io/File;
    //   262: invokevirtual 48	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   265: ifnonnull -221 -> 44
    //   268: return
    //   269: aload_0
    //   270: getfield 27	com/android/dazhihui/c/b/a:a	Landroid/content/Context;
    //   273: invokevirtual 161	android/content/Context:getCacheDir	()Ljava/io/File;
    //   276: invokevirtual 48	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   279: astore 4
    //   281: goto -219 -> 62
    //   284: new 33	java/io/File
    //   287: dup
    //   288: aload 4
    //   290: invokespecial 36	java/io/File:<init>	(Ljava/lang/String;)V
    //   293: astore 6
    //   295: new 33	java/io/File
    //   298: dup
    //   299: new 108	java/lang/StringBuilder
    //   302: dup
    //   303: invokespecial 109	java/lang/StringBuilder:<init>	()V
    //   306: aload 4
    //   308: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   311: getstatic 117	java/io/File:separator	Ljava/lang/String;
    //   314: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   317: aload_1
    //   318: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   321: invokevirtual 120	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   324: invokespecial 36	java/io/File:<init>	(Ljava/lang/String;)V
    //   327: astore_1
    //   328: aload 6
    //   330: astore 4
    //   332: goto -178 -> 154
    //   335: astore_2
    //   336: aconst_null
    //   337: astore_1
    //   338: aload_2
    //   339: invokevirtual 187	java/io/IOException:printStackTrace	()V
    //   342: aload_1
    //   343: invokestatic 158	com/android/dazhihui/d/bm:a	(Ljava/io/Closeable;)V
    //   346: return
    //   347: astore_1
    //   348: aload 5
    //   350: astore_2
    //   351: aload_2
    //   352: invokestatic 158	com/android/dazhihui/d/bm:a	(Ljava/io/Closeable;)V
    //   355: aload_1
    //   356: athrow
    //   357: astore_3
    //   358: aload_1
    //   359: astore_2
    //   360: aload_3
    //   361: astore_1
    //   362: goto -11 -> 351
    //   365: astore_3
    //   366: aload_1
    //   367: astore_2
    //   368: aload_3
    //   369: astore_1
    //   370: goto -19 -> 351
    //   373: astore_2
    //   374: goto -36 -> 338
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	377	0	this	a
    //   0	377	1	paramString1	String
    //   0	377	2	paramString2	String
    //   0	377	3	paramObject	Object
    //   60	271	4	localObject1	Object
    //   6	343	5	localObject2	Object
    //   105	224	6	localFile	File
    // Exception table:
    //   from	to	target	type
    //   190	202	335	java/io/IOException
    //   202	219	335	java/io/IOException
    //   190	202	347	finally
    //   202	219	347	finally
    //   219	233	357	finally
    //   338	342	365	finally
    //   219	233	373	java/io/IOException
  }
  
  /* Error */
  public void a(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 6
    //   3: aload_3
    //   4: ifnonnull +4 -> 8
    //   7: return
    //   8: invokestatic 124	com/android/dazhihui/c/b/c:a	()Z
    //   11: ifeq +291 -> 302
    //   14: aload_0
    //   15: getfield 27	com/android/dazhihui/c/b/a:a	Landroid/content/Context;
    //   18: ifnull -11 -> 7
    //   21: aload_0
    //   22: getfield 27	com/android/dazhihui/c/b/a:a	Landroid/content/Context;
    //   25: invokevirtual 130	android/content/Context:getExternalCacheDir	()Ljava/io/File;
    //   28: ifnull -21 -> 7
    //   31: aload_0
    //   32: getfield 27	com/android/dazhihui/c/b/a:a	Landroid/content/Context;
    //   35: invokevirtual 130	android/content/Context:getExternalCacheDir	()Ljava/io/File;
    //   38: invokevirtual 48	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   41: ifnull -34 -> 7
    //   44: invokestatic 124	com/android/dazhihui/c/b/c:a	()Z
    //   47: ifeq +286 -> 333
    //   50: aload_0
    //   51: getfield 27	com/android/dazhihui/c/b/a:a	Landroid/content/Context;
    //   54: invokevirtual 130	android/content/Context:getExternalCacheDir	()Ljava/io/File;
    //   57: invokevirtual 48	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   60: astore 5
    //   62: aload_2
    //   63: ifnull +285 -> 348
    //   66: aload_2
    //   67: invokevirtual 106	java/lang/String:isEmpty	()Z
    //   70: ifne +278 -> 348
    //   73: new 33	java/io/File
    //   76: dup
    //   77: new 108	java/lang/StringBuilder
    //   80: dup
    //   81: invokespecial 109	java/lang/StringBuilder:<init>	()V
    //   84: aload 5
    //   86: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   89: getstatic 117	java/io/File:separator	Ljava/lang/String;
    //   92: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   95: aload_2
    //   96: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   99: invokevirtual 120	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   102: invokespecial 36	java/io/File:<init>	(Ljava/lang/String;)V
    //   105: astore 7
    //   107: new 33	java/io/File
    //   110: dup
    //   111: new 108	java/lang/StringBuilder
    //   114: dup
    //   115: invokespecial 109	java/lang/StringBuilder:<init>	()V
    //   118: aload 5
    //   120: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   123: getstatic 117	java/io/File:separator	Ljava/lang/String;
    //   126: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   129: aload_2
    //   130: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   133: getstatic 117	java/io/File:separator	Ljava/lang/String;
    //   136: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   139: aload_1
    //   140: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   143: invokevirtual 120	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   146: invokespecial 36	java/io/File:<init>	(Ljava/lang/String;)V
    //   149: astore 5
    //   151: aload 7
    //   153: astore_1
    //   154: aload_1
    //   155: invokevirtual 133	java/io/File:exists	()Z
    //   158: ifne +8 -> 166
    //   161: aload_1
    //   162: invokevirtual 196	java/io/File:mkdirs	()Z
    //   165: pop
    //   166: aload_2
    //   167: ifnull +20 -> 187
    //   170: aload_2
    //   171: invokevirtual 106	java/lang/String:isEmpty	()Z
    //   174: ifne +13 -> 187
    //   177: aload_0
    //   178: aload_1
    //   179: invokevirtual 48	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   182: iload 4
    //   184: invokespecial 198	com/android/dazhihui/c/b/a:a	(Ljava/lang/String;I)V
    //   187: aload 5
    //   189: invokevirtual 133	java/io/File:exists	()Z
    //   192: ifne +9 -> 201
    //   195: aload 5
    //   197: invokevirtual 201	java/io/File:createNewFile	()Z
    //   200: pop
    //   201: new 218	java/io/BufferedWriter
    //   204: dup
    //   205: new 220	java/io/FileWriter
    //   208: dup
    //   209: aload 5
    //   211: iconst_1
    //   212: invokespecial 223	java/io/FileWriter:<init>	(Ljava/io/File;Z)V
    //   215: invokespecial 226	java/io/BufferedWriter:<init>	(Ljava/io/Writer;)V
    //   218: astore_1
    //   219: new 228	java/io/PrintWriter
    //   222: dup
    //   223: aload_1
    //   224: invokespecial 229	java/io/PrintWriter:<init>	(Ljava/io/Writer;)V
    //   227: astore_2
    //   228: aload_2
    //   229: astore 6
    //   231: aload_1
    //   232: astore 5
    //   234: aload_2
    //   235: new 108	java/lang/StringBuilder
    //   238: dup
    //   239: invokespecial 109	java/lang/StringBuilder:<init>	()V
    //   242: ldc -25
    //   244: invokestatic 237	java/lang/System:currentTimeMillis	()J
    //   247: invokestatic 243	android/text/format/DateFormat:format	(Ljava/lang/CharSequence;J)Ljava/lang/CharSequence;
    //   250: invokevirtual 246	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   253: ldc -8
    //   255: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   258: invokevirtual 120	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   261: invokevirtual 251	java/io/PrintWriter:print	(Ljava/lang/String;)V
    //   264: aload_2
    //   265: astore 6
    //   267: aload_1
    //   268: astore 5
    //   270: aload_2
    //   271: new 108	java/lang/StringBuilder
    //   274: dup
    //   275: invokespecial 109	java/lang/StringBuilder:<init>	()V
    //   278: aload_3
    //   279: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   282: ldc -8
    //   284: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   287: invokevirtual 120	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   290: invokevirtual 251	java/io/PrintWriter:print	(Ljava/lang/String;)V
    //   293: aload_1
    //   294: invokestatic 254	com/android/dazhihui/d/o:a	(Ljava/io/Closeable;)V
    //   297: aload_2
    //   298: invokestatic 254	com/android/dazhihui/d/o:a	(Ljava/io/Closeable;)V
    //   301: return
    //   302: aload_0
    //   303: getfield 27	com/android/dazhihui/c/b/a:a	Landroid/content/Context;
    //   306: ifnull -299 -> 7
    //   309: aload_0
    //   310: getfield 27	com/android/dazhihui/c/b/a:a	Landroid/content/Context;
    //   313: invokevirtual 161	android/content/Context:getCacheDir	()Ljava/io/File;
    //   316: ifnull -309 -> 7
    //   319: aload_0
    //   320: getfield 27	com/android/dazhihui/c/b/a:a	Landroid/content/Context;
    //   323: invokevirtual 161	android/content/Context:getCacheDir	()Ljava/io/File;
    //   326: invokevirtual 48	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   329: ifnonnull -285 -> 44
    //   332: return
    //   333: aload_0
    //   334: getfield 27	com/android/dazhihui/c/b/a:a	Landroid/content/Context;
    //   337: invokevirtual 161	android/content/Context:getCacheDir	()Ljava/io/File;
    //   340: invokevirtual 48	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   343: astore 5
    //   345: goto -283 -> 62
    //   348: new 33	java/io/File
    //   351: dup
    //   352: aload 5
    //   354: invokespecial 36	java/io/File:<init>	(Ljava/lang/String;)V
    //   357: astore 7
    //   359: new 33	java/io/File
    //   362: dup
    //   363: new 108	java/lang/StringBuilder
    //   366: dup
    //   367: invokespecial 109	java/lang/StringBuilder:<init>	()V
    //   370: aload 5
    //   372: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   375: getstatic 117	java/io/File:separator	Ljava/lang/String;
    //   378: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   381: aload_1
    //   382: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   385: invokevirtual 120	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   388: invokespecial 36	java/io/File:<init>	(Ljava/lang/String;)V
    //   391: astore 5
    //   393: aload 7
    //   395: astore_1
    //   396: goto -242 -> 154
    //   399: astore_3
    //   400: aconst_null
    //   401: astore_1
    //   402: aload 6
    //   404: astore_2
    //   405: aload_3
    //   406: invokevirtual 153	java/io/FileNotFoundException:printStackTrace	()V
    //   409: aload_2
    //   410: invokestatic 254	com/android/dazhihui/d/o:a	(Ljava/io/Closeable;)V
    //   413: aload_1
    //   414: invokestatic 254	com/android/dazhihui/d/o:a	(Ljava/io/Closeable;)V
    //   417: return
    //   418: astore_3
    //   419: aconst_null
    //   420: astore_2
    //   421: aconst_null
    //   422: astore_1
    //   423: aload_2
    //   424: astore 6
    //   426: aload_1
    //   427: astore 5
    //   429: aload_3
    //   430: invokevirtual 187	java/io/IOException:printStackTrace	()V
    //   433: aload_1
    //   434: invokestatic 254	com/android/dazhihui/d/o:a	(Ljava/io/Closeable;)V
    //   437: aload_2
    //   438: invokestatic 254	com/android/dazhihui/d/o:a	(Ljava/io/Closeable;)V
    //   441: return
    //   442: astore_2
    //   443: aconst_null
    //   444: astore_3
    //   445: aconst_null
    //   446: astore_1
    //   447: aload_1
    //   448: invokestatic 254	com/android/dazhihui/d/o:a	(Ljava/io/Closeable;)V
    //   451: aload_3
    //   452: invokestatic 254	com/android/dazhihui/d/o:a	(Ljava/io/Closeable;)V
    //   455: aload_2
    //   456: athrow
    //   457: astore_2
    //   458: aconst_null
    //   459: astore_3
    //   460: goto -13 -> 447
    //   463: astore_2
    //   464: aload 6
    //   466: astore_3
    //   467: aload 5
    //   469: astore_1
    //   470: goto -23 -> 447
    //   473: astore_3
    //   474: aload_2
    //   475: astore 5
    //   477: aload_3
    //   478: astore_2
    //   479: aload_1
    //   480: astore_3
    //   481: aload 5
    //   483: astore_1
    //   484: goto -37 -> 447
    //   487: astore_3
    //   488: aconst_null
    //   489: astore_2
    //   490: goto -67 -> 423
    //   493: astore_3
    //   494: goto -71 -> 423
    //   497: astore_3
    //   498: aconst_null
    //   499: astore 5
    //   501: aload_1
    //   502: astore_2
    //   503: aload 5
    //   505: astore_1
    //   506: goto -101 -> 405
    //   509: astore_3
    //   510: aload_1
    //   511: astore 5
    //   513: aload_2
    //   514: astore_1
    //   515: aload 5
    //   517: astore_2
    //   518: goto -113 -> 405
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	521	0	this	a
    //   0	521	1	paramString1	String
    //   0	521	2	paramString2	String
    //   0	521	3	paramString3	String
    //   0	521	4	paramInt	int
    //   60	456	5	localObject	Object
    //   1	464	6	str	String
    //   105	289	7	localFile	File
    // Exception table:
    //   from	to	target	type
    //   187	201	399	java/io/FileNotFoundException
    //   201	219	399	java/io/FileNotFoundException
    //   187	201	418	java/io/IOException
    //   201	219	418	java/io/IOException
    //   187	201	442	finally
    //   201	219	442	finally
    //   219	228	457	finally
    //   234	264	463	finally
    //   270	293	463	finally
    //   429	433	463	finally
    //   405	409	473	finally
    //   219	228	487	java/io/IOException
    //   234	264	493	java/io/IOException
    //   270	293	493	java/io/IOException
    //   219	228	497	java/io/FileNotFoundException
    //   234	264	509	java/io/FileNotFoundException
    //   270	293	509	java/io/FileNotFoundException
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\c\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */