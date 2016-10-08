package org.a.a;

import java.util.Enumeration;

public class ag
  extends bj
{
  public ag() {}
  
  public ag(e parame)
  {
    super(parame);
  }
  
  void a(bh parambh)
  {
    if (((parambh instanceof p)) || ((parambh instanceof af)))
    {
      parambh.write(48);
      parambh.write(128);
      Enumeration localEnumeration = e();
      while (localEnumeration.hasMoreElements()) {
        parambh.a(localEnumeration.nextElement());
      }
      parambh.write(0);
      parambh.write(0);
      return;
    }
    super.a(parambh);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */