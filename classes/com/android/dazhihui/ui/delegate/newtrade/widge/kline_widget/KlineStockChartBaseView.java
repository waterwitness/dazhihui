package com.android.dazhihui.ui.delegate.newtrade.widge.kline_widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.View;

public abstract class KlineStockChartBaseView
  extends View
{
  protected Paint a;
  protected int b;
  public int c = 1;
  public int d = getResources().getDimensionPixelOffset(2131230820);
  private boolean e = false;
  
  public KlineStockChartBaseView(Context paramContext)
  {
    super(paramContext);
    a();
  }
  
  public KlineStockChartBaseView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
  }
  
  public KlineStockChartBaseView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a();
  }
  
  protected void a()
  {
    this.a = new Paint(1);
  }
  
  protected void a(int paramInt1, int paramInt2)
  {
    this.b = getResources().getColor(2131493297);
    this.e = false;
    if ((paramInt1 > 0) && (paramInt2 > 0)) {}
    try
    {
      Bitmap localBitmap = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
      a(new Canvas(localBitmap));
      setBackgroundDrawable(new BitmapDrawable(localBitmap));
      this.e = true;
      return;
    }
    catch (Exception localException)
    {
      this.e = false;
      localException.printStackTrace();
    }
  }
  
  protected abstract void a(Canvas paramCanvas);
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (!this.e) {
      a(paramCanvas);
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (getResources().getConfiguration().orientation == 1) {}
    for (this.c = 1;; this.c = 2)
    {
      a(paramInt1, paramInt2);
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\newtrade\widge\kline_widget\KlineStockChartBaseView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */