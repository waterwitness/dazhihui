package com.android.dazhihui.ui.screen.stock;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;

class ni
  extends BaseAdapter
{
  ni(NewsXgfxDetailScreen paramNewsXgfxDetailScreen) {}
  
  public int getCount()
  {
    if (NewsXgfxDetailScreen.a(this.a) == null) {
      return 0;
    }
    return NewsXgfxDetailScreen.a(this.a).size();
  }
  
  public Object getItem(int paramInt)
  {
    return null;
  }
  
  public long getItemId(int paramInt)
  {
    return 0L;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    Object localObject;
    if (paramView == null)
    {
      localObject = new nj(this);
      paramView = this.a.getLayoutInflater().inflate(2130903594, paramViewGroup, false);
      nj.a((nj)localObject, (TextView)paramView.findViewById(2131561354));
      nj.b((nj)localObject, (TextView)paramView.findViewById(2131559553));
      paramView.setTag(localObject);
    }
    for (paramViewGroup = (ViewGroup)localObject;; paramViewGroup = (nj)paramView.getTag())
    {
      localObject = (String[])NewsXgfxDetailScreen.a(this.a).get(paramInt);
      if ((localObject != null) && (localObject.length >= 2)) {
        break;
      }
      return null;
    }
    nj.a(paramViewGroup).setText(nm.a(localObject[0]));
    nj.b(paramViewGroup).setText(localObject[1]);
    return paramView;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\ni.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */