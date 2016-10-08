package com.android.dazhihui.ui.widget.stockchart;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.android.dazhihui.d.b;
import com.android.dazhihui.ui.model.stock.StockVo;

public class KChartAverageView
  extends View
{
  protected Paint a;
  private KChartContainer b;
  private StockVo c;
  private int d;
  private Rect e = new Rect();
  private int f;
  
  public KChartAverageView(Context paramContext)
  {
    super(paramContext);
    a();
  }
  
  public KChartAverageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
  }
  
  public KChartAverageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a();
  }
  
  private void a(Canvas paramCanvas)
  {
    Object localObject = this.b.getAvgPrice();
    int[] arrayOfInt1 = this.b.getAvgsColors();
    int[] arrayOfInt2 = this.b.getMAs();
    this.c = this.b.getDataModel();
    if ((localObject == null) || (this.c == null)) {
      return;
    }
    int i = localObject.length - 1;
    if (this.b.getScreenIndex() != -1) {
      i = this.b.getScreenIndex() + this.c.getKLineOffset();
    }
    int j = i;
    if (i > localObject.length - 1) {
      j = localObject.length - 1;
    }
    localObject = localObject[j];
    i = getWidth();
    int m = arrayOfInt2.length;
    this.a.getTextBounds("MA", 0, "MA".length(), this.e);
    int n = (int)(this.e.width() * 1.5D);
    int i1 = (i - n) / m;
    long l1 = localObject[0];
    int k = localObject.length;
    i = 0;
    label180:
    if (i < k)
    {
      long l2 = localObject[i];
      if (l1 >= l2) {
        break label639;
      }
      l1 = l2;
    }
    label465:
    label586:
    label639:
    for (;;)
    {
      i += 1;
      break label180;
      StringBuffer localStringBuffer = new StringBuffer();
      localStringBuffer.append("10:" + az.b((int)b.a(l1), this.c.getmDecimalLen()));
      k = this.d;
      this.a.setTypeface(Typeface.DEFAULT);
      this.a.setFakeBoldText(false);
      this.a.setTextSize(k);
      this.a.getTextBounds(localStringBuffer.toString(), 0, localStringBuffer.length(), this.e);
      for (i = this.e.width(); i >= i1; i = this.e.width())
      {
        k -= 2;
        this.a.setTextSize(k);
        this.a.getTextBounds(localStringBuffer.toString(), 0, localStringBuffer.length(), this.e);
      }
      this.a.setTextAlign(Paint.Align.LEFT);
      this.a.setColor(arrayOfInt1[0]);
      k = getHeight() - 2 - k >> 1;
      paramCanvas.drawText("MA", 2, k - this.a.getFontMetrics().ascent, this.a);
      int i2 = i1 / 2;
      this.a.setTextAlign(Paint.Align.CENTER);
      i = 0;
      if (i < m)
      {
        localStringBuffer = new StringBuffer();
        if (j + 1 >= arrayOfInt2[i]) {
          break label586;
        }
        localStringBuffer.append(arrayOfInt2[i] + ":" + "--");
      }
      for (;;)
      {
        this.a.setColor(arrayOfInt1[i]);
        paramCanvas.drawText(localStringBuffer.toString(), i1 * i + (2 + (i2 + n)), k - this.a.getFontMetrics().ascent, this.a);
        i += 1;
        break label465;
        break;
        localStringBuffer.append(arrayOfInt2[i] + ":" + az.b((int)b.a(localObject[i]), this.c.getmDecimalLen()));
      }
    }
  }
  
  protected void a()
  {
    this.a = new Paint(1);
    this.d = getResources().getDimensionPixelSize(2131231088);
    this.a.setTextSize(this.d);
    this.f = getResources().getDimensionPixelSize(2131230774);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    paramCanvas.save();
    if (this.b != null) {
      a(paramCanvas);
    }
    paramCanvas.restore();
  }
  
  public void setHolder(KChartContainer paramKChartContainer)
  {
    this.b = paramKChartContainer;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\KChartAverageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */