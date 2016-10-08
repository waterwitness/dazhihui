package com.tencent.qalsdk.sdk;

import com.tencent.qalsdk.util.QLog;
import java.io.File;
import java.io.PrintStream;

class u
  extends Thread
{
  u(q paramq) {}
  
  public void run()
  {
    for (;;)
    {
      int i;
      try
      {
        long l = System.currentTimeMillis();
        str = this.a.a(this.a.a(l - 604800000L));
        QLog.d("MSF.D.QLogImpl", "delete log file before:" + str);
        localObject1 = new File(q.f(this.a));
        if (!((File)localObject1).isDirectory()) {
          break label145;
        }
        localObject1 = ((File)localObject1).listFiles();
        if (localObject1 != null) {
          break label146;
        }
        return;
      }
      catch (Exception localException)
      {
        String str;
        Object localObject1;
        Object localObject2;
        System.out.println("delete log file error." + localException);
      }
      if (i < localObject1.length)
      {
        localObject2 = localObject1[i];
        if (((File)localObject2).getName().compareTo(str) < 0) {
          ((File)localObject2).delete();
        }
        i += 1;
      }
      else
      {
        label145:
        return;
        label146:
        i = 0;
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\sdk\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */