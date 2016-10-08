package com.d.a;

import java.nio.ByteBuffer;
import java.util.Comparator;

class aj
  implements Comparator<ByteBuffer>
{
  public int a(ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2)
  {
    if (paramByteBuffer1.capacity() == paramByteBuffer2.capacity()) {
      return 0;
    }
    if (paramByteBuffer1.capacity() > paramByteBuffer2.capacity()) {
      return 1;
    }
    return -1;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */