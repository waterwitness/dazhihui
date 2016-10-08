package com.tencent.av;

import android.text.TextUtils;
import com.tencent.TIMCallBack;
import com.tencent.TIMManager;
import com.tencent.TIMUser;
import com.tencent.TIMValueCallBack;
import com.tencent.av.Message.AvMsg;
import com.tencent.av.Message.AvMsg.Type;
import com.tencent.av.Message.AvMsg0x32;
import com.tencent.av.Message.TIMAvMessageListener;
import com.tencent.imsdk.IMMsfCoreProxy;
import com.tencent.imsdk.IMMsfUserInfo;
import com.tencent.imsdk.av.MultiVideoTinyId;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBInt32Field;
import com.tencent.mobileqq.pb.PBRepeatField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;
import com.tencent.openqq.protocol.imsdk.gv_comm_operate.GVCommOprHead;
import com.tencent.openqq.protocol.imsdk.gv_comm_operate.ReqBody;
import com.tencent.openqq.protocol.imsdk.gv_comm_operate.SubReq_0x5;
import com.tencent.openqq.protocol.imsdk.gv_comm_operate.SubReq_0x6;
import com.tencent.openqq.protocol.imsdk.msg.MsgBody;
import com.tencent.openqq.protocol.imsdk.videoinvitation.MsgBody;
import com.tencent.openqq.protocol.imsdk.videoinvitation.UserInfo;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

public class TIMAvManager
{
  static String defaultId;
  protected static final char[] hexArray = "0123456789ABCDEF".toCharArray();
  private static IMMsfCoreProxy msfCoreProxy = ;
  static ConcurrentHashMap<String, TIMAvManager> mutiMap;
  private static final String tag = "MSF.C.TIMAvManager";
  private String identifier = "";
  private TIMAvMessageListener messageListener;
  
  static
  {
    defaultId = "";
    mutiMap = new ConcurrentHashMap();
  }
  
  private TIMAvManager(String paramString)
  {
    this.identifier = paramString;
  }
  
  private static String bytesToHex(byte[] paramArrayOfByte)
  {
    char[] arrayOfChar = new char[paramArrayOfByte.length << 1];
    int i = 0;
    while (i < paramArrayOfByte.length)
    {
      int j = paramArrayOfByte[i] & 0xFF;
      arrayOfChar[(i << 1)] = hexArray[(j >>> 4)];
      arrayOfChar[((i << 1) + 1)] = hexArray[(j & 0xF)];
      i += 1;
    }
    return new String(arrayOfChar);
  }
  
  public static TIMAvManager getInstance()
  {
    return getInstanceById(TIMManager.getInstance().getIdentification());
  }
  
  public static TIMAvManager getInstanceById(String paramString)
  {
    return new TIMAvManager(paramString);
  }
  
  private IMMsfUserInfo getMsfUserInfo()
  {
    if (TextUtils.isEmpty(this.identifier)) {
      return IMMsfCoreProxy.get().getMsfUserInfo(TIMManager.getInstance().getIdentification());
    }
    return IMMsfCoreProxy.get().getMsfUserInfo(this.identifier);
  }
  
  public void MsgNotify(byte[] paramArrayOfByte)
  {
    if (this.messageListener != null)
    {
      AvMsg0x32 localAvMsg0x32 = new AvMsg0x32(this.identifier);
      localAvMsg0x32.receive(paramArrayOfByte);
      this.messageListener.onNewMessages(localAvMsg0x32);
    }
  }
  
  public void ResponseToVideoInvitation(AvMsg.Type paramType, AvMsg paramAvMsg, TIMCallBack paramTIMCallBack)
  {
    paramAvMsg.setMsgType(paramType);
    paramAvMsg.response(paramTIMCallBack);
  }
  
  public String getIdentifier()
  {
    return this.identifier;
  }
  
  public TIMAvMessageListener getMessageListener()
  {
    return this.messageListener;
  }
  
  public void requestMeasureSpeed(short paramShort1, short paramShort2, TIMCallBack paramTIMCallBack)
  {
    int i = IMMsfCoreProxy.get().getSdkAppId();
    Object localObject = ByteBuffer.allocate(19);
    ((ByteBuffer)localObject).put((byte)2).putShort((short)1).putShort(paramShort1).putShort(paramShort2).putInt(i).putInt(1373272373).putShort((short)0).putShort((short)0);
    localObject = NetworkUtil.formReq(this.identifier, 208, 0, "", ((ByteBuffer)localObject).array());
    MultiVideoTinyId.get().requestMultiVideoInfo((byte[])localObject, new ʽ(this, paramTIMCallBack));
  }
  
  public void requestMultiVideoInvitation(int paramInt1, int paramInt2, int paramInt3, int paramInt4, byte[] paramArrayOfByte, List<TIMUser> paramList, TIMCallBack paramTIMCallBack)
  {
    videoinvitation.MsgBody localMsgBody = new videoinvitation.MsgBody();
    if ((paramArrayOfByte != null) && (paramArrayOfByte.length > 128))
    {
      paramTIMCallBack.onError(-1, "自定义信息长度不能超过128字节");
      return;
    }
    if (paramList.size() <= 0)
    {
      paramTIMCallBack.onError(-1, "邀请人数至少为一人");
      return;
    }
    localMsgBody.int32_buss_type.set(paramInt1);
    localMsgBody.int32_auth_type.set(paramInt2);
    localMsgBody.uint32_auth_id.set(paramInt3);
    localMsgBody.uint32_sdk_appid.set(IMMsfCoreProxy.get().getSdkAppId());
    localMsgBody.int32_request_type.set(paramInt4);
    if (paramArrayOfByte != null) {
      localMsgBody.bytes_buff.set(ByteStringMicro.copyFrom(paramArrayOfByte));
    }
    paramArrayOfByte = new videoinvitation.UserInfo();
    paramArrayOfByte.bytes_appid.set(ByteStringMicro.copyFromUtf8(getMsfUserInfo().getsUerAppId()));
    paramArrayOfByte.bytes_openid.set(ByteStringMicro.copyFromUtf8(getMsfUserInfo().getUserId()));
    paramArrayOfByte.bytes_acounttype.set(ByteStringMicro.copyFromUtf8(IMMsfCoreProxy.get().getUidType()));
    localMsgBody.msg_sender.set(paramArrayOfByte);
    paramArrayOfByte = new ArrayList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      TIMUser localTIMUser = (TIMUser)paramList.next();
      videoinvitation.UserInfo localUserInfo = new videoinvitation.UserInfo();
      localUserInfo.bytes_acounttype.set(ByteStringMicro.copyFromUtf8(localTIMUser.getAccountType()));
      localUserInfo.bytes_appid.set(ByteStringMicro.copyFromUtf8(localTIMUser.getAppIdAt3rd()));
      localUserInfo.bytes_openid.set(ByteStringMicro.copyFromUtf8(localTIMUser.getIdentifier()));
      paramArrayOfByte.add(localUserInfo);
    }
    localMsgBody.rpt_msg_receiver_list.set(paramArrayOfByte);
    paramArrayOfByte = new msg.MsgBody();
    paramArrayOfByte.msg_content.set(ByteStringMicro.copyFrom(localMsgBody.toByteArray()));
    IMMsfCoreProxy.get().request(getMsfUserInfo().getUserId(), "openim.videoinvitaion", paramArrayOfByte.toByteArray(), new ʾ(this, paramTIMCallBack));
  }
  
  void requestMultiVideoRecorderRelay(TIMAvManager.ʼ paramʼ, TIMValueCallBack<List<String>> paramTIMValueCallBack)
  {
    int j = 1;
    gv_comm_operate.GVCommOprHead localGVCommOprHead = new gv_comm_operate.GVCommOprHead();
    localGVCommOprHead.uint32_buss_type.set(paramʼ.a);
    localGVCommOprHead.uint32_auth_type.set(paramʼ.b);
    localGVCommOprHead.uint32_auth_key.set(paramʼ.c);
    localGVCommOprHead.uint64_uin.set(paramʼ.d);
    localGVCommOprHead.uint32_sdk_appid.set(paramʼ.e);
    gv_comm_operate.ReqBody localReqBody = new gv_comm_operate.ReqBody();
    localReqBody.req_0x5.setHasFlag(true);
    localReqBody.req_0x5.uint32_oper.set(paramʼ.f);
    localReqBody.req_0x5.uint32_seq.set(IMMsfCoreProxy.get().random.nextInt());
    if (paramʼ.k != null)
    {
      if (paramʼ.k.filename() != null) {
        localReqBody.req_0x5.string_file_name.set(paramʼ.k.filename());
      }
      localReqBody.req_0x5.uint32_classid.set(paramʼ.k.classId());
      Object localObject = localReqBody.req_0x5.uint32_IsTransCode;
      if (paramʼ.k.isTransCode())
      {
        i = 1;
        ((PBUInt32Field)localObject).set(i);
        localObject = localReqBody.req_0x5.uint32_IsScreenShot;
        if (!paramʼ.k.isScreenShot()) {
          break label321;
        }
        i = 1;
        label225:
        ((PBUInt32Field)localObject).set(i);
        localObject = localReqBody.req_0x5.uint32_IsWaterMark;
        if (!paramʼ.k.isWaterMark()) {
          break label327;
        }
      }
      label321:
      label327:
      for (int i = j;; i = 0)
      {
        ((PBUInt32Field)localObject).set(i);
        localObject = paramʼ.k.tags().iterator();
        while (((Iterator)localObject).hasNext())
        {
          String str = (String)((Iterator)localObject).next();
          localReqBody.req_0x5.string_tags.add(str);
        }
        i = 0;
        break;
        i = 0;
        break label225;
      }
      localReqBody.req_0x5.uint32_sdk_type.set(paramʼ.k.sdktype.getSdkType());
      if (paramʼ.k.stype != TIMAvManager.ʻ.a) {
        localReqBody.req_0x5.uint32_record_data_type.set(paramʼ.k.stype.a());
      }
    }
    paramʼ = NetworkUtil.formReq(this.identifier, paramʼ.h, paramʼ.i, null, localGVCommOprHead.toByteArray(), localReqBody.toByteArray());
    MultiVideoTinyId.get().requestMultiVideoInfo(paramʼ, new ˉ(this, paramTIMValueCallBack));
  }
  
  public void requestMultiVideoRecorderStart(TIMAvManager.RoomInfo paramRoomInfo, TIMAvManager.RecordParam paramRecordParam, TIMCallBack paramTIMCallBack)
  {
    TIMAvManager.ʼ localʼ = new TIMAvManager.ʼ(this, (byte)0);
    localʼ.a = 7;
    localʼ.b = 6;
    localʼ.c = paramRoomInfo.relationId;
    localʼ.i = paramRoomInfo.roomId;
    localʼ.e = IMMsfCoreProxy.get().getSdkAppId();
    localʼ.d = getMsfUserInfo().getTinyid();
    localʼ.k = paramRecordParam;
    localʼ.f = 1;
    localʼ.h = 322;
    requestMultiVideoRecorderRelay(localʼ, new ˆ(this, paramTIMCallBack));
  }
  
  public void requestMultiVideoRecorderStop(TIMAvManager.RoomInfo paramRoomInfo, TIMValueCallBack<List<String>> paramTIMValueCallBack)
  {
    TIMAvManager.ʼ localʼ = new TIMAvManager.ʼ(this, (byte)0);
    localʼ.a = 7;
    localʼ.b = 6;
    localʼ.c = paramRoomInfo.relationId;
    localʼ.i = paramRoomInfo.roomId;
    localʼ.g = null;
    localʼ.e = IMMsfCoreProxy.get().getSdkAppId();
    localʼ.d = getMsfUserInfo().getTinyid();
    localʼ.f = 2;
    localʼ.h = 322;
    requestMultiVideoRecorderRelay(localʼ, paramTIMValueCallBack);
  }
  
  void requestMultiVideoStreamerRelay(TIMAvManager.ʼ paramʼ, TIMValueCallBack<TIMAvManager.StreamRes> paramTIMValueCallBack)
  {
    gv_comm_operate.GVCommOprHead localGVCommOprHead = new gv_comm_operate.GVCommOprHead();
    localGVCommOprHead.uint32_buss_type.set(paramʼ.a);
    localGVCommOprHead.uint32_auth_type.set(paramʼ.b);
    localGVCommOprHead.uint32_auth_key.set(paramʼ.c);
    localGVCommOprHead.uint64_uin.set(paramʼ.d);
    localGVCommOprHead.uint32_sdk_appid.set(paramʼ.e);
    gv_comm_operate.ReqBody localReqBody = new gv_comm_operate.ReqBody();
    localReqBody.req_0x6.setHasFlag(true);
    localReqBody.req_0x6.uint32_oper.set(paramʼ.f);
    if (paramʼ.j != null)
    {
      localReqBody.req_0x6.uint32_live_code.set(paramʼ.j.encode.getEncode());
      localReqBody.req_0x6.uint32_sdk_type.set(paramʼ.j.sdktype.getSdkType());
      if (!TextUtils.isEmpty(paramʼ.j.chnlname)) {
        localReqBody.req_0x6.str_channel_name.set(paramʼ.j.chnlname);
      }
      if (!TextUtils.isEmpty(paramʼ.j.chnldescr)) {
        localReqBody.req_0x6.str_channel_describe.set(paramʼ.j.chnldescr);
      }
      if (!TextUtils.isEmpty(paramʼ.j.chnlpasswd)) {
        localReqBody.req_0x6.str_player_pwd.set(paramʼ.j.chnlpasswd);
      }
      if (paramʼ.j.stype != TIMAvManager.ʻ.a) {
        localReqBody.req_0x6.uint32_push_data_type.set(paramʼ.j.stype.a());
      }
      if (paramʼ.j.isRecord) {
        localReqBody.req_0x6.uint32_tape_flag.set(1);
      }
      if (paramʼ.j.isWatermark)
      {
        localReqBody.req_0x6.uint32_watermark_flag.set(1);
        localReqBody.req_0x6.uint32_watermark_id.set((int)paramʼ.j.watermarkId);
      }
      if (paramʼ.j.rates.size() > 0)
      {
        Iterator localIterator = paramʼ.j.rates.iterator();
        while (localIterator.hasNext())
        {
          TIMAvManager.RateType localRateType = (TIMAvManager.RateType)localIterator.next();
          localReqBody.req_0x6.rpt_rate_type.add(Integer.valueOf(localRateType.getValue()));
        }
      }
    }
    if (paramʼ.l != null) {
      localReqBody.req_0x6.uint64_channel_id.set(paramʼ.l);
    }
    paramʼ = NetworkUtil.formReq(this.identifier, paramʼ.h, paramʼ.i, null, localGVCommOprHead.toByteArray(), localReqBody.toByteArray());
    MultiVideoTinyId.get().requestMultiVideoInfo(paramʼ, new ˈ(this, paramTIMValueCallBack));
  }
  
  public void requestMultiVideoStreamerStart(TIMAvManager.RoomInfo paramRoomInfo, TIMAvManager.StreamParam paramStreamParam, TIMValueCallBack<TIMAvManager.StreamRes> paramTIMValueCallBack)
  {
    Object localObject2 = IMMsfCoreProxy.get().getMsfUserInfo(this.identifier);
    Object localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = new IMMsfUserInfo();
    }
    localObject2 = new TIMAvManager.ʼ(this, (byte)0);
    ((TIMAvManager.ʼ)localObject2).a = 7;
    ((TIMAvManager.ʼ)localObject2).b = 6;
    ((TIMAvManager.ʼ)localObject2).c = paramRoomInfo.relationId;
    ((TIMAvManager.ʼ)localObject2).i = paramRoomInfo.roomId;
    ((TIMAvManager.ʼ)localObject2).j = paramStreamParam;
    ((TIMAvManager.ʼ)localObject2).e = IMMsfCoreProxy.get().getSdkAppId();
    ((TIMAvManager.ʼ)localObject2).d = ((IMMsfUserInfo)localObject1).getTinyid();
    ((TIMAvManager.ʼ)localObject2).f = 1;
    ((TIMAvManager.ʼ)localObject2).h = 320;
    requestMultiVideoStreamerRelay((TIMAvManager.ʼ)localObject2, paramTIMValueCallBack);
  }
  
  public void requestMultiVideoStreamerStop(TIMAvManager.RoomInfo paramRoomInfo, List<Long> paramList, TIMCallBack paramTIMCallBack)
  {
    TIMAvManager.ʼ localʼ = new TIMAvManager.ʼ(this, (byte)0);
    localʼ.a = 7;
    localʼ.b = 6;
    localʼ.c = paramRoomInfo.relationId;
    localʼ.i = paramRoomInfo.roomId;
    localʼ.l = paramList;
    localʼ.e = IMMsfCoreProxy.get().getSdkAppId();
    localʼ.d = getMsfUserInfo().getTinyid();
    localʼ.f = 2;
    localʼ.h = 320;
    requestMultiVideoStreamerRelay(localʼ, new ʿ(this, paramTIMCallBack));
  }
  
  public void setMessageListener(TIMAvMessageListener paramTIMAvMessageListener)
  {
    this.messageListener = paramTIMAvMessageListener;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\TIMAvManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */