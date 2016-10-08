package org.a.a;

import java.io.ByteArrayOutputStream;
import java.util.Enumeration;

public class bl
  extends t
{
  public bl() {}
  
  public bl(ar paramar)
  {
    a(paramar);
  }
  
  public bl(e parame)
  {
    this(parame, true);
  }
  
  bl(e parame, boolean paramBoolean)
  {
    int i = 0;
    while (i != parame.a())
    {
      a(parame.a(i));
      i += 1;
    }
    if (paramBoolean) {
      g();
    }
  }
  
  void a(bh parambh)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    bh localbh = new bh(localByteArrayOutputStream);
    Enumeration localEnumeration = e();
    while (localEnumeration.hasMoreElements()) {
      localbh.a(localEnumeration.nextElement());
    }
    localbh.close();
    parambh.a(49, localByteArrayOutputStream.toByteArray());
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\bl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */