package com.payeco.android.plugin;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

final class f
  implements View.OnClickListener
{
  f(PayecoOrderDetailActivity paramPayecoOrderDetailActivity) {}
  
  public final void onClick(View paramView)
  {
    ((TextView)paramView).setTextColor(-16776961);
    PayecoBaseUtil.startActivity(PayecoOrderDetailActivity.h(this.J), PayecoWebViewActivity.class, "url", "https://m.payeco.com/payeco_imsi/html/banklist.html", false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */