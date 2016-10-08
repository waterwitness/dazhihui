package com.android.dazhihui.ui.model.stock.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class PopupListAdpater
  extends BaseAdapter
{
  private Context mContext;
  private List<PopupListAdpater.DataHolder> mData;
  private LayoutInflater mInflater;
  
  public PopupListAdpater(Context paramContext, int[] paramArrayOfInt, String[] paramArrayOfString)
  {
    this.mContext = paramContext;
    this.mInflater = LayoutInflater.from(paramContext);
    this.mData = new ArrayList();
    int i = 0;
    if (i < paramArrayOfString.length)
    {
      paramContext = new PopupListAdpater.DataHolder();
      paramContext.title = paramArrayOfString[i];
      if (paramArrayOfInt != null) {}
      for (int j = paramArrayOfInt[i];; j = i)
      {
        paramContext.id = j;
        this.mData.add(paramContext);
        i += 1;
        break;
      }
    }
  }
  
  public int getCount()
  {
    return this.mData.size();
  }
  
  public PopupListAdpater.DataHolder getItem(int paramInt)
  {
    return (PopupListAdpater.DataHolder)this.mData.get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return ((PopupListAdpater.DataHolder)this.mData.get(paramInt)).id;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      paramView = this.mInflater.inflate(2130903575, null);
      paramViewGroup = new PopupListAdpater.Holder();
      paramViewGroup.title = ((TextView)paramView.findViewById(2131558567));
      paramView.setTag(paramViewGroup);
    }
    for (;;)
    {
      PopupListAdpater.DataHolder localDataHolder = (PopupListAdpater.DataHolder)this.mData.get(paramInt);
      paramViewGroup.title.setText(localDataHolder.title);
      paramView.setId(localDataHolder.id);
      return paramView;
      paramViewGroup = (PopupListAdpater.Holder)paramView.getTag();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\adapter\PopupListAdpater.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */