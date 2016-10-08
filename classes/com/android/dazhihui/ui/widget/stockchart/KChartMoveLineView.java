package com.android.dazhihui.ui.widget.stockchart;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.view.View;
import com.android.dazhihui.ui.model.stock.StockVo;

public class KChartMoveLineView
  extends View
{
  protected Paint a;
  private int b;
  private int c;
  private int d;
  private KChartContainer e;
  private int f;
  
  public KChartMoveLineView(Context paramContext)
  {
    super(paramContext);
    a();
  }
  
  public KChartMoveLineView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
  }
  
  public KChartMoveLineView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a();
  }
  
  private int a(long paramLong1, long paramLong2, int paramInt1, int paramInt2)
  {
    return (int)(paramInt2 - 1 - (paramInt2 - 1) * paramLong1 / paramLong2) + paramInt1;
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
    this.a.setColor(this.e.getMoveLineColor());
    Object localObject = this.e.getDataModel();
    int[][] arrayOfInt = ((StockVo)localObject).getKData();
    int i = ((StockVo)localObject).getKLineOffset();
    int j = this.e.getScreenIndex();
    int i3 = this.e.getKLineWidth();
    localObject = this.e.getAvgPrice();
    int k = getPaddingLeft();
    int m = getPaddingTop() + this.b;
    int n = getPaddingBottom();
    int i1 = this.c;
    long l1 = this.e.getKLineViewMaxValue();
    long l2 = this.e.getKLineViewMinValue();
    int i2 = this.e.getKLineViewHeight();
    if ((j != -1) && (localObject != null) && (arrayOfInt != null))
    {
      float f1 = i3 / 2 + (j * i3 + k);
      paramCanvas.drawLine(f1, this.b, f1, this.e.getKLineViewHeight(), this.a);
      i3 = this.e.getKLineViewHeight() + this.e.getMiddleLayoutHeight();
      paramCanvas.drawLine(f1, i3, f1, this.e.getParamsViewHeight() + i3, this.a);
      if ((this.e.getKLinePeriodValue() == 7) && (getResources().getConfiguration().orientation == 1))
      {
        i3 = this.e.getParamsViewHeight() + i3;
        paramCanvas.drawLine(f1, i3, f1, i3 + this.e.getDDEViewHeight(), this.a);
      }
      j += i;
      i = j;
      if (j > localObject.length - 1) {
        i = localObject.length - 1;
      }
      if ((i < 0) || (i >= arrayOfInt.length)) {
        return;
      }
      i = a(arrayOfInt[i][4] - l2, l1 - l2, m, i2 - m - (n + i1));
      paramCanvas.drawLine(k + 1, i, getWidth() - this.d - 1, i, this.a);
    }
    paramCanvas.restore();
  }
  
  public void setAverageViewHeight(int paramInt)
  {
    this.b = paramInt;
  }
  
  public void setHolder(KChartContainer paramKChartContainer)
  {
    this.e = paramKChartContainer;
  }
  
  public void setRightDistance(int paramInt)
  {
    this.d = paramInt;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\KChartMoveLineView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */