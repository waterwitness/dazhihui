package com.tencent.avsdkhost.widget;

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

public class AboveVideoBottomViewHost$ViewFlowAdapter
  extends BaseAdapter
{
  private Context context;
  
  public AboveVideoBottomViewHost$ViewFlowAdapter(AboveVideoBottomViewHost paramAboveVideoBottomViewHost, Context paramContext)
  {
    this.context = paramContext;
  }
  
  public int getCount()
  {
    if (AboveVideoBottomViewHost.access$1500(this.this$0) != null) {
      return AboveVideoBottomViewHost.access$1500(this.this$0).size();
    }
    return 0;
  }
  
  public Object getItem(int paramInt)
  {
    if (AboveVideoBottomViewHost.access$1500(this.this$0) != null) {
      return AboveVideoBottomViewHost.access$1500(this.this$0).get(paramInt);
    }
    return null;
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if ((AboveVideoBottomViewHost.access$1500(this.this$0) == null) || (AboveVideoBottomViewHost.access$1500(this.this$0).get(paramInt) == null)) {
      return null;
    }
    if (paramView == null)
    {
      paramViewGroup = new AboveVideoBottomViewHost.ViewHolder();
      AboveVideoBottomViewHost.ViewHolder.access$1602(paramViewGroup, new ImageView(this.context));
      paramView = AboveVideoBottomViewHost.ViewHolder.access$1600(paramViewGroup);
      paramView.setTag(paramViewGroup);
    }
    while (!TextUtils.isEmpty(((CustomRspMsgVo.ShowLink)AboveVideoBottomViewHost.access$1500(this.this$0).get(paramInt)).ShowImageUrl))
    {
      Object localObject = new SimpleDateFormat("yyyyMMdd");
      localObject = ((CustomRspMsgVo.ShowLink)AboveVideoBottomViewHost.access$1500(this.this$0).get(paramInt)).ShowImageUrl + "?time=" + ((SimpleDateFormat)localObject).format(new Date());
      r.a(this.this$0.getContext()).a((String)localObject, AboveVideoBottomViewHost.ViewHolder.access$1600(paramViewGroup), 2130838192);
      return paramView;
      paramViewGroup = (AboveVideoBottomViewHost.ViewHolder)paramView.getTag();
    }
    AboveVideoBottomViewHost.ViewHolder.access$1600(paramViewGroup).setImageResource(2130838192);
    return paramView;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\widget\AboveVideoBottomViewHost$ViewFlowAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */