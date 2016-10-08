package com.tencent.qalsdk.util;

import com.tencent.qalsdk.QALCallBack;

class d
  implements QALCallBack
{
  d(c paramc) {}
  
  public void onError(int paramInt, String paramString)
  {
    QLog.e("GuestHelper", 1, this.a.a + "tlsRefreshID bindID fail:" + paramInt + ":" + paramString);
  }
  
  public void onSuccess()
  {
    QLog.i("GuestHelper", 1, this.a.a + "tlsRefreshID bindID succ");
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\util\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */