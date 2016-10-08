package com.d.a;

import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.channels.spi.AbstractSelectableChannel;

abstract class ak
  implements ReadableByteChannel, ScatteringByteChannel
{
  private AbstractSelectableChannel a;
  
  ak(AbstractSelectableChannel paramAbstractSelectableChannel)
  {
    paramAbstractSelectableChannel.configureBlocking(false);
    this.a = paramAbstractSelectableChannel;
  }
  
  public abstract int a(ByteBuffer[] paramArrayOfByteBuffer);
  
  public abstract void a();
  
  public abstract boolean b();
  
  public boolean c()
  {
    return false;
  }
  
  public void close()
  {
    this.a.close();
  }
  
  public boolean isOpen()
  {
    return this.a.isOpen();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */