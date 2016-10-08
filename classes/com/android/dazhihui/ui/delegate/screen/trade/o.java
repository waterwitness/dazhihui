package com.android.dazhihui.ui.delegate.screen.trade;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import java.util.Vector;

class o
  implements View.OnClickListener
{
  o(VoteScreen paramVoteScreen) {}
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    }
    do
    {
      do
      {
        return;
      } while ((VoteScreen.i(this.a) == null) || (VoteScreen.i(this.a).size() == 0));
      if (this.a.a)
      {
        this.a.b(2);
        return;
      }
      if (VoteScreen.j(this.a).getText().toString().equals("一键表决"))
      {
        VoteScreen.j(this.a).setText("一键取消");
        VoteScreen.k(this.a).setVisibility(8);
        VoteScreen.l(this.a).setVisibility(0);
        return;
      }
      VoteScreen.j(this.a).setText("一键表决");
      VoteScreen.a(this.a, "0");
      VoteScreen.m(this.a).notifyDataSetChanged();
      return;
      VoteScreen.a(this.a, "1");
      VoteScreen.j(this.a).setText("一键取消");
      VoteScreen.k(this.a).setVisibility(0);
      VoteScreen.l(this.a).setVisibility(8);
      VoteScreen.m(this.a).notifyDataSetChanged();
      return;
      VoteScreen.a(this.a, "2");
      VoteScreen.j(this.a).setText("一键取消");
      VoteScreen.k(this.a).setVisibility(0);
      VoteScreen.l(this.a).setVisibility(8);
      VoteScreen.m(this.a).notifyDataSetChanged();
      return;
      VoteScreen.a(this.a, "3");
      VoteScreen.j(this.a).setText("一键取消");
      VoteScreen.k(this.a).setVisibility(0);
      VoteScreen.l(this.a).setVisibility(8);
      VoteScreen.m(this.a).notifyDataSetChanged();
      return;
      VoteScreen.k(this.a).setVisibility(0);
      VoteScreen.l(this.a).setVisibility(8);
      VoteScreen.j(this.a).setText("一键表决");
      return;
    } while ((VoteScreen.i(this.a) == null) || (VoteScreen.i(this.a).size() == 0));
    if (this.a.a)
    {
      this.a.b(2);
      return;
    }
    if (VoteScreen.n(this.a) == 2)
    {
      VoteScreen.o(this.a);
      return;
    }
    VoteScreen.p(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\trade\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */