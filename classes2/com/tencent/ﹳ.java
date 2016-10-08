package com.tencent;

import com.tencent.imsdk.QLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

final class ﹳ
  implements Runnable
{
  ﹳ(ⁱ paramⁱ, ArrayList paramArrayList) {}
  
  public final void run()
  {
    Object localObject1 = TIMManager.getInstanceById(ⁱ.a(this.b)).getMessageListeners();
    QLog.d("MsgNotify", 1, "listeners size: " + ((Set)localObject1).size() + "|msg size: " + this.a.size());
    Iterator localIterator = ((Set)localObject1).iterator();
    Object localObject2;
    do
    {
      if (!localIterator.hasNext()) {
        break;
      }
      localObject2 = (TIMMessageListener)localIterator.next();
    } while ((localObject2 == null) || (!((TIMMessageListener)localObject2).onNewMessages(this.a)));
    if (((Set)localObject1).size() == 0)
    {
      localObject1 = TIMManager.getInstanceById(ⁱ.a(this.b)).getOfflinePushListener();
      if (localObject1 != null)
      {
        localIterator = this.a.iterator();
        while (localIterator.hasNext())
        {
          localObject2 = new TIMOfflinePushNotification((TIMMessage)localIterator.next());
          if (((TIMOfflinePushNotification)localObject2).isValid()) {
            ((TIMOfflinePushListener)localObject1).handleNotification((TIMOfflinePushNotification)localObject2);
          }
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\ﹳ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */