package com.android.dazhihui.ui.delegate.screen.trade;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.Vector;

class t
  implements View.OnClickListener
{
  int a;
  
  t(VoteShareholderMeeting paramVoteShareholderMeeting) {}
  
  public void a(int paramInt)
  {
    this.a = paramInt;
  }
  
  public void onClick(View paramView)
  {
    paramView = new Bundle();
    paramView.putString("num", ((s)VoteShareholderMeeting.a(this.b).get(this.a)).e);
    this.b.startActivity(VoteScreen.class, paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\trade\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */