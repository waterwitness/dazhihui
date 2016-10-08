package tencent.tls.request;

import java.net.InetSocketAddress;

public class DNS_resolver
  implements Runnable
{
  private String domain;
  private InetSocketAddress inetSkAddr;
  private int port;
  
  public DNS_resolver(String paramString, int paramInt)
  {
    this.domain = paramString;
    this.port = paramInt;
  }
  
  public static InetSocketAddress get_DNS_resolver(String paramString, int paramInt, long paramLong)
  {
    try
    {
      paramString = new DNS_resolver(paramString, paramInt);
      Thread localThread = new Thread(paramString);
      localThread.start();
      localThread.join(paramLong);
      paramString = paramString.get();
      return paramString;
    }
    catch (Exception paramString) {}
    return null;
  }
  
  public InetSocketAddress get()
  {
    try
    {
      InetSocketAddress localInetSocketAddress = this.inetSkAddr;
      return localInetSocketAddress;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void run()
  {
    try
    {
      set(new InetSocketAddress(this.domain, this.port));
      return;
    }
    catch (Exception localException) {}
  }
  
  public void set(InetSocketAddress paramInetSocketAddress)
  {
    try
    {
      this.inetSkAddr = paramInetSocketAddress;
      return;
    }
    finally
    {
      paramInetSocketAddress = finally;
      throw paramInetSocketAddress;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\request\DNS_resolver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */