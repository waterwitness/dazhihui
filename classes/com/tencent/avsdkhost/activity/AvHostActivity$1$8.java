package com.tencent.avsdkhost.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.avsdk.activity.IlvbAccountRechargeScreen;
import com.tencent.avsdk.widget.GiftView;
import com.tencent.avsdkhost.widget.AboveVideoBottomViewHost;

class AvHostActivity$1$8
  implements DialogInterface.OnClickListener
{
  AvHostActivity$1$8(AvHostActivity.1 param1) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AvHostActivity.access$1200(this.this$1.this$0).startActivity(new Intent(AvHostActivity.access$1200(this.this$1.this$0), IlvbAccountRechargeScreen.class));
    AvHostActivity.access$1800(this.this$1.this$0).giftView.dismiss();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\activity\AvHostActivity$1$8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */