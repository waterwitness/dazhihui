package com.android.dazhihui.wxapi;

import android.content.Intent;
import android.os.Bundle;
import com.android.dazhihui.d.h;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.tencent.mm.sdk.modelbase.BaseReq;
import com.tencent.mm.sdk.modelbase.BaseResp;
import com.tencent.mm.sdk.openapi.IWXAPI;
import com.tencent.mm.sdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.sdk.openapi.WXAPIFactory;

public class WXPayEntryActivity
  extends BaseActivity
  implements IWXAPIEventHandler
{
  public static h a;
  private IWXAPI b;
  
  public static void a(h paramh)
  {
    a = paramh;
  }
  
  protected void init(Bundle paramBundle) {}
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.b = WXAPIFactory.createWXAPI(this, WXEntryActivity.a);
    this.b.handleIntent(getIntent(), this);
  }
  
  protected void onDestroy()
  {
    if (a != null) {
      a = null;
    }
    super.onDestroy();
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
    this.b.handleIntent(paramIntent, this);
  }
  
  public void onReq(BaseReq paramBaseReq) {}
  
  public void onResp(BaseResp paramBaseResp)
  {
    if (paramBaseResp.getType() == 5) {
      switch (paramBaseResp.errCode)
      {
      }
    }
    for (;;)
    {
      finish();
      return;
      showShortToast("支付成功");
      if (a != null)
      {
        try
        {
          a.a();
        }
        catch (Exception paramBaseResp)
        {
          paramBaseResp.printStackTrace();
        }
        continue;
        showShortToast("支付失败，请检查您的微信是否正常。");
        if (a != null)
        {
          try
          {
            a.b();
          }
          catch (Exception paramBaseResp)
          {
            paramBaseResp.printStackTrace();
          }
          continue;
          showShortToast("用户中途取消支付操作");
          if (a != null) {
            try
            {
              a.b();
            }
            catch (Exception paramBaseResp)
            {
              paramBaseResp.printStackTrace();
            }
          }
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\wxapi\WXPayEntryActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */