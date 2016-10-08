package com.handmark.pulltorefresh.library.a;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.view.View;

@TargetApi(16)
class k
{
  public static void a(View paramView, Drawable paramDrawable)
  {
    paramView.setBackground(paramDrawable);
  }
  
  public static void a(View paramView, Runnable paramRunnable)
  {
    paramView.postOnAnimation(paramRunnable);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\handmark\pulltorefresh\library\a\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */