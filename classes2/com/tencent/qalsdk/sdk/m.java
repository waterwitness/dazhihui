package com.tencent.qalsdk.sdk;

import com.tencent.qalsdk.QALCallBack;
import com.tencent.qalsdk.util.QLog;

class m
  implements QALCallBack
{
  m(e parame) {}
  
  public void onError(int paramInt, String paramString)
  {
    QLog.e("CoreWrapper", "register resp 1002,unregister error:" + paramInt + ":" + paramString);
  }
  
  public void onSuccess()
  {
    QLog.e("CoreWrapper", "register resp 1002,unregister succ");
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\sdk\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */