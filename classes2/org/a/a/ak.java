package org.a.a;

import java.util.Enumeration;

public class ak
  extends bp
{
  public ak(int paramInt, ar paramar)
  {
    super(paramInt, paramar);
  }
  
  public ak(boolean paramBoolean, int paramInt, ar paramar)
  {
    super(paramBoolean, paramInt, paramar);
  }
  
  void a(bh parambh)
  {
    if (((parambh instanceof p)) || ((parambh instanceof af)))
    {
      parambh.a(160, this.a);
      parambh.write(128);
      if (!this.b)
      {
        if (!this.c)
        {
          Enumeration localEnumeration;
          if ((this.d instanceof n)) {
            if ((this.d instanceof ac)) {
              localEnumeration = ((ac)this.d).h();
            }
          }
          for (;;)
          {
            if (!localEnumeration.hasMoreElements()) {
              break label215;
            }
            parambh.a(localEnumeration.nextElement());
            continue;
            localEnumeration = new ac(((n)this.d).f()).h();
            continue;
            if ((this.d instanceof r))
            {
              localEnumeration = ((r)this.d).e();
            }
            else
            {
              if (!(this.d instanceof t)) {
                break;
              }
              localEnumeration = ((t)this.d).e();
            }
          }
          throw new RuntimeException("not implemented: " + this.d.getClass().getName());
        }
        parambh.a(this.d);
      }
      label215:
      parambh.write(0);
      parambh.write(0);
      return;
    }
    super.a(parambh);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */