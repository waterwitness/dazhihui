package com.android.dazhihui.ui.model.stock.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.dazhihui.d.a;

public class GridViewAdapter
  extends BaseAdapter
{
  private View childView;
  private int color = -1;
  private Integer[] ids;
  private Context mContext;
  private LayoutInflater mInflater;
  private String[] names;
  private int type;
  
  public GridViewAdapter(Context paramContext, int paramInt, Integer[] paramArrayOfInteger, String[] paramArrayOfString)
  {
    this.type = paramInt;
    this.ids = paramArrayOfInteger;
    this.names = paramArrayOfString;
    this.mContext = paramContext;
    this.mInflater = LayoutInflater.from(this.mContext);
  }
  
  public View getChild()
  {
    return this.childView;
  }
  
  public int getCount()
  {
    return this.ids.length;
  }
  
  public Object getItem(int paramInt)
  {
    return Integer.valueOf(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    Bitmap localBitmap = a.a(this.mContext.getResources(), this.ids[paramInt].intValue(), 1.0F, 1.0F);
    if (paramView == null) {
      if (this.type == 3)
      {
        paramView = this.mInflater.inflate(2130903155, null);
        paramViewGroup = new GridViewAdapter.Holder(this);
        paramViewGroup.icon = ((ImageView)paramView.findViewById(2131559196));
        paramViewGroup.text = ((TextView)paramView.findViewById(2131559197));
        paramViewGroup.text2 = ((TextView)paramView.findViewById(2131559199));
        paramViewGroup.text2.setTextColor(this.color);
        paramViewGroup.text.setTextColor(2131492937);
        paramViewGroup.layout = ((LinearLayout)paramView.findViewById(2131559198));
        paramView.setTag(paramViewGroup);
      }
    }
    for (;;)
    {
      this.childView = paramView;
      paramViewGroup.icon.setImageBitmap(localBitmap);
      paramViewGroup.text.setText(this.names[paramInt]);
      paramViewGroup.layout.setVisibility(8);
      return paramView;
      paramView = this.mInflater.inflate(2130903154, null);
      break;
      paramViewGroup = (GridViewAdapter.Holder)paramView.getTag();
    }
  }
  
  public void setColor(int paramInt)
  {
    this.color = paramInt;
  }
  
  public void setIds(Integer[] paramArrayOfInteger)
  {
    this.ids = paramArrayOfInteger;
  }
  
  public void setNames(String[] paramArrayOfString)
  {
    this.names = paramArrayOfString;
    notifyDataSetChanged();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\adapter\GridViewAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */