package com.android.dazhihui.ui.widget.dzhrefresh;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.AttributeSet;
import com.android.dazhihui.ui.widget.MyWebView;
import com.android.dazhihui.ui.widget.in;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.i;
import com.handmark.pulltorefresh.library.p;

public class DzhRefreshWebView
  extends PullToRefreshBase<MyWebView>
{
  private static final com.handmark.pulltorefresh.library.m<MyWebView> d = new j();
  private final in e = new k(this);
  
  public DzhRefreshWebView(Context paramContext)
  {
    super(paramContext);
    setOnRefreshListener(d);
    ((MyWebView)this.a).setWebViewProgressChangeListener(this.e);
  }
  
  public DzhRefreshWebView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setOnRefreshListener(d);
    ((MyWebView)this.a).setWebViewProgressChangeListener(this.e);
  }
  
  public DzhRefreshWebView(Context paramContext, com.handmark.pulltorefresh.library.j paramj)
  {
    super(paramContext, paramj);
    setOnRefreshListener(d);
    ((MyWebView)this.a).setWebViewProgressChangeListener(this.e);
  }
  
  public DzhRefreshWebView(Context paramContext, com.handmark.pulltorefresh.library.j paramj, i parami)
  {
    super(paramContext, paramj, parami);
    setOnRefreshListener(d);
    ((MyWebView)this.a).setWebViewProgressChangeListener(this.e);
  }
  
  protected MyWebView a(Context paramContext, AttributeSet paramAttributeSet)
  {
    if (Build.VERSION.SDK_INT >= 9) {}
    for (paramContext = new m(this, paramContext, paramAttributeSet);; paramContext = new MyWebView(paramContext, paramAttributeSet))
    {
      paramContext.setId(2131558473);
      return paramContext;
    }
  }
  
  protected com.handmark.pulltorefresh.library.a.f a(Context paramContext, com.handmark.pulltorefresh.library.j paramj, TypedArray paramTypedArray)
  {
    switch (l.a[paramj.ordinal()])
    {
    default: 
      return new f(paramContext, paramj, getPullToRefreshScrollDirection(), paramTypedArray);
    }
    return new n(paramContext, paramj, getPullToRefreshScrollDirection(), paramTypedArray);
  }
  
  protected void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    ((MyWebView)this.a).restoreState(paramBundle);
  }
  
  protected boolean a()
  {
    return ((MyWebView)this.a).getScrollY() == 0;
  }
  
  protected void b(Bundle paramBundle)
  {
    super.b(paramBundle);
    ((MyWebView)this.a).saveState(paramBundle);
  }
  
  protected boolean b()
  {
    float f = ((MyWebView)this.a).getContentHeight();
    f = (float)Math.floor(((MyWebView)this.a).getScale() * f);
    return ((MyWebView)this.a).getScrollY() >= f - ((MyWebView)this.a).getHeight();
  }
  
  public final p getPullToRefreshScrollDirection()
  {
    return p.a;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\dzhrefresh\DzhRefreshWebView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */