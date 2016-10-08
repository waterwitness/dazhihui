package com.android.dazhihui.ui.delegate.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.dazhihui.ui.delegate.a;
import com.android.dazhihui.ui.delegate.c.c;
import java.util.ArrayList;

class e
  extends BaseAdapter
{
  e(TradeAccountSwitchView paramTradeAccountSwitchView) {}
  
  public int getCount()
  {
    return TradeAccountSwitchView.a(this.a).size();
  }
  
  public Object getItem(int paramInt)
  {
    return TradeAccountSwitchView.a(this.a).get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    String str;
    if (paramView == null)
    {
      paramView = this.a.a.inflate(2130903462, null);
      paramViewGroup = new g(this.a, null);
      paramViewGroup.a = ((ImageView)paramView.findViewById(2131560640));
      paramViewGroup.b = ((TextView)paramView.findViewById(2131560642));
      paramViewGroup.c = ((TextView)paramView.findViewById(2131558673));
      paramViewGroup.d = ((ImageView)paramView.findViewById(2131560641));
      paramViewGroup.e = paramView.findViewById(2131560254);
      paramView.setTag(paramViewGroup);
      paramViewGroup.a.setImageDrawable(this.a.a(((f)TradeAccountSwitchView.a(this.a).get(paramInt)).a()));
      if (!((f)TradeAccountSwitchView.a(this.a).get(paramInt)).c().equals("1")) {
        break label327;
      }
      str = ((f)TradeAccountSwitchView.a(this.a).get(paramInt)).a() + "【融】";
      label191:
      paramViewGroup.b.setText(str);
      paramViewGroup.c.setText(((f)TradeAccountSwitchView.a(this.a).get(paramInt)).b());
      if ((paramInt != TradeAccountSwitchView.a(this.a).size() - 1) || (paramInt == 0)) {
        break label349;
      }
      paramViewGroup.e.setVisibility(4);
    }
    for (;;)
    {
      c localc = a.a().c();
      if ((localc == null) || (!((f)TradeAccountSwitchView.a(this.a).get(paramInt)).b().contains(localc.d())) || (!localc.c().equals(str))) {
        break label360;
      }
      paramViewGroup.d.setVisibility(0);
      return paramView;
      paramViewGroup = (g)paramView.getTag();
      break;
      label327:
      str = ((f)TradeAccountSwitchView.a(this.a).get(paramInt)).a();
      break label191;
      label349:
      paramViewGroup.e.setVisibility(0);
    }
    label360:
    paramViewGroup.d.setVisibility(4);
    return paramView;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\view\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */