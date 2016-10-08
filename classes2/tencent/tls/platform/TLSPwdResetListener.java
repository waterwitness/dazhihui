package tencent.tls.platform;

public abstract interface TLSPwdResetListener
{
  public abstract void OnPwdResetAskCodeSuccess(int paramInt1, int paramInt2);
  
  public abstract void OnPwdResetCommitSuccess(TLSUserInfo paramTLSUserInfo);
  
  public abstract void OnPwdResetFail(TLSErrInfo paramTLSErrInfo);
  
  public abstract void OnPwdResetReaskCodeSuccess(int paramInt1, int paramInt2);
  
  public abstract void OnPwdResetTimeout(TLSErrInfo paramTLSErrInfo);
  
  public abstract void OnPwdResetVerifyCodeSuccess();
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\platform\TLSPwdResetListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */