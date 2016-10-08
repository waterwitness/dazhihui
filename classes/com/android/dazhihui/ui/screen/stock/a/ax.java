package com.android.dazhihui.ui.screen.stock.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.dazhihui.ui.model.stock.MarketMenuVo;
import com.android.dazhihui.ui.model.stock.MarketMenuVo.Header;
import com.android.dazhihui.ui.model.stock.MarketVo;
import com.android.dazhihui.ui.model.stock.NewsTitleVo;
import com.android.dazhihui.ui.widget.adv.ah;
import java.util.List;

class ax
  extends BaseAdapter
{
  List<MarketVo> a;
  Context b;
  private boolean d;
  
  public ax(Context paramContext, List<MarketVo> paramList, boolean paramBoolean)
  {
    this.b = paramList;
    this.a = paramBoolean;
    boolean bool;
    this.d = bool;
  }
  
  public MarketVo a(int paramInt)
  {
    return (MarketVo)this.a.get(paramInt);
  }
  
  public int getCount()
  {
    return this.a.size();
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      paramView = LayoutInflater.from(this.b).inflate(2130903336, paramViewGroup, false);
      paramViewGroup = new ay(this.c);
      paramViewGroup.a = ((TextView)paramView.findViewById(2131558565));
      paramViewGroup.b = ((ImageView)paramView.findViewById(2131560095));
      paramView.setTag(paramViewGroup);
      if (((MarketVo)this.a.get(paramInt)).getName().length() <= 4) {
        break label200;
      }
      au.a(this.c, ((MarketVo)this.a.get(paramInt)).getName().substring(0, 4) + "...");
      label132:
      if (!"2".equals(((MarketVo)this.a.get(paramInt)).getMenuflag())) {
        break label227;
      }
      paramViewGroup.b.setImageResource(2130838078);
      paramViewGroup.b.setVisibility(0);
    }
    for (;;)
    {
      paramViewGroup.a.setText(au.c(this.c));
      return paramView;
      paramViewGroup = (ay)paramView.getTag();
      break;
      label200:
      au.a(this.c, ((MarketVo)this.a.get(paramInt)).getName());
      break label132;
      label227:
      if ("3".equals(((MarketVo)this.a.get(paramInt)).getMenuflag()))
      {
        String str2 = au.b(this.c).header.vs;
        String str1 = str2;
        if (this.d)
        {
          str1 = str2;
          if (au.a(this.c) != null) {
            str1 = au.a(this.c).getVersion();
          }
        }
        if (!ah.c(14, str1 + ((MarketVo)this.a.get(paramInt)).getCountid() + ((MarketVo)this.a.get(paramInt)).getName()))
        {
          paramViewGroup.b.setImageResource(2130838459);
          paramViewGroup.b.setVisibility(0);
        }
        else
        {
          paramViewGroup.b.setVisibility(8);
        }
      }
      else
      {
        paramViewGroup.b.setVisibility(8);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\a\ax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */