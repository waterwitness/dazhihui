package tencent.tls.platform;

public abstract interface TLSGuestRegListener
{
  public abstract void OnGuestRegFail(TLSErrInfo paramTLSErrInfo);
  
  public abstract void OnGuestRegSuccess(TLSUserInfo paramTLSUserInfo);
  
  public abstract void OnGuestRegTimeout(TLSErrInfo paramTLSErrInfo);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\platform\TLSGuestRegListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */