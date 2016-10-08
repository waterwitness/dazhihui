package tencent.tls.platform;

import tencent.tls.account.TLSOpenAccountInfo;

public abstract interface TLSOpenAccountQueryListener
{
  public abstract void onFailure(TLSErrInfo paramTLSErrInfo);
  
  public abstract void onLoginedAndBinded(TLSOpenAccountInfo paramTLSOpenAccountInfo);
  
  public abstract void onLoginedButUnbinded(TLSOpenAccountInfo paramTLSOpenAccountInfo);
  
  public abstract void onTimeOut(TLSErrInfo paramTLSErrInfo);
  
  public abstract void onUnlogined(TLSOpenAccountInfo paramTLSOpenAccountInfo);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\platform\TLSOpenAccountQueryListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */