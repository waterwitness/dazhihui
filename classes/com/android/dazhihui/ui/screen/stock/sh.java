package com.android.dazhihui.ui.screen.stock;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.dazhihui.d.n;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.model.stock.SelfStock;
import com.android.dazhihui.ui.screen.y;
import java.util.Vector;

public class sh
  extends BaseAdapter
{
  private Context b;
  private LayoutInflater c;
  
  public sh(SelfStockEditScreen paramSelfStockEditScreen, Context paramContext)
  {
    this.b = paramContext;
    this.c = LayoutInflater.from(this.b);
  }
  
  public SelfStock a(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= SelfStockEditScreen.c(this.a).size())) {
      return null;
    }
    return (SelfStock)SelfStockEditScreen.c(this.a).get(paramInt);
  }
  
  public void a()
  {
    SelfStockEditScreen.c(this.a).clear();
    notifyDataSetChanged();
  }
  
  public void a(SelfStock paramSelfStock)
  {
    if (paramSelfStock == null) {
      return;
    }
    SelfStockEditScreen.c(this.a).remove(paramSelfStock);
    notifyDataSetChanged();
  }
  
  public void a(SelfStock paramSelfStock, int paramInt)
  {
    SelfStockEditScreen.c(this.a).add(paramInt, paramSelfStock);
    if ((paramSelfStock != null) && (paramSelfStock.getPingTop()) && (paramInt - 1 >= 0) && (paramInt - 1 < SelfStockEditScreen.c(this.a).size()) && (SelfStockEditScreen.c(this.a).get(paramInt - 1) != null) && (!((SelfStock)SelfStockEditScreen.c(this.a).get(paramInt - 1)).getPingTop())) {
      paramSelfStock.setPingTop(false);
    }
    notifyDataSetChanged();
  }
  
  public void a(y paramy)
  {
    notifyDataSetChanged();
  }
  
  public void b(int paramInt)
  {
    if (paramInt > SelfStockEditScreen.c(this.a).size() - 1) {
      return;
    }
    SelfStockEditScreen.c(this.a).remove(paramInt);
    notifyDataSetChanged();
  }
  
  public int getCount()
  {
    return SelfStockEditScreen.c(this.a).size();
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    sj localsj;
    label202:
    String str;
    if (paramView == null)
    {
      paramViewGroup = this.c.inflate(2130903102, null);
      localsj = new sj(this);
      localsj.a = ((TextView)paramViewGroup.findViewById(2131558841));
      localsj.b = ((TextView)paramViewGroup.findViewById(2131558843));
      localsj.c = ((LinearLayout)paramViewGroup.findViewById(2131558845));
      localsj.d = ((TextView)paramViewGroup.findViewById(2131558846));
      localsj.e = ((Button)paramViewGroup.findViewById(2131558844));
      localsj.f = ((LinearLayout)paramViewGroup.findViewById(2131558840));
      localsj.g = ((LinearLayout)paramViewGroup.findViewById(2131558842));
      paramViewGroup.setTag(localsj);
      if (SelfStockEditScreen.d(this.a) != y.b) {
        break label364;
      }
      localsj.a.setTextColor(this.a.getResources().getColor(2131493626));
      localsj.b.setTextColor(this.a.getResources().getColor(2131493626));
      localsj.d.setTextColor(this.a.getResources().getColor(2131493626));
      paramView = ((SelfStock)SelfStockEditScreen.c(this.a).get(paramInt)).getCode();
      str = ((SelfStock)SelfStockEditScreen.c(this.a).get(paramInt)).getName();
      if (paramView != null) {
        break label427;
      }
      b(paramInt);
    }
    for (;;)
    {
      if (paramView != null)
      {
        si localsi = new si(this, paramInt);
        localsj.a.setText(paramView);
        localsj.b.setText(str);
        localsj.e.setOnClickListener(localsi);
        paramView = localsj.f.getLayoutParams();
        if (paramView != null) {
          paramView.width = (g.a().m() * 3 / 10);
        }
        paramView = localsj.f.getLayoutParams();
        if (paramView != null) {
          paramView.width = (g.a().m() * 3 / 10);
        }
      }
      return paramViewGroup;
      localsj = (sj)paramView.getTag();
      paramViewGroup = paramView;
      break;
      label364:
      localsj.a.setTextColor(this.a.getResources().getColor(2131493563));
      localsj.b.setTextColor(this.a.getResources().getColor(2131493563));
      localsj.d.setTextColor(this.a.getResources().getColor(2131493563));
      break label202;
      label427:
      if (paramView.equals(""))
      {
        localsj.c.setVisibility(8);
        localsj.e.setVisibility(8);
      }
      else
      {
        paramView = n.e(paramView);
        localsj.c.setVisibility(0);
        localsj.e.setVisibility(0);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\sh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */