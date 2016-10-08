package qalsdk;

import android.os.Handler;
import com.tencent.qalsdk.util.QLog;
import java.util.ArrayList;

class v
  implements Runnable
{
  v(u paramu) {}
  
  public void run()
  {
    u.a(this.a);
    u.c(this.a).add(u.b(this.a));
    QLog.d("MSF.C.StatReport", "CollectNetInfo:" + u.d(this.a));
    if (u.d(this.a) >= 5)
    {
      u.e(this.a).removeCallbacks(this.a.d);
      return;
    }
    u.e(this.a).postDelayed(this, 1000L);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\qalsdk\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */