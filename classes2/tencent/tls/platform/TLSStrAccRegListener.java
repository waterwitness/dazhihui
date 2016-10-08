package tencent.tls.platform;

public abstract interface TLSStrAccRegListener
{
  public abstract void OnStrAccRegFail(TLSErrInfo paramTLSErrInfo);
  
  public abstract void OnStrAccRegSuccess(TLSUserInfo paramTLSUserInfo);
  
  public abstract void OnStrAccRegTimeout(TLSErrInfo paramTLSErrInfo);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\platform\TLSStrAccRegListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */