package com.tencent.avsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.avsdk.Model.LabelMsgVo.LabelTypeItem;

class IlvbMoreTopicActivity$2
  implements AdapterView.OnItemClickListener
{
  IlvbMoreTopicActivity$2(IlvbMoreTopicActivity paramIlvbMoreTopicActivity) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (IlvbMoreTopicActivity.access$100(this.this$0) != null)
    {
      paramView = (LabelMsgVo.LabelTypeItem)IlvbMoreTopicActivity.access$100(this.this$0).getItem(paramInt);
      if (paramView != null)
      {
        paramAdapterView = new Bundle();
        paramAdapterView.putString("title", paramView.getlabelName());
        paramAdapterView.putString("url", paramView.getMoreUrl());
        paramView = new Intent(this.this$0, IlvbTopicRoomListScreen.class);
        paramView.putExtras(paramAdapterView);
        this.this$0.startActivity(paramView);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\activity\IlvbMoreTopicActivity$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */