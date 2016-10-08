package com.tencent.avsdkhost.activity;

import android.app.AlertDialog.Builder;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.widget.PopupWindow;
import com.android.dazhihui.DzhApplication;
import com.android.dazhihui.b.b;
import com.android.dazhihui.d.n;
import com.android.dazhihui.o;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.w;
import com.g.a.a.a.b.c;
import com.g.a.b.a.h;
import com.g.a.b.j;
import com.tencent.av.sdk.AVAudioCtrl;
import com.tencent.av.sdk.AVContext;
import com.tencent.avsdk.Model.CustomRspMsgVo.RoomInfo;
import com.tencent.avsdk.UserInfo;
import com.tencent.avsdk.UserilvbManager;
import com.tencent.avsdk.Util;
import com.tencent.avsdk.control.AVCameraControl;
import com.tencent.avsdk.control.AVRoomControl;
import com.tencent.avsdk.control.AVRoomControl.RoomState;
import com.tencent.avsdk.control.GiftManager;
import com.tencent.avsdk.control.QavsdkControl;
import com.tencent.avsdk.widget.GiftView;
import com.tencent.avsdk.widget.SwipeBackLayout;
import com.tencent.avsdkhost.ChatEntityHost;
import com.tencent.avsdkhost.control.AVHostUIControl;
import com.tencent.avsdkhost.control.AnimationControlHost;
import com.tencent.avsdkhost.control.MessageControlHost;
import com.tencent.avsdkhost.control.RoomControl;
import com.tencent.avsdkhost.widget.AboveVideoBottomViewHost;
import com.tencent.avsdkhost.widget.AboveVideoContainViewHost;
import com.tencent.avsdkhost.widget.AboveVideoNotSwipeViewHost;
import com.tencent.avsdkhost.widget.AboveVideoTopViewHost;
import com.tencent.avsdkhost.widget.MyUserInfoDialogHost;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class AvHostActivity
  extends BaseActivity
{
  public static final SimpleDateFormat DATE_FORMAT_DATE = new SimpleDateFormat("yyyyMMdd_HHmmss");
  public static final int MAX_TIMEOUT = 30000;
  private static final String TAG = "ilvb";
  private static long sLastStartActivityTime = 0L;
  private AnimationControlHost animationControl;
  private List<ChatEntityHost> chatList = new ArrayList();
  private AVCameraControl mAVCameraControl;
  private AVRoomControl mAVRoomControl;
  private AVHostUIControl mAVUIControl;
  private AboveVideoBottomViewHost mAboveVideoBottomView;
  private AboveVideoContainViewHost mAboveVideoContainView;
  private AboveVideoNotSwipeViewHost mAboveVideoNotSwipeView;
  private AboveVideoTopViewHost mAboveVideoTopView;
  private BroadcastReceiver mBroadcastReceiver = new AvHostActivity.2(this);
  private Context mContext;
  private boolean mForceFinish = false;
  private String mGroupId;
  private Handler mHandler = new AvHostActivity.MyHandler(this, new AvHostActivity.1(this));
  private String mHostIdentifier = "";
  private PowerManager.WakeLock mKeepScreenWakeLock;
  private long mLastTime = System.currentTimeMillis();
  private int mLoginErrorCode = 0;
  private MyUserInfoDialogHost mMyUserInfoDialogView;
  private int mNetWorkType = 0;
  private QavsdkControl mQavsdkControl;
  private int mRoomID;
  private UserInfo mSelfUserInfo;
  private HandlerThread mSubThread;
  private Handler mSubThreadHandler;
  private SwipeBackLayout mSwipeBackLayout;
  private long mThumbUpDelayTime = 1000L;
  private int mThumbUpNum;
  private int mUpNum = -1;
  private MessageControlHost messageControl;
  PopupWindow redEnvelopepopupWindow;
  private CustomRspMsgVo.RoomInfo roomInfo;
  
  private void handleMessageInSubThread(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    }
  }
  
  public static boolean isTimeTooShort()
  {
    if (Math.abs(sLastStartActivityTime - SystemClock.elapsedRealtime()) > 3000L)
    {
      sLastStartActivityTime = SystemClock.elapsedRealtime();
      return false;
    }
    Log.e("ilvb", "AvHostActivity 短时间内连续点击开始直播，可能导致启动activity多次, 忽略本次操作 last=" + sLastStartActivityTime + " now=" + SystemClock.elapsedRealtime());
    return true;
  }
  
  private void onCloseVideo(boolean paramBoolean)
  {
    Log.d("ilvb", "AvHostActivity onCloseVideo");
    if (this.mAboveVideoContainView != null) {
      this.mAboveVideoContainView.cancel();
    }
    this.mHandler.sendEmptyMessage(312);
    this.mHandler.sendEmptyMessage(314);
    RoomControl.getInstance().stopRoom(o.a().b(), this.mRoomID, new AvHostActivity.7(this, paramBoolean));
  }
  
  private void registerBroadcastReceiver()
  {
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("com.dazhihui.avsdk.ACTION_START_CONTEXT_COMPLETE");
    localIntentFilter.addAction("com.dazhihui.avsdk.ACTION_CLOSE_CONTEXT_COMPLETE");
    localIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
    registerReceiver(this.mBroadcastReceiver, localIntentFilter);
  }
  
  public static void startAvGuestActivity(Context paramContext)
  {
    if (isTimeTooShort()) {
      return;
    }
    paramContext.startActivity(new Intent(paramContext, AvHostActivity.class));
  }
  
  private void updateDialog(String paramString)
  {
    Log.d("ilvb", paramString);
  }
  
  private void updateView(Configuration paramConfiguration)
  {
    if (this.mAboveVideoContainView != null) {
      this.mAboveVideoContainView.updateView(paramConfiguration);
    }
    if (this.mAboveVideoTopView != null) {
      this.mAboveVideoTopView.updateView(paramConfiguration);
    }
    if (this.mAboveVideoBottomView != null) {
      this.mAboveVideoBottomView.updateView(paramConfiguration);
    }
    if (this.mAboveVideoNotSwipeView != null) {
      this.mAboveVideoNotSwipeView.updateView(paramConfiguration);
    }
    if (this.mMyUserInfoDialogView != null) {
      this.mMyUserInfoDialogView.updateView(paramConfiguration);
    }
  }
  
  public void enableMic(boolean paramBoolean)
  {
    if (this.mQavsdkControl == null) {}
    Object localObject;
    do
    {
      do
      {
        return;
        localObject = this.mQavsdkControl.getAVContext();
      } while (localObject == null);
      localObject = ((AVContext)localObject).getAudioCtrl();
    } while (localObject == null);
    if (paramBoolean)
    {
      Log.d("ilvb", "AvHostActivity enableMic set true ");
      ((AVAudioCtrl)localObject).enableMic(true);
      return;
    }
    Log.d("ilvb", "AvHostActivity enableMic set false ");
    ((AVAudioCtrl)localObject).enableMic(false);
  }
  
  public void finish()
  {
    super.finish();
    Log.d("ilvb", "AvHostActivity finish");
  }
  
  protected void init(Bundle paramBundle) {}
  
  public void onBackPressed()
  {
    if ((this.mMyUserInfoDialogView != null) && (this.mMyUserInfoDialogView.getVisibility() == 0)) {
      this.mMyUserInfoDialogView.dismiss();
    }
    do
    {
      return;
      if ((this.mAboveVideoBottomView != null) && (this.mAboveVideoBottomView.giftView != null) && (this.mAboveVideoBottomView.giftView.isShowing()))
      {
        this.mAboveVideoBottomView.giftView.dismiss();
        return;
      }
    } while (this.mAboveVideoNotSwipeView == null);
    this.mAboveVideoNotSwipeView.hostCloseAlertDialog();
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    updateView(paramConfiguration);
    if (paramConfiguration.orientation == 1)
    {
      Log.d("ilvb", "AvHostActivity onConfigurationChanged newConfig = 竖屏");
      return;
    }
    Log.d("ilvb", "AvHostActivity onConfigurationChanged newConfig = 横屏");
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    Log.d("ilvb", "AvHostActivity onCreate start");
    super.onCreate(paramBundle);
    this.mContext = this;
    setContentView(2130903184);
    if (!w.a().l())
    {
      paramBundle = new AlertDialog.Builder(this);
      paramBundle.setMessage("你还未登录,请先登录！");
      paramBundle.setTitle("提示");
      paramBundle.setCancelable(false);
      paramBundle.setNeutralButton("退出", new AvHostActivity.3(this));
      paramBundle.setNegativeButton("登录", new AvHostActivity.4(this));
      paramBundle.show();
      return;
    }
    this.mNetWorkType = Util.getNetWorkType(this.mContext);
    if ((!com.android.dazhihui.a.g.a().c) && (this.mNetWorkType != 2))
    {
      com.android.dazhihui.a.g.a().c = true;
      paramBundle = new AlertDialog.Builder(this.mContext);
      paramBundle.setTitle("提示");
      paramBundle.setCancelable(false);
      paramBundle.setMessage("您正在使用手机网络,是否继续直播");
      paramBundle.setNegativeButton("继续直播", null);
      paramBundle.setNeutralButton("退出直播", new AvHostActivity.5(this));
      paramBundle.show();
    }
    this.mQavsdkControl = QavsdkControl.getInstance();
    this.mSelfUserInfo = UserInfo.getInstance();
    paramBundle = UserilvbManager.getInstance().getUserName();
    String str1 = UserilvbManager.getInstance().getToken();
    String str2 = UserilvbManager.getInstance().getNickName();
    if ((!TextUtils.isEmpty(paramBundle)) && (!TextUtils.isEmpty(str1)))
    {
      n.d("ilvb", "AvHostActivity onCreate userName=" + paramBundle + " nickName=" + str2 + " userSig=" + str1);
      this.mSelfUserInfo.setUserPhone(paramBundle);
      this.mSelfUserInfo.setUsersig(str1);
      this.mSelfUserInfo.setUserName(str2);
      this.mSelfUserInfo.setHeadImagePath(w.a().b());
      this.mHostIdentifier = this.mSelfUserInfo.getUserPhone();
      this.mAVRoomControl = AVRoomControl.getInstance().init(this, this.mHandler);
      this.mAVCameraControl = new AVCameraControl(this, this.mHandler);
      registerBroadcastReceiver();
      this.mSelfUserInfo.setIsCreater(Boolean.valueOf(true));
      this.mAVRoomControl.setAudioCat(1);
      this.mAboveVideoContainView = ((AboveVideoContainViewHost)findViewById(2131559313));
      this.mAboveVideoContainView.setActivityHandler(this.mHandler);
      this.mAboveVideoTopView = this.mAboveVideoContainView.getAboveVideoTopView();
      this.mAboveVideoBottomView = this.mAboveVideoContainView.getAboveVideoBottomView();
      this.mAboveVideoBottomView.setmActivity(this);
      this.mMyUserInfoDialogView = this.mAboveVideoContainView.getMyUserInfoDialogView();
      this.mMyUserInfoDialogView.setRoomId(this.mRoomID);
      this.mMyUserInfoDialogView.sethostIdentifier(this.mHostIdentifier);
      this.mAboveVideoNotSwipeView = ((AboveVideoNotSwipeViewHost)findViewById(2131559314));
      this.mAboveVideoNotSwipeView.setActivityHandler(this.mHandler);
      this.mAboveVideoContainView.setAboveVideoNotSwipeView(this.mAboveVideoNotSwipeView);
      this.mSwipeBackLayout = ((SwipeBackLayout)findViewById(2131559312));
      this.mSwipeBackLayout.setEnableGesture(true);
      this.mSwipeBackLayout.setContentView(this.mAboveVideoContainView);
      this.mSwipeBackLayout.setActivityHandler(this.mHandler);
      this.mAVUIControl = new AVHostUIControl(getApplicationContext(), findViewById(2131559307), this.mHandler);
      this.mKeepScreenWakeLock = ((PowerManager)getSystemService("power")).newWakeLock(10, "AvHostActivity");
      GiftManager.getConfig(null);
      UserilvbManager.getInstance().isNoSpeak = false;
      this.mLastTime = System.currentTimeMillis();
      this.mSubThread = new HandlerThread("ilvb_sub_thread");
      this.mSubThread.start();
      this.mSubThreadHandler = new AvHostActivity.6(this, this.mSubThread.getLooper());
      this.mHandler.sendEmptyMessage(336);
      if (!com.g.a.b.g.a().b())
      {
        paramBundle = new j(DzhApplication.a().getApplicationContext()).a(3).a().a(new c()).a(h.b).b();
        com.g.a.b.g.a().a(paramBundle);
      }
      b.a().b(this);
      Log.d("ilvb", "AvHostActivity onCreate End");
      return;
    }
    if (TextUtils.isEmpty(paramBundle))
    {
      RoomControl.getInstance().showError(this, "帐号为空,请退出重试！");
      Log.e("ilvb", "AvHostActivity onCreate ilvb account为空");
      return;
    }
    RoomControl.getInstance().showError(this, "token为空,请退出重试！");
    Log.e("ilvb", "AvHostActivity onCreate ilvb token 为空");
  }
  
  protected void onDestroy()
  {
    if ((!this.mForceFinish) && (this.mAVRoomControl != null) && (this.mAVRoomControl.getmRoomState() != AVRoomControl.RoomState.ROOM_EXIT_OK)) {
      onCloseVideo(false);
    }
    if (this.mAboveVideoContainView != null) {
      this.mAboveVideoContainView.cancel();
    }
    if ((this.mKeepScreenWakeLock != null) && (this.mKeepScreenWakeLock.isHeld())) {
      this.mKeepScreenWakeLock.release();
    }
    enableMic(false);
    if (this.mSubThread != null) {
      this.mSubThread.quit();
    }
    if (this.mAVRoomControl != null) {
      this.mAVRoomControl.destroy();
    }
    if (this.mAVCameraControl != null) {
      this.mAVCameraControl.destroy();
    }
    super.onDestroy();
    this.mHandler.removeMessages(278);
    if (this.mAVUIControl != null)
    {
      this.mAVUIControl.onDestroy();
      this.mAVUIControl = null;
    }
    if (this.mBroadcastReceiver != null) {
      unregisterReceiver(this.mBroadcastReceiver);
    }
    Log.d("ilvb", "AvHostActivity onDestroy");
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    if ((paramIntent != null) && (paramIntent.getExtras() != null))
    {
      int i = paramIntent.getExtras().getInt("roomnum");
      String str1 = paramIntent.getExtras().getString("selfIdentifier");
      String str2 = paramIntent.getExtras().getString("groupid");
      String str3 = paramIntent.getExtras().getString("roomimage");
      String str4 = paramIntent.getExtras().getString("roomshareurl");
      int j = paramIntent.getExtras().getInt("roompv");
      Log.d("ilvb", "AvHostActivity onNewIntent mRoomID=" + i + " mHostIdentifier=" + str1 + " mGroupId=" + str2 + " mRoomImage=" + str3 + " mRoomShareUrl=" + str4 + " mRoomPV=" + j);
    }
    Log.d("ilvb", "AvHostActivity onNewIntent End");
  }
  
  protected void onPause()
  {
    super.onPause();
    if (this.mAVUIControl != null) {
      this.mAVUIControl.onPause();
    }
    this.mHandler.removeMessages(278);
    Log.d("ilvb", "AvHostActivity onPause");
  }
  
  protected void onPostCreate(Bundle paramBundle)
  {
    super.onPostCreate(paramBundle);
  }
  
  protected void onRestoreInstanceState(Bundle paramBundle)
  {
    super.onRestoreInstanceState(paramBundle);
    Log.d("ilvb", "AvHostActivity onRestoreInstanceState");
  }
  
  public void onResume()
  {
    super.onResume();
    if ((b.a().f() != null) && (b.a().f().equals(this))) {
      b.a().c(null);
    }
    if (this.mAVUIControl != null) {
      this.mAVUIControl.onResume();
    }
    this.mHandler.removeMessages(278);
    this.mHandler.sendEmptyMessageDelayed(278, this.mThumbUpDelayTime);
    Log.d("ilvb", "AvHostActivity onResume");
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    paramBundle.putInt("roomnum", this.mRoomID);
    paramBundle.putString("selfIdentifier", this.mHostIdentifier);
    paramBundle.putString("groupid", this.mGroupId);
    Log.d("ilvb", "AvHostActivity onSaveInstanceState");
  }
  
  protected void onStart()
  {
    super.onStart();
  }
  
  protected void onStop()
  {
    super.onStop();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\activity\AvHostActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */