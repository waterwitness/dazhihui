package com.tencent.imsdk.av;

import com.tencent.TIMCallBack;
import com.tencent.TIMValueCallBack;
import com.tencent.imsdk.IMMsfCoreProxy;
import com.tencent.imsdk.IMMsfUserInfo;
import com.tencent.imsdk.QLog;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBEnumField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;
import com.tencent.openqq.IMPushListener;
import com.tencent.openqq.IMReqListener;
import com.tencent.openqq.protocol.imsdk.general.ReqBody;
import com.tencent.openqq.protocol.imsdk.head.C2CInfo;
import com.tencent.openqq.protocol.imsdk.head.ContentHead;
import com.tencent.openqq.protocol.imsdk.head.InstCtrl;
import com.tencent.openqq.protocol.imsdk.head.InstInfo;
import com.tencent.openqq.protocol.imsdk.head.MsgHead;
import com.tencent.openqq.protocol.imsdk.head.RoutineHead;
import com.tencent.openqq.protocol.imsdk.msg.MsgBody;
import com.tencent.openqq.protocol.imsdk.msg_common.Msg;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class SharpTinyId
{
  static SharpTinyId inst = new SharpTinyId();
  private static final String tag = "MSF.C.SharpTinyId";
  
  public static SharpTinyId get()
  {
    return inst;
  }
  
  public TIMValueCallBack<byte[]> getSharpSvrPushCallBack()
  {
    QLog.i("MSF.C.SharpTinyId", 1, "sharp|getSharpSvrPushCallBack");
    IMMsfUserInfo localIMMsfUserInfo = IMMsfCoreProxy.get().getAnyOnLineMsfUserInfo();
    if (localIMMsfUserInfo == null)
    {
      QLog.e("MSF.C.SharpTinyId", 1, "sharp|setSharpSvrRspListener no user online");
      return null;
    }
    return (TIMValueCallBack)localIMMsfUserInfo.getCmd2PushCallBack().get("im_open_push.msg_push_734");
  }
  
  public IMPushListener getSharpSvrPushListener()
  {
    QLog.i("MSF.C.SharpTinyId", 1, "sharp|getSharpSvrPushListener");
    IMMsfUserInfo localIMMsfUserInfo = IMMsfCoreProxy.get().getAnyOnLineMsfUserInfo();
    if (localIMMsfUserInfo == null)
    {
      QLog.e("MSF.C.SharpTinyId", 1, "sharp|getSharpSvrPushListener no user online");
      return null;
    }
    return (IMPushListener)localIMMsfUserInfo.getCmd2PushListener().get("im_open_push.msg_push_734");
  }
  
  public TIMValueCallBack<byte[]> getSharpSvrRspCallBack()
  {
    QLog.i("MSF.C.SharpTinyId", 1, "sharp|getSharpSvrRspCallBack");
    IMMsfUserInfo localIMMsfUserInfo = IMMsfCoreProxy.get().getAnyOnLineMsfUserInfo();
    if (localIMMsfUserInfo == null)
    {
      QLog.e("MSF.C.SharpTinyId", 1, "sharp|setSharpSvrRspListener no user online");
      return null;
    }
    return (TIMValueCallBack)localIMMsfUserInfo.getCmd2PushCallBack().get("OnlinePush.SharpSvr.c2sack_734");
  }
  
  public IMPushListener getSharpSvrRspListener()
  {
    QLog.i("MSF.C.SharpTinyId", 1, "sharp|getSharpSvrRspListener");
    IMMsfUserInfo localIMMsfUserInfo = IMMsfCoreProxy.get().getAnyOnLineMsfUserInfo();
    if (localIMMsfUserInfo == null)
    {
      QLog.e("MSF.C.SharpTinyId", 1, "sharp|getSharpSvrRspListener no user online");
      return null;
    }
    return (IMPushListener)localIMMsfUserInfo.getCmd2PushListener().get("OnlinePush.SharpSvr.c2sack_734");
  }
  
  public void requestSharpSvr(byte paramByte, long paramLong1, byte[] paramArrayOfByte, TIMCallBack paramTIMCallBack, long paramLong2)
  {
    IMMsfUserInfo localIMMsfUserInfo = IMMsfCoreProxy.get().getAnyOnLineMsfUserInfo();
    if (localIMMsfUserInfo == null)
    {
      QLog.e("MSF.C.SharpTinyId", 1, "sharp|req failed no user online");
      return;
    }
    general.ReqBody localReqBody = new general.ReqBody();
    localReqBody.msg_msg.setHasFlag(true);
    localReqBody.msg_msg.msg_msg_head.setHasFlag(true);
    localReqBody.msg_msg.msg_msg_head.msg_content_head.setHasFlag(true);
    localReqBody.msg_msg.msg_msg_head.msg_content_head.uint32_type.set(561);
    localReqBody.msg_msg.msg_msg_head.msg_content_head.uint32_subtype.set(0);
    localReqBody.msg_msg.msg_msg_head.msg_content_head.uint32_seq.set(IMMsfCoreProxy.get().msgSeq.incrementAndGet() & 0xFFFF);
    localReqBody.msg_msg.msg_msg_head.msg_content_head.uint32_rand.set(IMMsfCoreProxy.get().random.nextInt());
    localReqBody.msg_msg.msg_msg_head.msg_content_head.uint32_client_time.set((int)(System.currentTimeMillis() / 1000L));
    localReqBody.msg_msg.msg_msg_head.msg_routine_head.setHasFlag(true);
    localReqBody.msg_msg.msg_msg_head.msg_routine_head.msg_c2c_info.setHasFlag(true);
    localReqBody.msg_msg.msg_msg_head.msg_routine_head.msg_c2c_info.enum_from_uin_type.set(5);
    localReqBody.msg_msg.msg_msg_head.msg_routine_head.msg_c2c_info.enum_to_uin_type.set(5);
    localReqBody.msg_msg.msg_msg_head.msg_routine_head.msg_c2c_info.uint64_from_uin.set(localIMMsfUserInfo.getTinyid());
    localReqBody.msg_msg.msg_msg_head.msg_routine_head.msg_c2c_info.uint64_to_uin.set(paramLong1);
    localReqBody.msg_msg.msg_msg_head.msg_routine_head.msg_inst_ctrl.setHasFlag(true);
    localReqBody.msg_msg.msg_msg_head.msg_routine_head.msg_inst_ctrl.msg_from_inst.setHasFlag(true);
    localReqBody.msg_msg.msg_msg_head.msg_routine_head.msg_inst_ctrl.msg_from_inst.uint32_productid.set(IMMsfCoreProxy.get().getSdkAppId());
    localReqBody.msg_msg.msg_msg_body.setHasFlag(true);
    localReqBody.msg_msg.msg_msg_body.msg_content.setHasFlag(true);
    localReqBody.msg_msg.msg_msg_body.msg_content.set(ByteStringMicro.copyFrom(paramArrayOfByte));
    IMMsfCoreProxy.get().request(localIMMsfUserInfo.getUserId(), "im_open_msg.sharp", localReqBody.toByteArray(), new ʾ(this, paramTIMCallBack), paramLong2);
  }
  
  public void requestSharpSvr(byte paramByte, long paramLong, byte[] paramArrayOfByte, IMReqListener paramIMReqListener)
  {
    Object localObject2 = IMMsfCoreProxy.get().getAnyOnLineMsfUserInfo();
    Object localObject1 = localObject2;
    if (localObject2 == null)
    {
      QLog.w("MSF.C.SharpTinyId", 1, "sharp|request srv ont online");
      localObject1 = new IMMsfUserInfo();
    }
    localObject2 = new general.ReqBody();
    ((general.ReqBody)localObject2).msg_msg.setHasFlag(true);
    ((general.ReqBody)localObject2).msg_msg.msg_msg_head.setHasFlag(true);
    ((general.ReqBody)localObject2).msg_msg.msg_msg_head.msg_content_head.setHasFlag(true);
    ((general.ReqBody)localObject2).msg_msg.msg_msg_head.msg_content_head.uint32_type.set(561);
    ((general.ReqBody)localObject2).msg_msg.msg_msg_head.msg_content_head.uint32_subtype.set(0);
    ((general.ReqBody)localObject2).msg_msg.msg_msg_head.msg_content_head.uint32_seq.set(IMMsfCoreProxy.get().msgSeq.incrementAndGet() & 0xFFFF);
    ((general.ReqBody)localObject2).msg_msg.msg_msg_head.msg_content_head.uint32_rand.set(IMMsfCoreProxy.get().random.nextInt());
    ((general.ReqBody)localObject2).msg_msg.msg_msg_head.msg_content_head.uint32_client_time.set((int)(System.currentTimeMillis() / 1000L));
    ((general.ReqBody)localObject2).msg_msg.msg_msg_head.msg_routine_head.setHasFlag(true);
    ((general.ReqBody)localObject2).msg_msg.msg_msg_head.msg_routine_head.msg_c2c_info.setHasFlag(true);
    ((general.ReqBody)localObject2).msg_msg.msg_msg_head.msg_routine_head.msg_c2c_info.enum_from_uin_type.set(5);
    ((general.ReqBody)localObject2).msg_msg.msg_msg_head.msg_routine_head.msg_c2c_info.enum_to_uin_type.set(5);
    ((general.ReqBody)localObject2).msg_msg.msg_msg_head.msg_routine_head.msg_c2c_info.uint64_from_uin.set(((IMMsfUserInfo)localObject1).getTinyid());
    ((general.ReqBody)localObject2).msg_msg.msg_msg_head.msg_routine_head.msg_c2c_info.uint64_to_uin.set(paramLong);
    ((general.ReqBody)localObject2).msg_msg.msg_msg_head.msg_routine_head.msg_inst_ctrl.setHasFlag(true);
    ((general.ReqBody)localObject2).msg_msg.msg_msg_head.msg_routine_head.msg_inst_ctrl.msg_from_inst.setHasFlag(true);
    ((general.ReqBody)localObject2).msg_msg.msg_msg_head.msg_routine_head.msg_inst_ctrl.msg_from_inst.uint32_productid.set(IMMsfCoreProxy.get().getSdkAppId());
    ((general.ReqBody)localObject2).msg_msg.msg_msg_body.setHasFlag(true);
    ((general.ReqBody)localObject2).msg_msg.msg_msg_body.msg_content.setHasFlag(true);
    ((general.ReqBody)localObject2).msg_msg.msg_msg_body.msg_content.set(ByteStringMicro.copyFrom(paramArrayOfByte));
    paramArrayOfByte = new ʽ(this, paramIMReqListener);
    IMMsfCoreProxy.get().request(((IMMsfUserInfo)localObject1).getUserId(), "im_open_msg.sharp", ((general.ReqBody)localObject2).toByteArray(), paramArrayOfByte);
  }
  
  public void requestSharpSvr(long paramLong, byte[] paramArrayOfByte, TIMCallBack paramTIMCallBack)
  {
    QLog.i("MSF.C.SharpTinyId", 1, "sharp|requestSharpSvr");
    requestSharpSvr((byte)1, paramLong, paramArrayOfByte, paramTIMCallBack, 0L);
  }
  
  public void requestSharpSvr(long paramLong1, byte[] paramArrayOfByte, TIMCallBack paramTIMCallBack, long paramLong2)
  {
    QLog.i("MSF.C.SharpTinyId", 1, "sharp|requestSharpSvr");
    requestSharpSvr((byte)1, paramLong1, paramArrayOfByte, paramTIMCallBack, paramLong2);
  }
  
  public void requestSharpSvr(long paramLong, byte[] paramArrayOfByte, IMReqListener paramIMReqListener)
  {
    QLog.i("MSF.C.SharpTinyId", 1, "sharp|requestSharpSvr");
    requestSharpSvr((byte)1, paramLong, paramArrayOfByte, paramIMReqListener);
  }
  
  public void responseSharpSvr(long paramLong, byte[] paramArrayOfByte, TIMCallBack paramTIMCallBack)
  {
    QLog.i("MSF.C.SharpTinyId", 1, "sharp|responseSharpSvr");
    requestSharpSvr((byte)4, paramLong, paramArrayOfByte, paramTIMCallBack, 0L);
  }
  
  public void responseSharpSvr(long paramLong1, byte[] paramArrayOfByte, TIMCallBack paramTIMCallBack, long paramLong2)
  {
    QLog.i("MSF.C.SharpTinyId", 1, "sharp|responseSharpSvr");
    requestSharpSvr((byte)4, paramLong1, paramArrayOfByte, paramTIMCallBack, paramLong2);
  }
  
  public void responseSharpSvr(long paramLong, byte[] paramArrayOfByte, IMReqListener paramIMReqListener)
  {
    QLog.i("MSF.C.SharpTinyId", 1, "sharp|responseSharpSvr");
    requestSharpSvr((byte)4, paramLong, paramArrayOfByte, paramIMReqListener);
  }
  
  public void setSharpSvrPushCallBack(TIMValueCallBack<byte[]> paramTIMValueCallBack)
  {
    QLog.i("MSF.C.SharpTinyId", 1, "sharp|setSharpSvrPushCallBack");
    IMMsfUserInfo localIMMsfUserInfo = IMMsfCoreProxy.get().getAnyOnLineMsfUserInfo();
    if (localIMMsfUserInfo == null)
    {
      QLog.e("MSF.C.SharpTinyId", 1, "sharp|setSharpSvrRspListener no user online");
      return;
    }
    localIMMsfUserInfo.setPushCallBack("im_open_push.msg_push_734", paramTIMValueCallBack);
  }
  
  public void setSharpSvrPushListener(IMPushListener paramIMPushListener)
  {
    QLog.i("MSF.C.SharpTinyId", 1, "sharp|setSharpSvrPushListener");
    IMMsfUserInfo localIMMsfUserInfo = IMMsfCoreProxy.get().getAnyOnLineMsfUserInfo();
    if (localIMMsfUserInfo == null)
    {
      QLog.e("MSF.C.SharpTinyId", 1, "sharp|setSharpSvrPushListener no user online");
      return;
    }
    localIMMsfUserInfo.setPushListener("im_open_push.msg_push_734", paramIMPushListener);
  }
  
  public void setSharpSvrRspCallBack(TIMValueCallBack<byte[]> paramTIMValueCallBack)
  {
    QLog.i("MSF.C.SharpTinyId", 1, "sharp|setSharpSvrRspCallBack");
    IMMsfUserInfo localIMMsfUserInfo = IMMsfCoreProxy.get().getAnyOnLineMsfUserInfo();
    if (localIMMsfUserInfo == null)
    {
      QLog.e("MSF.C.SharpTinyId", 1, "sharp|setSharpSvrRspListener no user online");
      return;
    }
    localIMMsfUserInfo.setPushCallBack("OnlinePush.SharpSvr.c2sack_734", paramTIMValueCallBack);
  }
  
  public void setSharpSvrRspListener(IMPushListener paramIMPushListener)
  {
    QLog.i("MSF.C.SharpTinyId", 1, "sharp|setSharpSvrRspListener");
    IMMsfUserInfo localIMMsfUserInfo = IMMsfCoreProxy.get().getAnyOnLineMsfUserInfo();
    if (localIMMsfUserInfo == null)
    {
      QLog.e("MSF.C.SharpTinyId", 1, "sharp|setSharpSvrRspListener no user online");
      return;
    }
    localIMMsfUserInfo.setPushListener("OnlinePush.SharpSvr.c2sack_734", paramIMPushListener);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imsdk\av\SharpTinyId.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */