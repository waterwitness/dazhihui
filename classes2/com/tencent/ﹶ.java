package com.tencent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

final class ﹶ
  implements Runnable
{
  ﹶ(ⁱ paramⁱ, ArrayList paramArrayList) {}
  
  public final void run()
  {
    Iterator localIterator = TIMManager.getInstanceById(ⁱ.a(this.b)).getMessageUpdateListeners().iterator();
    TIMMessageUpdateListener localTIMMessageUpdateListener;
    do
    {
      if (!localIterator.hasNext()) {
        break;
      }
      localTIMMessageUpdateListener = (TIMMessageUpdateListener)localIterator.next();
    } while ((localTIMMessageUpdateListener == null) || (!localTIMMessageUpdateListener.onMessagesUpdate(this.a)));
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\ﹶ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */