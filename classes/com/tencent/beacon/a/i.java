package com.tencent.beacon.a;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import com.tencent.beacon.e.b;

@TargetApi(14)
public final class i
  implements Application.ActivityLifecycleCallbacks
{
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle) {}
  
  public final void onActivityDestroyed(Activity paramActivity) {}
  
  public final void onActivityPaused(Activity paramActivity) {}
  
  public final void onActivityResumed(Activity paramActivity) {}
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public final void onActivityStarted(Activity paramActivity)
  {
    b.b = true;
    b.a("Activity %s is visible.", new Object[] { paramActivity.getClass().getSimpleName() });
  }
  
  public final void onActivityStopped(Activity paramActivity) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */