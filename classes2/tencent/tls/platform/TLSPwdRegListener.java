package tencent.tls.platform;

public abstract interface TLSPwdRegListener
{
  public abstract void OnPwdRegAskCodeSuccess(int paramInt1, int paramInt2);
  
  public abstract void OnPwdRegCommitSuccess(TLSUserInfo paramTLSUserInfo);
  
  public abstract void OnPwdRegFail(TLSErrInfo paramTLSErrInfo);
  
  public abstract void OnPwdRegReaskCodeSuccess(int paramInt1, int paramInt2);
  
  public abstract void OnPwdRegTimeout(TLSErrInfo paramTLSErrInfo);
  
  public abstract void OnPwdRegVerifyCodeSuccess();
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\platform\TLSPwdRegListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */