package com.iflytek.thirdparty;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.MeasureSpec;

public class ar
  extends View
{
  Path a;
  private Drawable b;
  private Drawable c;
  private PaintFlagsDrawFilter d = new PaintFlagsDrawFilter(1, 2);
  
  public ar(Context paramContext)
  {
    super(paramContext);
    try
    {
      this.b = an.a(getContext(), "voice_empty");
      this.c = an.a(getContext(), "voice_full");
      this.b.setBounds(new Rect(-this.b.getIntrinsicWidth() / 2, -this.b.getIntrinsicHeight() / 2, this.b.getIntrinsicWidth() / 2, this.b.getIntrinsicHeight() / 2));
      this.c.setBounds(new Rect(-this.c.getIntrinsicWidth() / 2, -this.c.getIntrinsicHeight() / 2, this.c.getIntrinsicWidth() / 2, this.c.getIntrinsicHeight() / 2));
      this.a = new Path();
      a(0);
      return;
    }
    catch (Exception paramContext)
    {
      X.a(paramContext);
    }
  }
  
  public void a(int paramInt)
  {
    this.a.reset();
    this.a.addCircle(0.0F, 0.0F, this.b.getIntrinsicWidth() * paramInt / 12, Path.Direction.CCW);
  }
  
  public void finalize()
  {
    this.b = null;
    this.c = null;
    super.finalize();
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    paramCanvas.save();
    paramCanvas.setDrawFilter(this.d);
    paramCanvas.translate(getWidth() / 2, getHeight() / 2);
    this.b.draw(paramCanvas);
    paramCanvas.clipPath(this.a);
    this.c.draw(paramCanvas);
    paramCanvas.restore();
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    int j = View.MeasureSpec.getSize(paramInt1);
    int i = View.MeasureSpec.getSize(paramInt2);
    Drawable localDrawable = getBackground();
    if (localDrawable != null)
    {
      j = localDrawable.getMinimumWidth();
      i = localDrawable.getMinimumHeight();
    }
    setMeasuredDimension(resolveSize(j, paramInt1), resolveSize(i, paramInt2));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */