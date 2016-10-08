package com.tencent.qalsdk.sdk;

import com.tencent.qalsdk.QALValueCallBack;
import com.tencent.qalsdk.base.remote.FromServiceMsg;

class j
  implements Runnable
{
  j(i parami, FromServiceMsg paramFromServiceMsg) {}
  
  public void run()
  {
    if (this.b.b.a(this.a, this.b.a)) {
      return;
    }
    byte[] arrayOfByte = e.a(this.a);
    this.b.a.onSuccess(arrayOfByte);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\sdk\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */