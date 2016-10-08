package org.a.a;

public class bp
  extends x
{
  private static final byte[] e = new byte[0];
  
  public bp(int paramInt, ar paramar)
  {
    super(paramInt, paramar);
  }
  
  public bp(boolean paramBoolean, int paramInt, ar paramar)
  {
    super(paramBoolean, paramInt, paramar);
  }
  
  void a(bh parambh)
  {
    int i = 160;
    if (!this.b)
    {
      byte[] arrayOfByte = this.d.c().a("DER");
      if (this.c)
      {
        parambh.a(160, this.a, arrayOfByte);
        return;
      }
      if ((arrayOfByte[0] & 0x20) != 0) {}
      for (;;)
      {
        parambh.a(i, this.a);
        parambh.write(arrayOfByte, 1, arrayOfByte.length - 1);
        return;
        i = 128;
      }
    }
    parambh.a(160, this.a, e);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\bp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */