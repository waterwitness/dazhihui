package com.tencent;

import android.text.TextUtils;
import com.tencent.imsdk.QLog;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.InvalidProtocolBufferMicroException;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;
import com.tencent.openqq.protocol.imsdk.head.C2CInfo;
import com.tencent.openqq.protocol.imsdk.head.ContentHead;
import com.tencent.openqq.protocol.imsdk.head.GroupInfo;
import com.tencent.openqq.protocol.imsdk.head.MsgExtraInfo;
import com.tencent.openqq.protocol.imsdk.head.MsgHead;
import com.tencent.openqq.protocol.imsdk.head.RoutineHead;
import com.tencent.openqq.protocol.imsdk.msg.CustomElem;
import com.tencent.openqq.protocol.imsdk.msg.Elem;
import com.tencent.openqq.protocol.imsdk.msg.Face;
import com.tencent.openqq.protocol.imsdk.msg.LocationInfo;
import com.tencent.openqq.protocol.imsdk.msg.MsgBody;
import com.tencent.openqq.protocol.imsdk.msg.NotOnlineFile;
import com.tencent.openqq.protocol.imsdk.msg.NotOnlineImage;
import com.tencent.openqq.protocol.imsdk.msg.Ptt;
import com.tencent.openqq.protocol.imsdk.msg.RichText;
import com.tencent.openqq.protocol.imsdk.msg.Text;
import com.tencent.openqq.protocol.imsdk.msg.VideoFile;
import com.tencent.openqq.protocol.imsdk.msg_common.Msg;
import com.tencent.openqq.protocol.imsdk.msg_push.ReqBody;
import java.util.Iterator;
import java.util.List;

public class ProtobufParser
{
  private static final String tag = "ProtobufParser";
  
  private static String byte2hex(byte[] paramArrayOfByte)
  {
    String str1 = "";
    int i = 0;
    while (i < paramArrayOfByte.length)
    {
      String str3 = Integer.toHexString(paramArrayOfByte[i] & 0xFF);
      String str2 = str3;
      if (str3.length() == 1) {
        str2 = "0" + str3;
      }
      str1 = str1 + str2;
      i += 1;
    }
    return str1;
  }
  
  public static TIMOfflinePushNotification offlinePush2PushNotification(byte[] paramArrayOfByte)
  {
    TIMOfflinePushNotification localTIMOfflinePushNotification = new TIMOfflinePushNotification();
    Object localObject6 = new msg_push.ReqBody();
    Object localObject5;
    int i;
    try
    {
      ((msg_push.ReqBody)localObject6).mergeFrom(paramArrayOfByte);
      localObject1 = ((msg_push.ReqBody)localObject6).msg_msg.msg_msg_head.msg_content_head;
      localObject5 = ((msg_push.ReqBody)localObject6).msg_msg.msg_msg_head.msg_routine_head;
      i = ((head.ContentHead)localObject1).uint32_type.get();
      int j = ((head.ContentHead)localObject1).uint32_subtype.get();
      QLog.d("ProtobufParser", 1, "msgtype: " + Integer.toHexString(i) + "|subtype: " + Integer.toHexString(j));
      if (j != 6) {
        return null;
      }
    }
    catch (InvalidProtocolBufferMicroException paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
      return null;
    }
    QLog.d("ProtobufParser", 1, "pushbuf: " + byte2hex(paramArrayOfByte));
    Object localObject1 = "";
    paramArrayOfByte = "";
    Object localObject3 = "";
    Object localObject2 = ((msg_push.ReqBody)localObject6).msg_msg.msg_msg_head.msg_extra_info;
    Object localObject4;
    if (((head.MsgExtraInfo)localObject2).has())
    {
      if (((head.MsgExtraInfo)localObject2).bytes_identifier.has()) {
        localObject1 = ((head.MsgExtraInfo)localObject2).bytes_identifier.get().toStringUtf8();
      }
      if (((head.MsgExtraInfo)localObject2).bytes_from_uin_nick.has()) {
        paramArrayOfByte = ((head.MsgExtraInfo)localObject2).bytes_from_uin_nick.get().toStringUtf8();
      }
      localObject4 = paramArrayOfByte;
      localObject2 = localObject1;
      localObject1 = paramArrayOfByte;
    }
    for (paramArrayOfByte = (byte[])localObject4;; paramArrayOfByte = "")
    {
      if (i == 561)
      {
        localTIMOfflinePushNotification.setConversationType(TIMConversationType.C2C);
        localTIMOfflinePushNotification.setConversationId((String)localObject2);
        localObject3 = ((head.RoutineHead)localObject5).msg_c2c_info;
        if (!((head.C2CInfo)localObject3).has()) {
          break label1018;
        }
        if (((head.C2CInfo)localObject3).bytes_from_uin_nick.has()) {
          paramArrayOfByte = ((head.C2CInfo)localObject3).bytes_from_uin_nick.get().toStringUtf8();
        }
        long l = ((head.C2CInfo)localObject3).uint64_from_uin.get();
        localObject3 = paramArrayOfByte;
        localObject4 = String.valueOf(l);
        localObject1 = paramArrayOfByte;
      }
      for (paramArrayOfByte = (byte[])localObject4;; paramArrayOfByte = "")
      {
        localObject4 = localObject3;
        localObject3 = paramArrayOfByte;
        paramArrayOfByte = (byte[])localObject4;
        for (;;)
        {
          label329:
          label356:
          label382:
          label479:
          msg.Elem localElem;
          if (TextUtils.isEmpty(paramArrayOfByte))
          {
            localObject5 = localTIMOfflinePushNotification.getConversationId();
            localObject6 = ((msg_push.ReqBody)localObject6).msg_msg.msg_msg_body;
            if (i == 564) {
              if (TextUtils.isEmpty((CharSequence)localObject1))
              {
                paramArrayOfByte = (byte[])localObject2;
                localObject4 = "" + paramArrayOfByte + ": ";
                paramArrayOfByte = (byte[])localObject4;
                if (((msg.MsgBody)localObject6).rich_text.ptt.has()) {
                  paramArrayOfByte = (String)localObject4 + "[语音]";
                }
                localObject4 = paramArrayOfByte;
                if (((msg.MsgBody)localObject6).rich_text.not_online_file.has()) {
                  localObject4 = paramArrayOfByte + "[文件]";
                }
                localObject6 = ((msg.MsgBody)localObject6).rich_text.elems.get().iterator();
                paramArrayOfByte = (byte[])localObject4;
                for (;;)
                {
                  if (((Iterator)localObject6).hasNext())
                  {
                    localElem = (msg.Elem)((Iterator)localObject6).next();
                    if (localElem.text.has())
                    {
                      paramArrayOfByte = paramArrayOfByte + localElem.text.str.get().toStringUtf8();
                      continue;
                      if (i != 564) {
                        break label1007;
                      }
                      localObject4 = ((head.RoutineHead)localObject5).msg_group_info;
                      if (!((head.GroupInfo)localObject4).has()) {
                        break label997;
                      }
                      if (((head.GroupInfo)localObject4).bytes_from_uin_nick.has()) {
                        paramArrayOfByte = ((head.GroupInfo)localObject4).bytes_from_uin_nick.get().toStringUtf8();
                      }
                      if (!((head.GroupInfo)localObject4).bytes_group_name.has()) {
                        break label991;
                      }
                      localObject1 = ((head.GroupInfo)localObject4).bytes_group_name.get().toStringUtf8();
                      label616:
                      if (!((head.GroupInfo)localObject4).bytes_group_id.has()) {
                        break label984;
                      }
                      localObject3 = ((head.GroupInfo)localObject4).bytes_group_id.get().toStringUtf8();
                      localObject4 = localObject3;
                    }
                  }
                }
              }
            }
          }
          for (;;)
          {
            localTIMOfflinePushNotification.setConversationType(TIMConversationType.Group);
            localTIMOfflinePushNotification.setConversationId((String)localObject4);
            localObject4 = paramArrayOfByte;
            paramArrayOfByte = (byte[])localObject1;
            localObject1 = localObject4;
            break;
            if (localElem.not_online_image.has())
            {
              paramArrayOfByte = paramArrayOfByte + "[图片]";
              break label479;
            }
            if (localElem.face.has())
            {
              paramArrayOfByte = paramArrayOfByte + "[表情]";
              break label479;
            }
            if (localElem.custom_elem.has())
            {
              localObject4 = paramArrayOfByte;
              if (TextUtils.isEmpty(localElem.custom_elem.bytes_desc.get().toStringUtf8())) {
                localObject4 = paramArrayOfByte + "[" + localElem.custom_elem.bytes_desc.get().toStringUtf8() + "]";
              }
              localTIMOfflinePushNotification.setExt(localElem.custom_elem.bytes_ext.get().toByteArray());
              paramArrayOfByte = (byte[])localObject4;
              break label479;
            }
            if (localElem.location_info.has())
            {
              paramArrayOfByte = paramArrayOfByte + "[位置信息]" + localElem.location_info.bytes_desc.get().toStringUtf8();
              break label479;
            }
            if (localElem.video_file.has()) {
              paramArrayOfByte = paramArrayOfByte + "[视频]";
            }
            for (;;)
            {
              break;
              localTIMOfflinePushNotification.setTitle((String)localObject5);
              localTIMOfflinePushNotification.setContent(paramArrayOfByte);
              localTIMOfflinePushNotification.setSenderIdentifier((String)localObject2);
              localTIMOfflinePushNotification.setSenderNickName((String)localObject1);
              localTIMOfflinePushNotification.setTag((String)localObject3);
              return localTIMOfflinePushNotification;
            }
            paramArrayOfByte = (byte[])localObject1;
            break label356;
            localObject4 = "";
            break label382;
            localObject5 = paramArrayOfByte;
            break label329;
            label984:
            localObject4 = "";
            continue;
            label991:
            localObject1 = "";
            break label616;
            label997:
            localObject1 = "";
            localObject4 = "";
          }
          label1007:
          localObject4 = paramArrayOfByte;
          paramArrayOfByte = (byte[])localObject1;
          localObject1 = localObject4;
        }
        label1018:
        localObject3 = localObject1;
        localObject1 = paramArrayOfByte;
      }
      localObject1 = "";
      localObject2 = "";
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\ProtobufParser.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */