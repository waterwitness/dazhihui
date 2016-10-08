package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;

public class q
{
  private static final t b = new r();
  private Object a;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      b = new u();
      return;
    }
    if (Build.VERSION.SDK_INT >= 14)
    {
      b = new s();
      return;
    }
  }
  
  public q(Context paramContext)
  {
    this.a = b.a(paramContext);
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    b.a(this.a, paramInt1, paramInt2);
  }
  
  public boolean a()
  {
    return b.a(this.a);
  }
  
  public boolean a(float paramFloat)
  {
    return b.a(this.a, paramFloat);
  }
  
  public boolean a(float paramFloat1, float paramFloat2)
  {
    return b.a(this.a, paramFloat1, paramFloat2);
  }
  
  public boolean a(int paramInt)
  {
    return b.a(this.a, paramInt);
  }
  
  public boolean a(Canvas paramCanvas)
  {
    return b.a(this.a, paramCanvas);
  }
  
  public void b()
  {
    b.b(this.a);
  }
  
  public boolean c()
  {
    return b.c(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\widget\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */