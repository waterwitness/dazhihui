package com.tencent.avsdk.activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.android.dazhihui.ui.model.stock.LivebarConfigVo.topConfig;
import java.util.List;

class HotVideoListFragment$GalleryAdapter
  extends BaseAdapter
{
  private List<LivebarConfigVo.topConfig> mColumnConfig;
  private Context mContext;
  LayoutInflater mInflater;
  private int mSelect = 0;
  
  public HotVideoListFragment$GalleryAdapter(HotVideoListFragment paramHotVideoListFragment, Context paramContext)
  {
    this.mContext = paramContext;
    this.mInflater = LayoutInflater.from(this.mContext);
  }
  
  public int getCount()
  {
    if (this.mColumnConfig == null) {
      return 0;
    }
    return this.mColumnConfig.size();
  }
  
  public Object getItem(int paramInt)
  {
    if (this.mColumnConfig == null) {
      return null;
    }
    return this.mColumnConfig.get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      paramViewGroup = new HotVideoListFragment.GalleryAdapter.ViewHolder(this);
      paramView = this.mInflater.inflate(2130903193, null);
      paramViewGroup.itemTextView = ((TextView)paramView.findViewById(2131559422));
      paramViewGroup.buttom_line = paramView.findViewById(2131559423);
      paramView.setTag(paramViewGroup);
    }
    for (;;)
    {
      LivebarConfigVo.topConfig localtopConfig = (LivebarConfigVo.topConfig)this.mColumnConfig.get(paramInt);
      paramViewGroup.itemTextView.setText(localtopConfig.getsName());
      if (this.mSelect != paramInt) {
        break;
      }
      paramViewGroup.itemTextView.setTextColor(-12686651);
      paramViewGroup.buttom_line.setVisibility(0);
      return paramView;
      paramViewGroup = (HotVideoListFragment.GalleryAdapter.ViewHolder)paramView.getTag();
    }
    paramViewGroup.itemTextView.setTextColor(-14013910);
    paramViewGroup.buttom_line.setVisibility(8);
    return paramView;
  }
  
  public int getmSelect()
  {
    return this.mSelect;
  }
  
  public void setmColumnConfig(List<LivebarConfigVo.topConfig> paramList)
  {
    this.mColumnConfig = paramList;
  }
  
  public void setmSelect(int paramInt)
  {
    this.mSelect = paramInt;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\activity\HotVideoListFragment$GalleryAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */