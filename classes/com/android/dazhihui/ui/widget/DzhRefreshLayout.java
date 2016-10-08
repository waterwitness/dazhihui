package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
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
import com.android.dazhihui.ui.widget.dzhrefresh.DzhLoading;

public class DzhRefreshLayout
  extends FrameLayout
  implements GestureDetector.OnGestureListener, Animation.AnimationListener
{
  private int a;
  private int b;
  private GestureDetector c = new GestureDetector(this);
  private df d;
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
  
  public DzhRefreshLayout(Context paramContext, AttributeSet paramAttributeSet)
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
  
  private void b(int paramInt)
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
        b();
        continue;
        this.l.offsetTopAndBottom(-i1 - this.a);
        this.n.offsetTopAndBottom(-paramInt);
        this.g = 0;
        paramInt = this.h;
        this.h = 0;
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
          b();
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
            }
            for (;;)
            {
              if (-this.h < this.a + this.y) {
                break label652;
              }
              if (this.g != 1) {
                break;
              }
              this.g = 2;
              this.p.setText(this.s[1]);
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
            label652:
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
  
  protected void a()
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
  
  public void a(int paramInt)
  {
    post(new de(this));
  }
  
  public void b()
  {
    if (this.g != 0) {
      a(0);
    }
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    if (!isEnabled()) {
      bool = super.dispatchTouchEvent(paramMotionEvent);
    }
    for (;;)
    {
      return bool;
      switch (paramMotionEvent.getAction())
      {
      }
      while (this.g != 7)
      {
        this.c.onTouchEvent(paramMotionEvent);
        if ((paramMotionEvent.getAction() != 1) || (this.g == 0) || (this.u == 1)) {
          break label238;
        }
        this.u = 3;
        b(paramMotionEvent.getAction());
        paramMotionEvent.setAction(3);
        return super.dispatchTouchEvent(paramMotionEvent);
        this.u = 0;
        this.v = paramMotionEvent.getX();
        this.w = paramMotionEvent.getY();
        continue;
        float f1 = paramMotionEvent.getX(0);
        float f2 = paramMotionEvent.getY(0);
        int i1 = (int)(this.v - f1);
        int i2 = (int)(this.w - f2);
        this.v = f1;
        this.w = f2;
        if (this.u == 0) {
          if (Math.abs(i2) < Math.abs(i1)) {
            this.u = 1;
          } else if (Math.abs(i2) > Math.abs(i1)) {
            this.u = 2;
          } else {
            this.u = 0;
          }
        }
      }
    }
    label238:
    if (this.u != 1) {
      b(paramMotionEvent.getAction());
    }
    if ((paramMotionEvent.getAction() == 1) || (this.g == 0) || (this.u == 1))
    {
      if (paramMotionEvent.getAction() == 1) {
        this.u = 3;
      }
      return super.dispatchTouchEvent(paramMotionEvent);
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
      this.p.setText(this.s[1]);
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
    a();
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
          } while ((!(paramMotionEvent1 instanceof ScrollView)) && (!(paramMotionEvent1 instanceof dg)));
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
          bool1 = ((dg)paramMotionEvent1).a();
          bool2 = ((dg)paramMotionEvent1).b();
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
  
  public void setOnLoadListener(df paramdf)
  {
    this.d = paramdf;
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\DzhRefreshLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */