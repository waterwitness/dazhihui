package com.tencent.avsdkhost.control;

import android.os.Handler;
import java.util.List;

class AnimationControlHost$2
  implements Runnable
{
  AnimationControlHost$2(AnimationControlHost paramAnimationControlHost) {}
  
  public void run()
  {
    if (AnimationControlHost.access$100(this.this$0).size() > 0)
    {
      this.this$0.mHandler.sendEmptyMessage(0);
      return;
    }
    AnimationControlHost.access$002(this.this$0, false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\control\AnimationControlHost$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */