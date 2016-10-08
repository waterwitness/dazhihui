package org.a.a;

import java.io.InputStream;

class am
  extends InputStream
{
  private final v a;
  private boolean b = true;
  private InputStream c;
  
  am(v paramv)
  {
    this.a = paramv;
  }
  
  public int read()
  {
    int i;
    o localo;
    if (this.c == null)
    {
      if (!this.b)
      {
        i = -1;
        return i;
      }
      localo = (o)this.a.a();
      if (localo == null) {
        return -1;
      }
      this.b = false;
    }
    for (this.c = localo.e();; this.c = localo.e())
    {
      int j = this.c.read();
      i = j;
      if (j >= 0) {
        break;
      }
      localo = (o)this.a.a();
      if (localo == null)
      {
        this.c = null;
        return -1;
      }
    }
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int j = 0;
    int i = j;
    o localo;
    if (this.c == null)
    {
      if (!this.b) {}
      do
      {
        return -1;
        localo = (o)this.a.a();
      } while (localo == null);
      this.b = false;
      this.c = localo.e();
      i = j;
    }
    for (;;)
    {
      j = this.c.read(paramArrayOfByte, paramInt1 + i, paramInt2 - i);
      if (j >= 0)
      {
        j += i;
        i = j;
        if (j == paramInt2) {
          return j;
        }
      }
      else
      {
        localo = (o)this.a.a();
        if (localo == null)
        {
          this.c = null;
          paramInt1 = i;
          if (i < 1) {
            paramInt1 = -1;
          }
          return paramInt1;
        }
        this.c = localo.e();
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */