package com.e.a.a;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;
import java.lang.reflect.Field;
import java.net.URI;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.apache.http.HttpEntity;
import org.apache.http.HttpVersion;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.HttpEntityWrapper;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.SyncBasicHttpContext;

public class b
{
  private int a = 10;
  private int b = 30000;
  private int c = 30000;
  private final DefaultHttpClient d;
  private final HttpContext e;
  private ExecutorService f;
  private final Map<Context, List<x>> g;
  private final Map<String, String> h;
  private boolean i = true;
  
  public b()
  {
    this(false, 80, 443);
  }
  
  public b(SchemeRegistry paramSchemeRegistry)
  {
    BasicHttpParams localBasicHttpParams = new BasicHttpParams();
    ConnManagerParams.setTimeout(localBasicHttpParams, this.b);
    ConnManagerParams.setMaxConnectionsPerRoute(localBasicHttpParams, new ConnPerRouteBean(this.a));
    ConnManagerParams.setMaxTotalConnections(localBasicHttpParams, 10);
    HttpConnectionParams.setSoTimeout(localBasicHttpParams, this.c);
    HttpConnectionParams.setConnectionTimeout(localBasicHttpParams, this.b);
    HttpConnectionParams.setTcpNoDelay(localBasicHttpParams, true);
    HttpConnectionParams.setSocketBufferSize(localBasicHttpParams, 8192);
    HttpProtocolParams.setVersion(localBasicHttpParams, HttpVersion.HTTP_1_1);
    paramSchemeRegistry = new ThreadSafeClientConnManager(localBasicHttpParams, paramSchemeRegistry);
    this.f = b();
    this.g = Collections.synchronizedMap(new WeakHashMap());
    this.h = new HashMap();
    this.e = new SyncBasicHttpContext(new BasicHttpContext());
    this.d = new DefaultHttpClient(paramSchemeRegistry, localBasicHttpParams);
    this.d.addRequestInterceptor(new c(this));
    this.d.addResponseInterceptor(new d(this));
    this.d.addRequestInterceptor(new e(this), 0);
    this.d.setHttpRequestRetryHandler(new ad(5, 1500));
  }
  
  public b(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    this(a(paramBoolean, paramInt1, paramInt2));
  }
  
  public static String a(boolean paramBoolean, String paramString, z paramz)
  {
    Object localObject;
    if (paramString == null)
    {
      localObject = null;
      return (String)localObject;
    }
    if (paramBoolean) {}
    for (;;)
    {
      try
      {
        localObject = new URL(URLDecoder.decode(paramString, "UTF-8"));
        localObject = new URI(((URL)localObject).getProtocol(), ((URL)localObject).getUserInfo(), ((URL)localObject).getHost(), ((URL)localObject).getPort(), ((URL)localObject).getPath(), ((URL)localObject).getQuery(), ((URL)localObject).getRef()).toASCIIString();
        paramString = (String)localObject;
        localObject = paramString;
        if (paramz == null) {
          break;
        }
        paramz = paramz.b().trim();
        localObject = paramString;
        if (paramz.equals("")) {
          break;
        }
        localObject = paramString;
        if (paramz.equals("?")) {
          break;
        }
        localObject = new StringBuilder(String.valueOf(paramString));
        if (!paramString.contains("?")) {
          break label166;
        }
        paramString = "&";
        return ((StringBuilder)localObject).append(paramString).toString() + paramz;
      }
      catch (Exception localException)
      {
        Log.e("AsyncHttpClient", "getUrlWithQueryString encoding URL", localException);
      }
      continue;
      label166:
      paramString = "?";
    }
  }
  
  private HttpEntity a(z paramz, ac paramac)
  {
    HttpEntity localHttpEntity = null;
    if (paramz != null) {}
    try
    {
      localHttpEntity = paramz.a(paramac);
      return localHttpEntity;
    }
    catch (IOException paramz)
    {
      if (paramac != null)
      {
        paramac.sendFailureMessage(0, null, null, paramz);
        return null;
      }
      paramz.printStackTrace();
    }
    return null;
  }
  
  private HttpEntityEnclosingRequestBase a(HttpEntityEnclosingRequestBase paramHttpEntityEnclosingRequestBase, HttpEntity paramHttpEntity)
  {
    if (paramHttpEntity != null) {
      paramHttpEntityEnclosingRequestBase.setEntity(paramHttpEntity);
    }
    return paramHttpEntityEnclosingRequestBase;
  }
  
  private static SchemeRegistry a(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    if (paramBoolean) {
      Log.d("AsyncHttpClient", "Beware! Using the fix is insecure, as it doesn't verify SSL certificates.");
    }
    int j = paramInt1;
    if (paramInt1 < 1)
    {
      j = 80;
      Log.d("AsyncHttpClient", "Invalid HTTP port number specified, defaulting to 80");
    }
    paramInt1 = paramInt2;
    if (paramInt2 < 1)
    {
      paramInt1 = 443;
      Log.d("AsyncHttpClient", "Invalid HTTPS port number specified, defaulting to 443");
    }
    if (paramBoolean) {}
    for (SSLSocketFactory localSSLSocketFactory = t.b();; localSSLSocketFactory = SSLSocketFactory.getSocketFactory())
    {
      SchemeRegistry localSchemeRegistry = new SchemeRegistry();
      localSchemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), j));
      localSchemeRegistry.register(new Scheme("https", localSSLSocketFactory, paramInt1));
      return localSchemeRegistry;
    }
  }
  
  public static void a(InputStream paramInputStream)
  {
    if (paramInputStream != null) {}
    try
    {
      paramInputStream.close();
      return;
    }
    catch (IOException paramInputStream)
    {
      Log.w("AsyncHttpClient", "Cannot close input stream", paramInputStream);
    }
  }
  
  public static void a(OutputStream paramOutputStream)
  {
    if (paramOutputStream != null) {}
    try
    {
      paramOutputStream.close();
      return;
    }
    catch (IOException paramOutputStream)
    {
      Log.w("AsyncHttpClient", "Cannot close output stream", paramOutputStream);
    }
  }
  
  public static void a(HttpEntity paramHttpEntity)
  {
    if ((paramHttpEntity instanceof HttpEntityWrapper)) {
      for (;;)
      {
        int k;
        int j;
        try
        {
          arrayOfField = HttpEntityWrapper.class.getDeclaredFields();
          k = arrayOfField.length;
          j = 0;
        }
        catch (Throwable paramHttpEntity)
        {
          Field[] arrayOfField;
          boolean bool;
          Log.e("AsyncHttpClient", "wrappedEntity consume", paramHttpEntity);
          return;
        }
        if (localField == null) {
          break;
        }
        localField.setAccessible(true);
        paramHttpEntity = (HttpEntity)localField.get(paramHttpEntity);
        if (paramHttpEntity == null) {
          break;
        }
        paramHttpEntity.consumeContent();
        return;
        Field localField = arrayOfField[j];
        bool = localField.getName().equals("wrappedEntity");
        if (!bool)
        {
          j += 1;
          if (j >= k) {
            localField = null;
          }
        }
      }
    }
  }
  
  public static boolean a(PushbackInputStream paramPushbackInputStream)
  {
    if (paramPushbackInputStream == null) {}
    int j;
    int k;
    int m;
    do
    {
      return false;
      byte[] arrayOfByte = new byte[2];
      j = paramPushbackInputStream.read(arrayOfByte);
      paramPushbackInputStream.unread(arrayOfByte);
      k = arrayOfByte[0];
      m = arrayOfByte[1];
    } while ((j != 2) || (35615 != (m << 8 & 0xFF00 | k & 0xFF)));
    return true;
  }
  
  protected h a(DefaultHttpClient paramDefaultHttpClient, HttpContext paramHttpContext, HttpUriRequest paramHttpUriRequest, String paramString, ac paramac, Context paramContext)
  {
    return new h(paramDefaultHttpClient, paramHttpContext, paramHttpUriRequest, paramac);
  }
  
  public x a(Context paramContext, String paramString, z paramz, ac paramac)
  {
    return b(this.d, this.e, new HttpGet(a(this.i, paramString, paramz)), null, paramac, paramContext);
  }
  
  public x a(Context paramContext, String paramString1, HttpEntity paramHttpEntity, String paramString2, ac paramac)
  {
    return b(this.d, this.e, a(new HttpPost(URI.create(paramString1).normalize()), paramHttpEntity), paramString2, paramac, paramContext);
  }
  
  public x a(String paramString, z paramz, ac paramac)
  {
    return a(null, paramString, paramz, paramac);
  }
  
  public HttpClient a()
  {
    return this.d;
  }
  
  public void a(int paramInt)
  {
    int j = paramInt;
    if (paramInt < 1000) {
      j = 30000;
    }
    b(j);
    c(j);
  }
  
  public void a(Context paramContext, boolean paramBoolean)
  {
    if (paramContext == null)
    {
      Log.e("AsyncHttpClient", "Passed null Context to cancelRequests");
      return;
    }
    paramContext = new f(this, paramContext, paramBoolean);
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      new Thread(paramContext).start();
      return;
    }
    paramContext.run();
  }
  
  public void a(CookieStore paramCookieStore)
  {
    this.e.setAttribute("http.cookie-store", paramCookieStore);
  }
  
  public void a(SSLSocketFactory paramSSLSocketFactory)
  {
    this.d.getConnectionManager().getSchemeRegistry().register(new Scheme("https", paramSSLSocketFactory, 443));
  }
  
  public x b(Context paramContext, String paramString, z paramz, ac paramac)
  {
    return a(paramContext, paramString, a(paramz, paramac), null, paramac);
  }
  
  public x b(String paramString, z paramz, ac paramac)
  {
    return b(null, paramString, paramz, paramac);
  }
  
  protected x b(DefaultHttpClient paramDefaultHttpClient, HttpContext paramHttpContext, HttpUriRequest paramHttpUriRequest, String paramString, ac paramac, Context paramContext)
  {
    if (paramHttpUriRequest == null) {
      throw new IllegalArgumentException("HttpUriRequest must not be null");
    }
    if (paramac == null) {
      throw new IllegalArgumentException("ResponseHandler must not be null");
    }
    if (paramac.getUseSynchronousMode()) {
      throw new IllegalArgumentException("Synchronous ResponseHandler used in AsyncHttpClient. You should create your response handler in a looper thread or use SyncHttpClient instead.");
    }
    if (paramString != null)
    {
      if (((paramHttpUriRequest instanceof HttpEntityEnclosingRequestBase)) && (((HttpEntityEnclosingRequestBase)paramHttpUriRequest).getEntity() != null)) {
        Log.w("AsyncHttpClient", "Passed contentType will be ignored because HttpEntity sets content type");
      }
    }
    else
    {
      paramac.setRequestHeaders(paramHttpUriRequest.getAllHeaders());
      paramac.setRequestURI(paramHttpUriRequest.getURI());
      paramDefaultHttpClient = a(paramDefaultHttpClient, paramHttpContext, paramHttpUriRequest, paramString, paramac, paramContext);
      this.f.submit(paramDefaultHttpClient);
      paramHttpUriRequest = new x(paramDefaultHttpClient);
      if (paramContext != null)
      {
        paramHttpContext = (List)this.g.get(paramContext);
        paramString = this.g;
        paramDefaultHttpClient = paramHttpContext;
        if (paramHttpContext != null) {}
      }
    }
    for (;;)
    {
      try
      {
        paramDefaultHttpClient = Collections.synchronizedList(new LinkedList());
        this.g.put(paramContext, paramDefaultHttpClient);
        paramDefaultHttpClient.add(paramHttpUriRequest);
        paramDefaultHttpClient = paramDefaultHttpClient.iterator();
        if (paramDefaultHttpClient.hasNext()) {
          break label251;
        }
        return paramHttpUriRequest;
      }
      finally {}
      paramHttpUriRequest.setHeader("Content-Type", paramString);
      break;
      label251:
      if (((x)paramDefaultHttpClient.next()).c()) {
        paramDefaultHttpClient.remove();
      }
    }
  }
  
  protected ExecutorService b()
  {
    return Executors.newCachedThreadPool();
  }
  
  public void b(int paramInt)
  {
    int j = paramInt;
    if (paramInt < 1000) {
      j = 30000;
    }
    this.b = j;
    HttpParams localHttpParams = this.d.getParams();
    ConnManagerParams.setTimeout(localHttpParams, this.b);
    HttpConnectionParams.setConnectionTimeout(localHttpParams, this.b);
  }
  
  public void c(int paramInt)
  {
    int j = paramInt;
    if (paramInt < 1000) {
      j = 30000;
    }
    this.c = j;
    HttpConnectionParams.setSoTimeout(this.d.getParams(), this.c);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\e\a\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */