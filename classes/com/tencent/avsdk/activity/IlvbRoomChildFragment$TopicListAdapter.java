package com.tencent.avsdk.activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.dazhihui.d.n;
import com.tencent.avsdk.Model.LabelMsgVo.LabelTypeItem;
import java.util.List;

public class IlvbRoomChildFragment$TopicListAdapter
  extends BaseAdapter
{
  private LayoutInflater inflater;
  private String moreString = "热门话题";
  
  public IlvbRoomChildFragment$TopicListAdapter(IlvbRoomChildFragment paramIlvbRoomChildFragment, Context paramContext)
  {
    this.inflater = LayoutInflater.from(paramContext);
  }
  
  public int getCount()
  {
    int i = 6;
    if (this.this$0.mLabelList == null) {
      i = 0;
    }
    while (this.this$0.mLabelList.size() > 6) {
      return i;
    }
    return this.this$0.mLabelList.size();
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
    if (paramView == null)
    {
      paramView = this.inflater.inflate(2130903210, null);
      paramViewGroup = new IlvbRoomChildFragment.TopicListAdapter.ViewHolder(this);
      paramViewGroup.tab_name = ((TextView)paramView.findViewById(2131559449));
      paramViewGroup.tab_num = ((TextView)paramView.findViewById(2131559451));
      paramViewGroup.tab_more_image = ((ImageView)paramView.findViewById(2131559482));
      paramView.setTag(paramViewGroup);
    }
    while ((paramInt == 5) && (this.this$0.mLabelList.size() > 6))
    {
      paramViewGroup.tab_name.setText(this.moreString);
      paramViewGroup.tab_num.setVisibility(8);
      paramViewGroup.tab_more_image.setVisibility(0);
      return paramView;
      paramViewGroup = (IlvbRoomChildFragment.TopicListAdapter.ViewHolder)paramView.getTag();
    }
    paramViewGroup.tab_name.setText(((LabelMsgVo.LabelTypeItem)this.this$0.mLabelList.get(paramInt)).getlabelName());
    paramViewGroup.tab_num.setText(n.f(((LabelMsgVo.LabelTypeItem)this.this$0.mLabelList.get(paramInt)).getRoomNum()));
    paramViewGroup.tab_more_image.setVisibility(8);
    return paramView;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\activity\IlvbRoomChildFragment$TopicListAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */