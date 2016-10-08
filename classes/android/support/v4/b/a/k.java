package android.support.v4.b.a;

import android.graphics.drawable.Drawable;
import android.util.Log;
import java.lang.reflect.Method;

class k
{
  private static Method a;
  private static boolean b;
  
  public static void a(Drawable paramDrawable, int paramInt)
  {
    if (!b) {}
    try
    {
      a = Drawable.class.getDeclaredMethod("setLayoutDirection", new Class[] { Integer.TYPE });
      a.setAccessible(true);
      b = true;
      if (a == null) {}
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;)
      {
        try
        {
          a.invoke(paramDrawable, new Object[] { Integer.valueOf(paramInt) });
          return;
        }
        catch (Exception paramDrawable)
        {
          Log.i("DrawableCompatJellybeanMr1", "Failed to invoke setLayoutDirection(int) via reflection", paramDrawable);
          a = null;
        }
        localNoSuchMethodException = localNoSuchMethodException;
        Log.i("DrawableCompatJellybeanMr1", "Failed to retrieve setLayoutDirection(int) method", localNoSuchMethodException);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\b\a\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */