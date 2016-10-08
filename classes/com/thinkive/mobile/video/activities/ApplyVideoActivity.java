package com.thinkive.mobile.video.activities;

import ai;
import al;
import android.annotation.SuppressLint;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.hardware.Camera;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import av;
import com.android.thinkive.framework.compatible.Parameter;
import com.android.thinkive.framework.util.ResourceUtil;
import com.bairuitech.anychat.AnyChatBaseEvent;
import com.bairuitech.anychat.AnyChatCoreSDK;
import com.bairuitech.anychat.AnyChatSensorHelper;
import com.bairuitech.demo.ConfigEntity;
import com.bairuitech.demo.ConfigService;
import com.thinkive.android.ui.OpenAcBaseActivity;
import java.util.Timer;
import java.util.TimerTask;

public class ApplyVideoActivity
  extends OpenAcBaseActivity
  implements SurfaceHolder.Callback, AnyChatBaseEvent
{
  private static ApplyVideoActivity N;
  private static String j;
  private static String k;
  private static String l;
  private boolean A = false;
  private boolean B = false;
  private TextView C;
  private Button D;
  private PowerManager.WakeLock E = null;
  private SurfaceView F;
  private Camera G;
  private SurfaceHolder H;
  private TextView I;
  private Dialog J;
  private String K = "";
  private String L;
  private String M;
  public boolean b;
  public boolean c;
  public boolean d;
  public boolean e;
  public TextView f;
  public TextView g;
  public View h;
  public String i = "0";
  private String m = "0";
  private int n = 0;
  private String o = "0";
  private String p = "";
  private String q;
  private Handler r;
  private Timer s = new Timer(true);
  private Timer t = new Timer(true);
  private TimerTask u;
  private TimerTask v;
  private TimerTask w;
  private AnyChatCoreSDK x;
  private boolean y = false;
  private boolean z = false;
  
  public static ApplyVideoActivity e()
  {
    if (N != null) {
      return N;
    }
    return null;
  }
  
  private void s()
  {
    Parameter localParameter = new Parameter();
    localParameter.addParameter("branch_no", String.valueOf(this.o));
    localParameter.addParameter("jsessionid", j);
    localParameter.addParameter("url", k);
    startTask(new av(this, localParameter));
  }
  
  private void t()
  {
    if (this.G != null)
    {
      this.G.stopPreview();
      this.G.release();
      this.G = null;
    }
  }
  
  public void OnAnyChatConnectMessage(boolean paramBoolean)
  {
    if (paramBoolean) {
      Log.i("video", "连接成功");
    }
  }
  
  public void OnAnyChatEnterRoomMessage(int paramInt1, int paramInt2)
  {
    paramInt1 = 0;
    Log.i("video", "已进入房间");
    AnyChatCoreSDK.SetSDKOptionInt(1, 0);
    Log.e("已进入房间11111111111", "111111111111已进入房间1111111111111");
    Object localObject = this.x.GetOnlineUser();
    for (;;)
    {
      if (paramInt1 >= localObject.length)
      {
        localObject = new Intent(this, VideoActivity.class);
        ((Intent)localObject).putExtra("user_id", this.n);
        ((Intent)localObject).putExtra("mUserId", this.m);
        ((Intent)localObject).putExtra("netWorkStatus", l);
        ((Intent)localObject).putExtra("custId", this.L);
        ((Intent)localObject).putExtra("url", k);
        ((Intent)localObject).putExtra("jsessionid", j);
        ((Intent)localObject).putExtra("isShowOccupationNumber", getIntent().getStringExtra("isShowOccupationNumber"));
        ((Intent)localObject).putExtra("securitiesName", this.M);
        startActivity((Intent)localObject);
        finish();
        Log.e("asos", "已进入房间 custId == " + this.L);
        return;
      }
      this.n = localObject[paramInt1];
      paramInt1 += 1;
    }
  }
  
  public void OnAnyChatLinkCloseMessage(int paramInt) {}
  
  public void OnAnyChatLoginMessage(int paramInt1, int paramInt2)
  {
    Log.i("video", "登录成功");
  }
  
  public void OnAnyChatOnlineUserMessage(int paramInt1, int paramInt2) {}
  
  public void OnAnyChatUserAtRoomMessage(int paramInt, boolean paramBoolean) {}
  
  protected final String a()
  {
    return getIntent().getStringExtra("url");
  }
  
  public final void a(String paramString)
  {
    String str = paramString;
    if (!TextUtils.isEmpty(this.M))
    {
      str = paramString;
      if (this.M.equals("dongfang"))
      {
        paramString = paramString.replaceAll("[A-Za-z]", "");
        str = paramString;
        if (paramString != null)
        {
          str = paramString;
          if (paramString.indexOf("-") >= 0) {
            str = paramString.split("[-]")[1];
          }
        }
      }
    }
    this.q = str;
  }
  
  public final void a(String paramString, int paramInt)
  {
    this.x.Logout();
    this.x.Connect(paramString, paramInt);
    if ((!TextUtils.isEmpty(this.M)) && (this.M.equals("dongfang")))
    {
      this.x.Login("semp" + this.m, "123456");
      paramString = this.q;
      if (!TextUtils.isEmpty(paramString)) {
        break label140;
      }
      Toast.makeText(this, "房间号为空", 0).show();
    }
    for (;;)
    {
      Log.e("connectServer", "connectServer");
      return;
      this.x.Login("user" + this.m, "123456");
      break;
      label140:
      this.x.UserCameraControl(-1, 1);
      this.x.UserSpeakControl(-1, 1);
      this.L = paramString.split("-")[0];
      if ((!TextUtils.isEmpty(this.M)) && (this.M.equals("dongfang"))) {
        this.x.EnterRoomEx("2" + paramString, "0");
      } else if ((!TextUtils.isEmpty(this.M)) && (this.M.equals("lianxun"))) {
        this.x.EnterRoom(Integer.parseInt(paramString), "0");
      } else {
        this.x.EnterRoomEx("tk" + paramString, "0");
      }
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    this.y = false;
  }
  
  public final void b(boolean paramBoolean)
  {
    this.z = paramBoolean;
  }
  
  public final TextView d()
  {
    return this.I;
  }
  
  public final void f()
  {
    Log.i("", "开始轮询");
    if (!this.y)
    {
      this.s = new Timer(true);
      this.u = new ApplyVideoActivity.3(this);
      this.s.schedule(this.u, 0L, 4000L);
      this.y = true;
    }
  }
  
  public final void g()
  {
    Log.i("", "查询排队");
    if (!this.A)
    {
      this.s = new Timer(true);
      this.v = new ApplyVideoActivity.4(this);
      this.s.schedule(this.v, 0L, 4000L);
      this.A = true;
    }
  }
  
  public final void h()
  {
    Parameter localParameter = new Parameter();
    localParameter.addParameter("user_id", String.valueOf(this.m));
    localParameter.addParameter("nick_name", this.p);
    localParameter.addParameter("org_id", String.valueOf(this.o));
    localParameter.addParameter("level", String.valueOf(1));
    localParameter.addParameter("origin", "android");
    localParameter.addParameter("user_type", this.K);
    localParameter.addParameter("jsessionid", j);
    localParameter.addParameter("url", k);
    Log.i("", "发送见证请求");
    startTask(new ai(this, localParameter));
  }
  
  public final Handler i()
  {
    return this.r;
  }
  
  public final Button j()
  {
    return this.D;
  }
  
  public final boolean k()
  {
    return this.A;
  }
  
  public final TextView l()
  {
    return this.C;
  }
  
  public final void m()
  {
    try
    {
      if (this.B)
      {
        this.t.cancel();
        this.w.cancel();
        this.B = false;
      }
      if (this.A)
      {
        this.s.cancel();
        this.v.cancel();
        this.A = false;
      }
      if (this.y)
      {
        this.s.cancel();
        this.u.cancel();
        this.y = false;
      }
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public final void n()
  {
    runOnUiThread(new ApplyVideoActivity.5(this));
  }
  
  public final void o()
  {
    this.g.setVisibility(8);
    this.h.setVisibility(8);
    this.f.setVisibility(8);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    N = this;
    setContentView(ResourceUtil.getResourceID(this, "layout", "fxc_kh_activity_apply_video"));
    this.E = ((PowerManager)getSystemService("power")).newWakeLock(536870922, "ApplyVideoActivity");
    this.x = new AnyChatCoreSDK();
    this.x.SetBaseEvent(this);
    this.x.mSensorHelper.InitSensor(this);
    if (ConfigService.LoadConfig(this).useARMv6Lib != 0) {
      AnyChatCoreSDK.SetSDKOptionInt(17, 1);
    }
    this.x.InitSDK(Build.VERSION.SDK_INT, 0);
    AnyChatCoreSDK.SetSDKOptionInt(1, 0);
    paramBundle = ConfigService.LoadConfig(this);
    if (paramBundle.configMode == 1)
    {
      AnyChatCoreSDK.SetSDKOptionInt(30, paramBundle.videoBitrate);
      AnyChatCoreSDK.SetSDKOptionInt(31, paramBundle.videoQuality);
      AnyChatCoreSDK.SetSDKOptionInt(33, paramBundle.videoFps);
      AnyChatCoreSDK.SetSDKOptionInt(32, paramBundle.videoFps * 4);
      AnyChatCoreSDK.SetSDKOptionInt(38, paramBundle.resolution_width);
      AnyChatCoreSDK.SetSDKOptionInt(39, paramBundle.resolution_height);
      AnyChatCoreSDK.SetSDKOptionInt(34, paramBundle.videoPreset);
    }
    AnyChatCoreSDK.SetSDKOptionInt(40, paramBundle.enableP2P);
    AnyChatCoreSDK.SetSDKOptionInt(92, paramBundle.videoOverlay);
    AnyChatCoreSDK.SetSDKOptionInt(3, paramBundle.enableAEC);
    AnyChatCoreSDK.SetSDKOptionInt(18, paramBundle.useHWCodec);
    AnyChatCoreSDK.SetSDKOptionInt(94, paramBundle.videorotatemode);
    AnyChatCoreSDK.SetSDKOptionInt(95, paramBundle.videoCapDriver);
    AnyChatCoreSDK.SetSDKOptionInt(96, paramBundle.fixcolordeviation);
    AnyChatCoreSDK.SetSDKOptionInt(83, paramBundle.videoShowDriver);
    AnyChatCoreSDK.SetSDKOptionInt(70, paramBundle.audioPlayDriver);
    AnyChatCoreSDK.SetSDKOptionInt(74, paramBundle.audioRecordDriver);
    AnyChatCoreSDK.SetSDKOptionInt(84, paramBundle.videoShowGPURender);
    AnyChatCoreSDK.SetSDKOptionInt(98, paramBundle.videoAutoRotation);
    AnyChatCoreSDK.SetSDKOptionInt(35, paramBundle.configMode);
    try
    {
      this.m = getIntent().getStringExtra("user_id");
    }
    catch (NumberFormatException paramBundle)
    {
      try
      {
        this.o = getIntent().getStringExtra("org_id");
      }
      catch (Exception paramBundle)
      {
        try
        {
          this.p = getIntent().getStringExtra("user_name");
          j = getIntent().getStringExtra("jsessionid");
          k = getIntent().getStringExtra("url");
          this.M = getIntent().getStringExtra("securitiesName");
          l = getIntent().getStringExtra("netWorkStatus");
        }
        catch (Exception paramBundle)
        {
          try
          {
            for (;;)
            {
              this.K = getIntent().getStringExtra("user_type");
              this.r = new ApplyVideoActivity.1(this);
              this.C = ((TextView)findViewById(ResourceUtil.getResourceID(this, "id", "tv_count")));
              this.D = ((Button)findViewById(ResourceUtil.getResourceID(this, "id", "btn_apply_video")));
              this.f = ((TextView)findViewById(ResourceUtil.getResourceID(this, "id", "tv_witnessing_hint")));
              this.g = ((TextView)findViewById(ResourceUtil.getResourceID(this, "id", "tv_witnessing_staff")));
              this.h = findViewById(ResourceUtil.getResourceID(this, "id", "ll_queue_hint"));
              this.I = ((TextView)findViewById(ResourceUtil.getResourceID(this, "id", "tv_alert")));
              this.F = ((SurfaceView)findViewById(ResourceUtil.getResourceID(this, "id", "sfv_view")));
              this.D.setOnClickListener(new ApplyVideoActivity.2(this));
              s();
              p();
              this.z = false;
              this.y = false;
              this.D.setBackgroundColor(Color.parseColor("#999999"));
              this.D.setText("正在申请视频见证...");
              this.D.setClickable(false);
              this.H = this.F.getHolder();
              this.H.addCallback(this);
              this.H.setType(3);
              this.H.setKeepScreenOn(true);
              return;
              paramBundle = paramBundle;
              this.m = "0";
              continue;
              paramBundle = paramBundle;
              this.o = "0";
            }
            paramBundle = paramBundle;
            this.p = "";
          }
          catch (Exception paramBundle)
          {
            for (;;)
            {
              this.K = "";
            }
          }
        }
      }
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    t();
    m();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      q();
      finish();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPause()
  {
    super.onPause();
    if (this.E != null) {
      this.E.release();
    }
    t();
  }
  
  protected void onRestart()
  {
    super.onRestart();
  }
  
  protected void onResume()
  {
    super.onResume();
    this.E.acquire();
  }
  
  public final void p()
  {
    if (!this.B)
    {
      this.w = new ApplyVideoActivity.6(this);
      this.t = new Timer(true);
      this.t.schedule(this.w, 0L, 4000L);
      this.B = true;
    }
  }
  
  public final void q()
  {
    Log.e("anyChat", "取消排队");
    Parameter localParameter = new Parameter();
    localParameter.addParameter("user_id", String.valueOf(this.m));
    localParameter.addParameter("org_id", String.valueOf(this.o));
    localParameter.addParameter("jsessionid", j);
    localParameter.addParameter("url", k);
    startTask(new al(this, localParameter));
  }
  
  public final void r()
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
    localBuilder.setTitle("提示");
    localBuilder.setMessage("因为客户端长时间没有操作，您需要重新登陆！");
    localBuilder.setPositiveButton("确定", new ApplyVideoActivity.8(this));
    this.J = localBuilder.create();
    this.J.show();
  }
  
  public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3) {}
  
  @SuppressLint({"NewApi"})
  public void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    this.r.post(new ApplyVideoActivity.7(this));
  }
  
  public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\thinkive\mobile\video\activities\ApplyVideoActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */