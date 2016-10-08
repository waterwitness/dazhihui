package com.tencent.timint;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.tencent.TIMCallBack;
import com.tencent.TIMConnListener;
import com.tencent.TIMLogLevel;
import com.tencent.TIMNetworkStatus;
import com.tencent.TIMUser;
import com.tencent.TIMValueCallBack;
import com.tencent.imsdk.IMMsfCoreProxy;
import com.tencent.imsdk.IMMsfUserInfo;
import com.tencent.imsdk.QLog;
import com.tencent.imsdk.av.MultiVideoTinyId;
import com.tencent.imsdk.av.SharpTinyId;
import com.tencent.imsdk.userid.TIMTinyIdToUserId;
import com.tencent.imsdk.userid.TIMUserIdToTinyId;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBEnumField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;
import com.tencent.openqq.protocol.imsdk.quality_report.CommonInfo;
import com.tencent.openqq.protocol.imsdk.quality_report.DeviceInfo;
import com.tencent.openqq.protocol.imsdk.quality_report.NetworkInfo;
import com.tencent.openqq.protocol.imsdk.quality_report.ReportContent;
import com.tencent.openqq.protocol.imsdk.quality_report.ReqBody;
import com.tencent.openqq.protocol.imsdk.quality_report.SystemInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public class TIMIntManager
{
  static TIMIntManager inst = new TIMIntManager();
  private static IMMsfCoreProxy msfCoreProxy = ;
  private static final String tag = "MSF.C.TIMIntManager";
  private TIMConnListener connListener = null;
  DBHelper dbhelper = new DBHelper(msfCoreProxy.getContext(), "QualityReport.db");
  
  public static TIMIntManager getInstance()
  {
    return inst;
  }
  
  public TIMConnListener getConnectionListener()
  {
    return this.connListener;
  }
  
  int getDeviceType()
  {
    Context localContext = msfCoreProxy.getContext();
    if ((((TelephonyManager)localContext.getSystemService("phone")).getPhoneType() != 0) && ((localContext.getResources().getConfiguration().screenLayout & 0xF) < 3)) {
      return 2;
    }
    return 3;
  }
  
  public TIMNetworkStatus getNetworkStatus()
  {
    return IMMsfCoreProxy.get().getNetworkStatus();
  }
  
  int getNetworkType()
  {
    NetworkInfo localNetworkInfo = ((ConnectivityManager)msfCoreProxy.getContext().getSystemService("connectivity")).getActiveNetworkInfo();
    if ((localNetworkInfo != null) && (localNetworkInfo.isConnected()))
    {
      int i = localNetworkInfo.getType();
      if (i == 1) {
        return 5;
      }
      if (i == 0) {
        if (!TextUtils.isEmpty(Proxy.getDefaultHost())) {
          return 1;
        }
      }
      switch (localNetworkInfo.getSubtype())
      {
      default: 
        return 6;
      case 1: 
      case 2: 
      case 4: 
      case 7: 
      case 11: 
        return 2;
      case 3: 
      case 5: 
      case 6: 
      case 8: 
      case 9: 
      case 10: 
      case 12: 
      case 14: 
      case 15: 
        return 3;
      }
      return 4;
    }
    return 0;
  }
  
  public long getTinyId()
  {
    IMMsfUserInfo localIMMsfUserInfo2 = IMMsfCoreProxy.get().getAnyOnLineMsfUserInfo();
    IMMsfUserInfo localIMMsfUserInfo1;
    if (localIMMsfUserInfo2 != null)
    {
      localIMMsfUserInfo1 = localIMMsfUserInfo2;
      if (localIMMsfUserInfo2.isLoggedIn()) {}
    }
    else
    {
      QLog.e("MSF.C.TIMIntManager", 1, "TIMIntManager|request no user online");
      localIMMsfUserInfo1 = new IMMsfUserInfo();
    }
    return localIMMsfUserInfo1.getTinyid();
  }
  
  public void logBugly(TIMLogLevel paramTIMLogLevel, String paramString1, String paramString2)
  {
    IMMsfCoreProxy.get().logBugly(paramTIMLogLevel, paramString1, paramString2);
  }
  
  public void request(String paramString, byte[] paramArrayOfByte, TIMValueCallBack<byte[]> paramTIMValueCallBack)
  {
    IMMsfUserInfo localIMMsfUserInfo2 = IMMsfCoreProxy.get().getAnyOnLineMsfUserInfo();
    IMMsfUserInfo localIMMsfUserInfo1;
    if (localIMMsfUserInfo2 != null)
    {
      localIMMsfUserInfo1 = localIMMsfUserInfo2;
      if (localIMMsfUserInfo2.isLoggedIn()) {}
    }
    else
    {
      QLog.e("MSF.C.TIMIntManager", 1, "TIMIntManager|request no user online");
      localIMMsfUserInfo1 = new IMMsfUserInfo();
    }
    msfCoreProxy.request(localIMMsfUserInfo1.getUserId(), paramString, paramArrayOfByte, paramTIMValueCallBack);
  }
  
  public void request(String paramString, byte[] paramArrayOfByte, TIMValueCallBack<byte[]> paramTIMValueCallBack, long paramLong)
  {
    IMMsfUserInfo localIMMsfUserInfo2 = IMMsfCoreProxy.get().getAnyOnLineMsfUserInfo();
    IMMsfUserInfo localIMMsfUserInfo1;
    if (localIMMsfUserInfo2 != null)
    {
      localIMMsfUserInfo1 = localIMMsfUserInfo2;
      if (localIMMsfUserInfo2.isLoggedIn()) {}
    }
    else
    {
      QLog.e("MSF.C.TIMIntManager", 1, "TIMIntManager|request no user online");
      localIMMsfUserInfo1 = new IMMsfUserInfo();
    }
    msfCoreProxy.request(localIMMsfUserInfo1.getUserId(), paramString, paramArrayOfByte, paramTIMValueCallBack, paramLong);
  }
  
  public void requestMultiVideoApp(byte[] paramArrayOfByte, TIMValueCallBack<byte[]> paramTIMValueCallBack)
  {
    MultiVideoTinyId.get().requestMultiVideoApp(paramArrayOfByte, paramTIMValueCallBack, 0L);
  }
  
  public void requestMultiVideoApp(byte[] paramArrayOfByte, TIMValueCallBack<byte[]> paramTIMValueCallBack, long paramLong)
  {
    MultiVideoTinyId.get().requestMultiVideoApp(paramArrayOfByte, paramTIMValueCallBack, paramLong);
  }
  
  public void requestMultiVideoInfo(byte[] paramArrayOfByte, TIMValueCallBack<byte[]> paramTIMValueCallBack)
  {
    MultiVideoTinyId.get().requestMultiVideoInfo(paramArrayOfByte, paramTIMValueCallBack, 0L);
  }
  
  public void requestMultiVideoInfo(byte[] paramArrayOfByte, TIMValueCallBack<byte[]> paramTIMValueCallBack, long paramLong)
  {
    MultiVideoTinyId.get().requestMultiVideoInfo(paramArrayOfByte, paramTIMValueCallBack, paramLong);
  }
  
  public void requestQualityReport(int paramInt, byte[] paramArrayOfByte, TIMCallBack paramTIMCallBack)
  {
    QLog.d("MSF.C.TIMIntManager", 1, "quality report, type: " + paramInt + ", data: " + paramArrayOfByte);
    quality_report.ReqBody localReqBody = new quality_report.ReqBody();
    localReqBody.uint32_sdkappid.set(msfCoreProxy.getSdkAppId());
    localReqBody.uint64_from_uin.set(getTinyId());
    localReqBody.uint32_timestamp.set((int)System.currentTimeMillis() / 1000);
    localReqBody.uint32_seq.set(msfCoreProxy.random.nextInt());
    localReqBody.msg_common_info.setHasFlag(true);
    localReqBody.msg_common_info.msg_device_info.setHasFlag(true);
    localReqBody.msg_common_info.msg_device_info.enum_device_type.set(getDeviceType());
    localReqBody.msg_common_info.msg_device_info.str_device_board.set(Build.BOARD);
    localReqBody.msg_common_info.msg_device_info.str_device_brand.set(Build.BRAND);
    localReqBody.msg_common_info.msg_device_info.str_device_model.set(Build.MODEL);
    localReqBody.msg_common_info.msg_device_info.str_device_cpu_abi.set(Build.CPU_ABI);
    localReqBody.msg_common_info.msg_system_info.setHasFlag(true);
    localReqBody.msg_common_info.msg_system_info.enum_os_type.set(1);
    localReqBody.msg_common_info.msg_system_info.str_os_version.set(Build.VERSION.RELEASE);
    localReqBody.msg_common_info.msg_network_info.setHasFlag(true);
    localReqBody.msg_common_info.msg_network_info.enum_network_type.set(getNetworkType());
    localReqBody.msg_report_content.setHasFlag(true);
    localReqBody.msg_report_content.uint32_type.set(paramInt);
    localReqBody.msg_report_content.bytes_report_data.set(ByteStringMicro.copyFrom(paramArrayOfByte));
    request("AVQualityReportSvc.C2S", localReqBody.toByteArray(), new ʼ(this, localReqBody, paramTIMCallBack));
  }
  
  public void requestSharpSvr(long paramLong, byte[] paramArrayOfByte, TIMCallBack paramTIMCallBack)
  {
    SharpTinyId.get().requestSharpSvr(paramLong, paramArrayOfByte, paramTIMCallBack, 0L);
  }
  
  public void requestSharpSvr(long paramLong1, byte[] paramArrayOfByte, TIMCallBack paramTIMCallBack, long paramLong2)
  {
    SharpTinyId.get().requestSharpSvr(paramLong1, paramArrayOfByte, paramTIMCallBack, paramLong2);
  }
  
  void resendLocalQualityReport(String paramString)
  {
    QLog.d("MSF.C.TIMIntManager", 1, "start to resend local quality report");
    Object localObject = this.dbhelper.read();
    if (localObject == null) {
      QLog.d("MSF.C.TIMIntManager", 1, "failed to get map from db");
    }
    for (;;)
    {
      return;
      localObject = ((Map)localObject).entrySet().iterator();
      while (((Iterator)localObject).hasNext())
      {
        Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
        int i = Integer.parseInt((String)localEntry.getKey());
        request(paramString, (byte[])localEntry.getValue(), new ʻ(this, i));
      }
    }
  }
  
  public void responseSharpSvr(long paramLong, byte[] paramArrayOfByte, TIMCallBack paramTIMCallBack)
  {
    SharpTinyId.get().requestSharpSvr(paramLong, paramArrayOfByte, paramTIMCallBack, 0L);
  }
  
  public void responseSharpSvr(long paramLong1, byte[] paramArrayOfByte, TIMCallBack paramTIMCallBack, long paramLong2)
  {
    SharpTinyId.get().requestSharpSvr(paramLong1, paramArrayOfByte, paramTIMCallBack, paramLong2);
  }
  
  public void setAvSDKVersionToBugly(String paramString1, String paramString2)
  {
    IMMsfCoreProxy.get().setAvSDKVersionToBugly(paramString1, paramString2);
  }
  
  public void setBuglyDebugMode(boolean paramBoolean)
  {
    IMMsfCoreProxy.get().enableBuglyDebugMode(paramBoolean);
  }
  
  public void setConnectionListener(TIMConnListener paramTIMConnListener)
  {
    this.connListener = paramTIMConnListener;
  }
  
  public void setReqTimeout(long paramLong)
  {
    msfCoreProxy.setReqTimeout(paramLong);
  }
  
  public void setSharpSvrPushCallBack(TIMValueCallBack<byte[]> paramTIMValueCallBack)
  {
    SharpTinyId.get().setSharpSvrPushCallBack(paramTIMValueCallBack);
  }
  
  public void setSharpSvrRspCallBack(TIMValueCallBack<byte[]> paramTIMValueCallBack)
  {
    SharpTinyId.get().setSharpSvrRspCallBack(paramTIMValueCallBack);
  }
  
  void storeQualityReportToLocal(quality_report.ReqBody paramReqBody)
  {
    QLog.d("MSF.C.TIMIntManager", 1, "store quality report to local");
    if (!this.dbhelper.insert(paramReqBody.toByteArray())) {
      QLog.d("MSF.C.TIMIntManager", 1, "Failed to store reqbody to local, uin: " + paramReqBody.uint64_from_uin.get() + " timestamp: " + paramReqBody.uint32_timestamp.get() + " seq: " + paramReqBody.uint32_seq);
    }
  }
  
  public void tinyIdToUserId(List<Long> paramList, TIMValueCallBack<List<TIMUser>> paramTIMValueCallBack)
  {
    tinyIdToUserId(paramList, paramTIMValueCallBack, 0L);
  }
  
  public void tinyIdToUserId(List<Long> paramList, TIMValueCallBack<List<TIMUser>> paramTIMValueCallBack, long paramLong)
  {
    TIMTinyIdToUserId.get().tinyIdToUserId(paramList, paramTIMValueCallBack, paramLong);
  }
  
  public void userIdToTinyId(List<String> paramList, TIMValueCallBack<List<TIMUser>> paramTIMValueCallBack)
  {
    userIdToTinyId(paramList, paramTIMValueCallBack, 0L);
  }
  
  public void userIdToTinyId(List<String> paramList, TIMValueCallBack<List<TIMUser>> paramTIMValueCallBack, long paramLong)
  {
    ArrayList localArrayList = new ArrayList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      TIMUser localTIMUser = new TIMUser();
      localTIMUser.setAccountType(IMMsfCoreProxy.get().getUidType());
      localTIMUser.setAppIdAt3rd(String.valueOf(IMMsfCoreProxy.get().getSdkAppId()));
      localTIMUser.setIdentifier(str);
      localArrayList.add(localTIMUser);
    }
    TIMUserIdToTinyId.get().userIdToTinyId(localArrayList, paramTIMValueCallBack, paramLong);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\timint\TIMIntManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */