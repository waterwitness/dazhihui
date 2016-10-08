package org.a.a;

import java.io.IOException;

public class af
  extends bh
{
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
    throw new IOException("object not BEREncodable");
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */