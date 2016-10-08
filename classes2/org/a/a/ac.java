package org.a.a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

public class ac
  extends bf
{
  private Vector b;
  
  public ac(Vector paramVector)
  {
    super(a(paramVector));
    this.b = paramVector;
  }
  
  public ac(byte[] paramArrayOfByte)
  {
    super(paramArrayOfByte);
  }
  
  private static byte[] a(Vector paramVector)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    int i = 0;
    while (i != paramVector.size()) {
      try
      {
        localByteArrayOutputStream.write(((bf)paramVector.elementAt(i)).f());
        i += 1;
      }
      catch (ClassCastException localClassCastException)
      {
        throw new IllegalArgumentException(paramVector.elementAt(i).getClass().getName() + " found in input should only contain DEROctetString");
      }
      catch (IOException paramVector)
      {
        throw new IllegalArgumentException("exception converting octets " + paramVector.toString());
      }
    }
    return localClassCastException.toByteArray();
  }
  
  private Vector i()
  {
    Vector localVector = new Vector();
    int i = 0;
    if (i < this.a.length)
    {
      if (i + 1000 > this.a.length) {}
      for (int j = this.a.length;; j = i + 1000)
      {
        byte[] arrayOfByte = new byte[j - i];
        System.arraycopy(this.a, i, arrayOfByte, 0, arrayOfByte.length);
        localVector.addElement(new bf(arrayOfByte));
        i += 1000;
        break;
      }
    }
    return localVector;
  }
  
  public void a(bh parambh)
  {
    if (((parambh instanceof p)) || ((parambh instanceof af)))
    {
      parambh.write(36);
      parambh.write(128);
      Enumeration localEnumeration = h();
      while (localEnumeration.hasMoreElements()) {
        parambh.a(localEnumeration.nextElement());
      }
      parambh.write(0);
      parambh.write(0);
      return;
    }
    super.a(parambh);
  }
  
  public byte[] f()
  {
    return this.a;
  }
  
  public Enumeration h()
  {
    if (this.b == null) {
      return i().elements();
    }
    return this.b.elements();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */