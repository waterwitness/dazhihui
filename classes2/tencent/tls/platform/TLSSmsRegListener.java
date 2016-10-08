package tencent.tls.platform;

public abstract interface TLSSmsRegListener
{
  public abstract void OnSmsRegAskCodeSuccess(int paramInt1, int paramInt2);
  
  public abstract void OnSmsRegCommitSuccess(TLSUserInfo paramTLSUserInfo);
  
  public abstract void OnSmsRegFail(TLSErrInfo paramTLSErrInfo);
  
  public abstract void OnSmsRegReaskCodeSuccess(int paramInt1, int paramInt2);
  
  public abstract void OnSmsRegTimeout(TLSErrInfo paramTLSErrInfo);
  
  public abstract void OnSmsRegVerifyCodeSuccess();
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\platform\TLSSmsRegListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */