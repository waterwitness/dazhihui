import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.widget.ImageView;

final class ca
  implements Runnable
{
  private final b a;
  private int b;
  private int c;
  
  public ca(bx parambx, Context paramContext)
  {
    if (Build.VERSION.SDK_INT < 9) {
      parambx = new a(paramContext);
    }
    for (;;)
    {
      this.a = parambx;
      return;
      if (Build.VERSION.SDK_INT < 14) {
        parambx = new cm(paramContext);
      } else {
        parambx = new cn(paramContext);
      }
    }
  }
  
  public final void a()
  {
    if (bx.m()) {
      ck.a().a("PhotoViewAttacher", "Cancel Fling");
    }
    this.a.a(true);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    RectF localRectF = this.d.b();
    if (localRectF == null) {
      return;
    }
    int i = Math.round(-localRectF.left);
    int j;
    label52:
    int k;
    int m;
    if (paramInt1 < localRectF.width())
    {
      j = Math.round(localRectF.width() - paramInt1);
      paramInt1 = 0;
      k = Math.round(-localRectF.top);
      if (paramInt2 >= localRectF.height()) {
        break label210;
      }
      m = Math.round(localRectF.height() - paramInt2);
      paramInt2 = 0;
    }
    for (;;)
    {
      this.b = i;
      this.c = k;
      if (bx.m()) {
        ck.a().a("PhotoViewAttacher", "fling. StartX:" + i + " StartY:" + k + " MaxX:" + j + " MaxY:" + m);
      }
      if ((i == j) && (k == m)) {
        break;
      }
      this.a.a(i, k, paramInt3, paramInt4, paramInt1, j, paramInt2, m, 0, 0);
      return;
      paramInt1 = i;
      j = i;
      break label52;
      label210:
      paramInt2 = k;
      m = k;
    }
  }
  
  public final void run()
  {
    if (this.a.b()) {}
    ImageView localImageView;
    do
    {
      return;
      localImageView = this.d.c();
    } while ((localImageView == null) || (!this.a.a()));
    int i = this.a.c();
    int j = this.a.d();
    if (bx.m()) {
      ck.a().a("PhotoViewAttacher", "fling run(). CurrentX:" + this.b + " CurrentY:" + this.c + " NewX:" + i + " NewY:" + j);
    }
    bx.a(this.d).postTranslate(this.b - i, this.c - j);
    bx.a(this.d, this.d.l());
    this.b = i;
    this.c = j;
    bq.a(localImageView, this);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\ca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */