package com.payeco.android.plugin;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import com.payeco.android.plugin.http.objects.UpPay;
import com.payeco.android.plugin.http.parse.XmlTool;

final class e
  implements View.OnClickListener
{
  e(PayecoOrderDetailActivity paramPayecoOrderDetailActivity) {}
  
  public final void onClick(View paramView)
  {
    paramView = PayecoPluginApplication.getInstance();
    Object localObject = paramView.getmUpPay();
    UpPay localUpPay = new UpPay();
    localUpPay.setApplication("upPay.Rsp");
    localUpPay.setMerchantId(((UpPay)localObject).getMerchantId());
    localUpPay.setMerchantOrderId(((UpPay)localObject).getMerchantOrderId());
    localUpPay.setMerchantOrderAmt(((UpPay)localObject).getMerchantOrderAmt());
    localUpPay.setMerchantOrderTime(((UpPay)localObject).getMerchantOrderTime());
    localUpPay.setRespCode("0002");
    localUpPay.setRespDesc(PayecoOrderDetailActivity.o(this.J).getString(PayecoOrderDetailActivity.o(this.J).getIdentifier("payeco_plugin_pay_cancel", "string", PayecoOrderDetailActivity.p(this.J))));
    localObject = XmlTool.objectToXml(localUpPay);
    paramView.payEnd(PayecoOrderDetailActivity.h(this.J), "0", (String)localObject);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */