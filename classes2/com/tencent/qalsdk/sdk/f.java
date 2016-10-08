package com.tencent.qalsdk.sdk;

import android.os.RemoteException;
import com.tencent.qalsdk.base.remote.FromServiceMsg;
import com.tencent.qalsdk.base.remote.IBaseActionListener;
import com.tencent.qalsdk.base.remote.ToServiceMsg;

class f
  implements Runnable
{
  f(e parame, ToServiceMsg paramToServiceMsg, FromServiceMsg paramFromServiceMsg) {}
  
  public void run()
  {
    try
    {
      this.a.getActionListener().onResponse(this.a, this.b);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      localRemoteException.printStackTrace();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\sdk\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */