package com.tencent.avsdk.control;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import com.tencent.avsdk.Model.CustomRspMsgVo.LoginRsp;

public class LoginControl
{
  private static final String TAG = "ilvb";
  private AlertDialog.Builder builder;
  private Activity mContext;
  private CustomRspMsgVo.LoginRsp mLoginRsp;
  MessageControl.OnLoginLinstener mOnLoginLinstener = new LoginControl.2(this);
  MessageControl.OnPayLinstener mPayLinstener = new LoginControl.3(this);
  private String message;
  private MessageControl messageControl;
  private Runnable runnable;
  
  public LoginControl(Activity paramActivity, MessageControl paramMessageControl)
  {
    this.mContext = paramActivity;
    this.messageControl = paramMessageControl;
  }
  
  private void m()
  {
    if (this.runnable != null) {
      this.runnable.run();
    }
  }
  
  public void manageLogin(Runnable paramRunnable)
  {
    this.runnable = paramRunnable;
    this.message = "";
    this.builder = new AlertDialog.Builder(this.mContext);
    this.builder.setTitle("提示");
    this.builder.setCancelable(false);
    this.builder.setNeutralButton("退出", new LoginControl.1(this));
    if (this.messageControl != null) {
      this.messageControl.sendLogin(this.mOnLoginLinstener);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\control\LoginControl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */