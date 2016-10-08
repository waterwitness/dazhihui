package com.android.dazhihui.ui.screen.stock;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import java.util.List;

class uf
  extends BaseAdapter
{
  private Context b;
  
  public uf(ti paramti, Context paramContext)
  {
    this.b = paramContext;
  }
  
  public int getCount()
  {
    if (ti.e(this.a) == null) {
      return 0;
    }
    return (int)Math.ceil(ti.e(this.a).size() / ti.f(this.a));
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
      paramView = new GridView(this.b);
      paramView.setAdapter(new ud(this.a, this.b));
    }
    for (;;)
    {
      if (ti.f(this.a) * paramInt + ti.f(this.a) > ti.e(this.a).size()) {}
      for (int i = ti.e(this.a).size();; i = ti.f(this.a) * paramInt + ti.f(this.a))
      {
        paramViewGroup = ti.e(this.a).subList(ti.f(this.a) * paramInt, i);
        GridView localGridView = (GridView)paramView;
        localGridView.setNumColumns(ti.f(this.a) / 2);
        localGridView.setSelector(17170445);
        paramInt = this.a.getResources().getDimensionPixelSize(2131230788);
        i = this.a.getResources().getDimensionPixelSize(2131230774);
        localGridView.setVerticalSpacing(paramInt);
        localGridView.setPadding(i, i, i, paramInt);
        ((ud)localGridView.getAdapter()).a(paramViewGroup);
        return paramView;
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\uf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */