package tencent.tls.platform;

import android.content.Context;

public class TLSAccountHelper
{
  private static TLSAccountHelper __helper = null;
  private static TLSHelper __tlsHelper = null;
  
  private TLSAccountHelper()
  {
    __tlsHelper = TLSHelper.getInstance();
  }
  
  public static TLSAccountHelper getInstance()
  {
    try
    {
      if (__helper == null) {
        __helper = new TLSAccountHelper();
      }
      return __helper;
    }
    finally {}
  }
  
  public int TLSPwdRegAskCode(String paramString, TLSPwdRegListener paramTLSPwdRegListener)
  {
    return __tlsHelper.TLSPwdRegAskCode(paramString, paramTLSPwdRegListener);
  }
  
  public int TLSPwdRegCommit(String paramString, TLSPwdRegListener paramTLSPwdRegListener)
  {
    return __tlsHelper.TLSPwdRegCommit(paramString, paramTLSPwdRegListener);
  }
  
  public int TLSPwdRegReaskCode(TLSPwdRegListener paramTLSPwdRegListener)
  {
    return __tlsHelper.TLSPwdRegReaskCode(paramTLSPwdRegListener);
  }
  
  public int TLSPwdRegVerifyCode(String paramString, TLSPwdRegListener paramTLSPwdRegListener)
  {
    return __tlsHelper.TLSPwdRegVerifyCode(paramString, paramTLSPwdRegListener);
  }
  
  public int TLSPwdResetAskCode(String paramString, TLSPwdResetListener paramTLSPwdResetListener)
  {
    return __tlsHelper.TLSPwdResetAskCode(paramString, paramTLSPwdResetListener);
  }
  
  public int TLSPwdResetCommit(String paramString, TLSPwdResetListener paramTLSPwdResetListener)
  {
    return __tlsHelper.TLSPwdResetCommit(paramString, paramTLSPwdResetListener);
  }
  
  public int TLSPwdResetReaskCode(TLSPwdResetListener paramTLSPwdResetListener)
  {
    return __tlsHelper.TLSPwdResetReaskCode(paramTLSPwdResetListener);
  }
  
  public int TLSPwdResetVerifyCode(String paramString, TLSPwdResetListener paramTLSPwdResetListener)
  {
    return __tlsHelper.TLSPwdResetVerifyCode(paramString, paramTLSPwdResetListener);
  }
  
  public int TLSSmsRegAskCode(String paramString, TLSSmsRegListener paramTLSSmsRegListener)
  {
    return __tlsHelper.TLSSmsRegAskCode(paramString, paramTLSSmsRegListener);
  }
  
  public int TLSSmsRegCommit(TLSSmsRegListener paramTLSSmsRegListener)
  {
    return __tlsHelper.TLSSmsRegCommit(paramTLSSmsRegListener);
  }
  
  public int TLSSmsRegReaskCode(TLSSmsRegListener paramTLSSmsRegListener)
  {
    return __tlsHelper.TLSSmsRegReaskCode(paramTLSSmsRegListener);
  }
  
  public int TLSSmsRegVerifyCode(String paramString, TLSSmsRegListener paramTLSSmsRegListener)
  {
    return __tlsHelper.TLSSmsRegVerifyCode(paramString, paramTLSSmsRegListener);
  }
  
  public int TLSStrAccReg(String paramString1, String paramString2, TLSStrAccRegListener paramTLSStrAccRegListener)
  {
    return __tlsHelper.TLSStrAccReg(paramString1, paramString2, paramTLSStrAccRegListener);
  }
  
  public String getSDKVersion()
  {
    return __tlsHelper.getSDKVersion();
  }
  
  public TLSAccountHelper init(Context paramContext, long paramLong, int paramInt, String paramString)
  {
    __tlsHelper.init(paramContext, paramLong);
    return this;
  }
  
  public void setCountry(int paramInt)
  {
    __tlsHelper.setCountry(paramInt);
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


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\platform\TLSAccountHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */