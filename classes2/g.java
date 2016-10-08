import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.widget.Toast;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.a.e.a.a;
import org.json.JSONException;
import org.json.JSONObject;

public final class g
{
  private static final g a = new g();
  private boolean b = false;
  private h c = h.a();
  
  public static f a(Context paramContext, String paramString1, String paramString2)
  {
    f localf = new f();
    try
    {
      KeyStore localKeyStore = KeyStore.getInstance("pkcs12");
      localKeyStore.load(paramContext.openFileInput(paramString1 + ".pfx"), paramString2.toCharArray());
      paramContext = localKeyStore.aliases();
      do
      {
        if (!paramContext.hasMoreElements())
        {
          paramContext = null;
          break;
        }
        paramString1 = (String)paramContext.nextElement();
      } while (!localKeyStore.isKeyEntry(paramString1));
      paramContext = (X509Certificate)localKeyStore.getCertificate(paramString1);
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
      paramContext = null;
    }
    do
    {
      try
      {
        bq.a(paramContext.getEncoded()).replace("\n", "");
        paramContext.getSubjectDN().getName();
        paramContext.getIssuerDN().getName();
        paramContext.getNotAfter();
        paramContext.getNotBefore();
        paramContext.getSerialNumber().toString();
        paramContext.getSigAlgName();
        paramContext.getVersion();
        return localf;
      }
      catch (Exception paramString1)
      {
        for (;;)
        {
          paramString1.printStackTrace();
        }
      }
    } while (paramContext != null);
    return null;
  }
  
  public static g a(Context paramContext, String paramString)
  {
    if (b(paramContext, paramString))
    {
      if (!a.b)
      {
        paramString = a;
        paramContext = new AlertDialog.Builder(paramContext);
        paramContext.setTitle("温馨提醒");
        paramContext.setMessage("您目前使用的思迪证书签名控件为测试版本，为了不影响您的正常使用，请您尽快升级到正式版");
        paramContext.setPositiveButton("确定", null);
        paramContext.create().show();
      }
      return a;
    }
    Toast.makeText(paramContext, "您目前使用的License无效，详情请联系思迪信息", 1).show();
    return null;
  }
  
  private static boolean b(Context paramContext, String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 1)) {
      return false;
    }
    for (;;)
    {
      try
      {
        paramString = a.b(paramString.getBytes());
        Object localObject = new SecretKeySpec("com.thinkive.certificate.android".getBytes(), "Blowfish");
        Cipher localCipher = Cipher.getInstance("Blowfish");
        localCipher.init(2, (Key)localObject);
        paramString = new String(localCipher.doFinal(paramString));
        try
        {
          paramString = new JSONObject(paramString);
          if (paramString.isNull("version")) {
            break;
          }
          localObject = paramString.getString("version");
          if (((String)localObject).equals("TEST"))
          {
            a.b = false;
            if ((paramString.isNull("package")) || (!paramString.getString("package").equals(paramContext.getPackageName())) || (paramString.isNull("app_name"))) {
              break;
            }
            localObject = paramContext.getPackageManager();
          }
        }
        catch (JSONException paramContext)
        {
          boolean bool;
          paramContext.printStackTrace();
        }
      }
      catch (GeneralSecurityException paramContext)
      {
        paramContext.printStackTrace();
        return false;
      }
      try
      {
        localObject = ((PackageManager)localObject).getApplicationInfo(paramContext.getPackageName(), 0);
        bool = paramContext.getPackageManager().getApplicationLabel((ApplicationInfo)localObject).toString().equals(paramString.getString("app_name"));
        if ((!bool) || (paramString.isNull("not_after")) || (bq.b(paramString.getString("not_after"), new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())))) {
          break;
        }
      }
      catch (PackageManager.NameNotFoundException paramContext)
      {
        paramContext.printStackTrace();
        continue;
      }
      break label274;
      if (((String)localObject).equals("PAYED")) {
        a.b = true;
      }
    }
    label274:
    return true;
  }
  
  public final String a(Context paramContext, String paramString1, String paramString2, int paramInt)
  {
    this.c.c();
    this.c.a(paramContext, paramString1);
    try
    {
      this.c.a("BC", "RSA", 1024);
    }
    catch (NoSuchProviderException paramContext)
    {
      for (;;)
      {
        try
        {
          this.c.b();
          return this.c.a(paramString2);
        }
        catch (Exception paramContext)
        {
          paramContext.printStackTrace();
        }
        paramContext = paramContext;
        paramContext.printStackTrace();
      }
    }
    catch (NoSuchAlgorithmException paramContext)
    {
      for (;;)
      {
        paramContext.printStackTrace();
      }
    }
    return "";
  }
  
  public final String a(Context paramContext, String paramString1, byte[] paramArrayOfByte, String paramString2)
  {
    try
    {
      this.c.c();
      this.c.a(paramContext, paramString1, paramString2);
      paramContext = this.c.a(paramArrayOfByte, true);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      throw new Exception("attachedSign签名失败，出错信息：" + paramContext.getMessage());
    }
  }
  
  public final void a(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    this.c.b(paramString2);
    this.c.b(paramContext, paramString1, paramString3);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */