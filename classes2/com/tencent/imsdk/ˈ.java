package com.tencent.imsdk;

import android.os.Handler;
import android.text.TextUtils;
import com.tencent.IMCoreWrapper;
import com.tencent.IMFunc;
import com.tencent.ProtobufParser;
import com.tencent.TIMExceptionListener;
import com.tencent.TIMManager;
import com.tencent.TIMOfflinePushListener;
import com.tencent.TIMOfflinePushNotification;
import com.tencent.TIMValueCallBack;
import com.tencent.imcore.IMCore;
import com.tencent.imcore.IMCoreUser;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.InvalidProtocolBufferMicroException;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBRepeatField;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;
import com.tencent.openqq.IMPushListener;
import com.tencent.openqq.protocol.imsdk.head.C2CInfo;
import com.tencent.openqq.protocol.imsdk.head.ContentHead;
import com.tencent.openqq.protocol.imsdk.head.MsgHead;
import com.tencent.openqq.protocol.imsdk.head.RoutineHead;
import com.tencent.openqq.protocol.imsdk.log_upload_pb.MsgBody;
import com.tencent.openqq.protocol.imsdk.msg.MsgBody;
import com.tencent.openqq.protocol.imsdk.msg_common.Msg;
import com.tencent.openqq.protocol.imsdk.msg_push.ReqBody;
import com.tencent.openqq.protocol.imsdk.msg_push.RspBody;
import java.util.concurrent.ConcurrentHashMap;

final class ˈ
  implements Runnable
{
  ˈ(ˆ paramˆ, String paramString, byte[] paramArrayOfByte) {}
  
  public final void run()
  {
    Object localObject1;
    int i;
    if (TextUtils.isEmpty(this.a))
    {
      localObject1 = TIMManager.getInstance().getIdentification();
      if (IMMsfCoreProxy.access$100(this.c.a) != 1) {
        break label271;
      }
      i = 1;
      label34:
      if (i == 0) {
        break label783;
      }
    }
    for (;;)
    {
      Object localObject3;
      long l;
      Object localObject4;
      try
      {
        j = IMCore.get().getUser((String)localObject1).manualPush(this.b);
        if ((i == 0) || (j == 1)) {
          localObject3 = new msg_push.ReqBody();
        }
      }
      catch (Throwable localThrowable)
      {
        String str = IMFunc.getExceptionInfo(localThrowable);
        QLog.e("imsdk.IMMsfCoreProxy", 1, str);
        localObject3 = TIMManager.getInstance().getExceptionListener();
        if (localObject3 == null) {
          continue;
        }
        ((TIMExceptionListener)localObject3).onException(str);
        return;
      }
      try
      {
        ((msg_push.ReqBody)localObject3).mergeFrom(this.b);
        i = ((msg_push.ReqBody)localObject3).msg_msg.msg_msg_head.msg_content_head.uint32_type.get();
        j = ((msg_push.ReqBody)localObject3).msg_msg.msg_msg_head.msg_content_head.uint32_subtype.get();
        l = ((msg_push.ReqBody)localObject3).msg_msg.msg_msg_head.msg_routine_head.msg_c2c_info.uint64_to_uin.get();
        localObject4 = IMMsfCoreProxy.get().getMsfUserInfo((String)localObject1);
        if (localObject4 != null) {
          break label315;
        }
        QLog.e("imsdk.IMMsfCoreProxy", 1, "no user found: " + (String)localObject1);
        QLog.d("imsdk.IMMsfCoreProxy", 1, "recv offline push");
        localObject4 = new msg_push.RspBody();
        ((msg_push.RspBody)localObject4).bytes_session_data.setHasFlag(true);
        ((msg_push.RspBody)localObject4).bytes_session_data.set(ByteStringMicro.copyFrom(((msg_push.ReqBody)localObject3).bytes_session_data.get().toByteArray()));
        IMMsfCoreProxy.get().request((String)localObject1, "im_open_push.msg_push", ((msg_push.RspBody)localObject4).toByteArray(), null);
        localObject1 = TIMManager.getInstance().getOfflinePushListener();
        if (localObject1 != null)
        {
          localObject3 = ProtobufParser.offlinePush2PushNotification(this.b);
          if (localObject3 != null) {
            ((TIMOfflinePushListener)localObject1).handleNotification((TIMOfflinePushNotification)localObject3);
          }
        }
        return;
      }
      catch (InvalidProtocolBufferMicroException localInvalidProtocolBufferMicroException1)
      {
        localInvalidProtocolBufferMicroException1.printStackTrace();
        return;
      }
      localObject1 = this.a;
      break;
      label271:
      i = 0;
      break label34;
      label315:
      if (((i == 561) || (i == 734)) && (l != ((IMMsfUserInfo)localObject4).getTinyid()))
      {
        QLog.d("imsdk.IMMsfCoreProxy", 1, "discard other's push: " + l);
        return;
      }
      Object localObject5 = new msg_push.RspBody();
      ((msg_push.RspBody)localObject5).bytes_session_data.setHasFlag(true);
      ((msg_push.RspBody)localObject5).bytes_session_data.set(ByteStringMicro.copyFrom(((msg_push.ReqBody)localObject3).bytes_session_data.get().toByteArray()));
      IMMsfCoreProxy.get().request(localInvalidProtocolBufferMicroException1, "im_open_push.msg_push", ((msg_push.RspBody)localObject5).toByteArray(), null);
      QLog.e("imsdk.IMMsfCoreProxy", 1, "msg type: " + i + " subtype: " + j + "/" + localInvalidProtocolBufferMicroException1);
      if ((i == 561) && (j == 34))
      {
        localObject4 = new log_upload_pb.MsgBody();
        try
        {
          ((log_upload_pb.MsgBody)localObject4).mergeFrom(((msg_push.ReqBody)localObject3).msg_msg.msg_msg_body.msg_content.get().toByteArray());
          localObject3 = ((log_upload_pb.MsgBody)localObject4).rpt_string_tag.get();
          localObject4 = (String)((log_upload_pb.MsgBody)localObject4).rpt_string_logtime.get(0);
          localObject5 = IMCoreWrapper.get().getLogPath();
          localObject4 = (String)localObject5 + (String)localObject3 + "_" + (String)localObject4 + ".log";
          TIMManager.getInstanceById(localInvalidProtocolBufferMicroException1).uploadLogFile((String)localObject4, (String)localObject3);
          return;
        }
        catch (InvalidProtocolBufferMicroException localInvalidProtocolBufferMicroException2)
        {
          QLog.e("imsdk.IMMsfCoreProxy", 1, "parse upload log pb failed");
          localInvalidProtocolBufferMicroException2.printStackTrace();
          return;
        }
      }
      Object localObject2 = "im_open_push.msg_push" + "_" + i;
      if (((IMMsfUserInfo)localObject4).getCmd2PushListener().containsKey(localObject2))
      {
        localObject5 = (IMPushListener)((IMMsfUserInfo)localObject4).getCmd2PushListener().get(localObject2);
        if (i != 734) {
          break label721;
        }
        IMMsfCoreProxy.mainHandler.post(new ˉ(this, (IMPushListener)localObject5, (msg_push.ReqBody)localObject3));
      }
      while (((IMMsfUserInfo)localObject4).getCmd2PushCallBack().containsKey(localObject2))
      {
        localObject2 = (TIMValueCallBack)((IMMsfUserInfo)localObject4).getCmd2PushCallBack().get(localObject2);
        if (i != 734) {
          break label735;
        }
        IMMsfCoreProxy.mainHandler.post(new ˊ(this, (TIMValueCallBack)localObject2, (msg_push.ReqBody)localObject3));
        return;
        label721:
        ((IMPushListener)localObject5).onRecv(this.b);
      }
      continue;
      label735:
      if ((j == 50) && (this.c.a.getMode() == 0))
      {
        IMMsfCoreProxy.mainHandler.post(new ˋ(this, (msg_push.ReqBody)localObject3));
        return;
      }
      ((TIMValueCallBack)localObject2).onSuccess(this.b);
      return;
      label783:
      int j = 0;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imsdk\ˈ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */