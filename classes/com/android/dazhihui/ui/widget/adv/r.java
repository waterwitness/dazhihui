package com.android.dazhihui.ui.widget.adv;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvItem;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvertData;
import com.android.dazhihui.ui.screen.y;
import java.util.ArrayList;

class r
  extends BaseAdapter
{
  private Context b;
  
  public r(AdvertView paramAdvertView, Context paramContext)
  {
    this.b = paramContext;
  }
  
  public int getCount()
  {
    if (AdvertView.a(this.a) == null) {}
    while (((!AdvertView.a(this.a).viewtype.equals("1")) && (!AdvertView.a(this.a).viewtype.equals("2"))) || (AdvertView.a(this.a).advList == null)) {
      return 0;
    }
    return AdvertView.a(this.a).advList.size();
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
    if (paramView == null)
    {
      paramViewGroup = new s();
      if (this.a.a == 149)
      {
        AdvertView.a(this.a, LayoutInflater.from(this.a.getContext()).inflate(2130903163, null));
        paramViewGroup.a((TextView)AdvertView.c(this.a).findViewById(2131559244));
        paramView = AdvertView.c(this.a);
        paramView.setTag(paramViewGroup);
      }
    }
    for (;;)
    {
      int i;
      if ((AdvertView.a(this.a).advList != null) && (AdvertView.a(this.a).advList.size() > 0))
      {
        AdvertVo.AdvItem localAdvItem = (AdvertVo.AdvItem)AdvertView.a(this.a).advList.get(paramInt);
        paramViewGroup.b().setText(localAdvItem.text);
        if (AdvertView.a(this.a).pcode.equals("149"))
        {
          i = Color.parseColor("#f85880");
          paramViewGroup.b().setTextColor(i);
        }
        if ((TextUtils.isEmpty(localAdvItem.colour)) || (AdvertView.a(this.a).pcode.equals("149"))) {
          break label462;
        }
      }
      try
      {
        paramInt = Color.parseColor("#" + ((AdvertVo.AdvItem)AdvertView.a(this.a).advList.get(paramInt)).colour);
        paramViewGroup.b().setTextColor(paramInt);
        return paramView;
      }
      catch (Exception localException)
      {
        if (AdvertView.e(this.a) != y.b) {
          break label436;
        }
        paramViewGroup.b().setTextColor(this.a.getResources().getColor(AdvertView.f(this.a)));
        return paramView;
        paramViewGroup.b().setTextColor(this.a.getResources().getColor(AdvertView.g(this.a)));
        return paramView;
      }
      paramView = new TextView(this.b);
      paramView.setTextSize(2, AdvertView.d(this.a));
      paramView.setGravity(17);
      if ((this.a.a == 116) || (this.a.a == 124) || (this.a.a == 125) || (this.a.a == 126))
      {
        paramView.setGravity(16);
        i = this.a.getResources().getDimensionPixelSize(2131230774);
        paramView.setPadding(i, i, i, i);
        paramView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 2130838514, 0);
      }
      paramViewGroup.a(paramView);
      break;
      paramViewGroup = (s)paramView.getTag();
    }
    label436:
    label462:
    if (AdvertView.a(this.a).pcode.equals("149"))
    {
      if (AdvertView.e(this.a) == y.b)
      {
        AdvertView.c(this.a).setBackgroundColor(this.a.getResources().getColor(2131493434));
        return paramView;
      }
      AdvertView.c(this.a).setBackgroundColor(this.a.getResources().getColor(2131493433));
      return paramView;
    }
    if (AdvertView.e(this.a) == y.b)
    {
      paramViewGroup.b().setTextColor(this.a.getResources().getColor(AdvertView.f(this.a)));
      return paramView;
    }
    paramViewGroup.b().setTextColor(this.a.getResources().getColor(AdvertView.g(this.a)));
    return paramView;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\adv\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */