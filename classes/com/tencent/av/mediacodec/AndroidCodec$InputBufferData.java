package com.tencent.av.mediacodec;

import java.nio.ByteBuffer;

public class AndroidCodec$InputBufferData
{
  public ByteBuffer buffer;
  public int index;
  public boolean processing = false;
  
  public AndroidCodec$InputBufferData(ByteBuffer paramByteBuffer, int paramInt)
  {
    this.buffer = paramByteBuffer;
    this.index = paramInt;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\mediacodec\AndroidCodec$InputBufferData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */