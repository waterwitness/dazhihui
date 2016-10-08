package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.List;

class me
  extends ViewGroup
  implements GestureDetector.OnGestureListener, Animation.AnimationListener
{
  private View b;
  private View c;
  private int d;
  private int e;
  private int f;
  private int g = 0;
  private int h = 2130903162;
  private int i = 2130903161;
  private int j = 1000;
  private int k = 0;
  private boolean l = true;
  private final int m = 2500;
  private GestureDetector n = new GestureDetector(this);
  private VelocityTracker o;
  private Animation p;
  private Animation q;
  private Animation r;
  private Animation s;
  private View t;
  private View u;
  
  public me(TableLayoutGroup paramTableLayoutGroup, Context paramContext)
  {
    super(paramContext);
    a();
  }
  
  private void a()
  {
    if (this.h != 0)
    {
      this.b = LayoutInflater.from(TableLayoutGroup.Q(this.a)).inflate(this.h, null);
      addView(this.b);
      TableLayoutGroup.a(this.a, this.b);
      this.e = this.b.getMeasuredHeight();
      TableLayoutGroup.a(this.a, new mg(this.a, TableLayoutGroup.Q(this.a)));
      addView(TableLayoutGroup.d(this.a));
      if (this.i == 0) {
        break label224;
      }
      this.c = LayoutInflater.from(TableLayoutGroup.Q(this.a)).inflate(this.i, null);
      addView(this.c);
      TableLayoutGroup.a(this.a, this.c);
      this.f = this.c.getMeasuredHeight();
    }
    for (;;)
    {
      b(AnimationUtils.loadAnimation(TableLayoutGroup.Q(this.a), 2130968624), AnimationUtils.loadAnimation(TableLayoutGroup.Q(this.a), 2130968622), 2131559238);
      a(AnimationUtils.loadAnimation(TableLayoutGroup.Q(this.a), 2130968624), AnimationUtils.loadAnimation(TableLayoutGroup.Q(this.a), 2130968622), 2131559241);
      return;
      this.b = null;
      break;
      label224:
      this.c = null;
    }
  }
  
  private void a(int paramInt)
  {
    int i2;
    if (paramInt == 1)
    {
      i2 = TableLayoutGroup.d(this.a).getTop();
      if (this.b == null) {
        break label857;
      }
    }
    label665:
    label857:
    for (paramInt = this.b.getTop();; paramInt = 0)
    {
      if (this.c != null) {}
      for (int i1 = this.c.getBottom();; i1 = 0)
      {
        int i3 = TableLayoutGroup.d(this.a).getBottom();
        switch (this.j)
        {
        default: 
          if (this.o != null)
          {
            this.o.recycle();
            this.o = null;
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
          TableLayoutGroup.d(this.a).offsetTopAndBottom(-i2 + this.e);
          this.g = (-this.e);
          this.j = 1001;
          a(this, 2100);
          if (this.t == null) {
            break;
          }
          this.t.setVisibility(4);
          this.t.clearAnimation();
          break;
          if (this.b == null) {
            break;
          }
          this.b.offsetTopAndBottom(-paramInt - this.e);
          TableLayoutGroup.d(this.a).offsetTopAndBottom(-i2);
          this.j = 1000;
          this.g = 0;
          b();
          break;
          if (this.c == null) {
            break;
          }
          this.c.offsetTopAndBottom(this.d - i1);
          TableLayoutGroup.d(this.a).offsetTopAndBottom(this.d - i3 - this.f);
          this.j = 1001;
          this.g = this.f;
          a(this, 2200);
          if (this.u == null) {
            break;
          }
          this.u.setVisibility(4);
          this.u.clearAnimation();
          break;
          if (this.c == null) {
            break;
          }
          this.c.offsetTopAndBottom(this.d - i1 + this.f);
          TableLayoutGroup.d(this.a).offsetTopAndBottom(this.d - i3);
          this.j = 1000;
          this.g = 0;
          b();
          break;
          if (paramInt != 3)
          {
            VelocityTracker localVelocityTracker = this.o;
            localVelocityTracker.computeCurrentVelocity(1000, 10000.0F);
            paramInt = (int)localVelocityTracker.getYVelocity();
            if ((paramInt > 63536) && (paramInt < 2500))
            {
              TableLayoutGroup.d(this.a).offsetTopAndBottom(-this.g - TableLayoutGroup.d(this.a).getTop());
              if ((this.j == 2001) || (this.j == 2002)) {
                if (this.b != null)
                {
                  this.b.setVisibility(0);
                  this.b.offsetTopAndBottom(-this.e - this.g - this.b.getTop());
                }
              }
              for (;;)
              {
                if ((-this.g < this.e) || (this.b == null)) {
                  break label665;
                }
                this.l = false;
                if (this.j != 2001) {
                  break;
                }
                this.j = 2002;
                if (this.t != null) {
                  this.t.startAnimation(this.p);
                }
                b(this, this.b, 2100);
                break;
                if (((this.j == 2003) || (this.j == 2004)) && (this.c != null))
                {
                  this.c.setVisibility(0);
                  this.c.offsetTopAndBottom(-this.g - this.c.getTop() + this.d);
                }
              }
              if ((this.g >= this.f) && (this.c != null))
              {
                this.l = false;
                if (this.j == 2003)
                {
                  this.j = 2004;
                  if (this.u != null) {
                    this.u.startAnimation(this.r);
                  }
                  b(this, this.c, 2200);
                }
              }
              else if ((this.j == 2002) && (this.b != null))
              {
                this.j = 2001;
                c(this, this.b, 2100);
                if (this.t != null) {
                  this.t.startAnimation(this.q);
                }
              }
              else if ((this.j == 2004) && (this.c != null))
              {
                this.j = 2003;
                c(this, this.c, 2200);
                if (this.u != null) {
                  this.u.startAnimation(this.s);
                }
              }
            }
          }
        }
      }
    }
  }
  
  private void a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if ((paramInt1 == 2100) && (this.b != null)) {
      a(this, this.b, paramInt1);
    }
    for (;;)
    {
      this.l = true;
      invalidate();
      b();
      this.g = 0;
      if (this.b != null) {
        this.b.offsetTopAndBottom(-this.e);
      }
      if (this.c != null) {
        this.c.offsetTopAndBottom(this.d + this.f);
      }
      TableLayoutGroup.d(this.a).offsetTopAndBottom(-TableLayoutGroup.d(this.a).getTop());
      if ((paramBoolean) && (paramInt2 == 3000) && (paramInt1 == 2100)) {}
      this.j = 1000;
      return;
      if (this.c != null) {
        a(this, this.c, paramInt1);
      }
    }
  }
  
  private void a(View paramView, int paramInt)
  {
    ProgressBar localProgressBar;
    if (paramInt == 2200)
    {
      paramView = (TextView)findViewById(2131559237);
      localProgressBar = (ProgressBar)findViewById(2131559239);
      localProgressBar.setVisibility(0);
      paramView.setText(getResources().getString(2131165396));
      if (paramInt != 2200) {
        break label187;
      }
      if (TableLayoutGroup.K(this.a)) {
        break label93;
      }
      this.a.d();
    }
    label93:
    label187:
    while (TableLayoutGroup.R(this.a) == null)
    {
      do
      {
        return;
        paramView = (TextView)findViewById(2131559240);
        localProgressBar = (ProgressBar)findViewById(2131559242);
        break;
        if (TableLayoutGroup.R(this.a) != null) {
          TableLayoutGroup.R(this.a).a(TableLayoutGroup.c(this.a).size());
        }
      } while ((TableLayoutGroup.S(this.a) == null) || (TableLayoutGroup.b(this.a) == null) || (mf.a(TableLayoutGroup.b(this.a)) != TableLayoutGroup.c(this.a).size() - 1));
      TableLayoutGroup.S(this.a).a();
      return;
    }
    TableLayoutGroup.R(this.a).a();
  }
  
  private void a(View paramView1, View paramView2)
  {
    ((ImageView)findViewById(2131559238)).setImageResource(2130837530);
    ((TextView)findViewById(2131559237)).setText(getResources().getString(2131165424));
    ((ProgressBar)findViewById(2131559239)).setVisibility(4);
    ((ImageView)findViewById(2131559241)).setImageResource(2130837529);
    ((TextView)findViewById(2131559240)).setText(getResources().getString(2131165423));
    ((ProgressBar)findViewById(2131559242)).setVisibility(8);
  }
  
  private void a(Animation paramAnimation1, Animation paramAnimation2, int paramInt)
  {
    this.p = paramAnimation1;
    this.q = paramAnimation2;
    this.t = findViewById(paramInt);
    if (this.p != null) {
      this.p.setAnimationListener(this);
    }
    if (this.q != null) {
      this.q.setAnimationListener(this);
    }
  }
  
  private void b()
  {
    if (this.t != null)
    {
      this.t.clearAnimation();
      this.t.setVisibility(0);
    }
    if (this.u != null)
    {
      this.u.clearAnimation();
      this.u.setVisibility(0);
    }
  }
  
  private void b(View paramView, int paramInt)
  {
    if (paramView.getId() == 2131559238)
    {
      localTextView = (TextView)findViewById(2131559237);
      if (paramInt == 4000)
      {
        ((ImageView)paramView).setImageResource(2130837530);
        localTextView.setText(getResources().getString(2131166190));
        return;
      }
      ((ImageView)paramView).setImageResource(2130837529);
      localTextView.setText(getResources().getString(2131165424));
      return;
    }
    TextView localTextView = (TextView)findViewById(2131559240);
    if (paramInt == 4000)
    {
      ((ImageView)paramView).setImageResource(2130837529);
      localTextView.setText(getResources().getString(2131166190));
      return;
    }
    ((ImageView)paramView).setImageResource(2130837530);
    localTextView.setText(getResources().getString(2131165423));
  }
  
  private void b(View paramView1, View paramView2, int paramInt) {}
  
  private void b(Animation paramAnimation1, Animation paramAnimation2, int paramInt)
  {
    this.r = paramAnimation1;
    this.s = paramAnimation2;
    this.u = findViewById(paramInt);
    if (this.r != null) {
      this.r.setAnimationListener(this);
    }
    if (this.s != null) {
      this.s.setAnimationListener(this);
    }
  }
  
  private void c(View paramView1, View paramView2, int paramInt)
  {
    if (paramInt == 2200)
    {
      ((TextView)findViewById(2131559237)).setText(getResources().getString(2131165424));
      return;
    }
    ((TextView)findViewById(2131559240)).setText(getResources().getString(2131165423));
  }
  
  public void a(View paramView1, View paramView2, int paramInt)
  {
    if (paramInt == 2200)
    {
      ((ProgressBar)findViewById(2131559239)).setVisibility(4);
      return;
    }
    ((ProgressBar)findViewById(2131559242)).setVisibility(8);
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getAction() == 0)
    {
      this.l = true;
      if (this.j == 1000) {
        a(this.b, this.c);
      }
    }
    else
    {
      if (this.j != 1001) {
        break label70;
      }
    }
    label70:
    do
    {
      return true;
      if (this.j != 1001) {
        break;
      }
      a(2100, 3001, true);
      break;
      if (this.j == 1000)
      {
        if ((paramMotionEvent.getAction() != 2) || (this.t != null)) {
          this.t.clearAnimation();
        }
        if (this.u != null) {
          this.u.clearAnimation();
        }
        if (this.o == null) {
          this.o = VelocityTracker.obtain();
        }
        this.o.addMovement(paramMotionEvent);
        this.n.onTouchEvent(paramMotionEvent);
        a(paramMotionEvent.getAction());
        return super.dispatchTouchEvent(paramMotionEvent);
      }
      if (this.o == null) {
        this.o = VelocityTracker.obtain();
      }
      this.o.addMovement(paramMotionEvent);
      this.n.onTouchEvent(paramMotionEvent);
      a(paramMotionEvent.getAction());
    } while (paramMotionEvent.getAction() != 1);
    return true;
  }
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    switch (this.j)
    {
    default: 
      return;
    case 2002: 
      b(this.t, 4000);
      return;
    case 2004: 
      b(this.u, 4000);
      return;
    case 2001: 
      b(this.t, 4001);
      return;
    }
    b(this.u, 4001);
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation) {}
  
  public boolean onDown(MotionEvent paramMotionEvent)
  {
    return false;
  }
  
  public boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    return false;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.d = (paramInt4 - paramInt2);
    if (this.b != null) {
      this.b.layout(0, -this.e - this.g, getWidth(), -this.g);
    }
    TableLayoutGroup.d(this.a).layout(0, -this.g, getWidth(), -this.g + this.d);
    if (this.c != null) {
      this.c.layout(0, -this.g + this.d, getWidth(), -this.g + this.d + this.f);
    }
  }
  
  public void onLongPress(MotionEvent paramMotionEvent) {}
  
  public boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    if (Math.abs(paramMotionEvent2.getX() - paramMotionEvent1.getX()) > Math.abs(paramMotionEvent2.getY() - paramMotionEvent1.getY())) {}
    do
    {
      do
      {
        do
        {
          int i1;
          do
          {
            return false;
            paramMotionEvent1 = this.o;
            paramMotionEvent1.computeCurrentVelocity(1000, 10000.0F);
            i1 = (int)paramMotionEvent1.getYVelocity();
          } while ((i1 <= 63536) || (i1 >= 2500));
          paramFloat1 = (float)(0.5D * paramFloat2);
          if ((this.a.e()) && (this.b != null))
          {
            if ((paramFloat1 < 0.0F) && (this.j == 1000))
            {
              this.l = false;
              this.j = 2001;
              TableLayoutGroup.l(this.a, -1);
            }
            if (this.j != 1000)
            {
              this.g = ((int)(this.g + paramFloat1));
              if (this.g > 0) {
                this.g = 0;
              }
            }
          }
        } while ((!this.a.f()) || (this.c == null));
        if ((paramFloat1 > 0.0F) && (this.j == 1000))
        {
          this.l = false;
          this.j = 2003;
          TableLayoutGroup.l(this.a, -1);
        }
      } while (this.j == 1000);
      this.g = ((int)(paramFloat1 + this.g));
    } while (this.g >= 0);
    this.g = 0;
    return false;
  }
  
  public void onShowPress(MotionEvent paramMotionEvent) {}
  
  public boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\me.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */