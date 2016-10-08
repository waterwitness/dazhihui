package com.tencent.avsdk.activity;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.os.PowerManager.WakeLock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.Toast;
import com.android.dazhihui.d.d;
import com.android.dazhihui.d.n;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.screen.stock.LoginMainScreen;
import com.android.dazhihui.ui.screen.stock.MainScreen;
import com.android.dazhihui.ui.widget.MyWebView;
import com.android.dazhihui.w;
import com.tencent.av.sdk.AVContext;
import com.tencent.av.sdk.AVEndpoint;
import com.tencent.av.sdk.AVRoomMulti;
import com.tencent.av.sdk.AVView;
import com.tencent.avsdk.ChatEntity;
import com.tencent.avsdk.ChatEntity.ChatGuestType;
import com.tencent.avsdk.Model.CustomRspMsgVo.AccountRsp;
import com.tencent.avsdk.Model.CustomRspMsgVo.OwnerPublishRsp;
import com.tencent.avsdk.Model.CustomRspMsgVo.OwnerRsp;
import com.tencent.avsdk.Model.CustomRspMsgVo.RoomInfo;
import com.tencent.avsdk.Model.CustomRspMsgVo.RoomUser;
import com.tencent.avsdk.Model.CustomSysMsgVo.OwnerRankPushSys;
import com.tencent.avsdk.Model.CustomSysMsgVo.OwnerShowAdvertPushSys;
import com.tencent.avsdk.Model.CustomSysMsgVo.Present;
import com.tencent.avsdk.Model.CustomSysMsgVo.RedEnvelopeSys;
import com.tencent.avsdk.Model.CustomSysMsgVo.RoomInfo;
import com.tencent.avsdk.Model.GiftVo;
import com.tencent.avsdk.Model.GiftVo.GiftItem;
import com.tencent.avsdk.MyUserInfoDialog;
import com.tencent.avsdk.UserInfo;
import com.tencent.avsdk.UserilvbManager;
import com.tencent.avsdk.Util;
import com.tencent.avsdk.control.AVGuestUIControl;
import com.tencent.avsdk.control.AVRoomControl;
import com.tencent.avsdk.control.AVRoomControl.AudioState;
import com.tencent.avsdk.control.AVRoomControl.RoomState;
import com.tencent.avsdk.control.AnimationControl;
import com.tencent.avsdk.control.GiftManager;
import com.tencent.avsdk.control.MessageControl;
import com.tencent.avsdk.control.QavsdkControl;
import com.tencent.avsdk.widget.AboveVideoBottomView;
import com.tencent.avsdk.widget.AboveVideoContainView;
import com.tencent.avsdk.widget.AboveVideoNotSwipeView;
import com.tencent.avsdk.widget.AboveVideoTopView;
import com.tencent.avsdk.widget.FlowerView.FlowerVo;
import com.tencent.avsdk.widget.GameOverView;
import com.tencent.avsdk.widget.GiftView;
import com.tencent.avsdk.widget.TwoFlowerView;
import java.util.Iterator;
import java.util.List;

class AvGuestActivity$2
  implements Handler.Callback
{
  AvGuestActivity$2(AvGuestActivity paramAvGuestActivity) {}
  
  public boolean handleMessage(Message paramMessage)
  {
    Object localObject2 = null;
    Object localObject1 = null;
    boolean bool = true;
    switch (paramMessage.what)
    {
    case 287: 
    default: 
    case 306: 
      do
      {
        return false;
        Log.d("ilvb", "AvGuestActivity mHandler NOT_OPEN 主播未开播");
        AvGuestActivity.access$100(this.this$0).removeMessages(306);
      } while (AvGuestActivity.access$200(this.this$0) == null);
      AvGuestActivity.access$200(this.this$0).setVisibility(0);
      return false;
    case 349: 
      Log.d("ilvb", "AvGuestActivity mHandler SDK_PROCESS_1_START_CONTEXT_ERROR");
      AvGuestActivity.access$100(this.this$0).removeMessages(349);
      if (AvGuestActivity.access$300(this.this$0) == 6208) {}
      for (localObject1 = "您的帐号先前在另一设备登录过，请确认后重新进入!";; localObject1 = "进入直播超时，请退出后重新进入!")
      {
        localObject2 = localObject1;
        if (paramMessage.obj != null)
        {
          localObject2 = localObject1;
          if ((paramMessage.obj instanceof String))
          {
            paramMessage = (String)paramMessage.obj;
            localObject2 = localObject1;
            if (!TextUtils.isEmpty(paramMessage)) {
              localObject2 = paramMessage;
            }
          }
        }
        paramMessage = new AlertDialog.Builder(this.this$0);
        paramMessage.setMessage((CharSequence)localObject2);
        paramMessage.setTitle("提示");
        paramMessage.setCancelable(false);
        paramMessage.setNeutralButton("退出", new AvGuestActivity.2.1(this));
        paramMessage.show();
        return false;
      }
    case 320: 
      Log.d("ilvb", "AvGuestActivity SDK_PROCESS_1_START_CONTEXT_REQUEST");
      AvGuestActivity.access$100(this.this$0).removeMessages(320);
      paramMessage = UserilvbManager.getInstance().getUserName();
      localObject1 = UserilvbManager.getInstance().getToken();
      localObject2 = UserilvbManager.getInstance().getNickName();
      if ((!TextUtils.isEmpty(paramMessage)) && (!TextUtils.isEmpty((CharSequence)localObject1)))
      {
        n.d("ilvb", "AvGuestActivity SDK_PROCESS_1_START_CONTEXT_REQUEST userName=" + paramMessage + " nickName=" + (String)localObject2 + " userSig=" + (String)localObject1);
        if ((!paramMessage.equals(AvGuestActivity.access$400(this.this$0).getUserPhone())) || (!((String)localObject1).equals(AvGuestActivity.access$400(this.this$0).getUsersig()))) {
          break label7073;
        }
      }
      break;
    }
    label1582:
    label4823:
    label4899:
    label4994:
    label5337:
    label5461:
    label5493:
    label7056:
    label7073:
    for (int i = 1;; i = 0)
    {
      AvGuestActivity.access$400(this.this$0).setUserPhone(paramMessage);
      AvGuestActivity.access$400(this.this$0).setUsersig((String)localObject1);
      AvGuestActivity.access$400(this.this$0).setUserName((String)localObject2);
      AvGuestActivity.access$400(this.this$0).setHeadImagePath(w.a().b());
      if (!AvGuestActivity.access$500(this.this$0).hasAVContext())
      {
        n.d("ilvb", "AvGuestActivity 启动SDK系统 phone=" + AvGuestActivity.access$400(this.this$0).getUserPhone() + "  Usersig=" + AvGuestActivity.access$400(this.this$0).getUsersig());
        AvGuestActivity.access$302(this.this$0, AvGuestActivity.access$500(this.this$0).startContext(AvGuestActivity.access$400(this.this$0).getUserPhone(), AvGuestActivity.access$400(this.this$0).getUsersig()));
        if (AvGuestActivity.access$300(this.this$0) != 0)
        {
          Log.e("ilvb", "AvGuestActivity 启动SDK系统错误 mLoginErrorCode   " + AvGuestActivity.access$300(this.this$0));
          paramMessage = AvGuestActivity.access$100(this.this$0).obtainMessage(349);
          paramMessage.arg1 = AvGuestActivity.access$300(this.this$0);
          paramMessage.sendToTarget();
          return false;
          if (TextUtils.isEmpty(paramMessage)) {
            Log.e("ilvb", "AvGuestActivity ilvb account为空");
          }
          for (paramMessage = "进入直播间时账号为空";; paramMessage = "进入直播间时签名为空")
          {
            localObject1 = new AlertDialog.Builder(this.this$0);
            ((AlertDialog.Builder)localObject1).setMessage(paramMessage);
            ((AlertDialog.Builder)localObject1).setTitle("提示");
            ((AlertDialog.Builder)localObject1).setCancelable(false);
            ((AlertDialog.Builder)localObject1).setNeutralButton("退出", new AvGuestActivity.2.2(this));
            ((AlertDialog.Builder)localObject1).show();
            return false;
            Log.e("ilvb", "AvGuestActivity ilvb token 为空");
          }
        }
        Log.d("ilvb", "AvGuestActivity 启动SDK系统... 请等待返回结果");
        return false;
      }
      if (AvGuestActivity.access$000(this.this$0))
      {
        Log.i("ilvb", "AvGuestActivity 从声音模式恢复 继续SDK系统");
        AvGuestActivity.access$100(this.this$0).sendEmptyMessage(323);
        return false;
      }
      paramMessage = AvGuestActivity.access$500(this.this$0).getAVContextUser();
      localObject1 = AvGuestActivity.access$500(this.this$0).getAVContextUserSig();
      if ((!TextUtils.isEmpty(paramMessage)) && (paramMessage.equals(AvGuestActivity.access$400(this.this$0).getUserPhone())) && (!TextUtils.isEmpty((CharSequence)localObject1)) && (((String)localObject1).equals(AvGuestActivity.access$400(this.this$0).getUsersig()))) {}
      for (int j = 1;; j = 0)
      {
        if ((i != 0) && (j != 0))
        {
          if (AvGuestActivity.access$600(this.this$0).getmRoomState() != AVRoomControl.RoomState.ROOM_EXIT_OK)
          {
            Log.i("ilvb", "AvGuestActivity SDK系统上次已经启动 user 没有变化 但是上次房间没有退出");
            AvGuestActivity.access$600(this.this$0).exitRoom();
            AvGuestActivity.access$100(this.this$0).sendEmptyMessageDelayed(320, 1000L);
            return false;
          }
          Log.i("ilvb", "AvGuestActivity SDK系统上次已经启动 user 没有变化 next enter room");
          AvGuestActivity.access$100(this.this$0).sendEmptyMessage(321);
          return false;
        }
        Log.i("ilvb", "AvGuestActivity SDK系统上次已经启动 强制要求 重启SDK系统......");
        if (AvGuestActivity.access$700(this.this$0) != null)
        {
          AvGuestActivity.access$700(this.this$0).destroy();
          AvGuestActivity.access$702(this.this$0, null);
        }
        if (AvGuestActivity.access$600(this.this$0).getmRoomState() != AVRoomControl.RoomState.ROOM_EXIT_OK) {
          AvGuestActivity.access$600(this.this$0).exitRoom();
        }
        if (AvGuestActivity.access$800(this.this$0).isSurfacePreviewInited()) {
          if (AvGuestActivity.access$800(this.this$0) != null)
          {
            if (AvGuestActivity.access$900(this.this$0) != 1) {
              break label1582;
            }
            AvGuestActivity.access$902(this.this$0, 0);
            AvGuestActivity.access$800(this.this$0).setSmallVideoViewLayout(false, AvGuestActivity.mHostIdentifier, 1);
          }
        }
        for (;;)
        {
          AvGuestActivity.access$800(this.this$0).unInitCameraaPreview();
          if (this.this$0.findViewById(2131559308).getVisibility() != 0) {
            this.this$0.findViewById(2131559308).setVisibility(0);
          }
          AvGuestActivity.access$800(this.this$0).resetRenderFlag();
          AvGuestActivity.access$500(this.this$0).stopContext();
          AvGuestActivity.access$100(this.this$0).sendEmptyMessageDelayed(320, 1000L);
          return false;
          if (AvGuestActivity.access$900(this.this$0) == 2)
          {
            AvGuestActivity.access$902(this.this$0, 0);
            AvGuestActivity.access$800(this.this$0).setSmallVideoViewLayout(false, AvGuestActivity.mHostIdentifier, 2);
          }
        }
        Log.d("ilvb", "AvGuestActivity SDK_PROCESS_2_ENTER_ROOM_REQUEST");
        AvGuestActivity.access$100(this.this$0).removeMessages(321);
        if (AvGuestActivity.access$600(this.this$0).getmRoomState() != AVRoomControl.RoomState.ROOM_EXIT_OK)
        {
          Log.i("ilvb", "AvGuestActivity 上次房间没有退出 等待上次房间退出成功再进");
          AvGuestActivity.access$600(this.this$0).exitRoom();
          AvGuestActivity.access$100(this.this$0).sendEmptyMessageDelayed(321, 1000L);
          return false;
        }
        if (Util.isNetworkAvailable(AvGuestActivity.access$1000(this.this$0))) {
          if (AvGuestActivity.access$1100(this.this$0) != 0)
          {
            Log.d("ilvb", "AvGuestActivity 正在进入直播中...  roomid=" + AvGuestActivity.access$1100(this.this$0) + " mGroupId=" + AvGuestActivity.access$1200(this.this$0));
            if (this.this$0.findViewById(2131559308).getVisibility() != 0) {
              this.this$0.findViewById(2131559308).setVisibility(0);
            }
            AvGuestActivity.access$100(this.this$0).sendEmptyMessage(323);
            AvGuestActivity.access$800(this.this$0).resetRenderFlag();
            AvGuestActivity.access$600(this.this$0).enterRoom(AvGuestActivity.access$1100(this.this$0));
            AvGuestActivity.access$100(this.this$0).sendEmptyMessageDelayed(322, 30000L);
          }
        }
        while (!AvGuestActivity.access$800(this.this$0).isSurfacePreviewInited())
        {
          AvGuestActivity.access$800(this.this$0).initSurfacePreview();
          return false;
          paramMessage = AvGuestActivity.access$100(this.this$0).obtainMessage(349);
          paramMessage.obj = "进入直播间房间号为空, 请退出重进!";
          paramMessage.sendToTarget();
          continue;
          Log.e("ilvb", this.this$0.getString(2131166014));
          AvGuestActivity.access$100(this.this$0).sendEmptyMessageDelayed(321, 5000L);
        }
        AvGuestActivity.access$100(this.this$0).removeMessages(322);
        Log.e("ilvb", "AvGuestActivity mHandler SDK_PROCESS_2_ENTER_ROOM_TIMEOUT");
        Toast.makeText(AvGuestActivity.access$1000(this.this$0), "进入房间超时!", 1).show();
        return false;
        AvGuestActivity.access$100(this.this$0).removeMessages(334);
        Log.i("ilvb", "AvGuestActivity mHandler SDK_PROCESS_4_VIDEO_DATA_REQUEST");
        if ((AvGuestActivity.access$500(this.this$0) != null) && (AvGuestActivity.access$500(this.this$0).getAVContext() != null) && (AvGuestActivity.access$500(this.this$0).getAVContext().getRoom() != null)) {}
        for (paramMessage = ((AVRoomMulti)AvGuestActivity.access$500(this.this$0).getAVContext().getRoom()).getEndpointById(AvGuestActivity.mHostIdentifier);; paramMessage = null)
        {
          n.d("ilvb", "AvGuestActivity requestHostVideo identifier " + AvGuestActivity.mHostIdentifier + " endpoint " + paramMessage);
          if (paramMessage != null)
          {
            if ((!paramMessage.hasScreenVideo()) && (!paramMessage.hasCameraVideo()))
            {
              Log.e("ilvb", "AvGuestActivity host exist but no video, delay!");
              AvGuestActivity.access$100(this.this$0).sendEmptyMessageDelayed(334, 1000L);
              return false;
            }
            AvGuestActivity.access$1300(this.this$0).start();
            if (AvGuestActivity.access$1400(this.this$0) != null) {
              AvGuestActivity.access$1400(this.this$0).start();
            }
            localObject1 = new AVView();
            ((AVView)localObject1).videoSrcType = 1;
            ((AVView)localObject1).viewSizeType = 1;
            if (paramMessage.hasScreenVideo()) {
              ((AVView)localObject1).videoSrcType = 2;
            }
            AvGuestActivity.access$902(this.this$0, ((AVView)localObject1).videoSrcType);
            AvGuestActivity.access$1500(this.this$0)[0] = localObject1;
            AvGuestActivity.access$1600(this.this$0)[0] = AvGuestActivity.mHostIdentifier;
            i = AVEndpoint.requestViewList(AvGuestActivity.access$1600(this.this$0), AvGuestActivity.access$1500(this.this$0), 1, AVRoomControl.mRequestViewListCompleteCallback);
            Log.d("ilvb", "AvGuestActivity requestHostVideo requestViewList result=" + i + " videoSrcType=" + ((AVView)localObject1).videoSrcType + " hasScreenVideo=" + paramMessage.hasScreenVideo() + " hasCameraVideo=" + paramMessage.hasCameraVideo());
            if (((AVView)localObject1).videoSrcType == 1) {
              AvGuestActivity.access$100(this.this$0).sendEmptyMessage(264);
            }
            for (;;)
            {
              AvGuestActivity.access$100(this.this$0).removeMessages(265);
              return false;
              if (((AVView)localObject1).videoSrcType == 2) {
                AvGuestActivity.access$100(this.this$0).sendEmptyMessage(286);
              }
            }
          }
          Log.e("ilvb", "AvGuestActivity requestHostVideo 获取房间主播 " + AvGuestActivity.mHostIdentifier + " 视频失败");
          AvGuestActivity.access$100(this.this$0).removeMessages(265);
          AvGuestActivity.access$100(this.this$0).sendEmptyMessageDelayed(265, 10000L);
          return false;
          AvGuestActivity.access$100(this.this$0).removeMessages(323);
          Log.d("ilvb", "AvGuestActivity mHandler SDK_PROCESS_3_JOIN_MSG_GROUP_REQUEST");
          AvGuestActivity.access$100(this.this$0).sendEmptyMessageDelayed(334, 1000L);
          if (AvGuestActivity.access$700(this.this$0) != null)
          {
            AvGuestActivity.access$700(this.this$0).destroy();
            AvGuestActivity.access$702(this.this$0, null);
          }
          AvGuestActivity.access$702(this.this$0, MessageControl.getInstance());
          AvGuestActivity.access$700(this.this$0).init(this.this$0, AvGuestActivity.access$100(this.this$0), AvGuestActivity.access$1200(this.this$0));
          AvGuestActivity.access$700(this.this$0).initJoinGroup(new AvGuestActivity.2.3(this));
          AvGuestActivity.access$1300(this.this$0).init(AvGuestActivity.access$700(this.this$0));
          AvGuestActivity.access$100(this.this$0).sendEmptyMessage(335);
          if (AvGuestActivity.access$800(this.this$0).isSurfacePreviewInited()) {
            break;
          }
          AvGuestActivity.access$800(this.this$0).initSurfacePreview();
          return false;
          AvGuestActivity.access$100(this.this$0).removeMessages(335);
          AvGuestActivity.access$1902(this.this$0, Util.getNetWorkType(AvGuestActivity.access$1000(this.this$0)));
          Log.d("ilvb", "AvGuestActivity mHandler {NETTYPE_WIFI = 2 NETTYPE_3G = 3 NETTYPE_2G = 4 NETTYPE_4G = 5} netType= " + AvGuestActivity.access$1900(this.this$0));
          if (AvGuestActivity.access$600(this.this$0) == null) {
            break;
          }
          AvGuestActivity.access$600(this.this$0).setNetType(AvGuestActivity.access$1900(this.this$0));
          return false;
          AvGuestActivity.access$100(this.this$0).removeMessages(322);
          if (AVRoomControl.getInstance().getAudioState() == AVRoomControl.AudioState.AUDIO_NORMAL) {
            AVRoomControl.getInstance().setAudioSilent();
          }
          i = paramMessage.arg1;
          if (i == 0)
          {
            Log.d("ilvb", "AvGuestActivity mHandler 进入房间成功");
            return false;
          }
          Log.e("ilvb", "AvGuestActivity mHandler 进入房间失败 ErrorCode=" + i);
          if (this.this$0.isFinishing()) {
            break;
          }
          this.this$0.onCloseVideo(true);
          return false;
          AvGuestActivity.access$100(this.this$0).removeMessages(340);
          Log.d("ilvb", "AvGuestActivity mHandler ACTION_CLOSE_ROOM_COMPLETE");
          return false;
          paramMessage = (Message)localObject1;
          if (AvGuestActivity.access$500(this.this$0) != null)
          {
            paramMessage = (Message)localObject1;
            if (AvGuestActivity.access$500(this.this$0).getAVContext() != null)
            {
              localObject2 = AvGuestActivity.access$500(this.this$0).getAVContext().getRoom();
              paramMessage = (Message)localObject1;
              if (localObject2 != null)
              {
                paramMessage = (Message)localObject1;
                if ((localObject2 instanceof AVRoomMulti)) {
                  paramMessage = ((AVRoomMulti)localObject2).getEndpointById(AvGuestActivity.mHostIdentifier);
                }
              }
            }
          }
          bool = AvGuestActivity.access$100(this.this$0).hasMessages(320);
          Log.d("ilvb", "AvGuestActivity mHandler ACTION_ENDPOINTS_UPDATE_INFO endpoint " + paramMessage + " isRestartContext" + bool);
          if ((paramMessage == null) || (bool)) {
            break;
          }
          Log.d("ilvb", "AvGuestActivity mHandler ACTION_ENDPOINTS_UPDATE_INFO endpoint " + paramMessage + " hasCameraVideo=" + paramMessage.hasCameraVideo() + " hasScreenVideo=" + paramMessage.hasScreenVideo());
          if (((AvGuestActivity.access$900(this.this$0) == 2) && (paramMessage.hasCameraVideo())) || ((AvGuestActivity.access$900(this.this$0) == 1) && (paramMessage.hasScreenVideo())))
          {
            Log.d("ilvb", "AvGuestActivity mHandler switch source，so requestHostVideo");
            AvGuestActivity.access$100(this.this$0).sendEmptyMessage(334);
            return false;
          }
          if (((!paramMessage.hasCameraVideo()) && (!paramMessage.hasScreenVideo())) || (AvGuestActivity.access$200(this.this$0).getVisibility() == 0) || (AvGuestActivity.access$900(this.this$0) != 0)) {
            break;
          }
          Log.d("ilvb", "AvGuestActivity mHandler loading， so requestHostVideo");
          AvGuestActivity.access$100(this.this$0).sendEmptyMessage(334);
          return false;
          Log.d("ilvb", "AvGuestActivity mHandler ACTION_SURFACE_CREATED");
          AvGuestActivity.access$100(this.this$0).removeMessages(317);
          if ((AvGuestActivity.access$2000(this.this$0) == null) || (AvGuestActivity.access$2000(this.this$0).isHeld())) {
            break;
          }
          AvGuestActivity.access$2000(this.this$0).acquire();
          return false;
          paramMessage = (CustomSysMsgVo.OwnerRankPushSys)paramMessage.obj;
          AvGuestActivity.access$2100(this.this$0).setOwnerRank(String.valueOf(paramMessage.NewRank));
          return false;
          if (AVRoomControl.getInstance().getAudioState() == AVRoomControl.AudioState.AUDIO_NORMAL) {
            break;
          }
          AVRoomControl.getInstance().setAudioNormal();
          return false;
          i = paramMessage.arg1;
          if ((AvGuestActivity.access$2200(this.this$0).giftView != null) && (AvGuestActivity.access$2200(this.this$0).giftView.isShowing())) {
            break;
          }
          AvGuestActivity.access$2200(this.this$0).showGift();
          if (i <= 0) {
            break;
          }
          AvGuestActivity.access$100(this.this$0).postDelayed(new AvGuestActivity.2.4(this), i * 1000);
          return false;
          paramMessage = (CustomSysMsgVo.OwnerShowAdvertPushSys)paramMessage.obj;
          AvGuestActivity.access$2200(this.this$0).showADV(paramMessage);
          return false;
          if (paramMessage.obj == null)
          {
            AvGuestActivity.access$2200(this.this$0).setLeftBottomData(null);
            return false;
          }
          paramMessage = (List)paramMessage.obj;
          AvGuestActivity.access$2200(this.this$0).setLeftBottomData(paramMessage);
          return false;
          paramMessage = (CustomRspMsgVo.OwnerPublishRsp)paramMessage.obj;
          AvGuestActivity.access$2200(this.this$0).showNoticeOrViewpoint(paramMessage);
          return false;
          if (paramMessage.arg1 == 1)
          {
            this.this$0.setRequestedOrientation(1);
            return false;
          }
          this.this$0.setRequestedOrientation(0);
          return false;
          if (this.this$0.redEnvelopepopupWindow == null) {
            break;
          }
          this.this$0.redEnvelopepopupWindow.dismiss();
          return false;
          if (!w.a().l())
          {
            Toast.makeText(AvGuestActivity.access$1000(this.this$0), "收到推送红包消息，您需要登录后才能抢红包!", 1).show();
            paramMessage = new Intent();
            paramMessage.setClass(AvGuestActivity.access$1000(this.this$0), LoginMainScreen.class);
            paramMessage.putExtra("REGISTER_FROM_TYPE", "FROM_STOCK");
            AvGuestActivity.access$1000(this.this$0).startActivity(paramMessage);
            return false;
          }
          if (this.this$0.getResources().getConfiguration().orientation != 1) {
            this.this$0.setRequestedOrientation(1);
          }
          paramMessage = (CustomSysMsgVo.RedEnvelopeSys)paramMessage.obj;
          if (this.this$0.redEnvelopepopupWindow == null)
          {
            this.this$0.redEnvelopepopupWindow = new PopupWindow(AvGuestActivity.access$1000(this.this$0));
            localObject1 = View.inflate(AvGuestActivity.access$1000(this.this$0), 2130903205, null);
            localObject2 = (MyWebView)((View)localObject1).findViewById(2131558473);
            ((View)localObject1).findViewById(2131559465).setOnClickListener(new AvGuestActivity.2.5(this));
            ((MyWebView)localObject2).setOnCloseWebViewListener(new AvGuestActivity.2.6(this));
            this.this$0.redEnvelopepopupWindow.setContentView((View)localObject1);
            this.this$0.redEnvelopepopupWindow.setWidth(-1);
            this.this$0.redEnvelopepopupWindow.setHeight(-1);
            this.this$0.redEnvelopepopupWindow.setOutsideTouchable(false);
            this.this$0.redEnvelopepopupWindow.setFocusable(true);
            this.this$0.redEnvelopepopupWindow.setBackgroundDrawable(new ColorDrawable(this.this$0.getResources().getColor(17170445)));
          }
          localObject1 = (MyWebView)this.this$0.redEnvelopepopupWindow.getContentView().findViewById(2131558473);
          paramMessage = r.a(paramMessage.HotUrl, "")[1];
          if (TextUtils.isEmpty(paramMessage)) {
            break;
          }
          ((MyWebView)localObject1).loadUrl(paramMessage);
          ((MyWebView)localObject1).setTag(paramMessage);
          this.this$0.redEnvelopepopupWindow.showAtLocation(AvGuestActivity.access$1300(this.this$0), 17, 0, 0);
          return false;
          paramMessage = (Message)localObject2;
          if (AvGuestActivity.access$500(this.this$0) != null)
          {
            paramMessage = (Message)localObject2;
            if (AvGuestActivity.access$500(this.this$0).getAVContext() != null)
            {
              localObject1 = AvGuestActivity.access$500(this.this$0).getAVContext().getRoom();
              paramMessage = (Message)localObject2;
              if (localObject1 != null)
              {
                paramMessage = (Message)localObject2;
                if ((localObject1 instanceof AVRoomMulti)) {
                  paramMessage = ((AVRoomMulti)localObject1).getEndpointById(AvGuestActivity.mHostIdentifier);
                }
              }
            }
          }
          n.d("ilvb", "AvGuestActivity handler ENTER_SOUND_MODE identifier " + AvGuestActivity.mHostIdentifier + " endpoint " + paramMessage);
          if (paramMessage == null) {
            break;
          }
          i = AVEndpoint.cancelAllView(AVRoomControl.mCancelAllViewCompleteCallback);
          Log.d("ilvb", "AvGuestActivity handler ENTER_SOUND_MODE result=" + i + " hasScreenVideo=" + paramMessage.hasScreenVideo() + " hasCameraVideo=" + paramMessage.hasCameraVideo());
          paramMessage = new Intent(AvGuestActivity.access$1000(this.this$0), MainScreen.class);
          localObject1 = new Bundle();
          ((Bundle)localObject1).putInt("TAB_ID", 1342177280);
          paramMessage.putExtras((Bundle)localObject1);
          this.this$0.startActivity(paramMessage);
          AvGuestActivity.access$2302(this.this$0, true);
          UserilvbManager.getInstance().setIlvbSoundMode(AvGuestActivity.access$1100(this.this$0), AvGuestActivity.mHostIdentifier, AvGuestActivity.access$2400(this.this$0), AvGuestActivity.access$1200(this.this$0), AvGuestActivity.access$2500(this.this$0), AvGuestActivity.access$2600(this.this$0));
          return false;
          paramMessage = new AlertDialog.Builder(AvGuestActivity.access$1000(this.this$0), 2131296301);
          paramMessage.setMessage("您的帐号在另一设备登录，请确认后重新进入!");
          paramMessage.setCancelable(false);
          paramMessage.setPositiveButton("确定", new AvGuestActivity.2.7(this));
          paramMessage.show();
          return false;
          AvGuestActivity.access$2708(this.this$0);
          AvGuestActivity.access$2200(this.this$0).onSendThumbUp(1, true);
          return false;
          if (AvGuestActivity.access$700(this.this$0) == null) {
            break;
          }
          if (AvGuestActivity.access$2800(this.this$0).getVisibility() == 0)
          {
            AvGuestActivity.access$2800(this.this$0).dismiss();
            return false;
          }
          n.a("", 20235);
          AvGuestActivity.access$2800(this.this$0).show();
          AvGuestActivity.access$700(this.this$0).sendOwnerInfo(AvGuestActivity.mHostIdentifier);
          return false;
          if ((paramMessage.obj == null) || (TextUtils.isEmpty(paramMessage.obj.toString()))) {}
          for (localObject1 = "你已经被踢出房间!";; localObject1 = paramMessage.obj.toString())
          {
            if (paramMessage.arg1 == 10) {
              localObject1 = "你被禁止加入该房间";
            }
            paramMessage = new AlertDialog.Builder(AvGuestActivity.access$1000(this.this$0), 2131296301);
            paramMessage.setMessage((CharSequence)localObject1);
            paramMessage.setCancelable(false);
            paramMessage.setPositiveButton("确定", new AvGuestActivity.2.8(this));
            paramMessage.show();
            return false;
          }
          paramMessage = new AlertDialog.Builder(AvGuestActivity.access$1000(this.this$0), 2131296301);
          paramMessage.setMessage("你余额不足，请先充值!");
          paramMessage.setPositiveButton("确定", new AvGuestActivity.2.9(this));
          paramMessage.setCancelable(false);
          paramMessage.setNegativeButton("取消", null);
          paramMessage.show();
          return false;
          paramMessage = (String)paramMessage.obj;
          Toast.makeText(this.this$0, paramMessage, 0).show();
          return false;
          AvGuestActivity.access$2100(this.this$0).onGuanZhuResult();
          AvGuestActivity.access$200(this.this$0).onGuanZhuResult();
          AvGuestActivity.access$2800(this.this$0).onGuanZhuResult();
          return false;
          if (AvGuestActivity.access$2700(this.this$0) != 0)
          {
            if (AvGuestActivity.access$700(this.this$0) != null) {
              AvGuestActivity.access$700(this.this$0).sendThumbUp(AvGuestActivity.access$2700(this.this$0));
            }
            AvGuestActivity.access$2702(this.this$0, 0);
          }
          AvGuestActivity.access$100(this.this$0).removeMessages(278);
          AvGuestActivity.access$100(this.this$0).sendEmptyMessageDelayed(278, AvGuestActivity.access$2900(this.this$0));
          return false;
          localObject1 = (CustomRspMsgVo.OwnerRsp)paramMessage.obj;
          if ((AvGuestActivity.access$2800(this.this$0) == null) || (AvGuestActivity.access$2800(this.this$0).getVisibility() != 0)) {
            break;
          }
          if (AvGuestActivity.access$3000(this.this$0) != null) {}
          for (paramMessage = AvGuestActivity.access$3000(this.this$0).RoomTopic;; paramMessage = "-")
          {
            AvGuestActivity.access$2800(this.this$0).set(paramMessage, (CustomRspMsgVo.OwnerRsp)localObject1);
            return false;
          }
          if (AvGuestActivity.access$700(this.this$0) == null) {
            break;
          }
          AvGuestActivity.access$700(this.this$0).sendFollow(AvGuestActivity.mHostIdentifier, 1);
          return false;
          if (AvGuestActivity.access$700(this.this$0) == null) {
            break;
          }
          AvGuestActivity.access$700(this.this$0).sendFollow(AvGuestActivity.mHostIdentifier, 0);
          return false;
          paramMessage = (CustomRspMsgVo.AccountRsp)paramMessage.obj;
          if (AvGuestActivity.access$2200(this.this$0).giftView == null) {
            break;
          }
          AvGuestActivity.access$2200(this.this$0).giftView.setMoney(paramMessage.Balance);
          return false;
          paramMessage = (CustomRspMsgVo.AccountRsp)paramMessage.obj;
          if (AvGuestActivity.access$2200(this.this$0).giftView == null) {
            break;
          }
          AvGuestActivity.access$2200(this.this$0).giftView.setMoney(paramMessage.Balance);
          return false;
          paramMessage = (ChatEntity)paramMessage.obj;
          if (paramMessage == null) {
            break;
          }
          AvGuestActivity.access$2200(this.this$0).showZhuBoMsg(paramMessage);
          return false;
          AvGuestActivity.access$3002(this.this$0, (CustomRspMsgVo.RoomInfo)paramMessage.obj);
          paramMessage = AvGuestActivity.access$3000(this.this$0).TopList;
          if ((paramMessage != null) && (paramMessage.size() > 0))
          {
            i = 0;
            if (i >= paramMessage.size()) {
              break label7056;
            }
            if (!((CustomRspMsgVo.RoomUser)paramMessage.get(i)).Account.equals(AvGuestActivity.access$400(this.this$0).getUserPhone())) {
              break label5337;
            }
          }
          for (;;)
          {
            if (i != -1)
            {
              localObject1 = (CustomRspMsgVo.RoomUser)paramMessage.get(i);
              paramMessage.remove(i);
              paramMessage.add(0, localObject1);
              AvGuestActivity.access$2100(this.this$0).updateUserList(AvGuestActivity.access$3000(this.this$0).TopList);
              AvGuestActivity.access$2100(this.this$0).setRoomInfo(AvGuestActivity.access$3000(this.this$0));
              paramMessage = r.a(AvGuestActivity.access$3000(this.this$0).OwnerDiamondContributeUrl, "");
              if (!paramMessage[1].contains("?")) {
                break label5461;
              }
              paramMessage = paramMessage[1] + "&uname=" + AvGuestActivity.mHostIdentifier;
              AvGuestActivity.access$2100(this.this$0).setHuiPiao(AvGuestActivity.access$3000(this.this$0).OwnerDiamond, paramMessage);
              AvGuestActivity.access$2200(this.this$0).setRoomInfo(AvGuestActivity.access$3000(this.this$0));
              AvGuestActivity.access$2800(this.this$0).setRoomInfo(AvGuestActivity.access$3000(this.this$0));
              AvGuestActivity.access$200(this.this$0).setRoomInfo(AvGuestActivity.access$3000(this.this$0));
              AvGuestActivity.access$2100(this.this$0).setOwnerRank(AvGuestActivity.access$3000(this.this$0).OwnerRank);
              AvGuestActivity.access$2100(this.this$0).setPrivilege(AvGuestActivity.access$3000(this.this$0).PrivilegeName, AvGuestActivity.access$3000(this.this$0).PrivilegeUrl);
              paramMessage = AvGuestActivity.access$3000(this.this$0).AccountStatus;
              if (!paramMessage.equals("1")) {
                break label5493;
              }
              UserilvbManager.getInstance().isNoSpeak = true;
              UserilvbManager.getInstance().noSpeakTime = System.currentTimeMillis();
              UserilvbManager.getInstance().noSpeakSurplus = AvGuestActivity.access$3000(this.this$0).ShutUpLeftTime;
              paramMessage = MessageControl.getChatEntity(ChatEntity.ChatGuestType.CHAT_ERROR, "", "你已被主播禁止发言!", "", "");
              localObject1 = AvGuestActivity.access$100(this.this$0).obtainMessage(260);
              ((Message)localObject1).obj = paramMessage;
              ((Message)localObject1).sendToTarget();
            }
            for (;;)
            {
              if (AvGuestActivity.access$3000(this.this$0).OwnerPublish != null)
              {
                paramMessage = AvGuestActivity.access$100(this.this$0).obtainMessage(299);
                paramMessage.obj = AvGuestActivity.access$3000(this.this$0).OwnerPublish;
                AvGuestActivity.access$100(this.this$0).sendMessage(paramMessage);
              }
              if ((AvGuestActivity.access$3000(this.this$0).ShowLinks == null) || (AvGuestActivity.access$3000(this.this$0).ShowLinks.size() <= 0)) {
                break;
              }
              paramMessage = AvGuestActivity.access$100(this.this$0).obtainMessage(298);
              paramMessage.obj = AvGuestActivity.access$3000(this.this$0).ShowLinks;
              AvGuestActivity.access$100(this.this$0).sendMessage(paramMessage);
              return false;
              i += 1;
              break label4823;
              if (!w.a().l()) {
                break label4899;
              }
              localObject1 = new CustomRspMsgVo.RoomUser();
              ((CustomRspMsgVo.RoomUser)localObject1).Account = AvGuestActivity.access$400(this.this$0).getUserPhone();
              ((CustomRspMsgVo.RoomUser)localObject1).AccountLevel = AvGuestActivity.access$400(this.this$0).getAccountLevel();
              ((CustomRspMsgVo.RoomUser)localObject1).AccountName = AvGuestActivity.access$400(this.this$0).getUserName();
              ((CustomRspMsgVo.RoomUser)localObject1).AccountImg = AvGuestActivity.access$400(this.this$0).getHeadImagePath();
              ((CustomRspMsgVo.RoomUser)localObject1).AccountHomeUrl = ((CustomRspMsgVo.RoomUser)paramMessage.get(0)).AccountHomeUrl;
              ((CustomRspMsgVo.RoomUser)localObject1).Diamond = AvGuestActivity.access$3000(this.this$0).AccountDiamondConsume;
              paramMessage.add(0, localObject1);
              break label4899;
              paramMessage = paramMessage[1] + "?uname=" + AvGuestActivity.mHostIdentifier;
              break label4994;
              if (paramMessage.equals("2"))
              {
                d.a("被踢了---->ROOMINFO");
                Log.e("ilvb", "被踢了---->ROOMINFO");
                AvGuestActivity.access$100(this.this$0).sendEmptyMessage(284);
              }
              else if (paramMessage.equals("3"))
              {
                paramMessage = AvGuestActivity.access$100(this.this$0).obtainMessage(284);
                paramMessage.arg1 = 10;
                AvGuestActivity.access$100(this.this$0).sendMessage(paramMessage);
              }
            }
            paramMessage = (CustomSysMsgVo.RoomInfo)paramMessage.obj;
            AvGuestActivity.access$2100(this.this$0).setNumber(paramMessage);
            AvGuestActivity.access$2100(this.this$0).setHuiPiao(paramMessage.OwnerDiamond, null);
            AvGuestActivity.access$2100(this.this$0).updateUserList(paramMessage.TopList);
            if (AvGuestActivity.access$3100(this.this$0) == -1) {
              AvGuestActivity.access$3102(this.this$0, paramMessage.UpNum);
            }
            for (i = 0;; i = paramMessage.UpNum - AvGuestActivity.access$3100(this.this$0))
            {
              if (i > 0)
              {
                AvGuestActivity.access$3102(this.this$0, paramMessage.UpNum);
                AvGuestActivity.access$2200(this.this$0).onSendThumbUp(i, false);
              }
              if (!paramMessage.IsShowLinksDelete) {
                break;
              }
              paramMessage = AvGuestActivity.access$100(this.this$0).obtainMessage(298);
              paramMessage.obj = null;
              AvGuestActivity.access$100(this.this$0).sendMessage(paramMessage);
              return false;
            }
            if ((paramMessage.ShowLinks == null) || (paramMessage.ShowLinks.size() <= 0)) {
              break;
            }
            localObject1 = AvGuestActivity.access$100(this.this$0).obtainMessage(298);
            ((Message)localObject1).obj = paramMessage.ShowLinks;
            AvGuestActivity.access$100(this.this$0).sendMessage((Message)localObject1);
            return false;
            if (AvGuestActivity.access$700(this.this$0) == null) {
              break;
            }
            AvGuestActivity.access$700(this.this$0).sendQueryAccount();
            return false;
            localObject1 = (CustomSysMsgVo.Present)paramMessage.obj;
            paramMessage = GiftManager.nnMenuConfigVo;
            if ((paramMessage != null) && (paramMessage.data != null))
            {
              localObject2 = paramMessage.data.iterator();
              do
              {
                if (!((Iterator)localObject2).hasNext()) {
                  break;
                }
                paramMessage = (GiftVo.GiftItem)((Iterator)localObject2).next();
              } while (!paramMessage.id.equals(((CustomSysMsgVo.Present)localObject1).PresentId));
            }
            while (paramMessage != null)
            {
              if (paramMessage.type == 1)
              {
                localObject2 = new FlowerView.FlowerVo();
                ((FlowerView.FlowerVo)localObject2).giftName = paramMessage.pName;
                ((FlowerView.FlowerVo)localObject2).giftId = paramMessage.id;
                ((FlowerView.FlowerVo)localObject2).giftUrl = paramMessage.pUrl;
                ((FlowerView.FlowerVo)localObject2).userId = ((CustomSysMsgVo.Present)localObject1).Account;
                ((FlowerView.FlowerVo)localObject2).userName = ((CustomSysMsgVo.Present)localObject1).AccountName;
                ((FlowerView.FlowerVo)localObject2).userUrl = ((CustomSysMsgVo.Present)localObject1).AccountImg;
                ((FlowerView.FlowerVo)localObject2).linkCount = ((CustomSysMsgVo.Present)localObject1).LinkCount;
                if (((CustomSysMsgVo.Present)localObject1).IsLink.equals("1")) {}
                for (;;)
                {
                  ((FlowerView.FlowerVo)localObject2).isLink = bool;
                  AvGuestActivity.access$2200(this.this$0).flowerView.show((FlowerView.FlowerVo)localObject2);
                  if (AvGuestActivity.access$700(this.this$0) == null) {
                    break;
                  }
                  AvGuestActivity.access$700(this.this$0).sendRefreshChat(ChatEntity.ChatGuestType.CHAT_GIFT, ((CustomSysMsgVo.Present)localObject1).AccountName, "送了一个" + paramMessage.pName, ((CustomSysMsgVo.Present)localObject1).Account, ((CustomSysMsgVo.Present)localObject1).AccountLevel);
                  return false;
                  bool = false;
                }
              }
              if (AvGuestActivity.access$3200(this.this$0) == null) {
                AvGuestActivity.access$3202(this.this$0, new AnimationControl(AvGuestActivity.access$700(this.this$0), AvGuestActivity.access$2200(this.this$0).gifView, AvGuestActivity.access$2200(this.this$0).carAnimation, AvGuestActivity.access$2200(this.this$0).yachtAnimation, AvGuestActivity.access$2200(this.this$0).fireworksAnimation));
              }
              AvGuestActivity.access$3200(this.this$0).show(paramMessage, (CustomSysMsgVo.Present)localObject1);
              return false;
              localObject1 = (String)paramMessage.obj;
              i = paramMessage.arg1;
              j = paramMessage.arg2;
              if (AvGuestActivity.access$700(this.this$0) == null) {
                break;
              }
              AvGuestActivity.access$700(this.this$0).sendBuyGift(AvGuestActivity.mHostIdentifier, (String)localObject1, i, j, i);
              return false;
              n.f("ilvb", "handler SENDPING " + AvGuestActivity.access$700(this.this$0));
              if (AvGuestActivity.access$700(this.this$0) == null) {
                break;
              }
              AvGuestActivity.access$700(this.this$0).sendPing();
              return false;
              Toast.makeText(this.this$0.getBaseContext(), "消息不能为空", 0).show();
              return false;
              Toast.makeText(this.this$0.getBaseContext(), "消息发送异常 ", 0).show();
              return false;
              this.this$0.onCloseVideo(true);
              return false;
              this.this$0.onCloseVideo(false);
              return false;
              Toast.makeText(this.this$0.getBaseContext(), "消息太长，发送失败", 0).show();
              return false;
              Toast.makeText(this.this$0.getBaseContext(), "对方账号不存在或未登陆过！", 0).show();
              return false;
              this.this$0.onCloseVideo(true);
              return false;
              if (AvGuestActivity.access$700(this.this$0) == null) {
                break;
              }
              if ((paramMessage.obj instanceof ChatEntity))
              {
                paramMessage = (ChatEntity)paramMessage.obj;
                AvGuestActivity.access$3300(this.this$0).add(paramMessage);
              }
              for (;;)
              {
                AvGuestActivity.access$100(this.this$0).sendEmptyMessage(291);
                return false;
                paramMessage = (List)paramMessage.obj;
                AvGuestActivity.access$3300(this.this$0).addAll(paramMessage);
              }
              AvGuestActivity.access$100(this.this$0).removeMessages(291);
              if (AvGuestActivity.access$700(this.this$0) == null) {
                break;
              }
              paramMessage = AvGuestActivity.access$3300(this.this$0).iterator();
              while (paramMessage.hasNext())
              {
                localObject1 = (ChatEntity)paramMessage.next();
                AvGuestActivity.access$700(this.this$0).addListChatEntity((ChatEntity)localObject1);
              }
              AvGuestActivity.access$3300(this.this$0).clear();
              AvGuestActivity.access$2200(this.this$0).refreshChat();
              return false;
              Log.d("ilvb", "AvGuestActivity handler REQUEST_HOST_CAMERA_VIDEO_OK  host=" + AvGuestActivity.mHostIdentifier);
              AvGuestActivity.access$800(this.this$0).setSmallVideoViewLayout(true, AvGuestActivity.mHostIdentifier, 1);
              if ((AvGuestActivity.access$700(this.this$0) != null) && (AvGuestActivity.access$900(this.this$0) == 0))
              {
                l1 = System.currentTimeMillis();
                l2 = AvGuestActivity.access$3400(this.this$0);
                AvGuestActivity.access$700(this.this$0).sendClientUpLoadInfo((int)(l1 - l2), "0");
              }
              AvGuestActivity.access$100(this.this$0).sendEmptyMessageDelayed(303, 1000L);
              if (AvGuestActivity.access$2200(this.this$0) == null) {
                break;
              }
              AvGuestActivity.access$2200(this.this$0).setRotationBtVisible(4);
              return false;
              Log.d("ilvb", "AvGuestActivity handler REQUEST_HOST_SCREEN_VIDEO_OK  host=" + AvGuestActivity.mHostIdentifier);
              AvGuestActivity.access$800(this.this$0).setSmallVideoViewLayout(true, AvGuestActivity.mHostIdentifier, 2);
              if ((AvGuestActivity.access$700(this.this$0) != null) && (AvGuestActivity.access$900(this.this$0) == 0))
              {
                l1 = System.currentTimeMillis();
                l2 = AvGuestActivity.access$3400(this.this$0);
                AvGuestActivity.access$700(this.this$0).sendClientUpLoadInfo((int)(l1 - l2), "0");
              }
              AvGuestActivity.access$100(this.this$0).sendEmptyMessageDelayed(303, 1000L);
              if (AvGuestActivity.access$2200(this.this$0) == null) {
                break;
              }
              AvGuestActivity.access$2200(this.this$0).setRotationBtVisible(0);
              return false;
              AvGuestActivity.access$100(this.this$0).removeMessages(303);
              Log.d("ilvb", "AvGuestActivity handler ACTION_RENDER_VIDEO_NOTIFY");
              if (this.this$0.findViewById(2131559308).getVisibility() == 8) {
                break;
              }
              this.this$0.findViewById(2131559308).setVisibility(8);
              return false;
              if (paramMessage.obj == null) {
                break;
              }
              paramMessage = (String)paramMessage.obj;
              if ((TextUtils.isEmpty(paramMessage)) || (AvGuestActivity.access$700(this.this$0) == null)) {
                break;
              }
              AvGuestActivity.access$700(this.this$0).onSendChatMessage(paramMessage);
              return false;
              AvGuestActivity.access$100(this.this$0).removeMessages(265);
              if (AvGuestActivity.access$700(this.this$0) == null) {
                break;
              }
              long l1 = System.currentTimeMillis();
              long l2 = AvGuestActivity.access$3400(this.this$0);
              AvGuestActivity.access$700(this.this$0).sendClientUpLoadInfo((int)(l1 - l2), "1");
              return false;
              AvGuestActivity.access$100(this.this$0).removeMessages(292);
              if (!AvGuestActivity.access$100(this.this$0).hasMessages(265)) {
                break;
              }
              AvGuestActivity.access$100(this.this$0).removeMessages(265);
              this.this$0.onCloseVideo(true);
              return false;
              AvGuestActivity.access$100(this.this$0).removeMessages(293);
              if (AvGuestActivity.access$1400(this.this$0) == null) {
                break;
              }
              AvGuestActivity.access$1400(this.this$0).start();
              return false;
              paramMessage = null;
            }
            i = -1;
          }
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\activity\AvGuestActivity$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */