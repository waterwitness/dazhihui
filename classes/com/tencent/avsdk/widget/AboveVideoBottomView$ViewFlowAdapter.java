package com.tencent.avsdk.widget;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.android.dazhihui.ui.widget.a.r;
import com.tencent.avsdk.Model.CustomRspMsgVo.ShowLink;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class AboveVideoBottomView$ViewFlowAdapter
  extends BaseAdapter
{
  private Context context;
  
  public AboveVideoBottomView$ViewFlowAdapter(AboveVideoBottomView paramAboveVideoBottomView, Context paramContext)
  {
    this.context = paramContext;
  }
  
  public int getCount()
  {
    if (AboveVideoBottomView.access$1300(this.this$0) != null) {
      return AboveVideoBottomView.access$1300(this.this$0).size();
    }
    return 0;
  }
  
  public Object getItem(int paramInt)
  {
    if (AboveVideoBottomView.access$1300(this.this$0) != null) {
      return AboveVideoBottomView.access$1300(this.this$0).get(paramInt);
    }
    return null;
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if ((AboveVideoBottomView.access$1300(this.this$0) == null) || (AboveVideoBottomView.access$1300(this.this$0).get(paramInt) == null)) {
      return null;
    }
    if (paramView == null)
    {
      paramViewGroup = new AboveVideoBottomView.ViewHolder();
      AboveVideoBottomView.ViewHolder.access$1402(paramViewGroup, new ImageView(this.context));
      paramView = AboveVideoBottomView.ViewHolder.access$1400(paramViewGroup);
      paramView.setTag(paramViewGroup);
    }
    while (!TextUtils.isEmpty(((CustomRspMsgVo.ShowLink)AboveVideoBottomView.access$1300(this.this$0).get(paramInt)).ShowImageUrl))
    {
      Object localObject = new SimpleDateFormat("yyyyMMdd");
      localObject = ((CustomRspMsgVo.ShowLink)AboveVideoBottomView.access$1300(this.this$0).get(paramInt)).ShowImageUrl + "?time=" + ((SimpleDateFormat)localObject).format(new Date());
      r.a(this.this$0.getContext()).a((String)localObject, AboveVideoBottomView.ViewHolder.access$1400(paramViewGroup), 2130838192);
      return paramView;
      paramViewGroup = (AboveVideoBottomView.ViewHolder)paramView.getTag();
    }
    AboveVideoBottomView.ViewHolder.access$1400(paramViewGroup).setImageResource(2130838192);
    return paramView;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\AboveVideoBottomView$ViewFlowAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */