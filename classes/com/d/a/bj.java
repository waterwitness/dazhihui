package com.d.a;

import com.d.a.a.e;
import java.nio.ByteBuffer;

class bj
  extends bk
{
  byte a;
  e b;
  
  public bj(byte paramByte, e parame)
  {
    super(1);
    this.a = paramByte;
    this.b = parame;
  }
  
  public bk a(al paramal, ai paramai)
  {
    ai localai = new ai();
    int i = 1;
    for (;;)
    {
      if (paramai.o() <= 0)
      {
        this.b.a(paramal, localai);
        paramal = this;
        if (i != 0) {
          paramal = null;
        }
        return paramal;
      }
      ByteBuffer localByteBuffer = paramai.n();
      localByteBuffer.mark();
      int j = 0;
      label55:
      if (localByteBuffer.remaining() > 0) {
        if (localByteBuffer.get() != this.a) {
          break label124;
        }
      }
      label124:
      for (i = 1;; i = 0)
      {
        if (i != 0)
        {
          localByteBuffer.reset();
          if (i == 0) {
            break label130;
          }
          paramai.b(localByteBuffer);
          paramai.a(localai, j);
          paramai.i();
          break;
        }
        j += 1;
        break label55;
      }
      label130:
      localai.a(localByteBuffer);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\bj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */