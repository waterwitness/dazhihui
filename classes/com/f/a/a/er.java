package com.f.a.a;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.unionpay.upomp.lthj.plugin.ui.UIResponseListener;

public class er
{
  Handler a = new ab(this);
  private final int b = 1;
  private final int c = 0;
  private final int d = 2;
  private final String e = "http://auth.uupay.net/busplat/order/checkPan.action";
  private final String f = "http://auth.uupay.net/busplat/order/checkPan.action";
  private final int g = 120000;
  private String h;
  private boolean i;
  private Context j;
  private String k;
  private UIResponseListener l;
  private bv m;
  
  private void a(String paramString)
  {
    Message localMessage = Message.obtain();
    localMessage.obj = paramString;
    localMessage.what = 2;
    this.a.sendMessage(localMessage);
  }
  
  public void a(Context paramContext, String paramString1, String paramString2, boolean paramBoolean, UIResponseListener paramUIResponseListener)
  {
    this.j = paramContext;
    this.k = paramString1;
    this.l = paramUIResponseListener;
    this.m = new bv(this);
    ef.a().a(paramContext, true, new bc(this));
    new Thread(this.m).start();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\er.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */