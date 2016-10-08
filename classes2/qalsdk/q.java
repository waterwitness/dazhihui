package qalsdk;

import com.tencent.qalsdk.sdk.ac;
import com.tencent.qalsdk.sdk.e;
import com.tencent.qalsdk.util.QLog;

class q
  implements Runnable
{
  q(p paramp) {}
  
  public void run()
  {
    QLog.d("Foreground", 4, "onActivityPaused " + u.a());
    if ((u.a()) && (ac.a().b)) {
      e.b().o();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\qalsdk\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */