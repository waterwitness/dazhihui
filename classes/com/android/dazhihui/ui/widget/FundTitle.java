package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import com.android.dazhihui.d.a;

public class FundTitle
  extends View
{
  private static final String[] n = { "累计净值", "" };
  private static final String[] o = { "(百)万份收益", "七日收益率" };
  Paint a = new Paint(1);
  private String[] b = null;
  private Bitmap c = null;
  private Bitmap d = null;
  private int e;
  private int f;
  private int g;
  private int h;
  private int i;
  private int j;
  private int k;
  private ds l = null;
  private boolean m;
  
  public FundTitle(Context paramContext)
  {
    this(paramContext, null, 0);
  }
  
  public FundTitle(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public FundTitle(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = paramContext.getResources();
    this.f = paramContext.getDimensionPixelSize(2131231142);
    this.g = paramContext.getDimensionPixelSize(2131231138);
    this.h = paramContext.getDimensionPixelSize(2131231139);
    this.k = paramContext.getDimensionPixelSize(2131231140);
    this.c = Bitmap.createBitmap(BitmapFactory.decodeResource(paramContext, 2130838316));
    this.d = a.a(this.c, 180);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    String[] arrayOfString = n;
    if (this.m) {
      arrayOfString = o;
    }
    for (;;)
    {
      this.e = this.c.getWidth();
      int i1 = (this.i - this.e * 2) / 2;
      int i2 = (this.j - this.c.getHeight()) / 2;
      if (this.b[1].contains("-")) {
        this.a.setColor(-15878144);
      }
      for (;;)
      {
        this.a.setTextSize(this.f);
        this.a.setFakeBoldText(true);
        this.a.setTypeface(Typeface.DEFAULT_BOLD);
        a.a(this.c, 4, i2, paramCanvas);
        a.a(this.d, this.i - this.e - 4, i2, paramCanvas);
        a.a(this.b[0], this.i / 2, 4, Paint.Align.RIGHT, paramCanvas, this.a);
        this.a.setTextSize(this.g);
        a.a(this.b[1], this.i / 2, this.j - this.g - 4, Paint.Align.RIGHT, paramCanvas, this.a);
        i1 = (i1 - a.b(this.b[2], this.h) - a.b(arrayOfString[0], this.h)) / 3;
        this.a.setColor(-1);
        this.a.setTextSize(this.h);
        this.a.setFakeBoldText(false);
        this.a.setTypeface(Typeface.DEFAULT);
        a.a(arrayOfString[0], this.i / 2 + i1, this.f + 4 - this.h, Paint.Align.LEFT, paramCanvas, this.a);
        a.a(arrayOfString[1], this.i / 2 + i1, this.j - this.h - 4, Paint.Align.LEFT, paramCanvas, this.a);
        a.a(this.b[2], this.i - i1 - this.e, this.f + 4 - this.h, Paint.Align.RIGHT, paramCanvas, this.a);
        a.a(this.b[3], this.i - i1 - this.e, this.j - this.h - 4, Paint.Align.RIGHT, paramCanvas, this.a);
        return;
        this.a.setColor(-2293760);
      }
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getSize(paramInt1);
    int i2 = View.MeasureSpec.getMode(paramInt2);
    paramInt1 = View.MeasureSpec.getSize(paramInt2);
    if (i2 == 1073741824) {}
    for (;;)
    {
      setMeasuredDimension(i1, paramInt1);
      return;
      paramInt1 = Math.min(this.k, paramInt1);
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    this.i = paramInt1;
    this.j = paramInt2;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool2 = true;
    int i1 = paramMotionEvent.getAction();
    int i2 = (int)paramMotionEvent.getX();
    int i3 = (int)paramMotionEvent.getY();
    boolean bool1;
    switch (i1)
    {
    default: 
      bool1 = super.onTouchEvent(paramMotionEvent);
    }
    do
    {
      do
      {
        do
        {
          do
          {
            return bool1;
            if ((4 > i2) || (i2 > this.e)) {
              break;
            }
            bool1 = bool2;
          } while (this.l == null);
          this.l.a(1);
          return true;
          bool1 = bool2;
        } while (i2 < this.i - 4 - this.e);
        bool1 = bool2;
      } while (i2 > this.i - 4);
      bool1 = bool2;
    } while (this.l == null);
    this.l.a(0);
    return true;
  }
  
  public void setCallback(ds paramds)
  {
    this.l = paramds;
  }
  
  public void setCurrency(boolean paramBoolean)
  {
    this.m = paramBoolean;
  }
  
  public void setFundData(String[] paramArrayOfString)
  {
    this.b = paramArrayOfString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\FundTitle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */