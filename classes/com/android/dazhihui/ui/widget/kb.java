package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import com.android.dazhihui.d.a;

public class kb
  extends View
{
  private int a;
  private int b;
  private int c;
  private int d;
  private int e;
  
  public kb(Context paramContext)
  {
    super(paramContext);
  }
  
  public void a()
  {
    setVisibility(0);
    this.a = 0;
    postInvalidate();
  }
  
  public void b()
  {
    this.a = 100;
    postInvalidate();
    postDelayed(new kc(this), 300L);
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    paramCanvas.save();
    a.c(this.b, this.c, this.d, this.e, paramCanvas);
    a.b(this.b, this.c, this.d, this.e, 0, paramCanvas);
    a.b(this.b - 6, this.c, this.d * (this.a * 100 / 100) / 100, this.e, -16097026, paramCanvas);
    a.a(this.b, this.c, this.d * (this.a * 100 / 100) / 100, this.e, 6, 6, -16097026, paramCanvas);
    paramCanvas.restore();
  }
  
  public void setProgress(int paramInt)
  {
    this.a = paramInt;
    postInvalidate();
  }
  
  public void setRect(kf paramkf)
  {
    this.d = paramkf.c();
    this.e = paramkf.d();
    this.b = paramkf.a();
    this.c = paramkf.b();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\kb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */