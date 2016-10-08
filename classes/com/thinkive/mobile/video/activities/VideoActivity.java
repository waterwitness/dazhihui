package com.thinkive.mobile.video.activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import ax;
import az;
import com.android.thinkive.framework.compatible.Parameter;
import com.android.thinkive.framework.config.ConfigManager;
import com.android.thinkive.framework.util.ResourceUtil;
import com.bairuitech.anychat.AnyChatBaseEvent;
import com.bairuitech.anychat.AnyChatCameraHelper;
import com.bairuitech.anychat.AnyChatCoreSDK;
import com.bairuitech.anychat.AnyChatSensorHelper;
import com.bairuitech.anychat.AnyChatTextMsgEvent;
import com.bairuitech.anychat.AnyChatTransDataEvent;
import com.bairuitech.anychat.AnyChatVideoHelper;
import com.bairuitech.demo.ConfigEntity;
import com.bairuitech.demo.ConfigService;
import com.thinkive.android.ui.OpenAcBaseActivity;
import java.io.UnsupportedEncodingException;
import java.util.Timer;
import java.util.TimerTask;

public class VideoActivity
  extends OpenAcBaseActivity
  implements View.OnClickListener, AnyChatBaseEvent, AnyChatTextMsgEvent, AnyChatTransDataEvent
{
  private float A;
  private TextView B;
  private TextView C;
  private TimerTask D;
  private String E;
  private TextView F;
  private TextView G;
  private String H;
  private String I;
  private String J;
  public AnyChatCoreSDK b;
  private boolean c = false;
  private boolean d = false;
  private boolean e = false;
  private int f;
  private String g;
  private String h;
  private SurfaceView i;
  private SurfaceView j;
  private TextView k;
  private Button l;
  private boolean m = false;
  private boolean n = false;
  private Timer o = new Timer(true);
  private Timer p = new Timer(true);
  private TimerTask q;
  private Handler r;
  private Runnable s;
  private TimerTask t;
  private int u = 31;
  private String v = "";
  private boolean w;
  private String x;
  private PowerManager.WakeLock y = null;
  private float z;
  
  private void a(String paramString1, String paramString2)
  {
    Intent localIntent = new Intent("com.thinkive.mobile.video");
    localIntent.putExtra("data", paramString1);
    localIntent.putExtra("message", paramString2);
    sendBroadcast(localIntent);
  }
  
  private void d()
  {
    Object localObject = Build.MODEL;
    String str = Build.MANUFACTURER;
    if (this.h != null)
    {
      localObject = "SYS:10010|" + str + " " + (String)localObject + "|" + this.h;
      this.b.TransBuffer(-1, ((String)localObject).getBytes(), ((String)localObject).getBytes().length);
    }
    this.j = ((SurfaceView)findViewById(ResourceUtil.getResourceID(this, "id", "sv_local")));
    this.i = ((SurfaceView)findViewById(ResourceUtil.getResourceID(this, "id", "sv_remote")));
    if (AnyChatCoreSDK.GetSDKOptionInt(95) == 3) {
      this.j.getHolder().addCallback(AnyChatCoreSDK.mCameraHelper);
    }
    int i1;
    if (AnyChatCoreSDK.GetSDKOptionInt(83) == 5)
    {
      i1 = this.b.mVideoHelper.bindVideo(this.i.getHolder());
      this.b.mVideoHelper.SetVideoUser(i1, this.f);
    }
    this.i.getHolder().setKeepScreenOn(true);
    this.b.UserCameraControl(this.f, 1);
    this.b.UserSpeakControl(this.f, 1);
    this.j.setOnClickListener(this);
    if (ConfigService.LoadConfig(this).videoOverlay != 0) {
      this.j.getHolder().setType(3);
    }
    if (AnyChatCoreSDK.GetSDKOptionInt(95) == 3) {
      if (AnyChatCoreSDK.mCameraHelper.GetCameraNumber() > 1)
      {
        localObject = AnyChatCoreSDK.mCameraHelper;
        AnyChatCoreSDK.mCameraHelper.getClass();
        ((AnyChatCameraHelper)localObject).SelectVideoCapture(1);
      }
    }
    label375:
    for (;;)
    {
      this.b.UserCameraControl(-1, 1);
      this.b.UserSpeakControl(-1, 1);
      this.o.schedule(this.t, 1000L, 1000L);
      return;
      localObject = this.b.EnumVideoCapture();
      if ((localObject != null) && (localObject.length > 1))
      {
        i1 = 0;
        for (;;)
        {
          if (i1 >= localObject.length) {
            break label375;
          }
          str = localObject[i1];
          if (str.indexOf("Front") >= 0)
          {
            this.b.SelectVideoCapture(str);
            break;
          }
          i1 += 1;
        }
      }
    }
  }
  
  private void e()
  {
    this.b.UserCameraControl(this.f, 1);
    this.b.UserSpeakControl(this.f, 1);
    this.b.UserCameraControl(-1, 1);
    this.b.UserSpeakControl(-1, 1);
    this.n = false;
    this.m = false;
  }
  
  private void f()
  {
    try
    {
      this.o.cancel();
      this.b.LeaveRoom(-1);
      this.b.Logout();
      this.b.Release();
      finish();
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
      }
    }
  }
  
  public void OnAnyChatConnectMessage(boolean paramBoolean) {}
  
  public void OnAnyChatEnterRoomMessage(int paramInt1, int paramInt2) {}
  
  public void OnAnyChatLinkCloseMessage(int paramInt)
  {
    if (!this.w)
    {
      Toast.makeText(this, "网络连接异常", 1).show();
      this.w = true;
    }
    if (this.n)
    {
      this.b.UserCameraControl(this.f, 0);
      this.b.UserSpeakControl(this.f, 0);
      this.n = false;
    }
    if (this.m)
    {
      this.b.UserCameraControl(-1, 0);
      this.b.UserSpeakControl(-1, 0);
      this.m = false;
    }
  }
  
  public void OnAnyChatLoginMessage(int paramInt1, int paramInt2) {}
  
  public void OnAnyChatOnlineUserMessage(int paramInt1, int paramInt2)
  {
    e();
  }
  
  public void OnAnyChatSDKFilterData(byte[] paramArrayOfByte, int paramInt) {}
  
  public void OnAnyChatTextMessage(int paramInt1, int paramInt2, boolean paramBoolean, String paramString)
  {
    if (paramString.startsWith(ConfigManager.getInstance(this).getSystemConfigValue("TEXT_MSG")))
    {
      paramString = paramString.replace(ConfigManager.getInstance(this).getSystemConfigValue("TEXT_MSG"), "");
      this.k.setText(paramString);
      if (!this.e)
      {
        this.r.postDelayed(this.s, 5000L);
        this.e = true;
      }
    }
  }
  
  public void OnAnyChatTransBuffer(int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    if ((!TextUtils.isEmpty(this.J)) && (this.J.equals("lianxun"))) {}
    for (;;)
    {
      try
      {
        paramArrayOfByte = new String(paramArrayOfByte, "gbk");
        Log.e("asos", "收到聊天消息：" + paramArrayOfByte);
        if (!paramArrayOfByte.equals(ConfigManager.getInstance(this).getSystemConfigValue("CHECK_SUCCESS"))) {
          break label134;
        }
        Toast.makeText(this, "见证成功", 1).show();
        a(ConfigManager.getInstance(this).getSystemConfigValue("CHECK_SUCCESS"), paramArrayOfByte);
        this.d = true;
        f();
        return;
      }
      catch (UnsupportedEncodingException paramArrayOfByte)
      {
        paramArrayOfByte.printStackTrace();
        paramArrayOfByte = null;
        continue;
      }
      paramArrayOfByte = new String(paramArrayOfByte);
      continue;
      label134:
      if (paramArrayOfByte.equals(ConfigManager.getInstance(this).getSystemConfigValue("CHECK_FAILED")))
      {
        Toast.makeText(this, "见证失败", 1).show();
        a(ConfigManager.getInstance(this).getSystemConfigValue("CHECK_FAILED"), paramArrayOfByte);
        this.b.TransBuffer(-1, ConfigManager.getInstance(this).getSystemConfigValue("CHECK_FAILED").getBytes(), ConfigManager.getInstance(this).getSystemConfigValue("CHECK_FAILED").getBytes().length);
      }
      else if (paramArrayOfByte.equals(ConfigManager.getInstance(this).getSystemConfigValue("SEAT_LEAVE_ROOM")))
      {
        Toast.makeText(this, "坐席已离开房间，请重新申请见证", 1).show();
      }
      else
      {
        if (paramArrayOfByte.equals(Boolean.valueOf(paramArrayOfByte.equals(ConfigManager.getInstance(this).getSystemConfigValue("SEAT_REFRESH_IE")))))
        {
          Toast.makeText(this, "坐席正在刷新界面，请稍后...", 1).show();
          return;
        }
        if (paramArrayOfByte.equals(ConfigManager.getInstance(this).getSystemConfigValue("SEAT_FORCE_QUIT")))
        {
          Toast.makeText(this, "坐席退出房间", 1).show();
          this.b.SendTextMessage(-1, 0, ConfigManager.getInstance(this).getSystemConfigValue("USER_CONFIRM_QUIT"));
          this.d = true;
          finish();
          return;
        }
        if (paramArrayOfByte.equals(ConfigManager.getInstance(this).getSystemConfigValue("CHECK_REJECT")))
        {
          Toast.makeText(this, "资料异常或不完整,请重新填写资料", 1).show();
          a(ConfigManager.getInstance(this).getSystemConfigValue("CHECK_REJECT"), paramArrayOfByte);
          this.b.TransBuffer(-1, ConfigManager.getInstance(this).getSystemConfigValue("CHECK_REJECT").getBytes(), ConfigManager.getInstance(this).getSystemConfigValue("CHECK_REJECT").getBytes().length);
        }
        else if (paramArrayOfByte.equals(ConfigManager.getInstance(this).getSystemConfigValue("NETWORK_PROBLEM")))
        {
          Toast.makeText(this, "网络异常，请您选择较好的网络进行视频见证", 1).show();
          this.b.TransBuffer(-1, ConfigManager.getInstance(this).getSystemConfigValue("NETWORK_PROBLEM").getBytes(), ConfigManager.getInstance(this).getSystemConfigValue("NETWORK_PROBLEM").getBytes().length);
        }
        else if (paramArrayOfByte.equals(ConfigManager.getInstance(this).getSystemConfigValue("VIDEO_PROBLEM")))
        {
          Toast.makeText(this, "视频录制异常,坐席视频录制出现异常,请稍后再试", 1).show();
          this.b.TransBuffer(-1, ConfigManager.getInstance(this).getSystemConfigValue("VIDEO_PROBLEM").getBytes(), ConfigManager.getInstance(this).getSystemConfigValue("VIDEO_PROBLEM").getBytes().length);
        }
        else if (paramArrayOfByte.equals(ConfigManager.getInstance(this).getSystemConfigValue("SYS10010")))
        {
          Toast.makeText(this, "由于缺少摄像头或麦克风等设备,无法进行视频见证,请更换或者安装设备后再进行开户申请", 1).show();
          this.b.TransBuffer(-1, ConfigManager.getInstance(this).getSystemConfigValue("SYS10010").getBytes(), ConfigManager.getInstance(this).getSystemConfigValue("SYS10010").getBytes().length);
        }
        else
        {
          a(ConfigManager.getInstance(this).getSystemConfigValue("CHECK_REJECT"), paramArrayOfByte);
          paramArrayOfByte = paramArrayOfByte.split(":");
          if ((paramArrayOfByte != null) && (paramArrayOfByte.length > 2))
          {
            paramArrayOfByte = paramArrayOfByte[0] + ":" + paramArrayOfByte[1];
            this.b.TransBuffer(-1, paramArrayOfByte.getBytes(), paramArrayOfByte.getBytes().length);
          }
        }
      }
    }
  }
  
  public void OnAnyChatTransBufferEx(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {}
  
  public void OnAnyChatTransFile(int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {}
  
  public void OnAnyChatUserAtRoomMessage(int paramInt, boolean paramBoolean)
  {
    this.f = paramInt;
    if (!paramBoolean)
    {
      this.b.UserCameraControl(paramInt, 0);
      this.b.UserSpeakControl(paramInt, 0);
      this.n = false;
      Toast.makeText(this, "座席端网络连接异常", 1).show();
      f();
      return;
    }
    this.f = paramInt;
    this.b.UserCameraControl(paramInt, 1);
    this.b.UserSpeakControl(paramInt, 1);
    if (AnyChatCoreSDK.GetSDKOptionInt(83) == 5)
    {
      paramInt = this.b.mVideoHelper.bindVideo(this.i.getHolder());
      this.b.mVideoHelper.SetVideoUser(paramInt, this.f);
    }
    e();
  }
  
  protected final String a()
  {
    return getIntent().getStringExtra("url");
  }
  
  protected void findViews() {}
  
  protected void initData() {}
  
  protected void initViews() {}
  
  public void onClick(View paramView)
  {
    if (paramView.getId() == ResourceUtil.getResourceID(this, "id", "btn_leave"))
    {
      paramView = ConfigManager.getInstance(this).getSystemConfigValue("USER_LEAVE_ROOM");
      this.b.TransBuffer(-1, paramView.getBytes(), paramView.getBytes().length);
      paramView = new Parameter();
      paramView.addParameter("user_id", String.valueOf(this.g));
      paramView.addParameter("url", this.H);
      paramView.addParameter("jsessionid", this.I);
      startTask(new ax(this, paramView));
      f();
    }
  }
  
  @SuppressLint({"HandlerLeak"})
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(ResourceUtil.getResourceID(this, "layout", "fxc_kh_video_chat"));
    this.y = ((PowerManager)getSystemService("power")).newWakeLock(536870922, "VideoActivity");
    getWindow().setFlags(128, 128);
    this.f = getIntent().getIntExtra("user_id", 0);
    this.g = getIntent().getStringExtra("mUserId");
    this.E = getIntent().getStringExtra("custId");
    this.J = getIntent().getStringExtra("securitiesName");
    this.x = getIntent().getStringExtra("isShowOccupationNumber");
    this.h = getIntent().getStringExtra("netWorkStatus");
    this.H = getIntent().getStringExtra("url");
    this.I = getIntent().getStringExtra("jsessionid");
    this.k = ((TextView)findViewById(ResourceUtil.getResourceID(this, "id", "tv_text_msg")));
    this.l = ((Button)findViewById(ResourceUtil.getResourceID(this, "id", "btn_leave")));
    this.G = ((TextView)findViewById(ResourceUtil.getResourceID(this, "id", "tv_custId")));
    this.G.setText("客服号：" + this.E);
    this.F = ((TextView)findViewById(ResourceUtil.getResourceID(this, "id", "tv_occupationNumber")));
    this.l.setOnClickListener(this);
    this.r = new VideoActivity.1(this);
    this.s = new VideoActivity.2(this);
    this.t = new VideoActivity.3(this);
    if (this.b == null) {
      this.b = new AnyChatCoreSDK();
    }
    this.b.SetBaseEvent(this);
    this.b.mSensorHelper.InitSensor(this);
    this.b.SetTextMessageEvent(this);
    this.b.SetTransDataEvent(this);
    d();
    if (this.x.equals("true"))
    {
      paramBundle = new Parameter();
      paramBundle.addParameter("jsessionid", this.I);
      paramBundle.addParameter("uid2", this.E);
      paramBundle.addParameter("url", this.H);
      startTask(new az(paramBundle, new VideoActivity.6(this)));
    }
    this.q = new VideoActivity.4(this);
    this.o.schedule(this.q, 1000L, 1000L);
    this.D = new VideoActivity.5(this);
    this.p.schedule(this.D, 0L, 800L);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      Object localObject = ConfigManager.getInstance(this).getSystemConfigValue("USER_LEAVE_ROOM");
      this.b.TransBuffer(-1, ((String)localObject).getBytes(), ((String)localObject).getBytes().length);
      localObject = new Parameter();
      ((Parameter)localObject).addParameter("user_id", String.valueOf(this.g));
      ((Parameter)localObject).addParameter("url", this.H);
      ((Parameter)localObject).addParameter("jsessionid", this.I);
      startTask(new ax(this, (Parameter)localObject));
      f();
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPause()
  {
    super.onPause();
    this.c = true;
    if (!this.d)
    {
      this.b.UserCameraControl(this.f, 0);
      this.b.UserSpeakControl(this.f, 0);
      this.b.UserCameraControl(-1, 0);
      this.b.UserSpeakControl(-1, 0);
    }
    if (this.y != null) {
      this.y.release();
    }
  }
  
  protected void onRestart()
  {
    super.onRestart();
  }
  
  protected void onResume()
  {
    super.onResume();
    if (AnyChatCoreSDK.GetSDKOptionInt(83) == 5)
    {
      int i1 = this.b.mVideoHelper.bindVideo(this.i.getHolder());
      this.b.mVideoHelper.SetVideoUser(i1, this.f);
    }
    e();
    this.c = false;
    this.y.acquire();
  }
  
  protected void setListeners() {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\thinkive\mobile\video\activities\VideoActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */