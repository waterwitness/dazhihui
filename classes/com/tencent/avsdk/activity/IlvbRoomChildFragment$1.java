package com.tencent.avsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.avsdk.Model.LabelMsgVo.LabelTypeItem;
import java.util.List;

class IlvbRoomChildFragment$1
  implements AdapterView.OnItemClickListener
{
  IlvbRoomChildFragment$1(IlvbRoomChildFragment paramIlvbRoomChildFragment) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if ((this.this$0.mLabelList != null) && (this.this$0.mLabelList.size() > 0))
    {
      if ((paramInt == 5) && (this.this$0.mLabelList.size() > 6))
      {
        paramAdapterView = new Intent(this.this$0.getActivity(), IlvbMoreTopicActivity.class);
        this.this$0.getActivity().startActivity(paramAdapterView);
      }
    }
    else {
      return;
    }
    paramAdapterView = new Bundle();
    paramAdapterView.putString("title", ((LabelMsgVo.LabelTypeItem)this.this$0.mLabelList.get(paramInt)).getlabelName());
    paramAdapterView.putString("url", ((LabelMsgVo.LabelTypeItem)this.this$0.mLabelList.get(paramInt)).getMoreUrl());
    paramView = new Intent(this.this$0.getActivity(), IlvbTopicRoomListScreen.class);
    paramView.putExtras(paramAdapterView);
    this.this$0.getActivity().startActivity(paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\activity\IlvbRoomChildFragment$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */