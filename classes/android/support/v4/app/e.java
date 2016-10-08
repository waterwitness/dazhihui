package android.support.v4.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.media.session.MediaController;

class e
{
  private static SharedElementCallback a(f paramf)
  {
    g localg = null;
    if (paramf != null) {
      localg = new g(paramf);
    }
    return localg;
  }
  
  public static void a(Activity paramActivity)
  {
    paramActivity.finishAfterTransition();
  }
  
  public static void a(Activity paramActivity, f paramf)
  {
    paramActivity.setEnterSharedElementCallback(a(paramf));
  }
  
  public static void a(Activity paramActivity, Object paramObject)
  {
    paramActivity.setMediaController((MediaController)paramObject);
  }
  
  public static void b(Activity paramActivity)
  {
    paramActivity.postponeEnterTransition();
  }
  
  public static void b(Activity paramActivity, f paramf)
  {
    paramActivity.setExitSharedElementCallback(a(paramf));
  }
  
  public static void c(Activity paramActivity)
  {
    paramActivity.startPostponedEnterTransition();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\app\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */