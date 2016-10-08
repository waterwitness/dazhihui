package com.android.dazhihui.ui.screen.stock;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.dazhihui.ui.model.stock.SearchHuiVo.SearchSuggestResult;
import java.util.ArrayList;

public class qx
  extends BaseAdapter
{
  qy a;
  
  public qx(SearchHuiFragment paramSearchHuiFragment) {}
  
  public int getCount()
  {
    if (this.b.j != null) {
      return this.b.j.size();
    }
    return 0;
  }
  
  public Object getItem(int paramInt)
  {
    if (this.b.j != null) {
      return this.b.j.get(paramInt);
    }
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
      this.a = new qy(this);
      paramView = LayoutInflater.from(this.b.getContext()).inflate(2130903400, paramViewGroup, false);
      this.a.a = ((LinearLayout)paramView.findViewById(2131560286));
      this.a.b = ((TextView)paramView.findViewById(2131558624));
      paramView.setTag(this.a);
    }
    for (;;)
    {
      paramViewGroup = (SearchHuiVo.SearchSuggestResult)this.b.j.get(paramInt);
      this.a.b.setText(paramViewGroup.term);
      switch (qm.a[SearchHuiFragment.i(this.b).ordinal()])
      {
      default: 
        return paramView;
        this.a = ((qy)paramView.getTag());
      }
    }
    this.a.b.setTextColor(Color.parseColor("#222222"));
    this.a.a.setBackgroundResource(2130838818);
    return paramView;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\qx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */