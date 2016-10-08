package com.tencent.avsdkhost.control;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
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
import com.tencent.avsdk.Model.CustomReqMsgVo.ShutUpReq;
import com.tencent.avsdk.Model.CustomReqMsgVo.UpLoadInfo;
import com.tencent.avsdk.Model.CustomReqMsgVo.UpReq;
import com.tencent.avsdk.Model.CustomRspMsgVo.AccountRsp;
import com.tencent.avsdk.Model.CustomRspMsgVo.LoginRsp;
import com.tencent.avsdk.Model.CustomRspMsgVo.Null;
import com.tencent.avsdk.Model.CustomRspMsgVo.OwnerPublishRsp;
import com.tencent.avsdk.Model.CustomRspMsgVo.OwnerRsp;
import com.tencent.avsdk.Model.CustomRspMsgVo.RoomInfo;
import com.tencent.avsdk.Model.CustomRspMsgVo.RoomMemberRsp;
import com.tencent.avsdk.Model.CustomSysMsgVo.AccountStatus;
import com.tencent.avsdk.Model.CustomSysMsgVo.FollowPushSys;
import com.tencent.avsdk.Model.CustomSysMsgVo.MemberListItem;
import com.tencent.avsdk.Model.CustomSysMsgVo.Msg;
import com.tencent.avsdk.Model.CustomSysMsgVo.OwnerRankPushSys;
import com.tencent.avsdk.Model.CustomSysMsgVo.OwnerShowAdvertPushSys;
import com.tencent.avsdk.Model.CustomSysMsgVo.Present;
import com.tencent.avsdk.Model.CustomSysMsgVo.RedEnvelopeSys;
import com.tencent.avsdk.Model.CustomSysMsgVo.RoomAccountChange;
import com.tencent.avsdk.Model.CustomSysMsgVo.RoomInfo;
import com.tencent.avsdk.Model.CustomSysMsgVo.RoomMemberSys;
import com.tencent.avsdk.Model.CustomSysMsgVo.UserInfoPushSys;
import com.tencent.avsdk.Model.TextMsgVo;
import com.tencent.avsdk.UserInfo;
import com.tencent.avsdkhost.ChatEntityHost;
import com.tencent.avsdkhost.ChatEntityHost.ChatHostType;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.Inflater;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MessageControlHost
{
  private static String TAG = "ilvb";
  private static final int chartListSize = 200;
  public static MessageControlHost messageControl;
  private List<String> accountTags = new ArrayList();
  private String groupId;
  private MessageControlHost.AccountNumberListener mAccountNumberListener;
  private List<ChatEntityHost> mArrayListChatEntity = new ArrayList();
  private TIMConversation mConversation;
  private k mGson = new k();
  private Handler mHandler;
  private volatile boolean mJoinGroupSuccess = false;
  private MessageControlHost.OnLoginLinstener mOnLoginLinstener;
  private MessageControlHost.OnPayLinstener mOnPayLinstener;
  private TIMMessageListener msgListener = new MessageControlHost.4(this);
  public int onLineNumber;
  private List<CustomSysMsgVo.MemberListItem> roomMemberList = new ArrayList();
  private UserInfo userInfo;
  
  public static byte[] decompress(byte[] paramArrayOfByte)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(paramArrayOfByte.length);
    Inflater localInflater = new Inflater();
    try
    {
      localInflater.setInput(paramArrayOfByte);
      paramArrayOfByte = new byte['Ѐ'];
      while (!localInflater.finished()) {
        localByteArrayOutputStream.write(paramArrayOfByte, 0, localInflater.inflate(paramArrayOfByte));
      }
    }
    finally
    {
      localInflater.end();
    }
    return localByteArrayOutputStream.toByteArray();
  }
  
  private ChatEntityHost getChatEntity(TIMElem paramTIMElem, boolean paramBoolean, TIMConversationType paramTIMConversationType)
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
                paramTIMElem = new ChatEntityHost(ChatEntityHost.ChatHostType.CHAT_TEXT);
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
              paramTIMElem = ChatEntityHost.ChatHostType.CHAT_TEXT;
              if (paramTIMConversationType == TIMConversationType.C2C) {
                paramTIMElem = ChatEntityHost.ChatHostType.CHAT_C2C_TEXT;
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
  
  public static ChatEntityHost getChatEntity(ChatEntityHost.ChatHostType paramChatHostType, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    ChatEntityHost localChatEntityHost = new ChatEntityHost(paramChatHostType);
    localChatEntityHost.user = paramString1;
    localChatEntityHost.event = paramString2;
    paramChatHostType = paramString4;
    if (!TextUtils.isEmpty(paramString4)) {
      if (!paramString4.equals("-1"))
      {
        paramChatHostType = paramString4;
        if (!paramString4.equals("0")) {}
      }
      else
      {
        paramChatHostType = "";
      }
    }
    localChatEntityHost.AccountLevel = paramChatHostType;
    localChatEntityHost.userAccount = paramString3;
    return localChatEntityHost;
  }
  
  public static MessageControlHost getInstance()
  {
    if (messageControl == null) {
      messageControl = new MessageControlHost();
    }
    return messageControl;
  }
  
  private void handleCustomMsg(TIMElem paramTIMElem)
  {
    int i = -1;
    if (paramTIMElem == null) {}
    label671:
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
                  break label671;
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
                sendRefreshChat(ChatEntityHost.ChatHostType.CHAT_ERROR, "", "获取主播信息失败!", "", "");
                return;
              }
              if (((String)localObject3).equals(CustomReqMsgVo.CustomType.GetRoomInfo.getValue()))
              {
                sendRefreshChat(ChatEntityHost.ChatHostType.CHAT_ERROR, "", "获取房间信息失败!", "", "");
                return;
              }
              if (((String)localObject3).equals(CustomReqMsgVo.CustomType.QueryAccount.getValue()))
              {
                sendRefreshChat(ChatEntityHost.ChatHostType.CHAT_ERROR, "", "查询余额信息失败!", "", "");
                if (this.mAccountNumberListener != null) {
                  this.mAccountNumberListener.accountRes(null);
                }
              }
              else
              {
                if (((String)localObject3).equals(CustomReqMsgVo.CustomType.Follow.getValue()))
                {
                  sendRefreshChat(ChatEntityHost.ChatHostType.CHAT_ERROR, "", "关注信息失败!", "", "");
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
                  sendRefreshChat(ChatEntityHost.ChatHostType.CHAT_ERROR, "", "购买礼物失败!", "", "");
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
                  if (this.mOnLoginLinstener != null) {
                    this.mOnLoginLinstener.login(null, true, String.valueOf(i));
                  }
                }
                else if (((String)localObject3).equals(CustomReqMsgVo.CustomType.MoneyEvent.getValue()))
                {
                  sendRefreshChat(ChatEntityHost.ChatHostType.CHAT_ERROR, "", "发送红包失败!" + paramTIMElem, "", "");
                  return;
                }
              }
            }
          }
        } while (!((String)localObject3).equals(CustomReqMsgVo.CustomType.ShutUp.getValue()));
        this.mHandler.obtainMessage(315, "禁言失败!").sendToTarget();
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
    int i = 0;
    k localk = new k();
    Object localObject = this.mHandler.obtainMessage();
    if (paramString1.equals(CustomReqMsgVo.CustomType.ShutUp.getValue())) {
      this.mHandler.obtainMessage(315, "禁言成功!").sendToTarget();
    }
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              return;
              if (paramString1.equals(CustomReqMsgVo.CustomType.Follow.getValue()))
              {
                this.mHandler.sendEmptyMessage(17);
                return;
              }
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
                if ((!TextUtils.isEmpty(paramString1.AccountLevel)) && ((paramString1.AccountLevel.equals("-1")) || (paramString1.AccountLevel.equals("0")))) {
                  paramString1.AccountLevel = "";
                }
                this.userInfo.setAccountLevel(paramString1.AccountLevel);
                ((Message)localObject).obj = paramString1;
                ((Message)localObject).what = 272;
                this.mHandler.sendMessage((Message)localObject);
                return;
              }
              if (!paramString1.equals(CustomReqMsgVo.CustomType.QueryAccount.getValue())) {
                break;
              }
              paramString1 = (CustomRspMsgVo.AccountRsp)localk.a(paramString2, CustomRspMsgVo.AccountRsp.class);
              ((Message)localObject).obj = paramString1;
              ((Message)localObject).what = 273;
              this.mHandler.sendMessage((Message)localObject);
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
              ((Message)localObject).obj = ((CustomRspMsgVo.AccountRsp)localk.a(paramString2, CustomRspMsgVo.AccountRsp.class));
              ((Message)localObject).what = 274;
              this.mHandler.sendMessage((Message)localObject);
              return;
            }
            if (paramString1.equals(CustomReqMsgVo.CustomType.GetOwnerInfo.getValue()))
            {
              ((Message)localObject).obj = ((CustomRspMsgVo.OwnerRsp)localk.a(paramString2, CustomRspMsgVo.OwnerRsp.class));
              ((Message)localObject).what = 277;
              this.mHandler.sendMessage((Message)localObject);
              return;
            }
            if (!paramString1.equals(CustomReqMsgVo.CustomType.Login.getValue())) {
              break;
            }
            paramString1 = (CustomRspMsgVo.LoginRsp)localk.a(paramString2, CustomRspMsgVo.LoginRsp.class);
          } while (this.mOnLoginLinstener == null);
          this.mOnLoginLinstener.login(paramString1, false, "");
          return;
          if (!paramString1.equals(CustomReqMsgVo.CustomType.Pay.getValue())) {
            break;
          }
        } while (this.mOnPayLinstener == null);
        this.mOnPayLinstener.pay(0);
        return;
      } while (!paramString1.equals(CustomReqMsgVo.CustomType.GetRoomMember.getValue()));
      paramString1 = (CustomRspMsgVo.RoomMemberRsp)localk.a(paramString2, CustomRspMsgVo.RoomMemberRsp.class);
    } while (TextUtils.isEmpty(paramString1.MemberList));
    paramString1 = Base64.decode(paramString1.MemberList, 0);
    try
    {
      paramString1 = new JSONArray(new String(decompress(paramString1)));
      paramString2 = new ArrayList();
      while (i < paramString1.length())
      {
        localObject = paramString1.get(i).toString();
        paramString2.add((CustomSysMsgVo.MemberListItem)new k().a((String)localObject, CustomSysMsgVo.MemberListItem.class));
        i += 1;
      }
      this.roomMemberList.clear();
      this.roomMemberList.addAll(paramString2);
      return;
    }
    catch (Exception paramString1)
    {
      paramString1.printStackTrace();
    }
  }
  
  private void handleSys(String paramString1, String paramString2)
  {
    Object localObject2 = new k();
    Object localObject1 = this.mHandler.obtainMessage();
    if (paramString1.equals("RoomInfo"))
    {
      paramString1 = (CustomSysMsgVo.RoomInfo)((k)localObject2).a(paramString2, CustomSysMsgVo.RoomInfo.class);
      if (!TextUtils.isEmpty(paramString1.MemberNum)) {
        this.onLineNumber = Integer.parseInt(paramString1.MemberNum);
      }
      ((Message)localObject1).obj = paramString1;
      ((Message)localObject1).what = 271;
      this.mHandler.sendMessage((Message)localObject1);
    }
    do
    {
      do
      {
        do
        {
          do
          {
            return;
            if (paramString1.equals("SendPresent"))
            {
              ((Message)localObject1).obj = ((CustomSysMsgVo.Present)((k)localObject2).a(paramString2, CustomSysMsgVo.Present.class));
              ((Message)localObject1).what = 269;
              this.mHandler.sendMessage((Message)localObject1);
              return;
            }
            if (paramString1.equals("SendMsg"))
            {
              paramString2 = (CustomSysMsgVo.Msg)((k)localObject2).a(paramString2, CustomSysMsgVo.Msg.class);
              if (paramString2.MsgType.equals("1")) {}
              for (paramString1 = "主播公告";; paramString1 = "系统公告")
              {
                sendRefreshChat(ChatEntityHost.ChatHostType.CHAT_SYSTEM, paramString1, paramString2.Msg, "", "");
                return;
              }
            }
            if (paramString1.equals("RoomMember11"))
            {
              if (((CustomSysMsgVo.RoomAccountChange)((k)localObject2).a(paramString2, CustomSysMsgVo.RoomAccountChange.class)).UpdateType.equals("1")) {
                return;
              }
              return;
            }
            if (!paramString1.equals("AccountStatus")) {
              break;
            }
            paramString1 = (CustomSysMsgVo.AccountStatus)((k)localObject2).a(paramString2, CustomSysMsgVo.AccountStatus.class);
          } while (paramString1.AccountStatus.equals("1"));
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
          paramString1 = (CustomSysMsgVo.RedEnvelopeSys)((k)localObject2).a(paramString2, CustomSysMsgVo.RedEnvelopeSys.class);
          paramString2 = this.mHandler.obtainMessage(295);
          paramString2.obj = paramString1;
          this.mHandler.sendMessage(paramString2);
          paramString2 = getChatEntity(ChatEntityHost.ChatHostType.CHAT_HONGBAO, paramString1.AccountName, "我给大家送了一个红包", paramString1.Account, paramString1.AccountLevel);
          paramString2.hongbaoUrl = paramString1.HotUrl;
          paramString1 = this.mHandler.obtainMessage(260);
          paramString1.obj = paramString2;
          paramString1.sendToTarget();
          return;
        }
        if (!paramString1.equals("UserInfoPush")) {
          break;
        }
        paramString1 = (CustomSysMsgVo.UserInfoPushSys)((k)localObject2).a(paramString2, CustomSysMsgVo.UserInfoPushSys.class);
        if (!TextUtils.isEmpty(paramString1.AccountLevel))
        {
          if ((paramString1.AccountLevel.equals("-1")) || (paramString1.AccountLevel.equals("0"))) {
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
        paramString1 = (CustomRspMsgVo.OwnerPublishRsp)((k)localObject2).a(paramString2, CustomRspMsgVo.OwnerPublishRsp.class);
        paramString2 = this.mHandler.obtainMessage(299);
        paramString2.obj = paramString1;
        this.mHandler.sendMessage(paramString2);
        return;
      }
      if (paramString1.equals("OwnerShowAdvertPush"))
      {
        paramString1 = (CustomSysMsgVo.OwnerShowAdvertPushSys)((k)localObject2).a(paramString2, CustomSysMsgVo.OwnerShowAdvertPushSys.class);
        paramString2 = this.mHandler.obtainMessage(300);
        paramString2.obj = paramString1;
        this.mHandler.sendMessage(paramString2);
        return;
      }
      if (!paramString1.equals("FollowPush")) {
        break;
      }
      localObject2 = (CustomSysMsgVo.FollowPushSys)((k)localObject2).a(paramString2, CustomSysMsgVo.FollowPushSys.class);
    } while (!((CustomSysMsgVo.FollowPushSys)localObject2).RoomId.equals(this.groupId));
    paramString1 = this.roomMemberList.iterator();
    do
    {
      if (!paramString1.hasNext()) {
        break;
      }
      paramString2 = (CustomSysMsgVo.MemberListItem)paramString1.next();
    } while (!paramString2.Account.equals(((CustomSysMsgVo.FollowPushSys)localObject2).Account));
    for (;;)
    {
      Object localObject3;
      if (((CustomSysMsgVo.FollowPushSys)localObject2).FollowType.equals("0"))
      {
        paramString1 = "取消了关注";
        localObject3 = ChatEntityHost.ChatHostType.CHAT_FOLLOW_PUSH;
        if (paramString2 != null) {
          break label838;
        }
        localObject1 = ((CustomSysMsgVo.FollowPushSys)localObject2).Account;
        label784:
        localObject2 = ((CustomSysMsgVo.FollowPushSys)localObject2).Account;
        if (paramString2 != null) {
          break label846;
        }
      }
      label838:
      label846:
      for (paramString2 = "";; paramString2 = paramString2.AccountLevel)
      {
        paramString1 = getChatEntity((ChatEntityHost.ChatHostType)localObject3, (String)localObject1, paramString1, (String)localObject2, paramString2);
        paramString2 = this.mHandler.obtainMessage(260);
        paramString2.obj = paramString1;
        paramString2.sendToTarget();
        return;
        paramString1 = "关注了你";
        break;
        localObject1 = paramString2.AccountName;
        break label784;
      }
      label985:
      int i;
      if (paramString1.equals("RoomMember"))
      {
        paramString1 = (CustomSysMsgVo.RoomMemberSys)((k)localObject2).a(paramString2, CustomSysMsgVo.RoomMemberSys.class);
        if ((!paramString1.RoomId.equals(this.groupId)) || (paramString1.MemberList == null) || (paramString1.MemberList.size() <= 0)) {
          break;
        }
        localObject1 = new ArrayList();
        localObject2 = paramString1.MemberList.iterator();
        if (((Iterator)localObject2).hasNext())
        {
          localObject3 = (CustomSysMsgVo.MemberListItem)((Iterator)localObject2).next();
          paramString1 = "未知";
          if (((CustomSysMsgVo.MemberListItem)localObject3).UpdateType.equals("1"))
          {
            paramString1 = "进入房间";
            this.roomMemberList.add(localObject3);
          }
          while (!((CustomSysMsgVo.MemberListItem)localObject3).UpdateType.equals("2"))
          {
            paramString2 = ((CustomSysMsgVo.MemberListItem)localObject3).AccountName;
            if (((CustomSysMsgVo.MemberListItem)localObject3).AccountName.startsWith("$")) {
              paramString2 = "游客";
            }
            ((List)localObject1).add(getChatEntity(ChatEntityHost.ChatHostType.CHAT_FOLLOW_PUSH, paramString2, paramString1, ((CustomSysMsgVo.MemberListItem)localObject3).Account, ((CustomSysMsgVo.MemberListItem)localObject3).AccountLevel));
            break;
          }
          i = 0;
          label1054:
          if (i >= this.roomMemberList.size()) {
            break label1200;
          }
          if (!((CustomSysMsgVo.MemberListItem)this.roomMemberList.get(i)).Account.equals(((CustomSysMsgVo.MemberListItem)localObject3).Account)) {}
        }
      }
      for (;;)
      {
        if (i != -1) {
          this.roomMemberList.remove(i);
        }
        paramString1 = "退出房间";
        break label985;
        i += 1;
        break label1054;
        paramString1 = this.mHandler.obtainMessage(260);
        paramString1.obj = localObject1;
        paramString1.sendToTarget();
        return;
        if (!paramString1.equals("OwnerRankPush")) {
          break;
        }
        paramString1 = (CustomSysMsgVo.OwnerRankPushSys)((k)localObject2).a(paramString2, CustomSysMsgVo.OwnerRankPushSys.class);
        paramString2 = this.mHandler.obtainMessage(305);
        paramString2.obj = paramString1;
        this.mHandler.sendMessage(paramString2);
        return;
        label1200:
        i = -1;
      }
      paramString2 = null;
    }
  }
  
  private void refreshChat(List<TIMMessage> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    int i = paramList.size() - 1;
    for (;;)
    {
      if (i >= 0)
      {
        localTIMMessage = (TIMMessage)paramList.get(i);
        if ((localTIMMessage.getConversation().getType() == TIMConversationType.Group) && (!this.groupId.equals(localTIMMessage.getConversation().getPeer())))
        {
          i -= 1;
        }
        else
        {
          j = 0;
          label77:
          if (j < localTIMMessage.getElementCount()) {
            if (localTIMMessage.getElement(j) != null) {
              break label106;
            }
          }
        }
      }
    }
    label106:
    while (localArrayList.size() <= 0)
    {
      TIMMessage localTIMMessage;
      int j;
      for (;;)
      {
        j += 1;
        break label77;
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
          if (((TIMGroupSystemElem)localObject).getGroupId().equals(this.groupId))
          {
            if (TIMGroupSystemElemType.TIM_GROUP_SYSTEM_DELETE_GROUP_TYPE == ((TIMGroupSystemElem)localObject).getSubtype())
            {
              Log.e(TAG, "主播退出了---->TIM_GROUP_SYSTEM_DELETE_GROUP_TYPE");
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
        localObject = new MessageControlHost.8(this, paramString);
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
      TextMsgVo localTextMsgVo = new TextMsgVo(this.userInfo, 1);
      localTextMsgVo.Msg = paramString;
      localTIMTextElem.setText(new k().a(localTextMsgVo));
      if (localTIMMessage.addElement(localTIMTextElem) != 0)
      {
        this.mHandler.sendEmptyMessage(257);
        return;
      }
    } while (this.mConversation == null);
    this.mConversation.sendMessage(localTIMMessage, new MessageControlHost.7(this, paramTIMValueCallBack));
  }
  
  public void addListChatEntity(ChatEntityHost paramChatEntityHost)
  {
    try
    {
      if (this.mArrayListChatEntity.size() + 1 > 200) {
        this.mArrayListChatEntity.remove(0);
      }
      this.mArrayListChatEntity.add(paramChatEntityHost);
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
    TIMManager.getInstance().removeMessageListener(this.msgListener);
    TIMManager.getInstance().setUserStatusListener(null);
    if (this.groupId != null)
    {
      TIMGroupManager.getInstance().quitGroup(this.groupId, new MessageControlHost.3(this));
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
  
  public List<ChatEntityHost> getListChatEntity()
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
    TIMGroupManager.getInstance().applyJoinGroup(this.groupId, "申请加入" + this.groupId, new MessageControlHost.1(this, paramTIMCallBack));
    this.mConversation = TIMManager.getInstance().getConversation(TIMConversationType.Group, this.groupId);
    TIMManager.getInstance().addMessageListener(this.msgListener);
    TIMManager.getInstance().setUserStatusListener(new MessageControlHost.2(this));
    sendPing();
    this.mJoinGroupSuccess = true;
  }
  
  public void onSendChatMessage(String paramString)
  {
    ChatEntityHost localChatEntityHost = getChatEntity(ChatEntityHost.ChatHostType.CHAT_TEXT, this.userInfo.getUserName(), paramString, this.userInfo.getUserPhone(), this.userInfo.getAccountLevel());
    if (localChatEntityHost != null)
    {
      Message localMessage = this.mHandler.obtainMessage(260);
      localMessage.obj = localChatEntityHost;
      this.mHandler.sendMessage(localMessage);
    }
    sendMessage(paramString, new MessageControlHost.6(this));
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
  
  public void sendLogin(MessageControlHost.OnLoginLinstener paramOnLoginLinstener)
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
  
  public void sendOwnerRoomAllUser(String paramString)
  {
    CustomReqMsgVo localCustomReqMsgVo = new CustomReqMsgVo();
    localCustomReqMsgVo.setType(CustomReqMsgVo.CustomType.GetRoomMember);
    localCustomReqMsgVo.Params = new CustomReqMsgVo.OwnerReq();
    ((CustomReqMsgVo.OwnerReq)localCustomReqMsgVo.Params).OwnerAccount = paramString;
    paramString = new CustomMsgVo(localCustomReqMsgVo);
    onSendCustomMessage(new k().a(paramString), null);
  }
  
  public void sendPay(String paramString, MessageControlHost.OnPayLinstener paramOnPayLinstener)
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
    onSendCustomMessage(new k().a(localObject), new MessageControlHost.5(this));
    this.mHandler.removeMessages(258);
    this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(258), 10000L);
  }
  
  public void sendQueryAccount()
  {
    Object localObject = new CustomReqMsgVo();
    ((CustomReqMsgVo)localObject).setType(CustomReqMsgVo.CustomType.QueryAccount);
    ((CustomReqMsgVo)localObject).Params = new CustomReqMsgVo.Login();
    ((CustomReqMsgVo.Login)((CustomReqMsgVo)localObject).Params).Account = this.userInfo.getUserPhone();
    localObject = new CustomMsgVo(localObject);
    onSendCustomMessage(new k().a(localObject), null);
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
    ((CustomReqMsgVo.RedEnvelopeReq)localCustomReqMsgVo.Params).Max = 0;
    ((CustomReqMsgVo.RedEnvelopeReq)localCustomReqMsgVo.Params).Min = 0;
    ((CustomReqMsgVo.RedEnvelopeReq)localCustomReqMsgVo.Params).Numbers = paramInt2;
    paramString = new CustomMsgVo(localCustomReqMsgVo);
    onSendCustomMessage(new k().a(paramString), null);
  }
  
  public void sendRefreshChat(ChatEntityHost.ChatHostType paramChatHostType, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    paramChatHostType = getChatEntity(paramChatHostType, paramString1, paramString2, paramString3, paramString4);
    paramString1 = this.mHandler.obtainMessage(260);
    paramString1.obj = paramChatHostType;
    this.mHandler.sendMessage(paramString1);
  }
  
  public void sendRoomInfo(String paramString)
  {
    CustomReqMsgVo localCustomReqMsgVo = new CustomReqMsgVo();
    localCustomReqMsgVo.setType(CustomReqMsgVo.CustomType.GetRoomInfo);
    localCustomReqMsgVo.Params = new CustomReqMsgVo.RoomInfoReq();
    ((CustomReqMsgVo.RoomInfoReq)localCustomReqMsgVo.Params).Account = this.userInfo.getUserPhone();
    ((CustomReqMsgVo.RoomInfoReq)localCustomReqMsgVo.Params).AccountName = this.userInfo.getUserName();
    ((CustomReqMsgVo.RoomInfoReq)localCustomReqMsgVo.Params).RequestSrc = paramString;
    ((CustomReqMsgVo.RoomInfoReq)localCustomReqMsgVo.Params).ClientVersion = g.a().r();
    CustomReqMsgVo.RoomInfoReq localRoomInfoReq = (CustomReqMsgVo.RoomInfoReq)localCustomReqMsgVo.Params;
    if ("app_dzh".equals("app_dzh")) {}
    for (paramString = "1";; paramString = "2")
    {
      localRoomInfoReq.AppSource = paramString;
      paramString = new CustomMsgVo(localCustomReqMsgVo);
      onSendCustomMessage(new k().a(paramString), null);
      return;
    }
  }
  
  public void sendShutUp(String paramString)
  {
    CustomReqMsgVo localCustomReqMsgVo = new CustomReqMsgVo();
    localCustomReqMsgVo.setType(CustomReqMsgVo.CustomType.ShutUp);
    localCustomReqMsgVo.Params = new CustomReqMsgVo.ShutUpReq();
    ((CustomReqMsgVo.ShutUpReq)localCustomReqMsgVo.Params).Account = paramString;
    ((CustomReqMsgVo.ShutUpReq)localCustomReqMsgVo.Params).ShutUpTimeType = "1";
    paramString = new CustomMsgVo(localCustomReqMsgVo);
    onSendCustomMessage(new k().a(paramString), null);
  }
  
  public void sendThumbUp(int paramInt)
  {
    Object localObject = new CustomReqMsgVo();
    ((CustomReqMsgVo)localObject).setType(CustomReqMsgVo.CustomType.Up);
    ((CustomReqMsgVo)localObject).Params = new CustomReqMsgVo.UpReq();
    ((CustomReqMsgVo.UpReq)((CustomReqMsgVo)localObject).Params).Account = this.userInfo.getUserPhone();
    ((CustomReqMsgVo.UpReq)((CustomReqMsgVo)localObject).Params).UpNum = paramInt;
    localObject = new CustomMsgVo(localObject);
    onSendCustomMessage(new k().a(localObject), null);
  }
  
  public void setOnQueryAccountListener(MessageControlHost.AccountNumberListener paramAccountNumberListener)
  {
    this.mAccountNumberListener = paramAccountNumberListener;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\control\MessageControlHost.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */