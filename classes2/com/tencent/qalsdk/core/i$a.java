package com.tencent.qalsdk.core;

import com.tencent.qalsdk.util.QLog;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

class i$a
  implements Runnable
{
  private int b = 0;
  
  public i$a(i parami, int paramInt)
  {
    this.b = paramInt;
  }
  
  public void run()
  {
    ArrayList localArrayList = (ArrayList)this.a.a.c.f().remove(Integer.valueOf(this.b));
    if (localArrayList != null) {
      if (QLog.isColorLevel()) {
        QLog.d("MSF.C.NetConnTag", 2, "remove merged ssoseq list: " + localArrayList.toString() + " from SSO LoginMerge " + this.b);
      }
    }
    while (!QLog.isColorLevel()) {
      return;
    }
    QLog.d("MSF.C.NetConnTag", 2, "SSO LoginMerge's ssoseq " + this.b + "list has been removed by error code.");
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\core\i$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */