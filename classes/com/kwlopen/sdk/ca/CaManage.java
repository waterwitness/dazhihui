package com.kwlopen.sdk.ca;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.itrus.raapi.implement.ClientForAndroid;
import java.io.File;

public class CaManage
{
  private static String LICENSE;
  private static final String TAG = "CaManage";
  public static final int UnKownErrorCode = -2;
  private static final boolean isTest = true;
  
  public static String getError(Activity paramActivity)
  {
    return ClientForAndroid.getInstance(paramActivity).GetLastErrInfo();
  }
  
  public static String getPKCS10(Activity paramActivity, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt, String paramString6)
  {
    try
    {
      paramActivity = ClientForAndroid.getInstance(paramActivity).GenCSR(paramString1, paramString2, paramString3, paramString4, paramString5, paramInt, paramString6);
      Log.i("CaManage", "getPKCS10: " + paramActivity);
      return paramActivity;
    }
    catch (Exception paramActivity)
    {
      for (;;)
      {
        paramActivity.printStackTrace();
        paramActivity = null;
      }
    }
  }
  
  public static int initCert(Activity paramActivity, String paramString1, String paramString2, String paramString3)
  {
    int i;
    for (int j = 0;; j = i) {
      try
      {
        i = ClientForAndroid.getInstance(paramActivity).SetLicense(LICENSE);
        if (i == 1)
        {
          Log.i("CaManage", "initCert: " + parseErrorCode(j));
          if (j != 0)
          {
            i = j;
            if (j != 1) {}
          }
          else
          {
            j = ClientForAndroid.getInstance(paramActivity).SetSystemDBDir(paramActivity.getApplicationContext().getFilesDir().getAbsolutePath());
            Log.i("CaManage", "initCert: " + parseErrorCode(j));
            i = j;
            if (j == 0)
            {
              j = ClientForAndroid.getInstance(paramActivity).VerifyUserPIN(paramString1, paramString3, 0);
              Log.i("CaManage", "initCert: " + parseErrorCode(j));
              i = j;
              if (j == 3)
              {
                j = ClientForAndroid.getInstance(paramActivity).CSetAdminPIN("", paramString2, 0);
                Log.i("CaManage", "initCert: " + parseErrorCode(j));
                i = j;
                if (j == 0)
                {
                  j = ClientForAndroid.getInstance(paramActivity).CInitUserPIN(paramString2, paramString3);
                  Log.i("CaManage", "initCert: " + parseErrorCode(j));
                  i = j;
                  if (j == 0)
                  {
                    i = ClientForAndroid.getInstance(paramActivity).VerifyUserPIN(paramString1, paramString3, 0);
                    Log.i("CaManage", "initCert: " + parseErrorCode(i));
                  }
                }
              }
            }
          }
          return i;
        }
      }
      catch (Exception paramActivity)
      {
        paramActivity.printStackTrace();
        Log.i("CaManage", "initCert: " + parseErrorCode(-2));
        return -2;
      }
    }
  }
  
  public static int installCert(Activity paramActivity, String paramString1, String paramString2)
  {
    try
    {
      i = ClientForAndroid.getInstance(paramActivity).ImportCert("", paramString2);
      Log.i("CaManage", "installCert: " + parseErrorCode(i));
      return i;
    }
    catch (Exception paramActivity)
    {
      for (;;)
      {
        paramActivity.printStackTrace();
        int i = -2;
      }
    }
  }
  
  public static String parseErrorCode(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return "未知错误";
    case -1: 
      return "失败";
    case 0: 
      return "成功";
    case 1: 
      return "初始化数据库失败";
    case 2: 
      return "初始化pin出错";
    case 3: 
      return "未初始化pin";
    case 4: 
      return "内存不足";
    case 5: 
      return "没有key";
    case 6: 
      return "非法参数";
    case 7: 
      return "pin码错误";
    case 8: 
      return "证书错误";
    case 9: 
      return "需要登录";
    case 10: 
      return "生成私钥出错";
    case 11: 
      return "签名数据出错";
    case 12: 
      return "验证出错";
    case 13: 
      return "生成公钥信息出错";
    case 14: 
      return "生成证书请求出错";
    case 15: 
      return "证书不存在";
    case 16: 
      return "没有证书";
    case 17: 
      return "没有私钥";
    case 18: 
      return "没有公钥";
    case 19: 
      return "加密出错";
    case 20: 
      return "解密出错";
    case 21: 
      return "哈希出错";
    case 22: 
      return "导入证书出错";
    case 23: 
      return "KEY用途不正确";
    case 24: 
      return "创建签名数据出错";
    case 25: 
      return "包含证书链出错";
    case 26: 
      return "p7编码出错";
    case 27: 
      return "p7解码出错";
    case 28: 
      return "p7Detach验签出错";
    case 29: 
      return "p7Attach验签出错";
    case 30: 
      return "p7设置原文出错";
    case 31: 
      return "填加证书出错";
    }
    return "网络出错";
  }
  
  public static void setLicense(String paramString)
  {
    if (LICENSE == null) {
      LICENSE = paramString;
    }
  }
  
  public static String signMessage(Activity paramActivity, String paramString1, String paramString2, String paramString3, int paramInt)
  {
    for (;;)
    {
      try
      {
        paramString2 = ClientForAndroid.getInstance(paramActivity).FilterCert("", paramString2, "", 0, 0);
        if (paramString2.length <= 0) {
          continue;
        }
        paramString2 = paramString2[0];
        paramActivity = ClientForAndroid.getInstance(paramActivity).SignMessage(paramString1, paramString2, paramString3, paramInt);
      }
      catch (Exception paramActivity)
      {
        paramActivity.printStackTrace();
        paramActivity = null;
        continue;
      }
      Log.i("CaManage", "signMessage: " + paramActivity);
      return paramActivity;
      paramActivity = null;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwlopen\sdk\ca\CaManage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */