package com.tencent.av.Message;

import com.tencent.TIMCallBack;
import com.tencent.TIMUser;
import com.tencent.imsdk.IMMsfCoreProxy;
import com.tencent.imsdk.IMMsfUserInfo;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.InvalidProtocolBufferMicroException;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBInt32Field;
import com.tencent.mobileqq.pb.PBRepeatMessageField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.openqq.protocol.imsdk.msg.MsgBody;
import com.tencent.openqq.protocol.imsdk.videoinvitation.MsgBody;
import com.tencent.openqq.protocol.imsdk.videoinvitation.UserInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AvMsg0x32
  extends AvMsg
{
  private String identifer = "";
  
  public AvMsg0x32(String paramString)
  {
    this.identifer = paramString;
  }
  
  private int get0x32MsgType()
  {
    switch (ʽ.a[getMsgType().ordinal()])
    {
    case 1: 
    default: 
      return 0;
    case 2: 
      return 1;
    case 3: 
      return 2;
    }
    return 3;
  }
  
  private void set0x32MsgType(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 0: 
      setMsgType(AvMsg.Type.MutiAvInvitation);
      return;
    case 1: 
      setMsgType(AvMsg.Type.MutiAvCancel);
      return;
    case 2: 
      setMsgType(AvMsg.Type.MutiAvAccept);
      return;
    }
    setMsgType(AvMsg.Type.MutiAvReject);
  }
  
  public void receive(byte[] paramArrayOfByte)
  {
    videoinvitation.MsgBody localMsgBody = new videoinvitation.MsgBody();
    try
    {
      localMsgBody.mergeFrom(paramArrayOfByte);
      set0x32MsgType(localMsgBody.int32_request_type.get());
      paramArrayOfByte = new TIMUser();
      paramArrayOfByte.setAppIdAt3rd(localMsgBody.msg_sender.bytes_appid.get().toStringUtf8());
      paramArrayOfByte.setIdentifier(localMsgBody.msg_sender.bytes_openid.get().toStringUtf8());
      paramArrayOfByte.setAccountType(localMsgBody.msg_sender.bytes_acounttype.get().toStringUtf8());
      setSender(paramArrayOfByte);
      this.bussType = localMsgBody.int32_buss_type.get();
      this.authType = localMsgBody.int32_auth_type.get();
      this.auth_id = localMsgBody.uint32_auth_id.get();
      return;
    }
    catch (InvalidProtocolBufferMicroException paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
    }
  }
  
  public void response(TIMCallBack paramTIMCallBack)
  {
    IMMsfUserInfo localIMMsfUserInfo = IMMsfCoreProxy.get().getMsfUserInfo(this.identifer);
    if (localIMMsfUserInfo == null) {
      localIMMsfUserInfo = new IMMsfUserInfo();
    }
    for (;;)
    {
      videoinvitation.MsgBody localMsgBody = new videoinvitation.MsgBody();
      localMsgBody.int32_buss_type.set(this.bussType);
      localMsgBody.int32_auth_type.set(this.authType);
      localMsgBody.uint32_auth_id.set(this.auth_id);
      addReceivers(getSender());
      localMsgBody.uint32_sdk_appid.set(IMMsfCoreProxy.get().getSdkAppId());
      localMsgBody.int32_request_type.set(get0x32MsgType());
      Object localObject = new videoinvitation.UserInfo();
      ((videoinvitation.UserInfo)localObject).bytes_appid.set(ByteStringMicro.copyFromUtf8(localIMMsfUserInfo.getsUerAppId()));
      ((videoinvitation.UserInfo)localObject).bytes_openid.set(ByteStringMicro.copyFromUtf8(localIMMsfUserInfo.getUserId()));
      ((videoinvitation.UserInfo)localObject).bytes_acounttype.set(ByteStringMicro.copyFromUtf8(IMMsfCoreProxy.get().getUidType()));
      localMsgBody.msg_sender.set((MessageMicro)localObject);
      localObject = new ArrayList();
      if (getReceivers() != null)
      {
        Iterator localIterator = getReceivers().iterator();
        while (localIterator.hasNext())
        {
          TIMUser localTIMUser = (TIMUser)localIterator.next();
          videoinvitation.UserInfo localUserInfo = new videoinvitation.UserInfo();
          localUserInfo.bytes_acounttype.set(ByteStringMicro.copyFromUtf8(localTIMUser.getAccountType()));
          localUserInfo.bytes_appid.set(ByteStringMicro.copyFromUtf8(localTIMUser.getAppIdAt3rd()));
          localUserInfo.bytes_openid.set(ByteStringMicro.copyFromUtf8(localTIMUser.getIdentifier()));
          ((List)localObject).add(localUserInfo);
        }
        localMsgBody.rpt_msg_receiver_list.set((List)localObject);
      }
      localObject = new msg.MsgBody();
      ((msg.MsgBody)localObject).msg_content.set(ByteStringMicro.copyFrom(localMsgBody.toByteArray()));
      IMMsfCoreProxy.get().request(localIMMsfUserInfo.getUserId(), "openim.videoinvitaion", ((msg.MsgBody)localObject).toByteArray(), new ʼ(this, paramTIMCallBack));
      return;
    }
  }
  
  public void send(TIMCallBack paramTIMCallBack)
  {
    IMMsfUserInfo localIMMsfUserInfo = IMMsfCoreProxy.get().getMsfUserInfo(this.identifer);
    if (localIMMsfUserInfo == null) {
      localIMMsfUserInfo = new IMMsfUserInfo();
    }
    for (;;)
    {
      videoinvitation.MsgBody localMsgBody = new videoinvitation.MsgBody();
      localMsgBody.int32_buss_type.set(this.bussType);
      localMsgBody.int32_auth_type.set(this.authType);
      localMsgBody.uint32_auth_id.set(this.auth_id);
      localMsgBody.uint32_sdk_appid.set(IMMsfCoreProxy.get().getSdkAppId());
      localMsgBody.int32_request_type.set(get0x32MsgType());
      Object localObject = new videoinvitation.UserInfo();
      ((videoinvitation.UserInfo)localObject).bytes_appid.set(ByteStringMicro.copyFromUtf8(localIMMsfUserInfo.getsUerAppId()));
      ((videoinvitation.UserInfo)localObject).bytes_openid.set(ByteStringMicro.copyFromUtf8(localIMMsfUserInfo.getUserId()));
      ((videoinvitation.UserInfo)localObject).bytes_acounttype.set(ByteStringMicro.copyFromUtf8(IMMsfCoreProxy.get().getUidType()));
      localMsgBody.msg_sender.set((MessageMicro)localObject);
      localObject = new ArrayList();
      if (getReceivers() != null)
      {
        Iterator localIterator = getReceivers().iterator();
        while (localIterator.hasNext())
        {
          TIMUser localTIMUser = (TIMUser)localIterator.next();
          videoinvitation.UserInfo localUserInfo = new videoinvitation.UserInfo();
          localUserInfo.bytes_acounttype.set(ByteStringMicro.copyFromUtf8(localTIMUser.getAccountType()));
          localUserInfo.bytes_appid.set(ByteStringMicro.copyFromUtf8(localTIMUser.getAppIdAt3rd()));
          localUserInfo.bytes_openid.set(ByteStringMicro.copyFromUtf8(localTIMUser.getIdentifier()));
          ((List)localObject).add(localUserInfo);
        }
        localMsgBody.rpt_msg_receiver_list.set((List)localObject);
      }
      localObject = new msg.MsgBody();
      ((msg.MsgBody)localObject).msg_content.set(ByteStringMicro.copyFrom(localMsgBody.toByteArray()));
      IMMsfCoreProxy.get().request(localIMMsfUserInfo.getUserId(), "openim.videoinvitaion", ((msg.MsgBody)localObject).toByteArray(), new ʻ(this, paramTIMCallBack));
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\Message\AvMsg0x32.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */