package com.kwlopen.sdk.activity;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bairuitech.anychat.AnyChatBaseEvent;
import com.bairuitech.anychat.AnyChatCameraHelper;
import com.bairuitech.anychat.AnyChatCoreSDK;
import com.bairuitech.anychat.AnyChatSensorHelper;
import com.bairuitech.anychat.AnyChatTransDataEvent;
import com.bairuitech.anychat.AnyChatVideoCallEvent;
import com.bairuitech.anychat.AnyChatVideoHelper;
import com.bairuitech.bussinesscenter.BussinessCenter;
import com.bairuitech.util.BaseMethod;
import com.bairuitech.util.ConfigEntity;
import com.bairuitech.util.ConfigService;
import com.kwl.common.utils.ResourceUtil;
import java.io.UnsupportedEncodingException;
import java.util.Timer;
import java.util.TimerTask;

public class VideoVitness
  extends Activity
  implements View.OnClickListener, View.OnTouchListener, AnyChatBaseEvent, AnyChatTransDataEvent, AnyChatVideoCallEvent
{
  public static final int MSG_CHAT_GONE = 33;
  public static final int MSG_CHECKAV = 1;
  public static final int MSG_SESSIONEND = 34;
  public static final int MSG_TIMEUPDATE = 2;
  public static final int PROGRESSBAR_HEIGHT = 5;
  private AnyChatCoreSDK anychat;
  private String anychatServerAddr = null;
  private int anychatServerPort = -1;
  private boolean bLogined = false;
  boolean bNormal = true;
  boolean bOtherVideoOpened = false;
  boolean bSelfVideoOpened = false;
  boolean bVideoViewLoaded = false;
  private ConfigEntity configEntity;
  private Dialog dialog;
  int dwTargetUserId = -1;
  private Handler handler = new VideoVitness.1(this);
  private Timer loginTimer = null;
  private Button mBtnEndSession;
  private View mBtnSwitch;
  float mCurrentLength = 0.0F;
  float mCurrentRate = 1.0F;
  private Handler mHandler;
  boolean mIsFirst = true;
  float mOriginalLength = 0.0F;
  private ProgressBar mProgressNotice;
  private ProgressBar mProgressRemote;
  private ProgressBar mProgressSelf;
  private SurfaceView mSurfaceRemote;
  private SurfaceView mSurfaceSelf;
  private Timer mTImerShowVidoTime;
  private Timer mTimerCheckAv;
  private TimerTask mTimerTask;
  private TextView mTxtTime;
  private String mobileTel = null;
  private Timer timer;
  int videoAreaHeight = 0;
  int videoAreaWidth = 0;
  int videoIndex = 0;
  private int video_status = -1;
  int videocallSeconds = 0;
  
  private void ApplyVideoConfig()
  {
    ConfigEntity localConfigEntity = ConfigService.LoadConfig(this);
    if (localConfigEntity.configMode == 1)
    {
      AnyChatCoreSDK.SetSDKOptionInt(30, localConfigEntity.videoBitrate);
      if (localConfigEntity.videoBitrate == 0) {
        AnyChatCoreSDK.SetSDKOptionInt(31, localConfigEntity.videoQuality);
      }
      AnyChatCoreSDK.SetSDKOptionInt(33, localConfigEntity.videoFps);
      AnyChatCoreSDK.SetSDKOptionInt(32, localConfigEntity.videoFps * 4);
      AnyChatCoreSDK.SetSDKOptionInt(38, localConfigEntity.resolution_width);
      AnyChatCoreSDK.SetSDKOptionInt(39, localConfigEntity.resolution_height);
      AnyChatCoreSDK.SetSDKOptionInt(34, localConfigEntity.videoPreset);
    }
    AnyChatCoreSDK.SetSDKOptionInt(35, localConfigEntity.configMode);
    AnyChatCoreSDK.SetSDKOptionInt(40, localConfigEntity.enableP2P);
    AnyChatCoreSDK.SetSDKOptionInt(92, localConfigEntity.videoOverlay);
    AnyChatCoreSDK.SetSDKOptionInt(3, localConfigEntity.enableAEC);
    AnyChatCoreSDK.SetSDKOptionInt(18, localConfigEntity.useHWCodec);
    AnyChatCoreSDK.SetSDKOptionInt(94, localConfigEntity.videorotatemode);
    AnyChatCoreSDK.SetSDKOptionInt(96, localConfigEntity.fixcolordeviation);
    AnyChatCoreSDK.SetSDKOptionInt(84, localConfigEntity.videoShowGPURender);
    AnyChatCoreSDK.SetSDKOptionInt(98, localConfigEntity.videoAutoRotation);
    AnyChatCoreSDK.SetSDKOptionInt(85, localConfigEntity.videoAutoRotation);
  }
  
  private void CheckVideoStatus()
  {
    Object localObject;
    if ((!this.bOtherVideoOpened) && (this.anychat.GetCameraState(this.dwTargetUserId) == 2) && (this.anychat.GetUserVideoWidth(this.dwTargetUserId) != 0))
    {
      localObject = this.mSurfaceRemote.getHolder();
      if (AnyChatCoreSDK.GetSDKOptionInt(83) != 5)
      {
        ((SurfaceHolder)localObject).setFormat(4);
        ((SurfaceHolder)localObject).setFixedSize(this.anychat.GetUserVideoWidth(-1), this.anychat.GetUserVideoHeight(-1));
      }
      localObject = ((SurfaceHolder)localObject).getSurface();
      if (AnyChatCoreSDK.GetSDKOptionInt(83) != 5) {
        break label224;
      }
      this.anychat.mVideoHelper.SetVideoUser(this.videoIndex, this.dwTargetUserId);
    }
    for (;;)
    {
      this.bOtherVideoOpened = true;
      if ((!this.bSelfVideoOpened) && (this.anychat.GetCameraState(-1) == 2) && (this.anychat.GetUserVideoWidth(-1) != 0))
      {
        localObject = this.mSurfaceSelf.getHolder();
        if (AnyChatCoreSDK.GetSDKOptionInt(83) != 5)
        {
          ((SurfaceHolder)localObject).setFormat(4);
          ((SurfaceHolder)localObject).setFixedSize(this.anychat.GetUserVideoWidth(-1), this.anychat.GetUserVideoHeight(-1));
        }
        localObject = ((SurfaceHolder)localObject).getSurface();
        this.anychat.SetVideoPos(-1, (Surface)localObject, 0, 0, 0, 0);
        this.bSelfVideoOpened = true;
      }
      return;
      label224:
      this.anychat.SetVideoPos(this.dwTargetUserId, (Surface)localObject, 0, 0, 0, 0);
    }
  }
  
  private void Login()
  {
    this.anychat.Connect(this.anychatServerAddr, this.anychatServerPort);
    this.anychat.Login(this.mobileTel, "C|123456");
    startLoginTimer();
  }
  
  private void ShowEndSessionResumeDialg()
  {
    if ((this.dialog != null) && (this.dialog.isShowing())) {
      this.dialog.dismiss();
    }
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
    localBuilder.setTitle("视频见证");
    localBuilder.setMessage(ResourceUtil.getStringByResName(this, "kwlopen_str_endsession"));
    localBuilder.setPositiveButton("确定", new VideoVitness.7(this));
    localBuilder.setNegativeButton("取消", new VideoVitness.8(this));
    this.dialog = localBuilder.create();
    this.dialog.show();
  }
  
  private void initSdk()
  {
    if (this.anychat == null)
    {
      this.anychat = new AnyChatCoreSDK();
      this.anychat.InitSDK(Build.VERSION.SDK_INT, 0);
    }
    this.anychat.SetBaseEvent(this);
    this.anychat.SetVideoCallEvent(this);
    this.anychat.SetTransDataEvent(this);
    this.anychat.mSensorHelper.InitSensor(this);
  }
  
  private void initTimerCheckAv()
  {
    if (this.mTimerCheckAv == null) {
      this.mTimerCheckAv = new Timer();
    }
    this.mTimerTask = new VideoVitness.4(this);
    this.mTimerCheckAv.schedule(this.mTimerTask, 1000L, 100L);
  }
  
  private void initTimerShowTime()
  {
    if (this.mTImerShowVidoTime == null) {
      this.mTImerShowVidoTime = new Timer();
    }
    this.mTimerTask = new VideoVitness.3(this);
    this.mTImerShowVidoTime.schedule(this.mTimerTask, 100L, 1000L);
  }
  
  private void initView()
  {
    setContentView(ResourceUtil.getLayoutIdByName(this, "kwlopen_video_activity"));
    this.mSurfaceSelf = ((SurfaceView)findViewById(ResourceUtil.getId(this, "kwlopen_surface_local")));
    this.mSurfaceRemote = ((SurfaceView)findViewById(ResourceUtil.getId(this, "kwlopen_surface_remote")));
    this.mProgressSelf = ((ProgressBar)findViewById(ResourceUtil.getId(this, "kwlopen_progress_local")));
    this.mProgressRemote = ((ProgressBar)findViewById(ResourceUtil.getId(this, "kwlopen_progress_remote")));
    this.mProgressNotice = ((ProgressBar)findViewById(ResourceUtil.getId(this, "kwlopen_mProgressNotice")));
    this.mBtnSwitch = findViewById(ResourceUtil.getId(this, "kwlopen_btn_switch"));
    this.mTxtTime = ((TextView)findViewById(ResourceUtil.getId(this, "kwlopen_txt_time")));
    this.mBtnEndSession = ((Button)findViewById(ResourceUtil.getId(this, "kwlopen_btn_endsession")));
    this.mBtnEndSession.setOnClickListener(this);
    this.mBtnSwitch.setOnClickListener(this);
    this.mSurfaceRemote.setTag(Integer.valueOf(this.dwTargetUserId));
    this.configEntity = ConfigService.LoadConfig(this);
    if (this.configEntity.videoOverlay != 0) {
      this.mSurfaceSelf.getHolder().setType(3);
    }
    this.mSurfaceSelf.setZOrderOnTop(true);
    if (AnyChatCoreSDK.GetSDKOptionInt(95) == 3)
    {
      this.mSurfaceSelf.getHolder().addCallback(AnyChatCoreSDK.mCameraHelper);
      Log.i("ANYCHAT", "VIDEOCAPTRUE---JAVA");
    }
    if (AnyChatCoreSDK.GetSDKOptionInt(83) == 5)
    {
      this.videoIndex = this.anychat.mVideoHelper.bindVideo(this.mSurfaceRemote.getHolder());
      this.anychat.mVideoHelper.SetVideoUser(this.videoIndex, this.dwTargetUserId);
      Log.i("ANYCHAT", "VIDEOSHOW---JAVA");
    }
    Object localObject = findViewById(ResourceUtil.getId(this, "kwlopen_frame_local_area"));
    ((View)localObject).getViewTreeObserver().addOnGlobalLayoutListener(new VideoVitness.5(this, (View)localObject));
    if (AnyChatCoreSDK.GetSDKOptionInt(95) == 3)
    {
      if (AnyChatCoreSDK.mCameraHelper.GetCameraNumber() > 1)
      {
        this.mBtnSwitch.setVisibility(0);
        localObject = AnyChatCoreSDK.mCameraHelper;
        AnyChatCoreSDK.mCameraHelper.getClass();
        ((AnyChatCameraHelper)localObject).SelectVideoCapture(1);
      }
      if (getResources().getConfiguration().orientation != 2) {
        break label471;
      }
      adjustLocalVideo(true);
    }
    label469:
    label471:
    while (getResources().getConfiguration().orientation != 1)
    {
      return;
      localObject = this.anychat.EnumVideoCapture();
      if ((localObject == null) || (localObject.length <= 1)) {
        break;
      }
      this.mBtnSwitch.setVisibility(0);
      int i = 0;
      for (;;)
      {
        if (i >= localObject.length) {
          break label469;
        }
        String str = localObject[i];
        if (str.indexOf("Front") >= 0)
        {
          this.anychat.SelectVideoCapture(str);
          break;
        }
        i += 1;
      }
      break;
    }
    adjustLocalVideo(false);
  }
  
  private void startLoginTimer()
  {
    this.loginTimer = new Timer();
    VideoVitness.9 local9 = new VideoVitness.9(this);
    this.loginTimer.schedule(local9, 15000L);
  }
  
  private void stopLoginTimer()
  {
    try
    {
      if (this.loginTimer != null)
      {
        this.loginTimer.cancel();
        this.loginTimer = null;
      }
      return;
    }
    catch (Exception localException) {}
  }
  
  private void updateVolume()
  {
    this.mProgressSelf.setProgress(this.anychat.GetUserSpeakVolume(-1));
    this.mProgressRemote.setProgress(this.anychat.GetUserSpeakVolume(this.dwTargetUserId));
  }
  
  public void OnAnyChatConnectMessage(boolean paramBoolean)
  {
    Log.d(VideoVitness.class.getName(), "OnAnyChatConnectMessage---" + paramBoolean);
    if (!paramBoolean)
    {
      BaseMethod.showToast("视频服务器连接失败", this);
      this.bLogined = false;
      this.mProgressNotice.setVisibility(8);
      Intent localIntent = new Intent();
      localIntent.putExtra("errcode", -1);
      localIntent.putExtra("errmsg", "连接服务器失败，请检查网络！");
      setResult(-1, localIntent);
      stopTimer();
      finish();
    }
  }
  
  public void OnAnyChatEnterRoomMessage(int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0)
    {
      this.anychat.UserCameraControl(-1, 1);
      this.anychat.UserSpeakControl(-1, 1);
      this.anychat.UserCameraControl(this.dwTargetUserId, 1);
      this.anychat.UserSpeakControl(this.dwTargetUserId, 1);
      this.bSelfVideoOpened = false;
      initTimerShowTime();
    }
  }
  
  public void OnAnyChatLinkCloseMessage(int paramInt)
  {
    Log.d(VideoVitness.class.getName(), "OnAnyChatLinkCloseMessage -- >" + paramInt);
    this.anychat.UserCameraControl(-1, 0);
    this.anychat.UserSpeakControl(-1, 0);
    this.anychat.UserSpeakControl(this.dwTargetUserId, 0);
    this.anychat.UserCameraControl(this.dwTargetUserId, 0);
    this.anychat.LeaveRoom(-1);
    BaseMethod.showToast(ResourceUtil.getStringByResName(this, "kwlopen_ac_serverlink_close"), this);
    Intent localIntent = new Intent();
    localIntent.putExtra("errcode", -4);
    localIntent.putExtra("errmsg", ResourceUtil.getStringByResName(this, "kwlopen_ac_serverlink_close"));
    setResult(-1, localIntent);
    stopTimer();
    finish();
  }
  
  public void OnAnyChatLoginMessage(int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0)
    {
      this.bLogined = true;
      stopLoginTimer();
      BussinessCenter.selfUserId = paramInt1;
      Log.d(VideoVitness.class.getName(), "anychat userID --->" + paramInt1);
      BussinessCenter.selfUserName = this.anychat.GetUserName(paramInt1);
      BussinessCenter.VideoCallControl(1, this.dwTargetUserId, 0, 0, 0, "");
    }
    while (paramInt2 != 200) {
      return;
    }
    BaseMethod.showToast(ResourceUtil.getStringByResName(this, "kwlopen_ac_lggin_failed"), this);
    this.bLogined = false;
    this.mProgressNotice.setVisibility(8);
    Intent localIntent = new Intent();
    localIntent.putExtra("errcode", -2);
    localIntent.putExtra("errmsg", "登录超时，请检查网络！");
    setResult(-1, localIntent);
    stopTimer();
    finish();
  }
  
  public void OnAnyChatOnlineUserMessage(int paramInt1, int paramInt2)
  {
    this.anychat.UserCameraControl(this.dwTargetUserId, 1);
    this.anychat.UserSpeakControl(this.dwTargetUserId, 1);
    this.bOtherVideoOpened = false;
  }
  
  public void OnAnyChatSDKFilterData(byte[] paramArrayOfByte, int paramInt) {}
  
  public void OnAnyChatTransBuffer(int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    try
    {
      paramArrayOfByte = new String(paramArrayOfByte, 0, paramInt2, "gb2312");
      Log.d(VideoVitness.class.getName(), "msg=" + paramArrayOfByte);
      paramArrayOfByte = paramArrayOfByte.split("\\|");
      if (Integer.valueOf(paramArrayOfByte[0]).intValue() == 5100)
      {
        stopTimer();
        this.video_status = Integer.valueOf(paramArrayOfByte[1]).intValue();
        Intent localIntent = new Intent();
        localIntent.putExtra("errcode", 0);
        if (this.video_status == 1) {
          localIntent.putExtra("errmsg", paramArrayOfByte[2]);
        }
        localIntent.putExtra("flag", this.video_status);
        setResult(-1, localIntent);
        finish();
      }
      return;
    }
    catch (UnsupportedEncodingException paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
      stopTimer();
      this.video_status = -1;
      paramArrayOfByte = new Intent();
      paramArrayOfByte.putExtra("errcode", 0);
      paramArrayOfByte.putExtra("flag", this.video_status);
      setResult(-1, paramArrayOfByte);
      finish();
    }
  }
  
  public void OnAnyChatTransBufferEx(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {}
  
  public void OnAnyChatTransFile(int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {}
  
  public void OnAnyChatUserAtRoomMessage(int paramInt, boolean paramBoolean)
  {
    this.anychat.UserCameraControl(this.dwTargetUserId, 1);
    this.anychat.UserSpeakControl(this.dwTargetUserId, 1);
    this.bOtherVideoOpened = false;
    if ((paramBoolean) && (paramInt == this.dwTargetUserId)) {
      this.mProgressNotice.setVisibility(8);
    }
    if ((!paramBoolean) && (paramInt == this.dwTargetUserId))
    {
      this.anychat.LeaveRoom(-1);
      BaseMethod.showToast(ResourceUtil.getStringByResName(this, "kwlopen_ac_serverlink_close"), this);
      Intent localIntent = new Intent();
      localIntent.putExtra("errcode", -3);
      localIntent.putExtra("errmsg", "坐席退出房间，请重新认证！");
      setResult(-1, localIntent);
      stopTimer();
      finish();
    }
  }
  
  public void OnAnyChatVideoCallEvent(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, String paramString)
  {
    switch (paramInt1)
    {
    default: 
      return;
    case 2: 
      try
      {
        BussinessCenter.getBussinessCenter().onVideoCallReply(paramInt2, paramInt3, paramInt4, paramInt5, paramString);
        return;
      }
      catch (Exception paramString)
      {
        paramString = new Intent();
        paramString.putExtra("errcode", -6);
        paramString.putExtra("errmsg", "坐席意外断开，请重新认证！");
        paramString.putExtra("flag", this.video_status);
        setResult(-1, paramString);
        finish();
        return;
      }
    case 3: 
      BussinessCenter.getBussinessCenter().stopSessionMusic();
      this.anychat.EnterRoom(paramInt5, "");
      return;
    }
    BussinessCenter.getBussinessCenter().onVideoCallEnd(paramInt2, paramInt4, paramInt5, paramString);
    this.anychat.UserCameraControl(-1, 0);
    this.anychat.UserSpeakControl(-1, 0);
    this.anychat.UserSpeakControl(this.dwTargetUserId, 0);
    this.anychat.UserCameraControl(this.dwTargetUserId, 0);
    this.anychat.LeaveRoom(-1);
    if (paramInt3 != 0)
    {
      paramString = new Intent();
      paramString.putExtra("errcode", -5);
      paramString.putExtra("errmsg", "坐席意外退出，请重新认证！");
      setResult(-1, paramString);
      stopTimer();
      finish();
      return;
    }
    startTimer();
    Log.d(VideoVitness.class.getName(), "dwErrorCode=" + paramInt3);
  }
  
  public void adjustLocalVideo(boolean paramBoolean)
  {
    Object localObject = new DisplayMetrics();
    getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject);
    float f2 = ((DisplayMetrics)localObject).widthPixels / 4.0F;
    localObject = (LinearLayout)findViewById(ResourceUtil.getId(this, "kwlopen_frame_local_area"));
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)((LinearLayout)localObject).getLayoutParams();
    float f1;
    if (paramBoolean) {
      if (AnyChatCoreSDK.GetSDKOptionInt(38) != 0) {
        f1 = AnyChatCoreSDK.GetSDKOptionInt(39) * f2 / AnyChatCoreSDK.GetSDKOptionInt(38) + 5.0F;
      }
    }
    for (;;)
    {
      localLayoutParams.width = ((int)f2);
      localLayoutParams.height = ((int)f1);
      ((LinearLayout)localObject).setLayoutParams(localLayoutParams);
      return;
      f1 = 0.75F * f2 + 5.0F;
      continue;
      if (AnyChatCoreSDK.GetSDKOptionInt(39) != 0) {
        f1 = AnyChatCoreSDK.GetSDKOptionInt(38) * f2 / AnyChatCoreSDK.GetSDKOptionInt(39) + 5.0F;
      } else {
        f1 = 1.3333334F * f2 + 5.0F;
      }
    }
  }
  
  protected void intParams()
  {
    this.anychatServerAddr = getIntent().getStringExtra("anychatServerAddr");
    this.anychatServerPort = getIntent().getIntExtra("anychatServerPort", 0);
    this.dwTargetUserId = getIntent().getIntExtra("anychatRemoteUserId", 0);
    this.mobileTel = getIntent().getStringExtra("mobileTel");
    Log.e("=====", this.anychatServerAddr + " " + this.anychatServerPort + " " + this.dwTargetUserId + " " + this.mobileTel);
    BussinessCenter.getBussinessCenter();
    BussinessCenter.mContext = this;
    if ((this.anychatServerAddr != null) && (this.mobileTel != null) && (this.anychatServerPort != -1) && (this.dwTargetUserId != -1))
    {
      Login();
      return;
    }
    BaseMethod.showToast("登录参数为空，请检查！", this);
  }
  
  public void onClick(View paramView)
  {
    if (paramView == this.mBtnEndSession) {
      ShowEndSessionResumeDialg();
    }
    if (paramView == this.mBtnSwitch)
    {
      if (AnyChatCoreSDK.GetSDKOptionInt(95) != 3) {
        break label36;
      }
      AnyChatCoreSDK.mCameraHelper.SwitchCamera();
    }
    for (;;)
    {
      return;
      label36:
      paramView = this.anychat.EnumVideoCapture();
      String str = this.anychat.GetCurVideoCapture();
      int i = 0;
      while (i < paramView.length)
      {
        if (!str.equals(paramView[i]))
        {
          this.anychat.UserCameraControl(-1, 0);
          this.anychat.SelectVideoCapture(paramView[i]);
          this.anychat.UserCameraControl(-1, 1);
          this.bSelfVideoOpened = false;
          return;
        }
        i += 1;
      }
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    if (paramConfiguration.orientation == 2)
    {
      adjustLocalVideo(true);
      AnyChatCoreSDK.mCameraHelper.setCameraDisplayOrientation();
      return;
    }
    adjustLocalVideo(false);
    AnyChatCoreSDK.mCameraHelper.setCameraDisplayOrientation();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    getWindow().addFlags(128);
    initSdk();
    intParams();
    initView();
    ApplyVideoConfig();
    this.mHandler = new Handler(new VideoVitness.2(this));
    initTimerCheckAv();
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    this.anychat.Logout();
    this.anychat.Release();
    if (this.mTimerCheckAv != null) {
      this.mTimerCheckAv.cancel();
    }
    if (this.mTImerShowVidoTime != null) {
      this.mTImerShowVidoTime.cancel();
    }
    if ((this.dialog != null) && (this.dialog.isShowing())) {
      this.dialog.dismiss();
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4) {
      ShowEndSessionResumeDialg();
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPause()
  {
    super.onPause();
  }
  
  protected void onRestart()
  {
    super.onRestart();
    this.anychat.UserCameraControl(-1, 1);
    this.anychat.UserSpeakControl(-1, 1);
    this.anychat.UserSpeakControl(this.dwTargetUserId, 1);
    this.anychat.UserCameraControl(this.dwTargetUserId, 1);
    if (AnyChatCoreSDK.GetSDKOptionInt(83) == 5)
    {
      this.videoIndex = this.anychat.mVideoHelper.bindVideo(this.mSurfaceRemote.getHolder());
      this.anychat.mVideoHelper.SetVideoUser(this.videoIndex, this.dwTargetUserId);
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    BussinessCenter.mContext = this;
    initSdk();
  }
  
  protected void onStop()
  {
    super.onStop();
    this.anychat.UserCameraControl(-1, 0);
    this.anychat.UserSpeakControl(-1, 0);
    this.anychat.UserSpeakControl(this.dwTargetUserId, 0);
    this.anychat.UserCameraControl(this.dwTargetUserId, 0);
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    return false;
  }
  
  public void startTimer()
  {
    Log.d(VideoVitness.class.getName(), "我开始定时器了-----");
    this.timer = new Timer();
    VideoVitness.6 local6 = new VideoVitness.6(this);
    this.timer.schedule(local6, 5000L);
  }
  
  public void stopTimer()
  {
    Log.d(VideoVitness.class.getName(), "关闭定时器---");
    try
    {
      if (this.timer != null)
      {
        this.timer.cancel();
        this.timer = null;
      }
      return;
    }
    catch (Exception localException) {}
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwlopen\sdk\activity\VideoVitness.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */