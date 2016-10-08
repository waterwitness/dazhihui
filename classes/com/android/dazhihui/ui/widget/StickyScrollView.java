package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AlphaAnimation;
import android.widget.ScrollView;
import com.android.dazhihui.f;
import java.util.ArrayList;
import java.util.Iterator;

public class StickyScrollView
  extends ScrollView
{
  private ArrayList<View> a = new ArrayList();
  private View b;
  private float c;
  private int d;
  private boolean e;
  private boolean f;
  private boolean g;
  private int h;
  private Drawable i;
  private final Runnable j = new ky(this);
  private boolean k = true;
  
  public StickyScrollView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public StickyScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16842880);
  }
  
  public StickyScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, f.StickyScrollView, paramInt, 0);
    this.h = paramAttributeSet.getDimensionPixelSize(0, (int)(paramContext.getResources().getDisplayMetrics().density * 10.0F + 0.5F));
    paramInt = paramAttributeSet.getResourceId(1, -1);
    if (paramInt != -1) {
      this.i = paramContext.getResources().getDrawable(paramInt);
    }
    paramAttributeSet.recycle();
  }
  
  private int a(View paramView)
  {
    int m = paramView.getLeft();
    while (paramView.getParent() != getChildAt(0))
    {
      paramView = (View)paramView.getParent();
      m += paramView.getLeft();
    }
    return m;
  }
  
  private void a()
  {
    Object localObject1 = null;
    Iterator localIterator = this.a.iterator();
    Object localObject2 = null;
    View localView;
    int n;
    int i1;
    int m;
    label59:
    int i2;
    if (localIterator.hasNext())
    {
      localView = (View)localIterator.next();
      n = b(localView);
      i1 = getScrollY();
      if (this.f)
      {
        m = 0;
        n = n - i1 + m;
        if (n > 0) {
          break label138;
        }
        if (localObject2 != null)
        {
          i1 = b((View)localObject2);
          i2 = getScrollY();
          if (!this.f) {
            break label129;
          }
          m = 0;
          label101:
          if (n <= m + (i1 - i2)) {
            break label308;
          }
        }
        localObject2 = localView;
      }
    }
    label129:
    label138:
    label184:
    label308:
    for (;;)
    {
      break;
      m = getPaddingTop();
      break label59;
      m = getPaddingTop();
      break label101;
      if (localObject1 != null)
      {
        i1 = b((View)localObject1);
        i2 = getScrollY();
        if (!this.f) {
          break label184;
        }
        m = 0;
      }
      for (;;)
      {
        if (n < m + (i1 - i2))
        {
          localObject1 = localView;
          break;
          m = getPaddingTop();
          continue;
          if (localObject2 != null) {
            if (localObject1 == null)
            {
              f1 = 0.0F;
              this.c = f1;
              if (localObject2 != this.b)
              {
                if (this.b != null) {
                  b();
                }
                this.d = a((View)localObject2);
                e((View)localObject2);
              }
            }
          }
          while (this.b == null)
          {
            float f1;
            return;
            n = b((View)localObject1);
            i1 = getScrollY();
            if (this.f) {}
            for (m = 0;; m = getPaddingTop())
            {
              f1 = Math.min(0, m + (n - i1) - ((View)localObject2).getHeight());
              break;
            }
          }
          b();
          return;
        }
      }
    }
  }
  
  private int b(View paramView)
  {
    int m = paramView.getTop();
    while (paramView.getParent() != getChildAt(0))
    {
      paramView = (View)paramView.getParent();
      m += paramView.getTop();
    }
    return m;
  }
  
  private void b()
  {
    if (g(this.b).contains("-hastransparancy")) {
      i(this.b);
    }
    this.b = null;
    removeCallbacks(this.j);
  }
  
  private int c(View paramView)
  {
    int m = paramView.getRight();
    while (paramView.getParent() != getChildAt(0))
    {
      paramView = (View)paramView.getParent();
      m += paramView.getRight();
    }
    return m;
  }
  
  private void c()
  {
    if (this.b != null) {
      b();
    }
    this.a.clear();
    f(getChildAt(0));
    a();
    invalidate();
  }
  
  private int d(View paramView)
  {
    int m = paramView.getBottom();
    while (paramView.getParent() != getChildAt(0))
    {
      paramView = (View)paramView.getParent();
      m += paramView.getBottom();
    }
    return m;
  }
  
  private void e(View paramView)
  {
    this.b = paramView;
    if (g(this.b).contains("-hastransparancy")) {
      h(this.b);
    }
    if (((String)this.b.getTag()).contains("-nonconstant")) {
      post(this.j);
    }
  }
  
  private void f(View paramView)
  {
    String str;
    if ((paramView instanceof ViewGroup))
    {
      paramView = (ViewGroup)paramView;
      int m = 0;
      if (m < paramView.getChildCount())
      {
        str = g(paramView.getChildAt(m));
        if ((str != null) && (str.contains("sticky"))) {
          this.a.add(paramView.getChildAt(m));
        }
        for (;;)
        {
          m += 1;
          break;
          if ((paramView.getChildAt(m) instanceof ViewGroup)) {
            f(paramView.getChildAt(m));
          }
        }
      }
    }
    else
    {
      str = (String)paramView.getTag();
      if ((str != null) && (str.contains("sticky"))) {
        this.a.add(paramView);
      }
    }
  }
  
  private String g(View paramView)
  {
    return String.valueOf(paramView.getTag());
  }
  
  private void h(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      paramView.setAlpha(0.0F);
      return;
    }
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(1.0F, 0.0F);
    localAlphaAnimation.setDuration(0L);
    localAlphaAnimation.setFillAfter(true);
    paramView.startAnimation(localAlphaAnimation);
  }
  
  private void i(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      paramView.setAlpha(1.0F);
      return;
    }
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(0.0F, 1.0F);
    localAlphaAnimation.setDuration(0L);
    localAlphaAnimation.setFillAfter(true);
    paramView.startAnimation(localAlphaAnimation);
  }
  
  public void addView(View paramView)
  {
    super.addView(paramView);
    f(paramView);
  }
  
  public void addView(View paramView, int paramInt)
  {
    super.addView(paramView, paramInt);
    f(paramView);
  }
  
  public void addView(View paramView, int paramInt1, int paramInt2)
  {
    super.addView(paramView, paramInt1, paramInt2);
    f(paramView);
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.addView(paramView, paramInt, paramLayoutParams);
    f(paramView);
  }
  
  public void addView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.addView(paramView, paramLayoutParams);
    f(paramView);
  }
  
  protected void dispatchDraw(Canvas paramCanvas)
  {
    super.dispatchDraw(paramCanvas);
    float f1;
    int m;
    if (this.b != null)
    {
      paramCanvas.save();
      f1 = getPaddingLeft() + this.d;
      float f2 = getScrollY();
      float f3 = this.c;
      if (!this.f) {
        break label254;
      }
      m = getPaddingTop();
      paramCanvas.translate(f1, m + (f3 + f2));
      if (!this.f) {
        break label260;
      }
      f1 = -this.c;
      label79:
      paramCanvas.clipRect(0.0F, f1, getWidth() - this.d, this.b.getHeight() + this.h + 1);
      if (this.i != null)
      {
        m = this.b.getWidth();
        int n = this.b.getHeight();
        int i1 = this.b.getHeight();
        int i2 = this.h;
        this.i.setBounds(0, n, m, i1 + i2);
        this.i.draw(paramCanvas);
      }
      if (!this.f) {
        break label265;
      }
      f1 = -this.c;
      label189:
      paramCanvas.clipRect(0.0F, f1, getWidth(), this.b.getHeight());
      if (!g(this.b).contains("-hastransparancy")) {
        break label270;
      }
      i(this.b);
      this.b.draw(paramCanvas);
      h(this.b);
    }
    for (;;)
    {
      paramCanvas.restore();
      return;
      label254:
      m = 0;
      break;
      label260:
      f1 = 0.0F;
      break label79;
      label265:
      f1 = 0.0F;
      break label189;
      label270:
      this.b.draw(paramCanvas);
    }
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool2 = true;
    if (paramMotionEvent.getAction() == 0) {
      this.e = true;
    }
    boolean bool1;
    if (this.e) {
      if (this.b != null)
      {
        bool1 = true;
        this.e = bool1;
        if (this.e)
        {
          if ((paramMotionEvent.getY() > this.b.getHeight() + this.c) || (paramMotionEvent.getX() < a(this.b)) || (paramMotionEvent.getX() > c(this.b))) {
            break label151;
          }
          bool1 = bool2;
          label99:
          this.e = bool1;
        }
      }
    }
    for (;;)
    {
      if (this.e) {
        paramMotionEvent.offsetLocation(0.0F, -1.0F * (getScrollY() + this.c - b(this.b)));
      }
      return super.dispatchTouchEvent(paramMotionEvent);
      bool1 = false;
      break;
      label151:
      bool1 = false;
      break label99;
      if (this.b == null) {
        this.e = false;
      }
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (!this.g) {
      this.f = true;
    }
    c();
  }
  
  protected void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    a();
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.e) {
      paramMotionEvent.offsetLocation(0.0F, getScrollY() + this.c - b(this.b));
    }
    if (paramMotionEvent.getAction() == 0) {
      this.k = false;
    }
    if (this.k)
    {
      MotionEvent localMotionEvent = MotionEvent.obtain(paramMotionEvent);
      localMotionEvent.setAction(0);
      super.onTouchEvent(localMotionEvent);
      this.k = false;
    }
    if ((paramMotionEvent.getAction() == 1) || (paramMotionEvent.getAction() == 3)) {
      this.k = true;
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void setClipToPadding(boolean paramBoolean)
  {
    super.setClipToPadding(paramBoolean);
    this.f = paramBoolean;
    this.g = true;
  }
  
  public void setShadowHeight(int paramInt)
  {
    this.h = paramInt;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\StickyScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */