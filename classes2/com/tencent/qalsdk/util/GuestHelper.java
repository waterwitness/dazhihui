package com.tencent.qalsdk.util;

import tencent.tls.platform.TLSHelper;
import tencent.tls.platform.TLSLoginHelper;

public class GuestHelper
{
  private static GuestHelper instance = new GuestHelper();
  private static final String tag = "GuestHelper";
  
  public static GuestHelper getInstance()
  {
    return instance;
  }
  
  public void generateAndLoginGuest()
  {
    TLSHelper.getInstance().TLSSSOGuestLogin(new e(this));
  }
  
  public void init()
  {
    if (TLSLoginHelper.getInstance() == null)
    {
      QLog.e("GuestHelper", 4, "TLSLoginHelper.getInstance() null");
      return;
    }
    String str = TLSHelper.getInstance().getSSOGuestIdentifier();
    QLog.d("GuestHelper", 1, "HaveAnonymousID:" + str);
    if (str == null)
    {
      generateAndLoginGuest();
      return;
    }
    com.tencent.qalsdk.sdk.e.b().a(str);
    long l1 = TLSLoginHelper.getInstance().TLSGetLastRefreshTime(str);
    long l2 = System.currentTimeMillis() / 1000L;
    long l3 = (l2 - l1) / 3600L / 24L;
    QLog.d("GuestHelper", "ticket interverl:" + l1 + ":" + l2 + ":" + l3);
    if (l3 >= 28L)
    {
      QLog.i("GuestHelper", "refresh ticket >= BaseConstants.FORCE_REFRESH_INTERVAL:" + str + ":" + l3);
      tlsRefreshID(str, true);
      return;
    }
    if (l3 > 7L)
    {
      QLog.i("GuestHelper", "refresh ticket >BaseConstants.REFRESH_INTERVAL:" + str + ":" + l3);
      tlsRefreshID(str, false);
    }
    com.tencent.qalsdk.sdk.e.b().b(str, new b(this, str));
  }
  
  public void tlsRefreshID(String paramString, boolean paramBoolean)
  {
    TLSLoginHelper.getInstance().TLSRefreshUserSig(paramString, new c(this, paramString, paramBoolean));
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\util\GuestHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */