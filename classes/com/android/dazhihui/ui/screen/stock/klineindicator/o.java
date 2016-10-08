package com.android.dazhihui.ui.screen.stock.klineindicator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class o
  extends BaseAdapter
{
  private Context b;
  private LayoutInflater c;
  
  public o(SettingKlineIndicator paramSettingKlineIndicator, Context paramContext)
  {
    this.b = paramContext;
    this.c = LayoutInflater.from(this.b);
  }
  
  public String a(int paramInt)
  {
    return (String)SettingKlineIndicator.c(this.a).get(paramInt);
  }
  
  public void a(String paramString)
  {
    if (paramString == null) {
      return;
    }
    SettingKlineIndicator.c(this.a).remove(paramString);
    notifyDataSetChanged();
  }
  
  public void a(String paramString, int paramInt)
  {
    SettingKlineIndicator.c(this.a).add(paramInt, paramString);
    notifyDataSetChanged();
  }
  
  public void b(int paramInt)
  {
    if (paramInt > SettingKlineIndicator.c(this.a).size() - 1) {
      return;
    }
    SettingKlineIndicator.c(this.a).remove(paramInt);
    notifyDataSetChanged();
  }
  
  public int getCount()
  {
    return SettingKlineIndicator.c(this.a).size();
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    String str2;
    if (paramView == null)
    {
      paramView = this.c.inflate(2130903222, null);
      paramViewGroup = new q(this);
      paramViewGroup.a = ((TextView)paramView.findViewById(2131559553));
      paramViewGroup.b = ((ImageView)paramView.findViewById(2131559554));
      paramViewGroup.c = ((ImageView)paramView.findViewById(2131559555));
      paramView.setTag(paramViewGroup);
      paramViewGroup.b.setTag(Integer.valueOf(paramInt));
      paramViewGroup.b.setOnClickListener(new p(this));
      str2 = (String)SettingKlineIndicator.c(this.a).get(paramInt);
      if (str2 != null) {
        break label183;
      }
      b(paramInt);
    }
    for (;;)
    {
      if (str2 != null)
      {
        String str1 = str2;
        if (str2.equals("MA")) {
          str1 = str2 + "(均线)";
        }
        paramViewGroup.a.setText(str1);
      }
      return paramView;
      paramViewGroup = (q)paramView.getTag();
      break;
      label183:
      if (str2.equals("")) {
        paramView.setVisibility(4);
      } else {
        paramView.setVisibility(0);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\klineindicator\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */