package com.tencent.connect.auth;

import android.app.Dialog;
import android.view.View;
import com.tencent.tauth.IUiListener;

class AuthAgent$FeedConfirmListener$2
  extends AuthAgent.FeedConfirmListener.ButtonListener
{
  AuthAgent$FeedConfirmListener$2(AuthAgent.FeedConfirmListener paramFeedConfirmListener, Dialog paramDialog, IUiListener paramIUiListener, Object paramObject)
  {
    super(paramFeedConfirmListener, paramDialog);
  }
  
  public void onClick(View paramView)
  {
    if ((this.d != null) && (this.d.isShowing())) {
      this.d.dismiss();
    }
    if (this.a != null) {
      this.a.onComplete(this.b);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\connect\auth\AuthAgent$FeedConfirmListener$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */