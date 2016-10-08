package com.android.dazhihui.ui.screen.stock.offlinecapital;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TableLayout;
import android.widget.TextView;
import java.util.ArrayList;

class l
  extends BaseAdapter
{
  l(OfflineCapitalDetailActivity paramOfflineCapitalDetailActivity) {}
  
  public int getCount()
  {
    return OfflineCapitalDetailActivity.k(this.a).size();
  }
  
  public Object getItem(int paramInt)
  {
    return OfflineCapitalDetailActivity.k(this.a).get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      paramView = OfflineCapitalDetailActivity.l(this.a).inflate(2130903353, null);
      paramViewGroup = new m(this.a, null);
      paramViewGroup.a = ((TableLayout)paramView.findViewById(2131560138));
      paramViewGroup.b = ((TextView)paramView.findViewById(2131558890));
      paramViewGroup.c = ((TextView)paramView.findViewById(2131558891));
      paramViewGroup.d = ((TextView)paramView.findViewById(2131558892));
      paramViewGroup.e = ((TextView)paramView.findViewById(2131558893));
      paramViewGroup.f = ((TextView)paramView.findViewById(2131558994));
      paramViewGroup.g = ((TextView)paramView.findViewById(2131558996));
      paramViewGroup.h = ((TextView)paramView.findViewById(2131558995));
      paramViewGroup.i = ((TextView)paramView.findViewById(2131558997));
      paramView.setTag(paramViewGroup);
      paramViewGroup.b.setText(((ag)OfflineCapitalDetailActivity.k(this.a).get(paramInt)).b());
      paramViewGroup.c.setText(((ag)OfflineCapitalDetailActivity.k(this.a).get(paramInt)).p());
      if (!((ag)OfflineCapitalDetailActivity.k(this.a).get(paramInt)).f().equals("--")) {
        break label614;
      }
      paramViewGroup.d.setText("0.00");
      label235:
      paramViewGroup.e.setText(((ag)OfflineCapitalDetailActivity.k(this.a).get(paramInt)).r());
      paramViewGroup.f.setText("" + ((ag)OfflineCapitalDetailActivity.k(this.a).get(paramInt)).m());
      if (OfflineCapitalDetailActivity.b(this.a) != 1) {
        break label641;
      }
      paramViewGroup.g.setText("--");
    }
    for (;;)
    {
      String str2 = ((ag)OfflineCapitalDetailActivity.k(this.a).get(paramInt)).n();
      String str1 = str2;
      if (str2.startsWith(".")) {
        str1 = "0" + str2;
      }
      paramViewGroup.h.setText(str1);
      paramViewGroup.i.setText(((ag)OfflineCapitalDetailActivity.k(this.a).get(paramInt)).f());
      paramViewGroup.b.setTextColor(((ag)OfflineCapitalDetailActivity.k(this.a).get(paramInt)).t());
      paramViewGroup.c.setTextColor(((ag)OfflineCapitalDetailActivity.k(this.a).get(paramInt)).t());
      paramViewGroup.d.setTextColor(((ag)OfflineCapitalDetailActivity.k(this.a).get(paramInt)).t());
      paramViewGroup.e.setTextColor(((ag)OfflineCapitalDetailActivity.k(this.a).get(paramInt)).t());
      paramViewGroup.f.setTextColor(((ag)OfflineCapitalDetailActivity.k(this.a).get(paramInt)).t());
      paramViewGroup.g.setTextColor(((ag)OfflineCapitalDetailActivity.k(this.a).get(paramInt)).t());
      paramViewGroup.h.setTextColor(((ag)OfflineCapitalDetailActivity.k(this.a).get(paramInt)).t());
      paramViewGroup.i.setTextColor(((ag)OfflineCapitalDetailActivity.k(this.a).get(paramInt)).t());
      return paramView;
      paramViewGroup = (m)paramView.getTag();
      break;
      label614:
      paramViewGroup.d.setText(((ag)OfflineCapitalDetailActivity.k(this.a).get(paramInt)).q());
      break label235;
      label641:
      paramViewGroup.g.setText("" + ((ag)OfflineCapitalDetailActivity.k(this.a).get(paramInt)).s());
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\offlinecapital\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */