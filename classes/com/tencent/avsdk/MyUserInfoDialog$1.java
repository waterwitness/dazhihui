package com.tencent.avsdk;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;

class MyUserInfoDialog$1
  implements View.OnClickListener
{
  MyUserInfoDialog$1(MyUserInfoDialog paramMyUserInfoDialog) {}
  
  public void onClick(View paramView)
  {
    MyUserInfoDialog.access$000(this.this$0).dismiss();
    this.this$0.jubaoPopWinItemSelected(paramView.getId());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\MyUserInfoDialog$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */