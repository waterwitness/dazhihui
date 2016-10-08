package android.support.v4.a;

import android.os.Build.VERSION;
import android.view.View;

public abstract class a
{
  static b a = new c();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 12)
    {
      a = new d();
      return;
    }
  }
  
  public static void a(View paramView)
  {
    a.a(paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */