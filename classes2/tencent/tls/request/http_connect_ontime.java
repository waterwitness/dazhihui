package tencent.tls.request;

import java.net.HttpURLConnection;

public class http_connect_ontime
  implements Runnable
{
  private HttpURLConnection conn;
  private boolean ret = false;
  
  public http_connect_ontime(HttpURLConnection paramHttpURLConnection)
  {
    this.conn = paramHttpURLConnection;
  }
  
  public static boolean connect_ontime(HttpURLConnection paramHttpURLConnection, long paramLong)
  {
    try
    {
      paramHttpURLConnection = new http_connect_ontime(paramHttpURLConnection);
      Thread localThread = new Thread(paramHttpURLConnection);
      localThread.start();
      localThread.join(paramLong);
      boolean bool = paramHttpURLConnection.get();
      return bool;
    }
    catch (Throwable paramHttpURLConnection) {}
    return false;
  }
  
  public boolean get()
  {
    try
    {
      boolean bool = this.ret;
      return bool;
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
      this.conn.connect();
      this.ret = true;
      return;
    }
    catch (Exception localException) {}
  }
  
  public void set(boolean paramBoolean)
  {
    try
    {
      this.ret = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\request\http_connect_ontime.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */