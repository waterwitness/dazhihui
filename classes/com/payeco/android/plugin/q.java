package com.payeco.android.plugin;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import com.payeco.android.plugin.http.objects.UpPay;
import com.payeco.android.plugin.http.parse.XmlTool;

final class q
  implements DialogInterface.OnClickListener
{
  q(PayecoPluginLoadingActivity paramPayecoPluginLoadingActivity) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface.dismiss();
    paramDialogInterface = PayecoPluginApplication.getInstance();
    Object localObject = paramDialogInterface.getmUpPay();
    UpPay localUpPay = new UpPay();
    localUpPay.setApplication("upPay.Rsp");
    if (localObject != null)
    {
      localUpPay.setMerchantId(((UpPay)localObject).getMerchantId());
      localUpPay.setMerchantOrderId(((UpPay)localObject).getMerchantOrderId());
      localUpPay.setMerchantOrderAmt(((UpPay)localObject).getMerchantOrderAmt());
      localUpPay.setMerchantOrderTime(((UpPay)localObject).getMerchantOrderTime());
    }
    localUpPay.setRespCode("0001");
    localUpPay.setRespDesc(PayecoPluginLoadingActivity.g(this.ac).getString(PayecoPluginLoadingActivity.g(this.ac).getIdentifier("payeco_plugin_pay_fail", "string", PayecoPluginLoadingActivity.h(this.ac))));
    localObject = XmlTool.objectToXml(localUpPay);
    paramDialogInterface.payEnd(PayecoPluginLoadingActivity.i(this.ac), "1", (String)localObject);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */