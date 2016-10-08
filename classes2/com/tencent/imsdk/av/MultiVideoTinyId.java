package com.tencent.imsdk.av;

import com.tencent.TIMValueCallBack;
import com.tencent.imsdk.IMMsfCoreProxy;
import com.tencent.imsdk.IMMsfUserInfo;
import com.tencent.imsdk.QLog;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.openqq.IMCmdListener;
import com.tencent.openqq.protocol.imsdk.relay.ReqBody;

public class MultiVideoTinyId
{
  static MultiVideoTinyId inst = new MultiVideoTinyId();
  private static final String tag = "IMSdk.MultiVideoTinyId";
  
  public static MultiVideoTinyId get()
  {
    return inst;
  }
  
  public void requestMultiVideoApp(byte[] paramArrayOfByte, TIMValueCallBack<byte[]> paramTIMValueCallBack)
  {
    QLog.i("IMSdk.MultiVideoTinyId", 1, "multivideo|requestMultiVideoApp");
    requestOpenImRelay(IMMsfCoreProxy.get().getSdkType() + ".pbvideoapp", paramArrayOfByte, paramTIMValueCallBack, 0L);
  }
  
  public void requestMultiVideoApp(byte[] paramArrayOfByte, TIMValueCallBack<byte[]> paramTIMValueCallBack, long paramLong)
  {
    QLog.i("IMSdk.MultiVideoTinyId", 1, "multivideo|requestMultiVideoApp");
    requestOpenImRelay(IMMsfCoreProxy.get().getSdkType() + ".pbvideoapp", paramArrayOfByte, paramTIMValueCallBack, paramLong);
  }
  
  public void requestMultiVideoApp(byte[] paramArrayOfByte, IMCmdListener paramIMCmdListener)
  {
    QLog.i("IMSdk.MultiVideoTinyId", 1, "multivideo|requestMultiVideoApp");
    requestOpenImRelay(IMMsfCoreProxy.get().getSdkType() + ".pbvideoapp", paramArrayOfByte, paramIMCmdListener);
  }
  
  public void requestMultiVideoInfo(byte[] paramArrayOfByte, TIMValueCallBack<byte[]> paramTIMValueCallBack)
  {
    QLog.i("IMSdk.MultiVideoTinyId", 1, "multivideo|requestMultiVideoInfo");
    requestOpenImRelay(IMMsfCoreProxy.get().getSdkType() + ".pbvideoinfo", paramArrayOfByte, paramTIMValueCallBack, 0L);
  }
  
  public void requestMultiVideoInfo(byte[] paramArrayOfByte, TIMValueCallBack<byte[]> paramTIMValueCallBack, long paramLong)
  {
    QLog.i("IMSdk.MultiVideoTinyId", 1, "multivideo|requestMultiVideoInfo");
    requestOpenImRelay(IMMsfCoreProxy.get().getSdkType() + ".pbvideoinfo", paramArrayOfByte, paramTIMValueCallBack, paramLong);
  }
  
  public void requestMultiVideoInfo(byte[] paramArrayOfByte, IMCmdListener paramIMCmdListener)
  {
    QLog.i("IMSdk.MultiVideoTinyId", 1, "multivideo|requestMultiVideoInfo");
    requestOpenImRelay(IMMsfCoreProxy.get().getSdkType() + ".pbvideoinfo", paramArrayOfByte, paramIMCmdListener);
  }
  
  public void requestOpenImRelay(String paramString, byte[] paramArrayOfByte, TIMValueCallBack<byte[]> paramTIMValueCallBack, long paramLong)
  {
    Object localObject2 = IMMsfCoreProxy.get().getAnyOnLineMsfUserInfo();
    Object localObject1 = localObject2;
    if (localObject2 == null)
    {
      QLog.w("IMSdk.MultiVideoTinyId", 1, "MutivideoTinyId|requestOpenImRelay no user online");
      localObject1 = new IMMsfUserInfo();
    }
    localObject2 = new relay.ReqBody();
    ((relay.ReqBody)localObject2).reqbody.set(ByteStringMicro.copyFrom(paramArrayOfByte));
    ((relay.ReqBody)localObject2).reqbody.setHasFlag(true);
    IMMsfCoreProxy.get().request(((IMMsfUserInfo)localObject1).getUserId(), paramString, ((relay.ReqBody)localObject2).toByteArray(), new ʼ(this, paramTIMValueCallBack, paramString), paramLong);
  }
  
  public void requestOpenImRelay(String paramString, byte[] paramArrayOfByte, IMCmdListener paramIMCmdListener)
  {
    Object localObject2 = IMMsfCoreProxy.get().getAnyOnLineMsfUserInfo();
    Object localObject1 = localObject2;
    if (localObject2 == null)
    {
      QLog.w("IMSdk.MultiVideoTinyId", 1, "MutivideoTinyId|requestOpenImRelay no user online");
      localObject1 = new IMMsfUserInfo();
    }
    localObject2 = new relay.ReqBody();
    ((relay.ReqBody)localObject2).reqbody.set(ByteStringMicro.copyFrom(paramArrayOfByte));
    ((relay.ReqBody)localObject2).reqbody.setHasFlag(true);
    paramArrayOfByte = new ʻ(this, paramIMCmdListener, paramString);
    IMMsfCoreProxy.get().request(((IMMsfUserInfo)localObject1).getUserId(), paramString, ((relay.ReqBody)localObject2).toByteArray(), paramArrayOfByte);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imsdk\av\MultiVideoTinyId.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */