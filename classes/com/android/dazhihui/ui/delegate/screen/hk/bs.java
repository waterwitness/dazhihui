package com.android.dazhihui.ui.delegate.screen.hk;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.dazhihui.ui.delegate.screen.ad;
import com.android.dazhihui.ui.screen.BaseActivity;

public class bs
  extends ad
  implements View.OnClickListener
{
  private static final String[] c = { "当日成交", "当日委托", "历史成交", "历史委托", "现金提存", "股票往来" };
  private View d;
  private LinearLayout[] e = null;
  private TextView[] f = null;
  
  private void b()
  {
    this.e = new LinearLayout[7];
    this.e[0] = ((LinearLayout)this.d.findViewById(2131560966));
    this.e[1] = ((LinearLayout)this.d.findViewById(2131560964));
    this.e[2] = ((LinearLayout)this.d.findViewById(2131560969));
    this.e[3] = ((LinearLayout)this.d.findViewById(2131560968));
    this.e[4] = ((LinearLayout)this.d.findViewById(2131560972));
    this.e[5] = ((LinearLayout)this.d.findViewById(2131560971));
    this.e[6] = ((LinearLayout)this.d.findViewById(2131560975));
    ((LinearLayout)this.d.findViewById(2131560974)).setVisibility(8);
    this.f = new TextView[7];
    this.f[0] = ((TextView)this.d.findViewById(2131560965));
    this.f[1] = ((TextView)this.d.findViewById(2131560236));
    this.f[2] = ((TextView)this.d.findViewById(2131560239));
    this.f[3] = ((TextView)this.d.findViewById(2131560242));
    this.f[4] = ((TextView)this.d.findViewById(2131560245));
    this.f[5] = ((TextView)this.d.findViewById(2131560973));
    this.f[6] = ((TextView)this.d.findViewById(2131560976));
    int i = 0;
    while (i < c.length)
    {
      this.f[i].setText(c[i]);
      this.e[i].setOnClickListener(this);
      i += 1;
    }
  }
  
  public void onClick(View paramView)
  {
    Bundle localBundle = new Bundle();
    switch (paramView.getId())
    {
    case 2131560965: 
    case 2131560967: 
    case 2131560970: 
    default: 
      return;
    case 2131560966: 
      localBundle.putInt("screenId", 15016);
      ((BaseActivity)getActivity()).startActivity(HKQuery.class, localBundle);
      return;
    case 2131560964: 
      localBundle.putInt("screenId", 15020);
      ((BaseActivity)getActivity()).startActivity(HKQuery.class, localBundle);
      return;
    case 2131560969: 
      localBundle.putInt("screenId", 15018);
      ((BaseActivity)getActivity()).startActivity(HKQuery.class, localBundle);
      return;
    case 2131560968: 
      localBundle.putInt("screenId", 15022);
      ((BaseActivity)getActivity()).startActivity(HKQuery.class, localBundle);
      return;
    case 2131560972: 
      localBundle.putInt("screenId", 15060);
      ((BaseActivity)getActivity()).startActivity(HKQuery.class, localBundle);
      return;
    }
    localBundle.putInt("screenId", 15058);
    ((BaseActivity)getActivity()).startActivity(HKQuery.class, localBundle);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.d = paramLayoutInflater.inflate(2130903524, paramViewGroup, false);
    b();
    return this.d;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\bs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */