package com.cairh.app.sjkh.handle;

import android.annotation.SuppressLint;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.webkit.JavascriptInterface;
import android.widget.Toast;
import com.cairh.app.sjkh.MainActivity;
import com.cairh.app.sjkh.common.WriteLogFile;
import com.cairh.app.sjkh.util.BlockFileUploadUtil;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JtoJHandle
{
  public static final int TYPE_CERTPASS = 6;
  public static final int TYPE_CERTSAVE = 7;
  public static final int TYPE_CERTSIGN = 8;
  public static final int TYPE_CHECKSN = 9;
  public static final int TYPE_HIDDVIDEO = 5;
  public static final int TYPE_LOAD = 1;
  public static final int TYPE_SHOWVIDEO = 2;
  public static final int TYPE_SHUTVIDEO = 4;
  public static final int TYPE_STARTVIDEO = 3;
  private Context context;
  public JtoJHandle.wvClientClickListener wvEnventPro = null;
  
  public JtoJHandle(Context paramContext)
  {
    this.context = paramContext;
  }
  
  @JavascriptInterface
  public void callFunction(int paramInt)
  {
    if (this.wvEnventPro != null) {
      this.wvEnventPro.wvHasClickEnvent(paramInt);
    }
  }
  
  @JavascriptInterface
  public void callFunctionCertPass(String paramString)
  {
    if (this.wvEnventPro != null)
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("type", "6");
      localHashMap.put("pass", paramString);
      this.wvEnventPro.wvHasClickEnvent(localHashMap);
    }
  }
  
  @JavascriptInterface
  public void callFunctionCertSaveCert(String paramString1, String paramString2)
  {
    if (this.wvEnventPro != null)
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("type", "7");
      localHashMap.put("sn", paramString1);
      localHashMap.put("cert", paramString2);
      this.wvEnventPro.wvHasClickEnvent(localHashMap);
    }
  }
  
  @JavascriptInterface
  public void callFunctionCertSign(String paramString1, String paramString2, String paramString3)
  {
    if (this.wvEnventPro != null)
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("type", "8");
      String str;
      if (paramString2 != null)
      {
        str = paramString2;
        if (!"".equals(paramString2)) {}
      }
      else
      {
        str = "";
      }
      localHashMap.put("text", str);
      if (paramString1 != null)
      {
        paramString2 = paramString1;
        if (!"".equals(paramString1)) {}
      }
      else
      {
        paramString2 = "";
      }
      localHashMap.put("sn", paramString2);
      if (paramString3 != null)
      {
        paramString1 = paramString3;
        if (!"".equals(paramString3)) {}
      }
      else
      {
        paramString1 = "";
      }
      localHashMap.put("callback", paramString1);
      this.wvEnventPro.wvHasClickEnvent(localHashMap);
    }
  }
  
  @JavascriptInterface
  public void callFunctionWithP(int paramInt, String paramString1, String paramString2)
  {
    if (this.wvEnventPro != null)
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("type", paramInt);
      localHashMap.put("userId", paramString1);
      localHashMap.put("empNo", paramString2);
      this.wvEnventPro.wvHasClickEnvent(localHashMap);
    }
  }
  
  @JavascriptInterface
  public void callFunctionWithP(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    if (this.wvEnventPro != null)
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("type", paramInt);
      localHashMap.put("userId", paramString1);
      localHashMap.put("empNo", paramString2);
      localHashMap.put("videoServer", paramString3);
      localHashMap.put("videoPort", paramString4);
      localHashMap.put("roomId", paramString5);
      this.wvEnventPro.wvHasClickEnvent(localHashMap);
    }
  }
  
  @JavascriptInterface
  public void callbackCertPass(String paramString1, String paramString2)
  {
    if (this.wvEnventPro != null)
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("type", "6");
      localHashMap.put("pass", paramString1);
      if (paramString2 != null)
      {
        paramString1 = paramString2;
        if (!"".equals(paramString2)) {}
      }
      else
      {
        paramString1 = "";
      }
      localHashMap.put("callback", paramString1);
      this.wvEnventPro.wvHasClickEnvent(localHashMap);
    }
  }
  
  @JavascriptInterface
  public void checkAppVersion(String paramString)
  {
    if (this.wvEnventPro != null) {
      this.wvEnventPro.checkAppVersion(paramString);
    }
  }
  
  @JavascriptInterface
  public void checkLocalSn(String paramString1, String paramString2)
  {
    if (this.wvEnventPro != null)
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("type", "9");
      String str;
      if (paramString1 != null)
      {
        str = paramString1;
        if (!"".equals(paramString1)) {}
      }
      else
      {
        str = "";
      }
      localHashMap.put("sn", str);
      if (paramString2 != null)
      {
        paramString1 = paramString2;
        if (!"".equals(paramString2)) {}
      }
      else
      {
        paramString1 = "";
      }
      localHashMap.put("callback", paramString1);
      this.wvEnventPro.wvHasClickEnvent(localHashMap);
    }
  }
  
  @JavascriptInterface
  public void checkSJKHSDKVersion(String paramString)
  {
    if (this.wvEnventPro != null) {
      this.wvEnventPro.checkSJKHSDKVersion(paramString);
    }
  }
  
  @JavascriptInterface
  public void closeSJKH()
  {
    if (this.wvEnventPro != null) {
      this.wvEnventPro.closeSJKH();
    }
  }
  
  @JavascriptInterface
  public void closeStartPage()
  {
    this.wvEnventPro.closeBg();
  }
  
  @JavascriptInterface
  @SuppressLint({"NewApi"})
  public void copy2Clipboard(String paramString)
  {
    ((ClipboardManager)this.context.getSystemService("clipboard")).setText(paramString);
    Toast.makeText(this.context, "复制成功", 1).show();
  }
  
  @JavascriptInterface
  public void download(String paramString)
  {
    paramString = new Intent("android.intent.action.VIEW", Uri.parse(paramString));
    this.context.startActivity(paramString);
  }
  
  @JavascriptInterface
  public void getAccountInfo(String paramString)
  {
    this.wvEnventPro.getAccountInfo(paramString);
  }
  
  @JavascriptInterface
  public void getBrokerCode(String paramString)
  {
    Object localObject1 = WriteLogFile.readBranchInfo();
    if (localObject1 != null)
    {
      localObject1 = ((String)localObject1).split("#");
      if ((localObject1 != null) && (localObject1.length == 2)) {
        Object localObject2 = localObject1[0];
      }
    }
    for (localObject1 = localObject1[1];; localObject1 = "")
    {
      ((MainActivity)this.context).callJSFunc(paramString + "('" + (String)localObject1 + "');");
      return;
    }
  }
  
  @JavascriptInterface
  public void getChannelInfo(String paramString)
  {
    Object localObject = this.context.getSharedPreferences("channelInfo", 0);
    String str1 = ((SharedPreferences)localObject).getString("usability", "");
    String str2 = ((SharedPreferences)localObject).getString("shortUrl", "");
    String str3 = ((SharedPreferences)localObject).getString("branchNo", "");
    String str4 = ((SharedPreferences)localObject).getString("branchName", "");
    String str5 = ((SharedPreferences)localObject).getString("brokerCode", "");
    String str6 = ((SharedPreferences)localObject).getString("brokerMobile", "");
    String str7 = ((SharedPreferences)localObject).getString("brokerName", "");
    String str8 = ((SharedPreferences)localObject).getString("bankCode", "");
    String str9 = ((SharedPreferences)localObject).getString("bankName", "");
    localObject = ((SharedPreferences)localObject).getString("note", "");
    MainActivity.getA().callJSFunc(paramString + "('" + str1 + "','" + str2 + "','" + str3 + "','" + str4 + "','" + str5 + "','" + str6 + "','" + str7 + "','" + str8 + "','" + str9 + "','" + (String)localObject + "')");
  }
  
  @JavascriptInterface
  public void getMacAddress()
  {
    if (this.wvEnventPro != null) {
      this.wvEnventPro.getMacAddress();
    }
  }
  
  @JavascriptInterface
  public void getNetInfo(String paramString)
  {
    this.wvEnventPro.getNetInfo(paramString);
  }
  
  @JavascriptInterface
  public void getProd(String paramString)
  {
    this.wvEnventPro.getProd(paramString);
  }
  
  @JavascriptInterface
  public void getRegistMobileNo()
  {
    if (this.wvEnventPro != null) {
      this.wvEnventPro.getRegistMobileNo();
    }
  }
  
  @JavascriptInterface
  public void getUploadStatus(String paramString1, String paramString2)
  {
    int i = BlockFileUploadUtil.getUploadStatus(paramString2);
    int j = BlockFileUploadUtil.getBlockNum();
    int k = BlockFileUploadUtil.getBlockIndex();
    MainActivity.getA().callJSFunc(paramString1 + "(" + i + "," + j + "," + k + ")");
  }
  
  @JavascriptInterface
  public void getUser(String paramString)
  {
    this.wvEnventPro.getUser(paramString);
  }
  
  @JavascriptInterface
  public void jsCallNative(String paramString)
  {
    Object localObject = null;
    int i;
    do
    {
      int j;
      do
      {
        try
        {
          paramString = new JSONArray(paramString);
          if (paramString == null) {
            return;
          }
        }
        catch (JSONException paramString)
        {
          for (;;)
          {
            paramString.printStackTrace();
            paramString = (String)localObject;
          }
          j = paramString.length();
          i = 0;
        }
      } while (i >= j);
      localObject = paramString.optJSONObject(i);
    } while (localObject == null);
    int k = ((JSONObject)localObject).optInt("action");
    localObject = ((JSONObject)localObject).optString("callback");
    switch (k)
    {
    }
    for (;;)
    {
      i += 1;
      break;
      if (this.wvEnventPro != null)
      {
        this.wvEnventPro.getRegistMobileNo();
        continue;
        if (this.wvEnventPro != null)
        {
          this.wvEnventPro.getDeviceModel((String)localObject);
          continue;
          if (this.wvEnventPro != null)
          {
            this.wvEnventPro.getMacAddress();
            continue;
            if (this.wvEnventPro != null) {
              this.wvEnventPro.checkAppVersion((String)localObject);
            }
          }
        }
      }
    }
  }
  
  @JavascriptInterface
  public void location()
  {
    location(null);
  }
  
  @JavascriptInterface
  public void location(String paramString)
  {
    if (this.wvEnventPro != null) {
      this.wvEnventPro.location(paramString);
    }
  }
  
  @JavascriptInterface
  public void openPreviewVideo(String paramString)
  {
    this.wvEnventPro.openPreviewVideo(paramString);
  }
  
  @JavascriptInterface
  public void openVideoCall(String paramString1, String paramString2, String paramString3)
  {
    this.wvEnventPro.openVideoCall(paramString1, paramString2, paramString3);
  }
  
  @JavascriptInterface
  public void openWebNatrue(String paramString)
  {
    this.wvEnventPro.openWebNatrue(paramString);
  }
  
  @JavascriptInterface
  public void pushUploadAddr(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    if (this.wvEnventPro != null) {
      this.wvEnventPro.pushUploadAddr(paramString1, paramString2, paramString3, paramString4);
    }
  }
  
  @JavascriptInterface
  public void quickDial(String paramString)
  {
    if (this.wvEnventPro != null) {
      this.wvEnventPro.quickDial(paramString);
    }
  }
  
  @JavascriptInterface
  public void removeCookie()
  {
    this.wvEnventPro.clearCookie();
  }
  
  @JavascriptInterface
  public void retryUploadSVideo(String paramString1, String paramString2, String paramString3)
  {
    this.wvEnventPro.retryUploadSVideo(paramString1, paramString2, paramString3);
  }
  
  @JavascriptInterface
  public void saveBranchInfo(String paramString1, String paramString2)
  {
    WriteLogFile.saveBranchInfo(paramString1, paramString2);
  }
  
  @JavascriptInterface
  public void saveUser(String paramString1, String paramString2)
  {
    this.wvEnventPro.saveUser(paramString1, paramString2);
  }
  
  @JavascriptInterface
  public void setChannelInfo(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10)
  {
    SharedPreferences.Editor localEditor = this.context.getSharedPreferences("channelInfo", 0).edit();
    localEditor.putString("usability", paramString1);
    localEditor.putString("shortUrl", paramString2);
    localEditor.putString("branchNo", paramString3);
    localEditor.putString("branchName", paramString4);
    localEditor.putString("brokerCode", paramString5);
    localEditor.putString("brokerMobile", paramString6);
    localEditor.putString("brokerName", paramString7);
    localEditor.putString("bankCode", paramString8);
    localEditor.putString("bankName", paramString9);
    localEditor.putString("note", paramString10);
    localEditor.commit();
  }
  
  @JavascriptInterface
  public void setWvClientClickListener(JtoJHandle.wvClientClickListener paramwvClientClickListener)
  {
    this.wvEnventPro = paramwvClientClickListener;
  }
  
  @JavascriptInterface
  public void startSVideo(String paramString1, int paramInt1, int paramInt2, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String[] paramArrayOfString)
  {
    System.out.println("------------------ 启动单向视频步骤 ---------------------------------");
    this.wvEnventPro.startSVideo(paramString1, paramInt1, paramInt2, paramString2, paramString3, paramString4, paramString5, paramString6, paramArrayOfString);
  }
  
  @JavascriptInterface
  public void startSVideoVerify(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9)
  {
    this.wvEnventPro.startSVideoVerify(paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramString7, paramString8, paramString9);
  }
  
  @JavascriptInterface
  public void startSVideoVerify(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, String paramString11)
  {
    this.wvEnventPro.startSVideoVerify(paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramString7, paramString8, paramString9, paramString10, paramString11);
  }
  
  @JavascriptInterface
  public void syncOpenInfo(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    if (this.wvEnventPro != null) {
      this.wvEnventPro.syncOpenInfo(paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramString7);
    }
  }
  
  @JavascriptInterface
  public void takePictures(int paramInt, String paramString)
  {
    if (this.wvEnventPro != null) {
      this.wvEnventPro.takePictures(paramInt, paramString);
    }
  }
  
  @JavascriptInterface
  public void takePictures(int paramInt, String paramString1, String paramString2)
  {
    if (this.wvEnventPro != null) {
      this.wvEnventPro.takePictures(paramInt, paramString1, paramString2);
    }
  }
  
  @JavascriptInterface
  public void takePictures(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    if (this.wvEnventPro != null) {
      this.wvEnventPro.takePictures(paramInt, paramString1, paramString2, paramString3, paramString4);
    }
  }
  
  @JavascriptInterface
  public void updateApp(String paramString1, String paramString2)
  {
    paramString2 = new Intent("android.intent.action.VIEW", Uri.parse(paramString2));
    this.context.startActivity(paramString2);
    if ((!"1".equals(paramString1)) && ("2".equals(paramString1))) {
      ((MainActivity)this.context).superFinish();
    }
  }
  
  @JavascriptInterface
  public void uploadLog()
  {
    if (this.wvEnventPro != null) {
      this.wvEnventPro.uploadLog();
    }
  }
  
  @JavascriptInterface
  public void witeMobile(String paramString)
  {
    if (this.wvEnventPro != null) {
      this.wvEnventPro.witeMobile(paramString);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\handle\JtoJHandle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */