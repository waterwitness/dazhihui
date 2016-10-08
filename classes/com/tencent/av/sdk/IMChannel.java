package com.tencent.av.sdk;

import com.qq.taf.jce.HexUtil;
import com.tencent.TIMLogLevel;
import com.tencent.TIMManager;
import com.tencent.av.utils.QLog;
import com.tencent.timint.TIMIntManager;
import java.util.ArrayList;

public class IMChannel
{
  public static final int ERR_FAILED = 1;
  public static final int ERR_OK = 0;
  public static final String LOGTAG = "IMChannel";
  public static final int LOG_LEVEL_SDK_FAULT = 5;
  public static final int LOG_LEVEL_SDK_INFO = 6;
  public static final String buglyAPPID = "900011370";
  public int mNativeEntity;
  
  public IMChannel(int paramInt)
  {
    this.mNativeEntity = paramInt;
  }
  
  public static String getLogDir()
  {
    return TIMManager.getInstance().getLogPath();
  }
  
  public static int getServerEnvType()
  {
    return -1;
  }
  
  public static boolean isEnablePrintLog()
  {
    return TIMManager.getInstance().getIsLogPrintEnabled();
  }
  
  public static boolean isEnableWriteLog()
  {
    return TIMLogLevel.OFF != TIMManager.getInstance().getLogLevel();
  }
  
  public static void log2bugly(String paramString, int paramInt)
  {
    if (6 == paramInt)
    {
      TIMIntManager.getInstance().logBugly(TIMLogLevel.INFO, "avsdk", paramString);
      return;
    }
    if (5 == paramInt)
    {
      TIMIntManager.getInstance().logBugly(TIMLogLevel.ERROR, "avsdk", paramString);
      return;
    }
    TIMIntManager.getInstance().logBugly(TIMLogLevel.DEBUG, "avsdk", paramString);
  }
  
  public static void setAvSDKVersionToBugly(String paramString)
  {
    TIMIntManager.getInstance().setAvSDKVersionToBugly("900011370", paramString);
  }
  
  public long getSelfTinyId()
  {
    long l = TIMIntManager.getInstance().getTinyId();
    QLog.d("IMChannel", 0, "GetSelfTinyId selfTinyId: " + l);
    return l;
  }
  
  public void identifierToTinyId(IMChannel.ToTinyIdParam paramToTinyIdParam, int paramInt)
  {
    int i = 0;
    QLog.d("IMChannel", 0, "java IMChannel identifierToTinyId");
    int j = paramToTinyIdParam.identifierList.length;
    ArrayList localArrayList = new ArrayList();
    while (i < j)
    {
      localArrayList.add(paramToTinyIdParam.identifierList[i]);
      i += 1;
    }
    TIMIntManager.getInstance().userIdToTinyId(localArrayList, new IMChannel.IdToIdCallback(this, paramInt));
  }
  
  public void multiVideoAppRequest(byte[] paramArrayOfByte, int paramInt)
  {
    TIMIntManager.getInstance().requestMultiVideoApp(paramArrayOfByte, new IMChannel.MultiVideoCallback(this, paramInt));
  }
  
  public void multiVideoConfigRequest(byte[] paramArrayOfByte, int paramInt)
  {
    QLog.i("IMChannel", 0, "multiVideoConfigRequest length:" + paramArrayOfByte.length + ", data: " + HexUtil.bytes2HexStr(paramArrayOfByte));
    TIMIntManager.getInstance().request("VideoCCSvc.opensdk", paramArrayOfByte, new IMChannel.MultiVideoCallback(this, paramInt));
  }
  
  public void multiVideoInfoRequest(byte[] paramArrayOfByte, int paramInt)
  {
    TIMIntManager.getInstance().requestMultiVideoInfo(paramArrayOfByte, new IMChannel.MultiVideoCallback(this, paramInt));
  }
  
  public native void nativeIdToIdCallback(int paramInt, IMChannel.IdToIdResult paramIdToIdResult);
  
  public native void nativeMultiVideoCallback(int paramInt, IMChannel.MultiVideoResult paramMultiVideoResult);
  
  public native void nativeQualityReportCallback(int paramInt, IMChannel.QualityReportResult paramQualityReportResult);
  
  public void qualityReportRequest(byte[] paramArrayOfByte, int paramInt)
  {
    TIMIntManager.getInstance().requestQualityReport(1, paramArrayOfByte, new IMChannel.QualityReportCallback(this, paramInt));
  }
  
  public void tinyIdToIdentifier(long[] paramArrayOfLong, int paramInt)
  {
    int j = paramArrayOfLong.length;
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < j)
    {
      localArrayList.add(Long.valueOf(paramArrayOfLong[i]));
      i += 1;
    }
    TIMIntManager.getInstance().tinyIdToUserId(localArrayList, new IMChannel.IdToIdCallback(this, paramInt));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\sdk\IMChannel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */