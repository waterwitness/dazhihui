package com.tencent.openqq;

import com.tencent.imsdk.IMMsfCoreProxy;
import com.tencent.imsdk.IMMsfUserInfo;
import com.tencent.imsdk.QLog;
import com.tencent.imsdk.av.MultiVideoTinyId;
import com.tencent.imsdk.av.SharpTinyId;
import com.tencent.imsdk.userid.TinyIdToUserId;
import com.tencent.imsdk.userid.UserIdToTinyId;
import java.util.List;

public class IMSdkInt
  extends ʻ
{
  static IMSdkInt sdkint = new IMSdkInt();
  private static final String tag = "openqq.IMSdkInt";
  
  public static IMSdkInt get()
  {
    return sdkint;
  }
  
  public long getTinyId()
  {
    IMMsfUserInfo localIMMsfUserInfo = msfCoreProxy.getAnyOnLineMsfUserInfo();
    if (localIMMsfUserInfo != null) {
      return localIMMsfUserInfo.getTinyid();
    }
    return 0L;
  }
  
  public long getUin()
  {
    return getTinyId();
  }
  
  public void request(String paramString, byte[] paramArrayOfByte, IMCmdListener paramIMCmdListener)
  {
    IMMsfUserInfo localIMMsfUserInfo = msfCoreProxy.getAnyOnLineMsfUserInfo();
    if (localIMMsfUserInfo == null)
    {
      QLog.e("openqq.IMSdkInt", 1, "imsdkint|request no user online!");
      return;
    }
    msfCoreProxy.request(localIMMsfUserInfo.getUserId(), paramString, paramArrayOfByte, paramIMCmdListener);
  }
  
  public void requestMultiVideoApp(byte[] paramArrayOfByte, IMCmdListener paramIMCmdListener)
  {
    MultiVideoTinyId.get().requestMultiVideoApp(paramArrayOfByte, paramIMCmdListener);
  }
  
  public void requestMultiVideoInfo(byte[] paramArrayOfByte, IMCmdListener paramIMCmdListener)
  {
    MultiVideoTinyId.get().requestMultiVideoInfo(paramArrayOfByte, paramIMCmdListener);
  }
  
  public void requestSharpSvr(long paramLong, byte[] paramArrayOfByte, IMReqListener paramIMReqListener)
  {
    if (msfCoreProxy.getSdkType().equals("openim"))
    {
      SharpTinyId.get().requestSharpSvr(paramLong, paramArrayOfByte, paramIMReqListener);
      return;
    }
    msfCoreProxy.getSdkType().equals("openqq");
  }
  
  public void responseSharpSvr(long paramLong, byte[] paramArrayOfByte, IMReqListener paramIMReqListener)
  {
    if (msfCoreProxy.getSdkType().equals("openim"))
    {
      SharpTinyId.get().requestSharpSvr(paramLong, paramArrayOfByte, paramIMReqListener);
      return;
    }
    msfCoreProxy.getSdkType().equals("openqq");
  }
  
  public void setReqTimeout(long paramLong)
  {
    msfCoreProxy.setReqTimeout(paramLong);
  }
  
  public void setSharpSvrPushListener(IMPushListener paramIMPushListener)
  {
    if (msfCoreProxy.getSdkType().equals("openim"))
    {
      SharpTinyId.get().setSharpSvrPushListener(paramIMPushListener);
      return;
    }
    msfCoreProxy.getSdkType().equals("openqq");
  }
  
  public void setSharpSvrRspListener(IMPushListener paramIMPushListener)
  {
    if (msfCoreProxy.getSdkType().equals("openim"))
    {
      SharpTinyId.get().setSharpSvrRspListener(paramIMPushListener);
      return;
    }
    msfCoreProxy.getSdkType().equals("openqq");
  }
  
  public void tinyIdToUserId(List<Long> paramList, IMUserIdListener paramIMUserIdListener)
  {
    if (msfCoreProxy.getSdkType().equals("openim")) {
      TinyIdToUserId.get().tinyIdToUserId(paramList, paramIMUserIdListener);
    }
  }
  
  public void userIdToTinyId(List<IMUserId> paramList, IMUserIdListener paramIMUserIdListener)
  {
    if (msfCoreProxy.getSdkType().equals("openim")) {
      UserIdToTinyId.get().userIdToTinyId(paramList, paramIMUserIdListener);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\openqq\IMSdkInt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */