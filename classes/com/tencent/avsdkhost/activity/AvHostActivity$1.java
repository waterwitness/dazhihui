package com.tencent.avsdkhost.activity;

import android.app.AlertDialog.Builder;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.os.PowerManager.WakeLock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.d.n;
import com.android.dazhihui.d.r;
import com.android.dazhihui.o;
import com.android.dazhihui.ui.widget.MyWebView;
import com.android.dazhihui.w;
import com.tencent.av.sdk.AVContext;
import com.tencent.av.sdk.AVVideoCtrl;
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
import com.tencent.avsdk.UserInfo;
import com.tencent.avsdk.Util;
import com.tencent.avsdk.control.AVCameraControl;
import com.tencent.avsdk.control.AVRoomControl;
import com.tencent.avsdk.control.AVRoomControl.RoomState;
import com.tencent.avsdk.control.GiftManager;
import com.tencent.avsdk.control.QavsdkControl;
import com.tencent.avsdk.widget.GiftView;
import com.tencent.avsdkhost.ChatEntityHost;
import com.tencent.avsdkhost.control.AVHostUIControl;
import com.tencent.avsdkhost.control.MessageControlHost;
import com.tencent.avsdkhost.control.RoomControl;
import com.tencent.avsdkhost.widget.AboveVideoBottomViewHost;
import com.tencent.avsdkhost.widget.AboveVideoContainViewHost;
import com.tencent.avsdkhost.widget.AboveVideoNotSwipeViewHost;
import com.tencent.avsdkhost.widget.AboveVideoTopViewHost;
import com.tencent.avsdkhost.widget.MyUserInfoDialogHost;
import java.util.Iterator;
import java.util.List;

class AvHostActivity$1
  implements Handler.Callback
{
  AvHostActivity$1(AvHostActivity paramAvHostActivity) {}
  
  public boolean handleMessage(Message paramMessage)
  {
    int i;
    label700:
    label850:
    label864:
    Object localObject1;
    int j;
    switch (paramMessage.what)
    {
    case 287: 
    case 341: 
    case 342: 
    case 343: 
    case 344: 
    case 345: 
    case 346: 
    case 347: 
    case 348: 
    default: 
    case 355: 
    case 356: 
    case 336: 
    case 349: 
    case 320: 
    case 321: 
    case 322: 
    case 323: 
    case 335: 
    case 339: 
    case 340: 
    case 317: 
    case 337: 
    case 338: 
    case 353: 
    case 311: 
    case 312: 
    case 313: 
    case 314: 
    case 19: 
    case 305: 
    case 316: 
    case 300: 
    case 298: 
    case 299: 
    case 297: 
    case 304: 
    case 295: 
    case 290: 
    case 289: 
    case 285: 
    case 284: 
    case 283: 
    case 315: 
    case 278: 
    case 277: 
    case 273: 
    case 274: 
    case 288: 
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
                          do
                          {
                            do
                            {
                              return false;
                              Log.d("ilvb", "AvHostActivity handler ACTION_ENABLE_CAMERA_COMPLETE");
                              AvHostActivity.access$000(this.this$0).removeMessages(355);
                              Log.d("ilvb", "AvHostActivity handler getIsCameraOpened=" + AvHostActivity.access$100(this.this$0).getIsCameraOpened());
                              AvHostActivity.access$200(this.this$0).getAVContext().getVideoCtrl();
                              if (AVVideoCtrl.isEnableBeauty()) {
                                AvHostActivity.access$200(this.this$0).getAVContext().getVideoCtrl().inputBeautyParam(AboveVideoBottomViewHost.getBeautyProgress(30));
                              }
                            } while (AvHostActivity.access$300(this.this$0).isCreater().booleanValue() != true);
                            i = paramMessage.arg1;
                            boolean bool;
                            if (paramMessage.arg2 == 1)
                            {
                              bool = true;
                              if (i != 0) {
                                break label864;
                              }
                              AvHostActivity.access$500(this.this$0).setSelfId(AvHostActivity.access$400(this.this$0));
                              AvHostActivity.access$500(this.this$0).setLocalHasVideo(bool, AvHostActivity.access$400(this.this$0));
                              if (!AvHostActivity.access$100(this.this$0).getIsFrontCamera()) {
                                break label850;
                              }
                              AvHostActivity.access$500(this.this$0).setMirror(true);
                            }
                            for (;;)
                            {
                              if (!AvHostActivity.access$100(this.this$0).getIsFrontCamera()) {
                                AvHostActivity.access$000(this.this$0).sendEmptyMessageDelayed(316, 0L);
                              }
                              this.this$0.enableMic(true);
                              if ((i != 0) || (!bool)) {
                                break;
                              }
                              AvHostActivity.access$000(this.this$0).sendEmptyMessageDelayed(311, 0L);
                              AvHostActivity.access$000(this.this$0).sendEmptyMessageDelayed(313, 0L);
                              return false;
                              bool = false;
                              break label700;
                              AvHostActivity.access$500(this.this$0).setMirror(false);
                            }
                            localObject1 = new StringBuilder().append("AvHostActivity handler ");
                            if (bool) {}
                            for (paramMessage = "打开摄像头失败";; paramMessage = "关闭摄像头失败")
                            {
                              Log.e("ilvb", paramMessage);
                              break;
                            }
                            Log.d("ilvb", "AvHostActivity handler ACTION_SWITCH_CAMERA_COMPLETE");
                            AvHostActivity.access$000(this.this$0).removeMessages(356);
                            j = paramMessage.arg1;
                            if (paramMessage.arg2 == 0)
                            {
                              i = 1;
                              if (j == 0) {
                                break label1003;
                              }
                              if (i == 0) {
                                break label997;
                              }
                            }
                            for (paramMessage = "换用前置摄像头失败";; paramMessage = "换用后置摄像头失败")
                            {
                              Log.e("ilvb", paramMessage);
                              if (!AvHostActivity.access$100(this.this$0).getIsFrontCamera()) {
                                break label1060;
                              }
                              AvHostActivity.access$500(this.this$0).setMirror(true);
                              return false;
                              i = 0;
                              break;
                            }
                            localObject1 = new StringBuilder().append("AvHostActivity handler getIsFrontCamera=").append(AvHostActivity.access$100(this.this$0).getIsFrontCamera());
                            if (i != 0) {}
                            for (paramMessage = " 换用前置摄像头成功";; paramMessage = " 换用后置摄像头成功")
                            {
                              Log.d("ilvb", paramMessage);
                              break;
                            }
                            AvHostActivity.access$500(this.this$0).setMirror(false);
                            return false;
                            Log.d("ilvb", "AvHostActivity handler SDK_PROCESS_YUNDZH_CREATE_ROOM");
                            AvHostActivity.access$000(this.this$0).removeMessages(336);
                            paramMessage = RoomControl.getInstance();
                            paramMessage.createRoom(this.this$0, o.a().b(), new AvHostActivity.1.1(this, paramMessage));
                            return false;
                            Log.d("ilvb", "AvHostActivity mHandler SDK_PROCESS_1_START_CONTEXT_ERROR");
                            AvHostActivity.access$000(this.this$0).removeMessages(349);
                            if (AvHostActivity.access$900(this.this$0) == 6208) {}
                            for (localObject1 = "您的帐号先前在另一设备登录过，请确认后重新进入!";; localObject1 = "开启直播时登录失败，请退出后重新进入!")
                            {
                              Object localObject2 = localObject1;
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
                              paramMessage.setNeutralButton("退出", new AvHostActivity.1.2(this));
                              paramMessage.show();
                              return false;
                            }
                            Log.d("ilvb", "AvHostActivity handler SDK_PROCESS_1_START_CONTEXT_REQUEST");
                            AvHostActivity.access$000(this.this$0).removeMessages(320);
                            if (AvHostActivity.access$200(this.this$0).hasAVContext()) {
                              break;
                            }
                            n.d("ilvb", "AvHostActivity 启动SDK系统 phone=" + AvHostActivity.access$300(this.this$0).getUserPhone() + "  Usersig=" + AvHostActivity.access$300(this.this$0).getUsersig());
                            AvHostActivity.access$902(this.this$0, AvHostActivity.access$200(this.this$0).startContext(AvHostActivity.access$300(this.this$0).getUserPhone(), AvHostActivity.access$300(this.this$0).getUsersig()));
                            Log.d("ilvb", "AvHostActivity 启动SDK系统 mLoginErrorCode=" + AvHostActivity.access$900(this.this$0));
                          } while (AvHostActivity.access$900(this.this$0) == 0);
                          Log.e("ilvb", "AvHostActivity startContext mLoginErrorCode   " + AvHostActivity.access$900(this.this$0));
                          return false;
                          if (AvHostActivity.access$1100(this.this$0).getmRoomState() != AVRoomControl.RoomState.ROOM_EXIT_OK) {
                            AvHostActivity.access$1100(this.this$0).exitRoom();
                          }
                          AvHostActivity.access$200(this.this$0).stopContext();
                          Log.d("ilvb", "AvHostActivity SDK系统上次已经启动 请等待关闭SDK系统");
                          AvHostActivity.access$000(this.this$0).sendEmptyMessageDelayed(320, 1000L);
                          return false;
                          Log.d("ilvb", "AvHostActivity handler SDK_PROCESS_2_ENTER_ROOM_REQUEST");
                          AvHostActivity.access$000(this.this$0).removeMessages(321);
                          if (Util.isNetworkAvailable(AvHostActivity.access$1200(this.this$0))) {
                            if (AvHostActivity.access$700(this.this$0) != 0)
                            {
                              Log.d("ilvb", "AvHostActivity 正在创建视频房间中...mRoomId=" + AvHostActivity.access$700(this.this$0) + " mGroupId=" + AvHostActivity.access$600(this.this$0));
                              AvHostActivity.access$1100(this.this$0).enterRoom(AvHostActivity.access$700(this.this$0));
                              AvHostActivity.access$000(this.this$0).sendEmptyMessageDelayed(322, 30000L);
                            }
                          }
                          while (!AvHostActivity.access$500(this.this$0).isSurfacePreviewInited())
                          {
                            AvHostActivity.access$500(this.this$0).initSurfacePreview();
                            return false;
                            Log.e("ilvb", "AvHostActivity 错误 room id=" + AvHostActivity.access$700(this.this$0));
                            continue;
                            Log.e("ilvb", "AvHostActivity " + this.this$0.getString(2131166014));
                            AvHostActivity.access$000(this.this$0).sendEmptyMessageDelayed(321, 5000L);
                          }
                          AvHostActivity.access$000(this.this$0).removeMessages(322);
                          Log.e("ilvb", "AvHostActivity mHandler SDK_PROCESS_2_ENTER_ROOM_TIMEOUT");
                          Toast.makeText(AvHostActivity.access$1200(this.this$0), "进入房间超时!", 1).show();
                          return false;
                          Log.d("ilvb", "AvHostActivity handler SDK_PROCESS_3_JOIN_MSG_GROUP_REQUEST mGroupId=" + AvHostActivity.access$600(this.this$0));
                          n.d("ilvb", "AvHostActivity mHandler 请等待创建聊天群组...... mRoomId=" + AvHostActivity.access$700(this.this$0) + " mGroupId=" + AvHostActivity.access$600(this.this$0) + " mHostIdentifier=" + AvHostActivity.access$400(this.this$0));
                          AvHostActivity.access$000(this.this$0).removeMessages(323);
                          if (AvHostActivity.access$1300(this.this$0) != null)
                          {
                            AvHostActivity.access$1300(this.this$0).destroy();
                            AvHostActivity.access$1302(this.this$0, null);
                          }
                          AvHostActivity.access$1302(this.this$0, MessageControlHost.getInstance());
                          AvHostActivity.access$1300(this.this$0).init(AvHostActivity.access$1200(this.this$0), AvHostActivity.access$000(this.this$0), AvHostActivity.access$600(this.this$0));
                          AvHostActivity.access$1300(this.this$0).initJoinGroup(null);
                          AvHostActivity.access$1300(this.this$0).sendRoomInfo("");
                          AvHostActivity.access$1300(this.this$0).sendOwnerRoomAllUser(AvHostActivity.access$400(this.this$0));
                          AvHostActivity.access$1400(this.this$0).init(AvHostActivity.access$1300(this.this$0));
                          AvHostActivity.access$000(this.this$0).sendEmptyMessage(335);
                          return false;
                          AvHostActivity.access$000(this.this$0).removeMessages(335);
                          Log.d("ilvb", "AvHostActivity handler SDK_PROCESS_5_ROOM_SET_NET_STATE");
                          AvHostActivity.access$1502(this.this$0, Util.getNetWorkType(AvHostActivity.access$1200(this.this$0)));
                          Log.d("ilvb", "AvHostActivity handler {NETTYPE_WIFI = 2 NETTYPE_3G = 3 NETTYPE_2G = 4 NETTYPE_4G = 5} getNetWorkType = " + AvHostActivity.access$1500(this.this$0));
                          AvHostActivity.access$1100(this.this$0).setNetType(AvHostActivity.access$1500(this.this$0));
                          return false;
                          AvHostActivity.access$000(this.this$0).removeMessages(322);
                          AvHostActivity.access$000(this.this$0).removeMessages(339);
                          i = paramMessage.arg1;
                          Log.d("ilvb", "AvHostActivity mHandler ACTION_ROOM_CREATE_COMPLETE createRoom result=" + i);
                        } while (i == 0);
                        Log.e("ilvb", "AvHostActivity mHandler 创建房间失败 ErrorCode=" + i);
                        paramMessage = new AlertDialog.Builder(this.this$0);
                        paramMessage.setMessage("开启主播房间失败, 请退出重试!");
                        paramMessage.setTitle("提示");
                        paramMessage.setCancelable(false);
                        paramMessage.setNeutralButton("退出", new AvHostActivity.1.3(this));
                        paramMessage.show();
                        return false;
                        AvHostActivity.access$000(this.this$0).removeMessages(340);
                        Log.d("ilvb", "AvHostActivity mHandler ACTION_CLOSE_ROOM_COMPLETE");
                        return false;
                        Log.d("ilvb", "AvHostActivity handler ACTION_SURFACE_CREATED");
                        AvHostActivity.access$000(this.this$0).removeMessages(317);
                        if ((AvHostActivity.access$1600(this.this$0) != null) && (!AvHostActivity.access$1600(this.this$0).isHeld())) {
                          AvHostActivity.access$1600(this.this$0).acquire();
                        }
                        if ((AvHostActivity.access$1100(this.this$0) != null) && (AvHostActivity.access$1100(this.this$0).getmRoomState() == AVRoomControl.RoomState.ROOM_ENTER_OK))
                        {
                          i = AvHostActivity.access$100(this.this$0).toggleEnableCamera();
                          Log.d("ilvb", "AvHostActivity handler toggleEnableCamera result = " + i);
                          return false;
                        }
                        Log.d("ilvb", "AvHostActivity handler ACTION_SURFACE_CREATED delay 1000");
                        AvHostActivity.access$000(this.this$0).sendEmptyMessageDelayed(317, 1000L);
                        return false;
                        Log.d("ilvb", "AvHostActivity handler SDK_PROCESS_YUNDZH_STOP_ROOM");
                        AvHostActivity.access$000(this.this$0).removeMessages(337);
                        return false;
                        Log.d("ilvb", "AvHostActivity handler SDK_PROCESS_YUNDZH_MODIFY_ROOM");
                        AvHostActivity.access$000(this.this$0).removeMessages(338);
                        return false;
                        paramMessage = new AlertDialog.Builder(AvHostActivity.access$1200(this.this$0), 2131296301);
                        paramMessage.setTitle("提示").setCancelable(false).setMessage("聊天群组失效,可能无法接收聊天信息,是否重新直播?");
                        paramMessage.setNegativeButton("取消", null);
                        paramMessage.setNeutralButton("重新直播", new AvHostActivity.1.4(this)).show();
                        return false;
                        AvHostActivity.access$000(this.this$0).removeMessages(311);
                      } while (AvHostActivity.access$1100(this.this$0) == null);
                      AvHostActivity.access$1100(this.this$0).startRecord(AvHostActivity.access$700(this.this$0), AvHostActivity.access$400(this.this$0));
                      return false;
                      AvHostActivity.access$000(this.this$0).removeMessages(312);
                    } while (AvHostActivity.access$1100(this.this$0) == null);
                    AvHostActivity.access$1100(this.this$0).stopRecord(AvHostActivity.access$700(this.this$0));
                    return false;
                    AvHostActivity.access$000(this.this$0).removeMessages(313);
                  } while (AvHostActivity.access$1100(this.this$0) == null);
                  AvHostActivity.access$1100(this.this$0).startPush(AvHostActivity.access$700(this.this$0), AvHostActivity.access$400(this.this$0));
                  return false;
                  AvHostActivity.access$000(this.this$0).removeMessages(314);
                  if (AvHostActivity.access$1100(this.this$0) != null) {
                    AvHostActivity.access$1100(this.this$0).stopPush();
                  }
                  paramMessage = (String)paramMessage.obj;
                } while ((AvHostActivity.access$1300(this.this$0) == null) || (TextUtils.isEmpty(paramMessage)));
                AvHostActivity.access$1300(this.this$0).sendShutUp(paramMessage);
                return false;
                paramMessage = (CustomSysMsgVo.OwnerRankPushSys)paramMessage.obj;
                AvHostActivity.access$1700(this.this$0).setRank(paramMessage.NewRank);
                return false;
                Log.d("ilvb", "AvHostActivity SWITCH_CAMERA");
                AvHostActivity.access$000(this.this$0).removeMessages(316);
                AvHostActivity.access$100(this.this$0).toggleSwitchCamera();
                return false;
                paramMessage = (CustomSysMsgVo.OwnerShowAdvertPushSys)paramMessage.obj;
                AvHostActivity.access$1800(this.this$0).showADV(paramMessage);
                return false;
                if (paramMessage.obj == null)
                {
                  AvHostActivity.access$1800(this.this$0).setLeftBottomData(null);
                  return false;
                }
                paramMessage = (List)paramMessage.obj;
                AvHostActivity.access$1800(this.this$0).setLeftBottomData(paramMessage);
                return false;
                paramMessage = (CustomRspMsgVo.OwnerPublishRsp)paramMessage.obj;
                AvHostActivity.access$1800(this.this$0).showNoticeOrViewpoint(paramMessage);
                return false;
                if (paramMessage.arg1 == 1)
                {
                  this.this$0.setRequestedOrientation(1);
                  return false;
                }
                this.this$0.setRequestedOrientation(0);
                return false;
              } while (this.this$0.redEnvelopepopupWindow == null);
              this.this$0.redEnvelopepopupWindow.dismiss();
              return false;
              paramMessage = (CustomSysMsgVo.RedEnvelopeSys)paramMessage.obj;
              if (this.this$0.redEnvelopepopupWindow == null)
              {
                this.this$0.redEnvelopepopupWindow = new PopupWindow();
                localObject1 = new MyWebView(AvHostActivity.access$1200(this.this$0));
                ((MyWebView)localObject1).setOnCloseWebViewListener(new AvHostActivity.1.5(this));
                this.this$0.redEnvelopepopupWindow.setContentView((View)localObject1);
                this.this$0.redEnvelopepopupWindow.setWidth(-1);
                this.this$0.redEnvelopepopupWindow.setHeight(-1);
                this.this$0.redEnvelopepopupWindow.setFocusable(true);
                this.this$0.redEnvelopepopupWindow.setOutsideTouchable(false);
                this.this$0.redEnvelopepopupWindow.setBackgroundDrawable(new ColorDrawable(this.this$0.getResources().getColor(17170445)));
              }
              localObject1 = (MyWebView)this.this$0.redEnvelopepopupWindow.getContentView();
              paramMessage = r.a(paramMessage.HotUrl, "")[1];
              ((MyWebView)localObject1).loadUrl(paramMessage);
              ((MyWebView)localObject1).setTag(paramMessage);
              this.this$0.redEnvelopepopupWindow.showAtLocation(AvHostActivity.access$1400(this.this$0), 17, 0, 0);
              return false;
              paramMessage = new AlertDialog.Builder(AvHostActivity.access$1200(this.this$0), 2131296301);
              paramMessage.setMessage("您的帐号在另一设备登录，请确认后重新进入!");
              paramMessage.setCancelable(false);
              paramMessage.setPositiveButton("确定", new AvHostActivity.1.6(this));
              paramMessage.show();
              return false;
              AvHostActivity.access$1908(this.this$0);
              AvHostActivity.access$1800(this.this$0).onSendThumbUp(1, true);
              return false;
            } while (AvHostActivity.access$1300(this.this$0) == null);
            if (AvHostActivity.access$800(this.this$0).getVisibility() == 0)
            {
              AvHostActivity.access$800(this.this$0).dismiss();
              return false;
            }
            n.a("", 20235);
            AvHostActivity.access$800(this.this$0).show();
            AvHostActivity.access$1300(this.this$0).sendOwnerInfo(AvHostActivity.access$400(this.this$0));
            return false;
            if ((paramMessage.obj == null) || (TextUtils.isEmpty(paramMessage.obj.toString()))) {}
            for (localObject1 = "你已经被踢出房间!";; localObject1 = paramMessage.obj.toString())
            {
              if (paramMessage.arg1 == 10) {
                localObject1 = "你被禁止加入该房间";
              }
              paramMessage = new AlertDialog.Builder(AvHostActivity.access$1200(this.this$0), 2131296301);
              paramMessage.setMessage((CharSequence)localObject1);
              paramMessage.setCancelable(false);
              paramMessage.setPositiveButton("确定", new AvHostActivity.1.7(this));
              paramMessage.show();
              return false;
            }
            paramMessage = new AlertDialog.Builder(AvHostActivity.access$1200(this.this$0), 2131296301);
            paramMessage.setMessage("你余额不足，请先充值!");
            paramMessage.setPositiveButton("确定", new AvHostActivity.1.8(this));
            paramMessage.setCancelable(false);
            paramMessage.setNegativeButton("取消", null);
            paramMessage.show();
            return false;
            paramMessage = (String)paramMessage.obj;
            Toast.makeText(this.this$0, paramMessage, 0).show();
            return false;
            if (AvHostActivity.access$1900(this.this$0) != 0)
            {
              if (AvHostActivity.access$1300(this.this$0) != null) {
                AvHostActivity.access$1300(this.this$0).sendThumbUp(AvHostActivity.access$1900(this.this$0));
              }
              AvHostActivity.access$1902(this.this$0, 0);
            }
            AvHostActivity.access$000(this.this$0).removeMessages(278);
            AvHostActivity.access$000(this.this$0).sendEmptyMessageDelayed(278, AvHostActivity.access$2000(this.this$0));
            return false;
            localObject1 = (CustomRspMsgVo.OwnerRsp)paramMessage.obj;
            if ((AvHostActivity.access$800(this.this$0) != null) && (AvHostActivity.access$800(this.this$0).getVisibility() == 0)) {
              if (AvHostActivity.access$2100(this.this$0) == null) {
                break label3690;
              }
            }
            for (paramMessage = AvHostActivity.access$2100(this.this$0).RoomTopic;; paramMessage = "-")
            {
              AvHostActivity.access$800(this.this$0).set(paramMessage, (CustomRspMsgVo.OwnerRsp)localObject1);
              AvHostActivity.access$1700(this.this$0).setOwnerInfo((CustomRspMsgVo.OwnerRsp)localObject1);
              return false;
            }
            paramMessage = (CustomRspMsgVo.AccountRsp)paramMessage.obj;
          } while (AvHostActivity.access$1800(this.this$0).giftView == null);
          AvHostActivity.access$1800(this.this$0).giftView.setMoney(paramMessage.Balance);
          return false;
          paramMessage = (CustomRspMsgVo.AccountRsp)paramMessage.obj;
        } while (AvHostActivity.access$1800(this.this$0).giftView == null);
        AvHostActivity.access$1800(this.this$0).giftView.setMoney(paramMessage.Balance);
        return false;
        paramMessage = (ChatEntityHost)paramMessage.obj;
      } while (paramMessage == null);
      AvHostActivity.access$1800(this.this$0).showZhuBoMsg(paramMessage);
      return false;
    case 272: 
      label997:
      label1003:
      label1060:
      label3690:
      AvHostActivity.access$2102(this.this$0, (CustomRspMsgVo.RoomInfo)paramMessage.obj);
      paramMessage = AvHostActivity.access$2100(this.this$0).TopList;
      if ((paramMessage != null) && (paramMessage.size() > 0))
      {
        i = 0;
        label3844:
        if (i >= paramMessage.size()) {
          break label5524;
        }
        if (!((CustomRspMsgVo.RoomUser)paramMessage.get(i)).Account.equals(AvHostActivity.access$300(this.this$0).getUserPhone())) {
          break label4200;
        }
      }
      break;
    }
    for (;;)
    {
      if (i != -1)
      {
        localObject1 = (CustomRspMsgVo.RoomUser)paramMessage.get(i);
        paramMessage.remove(i);
        paramMessage.add(0, localObject1);
        label3920:
        AvHostActivity.access$1700(this.this$0).updateUserList(AvHostActivity.access$2100(this.this$0).TopList);
        AvHostActivity.access$1700(this.this$0).setRoomInfo(AvHostActivity.access$2100(this.this$0));
        paramMessage = r.a(AvHostActivity.access$2100(this.this$0).OwnerDiamondContributeUrl, "");
        if (!paramMessage[1].contains("?")) {
          break label4310;
        }
      }
      label4200:
      label4310:
      for (paramMessage = paramMessage[1] + "&uname=" + AvHostActivity.access$400(this.this$0);; paramMessage = paramMessage[1] + "?uname=" + AvHostActivity.access$400(this.this$0))
      {
        AvHostActivity.access$1700(this.this$0).setHuiPiao(AvHostActivity.access$2100(this.this$0).OwnerDiamond, paramMessage);
        AvHostActivity.access$1800(this.this$0).setRoomInfo(AvHostActivity.access$2100(this.this$0));
        AvHostActivity.access$800(this.this$0).setRoomInfo(AvHostActivity.access$2100(this.this$0));
        if (AvHostActivity.access$2100(this.this$0).OwnerPublish != null)
        {
          paramMessage = AvHostActivity.access$000(this.this$0).obtainMessage(299);
          paramMessage.obj = AvHostActivity.access$2100(this.this$0).OwnerPublish;
          AvHostActivity.access$000(this.this$0).sendMessage(paramMessage);
        }
        if ((AvHostActivity.access$2100(this.this$0).ShowLinks == null) || (AvHostActivity.access$2100(this.this$0).ShowLinks.size() <= 0)) {
          break;
        }
        paramMessage = AvHostActivity.access$000(this.this$0).obtainMessage(298);
        paramMessage.obj = AvHostActivity.access$2100(this.this$0).ShowLinks;
        AvHostActivity.access$000(this.this$0).sendMessage(paramMessage);
        return false;
        i += 1;
        break label3844;
        if (!w.a().l()) {
          break label3920;
        }
        localObject1 = new CustomRspMsgVo.RoomUser();
        ((CustomRspMsgVo.RoomUser)localObject1).Account = AvHostActivity.access$300(this.this$0).getUserPhone();
        ((CustomRspMsgVo.RoomUser)localObject1).AccountName = AvHostActivity.access$300(this.this$0).getUserName();
        ((CustomRspMsgVo.RoomUser)localObject1).AccountImg = AvHostActivity.access$300(this.this$0).getHeadImagePath();
        ((CustomRspMsgVo.RoomUser)localObject1).AccountHomeUrl = ((CustomRspMsgVo.RoomUser)paramMessage.get(0)).AccountHomeUrl;
        ((CustomRspMsgVo.RoomUser)localObject1).Diamond = AvHostActivity.access$2100(this.this$0).AccountDiamondConsume;
        paramMessage.add(0, localObject1);
        break label3920;
      }
      paramMessage = (CustomSysMsgVo.RoomInfo)paramMessage.obj;
      AvHostActivity.access$1700(this.this$0).setNumber(paramMessage);
      AvHostActivity.access$1700(this.this$0).setHuiPiao(paramMessage.OwnerDiamond, null);
      AvHostActivity.access$1700(this.this$0).updateUserList(paramMessage.TopList);
      if (AvHostActivity.access$2200(this.this$0) == -1) {
        AvHostActivity.access$2202(this.this$0, paramMessage.UpNum);
      }
      for (i = 0;; i = paramMessage.UpNum - AvHostActivity.access$2200(this.this$0))
      {
        if (i > 0)
        {
          AvHostActivity.access$2202(this.this$0, paramMessage.UpNum);
          AvHostActivity.access$1800(this.this$0).onSendThumbUp(i, false);
        }
        if (!paramMessage.IsShowLinksDelete) {
          break;
        }
        paramMessage = AvHostActivity.access$000(this.this$0).obtainMessage(298);
        paramMessage.obj = null;
        AvHostActivity.access$000(this.this$0).sendMessage(paramMessage);
        return false;
      }
      if ((paramMessage.ShowLinks == null) || (paramMessage.ShowLinks.size() <= 0)) {
        break;
      }
      localObject1 = AvHostActivity.access$000(this.this$0).obtainMessage(298);
      ((Message)localObject1).obj = paramMessage.ShowLinks;
      AvHostActivity.access$000(this.this$0).sendMessage((Message)localObject1);
      return false;
      if (AvHostActivity.access$1300(this.this$0) == null) {
        break;
      }
      AvHostActivity.access$1300(this.this$0).sendQueryAccount();
      return false;
      GiftManager.getConfig(new AvHostActivity.1.9(this, (CustomSysMsgVo.Present)paramMessage.obj));
      return false;
      localObject1 = (String)paramMessage.obj;
      i = paramMessage.arg1;
      j = paramMessage.arg2;
      if (AvHostActivity.access$1300(this.this$0) != null) {
        AvHostActivity.access$1300(this.this$0).sendBuyGift(AvHostActivity.access$400(this.this$0), (String)localObject1, i, j, i);
      }
      Log.i("xyf", "点击" + i);
      return false;
      n.f("ilvb", "handler SENDPING " + AvHostActivity.access$1300(this.this$0));
      if (AvHostActivity.access$1300(this.this$0) == null) {
        break;
      }
      AvHostActivity.access$1300(this.this$0).sendPing();
      return false;
      Toast.makeText(this.this$0.getBaseContext(), "消息不能为空", 0).show();
      return false;
      Toast.makeText(this.this$0.getBaseContext(), "消息发送异常 ", 0).show();
      return false;
      AvHostActivity.access$1000(this.this$0, true);
      return false;
      AvHostActivity.access$1000(this.this$0, true);
      return false;
      Toast.makeText(this.this$0.getBaseContext(), "消息太长，发送失败", 0).show();
      return false;
      Toast.makeText(this.this$0.getBaseContext(), "对方账号不存在或未登陆过！", 0).show();
      return false;
      AvHostActivity.access$1000(this.this$0, true);
      return false;
      if (AvHostActivity.access$1300(this.this$0) == null) {
        break;
      }
      if ((paramMessage.obj instanceof ChatEntityHost))
      {
        paramMessage = (ChatEntityHost)paramMessage.obj;
        AvHostActivity.access$2400(this.this$0).add(paramMessage);
      }
      while (!AvHostActivity.access$000(this.this$0).hasMessages(291))
      {
        AvHostActivity.access$000(this.this$0).sendEmptyMessageDelayed(291, 1500L);
        return false;
        paramMessage = (List)paramMessage.obj;
        AvHostActivity.access$2400(this.this$0).addAll(paramMessage);
      }
      if (AvHostActivity.access$1300(this.this$0) == null) {
        break;
      }
      paramMessage = AvHostActivity.access$2400(this.this$0).iterator();
      while (paramMessage.hasNext())
      {
        localObject1 = (ChatEntityHost)paramMessage.next();
        AvHostActivity.access$1300(this.this$0).addListChatEntity((ChatEntityHost)localObject1);
      }
      AvHostActivity.access$2400(this.this$0).clear();
      AvHostActivity.access$1800(this.this$0).refreshChat();
      return false;
      Log.d("ilvb", "AvHostActivity handler REQUEST_HOST_CAMERA_VIDEO_OK  host=" + AvHostActivity.access$400(this.this$0));
      AvHostActivity.access$500(this.this$0).setSmallVideoViewLayout(true, AvHostActivity.access$400(this.this$0), 1);
      if ((AvHostActivity.access$1300(this.this$0) != null) && (this.this$0.findViewById(2131559308).getVisibility() == 0))
      {
        l1 = System.currentTimeMillis();
        l2 = AvHostActivity.access$2500(this.this$0);
        AvHostActivity.access$1300(this.this$0).sendClientUpLoadInfo((int)(l1 - l2), "0");
      }
      this.this$0.findViewById(2131559308).setVisibility(8);
      return false;
      Log.d("ilvb", "AvHostActivity handler REQUEST_HOST_SCREEN_VIDEO_OK  host=" + AvHostActivity.access$400(this.this$0));
      AvHostActivity.access$500(this.this$0).setSmallVideoViewLayout(true, AvHostActivity.access$400(this.this$0), 2);
      if ((AvHostActivity.access$1300(this.this$0) != null) && (this.this$0.findViewById(2131559308).getVisibility() == 0))
      {
        l1 = System.currentTimeMillis();
        l2 = AvHostActivity.access$2500(this.this$0);
        AvHostActivity.access$1300(this.this$0).sendClientUpLoadInfo((int)(l1 - l2), "0");
      }
      this.this$0.findViewById(2131559308).setVisibility(8);
      return false;
      if (paramMessage.obj == null) {
        break;
      }
      paramMessage = (String)paramMessage.obj;
      if ((TextUtils.isEmpty(paramMessage)) || (AvHostActivity.access$1300(this.this$0) == null)) {
        break;
      }
      AvHostActivity.access$1300(this.this$0).onSendChatMessage(paramMessage);
      return false;
      AvHostActivity.access$000(this.this$0).removeMessages(265);
      if (this.this$0.findViewById(2131559308) != null)
      {
        ((TextView)this.this$0.findViewById(2131559310)).setText("主播不在房间了...");
        ((ImageView)this.this$0.findViewById(2131559311)).setImageResource(2130838232);
      }
      if (AvHostActivity.access$1300(this.this$0) == null) {
        break;
      }
      long l1 = System.currentTimeMillis();
      long l2 = AvHostActivity.access$2500(this.this$0);
      AvHostActivity.access$1300(this.this$0).sendClientUpLoadInfo((int)(l1 - l2), "1");
      return false;
      AvHostActivity.access$000(this.this$0).removeMessages(292);
      if (!AvHostActivity.access$000(this.this$0).hasMessages(265)) {
        break;
      }
      AvHostActivity.access$000(this.this$0).removeMessages(265);
      AvHostActivity.access$1000(this.this$0, true);
      return false;
      AvHostActivity.access$000(this.this$0).removeMessages(293);
      if (AvHostActivity.access$2600(this.this$0) == null) {
        break;
      }
      AvHostActivity.access$2600(this.this$0).start();
      return false;
      label5524:
      i = -1;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\activity\AvHostActivity$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */