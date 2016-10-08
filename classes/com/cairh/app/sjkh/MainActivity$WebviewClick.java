package com.cairh.app.sjkh;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.Log;
import com.baidu.location.h;
import com.cairh.app.sjkh.common.MResource;
import com.cairh.app.sjkh.common.Util;
import com.cairh.app.sjkh.common.WriteLogFile;
import com.cairh.app.sjkh.handle.CertHandle;
import com.cairh.app.sjkh.handle.IOpenAccountResponseHandler;
import com.cairh.app.sjkh.handle.JtoJHandle.wvClientClickListener;
import com.cairh.app.sjkh.ui.VideoActivity;
import com.cairh.app.sjkh.ui.VideoPreviewActivity;
import com.cairh.app.sjkh.util.FileUploadUtil;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

class MainActivity$WebviewClick
  implements JtoJHandle.wvClientClickListener
{
  MainActivity$WebviewClick(MainActivity paramMainActivity) {}
  
  public void checkAppVersion(String paramString)
  {
    this.this$0.checkVersion(paramString);
  }
  
  public void checkSJKHSDKVersion(String paramString)
  {
    Log.i("CRH_MainActivity", ">>> sdk versionCode：5012210  callbackFunc: " + paramString);
    this.this$0.cwjHandler.post(new MainActivity.WebviewClick.13(this, paramString));
  }
  
  public void clearCookie()
  {
    this.this$0.cwjHandler.post(new MainActivity.WebviewClick.11(this));
  }
  
  public void closeBg()
  {
    if (this.this$0.isLoading) {
      return;
    }
    this.this$0.cwjHandler.post(new MainActivity.WebviewClick.12(this));
  }
  
  public void closeSJKH()
  {
    Log.i("CRH_MainActivity", "finishing...");
    this.this$0.finish();
  }
  
  public void getAccountInfo(String paramString)
  {
    System.out.println(">>>>>>>>>>>> accountType" + MainActivity.access$23());
    this.this$0.callJSFunc(paramString + "('" + MainActivity.access$17() + "','" + MainActivity.access$18() + "','" + MainActivity.access$23() + "')");
  }
  
  public void getDeviceModel(String paramString)
  {
    String str1 = Build.MODEL;
    String str2 = Build.VERSION.RELEASE;
    this.this$0.cwjHandler.post(new MainActivity.WebviewClick.16(this, str1, str2, paramString));
    Log.i("CRH_MainActivity", "Device Model: " + Build.MODEL + "," + Build.VERSION.SDK_INT + "," + Build.VERSION.RELEASE);
  }
  
  public void getMacAddress()
  {
    String str = this.this$0.getMacAddr();
    this.this$0.callJSFunc("getMacAddrCallBack('" + str + "');");
  }
  
  public void getNetInfo(String paramString)
  {
    Map localMap = Util.getNetInfo(this.this$0.context);
    System.out.println(">>>>> 获得网络信息：" + localMap.toString());
    this.this$0.cwjHandler.post(new MainActivity.WebviewClick.10(this, paramString, localMap));
  }
  
  public void getProd(String paramString)
  {
    if (MainActivity.access$21() != null)
    {
      this.this$0.callJSFunc(paramString + "('" + MainActivity.access$21() + "')");
      MainActivity.access$22(null);
    }
  }
  
  public void getRegistMobileNo()
  {
    if (MainActivity.access$10() != null)
    {
      this.this$0.cwjHandler.post(new MainActivity.WebviewClick.8(this));
      return;
    }
    this.this$0.cwjHandler.post(new MainActivity.WebviewClick.9(this));
  }
  
  public void getUser(String paramString)
  {
    System.out.println(">>>>>>>>>> getUser [ " + MainActivity.access$17() + " ]");
    this.this$0.callJSFunc(paramString + "('" + MainActivity.access$17() + "','" + MainActivity.access$18() + "')");
  }
  
  public void location(String paramString)
  {
    MainActivity.access$13(this.this$0, paramString);
    MainActivity.access$14(this.this$0);
    this.this$0.mLocationClient.c();
    this.this$0.mLocationClient.b();
  }
  
  public void openPreviewVideo(String paramString)
  {
    Intent localIntent = new Intent();
    localIntent.setClass(this.this$0, VideoPreviewActivity.class);
    localIntent.putExtra("videoFilePath", paramString);
    this.this$0.startActivity(localIntent);
  }
  
  public void openVideoCall(String paramString1, String paramString2, String paramString3)
  {
    System.out.println(paramString1 + "=====" + paramString2 + "======" + paramString3);
    this.this$0.cwjHandler.post(new MainActivity.WebviewClick.14(this, paramString1, paramString2, paramString3));
  }
  
  public void openWebNatrue(String paramString)
  {
    paramString = new Intent("android.intent.action.VIEW", Uri.parse(paramString));
    this.this$0.startActivity(paramString);
  }
  
  public void pushUploadAddr(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    MainActivity.access$7(this.this$0, paramString1);
    MainActivity.access$5(this.this$0, paramString2);
    MainActivity.access$8(this.this$0, paramString3);
  }
  
  public void quickDial(String paramString)
  {
    Intent localIntent = new Intent();
    localIntent.setAction("android.intent.action.CALL");
    localIntent.setData(Uri.parse("tel:" + paramString));
    this.this$0.startActivity(localIntent);
  }
  
  public void retryUploadSVideo(String paramString1, String paramString2, String paramString3)
  {
    this.this$0.cwjHandler.post(new MainActivity.WebviewClick.15(this, paramString1, paramString3, paramString2));
  }
  
  public void saveUser(String paramString1, String paramString2)
  {
    MainActivity.access$15(paramString1);
    MainActivity.access$16(paramString2);
  }
  
  public void startSVideo(String paramString1, int paramInt1, int paramInt2, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String[] paramArrayOfString) {}
  
  public void startSVideoVerify(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9)
  {
    MainActivity.access$19(this.this$0, paramString5);
  }
  
  public void startSVideoVerify(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, String paramString11)
  {
    MainActivity.access$19(this.this$0, paramString5);
    MainActivity.access$20(this.this$0, paramString11);
  }
  
  public void syncOpenInfo(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    if (MainActivity.access$12(this.this$0) == null)
    {
      WriteLogFile.witeLog(">>> openAccountResponseHandler为null...");
      return;
    }
    HashMap localHashMap = new HashMap();
    if ("0".equals(paramString1))
    {
      localHashMap.put("idNo", paramString2);
      localHashMap.put("clientName", paramString3);
      localHashMap.put("mobiletelephone", paramString4);
      localHashMap.put("bankAccount", paramString5);
      localHashMap.put("source", paramString6);
      localHashMap.put("timestamp", paramString7);
      MainActivity.access$12(this.this$0).resultHandler(this.this$0.mainActivity, localHashMap);
      return;
    }
    MainActivity.access$12(this.this$0).faultHandler(this.this$0.mainActivity, localHashMap);
  }
  
  public void takePictures(int paramInt, String paramString)
  {
    MainActivity.access$1(this.this$0, "");
    MainActivity.access$2(this.this$0, paramInt);
    MainActivity.access$3(this.this$0, paramString);
    MainActivity.access$5(this.this$0, MainActivity.access$4(this.this$0));
    this.this$0.cwjHandler.post(new MainActivity.WebviewClick.1(this, paramInt));
  }
  
  public void takePictures(int paramInt, String paramString1, String paramString2)
  {
    MainActivity.access$1(this.this$0, paramString2);
    MainActivity.access$2(this.this$0, paramInt);
    MainActivity.access$3(this.this$0, paramString1);
    MainActivity.access$5(this.this$0, MainActivity.access$4(this.this$0));
    this.this$0.cwjHandler.post(new MainActivity.WebviewClick.2(this, paramInt));
  }
  
  public void takePictures(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    MainActivity.access$2(this.this$0, paramInt);
    MainActivity.access$7(this.this$0, paramString1);
    MainActivity.access$3(this.this$0, paramString2);
    MainActivity.access$5(this.this$0, paramString3);
    MainActivity.access$8(this.this$0, paramString4);
    this.this$0.cwjHandler.post(new MainActivity.WebviewClick.3(this, paramInt));
  }
  
  public void uploadLog()
  {
    MainActivity.access$9(this.this$0).uploadLog(WriteLogFile.logFile, WriteLogFile.readMobile());
  }
  
  public void witeMobile(String paramString) {}
  
  public void wvHasClickEnvent(int paramInt) {}
  
  public void wvHasClickEnvent(Map<String, String> paramMap)
  {
    int i = Integer.valueOf((String)paramMap.get("type")).intValue();
    Intent localIntent;
    if (i == 3)
    {
      int j = Integer.valueOf((String)paramMap.get("userId")).intValue();
      int k = Integer.valueOf((String)paramMap.get("empNo")).intValue();
      str1 = (String)paramMap.get("videoServer");
      str2 = (String)paramMap.get("videoPort");
      String str3 = (String)paramMap.get("roomId");
      localIntent = new Intent();
      localIntent.putExtra("userId", j);
      localIntent.putExtra("empId", k);
      if ((str1 != null) && (!"".equals(str1)))
      {
        localIntent.putExtra("videoServer", str1);
        if ((str2 == null) || ("".equals(str2))) {
          break label397;
        }
        localIntent.putExtra("videoPort", Integer.valueOf(str2));
        label188:
        if ((str3 == null) || ("".equals(str3))) {
          break label410;
        }
        localIntent.putExtra("roomId", Integer.valueOf(str3));
        label218:
        localIntent.setClass(this.this$0, VideoActivity.class);
        this.this$0.startActivity(localIntent);
        this.this$0.overridePendingTransition(MResource.getIdByName("anim", "fade"), MResource.getIdByName("anim", "hold"));
      }
    }
    else
    {
      if (i != 6) {
        break label439;
      }
      str1 = this.this$0.certHandle.setPassword((String)paramMap.get("pass"));
      WriteLogFile.witeLog("MainActivity 设置证书密码操作 pass：" + (String)paramMap.get("pass"));
      if ((paramMap.get("callback") != null) && (!"".equals(paramMap.get("callback")))) {
        break label423;
      }
      paramMap = "APP_cert.setPassCallBack";
      label360:
      this.this$0.cwjHandler.post(new MainActivity.WebviewClick.4(this, paramMap, str1));
    }
    label397:
    label410:
    label423:
    label439:
    do
    {
      return;
      localIntent.putExtra("videoServer", "");
      break;
      localIntent.putExtra("videoPort", 0);
      break label188;
      localIntent.putExtra("roomId", 0);
      break label218;
      paramMap = (String)paramMap.get("callback");
      break label360;
      if (i == 7)
      {
        WriteLogFile.witeLog("MainActivity 保存证书操作 sn：" + (String)paramMap.get("sn"));
        str1 = (String)paramMap.get("sn");
        str2 = (String)paramMap.get("cert");
        this.this$0.certHandle.saveCert(str1, str2);
        this.this$0.cwjHandler.post(new MainActivity.WebviewClick.5(this));
      }
      if (i == 9)
      {
        WriteLogFile.witeLog("MainActivity 检测SN操作：" + (String)paramMap.get("sn"));
        str2 = (String)paramMap.get("sn");
        if ((paramMap.get("callback") != null) && (!"".equals(paramMap.get("callback")))) {
          break label819;
        }
        str1 = "APP_cert.certSignCallBack";
        str2 = this.this$0.certHandle.checkSn(str2);
        this.this$0.cwjHandler.post(new MainActivity.WebviewClick.6(this, str1, str2));
      }
    } while (i != 8);
    WriteLogFile.witeLog("MainActivity 私钥签名操作：" + (String)paramMap.get("sn"));
    Log.i("CRH_MainActivity", "MainActivity 私钥签名操作：" + (String)paramMap.get("sn"));
    String str1 = (String)paramMap.get("text");
    String str2 = (String)paramMap.get("sn");
    if ((paramMap.get("callback") == null) || ("".equals(paramMap.get("callback")))) {}
    for (paramMap = "APP_cert.certSignCallBack";; paramMap = (String)paramMap.get("callback"))
    {
      str1 = this.this$0.certHandle.sign(str2, str1);
      this.this$0.cwjHandler.post(new MainActivity.WebviewClick.7(this, paramMap, str1));
      return;
      label819:
      str1 = (String)paramMap.get("callback");
      break;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\MainActivity$WebviewClick.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */