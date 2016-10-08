package tencent.tls.platform;

public abstract interface TLSRefreshUserSigListener
{
  public abstract void OnRefreshUserSigFail(TLSErrInfo paramTLSErrInfo);
  
  public abstract void OnRefreshUserSigSuccess(TLSUserInfo paramTLSUserInfo);
  
  public abstract void OnRefreshUserSigTimeout(TLSErrInfo paramTLSErrInfo);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\platform\TLSRefreshUserSigListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */