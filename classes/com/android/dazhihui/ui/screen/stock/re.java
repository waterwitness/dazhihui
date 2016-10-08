package com.android.dazhihui.ui.screen.stock;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.android.dazhihui.ui.model.stock.HotVideoPushStockVo;
import com.android.dazhihui.ui.widget.CircleImageView;
import com.android.dazhihui.ui.widget.a.r;
import java.util.ArrayList;

public class re
  extends BaseAdapter
{
  rf a;
  
  public re(SearchPeopleFragment paramSearchPeopleFragment) {}
  
  public int getCount()
  {
    if (this.b.m != null) {
      return this.b.m.size();
    }
    return 0;
  }
  
  public Object getItem(int paramInt)
  {
    if (this.b.m != null) {
      return this.b.m.get(paramInt);
    }
    return null;
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    label90:
    String str;
    if (paramView == null)
    {
      this.a = new rf(this);
      paramView = LayoutInflater.from(this.b.getContext()).inflate(2130903397, paramViewGroup, false);
      this.a.c = ((TextView)paramView.findViewById(2131558579));
      this.a.b = ((TextView)paramView.findViewById(2131558624));
      this.a.a = ((CircleImageView)paramView.findViewById(2131560103));
      paramView.setTag(this.a);
      this.a.b.setText(((HotVideoPushStockVo)this.b.m.get(paramInt)).getOwnerName());
      this.a.c.setText(((HotVideoPushStockVo)this.b.m.get(paramInt)).getRoomTopic());
      r.a(this.b.getContext()).a(((HotVideoPushStockVo)this.b.m.get(paramInt)).getOwnerAccountImg(), this.a.a, 2130838081);
      this.a.a.setIsHasCirlCle(true);
      str = ((HotVideoPushStockVo)this.b.m.get(paramInt)).getColor();
      if (TextUtils.isEmpty(str)) {
        break label361;
      }
      paramViewGroup = str;
    }
    for (;;)
    {
      try
      {
        if (str.contains("#")) {
          paramViewGroup = str.replace("#", "");
        }
        paramInt = Color.parseColor("#" + paramViewGroup);
        this.a.a.setCirlCleColor(paramInt);
      }
      catch (NumberFormatException paramViewGroup)
      {
        this.a.a.setCirlCleColor(this.b.getContext().getResources().getColor(2131493412));
        continue;
      }
      switch (rd.a[SearchPeopleFragment.c(this.b).ordinal()])
      {
      default: 
        return paramView;
        this.a = ((rf)paramView.getTag());
        break label90;
        label361:
        this.a.a.setCirlCleColor(this.b.getContext().getResources().getColor(2131493412));
      }
    }
    this.a.b.setTextColor(Color.parseColor("#ffffff"));
    this.a.c.setTextColor(Color.parseColor("#a1a6b2"));
    return paramView;
    this.a.b.setTextColor(Color.parseColor("#3e6ac5"));
    this.a.c.setTextColor(Color.parseColor("#222222"));
    return paramView;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\re.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */