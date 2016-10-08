package com.tencent.avsdk.control;

import android.app.AlertDialog.Builder;

class LoginControl$3
  implements MessageControl.OnPayLinstener
{
  LoginControl$3(LoginControl paramLoginControl) {}
  
  public void pay(int paramInt)
  {
    if (paramInt == 0)
    {
      LoginControl.access$500(this.this$0);
      return;
    }
    if (paramInt == 1006)
    {
      LoginControl.access$400(this.this$0).setMessage("余额不足，是否充值？");
      LoginControl.access$400(this.this$0).setNegativeButton("确定", new LoginControl.3.1(this)).show();
      return;
    }
    if (paramInt == 120024)
    {
      LoginControl.access$400(this.this$0).setMessage("您的支付订单已经过期,是否重新支付？");
      LoginControl.access$400(this.this$0).setNegativeButton("重新支付", new LoginControl.3.2(this)).show();
      return;
    }
    if ((paramInt == 1002) || (paramInt == 1003))
    {
      LoginControl.access$400(this.this$0).setMessage("支付失败,钻系统异常,是否重新支付？");
      LoginControl.access$400(this.this$0).setNegativeButton("重新支付", new LoginControl.3.3(this)).show();
      return;
    }
    LoginControl.access$400(this.this$0).setMessage("支付失败,未知错误,是否重新支付？");
    LoginControl.access$400(this.this$0).setNegativeButton("重新支付", new LoginControl.3.4(this)).show();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\control\LoginControl$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */