package com.android.dazhihui.ui.delegate.screen;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.android.dazhihui.g;

class dq
  extends BaseAdapter
{
  private LayoutInflater b;
  private String[] c;
  private String[] d;
  
  public dq(RemoveAccount paramRemoveAccount, String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    this.b = LayoutInflater.from(paramRemoveAccount);
    this.c = paramArrayOfString1;
    this.d = paramArrayOfString2;
  }
  
  public int getCount()
  {
    return this.c.length;
  }
  
  public Object getItem(int paramInt)
  {
    return this.c[paramInt];
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    View localView;
    if (paramView == null)
    {
      localView = this.b.inflate(2130903243, null);
      paramView = new dr(this, null);
      paramView.a = ((TextView)localView.findViewById(2131559682));
      paramView.b = ((TextView)localView.findViewById(2131559683));
      localView.setTag(paramView);
      paramViewGroup = paramView;
    }
    for (;;)
    {
      paramViewGroup.a.setTextSize(1, this.a.getResources().getDimension(2131230877) / g.a().o());
      paramViewGroup.b.setTextSize(1, this.a.getResources().getDimension(2131230877) / g.a().o());
      paramViewGroup.a.setText(this.c[paramInt]);
      paramViewGroup.b.setText(this.d[paramInt]);
      return localView;
      paramViewGroup = (dr)paramView.getTag();
      localView = paramView;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\dq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */