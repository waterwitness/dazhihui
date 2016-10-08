package com.handmark.pulltorefresh.library.extras;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import com.handmark.pulltorefresh.library.PullToRefreshWebView;
import java.util.concurrent.atomic.AtomicBoolean;

public class PullToRefreshWebView2
  extends PullToRefreshWebView
{
  private a d;
  private final AtomicBoolean e = new AtomicBoolean(false);
  private final AtomicBoolean f = new AtomicBoolean(false);
  
  public PullToRefreshWebView2(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  protected WebView a(Context paramContext, AttributeSet paramAttributeSet)
  {
    paramContext = super.a(paramContext, paramAttributeSet);
    this.d = new a(this);
    paramContext.addJavascriptInterface(this.d, "ptr");
    return paramContext;
  }
  
  protected boolean a()
  {
    ((WebView)getRefreshableView()).loadUrl("javascript:isReadyForPullDown();");
    return this.e.get();
  }
  
  protected boolean b()
  {
    ((WebView)getRefreshableView()).loadUrl("javascript:isReadyForPullUp();");
    return this.f.get();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\handmark\pulltorefresh\library\extras\PullToRefreshWebView2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */