package com.handmark.pulltorefresh.library;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.AttributeSet;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class PullToRefreshWebView
  extends PullToRefreshBase<WebView>
{
  private static final m<WebView> d = new ab();
  private final WebChromeClient e = new PullToRefreshWebView.2(this);
  
  public PullToRefreshWebView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setOnRefreshListener(d);
    ((WebView)this.a).setWebChromeClient(this.e);
  }
  
  protected WebView a(Context paramContext, AttributeSet paramAttributeSet)
  {
    if (Build.VERSION.SDK_INT >= 9) {}
    for (paramContext = new ac(this, paramContext, paramAttributeSet);; paramContext = new WebView(paramContext, paramAttributeSet))
    {
      paramContext.setId(ah.webview);
      return paramContext;
    }
  }
  
  protected void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    ((WebView)this.a).restoreState(paramBundle);
  }
  
  protected boolean a()
  {
    return ((WebView)this.a).getScrollY() == 0;
  }
  
  protected void b(Bundle paramBundle)
  {
    super.b(paramBundle);
    ((WebView)this.a).saveState(paramBundle);
  }
  
  protected boolean b()
  {
    float f = ((WebView)this.a).getContentHeight();
    f = (float)Math.floor(((WebView)this.a).getScale() * f);
    return ((WebView)this.a).getScrollY() >= f - ((WebView)this.a).getHeight();
  }
  
  public final p getPullToRefreshScrollDirection()
  {
    return p.a;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\handmark\pulltorefresh\library\PullToRefreshWebView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */