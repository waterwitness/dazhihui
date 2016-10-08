package com.android.dazhihui.ui.screen.stock;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy.Builder;
import android.text.TextUtils;
import android.widget.Toast;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.f;
import com.android.dazhihui.a.g;
import com.android.dazhihui.c.a.a;
import com.android.dazhihui.d.bb;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.a.e;
import com.android.dazhihui.ui.delegate.screen.TradeOutsideScreen;
import com.android.dazhihui.ui.screen.BrowserActivity;
import com.android.dazhihui.w;
import com.android.dazhihui.wxapi.WXEntryActivity;
import com.tencent.connect.auth.QQAuth;
import com.tencent.mm.sdk.modelmsg.SendAuth.Req;
import com.tencent.mm.sdk.openapi.IWXAPI;
import com.tencent.mm.sdk.openapi.WXAPIFactory;
import com.tencent.tauth.Tencent;
import org.json.JSONException;
import org.json.JSONObject;

public class gx
  implements i
{
  public static QQAuth a;
  private Tencent b;
  private com.android.dazhihui.a.b.m c;
  private String d = "";
  private Activity e;
  
  private void a(String paramString1, String paramString2)
  {
    if (TextUtils.isEmpty(paramString1))
    {
      n.c("openId empty");
      return;
    }
    com.android.dazhihui.a.b.m localm = w.a().s();
    localm.a(new gz(this, this, paramString1, paramString2));
    g.a().a(localm);
  }
  
  public void a(Activity paramActivity)
  {
    this.e = paramActivity;
    if (!bb.a(paramActivity, "com.tencent.mobileqq"))
    {
      Toast.makeText(paramActivity, "请先安装QQ！", 0).show();
      return;
    }
    a = QQAuth.createInstance(com.android.dazhihui.ui.a.m.a().c(), paramActivity.getApplicationContext());
    this.b = Tencent.createInstance(com.android.dazhihui.ui.a.m.a().c(), paramActivity);
    if (!a.isSessionValid())
    {
      gy localgy = new gy(this);
      this.b.loginWithOEM(paramActivity, "all", localgy, "10000144", "10000144", "xxxx");
    }
    for (;;)
    {
      n.a("", 1316);
      return;
      a.logout(paramActivity);
    }
  }
  
  public void a(Context paramContext)
  {
    Intent localIntent = new Intent();
    Bundle localBundle = new Bundle();
    localBundle.putString("nexturl", f.T);
    localBundle.putString("names", "用户注册");
    localIntent.putExtras(localBundle);
    localIntent.setClass(paramContext, BrowserActivity.class);
    paramContext.startActivity(localIntent);
  }
  
  public void a(Context paramContext, boolean paramBoolean)
  {
    Intent localIntent = new Intent(paramContext, LoginScreen.class);
    localIntent.putExtra("REGISTER_FROM_TYPE", "FROM_STOCK");
    localIntent.putExtra("CAN_showSyncSettingDialog", paramBoolean);
    paramContext.startActivity(localIntent);
  }
  
  public void a(String paramString)
  {
    if (this.e != null) {
      Toast.makeText(this.e, paramString, 0).show();
    }
  }
  
  public void b(Context paramContext)
  {
    if (!bb.a(paramContext, "com.tencent.mm"))
    {
      Toast.makeText(paramContext, "请先安装微信！", 0).show();
      return;
    }
    n.a("", 1378);
    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
    paramContext = WXAPIFactory.createWXAPI(paramContext, WXEntryActivity.a, false);
    paramContext.registerApp(WXEntryActivity.a);
    SendAuth.Req localReq = new SendAuth.Req();
    localReq.scope = "snsapi_userinfo";
    localReq.state = "wechat_sdk_demo_test";
    paramContext.sendReq(localReq);
  }
  
  public void c(Context paramContext)
  {
    int k = 0;
    com.android.dazhihui.ui.delegate.b.o.u();
    int j = k;
    int i;
    if (a.E != null) {
      i = 0;
    }
    Object localObject;
    Intent localIntent;
    for (;;)
    {
      j = k;
      if (i < a.E.length)
      {
        if (!a.E[i][0].contains("湘财证券")) {
          break label140;
        }
        if (a.E[i].length >= 7) {
          break label127;
        }
      }
      label127:
      for (localObject = "0"; ((String)localObject).equals("0"); localObject = a.E[i][6])
      {
        j = 1;
        localObject = new Bundle();
        localIntent = new Intent();
        if (j == 0) {
          break label149;
        }
        localObject = new Bundle();
        ((Bundle)localObject).putBoolean("xcLoginProcedure", true);
        e.a().a((Bundle)localObject);
        com.android.dazhihui.ui.delegate.b.o.a(paramContext);
        return;
      }
      label140:
      i += 1;
    }
    label149:
    ((Bundle)localObject).putBoolean("xcLoginProcedure", true);
    localIntent.putExtras((Bundle)localObject);
    localIntent.setClass(paramContext, TradeOutsideScreen.class);
    paramContext.startActivity(localIntent);
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    if (this.c == paramh)
    {
      paramh = ((com.android.dazhihui.a.b.o)paramj).h();
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
                String str2 = paramh.optString("nickname", "");
                String str3 = paramh.optString("avatar_url", "");
                i = paramh.optInt("is_new", 1);
                ti.a = paramh.optInt("coins", 0);
                if (i == 1)
                {
                  w.a().b = 2;
                  ti.b = str2;
                  ti.c = str3;
                  w.a().a(paramj, str1);
                  return;
                }
                w.a().a(paramj, str1);
                return;
              }
            }
            catch (JSONException paramh)
            {
              paramh.printStackTrace();
              a("其他错误!");
              return;
            }
            if (i == 1)
            {
              a("请求第三方服务失败!");
              return;
            }
            if (i == 2)
            {
              a("请求账户中心失败!");
              return;
            }
            a("其他错误!");
            return;
          }
          a("QQ登录异常!");
        }
      }
    }
  }
  
  public void handleTimeout(h paramh)
  {
    if (this.c == paramh) {
      a("QQ登录超时!");
    }
  }
  
  public void netException(h paramh, Exception paramException)
  {
    if (this.c == paramh) {
      a("QQ登录异常!");
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\gx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */