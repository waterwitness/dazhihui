package com.android.dazhihui.ui.delegate.screen.trade;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class e
  implements DialogInterface.OnClickListener
{
  e(VoteScreen paramVoteScreen) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.a = true;
    this.a.b(1);
    VoteScreen.r(this.a).notifyDataSetChanged();
    VoteScreen.q(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\trade\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */