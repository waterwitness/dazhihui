package com.android.dazhihui.ui.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;

public class AppendList
  extends FrameLayout
  implements GestureDetector.OnGestureListener, Animation.AnimationListener, AbsListView.OnScrollListener
{
  private Animation A;
  private Animation B;
  private Animation C;
  private View D;
  private View E;
  private int F = 0;
  private int G = 0;
  private Drawable a;
  private View b;
  private View c;
  private ListView d;
  private Context e;
  private final int f = 2500;
  private int g;
  private int h;
  private boolean i = true;
  private int j;
  private int k;
  private int l;
  private int m;
  private int n;
  private int o;
  private int p;
  private int q;
  private int r;
  private g s;
  private GestureDetector t;
  private VelocityTracker u;
  private c v;
  private d w;
  private e x;
  private f y;
  private Animation z;
  
  public AppendList(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public AppendList(Context paramContext, int paramInt1, int paramInt2)
  {
    super(paramContext, null);
    this.e = paramContext;
    a();
    this.n = paramInt1;
    this.o = paramInt2;
    b();
  }
  
  public AppendList(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.e = paramContext;
    a();
    paramContext.obtainStyledAttributes(paramAttributeSet, com.android.dazhihui.f.List).recycle();
    b();
  }
  
  private void a()
  {
    this.n = 2130903162;
    this.o = 2130903161;
    this.t = new GestureDetector(this);
    this.g = 1000;
    this.m = 0;
    this.i = true;
    this.h = 0;
    this.v = new c(this);
    this.w = new d(this);
  }
  
  private void a(int paramInt)
  {
    int i2;
    if (paramInt == 1)
    {
      i2 = this.d.getTop();
      if (this.b == null) {
        break label914;
      }
    }
    label686:
    label914:
    for (paramInt = this.b.getTop();; paramInt = 0)
    {
      if (this.c != null) {}
      for (int i1 = this.c.getBottom();; i1 = 0)
      {
        int i3 = this.d.getBottom();
        switch (this.g)
        {
        default: 
          if (this.u != null)
          {
            this.u.recycle();
            this.u = null;
          }
          break;
        }
        for (;;)
        {
          invalidate();
          return;
          if (this.b == null) {
            break;
          }
          this.b.offsetTopAndBottom(-paramInt);
          this.d.offsetTopAndBottom(-i2 + this.k);
          this.m = (-this.k);
          this.g = 1001;
          if ((this.s != null) && (this.b != null)) {
            this.s.a(this, 2100);
          }
          if (this.D == null) {
            break;
          }
          this.D.setVisibility(4);
          this.D.clearAnimation();
          break;
          if (this.b == null) {
            break;
          }
          this.b.offsetTopAndBottom(-paramInt - this.k);
          this.d.offsetTopAndBottom(-i2);
          this.g = 1000;
          this.m = 0;
          c();
          break;
          if (this.c == null) {
            break;
          }
          this.c.offsetTopAndBottom(this.j - i1);
          this.d.offsetTopAndBottom(this.j - i3 - this.l);
          this.g = 1001;
          this.m = this.l;
          if (this.s != null) {
            this.s.a(this, 2200);
          }
          if (this.E == null) {
            break;
          }
          this.E.setVisibility(4);
          this.E.clearAnimation();
          break;
          if (this.c == null) {
            break;
          }
          this.c.offsetTopAndBottom(this.j - i1 + this.l);
          this.d.offsetTopAndBottom(this.j - i3);
          this.g = 1000;
          this.m = 0;
          c();
          break;
          if (paramInt != 3)
          {
            VelocityTracker localVelocityTracker = this.u;
            localVelocityTracker.computeCurrentVelocity(1000, 10000.0F);
            paramInt = (int)localVelocityTracker.getYVelocity();
            if ((paramInt > 63536) && (paramInt < 2500))
            {
              this.d.offsetTopAndBottom(-this.m - this.d.getTop());
              if ((this.g == 2001) || (this.g == 2002)) {
                if (this.b != null)
                {
                  this.b.setVisibility(0);
                  this.b.offsetTopAndBottom(-this.k - this.m - this.b.getTop());
                }
              }
              for (;;)
              {
                if ((-this.m < this.k) || (this.b == null)) {
                  break label686;
                }
                this.i = false;
                if (this.g != 2001) {
                  break;
                }
                this.g = 2002;
                if (this.D != null) {
                  this.D.startAnimation(this.z);
                }
                if (this.s == null) {
                  break;
                }
                this.s.a(this, this.b, 2100);
                break;
                if (((this.g == 2003) || (this.g == 2004)) && (this.c != null))
                {
                  this.c.setVisibility(0);
                  this.c.offsetTopAndBottom(-this.m - this.c.getTop() + this.j);
                }
              }
              if ((this.m >= this.l) && (this.c != null))
              {
                this.i = false;
                if (this.g == 2003)
                {
                  this.g = 2004;
                  if (this.E != null) {
                    this.E.startAnimation(this.B);
                  }
                  if (this.s != null) {
                    this.s.a(this, this.c, 2200);
                  }
                }
              }
              else if ((this.g == 2002) && (this.b != null))
              {
                this.g = 2001;
                if (this.s != null) {
                  this.s.b(this, this.b, 2100);
                }
                if (this.D != null) {
                  this.D.startAnimation(this.A);
                }
              }
              else if ((this.g == 2004) && (this.c != null))
              {
                this.g = 2003;
                if (this.s != null) {
                  this.s.b(this, this.c, 2200);
                }
                if (this.E != null) {
                  this.E.startAnimation(this.C);
                }
              }
            }
          }
        }
      }
    }
  }
  
  private void b()
  {
    for (;;)
    {
      try
      {
        if (this.n != 0)
        {
          this.b = LayoutInflater.from(this.e).inflate(this.n, null);
          addView(this.b);
          b(this.b);
          this.k = this.b.getMeasuredHeight();
          this.d = new ListView(this.e);
          this.d.setDivider(getResources().getDrawable(2130838349));
          addView(this.d);
          this.d.setSelector(2131493660);
          this.a = this.d.getSelector();
          this.d.setCacheColorHint(0);
          if (this.o != 0)
          {
            this.c = LayoutInflater.from(this.e).inflate(this.o, null);
            addView(this.c);
            b(this.c);
            this.l = this.c.getMeasuredHeight();
            this.d.setOnScrollListener(this);
            this.d.setOnItemClickListener(this.v);
            this.d.setOnItemLongClickListener(this.w);
          }
        }
        else
        {
          this.b = null;
          continue;
        }
        this.c = null;
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        return;
      }
    }
  }
  
  private void b(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (this.s != null)
    {
      if ((paramInt1 == 2100) && (this.b != null)) {
        this.s.c(this, this.b, paramInt1);
      }
    }
    else
    {
      this.i = true;
      invalidate();
      c();
      this.m = 0;
      if (this.b != null) {
        this.b.offsetTopAndBottom(-this.k);
      }
      if (this.c != null) {
        this.c.offsetTopAndBottom(this.j + this.l);
      }
      this.d.offsetTopAndBottom(-this.d.getTop());
      if (paramBoolean)
      {
        if (paramInt2 != 3000) {
          break label275;
        }
        if (paramInt1 != 2100) {
          break label207;
        }
        this.d.setSelection(0);
      }
    }
    for (;;)
    {
      if (this.d.getAdapter() != null) {
        this.h = this.d.getAdapter().getCount();
      }
      this.g = 1000;
      this.d.setSelector(this.a);
      return;
      if (this.c == null) {
        break;
      }
      this.s.c(this, this.c, paramInt1);
      break;
      label207:
      if (this.d.getAdapter() != null)
      {
        paramInt1 = getLastItemHeight();
        if (this.d.getAdapter().getCount() > this.h)
        {
          this.d.setSelectionFromTop(this.h, this.j - paramInt1);
        }
        else
        {
          this.d.setSelection(this.h);
          continue;
          label275:
          this.d.setSelection(0);
        }
      }
    }
  }
  
  private void b(View paramView)
  {
    ViewGroup.LayoutParams localLayoutParams2 = paramView.getLayoutParams();
    ViewGroup.LayoutParams localLayoutParams1 = localLayoutParams2;
    if (localLayoutParams2 == null) {
      localLayoutParams1 = new ViewGroup.LayoutParams(-1, -2);
    }
    int i2 = ViewGroup.getChildMeasureSpec(0, 0, localLayoutParams1.width);
    int i1 = localLayoutParams1.height;
    if (i1 > 0) {}
    for (i1 = View.MeasureSpec.makeMeasureSpec(i1, 1073741824);; i1 = View.MeasureSpec.makeMeasureSpec(0, 0))
    {
      paramView.measure(i2, i1);
      return;
    }
  }
  
  private void c()
  {
    if (this.D != null)
    {
      this.D.clearAnimation();
      this.D.setVisibility(0);
    }
    if (this.E != null)
    {
      this.E.clearAnimation();
      this.E.setVisibility(0);
    }
  }
  
  private int getLastItemHeight()
  {
    int i2 = 0;
    Object localObject = this.d.getAdapter();
    int i1 = i2;
    if (localObject != null)
    {
      i1 = i2;
      if (((ListAdapter)localObject).getCount() > 1)
      {
        localObject = this.d.getChildAt(1);
        if (localObject == null) {
          break label61;
        }
        b((View)localObject);
        i1 = ((View)localObject).getMeasuredHeight() + this.d.getDividerHeight();
      }
    }
    label61:
    do
    {
      return i1;
      i1 = i2;
    } while (this.c == null);
    return this.l;
  }
  
  public void a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    ((Activity)this.e).runOnUiThread(new b(this, paramInt1, paramInt2, paramBoolean));
  }
  
  public void a(View paramView)
  {
    if (this.d != null) {
      this.d.addHeaderView(paramView);
    }
  }
  
  public void a(Animation paramAnimation1, Animation paramAnimation2, int paramInt)
  {
    this.z = paramAnimation1;
    this.A = paramAnimation2;
    this.D = findViewById(paramInt);
    if (this.z != null) {
      this.z.setAnimationListener(this);
    }
    if (this.A != null) {
      this.A.setAnimationListener(this);
    }
  }
  
  public void b(Animation paramAnimation1, Animation paramAnimation2, int paramInt)
  {
    this.B = paramAnimation1;
    this.C = paramAnimation2;
    this.E = findViewById(paramInt);
    if (this.B != null) {
      this.B.setAnimationListener(this);
    }
    if (this.C != null) {
      this.C.setAnimationListener(this);
    }
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getAction() == 0)
    {
      if (this.d.getAdapter() != null) {
        this.h = this.d.getAdapter().getCount();
      }
      this.i = true;
      if (this.g != 1000) {
        break label84;
      }
      if (this.s != null) {
        this.s.a(this.b, this.c);
      }
    }
    if (this.g == 1001) {}
    label84:
    do
    {
      return true;
      if (this.g != 1001) {
        break;
      }
      b(2100, 3001, true);
      break;
      if (this.g == 1000)
      {
        if (paramMotionEvent.getAction() == 2) {
          this.d.setSelector(new ColorDrawable(0));
        }
        for (;;)
        {
          if (this.D != null) {
            this.D.clearAnimation();
          }
          if (this.E != null) {
            this.E.clearAnimation();
          }
          if (this.u == null) {
            this.u = VelocityTracker.obtain();
          }
          this.u.addMovement(paramMotionEvent);
          this.t.onTouchEvent(paramMotionEvent);
          a(paramMotionEvent.getAction());
          return super.dispatchTouchEvent(paramMotionEvent);
          this.d.setSelector(this.a);
        }
      }
      this.d.setSelector(new BitmapDrawable());
      if (this.u == null) {
        this.u = VelocityTracker.obtain();
      }
      this.u.addMovement(paramMotionEvent);
      this.t.onTouchEvent(paramMotionEvent);
      a(paramMotionEvent.getAction());
    } while (paramMotionEvent.getAction() != 1);
    return true;
  }
  
  public ListAdapter getAdapter()
  {
    ListAdapter localListAdapter = null;
    try
    {
      if (this.d != null) {
        localListAdapter = this.d.getAdapter();
      }
      return localListAdapter;
    }
    catch (Exception localException) {}
    return null;
  }
  
  public int getBottomViewsCount()
  {
    if (this.d != null) {
      return this.d.getFooterViewsCount();
    }
    return 0;
  }
  
  public int getHeaderViewsCount()
  {
    if (this.d != null) {
      return this.d.getHeaderViewsCount();
    }
    return 0;
  }
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    switch (this.g)
    {
    }
    do
    {
      do
      {
        do
        {
          do
          {
            return;
          } while (this.s == null);
          this.s.b(this.D, 4000);
          return;
        } while (this.s == null);
        this.s.b(this.E, 4000);
        return;
      } while (this.s == null);
      this.s.b(this.D, 4001);
      return;
    } while (this.s == null);
    this.s.b(this.E, 4001);
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation) {}
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
  }
  
  public boolean onDown(MotionEvent paramMotionEvent)
  {
    return false;
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
  }
  
  public boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    return false;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    try
    {
      this.j = (paramInt4 - paramInt2);
      if (this.b != null) {
        this.b.layout(0, -this.k - this.m, getWidth(), -this.m);
      }
      this.d.layout(0, -this.m, getWidth(), -this.m + this.j);
      if (this.c != null) {
        this.c.layout(0, -this.m + this.j, getWidth(), -this.m + this.j + this.l);
      }
      return;
    }
    catch (Exception localException) {}
  }
  
  public void onLongPress(MotionEvent paramMotionEvent) {}
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    this.p = paramInt3;
    this.q = paramInt1;
    this.r = paramInt2;
  }
  
  public boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    if (this.d == null) {}
    do
    {
      do
      {
        do
        {
          do
          {
            int i1;
            do
            {
              do
              {
                return false;
              } while (Math.abs(paramMotionEvent2.getX() - paramMotionEvent1.getX()) > Math.abs(paramMotionEvent2.getY() - paramMotionEvent1.getY()));
              paramMotionEvent1 = this.u;
              paramMotionEvent1.computeCurrentVelocity(1000, 10000.0F);
              i1 = (int)paramMotionEvent1.getYVelocity();
            } while ((i1 <= 63536) || (i1 >= 2500));
            paramFloat1 = (float)(0.5D * paramFloat2);
          } while ((this.d == null) || (this.d.getCount() == 0) || (this.d.getChildCount() == 0));
          if ((this.d.getFirstVisiblePosition() == 0) && (this.d.getChildAt(0).getTop() == 0) && (this.b != null))
          {
            if ((paramFloat1 < 0.0F) && (this.g == 1000))
            {
              this.d.setPressed(false);
              this.i = false;
              this.g = 2001;
            }
            if (this.g != 1000)
            {
              this.d.setPressed(false);
              this.m = ((int)(this.m + paramFloat1));
              if (this.m > 0) {
                this.m = 0;
              }
            }
          }
        } while ((this.q != this.p - this.r) || (this.d.getChildAt(this.r - 1).getBottom() != getMeasuredHeight()) || (this.c == null));
        if ((paramFloat1 > 0.0F) && (this.g == 1000))
        {
          this.d.setPressed(false);
          this.i = false;
          this.g = 2003;
        }
      } while (this.g == 1000);
      this.d.setPressed(false);
      this.m = ((int)(paramFloat1 + this.m));
    } while (this.m >= 0);
    this.m = 0;
    return false;
  }
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt) {}
  
  public void onShowPress(MotionEvent paramMotionEvent) {}
  
  public boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    return false;
  }
  
  public void setAdapter(BaseAdapter paramBaseAdapter)
  {
    if ((this.d != null) && (paramBaseAdapter != null))
    {
      this.d.setAdapter(paramBaseAdapter);
      this.h = paramBaseAdapter.getCount();
    }
  }
  
  public void setCacheColorHint(int paramInt)
  {
    if (this.d != null) {
      this.d.setCacheColorHint(paramInt);
    }
  }
  
  public void setDivider(int paramInt)
  {
    if (this.d != null) {
      this.d.setDivider(getResources().getDrawable(paramInt));
    }
  }
  
  public void setDivider(Drawable paramDrawable)
  {
    if (this.d != null) {
      this.d.setDivider(paramDrawable);
    }
  }
  
  public void setDividerHeight(int paramInt)
  {
    if (this.d != null) {
      this.d.setDividerHeight(paramInt);
    }
  }
  
  public void setOnItemClickListener(e parame)
  {
    this.x = parame;
  }
  
  public void setOnItemLongClickListener(f paramf)
  {
    this.y = paramf;
  }
  
  public void setOnLoadingListener(g paramg)
  {
    if (paramg != null) {
      this.s = paramg;
    }
  }
  
  public void setScrollingCacheEnabled(boolean paramBoolean)
  {
    if (this.d != null) {
      this.d.setScrollingCacheEnabled(paramBoolean);
    }
  }
  
  public void setSelection(int paramInt)
  {
    if (this.d != null) {
      this.d.setSelection(paramInt);
    }
  }
  
  public void setSelector(int paramInt)
  {
    if (this.d != null)
    {
      this.d.setSelector(paramInt);
      this.a = this.d.getSelector();
    }
  }
  
  public void setSelector(Drawable paramDrawable)
  {
    if ((this.d != null) && (paramDrawable != null))
    {
      this.d.setSelector(paramDrawable);
      this.a = this.d.getSelector();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\AppendList.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */