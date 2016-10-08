package com.tencent.mm.sdk.openapi;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

final class WXApiImplV10$ActivityLifecycleCb
  implements Application.ActivityLifecycleCallbacks
{
  private static final int DELAYED = 800;
  private static final String TAG = "MicroMsg.SDK.WXApiImplV10.ActivityLifecycleCb";
  private Context context;
  private Handler handler = new Handler(Looper.getMainLooper());
  private boolean isForeground = false;
  private Runnable onPausedRunnable = new WXApiImplV10.ActivityLifecycleCb.1(this);
  private Runnable onResumedRunnable = new WXApiImplV10.ActivityLifecycleCb.2(this);
  
  private WXApiImplV10$ActivityLifecycleCb(Context paramContext)
  {
    this.context = paramContext;
  }
  
  public final void detach()
  {
    this.handler.removeCallbacks(this.onResumedRunnable);
    this.handler.removeCallbacks(this.onPausedRunnable);
    this.context = null;
  }
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle) {}
  
  public final void onActivityDestroyed(Activity paramActivity) {}
  
  public final void onActivityPaused(Activity paramActivity)
  {
    Log.v("MicroMsg.SDK.WXApiImplV10.ActivityLifecycleCb", paramActivity.getComponentName().getClassName() + "  onActivityPaused");
    this.handler.removeCallbacks(this.onResumedRunnable);
    this.handler.postDelayed(this.onPausedRunnable, 800L);
  }
  
  public final void onActivityResumed(Activity paramActivity)
  {
    Log.v("MicroMsg.SDK.WXApiImplV10.ActivityLifecycleCb", paramActivity.getComponentName().getClassName() + "  onActivityResumed");
    this.handler.removeCallbacks(this.onPausedRunnable);
    this.handler.postDelayed(this.onResumedRunnable, 800L);
  }
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public final void onActivityStarted(Activity paramActivity) {}
  
  public final void onActivityStopped(Activity paramActivity) {}
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\mm\sdk\openapi\WXApiImplV10$ActivityLifecycleCb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */