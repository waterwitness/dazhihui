package com.f.a.a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy.Type;
import java.net.URL;

public class v
  implements Runnable
{
  public static String a;
  private Context b;
  private String c;
  private java.net.Proxy d;
  private ck e = null;
  private byte[] f;
  private Thread g;
  private InputStream h;
  private DataOutputStream i;
  private HttpURLConnection j;
  private int k;
  
  public v(Context paramContext, String paramString)
  {
    this.b = paramContext;
    this.c = paramString;
  }
  
  private boolean c()
  {
    return this.j != null;
  }
  
  public void a()
  {
    Log.i("httpUrl", "url=" + this.c);
    Object localObject = new URL(this.c);
    label166:
    int m;
    if (this.d != null)
    {
      this.j = ((HttpURLConnection)((URL)localObject).openConnection(this.d));
      this.j.setRequestMethod("POST");
      this.j.setUseCaches(false);
      this.j.setRequestProperty("Charset", "UTF-8");
      this.j.setRequestProperty("Content-Type", "text/plain");
      this.j.setDoInput(true);
      this.j.setDoOutput(true);
      this.j.setConnectTimeout(this.k);
      this.j.setReadTimeout(this.k);
      if (a == null) {
        break label259;
      }
      this.j.setRequestProperty("sessionId", a);
      Log.d("---HttpNet-connect-sessionId-=", a);
      this.i = new DataOutputStream(this.j.getOutputStream());
      a(this.f, 0, this.f.length);
      this.j.connect();
      m = this.j.getResponseCode();
      if (this.j.getResponseCode() == 200) {
        return;
      }
      if (m != 504) {
        break label270;
      }
    }
    label259:
    label270:
    for (localObject = "网络连接超时, 请检查您的网络设置, 或稍候重试!";; localObject = "网络连接失败, 请检查您的网络设置, 或稍候重试!\r\n错误号: " + Integer.toString(m))
    {
      throw new Exception((String)localObject);
      this.j = ((HttpURLConnection)((URL)localObject).openConnection());
      break;
      Log.d("---HttpNet-connect-sessionId-is null=", "sessionId is null");
      break label166;
    }
  }
  
  public void a(Context paramContext)
  {
    paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    if ((paramContext != null) && (paramContext.isAvailable()) && (paramContext.getType() == 0))
    {
      paramContext = android.net.Proxy.getDefaultHost();
      int m = android.net.Proxy.getDefaultPort();
      if (paramContext != null)
      {
        paramContext = new InetSocketAddress(paramContext, m);
        this.d = new java.net.Proxy(Proxy.Type.HTTP, paramContext);
      }
    }
  }
  
  public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      this.i.write(paramArrayOfByte, paramInt1, paramInt2);
      this.i.flush();
      Log.d("---plugin-send data length=", " " + paramArrayOfByte.length);
      return;
    }
    catch (Exception paramArrayOfByte)
    {
      Log.d("---HttpNet-sende-e=", paramArrayOfByte.getMessage());
    }
  }
  
  public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, ck paramck, int paramInt3)
  {
    this.k = paramInt3;
    this.f = paramArrayOfByte;
    this.e = paramck;
    this.g = new Thread(this);
    this.g.start();
  }
  
  public void b()
  {
    try
    {
      boolean bool = c();
      if (bool) {}
      try
      {
        if (this.h != null)
        {
          this.h.close();
          this.h = null;
        }
        if (this.i != null)
        {
          this.i.close();
          this.i = null;
        }
        if (this.j != null)
        {
          this.j.disconnect();
          this.j = null;
        }
        this.f = null;
        return;
      }
      catch (Exception localException1)
      {
        this.f = null;
        this.j = null;
        this.i = null;
        this.h = null;
        return;
      }
      return;
    }
    catch (Exception localException2)
    {
      Log.d("---HttpNet-disconnect-e=", localException2.getMessage());
    }
  }
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: aload_0
    //   4: getfield 36	com/f/a/a/v:b	Landroid/content/Context;
    //   7: invokevirtual 259	com/f/a/a/v:a	(Landroid/content/Context;)V
    //   10: aload_0
    //   11: invokevirtual 261	com/f/a/a/v:a	()V
    //   14: aload_0
    //   15: getfield 42	com/f/a/a/v:j	Ljava/net/HttpURLConnection;
    //   18: invokevirtual 142	java/net/HttpURLConnection:getResponseCode	()I
    //   21: sipush 200
    //   24: if_icmpne +372 -> 396
    //   27: aload_0
    //   28: aload_0
    //   29: getfield 42	com/f/a/a/v:j	Ljava/net/HttpURLConnection;
    //   32: invokevirtual 265	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   35: putfield 241	com/f/a/a/v:h	Ljava/io/InputStream;
    //   38: new 267	java/io/InputStreamReader
    //   41: dup
    //   42: aload_0
    //   43: getfield 241	com/f/a/a/v:h	Ljava/io/InputStream;
    //   46: invokespecial 270	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   49: astore_1
    //   50: new 272	java/io/BufferedReader
    //   53: dup
    //   54: aload_1
    //   55: sipush 8192
    //   58: invokespecial 275	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   61: astore_3
    //   62: new 46	java/lang/StringBuilder
    //   65: dup
    //   66: invokespecial 47	java/lang/StringBuilder:<init>	()V
    //   69: astore 5
    //   71: aload_3
    //   72: invokevirtual 278	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   75: astore_2
    //   76: aload_2
    //   77: ifnull +119 -> 196
    //   80: aload 5
    //   82: aload_2
    //   83: invokevirtual 53	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   86: pop
    //   87: goto -16 -> 71
    //   90: astore 4
    //   92: aload_1
    //   93: astore_2
    //   94: aload_3
    //   95: astore_1
    //   96: aload 4
    //   98: astore_3
    //   99: aload_3
    //   100: invokevirtual 281	java/lang/Exception:printStackTrace	()V
    //   103: aload_0
    //   104: getfield 34	com/f/a/a/v:e	Lcom/f/a/a/ck;
    //   107: ifnull +183 -> 290
    //   110: aload_0
    //   111: getfield 34	com/f/a/a/v:e	Lcom/f/a/a/ck;
    //   114: ldc_w 283
    //   117: aload_0
    //   118: invokeinterface 288 3 0
    //   123: aload_1
    //   124: ifnull +7 -> 131
    //   127: aload_1
    //   128: invokevirtual 289	java/io/BufferedReader:close	()V
    //   131: aload_2
    //   132: ifnull +7 -> 139
    //   135: aload_2
    //   136: invokevirtual 290	java/io/InputStreamReader:close	()V
    //   139: aload_0
    //   140: invokevirtual 292	com/f/a/a/v:b	()V
    //   143: return
    //   144: astore_1
    //   145: aload_1
    //   146: invokevirtual 293	java/net/SocketTimeoutException:printStackTrace	()V
    //   149: aload_0
    //   150: getfield 34	com/f/a/a/v:e	Lcom/f/a/a/ck;
    //   153: ifnull -139 -> 14
    //   156: aload_0
    //   157: getfield 34	com/f/a/a/v:e	Lcom/f/a/a/ck;
    //   160: ldc_w 295
    //   163: aload_0
    //   164: invokeinterface 288 3 0
    //   169: return
    //   170: astore_1
    //   171: aload_1
    //   172: invokevirtual 281	java/lang/Exception:printStackTrace	()V
    //   175: aload_0
    //   176: getfield 34	com/f/a/a/v:e	Lcom/f/a/a/ck;
    //   179: ifnull -165 -> 14
    //   182: aload_0
    //   183: getfield 34	com/f/a/a/v:e	Lcom/f/a/a/ck;
    //   186: ldc_w 283
    //   189: aload_0
    //   190: invokeinterface 288 3 0
    //   195: return
    //   196: aload_3
    //   197: invokevirtual 289	java/io/BufferedReader:close	()V
    //   200: aload_1
    //   201: invokevirtual 290	java/io/InputStreamReader:close	()V
    //   204: aload_3
    //   205: astore_2
    //   206: aload_1
    //   207: astore 4
    //   209: aload_0
    //   210: getfield 34	com/f/a/a/v:e	Lcom/f/a/a/ck;
    //   213: ifnull +38 -> 251
    //   216: ldc_w 297
    //   219: aload 5
    //   221: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   224: invokestatic 119	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   227: pop
    //   228: aload_0
    //   229: getfield 34	com/f/a/a/v:e	Lcom/f/a/a/ck;
    //   232: aload 5
    //   234: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   237: invokevirtual 303	java/lang/String:getBytes	()[B
    //   240: aload_0
    //   241: invokeinterface 306 3 0
    //   246: aload_1
    //   247: astore 4
    //   249: aload_3
    //   250: astore_2
    //   251: aload_2
    //   252: ifnull +7 -> 259
    //   255: aload_2
    //   256: invokevirtual 289	java/io/BufferedReader:close	()V
    //   259: aload 4
    //   261: ifnull +8 -> 269
    //   264: aload 4
    //   266: invokevirtual 290	java/io/InputStreamReader:close	()V
    //   269: aload_0
    //   270: invokevirtual 292	com/f/a/a/v:b	()V
    //   273: return
    //   274: astore_1
    //   275: aload_1
    //   276: invokevirtual 307	java/io/IOException:printStackTrace	()V
    //   279: goto -10 -> 269
    //   282: astore_1
    //   283: aload_1
    //   284: invokevirtual 307	java/io/IOException:printStackTrace	()V
    //   287: goto -148 -> 139
    //   290: aload_1
    //   291: ifnull +7 -> 298
    //   294: aload_1
    //   295: invokevirtual 289	java/io/BufferedReader:close	()V
    //   298: aload_2
    //   299: ifnull +7 -> 306
    //   302: aload_2
    //   303: invokevirtual 290	java/io/InputStreamReader:close	()V
    //   306: aload_0
    //   307: invokevirtual 292	com/f/a/a/v:b	()V
    //   310: return
    //   311: astore_1
    //   312: aload_1
    //   313: invokevirtual 307	java/io/IOException:printStackTrace	()V
    //   316: goto -10 -> 306
    //   319: astore_2
    //   320: aconst_null
    //   321: astore_3
    //   322: aconst_null
    //   323: astore_1
    //   324: aload_3
    //   325: ifnull +7 -> 332
    //   328: aload_3
    //   329: invokevirtual 289	java/io/BufferedReader:close	()V
    //   332: aload_1
    //   333: ifnull +7 -> 340
    //   336: aload_1
    //   337: invokevirtual 290	java/io/InputStreamReader:close	()V
    //   340: aload_0
    //   341: invokevirtual 292	com/f/a/a/v:b	()V
    //   344: aload_2
    //   345: athrow
    //   346: astore_1
    //   347: aload_1
    //   348: invokevirtual 307	java/io/IOException:printStackTrace	()V
    //   351: goto -11 -> 340
    //   354: astore_2
    //   355: aconst_null
    //   356: astore_3
    //   357: goto -33 -> 324
    //   360: astore_2
    //   361: goto -37 -> 324
    //   364: astore_3
    //   365: aload_2
    //   366: astore 4
    //   368: aload_3
    //   369: astore_2
    //   370: aload_1
    //   371: astore_3
    //   372: aload 4
    //   374: astore_1
    //   375: goto -51 -> 324
    //   378: astore_3
    //   379: aconst_null
    //   380: astore_1
    //   381: goto -282 -> 99
    //   384: astore_3
    //   385: aconst_null
    //   386: astore 4
    //   388: aload_1
    //   389: astore_2
    //   390: aload 4
    //   392: astore_1
    //   393: goto -294 -> 99
    //   396: aconst_null
    //   397: astore_2
    //   398: aconst_null
    //   399: astore 4
    //   401: goto -150 -> 251
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	404	0	this	v
    //   49	79	1	localObject1	Object
    //   144	2	1	localSocketTimeoutException	java.net.SocketTimeoutException
    //   170	77	1	localException1	Exception
    //   274	2	1	localIOException1	java.io.IOException
    //   282	13	1	localIOException2	java.io.IOException
    //   311	2	1	localIOException3	java.io.IOException
    //   323	14	1	localObject2	Object
    //   346	25	1	localIOException4	java.io.IOException
    //   374	19	1	localObject3	Object
    //   1	302	2	localObject4	Object
    //   319	26	2	localObject5	Object
    //   354	1	2	localObject6	Object
    //   360	6	2	localObject7	Object
    //   369	29	2	localObject8	Object
    //   61	296	3	localObject9	Object
    //   364	5	3	localObject10	Object
    //   371	1	3	localIOException5	java.io.IOException
    //   378	1	3	localException2	Exception
    //   384	1	3	localException3	Exception
    //   90	7	4	localException4	Exception
    //   207	193	4	localObject11	Object
    //   69	164	5	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   62	71	90	java/lang/Exception
    //   71	76	90	java/lang/Exception
    //   80	87	90	java/lang/Exception
    //   196	204	90	java/lang/Exception
    //   209	246	90	java/lang/Exception
    //   10	14	144	java/net/SocketTimeoutException
    //   10	14	170	java/lang/Exception
    //   255	259	274	java/io/IOException
    //   264	269	274	java/io/IOException
    //   127	131	282	java/io/IOException
    //   135	139	282	java/io/IOException
    //   294	298	311	java/io/IOException
    //   302	306	311	java/io/IOException
    //   14	50	319	finally
    //   328	332	346	java/io/IOException
    //   336	340	346	java/io/IOException
    //   50	62	354	finally
    //   62	71	360	finally
    //   71	76	360	finally
    //   80	87	360	finally
    //   196	204	360	finally
    //   209	246	360	finally
    //   99	123	364	finally
    //   14	50	378	java/lang/Exception
    //   50	62	384	java/lang/Exception
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */