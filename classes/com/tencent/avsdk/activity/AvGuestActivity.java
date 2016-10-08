package com.tencent.avsdk.activity;

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
import com.android.dazhihui.ui.screen.BaseActivity;
import com.g.a.a.a.b.c;
import com.g.a.b.a.h;
import com.g.a.b.d;
import com.g.a.b.j;
import com.tencent.av.sdk.AVView;
import com.tencent.avsdk.ChatEntity;
import com.tencent.avsdk.LiveVideoInfo;
import com.tencent.avsdk.Model.CustomRspMsgVo.RoomInfo;
import com.tencent.avsdk.MyUserInfoDialog;
import com.tencent.avsdk.UserInfo;
import com.tencent.avsdk.UserilvbManager;
import com.tencent.avsdk.UserilvbManager.OnAccountChangeListener;
import com.tencent.avsdk.Util;
import com.tencent.avsdk.control.AVGuestUIControl;
import com.tencent.avsdk.control.AVRoomControl;
import com.tencent.avsdk.control.AVRoomControl.RoomState;
import com.tencent.avsdk.control.AnimationControl;
import com.tencent.avsdk.control.GiftManager;
import com.tencent.avsdk.control.LoginControl;
import com.tencent.avsdk.control.MessageControl;
import com.tencent.avsdk.control.QavsdkControl;
import com.tencent.avsdk.widget.AboveVideoBottomView;
import com.tencent.avsdk.widget.AboveVideoContainView;
import com.tencent.avsdk.widget.AboveVideoNotSwipeView;
import com.tencent.avsdk.widget.AboveVideoTopView;
import com.tencent.avsdk.widget.CarAnimation;
import com.tencent.avsdk.widget.ExtendOpenGLView;
import com.tencent.avsdk.widget.GameOverView;
import com.tencent.avsdk.widget.GiftView;
import com.tencent.avsdk.widget.SwipeBackLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class AvGuestActivity
  extends BaseActivity
{
  public static final SimpleDateFormat DATE_FORMAT_DATE = new SimpleDateFormat("yyyyMMdd_HHmmss");
  private static final int MAX_REQUEST_VIEW_COUNT = 3;
  public static final int MAX_TIMEOUT = 30000;
  private static final int MIN_REQUEST_VIEW_COUNT = 1;
  private static final String TAG = "ilvb";
  private static List<LiveVideoInfo> mAllListData;
  public static String mHostIdentifier;
  private static int sArrayAdapterIndex;
  private static long sLastStartActivityTime = 0L;
  private AnimationControl animationControl;
  private CarAnimation carAnimation = null;
  private List<ChatEntity> chatList = new ArrayList();
  private AVRoomControl mAVRoomControl;
  private AVGuestUIControl mAVUIControl;
  private AboveVideoBottomView mAboveVideoBottomView;
  private AboveVideoContainView mAboveVideoContainView;
  private AboveVideoNotSwipeView mAboveVideoNotSwipeView;
  private AboveVideoTopView mAboveVideoTopView;
  private BroadcastReceiver mBroadcastReceiver = new AvGuestActivity.3(this);
  private Context mContext;
  private boolean mEnterSoundMode = false;
  private boolean mFromSoundMode = false;
  private GameOverView mGameOverView;
  private String mGroupId;
  private Handler mHandler = new AvGuestActivity.MyHandler(this, new AvGuestActivity.2(this));
  private int mHostVideoType = 0;
  private PowerManager.WakeLock mKeepScreenWakeLock;
  private long mLastTime = System.currentTimeMillis();
  private LoginControl mLoginControl;
  private int mLoginErrorCode = 0;
  private MyUserInfoDialog mMyUserInfoDialogView;
  private int mNetWorkType = 0;
  private UserilvbManager.OnAccountChangeListener mOnAccountChangeListener = new AvGuestActivity.1(this);
  private QavsdkControl mQavsdkControl;
  private String[] mRequestIdentifierList = null;
  private String mRequestSrc;
  private AVView[] mRequestViewList = null;
  private int mRoomID;
  private String mRoomImage;
  private int mRoomPV;
  private String mRoomShareUrl;
  private UserInfo mSelfUserInfo;
  private HandlerThread mSubThread;
  private Handler mSubThreadHandler;
  private SwipeBackLayout mSwipeBackLayout;
  private long mThumbUpDelayTime = 1000L;
  private int mThumbUpNum;
  private int mUpNum = -1;
  private MessageControl messageControl;
  private d options;
  PopupWindow redEnvelopepopupWindow;
  private CustomRspMsgVo.RoomInfo roomInfo;
  
  static
  {
    mAllListData = null;
    sArrayAdapterIndex = -1;
    mHostIdentifier = "";
  }
  
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
    Log.e("ilvb", "AvGuestActivity 短时间内连续点击列表，可能导致启动activity多次, 忽略本次操作 last=" + sLastStartActivityTime + " now=" + SystemClock.elapsedRealtime());
    return true;
  }
  
  private void loginManager()
  {
    if (this.mLoginControl != null) {
      this.mLoginControl.manageLogin(new AvGuestActivity.6(this));
    }
  }
  
  private void registerBroadcastReceiver()
  {
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("com.dazhihui.avsdk.ACTION_START_CONTEXT_COMPLETE");
    localIntentFilter.addAction("com.dazhihui.avsdk.ACTION_CLOSE_CONTEXT_COMPLETE");
    localIntentFilter.addAction("com.android.dazhihui.ilvbclose");
    localIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
    localIntentFilter.addAction("com.dazhihui.avsdk.ACTION_SHOW_GIFT_VIEW");
    registerReceiver(this.mBroadcastReceiver, localIntentFilter);
  }
  
  public static void startAvGuestActivity(List<LiveVideoInfo> paramList, int paramInt1, Context paramContext, boolean paramBoolean, int paramInt2, String paramString1, String paramString2, String paramString3, int paramInt3, String paramString4, String paramString5, String paramString6)
  {
    if (isTimeTooShort()) {
      return;
    }
    if ((paramList != null) && (paramList.size() > 0))
    {
      mAllListData = paramList;
      sArrayAdapterIndex = paramInt1;
    }
    paramString1 = new Intent(paramContext, AvGuestActivity.class).putExtra("from_only_sound", paramBoolean).putExtra("roomnum", paramInt2).putExtra("selfIdentifier", paramString1).putExtra("roomimage", paramString2).putExtra("roomshareurl", paramString3).putExtra("roompv", paramInt3).putExtra("groupid", paramString4);
    paramList = paramString5;
    if (TextUtils.isEmpty(paramString5)) {
      paramList = "";
    }
    paramString1 = paramString1.putExtra("requestSrc", paramList);
    paramList = paramString6;
    if (TextUtils.isEmpty(paramString6)) {
      paramList = "1";
    }
    paramContext.startActivity(paramString1.putExtra("room_status", paramList));
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
    if (this.mGameOverView != null) {
      this.mGameOverView.updateView(paramConfiguration);
    }
  }
  
  public void finish()
  {
    super.finish();
    Log.d("ilvb", "AvGuestActivity finish");
  }
  
  protected void init(Bundle paramBundle) {}
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 100)
    {
      Log.d("ilvb", "AvGuestActivity pay return");
      loginManager();
    }
  }
  
  public void onBackPressed()
  {
    if ((this.mGameOverView != null) && (this.mGameOverView.getVisibility() == 0)) {
      onCloseVideo(false);
    }
    do
    {
      return;
      if ((this.mMyUserInfoDialogView != null) && (this.mMyUserInfoDialogView.getVisibility() == 0))
      {
        this.mMyUserInfoDialogView.dismiss();
        return;
      }
      if ((this.mAboveVideoBottomView != null) && (this.mAboveVideoBottomView.giftView != null) && (this.mAboveVideoBottomView.giftView.isShowing()))
      {
        this.mAboveVideoBottomView.giftView.dismiss();
        return;
      }
    } while (this.mAboveVideoContainView == null);
    onCloseVideo(false);
  }
  
  public void onCloseVideo(boolean paramBoolean)
  {
    Log.d("ilvb", "AvGuestActivity onCloseVideo");
    if (this.mAboveVideoContainView != null) {
      this.mAboveVideoContainView.cancel();
    }
    if (this.mAboveVideoNotSwipeView != null) {
      this.mAboveVideoNotSwipeView.cancel();
    }
    if ((!this.mEnterSoundMode) && (this.mAVRoomControl.getmRoomState() != AVRoomControl.RoomState.ROOM_EXIT_OK)) {
      this.mAVRoomControl.exitRoom();
    }
    if ((paramBoolean) && (this.mGameOverView != null)) {
      this.mGameOverView.show(false);
    }
    for (;;)
    {
      if (!paramBoolean) {
        finish();
      }
      return;
      if (this.messageControl != null)
      {
        this.messageControl.destroy();
        this.messageControl = null;
      }
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    updateView(paramConfiguration);
    if (paramConfiguration.orientation == 1)
    {
      this.mAVUIControl.setIsLand(false);
      Log.d("ilvb", "AvGuestActivity onConfigurationChanged newConfig = 竖屏");
    }
    for (;;)
    {
      this.mMyUserInfoDialogView.dismiss();
      return;
      this.mAVUIControl.setIsLand(true);
      Log.d("ilvb", "AvGuestActivity onConfigurationChanged newConfig = 横屏");
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    Log.d("ilvb", "AvGuestActivity onCreate start");
    super.onCreate(paramBundle);
    this.mContext = this;
    setContentView(2130903173);
    this.mAVRoomControl = AVRoomControl.getInstance().init(this, this.mHandler);
    registerBroadcastReceiver();
    this.mNetWorkType = Util.getNetWorkType(this.mContext);
    if ((!com.android.dazhihui.a.g.a().c) && (this.mNetWorkType != 2))
    {
      com.android.dazhihui.a.g.a().c = true;
      paramBundle = new AlertDialog.Builder(this.mContext);
      paramBundle.setTitle("提示");
      paramBundle.setCancelable(false);
      paramBundle.setMessage("您正在使用手机网络,是否继续观看");
      paramBundle.setNegativeButton("继续观看", null);
      paramBundle.setNeutralButton("退出", new AvGuestActivity.4(this));
      paramBundle.show();
    }
    this.mQavsdkControl = QavsdkControl.getInstance();
    if ((getIntent() != null) && (getIntent().getExtras() != null)) {
      this.mFromSoundMode = getIntent().getExtras().getBoolean("from_only_sound", false);
    }
    if (UserilvbManager.getInstance().getSavedRoomInfo() != null) {
      UserilvbManager.getInstance().clearIlvbOnlySound();
    }
    this.mSelfUserInfo = UserInfo.getInstance();
    this.mSelfUserInfo.setIsCreater(Boolean.valueOf(false));
    this.mAVRoomControl.setAudioCat(2);
    if ((getIntent() == null) || (getIntent().getExtras() == null))
    {
      finish();
      Log.e("ilvb", "AvGuestActivity onCreate finish by getIntent==null");
      return;
    }
    this.mRequestSrc = getIntent().getExtras().getString("requestSrc", "");
    this.mRoomID = getIntent().getExtras().getInt("roomnum");
    mHostIdentifier = getIntent().getExtras().getString("selfIdentifier");
    this.mGroupId = getIntent().getExtras().getString("groupid");
    this.mRoomImage = getIntent().getExtras().getString("roomimage");
    this.mRoomShareUrl = getIntent().getExtras().getString("roomshareurl");
    this.mRoomPV = getIntent().getExtras().getInt("roompv");
    this.mGameOverView = ((GameOverView)findViewById(2131559315));
    this.mGameOverView.setActivityHandler(this.mHandler);
    if ("2".equals(getIntent().getExtras().getString("room_status", "1")))
    {
      this.mHandler.sendEmptyMessage(306);
      return;
    }
    n.d("ilvb", "AvGuestActivity onCreate mHostIdentifier=" + mHostIdentifier + " mGroupId=" + this.mGroupId + " mRoomID=" + this.mRoomID);
    paramBundle = (ExtendOpenGLView)findViewById(2131559398);
    this.mRequestIdentifierList = new String[1];
    this.mRequestViewList = new AVView[1];
    this.mAboveVideoContainView = ((AboveVideoContainView)findViewById(2131559313));
    this.mAboveVideoContainView.setActivityHandler(this.mHandler);
    this.mAboveVideoTopView = this.mAboveVideoContainView.getAboveVideoTopView();
    this.mAboveVideoBottomView = this.mAboveVideoContainView.getAboveVideoBottomView();
    this.mAboveVideoBottomView.setmActivity(this);
    this.mMyUserInfoDialogView = this.mAboveVideoContainView.getMyUserInfoDialogView();
    this.mAboveVideoNotSwipeView = ((AboveVideoNotSwipeView)findViewById(2131559314));
    this.mAboveVideoNotSwipeView.setActivityHandler(this.mHandler);
    this.mAboveVideoContainView.setAboveVideoNotSwipeView(this.mAboveVideoNotSwipeView);
    this.mSwipeBackLayout = ((SwipeBackLayout)findViewById(2131559312));
    this.mSwipeBackLayout.setEnableGesture(true);
    this.mSwipeBackLayout.setContentView(this.mAboveVideoContainView);
    this.mSwipeBackLayout.setActivityHandler(this.mHandler);
    this.mAVUIControl = new AVGuestUIControl(getApplicationContext(), findViewById(2131559307), this.mHandler);
    this.mGameOverView.updateInfo(this.mRoomShareUrl, this.mRoomPV);
    this.mMyUserInfoDialogView.setRoomId(this.mRoomID);
    this.mMyUserInfoDialogView.sethostIdentifier(mHostIdentifier);
    this.mKeepScreenWakeLock = ((PowerManager)getSystemService("power")).newWakeLock(10, "AvGuestActivity");
    GiftManager.getConfig(null);
    UserilvbManager.getInstance().isNoSpeak = false;
    UserilvbManager.getInstance().addOnAccountChangeListener(this.mOnAccountChangeListener);
    this.mLastTime = System.currentTimeMillis();
    this.mSubThread = new HandlerThread("ilvb_sub_thread");
    this.mSubThread.start();
    this.mSubThreadHandler = new AvGuestActivity.5(this, this.mSubThread.getLooper());
    this.mHandler.sendEmptyMessage(320);
    if (!com.g.a.b.g.a().b())
    {
      paramBundle = new j(DzhApplication.a().getApplicationContext()).a(3).a().a(new c()).a(h.b).b();
      com.g.a.b.g.a().a(paramBundle);
    }
    b.a().b(this);
    Log.d("ilvb", "AvGuestActivity onCreate End");
  }
  
  protected void onDestroy()
  {
    mAllListData = null;
    sArrayAdapterIndex = -1;
    if (this.mSubThread != null) {
      this.mSubThread.quit();
    }
    if ((this.mKeepScreenWakeLock != null) && (this.mKeepScreenWakeLock.isHeld())) {
      this.mKeepScreenWakeLock.release();
    }
    UserilvbManager.getInstance().removeOnAccountChangeListener(this.mOnAccountChangeListener);
    if ((this.mAVRoomControl != null) && (this.mAVRoomControl.getmRoomState() != AVRoomControl.RoomState.ROOM_EXIT_OK)) {
      onCloseVideo(false);
    }
    this.mHandler.removeMessages(278);
    if (this.mAVUIControl != null)
    {
      this.mAVUIControl.onDestroy();
      this.mAVUIControl = null;
    }
    if (this.mBroadcastReceiver != null) {
      unregisterReceiver(this.mBroadcastReceiver);
    }
    if (this.mAVRoomControl != null) {
      this.mAVRoomControl.destroy();
    }
    super.onDestroy();
    Log.d("ilvb", "AvGuestActivity onDestroy");
  }
  
  protected void onFinish()
  {
    Log.d("ilvb", "AvGuestActivity onFinish");
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
      Log.d("ilvb", "AvGuestActivity onNewIntent mRoomID=" + i + " mHostIdentifier=" + str1 + " mGroupId=" + str2 + " mRoomImage=" + str3 + " mRoomShareUrl=" + str4 + " mRoomPV=" + j);
    }
    Log.d("ilvb", "AvGuestActivity onNewIntent End");
  }
  
  protected void onPause()
  {
    super.onPause();
    if (this.mAVUIControl != null) {
      this.mAVUIControl.onPause();
    }
    this.mHandler.removeMessages(278);
    Log.d("ilvb", "AvGuestActivity onPause");
  }
  
  protected void onPostCreate(Bundle paramBundle)
  {
    super.onPostCreate(paramBundle);
  }
  
  protected void onRestoreInstanceState(Bundle paramBundle)
  {
    super.onRestoreInstanceState(paramBundle);
    Log.d("ilvb", "AvGuestActivity onRestoreInstanceState");
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
    Log.d("ilvb", "AvGuestActivity onResume");
    if (this.mEnterSoundMode) {
      this.mEnterSoundMode = false;
    }
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    paramBundle.putInt("roomnum", this.mRoomID);
    paramBundle.putString("selfIdentifier", mHostIdentifier);
    paramBundle.putString("roomimage", this.mRoomImage);
    paramBundle.putString("groupid", this.mGroupId);
    paramBundle.putString("roomshareurl", this.mRoomShareUrl);
    paramBundle.putInt("roompv", this.mRoomPV);
    Log.d("ilvb", "AvGuestActivity onSaveInstanceState");
  }
  
  protected void onStart()
  {
    super.onStart();
  }
  
  protected void onStop()
  {
    super.onStop();
    Log.d("ilvb", "AvGuestActivity onStop");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\activity\AvGuestActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */