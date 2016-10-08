package com.tencent.avsdk.widget;

import android.graphics.drawable.AnimationDrawable;
import android.view.View;

class FireworksAnimation$1
  implements Runnable
{
  FireworksAnimation$1(FireworksAnimation paramFireworksAnimation, String paramString, Runnable paramRunnable) {}
  
  public void run()
  {
    this.this$0.imageView2.setVisibility(0);
    this.this$0.animationDrawable2.start();
    this.this$0.postDelayed(new FireworksAnimation.1.1(this), 1000L);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\FireworksAnimation$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */