package com.handmark.pulltorefresh.library.a;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.View;

public class j
{
  public static void a(View paramView, Drawable paramDrawable)
  {
    if (Build.VERSION.SDK_INT >= 16)
    {
      k.a(paramView, paramDrawable);
      return;
    }
    paramView.setBackgroundDrawable(paramDrawable);
  }
  
  public static void a(View paramView, Runnable paramRunnable)
  {
    if (Build.VERSION.SDK_INT >= 16)
    {
      k.a(paramView, paramRunnable);
      return;
    }
    paramView.postDelayed(paramRunnable, 16L);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\handmark\pulltorefresh\library\a\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */