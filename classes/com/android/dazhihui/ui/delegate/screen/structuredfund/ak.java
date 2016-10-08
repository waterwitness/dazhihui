package com.android.dazhihui.ui.delegate.screen.structuredfund;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;

class ak
  implements AdapterView.OnItemClickListener
{
  ak(aj paramaj) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = ((TextView)paramView.findViewById(2131561234)).getText().toString();
    paramView = new Bundle();
    if (paramAdapterView.equals("当日成交"))
    {
      paramView.putInt("category", 12914);
      this.a.a(StructuredFundQuery.class, paramView);
    }
    do
    {
      return;
      if (paramAdapterView.equals("当日委托"))
      {
        paramView.putInt("category", 12912);
        this.a.a(StructuredFundQuery.class, paramView);
        return;
      }
      if (paramAdapterView.equals("历史成交"))
      {
        paramView.putInt("category", 12920);
        this.a.a(StructuredFundQuery.class, paramView);
        return;
      }
    } while (!paramAdapterView.equals("历史委托"));
    paramView.putInt("category", 12918);
    this.a.a(StructuredFundQuery.class, paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\structuredfund\ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */