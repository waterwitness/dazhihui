package com.android.dazhihui.ui.delegate.screen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.ui.delegate.screen.fund.FundAtone;
import com.android.dazhihui.ui.delegate.screen.fund.FundEntrust;
import java.util.ArrayList;

class ch
  implements View.OnClickListener
{
  private int b;
  
  ch(cd paramcd) {}
  
  public void a(int paramInt)
  {
    this.b = paramInt;
  }
  
  public void onClick(View paramView)
  {
    cf localcf = (cf)cd.a(this.a).get(this.b);
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131559522: 
      paramView = new Intent(this.a.getActivity(), FundEntrust.class);
      localBundle = new Bundle();
      localBundle.putString("scode", localcf.c);
      localBundle.putInt("screenId", 1);
      paramView.putExtras(localBundle);
      this.a.startActivity(paramView);
      return;
    }
    paramView = new Intent(this.a.getActivity(), FundAtone.class);
    Bundle localBundle = new Bundle();
    localBundle.putString("codes", localcf.c);
    paramView.putExtras(localBundle);
    this.a.startActivity(paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\ch.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */