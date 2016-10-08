package org.a.a;

import java.io.ByteArrayOutputStream;
import java.util.Enumeration;

public class bj
  extends r
{
  public bj() {}
  
  public bj(e parame)
  {
    int i = 0;
    while (i != parame.a())
    {
      a(parame.a(i));
      i += 1;
    }
  }
  
  public bj(d[] paramArrayOfd)
  {
    int i = 0;
    while (i != paramArrayOfd.length)
    {
      a(paramArrayOfd[i]);
      i += 1;
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
    parambh.a(48, localByteArrayOutputStream.toByteArray());
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\bj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */