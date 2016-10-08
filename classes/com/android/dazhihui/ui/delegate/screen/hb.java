package com.android.dazhihui.ui.delegate.screen;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class hb
  implements AdapterView.OnItemClickListener
{
  hb(TransferMenu paramTransferMenu) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 0: 
      paramAdapterView = new Bundle();
      paramAdapterView.putInt("screenId", 0);
      this.a.startActivity(Transfer.class, paramAdapterView);
      return;
    case 1: 
      paramAdapterView = new Bundle();
      paramAdapterView.putInt("screenId", 1);
      this.a.startActivity(Transfer.class, paramAdapterView);
      return;
    case 2: 
      this.a.startActivity(TransferTable.class);
      return;
    }
    paramAdapterView = new Bundle();
    paramAdapterView.putInt("screenId", 2);
    this.a.startActivity(Transfer.class, paramAdapterView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */