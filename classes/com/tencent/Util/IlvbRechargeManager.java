package com.tencent.Util;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import android.view.Window;
import android.widget.Toast;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.m;
import com.android.dazhihui.a.b.n;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.d.bb;
import com.android.dazhihui.w;
import com.android.dazhihui.wxapi.WXEntryActivity;
import com.tencent.mm.sdk.modelpay.PayReq;
import com.tencent.mm.sdk.openapi.IWXAPI;
import com.tencent.mm.sdk.openapi.WXAPIFactory;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class IlvbRechargeManager
  implements i
{
  public static final int SDK_PAY_FLAG_ALIPAY = 0;
  public static final int SDK_PAY_FLAG_WX = 1;
  private static final Map<String, String> sResultStatus = new HashMap();
  private Activity mActivity;
  private m mAlipayOrderInfoRequest;
  private Handler mHandler = new IlvbRechargeManager.2(this);
  private com.android.dazhihui.a.b.f mOutTradeNoRequest;
  private int mPayFlag = 0;
  Dialog mProgressDialog;
  private IlvbRechargeManager.RechargeCallBackListener mRechargeCallBackListener;
  private m mWXOrderInfoRequest;
  
  static
  {
    sResultStatus.put("9000", "支付成功");
    sResultStatus.put("8000", "支付结果确认中");
    sResultStatus.put("4000", "系统异常,请检查您的支付宝客户端是否正确安装");
    sResultStatus.put("4001", "数据格式不正确");
    sResultStatus.put("4003", "该用户绑定的支付宝账户被冻结或不允许支付");
    sResultStatus.put("4004", "该用户已解除绑定");
    sResultStatus.put("4005", "绑定失败或没有绑定");
    sResultStatus.put("4006", "订单支付失败");
    sResultStatus.put("4010", "重新绑定账户");
    sResultStatus.put("6000", "支付服务正在进行升级操作");
    sResultStatus.put("6001", "用户中途取消支付操作");
    sResultStatus.put("7001", "网页支付失败");
  }
  
  public IlvbRechargeManager(Activity paramActivity, IlvbRechargeManager.RechargeCallBackListener paramRechargeCallBackListener, int paramInt)
  {
    this.mActivity = paramActivity;
    this.mRechargeCallBackListener = paramRechargeCallBackListener;
    this.mPayFlag = paramInt;
    initProgressDialog();
  }
  
  private void sendOrderInfo(String paramString1, Double paramDouble, String paramString2, String paramString3)
  {
    Object localObject = paramString2;
    if (paramString2 == null) {
      localObject = "";
    }
    paramString2 = paramString3;
    if (paramString3 == null) {
      paramString2 = "";
    }
    paramString3 = w.a().f();
    String str1 = Base64.encodeToString(w.a().j(), 0);
    if (this.mPayFlag == 0)
    {
      localObject = new x(3008);
      ((x)localObject).b(2);
      localx1 = new x(102);
      localx1.a("{\"uname\":\"" + paramString3 + "\",\"password\":\"" + str1 + "\",\"paymoney\":\"" + paramDouble + "\",\"paysource\":\"" + paramString2 + "\",\"subid\":\"" + paramString1 + "\",\"qid\":\"" + 0 + "\"}");
      ((x)localObject).a(localx1);
      this.mAlipayOrderInfoRequest = new m((x)localObject, n.a);
      this.mAlipayOrderInfoRequest.a(this);
      com.android.dazhihui.a.g.a().a(this.mAlipayOrderInfoRequest);
    }
    while (this.mPayFlag != 1) {
      return;
    }
    x localx1 = new x(3008);
    localx1.b(2);
    x localx2 = new x(104);
    String str2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date());
    localx2.d(0);
    int i = (int)(paramDouble.doubleValue() * 100.0D);
    localx2.a("{\"uname\":\"" + paramString3 + "\",\"password\":\"" + str1 + "\",\"amount\":" + i + ",\"order_date\":\"" + str2 + "\",\"pay_src\":\"" + paramString2 + "\",\"serial_id\":\"" + paramString1 + "\",\"vendor\":" + 22 + ",\"product_name\":\"" + (String)localObject + "\"}");
    localx1.a(localx2);
    this.mWXOrderInfoRequest = new m(localx1, n.a);
    this.mWXOrderInfoRequest.a(this);
    com.android.dazhihui.a.g.a().a(this.mWXOrderInfoRequest);
  }
  
  private void wxPay(Context paramContext, PayReq paramPayReq)
  {
    if (!bb.a(paramContext, "com.tencent.mm"))
    {
      showShortToast("请先安装微信！");
      return;
    }
    paramContext = WXAPIFactory.createWXAPI(this.mActivity, WXEntryActivity.a);
    paramContext.registerApp(WXEntryActivity.a);
    if (com.android.dazhihui.g.a().L()) {
      showShortToast("正常调起支付");
    }
    paramContext.sendReq(paramPayReq);
  }
  
  public void alipay(String paramString)
  {
    new Thread(new IlvbRechargeManager.1(this, paramString)).start();
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    int i;
    if (paramh == this.mAlipayOrderInfoRequest)
    {
      hideProgress();
      try
      {
        paramh = ((com.android.dazhihui.a.b.o)paramj).h();
        if ((paramh == null) || (paramh.a != 3008)) {
          return;
        }
        paramh = new q(paramh.b);
        paramh.b();
        i = paramh.e();
        paramh.e();
        paramh.e();
        if (i != 102) {
          return;
        }
        paramh = new JSONObject(paramh.l());
        i = paramh.optInt("result", 3);
        if (i == 0)
        {
          paramh = new JSONObject(paramh.optString("response"));
          paramj = paramh.optJSONObject("data");
          i = paramh.getInt("err");
          paramh.getString("qid");
          if (i == 0)
          {
            paramj.getString("code");
            paramh = paramj.getString("value");
            if (com.android.dazhihui.g.a().L()) {
              showShortToast("获取订单成功");
            }
            alipay(paramh);
            return;
          }
          paramj.getString("code");
          showShortToast(paramj.getString("desc"));
          if (this.mRechargeCallBackListener == null) {
            return;
          }
          this.mRechargeCallBackListener.handlefailure();
          return;
        }
      }
      catch (Exception paramh)
      {
        paramh.printStackTrace();
        return;
      }
      if (i == 1)
      {
        showShortToast("用户名或密码错误");
        if (this.mRechargeCallBackListener != null) {
          this.mRechargeCallBackListener.handlefailure();
        }
      }
      else
      {
        showShortToast(paramh.optString("msg", "获取订单失败:其他错误"));
        if (this.mRechargeCallBackListener != null) {
          this.mRechargeCallBackListener.handlefailure();
        }
      }
    }
    else
    {
      String str;
      Object localObject1;
      if (paramh == this.mWXOrderInfoRequest)
      {
        hideProgress();
        Object localObject2;
        try
        {
          paramh = ((com.android.dazhihui.a.b.o)paramj).h();
          if ((paramh == null) || (paramh.a != 3008)) {
            return;
          }
          paramh = new q(paramh.b);
          paramh.b();
          i = paramh.e();
          paramh.e();
          paramh.e();
          if (i != 104) {
            return;
          }
          localObject2 = new JSONObject(paramh.l());
          i = ((JSONObject)localObject2).optInt("result", 3);
          if (i == 0)
          {
            paramh = ((JSONObject)localObject2).optString("prepay_id");
            paramj = ((JSONObject)localObject2).optString("nonce_str");
            str = ((JSONObject)localObject2).optString("timestamp");
            localObject1 = ((JSONObject)localObject2).optString("package");
            localObject2 = ((JSONObject)localObject2).optString("sign");
            if (com.android.dazhihui.g.a().L()) {
              showShortToast("获取订单成功!");
            }
            PayReq localPayReq = new PayReq();
            localPayReq.appId = WXEntryActivity.a;
            localPayReq.partnerId = WXEntryActivity.b;
            localPayReq.prepayId = paramh;
            localPayReq.nonceStr = paramj;
            localPayReq.timeStamp = str;
            localPayReq.packageValue = ((String)localObject1);
            localPayReq.sign = ((String)localObject2);
            localPayReq.extData = "app data";
            wxPay(this.mActivity, localPayReq);
            return;
          }
        }
        catch (Exception paramh)
        {
          paramh.printStackTrace();
          return;
        }
        if (i == 1)
        {
          showShortToast("用户名或密码错误");
          if (this.mRechargeCallBackListener != null) {
            this.mRechargeCallBackListener.handlefailure();
          }
        }
        else
        {
          showShortToast(((JSONObject)localObject2).optString("msg", "获取订单失败:其他错误"));
          if (this.mRechargeCallBackListener != null) {
            this.mRechargeCallBackListener.handlefailure();
          }
        }
      }
      else if (paramh == this.mOutTradeNoRequest)
      {
        paramh = new String(((com.android.dazhihui.a.b.g)paramj).a());
        if (TextUtils.isEmpty(paramh))
        {
          hideProgress();
          showShortToast("获取订单失败");
          if (this.mRechargeCallBackListener != null) {
            this.mRechargeCallBackListener.handlefailure();
          }
        }
        else
        {
          try
          {
            paramh = new JSONObject(paramh);
            paramh.getString("Qid");
            i = paramh.getInt("Err");
            paramh.getInt("Counter");
            localObject1 = paramh.optJSONObject("Data");
            ((JSONObject)localObject1).getJSONArray("Stack");
            if (i != 0)
            {
              hideProgress();
              showShortToast(((JSONObject)localObject1).optString("Desc"));
              return;
            }
          }
          catch (Exception paramh)
          {
            hideProgress();
            paramh.printStackTrace();
            return;
          }
          paramh = Double.valueOf(((JSONObject)localObject1).optDouble("price"));
          paramj = ((JSONObject)localObject1).optString("orderid");
          str = ((JSONObject)localObject1).optString("pay_src");
          localObject1 = ((JSONObject)localObject1).optString("product_name");
          if (com.android.dazhihui.g.a().L()) {
            showShortToast("订单号:" + paramj + "，支付价格：" + paramh);
          }
          sendOrderInfo(paramj, paramh, (String)localObject1, str);
        }
      }
    }
  }
  
  public void handleTimeout(h paramh)
  {
    hideProgress();
    if ((paramh == this.mOutTradeNoRequest) || (paramh == this.mAlipayOrderInfoRequest) || (paramh == this.mWXOrderInfoRequest))
    {
      showShortToast("获取订单失败");
      if (this.mRechargeCallBackListener != null) {
        this.mRechargeCallBackListener.handlefailure();
      }
    }
  }
  
  public void hideProgress()
  {
    if ((!this.mActivity.isFinishing()) && (this.mProgressDialog != null) && (this.mProgressDialog.isShowing())) {
      this.mProgressDialog.dismiss();
    }
  }
  
  public void initProgressDialog()
  {
    this.mProgressDialog = new Dialog(this.mActivity, 2131296289);
    this.mProgressDialog.setContentView(2130903192);
    this.mProgressDialog.getWindow().getAttributes().gravity = 17;
    this.mProgressDialog.setCancelable(true);
  }
  
  public void netException(h paramh, Exception paramException)
  {
    hideProgress();
    if ((paramh == this.mOutTradeNoRequest) || (paramh == this.mAlipayOrderInfoRequest) || (paramh == this.mWXOrderInfoRequest))
    {
      showShortToast("获取订单失败");
      if (this.mRechargeCallBackListener != null) {
        this.mRechargeCallBackListener.handlefailure();
      }
    }
  }
  
  public void sendOutTradeNo(Double paramDouble, int paramInt)
  {
    showProgress();
    String str = com.android.dazhihui.o.a().b();
    this.mOutTradeNoRequest = new com.android.dazhihui.a.b.f();
    paramDouble = com.android.dazhihui.a.f.ag + "price=" + paramDouble + "&productid=" + paramInt + "&token=" + str;
    this.mOutTradeNoRequest.c(paramDouble);
    if ("app_dzh".equals("app_sb")) {
      this.mOutTradeNoRequest.b("httpdzh", "dzhtv-" + com.android.dazhihui.g.a().r());
    }
    for (;;)
    {
      this.mOutTradeNoRequest.a(this);
      com.android.dazhihui.a.g.a().a(this.mOutTradeNoRequest);
      return;
      this.mOutTradeNoRequest.b("httpdzh", "dzh-android-" + com.android.dazhihui.g.a().r());
    }
  }
  
  public void showProgress()
  {
    if (!this.mActivity.isFinishing())
    {
      if (this.mProgressDialog == null) {
        initProgressDialog();
      }
      if (!this.mProgressDialog.isShowing()) {
        this.mProgressDialog.show();
      }
    }
  }
  
  public void showShortToast(String paramString)
  {
    try
    {
      if (!TextUtils.isEmpty(paramString)) {
        Toast.makeText(this.mActivity, paramString, 0).show();
      }
      return;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\Util\IlvbRechargeManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */