package com.android.dazhihui.ui.delegate.screen.xc.trade;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.c.b;

class ca
  extends BaseAdapter
{
  private b[] b;
  
  ca(bw parambw) {}
  
  public void a(b[] paramArrayOfb)
  {
    this.b = paramArrayOfb;
  }
  
  public int getCount()
  {
    return this.b.length;
  }
  
  public Object getItem(int paramInt)
  {
    return this.b[paramInt];
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
      paramView = bw.b(this.a).inflate(2130903260, null);
      paramViewGroup = new cd(this.a);
      paramViewGroup.a = ((TextView)paramView.findViewById(2131559105));
      paramViewGroup.b = ((TextView)paramView.findViewById(2131559764));
      paramViewGroup.c = ((TextView)paramView.findViewById(2131559763));
      paramViewGroup.d = ((ImageView)paramView.findViewById(2131559765));
      paramView.setTag(paramViewGroup);
      str = this.b[paramInt].b;
      paramViewGroup.a.setText(this.b[paramInt].a);
      paramViewGroup.a.setTag(this.b[paramInt]);
      if ((!this.b[paramInt].b.contains("31100")) || (o.t <= 0)) {
        break label239;
      }
      paramViewGroup.d.setVisibility(0);
      paramViewGroup.b.setVisibility(0);
      paramViewGroup.b.setText("今日有" + o.t + "只新股可以申购");
    }
    for (;;)
    {
      if (!str.contains("31100")) {
        break label260;
      }
      paramViewGroup.c.setVisibility(0);
      paramViewGroup.c.setText("智能化一键申购");
      return paramView;
      paramViewGroup = (cd)paramView.getTag();
      break;
      label239:
      paramViewGroup.d.setVisibility(8);
      paramViewGroup.b.setVisibility(8);
    }
    label260:
    if (str.contains("31101"))
    {
      paramViewGroup.c.setVisibility(0);
      paramViewGroup.c.setText("一键申购当日全部新股");
      return paramView;
    }
    if (str.contains("32021"))
    {
      paramViewGroup.c.setVisibility(0);
      paramViewGroup.c.setText("账户余额享受理财收益");
      return paramView;
    }
    if (str.contains("32022"))
    {
      paramViewGroup.c.setVisibility(0);
      paramViewGroup.c.setText("网上证券营业部");
      return paramView;
    }
    if (str.contains("30110"))
    {
      paramViewGroup.c.setVisibility(0);
      paramViewGroup.c.setText("大数据回测分析");
      return paramView;
    }
    if (str.contains("31200"))
    {
      paramViewGroup.c.setVisibility(0);
      paramViewGroup.c.setText("开放基金认购,申购,赎回");
      return paramView;
    }
    if (str.contains("31300"))
    {
      paramViewGroup.c.setVisibility(0);
      paramViewGroup.c.setText("场内基金认购,申购,赎回");
      return paramView;
    }
    if (str.contains("31400"))
    {
      paramViewGroup.c.setVisibility(0);
      paramViewGroup.c.setText("资产管理类理财产品");
      return paramView;
    }
    if (str.contains("31500"))
    {
      paramViewGroup.c.setVisibility(0);
      paramViewGroup.c.setText("期限灵活,流动性好的理财产品");
      return paramView;
    }
    if (str.contains("31600"))
    {
      paramViewGroup.c.setVisibility(0);
      paramViewGroup.c.setText("内地投资者交易港股");
      return paramView;
    }
    if (str.contains("31800"))
    {
      paramViewGroup.c.setVisibility(0);
      paramViewGroup.c.setText("ETF基金申购,赎回 ");
      return paramView;
    }
    if (str.contains("31700"))
    {
      paramViewGroup.c.setVisibility(8);
      return paramView;
    }
    paramViewGroup.c.setVisibility(8);
    return paramView;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\xc\trade\ca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */