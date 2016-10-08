package com.d.a.c.d;

import com.d.a.ai;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

class l
{
  Inflater a = new m(this);
  
  private static f a(ai paramai)
  {
    return f.a(paramai.a(paramai.f()));
  }
  
  public List<k> a(ai paramai, int paramInt)
  {
    Object localObject = new byte[paramInt];
    paramai.a((byte[])localObject);
    this.a.setInput((byte[])localObject);
    paramai = new ai().a(ByteOrder.BIG_ENDIAN);
    int i;
    if (this.a.needsInput())
    {
      i = paramai.f();
      localObject = new ArrayList(i);
      paramInt = 0;
    }
    for (;;)
    {
      if (paramInt >= i)
      {
        return (List<k>)localObject;
        localObject = ai.c(8192);
        try
        {
          ((ByteBuffer)localObject).limit(this.a.inflate(((ByteBuffer)localObject).array()));
          paramai.a((ByteBuffer)localObject);
        }
        catch (DataFormatException paramai)
        {
          throw new IOException(paramai);
        }
      }
      f localf1 = a(paramai).c();
      f localf2 = a(paramai);
      if (localf1.d() == 0) {
        throw new IOException("name.size == 0");
      }
      ((List)localObject).add(new k(localf1, localf2));
      paramInt += 1;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\d\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */