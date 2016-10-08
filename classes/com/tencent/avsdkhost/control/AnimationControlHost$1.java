package com.tencent.avsdkhost.control;

import android.os.Handler;
import android.os.Message;
import com.tencent.avsdk.Model.CustomSysMsgVo.Present;
import com.tencent.avsdk.Model.GiftVo.GiftItem;
import java.util.List;

class AnimationControlHost$1
  extends Handler
{
  AnimationControlHost$1(AnimationControlHost paramAnimationControlHost) {}
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      return;
    }
    AnimationControlHost.access$002(this.this$0, false);
    paramMessage = (GiftVo.GiftItem)AnimationControlHost.access$100(this.this$0).get(0);
    CustomSysMsgVo.Present localPresent = (CustomSysMsgVo.Present)AnimationControlHost.access$200(this.this$0).get(0);
    AnimationControlHost.access$100(this.this$0).remove(0);
    AnimationControlHost.access$200(this.this$0).remove(0);
    this.this$0.show(paramMessage, localPresent);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\control\AnimationControlHost$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */