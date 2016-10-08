package com.c.b.b.a;

import com.c.b.n;

public final class r
{
  private final boolean a;
  
  r(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }
  
  public void a(n[] paramArrayOfn)
  {
    if ((!this.a) || (paramArrayOfn == null) || (paramArrayOfn.length < 3)) {
      return;
    }
    n localn = paramArrayOfn[0];
    paramArrayOfn[0] = paramArrayOfn[2];
    paramArrayOfn[2] = localn;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\b\b\a\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */