package com.android.dazhihui.ui.screen.stock.offlinecapital;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.dazhihui.d.n;
import java.util.ArrayList;

public class ab
  extends BaseAdapter
{
  private Context b;
  private LayoutInflater c;
  private aa d = new aa(this.a, null);
  private aa e = new aa(this.a, null);
  
  public ab(OfflineCapitalSettingActivity paramOfflineCapitalSettingActivity, Context paramContext)
  {
    this.b = paramContext;
    this.c = LayoutInflater.from(this.b);
  }
  
  public ag a(int paramInt)
  {
    return (ag)OfflineCapitalSettingActivity.a(this.a).get(paramInt);
  }
  
  public void a(ag paramag)
  {
    if (paramag == null) {
      return;
    }
    OfflineCapitalSettingActivity.a(this.a).remove(paramag);
    notifyDataSetChanged();
  }
  
  public void a(ag paramag, int paramInt)
  {
    OfflineCapitalSettingActivity.a(this.a).add(paramInt, paramag);
    if ((paramag != null) && (paramag.l()) && (paramInt - 1 >= 0) && (paramInt - 1 < OfflineCapitalSettingActivity.a(this.a).size()) && (OfflineCapitalSettingActivity.a(this.a).get(paramInt - 1) != null) && (!((ag)OfflineCapitalSettingActivity.a(this.a).get(paramInt - 1)).l())) {
      paramag.a(false);
    }
    notifyDataSetChanged();
  }
  
  public void b(int paramInt)
  {
    if (paramInt > OfflineCapitalSettingActivity.a(this.a).size() - 1) {
      return;
    }
    OfflineCapitalSettingActivity.a(this.a).remove(paramInt);
    notifyDataSetChanged();
  }
  
  public int getCount()
  {
    return OfflineCapitalSettingActivity.a(this.a).size();
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    View localView;
    String str;
    if (paramView == null)
    {
      localView = this.c.inflate(2130903362, null);
      paramViewGroup = new af(this);
      paramViewGroup.a = ((TextView)localView.findViewById(2131560168));
      paramViewGroup.b = ((TextView)localView.findViewById(2131558624));
      paramViewGroup.c = ((LinearLayout)localView.findViewById(2131558845));
      paramViewGroup.d = ((ImageView)localView.findViewById(2131558844));
      paramViewGroup.e = ((EditText)localView.findViewById(2131560169));
      paramViewGroup.f = ((EditText)localView.findViewById(2131560170));
      localView.setTag(paramViewGroup);
      paramView = ((ag)OfflineCapitalSettingActivity.a(this.a).get(paramInt)).a();
      str = ((ag)OfflineCapitalSettingActivity.a(this.a).get(paramInt)).b();
      if (paramView != null) {
        break label422;
      }
      b(paramInt);
      label161:
      if (paramView != null)
      {
        paramViewGroup.a.setText(paramView);
        paramViewGroup.b.setText(str);
      }
      paramViewGroup.d.setTag(Integer.valueOf(paramInt));
      paramViewGroup.d.setOnClickListener(new ac(this));
      if (((ag)OfflineCapitalSettingActivity.a(this.a).get(paramInt)).m() == 0) {
        break label454;
      }
      paramViewGroup.e.setText("" + ((ag)OfflineCapitalSettingActivity.a(this.a).get(paramInt)).m());
    }
    for (;;)
    {
      paramViewGroup.e.setTag(Integer.valueOf(paramInt));
      paramViewGroup.e.setTag(2131558470, "chicangliang");
      paramViewGroup.e.setOnFocusChangeListener(new ad(this));
      str = ((ag)OfflineCapitalSettingActivity.a(this.a).get(paramInt)).n();
      paramView = str;
      if (str.startsWith(".")) {
        paramView = "0" + str;
      }
      paramViewGroup.f.setText(paramView);
      paramViewGroup.f.setTag(Integer.valueOf(paramInt));
      paramViewGroup.f.setTag(2131558470, "chengbenjia");
      paramViewGroup.f.setOnFocusChangeListener(new ae(this));
      return localView;
      paramViewGroup = (af)paramView.getTag();
      localView = paramView;
      break;
      label422:
      if (paramView.equals(""))
      {
        localView.setVisibility(4);
        break label161;
      }
      localView.setVisibility(0);
      paramView = n.e(paramView);
      break label161;
      label454:
      paramViewGroup.e.setText("");
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\offlinecapital\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */