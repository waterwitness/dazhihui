package com.e.a.a;

import android.util.Log;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.UnknownHostException;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.AbstractHttpClient;
import org.apache.http.protocol.HttpContext;

public class h
  implements Runnable
{
  private final AbstractHttpClient a;
  private final HttpContext b;
  private final HttpUriRequest c;
  private final ac d;
  private int e;
  private boolean f;
  private boolean g;
  private boolean h;
  private boolean i;
  
  public h(AbstractHttpClient paramAbstractHttpClient, HttpContext paramHttpContext, HttpUriRequest paramHttpUriRequest, ac paramac)
  {
    this.a = paramAbstractHttpClient;
    this.b = paramHttpContext;
    this.c = paramHttpUriRequest;
    this.d = paramac;
  }
  
  private void c()
  {
    if (a()) {}
    HttpResponse localHttpResponse;
    do
    {
      do
      {
        do
        {
          return;
          if (this.c.getURI().getScheme() == null) {
            throw new MalformedURLException("No valid URI scheme was provided");
          }
          if ((this.d instanceof w)) {
            ((w)this.d).a(this.c);
          }
          localHttpResponse = this.a.execute(this.c, this.b);
        } while ((a()) || (this.d == null));
        this.d.onPreProcessResponse(this.d, localHttpResponse);
      } while (a());
      this.d.sendResponseMessage(localHttpResponse);
    } while (a());
    this.d.onPostProcessResponse(this.d, localHttpResponse);
  }
  
  private void d()
  {
    Object localObject = null;
    HttpRequestRetryHandler localHttpRequestRetryHandler = this.a.getHttpRequestRetryHandler();
    int k = 1;
    if (k == 0) {
      label18:
      throw ((Throwable)localObject);
    }
    label288:
    for (;;)
    {
      try
      {
        c();
        return;
      }
      catch (UnknownHostException localUnknownHostException)
      {
        IOException localIOException1 = new IOException("UnknownHostException exception: " + localUnknownHostException.getMessage());
        if (this.e > 0)
        {
          j = this.e + 1;
          this.e = j;
          if (localHttpRequestRetryHandler.retryRequest(localIOException1, j, this.b))
          {
            bool = true;
            break label288;
            localObject = localIOException1;
            k = bool;
            if (!bool) {
              break;
            }
            localObject = localIOException1;
            k = bool;
            if (this.d == null) {
              break;
            }
            this.d.sendRetryMessage(this.e);
            localObject = localIOException1;
            k = bool;
            break;
          }
        }
      }
      catch (Exception localException)
      {
        Log.e("AsyncHttpRequest", "Unhandled exception origin cause", localException);
        localObject = new IOException("Unhandled exception: " + localException.getMessage());
        break label18;
        bool = false;
      }
      catch (NullPointerException localNullPointerException)
      {
        IOException localIOException2 = new IOException("NPE in HttpClient: " + localNullPointerException.getMessage());
        j = this.e + 1;
        this.e = j;
        bool = localHttpRequestRetryHandler.retryRequest(localIOException2, j, this.b);
      }
      catch (IOException localIOException3)
      {
        int j;
        boolean bool;
        if (!a())
        {
          j = this.e + 1;
          this.e = j;
          bool = localHttpRequestRetryHandler.retryRequest(localIOException3, j, this.b);
        }
      }
    }
  }
  
  private void e()
  {
    try
    {
      if ((!this.h) && (this.f) && (!this.g))
      {
        this.g = true;
        if (this.d != null) {
          this.d.sendCancelMessage();
        }
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void a(h paramh) {}
  
  public boolean a()
  {
    if (this.f) {
      e();
    }
    return this.f;
  }
  
  public void b(h paramh) {}
  
  public boolean b()
  {
    return (a()) || (this.h);
  }
  
  public boolean cancel(boolean paramBoolean)
  {
    this.f = true;
    this.c.abort();
    return a();
  }
  
  public void run()
  {
    if (a()) {}
    for (;;)
    {
      return;
      if (!this.i)
      {
        this.i = true;
        a(this);
      }
      if (a()) {
        continue;
      }
      if (this.d != null) {
        this.d.sendStartMessage();
      }
      if (a()) {
        continue;
      }
      try
      {
        d();
        if (a()) {
          continue;
        }
        if (this.d != null) {
          this.d.sendFinishMessage();
        }
        if (a()) {
          continue;
        }
        b(this);
        this.h = true;
        return;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          if ((!a()) && (this.d != null)) {
            this.d.sendFailureMessage(0, null, null, localIOException);
          } else {
            Log.e("AsyncHttpRequest", "makeRequestWithRetries returned error, but handler is null", localIOException);
          }
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\e\a\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */