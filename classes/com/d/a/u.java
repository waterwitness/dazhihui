package com.d.a;

import java.io.Closeable;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;

class u
  implements Runnable
{
  u(q paramq, ab paramab, com.d.a.a.c paramc, InetSocketAddress paramInetSocketAddress) {}
  
  public void run()
  {
    Object localObject2 = null;
    Object localObject3 = null;
    if (this.b.isCancelled()) {
      return;
    }
    this.b.b = this.c;
    try
    {
      localObject1 = this.b;
      localSocketChannel = SocketChannel.open();
      ((ab)localObject1).a = localSocketChannel;
      localObject1 = localObject3;
      try
      {
        localSocketChannel.configureBlocking(false);
        localObject1 = localObject3;
        localObject2 = localSocketChannel.register(q.a(this.a).a(), 8);
        localObject1 = localObject2;
        ((SelectionKey)localObject2).attach(this.b);
        localObject1 = localObject2;
        localSocketChannel.connect(this.d);
        return;
      }
      catch (Throwable localThrowable2)
      {
        localObject2 = localObject1;
        localObject1 = localThrowable2;
      }
    }
    catch (Throwable localThrowable1)
    {
      for (;;)
      {
        Object localObject1;
        SocketChannel localSocketChannel = null;
      }
    }
    if (localObject2 != null) {
      ((SelectionKey)localObject2).cancel();
    }
    com.d.a.d.c.a(new Closeable[] { localSocketChannel });
    this.b.a(new RuntimeException((Throwable)localObject1));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */