package com.android.dazhihui.ui.screen.stock.offlinecapital;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.android.dazhihui.c.a.d;
import java.util.Vector;

class y
  extends BaseAdapter
{
  private Context b;
  private LayoutInflater c;
  
  public y(OfflineCapitalMine paramOfflineCapitalMine, Context paramContext)
  {
    this.b = paramContext;
    this.c = LayoutInflater.from(paramContext);
  }
  
  public int getCount()
  {
    return OfflineCapitalMine.a(this.a).size();
  }
  
  public Object getItem(int paramInt)
  {
    return OfflineCapitalMine.a(this.a).get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public int getItemViewType(int paramInt)
  {
    paramInt = Integer.parseInt(((n)OfflineCapitalMine.a(this.a).get(paramInt)).e());
    int i = OfflineCapitalMine.b(this.a).b("offline_capital_state", 0);
    OfflineCapitalMine.b(this.a).g();
    if ((paramInt == 1) && (i == 2)) {
      return 0;
    }
    return 1;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    int i = Integer.parseInt(((n)OfflineCapitalMine.a(this.a).get(paramInt)).e());
    int j = OfflineCapitalMine.b(this.a).b("offline_capital_state", 0);
    OfflineCapitalMine.b(this.a).g();
    if (paramView == null)
    {
      if ((i == 1) && (j == 2))
      {
        paramView = this.c.inflate(2130903357, null);
        this.a.a(paramView, paramInt);
        return paramView;
      }
      paramView = this.c.inflate(2130903358, null);
      this.a.b(paramView, paramInt);
      return paramView;
    }
    if ((i == 1) && (j == 2))
    {
      this.a.a(paramView, paramInt);
      return paramView;
    }
    this.a.b(paramView, paramInt);
    return paramView;
  }
  
  public int getViewTypeCount()
  {
    return 2;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\offlinecapital\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */