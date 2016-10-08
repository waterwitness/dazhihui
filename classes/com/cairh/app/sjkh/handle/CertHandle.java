package com.cairh.app.sjkh.handle;

import android.content.Context;
import com.b.a;
import com.b.b;
import com.cairh.app.sjkh.common.WriteLogFile;

public class CertHandle
{
  private Context context;
  
  public CertHandle(Context paramContext)
  {
    this.context = paramContext;
  }
  
  public String checkSn(String paramString)
  {
    WriteLogFile.witeLog(">>>>> 检测手机端本地SN sn= " + paramString + ">>>>>>");
    paramString = a.a(this.context, paramString);
    WriteLogFile.witeLog(">>>>> 检测手机端本地SN 结果 res= " + paramString + ">>>>>>");
    return paramString;
  }
  
  public void saveCert(String paramString1, String paramString2)
  {
    String str = b.a;
    WriteLogFile.witeLog(">>>>>开始执行证书保存操作 sn= " + paramString1 + ">>>>>>");
    b.a(this.context, null, b.a(paramString2), str, paramString1);
    WriteLogFile.witeLog(">>>>>证书保存操作完成 >>>>>>");
  }
  
  public String setPassword(String paramString)
  {
    b.a = paramString;
    paramString = b.a(this.context, "OU=Customers01,CN=csdcca,C=CN", paramString);
    WriteLogFile.witeLog(">>>>>用户执行设置密码操作>>>>>>");
    return paramString;
  }
  
  public String sign(String paramString1, String paramString2)
  {
    WriteLogFile.witeLog(">>>>> 用私钥签名操作 sn= " + paramString1 + ">>>>>>");
    return b.b(this.context, paramString1, paramString2).replaceAll("\n", "").replaceAll("\t", "").replaceAll("\r", "");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\handle\CertHandle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */