package com.android.dazhihui.ui.delegate.screen.trade;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class d
  implements DialogInterface.OnClickListener
{
  d(VoteScreen paramVoteScreen) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.a = true;
    this.a.b(1);
    VoteScreen.q(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\trade\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */