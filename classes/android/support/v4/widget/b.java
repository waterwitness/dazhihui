package android.support.v4.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.shapes.OvalShape;

class b
  extends OvalShape
{
  private RadialGradient b;
  private Paint c = new Paint();
  private int d;
  
  public b(a parama, int paramInt1, int paramInt2)
  {
    a.a(parama, paramInt1);
    this.d = paramInt2;
    float f1 = this.d / 2;
    float f2 = this.d / 2;
    float f3 = a.a(parama);
    parama = Shader.TileMode.CLAMP;
    this.b = new RadialGradient(f1, f2, f3, new int[] { 1023410176, 0 }, null, parama);
    this.c.setShader(this.b);
  }
  
  public void draw(Canvas paramCanvas, Paint paramPaint)
  {
    int i = this.a.getWidth();
    int j = this.a.getHeight();
    paramCanvas.drawCircle(i / 2, j / 2, this.d / 2 + a.a(this.a), this.c);
    paramCanvas.drawCircle(i / 2, j / 2, this.d / 2, paramPaint);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\widget\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */