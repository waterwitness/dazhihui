package com.tencent.avsdk;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.ui.screen.stock.LoginMainScreen;

class UserilvbManager$4
  implements View.OnClickListener
{
  UserilvbManager$4(UserilvbManager paramUserilvbManager, Context paramContext, Dialog paramDialog) {}
  
  public void onClick(View paramView)
  {
    paramView = new Intent();
    paramView.setClass(this.val$mContext, LoginMainScreen.class);
    paramView.putExtra("REGISTER_FROM_TYPE", "FROM_STOCK");
    this.val$mContext.startActivity(paramView);
    this.val$mDialog.dismiss();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\UserilvbManager$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */