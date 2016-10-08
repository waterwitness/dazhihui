package com.tencent.avsdk.control;

import android.os.Handler;
import java.util.List;

class AnimationControl$2
  implements Runnable
{
  AnimationControl$2(AnimationControl paramAnimationControl) {}
  
  public void run()
  {
    if (AnimationControl.access$100(this.this$0).size() > 0)
    {
      this.this$0.mHandler.sendEmptyMessage(0);
      return;
    }
    AnimationControl.access$002(this.this$0, false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\control\AnimationControl$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */