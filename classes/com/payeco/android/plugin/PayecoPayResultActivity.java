package com.payeco.android.plugin;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.payeco.android.plugin.http.HttpAction;
import com.payeco.android.plugin.http.objects.CommonPay;
import com.payeco.android.plugin.http.objects.PluginObject;
import com.payeco.android.plugin.http.objects.UpPay;
import com.payeco.android.plugin.http.parse.XmlTool;

public class PayecoPayResultActivity
  extends PayecoBasicActivity
{
  private PayecoPayResultActivity N;
  private String O = null;
  private String P = null;
  private CommonPay Q;
  private Resources a;
  private String b;
  private Handler e = new n(this);
  private CommonPay i;
  
  private void d()
  {
    if (this.i != null) {
      HttpAction.doPostAction(this.N, "CommonPay.Req", this.i, PayecoBaseUtil.createWaitDialog(this.N, false));
    }
  }
  
  private void e()
  {
    PayecoPluginApplication localPayecoPluginApplication = PayecoPluginApplication.getInstance();
    Object localObject = localPayecoPluginApplication.getmUpPay();
    UpPay localUpPay = new UpPay();
    localUpPay.setApplication("upPay.Rsp");
    localUpPay.setMerchantId(((UpPay)localObject).getMerchantId());
    localUpPay.setMerchantOrderId(((UpPay)localObject).getMerchantOrderId());
    localUpPay.setMerchantOrderAmt(((UpPay)localObject).getMerchantOrderAmt());
    localUpPay.setMerchantOrderTime(((UpPay)localObject).getMerchantOrderTime());
    localUpPay.setSettleDate(this.i.getSettleDate());
    localUpPay.setRespCode(this.O);
    localUpPay.setRespDesc(this.P);
    localObject = XmlTool.objectToXml(localUpPay);
    localPayecoPluginApplication.payEnd(this.N, "1", (String)localObject);
  }
  
  public void doCallBack(PluginObject paramPluginObject)
  {
    if (paramPluginObject != null)
    {
      this.Q = ((CommonPay)paramPluginObject);
      this.e.sendEmptyMessage(0);
      return;
    }
    this.e.sendEmptyMessage(1);
  }
  
  public void doCallBack(Exception paramException)
  {
    this.e.sendEmptyMessage(1);
  }
  
  public void onBackPressed()
  {
    e();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.a = getResources();
    this.b = getPackageName();
    setContentView(this.a.getIdentifier("payeco_plugin_pay_result", "layout", this.b));
    this.N = this;
    PayecoPluginApplication.getInstance().addActivity(this.N);
    this.i = ((CommonPay)getIntent().getSerializableExtra("commonpayReqObj"));
    int j = this.a.getIdentifier("payeco_plugin_solidyellow", "drawable", this.b);
    int k = this.a.getIdentifier("payeco_textColorYellow", "color", this.b);
    ((PayecoPluginPayStepLayout)findViewById(this.a.getIdentifier("payeco_paystep_first", "id", this.b))).initLayout(this.N, j, k, "1", this.a.getIdentifier("payeco_plugin_step_1", "string", this.b));
    ((PayecoPluginPayStepLayout)findViewById(this.a.getIdentifier("payeco_paystep_second", "id", this.b))).initLayout(this.N, j, k, "2", this.a.getIdentifier("payeco_plugin_step_2", "string", this.b));
    ((PayecoPluginPayStepLayout)findViewById(this.a.getIdentifier("payeco_paystep_third", "id", this.b))).initLayout(this.N, j, k, "3", this.a.getIdentifier("payeco_plugin_step_3", "string", this.b));
    if (this.i != null)
    {
      paramBundle = PayecoPluginApplication.getInstance().getmUpPay();
      ((TextView)findViewById(this.a.getIdentifier("payeco_payResult_merchantName_edit", "id", this.b))).setText(paramBundle.getMerchantName());
      findViewById(this.a.getIdentifier("payeco_payResult_merchantName_layout", "id", this.b)).setVisibility(PayecoPluginApplication.mFlagMerchantName);
      ((TextView)findViewById(this.a.getIdentifier("payeco_payResult_orderId_edit", "id", this.b))).setText(paramBundle.getMerchantOrderId());
      String str = paramBundle.getMerchantOrderAmt();
      ((TextView)findViewById(this.a.getIdentifier("payeco_payResult_orderAmt_edit", "id", this.b))).setText(getString(this.a.getIdentifier("payeco_amount", "string", this.b), new Object[] { PayecoBaseUtil.fomatAmount(str) }));
      ((TextView)findViewById(this.a.getIdentifier("payeco_payResult_orderTime_edit", "id", this.b))).setText(PayecoBaseUtil.formatTimeStr(paramBundle.getMerchantOrderTime()));
    }
    ((Button)findViewById(this.a.getIdentifier("payeco_bt_back_merchant", "id", this.b))).setOnClickListener(new m(this));
    d();
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    this.N = null;
    this.O = null;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\PayecoPayResultActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */