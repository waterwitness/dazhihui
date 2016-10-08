package com.android.dazhihui.ui.model.stock.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class PopupGridAdpater
  extends BaseAdapter
{
  private Context mContext;
  private List<PopupGridAdpater.DataHolder> mData;
  private LayoutInflater mInflater;
  private String mMsgCount;
  private int mMsgId = -1;
  
  public PopupGridAdpater(Context paramContext, int[] paramArrayOfInt1, int[] paramArrayOfInt2, String[] paramArrayOfString)
  {
    this.mContext = paramContext;
    this.mInflater = LayoutInflater.from(paramContext);
    this.mData = new ArrayList();
    int i = 0;
    if (i < paramArrayOfString.length)
    {
      paramContext = new PopupGridAdpater.DataHolder();
      paramContext.title = paramArrayOfString[i];
      paramContext.drawable = paramArrayOfInt2[i];
      if (paramArrayOfInt1 != null) {}
      for (int j = paramArrayOfInt1[i];; j = i)
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
  
  public PopupGridAdpater.DataHolder getItem(int paramInt)
  {
    return (PopupGridAdpater.DataHolder)this.mData.get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return ((PopupGridAdpater.DataHolder)this.mData.get(paramInt)).id;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    PopupGridAdpater.DataHolder localDataHolder;
    if (paramView == null)
    {
      paramView = this.mInflater.inflate(2130903572, null);
      paramViewGroup = new PopupGridAdpater.Holder();
      paramViewGroup.icon = ((ImageView)paramView.findViewById(2131561260));
      paramViewGroup.title = ((TextView)paramView.findViewById(2131558567));
      paramViewGroup.count = ((TextView)paramView.findViewById(2131561261));
      paramView.setTag(paramViewGroup);
      localDataHolder = (PopupGridAdpater.DataHolder)this.mData.get(paramInt);
      paramViewGroup.icon.setImageResource(localDataHolder.drawable);
      paramViewGroup.title.setText(localDataHolder.title);
      if (localDataHolder.id != this.mMsgId) {
        break label159;
      }
      paramViewGroup.count.setVisibility(0);
      paramViewGroup.count.setText(this.mMsgCount);
    }
    for (;;)
    {
      paramView.setId(localDataHolder.id);
      return paramView;
      paramViewGroup = (PopupGridAdpater.Holder)paramView.getTag();
      break;
      label159:
      paramViewGroup.count.setVisibility(4);
    }
  }
  
  public void setCount(int paramInt1, int paramInt2)
  {
    if (paramInt2 <= 0) {
      paramInt1 = -1;
    }
    this.mMsgId = paramInt1;
    if (paramInt2 > 99) {}
    for (String str = "n";; str = paramInt2 + "")
    {
      this.mMsgCount = str;
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\adapter\PopupGridAdpater.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */