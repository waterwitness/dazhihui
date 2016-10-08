package org.a.a;

public class aq
  extends l
{
  public static final aq b = new aq(false);
  public static final aq c = new aq(true);
  byte a;
  
  public aq(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (byte b1 = -1;; b1 = 0)
    {
      this.a = b1;
      return;
    }
  }
  
  public aq(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte.length != 1) {
      throw new IllegalArgumentException("byte value should have 1 byte in it");
    }
    this.a = paramArrayOfByte[0];
  }
  
  public static aq a(Object paramObject)
  {
    if ((paramObject == null) || ((paramObject instanceof aq))) {
      return (aq)paramObject;
    }
    throw new IllegalArgumentException("illegal object in getInstance: " + paramObject.getClass().getName());
  }
  
  void a(bh parambh)
  {
    parambh.a(1, new byte[] { this.a });
  }
  
  protected boolean a(bd parambd)
  {
    if ((parambd == null) || (!(parambd instanceof aq))) {}
    while (this.a != ((aq)parambd).a) {
      return false;
    }
    return true;
  }
  
  public boolean e()
  {
    return this.a != 0;
  }
  
  public int hashCode()
  {
    return this.a;
  }
  
  public String toString()
  {
    if (this.a != 0) {
      return "TRUE";
    }
    return "FALSE";
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */