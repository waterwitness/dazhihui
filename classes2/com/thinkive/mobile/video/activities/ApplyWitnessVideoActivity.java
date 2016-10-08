package com.thinkive.mobile.video.activities;

import ak;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.TextView;
import ao;
import com.android.thinkive.framework.ThinkiveInitializer;
import com.android.thinkive.framework.util.ResourceUtil;
import com.bairuitech.anychat.AnyChatBaseEvent;
import com.bairuitech.anychat.AnyChatCoreSDK;
import com.bairuitech.anychat.AnyChatSensorHelper;
import com.bairuitech.demo.ConfigEntity;
import com.bairuitech.demo.ConfigService;
import com.thinkive.android.ui.OpenAcBaseActivity;
import com.thinkive.android.widget.OpenPhotoView;
import com.thinkive.mobile.account.entity.IntentTransformer;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

public class ApplyWitnessVideoActivity
  extends OpenAcBaseActivity
  implements AnyChatBaseEvent
{
  private static String b = "您当前排在第%s位";
  private AnyChatCoreSDK c;
  private PowerManager.WakeLock d;
  private TextView e;
  private TextView f;
  private TextView g;
  private OpenPhotoView h;
  private int i = 0;
  private Timer j = new Timer(true);
  private TimerTask k;
  private String l;
  private Handler m = new ApplyWitnessVideoActivity.1(this);
  
  private void f()
  {
    if (this.j != null) {}
    try
    {
      this.k.cancel();
      this.j.cancel();
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public void OnAnyChatConnectMessage(boolean paramBoolean)
  {
    if (paramBoolean) {
      Log.e("asos", "连接成功");
    }
  }
  
  public void OnAnyChatEnterRoomMessage(int paramInt1, int paramInt2)
  {
    paramInt1 = 0;
    Log.e("asos", "已进入房间");
    AnyChatCoreSDK.SetSDKOptionInt(1, 0);
    Log.e("asos", "已进入房间");
    int[] arrayOfInt = this.c.GetOnlineUser();
    for (;;)
    {
      if (paramInt1 >= arrayOfInt.length)
      {
        ThinkiveInitializer.getInstance().getHandler().postDelayed(new ApplyWitnessVideoActivity.5(this), 2333L);
        return;
      }
      this.i = arrayOfInt[paramInt1];
      paramInt1 += 1;
    }
  }
  
  public void OnAnyChatLinkCloseMessage(int paramInt) {}
  
  public void OnAnyChatLoginMessage(int paramInt1, int paramInt2)
  {
    Log.e("asos", "登录成功");
  }
  
  public void OnAnyChatOnlineUserMessage(int paramInt1, int paramInt2) {}
  
  public void OnAnyChatUserAtRoomMessage(int paramInt, boolean paramBoolean) {}
  
  public final void d()
  {
    Log.e("asos", "发送见证请求");
    HashMap localHashMap = this.a.createParameterMap();
    localHashMap.put("user_id", this.a.getUserId());
    localHashMap.put("user_name", this.a.getUserName());
    localHashMap.put("branch_id", this.a.getOrgId());
    localHashMap.put("level", "0");
    localHashMap.put("origin", "1");
    localHashMap.put("biz_type", "1");
    startTask(new ak(localHashMap, new ApplyWitnessVideoActivity.4(this)));
  }
  
  public final void e()
  {
    Log.e("asos", "取消排队");
    HashMap localHashMap = this.a.createParameterMap();
    localHashMap.put("user_id", this.a.getUserId());
    localHashMap.put("branch_id", this.a.getOrgId());
    localHashMap.put("biz_type", "1");
    startTask(new ao(localHashMap, new ApplyWitnessVideoActivity.6(this)));
  }
  
  protected void findViews()
  {
    this.e = ((TextView)findViewById(ResourceUtil.getResourceID(this, "id", "fxc_kh_two_way_hold_down")));
    this.f = ((TextView)findViewById(ResourceUtil.getResourceID(this, "id", "fxc_kh_two_way_video_notice")));
    this.h = ((OpenPhotoView)findViewById(ResourceUtil.getResourceID(this, "id", "fxc_kh_apply_surface")));
    this.g = ((TextView)findViewById(ResourceUtil.getResourceID(this, "id", "fxc_kh_apply_cs_name")));
  }
  
  public void finish()
  {
    super.finish();
    f();
  }
  
  protected void initData()
  {
    super.initData();
    this.d = ((PowerManager)getSystemService("power")).newWakeLock(536870922, "SingleWayVideoActivity");
    this.c = new AnyChatCoreSDK();
    this.c.SetBaseEvent(this);
    this.c.mSensorHelper.InitSensor(this);
    if (ConfigService.LoadConfig(this).useARMv6Lib != 0) {
      AnyChatCoreSDK.SetSDKOptionInt(17, 1);
    }
    this.c.InitSDK(Build.VERSION.SDK_INT, 0);
    AnyChatCoreSDK.SetSDKOptionInt(1, 0);
    ConfigEntity localConfigEntity = ConfigService.LoadConfig(this);
    if (localConfigEntity.configMode == 1)
    {
      AnyChatCoreSDK.SetSDKOptionInt(30, localConfigEntity.videoBitrate);
      AnyChatCoreSDK.SetSDKOptionInt(31, localConfigEntity.videoQuality);
      AnyChatCoreSDK.SetSDKOptionInt(33, localConfigEntity.videoFps);
      AnyChatCoreSDK.SetSDKOptionInt(32, localConfigEntity.videoFps * 4);
      AnyChatCoreSDK.SetSDKOptionInt(38, localConfigEntity.resolution_width);
      AnyChatCoreSDK.SetSDKOptionInt(39, localConfigEntity.resolution_height);
      AnyChatCoreSDK.SetSDKOptionInt(34, localConfigEntity.videoPreset);
    }
    AnyChatCoreSDK.SetSDKOptionInt(40, localConfigEntity.enableP2P);
    AnyChatCoreSDK.SetSDKOptionInt(92, localConfigEntity.videoOverlay);
    AnyChatCoreSDK.SetSDKOptionInt(3, localConfigEntity.enableAEC);
    AnyChatCoreSDK.SetSDKOptionInt(18, localConfigEntity.useHWCodec);
    AnyChatCoreSDK.SetSDKOptionInt(94, localConfigEntity.videorotatemode);
    AnyChatCoreSDK.SetSDKOptionInt(95, localConfigEntity.videoCapDriver);
    AnyChatCoreSDK.SetSDKOptionInt(96, localConfigEntity.fixcolordeviation);
    AnyChatCoreSDK.SetSDKOptionInt(83, localConfigEntity.videoShowDriver);
    AnyChatCoreSDK.SetSDKOptionInt(70, localConfigEntity.audioPlayDriver);
    AnyChatCoreSDK.SetSDKOptionInt(74, localConfigEntity.audioRecordDriver);
    AnyChatCoreSDK.SetSDKOptionInt(84, localConfigEntity.videoShowGPURender);
    AnyChatCoreSDK.SetSDKOptionInt(98, localConfigEntity.videoAutoRotation);
    AnyChatCoreSDK.SetSDKOptionInt(35, localConfigEntity.configMode);
    this.k = new ApplyWitnessVideoActivity.3(this);
  }
  
  protected void initViews()
  {
    this.h.setCamera_Orientation(OpenPhotoView.a);
    this.f.setText("坐席可能不在线上，建议稍后尝试");
    if (!TextUtils.isEmpty(this.a.getSecuritiesName())) {
      this.g.setText(this.a.getSecuritiesName());
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    setContentView(ResourceUtil.getResourceID(this, "layout", "fxc_kh_activity_apply_witness_video"));
    super.onCreate(paramBundle);
    this.j.schedule(this.k, 100L, 4000L);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      e();
      finish();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onRestart()
  {
    super.onRestart();
    this.h.b();
  }
  
  protected void onStart()
  {
    super.onStart();
    this.d.acquire();
  }
  
  protected void onStop()
  {
    super.onStop();
    this.h.a();
    if (this.d != null) {
      this.d.release();
    }
  }
  
  protected void setListeners()
  {
    this.e.setOnClickListener(new ApplyWitnessVideoActivity.2(this));
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\thinkive\mobile\video\activities\ApplyWitnessVideoActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */