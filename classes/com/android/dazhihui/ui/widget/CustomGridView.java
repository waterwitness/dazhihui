package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.GridView;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.screen.y;

public class CustomGridView
  extends GridView
{
  private Drawable a;
  private Drawable b;
  private Drawable c;
  private int d;
  private int e;
  private boolean f = false;
  
  public CustomGridView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public CustomGridView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public CustomGridView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.d = paramContext.getResources().getDimensionPixelOffset(2131230837);
    this.e = g.a().m();
    this.a = paramContext.getResources().getDrawable(2130838703);
    this.b = getContext().getResources().getDrawable(2130838703);
    this.c = getContext().getResources().getDrawable(2130838789);
  }
  
  public void a(y paramy)
  {
    if ((paramy != null) && (getContext() != null)) {}
    switch (bd.a[paramy.ordinal()])
    {
    default: 
      return;
    case 1: 
      this.a = this.b;
      setSelector(2130838704);
      postInvalidate();
      return;
    }
    this.a = this.c;
    setSelector(2130838790);
    postInvalidate();
  }
  
  protected void dispatchDraw(Canvas paramCanvas)
  {
    super.dispatchDraw(paramCanvas);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int m;
    int j;
    View localView;
    int n;
    int k;
    int i;
    try
    {
      m = getChildCount();
      j = 0;
    }
    catch (Exception paramCanvas)
    {
      label117:
      paramCanvas.printStackTrace();
    }
    if ((j != 3) && (j != 0))
    {
      localView = getChildAt(j);
      if ((localView != null) && (this.a != null))
      {
        n = localView.getLeft();
        k = (int)(localView.getMeasuredHeight() * 0.25D);
        i = k;
        if (k <= 0) {
          i = 50;
        }
        if (this.f) {
          i = 0;
        }
        this.a.setBounds(n, localView.getTop() + i, n + 1, localView.getBottom() - i);
        this.a.draw(paramCanvas);
      }
      if (j != 3) {
        break label304;
      }
      localView = getChildAt(j);
      if ((localView == null) || (this.a == null)) {
        break label304;
      }
      i = localView.getTop() - this.d / 2;
      this.a.setBounds(0, i, this.e, i + 1);
      this.a.draw(paramCanvas);
    }
    label304:
    label311:
    for (;;)
    {
      return;
      if (m >= 5) {
        break label117;
      }
      localView = getChildAt(j);
      if ((localView == null) || (this.a == null)) {
        break label117;
      }
      n = localView.getRight();
      k = (int)(localView.getMeasuredHeight() * 0.25D);
      i = k;
      if (k <= 0) {
        i = 50;
      }
      if (this.f) {
        i = 0;
      }
      this.a.setBounds(localView.getRight(), localView.getTop() + i, n + 1, localView.getBottom() - i);
      this.a.draw(paramCanvas);
      break label117;
      for (;;)
      {
        if (j >= m) {
          break label311;
        }
        if ((j != 0) || (m <= 1)) {
          break;
        }
        j += 1;
      }
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
  }
  
  public void setFullDivider(boolean paramBoolean)
  {
    this.f = paramBoolean;
    postInvalidate();
  }
  
  public void setWhiteDrawable(Drawable paramDrawable)
  {
    this.c = paramDrawable;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\CustomGridView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */