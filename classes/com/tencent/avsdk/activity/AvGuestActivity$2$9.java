package com.tencent.avsdk.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.avsdk.widget.AboveVideoBottomView;
import com.tencent.avsdk.widget.GiftView;

class AvGuestActivity$2$9
  implements DialogInterface.OnClickListener
{
  AvGuestActivity$2$9(AvGuestActivity.2 param2) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AvGuestActivity.access$1000(this.this$1.this$0).startActivity(new Intent(AvGuestActivity.access$1000(this.this$1.this$0), IlvbAccountRechargeScreen.class));
    AvGuestActivity.access$2200(this.this$1.this$0).giftView.dismiss();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\activity\AvGuestActivity$2$9.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */