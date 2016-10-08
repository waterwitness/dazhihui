package com.tencent.Util;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.avsdk.pay.PayResult;
import java.util.Map;

class IlvbRechargeManager$2
  extends Handler
{
  IlvbRechargeManager$2(IlvbRechargeManager paramIlvbRechargeManager) {}
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    }
    label125:
    do
    {
      return;
      paramMessage = new PayResult((String)paramMessage.obj);
      paramMessage.getResult();
      paramMessage = paramMessage.getResultStatus();
      if (IlvbRechargeManager.access$300().containsKey(paramMessage)) {
        this.this$0.showShortToast((String)IlvbRechargeManager.access$300().get(paramMessage));
      }
      for (;;)
      {
        if (!TextUtils.equals(paramMessage, "9000")) {
          break label125;
        }
        if (IlvbRechargeManager.access$400(this.this$0) == null) {
          break;
        }
        IlvbRechargeManager.access$400(this.this$0).handlesuccess();
        return;
        this.this$0.showShortToast("其它错误，支付失败");
      }
    } while (IlvbRechargeManager.access$400(this.this$0) == null);
    IlvbRechargeManager.access$400(this.this$0).handlefailure();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\Util\IlvbRechargeManager$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */