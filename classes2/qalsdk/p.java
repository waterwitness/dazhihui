package qalsdk;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;

public class p
  implements Application.ActivityLifecycleCallbacks
{
  private static p a;
  private static String b = p.class.getSimpleName();
  private final int c = 2000;
  private boolean d = false;
  private boolean e = true;
  private Handler f = new Handler();
  private Runnable g;
  
  public static void a(Context paramContext)
  {
    if (a == null)
    {
      a = new p();
      ((Application)paramContext).registerActivityLifecycleCallbacks(a);
    }
  }
  
  public void onActivityCreated(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityDestroyed(Activity paramActivity) {}
  
  public void onActivityPaused(Activity paramActivity)
  {
    this.e = true;
    if (this.g != null) {
      this.f.removeCallbacks(this.g);
    }
    paramActivity = this.f;
    q localq = new q(this);
    this.g = localq;
    paramActivity.postDelayed(localq, 2000L);
  }
  
  public void onActivityResumed(Activity paramActivity)
  {
    this.e = false;
    this.d = true;
    if (this.g != null) {
      this.f.removeCallbacks(this.g);
    }
  }
  
  public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityStarted(Activity paramActivity) {}
  
  public void onActivityStopped(Activity paramActivity) {}
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\qalsdk\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */