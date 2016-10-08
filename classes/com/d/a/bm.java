package com.d.a;

import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

class bm
  extends ak
{
  SocketChannel a;
  
  bm(SocketChannel paramSocketChannel)
  {
    super(paramSocketChannel);
    this.a = paramSocketChannel;
  }
  
  public int a(ByteBuffer[] paramArrayOfByteBuffer)
  {
    return (int)this.a.write(paramArrayOfByteBuffer);
  }
  
  public void a()
  {
    try
    {
      this.a.socket().shutdownOutput();
      return;
    }
    catch (Exception localException) {}
  }
  
  public boolean b()
  {
    return this.a.isConnected();
  }
  
  public int read(ByteBuffer paramByteBuffer)
  {
    return this.a.read(paramByteBuffer);
  }
  
  public long read(ByteBuffer[] paramArrayOfByteBuffer)
  {
    return this.a.read(paramArrayOfByteBuffer);
  }
  
  public long read(ByteBuffer[] paramArrayOfByteBuffer, int paramInt1, int paramInt2)
  {
    return this.a.read(paramArrayOfByteBuffer, paramInt1, paramInt2);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\bm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */