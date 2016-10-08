import com.thinkive.mobile.account.certificate.sign.Xsdjfkdsjflksdl;
import java.math.BigInteger;
import java.security.cert.Certificate;
import javax.security.auth.x500.X500Principal;

public final class m
  implements Xsdjfkdsjflksdl
{
  private String a;
  private String b;
  private byte[] c;
  private BigInteger d;
  private byte[] e;
  private byte[] f;
  private byte[] g;
  private Certificate[] h;
  private String i;
  
  public final void a(String paramString)
  {
    this.a = paramString;
    this.f = null;
  }
  
  public final void a(BigInteger paramBigInteger)
  {
    this.d = paramBigInteger;
    this.f = null;
  }
  
  public final void a(byte[] paramArrayOfByte)
  {
    this.c = paramArrayOfByte;
    this.f = null;
  }
  
  public final void a(Certificate[] paramArrayOfCertificate)
  {
    this.h = paramArrayOfCertificate;
    this.f = null;
  }
  
  public final byte[] a()
  {
    if (this.c != null) {
      return this.c;
    }
    if (this.b != null)
    {
      this.c = new X500Principal(this.b).getEncoded();
      return this.c;
    }
    return null;
  }
  
  public final String b()
  {
    return this.a;
  }
  
  public final void b(String paramString)
  {
    this.i = paramString;
    this.f = null;
  }
  
  public final void b(byte[] paramArrayOfByte)
  {
    this.g = paramArrayOfByte;
    this.f = null;
  }
  
  public final void c(byte[] paramArrayOfByte)
  {
    this.e = paramArrayOfByte;
    this.f = null;
  }
  
  public final byte[] c()
  {
    return this.g;
  }
  
  public final byte[] csdfse()
  {
    if (this.f == null) {
      this.f = new n(this).a();
    }
    return this.f;
  }
  
  public final Certificate[] d()
  {
    return this.h;
  }
  
  public final String e()
  {
    return this.i;
  }
  
  public final String f()
  {
    if (this.b != null) {
      return this.b;
    }
    if (this.c != null)
    {
      this.b = new X500Principal(this.c).getName();
      return this.b;
    }
    return null;
  }
  
  public final BigInteger g()
  {
    return this.d;
  }
  
  public final byte[] h()
  {
    return this.e;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */