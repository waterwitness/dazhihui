package com.tencent.Util;

import android.os.Handler;
import android.os.Message;
import com.alipay.sdk.app.b;

class IlvbRechargeManager$1
  implements Runnable
{
  IlvbRechargeManager$1(IlvbRechargeManager paramIlvbRechargeManager, String paramString) {}
  
  public void run()
  {
    String str = new b(IlvbRechargeManager.access$000(this.this$0)).a(this.val$payInfo, true);
    Message localMessage = new Message();
    localMessage.what = IlvbRechargeManager.access$100(this.this$0);
    localMessage.obj = str;
    IlvbRechargeManager.access$200(this.this$0).sendMessage(localMessage);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\Util\IlvbRechargeManager$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */