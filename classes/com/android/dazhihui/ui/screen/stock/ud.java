package com.android.dazhihui.ui.screen.stock;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.android.dazhihui.ui.model.stock.LeftMenuVo.LeftMenuItem;
import java.util.List;

class ud
  extends BaseAdapter
{
  private Context b;
  private List<LeftMenuVo.LeftMenuItem> c;
  
  public ud(ti paramti, Context paramContext)
  {
    this.b = paramContext;
  }
  
  public void a(List<LeftMenuVo.LeftMenuItem> paramList)
  {
    this.c = paramList;
    notifyDataSetChanged();
  }
  
  public int getCount()
  {
    if (this.c == null) {
      return 0;
    }
    return this.c.size();
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
    paramViewGroup = (LeftMenuVo.LeftMenuItem)this.c.get(paramInt);
    return ti.a(this.a, paramViewGroup, paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\ud.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */