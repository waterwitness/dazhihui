package com.android.dazhihui.d;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;
import com.tencent.avsdkhost.control.IlvbHostPhotoManage;

final class v
  implements View.OnClickListener
{
  v(IlvbHostPhotoManage paramIlvbHostPhotoManage, String paramString, Activity paramActivity, PopupWindow paramPopupWindow) {}
  
  public void onClick(View paramView)
  {
    this.a.takeGallery(this.b, new w(this));
    if ((this.d != null) && (this.d.isShowing())) {
      this.d.dismiss();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\d\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */