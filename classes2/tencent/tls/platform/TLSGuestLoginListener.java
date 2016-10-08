package tencent.tls.platform;

public abstract interface TLSGuestLoginListener
{
  public abstract void OnGuestLoginFail(TLSErrInfo paramTLSErrInfo);
  
  public abstract void OnGuestLoginSuccess(TLSUserInfo paramTLSUserInfo);
  
  public abstract void OnGuestLoginTimeout(TLSErrInfo paramTLSErrInfo);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\platform\TLSGuestLoginListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */