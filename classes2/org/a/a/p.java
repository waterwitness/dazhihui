package org.a.a;

import java.io.IOException;
import java.io.OutputStream;

public class p
  extends bh
{
  public p(OutputStream paramOutputStream)
  {
    super(paramOutputStream);
  }
  
  public void a(Object paramObject)
  {
    if (paramObject == null)
    {
      a();
      return;
    }
    if ((paramObject instanceof bd))
    {
      ((bd)paramObject).a(this);
      return;
    }
    if ((paramObject instanceof ar))
    {
      ((ar)paramObject).c().a(this);
      return;
    }
    throw new IOException("object not ASN1Encodable");
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */