package com.android.dazhihui.ui.widget;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.adv.AdvertView;
import java.util.List;

class er
  extends BaseAdapter
{
  private er(IndexBottomWidget paramIndexBottomWidget) {}
  
  public int getCount()
  {
    return 1;
  }
  
  public Object getItem(int paramInt)
  {
    if (IndexBottomWidget.k(this.a).size() == 0) {
      return null;
    }
    paramInt = IndexBottomWidget.p(this.a);
    return IndexBottomWidget.k(this.a).get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    paramInt = IndexBottomWidget.p(this.a);
    paramViewGroup = paramView;
    if (paramView == null) {
      paramViewGroup = LayoutInflater.from(IndexBottomWidget.q(this.a)).inflate(2130903059, null);
    }
    if (IndexBottomWidget.k(this.a).size() == 0) {
      return paramViewGroup;
    }
    if (paramInt == IndexBottomWidget.k(this.a).size()) {
      paramInt = 0;
    }
    for (;;)
    {
      paramView = (TextView)paramViewGroup.findViewById(2131558624);
      TextView localTextView1 = (TextView)paramViewGroup.findViewById(2131558625);
      TextView localTextView2 = (TextView)paramViewGroup.findViewById(2131558626);
      TextView localTextView3 = (TextView)paramViewGroup.findViewById(2131558627);
      ImageView localImageView = (ImageView)paramViewGroup.findViewById(2131558628);
      es locales = (es)IndexBottomWidget.k(this.a).get(paramInt);
      if ((IndexBottomWidget.r(this.a) != null) && (IndexBottomWidget.r(this.a).getVisibility() == 0))
      {
        localImageView.setVisibility(8);
        if (paramInt == 0)
        {
          paramView.setText("沪");
          if (IndexBottomWidget.s(this.a) != y.b) {
            break label330;
          }
          localImageView.setImageResource(2130838787);
          paramView.setTextColor(this.a.getResources().getColor(2131493626));
        }
      }
      for (;;)
      {
        paramInt = IndexBottomWidget.a(this.a, locales, eq.a);
        localTextView1.setTextColor(paramInt);
        localTextView1.setText(IndexBottomWidget.a(this.a, locales));
        localTextView2.setTextColor(paramInt);
        localTextView2.setText(IndexBottomWidget.b(this.a, locales));
        localTextView3.setTextColor(paramInt);
        localTextView3.setText(IndexBottomWidget.c(this.a, locales));
        return paramViewGroup;
        if (paramInt == 1)
        {
          paramView.setText("深");
          break;
        }
        paramView.setText("创");
        break;
        localImageView.setVisibility(0);
        paramView.setText(locales.b);
        break;
        label330:
        localImageView.setImageResource(2130838702);
        paramView.setTextColor(this.a.getResources().getColor(2131493563));
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\er.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */