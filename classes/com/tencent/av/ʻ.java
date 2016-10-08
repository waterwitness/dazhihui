package com.tencent.av;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class ʻ
  implements Runnable
{
  ʻ(PingUtil paramPingUtil, Selector paramSelector, List paramList) {}
  
  public final void run()
  {
    try
    {
      for (;;)
      {
        if (!this.a.isOpen()) {
          return;
        }
        if (this.a.select() != 0)
        {
          Iterator localIterator = this.a.selectedKeys().iterator();
          while (localIterator.hasNext()) {
            if (((SelectionKey)localIterator.next()).isReadable())
            {
              Object localObject = ByteBuffer.allocate(600);
              this.c.channel.read((ByteBuffer)localObject);
              ((ByteBuffer)localObject).flip();
              ((ByteBuffer)localObject).get();
              ((ByteBuffer)localObject).getShort();
              int i = ((ByteBuffer)localObject).getInt();
              localObject = (Calendar)this.c.timeRecord.get(Integer.valueOf(i));
              if (localObject != null)
              {
                long l1 = Calendar.getInstance().getTimeInMillis();
                long l2 = ((Calendar)localObject).getTimeInMillis();
                this.b.add(Long.valueOf(l1 - l2));
              }
              localIterator.remove();
            }
          }
        }
      }
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\ʻ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */