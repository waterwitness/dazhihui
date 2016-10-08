package tencent.tls.platform;

public abstract interface TLSSmsLoginListener
{
  public abstract void OnSmsLoginAskCodeSuccess(int paramInt1, int paramInt2);
  
  public abstract void OnSmsLoginFail(TLSErrInfo paramTLSErrInfo);
  
  public abstract void OnSmsLoginReaskCodeSuccess(int paramInt1, int paramInt2);
  
  public abstract void OnSmsLoginSuccess(TLSUserInfo paramTLSUserInfo);
  
  public abstract void OnSmsLoginTimeout(TLSErrInfo paramTLSErrInfo);
  
  public abstract void OnSmsLoginVerifyCodeSuccess();
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\platform\TLSSmsLoginListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */