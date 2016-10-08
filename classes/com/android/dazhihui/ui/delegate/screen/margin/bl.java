package com.android.dazhihui.ui.delegate.screen.margin;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.ui.delegate.screen.TransferMenuNew;
import com.android.dazhihui.ui.delegate.screen.gc;
import com.android.dazhihui.ui.screen.BaseActivity;

class bl
  implements View.OnClickListener
{
  bl(bi parambi) {}
  
  public void onClick(View paramView)
  {
    Bundle localBundle = new Bundle();
    switch (paramView.getId())
    {
    case 2131559781: 
    case 2131559783: 
    case 2131559785: 
    case 2131559787: 
    case 2131559789: 
    default: 
      return;
    case 2131559779: 
      ((BaseActivity)this.a.getActivity()).startActivity(TransferMenuNew.class);
      return;
    case 2131559780: 
      localBundle.putInt("type", 0);
      ((BaseActivity)this.a.getActivity()).startActivity(MarginCommonScreen.class, localBundle);
      return;
    case 2131559782: 
      localBundle.putInt("type", 1);
      ((BaseActivity)this.a.getActivity()).startActivity(MarginCommonScreen.class, localBundle);
      return;
    case 2131559784: 
      localBundle.putInt("mode", 0);
      localBundle.putInt("type", 0);
      ((BaseActivity)this.a.getActivity()).startActivity(MarginCommonScreen2.class, localBundle);
      return;
    case 2131559786: 
      localBundle.putInt("mode", 1);
      localBundle.putInt("type", 0);
      ((BaseActivity)this.a.getActivity()).startActivity(MarginCommonScreen2.class, localBundle);
      return;
    case 2131559788: 
      localBundle.putInt("type", 2);
      ((BaseActivity)this.a.getActivity()).startActivity(MarginCommonScreen.class, localBundle);
      return;
    }
    ((gc)this.a.getParentFragment()).e();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\margin\bl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */