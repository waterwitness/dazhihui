package com.tencent.imsdk;

import com.tencent.TIMValueCallBack;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.openqq.protocol.imsdk.msg.MsgBody;
import com.tencent.openqq.protocol.imsdk.msg_common.Msg;
import com.tencent.openqq.protocol.imsdk.msg_push.ReqBody;

final class ˊ
  implements Runnable
{
  ˊ(ˈ paramˈ, TIMValueCallBack paramTIMValueCallBack, msg_push.ReqBody paramReqBody) {}
  
  public final void run()
  {
    this.a.onSuccess(this.b.msg_msg.msg_msg_body.msg_content.get().toByteArray());
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imsdk\ˊ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */