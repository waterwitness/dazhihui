package com.android.dazhihui.ui.delegate.screen.hk;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.ui.screen.BaseActivity;

class bh
  implements View.OnClickListener
{
  bh(bb parambb) {}
  
  public void onClick(View paramView)
  {
    Bundle localBundle = new Bundle();
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131560828: 
      localBundle.putInt("screenId", 0);
      ((BaseActivity)this.a.getActivity()).startActivity(HKTradeCommon.class, localBundle);
      return;
    case 2131560829: 
      localBundle.putInt("screenId", 1);
      ((BaseActivity)this.a.getActivity()).startActivity(HKTradeCommon.class, localBundle);
      return;
    case 2131559788: 
      localBundle.putInt("screenId", 2);
      ((BaseActivity)this.a.getActivity()).startActivity(HKTradeCommon.class, localBundle);
      return;
    case 2131560832: 
      localBundle.putInt("screenId", 4);
      ((BaseActivity)this.a.getActivity()).startActivity(HKTradeCommon.class, localBundle);
      return;
    }
    localBundle.putInt("screenId", 3);
    ((BaseActivity)this.a.getActivity()).startActivity(HKTradeCommon.class, localBundle);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\bh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */