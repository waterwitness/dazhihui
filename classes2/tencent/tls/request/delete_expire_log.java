package tencent.tls.request;

import android.content.Context;
import tencent.tls.tools.util;

public class delete_expire_log
  extends Thread
{
  private Context _context;
  
  public delete_expire_log(Context paramContext)
  {
    this._context = paramContext;
    setName("WtCleanThread");
  }
  
  public void run()
  {
    util.deleteExpireLog(this._context);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\request\delete_expire_log.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */