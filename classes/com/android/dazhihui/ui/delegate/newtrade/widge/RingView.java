package com.android.dazhihui.ui.delegate.newtrade.widge;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.android.dazhihui.d.a;
import com.android.dazhihui.d.n;
import java.math.BigDecimal;
import java.text.NumberFormat;

public class RingView
  extends View
{
  private Paint a = new Paint(1);
  private float b = 0.0F;
  private int c;
  private int d;
  private int e;
  private int f;
  private boolean g = true;
  
  public RingView(Context paramContext)
  {
    super(paramContext);
    a();
  }
  
  public RingView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
  }
  
  private void a()
  {
    this.c = getResources().getColor(2131492972);
    this.e = getResources().getDimensionPixelOffset(2131230838);
    this.f = getResources().getDimensionPixelOffset(2131230844);
    this.d = this.c;
  }
  
  public void a(float paramFloat, int paramInt)
  {
    this.b = paramFloat;
    this.d = paramInt;
    invalidate();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (getWidth() == 0) {
      return;
    }
    this.a.setAntiAlias(true);
    this.a.setStyle(Paint.Style.STROKE);
    this.a.setStrokeWidth(this.f);
    this.a.setColor(this.d);
    float f2;
    float f1;
    if (this.b == 0.0F)
    {
      f2 = 360.0F;
      f1 = 0.0F;
      localObject = new RectF((getWidth() - this.e) / 2, (getHeight() - this.e) / 2, (getWidth() - this.e) / 2 + this.e, (getHeight() - this.e) / 2 + this.e);
      paramCanvas.rotate(-90.0F, getWidth() / 2, getHeight() / 2);
      paramCanvas.drawArc((RectF)localObject, 0.0F, f1, false, this.a);
      if (f1 < 360.0F)
      {
        this.a.setColor(this.c);
        paramCanvas.drawArc((RectF)localObject, f1, f2, false, this.a);
      }
      paramCanvas.rotate(90.0F, getWidth() / 2, getHeight() / 2);
      paramCanvas.save();
      paramCanvas.restore();
      this.a.setTextSize(getResources().getDimensionPixelSize(2131230895));
      this.a.setStrokeWidth(getResources().getDimension(2131230773));
      this.a.setStyle(Paint.Style.FILL);
      this.a.setColor(this.d);
      this.a.setTextAlign(Paint.Align.CENTER);
      localObject = NumberFormat.getPercentInstance();
      ((NumberFormat)localObject).setMaximumFractionDigits(0);
      if (!this.g) {
        break label413;
      }
    }
    label413:
    for (Object localObject = ((NumberFormat)localObject).format(this.b);; localObject = new BigDecimal(this.b).setScale(0, 4).toString() + "天")
    {
      int i = a.a((String)localObject, getResources().getDimensionPixelSize(2131230895));
      f1 = getWidth() / 2;
      int j = getHeight() / 2;
      paramCanvas.drawText((String)localObject, f1, i / 2 + j, this.a);
      return;
      f1 = n.j(this.b + "", "360").floatValue();
      f2 = 360.0F - f1;
      break;
    }
  }
  
  public void setPercentFlag(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\newtrade\widge\RingView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */