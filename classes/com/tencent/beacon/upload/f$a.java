package com.tencent.beacon.upload;

import android.content.Context;
import android.net.Proxy;
import com.tencent.beacon.e.c;
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

public final class f$a
  extends f
{
  private Context a;
  
  public f$a(Context paramContext)
  {
    this.a = paramContext;
  }
  
  private b a(String paramString1, byte[] paramArrayOfByte, String paramString2, int paramInt)
  {
    if (paramString1 == null)
    {
      com.tencent.beacon.e.b.d("no destUrl!", new Object[0]);
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
          com.tencent.beacon.e.b.d("no httpClient!", new Object[0]);
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
      paramString1.printStackTrace();
      com.tencent.beacon.e.b.d("execute error:%s", new Object[] { paramString1.toString() });
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
        paramString2.setEntity(paramArrayOfByte);
        paramString1 = new BasicHttpContext();
        paramArrayOfByte = localHttpClient.execute(paramString2, paramString1);
        com.tencent.beacon.e.b.h("execute request:\n %s", new Object[] { ((HttpRequest)paramString1.getAttribute("http.request")).getRequestLine().toString() });
        paramString1 = new b(paramArrayOfByte, paramString2);
        return paramString1;
      }
      catch (Throwable paramString1)
      {
        paramArrayOfByte = paramString2;
      }
    }
  }
  
  private HttpClient a(String paramString, int paramInt)
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
      localDefaultHttpClient.setHttpRequestRetryHandler(new f.a.1(this));
      if ((paramString != null) && (paramString.toLowerCase(Locale.US).contains("wap")) && (paramInt != 2))
      {
        com.tencent.beacon.e.b.a("use proxy: %s, try time: %s", new Object[] { paramString, Integer.valueOf(paramInt) });
        paramString = new HttpHost(Proxy.getDefaultHost(), Proxy.getDefaultPort());
        localDefaultHttpClient.getParams().setParameter("http.route.default-proxy", paramString);
        return localDefaultHttpClient;
      }
      if (paramString != null) {
        com.tencent.beacon.e.b.a("Don't use proxy: %s, try time: %s", new Object[] { paramString, Integer.valueOf(paramInt) });
      }
      localDefaultHttpClient.getParams().removeParameter("http.route.default-proxy");
      return localDefaultHttpClient;
    }
    catch (Throwable paramString)
    {
      paramString.printStackTrace();
      com.tencent.beacon.e.b.d("httpclient error!", new Object[0]);
    }
    return null;
  }
  
  /* Error */
  private static byte[] a(HttpResponse paramHttpResponse, HttpPost paramHttpPost)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aload_0
    //   4: ifnonnull +8 -> 12
    //   7: aload 4
    //   9: astore_2
    //   10: aload_2
    //   11: areturn
    //   12: aload_0
    //   13: invokeinterface 223 1 0
    //   18: invokeinterface 228 1 0
    //   23: istore 5
    //   25: iload 5
    //   27: sipush 200
    //   30: if_icmpeq +31 -> 61
    //   33: ldc -26
    //   35: iconst_2
    //   36: anewarray 21	java/lang/Object
    //   39: dup
    //   40: iconst_0
    //   41: iload 5
    //   43: invokestatic 180	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   46: aastore
    //   47: dup
    //   48: iconst_1
    //   49: aload_0
    //   50: invokeinterface 223 1 0
    //   55: aastore
    //   56: invokestatic 233	com/tencent/beacon/e/b:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   59: aconst_null
    //   60: areturn
    //   61: aload_0
    //   62: invokeinterface 237 1 0
    //   67: astore_0
    //   68: aload_0
    //   69: ifnonnull +14 -> 83
    //   72: ldc -17
    //   74: iconst_0
    //   75: anewarray 21	java/lang/Object
    //   78: invokestatic 27	com/tencent/beacon/e/b:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   81: aconst_null
    //   82: areturn
    //   83: new 241	java/io/BufferedInputStream
    //   86: dup
    //   87: new 243	java/io/DataInputStream
    //   90: dup
    //   91: aload_0
    //   92: invokeinterface 249 1 0
    //   97: invokespecial 252	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   100: invokespecial 253	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   103: astore_2
    //   104: aload_2
    //   105: astore_0
    //   106: new 255	java/io/ByteArrayOutputStream
    //   109: dup
    //   110: invokespecial 256	java/io/ByteArrayOutputStream:<init>	()V
    //   113: astore_3
    //   114: aload_2
    //   115: astore_0
    //   116: aload_2
    //   117: invokevirtual 259	java/io/BufferedInputStream:read	()I
    //   120: istore 5
    //   122: iload 5
    //   124: iconst_m1
    //   125: if_icmpeq +61 -> 186
    //   128: aload_2
    //   129: astore_0
    //   130: aload_3
    //   131: iload 5
    //   133: invokevirtual 263	java/io/ByteArrayOutputStream:write	(I)V
    //   136: goto -22 -> 114
    //   139: astore_3
    //   140: aload_2
    //   141: astore_0
    //   142: aload_3
    //   143: invokevirtual 40	java/lang/Throwable:printStackTrace	()V
    //   146: aload_2
    //   147: astore_0
    //   148: ldc_w 265
    //   151: iconst_1
    //   152: anewarray 21	java/lang/Object
    //   155: dup
    //   156: iconst_0
    //   157: aload_3
    //   158: invokevirtual 46	java/lang/Throwable:toString	()Ljava/lang/String;
    //   161: aastore
    //   162: invokestatic 27	com/tencent/beacon/e/b:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   165: aload_2
    //   166: ifnull +7 -> 173
    //   169: aload_2
    //   170: invokevirtual 268	java/io/BufferedInputStream:close	()V
    //   173: aload 4
    //   175: astore_2
    //   176: aload_1
    //   177: ifnull -167 -> 10
    //   180: aload_1
    //   181: invokevirtual 51	org/apache/http/client/methods/HttpPost:abort	()V
    //   184: aconst_null
    //   185: areturn
    //   186: aload_2
    //   187: astore_0
    //   188: aload_3
    //   189: invokevirtual 271	java/io/ByteArrayOutputStream:flush	()V
    //   192: aload_2
    //   193: astore_0
    //   194: aload_3
    //   195: invokevirtual 274	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   198: astore_3
    //   199: aload_3
    //   200: astore_0
    //   201: aload_2
    //   202: invokevirtual 268	java/io/BufferedInputStream:close	()V
    //   205: aload_0
    //   206: astore_2
    //   207: aload_1
    //   208: ifnull -198 -> 10
    //   211: aload_1
    //   212: invokevirtual 51	org/apache/http/client/methods/HttpPost:abort	()V
    //   215: aload_0
    //   216: areturn
    //   217: astore_2
    //   218: aload_2
    //   219: invokevirtual 40	java/lang/Throwable:printStackTrace	()V
    //   222: goto -17 -> 205
    //   225: astore_0
    //   226: aload_0
    //   227: invokevirtual 40	java/lang/Throwable:printStackTrace	()V
    //   230: goto -57 -> 173
    //   233: astore_2
    //   234: aconst_null
    //   235: astore_0
    //   236: aload_0
    //   237: ifnull +7 -> 244
    //   240: aload_0
    //   241: invokevirtual 268	java/io/BufferedInputStream:close	()V
    //   244: aload_1
    //   245: ifnull +7 -> 252
    //   248: aload_1
    //   249: invokevirtual 51	org/apache/http/client/methods/HttpPost:abort	()V
    //   252: aload_2
    //   253: athrow
    //   254: astore_0
    //   255: aload_0
    //   256: invokevirtual 40	java/lang/Throwable:printStackTrace	()V
    //   259: goto -15 -> 244
    //   262: astore_2
    //   263: goto -27 -> 236
    //   266: astore_3
    //   267: aconst_null
    //   268: astore_2
    //   269: goto -129 -> 140
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	272	0	paramHttpResponse	HttpResponse
    //   0	272	1	paramHttpPost	HttpPost
    //   9	198	2	localObject1	Object
    //   217	2	2	localThrowable1	Throwable
    //   233	20	2	localObject2	Object
    //   262	1	2	localObject3	Object
    //   268	1	2	localObject4	Object
    //   113	18	3	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   139	56	3	localThrowable2	Throwable
    //   198	2	3	arrayOfByte	byte[]
    //   266	1	3	localThrowable3	Throwable
    //   1	173	4	localObject5	Object
    //   23	109	5	i	int
    // Exception table:
    //   from	to	target	type
    //   106	114	139	java/lang/Throwable
    //   116	122	139	java/lang/Throwable
    //   130	136	139	java/lang/Throwable
    //   188	192	139	java/lang/Throwable
    //   194	199	139	java/lang/Throwable
    //   201	205	217	java/lang/Throwable
    //   169	173	225	java/lang/Throwable
    //   83	104	233	finally
    //   240	244	254	java/lang/Throwable
    //   106	114	262	finally
    //   116	122	262	finally
    //   130	136	262	finally
    //   142	146	262	finally
    //   148	165	262	finally
    //   188	192	262	finally
    //   194	199	262	finally
    //   83	104	266	java/lang/Throwable
  }
  
  public final byte[] a(String paramString, byte[] paramArrayOfByte, e parame, a parama)
  {
    if (paramString == null)
    {
      com.tencent.beacon.e.b.d("no destUrl!", new Object[0]);
      return null;
    }
    long l2;
    String str1;
    int j;
    Object localObject1;
    Object localObject3;
    int k;
    Object localObject2;
    int i;
    int m;
    if (paramArrayOfByte == null)
    {
      l2 = 0L;
      com.tencent.beacon.e.b.h("start req: %s sz:%d", new Object[] { paramString, Long.valueOf(l2) });
      str1 = "";
      j = 0;
      localObject1 = null;
      localObject3 = "";
      k = 0;
      localObject2 = paramString;
      i = 0;
      paramString = (String)localObject3;
      m = k + 1;
      if ((k >= 3) || (j >= 2)) {
        break label707;
      }
      if (i == 0) {
        break label297;
      }
      i = 0;
    }
    long l1;
    long l4;
    int i2;
    for (;;)
    {
      localObject3 = c.c(this.a);
      if (parame != null) {
        parame.a((String)localObject2, l2, (String)localObject3, m);
      }
      l1 = new Date().getTime();
      try
      {
        localObject3 = a((String)localObject2, paramArrayOfByte, (String)localObject3, m);
        localObject1 = localObject3;
      }
      catch (Exception localException2)
      {
        for (;;)
        {
          HttpEntity localHttpEntity;
          long l3;
          str3 = localException2.toString();
          if (paramString.equals(str3)) {}
          for (str1 = str1 + m + ":same ";; str1 = str1 + m + ":" + str3 + " ")
          {
            paramString = str3;
            break;
          }
          l1 = paramString.length;
        }
        if (i2 == 301) {
          break label502;
        }
      }
      l4 = new Date().getTime() - l1;
      if (localObject1 == null) {
        break label689;
      }
      localObject3 = ((b)localObject1).a;
      localHttpEntity = ((HttpResponse)localObject3).getEntity();
      l1 = 0L;
      if (localHttpEntity != null)
      {
        l3 = localHttpEntity.getContentLength();
        l1 = l3;
        if (l3 < 0L) {
          l1 = 0L;
        }
      }
      i2 = ((HttpResponse)localObject3).getStatusLine().getStatusCode();
      com.tencent.beacon.e.b.h("response code:%d ", new Object[] { Integer.valueOf(i2) });
      if (i2 != 200) {
        break label470;
      }
      paramString = a((HttpResponse)localObject3, ((b)localObject1).b);
      if (parame != null)
      {
        if (paramString != null) {
          break label462;
        }
        l1 = 0L;
        parame.a(l1, l4);
      }
      return paramString;
      l2 = paramArrayOfByte.length;
      break;
      label297:
      if (m > 1)
      {
        com.tencent.beacon.e.b.h("try time:" + m, new Object[0]);
        if ((m == 2) && (parama.c() == 2)) {
          parama.b(false);
        }
        try
        {
          Thread.sleep(5000L);
        }
        catch (InterruptedException localInterruptedException)
        {
          localInterruptedException.printStackTrace();
        }
      }
    }
    String str3;
    label462:
    label470:
    if ((i2 == 302) || (i2 == 303) || (i2 == 307))
    {
      label502:
      k = 1;
      label505:
      if (k == 0) {
        break label742;
      }
      m = 1;
      localObject2 = str3.getFirstHeader("Location");
      if (localObject2 != null) {
        break label585;
      }
      com.tencent.beacon.e.b.d("redirect code:" + i2 + " Location is null! return", new Object[0]);
    }
    for (;;)
    {
      try
      {
        if (((b)localObject1).b != null) {
          ((b)localObject1).b.abort();
        }
        return null;
        k = 0;
        break label505;
        label585:
        n = j + 1;
        i1 = 0;
        str3 = ((Header)localObject2).getValue();
        com.tencent.beacon.e.b.h("redirect code:%d , to:%s", new Object[] { Integer.valueOf(i2), str3 });
        j = n;
        k = i1;
        i = m;
        localObject2 = str3;
        try
        {
          if (((b)localObject1).b != null)
          {
            ((b)localObject1).b.abort();
            localObject2 = str3;
            i = m;
            k = i1;
            j = n;
          }
        }
        catch (Exception localException1)
        {
          j = n;
          k = i1;
          i = m;
          String str2 = str3;
          continue;
        }
        if (parame != null) {
          parame.a(l1, l4);
        }
        break;
        label689:
        if (parame != null) {
          parame.a(0L, l4);
        }
        k = m;
        break;
        label707:
        throw new Exception(str1);
      }
      catch (Exception paramString)
      {
        int n;
        int i1;
        continue;
      }
      label742:
      k = m;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\upload\f$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */