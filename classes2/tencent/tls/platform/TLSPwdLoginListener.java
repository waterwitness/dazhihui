package tencent.tls.platform;

public abstract interface TLSPwdLoginListener
{
  public abstract void OnPwdLoginFail(TLSErrInfo paramTLSErrInfo);
  
  public abstract void OnPwdLoginNeedImgcode(byte[] paramArrayOfByte, TLSErrInfo paramTLSErrInfo);
  
  public abstract void OnPwdLoginReaskImgcodeSuccess(byte[] paramArrayOfByte);
  
  public abstract void OnPwdLoginSuccess(TLSUserInfo paramTLSUserInfo);
  
  public abstract void OnPwdLoginTimeout(TLSErrInfo paramTLSErrInfo);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\platform\TLSPwdLoginListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */