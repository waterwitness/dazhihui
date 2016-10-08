package android.support.v4.view;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.LayoutInflater.Factory2;
import java.lang.reflect.Field;

class ag
{
  private static Field a;
  private static boolean b;
  
  static void a(LayoutInflater paramLayoutInflater, aj paramaj)
  {
    if (paramaj != null) {}
    for (paramaj = new ah(paramaj);; paramaj = null)
    {
      paramLayoutInflater.setFactory2(paramaj);
      LayoutInflater.Factory localFactory = paramLayoutInflater.getFactory();
      if (!(localFactory instanceof LayoutInflater.Factory2)) {
        break;
      }
      a(paramLayoutInflater, (LayoutInflater.Factory2)localFactory);
      return;
    }
    a(paramLayoutInflater, paramaj);
  }
  
  static void a(LayoutInflater paramLayoutInflater, LayoutInflater.Factory2 paramFactory2)
  {
    if (!b) {}
    try
    {
      a = LayoutInflater.class.getDeclaredField("mFactory2");
      a.setAccessible(true);
      b = true;
      if (a == null) {}
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;)
      {
        try
        {
          a.set(paramLayoutInflater, paramFactory2);
          return;
        }
        catch (IllegalAccessException paramFactory2)
        {
          Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + paramLayoutInflater + "; inflation may have unexpected results.", paramFactory2);
        }
        localNoSuchFieldException = localNoSuchFieldException;
        Log.e("LayoutInflaterCompatHC", "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", localNoSuchFieldException);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\view\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */