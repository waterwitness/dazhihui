package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.adv.AdvertUpPullLayout;
import com.android.dazhihui.ui.widget.dzhrefresh.DzhLoading;
import com.android.dazhihui.ui.widget.dzhrefresh.q;

public class SelfStockRefreshLayout
  extends FrameLayout
  implements GestureDetector.OnGestureListener, Animation.AnimationListener, kg
{
  private Runnable A = new kq(this);
  private int a;
  private int b;
  private GestureDetector c = new GestureDetector(this);
  private kr d;
  private boolean e = false;
  private boolean f = false;
  private int g = 0;
  private int h;
  private Context i;
  private Animation j;
  private Animation k;
  private View l;
  private View m;
  private View n;
  private ImageView o;
  private TextView p;
  private TextView q;
  private int r;
  private int[] s;
  private int[] t;
  private int u;
  private float v;
  private float w;
  private DzhLoading x;
  private int y = 5;
  private a z;
  
  public SelfStockRefreshLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SelfStockRefreshLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.i = paramContext;
    this.j = AnimationUtils.loadAnimation(getContext(), 2130968625);
    this.j.setAnimationListener(this);
    this.k = AnimationUtils.loadAnimation(getContext(), 2130968623);
    this.k.setAnimationListener(this);
    this.s = new int[] { 2131165184, 2131165186 };
    this.t = new int[] { 2131165296, 2131166191 };
    this.l = LayoutInflater.from(this.i).inflate(2130903389, null);
    this.m = LayoutInflater.from(this.i).inflate(2130903384, null);
    a(this.l);
    a(this.m);
    this.a = this.l.getMeasuredHeight();
    this.b = this.m.getMeasuredHeight();
    this.p = ((TextView)this.l.findViewById(2131560227));
    this.o = ((ImageView)this.m.findViewById(2131560228));
    this.q = ((TextView)this.m.findViewById(2131560227));
    this.o.setImageResource(2130837538);
    this.p.setText(this.s[0]);
    this.q.setText(this.t[0]);
    this.x = ((DzhLoading)this.l.findViewById(2131560234));
    this.l.setVisibility(4);
    this.m.setVisibility(4);
  }
  
  private void a(int paramInt)
  {
    int i1;
    int i2;
    int i3;
    if (paramInt == 1)
    {
      paramInt = this.n.getTop();
      i1 = this.l.getTop();
      i2 = this.m.getBottom();
      i3 = this.n.getBottom();
      switch (this.g)
      {
      }
    }
    for (;;)
    {
      invalidate();
      return;
      this.l.offsetTopAndBottom(-i1);
      this.n.offsetTopAndBottom(-paramInt + this.a);
      this.x.a();
      this.p.setText(2131165678);
      this.g = 7;
      this.h = (-this.a);
      if (this.f)
      {
        if (this.d != null) {
          this.d.a(2);
        }
      }
      else
      {
        d();
        continue;
        this.l.offsetTopAndBottom(-i1 - this.a);
        this.n.offsetTopAndBottom(-paramInt);
        this.g = 0;
        paramInt = this.h;
        this.h = 0;
        if ((this.z != null) && (Math.abs(paramInt) >= AdvertUpPullLayout.a / 2 + this.l.getMeasuredHeight() / 2))
        {
          this.z.a();
          Log.i("GUH", "手动下拉一定距离触发更新下拉内容，会切换下条资讯");
          continue;
          if (this.e)
          {
            if (this.d != null) {
              this.d.a(4);
            }
            this.m.offsetTopAndBottom(this.r - i2);
            this.n.offsetTopAndBottom(this.r - i3 + this.b);
            this.m.findViewById(2131560228).setVisibility(8);
            this.m.findViewById(2131560229).setVisibility(0);
            this.o.setImageResource(2130837538);
            this.q.setText(2131165678);
            this.g = 7;
            this.h = this.b;
          }
          else
          {
            d();
            continue;
            this.m.offsetTopAndBottom(this.r - i2 + this.b);
            this.n.offsetTopAndBottom(this.r - i3);
            this.g = 0;
            this.h = 0;
            continue;
            if (paramInt == 2)
            {
              paramInt = Math.abs(this.h);
              this.x.a(paramInt * 100 / (this.a + this.y));
              if ((this.g == 1) || (this.g == 2))
              {
                this.n.offsetTopAndBottom(-this.h - this.n.getTop());
                if ((this.f) && (this.l != null) && (this.l.getVisibility() != 0)) {
                  this.l.setVisibility(0);
                }
                this.l.offsetTopAndBottom(-this.a - this.h - this.l.getTop());
                if ((this.z != null) && (((View)this.z).getVisibility() == 0)) {
                  this.z.a(this.h);
                }
              }
              for (;;)
              {
                if (-this.h < this.a + this.y) {
                  break label733;
                }
                if (this.g != 1) {
                  break;
                }
                this.g = 2;
                this.p.setText(q.a().b());
                break;
                if ((this.g == 3) || (this.g == 4))
                {
                  if ((this.e) && (this.m != null) && (this.m.getVisibility() != 0)) {
                    this.m.setVisibility(0);
                  }
                  if (this.e)
                  {
                    this.n.offsetTopAndBottom(-this.h - this.n.getTop());
                    this.m.offsetTopAndBottom(-this.h - this.m.getTop() + this.r);
                  }
                }
              }
              label733:
              if (this.h >= this.b)
              {
                if (this.g == 3)
                {
                  this.g = 4;
                  this.m.findViewById(2131560228).startAnimation(this.k);
                }
              }
              else if (this.g == 2)
              {
                this.g = 1;
                this.p.setText(this.s[0]);
              }
              else if (this.g == 4)
              {
                this.g = 3;
                this.m.findViewById(2131560228).startAnimation(this.j);
              }
            }
          }
        }
      }
    }
  }
  
  private void a(View paramView)
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
  
  private void d()
  {
    if (this.g != 0) {
      post(this.A);
    }
  }
  
  public void a()
  {
    if ((this.z != null) && (this.z.a(2.14748365E9F)))
    {
      this.h = (-AdvertUpPullLayout.a);
      this.n.offsetTopAndBottom(-this.h - this.n.getTop());
      if (this.l.getVisibility() != 0) {
        this.l.setVisibility(0);
      }
      this.l.offsetTopAndBottom(-this.h - this.a - this.l.getTop());
      removeCallbacks(this.A);
      postDelayed(this.A, 6000L);
    }
  }
  
  public void a(y paramy) {}
  
  public void a(boolean paramBoolean, int paramInt)
  {
    this.x.b();
    this.x.a(100);
    String str;
    if (paramInt == 1) {
      str = "刷新成功";
    }
    for (;;)
    {
      this.p.setText(str);
      postDelayed(this.A, 1000L);
      return;
      if (paramInt == 2) {
        str = "刷新失败";
      } else {
        str = "完成刷新";
      }
    }
  }
  
  public void b()
  {
    if (this.l != null)
    {
      a(this.l);
      this.a = this.l.getMeasuredHeight();
    }
  }
  
  protected void c()
  {
    addView(this.l, new ViewGroup.LayoutParams(-1, -2));
    addView(this.m, new ViewGroup.LayoutParams(-1, this.b));
    this.n = getChildAt(0);
    if (((this.n instanceof AdapterView)) || ((this.n instanceof ScrollView)))
    {
      this.n.setOverScrollMode(2);
      this.n.setHorizontalFadingEdgeEnabled(false);
      this.n.setVerticalFadingEdgeEnabled(false);
    }
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!isEnabled()) {
      return super.dispatchTouchEvent(paramMotionEvent);
    }
    int i1;
    switch (paramMotionEvent.getAction())
    {
    case 1: 
    default: 
      i1 = 0;
    }
    while (this.g == 7)
    {
      return true;
      this.u = 0;
      this.v = paramMotionEvent.getX();
      this.w = paramMotionEvent.getY();
      i1 = 0;
      continue;
      float f1 = paramMotionEvent.getX(0);
      float f2 = paramMotionEvent.getY(0);
      int i3 = (int)(this.v - f1);
      int i2 = (int)(this.w - f2);
      this.v = f1;
      this.w = f2;
      i1 = i2;
      if (this.u == 0) {
        if (Math.abs(i2) < Math.abs(i3))
        {
          this.u = 1;
          i1 = i2;
        }
        else if (Math.abs(i2) > Math.abs(i3))
        {
          this.u = 2;
          i1 = i2;
        }
        else
        {
          this.u = 0;
          i1 = i2;
        }
      }
    }
    this.c.onTouchEvent(paramMotionEvent);
    if ((paramMotionEvent.getAction() == 1) && (this.g != 0) && (this.u != 1))
    {
      this.u = 3;
      a(paramMotionEvent.getAction());
      paramMotionEvent.setAction(3);
      return super.dispatchTouchEvent(paramMotionEvent);
    }
    if (this.u != 1)
    {
      a(paramMotionEvent.getAction());
      if ((this.g == 0) && (this.z != null) && (((View)this.z).getVisibility() == 0) && (this.l != null) && (this.l.getVisibility() == 0) && (this.n != null))
      {
        if ((paramMotionEvent.getAction() != 1) || (this.h == -AdvertUpPullLayout.a)) {
          break label400;
        }
        removeCallbacks(this.A);
        post(this.A);
      }
    }
    while ((paramMotionEvent.getAction() == 1) || (this.g == 0) || (this.u == 1))
    {
      if (paramMotionEvent.getAction() == 1) {
        this.u = 3;
      }
      return super.dispatchTouchEvent(paramMotionEvent);
      label400:
      if ((i1 != 0) && (this.h + i1 < 0) && (this.h + i1 >= -AdvertUpPullLayout.a))
      {
        this.h += i1;
        this.n.offsetTopAndBottom(-this.h - this.n.getTop());
        this.l.offsetTopAndBottom(-this.a - this.h - this.l.getTop());
        this.z.a(this.h);
        removeCallbacks(this.A);
        paramMotionEvent.setAction(3);
        super.dispatchTouchEvent(paramMotionEvent);
        return true;
      }
      if (i1 != 0)
      {
        removeCallbacks(this.A);
        post(this.A);
      }
    }
    paramMotionEvent.setAction(3);
    super.dispatchTouchEvent(paramMotionEvent);
    return true;
  }
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    switch (this.g)
    {
    case 1: 
    case 2: 
    default: 
      return;
    case 3: 
      this.o.setImageResource(2130837538);
      return;
    }
    this.o.setImageResource(2130837531);
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation)
  {
    switch (this.g)
    {
    }
    for (;;)
    {
      invalidate();
      return;
      this.p.setText(this.s[0]);
      continue;
      this.q.setText(this.t[0]);
      continue;
      this.p.setText(q.a().b());
      continue;
      this.q.setText(this.t[1]);
    }
  }
  
  public boolean onDown(MotionEvent paramMotionEvent)
  {
    return false;
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    c();
  }
  
  public boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    return false;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.l.layout(0, -this.a - this.h, getMeasuredWidth(), -this.h);
    this.n.layout(0, -this.h, getMeasuredWidth(), getMeasuredHeight() - this.h);
    this.r = getMeasuredHeight();
    this.m.layout(0, this.r - this.h, getMeasuredWidth(), this.r - this.h + this.b);
  }
  
  public void onLongPress(MotionEvent paramMotionEvent) {}
  
  public boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    paramMotionEvent1 = getChildAt(0);
    if (paramMotionEvent1 == null) {}
    label80:
    label164:
    label170:
    label201:
    do
    {
      boolean bool2;
      do
      {
        boolean bool1;
        do
        {
          do
          {
            return false;
            paramFloat1 = (float)(0.8D * paramFloat2);
          } while ((!(paramMotionEvent1 instanceof ScrollView)) && (!(paramMotionEvent1 instanceof ks)));
          paramMotionEvent2 = (ViewGroup)paramMotionEvent1;
          if (!(paramMotionEvent1 instanceof ScrollView)) {
            break label170;
          }
          if (paramMotionEvent2.getScrollY() != 0) {
            break;
          }
          bool1 = true;
          if (paramMotionEvent2.getChildAt(0).getBottom() - paramMotionEvent2.getScrollY() != getMeasuredHeight()) {
            break label164;
          }
          bool2 = true;
          if ((!bool1) || (!this.f)) {
            break label201;
          }
          if ((paramFloat1 < 0.0F) && (this.g == 0) && (this.u == 2)) {
            this.g = 1;
          }
        } while (this.g == 0);
        this.h = ((int)(this.h + paramFloat1));
        if (this.h < 0) {}
        for (i1 = this.h;; i1 = 0)
        {
          this.h = i1;
          return false;
          bool1 = false;
          break;
          bool2 = false;
          break label80;
          bool1 = ((ks)paramMotionEvent1).d();
          bool2 = ((ks)paramMotionEvent1).c();
          break label80;
        }
      } while ((!bool2) || (!this.e));
      if ((paramFloat1 > 0.0F) && (this.g == 0) && (this.u == 2)) {
        this.g = 3;
      }
    } while (this.g == 0);
    this.h = ((int)(this.h + paramFloat1));
    if (this.h > 0) {}
    for (int i1 = this.h;; i1 = 0)
    {
      this.h = i1;
      return false;
    }
  }
  
  public void onShowPress(MotionEvent paramMotionEvent) {}
  
  public boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    return false;
  }
  
  public void setAdvertUpPullView(AdvertUpPullLayout paramAdvertUpPullLayout)
  {
    if ((this.z == null) && (this.l != null) && (paramAdvertUpPullLayout != null))
    {
      this.z = paramAdvertUpPullLayout;
      ((ViewGroup)this.l).addView((View)this.z);
    }
  }
  
  public void setEnablePullFromBottom(boolean paramBoolean)
  {
    this.e = paramBoolean;
    if (this.e)
    {
      this.m.setVisibility(0);
      return;
    }
    this.m.setVisibility(4);
  }
  
  public void setEnablePullFromTop(boolean paramBoolean)
  {
    this.f = paramBoolean;
    if (this.f)
    {
      this.l.setVisibility(0);
      return;
    }
    this.l.setVisibility(4);
  }
  
  public void setOnLoadListener(kr paramkr)
  {
    this.d = paramkr;
  }
  
  public void setRefreshBottomTips(int[] paramArrayOfInt)
  {
    if (this.t != paramArrayOfInt) {
      this.t = paramArrayOfInt;
    }
    this.q.setText(this.t[0]);
  }
  
  public void setRefreshTopTips(int[] paramArrayOfInt)
  {
    if (this.s != paramArrayOfInt) {
      this.s = paramArrayOfInt;
    }
    this.p.setText(this.s[0]);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\SelfStockRefreshLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */