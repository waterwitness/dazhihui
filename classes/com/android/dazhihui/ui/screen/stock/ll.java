package com.android.dazhihui.ui.screen.stock;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.android.dazhihui.a.f;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.screen.BrowserActivity;
import com.android.dazhihui.w;
import java.util.List;

public class ll
  extends BaseAdapter
  implements AdapterView.OnItemClickListener
{
  private Context b;
  private List<String> c;
  
  public ll(Context paramContext, List<String> paramList)
  {
    this.b = paramList;
    List localList;
    this.c = localList;
  }
  
  public int getCount()
  {
    if (this.c != null) {
      return this.c.size();
    }
    return 0;
  }
  
  public Object getItem(int paramInt)
  {
    return null;
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    View localView;
    if (paramView == null)
    {
      paramView = new lm(this);
      localView = LayoutInflater.from(this.b).inflate(2130903311, null);
      paramView.c = ((ImageView)localView.findViewById(2131560012));
      paramView.a = ((ImageView)localView.findViewById(2131560010));
      paramView.b = ((TextView)localView.findViewById(2131560011));
      localView.setTag(paramView);
      paramViewGroup = paramView;
    }
    for (;;)
    {
      paramViewGroup.c.setVisibility(8);
      paramViewGroup.a.setVisibility(8);
      paramViewGroup.b.setText((CharSequence)this.c.get(paramInt));
      return localView;
      paramViewGroup = (lm)paramView.getTag();
      localView = paramView;
    }
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.a.p.dismiss();
    if (((String)this.c.get(paramInt)).equals("相关个股"))
    {
      n.a("", 1334);
      paramAdapterView = new Intent(this.b, CorrelationStockScreen.class);
      paramAdapterView.putExtra("data", kz.g(this.a));
      this.a.startActivity(paramAdapterView);
    }
    while (!((String)this.c.get(paramInt)).equals("问导师")) {
      return;
    }
    n.a(kz.h(this.a), 20090);
    if (!w.a().l())
    {
      paramAdapterView = new Intent(this.a.getActivity(), LoginMainScreen.class);
      paramAdapterView.putExtra("REGISTER_FROM_TYPE", "FROM_STOCK");
      this.a.startActivity(paramAdapterView);
      return;
    }
    paramAdapterView = new Bundle();
    paramView = new StringBuilder();
    paramView.append(f.E).append("&type=1").append("&newsTitile=").append(kz.j(this.a)).append("&newsLink=").append(kz.i(this.a)).append(f.F);
    paramAdapterView.putString("nexturl", paramView.toString());
    paramView = new Intent();
    paramView.setClass(this.a.getActivity(), BrowserActivity.class);
    paramView.putExtras(paramAdapterView);
    this.a.startActivity(paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\ll.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */