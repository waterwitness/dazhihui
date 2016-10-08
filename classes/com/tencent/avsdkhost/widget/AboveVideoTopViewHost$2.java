package com.tencent.avsdkhost.widget;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.screen.BrowserActivity;
import com.tencent.avsdk.Model.CustomRspMsgVo.RoomUser;
import com.tencent.avsdkhost.MemberListAdapterHost;

class AboveVideoTopViewHost$2
  implements AdapterView.OnItemSelectedListener
{
  AboveVideoTopViewHost$2(AboveVideoTopViewHost paramAboveVideoTopViewHost) {}
  
  public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    n.a("", 20272);
    paramAdapterView = (CustomRspMsgVo.RoomUser)AboveVideoTopViewHost.access$100(this.this$0).getItem(paramInt);
    if (!TextUtils.isEmpty(paramAdapterView.AccountHomeUrl))
    {
      paramView = new Intent();
      Bundle localBundle = new Bundle();
      localBundle.putString("nexturl", com.android.dazhihui.d.r.a(paramAdapterView.AccountHomeUrl, "")[1]);
      paramView.putExtras(localBundle);
      paramView.setClass(AboveVideoTopViewHost.access$200(this.this$0), BrowserActivity.class);
      AboveVideoTopViewHost.access$200(this.this$0).startActivity(paramView);
    }
  }
  
  public void onNothingSelected(AdapterView<?> paramAdapterView) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\widget\AboveVideoTopViewHost$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */