package android.support.v4.b.a;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;

public class a
{
  static final c a = new b();
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 23)
    {
      a = new i();
      return;
    }
    if (i >= 22)
    {
      a = new h();
      return;
    }
    if (i >= 21)
    {
      a = new g();
      return;
    }
    if (i >= 19)
    {
      a = new f();
      return;
    }
    if (i >= 17)
    {
      a = new e();
      return;
    }
    if (i >= 11)
    {
      a = new d();
      return;
    }
  }
  
  public static void a(Drawable paramDrawable, int paramInt)
  {
    a.a(paramDrawable, paramInt);
  }
  
  public static boolean a(Drawable paramDrawable)
  {
    return a.a(paramDrawable);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\b\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */