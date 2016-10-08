package com.android.dazhihui.ui.delegate.screen.otc;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;

class y
  implements AdapterView.OnItemClickListener
{
  y(OtcMenu paramOtcMenu) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = ((TextView)paramView.findViewById(2131561234)).getText().toString();
    paramView = new Bundle();
    if (paramAdapterView.equals("产品查询"))
    {
      paramView.putInt("screenId", 12692);
      this.a.startActivity(OtcQuery.class, paramView);
    }
    do
    {
      return;
      if (paramAdapterView.equals("产品认购"))
      {
        paramView.putInt("screenId", 16385);
        this.a.startActivity(OtcEntrust.class, paramView);
        return;
      }
      if (paramAdapterView.equals("产品申购"))
      {
        paramView.putInt("screenId", 16386);
        this.a.startActivity(OtcEntrust.class, paramView);
        return;
      }
      if (paramAdapterView.equals("产品赎回"))
      {
        paramView.putInt("screenId", 16387);
        this.a.startActivity(OtcEntrust.class, paramView);
        return;
      }
      if (paramAdapterView.equals("产品撤单"))
      {
        paramView.putInt("screenId", 12698);
        this.a.startActivity(OtcQuery.class, paramView);
        return;
      }
      if (paramAdapterView.equals("资金份额"))
      {
        paramView.putInt("screenId", 16388);
        this.a.startActivity(OtcCaptialShare.class, paramView);
        return;
      }
      if (paramAdapterView.equals("当日委托查询"))
      {
        paramView.putInt("screenId", 12702);
        this.a.startActivity(OtcQuery.class, paramView);
        return;
      }
      if (paramAdapterView.equals("当日成交查询"))
      {
        paramView.putInt("screenId", 12704);
        this.a.startActivity(OtcQuery.class, paramView);
        return;
      }
      if (paramAdapterView.equals("历史成交查询"))
      {
        paramView.putInt("screenId", 12708);
        this.a.startActivity(OtcQuery.class, paramView);
        return;
      }
    } while (!paramAdapterView.equals("历史委托查询"));
    paramView.putInt("screenId", 12706);
    this.a.startActivity(OtcQuery.class, paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\otc\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */