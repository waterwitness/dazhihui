package com.android.dazhihui.ui.delegate.screen.fund;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;

class cn
  implements AdapterView.OnItemClickListener
{
  cn(IFundMenu paramIFundMenu) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = new Intent();
    paramView = ((TextView)paramView.findViewById(2131561234)).getText().toString();
    paramView = paramView.substring(paramView.indexOf(".") + 1);
    if (paramView.equals("场内认购"))
    {
      paramView = new Bundle();
      paramView.putInt("screenId", 2);
      paramAdapterView.putExtras(paramView);
      paramAdapterView.setClass(this.a, IFundEntrust.class);
      this.a.startActivity(paramAdapterView);
    }
    do
    {
      return;
      if (paramView.equals("场内申购"))
      {
        paramView = new Bundle();
        paramView.putInt("screenId", 0);
        paramAdapterView.putExtras(paramView);
        paramAdapterView.setClass(this.a, IFundEntrust.class);
        this.a.startActivity(paramAdapterView);
        return;
      }
    } while (!paramView.equals("场内赎回"));
    paramAdapterView.setClass(this.a, IFundAtone.class);
    this.a.startActivity(paramAdapterView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\cn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */