package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import java.util.List;

public class do
  extends BaseAdapter
{
  private List<ht> a;
  private LayoutInflater b;
  private int c = 0;
  
  public do(Context paramContext, List<ht> paramList)
  {
    this.b = LayoutInflater.from(paramContext);
    this.a = paramList;
    this.c = paramList.size();
  }
  
  public int getCount()
  {
    return this.c;
  }
  
  public Object getItem(int paramInt)
  {
    return this.a.get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    ht localht = (ht)this.a.get(paramInt);
    View localView;
    if (paramView == null)
    {
      paramView = new dp(this);
      localView = this.b.inflate(2130903112, null);
      paramView.a = ((ImageView)localView.findViewById(2131558899));
      localView.setTag(paramView);
      paramViewGroup = paramView;
    }
    while (localht.a() == 2130837920)
    {
      localView.setBackgroundDrawable(null);
      paramViewGroup.a.setImageResource(localht.a());
      return localView;
      paramViewGroup = (dp)paramView.getTag();
      localView = paramView;
    }
    if (TextUtils.isEmpty(localht.b()))
    {
      localView.setBackgroundDrawable(null);
      paramViewGroup.a.setImageDrawable(null);
      return localView;
    }
    paramViewGroup.a.setTag(localht);
    paramViewGroup.a.setImageResource(localht.a());
    return localView;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\do.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */