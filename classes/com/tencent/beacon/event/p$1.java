package com.tencent.beacon.event;

import com.tencent.beacon.b.a;
import com.tencent.beacon.e.b;
import java.util.HashMap;
import java.util.Map;

final class p$1
  implements Runnable
{
  p$1(p paramp, String[] paramArrayOfString) {}
  
  public final void run()
  {
    if (this.a != null)
    {
      b.b(" start to ip test:", new Object[0]);
      String[] arrayOfString = this.a;
      int j = arrayOfString.length;
      int i = 0;
      if (i < j)
      {
        String str = arrayOfString[i];
        b.b(" ip:" + str, new Object[0]);
        for (long l1 = -1L;; l1 = l2)
        {
          try
          {
            localObject = str.split(":");
            if ((localObject != null) && (localObject.length == 2)) {
              break label183;
            }
            b.c(" ip wrong format ,not ip:port " + str, new Object[0]);
          }
          catch (Throwable localThrowable)
          {
            for (;;)
            {
              Object localObject;
              label183:
              long l2;
              localThrowable.printStackTrace();
              continue;
              boolean bool = false;
            }
          }
          b.b(" elapse:" + l1, new Object[0]);
          localObject = new HashMap(1);
          ((Map)localObject).put("A29", str);
          if (l1 <= 0L) {
            break label212;
          }
          bool = true;
          p.a("rqd_ipSpeed", bool, l1, 0L, (Map)localObject, true);
          i += 1;
          break;
          l2 = a.a(localObject[0], Integer.parseInt(localObject[1]));
        }
      }
    }
    label212:
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\event\p$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */