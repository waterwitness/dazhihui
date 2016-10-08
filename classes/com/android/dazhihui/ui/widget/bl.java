package com.android.dazhihui.ui.widget;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class bl
  extends BaseAdapter
{
  public bl(DropDownEditTextView paramDropDownEditTextView) {}
  
  public int getCount()
  {
    if ((DropDownEditTextView.e(this.a) == null) || (DropDownEditTextView.e(this.a).size() < 1)) {
      return 0;
    }
    return DropDownEditTextView.e(this.a).size();
  }
  
  public Object getItem(int paramInt)
  {
    if ((DropDownEditTextView.e(this.a) == null) || (DropDownEditTextView.e(this.a).size() < 1)) {
      return null;
    }
    return DropDownEditTextView.e(this.a).get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      paramView = LayoutInflater.from(DropDownEditTextView.a(this.a)).inflate(2130903099, null);
      paramViewGroup = new bn(this);
      paramViewGroup.a = ((TextView)paramView.findViewById(2131558565));
      paramViewGroup.b = ((ImageView)paramView.findViewById(2131558564));
      paramView.setTag(paramViewGroup);
      paramViewGroup.a.setText((CharSequence)DropDownEditTextView.e(this.a).get(paramInt));
      if (!this.a.b) {
        break label129;
      }
      paramViewGroup.b.setVisibility(0);
    }
    for (;;)
    {
      paramViewGroup.b.setOnClickListener(new bm(this, paramInt));
      return paramView;
      paramViewGroup = (bn)paramView.getTag();
      break;
      label129:
      paramViewGroup.b.setVisibility(8);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\bl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */