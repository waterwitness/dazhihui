package com.android.dazhihui.ui.delegate.screen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Map;

class gr
  extends BaseAdapter
{
  private LayoutInflater b;
  private ArrayList<Map<String, Object>> c;
  
  public gr(Context paramContext, ArrayList<Map<String, Object>> paramArrayList)
  {
    this.b = LayoutInflater.from(paramArrayList);
    ArrayList localArrayList;
    this.c = localArrayList;
  }
  
  public int a(int paramInt)
  {
    int i = 0;
    while (i < this.c.size())
    {
      if (paramInt == ((Integer)((Map)this.c.get(i)).get("id")).intValue()) {
        return i;
      }
      i += 1;
    }
    return 0;
  }
  
  public int getCount()
  {
    return this.c.size();
  }
  
  public Object getItem(int paramInt)
  {
    return this.c.get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    int i = 2131558470;
    int k = ((Integer)((Map)this.c.get(paramInt)).get("id")).intValue();
    gs localgs;
    if (paramView == null) {
      if (k >= 0)
      {
        paramView = this.b.inflate(2130903557, null);
        paramView.findViewById(2131559118).setVisibility(8);
        localgs = new gs(this, null);
        gs.a(localgs, (TextView)paramView.findViewById(2131561234));
        paramView.setTag(i, localgs);
        paramViewGroup = paramView;
        paramView = localgs;
      }
    }
    for (;;)
    {
      gs.a(paramView).setText(((Map)this.c.get(paramInt)).get("title").toString());
      return paramViewGroup;
      paramView = this.b.inflate(2130903558, null);
      i = 2131558471;
      break;
      int j;
      if (k >= 0)
      {
        j = 2131558470;
        label157:
        localgs = (gs)paramView.getTag(j);
        if (localgs != null) {
          break label259;
        }
        if (k < 0) {
          break label241;
        }
        paramViewGroup = this.b.inflate(2130903557, null);
        paramViewGroup.findViewById(2131559118).setVisibility(8);
      }
      for (;;)
      {
        paramView = new gs(this, null);
        gs.a(paramView, (TextView)paramViewGroup.findViewById(2131561234));
        paramViewGroup.setTag(i, paramView);
        break;
        j = 2131558471;
        break label157;
        label241:
        paramViewGroup = this.b.inflate(2130903558, null);
        i = 2131558471;
      }
      label259:
      paramViewGroup = paramView;
      paramView = localgs;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\gr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */