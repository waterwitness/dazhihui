package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.Cache.Entry;
import com.android.volley.Network;
import com.android.volley.Request;
import com.android.volley.RetryPolicy;
import com.android.volley.ServerError;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.StatusLine;
import org.apache.http.impl.cookie.DateUtils;

public class BasicNetwork
  implements Network
{
  protected static final boolean DEBUG = VolleyLog.DEBUG;
  private static int DEFAULT_POOL_SIZE = 4096;
  private static int SLOW_REQUEST_THRESHOLD_MS = 3000;
  protected final HttpStack mHttpStack;
  protected final ByteArrayPool mPool;
  
  public BasicNetwork(HttpStack paramHttpStack)
  {
    this(paramHttpStack, new ByteArrayPool(DEFAULT_POOL_SIZE));
  }
  
  public BasicNetwork(HttpStack paramHttpStack, ByteArrayPool paramByteArrayPool)
  {
    this.mHttpStack = paramHttpStack;
    this.mPool = paramByteArrayPool;
  }
  
  private void addCacheHeaders(Map<String, String> paramMap, Cache.Entry paramEntry)
  {
    if (paramEntry == null) {}
    do
    {
      return;
      if (paramEntry.etag != null) {
        paramMap.put("If-None-Match", paramEntry.etag);
      }
    } while (paramEntry.lastModified <= 0L);
    paramMap.put("If-Modified-Since", DateUtils.formatDate(new Date(paramEntry.lastModified)));
  }
  
  private static void attemptRetryOnException(String paramString, Request<?> paramRequest, VolleyError paramVolleyError)
  {
    RetryPolicy localRetryPolicy = paramRequest.getRetryPolicy();
    int i = paramRequest.getTimeoutMs();
    try
    {
      localRetryPolicy.retry(paramVolleyError);
      paramRequest.addMarker(String.format("%s-retry [timeout=%s]", new Object[] { paramString, Integer.valueOf(i) }));
      return;
    }
    catch (VolleyError paramVolleyError)
    {
      paramRequest.addMarker(String.format("%s-timeout-giveup [timeout=%s]", new Object[] { paramString, Integer.valueOf(i) }));
      throw paramVolleyError;
    }
  }
  
  protected static Map<String, String> convertHeaders(Header[] paramArrayOfHeader)
  {
    TreeMap localTreeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    int i = 0;
    for (;;)
    {
      if (i >= paramArrayOfHeader.length) {
        return localTreeMap;
      }
      localTreeMap.put(paramArrayOfHeader[i].getName(), paramArrayOfHeader[i].getValue());
      i += 1;
    }
  }
  
  private byte[] entityToBytes(HttpEntity paramHttpEntity)
  {
    PoolingByteArrayOutputStream localPoolingByteArrayOutputStream = new PoolingByteArrayOutputStream(this.mPool, (int)paramHttpEntity.getContentLength());
    Object localObject2 = null;
    Object localObject1 = localObject2;
    Object localObject4;
    try
    {
      localObject4 = paramHttpEntity.getContent();
      if (localObject4 == null)
      {
        localObject1 = localObject2;
        throw new ServerError();
      }
    }
    finally {}
    try
    {
      paramHttpEntity.consumeContent();
      this.mPool.returnBuf((byte[])localObject1);
      localPoolingByteArrayOutputStream.close();
      throw ((Throwable)localObject3);
      localObject1 = localObject3;
      byte[] arrayOfByte = this.mPool.getBuf(1024);
      for (;;)
      {
        localObject1 = arrayOfByte;
        int i = ((InputStream)localObject4).read(arrayOfByte);
        if (i == -1)
        {
          localObject1 = arrayOfByte;
          localObject4 = localPoolingByteArrayOutputStream.toByteArray();
        }
        try
        {
          paramHttpEntity.consumeContent();
          this.mPool.returnBuf(arrayOfByte);
          localPoolingByteArrayOutputStream.close();
          return (byte[])localObject4;
          localObject1 = arrayOfByte;
          localPoolingByteArrayOutputStream.write(arrayOfByte, 0, i);
        }
        catch (IOException paramHttpEntity)
        {
          for (;;)
          {
            VolleyLog.v("Error occured when calling consumingContent", new Object[0]);
          }
        }
      }
    }
    catch (IOException paramHttpEntity)
    {
      for (;;)
      {
        VolleyLog.v("Error occured when calling consumingContent", new Object[0]);
      }
    }
  }
  
  private void logSlowRequests(long paramLong, Request<?> paramRequest, byte[] paramArrayOfByte, StatusLine paramStatusLine)
  {
    if ((DEBUG) || (paramLong > SLOW_REQUEST_THRESHOLD_MS)) {
      if (paramArrayOfByte == null) {
        break label82;
      }
    }
    label82:
    for (paramArrayOfByte = Integer.valueOf(paramArrayOfByte.length);; paramArrayOfByte = "null")
    {
      VolleyLog.d("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", new Object[] { paramRequest, Long.valueOf(paramLong), paramArrayOfByte, Integer.valueOf(paramStatusLine.getStatusCode()), Integer.valueOf(paramRequest.getRetryPolicy().getCurrentRetryCount()) });
      return;
    }
  }
  
  protected void logError(String paramString1, String paramString2, long paramLong)
  {
    VolleyLog.v("HTTP ERROR(%s) %d ms to fetch %s", new Object[] { paramString1, Long.valueOf(SystemClock.elapsedRealtime() - paramLong), paramString2 });
  }
  
  /* Error */
  public com.android.volley.NetworkResponse performRequest(Request<?> paramRequest)
  {
    // Byte code:
    //   0: invokestatic 228	android/os/SystemClock:elapsedRealtime	()J
    //   3: lstore 8
    //   5: aconst_null
    //   6: astore 6
    //   8: invokestatic 242	java/util/Collections:emptyMap	()Ljava/util/Map;
    //   11: astore 4
    //   13: new 244	java/util/HashMap
    //   16: dup
    //   17: invokespecial 245	java/util/HashMap:<init>	()V
    //   20: astore_2
    //   21: aload_0
    //   22: aload_2
    //   23: aload_1
    //   24: invokevirtual 249	com/android/volley/Request:getCacheEntry	()Lcom/android/volley/Cache$Entry;
    //   27: invokespecial 251	com/android/volley/toolbox/BasicNetwork:addCacheHeaders	(Ljava/util/Map;Lcom/android/volley/Cache$Entry;)V
    //   30: aload_0
    //   31: getfield 41	com/android/volley/toolbox/BasicNetwork:mHttpStack	Lcom/android/volley/toolbox/HttpStack;
    //   34: aload_1
    //   35: aload_2
    //   36: invokeinterface 256 3 0
    //   41: astore_3
    //   42: aload 4
    //   44: astore_2
    //   45: aload_3
    //   46: invokeinterface 262 1 0
    //   51: astore 5
    //   53: aload 4
    //   55: astore_2
    //   56: aload 5
    //   58: invokeinterface 210 1 0
    //   63: istore 7
    //   65: aload 4
    //   67: astore_2
    //   68: aload_3
    //   69: invokeinterface 266 1 0
    //   74: invokestatic 268	com/android/volley/toolbox/BasicNetwork:convertHeaders	([Lorg/apache/http/Header;)Ljava/util/Map;
    //   77: astore 6
    //   79: iload 7
    //   81: sipush 304
    //   84: if_icmpne +87 -> 171
    //   87: aload 6
    //   89: astore_2
    //   90: aload_1
    //   91: invokevirtual 249	com/android/volley/Request:getCacheEntry	()Lcom/android/volley/Cache$Entry;
    //   94: astore 4
    //   96: aload 4
    //   98: ifnonnull +27 -> 125
    //   101: aload 6
    //   103: astore_2
    //   104: new 270	com/android/volley/NetworkResponse
    //   107: dup
    //   108: sipush 304
    //   111: aconst_null
    //   112: aload 6
    //   114: iconst_1
    //   115: invokestatic 228	android/os/SystemClock:elapsedRealtime	()J
    //   118: lload 8
    //   120: lsub
    //   121: invokespecial 273	com/android/volley/NetworkResponse:<init>	(I[BLjava/util/Map;ZJ)V
    //   124: areturn
    //   125: aload 6
    //   127: astore_2
    //   128: aload 4
    //   130: getfield 277	com/android/volley/Cache$Entry:responseHeaders	Ljava/util/Map;
    //   133: aload 6
    //   135: invokeinterface 281 2 0
    //   140: aload 6
    //   142: astore_2
    //   143: new 270	com/android/volley/NetworkResponse
    //   146: dup
    //   147: sipush 304
    //   150: aload 4
    //   152: getfield 285	com/android/volley/Cache$Entry:data	[B
    //   155: aload 4
    //   157: getfield 277	com/android/volley/Cache$Entry:responseHeaders	Ljava/util/Map;
    //   160: iconst_1
    //   161: invokestatic 228	android/os/SystemClock:elapsedRealtime	()J
    //   164: lload 8
    //   166: lsub
    //   167: invokespecial 273	com/android/volley/NetworkResponse:<init>	(I[BLjava/util/Map;ZJ)V
    //   170: areturn
    //   171: aload 6
    //   173: astore_2
    //   174: aload_3
    //   175: invokeinterface 289 1 0
    //   180: ifnull +77 -> 257
    //   183: aload 6
    //   185: astore_2
    //   186: aload_0
    //   187: aload_3
    //   188: invokeinterface 289 1 0
    //   193: invokespecial 291	com/android/volley/toolbox/BasicNetwork:entityToBytes	(Lorg/apache/http/HttpEntity;)[B
    //   196: astore 4
    //   198: aload 4
    //   200: astore_2
    //   201: aload_0
    //   202: invokestatic 228	android/os/SystemClock:elapsedRealtime	()J
    //   205: lload 8
    //   207: lsub
    //   208: aload_1
    //   209: aload_2
    //   210: aload 5
    //   212: invokespecial 293	com/android/volley/toolbox/BasicNetwork:logSlowRequests	(JLcom/android/volley/Request;[BLorg/apache/http/StatusLine;)V
    //   215: iload 7
    //   217: sipush 200
    //   220: if_icmplt +11 -> 231
    //   223: iload 7
    //   225: sipush 299
    //   228: if_icmple +43 -> 271
    //   231: new 144	java/io/IOException
    //   234: dup
    //   235: invokespecial 294	java/io/IOException:<init>	()V
    //   238: athrow
    //   239: astore_2
    //   240: ldc_w 296
    //   243: aload_1
    //   244: new 298	com/android/volley/TimeoutError
    //   247: dup
    //   248: invokespecial 299	com/android/volley/TimeoutError:<init>	()V
    //   251: invokestatic 301	com/android/volley/toolbox/BasicNetwork:attemptRetryOnException	(Ljava/lang/String;Lcom/android/volley/Request;Lcom/android/volley/VolleyError;)V
    //   254: goto -249 -> 5
    //   257: aload 6
    //   259: astore_2
    //   260: iconst_0
    //   261: newarray <illegal type>
    //   263: astore 4
    //   265: aload 4
    //   267: astore_2
    //   268: goto -67 -> 201
    //   271: new 270	com/android/volley/NetworkResponse
    //   274: dup
    //   275: iload 7
    //   277: aload_2
    //   278: aload 6
    //   280: iconst_0
    //   281: invokestatic 228	android/os/SystemClock:elapsedRealtime	()J
    //   284: lload 8
    //   286: lsub
    //   287: invokespecial 273	com/android/volley/NetworkResponse:<init>	(I[BLjava/util/Map;ZJ)V
    //   290: astore 4
    //   292: aload 4
    //   294: areturn
    //   295: astore_2
    //   296: ldc_w 303
    //   299: aload_1
    //   300: new 298	com/android/volley/TimeoutError
    //   303: dup
    //   304: invokespecial 299	com/android/volley/TimeoutError:<init>	()V
    //   307: invokestatic 301	com/android/volley/toolbox/BasicNetwork:attemptRetryOnException	(Ljava/lang/String;Lcom/android/volley/Request;Lcom/android/volley/VolleyError;)V
    //   310: goto -305 -> 5
    //   313: astore_2
    //   314: new 305	java/lang/RuntimeException
    //   317: dup
    //   318: new 307	java/lang/StringBuilder
    //   321: dup
    //   322: ldc_w 309
    //   325: invokespecial 311	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   328: aload_1
    //   329: invokevirtual 314	com/android/volley/Request:getUrl	()Ljava/lang/String;
    //   332: invokevirtual 318	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   335: invokevirtual 321	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   338: aload_2
    //   339: invokespecial 324	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   342: athrow
    //   343: astore_3
    //   344: aconst_null
    //   345: astore 5
    //   347: aload 4
    //   349: astore_2
    //   350: aload 6
    //   352: astore 4
    //   354: aload 4
    //   356: ifnull +101 -> 457
    //   359: aload 4
    //   361: invokeinterface 262 1 0
    //   366: invokeinterface 210 1 0
    //   371: istore 7
    //   373: ldc_w 326
    //   376: iconst_2
    //   377: anewarray 4	java/lang/Object
    //   380: dup
    //   381: iconst_0
    //   382: iload 7
    //   384: invokestatic 106	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   387: aastore
    //   388: dup
    //   389: iconst_1
    //   390: aload_1
    //   391: invokevirtual 314	com/android/volley/Request:getUrl	()Ljava/lang/String;
    //   394: aastore
    //   395: invokestatic 329	com/android/volley/VolleyLog:e	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   398: aload 5
    //   400: ifnull +75 -> 475
    //   403: new 270	com/android/volley/NetworkResponse
    //   406: dup
    //   407: iload 7
    //   409: aload 5
    //   411: aload_2
    //   412: iconst_0
    //   413: invokestatic 228	android/os/SystemClock:elapsedRealtime	()J
    //   416: lload 8
    //   418: lsub
    //   419: invokespecial 273	com/android/volley/NetworkResponse:<init>	(I[BLjava/util/Map;ZJ)V
    //   422: astore_2
    //   423: iload 7
    //   425: sipush 401
    //   428: if_icmpeq +11 -> 439
    //   431: iload 7
    //   433: sipush 403
    //   436: if_icmpne +30 -> 466
    //   439: ldc_w 331
    //   442: aload_1
    //   443: new 333	com/android/volley/AuthFailureError
    //   446: dup
    //   447: aload_2
    //   448: invokespecial 336	com/android/volley/AuthFailureError:<init>	(Lcom/android/volley/NetworkResponse;)V
    //   451: invokestatic 301	com/android/volley/toolbox/BasicNetwork:attemptRetryOnException	(Ljava/lang/String;Lcom/android/volley/Request;Lcom/android/volley/VolleyError;)V
    //   454: goto -449 -> 5
    //   457: new 338	com/android/volley/NoConnectionError
    //   460: dup
    //   461: aload_3
    //   462: invokespecial 341	com/android/volley/NoConnectionError:<init>	(Ljava/lang/Throwable;)V
    //   465: athrow
    //   466: new 161	com/android/volley/ServerError
    //   469: dup
    //   470: aload_2
    //   471: invokespecial 342	com/android/volley/ServerError:<init>	(Lcom/android/volley/NetworkResponse;)V
    //   474: athrow
    //   475: new 344	com/android/volley/NetworkError
    //   478: dup
    //   479: aconst_null
    //   480: invokespecial 345	com/android/volley/NetworkError:<init>	(Lcom/android/volley/NetworkResponse;)V
    //   483: athrow
    //   484: astore 6
    //   486: aconst_null
    //   487: astore 5
    //   489: aload_3
    //   490: astore 4
    //   492: aload 6
    //   494: astore_3
    //   495: goto -141 -> 354
    //   498: astore 5
    //   500: aload_3
    //   501: astore 4
    //   503: aload 5
    //   505: astore_3
    //   506: aload_2
    //   507: astore 5
    //   509: aload 6
    //   511: astore_2
    //   512: goto -158 -> 354
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	515	0	this	BasicNetwork
    //   0	515	1	paramRequest	Request<?>
    //   20	190	2	localObject1	Object
    //   239	1	2	localSocketTimeoutException	java.net.SocketTimeoutException
    //   259	19	2	localObject2	Object
    //   295	1	2	localConnectTimeoutException	org.apache.http.conn.ConnectTimeoutException
    //   313	26	2	localMalformedURLException	java.net.MalformedURLException
    //   349	163	2	localObject3	Object
    //   41	147	3	localHttpResponse	org.apache.http.HttpResponse
    //   343	147	3	localIOException1	IOException
    //   494	12	3	localObject4	Object
    //   11	491	4	localObject5	Object
    //   51	437	5	localStatusLine	StatusLine
    //   498	6	5	localIOException2	IOException
    //   507	1	5	localObject6	Object
    //   6	345	6	localMap	Map
    //   484	26	6	localIOException3	IOException
    //   63	374	7	i	int
    //   3	414	8	l	long
    // Exception table:
    //   from	to	target	type
    //   13	42	239	java/net/SocketTimeoutException
    //   45	53	239	java/net/SocketTimeoutException
    //   56	65	239	java/net/SocketTimeoutException
    //   68	79	239	java/net/SocketTimeoutException
    //   90	96	239	java/net/SocketTimeoutException
    //   104	125	239	java/net/SocketTimeoutException
    //   128	140	239	java/net/SocketTimeoutException
    //   143	171	239	java/net/SocketTimeoutException
    //   174	183	239	java/net/SocketTimeoutException
    //   186	198	239	java/net/SocketTimeoutException
    //   201	215	239	java/net/SocketTimeoutException
    //   231	239	239	java/net/SocketTimeoutException
    //   260	265	239	java/net/SocketTimeoutException
    //   271	292	239	java/net/SocketTimeoutException
    //   13	42	295	org/apache/http/conn/ConnectTimeoutException
    //   45	53	295	org/apache/http/conn/ConnectTimeoutException
    //   56	65	295	org/apache/http/conn/ConnectTimeoutException
    //   68	79	295	org/apache/http/conn/ConnectTimeoutException
    //   90	96	295	org/apache/http/conn/ConnectTimeoutException
    //   104	125	295	org/apache/http/conn/ConnectTimeoutException
    //   128	140	295	org/apache/http/conn/ConnectTimeoutException
    //   143	171	295	org/apache/http/conn/ConnectTimeoutException
    //   174	183	295	org/apache/http/conn/ConnectTimeoutException
    //   186	198	295	org/apache/http/conn/ConnectTimeoutException
    //   201	215	295	org/apache/http/conn/ConnectTimeoutException
    //   231	239	295	org/apache/http/conn/ConnectTimeoutException
    //   260	265	295	org/apache/http/conn/ConnectTimeoutException
    //   271	292	295	org/apache/http/conn/ConnectTimeoutException
    //   13	42	313	java/net/MalformedURLException
    //   45	53	313	java/net/MalformedURLException
    //   56	65	313	java/net/MalformedURLException
    //   68	79	313	java/net/MalformedURLException
    //   90	96	313	java/net/MalformedURLException
    //   104	125	313	java/net/MalformedURLException
    //   128	140	313	java/net/MalformedURLException
    //   143	171	313	java/net/MalformedURLException
    //   174	183	313	java/net/MalformedURLException
    //   186	198	313	java/net/MalformedURLException
    //   201	215	313	java/net/MalformedURLException
    //   231	239	313	java/net/MalformedURLException
    //   260	265	313	java/net/MalformedURLException
    //   271	292	313	java/net/MalformedURLException
    //   13	42	343	java/io/IOException
    //   45	53	484	java/io/IOException
    //   56	65	484	java/io/IOException
    //   68	79	484	java/io/IOException
    //   90	96	484	java/io/IOException
    //   104	125	484	java/io/IOException
    //   128	140	484	java/io/IOException
    //   143	171	484	java/io/IOException
    //   174	183	484	java/io/IOException
    //   186	198	484	java/io/IOException
    //   260	265	484	java/io/IOException
    //   201	215	498	java/io/IOException
    //   231	239	498	java/io/IOException
    //   271	292	498	java/io/IOException
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\volley\toolbox\BasicNetwork.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */