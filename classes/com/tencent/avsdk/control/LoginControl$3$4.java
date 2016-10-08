package com.tencent.avsdk.control;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.avsdk.Model.CustomRspMsgVo.LoginRsp;
import com.tencent.avsdk.Model.CustomRspMsgVo.OrderRsp;

class LoginControl$3$4
  implements DialogInterface.OnClickListener
{
  LoginControl$3$4(LoginControl.3 param3) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    LoginControl.access$000(this.this$1.this$0).sendPay(LoginControl.access$200(this.this$1.this$0).Order.OrderNo, this.this$1.this$0.mPayLinstener);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\control\LoginControl$3$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */