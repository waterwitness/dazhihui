package com.android.dazhihui.ui.widget.flip;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Scroller;
import com.android.dazhihui.ui.widget.MyViewPager;
import java.util.LinkedList;

public class ViewFlow
  extends AdapterView<Adapter>
{
  public static int b = 600;
  public boolean a = false;
  private Adapter c;
  private d d;
  private LinkedList<View> e;
  private LinkedList<View> f;
  private Scroller g;
  private int h = -1;
  private int i = 0;
  private int j = 5000;
  private int[] k;
  private int l = 0;
  private Handler m = new a(this);
  private int n = 0;
  private VelocityTracker o = null;
  private float p = 0.0F;
  private float q = 0.0F;
  private float r = 0.0F;
  private CircleFlowIndicator s;
  private f t;
  
  public ViewFlow(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ViewFlow(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    d();
  }
  
  private View a(View paramView, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i1 = -1;
    ViewGroup.LayoutParams localLayoutParams2 = paramView.getLayoutParams();
    ViewGroup.LayoutParams localLayoutParams1 = localLayoutParams2;
    if (localLayoutParams2 == null) {
      localLayoutParams1 = new ViewGroup.LayoutParams(-1, -1);
    }
    localLayoutParams1.width = -1;
    localLayoutParams1.height = -1;
    paramView.measure(View.MeasureSpec.makeMeasureSpec(getChildWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getChildHeight(), 1073741824));
    if (paramBoolean2)
    {
      if (paramBoolean1) {}
      for (;;)
      {
        attachViewToParent(paramView, i1, localLayoutParams1);
        return paramView;
        i1 = 0;
      }
    }
    if (paramBoolean1) {}
    for (;;)
    {
      addViewInLayout(paramView, i1, localLayoutParams1, true);
      return paramView;
      i1 = 0;
    }
  }
  
  private MyViewPager a(ViewParent paramViewParent)
  {
    if (paramViewParent != null)
    {
      if ((paramViewParent instanceof MyViewPager)) {
        return (MyViewPager)paramViewParent;
      }
      return a(paramViewParent.getParent());
    }
    return null;
  }
  
  private void a(int paramInt1, int paramInt2)
  {
    if (this.s != null)
    {
      float f1 = paramInt2 / getChildWidth();
      this.s.a(paramInt1, f1);
    }
  }
  
  private void a(int paramInt, boolean paramBoolean)
  {
    if (this.c.getCount() == 0) {}
    while ((paramInt >= this.c.getCount()) || (paramInt < 0)) {
      return;
    }
    View localView1 = getRecycledView();
    View localView2 = this.c.getView(paramInt, localView1, this);
    if (paramBoolean) {
      this.e.add(localView2);
    }
    while (localView1 != localView2)
    {
      a(localView2, paramBoolean, false);
      return;
      this.e.add(0, localView2);
    }
    a(localView2, paramBoolean, true);
  }
  
  private void b(int paramInt)
  {
    a(this.h, paramInt);
  }
  
  private void b(boolean paramBoolean)
  {
    ViewParent localViewParent = getParent();
    if (localViewParent != null) {
      localViewParent.requestDisallowInterceptTouchEvent(paramBoolean);
    }
  }
  
  private void d()
  {
    this.e = new LinkedList();
    this.f = new LinkedList();
    this.g = new Scroller(getContext());
    this.l = ViewConfiguration.get(getContext()).getScaledTouchSlop();
  }
  
  private void e()
  {
    if (this.m != null) {
      this.m.removeMessages(0);
    }
  }
  
  private void f()
  {
    if (this.i > 0)
    {
      if (!this.e.isEmpty()) {
        a((View)this.e.removeFirst());
      }
      if (this.h == this.c.getCount() - 1)
      {
        i1 = 0;
        this.i = 0;
        a(i1, true);
        onLayout(true, 0, 0, 0, 0);
        scrollTo(getChildWidth(), 0);
        b(0);
        if (this.t != null) {
          this.t.a(null, this.h);
        }
        invalidate();
      }
    }
    while (this.i >= 0) {
      for (;;)
      {
        return;
        i1 = this.h + 1;
      }
    }
    if (!this.e.isEmpty()) {
      a((View)this.e.removeLast());
    }
    if (this.h == 0) {}
    for (int i1 = this.c.getCount() - 1;; i1 = this.h - 1)
    {
      a(i1, false);
      this.i = 0;
      onLayout(true, 0, 0, 0, 0);
      scrollTo(getChildWidth(), 0);
      b(0);
      if (this.t != null) {
        this.t.a(null, this.h);
      }
      invalidate();
      return;
    }
  }
  
  private int getHeightPadding()
  {
    return getPaddingTop() + getPaddingBottom();
  }
  
  private int getWidthPadding()
  {
    return getPaddingLeft() + getPaddingRight() + getHorizontalFadingEdgeLength() * 2;
  }
  
  public void a()
  {
    this.a = false;
    if (this.m != null) {
      this.m.removeMessages(0);
    }
  }
  
  public void a(int paramInt)
  {
    this.a = true;
    this.j = paramInt;
    if ((this.c == null) || (this.c.getCount() < 2)) {}
    while (this.m == null) {
      return;
    }
    this.m.removeMessages(0);
    this.m.sendMessageDelayed(this.m.obtainMessage(0), this.j);
  }
  
  protected void a(View paramView)
  {
    if (paramView == null) {
      return;
    }
    detachViewFromParent(paramView);
    this.f.add(paramView);
  }
  
  public void a(boolean paramBoolean)
  {
    if (!this.g.isFinished())
    {
      this.g.abortAnimation();
      f();
    }
    if ((this.c == null) || (this.c.getCount() < 2)) {
      return;
    }
    int i1 = this.c.getCount();
    if (paramBoolean)
    {
      i1 = getChildWidth() * 2 - getScrollX();
      if (this.h == this.c.getCount() - 1)
      {
        this.h = 0;
        this.i = 1;
        if (Math.abs(i1) >= 250) {
          break label141;
        }
        this.g.startScroll(getScrollX(), 0, i1, 0, 250);
      }
    }
    for (;;)
    {
      invalidate();
      return;
      this.h += 1;
      break;
      label141:
      this.g.startScroll(getScrollX(), 0, i1, 0, Math.abs(i1) * 1);
      continue;
      if (this.h == 0) {}
      for (this.h = (i1 - 1);; this.h -= 1)
      {
        i1 = 0 - getScrollX();
        this.i = -1;
        if (Math.abs(i1) >= 250) {
          break label233;
        }
        this.g.startScroll(getScrollX(), 0, i1, 0, 250);
        break;
      }
      label233:
      this.g.startScroll(getScrollX(), 0, i1, 0, Math.abs(i1) * 1);
    }
  }
  
  public void a(int[] paramArrayOfInt)
  {
    this.a = true;
    this.k = paramArrayOfInt;
    if ((this.c == null) || (this.c.getCount() < 2)) {}
    do
    {
      do
      {
        return;
      } while (this.m == null);
      this.m.removeMessages(0);
    } while ((this.k == null) || (this.h == -1) || (this.h >= this.k.length));
    this.m.sendMessageDelayed(this.m.obtainMessage(0), this.k[this.h]);
  }
  
  public void b()
  {
    e();
    if (!this.g.isFinished()) {
      this.g.abortAnimation();
    }
    this.h = -1;
    this.i = 0;
    c();
    this.f.clear();
    removeAllViewsInLayout();
    requestLayout();
    invalidate();
  }
  
  protected void c()
  {
    while (!this.e.isEmpty()) {
      a((View)this.e.remove());
    }
  }
  
  public void computeScroll()
  {
    if (this.g.computeScrollOffset())
    {
      scrollTo(this.g.getCurrX(), this.g.getCurrY());
      if (this.i > 0) {
        a(this.h - 1, this.g.getCurrX() - getChildWidth());
      }
      for (;;)
      {
        postInvalidate();
        return;
        if (this.i < 0) {
          a(this.h + 1, this.g.getCurrX() - getChildWidth());
        } else {
          b(this.g.getCurrX() - getChildWidth());
        }
      }
    }
    f();
  }
  
  public Adapter getAdapter()
  {
    return this.c;
  }
  
  public int getChildHeight()
  {
    return getHeight() - getHeightPadding();
  }
  
  public int getChildWidth()
  {
    return getWidth() - getWidthPadding();
  }
  
  protected View getRecycledView()
  {
    if (this.f.isEmpty()) {
      return null;
    }
    return (View)this.f.remove();
  }
  
  public View getSelectedView()
  {
    return null;
  }
  
  public int getViewsCount()
  {
    if (this.c != null) {
      return this.c.getCount();
    }
    return 0;
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    b();
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool2 = true;
    int i1 = paramMotionEvent.getAction();
    boolean bool1;
    if ((this.c == null) || (this.c.getCount() == 0)) {
      bool1 = false;
    }
    do
    {
      return bool1;
      if (i1 != 2) {
        break;
      }
      bool1 = bool2;
    } while (this.n != 0);
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    switch (i1)
    {
    }
    for (;;)
    {
      bool1 = bool2;
      if (this.n != 0) {
        break;
      }
      return false;
      i1 = (int)Math.abs(this.p - f1);
      int i2 = (int)Math.abs(this.q - f2);
      if ((i1 > this.l) && (this.c.getCount() > 1) && (i1 * 0.5F > i2))
      {
        this.n = 1;
        b(true);
        continue;
        this.p = f1;
        this.q = f2;
        this.r = f1;
        if (this.g.isFinished()) {}
        for (i1 = 0;; i1 = 1)
        {
          this.n = i1;
          if (this.c.getCount() <= 1) {
            break;
          }
          paramMotionEvent = a(getParent());
          if (paramMotionEvent == null) {
            break;
          }
          paramMotionEvent.a = true;
          break;
        }
        this.n = 0;
      }
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt1 = getPaddingLeft();
    paramInt2 = getHorizontalFadingEdgeLength();
    paramInt4 = getChildCount();
    paramInt2 += paramInt1;
    paramInt1 = 0;
    while (paramInt1 < paramInt4)
    {
      View localView = getChildAt(paramInt1);
      paramInt3 = paramInt2;
      if (localView.getVisibility() != 8)
      {
        paramInt3 = localView.getMeasuredWidth();
        localView.layout(paramInt2, getPaddingTop(), paramInt2 + paramInt3, getPaddingTop() + localView.getMeasuredHeight());
        paramInt3 = paramInt2 + paramInt3;
      }
      paramInt1 += 1;
      paramInt2 = paramInt3;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i3 = View.MeasureSpec.getSize(paramInt1);
    int i2 = View.MeasureSpec.getSize(paramInt2);
    int i7 = View.MeasureSpec.getMode(paramInt1);
    int i4 = View.MeasureSpec.getMode(paramInt2);
    int i6 = getWidthPadding();
    int i5 = getHeightPadding();
    measureChildren(paramInt1, paramInt2);
    int i1;
    if (getChildCount() > 0)
    {
      View localView = getChildAt(0);
      paramInt2 = localView.getMeasuredWidth();
      i1 = localView.getMeasuredHeight();
    }
    for (;;)
    {
      switch (i7)
      {
      default: 
        paramInt1 = i3;
        switch (i4)
        {
        default: 
          paramInt2 = i2;
          label147:
          if (i4 == 0) {
            paramInt2 = i5 + i1;
          }
          break;
        }
        break;
      }
      for (;;)
      {
        setMeasuredDimension(paramInt1, paramInt2);
        return;
        paramInt1 = paramInt2 + i6;
        break;
        paramInt1 = paramInt2 + i6 | 0x0;
        break;
        paramInt1 = i3;
        if (i3 >= paramInt2 + i6) {
          break;
        }
        paramInt1 = i3 | 0x1000000;
        break;
        paramInt2 = i1 + i5;
        break label147;
        paramInt2 = i1 + i5 | 0x0;
        break label147;
        paramInt2 = i2;
        if (i2 >= i1 + i5) {
          break label147;
        }
        paramInt2 = i2 | 0x1000000;
        break label147;
        paramInt2 |= 0x0;
      }
      i1 = 0;
      paramInt2 = 0;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.o == null) {
      this.o = VelocityTracker.obtain();
    }
    this.o.addMovement(paramMotionEvent);
    super.onTouchEvent(paramMotionEvent);
    if ((this.c == null) || (this.c.getCount() == 0)) {
      return false;
    }
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    int i1;
    switch (paramMotionEvent.getAction())
    {
    default: 
    case 0: 
    case 2: 
      for (;;)
      {
        return true;
        e();
        if (!this.g.isFinished())
        {
          this.g.abortAnimation();
          f();
        }
        this.r = f1;
        this.p = f1;
        this.q = f2;
        continue;
        i1 = (int)(this.r - f1);
        int i2 = (int)Math.abs(this.p - f1);
        int i3 = (int)Math.abs(this.q - f2);
        if (this.c.getCount() > 1)
        {
          if ((i2 > this.l) && (i2 * 0.5F > i3)) {
            b(true);
          }
          scrollBy(i1, 0);
          b(getScrollX() - getChildWidth());
        }
        this.r = f1;
      }
    }
    if (this.c.getCount() > 1)
    {
      paramMotionEvent = this.o;
      paramMotionEvent.computeCurrentVelocity(1000);
      i1 = (int)paramMotionEvent.getXVelocity();
      if (i1 > b) {
        a(false);
      }
    }
    else
    {
      label284:
      if ((Math.abs(this.p - f1) < this.l) && (Math.abs(this.q - f2) < this.l)) {
        performItemClick(null, this.h, -1L);
      }
      if (this.a)
      {
        if (this.k == null) {
          break label539;
        }
        a(this.k);
      }
    }
    for (;;)
    {
      if (this.o != null)
      {
        this.o.recycle();
        this.o = null;
      }
      this.n = 0;
      break;
      if (i1 < -b)
      {
        a(true);
        break label284;
      }
      i1 = getScrollX() - getChildWidth();
      if (i1 > 0)
      {
        if (Math.abs(i1) > getChildWidth() / 3)
        {
          a(true);
          break label284;
        }
        i1 = getChildWidth() - getScrollX();
        this.g.startScroll(getScrollX(), 0, i1, 0, Math.abs(i1) * 1);
        invalidate();
        break label284;
      }
      if (Math.abs(i1) > getChildWidth() / 3)
      {
        a(false);
        break label284;
      }
      i1 = getChildWidth() - getScrollX();
      this.g.startScroll(getScrollX(), 0, i1, 0, Math.abs(i1) * 1);
      invalidate();
      break label284;
      label539:
      a(this.j);
    }
  }
  
  public void setAdapter(Adapter paramAdapter)
  {
    if (this.c != null)
    {
      this.c.unregisterDataSetObserver(this.d);
      b();
    }
    this.c = paramAdapter;
    if (this.c != null)
    {
      this.d = new d(this);
      this.c.registerDataSetObserver(this.d);
    }
    if ((this.c == null) || (this.c.getCount() == 0)) {}
    for (;;)
    {
      return;
      setSelection(0);
      if (this.a)
      {
        if (this.k == null) {
          break label130;
        }
        a(this.k);
      }
      while (this.s != null)
      {
        this.s.requestLayout();
        this.s.invalidate();
        return;
        label130:
        a(this.j);
      }
    }
  }
  
  public void setFlogTouch(boolean paramBoolean) {}
  
  public void setFlowIndicator(CircleFlowIndicator paramCircleFlowIndicator)
  {
    this.s = paramCircleFlowIndicator;
    this.s.setViewFlow(this);
  }
  
  public void setOnViewSwitchListener(f paramf)
  {
    this.t = paramf;
  }
  
  public void setSelection(int paramInt)
  {
    if (!this.g.isFinished())
    {
      this.g.abortAnimation();
      f();
    }
    if ((this.c == null) || (this.c.getCount() == 0)) {
      return;
    }
    paramInt = Math.min(Math.max(paramInt, 0), this.c.getCount() - 1);
    c();
    this.h = paramInt;
    this.i = 0;
    if (this.c.getCount() > 1)
    {
      if (paramInt == 0)
      {
        a(this.c.getCount() - 1, true);
        a(paramInt, true);
        if (paramInt != this.c.getCount() - 1) {
          break label167;
        }
        a(0, true);
      }
      for (;;)
      {
        requestLayout();
        postDelayed(new b(this), 20L);
        return;
        a(paramInt - 1, true);
        break;
        label167:
        a(paramInt + 1, true);
      }
    }
    a(0, true);
    requestLayout();
    postDelayed(new c(this), 20L);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\flip\ViewFlow.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */