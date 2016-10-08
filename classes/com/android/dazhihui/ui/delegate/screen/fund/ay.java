package com.android.dazhihui.ui.delegate.screen.fund;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.delegate.screen.EntrustTable_history;
import com.android.dazhihui.ui.screen.stock.TipActivity;

class ay
  implements AdapterView.OnItemClickListener
{
  ay(FundMenu paramFundMenu) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = ((TextView)paramView.findViewById(2131561234)).getText().toString();
    paramAdapterView = paramAdapterView.substring(paramAdapterView.indexOf(".") + 1);
    if (paramAdapterView.equals("基金信息"))
    {
      paramAdapterView = new Bundle();
      paramAdapterView.putString("tag", "jjinfo");
      this.a.startActivity(FundListViewPublic.class, paramAdapterView);
    }
    do
    {
      do
      {
        do
        {
          return;
          if (paramAdapterView.equals("基金认购"))
          {
            paramAdapterView = new Bundle();
            paramAdapterView.putInt("screenId", 0);
            this.a.startActivity(FundEntrust.class, paramAdapterView);
            n.a("", 20055);
            return;
          }
          if (paramAdapterView.equals("基金申购"))
          {
            paramAdapterView = new Bundle();
            paramAdapterView.putInt("screenId", 1);
            this.a.startActivity(FundEntrust.class, paramAdapterView);
            return;
          }
          if (paramAdapterView.equals("基金赎回"))
          {
            this.a.startActivity(FundAtone.class);
            return;
          }
        } while (paramAdapterView.equals("基金定投"));
        if (paramAdapterView.equals("基金撤单"))
        {
          this.a.startActivity(FundCancelTable.class);
          n.a("", 20058);
          return;
        }
        if (paramAdapterView.equals("委托查询"))
        {
          paramAdapterView = new Intent();
          paramView = new Bundle();
          paramView.putString("type", "fundDeledate");
          paramAdapterView.putExtras(paramView);
          paramAdapterView.setClass(this.a, EntrustTable_history.class);
          this.a.startActivity(paramAdapterView);
          n.a("", 20053);
          return;
        }
        if (paramAdapterView.equals("历史成交"))
        {
          paramAdapterView = new Intent();
          paramView = new Bundle();
          paramView.putString("type", "tradeHistory");
          paramAdapterView.putExtras(paramView);
          paramAdapterView.setClass(this.a, EntrustTable_history.class);
          this.a.startActivity(paramAdapterView);
          n.a("", 20054);
          return;
        }
        if (paramAdapterView.equals("份额明细"))
        {
          paramAdapterView = new Bundle();
          paramAdapterView.putString("tag", "femx");
          this.a.startActivity(FundListViewPublic.class, paramAdapterView);
          return;
        }
        if (paramAdapterView.equals("分红方式"))
        {
          this.a.startActivity(FundDividend.class);
          n.a("", 20056);
          return;
        }
        if (paramAdapterView.equals("基金转换"))
        {
          this.a.startActivity(FundTransfer.class);
          n.a("", 20057);
          return;
        }
      } while ((paramAdapterView.equals("基金分拆")) || (paramAdapterView.equals("基金合并")));
      if (paramAdapterView.equals("基金开户"))
      {
        paramAdapterView = new Bundle();
        paramAdapterView.putInt("type", 6);
        this.a.startActivity(TipActivity.class, paramAdapterView);
        n.a("", 20059);
        return;
      }
      if (paramAdapterView.equals("基金账户"))
      {
        paramAdapterView = new Bundle();
        paramAdapterView.putString("tag", "jjzhcx");
        this.a.startActivity(FundListViewPublic.class, paramAdapterView);
        n.a("", 20060);
        return;
      }
      if (paramAdapterView.equals("基金风险承受能力测评"))
      {
        paramAdapterView = new Bundle();
        paramAdapterView.putInt("type", 300);
        this.a.startActivity(TipActivity.class, paramAdapterView);
        return;
      }
      if (paramAdapterView.equals("风险级别查询"))
      {
        FundMenu.a(this.a);
        return;
      }
    } while (!paramAdapterView.equals("场内基金"));
    this.a.startActivity(IFundMenu.class);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\ay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */