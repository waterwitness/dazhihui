package com.tencent.avsdk.control;

import android.os.Handler;
import android.os.Message;
import com.tencent.avsdk.Model.CustomSysMsgVo.Present;
import com.tencent.avsdk.Model.GiftVo.GiftItem;
import java.util.List;

class AnimationControl$1
  extends Handler
{
  AnimationControl$1(AnimationControl paramAnimationControl) {}
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      return;
    }
    AnimationControl.access$002(this.this$0, false);
    paramMessage = (GiftVo.GiftItem)AnimationControl.access$100(this.this$0).get(0);
    CustomSysMsgVo.Present localPresent = (CustomSysMsgVo.Present)AnimationControl.access$200(this.this$0).get(0);
    AnimationControl.access$100(this.this$0).remove(0);
    AnimationControl.access$200(this.this$0).remove(0);
    this.this$0.show(paramMessage, localPresent);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\control\AnimationControl$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */