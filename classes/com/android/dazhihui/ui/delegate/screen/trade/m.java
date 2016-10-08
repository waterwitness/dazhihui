package com.android.dazhihui.ui.delegate.screen.trade;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.Vector;

class m
  implements View.OnClickListener
{
  int a;
  
  m(VoteScreen paramVoteScreen) {}
  
  public void a(int paramInt)
  {
    this.a = paramInt;
  }
  
  public void onClick(View paramView)
  {
    int i = paramView.getId();
    if (this.b.a)
    {
      this.b.b(2);
      return;
    }
    switch (i)
    {
    case 2131561337: 
    default: 
    case 2131561338: 
      for (;;)
      {
        VoteScreen.m(this.b).notifyDataSetChanged();
        return;
        if (VoteScreen.t(this.b) == -1) {
          VoteScreen.b(this.b, this.a);
        } else {
          VoteScreen.b(this.b, -1);
        }
      }
    case 2131561334: 
      if ((VoteScreen.b(this.b, ((j)VoteScreen.i(this.b).get(this.a)).d)) && (VoteScreen.f(this.b, ((j)VoteScreen.i(this.b).get(this.a)).d))) {
        VoteScreen.a(this.b, ((j)VoteScreen.i(this.b).get(this.a)).d, "1");
      }
      for (;;)
      {
        VoteScreen.b(this.b, -1);
        break;
        ((j)VoteScreen.i(this.b).get(this.a)).m = "1";
      }
    case 2131561335: 
      if ((VoteScreen.b(this.b, ((j)VoteScreen.i(this.b).get(this.a)).d)) && (VoteScreen.f(this.b, ((j)VoteScreen.i(this.b).get(this.a)).d))) {
        VoteScreen.a(this.b, ((j)VoteScreen.i(this.b).get(this.a)).d, "2");
      }
      for (;;)
      {
        VoteScreen.b(this.b, -1);
        break;
        ((j)VoteScreen.i(this.b).get(this.a)).m = "2";
      }
    }
    if ((VoteScreen.b(this.b, ((j)VoteScreen.i(this.b).get(this.a)).d)) && (VoteScreen.f(this.b, ((j)VoteScreen.i(this.b).get(this.a)).d))) {
      VoteScreen.a(this.b, ((j)VoteScreen.i(this.b).get(this.a)).d, "3");
    }
    for (;;)
    {
      VoteScreen.b(this.b, -1);
      break;
      ((j)VoteScreen.i(this.b).get(this.a)).m = "3";
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\trade\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */