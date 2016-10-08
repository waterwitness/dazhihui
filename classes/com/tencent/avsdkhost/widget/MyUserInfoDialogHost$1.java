package com.tencent.avsdkhost.widget;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;

class MyUserInfoDialogHost$1
  implements View.OnClickListener
{
  MyUserInfoDialogHost$1(MyUserInfoDialogHost paramMyUserInfoDialogHost) {}
  
  public void onClick(View paramView)
  {
    MyUserInfoDialogHost.access$000(this.this$0).dismiss();
    this.this$0.jubaoPopWinItemSelected(paramView.getId());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\widget\MyUserInfoDialogHost$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */