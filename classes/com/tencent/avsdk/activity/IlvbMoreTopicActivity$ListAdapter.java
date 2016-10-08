package com.tencent.avsdk.activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.android.dazhihui.d.n;
import com.tencent.avsdk.Model.LabelMsgVo.LabelTypeItem;
import java.util.List;

public class IlvbMoreTopicActivity$ListAdapter
  extends BaseAdapter
{
  private LayoutInflater inflater;
  List<LabelMsgVo.LabelTypeItem> labelTypeItems;
  
  public IlvbMoreTopicActivity$ListAdapter(IlvbMoreTopicActivity paramIlvbMoreTopicActivity, Context paramContext)
  {
    this.inflater = LayoutInflater.from(paramContext);
  }
  
  public int getCount()
  {
    if (this.labelTypeItems == null) {
      return 0;
    }
    return this.labelTypeItems.size();
  }
  
  public Object getItem(int paramInt)
  {
    if (this.labelTypeItems == null) {
      return null;
    }
    return this.labelTypeItems.get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      paramView = this.inflater.inflate(2130903200, null);
      paramViewGroup = new IlvbMoreTopicActivity.ListAdapter.ViewHolder(this);
      paramViewGroup.tab_name = ((TextView)paramView.findViewById(2131559449));
      paramViewGroup.tab_num = ((TextView)paramView.findViewById(2131559451));
      paramView.setTag(paramViewGroup);
    }
    for (;;)
    {
      paramViewGroup.tab_name.setText(((LabelMsgVo.LabelTypeItem)this.labelTypeItems.get(paramInt)).getlabelName());
      paramViewGroup.tab_num.setText(n.f(((LabelMsgVo.LabelTypeItem)this.labelTypeItems.get(paramInt)).getRoomNum()));
      return paramView;
      paramViewGroup = (IlvbMoreTopicActivity.ListAdapter.ViewHolder)paramView.getTag();
    }
  }
  
  public void refreshList(List<LabelMsgVo.LabelTypeItem> paramList)
  {
    if (paramList != null)
    {
      this.labelTypeItems = paramList;
      notifyDataSetChanged();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\activity\IlvbMoreTopicActivity$ListAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */