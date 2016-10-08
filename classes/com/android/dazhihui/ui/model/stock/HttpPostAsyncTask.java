package com.android.dazhihui.ui.model.stock;

import android.os.AsyncTask;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.HttpURLConnection;

public class HttpPostAsyncTask
  extends AsyncTask<String, Integer, String>
{
  private BufferedReader mBuffer;
  private HttpURLConnection mHttpURLConnection;
  private ProgressMultipartEntity mMultipartEntity;
  private HttpPostAsyncTask.PostListener mPostListener;
  private long mTotalSize;
  
  public HttpPostAsyncTask(HttpPostAsyncTask.PostListener paramPostListener, ProgressMultipartEntity paramProgressMultipartEntity)
  {
    this.mPostListener = paramPostListener;
    this.mMultipartEntity = paramProgressMultipartEntity;
  }
  
  public void abort()
  {
    cancel(true);
    if (this.mMultipartEntity != null) {
      ProgressMultipartEntity.cancel();
    }
    if (this.mBuffer != null) {}
    try
    {
      this.mBuffer.close();
      if (this.mHttpURLConnection != null)
      {
        this.mHttpURLConnection.disconnect();
        this.mHttpURLConnection = null;
      }
      if (this.mMultipartEntity != null) {
        ProgressMultipartEntity.cancel();
      }
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        localIOException.printStackTrace();
      }
    }
  }
  
  /* Error */
  protected String doInBackground(String... paramVarArgs)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: getfield 24	com/android/dazhihui/ui/model/stock/HttpPostAsyncTask:mMultipartEntity	Lcom/android/dazhihui/ui/model/stock/ProgressMultipartEntity;
    //   6: ifnull +19 -> 25
    //   9: aload_0
    //   10: invokevirtual 78	com/android/dazhihui/ui/model/stock/HttpPostAsyncTask:isCancelled	()Z
    //   13: ifne +12 -> 25
    //   16: aload_1
    //   17: ifnull +8 -> 25
    //   20: aload_1
    //   21: arraylength
    //   22: ifgt +5 -> 27
    //   25: aconst_null
    //   26: areturn
    //   27: aload_0
    //   28: getfield 24	com/android/dazhihui/ui/model/stock/HttpPostAsyncTask:mMultipartEntity	Lcom/android/dazhihui/ui/model/stock/ProgressMultipartEntity;
    //   31: new 80	com/android/dazhihui/ui/model/stock/HttpPostAsyncTask$1
    //   34: dup
    //   35: aload_0
    //   36: invokespecial 83	com/android/dazhihui/ui/model/stock/HttpPostAsyncTask$1:<init>	(Lcom/android/dazhihui/ui/model/stock/HttpPostAsyncTask;)V
    //   39: invokevirtual 87	com/android/dazhihui/ui/model/stock/ProgressMultipartEntity:setListener	(Lcom/android/dazhihui/ui/model/stock/ProgressMultipartEntity$ProgressListener;)V
    //   42: aload_0
    //   43: aload_0
    //   44: getfield 24	com/android/dazhihui/ui/model/stock/HttpPostAsyncTask:mMultipartEntity	Lcom/android/dazhihui/ui/model/stock/ProgressMultipartEntity;
    //   47: invokevirtual 91	com/android/dazhihui/ui/model/stock/ProgressMultipartEntity:getContentLength	()J
    //   50: putfield 29	com/android/dazhihui/ui/model/stock/HttpPostAsyncTask:mTotalSize	J
    //   53: aload_1
    //   54: iconst_0
    //   55: aaload
    //   56: invokestatic 97	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   59: ifne -34 -> 25
    //   62: aload_0
    //   63: getfield 24	com/android/dazhihui/ui/model/stock/HttpPostAsyncTask:mMultipartEntity	Lcom/android/dazhihui/ui/model/stock/ProgressMultipartEntity;
    //   66: ifnull -41 -> 25
    //   69: new 99	java/net/URL
    //   72: dup
    //   73: aload_1
    //   74: iconst_0
    //   75: aaload
    //   76: invokespecial 102	java/net/URL:<init>	(Ljava/lang/String;)V
    //   79: invokevirtual 106	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   82: checkcast 57	java/net/HttpURLConnection
    //   85: astore_1
    //   86: aload_1
    //   87: sipush 30000
    //   90: invokevirtual 110	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   93: aload_1
    //   94: sipush 15000
    //   97: invokevirtual 113	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   100: aload_1
    //   101: ldc 115
    //   103: invokevirtual 118	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   106: aload_1
    //   107: iconst_1
    //   108: invokevirtual 122	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   111: aload_1
    //   112: iconst_1
    //   113: invokevirtual 125	java/net/HttpURLConnection:setDoInput	(Z)V
    //   116: aload_1
    //   117: iconst_0
    //   118: invokevirtual 128	java/net/HttpURLConnection:setUseCaches	(Z)V
    //   121: aload_1
    //   122: ldc -126
    //   124: ldc -124
    //   126: invokevirtual 136	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   129: aload_1
    //   130: ldc -118
    //   132: new 140	java/lang/StringBuilder
    //   135: dup
    //   136: invokespecial 141	java/lang/StringBuilder:<init>	()V
    //   139: aload_0
    //   140: getfield 24	com/android/dazhihui/ui/model/stock/HttpPostAsyncTask:mMultipartEntity	Lcom/android/dazhihui/ui/model/stock/ProgressMultipartEntity;
    //   143: invokevirtual 91	com/android/dazhihui/ui/model/stock/ProgressMultipartEntity:getContentLength	()J
    //   146: invokevirtual 145	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   149: ldc -109
    //   151: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   154: invokevirtual 154	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   157: invokevirtual 157	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   160: aload_1
    //   161: aload_0
    //   162: getfield 24	com/android/dazhihui/ui/model/stock/HttpPostAsyncTask:mMultipartEntity	Lcom/android/dazhihui/ui/model/stock/ProgressMultipartEntity;
    //   165: invokevirtual 161	com/android/dazhihui/ui/model/stock/ProgressMultipartEntity:getContentType	()Lorg/apache/http/Header;
    //   168: invokeinterface 166 1 0
    //   173: aload_0
    //   174: getfield 24	com/android/dazhihui/ui/model/stock/HttpPostAsyncTask:mMultipartEntity	Lcom/android/dazhihui/ui/model/stock/ProgressMultipartEntity;
    //   177: invokevirtual 161	com/android/dazhihui/ui/model/stock/ProgressMultipartEntity:getContentType	()Lorg/apache/http/Header;
    //   180: invokeinterface 169 1 0
    //   185: invokevirtual 157	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   188: aload_1
    //   189: invokevirtual 172	java/net/HttpURLConnection:connect	()V
    //   192: aload_1
    //   193: invokevirtual 176	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   196: astore_2
    //   197: aload_0
    //   198: getfield 24	com/android/dazhihui/ui/model/stock/HttpPostAsyncTask:mMultipartEntity	Lcom/android/dazhihui/ui/model/stock/ProgressMultipartEntity;
    //   201: aload_2
    //   202: invokevirtual 180	com/android/dazhihui/ui/model/stock/ProgressMultipartEntity:writeTo	(Ljava/io/OutputStream;)V
    //   205: aload_2
    //   206: invokevirtual 185	java/io/OutputStream:flush	()V
    //   209: aload_2
    //   210: invokevirtual 186	java/io/OutputStream:close	()V
    //   213: aload_0
    //   214: new 50	java/io/BufferedReader
    //   217: dup
    //   218: new 188	java/io/InputStreamReader
    //   221: dup
    //   222: aload_1
    //   223: invokevirtual 192	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   226: invokespecial 195	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   229: invokespecial 198	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   232: putfield 48	com/android/dazhihui/ui/model/stock/HttpPostAsyncTask:mBuffer	Ljava/io/BufferedReader;
    //   235: new 140	java/lang/StringBuilder
    //   238: dup
    //   239: invokespecial 141	java/lang/StringBuilder:<init>	()V
    //   242: astore_2
    //   243: aload_0
    //   244: getfield 48	com/android/dazhihui/ui/model/stock/HttpPostAsyncTask:mBuffer	Ljava/io/BufferedReader;
    //   247: invokevirtual 201	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   250: astore_3
    //   251: aload_3
    //   252: ifnull +52 -> 304
    //   255: aload_2
    //   256: aload_3
    //   257: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   260: ldc -53
    //   262: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   265: pop
    //   266: goto -23 -> 243
    //   269: astore_3
    //   270: aload_1
    //   271: astore_2
    //   272: aload_2
    //   273: astore_1
    //   274: aload_3
    //   275: invokevirtual 204	org/apache/http/client/ClientProtocolException:printStackTrace	()V
    //   278: aload_0
    //   279: getfield 48	com/android/dazhihui/ui/model/stock/HttpPostAsyncTask:mBuffer	Ljava/io/BufferedReader;
    //   282: ifnull +10 -> 292
    //   285: aload_0
    //   286: getfield 48	com/android/dazhihui/ui/model/stock/HttpPostAsyncTask:mBuffer	Ljava/io/BufferedReader;
    //   289: invokevirtual 53	java/io/BufferedReader:close	()V
    //   292: aload_2
    //   293: ifnull +214 -> 507
    //   296: aload_2
    //   297: invokevirtual 60	java/net/HttpURLConnection:disconnect	()V
    //   300: aconst_null
    //   301: astore_1
    //   302: aload_1
    //   303: areturn
    //   304: aload_2
    //   305: invokevirtual 154	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   308: astore_2
    //   309: aload_0
    //   310: getfield 48	com/android/dazhihui/ui/model/stock/HttpPostAsyncTask:mBuffer	Ljava/io/BufferedReader;
    //   313: ifnull +10 -> 323
    //   316: aload_0
    //   317: getfield 48	com/android/dazhihui/ui/model/stock/HttpPostAsyncTask:mBuffer	Ljava/io/BufferedReader;
    //   320: invokevirtual 53	java/io/BufferedReader:close	()V
    //   323: aload_1
    //   324: ifnull +188 -> 512
    //   327: aload_1
    //   328: invokevirtual 60	java/net/HttpURLConnection:disconnect	()V
    //   331: aload_2
    //   332: astore_1
    //   333: goto -31 -> 302
    //   336: astore_3
    //   337: aload_3
    //   338: invokevirtual 63	java/io/IOException:printStackTrace	()V
    //   341: goto -18 -> 323
    //   344: astore_1
    //   345: aload_1
    //   346: invokevirtual 63	java/io/IOException:printStackTrace	()V
    //   349: goto -57 -> 292
    //   352: astore_3
    //   353: aconst_null
    //   354: astore_2
    //   355: aload_2
    //   356: astore_1
    //   357: aload_3
    //   358: invokevirtual 63	java/io/IOException:printStackTrace	()V
    //   361: aload_0
    //   362: getfield 48	com/android/dazhihui/ui/model/stock/HttpPostAsyncTask:mBuffer	Ljava/io/BufferedReader;
    //   365: ifnull +10 -> 375
    //   368: aload_0
    //   369: getfield 48	com/android/dazhihui/ui/model/stock/HttpPostAsyncTask:mBuffer	Ljava/io/BufferedReader;
    //   372: invokevirtual 53	java/io/BufferedReader:close	()V
    //   375: aload_2
    //   376: ifnull +131 -> 507
    //   379: aload_2
    //   380: invokevirtual 60	java/net/HttpURLConnection:disconnect	()V
    //   383: aconst_null
    //   384: astore_1
    //   385: goto -83 -> 302
    //   388: astore_1
    //   389: aload_1
    //   390: invokevirtual 63	java/io/IOException:printStackTrace	()V
    //   393: goto -18 -> 375
    //   396: astore_3
    //   397: aconst_null
    //   398: astore_2
    //   399: aload_2
    //   400: astore_1
    //   401: aload_3
    //   402: invokevirtual 205	java/lang/Exception:printStackTrace	()V
    //   405: aload_0
    //   406: getfield 48	com/android/dazhihui/ui/model/stock/HttpPostAsyncTask:mBuffer	Ljava/io/BufferedReader;
    //   409: ifnull +10 -> 419
    //   412: aload_0
    //   413: getfield 48	com/android/dazhihui/ui/model/stock/HttpPostAsyncTask:mBuffer	Ljava/io/BufferedReader;
    //   416: invokevirtual 53	java/io/BufferedReader:close	()V
    //   419: aload_2
    //   420: ifnull +87 -> 507
    //   423: aload_2
    //   424: invokevirtual 60	java/net/HttpURLConnection:disconnect	()V
    //   427: aconst_null
    //   428: astore_1
    //   429: goto -127 -> 302
    //   432: astore_1
    //   433: aload_1
    //   434: invokevirtual 63	java/io/IOException:printStackTrace	()V
    //   437: goto -18 -> 419
    //   440: astore_1
    //   441: aload_0
    //   442: getfield 48	com/android/dazhihui/ui/model/stock/HttpPostAsyncTask:mBuffer	Ljava/io/BufferedReader;
    //   445: ifnull +10 -> 455
    //   448: aload_0
    //   449: getfield 48	com/android/dazhihui/ui/model/stock/HttpPostAsyncTask:mBuffer	Ljava/io/BufferedReader;
    //   452: invokevirtual 53	java/io/BufferedReader:close	()V
    //   455: aload_2
    //   456: ifnull +7 -> 463
    //   459: aload_2
    //   460: invokevirtual 60	java/net/HttpURLConnection:disconnect	()V
    //   463: aload_1
    //   464: athrow
    //   465: astore_3
    //   466: aload_3
    //   467: invokevirtual 63	java/io/IOException:printStackTrace	()V
    //   470: goto -15 -> 455
    //   473: astore_3
    //   474: aload_1
    //   475: astore_2
    //   476: aload_3
    //   477: astore_1
    //   478: goto -37 -> 441
    //   481: astore_3
    //   482: aload_1
    //   483: astore_2
    //   484: aload_3
    //   485: astore_1
    //   486: goto -45 -> 441
    //   489: astore_3
    //   490: aload_1
    //   491: astore_2
    //   492: goto -93 -> 399
    //   495: astore_3
    //   496: aload_1
    //   497: astore_2
    //   498: goto -143 -> 355
    //   501: astore_3
    //   502: aconst_null
    //   503: astore_2
    //   504: goto -232 -> 272
    //   507: aconst_null
    //   508: astore_1
    //   509: goto -207 -> 302
    //   512: aload_2
    //   513: astore_1
    //   514: goto -212 -> 302
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	517	0	this	HttpPostAsyncTask
    //   0	517	1	paramVarArgs	String[]
    //   1	512	2	localObject1	Object
    //   250	7	3	str	String
    //   269	6	3	localClientProtocolException1	org.apache.http.client.ClientProtocolException
    //   336	2	3	localIOException1	IOException
    //   352	6	3	localIOException2	IOException
    //   396	6	3	localException1	Exception
    //   465	2	3	localIOException3	IOException
    //   473	4	3	localObject2	Object
    //   481	4	3	localObject3	Object
    //   489	1	3	localException2	Exception
    //   495	1	3	localIOException4	IOException
    //   501	1	3	localClientProtocolException2	org.apache.http.client.ClientProtocolException
    // Exception table:
    //   from	to	target	type
    //   86	243	269	org/apache/http/client/ClientProtocolException
    //   243	251	269	org/apache/http/client/ClientProtocolException
    //   255	266	269	org/apache/http/client/ClientProtocolException
    //   304	309	269	org/apache/http/client/ClientProtocolException
    //   316	323	336	java/io/IOException
    //   285	292	344	java/io/IOException
    //   69	86	352	java/io/IOException
    //   368	375	388	java/io/IOException
    //   69	86	396	java/lang/Exception
    //   412	419	432	java/io/IOException
    //   69	86	440	finally
    //   448	455	465	java/io/IOException
    //   86	243	473	finally
    //   243	251	473	finally
    //   255	266	473	finally
    //   304	309	473	finally
    //   274	278	481	finally
    //   357	361	481	finally
    //   401	405	481	finally
    //   86	243	489	java/lang/Exception
    //   243	251	489	java/lang/Exception
    //   255	266	489	java/lang/Exception
    //   304	309	489	java/lang/Exception
    //   86	243	495	java/io/IOException
    //   243	251	495	java/io/IOException
    //   255	266	495	java/io/IOException
    //   304	309	495	java/io/IOException
    //   69	86	501	org/apache/http/client/ClientProtocolException
  }
  
  protected void onCancelled(String paramString)
  {
    if (this.mPostListener != null) {
      this.mPostListener.onCancelled(paramString);
    }
  }
  
  protected void onPostExecute(String paramString)
  {
    if (this.mPostListener != null) {
      this.mPostListener.onPostExecute(paramString);
    }
  }
  
  protected void onPreExecute()
  {
    if (this.mPostListener != null) {
      this.mPostListener.onPreExecute();
    }
  }
  
  protected void onProgressUpdate(Integer... paramVarArgs)
  {
    if (this.mPostListener != null) {
      this.mPostListener.onProgressUpdate(paramVarArgs[0].intValue());
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\HttpPostAsyncTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */