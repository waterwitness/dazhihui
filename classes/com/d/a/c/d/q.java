package com.d.a.c.d;

import com.d.a.ai;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

final class q
{
  ai a(List<k> paramList)
  {
    ai localai = new ai();
    ByteBuffer localByteBuffer = ai.c(8192);
    int j = paramList.size();
    int i = 0;
    if (i >= j)
    {
      localai.a(localByteBuffer);
      return localai;
    }
    if (localByteBuffer.remaining() < localByteBuffer.capacity() / 2)
    {
      localByteBuffer.flip();
      localai.a(localByteBuffer);
      localByteBuffer = ai.c(localByteBuffer.capacity() * 2);
    }
    for (;;)
    {
      f localf = ((k)paramList.get(i)).h.c();
      Integer localInteger = (Integer)o.b().get(localf);
      if (localInteger != null)
      {
        a(localByteBuffer, localInteger.intValue() + 1, 15, 0);
        a(localByteBuffer, ((k)paramList.get(i)).i);
      }
      for (;;)
      {
        i += 1;
        break;
        localByteBuffer.put((byte)0);
        a(localByteBuffer, localf);
        a(localByteBuffer, ((k)paramList.get(i)).i);
      }
    }
  }
  
  void a(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 < paramInt2)
    {
      paramByteBuffer.put((byte)(paramInt3 | paramInt1));
      return;
    }
    paramByteBuffer.put((byte)(paramInt3 | paramInt2));
    paramInt1 -= paramInt2;
    for (;;)
    {
      if (paramInt1 < 128)
      {
        paramByteBuffer.put((byte)paramInt1);
        return;
      }
      paramByteBuffer.put((byte)(paramInt1 & 0x7F | 0x80));
      paramInt1 >>>= 7;
    }
  }
  
  void a(ByteBuffer paramByteBuffer, f paramf)
  {
    a(paramByteBuffer, paramf.d(), 127, 0);
    paramByteBuffer.put(paramf.e());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\d\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */