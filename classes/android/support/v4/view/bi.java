package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.VelocityTracker;

public class bi
{
  static final bl a = new bj();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      a = new bk();
      return;
    }
  }
  
  public static float a(VelocityTracker paramVelocityTracker, int paramInt)
  {
    return a.a(paramVelocityTracker, paramInt);
  }
  
  public static float b(VelocityTracker paramVelocityTracker, int paramInt)
  {
    return a.b(paramVelocityTracker, paramInt);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\view\bi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */