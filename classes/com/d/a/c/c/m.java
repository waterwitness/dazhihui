package com.d.a.c.c;

import com.d.a.ai;
import com.d.a.al;
import com.d.a.as;
import com.d.a.bo;
import java.nio.ByteBuffer;
import java.util.zip.Inflater;

public class m
  extends as
{
  private Inflater d;
  ai f = new ai();
  
  static
  {
    if (!m.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      g = bool;
      return;
    }
  }
  
  public m()
  {
    this(new Inflater());
  }
  
  public m(Inflater paramInflater)
  {
    this.d = paramInflater;
  }
  
  public void a(al paramal, ai paramai)
  {
    for (;;)
    {
      ByteBuffer localByteBuffer;
      try
      {
        paramal = ai.c(paramai.d() * 2);
        if (paramai.o() <= 0)
        {
          paramal.flip();
          this.f.a(paramal);
          bo.a(this, this.f);
          return;
        }
        localByteBuffer = paramai.n();
        localal = paramal;
        if (!localByteBuffer.hasRemaining()) {
          break label212;
        }
        int i = localByteBuffer.remaining();
        this.d.setInput(localByteBuffer.array(), localByteBuffer.arrayOffset() + localByteBuffer.position(), localByteBuffer.remaining());
        localal = paramal;
        localal.position(this.d.inflate(localal.array(), localal.arrayOffset() + localal.position(), localal.remaining()) + localal.position());
        paramal = localal;
        if (localal.hasRemaining()) {
          break label186;
        }
        localal.flip();
        this.f.a(localal);
        if ((!g) && (i == 0)) {
          throw new AssertionError();
        }
      }
      catch (Exception paramal)
      {
        a(paramal);
        return;
      }
      paramal = ai.c(localal.capacity() * 2);
      label186:
      al localal = paramal;
      if (!this.d.needsInput())
      {
        localal = paramal;
        if (this.d.finished()) {
          localal = paramal;
        }
      }
      else
      {
        label212:
        ai.c(localByteBuffer);
        paramal = localal;
      }
    }
  }
  
  protected void a(Exception paramException)
  {
    this.d.end();
    Object localObject = paramException;
    if (paramException != null)
    {
      localObject = paramException;
      if (this.d.getRemaining() > 0) {
        localObject = new f("data still remaining in inflater", paramException);
      }
    }
    super.a((Exception)localObject);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\c\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */