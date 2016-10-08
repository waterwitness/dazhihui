package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.model.stock.MarketVo;
import com.android.dazhihui.ui.screen.y;
import java.util.List;

public class hd
  extends BaseAdapter
{
  private LayoutInflater a;
  private List<MarketVo> b;
  
  public hd(Context paramContext, List<MarketVo> paramList)
  {
    this.a = LayoutInflater.from(paramContext);
    this.b = paramList;
  }
  
  public MarketVo a(int paramInt)
  {
    return (MarketVo)this.b.get(paramInt);
  }
  
  public int getCount()
  {
    return this.b.size();
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      paramView = this.a.inflate(2130903575, null);
      paramViewGroup = new he();
      paramViewGroup.a = ((TextView)paramView.findViewById(2131558567));
      paramView.setTag(paramViewGroup);
      if (g.a().b() != y.b) {
        break label102;
      }
      paramViewGroup.a.setTextColor(-16777216);
    }
    for (;;)
    {
      MarketVo localMarketVo = (MarketVo)this.b.get(paramInt);
      paramViewGroup.a.setText(localMarketVo.getName());
      return paramView;
      paramViewGroup = (he)paramView.getTag();
      break;
      label102:
      paramViewGroup.a.setTextColor(-1);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\hd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */