package com.tencent.avsdk.control;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.android.dazhihui.d.d;
import com.android.dazhihui.d.n;
import com.android.dazhihui.g;
import com.c.a.k;
import com.tencent.TIMCallBack;
import com.tencent.TIMConversation;
import com.tencent.TIMConversationType;
import com.tencent.TIMCustomElem;
import com.tencent.TIMElem;
import com.tencent.TIMElemType;
import com.tencent.TIMGroupManager;
import com.tencent.TIMGroupSystemElem;
import com.tencent.TIMGroupSystemElemType;
import com.tencent.TIMManager;
import com.tencent.TIMMessage;
import com.tencent.TIMMessageListener;
import com.tencent.TIMTextElem;
import com.tencent.TIMValueCallBack;
import com.tencent.avsdk.ChatEntity;
import com.tencent.avsdk.ChatEntity.ChatGuestType;
import com.tencent.avsdk.Model.CustomMsgVo;
import com.tencent.avsdk.Model.CustomReqMsgVo;
import com.tencent.avsdk.Model.CustomReqMsgVo.BuyGift;
import com.tencent.avsdk.Model.CustomReqMsgVo.CustomType;
import com.tencent.avsdk.Model.CustomReqMsgVo.Follow;
import com.tencent.avsdk.Model.CustomReqMsgVo.Login;
import com.tencent.avsdk.Model.CustomReqMsgVo.LoginReq;
import com.tencent.avsdk.Model.CustomReqMsgVo.OwnerReq;
import com.tencent.avsdk.Model.CustomReqMsgVo.PayReq;
import com.tencent.avsdk.Model.CustomReqMsgVo.RedEnvelopeReq;
import com.tencent.avsdk.Model.CustomReqMsgVo.RoomInfoReq;
import com.tencent.avsdk.Model.CustomReqMsgVo.UpLoadInfo;
import com.tencent.avsdk.Model.CustomReqMsgVo.UpReq;
import com.tencent.avsdk.Model.CustomRspMsgVo.AccountRsp;
import com.tencent.avsdk.Model.CustomRspMsgVo.LoginRsp;
import com.tencent.avsdk.Model.CustomRspMsgVo.Null;
import com.tencent.avsdk.Model.CustomRspMsgVo.OwnerPublishRsp;
import com.tencent.avsdk.Model.CustomRspMsgVo.OwnerRsp;
import com.tencent.avsdk.Model.CustomRspMsgVo.RoomInfo;
import com.tencent.avsdk.Model.CustomSysMsgVo.AccountStatus;
import com.tencent.avsdk.Model.CustomSysMsgVo.Msg;
import com.tencent.avsdk.Model.CustomSysMsgVo.OwnerRankPushSys;
import com.tencent.avsdk.Model.CustomSysMsgVo.OwnerShowAdvertPushSys;
import com.tencent.avsdk.Model.CustomSysMsgVo.OwnerShowPresentPushSys;
import com.tencent.avsdk.Model.CustomSysMsgVo.Present;
import com.tencent.avsdk.Model.CustomSysMsgVo.RedEnvelopeSys;
import com.tencent.avsdk.Model.CustomSysMsgVo.RoomAccountChange;
import com.tencent.avsdk.Model.CustomSysMsgVo.RoomInfo;
import com.tencent.avsdk.Model.CustomSysMsgVo.UserInfoPushSys;
import com.tencent.avsdk.Model.TextMsgVo;
import com.tencent.avsdk.UserInfo;
import com.tencent.avsdk.UserilvbManager;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class MessageControl
{
  private static String TAG = "ilvb";
  private static final int chartListSize = 200;
  public static MessageControl messageControl;
  private List<String> accountTags = new ArrayList();
  private String groupId;
  private MessageControl.AccountNumberListener mAccountNumberListener;
  private List<ChatEntity> mArrayListChatEntity = new ArrayList();
  private TIMConversation mConversation;
  private k mGson = new k();
  private Handler mHandler;
  private volatile boolean mJoinGroupSuccess = false;
  private MessageControl.OnLoginLinstener mOnLoginLinstener;
  private MessageControl.OnPayLinstener mOnPayLinstener;
  private TIMMessageListener msgListener = new MessageControl.4(this);
  public int onLineNumber;
  private UserInfo userInfo;
  
  private ChatEntity getChatEntity(TIMElem paramTIMElem, boolean paramBoolean, TIMConversationType paramTIMConversationType)
  {
    if ((paramTIMElem instanceof TIMTextElem))
    {
      int i;
      label327:
      do
      {
        for (;;)
        {
          int j;
          int k;
          try
          {
            paramTIMElem = ((TIMTextElem)paramTIMElem).getText().toString();
            TextMsgVo localTextMsgVo = (TextMsgVo)this.mGson.a(paramTIMElem, TextMsgVo.class);
            if (g.a().L()) {
              Log.d(TAG, "TIMTextElem s=" + paramTIMElem);
            }
            if ((!paramBoolean) && (localTextMsgVo.Tags != null) && (localTextMsgVo.Tags.size() > 0) && (this.accountTags.size() > 0))
            {
              j = 0;
              i = 0;
              if (j >= localTextMsgVo.Tags.size()) {
                break;
              }
              k = 0;
              if (k < this.accountTags.size())
              {
                if (!((String)localTextMsgVo.Tags.get(j)).equals(this.accountTags.get(k))) {
                  break label327;
                }
                i = 1;
              }
            }
            else
            {
              if (localTextMsgVo.Type == 1)
              {
                paramTIMElem = new ChatEntity(ChatEntity.ChatGuestType.CHAT_TEXT);
                paramTIMElem.event = localTextMsgVo.Msg;
                paramTIMElem.user = localTextMsgVo.AccountName;
                paramTIMElem.userImg = localTextMsgVo.AccountImg;
                paramTIMConversationType = this.mHandler.obtainMessage();
                paramTIMConversationType.obj = paramTIMElem;
                paramTIMConversationType.what = 288;
                this.mHandler.sendMessage(paramTIMConversationType);
                break label343;
              }
              if (localTextMsgVo.Type != 0) {
                break label343;
              }
              paramTIMElem = ChatEntity.ChatGuestType.CHAT_TEXT;
              if (paramTIMConversationType == TIMConversationType.C2C) {
                paramTIMElem = ChatEntity.ChatGuestType.CHAT_C2C_TEXT;
              }
              paramTIMElem = getChatEntity(paramTIMElem, localTextMsgVo.AccountName, localTextMsgVo.Msg, localTextMsgVo.Account, localTextMsgVo.AccountLevel);
              return paramTIMElem;
            }
          }
          catch (Exception paramTIMElem)
          {
            paramTIMElem.printStackTrace();
          }
          j += 1;
          continue;
          k += 1;
        }
      } while (i != 0);
      return null;
    }
    label343:
    return null;
  }
  
  public static ChatEntity getChatEntity(ChatEntity.ChatGuestType paramChatGuestType, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    ChatEntity localChatEntity = new ChatEntity(paramChatGuestType);
    localChatEntity.user = paramString1;
    localChatEntity.event = paramString2;
    paramChatGuestType = paramString4;
    if (!TextUtils.isEmpty(paramString4))
    {
      paramChatGuestType = paramString4;
      if (paramString4.equals("-1")) {
        paramChatGuestType = "";
      }
    }
    localChatEntity.AccountLevel = paramChatGuestType;
    localChatEntity.userAccount = paramString3;
    return localChatEntity;
  }
  
  public static MessageControl getInstance()
  {
    if (messageControl == null) {
      messageControl = new MessageControl();
    }
    return messageControl;
  }
  
  private void handleCustomMsg(TIMElem paramTIMElem)
  {
    int i = -1;
    if (paramTIMElem == null) {}
    label617:
    do
    {
      Object localObject3;
      do
      {
        do
        {
          for (;;)
          {
            return;
            new k();
            localObject3 = new String(((TIMCustomElem)paramTIMElem).getData());
            Object localObject1 = "";
            paramTIMElem = (TIMElem)localObject1;
            try
            {
              localObject3 = new JSONObject((String)localObject3);
              paramTIMElem = (TIMElem)localObject1;
              localObject1 = ((JSONObject)localObject3).optString("FrameType", "");
              paramTIMElem = (TIMElem)localObject1;
              localObject3 = ((JSONObject)localObject3).optJSONObject("Frame");
              paramTIMElem = (TIMElem)localObject3;
              localObject3 = localObject1;
              localObject1 = paramTIMElem;
              if (localObject1 != null)
              {
                if (!((String)localObject3).equals("rsp")) {
                  break label617;
                }
                localObject3 = ((JSONObject)localObject1).optString("Service", "");
                j = ((JSONObject)localObject1).optInt("Err", -1);
                localObject1 = ((JSONObject)localObject1).optJSONObject("Data");
                if ((j == 0) && (localObject1 != null))
                {
                  paramTIMElem = ((JSONObject)localObject1).toString();
                  Log.i("xyfData", (String)localObject3 + "--->" + paramTIMElem);
                  handleRsp((String)localObject3, paramTIMElem);
                  return;
                }
              }
            }
            catch (JSONException localJSONException)
            {
              int j;
              for (;;)
              {
                localJSONException.printStackTrace();
                localObject2 = null;
                localObject3 = paramTIMElem;
              }
              if (localObject2 == null) {}
              for (paramTIMElem = "";; paramTIMElem = ((JSONObject)localObject2).toString())
              {
                Log.i("xyfError", (String)localObject3 + "--->" + j + "--->" + paramTIMElem);
                n.f(TAG, "FrameType=rsp " + (String)localObject3 + "--->" + j + "--->" + paramTIMElem);
                paramTIMElem = "";
                if (localObject2 != null)
                {
                  i = ((JSONObject)localObject2).optInt("Code", -1);
                  paramTIMElem = ((JSONObject)localObject2).optString("Desc", "");
                }
                if (!((String)localObject3).equals(CustomReqMsgVo.CustomType.GetOwnerInfo.getValue())) {
                  break;
                }
                sendRefreshChat(ChatEntity.ChatGuestType.CHAT_ERROR, "", "获取主播信息失败!", "", "");
                return;
              }
              if (((String)localObject3).equals(CustomReqMsgVo.CustomType.GetRoomInfo.getValue()))
              {
                sendRefreshChat(ChatEntity.ChatGuestType.CHAT_ERROR, "", "获取房间信息失败!", "", "");
                return;
              }
              if (((String)localObject3).equals(CustomReqMsgVo.CustomType.QueryAccount.getValue()))
              {
                sendRefreshChat(ChatEntity.ChatGuestType.CHAT_ERROR, "", "查询余额信息失败!", "", "");
                if (this.mAccountNumberListener != null) {
                  this.mAccountNumberListener.accountRes(null);
                }
              }
              else
              {
                if (((String)localObject3).equals(CustomReqMsgVo.CustomType.Follow.getValue()))
                {
                  sendRefreshChat(ChatEntity.ChatGuestType.CHAT_ERROR, "", "关注信息失败!", "", "");
                  return;
                }
                if (((String)localObject3).equals(CustomReqMsgVo.CustomType.Buy.getValue()))
                {
                  if (i == 1006)
                  {
                    this.mHandler.sendEmptyMessage(283);
                    sendQueryAccount();
                    return;
                  }
                  sendRefreshChat(ChatEntity.ChatGuestType.CHAT_ERROR, "", "购买礼物失败!", "", "");
                  return;
                }
                if (((String)localObject3).equals(CustomReqMsgVo.CustomType.Pay.getValue()))
                {
                  if (this.mOnPayLinstener != null) {
                    this.mOnPayLinstener.pay(i);
                  }
                }
                else if (((String)localObject3).equals(CustomReqMsgVo.CustomType.Login.getValue()))
                {
                  if (this.mOnLoginLinstener == null) {
                    continue;
                  }
                  this.mOnLoginLinstener.login(null, true, String.valueOf(i));
                }
              }
            }
          }
        } while (!((String)localObject3).equals(CustomReqMsgVo.CustomType.MoneyEvent.getValue()));
        sendRefreshChat(ChatEntity.ChatGuestType.CHAT_ERROR, "", "发送红包失败!" + paramTIMElem, "", "");
        return;
      } while (!((String)localObject3).equals("sys"));
      paramTIMElem = ((JSONObject)localObject2).optString("Type", "");
      localObject2 = ((JSONObject)localObject2).optJSONObject("Data");
    } while (localObject2 == null);
    Object localObject2 = ((JSONObject)localObject2).toString();
    Log.i("xyfData", paramTIMElem + "--->" + (String)localObject2);
    n.f(TAG, "FrameType=sys " + paramTIMElem + "--->" + (String)localObject2);
    handleSys(paramTIMElem, (String)localObject2);
  }
  
  private void handleRsp(String paramString1, String paramString2)
  {
    k localk = new k();
    Message localMessage = this.mHandler.obtainMessage();
    if (paramString1.equals(CustomReqMsgVo.CustomType.Follow.getValue())) {
      this.mHandler.sendEmptyMessage(17);
    }
    do
    {
      do
      {
        do
        {
          return;
          if (paramString1.equals(CustomReqMsgVo.CustomType.GetRoomInfo.getValue()))
          {
            paramString1 = (CustomRspMsgVo.RoomInfo)localk.a(paramString2, CustomRspMsgVo.RoomInfo.class);
            if ((paramString1.AccountTags != null) && (paramString1.AccountTags.size() > 0))
            {
              this.accountTags.clear();
              this.accountTags.addAll(paramString1.AccountTags);
            }
            if (!TextUtils.isEmpty(paramString1.MemberNum)) {
              this.onLineNumber = Integer.parseInt(paramString1.MemberNum);
            }
            if ((!TextUtils.isEmpty(paramString1.AccountLevel)) && (paramString1.AccountLevel.equals("-1"))) {
              paramString1.AccountLevel = "";
            }
            this.userInfo.setAccountLevel(paramString1.AccountLevel);
            localMessage.obj = paramString1;
            localMessage.what = 272;
            this.mHandler.sendMessage(localMessage);
            return;
          }
          if (!paramString1.equals(CustomReqMsgVo.CustomType.QueryAccount.getValue())) {
            break;
          }
          paramString1 = (CustomRspMsgVo.AccountRsp)localk.a(paramString2, CustomRspMsgVo.AccountRsp.class);
          localMessage.obj = paramString1;
          localMessage.what = 273;
          this.mHandler.sendMessage(localMessage);
        } while (this.mAccountNumberListener == null);
        this.mAccountNumberListener.accountRes(paramString1.Balance);
        return;
        if (paramString1.equals(CustomReqMsgVo.CustomType.Follow.getValue()))
        {
          paramString1 = (CustomRspMsgVo.Null)localk.a(paramString2, CustomRspMsgVo.Null.class);
          return;
        }
        if (paramString1.equals(CustomReqMsgVo.CustomType.Buy.getValue()))
        {
          localMessage.obj = ((CustomRspMsgVo.AccountRsp)localk.a(paramString2, CustomRspMsgVo.AccountRsp.class));
          localMessage.what = 274;
          this.mHandler.sendMessage(localMessage);
          return;
        }
        if (paramString1.equals(CustomReqMsgVo.CustomType.GetOwnerInfo.getValue()))
        {
          localMessage.obj = ((CustomRspMsgVo.OwnerRsp)localk.a(paramString2, CustomRspMsgVo.OwnerRsp.class));
          localMessage.what = 277;
          this.mHandler.sendMessage(localMessage);
          return;
        }
        if (!paramString1.equals(CustomReqMsgVo.CustomType.Login.getValue())) {
          break;
        }
        paramString1 = (CustomRspMsgVo.LoginRsp)localk.a(paramString2, CustomRspMsgVo.LoginRsp.class);
      } while (this.mOnLoginLinstener == null);
      this.mOnLoginLinstener.login(paramString1, false, "");
      return;
    } while ((!paramString1.equals(CustomReqMsgVo.CustomType.Pay.getValue())) || (this.mOnPayLinstener == null));
    this.mOnPayLinstener.pay(0);
  }
  
  private void handleSys(String paramString1, String paramString2)
  {
    k localk = new k();
    Message localMessage = this.mHandler.obtainMessage();
    if (paramString1.equals("RoomInfo"))
    {
      paramString1 = (CustomSysMsgVo.RoomInfo)localk.a(paramString2, CustomSysMsgVo.RoomInfo.class);
      if (!TextUtils.isEmpty(paramString1.MemberNum)) {
        this.onLineNumber = Integer.parseInt(paramString1.MemberNum);
      }
      localMessage.obj = paramString1;
      localMessage.what = 271;
      this.mHandler.sendMessage(localMessage);
    }
    do
    {
      do
      {
        do
        {
          return;
          if (paramString1.equals("SendPresent"))
          {
            localMessage.obj = ((CustomSysMsgVo.Present)localk.a(paramString2, CustomSysMsgVo.Present.class));
            localMessage.what = 269;
            this.mHandler.sendMessage(localMessage);
            return;
          }
          if (paramString1.equals("SendMsg"))
          {
            paramString2 = (CustomSysMsgVo.Msg)localk.a(paramString2, CustomSysMsgVo.Msg.class);
            if (paramString2.MsgType.equals("1")) {}
            for (paramString1 = "主播公告";; paramString1 = "系统公告")
            {
              sendRefreshChat(ChatEntity.ChatGuestType.CHAT_SYSTEM, paramString1, paramString2.Msg, "", "");
              return;
            }
          }
          if (paramString1.equals("RoomMember"))
          {
            paramString1 = (CustomSysMsgVo.RoomAccountChange)localk.a(paramString2, CustomSysMsgVo.RoomAccountChange.class);
            if ((paramString1 != null) && (paramString1.UpdateType != null) && (paramString1.UpdateType.equals("1"))) {
              return;
            }
            return;
          }
          if (!paramString1.equals("AccountStatus")) {
            break;
          }
          paramString1 = (CustomSysMsgVo.AccountStatus)localk.a(paramString2, CustomSysMsgVo.AccountStatus.class);
          if (paramString1.AccountStatus.equals("1"))
          {
            UserilvbManager.getInstance().isNoSpeak = true;
            UserilvbManager.getInstance().noSpeakTime = System.currentTimeMillis();
            UserilvbManager.getInstance().noSpeakSurplus = paramString1.ShutUpLeftTime;
            paramString1 = getChatEntity(ChatEntity.ChatGuestType.CHAT_ERROR, "", "你已被主播禁止发言!", "", "");
            paramString2 = this.mHandler.obtainMessage(260);
            paramString2.obj = paramString1;
            paramString2.sendToTarget();
            return;
          }
          if (paramString1.AccountStatus.equals("2"))
          {
            d.a("被踢了---->AccountStatus");
            Log.e(TAG, "被踢了---->AccountStatus");
            this.mHandler.obtainMessage(284, paramString1.KickTips).sendToTarget();
            return;
          }
        } while (!paramString1.AccountStatus.equals("3"));
        paramString1 = this.mHandler.obtainMessage(284);
        paramString1.arg1 = 10;
        this.mHandler.sendMessage(paramString1);
        return;
        if (paramString1.equals("MoneyEventInfo"))
        {
          paramString1 = (CustomSysMsgVo.RedEnvelopeSys)localk.a(paramString2, CustomSysMsgVo.RedEnvelopeSys.class);
          paramString2 = this.mHandler.obtainMessage(295);
          paramString2.obj = paramString1;
          this.mHandler.sendMessage(paramString2);
          paramString2 = getChatEntity(ChatEntity.ChatGuestType.CHAT_HONGBAO, paramString1.AccountName, "我给大家送了一个红包", paramString1.Account, paramString1.AccountLevel);
          paramString2.hongbaoUrl = paramString1.HotUrl;
          paramString1 = this.mHandler.obtainMessage(260);
          paramString1.obj = paramString2;
          paramString1.sendToTarget();
          return;
        }
        if (!paramString1.equals("UserInfoPush")) {
          break;
        }
        paramString1 = (CustomSysMsgVo.UserInfoPushSys)localk.a(paramString2, CustomSysMsgVo.UserInfoPushSys.class);
        if (!TextUtils.isEmpty(paramString1.AccountLevel))
        {
          if (paramString1.AccountLevel.equals("-1")) {
            paramString1.AccountLevel = "";
          }
          this.userInfo.setAccountLevel(paramString1.AccountLevel);
        }
      } while ((paramString1.AccountTags == null) || (paramString1.AccountTags.size() <= 0));
      this.accountTags.clear();
      this.accountTags.addAll(paramString1.AccountTags);
      return;
      if (paramString1.equals("OwnerPublishPush"))
      {
        paramString1 = (CustomRspMsgVo.OwnerPublishRsp)localk.a(paramString2, CustomRspMsgVo.OwnerPublishRsp.class);
        paramString2 = this.mHandler.obtainMessage(299);
        paramString2.obj = paramString1;
        this.mHandler.sendMessage(paramString2);
        return;
      }
      if (paramString1.equals("OwnerShowAdvertPush"))
      {
        paramString1 = (CustomSysMsgVo.OwnerShowAdvertPushSys)localk.a(paramString2, CustomSysMsgVo.OwnerShowAdvertPushSys.class);
        paramString2 = this.mHandler.obtainMessage(300);
        paramString2.obj = paramString1;
        this.mHandler.sendMessage(paramString2);
        return;
      }
      if (paramString1.equals("OwnerShowPresentPush"))
      {
        paramString1 = (CustomSysMsgVo.OwnerShowPresentPushSys)localk.a(paramString2, CustomSysMsgVo.OwnerShowPresentPushSys.class);
        paramString2 = this.mHandler.obtainMessage(301);
        paramString2.arg1 = paramString1.Duration;
        this.mHandler.sendMessage(paramString2);
        return;
      }
    } while (!paramString1.equals("OwnerRankPush"));
    paramString1 = (CustomSysMsgVo.OwnerRankPushSys)localk.a(paramString2, CustomSysMsgVo.OwnerRankPushSys.class);
    paramString2 = this.mHandler.obtainMessage(305);
    paramString2.obj = paramString1;
    this.mHandler.sendMessage(paramString2);
  }
  
  private void refreshChat(List<TIMMessage> paramList)
  {
    if (this.mHandler == null) {}
    ArrayList localArrayList;
    label85:
    label114:
    do
    {
      return;
      localArrayList = new ArrayList();
      int i = paramList.size() - 1;
      while (i >= 0)
      {
        TIMMessage localTIMMessage = (TIMMessage)paramList.get(i);
        if ((localTIMMessage.getConversation().getType() == TIMConversationType.Group) && (!this.groupId.equals(localTIMMessage.getConversation().getPeer())))
        {
          i -= 1;
        }
        else
        {
          int j = 0;
          if (j < localTIMMessage.getElementCount()) {
            if (localTIMMessage.getElement(j) != null) {
              break label114;
            }
          }
          for (;;)
          {
            j += 1;
            break label85;
            break;
            Object localObject = localTIMMessage.getElement(j);
            TIMElemType localTIMElemType = ((TIMElem)localObject).getType();
            if (localTIMElemType == TIMElemType.Custom)
            {
              handleCustomMsg((TIMElem)localObject);
            }
            else if (localTIMElemType == TIMElemType.GroupSystem)
            {
              localObject = (TIMGroupSystemElem)localObject;
              if (this.groupId.equals(((TIMGroupSystemElem)localObject).getGroupId()))
              {
                if (TIMGroupSystemElemType.TIM_GROUP_SYSTEM_DELETE_GROUP_TYPE == ((TIMGroupSystemElem)localObject).getSubtype())
                {
                  this.mHandler.sendEmptyMessage(263);
                  return;
                }
                if (TIMGroupSystemElemType.TIM_GROUP_SYSTEM_KICK_OFF_FROM_GROUP_TYPE == ((TIMGroupSystemElem)localObject).getSubtype())
                {
                  d.a("被踢了---->TIM_GROUP_SYSTEM_KICK_OFF_FROM_GROUP_TYPE");
                  Log.e(TAG, "被踢了---->TIM_GROUP_SYSTEM_KICK_OFF_FROM_GROUP_TYPE");
                  this.mHandler.sendEmptyMessage(284);
                }
              }
            }
            else
            {
              localObject = getChatEntity((TIMElem)localObject, false, localTIMMessage.getConversation().getType());
              if (localObject != null) {
                localArrayList.add(localObject);
              }
            }
          }
        }
      }
    } while (localArrayList.size() <= 0);
    paramList = this.mHandler.obtainMessage(260);
    paramList.obj = localArrayList;
    this.mHandler.sendMessage(paramList);
  }
  
  private void sendCustomMessage(String paramString, TIMValueCallBack<TIMMessage> paramTIMValueCallBack)
  {
    if (TextUtils.isEmpty(paramString)) {
      this.mHandler.sendEmptyMessage(256);
    }
    TIMMessage localTIMMessage;
    Object localObject;
    do
    {
      return;
      localTIMMessage = new TIMMessage();
      localObject = new TIMCustomElem();
      ((TIMCustomElem)localObject).setData(paramString.getBytes());
      ((TIMCustomElem)localObject).setDesc("");
      if (1 == localTIMMessage.addElement((TIMElem)localObject))
      {
        this.mHandler.sendEmptyMessage(257);
        return;
      }
      localObject = paramTIMValueCallBack;
      if (paramTIMValueCallBack == null) {
        localObject = new MessageControl.8(this, paramString);
      }
    } while (this.mConversation == null);
    this.mConversation.sendMessage(localTIMMessage, (TIMValueCallBack)localObject);
  }
  
  private void sendMessage(String paramString, TIMValueCallBack<TIMMessage> paramTIMValueCallBack)
  {
    if (TextUtils.isEmpty(paramString)) {
      this.mHandler.sendEmptyMessage(256);
    }
    TIMMessage localTIMMessage;
    do
    {
      return;
      try
      {
        if (paramString.getBytes("utf8").length > 160)
        {
          this.mHandler.sendEmptyMessage(266);
          return;
        }
      }
      catch (UnsupportedEncodingException paramString)
      {
        paramString.printStackTrace();
        this.mHandler.sendEmptyMessage(257);
        return;
      }
      localTIMMessage = new TIMMessage();
      TIMTextElem localTIMTextElem = new TIMTextElem();
      TextMsgVo localTextMsgVo = new TextMsgVo(this.userInfo, 0);
      localTextMsgVo.Msg = paramString;
      localTIMTextElem.setText(new k().a(localTextMsgVo));
      if (localTIMMessage.addElement(localTIMTextElem) != 0)
      {
        this.mHandler.sendEmptyMessage(257);
        return;
      }
    } while (this.mConversation == null);
    this.mConversation.sendMessage(localTIMMessage, new MessageControl.7(this, paramTIMValueCallBack));
  }
  
  public void addListChatEntity(ChatEntity paramChatEntity)
  {
    try
    {
      if (this.mArrayListChatEntity.size() + 1 > 200) {
        this.mArrayListChatEntity.remove(0);
      }
      this.mArrayListChatEntity.add(paramChatEntity);
      return;
    }
    finally {}
  }
  
  public void destroy()
  {
    if (this.mAccountNumberListener != null)
    {
      this.mAccountNumberListener.accountRes(null);
      this.mAccountNumberListener = null;
    }
    if (this.mHandler != null) {
      this.mHandler.removeMessages(258);
    }
    TIMManager.getInstance().setUserStatusListener(null);
    TIMManager.getInstance().removeMessageListener(this.msgListener);
    if (this.groupId != null)
    {
      TIMGroupManager.getInstance().quitGroup(this.groupId, new MessageControl.3(this));
      TIMManager.getInstance().deleteConversation(TIMConversationType.Group, this.groupId);
    }
    this.mJoinGroupSuccess = false;
    messageControl = null;
    this.mHandler = null;
  }
  
  public boolean getJoinGroupSuccess()
  {
    return this.mJoinGroupSuccess;
  }
  
  public List<ChatEntity> getListChatEntity()
  {
    return this.mArrayListChatEntity;
  }
  
  public void init(Context paramContext, Handler paramHandler, String paramString)
  {
    this.userInfo = UserInfo.getInstance();
    this.groupId = paramString;
    this.mHandler = paramHandler;
  }
  
  public void initJoinGroup(TIMCallBack paramTIMCallBack)
  {
    TIMGroupManager.getInstance().applyJoinGroup(this.groupId, "申请加入" + this.groupId, new MessageControl.1(this, paramTIMCallBack));
    this.mConversation = TIMManager.getInstance().getConversation(TIMConversationType.Group, this.groupId);
    TIMManager.getInstance().addMessageListener(this.msgListener);
    TIMManager.getInstance().setUserStatusListener(new MessageControl.2(this));
    sendPing();
    this.mJoinGroupSuccess = true;
  }
  
  public void onSendChatMessage(String paramString)
  {
    ChatEntity localChatEntity = getChatEntity(ChatEntity.ChatGuestType.CHAT_TEXT, this.userInfo.getUserName(), paramString, this.userInfo.getUserPhone(), this.userInfo.getAccountLevel());
    if (localChatEntity != null)
    {
      Message localMessage = this.mHandler.obtainMessage(260);
      localMessage.obj = localChatEntity;
      this.mHandler.sendMessage(localMessage);
    }
    sendMessage(paramString, new MessageControl.6(this));
  }
  
  public void onSendCustomMessage(String paramString, TIMValueCallBack<TIMMessage> paramTIMValueCallBack)
  {
    sendCustomMessage(paramString, paramTIMValueCallBack);
  }
  
  public void sendBuyGift(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3)
  {
    CustomReqMsgVo localCustomReqMsgVo = new CustomReqMsgVo();
    localCustomReqMsgVo.setType(CustomReqMsgVo.CustomType.Buy);
    localCustomReqMsgVo.Params = new CustomReqMsgVo.BuyGift();
    ((CustomReqMsgVo.BuyGift)localCustomReqMsgVo.Params).Account = this.userInfo.getUserPhone();
    ((CustomReqMsgVo.BuyGift)localCustomReqMsgVo.Params).AccountImg = this.userInfo.getHeadImagePath();
    ((CustomReqMsgVo.BuyGift)localCustomReqMsgVo.Params).AccountName = this.userInfo.getUserName();
    ((CustomReqMsgVo.BuyGift)localCustomReqMsgVo.Params).Count = paramInt1;
    ((CustomReqMsgVo.BuyGift)localCustomReqMsgVo.Params).IsLink = String.valueOf(paramInt2);
    ((CustomReqMsgVo.BuyGift)localCustomReqMsgVo.Params).LinkCount = paramInt3;
    ((CustomReqMsgVo.BuyGift)localCustomReqMsgVo.Params).PresentId = paramString2;
    ((CustomReqMsgVo.BuyGift)localCustomReqMsgVo.Params).OwnerAccount = paramString1;
    paramString1 = new CustomMsgVo(localCustomReqMsgVo);
    onSendCustomMessage(new k().a(paramString1), null);
  }
  
  public void sendClientUpLoadInfo(int paramInt, String paramString)
  {
    CustomReqMsgVo localCustomReqMsgVo = new CustomReqMsgVo();
    localCustomReqMsgVo.setType(CustomReqMsgVo.CustomType.ClientUpLoadInfo);
    localCustomReqMsgVo.Params = new CustomReqMsgVo.UpLoadInfo();
    ((CustomReqMsgVo.UpLoadInfo)localCustomReqMsgVo.Params).Account = this.userInfo.getUserPhone();
    ((CustomReqMsgVo.UpLoadInfo)localCustomReqMsgVo.Params).GetVideoTime = paramInt;
    ((CustomReqMsgVo.UpLoadInfo)localCustomReqMsgVo.Params).IsGetVideoTimeout = paramString;
    paramString = new CustomMsgVo(localCustomReqMsgVo);
    onSendCustomMessage(new k().a(paramString), null);
  }
  
  public void sendFollow(String paramString, int paramInt)
  {
    CustomReqMsgVo localCustomReqMsgVo = new CustomReqMsgVo();
    localCustomReqMsgVo.setType(CustomReqMsgVo.CustomType.Follow);
    localCustomReqMsgVo.Params = new CustomReqMsgVo.Follow();
    ((CustomReqMsgVo.Follow)localCustomReqMsgVo.Params).Account = this.userInfo.getUserPhone();
    ((CustomReqMsgVo.Follow)localCustomReqMsgVo.Params).FollowType = String.valueOf(paramInt);
    ((CustomReqMsgVo.Follow)localCustomReqMsgVo.Params).OwnerAccount = paramString;
    paramString = new CustomMsgVo(localCustomReqMsgVo);
    onSendCustomMessage(new k().a(paramString), null);
  }
  
  public void sendLogin(MessageControl.OnLoginLinstener paramOnLoginLinstener)
  {
    this.mOnLoginLinstener = paramOnLoginLinstener;
    CustomReqMsgVo localCustomReqMsgVo = new CustomReqMsgVo();
    localCustomReqMsgVo.setType(CustomReqMsgVo.CustomType.Login);
    localCustomReqMsgVo.Params = new CustomReqMsgVo.LoginReq();
    ((CustomReqMsgVo.LoginReq)localCustomReqMsgVo.Params).Account = this.userInfo.getUserPhone();
    ((CustomReqMsgVo.LoginReq)localCustomReqMsgVo.Params).AccountName = this.userInfo.getUserName();
    ((CustomReqMsgVo.LoginReq)localCustomReqMsgVo.Params).ClientVersion = g.a().r();
    CustomReqMsgVo.LoginReq localLoginReq = (CustomReqMsgVo.LoginReq)localCustomReqMsgVo.Params;
    if ("app_dzh".equals("app_dzh")) {}
    for (paramOnLoginLinstener = "1";; paramOnLoginLinstener = "2")
    {
      localLoginReq.AppSource = paramOnLoginLinstener;
      paramOnLoginLinstener = new CustomMsgVo(localCustomReqMsgVo);
      onSendCustomMessage(new k().a(paramOnLoginLinstener), null);
      return;
    }
  }
  
  public void sendOwnerInfo(String paramString)
  {
    CustomReqMsgVo localCustomReqMsgVo = new CustomReqMsgVo();
    localCustomReqMsgVo.setType(CustomReqMsgVo.CustomType.GetOwnerInfo);
    localCustomReqMsgVo.Params = new CustomReqMsgVo.OwnerReq();
    ((CustomReqMsgVo.OwnerReq)localCustomReqMsgVo.Params).OwnerAccount = paramString;
    paramString = new CustomMsgVo(localCustomReqMsgVo);
    onSendCustomMessage(new k().a(paramString), null);
  }
  
  public void sendPay(String paramString, MessageControl.OnPayLinstener paramOnPayLinstener)
  {
    this.mOnPayLinstener = paramOnPayLinstener;
    paramOnPayLinstener = new CustomReqMsgVo();
    paramOnPayLinstener.setType(CustomReqMsgVo.CustomType.Pay);
    paramOnPayLinstener.Params = new CustomReqMsgVo.PayReq();
    ((CustomReqMsgVo.PayReq)paramOnPayLinstener.Params).Account = this.userInfo.getUserPhone();
    ((CustomReqMsgVo.PayReq)paramOnPayLinstener.Params).OrderNo = paramString;
    paramString = new CustomMsgVo(paramOnPayLinstener);
    onSendCustomMessage(new k().a(paramString), null);
  }
  
  public void sendPing()
  {
    n.f(TAG, "ping");
    Object localObject = new CustomReqMsgVo();
    ((CustomReqMsgVo)localObject).setType(CustomReqMsgVo.CustomType.Ping);
    ((CustomReqMsgVo)localObject).Params = new CustomReqMsgVo.Login();
    ((CustomReqMsgVo.Login)((CustomReqMsgVo)localObject).Params).Account = this.userInfo.getUserPhone();
    localObject = new CustomMsgVo(localObject);
    onSendCustomMessage(new k().a(localObject), new MessageControl.5(this));
    if (this.mHandler != null)
    {
      this.mHandler.removeMessages(258);
      this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(258), 30000L);
    }
  }
  
  public void sendQueryAccount()
  {
    if (this.userInfo != null)
    {
      Object localObject = new CustomReqMsgVo();
      ((CustomReqMsgVo)localObject).setType(CustomReqMsgVo.CustomType.QueryAccount);
      ((CustomReqMsgVo)localObject).Params = new CustomReqMsgVo.Login();
      ((CustomReqMsgVo.Login)((CustomReqMsgVo)localObject).Params).Account = this.userInfo.getUserPhone();
      localObject = new CustomMsgVo(localObject);
      onSendCustomMessage(new k().a(localObject), null);
    }
  }
  
  public void sendRedEnvelope(int paramInt1, int paramInt2, String paramString)
  {
    CustomReqMsgVo localCustomReqMsgVo = new CustomReqMsgVo();
    localCustomReqMsgVo.setType(CustomReqMsgVo.CustomType.MoneyEvent);
    localCustomReqMsgVo.Params = new CustomReqMsgVo.RedEnvelopeReq();
    ((CustomReqMsgVo.RedEnvelopeReq)localCustomReqMsgVo.Params).Account = this.userInfo.getUserPhone();
    ((CustomReqMsgVo.RedEnvelopeReq)localCustomReqMsgVo.Params).Diamond = paramInt1;
    ((CustomReqMsgVo.RedEnvelopeReq)localCustomReqMsgVo.Params).EventName = paramString;
    ((CustomReqMsgVo.RedEnvelopeReq)localCustomReqMsgVo.Params).Strategy = 0;
    ((CustomReqMsgVo.RedEnvelopeReq)localCustomReqMsgVo.Params).HotType = 0;
    ((CustomReqMsgVo.RedEnvelopeReq)localCustomReqMsgVo.Params).Max = 2000;
    ((CustomReqMsgVo.RedEnvelopeReq)localCustomReqMsgVo.Params).Min = 1;
    ((CustomReqMsgVo.RedEnvelopeReq)localCustomReqMsgVo.Params).Numbers = paramInt2;
    paramString = new CustomMsgVo(localCustomReqMsgVo);
    onSendCustomMessage(new k().a(paramString), null);
  }
  
  public void sendRefreshChat(ChatEntity.ChatGuestType paramChatGuestType, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    paramChatGuestType = getChatEntity(paramChatGuestType, paramString1, paramString2, paramString3, paramString4);
    if (this.mHandler == null) {
      return;
    }
    paramString1 = this.mHandler.obtainMessage(260);
    paramString1.obj = paramChatGuestType;
    this.mHandler.sendMessage(paramString1);
  }
  
  public void sendRoomInfo(String paramString)
  {
    CustomReqMsgVo localCustomReqMsgVo;
    CustomReqMsgVo.RoomInfoReq localRoomInfoReq;
    if (this.userInfo != null)
    {
      localCustomReqMsgVo = new CustomReqMsgVo();
      localCustomReqMsgVo.setType(CustomReqMsgVo.CustomType.GetRoomInfo);
      localCustomReqMsgVo.Params = new CustomReqMsgVo.RoomInfoReq();
      ((CustomReqMsgVo.RoomInfoReq)localCustomReqMsgVo.Params).Account = this.userInfo.getUserPhone();
      ((CustomReqMsgVo.RoomInfoReq)localCustomReqMsgVo.Params).AccountName = this.userInfo.getUserName();
      ((CustomReqMsgVo.RoomInfoReq)localCustomReqMsgVo.Params).RequestSrc = paramString;
      ((CustomReqMsgVo.RoomInfoReq)localCustomReqMsgVo.Params).ClientVersion = g.a().r();
      localRoomInfoReq = (CustomReqMsgVo.RoomInfoReq)localCustomReqMsgVo.Params;
      if (!"app_dzh".equals("app_dzh")) {
        break label149;
      }
    }
    label149:
    for (paramString = "1";; paramString = "2")
    {
      localRoomInfoReq.AppSource = paramString;
      paramString = new CustomMsgVo(localCustomReqMsgVo);
      onSendCustomMessage(new k().a(paramString), null);
      return;
    }
  }
  
  public void sendThumbUp(int paramInt)
  {
    if (this.userInfo != null)
    {
      Object localObject = new CustomReqMsgVo();
      ((CustomReqMsgVo)localObject).setType(CustomReqMsgVo.CustomType.Up);
      ((CustomReqMsgVo)localObject).Params = new CustomReqMsgVo.UpReq();
      ((CustomReqMsgVo.UpReq)((CustomReqMsgVo)localObject).Params).Account = this.userInfo.getUserPhone();
      ((CustomReqMsgVo.UpReq)((CustomReqMsgVo)localObject).Params).UpNum = paramInt;
      localObject = new CustomMsgVo(localObject);
      onSendCustomMessage(new k().a(localObject), null);
    }
  }
  
  public void setOnQueryAccountListener(MessageControl.AccountNumberListener paramAccountNumberListener)
  {
    this.mAccountNumberListener = paramAccountNumberListener;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\control\MessageControl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */