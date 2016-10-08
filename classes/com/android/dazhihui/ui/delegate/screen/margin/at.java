package com.android.dazhihui.ui.delegate.screen.margin;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;

class at
  implements AdapterView.OnItemClickListener
{
  at(as paramas) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = ((TextView)paramView.findViewById(2131561234)).getText().toString();
    paramView = new Bundle();
    if (paramAdapterView.equals("当日成交"))
    {
      paramView.putInt("category", 12142);
      this.a.a(MarginQuery.class, paramView);
    }
    do
    {
      return;
      if (paramAdapterView.equals("当日委托"))
      {
        paramView.putInt("category", 12138);
        this.a.a(MarginQuery.class, paramView);
        return;
      }
      if (paramAdapterView.equals("历史成交"))
      {
        paramView.putInt("category", 12146);
        this.a.a(MarginQuery.class, paramView);
        return;
      }
      if (paramAdapterView.equals("历史委托"))
      {
        paramView.putInt("category", 12144);
        this.a.a(MarginQuery.class, paramView);
        return;
      }
      if (paramAdapterView.equals("配号"))
      {
        paramView.putInt("category", 12510);
        this.a.a(MarginQuery.class, paramView);
        return;
      }
      if (paramAdapterView.equals("中签"))
      {
        paramView.putInt("category", 12522);
        this.a.a(MarginQuery.class, paramView);
        return;
      }
      if (paramAdapterView.equals("资金流水"))
      {
        paramView.putInt("category", 12148);
        this.a.a(MarginQuery.class, paramView);
        return;
      }
      if (paramAdapterView.equals("交割单"))
      {
        paramView.putInt("category", 12412);
        this.a.a(MarginQuery.class, paramView);
        return;
      }
      if (paramAdapterView.equals("合约查询"))
      {
        this.a.a(MarginDebtQueryMenu.class);
        return;
      }
      if (paramAdapterView.equals("未偿还融资负债"))
      {
        paramView.putInt("category", 12126);
        this.a.a(MarginQuery.class, paramView);
        return;
      }
      if (paramAdapterView.equals("未偿还融券负债"))
      {
        paramView.putInt("category", 12028);
        this.a.a(MarginQuery.class, paramView);
        return;
      }
      if (paramAdapterView.equals("已偿还融资负债"))
      {
        paramView.putInt("category", 12322);
        this.a.a(MarginQuery.class, paramView);
        return;
      }
      if (paramAdapterView.equals("已偿还融券负债"))
      {
        paramView.putInt("category", 12324);
        this.a.a(MarginQuery.class, paramView);
        return;
      }
      if (paramAdapterView.equals("担保品证券查询"))
      {
        paramView.putInt("category", 12152);
        this.a.a(MarginQuery.class, paramView);
        return;
      }
      if (paramAdapterView.equals("融券券源查询"))
      {
        paramView.putInt("category", 12154);
        this.a.a(MarginQuery.class, paramView);
        return;
      }
    } while (!paramAdapterView.equals("融券标的查询"));
    paramView.putInt("category", 12254);
    this.a.a(MarginQuery.class, paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\margin\at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */