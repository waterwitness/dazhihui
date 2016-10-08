package com.handmark.pulltorefresh.library;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

public abstract class PullToRefreshBase<T extends View>
  extends LinearLayout
{
  public T a;
  public com.handmark.pulltorefresh.library.a.f b;
  public com.handmark.pulltorefresh.library.a.f c;
  private int d;
  private float e;
  private float f;
  private float g;
  private float h;
  private boolean i = false;
  private r j = r.a;
  private j k = j.a();
  private j l;
  private FrameLayout m;
  private boolean n = true;
  private boolean o = false;
  private boolean p = true;
  private boolean q = true;
  private boolean r = true;
  private Interpolator s;
  private i t = i.a();
  private m<T> u;
  private n<T> v;
  private l<T> w;
  private PullToRefreshBase<T>.q x;
  
  public PullToRefreshBase(Context paramContext)
  {
    super(paramContext);
    a(paramContext, null);
  }
  
  public PullToRefreshBase(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet);
  }
  
  public PullToRefreshBase(Context paramContext, j paramj)
  {
    super(paramContext);
    this.k = paramj;
    a(paramContext, null);
  }
  
  public PullToRefreshBase(Context paramContext, j paramj, i parami)
  {
    super(paramContext);
    this.k = paramj;
    this.t = parami;
    a(paramContext, null);
  }
  
  private final void a(int paramInt, long paramLong)
  {
    a(paramInt, paramLong, 0L, null);
  }
  
  private final void a(int paramInt, long paramLong1, long paramLong2, o paramo)
  {
    if (this.x != null) {
      this.x.a();
    }
    switch (h.a[getPullToRefreshScrollDirection().ordinal()])
    {
    }
    for (int i1 = getScrollY();; i1 = getScrollX())
    {
      if (i1 != paramInt)
      {
        if (this.s == null) {
          this.s = new DecelerateInterpolator();
        }
        this.x = new q(this, i1, paramInt, paramLong1, paramo);
        if (paramLong2 <= 0L) {
          break;
        }
        postDelayed(this.x, paramLong2);
      }
      return;
    }
    post(this.x);
  }
  
  private void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    TypedArray localTypedArray;
    switch (h.a[getPullToRefreshScrollDirection().ordinal()])
    {
    default: 
      setOrientation(1);
      setGravity(17);
      this.d = ViewConfiguration.get(paramContext).getScaledTouchSlop();
      localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, ak.PullToRefresh);
      if (localTypedArray.hasValue(ak.PullToRefresh_ptrMode)) {
        this.k = j.a(localTypedArray.getInteger(ak.PullToRefresh_ptrMode, 0));
      }
      if (localTypedArray.hasValue(ak.PullToRefresh_ptrAnimationStyle)) {
        this.t = i.a(localTypedArray.getInteger(ak.PullToRefresh_ptrAnimationStyle, 0));
      }
      this.a = b(paramContext, paramAttributeSet);
      a(paramContext, this.a);
      this.b = a(paramContext, j.b, localTypedArray);
      this.c = a(paramContext, j.c, localTypedArray);
      if (localTypedArray.hasValue(ak.PullToRefresh_ptrRefreshableViewBackground))
      {
        paramContext = localTypedArray.getDrawable(ak.PullToRefresh_ptrRefreshableViewBackground);
        if (paramContext != null) {
          this.a.setBackgroundDrawable(paramContext);
        }
      }
      break;
    }
    for (;;)
    {
      if (localTypedArray.hasValue(ak.PullToRefresh_ptrOverScroll)) {
        this.q = localTypedArray.getBoolean(ak.PullToRefresh_ptrOverScroll, true);
      }
      if (localTypedArray.hasValue(ak.PullToRefresh_ptrScrollingWhileRefreshingEnabled)) {
        this.o = localTypedArray.getBoolean(ak.PullToRefresh_ptrScrollingWhileRefreshingEnabled, false);
      }
      a(localTypedArray);
      localTypedArray.recycle();
      g();
      return;
      setOrientation(0);
      break;
      if (localTypedArray.hasValue(ak.PullToRefresh_ptrAdapterViewBackground))
      {
        com.handmark.pulltorefresh.library.a.i.a("ptrAdapterViewBackground", "ptrRefreshableViewBackground");
        paramContext = localTypedArray.getDrawable(ak.PullToRefresh_ptrAdapterViewBackground);
        if (paramContext != null) {
          this.a.setBackgroundDrawable(paramContext);
        }
      }
    }
  }
  
  private void a(Context paramContext, T paramT)
  {
    this.m = new FrameLayout(paramContext);
    this.m.addView(paramT, -1, -1);
    a(this.m, new LinearLayout.LayoutParams(-1, -1));
  }
  
  private LinearLayout.LayoutParams getLoadingLayoutLayoutParams()
  {
    switch (h.a[getPullToRefreshScrollDirection().ordinal()])
    {
    default: 
      return new LinearLayout.LayoutParams(-1, -2);
    }
    return new LinearLayout.LayoutParams(-2, -1);
  }
  
  private int getMaximumPullScroll()
  {
    switch (h.a[getPullToRefreshScrollDirection().ordinal()])
    {
    default: 
      return Math.round(getHeight() / 2.0F);
    }
    return Math.round(getWidth() / 2.0F);
  }
  
  private void m()
  {
    if (this.u != null) {
      this.u.a(this);
    }
    do
    {
      do
      {
        return;
      } while (this.v == null);
      if (this.l == j.b)
      {
        this.v.a(this);
        return;
      }
    } while (this.l != j.c);
    this.v.b(this);
  }
  
  private boolean n()
  {
    switch (h.c[this.k.ordinal()])
    {
    }
    do
    {
      return false;
      return a();
      return b();
    } while ((!b()) && (!a()));
    return true;
  }
  
  private void o()
  {
    float f2;
    float f1;
    int i2;
    int i1;
    switch (h.a[getPullToRefreshScrollDirection().ordinal()])
    {
    default: 
      f2 = this.h;
      f1 = this.f;
      switch (h.c[this.l.ordinal()])
      {
      default: 
        i2 = Math.round(Math.min(f2 - f1, 0.0F) / 2.0F);
        i1 = getHeaderSize();
        label87:
        setHeaderScroll(i2);
        if ((i2 != 0) && (!j()))
        {
          f1 = Math.abs(i2) / i1;
          switch (h.c[this.l.ordinal()])
          {
          default: 
            this.b.b(f1);
            label152:
            if ((this.j != r.b) && (i1 >= Math.abs(i2))) {
              a(r.b, new boolean[0]);
            }
            break;
          }
        }
        break;
      }
      break;
    }
    while ((this.j != r.b) || (i1 >= Math.abs(i2)))
    {
      return;
      f2 = this.g;
      f1 = this.e;
      break;
      i2 = Math.round(Math.max(f2 - f1, 0.0F) / 2.0F);
      i1 = getFooterSize();
      break label87;
      this.c.b(f1);
      break label152;
    }
    a(r.c, new boolean[0]);
  }
  
  protected com.handmark.pulltorefresh.library.a.f a(Context paramContext, j paramj, TypedArray paramTypedArray)
  {
    paramContext = this.t.a(paramContext, paramj, getPullToRefreshScrollDirection(), paramTypedArray);
    paramContext.setVisibility(4);
    return paramContext;
  }
  
  public final a a(boolean paramBoolean1, boolean paramBoolean2)
  {
    return b(paramBoolean1, paramBoolean2);
  }
  
  protected final void a(int paramInt1, int paramInt2)
  {
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)this.m.getLayoutParams();
    switch (h.a[getPullToRefreshScrollDirection().ordinal()])
    {
    }
    do
    {
      do
      {
        return;
      } while (localLayoutParams.width == paramInt1);
      localLayoutParams.width = paramInt1;
      this.m.requestLayout();
      return;
    } while (localLayoutParams.height == paramInt2);
    localLayoutParams.height = paramInt2;
    this.m.requestLayout();
  }
  
  protected final void a(int paramInt, o paramo)
  {
    a(paramInt, getPullToRefreshScrollDuration(), 0L, paramo);
  }
  
  protected void a(TypedArray paramTypedArray) {}
  
  protected void a(Bundle paramBundle) {}
  
  protected final void a(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.addView(paramView, paramInt, paramLayoutParams);
  }
  
  protected final void a(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.addView(paramView, -1, paramLayoutParams);
  }
  
  public final void a(r paramr, boolean... paramVarArgs)
  {
    this.j = paramr;
    Log.d("PullToRefresh", "State: " + this.j.name());
    switch (h.b[this.j.ordinal()])
    {
    }
    for (;;)
    {
      if (this.w != null) {
        this.w.a(this, this.j, this.l);
      }
      return;
      f();
      continue;
      e_();
      continue;
      e();
      continue;
      a(paramVarArgs[0]);
    }
  }
  
  public void a(CharSequence paramCharSequence, j paramj)
  {
    a(paramj.c(), paramj.d()).setReleaseLabel(paramCharSequence);
  }
  
  protected void a(boolean paramBoolean)
  {
    if (this.k.c()) {
      this.b.h();
    }
    if (this.k.d()) {
      this.c.h();
    }
    if (paramBoolean)
    {
      if (this.n)
      {
        f localf = new f(this);
        switch (h.c[this.l.ordinal()])
        {
        case 2: 
        default: 
          a(-getHeaderSize(), localf);
          return;
        }
        a(getFooterSize(), localf);
        return;
      }
      b(0);
      return;
    }
    m();
  }
  
  protected abstract boolean a();
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    Log.d("PullToRefresh", "addView: " + paramView.getClass().getSimpleName());
    View localView = getRefreshableView();
    if ((localView instanceof ViewGroup))
    {
      ((ViewGroup)localView).addView(paramView, paramInt, paramLayoutParams);
      return;
    }
    throw new UnsupportedOperationException("Refreshable View is not a ViewGroup so can't addView");
  }
  
  protected abstract T b(Context paramContext, AttributeSet paramAttributeSet);
  
  protected b b(boolean paramBoolean1, boolean paramBoolean2)
  {
    b localb = new b();
    if ((paramBoolean1) && (this.k.c())) {
      localb.a(this.b);
    }
    if ((paramBoolean2) && (this.k.d())) {
      localb.a(this.c);
    }
    return localb;
  }
  
  protected final void b(int paramInt)
  {
    a(paramInt, getPullToRefreshScrollDuration());
  }
  
  protected void b(Bundle paramBundle) {}
  
  protected abstract boolean b();
  
  public void d()
  {
    if (j()) {
      a(r.a, new boolean[0]);
    }
  }
  
  protected void e()
  {
    switch (h.c[this.l.ordinal()])
    {
    default: 
      return;
    case 1: 
      this.c.i();
      return;
    }
    this.b.i();
  }
  
  protected void e_()
  {
    switch (h.c[this.l.ordinal()])
    {
    default: 
      return;
    case 1: 
      this.c.g();
      return;
    }
    this.b.g();
  }
  
  protected void f()
  {
    this.i = false;
    this.r = true;
    this.b.j();
    this.c.j();
    b(0);
  }
  
  protected void g()
  {
    Object localObject = getLoadingLayoutLayoutParams();
    if (this == this.b.getParent()) {
      removeView(this.b);
    }
    if (this.k.c()) {
      a(this.b, 0, (ViewGroup.LayoutParams)localObject);
    }
    if (this == this.c.getParent()) {
      removeView(this.c);
    }
    if (this.k.d()) {
      a(this.c, (ViewGroup.LayoutParams)localObject);
    }
    l();
    if (this.k != j.d) {}
    for (localObject = this.k;; localObject = j.b)
    {
      this.l = ((j)localObject);
      return;
    }
  }
  
  public final j getCurrentMode()
  {
    return this.l;
  }
  
  public final boolean getFilterTouchEvents()
  {
    return this.p;
  }
  
  protected final com.handmark.pulltorefresh.library.a.f getFooterLayout()
  {
    return this.c;
  }
  
  protected final int getFooterSize()
  {
    return this.c.getContentSize();
  }
  
  public final com.handmark.pulltorefresh.library.a.f getHeaderLayout()
  {
    return this.b;
  }
  
  protected final int getHeaderSize()
  {
    return this.b.getContentSize();
  }
  
  public final a getLoadingLayoutProxy()
  {
    return a(true, true);
  }
  
  public final j getMode()
  {
    return this.k;
  }
  
  public abstract p getPullToRefreshScrollDirection();
  
  protected int getPullToRefreshScrollDuration()
  {
    return 200;
  }
  
  protected int getPullToRefreshScrollDurationLonger()
  {
    return 325;
  }
  
  public final T getRefreshableView()
  {
    return this.a;
  }
  
  protected FrameLayout getRefreshableViewWrapper()
  {
    return this.m;
  }
  
  public final boolean getShowViewWhileRefreshing()
  {
    return this.n;
  }
  
  public final r getState()
  {
    return this.j;
  }
  
  public final boolean h()
  {
    return this.k.b();
  }
  
  public final boolean i()
  {
    return (Build.VERSION.SDK_INT >= 9) && (this.q) && (c.a(this.a));
  }
  
  public final boolean j()
  {
    return (this.j == r.d) || (this.j == r.e);
  }
  
  protected final void k()
  {
    this.r = false;
  }
  
  protected final void l()
  {
    int i6 = (int)(getMaximumPullScroll() * 1.2F);
    int i2 = getPaddingLeft();
    int i5 = getPaddingTop();
    int i3 = getPaddingRight();
    int i4 = getPaddingBottom();
    int i1;
    switch (h.a[getPullToRefreshScrollDirection().ordinal()])
    {
    default: 
      i1 = i4;
      i6 = i3;
      i3 = i5;
      i4 = i2;
      i2 = i6;
    }
    for (;;)
    {
      Log.d("PullToRefresh", String.format("Setting Padding. L: %d, T: %d, R: %d, B: %d", new Object[] { Integer.valueOf(i4), Integer.valueOf(i3), Integer.valueOf(i2), Integer.valueOf(i1) }));
      setPadding(i4, i3, i2, i1);
      return;
      if (this.k.c()) {
        this.b.setWidth(i6);
      }
      for (i1 = -i6;; i1 = 0)
      {
        if (!this.k.d()) {
          break label206;
        }
        this.c.setWidth(i6);
        i2 = -i6;
        i3 = i5;
        i5 = i1;
        i1 = i4;
        i4 = i5;
        break;
      }
      label206:
      i3 = i5;
      i5 = i1;
      i1 = i4;
      i2 = 0;
      i4 = i5;
      continue;
      if (this.k.c()) {
        this.b.setHeight(i6);
      }
      for (i1 = -i6;; i1 = 0)
      {
        if (!this.k.d()) {
          break label293;
        }
        this.c.setHeight(i6);
        i6 = -i6;
        i4 = i2;
        i5 = i1;
        i1 = i6;
        i2 = i3;
        i3 = i5;
        break;
      }
      label293:
      i4 = i2;
      i5 = i1;
      i1 = 0;
      i2 = i3;
      i3 = i5;
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!h()) {
      return false;
    }
    int i1 = paramMotionEvent.getAction();
    if ((i1 == 3) || (i1 == 1))
    {
      this.i = false;
      return false;
    }
    if ((i1 != 0) && (this.i)) {
      return true;
    }
    switch (i1)
    {
    }
    for (;;)
    {
      return this.i;
      if ((!this.o) && (j())) {
        return true;
      }
      if (n())
      {
        float f3 = paramMotionEvent.getY();
        float f4 = paramMotionEvent.getX();
        float f2;
        switch (h.a[getPullToRefreshScrollDirection().ordinal()])
        {
        default: 
          f2 = f3 - this.f;
        }
        for (float f1 = f4 - this.e;; f1 = f3 - this.f)
        {
          float f5 = Math.abs(f2);
          if ((f5 <= this.d) || ((this.p) && (f5 <= Math.abs(f1)))) {
            break;
          }
          if ((!this.k.c()) || (f2 < 1.0F) || (!a())) {
            break label273;
          }
          this.f = f3;
          this.e = f4;
          this.i = true;
          if (this.k != j.d) {
            break;
          }
          this.l = j.b;
          break;
          f2 = f4 - this.e;
        }
        label273:
        if ((this.k.d()) && (f2 <= -1.0F) && (b()))
        {
          this.f = f3;
          this.e = f4;
          this.i = true;
          if (this.k == j.d)
          {
            this.l = j.c;
            continue;
            if (n())
            {
              f1 = paramMotionEvent.getY();
              this.h = f1;
              this.f = f1;
              f1 = paramMotionEvent.getX();
              this.g = f1;
              this.e = f1;
              this.i = false;
            }
          }
        }
      }
    }
  }
  
  protected final void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if ((paramParcelable instanceof Bundle))
    {
      paramParcelable = (Bundle)paramParcelable;
      setMode(j.a(paramParcelable.getInt("ptr_mode", 0)));
      this.l = j.a(paramParcelable.getInt("ptr_current_mode", 0));
      this.o = paramParcelable.getBoolean("ptr_disable_scrolling", false);
      this.n = paramParcelable.getBoolean("ptr_show_refreshing_view", true);
      super.onRestoreInstanceState(paramParcelable.getParcelable("ptr_super"));
      r localr = r.a(paramParcelable.getInt("ptr_state", 0));
      if ((localr == r.d) || (localr == r.e)) {
        a(localr, new boolean[] { true });
      }
      a(paramParcelable);
      return;
    }
    super.onRestoreInstanceState(paramParcelable);
  }
  
  protected final Parcelable onSaveInstanceState()
  {
    Bundle localBundle = new Bundle();
    b(localBundle);
    localBundle.putInt("ptr_state", this.j.a());
    localBundle.putInt("ptr_mode", this.k.e());
    localBundle.putInt("ptr_current_mode", this.l.e());
    localBundle.putBoolean("ptr_disable_scrolling", this.o);
    localBundle.putBoolean("ptr_show_refreshing_view", this.n);
    localBundle.putParcelable("ptr_super", super.onSaveInstanceState());
    return localBundle;
  }
  
  protected final void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Log.d("PullToRefresh", String.format("onSizeChanged. W: %d, H: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }));
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    a(paramInt1, paramInt2);
    post(new g(this));
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!h()) {}
    do
    {
      do
      {
        do
        {
          do
          {
            return false;
            if ((!this.o) && (j())) {
              return true;
            }
          } while ((paramMotionEvent.getAction() == 0) && (paramMotionEvent.getEdgeFlags() != 0));
          switch (paramMotionEvent.getAction())
          {
          default: 
            return false;
          }
        } while (!n());
        float f1 = paramMotionEvent.getY();
        this.h = f1;
        this.f = f1;
        f1 = paramMotionEvent.getX();
        this.g = f1;
        this.e = f1;
        return true;
      } while (!this.i);
      this.f = paramMotionEvent.getY();
      this.e = paramMotionEvent.getX();
      o();
      return true;
    } while (!this.i);
    this.i = false;
    if ((this.j == r.c) && ((this.u != null) || (this.v != null)))
    {
      a(r.d, new boolean[] { true });
      return true;
    }
    if (j())
    {
      b(0);
      return true;
    }
    a(r.a, new boolean[0]);
    return true;
  }
  
  public void setDisableScrollingWhileRefreshing(boolean paramBoolean)
  {
    if (!paramBoolean) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      setScrollingWhileRefreshingEnabled(paramBoolean);
      return;
    }
  }
  
  public final void setFilterTouchEvents(boolean paramBoolean)
  {
    this.p = paramBoolean;
  }
  
  protected final void setHeaderScroll(int paramInt)
  {
    Log.d("PullToRefresh", "setHeaderScroll: " + paramInt);
    int i1 = getMaximumPullScroll();
    paramInt = Math.min(i1, Math.max(-i1, paramInt));
    if (this.r)
    {
      if (paramInt >= 0) {
        break label97;
      }
      this.b.setVisibility(0);
    }
    for (;;)
    {
      switch (h.a[getPullToRefreshScrollDirection().ordinal()])
      {
      default: 
        return;
        label97:
        if (paramInt > 0)
        {
          this.c.setVisibility(0);
        }
        else
        {
          this.b.setVisibility(4);
          this.c.setVisibility(4);
        }
        break;
      }
    }
    scrollTo(0, paramInt);
    return;
    scrollTo(paramInt, 0);
  }
  
  public void setLastUpdatedLabel(CharSequence paramCharSequence)
  {
    getLoadingLayoutProxy().setLastUpdatedLabel(paramCharSequence);
  }
  
  public void setLoadingDrawable(Drawable paramDrawable)
  {
    getLoadingLayoutProxy().setLoadingDrawable(paramDrawable);
  }
  
  public void setLongClickable(boolean paramBoolean)
  {
    getRefreshableView().setLongClickable(paramBoolean);
  }
  
  public final void setMode(j paramj)
  {
    if (paramj != this.k)
    {
      Log.d("PullToRefresh", "Setting mode to: " + paramj);
      this.k = paramj;
      g();
    }
  }
  
  public void setOnPullEventListener(l<T> paraml)
  {
    this.w = paraml;
  }
  
  public final void setOnRefreshListener(m<T> paramm)
  {
    this.u = paramm;
    this.v = null;
  }
  
  public final void setOnRefreshListener(n<T> paramn)
  {
    this.v = paramn;
    this.u = null;
  }
  
  public void setPullLabel(CharSequence paramCharSequence)
  {
    getLoadingLayoutProxy().setPullLabel(paramCharSequence);
  }
  
  public final void setPullToRefreshEnabled(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (j localj = j.a();; localj = j.a)
    {
      setMode(localj);
      return;
    }
  }
  
  public final void setPullToRefreshOverScrollEnabled(boolean paramBoolean)
  {
    this.q = paramBoolean;
  }
  
  public final void setRefreshing(boolean paramBoolean)
  {
    if (!j()) {
      a(r.e, new boolean[] { paramBoolean });
    }
  }
  
  public void setRefreshingLabel(CharSequence paramCharSequence)
  {
    getLoadingLayoutProxy().setRefreshingLabel(paramCharSequence);
  }
  
  public void setReleaseLabel(CharSequence paramCharSequence)
  {
    a(paramCharSequence, j.d);
  }
  
  public void setScrollAnimationInterpolator(Interpolator paramInterpolator)
  {
    this.s = paramInterpolator;
  }
  
  public final void setScrollingWhileRefreshingEnabled(boolean paramBoolean)
  {
    this.o = paramBoolean;
  }
  
  public final void setShowViewWhileRefreshing(boolean paramBoolean)
  {
    this.n = paramBoolean;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\handmark\pulltorefresh\library\PullToRefreshBase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */