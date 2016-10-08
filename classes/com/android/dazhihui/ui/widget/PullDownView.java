package com.android.dazhihui.ui.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.android.dazhihui.ui.screen.y;

public class PullDownView
  extends FrameLayout
  implements GestureDetector.OnGestureListener, Animation.AnimationListener, AbsListView.OnScrollListener
{
  private int a = getResources().getDimensionPixelSize(2131230915);
  private GestureDetector b = new GestureDetector(this);
  private ke c;
  private int d = 0;
  private int e;
  private Activity f;
  private Animation g;
  private Animation h;
  private ImageView i;
  private ImageView j;
  private TextView k;
  private TextView l;
  private TextView m;
  private TextView n;
  private int o;
  private int p;
  private int q;
  private int r;
  private int s;
  private float t;
  private float u;
  
  public PullDownView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.f = ((Activity)paramContext);
    this.g = AnimationUtils.loadAnimation(getContext(), 2130968625);
    this.g.setAnimationListener(this);
    this.h = AnimationUtils.loadAnimation(getContext(), 2130968623);
    this.h.setAnimationListener(this);
  }
  
  private void b(int paramInt)
  {
    View localView1 = getChildAt(0);
    View localView2 = getChildAt(1);
    View localView3 = getChildAt(2);
    int i1;
    int i2;
    int i3;
    if (paramInt == 1)
    {
      paramInt = localView2.getTop();
      i1 = localView1.getTop();
      i2 = localView3.getBottom();
      i3 = localView2.getBottom();
      switch (this.d)
      {
      }
    }
    for (;;)
    {
      invalidate();
      return;
      localView1.offsetTopAndBottom(-i1);
      localView2.offsetTopAndBottom(-paramInt + this.a);
      if (this.c != null) {
        this.c.a(this.d);
      }
      localView1.findViewById(2131560228).setVisibility(8);
      localView1.findViewById(2131560229).setVisibility(0);
      this.i.setImageResource(2130839093);
      this.k.setText(2131165678);
      this.d = 7;
      this.e = (-this.a);
      continue;
      localView1.offsetTopAndBottom(-i1 - this.a);
      localView2.offsetTopAndBottom(-paramInt);
      this.d = 0;
      this.e = 0;
      continue;
      localView3.offsetTopAndBottom(this.r - i2);
      localView2.offsetTopAndBottom(this.r - i3 + this.a);
      if (this.c != null) {
        this.c.a(this.d);
      }
      localView3.findViewById(2131560228).setVisibility(8);
      localView3.findViewById(2131560229).setVisibility(0);
      this.j.setImageResource(2130839094);
      this.l.setText(2131165678);
      this.d = 7;
      this.e = this.a;
      continue;
      localView3.offsetTopAndBottom(this.r - i2 + this.a);
      localView2.offsetTopAndBottom(this.r - i3);
      this.d = 0;
      this.e = 0;
      continue;
      if (paramInt == 2)
      {
        localView2.offsetTopAndBottom(-this.e - localView2.getTop());
        if ((this.d == 1) || (this.d == 2))
        {
          if ((localView1 != null) && (localView1.getVisibility() != 0)) {
            localView1.setVisibility(0);
          }
          localView1.offsetTopAndBottom(-this.a - this.e - localView1.getTop());
        }
        for (;;)
        {
          if (-this.e < this.a) {
            break label532;
          }
          if (this.d != 1) {
            break;
          }
          this.d = 2;
          localView1.findViewById(2131560228).startAnimation(this.g);
          break;
          if ((this.d == 3) || (this.d == 4))
          {
            if ((localView3 != null) && (localView3.getVisibility() != 0)) {
              localView3.setVisibility(0);
            }
            localView3.offsetTopAndBottom(-this.e - localView3.getTop() + this.r);
          }
        }
        label532:
        if (this.e >= this.a)
        {
          if (this.d == 3)
          {
            this.d = 4;
            localView3.findViewById(2131560228).startAnimation(this.h);
          }
        }
        else if (this.d == 2)
        {
          this.d = 1;
          localView1.findViewById(2131560228).startAnimation(this.h);
        }
        else if (this.d == 4)
        {
          this.d = 3;
          localView3.findViewById(2131560228).startAnimation(this.g);
        }
      }
    }
  }
  
  public void a(int paramInt)
  {
    this.f.runOnUiThread(new kd(this));
  }
  
  public void a(y paramy) {}
  
  public void a(String paramString1, String paramString2)
  {
    this.m.setText(paramString1);
    this.n.setText(paramString2);
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction())
    {
    case 1: 
    default: 
      if (this.d != 7) {
        break;
      }
    }
    do
    {
      return true;
      this.s = 0;
      this.t = paramMotionEvent.getX();
      this.u = paramMotionEvent.getY();
      break;
      float f1 = paramMotionEvent.getX(0);
      float f2 = paramMotionEvent.getY(0);
      int i1 = (int)(this.t - f1);
      int i2 = (int)(this.u - f2);
      this.t = f1;
      this.u = f2;
      if (this.s != 0) {
        break;
      }
      if (Math.abs(i2) < Math.abs(i1))
      {
        this.s = 1;
        break;
      }
      if (Math.abs(i2) > Math.abs(i1))
      {
        this.s = 2;
        break;
      }
      this.s = 0;
      break;
      this.b.onTouchEvent(paramMotionEvent);
      if ((paramMotionEvent.getAction() == 1) && (this.d != 0) && (this.s != 1))
      {
        this.s = 3;
        b(paramMotionEvent.getAction());
        paramMotionEvent.setAction(3);
        return super.dispatchTouchEvent(paramMotionEvent);
      }
      if (this.s != 1) {
        b(paramMotionEvent.getAction());
      }
    } while ((paramMotionEvent.getAction() != 1) && (this.d != 0) && (this.s != 1));
    if (paramMotionEvent.getAction() == 1) {
      this.s = 3;
    }
    return super.dispatchTouchEvent(paramMotionEvent);
  }
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    switch (this.d)
    {
    default: 
      return;
    case 1: 
      this.i.setImageResource(2130839093);
      return;
    case 2: 
      this.i.setImageResource(2130839094);
      return;
    case 3: 
      this.j.setImageResource(2130839094);
      return;
    }
    this.j.setImageResource(2130839093);
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation)
  {
    switch (this.d)
    {
    }
    for (;;)
    {
      invalidate();
      return;
      this.k.setText(2131166373);
      continue;
      this.l.setText(2131165296);
      continue;
      this.k.setText(2131166191);
      continue;
      this.l.setText(2131166191);
    }
  }
  
  public boolean onDown(MotionEvent paramMotionEvent)
  {
    return false;
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.i = ((ImageView)getChildAt(0).findViewById(2131560228));
    this.k = ((TextView)getChildAt(0).findViewById(2131560227));
    this.m = ((TextView)getChildAt(0).findViewById(2131561239));
    this.j = ((ImageView)getChildAt(2).findViewById(2131560228));
    this.l = ((TextView)getChildAt(2).findViewById(2131560227));
    this.n = ((TextView)getChildAt(2).findViewById(2131561239));
    this.i.setImageResource(2130839093);
    this.j.setImageResource(2130839094);
    this.k.setText(2131166373);
    this.l.setText(2131165296);
    ((ListView)getChildAt(1)).setOnScrollListener(this);
  }
  
  public boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    return false;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    getChildAt(0).layout(0, -this.a - this.e, getMeasuredWidth(), -this.e);
    getChildAt(1).layout(0, -this.e, getMeasuredWidth(), getMeasuredHeight() - this.e);
    this.r = getMeasuredHeight();
    getChildAt(2).layout(0, this.r - this.e, getMeasuredWidth(), this.r - this.e + this.a);
  }
  
  public void onLongPress(MotionEvent paramMotionEvent) {}
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    this.o = paramInt3;
    this.p = paramInt1;
    this.q = paramInt2;
  }
  
  public boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    paramMotionEvent1 = (AdapterView)getChildAt(1);
    paramFloat1 = (float)(0.5D * paramFloat2);
    if ((paramMotionEvent1 == null) || (paramMotionEvent1.getCount() == 0) || (paramMotionEvent1.getChildCount() == 0)) {}
    do
    {
      do
      {
        return false;
        if ((paramMotionEvent1.getFirstVisiblePosition() == 0) && (paramMotionEvent1.getChildAt(0).getTop() == 0))
        {
          if ((paramFloat1 < 0.0F) && (this.d == 0) && (this.s == 2)) {
            this.d = 1;
          }
          if (this.d != 0) {
            this.e = ((int)(this.e + paramFloat1));
          }
        }
      } while ((this.p != this.o - this.q) || (paramMotionEvent1.getChildAt(this.q - 1).getBottom() != getMeasuredHeight()));
      if ((paramFloat1 > 0.0F) && (this.d == 0) && (this.s == 2)) {
        this.d = 3;
      }
    } while (this.d == 0);
    this.e = ((int)(this.e + paramFloat1));
    return false;
  }
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt) {}
  
  public void onShowPress(MotionEvent paramMotionEvent) {}
  
  public boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    return false;
  }
  
  public void setOnLoadListener(ke paramke)
  {
    this.c = paramke;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\PullDownView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */