package com.tencent.qalsdk.util;

import com.tencent.qalsdk.QALCallBack;

class f
  implements QALCallBack
{
  f(e parame) {}
  
  public void onError(int paramInt, String paramString)
  {
    QLog.e("GuestHelper", 1, "bindID fail:" + paramInt + ":" + paramString);
  }
  
  public void onSuccess()
  {
    QLog.e("GuestHelper", 1, "bindID succ");
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\util\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */