package com.payeco.android.plugin;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import com.payeco.android.plugin.http.objects.UpPay;
import com.payeco.android.plugin.http.parse.XmlTool;

final class t
  implements DialogInterface.OnClickListener
{
  t(PayecoRiskControlActivity paramPayecoRiskControlActivity) {}
  
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
    localUpPay.setRespDesc(PayecoRiskControlActivity.f(this.bc).getString(PayecoRiskControlActivity.f(this.bc).getIdentifier("payeco_plugin_pay_fail", "string", PayecoRiskControlActivity.g(this.bc))));
    localObject = XmlTool.objectToXml(localUpPay);
    paramDialogInterface.payEnd(PayecoRiskControlActivity.e(this.bc), "1", (String)localObject);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */