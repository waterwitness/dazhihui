package com.android.dazhihui.a;

import android.os.Message;
import android.text.TextUtils;
import com.android.dazhihui.a.b.f;
import com.android.dazhihui.a.b.y;
import com.android.dazhihui.w;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy.Type;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

class t
  implements Runnable
{
  private f b;
  private int c = 2048;
  
  public t(g paramg, f paramf)
  {
    this.b = paramf;
    paramg = Message.obtain();
    paramg.what = 0;
    this.b.a(paramg, this.b.c());
  }
  
  /* Error */
  private void a()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aconst_null
    //   3: astore_1
    //   4: aload_0
    //   5: getfield 23	com/android/dazhihui/a/t:b	Lcom/android/dazhihui/a/b/f;
    //   8: checkcast 49	com/android/dazhihui/a/b/t
    //   11: astore_2
    //   12: aload_0
    //   13: getfield 23	com/android/dazhihui/a/t:b	Lcom/android/dazhihui/a/b/f;
    //   16: invokevirtual 53	com/android/dazhihui/a/b/f:o	()Ljava/lang/String;
    //   19: astore 4
    //   21: new 55	org/apache/http/client/methods/HttpPost
    //   24: dup
    //   25: aload 4
    //   27: ldc 57
    //   29: invokestatic 62	com/android/dazhihui/a/g:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   32: invokespecial 65	org/apache/http/client/methods/HttpPost:<init>	(Ljava/lang/String;)V
    //   35: astore 4
    //   37: aload_2
    //   38: invokevirtual 69	com/android/dazhihui/a/b/t:q	()Ljava/util/Map;
    //   41: invokeinterface 75 1 0
    //   46: invokeinterface 81 1 0
    //   51: astore 5
    //   53: aload 5
    //   55: invokeinterface 87 1 0
    //   60: ifeq +111 -> 171
    //   63: aload 5
    //   65: invokeinterface 91 1 0
    //   70: checkcast 93	java/util/Map$Entry
    //   73: astore 6
    //   75: aload 4
    //   77: aload 6
    //   79: invokeinterface 96 1 0
    //   84: checkcast 98	java/lang/String
    //   87: aload 6
    //   89: invokeinterface 101 1 0
    //   94: checkcast 98	java/lang/String
    //   97: invokevirtual 105	org/apache/http/client/methods/HttpPost:setHeader	(Ljava/lang/String;Ljava/lang/String;)V
    //   100: goto -47 -> 53
    //   103: astore_3
    //   104: aconst_null
    //   105: astore 4
    //   107: aload_1
    //   108: astore_2
    //   109: aload 4
    //   111: astore_1
    //   112: invokestatic 29	android/os/Message:obtain	()Landroid/os/Message;
    //   115: astore 4
    //   117: aload 4
    //   119: iconst_1
    //   120: putfield 32	android/os/Message:what	I
    //   123: aload 4
    //   125: aload_3
    //   126: putfield 109	android/os/Message:obj	Ljava/lang/Object;
    //   129: aload_0
    //   130: getfield 23	com/android/dazhihui/a/t:b	Lcom/android/dazhihui/a/b/f;
    //   133: aload 4
    //   135: invokevirtual 112	com/android/dazhihui/a/b/f:a	(Landroid/os/Message;)V
    //   138: aload_3
    //   139: invokevirtual 115	java/lang/Exception:printStackTrace	()V
    //   142: aload_2
    //   143: ifnull +14 -> 157
    //   146: aload_2
    //   147: invokeinterface 121 1 0
    //   152: invokeinterface 126 1 0
    //   157: aload_1
    //   158: ifnull +12 -> 170
    //   161: aload_1
    //   162: invokeinterface 132 1 0
    //   167: invokevirtual 137	java/io/InputStream:close	()V
    //   170: return
    //   171: aload 4
    //   173: aload_2
    //   174: invokevirtual 141	com/android/dazhihui/a/b/t:n	()Lorg/apache/http/HttpEntity;
    //   177: invokevirtual 145	org/apache/http/client/methods/HttpPost:setEntity	(Lorg/apache/http/HttpEntity;)V
    //   180: new 147	org/apache/http/params/BasicHttpParams
    //   183: dup
    //   184: invokespecial 148	org/apache/http/params/BasicHttpParams:<init>	()V
    //   187: astore_2
    //   188: aload_2
    //   189: ldc -106
    //   191: ldc 57
    //   193: invokeinterface 156 3 0
    //   198: pop
    //   199: aload_2
    //   200: sipush 7000
    //   203: invokestatic 162	org/apache/http/params/HttpConnectionParams:setConnectionTimeout	(Lorg/apache/http/params/HttpParams;I)V
    //   206: aload_2
    //   207: sipush 7000
    //   210: invokestatic 165	org/apache/http/params/HttpConnectionParams:setSoTimeout	(Lorg/apache/http/params/HttpParams;I)V
    //   213: new 167	org/apache/http/impl/client/DefaultHttpClient
    //   216: dup
    //   217: aload_2
    //   218: invokespecial 170	org/apache/http/impl/client/DefaultHttpClient:<init>	(Lorg/apache/http/params/HttpParams;)V
    //   221: astore_2
    //   222: aload_2
    //   223: aload 4
    //   225: invokeinterface 174 2 0
    //   230: astore_1
    //   231: aload_1
    //   232: invokeinterface 180 1 0
    //   237: invokeinterface 186 1 0
    //   242: pop
    //   243: aload_1
    //   244: invokeinterface 189 1 0
    //   249: astore_1
    //   250: aload_1
    //   251: ifnull +90 -> 341
    //   254: aload_1
    //   255: invokestatic 195	org/apache/http/util/EntityUtils:toByteArray	(Lorg/apache/http/HttpEntity;)[B
    //   258: astore_3
    //   259: aload_0
    //   260: getfield 16	com/android/dazhihui/a/t:a	Lcom/android/dazhihui/a/g;
    //   263: invokestatic 198	com/android/dazhihui/a/g:c	(Lcom/android/dazhihui/a/g;)Lcom/android/dazhihui/w;
    //   266: aload_3
    //   267: arraylength
    //   268: invokevirtual 204	com/android/dazhihui/w:d	(I)V
    //   271: new 206	com/android/dazhihui/a/b/g
    //   274: dup
    //   275: aload_3
    //   276: invokespecial 209	com/android/dazhihui/a/b/g:<init>	([B)V
    //   279: astore_3
    //   280: invokestatic 29	android/os/Message:obtain	()Landroid/os/Message;
    //   283: astore 4
    //   285: aload 4
    //   287: iconst_2
    //   288: putfield 32	android/os/Message:what	I
    //   291: aload 4
    //   293: aload_3
    //   294: putfield 109	android/os/Message:obj	Ljava/lang/Object;
    //   297: aload_0
    //   298: getfield 23	com/android/dazhihui/a/t:b	Lcom/android/dazhihui/a/b/f;
    //   301: aload 4
    //   303: invokevirtual 112	com/android/dazhihui/a/b/f:a	(Landroid/os/Message;)V
    //   306: aload_2
    //   307: ifnull +14 -> 321
    //   310: aload_2
    //   311: invokeinterface 121 1 0
    //   316: invokeinterface 126 1 0
    //   321: aload_1
    //   322: ifnull -152 -> 170
    //   325: aload_1
    //   326: invokeinterface 132 1 0
    //   331: invokevirtual 137	java/io/InputStream:close	()V
    //   334: return
    //   335: astore_1
    //   336: aload_1
    //   337: invokevirtual 210	java/lang/IllegalStateException:printStackTrace	()V
    //   340: return
    //   341: invokestatic 29	android/os/Message:obtain	()Landroid/os/Message;
    //   344: astore_3
    //   345: aload_3
    //   346: iconst_1
    //   347: putfield 32	android/os/Message:what	I
    //   350: aload_3
    //   351: new 43	java/lang/Exception
    //   354: dup
    //   355: ldc -44
    //   357: invokespecial 213	java/lang/Exception:<init>	(Ljava/lang/String;)V
    //   360: putfield 109	android/os/Message:obj	Ljava/lang/Object;
    //   363: aload_0
    //   364: getfield 23	com/android/dazhihui/a/t:b	Lcom/android/dazhihui/a/b/f;
    //   367: aload_3
    //   368: invokevirtual 112	com/android/dazhihui/a/b/f:a	(Landroid/os/Message;)V
    //   371: goto -65 -> 306
    //   374: astore_3
    //   375: goto -263 -> 112
    //   378: astore_1
    //   379: aload_1
    //   380: invokevirtual 214	java/io/IOException:printStackTrace	()V
    //   383: return
    //   384: astore_1
    //   385: aload_1
    //   386: invokevirtual 210	java/lang/IllegalStateException:printStackTrace	()V
    //   389: return
    //   390: astore_1
    //   391: aload_1
    //   392: invokevirtual 214	java/io/IOException:printStackTrace	()V
    //   395: return
    //   396: astore_1
    //   397: aconst_null
    //   398: astore_2
    //   399: aload_2
    //   400: ifnull +14 -> 414
    //   403: aload_2
    //   404: invokeinterface 121 1 0
    //   409: invokeinterface 126 1 0
    //   414: aload_3
    //   415: ifnull +12 -> 427
    //   418: aload_3
    //   419: invokeinterface 132 1 0
    //   424: invokevirtual 137	java/io/InputStream:close	()V
    //   427: aload_1
    //   428: athrow
    //   429: astore_2
    //   430: aload_2
    //   431: invokevirtual 210	java/lang/IllegalStateException:printStackTrace	()V
    //   434: goto -7 -> 427
    //   437: astore_2
    //   438: aload_2
    //   439: invokevirtual 214	java/io/IOException:printStackTrace	()V
    //   442: goto -15 -> 427
    //   445: astore_1
    //   446: goto -47 -> 399
    //   449: astore 4
    //   451: aload_1
    //   452: astore_3
    //   453: aload 4
    //   455: astore_1
    //   456: goto -57 -> 399
    //   459: astore 4
    //   461: aload_1
    //   462: astore_3
    //   463: aload 4
    //   465: astore_1
    //   466: goto -67 -> 399
    //   469: astore_3
    //   470: aconst_null
    //   471: astore_1
    //   472: goto -360 -> 112
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	475	0	this	t
    //   3	323	1	localObject1	Object
    //   335	2	1	localIllegalStateException1	IllegalStateException
    //   378	2	1	localIOException1	IOException
    //   384	2	1	localIllegalStateException2	IllegalStateException
    //   390	2	1	localIOException2	IOException
    //   396	32	1	localObject2	Object
    //   445	7	1	localObject3	Object
    //   455	17	1	localObject4	Object
    //   11	393	2	localObject5	Object
    //   429	2	2	localIllegalStateException3	IllegalStateException
    //   437	2	2	localIOException3	IOException
    //   1	1	3	localObject6	Object
    //   103	36	3	localException1	Exception
    //   258	110	3	localObject7	Object
    //   374	45	3	localException2	Exception
    //   452	11	3	localObject8	Object
    //   469	1	3	localException3	Exception
    //   19	283	4	localObject9	Object
    //   449	5	4	localObject10	Object
    //   459	5	4	localObject11	Object
    //   51	13	5	localIterator	Iterator
    //   73	15	6	localEntry	Map.Entry
    // Exception table:
    //   from	to	target	type
    //   21	53	103	java/lang/Exception
    //   53	100	103	java/lang/Exception
    //   171	222	103	java/lang/Exception
    //   325	334	335	java/lang/IllegalStateException
    //   254	306	374	java/lang/Exception
    //   341	371	374	java/lang/Exception
    //   325	334	378	java/io/IOException
    //   161	170	384	java/lang/IllegalStateException
    //   161	170	390	java/io/IOException
    //   21	53	396	finally
    //   53	100	396	finally
    //   171	222	396	finally
    //   418	427	429	java/lang/IllegalStateException
    //   418	427	437	java/io/IOException
    //   222	250	445	finally
    //   254	306	449	finally
    //   341	371	449	finally
    //   112	142	459	finally
    //   222	250	469	java/lang/Exception
  }
  
  private byte[] a(HttpURLConnection paramHttpURLConnection, InputStream paramInputStream)
  {
    if ((paramHttpURLConnection != null) && (paramInputStream != null)) {
      try
      {
        paramHttpURLConnection = new ByteArrayOutputStream();
        byte[] arrayOfByte = new byte[this.c];
        for (;;)
        {
          int i = paramInputStream.read(arrayOfByte, 0, this.c);
          if (i <= 0) {
            break;
          }
          paramHttpURLConnection.write(arrayOfByte, 0, i);
        }
        return null;
      }
      catch (Exception paramHttpURLConnection)
      {
        paramHttpURLConnection.printStackTrace();
      }
    }
    paramHttpURLConnection.close();
    paramHttpURLConnection = paramHttpURLConnection.toByteArray();
    return paramHttpURLConnection;
  }
  
  private void b()
  {
    Object localObject1 = this.b.o();
    Object localObject5 = this.b.p();
    URL localURL;
    String str;
    Object localObject3;
    int i;
    Object localObject2;
    for (;;)
    {
      try
      {
        localURL = new URL(g.a((String)localObject1, "UTF-8"));
        str = localURL.getProtocol();
        if (!g.b) {
          break label134;
        }
        localObject3 = System.getProperty("http.proxyHost");
        localObject1 = System.getProperty("http.proxyPort");
        if (localObject1 != null)
        {
          i = Integer.parseInt((String)localObject1);
          localObject1 = localObject3;
          if (!TextUtils.isEmpty((CharSequence)localObject1)) {
            break;
          }
          localObject1 = (HttpURLConnection)localURL.openConnection();
          if (localObject1 != null) {
            break label216;
          }
          throw new IOException("URLConnection instance is null");
        }
      }
      catch (Exception localException1)
      {
        localObject3 = Message.obtain();
        ((Message)localObject3).what = 1;
        ((Message)localObject3).obj = localException1;
        this.b.a((Message)localObject3);
        localException1.printStackTrace();
        return;
      }
      localObject2 = "-1";
      continue;
      label134:
      localObject2 = android.net.Proxy.getHost(g.u(this.a));
      i = android.net.Proxy.getPort(g.u(this.a));
    }
    int j = i;
    if (i < 0) {
      if (!str.equalsIgnoreCase("https")) {
        break label597;
      }
    }
    label216:
    label597:
    for (j = 43;; j = 80)
    {
      localObject2 = (HttpURLConnection)localURL.openConnection(new java.net.Proxy(Proxy.Type.HTTP, new InetSocketAddress((String)localObject2, j)));
      break;
      if (str.equalsIgnoreCase("https"))
      {
        localObject3 = SSLContext.getInstance("TLS");
        ((SSLContext)localObject3).init(null, new TrustManager[] { new s(null) }, null);
        ((HttpsURLConnection)localObject2).setSSLSocketFactory(((SSLContext)localObject3).getSocketFactory());
      }
      ((HttpURLConnection)localObject2).setConnectTimeout(10000);
      if (((this.b instanceof y)) && (!TextUtils.isEmpty(y.m()))) {
        ((HttpURLConnection)localObject2).setRequestProperty("Cookie", y.m());
      }
      if (localObject5 != null) {
        try
        {
          if (((Map)localObject5).size() > 0)
          {
            localObject3 = ((Map)localObject5).entrySet().iterator();
            while (((Iterator)localObject3).hasNext())
            {
              localObject5 = (Map.Entry)((Iterator)localObject3).next();
              ((HttpURLConnection)localObject2).setRequestProperty((String)((Map.Entry)localObject5).getKey(), (String)((Map.Entry)localObject5).getValue());
            }
          }
          ((HttpURLConnection)localObject2).setRequestProperty("accept", "*/*");
        }
        catch (Exception localException2)
        {
          localException2.printStackTrace();
        }
      }
      ((HttpURLConnection)localObject2).setRequestProperty("connection", "Keep-Alive");
      ((HttpURLConnection)localObject2).setRequestProperty("Content-Type", "application/octet-stream");
      Object localObject4 = (byte[])this.b.i();
      if ((localObject4 != null) && (localObject4.length > 0)) {
        ((HttpURLConnection)localObject2).setRequestProperty("Content-Length", String.valueOf(localObject4.length));
      }
      ((HttpURLConnection)localObject2).connect();
      if ((localObject4 != null) && (localObject4.length > 0))
      {
        localObject5 = ((HttpURLConnection)localObject2).getOutputStream();
        ((OutputStream)localObject5).write((byte[])localObject4);
        ((OutputStream)localObject5).flush();
        g.c(this.a).c(localObject4.length);
      }
      localObject4 = ((HttpURLConnection)localObject2).getInputStream();
      if ((this.b instanceof y))
      {
        localObject5 = ((HttpURLConnection)localObject2).getHeaderField("set-cookie");
        if ((localObject5 != null) && (((String)localObject5).length() > 0))
        {
          i = ((String)localObject5).indexOf("JSESSIONID=");
          if (i >= 0) {
            y.a(((String)localObject5).substring(i, ((String)localObject5).indexOf(";", i)));
          }
        }
      }
      localObject2 = a((HttpURLConnection)localObject2, (InputStream)localObject4);
      g.c(this.a).d(localObject2.length);
      localObject2 = new com.android.dazhihui.a.b.g((byte[])localObject2);
      localObject4 = Message.obtain();
      ((Message)localObject4).what = 2;
      ((Message)localObject4).obj = localObject2;
      this.b.a((Message)localObject4);
      return;
    }
  }
  
  public void run()
  {
    if ((this.b instanceof com.android.dazhihui.a.b.t))
    {
      a();
      return;
    }
    b();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\a\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */