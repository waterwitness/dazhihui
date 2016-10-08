package com.android.dazhihui.ui.delegate.screen;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;

class bp
  extends BaseAdapter
{
  private ArrayList<String> b;
  
  public bp(ArrayList<String> paramArrayList)
  {
    ArrayList localArrayList;
    this.b = localArrayList;
  }
  
  public int getCount()
  {
    if (this.b == null) {
      return 0;
    }
    return this.b.size();
  }
  
  public Object getItem(int paramInt)
  {
    if (this.b == null) {
      return null;
    }
    return this.b.get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      paramView = LayoutInflater.from(this.a).inflate(2130903477, null);
      paramViewGroup = new bu(this, null);
      paramViewGroup.a = ((TextView)paramView.findViewById(2131560714));
      paramViewGroup.b = ((TextView)paramView.findViewById(2131560715));
      paramView.setTag(paramViewGroup);
    }
    for (;;)
    {
      paramViewGroup.a.setText((CharSequence)this.b.get(paramInt));
      paramViewGroup.b.setOnClickListener(new bq(this, paramInt));
      return paramView;
      paramViewGroup = (bu)paramView.getTag();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\bp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */