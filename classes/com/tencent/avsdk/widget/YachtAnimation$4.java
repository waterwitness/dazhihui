package com.tencent.avsdk.widget;

import android.graphics.drawable.AnimationDrawable;
import android.view.View;

class YachtAnimation$4
  implements Runnable
{
  YachtAnimation$4(YachtAnimation paramYachtAnimation) {}
  
  public void run()
  {
    this.this$0.animationDrawable.start();
    this.this$0.fireworks.setVisibility(0);
    this.this$0.fireworks_bg.setVisibility(0);
    this.this$0.postDelayed(new YachtAnimation.4.1(this), 2000L);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\YachtAnimation$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */