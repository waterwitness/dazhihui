package com.itrus.raapi.implement;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Handler;
import android.text.TextUtils;
import java.io.File;
import java.io.PrintStream;
import java.security.Key;

public class ClientForAndroid
{
  private static ClientForAndroid instance = null;
  private int TIME = 600000;
  Activity activity = null;
  Handler handler = new Handler();
  Runnable runnable = new ClientForAndroid.1(this);
  
  static
  {
    try
    {
      System.loadLibrary("O_All");
      return;
    }
    catch (Exception localException)
    {
      System.out.println(localException.getMessage());
    }
  }
  
  private ClientForAndroid(Activity paramActivity)
  {
    this.activity = paramActivity;
    setSystemDBDir(paramActivity.getApplicationContext().getFilesDir().getAbsolutePath());
  }
  
  private native int FilePfxImport(String paramString1, String paramString2);
  
  private native int InitPIN(String paramString1, String paramString2);
  
  private native int SSLconfigClientCert(String paramString);
  
  private native int SSLconfigServer(String paramString, int paramInt);
  
  private native int SSLconnectToServer(int paramInt);
  
  private native int SSLfinal();
  
  private native int SSLforceHanleShake();
  
  private native int SSLinit();
  
  private native byte[] SSLread();
  
  private native int SSLwrite(byte[] paramArrayOfByte, int paramInt);
  
  private native int SetPIN(String paramString1, String paramString2, int paramInt);
  
  private native int certExpireRemind(String paramString);
  
  private native int changePIN(String paramString1, String paramString2, String paramString3);
  
  private void createDialog(Activity paramActivity)
  {
    new AlertDialog.Builder(paramActivity).setTitle("提醒").setPositiveButton("确定", null).setMessage("当前您使用的是测试授权，用于开发调试及演示，如需正式商用版本，请与天威诚信电子商务服务有限公司联系").create().show();
  }
  
  private native String decryptMessage(String paramString1, String paramString2, String paramString3);
  
  private native int deleteCertByNickname(String paramString);
  
  private native int deleteCertBySerialNumber(String paramString);
  
  private native String encryptMessage(String paramString1, String paramString2, String paramString3);
  
  private native String enumKey();
  
  private native String[] filterCert(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2);
  
  private native String genCSR(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt, String paramString6);
  
  private native String genCSRWithCertID(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6);
  
  private native certInfo getCertAttribute(String paramString);
  
  private native String getCertBuf(String paramString);
  
  private native String getCertNickName(String paramString);
  
  private native String getCertSerialNumber(String paramString);
  
  private native String getCertSubject(String paramString);
  
  public static ClientForAndroid getInstance(Activity paramActivity)
  {
    if (instance == null) {
      instance = new ClientForAndroid(paramActivity);
    }
    return instance;
  }
  
  private native String getLastErrInfo();
  
  private native int importCert(String paramString1, String paramString2);
  
  private native int importCertWithNickname(String paramString1, String paramString2, String paramString3);
  
  private native String isRemovableDevice(String paramString);
  
  private native int setLicense(String paramString1, String paramString2);
  
  private native int setSystemDBDir(String paramString);
  
  private native String signMessage(String paramString1, String paramString2, String paramString3, int paramInt);
  
  private native String signMessageBYTE(byte[] paramArrayOfByte, String paramString1, String paramString2, int paramInt);
  
  private native String signMessageBYTEWithLength(byte[] paramArrayOfByte, int paramInt1, String paramString1, String paramString2, int paramInt2);
  
  private native int verifyMessage(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt);
  
  private native int verifyPIN(String paramString1, String paramString2, int paramInt);
  
  private String wa()
  {
    Object localObject2 = null;
    try
    {
      localPackageManager = this.activity.getApplicationContext().getPackageManager();
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException1)
    {
      for (;;)
      {
        PackageManager localPackageManager;
        ApplicationInfo localApplicationInfo;
        label28:
        Object localObject1 = null;
      }
    }
    try
    {
      localApplicationInfo = localPackageManager.getApplicationInfo(this.activity.getPackageName(), 0);
      localObject2 = localApplicationInfo;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException2)
    {
      break label28;
    }
    return (String)localPackageManager.getApplicationLabel((ApplicationInfo)localObject2);
  }
  
  public int CInitUserPIN(String paramString1, String paramString2)
  {
    return InitPIN(paramString1, paramString2);
  }
  
  public int CSetAdminPIN(String paramString1, String paramString2, int paramInt)
  {
    return SetPIN(paramString1, paramString2, paramInt);
  }
  
  public int CertExpireRemind(String paramString)
  {
    return certExpireRemind(paramString);
  }
  
  public int ChangeUserPIN(String paramString1, String paramString2, String paramString3)
  {
    return changePIN(paramString1, paramString2, paramString3);
  }
  
  public String DecryptMessage(String paramString1, String paramString2, String paramString3)
  {
    return decryptMessage(paramString1, paramString2, paramString3);
  }
  
  public String DecryptMessageWithEnvelopedData(String paramString1, String paramString2)
  {
    paramString1 = paramString1.split("&");
    if ((paramString1 != null) && (paramString1.length == 2))
    {
      String str = paramString1[0];
      paramString1 = paramString1[1];
      paramString2 = decryptMessage(str, "", paramString2);
      if (!TextUtils.isEmpty(paramString2)) {
        break label43;
      }
    }
    label43:
    do
    {
      return null;
      paramString2 = Des3Util.getKey(paramString2);
    } while (paramString2 == null);
    return Des3Util.symmetricDecry(paramString2, paramString1);
  }
  
  public int DeleteCertByNickname(String paramString)
  {
    return deleteCertByNickname(paramString);
  }
  
  public int DeleteCertBySerialNumber(String paramString)
  {
    return deleteCertBySerialNumber(paramString);
  }
  
  public String EncryptMessage(String paramString1, String paramString2, String paramString3)
  {
    return encryptMessage(paramString1, paramString2, paramString3);
  }
  
  public String EncryptMessageWithEnvelopedData(String paramString1, String paramString2)
  {
    String str = Des3Util.getStrKey();
    if (TextUtils.isEmpty(str)) {}
    do
    {
      Key localKey;
      do
      {
        do
        {
          return null;
          localKey = Des3Util.getKey(str);
        } while (localKey == null);
        paramString2 = encryptMessage(str, "", paramString2);
      } while (TextUtils.isEmpty(paramString2));
      paramString1 = Des3Util.symmetricEncry(localKey, paramString1);
    } while (paramString1 == null);
    return paramString2 + "&" + paramString1;
  }
  
  public String EnumKey()
  {
    return enumKey();
  }
  
  public String[] FilterCert(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2)
  {
    return filterCert(paramString1, paramString2, paramString3, paramInt1, paramInt2);
  }
  
  public String GenCSR(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt, String paramString6)
  {
    return genCSR(paramString1, paramString2, paramString3, paramString4, paramString5, paramInt, paramString6);
  }
  
  public String GenCSRWithCertID(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    return genCSRWithCertID(paramString1, paramString2, paramString3, paramString4, paramString5, paramString6);
  }
  
  public certInfo GetCertAttribute(String paramString)
  {
    return getCertAttribute(paramString);
  }
  
  public String GetCertBuf(String paramString)
  {
    return getCertBuf(paramString);
  }
  
  public String GetCertNickName(String paramString)
  {
    return getCertNickName(paramString);
  }
  
  public String GetCertSerialNumber(String paramString)
  {
    return getCertSerialNumber(paramString);
  }
  
  public String GetCertSubject(String paramString)
  {
    return getCertSubject(paramString);
  }
  
  public String GetLastErrInfo()
  {
    return getLastErrInfo();
  }
  
  public int ImportCert(String paramString1, String paramString2)
  {
    return importCert(paramString1, paramString2);
  }
  
  public int ImportCertWithNickname(String paramString1, String paramString2, String paramString3)
  {
    return importCertWithNickname(paramString1, paramString2, paramString3);
  }
  
  public String IsRemovableDevice(String paramString)
  {
    return isRemovableDevice(paramString);
  }
  
  public int SSLConfigClientCert(String paramString)
  {
    return SSLconfigClientCert(paramString);
  }
  
  public int SSLConfigServer(String paramString, int paramInt)
  {
    return SSLconfigServer(paramString, paramInt);
  }
  
  public int SSLConnectToServer(int paramInt)
  {
    return SSLconnectToServer(paramInt);
  }
  
  public int SSLFinal()
  {
    return SSLfinal();
  }
  
  public int SSLForceHanleShake()
  {
    return SSLforceHanleShake();
  }
  
  public int SSLInit()
  {
    return SSLinit();
  }
  
  public byte[] SSLRead()
  {
    return SSLread();
  }
  
  public int SSLWrite(String paramString, int paramInt)
  {
    return SSLwrite(paramString.getBytes(), paramInt);
  }
  
  public int SetLicense(String paramString)
  {
    if (setLicense(wa(), paramString) != 0) {
      this.handler.postDelayed(this.runnable, this.TIME);
    }
    return 0;
  }
  
  public int SetSystemDBDir(String paramString)
  {
    return setSystemDBDir(paramString);
  }
  
  public String SignMessage(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    return signMessage(paramString1, paramString2, paramString3, paramInt);
  }
  
  public String SignMessageBYTE(byte[] paramArrayOfByte, String paramString1, String paramString2, int paramInt)
  {
    return signMessageBYTE(paramArrayOfByte, paramString1, paramString2, paramInt);
  }
  
  public String SignMessageBYTEWithLength(byte[] paramArrayOfByte, int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    return signMessageBYTEWithLength(paramArrayOfByte, paramInt1, paramString1, paramString2, paramInt2);
  }
  
  public int VerifyMessage(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt)
  {
    return verifyMessage(paramString1, paramString2, paramString3, paramString4, paramInt);
  }
  
  public int VerifyUserPIN(String paramString1, String paramString2, int paramInt)
  {
    return verifyPIN(paramString1, paramString2, paramInt);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\itrus\raapi\implement\ClientForAndroid.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */