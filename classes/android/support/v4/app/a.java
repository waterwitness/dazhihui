package android.support.v4.app;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;

public class a
  extends android.support.v4.content.a
{
  private static f a(da paramda)
  {
    d locald = null;
    if (paramda != null) {
      locald = new d(paramda);
    }
    return locald;
  }
  
  public static void a(Activity paramActivity)
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      e.a(paramActivity);
      return;
    }
    paramActivity.finish();
  }
  
  public static void a(Activity paramActivity, da paramda)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      e.a(paramActivity, a(paramda));
    }
  }
  
  public static void a(Activity paramActivity, String[] paramArrayOfString, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 23) {
      h.a(paramActivity, paramArrayOfString, paramInt);
    }
    while (!(paramActivity instanceof c)) {
      return;
    }
    new Handler(Looper.getMainLooper()).post(new b(paramArrayOfString, paramActivity, paramInt));
  }
  
  public static boolean a(Activity paramActivity, String paramString)
  {
    if (Build.VERSION.SDK_INT >= 23) {
      return h.a(paramActivity, paramString);
    }
    return false;
  }
  
  public static void b(Activity paramActivity)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      e.b(paramActivity);
    }
  }
  
  public static void b(Activity paramActivity, da paramda)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      e.b(paramActivity, a(paramda));
    }
  }
  
  public static void c(Activity paramActivity)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      e.c(paramActivity);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\app\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */