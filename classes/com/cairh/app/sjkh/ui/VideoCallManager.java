package com.cairh.app.sjkh.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.bairuitech.anychat.AnyChatBaseEvent;
import com.bairuitech.anychat.AnyChatCameraHelper;
import com.bairuitech.anychat.AnyChatCoreSDK;
import com.bairuitech.anychat.AnyChatSensorHelper;
import com.bairuitech.anychat.AnyChatStateChgEvent;
import com.bairuitech.anychat.AnyChatTextMsgEvent;
import com.bairuitech.anychat.AnyChatTransDataEvent;
import com.bairuitech.anychat.AnyChatVideoCallEvent;
import com.bairuitech.anychat.AnyChatVideoHelper;
import com.bairuitech.cairh.ConfigEntity;
import com.bairuitech.cairh.ConfigService;
import com.cairh.app.sjkh.MainActivity;
import com.cairh.app.sjkh.common.MResource;
import com.cairh.app.sjkh.common.WriteLogFile;
import java.io.UnsupportedEncodingException;
import java.util.Timer;
import java.util.TimerTask;

public class VideoCallManager
  implements View.OnClickListener, AnyChatBaseEvent, AnyChatStateChgEvent, AnyChatTextMsgEvent, AnyChatTransDataEvent, AnyChatVideoCallEvent
{
  public int _height;
  public int _width;
  public VideoCallActivity activity;
  public AnyChatCoreSDK anychat = null;
  boolean bOnPaused = false;
  private boolean bOtherVideoOpened = false;
  private boolean bSelfVideoOpened = false;
  public Context context;
  private int empId;
  private Handler handler;
  private ImageView mCameraSwitchImage;
  private Timer mTimer;
  private TimerTask mTimerTask;
  private SurfaceView myView;
  private SurfaceView otherView;
  ProgressDialog progressDialog;
  private Button quitButton;
  public int quitCount = 0;
  private int roomId;
  private int selfUserID;
  private String videoServerIp;
  private int videoServerPort;
  public View view;
  
  public VideoCallManager(Context paramContext, View paramView)
  {
    this.context = paramContext;
    this.view = paramView;
  }
  
  public VideoCallManager(Context paramContext, VideoCallActivity paramVideoCallActivity)
  {
    this(paramContext, paramVideoCallActivity.relativeLayout);
    this.activity = paramVideoCallActivity;
    getDisplaySize();
  }
  
  private void ApplyVideoConfig()
  {
    ConfigEntity localConfigEntity = ConfigService.LoadConfig(this.context);
    if (localConfigEntity.configMode == 1)
    {
      AnyChatCoreSDK.SetSDKOptionInt(30, localConfigEntity.videoBitrate);
      if (localConfigEntity.videoBitrate == 0) {
        AnyChatCoreSDK.SetSDKOptionInt(31, 2);
      }
      AnyChatCoreSDK.SetSDKOptionInt(33, 10);
      AnyChatCoreSDK.SetSDKOptionInt(32, localConfigEntity.videoFps * 4);
      AnyChatCoreSDK.SetSDKOptionInt(38, 320);
      AnyChatCoreSDK.SetSDKOptionInt(39, 240);
      AnyChatCoreSDK.SetSDKOptionInt(34, 2);
    }
    AnyChatCoreSDK.SetSDKOptionInt(35, localConfigEntity.configMode);
    AnyChatCoreSDK.SetSDKOptionInt(40, localConfigEntity.enableP2P);
    AnyChatCoreSDK.SetSDKOptionInt(95, localConfigEntity.videoCapDriver);
    AnyChatCoreSDK.SetSDKOptionInt(83, localConfigEntity.videoShowDriver);
    AnyChatCoreSDK.SetSDKOptionInt(70, localConfigEntity.audioPlayDriver);
    AnyChatCoreSDK.SetSDKOptionInt(74, localConfigEntity.audioRecordDriver);
    AnyChatCoreSDK.SetSDKOptionInt(92, localConfigEntity.videoOverlay);
    AnyChatCoreSDK.SetSDKOptionInt(3, localConfigEntity.enableAEC);
    AnyChatCoreSDK.SetSDKOptionInt(18, localConfigEntity.useHWCodec);
    AnyChatCoreSDK.SetSDKOptionInt(94, localConfigEntity.videorotatemode);
    AnyChatCoreSDK.SetSDKOptionInt(61, localConfigEntity.smoothPlayMode);
    AnyChatCoreSDK.SetSDKOptionInt(96, localConfigEntity.fixcolordeviation);
    AnyChatCoreSDK.SetSDKOptionInt(84, localConfigEntity.videoShowGPURender);
  }
  
  private void CheckVideoStatus()
  {
    if ((this.bOnPaused) || (this.anychat == null)) {}
    do
    {
      return;
      if ((!this.bOtherVideoOpened) && (this.anychat.GetCameraState(this.empId) == 2) && (this.anychat.GetUserVideoWidth(this.empId) != 0))
      {
        localObject = this.otherView.getHolder();
        if (AnyChatCoreSDK.GetSDKOptionInt(83) != 5)
        {
          ((SurfaceHolder)localObject).setFormat(4);
          ((SurfaceHolder)localObject).setFixedSize(this.anychat.GetUserVideoWidth(this.empId), this.anychat.GetUserVideoHeight(this.empId));
        }
        localObject = ((SurfaceHolder)localObject).getSurface();
        this.anychat.SetVideoPos(this.empId, (Surface)localObject, 0, 0, 0, 0);
        this.bOtherVideoOpened = true;
      }
    } while ((this.bSelfVideoOpened) || (this.anychat.GetCameraState(-1) != 2) || (this.anychat.GetUserVideoWidth(-1) == 0));
    Object localObject = this.myView.getHolder();
    if (AnyChatCoreSDK.GetSDKOptionInt(83) != 5)
    {
      ((SurfaceHolder)localObject).setFormat(4);
      ((SurfaceHolder)localObject).setFixedSize(this.anychat.GetUserVideoWidth(-1), this.anychat.GetUserVideoHeight(-1));
    }
    localObject = ((SurfaceHolder)localObject).getSurface();
    this.anychat.SetVideoPos(-1, (Surface)localObject, 0, 0, 0, 0);
    this.bSelfVideoOpened = true;
  }
  
  private int findCallCenterUserId()
  {
    int[] arrayOfInt = this.anychat.GetUserFriends();
    if (arrayOfInt == null) {
      return 0;
    }
    int i = 0;
    label16:
    int j;
    if (i < arrayOfInt.length)
    {
      j = arrayOfInt[i];
      if (this.anychat.GetFriendStatus(j) != 0) {
        break label44;
      }
    }
    label44:
    while (!this.anychat.GetUserName(j).equals("Avaya#1"))
    {
      i += 1;
      break label16;
      break;
    }
    return j;
  }
  
  @SuppressLint({"NewApi"})
  private void initialLayout()
  {
    int i4 = Build.VERSION.SDK_INT;
    int k;
    int m;
    int j;
    int i;
    int i1;
    int i2;
    int n;
    label146:
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if ((this._height * 1.0F - 20.0F) / (this._width * 1.0F - 20) > 1.3333334F)
    {
      k = (int)(this._width * 1.0F - 20);
      m = k / 3;
      j = (int)(k / 3 * 1.2D);
      i = j * 3 / 4;
      m *= 4;
      int i3 = 1;
      i1 = i3;
      i2 = i;
      n = j;
      if (i4 >= 15)
      {
        if (this._height - 50 - m - i < 30) {
          break label810;
        }
        i2 = this._height - 50 - m - 30;
        n = i2 / 3 * 4;
        i1 = i3;
      }
      this.myView = new SurfaceView(this.context);
      localObject1 = new ViewGroup.LayoutParams(k, m);
      this.myView.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      this.myView.setX(10);
      this.myView.setY(10);
      localObject1 = new TextView(this.context);
      ((TextView)localObject1).setText("请保持头像在绿框内");
      ((TextView)localObject1).setTextColor(this.context.getResources().getColor(MResource.getIdByName("color", "green")));
      localObject2 = new RelativeLayout.LayoutParams(-2, -2);
      ((RelativeLayout.LayoutParams)localObject2).addRule(14);
      ((TextView)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
      ((TextView)localObject1).setY(70);
      localObject2 = new View(this.context);
      ((View)localObject2).setBackgroundResource(MResource.getIdByName("drawable", "border_green"));
      ((View)localObject2).setLayoutParams(new ViewGroup.LayoutParams(k - 240, m - 350));
      ((View)localObject2).setX('');
      ((View)localObject2).setY('¹');
      this.otherView = new SurfaceView(this.context);
      localObject3 = new ViewGroup.LayoutParams(n, i2);
      this.otherView.setLayoutParams((ViewGroup.LayoutParams)localObject3);
      if (i1 == 0) {
        break label824;
      }
      this.otherView.setX(this._width - 10 - n);
      this.otherView.setY(10 + m + 10);
      label411:
      this.mCameraSwitchImage = new ImageView(this.context);
      this.mCameraSwitchImage.setX(k - 20 - 58);
      this.mCameraSwitchImage.setY(20);
      this.mCameraSwitchImage.setImageResource(MResource.getIdByName("drawable", "switchvideo"));
      this.mCameraSwitchImage.setOnClickListener(this);
      this.otherView.getHolder().setKeepScreenOn(true);
      this.myView.setOnClickListener(this);
      if (ConfigService.LoadConfig(this.context).videoOverlay != 0) {
        this.myView.getHolder().setType(3);
      }
      if (AnyChatCoreSDK.GetSDKOptionInt(95) != 3) {
        break label897;
      }
      this.myView.getHolder().addCallback(AnyChatCoreSDK.mCameraHelper);
      if (AnyChatCoreSDK.mCameraHelper.GetCameraNumber() > 1) {
        this.mCameraSwitchImage.setVisibility(0);
      }
    }
    label810:
    label824:
    label897:
    label970:
    for (;;)
    {
      if (AnyChatCoreSDK.GetSDKOptionInt(83) == 5)
      {
        i = this.anychat.mVideoHelper.bindVideo(this.otherView.getHolder());
        this.anychat.mVideoHelper.SetVideoUser(i, this.empId);
      }
      this.quitButton = new Button(this.context);
      this.quitButton.setWidth(k);
      this.quitButton.setHeight(this._height / 10);
      this.quitButton.setText("正在连接 . . .");
      this.quitButton.setX(10);
      this.quitButton.setY(this._height - 5);
      this.quitButton.setClickable(false);
      this.quitButton.setTextColor(-1);
      this.activity.relativeLayout.addView(this.myView);
      this.activity.relativeLayout.addView((View)localObject2);
      this.activity.relativeLayout.addView(this.otherView);
      this.otherView.setZOrderOnTop(true);
      this.activity.relativeLayout.addView(this.mCameraSwitchImage);
      this.activity.relativeLayout.addView((View)localObject1);
      return;
      m = this._height - 20;
      k = m / 4 * 3;
      j = (int)(k / 3 * 1.2D);
      i = j * 3 / 4;
      break;
      i1 = 0;
      i2 = i;
      n = j;
      break label146;
      this.otherView.setX(this._width - 10 - n - 10);
      if (i4 >= 15)
      {
        this.otherView.setY(this._height - i2 - 10 - 50);
        break label411;
      }
      this.otherView.setY(this._height - i2 - 10);
      break label411;
      localObject3 = this.anychat.EnumVideoCapture();
      if ((localObject3 != null) && (localObject3.length > 1))
      {
        this.mCameraSwitchImage.setVisibility(0);
        i = 0;
        for (;;)
        {
          if (i >= localObject3.length) {
            break label970;
          }
          String str = localObject3[i];
          if (str.indexOf("Front") >= 0)
          {
            this.anychat.SelectVideoCapture(str);
            break;
          }
          i += 1;
        }
      }
    }
  }
  
  private void initialSDK()
  {
    this.anychat = new AnyChatCoreSDK();
    this.anychat.SetBaseEvent(this);
    this.anychat.SetTextMessageEvent(this);
    this.anychat.SetTransDataEvent(this);
    this.anychat.SetStateChgEvent(this);
    this.anychat.SetVideoCallEvent(this);
    this.anychat.InitSDK(Build.VERSION.SDK_INT, 0);
    ApplyVideoConfig();
    this.anychat.mSensorHelper.InitSensor(this.context);
    AnyChatCoreSDK.mCameraHelper.SetContext(this.activity);
  }
  
  private void refreshAV()
  {
    this.anychat.UserCameraControl(this.empId, 1);
    this.anychat.UserSpeakControl(this.empId, 1);
    this.anychat.UserCameraControl(-1, 1);
    this.anychat.UserSpeakControl(-1, 1);
    this.bOtherVideoOpened = false;
    this.bSelfVideoOpened = false;
  }
  
  private void showAlert(String paramString)
  {
    if (this.progressDialog != null) {
      this.progressDialog.dismiss();
    }
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.context);
    localBuilder.setTitle("提示");
    localBuilder.setMessage(paramString);
    localBuilder.setPositiveButton("点击关闭", new VideoCallManager.3(this));
    localBuilder.create().show();
  }
  
  private void showToast(String paramString)
  {
    Toast.makeText(this.context, paramString, 1).show();
  }
  
  private void showWait(String paramString)
  {
    if (this.progressDialog == null) {
      this.progressDialog = new ProgressDialog(this.context);
    }
    this.progressDialog.setProgressStyle(0);
    this.progressDialog.setMessage(paramString);
    this.progressDialog.show();
  }
  
  public void OnAnyChatActiveStateChgMessage(int paramInt1, int paramInt2) {}
  
  public void OnAnyChatCameraStateChgMessage(int paramInt1, int paramInt2) {}
  
  public void OnAnyChatChatModeChgMessage(int paramInt, boolean paramBoolean) {}
  
  public void OnAnyChatConnectMessage(boolean paramBoolean)
  {
    WriteLogFile.witeLog("连接服务器结果  bSuccess：" + paramBoolean);
    if (paramBoolean)
    {
      this.anychat.Login("cairenhuiTest" + this.selfUserID, "");
      AnyChatCoreSDK.mCameraHelper.SelectCamera(1);
      return;
    }
    onDestroy();
    MainActivity.A.callJSFunc("APP_video.finishVideo(4)");
  }
  
  public void OnAnyChatEnterRoomMessage(int paramInt1, int paramInt2)
  {
    this.progressDialog.dismiss();
    WriteLogFile.witeLog("进入房间成功，信息 dwRoomId：" + paramInt1 + "   dwErrorCode:" + paramInt2);
  }
  
  public void OnAnyChatLinkCloseMessage(int paramInt)
  {
    WriteLogFile.witeLog("OnAnyChatLinkCloseMessage 日志 dwErrorCode：" + paramInt);
    if (this.bOtherVideoOpened)
    {
      this.anychat.UserCameraControl(this.empId, 0);
      this.anychat.UserSpeakControl(this.empId, 0);
      this.bOtherVideoOpened = false;
    }
    if (this.bSelfVideoOpened)
    {
      this.anychat.UserCameraControl(-1, 0);
      this.anychat.UserSpeakControl(-1, 0);
      this.bSelfVideoOpened = false;
    }
    if (this.quitCount == 0)
    {
      this.quitCount += 1;
      onDestroy();
    }
  }
  
  public void OnAnyChatLoginMessage(int paramInt1, int paramInt2)
  {
    WriteLogFile.witeLog("登陆结果  loginErrorCode：" + paramInt2);
    if (paramInt2 == 0)
    {
      this.selfUserID = paramInt1;
      this.anychat.VideoCallControl(1, this.empId, 0, 0, 0, "");
      return;
    }
    Toast.makeText(this.context, "登录失败", 1).show();
  }
  
  public void OnAnyChatMicStateChgMessage(int paramInt, boolean paramBoolean) {}
  
  public void OnAnyChatOnlineUserMessage(int paramInt1, int paramInt2)
  {
    WriteLogFile.witeLog("OnAnyChatOnlineUserMessage 日志 dwUserNum：" + paramInt1 + "  dwRoomId:" + paramInt2);
    onRestart();
  }
  
  public void OnAnyChatP2PConnectStateMessage(int paramInt1, int paramInt2) {}
  
  public void OnAnyChatSDKFilterData(byte[] paramArrayOfByte, int paramInt) {}
  
  public void OnAnyChatTextMessage(int paramInt1, int paramInt2, boolean paramBoolean, String paramString)
  {
    WriteLogFile.witeLog("OnAnyChatTextMessage 接收信息指令日志 dwFromUserid：" + paramInt1 + "  message：" + paramString);
    if ("verified".equals(paramString))
    {
      if (this.quitCount == 0)
      {
        this.quitCount += 1;
        onDestroy();
      }
      MainActivity.A.callJSFunc("APP_video.finishVideo(1)");
    }
    while (!"unverified".equals(paramString)) {
      return;
    }
    if (this.quitCount == 0)
    {
      this.quitCount += 1;
      onDestroy();
    }
    MainActivity.A.callJSFunc("APP_video.finishVideo(3)");
  }
  
  public void OnAnyChatTransBuffer(int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    try
    {
      paramArrayOfByte = new String(paramArrayOfByte, "utf-8");
      this.anychat.SendTextMessage(this.empId, 1, paramArrayOfByte);
      return;
    }
    catch (UnsupportedEncodingException paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
    }
  }
  
  public void OnAnyChatTransBufferEx(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {}
  
  public void OnAnyChatTransFile(int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {}
  
  public void OnAnyChatUserAtRoomMessage(int paramInt, boolean paramBoolean)
  {
    WriteLogFile.witeLog("OnAnyChatUserAtRoomMessage 日志 dwUserId：" + paramInt + "  bEnter:" + paramBoolean);
    if (paramInt == this.empId)
    {
      if (paramBoolean) {
        break label98;
      }
      this.anychat.UserCameraControl(paramInt, 0);
      this.anychat.UserSpeakControl(paramInt, 0);
      this.bOtherVideoOpened = false;
      if (this.quitCount == 0)
      {
        this.quitCount += 1;
        onDestroy();
        MainActivity.A.callJSFunc("APP_video.finishVideo(2)");
      }
    }
    return;
    label98:
    this.anychat.UserCameraControl(paramInt, 1);
    this.anychat.UserSpeakControl(paramInt, 1);
  }
  
  public void OnAnyChatVideoCallEvent(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, String paramString)
  {
    switch (paramInt1)
    {
    default: 
      return;
    case 2: 
      switch (paramInt3)
      {
      default: 
        return;
      case 0: 
        showToast("呼叫成功，等待接通");
        return;
      case 100103: 
        showAlert("目标用户忙");
        return;
      case 100106: 
        showAlert("网络断线");
        return;
      case 100102: 
        showAlert("目标用户不在线");
        return;
      case 100101: 
        showAlert("源用户主动放弃会话");
        return;
      case 100104: 
        showAlert("目标用户拒绝会话");
        return;
      }
      showAlert("会话请求超时");
      return;
    case 1: 
      this.empId = paramInt2;
      this.anychat.VideoCallControl(2, paramInt2, 0, paramInt4, 10, this.anychat.GetUserName(-1));
      return;
    case 3: 
      this.roomId = paramInt5;
      this.anychat.EnterRoom(this.roomId, "");
      WriteLogFile.witeLog("呼叫成功进入房间，信息Id：" + this.roomId);
      return;
    }
    showToast("会话结束");
    ((Activity)this.context).finish();
  }
  
  public void connect()
  {
    showWait("正在连接视频服务，请等待..");
    this.anychat.Connect(this.videoServerIp, this.videoServerPort);
    WriteLogFile.witeLog("开始连接服务器 地址：" + this.videoServerIp + ":" + this.videoServerPort);
  }
  
  public void getDisplaySize()
  {
    Rect localRect = new Rect();
    this.activity.relativeLayout.getWindowVisibleDisplayFrame(localRect);
    this._height = (localRect.height() - localRect.top);
    this._width = localRect.width();
  }
  
  public void onClick(View paramView)
  {
    if (paramView == this.mCameraSwitchImage)
    {
      if (AnyChatCoreSDK.GetSDKOptionInt(95) != 3) {
        break label24;
      }
      AnyChatCoreSDK.mCameraHelper.SwitchCamera();
    }
    for (;;)
    {
      return;
      label24:
      paramView = this.anychat.EnumVideoCapture();
      String str = this.anychat.GetCurVideoCapture();
      int i = 0;
      while (i < paramView.length)
      {
        if (!str.equals(paramView[i]))
        {
          this.anychat.UserCameraControl(-1, 0);
          this.bSelfVideoOpened = false;
          this.anychat.SelectVideoCapture(paramView[i]);
          this.anychat.UserCameraControl(-1, 1);
          return;
        }
        i += 1;
      }
    }
  }
  
  public void onDestroy()
  {
    shut();
  }
  
  public void onPause()
  {
    if (this.anychat != null)
    {
      this.bOnPaused = true;
      this.anychat.UserCameraControl(this.empId, 0);
      this.anychat.UserSpeakControl(this.empId, 0);
      this.anychat.UserCameraControl(-1, 0);
      this.anychat.UserSpeakControl(-1, 0);
    }
    if (this.quitCount == 0)
    {
      this.quitCount += 1;
      MainActivity.A.callJSFunc("APP_video.finishVideo(2)");
    }
  }
  
  public void onRestart()
  {
    if ((this.anychat != null) && (AnyChatCoreSDK.GetSDKOptionInt(83) == 5))
    {
      int i = this.anychat.mVideoHelper.bindVideo(this.otherView.getHolder());
      this.anychat.mVideoHelper.SetVideoUser(i, this.empId);
      refreshAV();
      this.bOnPaused = false;
    }
  }
  
  public void onResume() {}
  
  public void shut()
  {
    if (this.anychat != null)
    {
      this.mTimer.cancel();
      onPause();
      this.anychat.mSensorHelper.DestroySensor();
      this.anychat.LeaveRoom(this.roomId);
      this.anychat.Logout();
      this.anychat.VideoCallControl(4, this.empId, 0, 0, 0, "");
      this.mTimerTask = null;
      this.handler = null;
      this.activity.finish();
    }
  }
  
  @SuppressLint({"HandlerLeak"})
  public void start(int paramInt1, String paramString, int paramInt2)
  {
    this.empId = paramInt1;
    this.videoServerIp = paramString;
    this.videoServerPort = paramInt2;
    WriteLogFile.witeLog("对方用户 " + paramInt1);
    this.quitCount = 0;
    this.bOnPaused = false;
    this.bSelfVideoOpened = false;
    this.bOtherVideoOpened = false;
    if (this.anychat == null)
    {
      initialSDK();
      initialLayout();
    }
    connect();
    this.handler = new VideoCallManager.1(this);
    this.mTimerTask = new VideoCallManager.2(this);
    this.mTimer = new Timer(true);
    this.mTimer.schedule(this.mTimerTask, 1000L, 500L);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\ui\VideoCallManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */