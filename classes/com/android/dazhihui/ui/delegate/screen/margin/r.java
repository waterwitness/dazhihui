package com.android.dazhihui.ui.delegate.screen.margin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class r
  extends BaseAdapter
{
  private LayoutInflater b;
  private Context c;
  private String[][] d;
  
  public r(MarginCaptialDebtQuiry paramMarginCaptialDebtQuiry, Context paramContext, String[][] paramArrayOfString)
  {
    this.c = paramContext;
    this.b = LayoutInflater.from(this.c);
    this.d = paramArrayOfString;
  }
  
  public int getCount()
  {
    if (this.d != null) {
      return this.d.length;
    }
    return 0;
  }
  
  public Object getItem(int paramInt)
  {
    if (this.d != null) {
      return this.d[paramInt];
    }
    return Integer.valueOf(0);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      paramView = this.b.inflate(2130903259, null);
      paramViewGroup = new s(this, null);
      paramViewGroup.a = ((TextView)paramView.findViewById(2131559761));
      paramViewGroup.b = ((TextView)paramView.findViewById(2131559762));
      paramView.setTag(paramViewGroup);
    }
    for (;;)
    {
      if (this.d[paramInt] != null)
      {
        String str1 = this.d[paramInt][0];
        String str2 = this.d[paramInt][1];
        if (str1 != null) {
          paramViewGroup.a.setText(str1);
        }
        if (str2 != null) {
          paramViewGroup.b.setText(str2);
        }
      }
      return paramView;
      paramViewGroup = (s)paramView.getTag();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\margin\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */