package com.android.dazhihui.ui.widget.flip;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Scroller;
import java.util.LinkedList;

public class ViewUpFlow
  extends AdapterView<Adapter>
{
  public static int b = 600;
  public boolean a = false;
  private Adapter c;
  private j d;
  private LinkedList<View> e;
  private LinkedList<View> f;
  private Scroller g;
  private int h = -1;
  private int i = 0;
  private int j = 5000;
  private int k = 0;
  private Handler l = new g(this);
  private int m = 0;
  private VelocityTracker n = null;
  private float o = 0.0F;
  private float p = 0.0F;
  private float q = 0.0F;
  private CircleFlowIndicator r;
  private l s;
  
  public ViewUpFlow(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ViewUpFlow(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    c();
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
  
  private void a(int paramInt1, int paramInt2)
  {
    if (this.r != null)
    {
      float f1 = paramInt2 / getChildWidth();
      this.r.a(paramInt1, f1);
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
  
  private void c()
  {
    this.e = new LinkedList();
    this.f = new LinkedList();
    this.g = new Scroller(getContext());
    this.k = ViewConfiguration.get(getContext()).getScaledTouchSlop();
  }
  
  private void d()
  {
    if (this.l != null) {
      this.l.removeMessages(0);
    }
  }
  
  private void e()
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
        scrollTo(0, getChildHeight());
        b(0);
        if (this.s != null) {
          this.s.a(null, this.h);
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
      scrollTo(0, getChildHeight());
      b(0);
      if (this.s != null) {
        this.s.a(null, this.h);
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
    d();
    if (!this.g.isFinished()) {
      this.g.abortAnimation();
    }
    this.h = -1;
    this.i = 0;
    b();
    this.f.clear();
    removeAllViewsInLayout();
    requestLayout();
    invalidate();
  }
  
  public void a(int paramInt)
  {
    this.a = true;
    this.j = paramInt;
    if ((this.c == null) || (this.c.getCount() < 2)) {}
    while (this.l == null) {
      return;
    }
    this.l.removeMessages(0);
    this.l.sendMessageDelayed(this.l.obtainMessage(0), this.j);
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
      e();
    }
    if ((this.c == null) || (this.c.getCount() < 2)) {
      return;
    }
    int i1 = this.c.getCount();
    if (paramBoolean)
    {
      i1 = getChildHeight() * 2 - getScrollY();
      if (this.h == this.c.getCount() - 1) {}
      for (this.h = 0;; this.h += 1)
      {
        this.i = 1;
        this.g.startScroll(0, getScrollY(), 0, i1, Math.abs(i1) * 5);
        invalidate();
        return;
      }
    }
    if (this.h == 0) {}
    for (this.h = (i1 - 1);; this.h -= 1)
    {
      i1 = 0 - getScrollY();
      this.i = -1;
      this.g.startScroll(0, getScrollY(), 0, i1, Math.abs(i1) * 5);
      break;
    }
  }
  
  protected void b()
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
        a(this.h - 1, this.g.getCurrY() - getChildHeight());
      }
      for (;;)
      {
        postInvalidate();
        return;
        if (this.i < 0) {
          a(this.h + 1, this.g.getCurrY() - getChildHeight());
        } else {
          b(this.g.getCurrY() - getChildHeight());
        }
      }
    }
    e();
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
    a();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt1 = getPaddingTop();
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
        paramInt3 = localView.getMeasuredHeight();
        localView.layout(getPaddingLeft(), paramInt2, getPaddingLeft() + localView.getMeasuredWidth(), paramInt2 + paramInt3);
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
  
  public void setAdapter(Adapter paramAdapter)
  {
    if (this.c != null)
    {
      this.c.unregisterDataSetObserver(this.d);
      a();
    }
    this.c = paramAdapter;
    if (this.c != null)
    {
      this.d = new j(this);
      this.c.registerDataSetObserver(this.d);
    }
    if ((this.c == null) || (this.c.getCount() == 0)) {}
    do
    {
      return;
      setSelection(0);
      if (this.a) {
        a(this.j);
      }
    } while (this.r == null);
    this.r.requestLayout();
    this.r.invalidate();
  }
  
  public void setOnViewSwitchListener(l paraml)
  {
    this.s = paraml;
  }
  
  public void setSelection(int paramInt)
  {
    if (!this.g.isFinished())
    {
      this.g.abortAnimation();
      e();
    }
    if ((this.c == null) || (this.c.getCount() == 0)) {
      return;
    }
    paramInt = Math.min(Math.max(paramInt, 0), this.c.getCount() - 1);
    b();
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
        postDelayed(new h(this), 20L);
        return;
        a(paramInt - 1, true);
        break;
        label167:
        a(paramInt + 1, true);
      }
    }
    a(0, true);
    requestLayout();
    postDelayed(new i(this), 20L);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\flip\ViewUpFlow.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */