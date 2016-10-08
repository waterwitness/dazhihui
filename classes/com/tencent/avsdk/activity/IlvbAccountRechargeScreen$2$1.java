package com.tencent.avsdk.activity;

import com.tencent.Util.IlvbRechargeManager.RechargeCallBackListener;
import com.tencent.avsdk.control.MessageControl;

class IlvbAccountRechargeScreen$2$1
  implements IlvbRechargeManager.RechargeCallBackListener
{
  IlvbAccountRechargeScreen$2$1(IlvbAccountRechargeScreen.2 param2) {}
  
  public void handlefailure() {}
  
  public void handlesuccess()
  {
    if (IlvbAccountRechargeScreen.access$300(this.this$1.this$0) != null) {
      IlvbAccountRechargeScreen.access$300(this.this$1.this$0).sendQueryAccount();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\activity\IlvbAccountRechargeScreen$2$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */