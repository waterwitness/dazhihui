package com.android.dazhihui.ui.delegate.newtrade.widge.kline_widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.view.View;
import com.android.dazhihui.ui.model.stock.StockVo;

public class KlinePeriodView
  extends View
{
  protected Paint a;
  private int b;
  private int c;
  private int d;
  private KlineView e;
  private int f;
  
  public KlinePeriodView(Context paramContext)
  {
    super(paramContext);
    a();
  }
  
  public KlinePeriodView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
  }
  
  public KlinePeriodView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a();
  }
  
  protected void a()
  {
    this.a = new Paint(1);
    this.a.setColor(-1);
    this.a.setStyle(Paint.Style.FILL);
    this.a.setStrokeWidth(2.0F);
    this.b = getResources().getDimensionPixelSize(2131230799);
    this.f = getResources().getDimensionPixelSize(2131230829);
    this.c = this.f;
    this.d = getResources().getDimensionPixelSize(2131230845);
    setBackgroundColor(0);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    paramCanvas.save();
    StockVo localStockVo = this.e.getDataModel();
    localStockVo.getKData();
    int k = localStockVo.getKLineOffset();
    this.e.getScreenIndex();
    int m = this.e.getKLineWidth();
    int i = this.e.getStartDateOffset();
    int n = this.e.getEndDateOffset();
    int j = getPaddingLeft();
    getPaddingTop();
    int i1 = this.b;
    getPaddingBottom();
    i1 = this.c;
    this.e.getKLineViewHeight();
    int i2;
    if ((n != -1) && (n >= k))
    {
      this.a.setColor(-1430208320);
      i1 = this.b;
      i2 = this.e.getKLineViewHeight() + this.e.getMiddleLayoutHeight() + this.e.getParamViewVol();
      float f1;
      if (n <= this.e.getKLineSize() + k)
      {
        f1 = (n - k) * m + j + m;
        paramCanvas.drawLine(f1, i1, f1, i2, this.a);
      }
      if ((i != -1) && (i >= k) && (i <= this.e.getKLineSize() + k))
      {
        f1 = (i - k) * m + j;
        paramCanvas.drawLine(f1, i1, f1, i2, this.a);
      }
      this.a.setColor(1441129957);
      if ((i == -1) || (i < k)) {
        break label349;
      }
    }
    label349:
    for (i = (i - k) * m + j;; i = j)
    {
      j = Math.min((n - k) * m + j + m, this.e.getKLineSize() * m + j);
      paramCanvas.drawRect(i, i1, j, i2, this.a);
      paramCanvas.restore();
      return;
    }
  }
  
  public void setAverageViewHeight(int paramInt)
  {
    this.b = paramInt;
  }
  
  public void setHolder(KlineView paramKlineView)
  {
    this.e = paramKlineView;
  }
  
  public void setRightDistance(int paramInt)
  {
    this.d = paramInt;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\newtrade\widge\kline_widget\KlinePeriodView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */