package com.android.dazhihui.ui.delegate.screen.hs;

import android.app.Activity;
import android.content.res.AssetManager;
import com.a.a.a.a.a;
import java.io.InputStream;
import java.io.PrintStream;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class SecretToolkit
{
  private static final String AES_ECB_PKCS5PADDING = "AES/ECB/PKCS5Padding";
  private static Activity context;
  private static SecretToolkit instance;
  private HashMap<Integer, List<String>> columnInMaps = new HashMap();
  private HashMap<Integer, List<String>> columnOutMaps = new HashMap();
  private HashMap<byte[], Integer> eventMaps = new HashMap();
  SecretKeyInfo info = null;
  private X509Certificate mCertificate;
  private HashMap<Integer, SecretKeyInfo> secretKeyMaps = new HashMap();
  
  private SecretToolkit()
  {
    try
    {
      InputStream localInputStream = context.getAssets().open("cert.pem");
      this.mCertificate = ((X509Certificate)CertificateFactory.getInstance("X.509").generateCertificate(localInputStream));
      localInputStream.close();
      return;
    }
    catch (Exception localException)
    {
      System.out.println("iTNSDK -- cert Exception:" + localException.toString());
    }
  }
  
  private String decrypt(String paramString, SecretKeyInfo paramSecretKeyInfo)
  {
    String str1 = paramString;
    String str2;
    if (paramSecretKeyInfo != null)
    {
      str2 = paramSecretKeyInfo.getSecret();
      str1 = paramString;
      if (str2 != null)
      {
        if (!str2.equals("AES-256")) {
          break label41;
        }
        str1 = decrytAES256(paramString, paramSecretKeyInfo.getKey());
      }
    }
    label41:
    do
    {
      return str1;
      str1 = paramString;
    } while (!str2.equals("RC-128"));
    return decrytRC4128(paramString, paramSecretKeyInfo.getKey());
  }
  
  private String decrytAES256(String paramString, SecretKeySpec paramSecretKeySpec)
  {
    Object localObject = paramString;
    if (paramString != null)
    {
      localObject = paramString;
      if (paramSecretKeySpec != null)
      {
        localObject = paramString;
        if (paramSecretKeySpec == null) {}
      }
    }
    try
    {
      localObject = Cipher.getInstance("AES/ECB/PKCS5Padding");
      ((Cipher)localObject).init(2, paramSecretKeySpec);
      localObject = a.b(((Cipher)localObject).doFinal(paramString.getBytes()));
      return (String)localObject;
    }
    catch (Exception paramSecretKeySpec) {}
    return paramString;
  }
  
  private String decrytRC4128(String paramString, SecretKeySpec paramSecretKeySpec)
  {
    Object localObject = paramString;
    if (paramString != null)
    {
      localObject = paramString;
      if (paramSecretKeySpec == null) {}
    }
    try
    {
      localObject = Cipher.getInstance("RC4");
      ((Cipher)localObject).init(2, paramSecretKeySpec);
      localObject = a.b(((Cipher)localObject).update(paramString.getBytes()));
      return (String)localObject;
    }
    catch (Exception paramSecretKeySpec) {}
    return paramString;
  }
  
  private String encrypt(String paramString, SecretKeyInfo paramSecretKeyInfo)
  {
    String str1 = paramString;
    String str2;
    if (paramSecretKeyInfo != null)
    {
      str2 = paramSecretKeyInfo.getSecret();
      str1 = paramString;
      if (str2 != null)
      {
        if (!str2.equals("AES-256")) {
          break label41;
        }
        str1 = encryptAES256(paramString, paramSecretKeyInfo.getKey());
      }
    }
    label41:
    do
    {
      return str1;
      str1 = paramString;
    } while (!str2.equals("RC-128"));
    return encryptRC4128(paramString, paramSecretKeyInfo.getKey());
  }
  
  private String encryptAES256(String paramString, SecretKeySpec paramSecretKeySpec)
  {
    Object localObject = paramString;
    if (paramString != null)
    {
      localObject = paramString;
      if (paramSecretKeySpec != null)
      {
        localObject = paramString;
        if (paramSecretKeySpec == null) {}
      }
    }
    try
    {
      localObject = Cipher.getInstance("AES/ECB/PKCS5Padding");
      ((Cipher)localObject).init(1, paramSecretKeySpec);
      localObject = a.b(((Cipher)localObject).doFinal(paramString.getBytes()));
      return (String)localObject;
    }
    catch (Exception paramSecretKeySpec)
    {
      System.out.println("iTNSDK -- encrypt Exception");
    }
    return paramString;
  }
  
  private String encryptRC4128(String paramString, SecretKeySpec paramSecretKeySpec)
  {
    Object localObject = paramString;
    if (paramString != null)
    {
      localObject = paramString;
      if (paramSecretKeySpec == null) {}
    }
    try
    {
      localObject = Cipher.getInstance("RC4");
      ((Cipher)localObject).init(1, paramSecretKeySpec);
      localObject = a.b(((Cipher)localObject).update(paramString.getBytes()));
      return (String)localObject;
    }
    catch (Exception paramSecretKeySpec) {}
    return paramString;
  }
  
  public static SecretToolkit getInstance()
  {
    if (instance == null) {
      instance = new SecretToolkit();
    }
    return instance;
  }
  
  public static void setActivity(Activity paramActivity)
  {
    context = paramActivity;
  }
  
  public SecretKeyInfo getSecretKeyInfo()
  {
    if (this.info == null) {
      this.info = new SecretKeyInfo("AES-256");
    }
    return this.info;
  }
  
  public void loadColumns()
  {
    ArrayList localArrayList = new ArrayList(2);
    localArrayList.add("bank_password");
    localArrayList.add("fund_password");
    this.columnInMaps.put(Integer.valueOf(819215), localArrayList);
    localArrayList = new ArrayList(2);
    localArrayList.add("bank_password");
    localArrayList.add("fund_password");
    this.columnInMaps.put(Integer.valueOf(819216), localArrayList);
    localArrayList = new ArrayList(1);
    localArrayList.add("password");
    this.columnInMaps.put(Integer.valueOf(819200), localArrayList);
    localArrayList = new ArrayList(1);
    localArrayList.add("new_password");
    localArrayList.add("old_password");
    this.columnInMaps.put(Integer.valueOf(819218), localArrayList);
    localArrayList = new ArrayList(1);
    localArrayList.add("password");
    this.columnInMaps.put(Integer.valueOf(819202), localArrayList);
  }
  
  public void putEvent(byte[] paramArrayOfByte, int paramInt)
  {
    if (this.secretKeyMaps.containsKey(Integer.valueOf(paramInt))) {
      this.eventMaps.put(paramArrayOfByte, Integer.valueOf(paramInt));
    }
  }
  
  public String secretIn_password(String paramString)
  {
    if ((paramString != null) && (!paramString.equals(""))) {
      return encrypt(paramString, getSecretKeyInfo());
    }
    return "";
  }
  
  public String secretIn_secretkeyinfo()
  {
    try
    {
      Object localObject = Cipher.getInstance("RSA/ECB/PKCS1Padding");
      ((Cipher)localObject).init(1, this.mCertificate);
      localObject = a.b(((Cipher)localObject).doFinal(getSecretKeyInfo().toString().getBytes()));
      return (String)localObject;
    }
    catch (Exception localException)
    {
      System.out.println("iTNSDK -- secret_key_info Exception:" + localException.toString());
    }
    return "";
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hs\SecretToolkit.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */