package com.android.dazhihui.ui.widget.dzhrefresh;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.Scroller;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.ui.screen.y;
import java.util.Date;

public abstract class BaseRefreshView
  extends FrameLayout
{
  private boolean A = false;
  private boolean B = false;
  private FrameLayout C;
  private boolean D = false;
  private int E;
  private int F;
  private int G;
  private VelocityTracker H = null;
  private a I;
  public int a;
  protected View b;
  Toast c;
  private Scroller d;
  private int e = -1;
  private int f = 1;
  private Date g;
  private int h;
  private int i;
  private View j;
  private AdapterView<?> k;
  private ScrollView l;
  private View m;
  private ImageView n;
  private TextView o;
  private ProgressBar p;
  private LayoutInflater q;
  private int r;
  private int s;
  private int t;
  private RotateAnimation u;
  private RotateAnimation v;
  private b w;
  private c x;
  private boolean y = true;
  private boolean z = true;
  
  public BaseRefreshView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public BaseRefreshView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    m();
  }
  
  private void e(int paramInt)
  {
    boolean bool = false;
    paramInt = (int)(paramInt * 0.8F);
    int i1 = getScrollY() - paramInt;
    paramInt = i1;
    if (i1 < 0) {
      paramInt = 0;
    }
    b(paramInt - getScrollY());
    if (this.s == 4) {}
    do
    {
      return;
      paramInt = (int)Math.round(this.b.getHeight() * 1.1D);
      paramInt = Math.max(0, Math.min(100, Math.abs(getScrollY() * 100 / paramInt)));
      if (paramInt == 100) {
        bool = true;
      }
      this.B = bool;
      if ((paramInt == 100) && (this.s != 3))
      {
        this.o.setText(2131166145);
        this.n.clearAnimation();
        this.n.startAnimation(this.v);
        this.s = 3;
        return;
      }
    } while ((paramInt >= 100) || (this.s == 2));
    this.n.clearAnimation();
    this.n.startAnimation(this.u);
    this.o.setText(2131166143);
    this.s = 2;
  }
  
  private boolean f(int paramInt)
  {
    if (((this.r != 4) && (this.s != 4)) || ((this.m == null) || (!(this.m instanceof d)) || ((!this.z) && (!this.y)))) {}
    label205:
    do
    {
      Object localObject;
      do
      {
        do
        {
          do
          {
            return false;
            if (this.k == null) {
              break label205;
            }
            if (paramInt <= 0) {
              break;
            }
            localObject = this.k.getChildAt(0);
          } while (localObject == null);
          if ((this.k.getFirstVisiblePosition() == 0) && (((View)localObject).getTop() == 0))
          {
            this.t = 1;
            return true;
          }
          int i1 = ((View)localObject).getTop();
          int i2 = this.k.getPaddingTop();
          if ((this.k.getFirstVisiblePosition() != 0) || (Math.abs(i1 - i2) > 8)) {
            break;
          }
          this.t = 1;
          return true;
          if (paramInt >= 0) {
            break;
          }
          localObject = this.k.getChildAt(this.k.getChildCount() - 1);
        } while (localObject == null);
        if ((((View)localObject).getBottom() <= this.k.getHeight()) && (this.k.getLastVisiblePosition() == this.k.getCount() - 1))
        {
          this.t = 0;
          return true;
        }
        if (this.l != null)
        {
          localObject = this.l.getChildAt(0);
          if ((paramInt > 0) && (this.l.getScrollY() == 0))
          {
            this.t = 1;
            return true;
          }
          if ((paramInt < 0) && (((View)localObject).getMeasuredHeight() <= getHeight() + this.l.getScrollY()))
          {
            this.t = 0;
            return true;
          }
        }
      } while (this.m == null);
      if ((this.m instanceof d))
      {
        localObject = (d)this.m;
        if ((getScrollY() < 0) && (paramInt < 0))
        {
          this.t = 1;
          return true;
        }
        if ((((d)localObject).isScrollTop()) && (paramInt > 0) && (((d)localObject).getHeaderHidden() < 0))
        {
          this.t = 5;
          return true;
        }
        if ((paramInt > 0) && (((d)localObject).isScrollTop()))
        {
          this.t = 1;
          return true;
        }
        if ((((d)localObject).isScrollTop()) && (paramInt < 0) && (((d)localObject).getHeaderHidden() > -((d)localObject).getHeaderHeight()))
        {
          this.t = 5;
          return true;
        }
        this.t = 5;
        return true;
      }
    } while ((paramInt <= 0) || (this.m.getScrollY() != 0) || (this.m.getTop() < 0));
    this.t = 1;
    return true;
  }
  
  private void j()
  {
    this.j = this.q.inflate(2130903385, this, false);
    this.n = ((ImageView)this.j.findViewById(2131560230));
    this.o = ((TextView)this.j.findViewById(2131560232));
    this.p = ((ProgressBar)this.j.findViewById(2131560231));
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-1, -2);
    super.addView(this.j, -1, localLayoutParams);
  }
  
  private void k()
  {
    this.b = a(this.q);
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-1, -2);
    super.addView(this.b, -1, localLayoutParams);
  }
  
  private void l()
  {
    this.s = 4;
    this.n.setVisibility(8);
    this.n.clearAnimation();
    this.n.setImageDrawable(null);
    this.p.setVisibility(0);
    this.o.setText(2131166144);
    g();
    if (this.w != null) {
      this.w.onFooterLoad(this, this.f + 1, this.e);
    }
  }
  
  private void m()
  {
    this.u = new RotateAnimation(0.0F, -180.0F, 1, 0.5F, 1, 0.5F);
    this.u.setInterpolator(new LinearInterpolator());
    this.u.setDuration(250L);
    this.u.setFillAfter(true);
    this.v = new RotateAnimation(-180.0F, 0.0F, 1, 0.5F, 1, 0.5F);
    this.v.setInterpolator(new LinearInterpolator());
    this.v.setDuration(250L);
    this.v.setFillAfter(true);
    this.q = LayoutInflater.from(getContext());
    k();
    j();
    this.C = new FrameLayout(getContext());
    Object localObject = new FrameLayout.LayoutParams(-1, -1);
    super.addView(this.C, -1, (ViewGroup.LayoutParams)localObject);
    localObject = ViewConfiguration.get(getContext());
    this.E = ((ViewConfiguration)localObject).getScaledTouchSlop();
    this.d = new Scroller(getContext());
    this.F = ((ViewConfiguration)localObject).getScaledMaximumFlingVelocity();
    this.G = ((ViewConfiguration)localObject).getScaledMinimumFlingVelocity();
  }
  
  private void n()
  {
    View localView = ((ViewGroup)getChildAt(2)).getChildAt(0);
    if (localView == null) {
      return;
    }
    if ((localView instanceof AdapterView))
    {
      this.k = ((AdapterView)localView);
      this.k.setOverScrollMode(2);
      this.k.setHorizontalFadingEdgeEnabled(false);
      this.k.setVerticalFadingEdgeEnabled(false);
    }
    for (;;)
    {
      this.g = new Date();
      return;
      if ((localView instanceof ScrollView))
      {
        this.l = ((ScrollView)localView);
        this.l.setOverScrollMode(2);
        this.l.setHorizontalFadingEdgeEnabled(false);
        this.l.setVerticalFadingEdgeEnabled(false);
      }
      else
      {
        this.m = localView;
      }
    }
  }
  
  public int a(int paramInt, boolean paramBoolean)
  {
    if ((!paramBoolean) && (this.D))
    {
      if (this.c != null) {
        this.c.cancel();
      }
      this.c = Toast.makeText(getContext(), "没有数据可加载了", 0);
      this.c.show();
    }
    if ((!this.z) || (this.D)) {
      return 0;
    }
    if (paramBoolean) {
      if (this.B) {
        l();
      }
    }
    for (;;)
    {
      return getScrollY();
      e();
      continue;
      e(paramInt);
    }
  }
  
  protected abstract View a(LayoutInflater paramLayoutInflater);
  
  protected void a()
  {
    this.r = 4;
    i();
    c();
    if (this.x != null) {
      this.x.onHeaderRefresh(this);
    }
  }
  
  protected void a(int paramInt)
  {
    int i2 = (int)(paramInt * 0.8F);
    int i1 = getScrollY() - i2;
    paramInt = i1;
    if (i1 > 0) {
      paramInt = 0;
    }
    b(paramInt - getScrollY());
    i1 = Math.abs(getScrollY() * 100 / this.a);
    paramInt = i1;
    if (i1 < 0) {
      paramInt = 0;
    }
    if (paramInt > 100) {
      paramInt = 100;
    }
    for (;;)
    {
      if (paramInt == 100) {}
      for (boolean bool = true;; bool = false)
      {
        this.A = bool;
        if ((paramInt != 100) || (this.r == 3)) {
          break;
        }
        a(i2, paramInt, 2);
        this.r = 3;
        return;
      }
      if ((paramInt < 100) && (this.r != 2))
      {
        a(i2, paramInt, 1);
        this.r = 2;
        return;
      }
      a(i2, paramInt, 0);
      return;
    }
  }
  
  protected abstract void a(int paramInt1, int paramInt2, int paramInt3);
  
  public void a(y paramy) {}
  
  public void a(boolean paramBoolean)
  {
    a(paramBoolean, 3);
  }
  
  public void a(boolean paramBoolean, int paramInt)
  {
    this.D = false;
    this.t = 5;
    b(paramBoolean, paramInt);
  }
  
  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.z = paramBoolean2;
    this.y = paramBoolean1;
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    this.C.addView(paramView, -1, paramLayoutParams);
  }
  
  public void b()
  {
    e();
    this.n.setVisibility(0);
    this.n.setImageResource(2130838089);
    this.o.setText(2131166143);
    this.p.setVisibility(8);
    this.f += 1;
    if (this.f == this.e) {
      this.D = true;
    }
    this.s = 2;
  }
  
  public void b(int paramInt)
  {
    scrollBy(0, paramInt);
    c(getScrollY());
    invalidate();
  }
  
  protected void b(boolean paramBoolean)
  {
    h();
    e();
    if (paramBoolean) {
      this.g = new Date();
    }
    this.f = 1;
    this.r = 2;
  }
  
  protected abstract void b(boolean paramBoolean, int paramInt);
  
  public void c()
  {
    f();
  }
  
  public void c(int paramInt)
  {
    this.a = ((int)Math.round(this.b.getHeight() * 1.1D));
  }
  
  public void computeScroll()
  {
    if (this.d.computeScrollOffset())
    {
      scrollTo(this.d.getCurrX(), this.d.getCurrY());
      c(getScrollY());
      invalidate();
    }
  }
  
  public void d()
  {
    e();
  }
  
  public void d(int paramInt)
  {
    if (!this.d.isFinished()) {
      this.d.abortAnimation();
    }
    paramInt -= getScrollY();
    this.d.startScroll(getScrollX(), getScrollY(), 0, paramInt, Math.abs(paramInt) * 2);
    invalidate();
  }
  
  public void e()
  {
    d(0);
  }
  
  public void f()
  {
    d(-this.b.getHeight());
  }
  
  public void g()
  {
    d(this.j.getHeight());
  }
  
  protected abstract void h();
  
  protected abstract void i();
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    n();
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i2 = (int)paramMotionEvent.getRawY();
    int i1 = (int)paramMotionEvent.getRawX();
    switch (paramMotionEvent.getAction())
    {
    }
    int i3;
    do
    {
      for (;;)
      {
        return false;
        this.h = i2;
        this.i = i1;
      }
      i2 -= this.h;
      i3 = this.i;
    } while ((Math.abs(i2) <= this.E) || (Math.abs(i2) <= Math.abs(i1 - i3)) || (!f(i2)));
    return true;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.b.layout(0, -this.b.getMeasuredHeight(), this.b.getMeasuredWidth(), 0);
    this.j.layout(0, getMeasuredHeight(), this.j.getMeasuredWidth(), getMeasuredHeight() + this.j.getMeasuredHeight());
    this.C.layout(0, 0, this.C.getMeasuredWidth(), this.C.getMeasuredHeight());
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = 0;
    if (this.I != null) {
      this.I.a();
    }
    if (this.H == null) {
      this.H = VelocityTracker.obtain();
    }
    this.H.addMovement(paramMotionEvent);
    int i3 = (int)paramMotionEvent.getRawY();
    int i2 = (int)paramMotionEvent.getRawX();
    int i4;
    label191:
    label230:
    Object localObject;
    switch (paramMotionEvent.getAction())
    {
    default: 
    case 0: 
      for (;;)
      {
        return super.onTouchEvent(paramMotionEvent);
        this.h = i3;
      }
    case 2: 
      i4 = i3 - this.h;
      if ((this.y) && (this.t == 1))
      {
        a(i4);
        if ((this.m != null) && ((this.m instanceof d)))
        {
          if ((i4 < 0) && (getScrollY() == this.b.getHeight())) {
            this.t = 5;
          }
          if ((i4 < 0) && (getScrollY() == 0)) {
            this.t = 5;
          }
        }
      }
      do
      {
        for (;;)
        {
          this.h = i3;
          break;
          if ((!this.z) || (this.D) || (this.t != 0)) {
            break label230;
          }
          e(i4);
        }
      } while ((this.m == null) || (!(this.m instanceof d)));
      localObject = (d)this.m;
      if (((i4 > 0) && (((d)localObject).isScrollTop()) && (((d)localObject).getHeaderHidden() == -((d)localObject).getHeaderHeight())) || (((d)localObject).getHeaderHidden() != -((d)localObject).getHeaderHeight()))
      {
        i2 = ((d)localObject).getHeaderHidden() + i4;
        if (i2 <= 0) {
          break label716;
        }
      }
      break;
    }
    for (;;)
    {
      i2 = i1;
      if (i1 < -((d)localObject).getHeaderHeight()) {
        i2 = -((d)localObject).getHeaderHeight();
      }
      ((d)localObject).moveHeader(i2 - ((d)localObject).getHeaderHidden());
      for (;;)
      {
        if ((i4 <= 0) || (!((d)localObject).isScrollTop()) || (((d)localObject).getHeaderHidden() != 0)) {
          break label431;
        }
        this.t = 1;
        break;
        if (((d)localObject).isScrollBottom())
        {
          if (((d)localObject).upToLoad(i4, false) == 0) {
            ((d)localObject).moveContent(-i4);
          }
        }
        else {
          ((d)localObject).moveContent(-i4);
        }
      }
      label431:
      this.t = 5;
      break label191;
      localObject = this.H;
      ((VelocityTracker)localObject).computeCurrentVelocity(1000, this.F);
      i1 = (int)((VelocityTracker)localObject).getYVelocity();
      if ((this.y) && (this.t == 1)) {
        if (this.A)
        {
          a();
          this.A = false;
        }
      }
      for (;;)
      {
        if (this.H == null) {
          break label714;
        }
        this.H.recycle();
        this.H = null;
        break;
        d();
        this.t = 5;
        continue;
        if ((this.z) && (!this.D) && (this.t == 0))
        {
          if (this.B)
          {
            l();
            this.B = false;
          }
          else
          {
            e();
            this.t = 5;
          }
        }
        else if ((this.D) && (this.z) && (this.t == 0))
        {
          Toast.makeText(getContext(), "没有数据可加载了", 0).show();
        }
        else if ((this.m != null) && ((this.m instanceof d)))
        {
          localObject = (d)this.m;
          if (Math.abs(i1) > this.G)
          {
            if (this.I == null)
            {
              this.I = new a(getContext(), (d)localObject);
              this.C.addView(this.I);
            }
            this.I.a(i1);
          }
          if (((d)localObject).isScrollBottom()) {
            ((d)localObject).upToLoad(0, true);
          }
        }
      }
      label714:
      break;
      label716:
      i1 = i2;
    }
  }
  
  public void setLastPage(boolean paramBoolean)
  {
    this.D = paramBoolean;
  }
  
  public void setOnFooterLoadListener(b paramb)
  {
    this.w = paramb;
  }
  
  public void setOnHeaderRefreshListener(c paramc)
  {
    this.x = paramc;
  }
  
  public void setShowLoadMore(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.j.setVisibility(0);
      return;
    }
    this.j.setVisibility(4);
  }
  
  public void setTotalPage(int paramInt)
  {
    this.e = paramInt;
    if (this.f == paramInt) {
      this.D = true;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\dzhrefresh\BaseRefreshView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */