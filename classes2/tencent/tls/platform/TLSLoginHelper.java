package tencent.tls.platform;

import android.content.Context;
import java.util.List;
import java.util.Map;

public class TLSLoginHelper
{
  private static TLSLoginHelper __helper = null;
  private static TLSHelper __tlsHelper = null;
  
  private TLSLoginHelper()
  {
    __tlsHelper = TLSHelper.getInstance();
  }
  
  public static TLSLoginHelper getInstance()
  {
    try
    {
      if (__helper == null) {
        __helper = new TLSLoginHelper();
      }
      return __helper;
    }
    finally {}
  }
  
  public static void setLogcat(boolean paramBoolean)
  {
    TLSHelper localTLSHelper = __tlsHelper;
    TLSHelper.setLogcat(paramBoolean);
  }
  
  public int TLSExchangeTicket(long paramLong, String paramString1, String paramString2, TLSExchangeTicketListener paramTLSExchangeTicketListener)
  {
    return __tlsHelper.TLSExchangeTicket(paramLong, paramString1, paramString2, paramTLSExchangeTicketListener);
  }
  
  public long TLSGetLastRefreshTime(String paramString)
  {
    return __tlsHelper.TLSGetLastRefreshTime(paramString);
  }
  
  public int TLSGuestLogin(TLSGuestLoginListener paramTLSGuestLoginListener)
  {
    return __tlsHelper.TLSGuestLogin(paramTLSGuestLoginListener);
  }
  
  public int TLSPwdLogin(String paramString, byte[] paramArrayOfByte, TLSPwdLoginListener paramTLSPwdLoginListener)
  {
    return __tlsHelper.TLSPwdLogin(paramString, paramArrayOfByte, paramTLSPwdLoginListener);
  }
  
  public int TLSPwdLoginReaskImgcode(TLSPwdLoginListener paramTLSPwdLoginListener)
  {
    return __tlsHelper.TLSPwdLoginReaskImgcode(paramTLSPwdLoginListener);
  }
  
  public int TLSPwdLoginVerifyImgcode(String paramString, TLSPwdLoginListener paramTLSPwdLoginListener)
  {
    return __tlsHelper.TLSPwdLoginVerifyImgcode(paramString, paramTLSPwdLoginListener);
  }
  
  public int TLSRefreshUserSig(String paramString, TLSRefreshUserSigListener paramTLSRefreshUserSigListener)
  {
    return __tlsHelper.TLSRefreshUserSig(paramString, paramTLSRefreshUserSigListener);
  }
  
  public int TLSSmsLogin(String paramString, TLSSmsLoginListener paramTLSSmsLoginListener)
  {
    return __tlsHelper.TLSSmsLogin(paramString, paramTLSSmsLoginListener);
  }
  
  public int TLSSmsLoginAskCode(String paramString, TLSSmsLoginListener paramTLSSmsLoginListener)
  {
    return __tlsHelper.TLSSmsLoginAskCode(paramString, paramTLSSmsLoginListener);
  }
  
  public int TLSSmsLoginReaskCode(String paramString, TLSSmsLoginListener paramTLSSmsLoginListener)
  {
    return __tlsHelper.TLSSmsLoginReaskCode(paramString, paramTLSSmsLoginListener);
  }
  
  public int TLSSmsLoginVerifyCode(String paramString, TLSSmsLoginListener paramTLSSmsLoginListener)
  {
    return __tlsHelper.TLSSmsLoginVerifyCode(paramString, paramTLSSmsLoginListener);
  }
  
  public void clearUserInfo(String paramString)
  {
    __tlsHelper.clearUserInfo(paramString);
  }
  
  public List<TLSUserInfo> getAllUserInfo()
  {
    return __tlsHelper.getAllUserInfo();
  }
  
  public byte[] getGUID()
  {
    return __tlsHelper.getGUID();
  }
  
  public String getGuestIdentifier()
  {
    return __tlsHelper.getGuestIdentifier();
  }
  
  public TLSUserInfo getLastUserInfo()
  {
    return __tlsHelper.getLastUserInfo();
  }
  
  public String getSDKVersion()
  {
    return __tlsHelper.getSDKVersion();
  }
  
  public Map<String, Object> getSSOTicket(String paramString)
  {
    return __tlsHelper.getSSOTicket(paramString);
  }
  
  public String getUserSig(String paramString)
  {
    return __tlsHelper.getUserSig(paramString);
  }
  
  public TLSLoginHelper init(Context paramContext, long paramLong, int paramInt, String paramString)
  {
    __tlsHelper.init(paramContext, paramLong);
    return this;
  }
  
  public boolean needLogin(String paramString)
  {
    return __tlsHelper.needLogin(paramString);
  }
  
  public boolean needSmsVerify(String paramString)
  {
    return __tlsHelper.needSmsVerify(paramString);
  }
  
  public void setLocalId(int paramInt)
  {
    __tlsHelper.setLocalId(paramInt);
  }
  
  public void setTestHost(String paramString, boolean paramBoolean)
  {
    __tlsHelper.setTestHost(paramString, paramBoolean);
  }
  
  public void setTimeOut(int paramInt)
  {
    __tlsHelper.setTimeOut(paramInt);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\platform\TLSLoginHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */