package com.tencent.avsdk.control;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.dazhihui.a.g;
import com.android.dazhihui.ui.screen.BrowserActivity;
import com.android.dazhihui.w;
import com.tencent.avsdk.Model.CustomRspMsgVo.LoginRsp;
import com.tencent.avsdk.Model.CustomRspMsgVo.OrderRsp;
import com.tencent.avsdk.Util;

class LoginControl$2
  implements MessageControl.OnLoginLinstener
{
  LoginControl$2(LoginControl paramLoginControl) {}
  
  public void login(CustomRspMsgVo.LoginRsp paramLoginRsp, boolean paramBoolean, String paramString)
  {
    LoginControl.access$202(this.this$0, paramLoginRsp);
    Log.d("ilvb", "LoginControl OnLoginLinstener isError=" + paramBoolean);
    if (paramBoolean)
    {
      LoginControl.access$302(this.this$0, "登录房间失败,请退出重试！");
      LoginControl.access$400(this.this$0).setMessage(LoginControl.access$300(this.this$0)).show();
    }
    label449:
    do
    {
      return;
      int i = Util.getNetWorkType(LoginControl.access$100(this.this$0));
      if (paramLoginRsp.Result.equals("0"))
      {
        if ((!g.a().c) && (i != 2))
        {
          LoginControl.access$302(this.this$0, "您正在使用手机网络,是否继续观看");
          g.a().c = true;
          LoginControl.access$400(this.this$0).setNegativeButton("继续", new LoginControl.2.1(this));
          LoginControl.access$400(this.this$0).setMessage(LoginControl.access$300(this.this$0)).show();
          return;
        }
        LoginControl.access$500(this.this$0);
        return;
      }
      if (paramLoginRsp.Result.equals("1"))
      {
        if (!w.a().l())
        {
          LoginControl.access$302(this.this$0, "该房间需要收费，请登录观看!");
          LoginControl.access$400(this.this$0).setNegativeButton("登录", new LoginControl.2.2(this));
          LoginControl.access$400(this.this$0).setMessage(LoginControl.access$300(this.this$0)).show();
          return;
        }
        paramString = "房间太火，需花费" + paramLoginRsp.Order.BillAmount + "慧币才能观看\n您有" + paramLoginRsp.Diamond + "慧币";
        if ((!g.a().c) && (i != 2))
        {
          g.a().c = true;
          LoginControl.access$302(this.this$0, "您正在使用手机网络,是否继续观看\n");
          LoginControl.access$302(this.this$0, LoginControl.access$300(this.this$0) + paramString);
          float f1 = Float.parseFloat(paramLoginRsp.Diamond);
          float f2 = Float.parseFloat(paramLoginRsp.Order.BillAmount);
          if ((f1 <= 0.0F) || (f1 < f2)) {
            break label449;
          }
          LoginControl.access$400(this.this$0).setNegativeButton("确定观看", new LoginControl.2.3(this));
        }
        for (;;)
        {
          LoginControl.access$400(this.this$0).setMessage(LoginControl.access$300(this.this$0)).show();
          return;
          LoginControl.access$302(this.this$0, paramString);
          break;
          LoginControl.access$400(this.this$0).setNegativeButton("充值观看", new LoginControl.2.4(this));
        }
      }
      if (paramLoginRsp.Result.equals("2"))
      {
        paramString = this.this$0;
        if (TextUtils.isEmpty(paramLoginRsp.RejectReason)) {}
        for (paramLoginRsp = "该房间人数已满！";; paramLoginRsp = paramLoginRsp.RejectReason)
        {
          LoginControl.access$302(paramString, paramLoginRsp);
          LoginControl.access$400(this.this$0).setMessage(LoginControl.access$300(this.this$0)).show();
          return;
        }
      }
    } while (!paramLoginRsp.Result.equals("3"));
    LoginControl.access$302(this.this$0, paramLoginRsp.RejectReason);
    paramString = new Intent();
    Bundle localBundle = new Bundle();
    localBundle.putString("nexturl", paramLoginRsp.RejectUrl);
    paramString.putExtras(localBundle);
    paramString.setClass(LoginControl.access$100(this.this$0), BrowserActivity.class);
    LoginControl.access$100(this.this$0).startActivity(paramString);
    LoginControl.access$000(this.this$0).destroy();
    LoginControl.access$100(this.this$0).finish();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\control\LoginControl$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */