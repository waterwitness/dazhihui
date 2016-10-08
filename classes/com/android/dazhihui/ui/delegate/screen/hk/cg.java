package com.android.dazhihui.ui.delegate.screen.hk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.android.dazhihui.ui.screen.BaseActivity;

class cg
  implements AdapterView.OnItemClickListener
{
  cg(HKTradeMenu paramHKTradeMenu) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    new Intent();
    new Bundle();
    switch (paramInt)
    {
    default: 
      return;
    case 0: 
      ((BaseActivity)this.a.getActivity()).startActivity(HKCaptialHolding.class);
      return;
    case 1: 
      paramAdapterView = new Bundle();
      paramAdapterView.putInt("type", 0);
      ((BaseActivity)this.a.getActivity()).startActivity(HKEntrust.class, paramAdapterView);
      return;
    case 2: 
      paramAdapterView = new Bundle();
      paramAdapterView.putInt("type", 1);
      ((BaseActivity)this.a.getActivity()).startActivity(HKEntrust.class, paramAdapterView);
      return;
    case 3: 
      paramAdapterView = new Bundle();
      ((BaseActivity)this.a.getActivity()).startActivity(q.class, paramAdapterView);
      return;
    case 4: 
      paramAdapterView = new Bundle();
      paramAdapterView.putInt("screenId", 15020);
      ((BaseActivity)this.a.getActivity()).startActivity(HKQuery.class, paramAdapterView);
      return;
    case 5: 
      paramAdapterView = new Bundle();
      paramAdapterView.putInt("screenId", 15016);
      ((BaseActivity)this.a.getActivity()).startActivity(HKQuery.class, paramAdapterView);
      return;
    case 6: 
      paramAdapterView = new Bundle();
      paramAdapterView.putInt("screenId", 15022);
      ((BaseActivity)this.a.getActivity()).startActivity(HKQuery.class, paramAdapterView);
      return;
    case 7: 
      paramAdapterView = new Bundle();
      paramAdapterView.putInt("screenId", 15018);
      ((BaseActivity)this.a.getActivity()).startActivity(HKQuery.class, paramAdapterView);
      return;
    }
    ((BaseActivity)this.a.getActivity()).startActivity(HKSetting.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\cg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */