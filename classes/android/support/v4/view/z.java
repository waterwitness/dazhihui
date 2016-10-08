package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.LayoutInflater;

public class z
{
  static final aa a = new ab();
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 21)
    {
      a = new ad();
      return;
    }
    if (i >= 11)
    {
      a = new ac();
      return;
    }
  }
  
  public static void a(LayoutInflater paramLayoutInflater, aj paramaj)
  {
    a.a(paramLayoutInflater, paramaj);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\view\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */