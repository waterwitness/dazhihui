package tencent.tls.platform;

public abstract interface TLSExchangeTicketListener
{
  public abstract void OnExchangeTicketFail(TLSErrInfo paramTLSErrInfo);
  
  public abstract void OnExchangeTicketSuccess(TLSUserInfo paramTLSUserInfo);
  
  public abstract void OnExchangeTicketTimeout(TLSErrInfo paramTLSErrInfo);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\platform\TLSExchangeTicketListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */