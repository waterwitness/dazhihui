package android.support.v4.app;

import android.os.Build.VERSION;
import android.os.Bundle;

public class cp
  extends cx
{
  public static final cy a;
  private static final cr g;
  private final String b;
  private final CharSequence c;
  private final CharSequence[] d;
  private final boolean e;
  private final Bundle f;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 20) {
      g = new cs();
    }
    for (;;)
    {
      a = new cq();
      return;
      if (Build.VERSION.SDK_INT >= 16) {
        g = new cu();
      } else {
        g = new ct();
      }
    }
  }
  
  public String a()
  {
    return this.b;
  }
  
  public CharSequence b()
  {
    return this.c;
  }
  
  public CharSequence[] c()
  {
    return this.d;
  }
  
  public boolean d()
  {
    return this.e;
  }
  
  public Bundle e()
  {
    return this.f;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\app\cp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */