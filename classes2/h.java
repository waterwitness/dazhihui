import android.content.Context;
import android.os.Environment;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.Security;
import java.security.Signature;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.Collection;
import javax.security.auth.x500.X500Principal;

final class h
{
  private static final h a = new h();
  private KeyPairGenerator b = null;
  private KeyPair c;
  private X509Certificate d;
  
  static
  {
    new StringBuilder(String.valueOf(Environment.getExternalStorageDirectory().getAbsolutePath())).append("/thinkive/cert/").toString();
  }
  
  private h()
  {
    Security.addProvider(new org.a.c.b.a());
  }
  
  protected static h a()
  {
    return a;
  }
  
  public final String a(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0)) {
      paramString = "MD5withRSA";
    }
    for (;;)
    {
      return bq.a(new org.a.c.a(paramString, new org.a.a.k.h("CN=ss, OU=ss, O=ss, L=ss, ST=ss, C=CN"), this.c.getPublic(), null, this.c.getPrivate()).a()).replace("\n", "");
    }
  }
  
  public final String a(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    Object localObject = Signature.getInstance("SHA1WithRSA");
    ((Signature)localObject).initSign(this.c.getPrivate());
    ((Signature)localObject).update(paramArrayOfByte);
    localObject = ((Signature)localObject).sign();
    m localm = new m();
    localm.c((byte[])localObject);
    localm.a(new Certificate[] { this.d });
    localm.b("1.2.840.113549.1.1.1");
    localm.b(paramArrayOfByte);
    localm.a(this.d.getSerialNumber());
    localm.a("1.3.14.3.2.26");
    localm.a(this.d.getIssuerX500Principal().getEncoded());
    return new String(bq.a(new n(localm).a())).toString();
  }
  
  public final void a(Context paramContext, String paramString)
  {
    paramContext = new File(paramContext.getFilesDir().getAbsolutePath() + File.separator + paramString + ".pfx");
    if (paramContext.exists())
    {
      paramContext.delete();
      Log.i(getClass().getSimpleName(), "证书删除成功");
      return;
    }
    Log.i(getClass().getSimpleName(), "证书不存在");
  }
  
  public final void a(Context paramContext, String paramString1, String paramString2)
  {
    KeyStore localKeyStore = KeyStore.getInstance("PKCS12");
    localKeyStore.load(paramContext.openFileInput(paramString1 + ".pfx"), paramString2.toCharArray());
    paramContext = (PrivateKey)localKeyStore.getKey(paramString1, paramString2.toCharArray());
    this.d = ((X509Certificate)localKeyStore.getCertificate(paramString1));
    this.c = new KeyPair(this.d.getPublicKey(), paramContext);
  }
  
  public final void a(String paramString1, String paramString2, int paramInt)
  {
    this.b = KeyPairGenerator.getInstance(paramString2, paramString1);
    this.b.initialize(paramInt, new SecureRandom());
  }
  
  public final void b()
  {
    if (this.b == null) {
      throw new j("在生成密钥对之前，请先初始化密钥对生成器");
    }
    this.c = this.b.generateKeyPair();
  }
  
  public final void b(Context paramContext, String paramString1, String paramString2)
  {
    PrivateKey localPrivateKey = this.c.getPrivate();
    X509Certificate localX509Certificate = this.d;
    a(paramContext, paramString1);
    KeyStore localKeyStore = KeyStore.getInstance("pkcs12");
    localKeyStore.load(null, null);
    localKeyStore.setKeyEntry(paramString1, localPrivateKey, paramString2.toCharArray(), new Certificate[] { localX509Certificate });
    paramContext = paramContext.openFileOutput(paramString1 + ".pfx", 0);
    localKeyStore.store(paramContext, paramString2.toCharArray());
    paramContext.close();
  }
  
  public final void b(String paramString)
  {
    Object localObject4 = null;
    Object localObject3 = null;
    Object localObject1 = localObject3;
    Object localObject2 = localObject4;
    try
    {
      paramString = new ByteArrayInputStream(org.a.e.a.a.b(paramString.getBytes()));
      localObject1 = localObject3;
      localObject2 = localObject4;
      Collection localCollection = CertificateFactory.getInstance("X.509").generateCertificates(paramString);
      localObject1 = localObject3;
      localObject2 = localObject4;
      paramString = new X509Certificate[localCollection.size()];
      localObject1 = paramString;
      localObject2 = paramString;
      localCollection.toArray(paramString);
    }
    catch (CertificateParsingException paramString)
    {
      for (;;)
      {
        paramString.printStackTrace();
        paramString = (String)localObject1;
      }
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        paramString.printStackTrace();
        paramString = (String)localObject2;
      }
      if (paramString.length <= 1) {
        break label152;
      }
      while (paramString.length <= 0) {
        try
        {
          paramString[0].verify(paramString[1].getPublicKey());
          this.d = paramString[0];
          return;
        }
        catch (Exception localException)
        {
          localException.printStackTrace();
          this.d = paramString[(paramString.length - 1)];
          return;
        }
      }
      this.d = paramString[0];
    }
    if (paramString == null) {
      throw new i("证书为空");
    }
    label152:
  }
  
  public final void c()
  {
    this.c = null;
    this.d = null;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */