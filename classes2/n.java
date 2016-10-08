import java.math.BigInteger;
import java.security.cert.Certificate;
import javax.security.auth.x500.X500Principal;

public final class n
  extends l
{
  private m c;
  private byte[] d = { 2, 1, 1 };
  private byte[] e;
  private byte[] f;
  private byte[] g;
  private byte[] h;
  private byte[] i;
  private byte[] j;
  private byte[] k;
  
  public n(m paramm)
  {
    this.c = paramm;
  }
  
  public final byte[] a()
  {
    byte[] arrayOfByte1 = this.d;
    arrayOfByte1 = o.a(new byte[0], arrayOfByte1);
    if (this.f == null) {
      this.f = a(this.c.b());
    }
    if (this.i == null) {
      this.i = o.a(49, this.f);
    }
    arrayOfByte1 = o.a(arrayOfByte1, this.i);
    Object localObject;
    if (this.j == null)
    {
      this.j = a;
      if (this.c.c() == null) {
        this.c.b(new byte[0]);
      }
      localObject = o.a(160, o.a(4, this.c.c()));
      this.j = o.a(this.j, (byte[])localObject);
      this.j = o.a(48, this.j);
    }
    arrayOfByte1 = o.a(arrayOfByte1, this.j);
    if (this.k != null) {
      arrayOfByte1 = o.a(arrayOfByte1, this.k);
    }
    label456:
    label470:
    for (;;)
    {
      localObject = this.d;
      localObject = o.a(new byte[0], (byte[])localObject);
      if (this.e == null) {
        if (this.c.a() != null) {
          break label456;
        }
      }
      for (this.e = new X500Principal(this.c.f()).getEncoded();; this.e = this.c.a())
      {
        byte[] arrayOfByte2 = o.a(2, this.c.g().toByteArray());
        this.e = o.a(this.e, arrayOfByte2);
        this.e = o.a(48, this.e);
        localObject = o.a(o.a((byte[])localObject, this.e), this.f);
        this.g = a(this.c.e());
        localObject = o.a((byte[])localObject, this.g);
        this.h = o.a(4, this.c.h());
        arrayOfByte1 = o.a(160, o.a(48, o.a(arrayOfByte1, o.a(49, o.a(48, o.a((byte[])localObject, this.h))))));
        return o.a(48, o.a(b, arrayOfByte1));
        if ((this.c.d() == null) || (this.c.d().length <= 0)) {
          break label470;
        }
        this.k = new byte[0];
        localObject = this.c.d();
        int m = 0;
        for (;;)
        {
          if (m >= localObject.length)
          {
            this.k = o.a(160, this.k);
            arrayOfByte1 = o.a(arrayOfByte1, this.k);
            break;
          }
          this.k = o.a(this.k, localObject[m].getEncoded());
          m += 1;
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */