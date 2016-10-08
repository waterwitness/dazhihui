package android.support.v4.view;

import android.view.View;
import java.lang.reflect.Field;

class cb
{
  private static Field a;
  private static boolean b;
  private static Field c;
  private static boolean d;
  
  static int a(View paramView)
  {
    if (!b) {}
    try
    {
      a = View.class.getDeclaredField("mMinWidth");
      a.setAccessible(true);
      b = true;
      if (a != null) {
        try
        {
          int i = ((Integer)a.get(paramView)).intValue();
          return i;
        }
        catch (Exception paramView) {}
      }
      return 0;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;) {}
    }
  }
  
  static int b(View paramView)
  {
    if (!d) {}
    try
    {
      c = View.class.getDeclaredField("mMinHeight");
      c.setAccessible(true);
      d = true;
      if (c != null) {
        try
        {
          int i = ((Integer)c.get(paramView)).intValue();
          return i;
        }
        catch (Exception paramView) {}
      }
      return 0;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;) {}
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\view\cb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */