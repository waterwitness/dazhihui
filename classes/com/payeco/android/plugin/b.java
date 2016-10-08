package com.payeco.android.plugin;

import android.content.res.Resources;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

final class b
  implements CompoundButton.OnCheckedChangeListener
{
  b(PayecoOrderDetailActivity paramPayecoOrderDetailActivity) {}
  
  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    PayecoOrderDetailActivity.mUseCqp = null;
    if (paramBoolean)
    {
      PayecoOrderDetailActivity.mUseCqp = "0";
      PayecoOrderDetailActivity.l(this.J).initLayout(PayecoOrderDetailActivity.h(this.J), PayecoOrderDetailActivity.m(this.J), PayecoOrderDetailActivity.n(this.J), "2", PayecoOrderDetailActivity.o(this.J).getIdentifier("payeco_plugin_free_auth", "string", PayecoOrderDetailActivity.p(this.J)));
    }
    for (;;)
    {
      PayecoBaseUtil.saveValueToPreferencs(PayecoOrderDetailActivity.h(this.J), "payeco_use_authpay", PayecoOrderDetailActivity.mUseCqp);
      return;
      PayecoOrderDetailActivity.mUseCqp = "1";
      PayecoOrderDetailActivity.l(this.J).initLayout(PayecoOrderDetailActivity.h(this.J), PayecoOrderDetailActivity.q(this.J), PayecoOrderDetailActivity.r(this.J), "2", PayecoOrderDetailActivity.o(this.J).getIdentifier("payeco_plugin_step_2", "string", PayecoOrderDetailActivity.p(this.J)));
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */