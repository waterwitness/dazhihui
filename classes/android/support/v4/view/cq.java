package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.ViewGroup;

public class cq
{
  static final ct a = new cw();
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 21)
    {
      a = new cv();
      return;
    }
    if (i >= 18)
    {
      a = new cu();
      return;
    }
    if (i >= 14)
    {
      a = new cs();
      return;
    }
    if (i >= 11)
    {
      a = new cr();
      return;
    }
  }
  
  public static void a(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    a.a(paramViewGroup, paramBoolean);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\view\cq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */