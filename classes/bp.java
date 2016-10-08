import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.android.thinkive.framework.util.NetWorkUtil;

public final class bp
  extends WebViewClient
{
  private Context a;
  
  public bp(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final void onPageFinished(WebView paramWebView, String paramString)
  {
    super.onPageFinished(paramWebView, paramString);
  }
  
  public final void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    super.onPageStarted(paramWebView, paramString, paramBitmap);
  }
  
  public final void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    String str2 = "web页面异常了：";
    String str1 = str2;
    switch (paramInt)
    {
    default: 
      str1 = str2;
    }
    for (;;)
    {
      com.android.thinkive.framework.util.Log.e(str1);
      try
      {
        if (!NetWorkUtil.isNetworkConnected(this.a)) {
          paramWebView.loadUrl("file:///android_asset/1.2.3/errorview/nowifi.html");
        }
        for (;;)
        {
          super.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
          return;
          str1 = "web页面异常了：" + "Generic error";
          break;
          str1 = "web页面异常了：" + "Failed to connect to the server";
          break;
          str1 = "web页面异常了：" + "Connection timed out";
          break;
          str1 = "web页面异常了：" + "File not found";
          break;
          str1 = "web页面异常了：" + "Server or proxy hostname lookup failed";
          break;
          str1 = "web页面异常了：" + "Failed to read or write to the server";
          break;
          paramWebView.loadUrl("file:///android_asset/1.2.3/errorview/404.html");
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          localException.printStackTrace();
        }
      }
    }
  }
  
  public final void onReceivedSslError(WebView paramWebView, SslErrorHandler paramSslErrorHandler, SslError paramSslError)
  {
    paramSslErrorHandler.proceed();
  }
  
  public final WebResourceResponse shouldInterceptRequest(WebView paramWebView, WebResourceRequest paramWebResourceRequest)
  {
    return super.shouldInterceptRequest(paramWebView, paramWebResourceRequest);
  }
  
  @SuppressLint({"NewApi"})
  public final WebResourceResponse shouldInterceptRequest(WebView paramWebView, String paramString)
  {
    for (;;)
    {
      try
      {
        if (paramString.contains("1.2.3/hSea.min.js"))
        {
          android.util.Log.e("asos1", "min.js文件中标");
          return new WebResourceResponse("text/javascript", "UTF-8", this.a.getAssets().open("1.2.3/hSea.min.js"));
        }
        if (!paramString.contains("1.2.3/plugins")) {
          break label153;
        }
        android.util.Log.e("asos1", "plugins.js文件中标");
        if (paramString.contains(".css"))
        {
          Object localObject1 = "text/css";
          String str = paramString.substring(paramString.indexOf("1.2.3/plugins"), paramString.length());
          localObject1 = new WebResourceResponse((String)localObject1, "UTF-8", this.a.getAssets().open(str));
          return (WebResourceResponse)localObject1;
        }
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        return super.shouldInterceptRequest(paramWebView, paramString);
      }
      Object localObject2;
      if (paramString.contains(".png"))
      {
        localObject2 = "image/png";
      }
      else if (paramString.contains(".gif"))
      {
        localObject2 = "image/gif";
        continue;
        label153:
        localObject2 = super.shouldInterceptRequest(paramWebView, paramString);
        return (WebResourceResponse)localObject2;
      }
      else
      {
        localObject2 = "text/javascript";
      }
    }
  }
  
  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    if (paramString.contains("javascripts:void(0)")) {
      return true;
    }
    if (paramString.startsWith("tel:"))
    {
      paramWebView = new Intent("android.intent.action.VIEW", Uri.parse(paramString));
      this.a.startActivity(paramWebView);
      return true;
    }
    try
    {
      if (paramString.contains("fxc_kh_error_back"))
      {
        ((Activity)this.a).finish();
        return true;
      }
      if (paramString.contains("fxc_kh_error_reload"))
      {
        ((Activity)this.a).finish();
        return true;
      }
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      return super.shouldOverrideUrlLoading(paramWebView, paramString);
    }
    return super.shouldOverrideUrlLoading(paramWebView, paramString);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\bp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */