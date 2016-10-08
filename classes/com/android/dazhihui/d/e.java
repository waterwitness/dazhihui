package com.android.dazhihui.d;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import android.view.Window;
import android.widget.Toast;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.m;
import com.android.dazhihui.a.b.n;
import com.android.dazhihui.a.b.o;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.w;
import com.android.dazhihui.wxapi.WXEntryActivity;
import com.android.dazhihui.wxapi.WXPayEntryActivity;
import com.tencent.mm.sdk.modelpay.PayReq;
import com.tencent.mm.sdk.openapi.IWXAPI;
import com.tencent.mm.sdk.openapi.WXAPIFactory;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class e
  implements i
{
  private static final Map<String, String> f = new HashMap();
  Dialog a;
  private int b = 2;
  private Activity c;
  private m d;
  private h e;
  private Handler g = new g(this);
  
  static
  {
    f.put("9000", "支付成功");
    f.put("8000", "支付结果确认中");
    f.put("4000", "系统异常,请检查您的支付宝客户端是否正确安装");
    f.put("4001", "数据格式不正确");
    f.put("4003", "该用户绑定的支付宝账户被冻结或不允许支付");
    f.put("4004", "该用户已解除绑定");
    f.put("4005", "绑定失败或没有绑定");
    f.put("4006", "订单支付失败");
    f.put("4010", "重新绑定账户");
    f.put("6000", "支付服务正在进行升级操作");
    f.put("6001", "用户中途取消支付操作");
    f.put("7001", "网页支付失败");
  }
  
  public e(Activity paramActivity, h paramh, int paramInt)
  {
    this.c = paramActivity;
    this.e = paramh;
    this.b = paramInt;
    c();
  }
  
  private void a(Context paramContext, PayReq paramPayReq)
  {
    if (!bb.a(paramContext, "com.tencent.mm"))
    {
      b("请先安装微信！");
      return;
    }
    paramContext = WXAPIFactory.createWXAPI(this.c, WXEntryActivity.a);
    paramContext.registerApp(WXEntryActivity.a);
    if (com.android.dazhihui.g.a().L()) {
      b("正常调起支付");
    }
    if (this.e != null) {
      WXPayEntryActivity.a(this.e);
    }
    paramContext.sendReq(paramPayReq);
  }
  
  private void c()
  {
    this.a = new Dialog(this.c, 2131296289);
    this.a.setContentView(2130903192);
    this.a.getWindow().getAttributes().gravity = 17;
    this.a.setCancelable(true);
  }
  
  public void a()
  {
    if ((!this.c.isFinishing()) && (this.a != null) && (this.a.isShowing())) {
      this.a.dismiss();
    }
  }
  
  public void a(String paramString)
  {
    new Thread(new f(this, paramString)).start();
  }
  
  public void a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    String str1 = paramString4;
    if (paramString4 == null) {
      str1 = "";
    }
    Object localObject = w.a().f();
    String str2 = Base64.encodeToString(w.a().j(), 0);
    paramString4 = new x(3008);
    paramString4.b(2);
    x localx = new x(105);
    localObject = new StringBuilder().append("{\"uname\":\"").append((String)localObject).append("\",\"password\":\"").append(str2).append("\",\"vendor\":\"");
    if (this.b == 2) {}
    for (int i = 16;; i = 22)
    {
      localx.a(i + "\",\"product_id\":\"" + paramString1 + "\",\"pay_src\":\"" + str1 + "\",\"pay_money\":\"" + paramString2 + "\",\"pay_month\":\"" + paramString3 + "\",\"qid\":\"" + 100 + "\"}");
      paramString4.a(localx);
      this.d = new m(paramString4, n.a);
      this.d.a(this);
      com.android.dazhihui.a.g.a().a(this.d);
      return;
    }
  }
  
  public void b(String paramString)
  {
    try
    {
      if (!TextUtils.isEmpty(paramString)) {
        Toast.makeText(this.c, paramString, 0).show();
      }
      return;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    if (paramh == this.d)
    {
      a();
      int i;
      try
      {
        paramh = ((o)paramj).h();
        if ((paramh == null) || (paramh.a != 3008)) {
          return;
        }
        paramh = new q(paramh.b);
        paramh.b();
        i = paramh.e();
        paramh.e();
        paramh.e();
        if (i != 105) {
          return;
        }
        if (this.b != 2) {
          break label295;
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
              b("获取订单成功");
            }
            a(paramh);
            return;
          }
          paramj.getString("code");
          b(paramj.getString("desc"));
          if (this.e == null) {
            return;
          }
          this.e.b();
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
        b("用户名或密码错误");
        if (this.e != null) {
          this.e.b();
        }
      }
      else
      {
        b(paramh.optString("msg", "获取订单失败:其他错误"));
        if (this.e != null)
        {
          this.e.b();
          return;
          label295:
          if (this.b == 1)
          {
            Object localObject = new JSONObject(paramh.l());
            i = ((JSONObject)localObject).optInt("result", 3);
            if (i == 0)
            {
              paramh = ((JSONObject)localObject).optString("prepay_id");
              paramj = ((JSONObject)localObject).optString("nonce_str");
              String str1 = ((JSONObject)localObject).optString("timestamp");
              String str2 = ((JSONObject)localObject).optString("package");
              localObject = ((JSONObject)localObject).optString("sign");
              if (com.android.dazhihui.g.a().L()) {
                b("获取订单成功!");
              }
              PayReq localPayReq = new PayReq();
              localPayReq.appId = WXEntryActivity.a;
              localPayReq.partnerId = WXEntryActivity.b;
              localPayReq.prepayId = paramh;
              localPayReq.nonceStr = paramj;
              localPayReq.timeStamp = str1;
              localPayReq.packageValue = str2;
              localPayReq.sign = ((String)localObject);
              localPayReq.extData = "app data";
              a(this.c, localPayReq);
              return;
            }
            if (i == 1)
            {
              b("用户名或密码错误");
              if (this.e != null) {
                this.e.b();
              }
            }
            else
            {
              b(((JSONObject)localObject).optString("msg", "获取订单失败:其他错误"));
              if (this.e != null) {
                this.e.b();
              }
            }
          }
        }
      }
    }
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    a();
    if (paramh == this.d)
    {
      b("获取订单失败");
      if (this.e != null) {
        this.e.b();
      }
    }
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    a();
    if (paramh == this.d)
    {
      b("获取订单失败");
      if (this.e != null) {
        this.e.b();
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\d\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */