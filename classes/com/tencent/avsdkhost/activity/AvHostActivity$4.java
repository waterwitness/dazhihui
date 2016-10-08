package com.tencent.avsdkhost.activity;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.android.dazhihui.ui.screen.stock.LoginMainScreen;

class AvHostActivity$4
  implements DialogInterface.OnClickListener
{
  AvHostActivity$4(AvHostActivity paramAvHostActivity) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = new Intent(this.this$0, LoginMainScreen.class);
    paramDialogInterface.putExtra("REGISTER_FROM_TYPE", "FROM_STOCK");
    this.this$0.startActivity(paramDialogInterface);
    this.this$0.finish();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\activity\AvHostActivity$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */