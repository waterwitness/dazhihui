package com.tencent.avsdk.widget;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.avsdk.activity.IlvbAccountRechargeScreen;

class GiftView$2
  implements View.OnClickListener
{
  GiftView$2(GiftView paramGiftView) {}
  
  public void onClick(View paramView)
  {
    GiftView.access$100(this.this$0).startActivity(new Intent(GiftView.access$100(this.this$0), IlvbAccountRechargeScreen.class));
    this.this$0.dismiss();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\GiftView$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */