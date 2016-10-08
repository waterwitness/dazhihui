package tencent.tls.platform;

public abstract interface TLSOpenAccessTokenListener
{
  public abstract void OnOpenAccessTokenFail(TLSErrInfo paramTLSErrInfo);
  
  public abstract void OnOpenAccessTokenSuccess(TLSAccessTokenInfo paramTLSAccessTokenInfo);
  
  public abstract void OnOpenAccessTokenTimeout(TLSErrInfo paramTLSErrInfo);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\platform\TLSOpenAccessTokenListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */