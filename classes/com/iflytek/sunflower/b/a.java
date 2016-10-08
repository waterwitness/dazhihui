package com.iflytek.sunflower.b;

import android.text.TextUtils;
import com.iflytek.sunflower.c.g;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import org.apache.http.util.ByteArrayBuffer;
import org.json.JSONObject;

public class a
  extends Thread
{
  private int a = 20000;
  private a.a b = null;
  private volatile boolean c = false;
  private URL d = null;
  private ArrayList<byte[]> e = new ArrayList();
  private Object f = null;
  private int g = 0;
  
  public static URL a(String paramString1, String paramString2)
  {
    String str = paramString1;
    if (!TextUtils.isEmpty(paramString1))
    {
      str = paramString1;
      if (!TextUtils.isEmpty(paramString2))
      {
        str = paramString1;
        if (!paramString1.endsWith("?")) {
          str = paramString1 + "?";
        }
        str = str + paramString2;
      }
    }
    return new URL(str);
  }
  
  private void a(Exception paramException)
  {
    if ((this.b == null) || (this.c)) {
      return;
    }
    this.b.a(paramException);
  }
  
  public static boolean a(String paramString)
  {
    try
    {
      paramString = new JSONObject(paramString);
      if (paramString.has("rsp"))
      {
        int i = paramString.getJSONObject("rsp").getInt("code");
        if (i != 0) {
          return true;
        }
      }
    }
    catch (Exception paramString) {}
    return false;
  }
  
  private byte[] a(InputStream paramInputStream)
  {
    paramInputStream = new BufferedInputStream(paramInputStream);
    ByteArrayBuffer localByteArrayBuffer = new ByteArrayBuffer(1024);
    byte[] arrayOfByte = new byte['Ѐ'];
    while (!this.c)
    {
      int i = paramInputStream.read(arrayOfByte, 0, 1024);
      if (i == -1) {
        break;
      }
      localByteArrayBuffer.append(arrayOfByte, 0, i);
      if (this.b != null) {
        this.b.a(localByteArrayBuffer.toByteArray());
      }
    }
    return localByteArrayBuffer.toByteArray();
  }
  
  /* Error */
  private void b()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aconst_null
    //   4: astore_3
    //   5: aconst_null
    //   6: astore 5
    //   8: aconst_null
    //   9: astore_1
    //   10: aload_0
    //   11: getfield 30	com/iflytek/sunflower/b/a:d	Ljava/net/URL;
    //   14: invokevirtual 125	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   17: checkcast 127	java/net/HttpURLConnection
    //   20: astore_2
    //   21: aload 5
    //   23: astore_3
    //   24: aload_2
    //   25: aload_0
    //   26: getfield 24	com/iflytek/sunflower/b/a:a	I
    //   29: invokevirtual 130	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   32: aload 5
    //   34: astore_3
    //   35: aload_2
    //   36: aload_0
    //   37: getfield 24	com/iflytek/sunflower/b/a:a	I
    //   40: invokevirtual 133	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   43: aload 5
    //   45: astore_3
    //   46: aload_2
    //   47: ldc -121
    //   49: invokevirtual 138	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   52: aload 5
    //   54: astore_3
    //   55: sipush 200
    //   58: aload_2
    //   59: invokevirtual 142	java/net/HttpURLConnection:getResponseCode	()I
    //   62: if_icmpne +39 -> 101
    //   65: aload 5
    //   67: astore_3
    //   68: aload_2
    //   69: invokevirtual 146	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   72: astore_1
    //   73: aload_1
    //   74: astore_3
    //   75: aload_0
    //   76: aload_0
    //   77: aload_1
    //   78: invokespecial 148	com/iflytek/sunflower/b/a:a	(Ljava/io/InputStream;)[B
    //   81: invokespecial 150	com/iflytek/sunflower/b/a:b	([B)V
    //   84: aload_1
    //   85: ifnull +7 -> 92
    //   88: aload_1
    //   89: invokevirtual 155	java/io/InputStream:close	()V
    //   92: aload_2
    //   93: ifnull +7 -> 100
    //   96: aload_2
    //   97: invokevirtual 158	java/net/HttpURLConnection:disconnect	()V
    //   100: return
    //   101: aload 5
    //   103: astore_3
    //   104: aload_0
    //   105: new 78	java/lang/Exception
    //   108: dup
    //   109: ldc -96
    //   111: invokespecial 161	java/lang/Exception:<init>	(Ljava/lang/String;)V
    //   114: invokespecial 162	com/iflytek/sunflower/b/a:a	(Ljava/lang/Exception;)V
    //   117: goto -33 -> 84
    //   120: astore_3
    //   121: aconst_null
    //   122: astore_1
    //   123: aload_3
    //   124: invokevirtual 165	java/lang/Exception:printStackTrace	()V
    //   127: aload_0
    //   128: aload_3
    //   129: invokespecial 162	com/iflytek/sunflower/b/a:a	(Ljava/lang/Exception;)V
    //   132: aload_1
    //   133: ifnull +7 -> 140
    //   136: aload_1
    //   137: invokevirtual 155	java/io/InputStream:close	()V
    //   140: aload_2
    //   141: ifnull -41 -> 100
    //   144: aload_2
    //   145: invokevirtual 158	java/net/HttpURLConnection:disconnect	()V
    //   148: return
    //   149: astore_1
    //   150: return
    //   151: astore_1
    //   152: aconst_null
    //   153: astore_2
    //   154: aload_3
    //   155: ifnull +7 -> 162
    //   158: aload_3
    //   159: invokevirtual 155	java/io/InputStream:close	()V
    //   162: aload_2
    //   163: ifnull +7 -> 170
    //   166: aload_2
    //   167: invokevirtual 158	java/net/HttpURLConnection:disconnect	()V
    //   170: aload_1
    //   171: athrow
    //   172: astore_2
    //   173: goto -3 -> 170
    //   176: astore_1
    //   177: goto -23 -> 154
    //   180: astore 4
    //   182: aload_1
    //   183: astore_3
    //   184: aload 4
    //   186: astore_1
    //   187: goto -33 -> 154
    //   190: astore_3
    //   191: aconst_null
    //   192: astore_1
    //   193: aload 4
    //   195: astore_2
    //   196: goto -73 -> 123
    //   199: astore_3
    //   200: goto -77 -> 123
    //   203: astore_1
    //   204: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	205	0	this	a
    //   9	128	1	localInputStream	InputStream
    //   149	1	1	localException1	Exception
    //   151	20	1	localObject1	Object
    //   176	7	1	localObject2	Object
    //   186	7	1	localObject3	Object
    //   203	1	1	localException2	Exception
    //   20	147	2	localHttpURLConnection	java.net.HttpURLConnection
    //   172	1	2	localException3	Exception
    //   195	1	2	localObject4	Object
    //   4	100	3	localObject5	Object
    //   120	39	3	localException4	Exception
    //   183	1	3	localObject6	Object
    //   190	1	3	localException5	Exception
    //   199	1	3	localException6	Exception
    //   1	1	4	localObject7	Object
    //   180	14	4	localObject8	Object
    //   6	96	5	localObject9	Object
    // Exception table:
    //   from	to	target	type
    //   24	32	120	java/lang/Exception
    //   35	43	120	java/lang/Exception
    //   46	52	120	java/lang/Exception
    //   55	65	120	java/lang/Exception
    //   68	73	120	java/lang/Exception
    //   104	117	120	java/lang/Exception
    //   136	140	149	java/lang/Exception
    //   144	148	149	java/lang/Exception
    //   10	21	151	finally
    //   158	162	172	java/lang/Exception
    //   166	170	172	java/lang/Exception
    //   24	32	176	finally
    //   35	43	176	finally
    //   46	52	176	finally
    //   55	65	176	finally
    //   68	73	176	finally
    //   75	84	176	finally
    //   104	117	176	finally
    //   123	132	180	finally
    //   10	21	190	java/lang/Exception
    //   75	84	199	java/lang/Exception
    //   88	92	203	java/lang/Exception
    //   96	100	203	java/lang/Exception
  }
  
  private void b(byte[] paramArrayOfByte)
  {
    if ((this.b == null) || (this.c)) {
      return;
    }
    this.b.a(this, paramArrayOfByte);
  }
  
  private int c()
  {
    int i = 0;
    int j = 0;
    while (i < this.e.size())
    {
      j += ((byte[])this.e.get(i)).length;
      i += 1;
    }
    return j;
  }
  
  /* Error */
  public void a()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aconst_null
    //   3: astore 5
    //   5: aconst_null
    //   6: astore_3
    //   7: aconst_null
    //   8: astore 4
    //   10: aload_0
    //   11: getfield 30	com/iflytek/sunflower/b/a:d	Ljava/net/URL;
    //   14: invokevirtual 125	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   17: checkcast 127	java/net/HttpURLConnection
    //   20: astore_2
    //   21: aload 5
    //   23: astore_3
    //   24: aload_2
    //   25: iconst_1
    //   26: invokevirtual 181	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   29: aload 5
    //   31: astore_3
    //   32: aload_2
    //   33: iconst_1
    //   34: invokevirtual 184	java/net/HttpURLConnection:setDoInput	(Z)V
    //   37: aload 5
    //   39: astore_3
    //   40: aload_2
    //   41: iconst_0
    //   42: invokevirtual 187	java/net/HttpURLConnection:setUseCaches	(Z)V
    //   45: aload 5
    //   47: astore_3
    //   48: aload_2
    //   49: ldc -67
    //   51: invokevirtual 138	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   54: aload 5
    //   56: astore_3
    //   57: aload_2
    //   58: aload_0
    //   59: getfield 24	com/iflytek/sunflower/b/a:a	I
    //   62: invokevirtual 130	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   65: aload 5
    //   67: astore_3
    //   68: aload_2
    //   69: aload_0
    //   70: getfield 24	com/iflytek/sunflower/b/a:a	I
    //   73: invokevirtual 133	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   76: aload 5
    //   78: astore_3
    //   79: aload_2
    //   80: ldc -65
    //   82: new 57	java/lang/StringBuilder
    //   85: dup
    //   86: invokespecial 58	java/lang/StringBuilder:<init>	()V
    //   89: ldc -63
    //   91: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   94: aload_0
    //   95: invokespecial 195	com/iflytek/sunflower/b/a:c	()I
    //   98: invokevirtual 198	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   101: invokevirtual 66	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   104: invokevirtual 202	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   107: aload 5
    //   109: astore_3
    //   110: aload_2
    //   111: ldc -52
    //   113: ldc -50
    //   115: invokevirtual 202	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   118: aload 5
    //   120: astore_3
    //   121: aload_2
    //   122: ldc -48
    //   124: ldc -46
    //   126: invokevirtual 202	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   129: aload 5
    //   131: astore_3
    //   132: aload_2
    //   133: ldc -44
    //   135: ldc -42
    //   137: invokevirtual 202	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   140: aload 5
    //   142: astore_3
    //   143: aload_2
    //   144: invokevirtual 218	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   147: astore 4
    //   149: aload 5
    //   151: astore_3
    //   152: aload_0
    //   153: getfield 35	com/iflytek/sunflower/b/a:e	Ljava/util/ArrayList;
    //   156: invokevirtual 222	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   159: astore 6
    //   161: aload 5
    //   163: astore_3
    //   164: aload 6
    //   166: invokeinterface 228 1 0
    //   171: ifeq +49 -> 220
    //   174: aload 5
    //   176: astore_3
    //   177: aload 4
    //   179: aload 6
    //   181: invokeinterface 232 1 0
    //   186: checkcast 177	[B
    //   189: invokevirtual 237	java/io/OutputStream:write	([B)V
    //   192: goto -31 -> 161
    //   195: astore_3
    //   196: aconst_null
    //   197: astore_1
    //   198: aload_0
    //   199: aload_3
    //   200: invokespecial 162	com/iflytek/sunflower/b/a:a	(Ljava/lang/Exception;)V
    //   203: aload_1
    //   204: ifnull +7 -> 211
    //   207: aload_1
    //   208: invokevirtual 155	java/io/InputStream:close	()V
    //   211: aload_2
    //   212: ifnull +7 -> 219
    //   215: aload_2
    //   216: invokevirtual 158	java/net/HttpURLConnection:disconnect	()V
    //   219: return
    //   220: aload 5
    //   222: astore_3
    //   223: aload 4
    //   225: invokevirtual 240	java/io/OutputStream:flush	()V
    //   228: aload 5
    //   230: astore_3
    //   231: aload 4
    //   233: invokevirtual 241	java/io/OutputStream:close	()V
    //   236: aload 5
    //   238: astore_3
    //   239: sipush 200
    //   242: aload_2
    //   243: invokevirtual 142	java/net/HttpURLConnection:getResponseCode	()I
    //   246: if_icmpne +41 -> 287
    //   249: aload 5
    //   251: astore_3
    //   252: aload_2
    //   253: invokevirtual 146	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   256: astore_1
    //   257: aload_1
    //   258: astore_3
    //   259: aload_0
    //   260: aload_0
    //   261: aload_1
    //   262: invokespecial 148	com/iflytek/sunflower/b/a:a	(Ljava/io/InputStream;)[B
    //   265: invokespecial 150	com/iflytek/sunflower/b/a:b	([B)V
    //   268: aload_1
    //   269: ifnull +7 -> 276
    //   272: aload_1
    //   273: invokevirtual 155	java/io/InputStream:close	()V
    //   276: aload_2
    //   277: ifnull -58 -> 219
    //   280: aload_2
    //   281: invokevirtual 158	java/net/HttpURLConnection:disconnect	()V
    //   284: return
    //   285: astore_1
    //   286: return
    //   287: aload 5
    //   289: astore_3
    //   290: aload_0
    //   291: new 78	java/lang/Exception
    //   294: dup
    //   295: ldc -13
    //   297: invokespecial 161	java/lang/Exception:<init>	(Ljava/lang/String;)V
    //   300: invokespecial 162	com/iflytek/sunflower/b/a:a	(Ljava/lang/Exception;)V
    //   303: goto -35 -> 268
    //   306: astore_1
    //   307: aload_3
    //   308: ifnull +7 -> 315
    //   311: aload_3
    //   312: invokevirtual 155	java/io/InputStream:close	()V
    //   315: aload_2
    //   316: ifnull +7 -> 323
    //   319: aload_2
    //   320: invokevirtual 158	java/net/HttpURLConnection:disconnect	()V
    //   323: aload_1
    //   324: athrow
    //   325: astore_2
    //   326: goto -3 -> 323
    //   329: astore_1
    //   330: aconst_null
    //   331: astore_2
    //   332: goto -25 -> 307
    //   335: astore 4
    //   337: aload_1
    //   338: astore_3
    //   339: aload 4
    //   341: astore_1
    //   342: goto -35 -> 307
    //   345: astore_1
    //   346: return
    //   347: astore_3
    //   348: aconst_null
    //   349: astore_1
    //   350: aload 4
    //   352: astore_2
    //   353: goto -155 -> 198
    //   356: astore_3
    //   357: goto -159 -> 198
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	360	0	this	a
    //   1	272	1	localInputStream	InputStream
    //   285	1	1	localException1	Exception
    //   306	18	1	localObject1	Object
    //   329	9	1	localObject2	Object
    //   341	1	1	localObject3	Object
    //   345	1	1	localException2	Exception
    //   349	1	1	localObject4	Object
    //   20	300	2	localHttpURLConnection	java.net.HttpURLConnection
    //   325	1	2	localException3	Exception
    //   331	22	2	localObject5	Object
    //   6	171	3	localObject6	Object
    //   195	5	3	localException4	Exception
    //   222	117	3	localObject7	Object
    //   347	1	3	localException5	Exception
    //   356	1	3	localException6	Exception
    //   8	224	4	localOutputStream	java.io.OutputStream
    //   335	16	4	localObject8	Object
    //   3	285	5	localObject9	Object
    //   159	21	6	localIterator	java.util.Iterator
    // Exception table:
    //   from	to	target	type
    //   24	29	195	java/lang/Exception
    //   32	37	195	java/lang/Exception
    //   40	45	195	java/lang/Exception
    //   48	54	195	java/lang/Exception
    //   57	65	195	java/lang/Exception
    //   68	76	195	java/lang/Exception
    //   79	107	195	java/lang/Exception
    //   110	118	195	java/lang/Exception
    //   121	129	195	java/lang/Exception
    //   132	140	195	java/lang/Exception
    //   143	149	195	java/lang/Exception
    //   152	161	195	java/lang/Exception
    //   164	174	195	java/lang/Exception
    //   177	192	195	java/lang/Exception
    //   223	228	195	java/lang/Exception
    //   231	236	195	java/lang/Exception
    //   239	249	195	java/lang/Exception
    //   252	257	195	java/lang/Exception
    //   290	303	195	java/lang/Exception
    //   272	276	285	java/lang/Exception
    //   280	284	285	java/lang/Exception
    //   24	29	306	finally
    //   32	37	306	finally
    //   40	45	306	finally
    //   48	54	306	finally
    //   57	65	306	finally
    //   68	76	306	finally
    //   79	107	306	finally
    //   110	118	306	finally
    //   121	129	306	finally
    //   132	140	306	finally
    //   143	149	306	finally
    //   152	161	306	finally
    //   164	174	306	finally
    //   177	192	306	finally
    //   223	228	306	finally
    //   231	236	306	finally
    //   239	249	306	finally
    //   252	257	306	finally
    //   259	268	306	finally
    //   290	303	306	finally
    //   311	315	325	java/lang/Exception
    //   319	323	325	java/lang/Exception
    //   10	21	329	finally
    //   198	203	335	finally
    //   207	211	345	java/lang/Exception
    //   215	219	345	java/lang/Exception
    //   10	21	347	java/lang/Exception
    //   259	268	356	java/lang/Exception
  }
  
  public void a(int paramInt)
  {
    this.g = paramInt;
  }
  
  public void a(a.a parama)
  {
    this.b = parama;
  }
  
  public void a(String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    this.e.clear();
    a(paramArrayOfByte);
    try
    {
      this.d = a(paramString1, paramString2);
      return;
    }
    catch (MalformedURLException paramString1)
    {
      g.d("Collector", "url error:" + paramString1);
    }
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null) {
      this.e.add(paramArrayOfByte);
    }
  }
  
  public void b(int paramInt)
  {
    this.a = paramInt;
  }
  
  public void b(a.a parama)
  {
    this.b = parama;
    start();
  }
  
  public void run()
  {
    if (this.g == 1)
    {
      a();
      return;
    }
    b();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\sunflower\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */