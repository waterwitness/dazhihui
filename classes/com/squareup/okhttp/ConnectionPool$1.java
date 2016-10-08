package com.squareup.okhttp;

import com.squareup.okhttp.internal.Util;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.Callable;

class ConnectionPool$1
  implements Callable<Void>
{
  ConnectionPool$1(ConnectionPool paramConnectionPool) {}
  
  public Void call()
  {
    ArrayList localArrayList = new ArrayList(2);
    int i = 0;
    for (;;)
    {
      synchronized (this.this$0)
      {
        ListIterator localListIterator = ConnectionPool.access$0(this.this$0).listIterator(ConnectionPool.access$0(this.this$0).size());
        if (!localListIterator.hasPrevious())
        {
          localListIterator = ConnectionPool.access$0(this.this$0).listIterator(ConnectionPool.access$0(this.this$0).size());
          if ((!localListIterator.hasPrevious()) || (i <= ConnectionPool.access$2(this.this$0)))
          {
            ??? = localArrayList.iterator();
            if (((Iterator)???).hasNext()) {
              break label238;
            }
            return null;
          }
        }
        else
        {
          localConnection = (Connection)localListIterator.previous();
          if ((!localConnection.isAlive()) || (localConnection.isExpired(ConnectionPool.access$1(this.this$0))))
          {
            localListIterator.remove();
            localArrayList.add(localConnection);
            if (localArrayList.size() != 2) {
              continue;
            }
            continue;
          }
          if (!localConnection.isIdle()) {
            continue;
          }
          i += 1;
          continue;
        }
        Connection localConnection = (Connection)localListIterator.previous();
        if (!localConnection.isIdle()) {
          continue;
        }
        localArrayList.add(localConnection);
        localListIterator.remove();
        i -= 1;
      }
      label238:
      Util.closeQuietly((Connection)((Iterator)???).next());
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\ConnectionPool$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */