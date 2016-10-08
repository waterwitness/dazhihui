package com.tencent.avsdk.activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class IlvbAccountRechargeScreen$PayMethodGridViewAdapter
  extends BaseAdapter
{
  private int[] ids;
  private Context mContext;
  private LayoutInflater mInflater;
  private String[] names;
  
  public IlvbAccountRechargeScreen$PayMethodGridViewAdapter(IlvbAccountRechargeScreen paramIlvbAccountRechargeScreen, Context paramContext, int[] paramArrayOfInt, String[] paramArrayOfString)
  {
    this.ids = paramArrayOfInt;
    this.names = paramArrayOfString;
    this.mContext = paramContext;
    this.mInflater = LayoutInflater.from(this.mContext);
  }
  
  public int getCount()
  {
    if (this.names == null) {
      return 0;
    }
    return this.names.length;
  }
  
  public Object getItem(int paramInt)
  {
    return null;
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
      localView = this.mInflater.inflate(2130903201, null);
      paramView = new IlvbAccountRechargeScreen.PayMethodGridViewAdapter.Holder(this);
      paramView.icon = ((ImageView)localView.findViewById(2131559452));
      paramView.text = ((TextView)localView.findViewById(2131559453));
      localView.setTag(paramView);
      paramViewGroup = paramView;
      if (paramInt != IlvbAccountRechargeScreen.access$000(this.this$0)) {
        break label122;
      }
      localView.setBackgroundResource(2130838136);
    }
    for (;;)
    {
      paramViewGroup.icon.setImageResource(this.ids[paramInt]);
      paramViewGroup.text.setText(this.names[paramInt]);
      return localView;
      paramViewGroup = (IlvbAccountRechargeScreen.PayMethodGridViewAdapter.Holder)paramView.getTag();
      localView = paramView;
      break;
      label122:
      localView.setBackgroundResource(2130838137);
    }
  }
  
  public void setData(int[] paramArrayOfInt, String[] paramArrayOfString)
  {
    this.ids = paramArrayOfInt;
    this.names = paramArrayOfString;
    notifyDataSetChanged();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\activity\IlvbAccountRechargeScreen$PayMethodGridViewAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */