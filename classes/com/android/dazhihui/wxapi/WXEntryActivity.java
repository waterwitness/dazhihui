package com.android.dazhihui.wxapi;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.m;
import com.android.dazhihui.a.b.o;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.g;
import com.android.dazhihui.b;
import com.android.dazhihui.c;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.w;
import com.tencent.mm.sdk.modelbase.BaseReq;
import com.tencent.mm.sdk.modelbase.BaseResp;
import com.tencent.mm.sdk.modelmsg.SendAuth.Resp;
import com.tencent.mm.sdk.openapi.IWXAPI;
import com.tencent.mm.sdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.sdk.openapi.WXAPIFactory;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

public class WXEntryActivity
  extends BaseActivity
  implements b, IWXAPIEventHandler
{
  public static String a = "wx928c38fdc656cd34";
  public static String b = "1233185502";
  private IWXAPI c;
  private m d;
  private boolean e = false;
  
  static
  {
    if ("app_dzh".equals("app_sb"))
    {
      a = "wx762459d59b986246";
      b = "1348355301";
      return;
    }
  }
  
  public static String a()
  {
    Random localRandom = new Random();
    String str = "";
    int i = 0;
    while (i < 6)
    {
      str = str + localRandom.nextInt(10);
      i += 1;
    }
    return str;
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    if (this.d == paramh)
    {
      paramh = ((o)paramj).h();
      if (paramh.a == 3009)
      {
        paramh = new q(paramh.b);
        int i = paramh.b();
        int j = paramh.e();
        paramh.e();
        paramh.e();
        if (j == 101)
        {
          if (i == 2)
          {
            paramh = paramh.l();
            try
            {
              paramh = new JSONObject(paramh);
              i = paramh.optInt("status", 3);
              if (i == 0)
              {
                paramj = paramh.optString("realuname", "");
                String str1 = paramh.optString("passwdmd5", "");
                paramh.optString("unionid", "");
                String str2 = paramh.optString("nickname", "");
                String str3 = paramh.optString("avatar_url", "");
                i = paramh.optInt("is_new", 1);
                com.android.dazhihui.ui.screen.stock.ti.a = paramh.optInt("coins", 0);
                if (i == 1)
                {
                  w.a().b = 1;
                  com.android.dazhihui.ui.screen.stock.ti.b = str2;
                  com.android.dazhihui.ui.screen.stock.ti.c = str3;
                  this.e = true;
                  w.a().a(paramj, str1);
                  return;
                }
                this.e = true;
                w.a().a(paramj, str1);
                return;
              }
            }
            catch (JSONException paramh)
            {
              paramh.printStackTrace();
              showShortToast("其他错误!");
              getLoadingDialog().dismiss();
              finish();
              return;
            }
            if (i == 1)
            {
              showShortToast("请求第三方服务失败!");
              getLoadingDialog().dismiss();
              finish();
              return;
            }
            if (i == 2)
            {
              showShortToast("请求账户中心失败!");
              getLoadingDialog().dismiss();
              finish();
              return;
            }
            showShortToast("其他错误!");
            getLoadingDialog().dismiss();
            finish();
            return;
          }
          showShortToast("其他异常!");
          getLoadingDialog().dismiss();
          finish();
        }
      }
    }
  }
  
  public void handleTimeout(h paramh)
  {
    getLoadingDialog().dismiss();
    showShortToast("请求超时!");
    finish();
  }
  
  protected void init(Bundle paramBundle) {}
  
  public void loginStatusChange(c paramc)
  {
    if ((paramc == c.b) && (this.e))
    {
      if (w.a().l())
      {
        getLoadingDialog().dismiss();
        finish();
      }
    }
    else {
      return;
    }
    getLoadingDialog().dismiss();
    finish();
  }
  
  public void netException(h paramh, Exception paramException)
  {
    getLoadingDialog().dismiss();
    showShortToast("网络异常!");
    finish();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.c = WXAPIFactory.createWXAPI(this, a, false);
    this.c.registerApp(a);
    this.c.handleIntent(getIntent(), this);
    w.a().a(this);
  }
  
  protected void onDestroy()
  {
    w.a().b(this);
    super.onDestroy();
  }
  
  protected void onFinish() {}
  
  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
    this.c.handleIntent(paramIntent, this);
  }
  
  public void onReq(BaseReq paramBaseReq) {}
  
  public void onResp(BaseResp paramBaseResp)
  {
    if (paramBaseResp.errCode == 0) {
      if ((paramBaseResp instanceof SendAuth.Resp))
      {
        paramBaseResp = ((SendAuth.Resp)paramBaseResp).code;
        getLoadingDialog().show();
        m localm = w.a().s();
        localm.a(new a(this, this, paramBaseResp));
        g.a().a(localm);
      }
    }
    do
    {
      return;
      showShortToast("分享成功!");
      finish();
      return;
      if (paramBaseResp.errCode == -4)
      {
        showShortToast("微信拒绝授权");
        finish();
        return;
      }
    } while (paramBaseResp.errCode != -2);
    showShortToast("用户取消授权!");
    finish();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\wxapi\WXEntryActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */