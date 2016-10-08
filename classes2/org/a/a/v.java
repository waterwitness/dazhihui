package org.a.a;

import java.io.IOException;
import java.io.InputStream;

public class v
{
  private final InputStream a;
  private final int b;
  
  public v(InputStream paramInputStream)
  {
    this(paramInputStream, i.a(paramInputStream));
  }
  
  public v(InputStream paramInputStream, int paramInt)
  {
    this.a = paramInputStream;
    this.b = paramInt;
  }
  
  private void a(boolean paramBoolean)
  {
    if ((this.a instanceof bx)) {
      ((bx)this.a).a(paramBoolean);
    }
  }
  
  public ar a()
  {
    boolean bool = false;
    int i = this.a.read();
    if (i == -1) {
      return null;
    }
    a(false);
    int j = i.a(this.a, i);
    if ((i & 0x20) != 0) {
      bool = true;
    }
    int k = i.b(this.a, this.b);
    if (k < 0)
    {
      if (!bool) {
        throw new IOException("indefinite length primitive encoding encountered");
      }
      localObject = new v(new bx(this.a, this.b), this.b);
      if ((i & 0x40) != 0) {
        return new ab(j, (v)localObject);
      }
      if ((i & 0x80) != 0) {
        return new al(true, j, (v)localObject);
      }
      return ((v)localObject).a(j);
    }
    Object localObject = new bv(this.a, k);
    if ((i & 0x40) != 0) {
      return new an(bool, j, ((bv)localObject).b());
    }
    if ((i & 0x80) != 0) {
      return new al(bool, j, new v((InputStream)localObject));
    }
    if (bool)
    {
      switch (j)
      {
      default: 
        return new bt(true, j, ((bv)localObject).b());
      case 4: 
        return new ae(new v((InputStream)localObject));
      case 16: 
        return new bk(new v((InputStream)localObject));
      case 17: 
        return new bm(new v((InputStream)localObject));
      }
      return new av(new v((InputStream)localObject));
    }
    switch (j)
    {
    }
    try
    {
      localObject = i.a(j, ((bv)localObject).b());
      return (ar)localObject;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      throw new g("corrupted stream detected", localIllegalArgumentException);
    }
    return new bg((bv)localObject);
  }
  
  ar a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      throw new g("unknown BER object encountered: 0x" + Integer.toHexString(paramInt));
    case 8: 
      return new av(this);
    case 4: 
      return new ae(this);
    case 16: 
      return new ah(this);
    }
    return new aj(this);
  }
  
  bd a(boolean paramBoolean, int paramInt)
  {
    if (!paramBoolean) {
      return new bp(false, paramInt, new bf(((bv)this.a).b()));
    }
    e locale = b();
    if ((this.a instanceof bx))
    {
      if (locale.a() == 1) {
        return new ak(true, paramInt, locale.a(0));
      }
      return new ak(false, paramInt, ad.a(locale));
    }
    if (locale.a() == 1) {
      return new bp(true, paramInt, locale.a(0));
    }
    return new bp(false, paramInt, aw.a(locale));
  }
  
  e b()
  {
    e locale = new e();
    for (;;)
    {
      ar localar = a();
      if (localar == null) {
        break;
      }
      if ((localar instanceof bw)) {
        locale.a(((bw)localar).g());
      } else {
        locale.a(localar.c());
      }
    }
    return locale;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */