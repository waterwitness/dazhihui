package com.android.dazhihui.ui.widget.stockchart;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.view.View;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.screen.y;

public class CustomProgressBar
  extends View
{
  private int a;
  private Paint b = new Paint();
  private int c;
  private int d;
  private int e;
  private int f;
  private int g;
  private Context h;
  
  public CustomProgressBar(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }
  
  public CustomProgressBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  public CustomProgressBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }
  
  private void a(Context paramContext)
  {
    this.h = paramContext;
    this.e = -409087;
    this.f = -608000;
    this.g = paramContext.getResources().getColor(2131493677);
    a(g.a().b());
  }
  
  public void a(y paramy)
  {
    if (paramy == y.a)
    {
      this.e = -409087;
      this.f = -409087;
      this.g = this.h.getResources().getColor(2131493677);
      return;
    }
    this.e = -608000;
    this.f = -608000;
    this.g = this.h.getResources().getColor(2131492903);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    this.b.setStyle(Paint.Style.STROKE);
    this.b.setColor(this.e);
    paramCanvas.drawRect(0.0F, 0.0F, this.c, this.d, this.b);
    int i = (int)(1.0F * this.a / 100.0F * this.c);
    this.b.setStyle(Paint.Style.FILL);
    this.b.setColor(this.f);
    paramCanvas.drawRect(0.0F, 0.0F, i, this.d, this.b);
    this.b.setColor(this.g);
    this.b.setStyle(Paint.Style.STROKE);
    this.b.setTextAlign(Paint.Align.CENTER);
    this.b.setTextSize(this.d - 4);
    float f2 = this.b.getFontMetrics().bottom;
    float f3 = this.b.getFontMetrics().top;
    float f1 = this.d;
    f2 = (this.d - (f2 - f3)) / 2.0F;
    f3 = this.b.getFontMetrics().bottom;
    paramCanvas.drawText(this.a + "%", this.c / 2, f1 - f2 - f3, this.b);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    this.c = paramInt1;
    this.d = paramInt2;
  }
  
  public void setProgress(int paramInt)
  {
    this.a = paramInt;
    postInvalidate();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\CustomProgressBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */