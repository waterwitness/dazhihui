package com.payeco.android.plugin;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import com.payeco.android.plugin.http.objects.UpPay;
import com.payeco.android.plugin.http.parse.XmlTool;

final class c
  implements DialogInterface.OnClickListener
{
  c(PayecoOrderDetailActivity paramPayecoOrderDetailActivity) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface.dismiss();
    paramDialogInterface = PayecoPluginApplication.getInstance();
    Object localObject = paramDialogInterface.getmUpPay();
    UpPay localUpPay = new UpPay();
    localUpPay.setApplication("upPay.Rsp");
    localUpPay.setMerchantId(((UpPay)localObject).getMerchantId());
    localUpPay.setMerchantOrderId(((UpPay)localObject).getMerchantOrderId());
    localUpPay.setMerchantOrderAmt(((UpPay)localObject).getMerchantOrderAmt());
    localUpPay.setMerchantOrderTime(((UpPay)localObject).getMerchantOrderTime());
    localUpPay.setRespCode("0001");
    localUpPay.setRespDesc(PayecoOrderDetailActivity.o(this.J).getString(PayecoOrderDetailActivity.o(this.J).getIdentifier("payeco_plugin_pay_fail", "string", PayecoOrderDetailActivity.p(this.J))));
    localObject = XmlTool.objectToXml(localUpPay);
    paramDialogInterface.payEnd(PayecoOrderDetailActivity.h(this.J), "1", (String)localObject);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */