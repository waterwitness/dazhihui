package com.tencent.avsdk.widget;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.screen.BrowserActivity;

class AboveVideoTopView$4
  implements View.OnClickListener
{
  AboveVideoTopView$4(AboveVideoTopView paramAboveVideoTopView, String paramString) {}
  
  public void onClick(View paramView)
  {
    paramView = new Intent();
    Bundle localBundle = new Bundle();
    localBundle.putString("nexturl", this.val$huipiaoClick);
    paramView.putExtras(localBundle);
    paramView.setClass(AboveVideoTopView.access$200(this.this$0), BrowserActivity.class);
    AboveVideoTopView.access$200(this.this$0).startActivity(paramView);
    n.a("", 20273);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\AboveVideoTopView$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */