package tencent.tls.platform;

import tencent.tls.account.TLSOpenAccountInfo;

public abstract interface TLSOpenAccountBindListener
{
  public abstract void onBindFailure(TLSOpenAccountInfo paramTLSOpenAccountInfo);
  
  public abstract void onBindSuccess(TLSOpenAccountInfo paramTLSOpenAccountInfo);
  
  public abstract void onFailure(TLSErrInfo paramTLSErrInfo);
  
  public abstract void onTimeOut(TLSErrInfo paramTLSErrInfo);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\platform\TLSOpenAccountBindListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */