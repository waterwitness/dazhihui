package com.tencent.imsdk;

import java.util.concurrent.atomic.AtomicBoolean;

final class ᵔ
  implements Runnable
{
  public final void run()
  {
    if ((QLogImpl.access$000() == null) || (!QLogImpl.isLogToFile) || (QLogImpl.access$100().get())) {
      return;
    }
    new ᵢ(this, "QLogInitThread").start();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imsdk\ᵔ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */