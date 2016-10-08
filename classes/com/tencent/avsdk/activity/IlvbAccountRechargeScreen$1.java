package com.tencent.avsdk.activity;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.android.dazhihui.a.f;
import com.android.dazhihui.ui.widget.MyWebView;

class IlvbAccountRechargeScreen$1
  implements AdapterView.OnItemClickListener
{
  IlvbAccountRechargeScreen$1(IlvbAccountRechargeScreen paramIlvbAccountRechargeScreen) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (IlvbAccountRechargeScreen.access$000(this.this$0) != paramInt)
    {
      if (paramInt != 0) {
        break label48;
      }
      IlvbAccountRechargeScreen.access$100(this.this$0).loadUrl(f.ae);
    }
    for (;;)
    {
      IlvbAccountRechargeScreen.access$002(this.this$0, paramInt);
      IlvbAccountRechargeScreen.access$200(this.this$0).notifyDataSetInvalidated();
      return;
      label48:
      IlvbAccountRechargeScreen.access$100(this.this$0).loadUrl(f.af);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\activity\IlvbAccountRechargeScreen$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */