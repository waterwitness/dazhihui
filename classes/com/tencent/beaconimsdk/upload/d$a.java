package com.tencent.beaconimsdk.upload;

import android.content.Context;
import android.net.Proxy;
import com.tencent.beaconimsdk.a.e;
import java.util.Date;
import java.util.Locale;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;

public final class d$a
  extends d
{
  private Context a;
  
  public d$a(Context paramContext)
  {
    this.a = paramContext;
  }
  
  private static b a(String paramString1, byte[] paramArrayOfByte, String paramString2, int paramInt)
  {
    if (paramString1 == null)
    {
      com.tencent.beaconimsdk.c.a.d("no destUrl!", new Object[0]);
      return null;
    }
    HttpClient localHttpClient;
    if (paramArrayOfByte != null) {
      try
      {
        paramArrayOfByte = new ByteArrayEntity(paramArrayOfByte);
        localHttpClient = a(paramString2, paramInt);
        if (localHttpClient == null)
        {
          com.tencent.beaconimsdk.c.a.d("no httpClient!", new Object[0]);
          return null;
        }
      }
      catch (Throwable paramString1)
      {
        paramArrayOfByte = null;
      }
    }
    for (;;)
    {
      com.tencent.beaconimsdk.c.a.a(paramString1);
      com.tencent.beaconimsdk.c.a.d("execute error:%s", new Object[] { paramString1.toString() });
      if (paramArrayOfByte != null) {
        paramArrayOfByte.abort();
      }
      throw new Exception(paramString1.toString());
      paramArrayOfByte = new ByteArrayEntity("".getBytes());
      break;
      paramString2 = new HttpPost(paramString1);
      try
      {
        paramString2.setHeader("wup_version", "3.0");
        paramString2.setHeader("TYPE_COMPRESS", "2");
        paramString2.setHeader("encr_type", "rsapost");
        paramString1 = com.tencent.beaconimsdk.a.b.d.a();
        if (paramString1 != null) {
          paramString2.setHeader("bea_key", paramString1.k());
        }
        paramString2.setEntity(paramArrayOfByte);
        paramString1 = new BasicHttpContext();
        paramArrayOfByte = localHttpClient.execute(paramString2, paramString1);
        com.tencent.beaconimsdk.c.a.h("execute request:\n %s", new Object[] { ((HttpRequest)paramString1.getAttribute("http.request")).getRequestLine().toString() });
        paramString1 = new b(paramArrayOfByte, paramString2);
        return paramString1;
      }
      catch (Throwable paramString1)
      {
        paramArrayOfByte = paramString2;
      }
    }
  }
  
  private static HttpClient a(String paramString, int paramInt)
  {
    try
    {
      BasicHttpParams localBasicHttpParams = new BasicHttpParams();
      HttpConnectionParams.setConnectionTimeout(localBasicHttpParams, 30000);
      HttpConnectionParams.setSoTimeout(localBasicHttpParams, 20000);
      HttpConnectionParams.setSocketBufferSize(localBasicHttpParams, 2000);
      localBasicHttpParams.setBooleanParameter("http.protocol.handle-redirects", false);
      DefaultHttpClient localDefaultHttpClient = new DefaultHttpClient(localBasicHttpParams);
      HttpProtocolParams.setUseExpectContinue(localBasicHttpParams, false);
      localDefaultHttpClient.setHttpRequestRetryHandler(new d.a.1());
      if ((paramString != null) && (paramString.toLowerCase(Locale.US).contains("wap")) && (paramInt != 2))
      {
        com.tencent.beaconimsdk.c.a.a("use proxy: %s, try time: %s", new Object[] { paramString, Integer.valueOf(paramInt) });
        paramString = new HttpHost(Proxy.getDefaultHost(), Proxy.getDefaultPort());
        localDefaultHttpClient.getParams().setParameter("http.route.default-proxy", paramString);
        return localDefaultHttpClient;
      }
      if (paramString != null) {
        com.tencent.beaconimsdk.c.a.a("Don't use proxy: %s, try time: %s", new Object[] { paramString, Integer.valueOf(paramInt) });
      }
      localDefaultHttpClient.getParams().removeParameter("http.route.default-proxy");
      return localDefaultHttpClient;
    }
    catch (Throwable paramString)
    {
      com.tencent.beaconimsdk.c.a.a(paramString);
      com.tencent.beaconimsdk.c.a.d("httpclient error!", new Object[0]);
    }
    return null;
  }
  
  /* Error */
  private byte[] a(HttpResponse paramHttpResponse, HttpPost paramHttpPost)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aload_1
    //   4: ifnonnull +8 -> 12
    //   7: aload 5
    //   9: astore_3
    //   10: aload_3
    //   11: areturn
    //   12: aload_1
    //   13: invokeinterface 235 1 0
    //   18: invokeinterface 240 1 0
    //   23: istore 6
    //   25: iload 6
    //   27: sipush 200
    //   30: if_icmpeq +31 -> 61
    //   33: ldc -14
    //   35: iconst_2
    //   36: anewarray 21	java/lang/Object
    //   39: dup
    //   40: iconst_0
    //   41: iload 6
    //   43: invokestatic 192	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   46: aastore
    //   47: dup
    //   48: iconst_1
    //   49: aload_1
    //   50: invokeinterface 235 1 0
    //   55: aastore
    //   56: invokestatic 245	com/tencent/beaconimsdk/c/a:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   59: aconst_null
    //   60: areturn
    //   61: aload_1
    //   62: ldc -9
    //   64: invokeinterface 250 2 0
    //   69: ifeq +56 -> 125
    //   72: aload_1
    //   73: ldc -4
    //   75: invokeinterface 250 2 0
    //   80: ifeq +45 -> 125
    //   83: aload_1
    //   84: ldc -9
    //   86: invokeinterface 256 2 0
    //   91: invokeinterface 261 1 0
    //   96: astore_3
    //   97: aload_1
    //   98: ldc -4
    //   100: invokeinterface 256 2 0
    //   105: invokeinterface 261 1 0
    //   110: astore 4
    //   112: invokestatic 86	com/tencent/beaconimsdk/a/b/d:a	()Lcom/tencent/beaconimsdk/a/b/d;
    //   115: aload_0
    //   116: getfield 13	com/tencent/beaconimsdk/upload/d$a:a	Landroid/content/Context;
    //   119: aload_3
    //   120: aload 4
    //   122: invokevirtual 264	com/tencent/beaconimsdk/a/b/d:a	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    //   125: aload_1
    //   126: invokeinterface 268 1 0
    //   131: astore_1
    //   132: aload_1
    //   133: ifnonnull +15 -> 148
    //   136: ldc_w 270
    //   139: iconst_0
    //   140: anewarray 21	java/lang/Object
    //   143: invokestatic 27	com/tencent/beaconimsdk/c/a:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   146: aconst_null
    //   147: areturn
    //   148: new 272	java/io/BufferedInputStream
    //   151: dup
    //   152: new 274	java/io/DataInputStream
    //   155: dup
    //   156: aload_1
    //   157: invokeinterface 280 1 0
    //   162: invokespecial 283	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   165: invokespecial 284	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   168: astore_3
    //   169: aload_3
    //   170: astore_1
    //   171: new 286	java/io/ByteArrayOutputStream
    //   174: dup
    //   175: sipush 128
    //   178: invokespecial 289	java/io/ByteArrayOutputStream:<init>	(I)V
    //   181: astore 4
    //   183: aload_3
    //   184: astore_1
    //   185: aload_3
    //   186: invokevirtual 292	java/io/BufferedInputStream:read	()I
    //   189: istore 6
    //   191: iload 6
    //   193: iconst_m1
    //   194: if_icmpeq +65 -> 259
    //   197: aload_3
    //   198: astore_1
    //   199: aload 4
    //   201: iload 6
    //   203: invokevirtual 295	java/io/ByteArrayOutputStream:write	(I)V
    //   206: goto -23 -> 183
    //   209: astore 4
    //   211: aload_3
    //   212: astore_1
    //   213: aload 4
    //   215: invokestatic 40	com/tencent/beaconimsdk/c/a:a	(Ljava/lang/Throwable;)V
    //   218: aload_3
    //   219: astore_1
    //   220: ldc_w 297
    //   223: iconst_1
    //   224: anewarray 21	java/lang/Object
    //   227: dup
    //   228: iconst_0
    //   229: aload 4
    //   231: invokevirtual 46	java/lang/Throwable:toString	()Ljava/lang/String;
    //   234: aastore
    //   235: invokestatic 27	com/tencent/beaconimsdk/c/a:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   238: aload_3
    //   239: ifnull +7 -> 246
    //   242: aload_3
    //   243: invokevirtual 300	java/io/BufferedInputStream:close	()V
    //   246: aload 5
    //   248: astore_3
    //   249: aload_2
    //   250: ifnull -240 -> 10
    //   253: aload_2
    //   254: invokevirtual 51	org/apache/http/client/methods/HttpPost:abort	()V
    //   257: aconst_null
    //   258: areturn
    //   259: aload_3
    //   260: astore_1
    //   261: aload 4
    //   263: invokevirtual 303	java/io/ByteArrayOutputStream:flush	()V
    //   266: aload_3
    //   267: astore_1
    //   268: aload 4
    //   270: invokevirtual 306	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   273: astore 4
    //   275: aload 4
    //   277: astore_1
    //   278: aload_3
    //   279: invokevirtual 300	java/io/BufferedInputStream:close	()V
    //   282: aload_1
    //   283: astore_3
    //   284: aload_2
    //   285: ifnull -275 -> 10
    //   288: aload_2
    //   289: invokevirtual 51	org/apache/http/client/methods/HttpPost:abort	()V
    //   292: aload_1
    //   293: areturn
    //   294: astore_3
    //   295: aload_3
    //   296: invokestatic 40	com/tencent/beaconimsdk/c/a:a	(Ljava/lang/Throwable;)V
    //   299: goto -17 -> 282
    //   302: astore_1
    //   303: aload_1
    //   304: invokestatic 40	com/tencent/beaconimsdk/c/a:a	(Ljava/lang/Throwable;)V
    //   307: goto -61 -> 246
    //   310: astore_3
    //   311: aconst_null
    //   312: astore_1
    //   313: aload_1
    //   314: ifnull +7 -> 321
    //   317: aload_1
    //   318: invokevirtual 300	java/io/BufferedInputStream:close	()V
    //   321: aload_2
    //   322: ifnull +7 -> 329
    //   325: aload_2
    //   326: invokevirtual 51	org/apache/http/client/methods/HttpPost:abort	()V
    //   329: aload_3
    //   330: athrow
    //   331: astore_1
    //   332: aload_1
    //   333: invokestatic 40	com/tencent/beaconimsdk/c/a:a	(Ljava/lang/Throwable;)V
    //   336: goto -15 -> 321
    //   339: astore_3
    //   340: goto -27 -> 313
    //   343: astore 4
    //   345: aconst_null
    //   346: astore_3
    //   347: goto -136 -> 211
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	350	0	this	a
    //   0	350	1	paramHttpResponse	HttpResponse
    //   0	350	2	paramHttpPost	HttpPost
    //   9	275	3	localObject1	Object
    //   294	2	3	localThrowable1	Throwable
    //   310	20	3	localObject2	Object
    //   339	1	3	localObject3	Object
    //   346	1	3	localObject4	Object
    //   110	90	4	localObject5	Object
    //   209	60	4	localThrowable2	Throwable
    //   273	3	4	arrayOfByte	byte[]
    //   343	1	4	localThrowable3	Throwable
    //   1	246	5	localObject6	Object
    //   23	179	6	i	int
    // Exception table:
    //   from	to	target	type
    //   171	183	209	java/lang/Throwable
    //   185	191	209	java/lang/Throwable
    //   199	206	209	java/lang/Throwable
    //   261	266	209	java/lang/Throwable
    //   268	275	209	java/lang/Throwable
    //   278	282	294	java/lang/Throwable
    //   242	246	302	java/lang/Throwable
    //   148	169	310	finally
    //   317	321	331	java/lang/Throwable
    //   171	183	339	finally
    //   185	191	339	finally
    //   199	206	339	finally
    //   213	218	339	finally
    //   220	238	339	finally
    //   261	266	339	finally
    //   268	275	339	finally
    //   148	169	343	java/lang/Throwable
  }
  
  public final byte[] a(String paramString, byte[] paramArrayOfByte, a parama)
  {
    if (paramString == null)
    {
      com.tencent.beaconimsdk.c.a.d("no destUrl!", new Object[0]);
      return null;
    }
    if (paramArrayOfByte == null) {}
    Object localObject3;
    Object localObject1;
    Object localObject2;
    int k;
    int i;
    int j;
    int m;
    for (long l = 0L;; l = paramArrayOfByte.length)
    {
      com.tencent.beaconimsdk.c.a.h("start req: %s sz:%d", new Object[] { paramString, Long.valueOf(l) });
      localObject3 = "";
      localObject1 = null;
      localObject2 = "";
      k = 0;
      i = 0;
      j = 0;
      m = k + 1;
      if ((k >= 3) || (i >= 2)) {
        break label702;
      }
      if (j == 0) {
        break;
      }
      throw new Exception("net redirect");
    }
    if (m > 1)
    {
      com.tencent.beaconimsdk.c.a.h("try time:" + m, new Object[0]);
      if ((m == 2) && (parama.c() == 2)) {
        parama.b(false);
      }
    }
    int n;
    try
    {
      Thread.sleep(5000L);
      Object localObject4 = e.n(this.a);
      new Date().getTime();
      try
      {
        localObject4 = a(paramString, paramArrayOfByte, (String)localObject4, m);
        localObject1 = localObject4;
        localObject4 = localObject2;
        localObject2 = localObject1;
        localObject1 = localObject4;
      }
      catch (Exception localException1)
      {
        Object localObject7 = localException1.toString();
        if (!((String)localObject3).equals(localObject7)) {
          break label423;
        }
        for (localObject2 = (String)localObject2 + m + ":same ";; localObject2 = (String)localObject2 + m + ":" + (String)localObject7 + " ")
        {
          localObject5 = localObject1;
          localObject3 = localObject7;
          localObject1 = localObject2;
          localObject2 = localObject5;
          break;
        }
        return a((HttpResponse)localObject5, ((b)localObject2).b);
      }
      new Date().getTime();
      if (localObject2 == null) {
        break label716;
      }
      localObject4 = ((b)localObject2).a;
      localObject7 = ((HttpResponse)localObject4).getEntity();
      if (localObject7 != null) {
        ((HttpEntity)localObject7).getContentLength();
      }
      n = ((HttpResponse)localObject4).getStatusLine().getStatusCode();
      com.tencent.beaconimsdk.c.a.h("response code:%d ", new Object[] { Integer.valueOf(n) });
      if (n == 200) {
        if (((HttpResponse)localObject4).containsHeader("encrypt-status"))
        {
          com.tencent.beaconimsdk.c.a.d("svr encry failed: " + ((HttpResponse)localObject4).getFirstHeader("encrypt-status").getValue(), new Object[0]);
          return null;
        }
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        com.tencent.beaconimsdk.c.a.a(localInterruptedException);
      }
    }
    Object localObject5;
    label423:
    if ((n == 301) || (n == 302) || (n == 303) || (n == 307))
    {
      k = 1;
      label512:
      if (k == 0) {
        break label716;
      }
      m = 1;
      paramString = ((HttpResponse)localObject5).getFirstHeader("Location");
      if (paramString != null) {
        break label590;
      }
      com.tencent.beaconimsdk.c.a.d("redirect code:" + n + " Location is null! return", new Object[0]);
    }
    for (;;)
    {
      try
      {
        if (((b)localObject2).b != null) {
          ((b)localObject2).b.abort();
        }
        return null;
        k = 0;
        break label512;
        label590:
        j = i + 1;
        k = 0;
        paramString = paramString.getValue();
        com.tencent.beaconimsdk.c.a.h("redirect code:%d , to:%s", new Object[] { Integer.valueOf(n), paramString });
        try
        {
          if (((b)localObject2).b != null) {
            ((b)localObject2).b.abort();
          }
          localObject5 = localObject2;
          k = 0;
          i = j;
          j = 1;
          localObject2 = localObject1;
          localObject1 = localObject5;
        }
        catch (Exception localException2)
        {
          i = m;
        }
        Object localObject6 = localObject2;
        m = j;
        localObject2 = localObject1;
        localObject1 = localObject6;
        j = i;
        i = m;
        break;
        label702:
        throw new Exception((String)localObject2);
      }
      catch (Exception paramString)
      {
        continue;
      }
      label716:
      k = i;
      i = j;
      j = k;
      k = m;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beaconimsdk\upload\d$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */