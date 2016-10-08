package com.android.dazhihui.ui.delegate.screen.setplan;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;

class z
  implements AdapterView.OnItemClickListener
{
  z(SetPlanMenu paramSetPlanMenu) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = ((TextView)paramView.findViewById(2131561234)).getText().toString();
    paramView = new Bundle();
    if (paramAdapterView.equals("产品查询"))
    {
      paramView.putInt("screenId", 12848);
      this.a.startActivity(SetPlanQuery.class, paramView);
    }
    do
    {
      return;
      if (paramAdapterView.equals("产品认购"))
      {
        paramView.putInt("screenId", 20481);
        this.a.startActivity(SetPlanEntrust.class, paramView);
        return;
      }
      if (paramAdapterView.equals("产品申购"))
      {
        paramView.putInt("screenId", 20482);
        this.a.startActivity(SetPlanEntrust.class, paramView);
        return;
      }
      if (paramAdapterView.equals("产品赎回"))
      {
        paramView.putInt("screenId", 20483);
        this.a.startActivity(SetPlanEntrust.class, paramView);
        return;
      }
      if (paramAdapterView.equals("份额查询"))
      {
        paramView.putInt("screenId", 20484);
        this.a.startActivity(SetPlanCaptialShare.class, paramView);
        return;
      }
      if (paramAdapterView.equals("分红方式设置"))
      {
        paramView.putInt("screenId", 20485);
        this.a.startActivity(SetPlanEntrust.class, paramView);
        return;
      }
      if (paramAdapterView.equals("集合计划转换"))
      {
        paramView.putInt("screenId", 20486);
        this.a.startActivity(SetPlanEntrust.class, paramView);
        return;
      }
      if (paramAdapterView.equals("历史委托查询"))
      {
        paramView.putInt("screenId", 12862);
        this.a.startActivity(SetPlanQuery.class, paramView);
        return;
      }
      if (paramAdapterView.equals("成交查询"))
      {
        paramView.putInt("screenId", 12864);
        this.a.startActivity(SetPlanQuery.class, paramView);
        return;
      }
    } while (!paramAdapterView.equals("当日委托/撤单"));
    paramView.putInt("screenId", 12860);
    this.a.startActivity(SetPlanQuery.class, paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\setplan\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */