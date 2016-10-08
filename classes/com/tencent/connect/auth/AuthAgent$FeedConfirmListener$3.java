package com.tencent.connect.auth;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.tauth.IUiListener;

class AuthAgent$FeedConfirmListener$3
  implements DialogInterface.OnCancelListener
{
  AuthAgent$FeedConfirmListener$3(AuthAgent.FeedConfirmListener paramFeedConfirmListener, IUiListener paramIUiListener, Object paramObject) {}
  
  public void onCancel(DialogInterface paramDialogInterface)
  {
    if (this.a != null) {
      this.a.onComplete(this.b);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\connect\auth\AuthAgent$FeedConfirmListener$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */