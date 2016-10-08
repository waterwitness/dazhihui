package com.thinkive.mobile.video.activities;

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
import android.widget.TextView;
import android.widget.Toast;
import ao;
import com.android.thinkive.framework.ThinkiveInitializer;
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
import com.thinkive.mobile.account.entity.IntentTransformer;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

public class TwoWayVideoActivity
  extends OpenAcBaseActivity
  implements View.OnClickListener, AnyChatBaseEvent, AnyChatTextMsgEvent, AnyChatTransDataEvent
{
  public AnyChatCoreSDK b;
  private SurfaceView c;
  private SurfaceView d;
  private TextView e;
  private TextView f;
  private TextView g;
  private TextView h;
  private TextView i;
  private boolean j = false;
  private boolean k = false;
  private boolean l = false;
  private boolean m = false;
  private boolean n = false;
  private Timer o = new Timer(true);
  private Timer p = new Timer(true);
  private TimerTask q;
  private TimerTask r;
  private Runnable s;
  private TimerTask t;
  private int u = 31;
  private String v = "";
  private PowerManager.WakeLock w;
  private float x;
  private float y;
  private Handler z = new TwoWayVideoActivity.1(this);
  
  private void a(String paramString)
  {
    Log.e("asos", "退出房间");
    HashMap localHashMap = this.a.createParameterMap();
    localHashMap.put("user_id", this.a.getUserId());
    localHashMap.put("branch_id", this.a.getOrgId());
    localHashMap.put("biz_type", "1");
    localHashMap.put("abnormal_exit", paramString);
    startTask(new ao(localHashMap, new TwoWayVideoActivity.6(this)));
  }
  
  private void b(String paramString)
  {
    ThinkiveInitializer.getInstance().getHandler().post(new TwoWayVideoActivity.7(this, paramString));
  }
  
  private void d()
  {
    this.g.setText("客服号：" + this.a.getCustomId());
    Object localObject = Build.MODEL;
    String str = Build.MANUFACTURER;
    if (!TextUtils.isEmpty(this.a.getNetWorkStatus()))
    {
      localObject = "SYS:10010|" + str + " " + (String)localObject + "|" + this.a.getNetWorkStatus();
      this.b.TransBuffer(-1, ((String)localObject).getBytes(), ((String)localObject).getBytes().length);
    }
    this.d = ((SurfaceView)findViewById(ResourceUtil.getResourceID(this, "id", "fxc_kh_two_way_sv_local")));
    this.c = ((SurfaceView)findViewById(ResourceUtil.getResourceID(this, "id", "fxc_kh_two_way_sv_remote")));
    this.c.getHolder().setFormat(-2);
    this.c.setZOrderOnTop(true);
    if (AnyChatCoreSDK.GetSDKOptionInt(95) == 3) {
      this.d.getHolder().addCallback(AnyChatCoreSDK.mCameraHelper);
    }
    int i1;
    if (AnyChatCoreSDK.GetSDKOptionInt(83) == 5)
    {
      i1 = this.b.mVideoHelper.bindVideo(this.c.getHolder());
      this.b.mVideoHelper.SetVideoUser(i1, this.a.getSeatId());
    }
    this.c.getHolder().setKeepScreenOn(true);
    this.b.UserCameraControl(this.a.getSeatId(), 1);
    this.b.UserSpeakControl(this.a.getSeatId(), 1);
    this.d.setOnClickListener(this);
    if (ConfigService.LoadConfig(this).videoOverlay != 0) {
      this.d.getHolder().setType(3);
    }
    if (AnyChatCoreSDK.GetSDKOptionInt(95) == 3) {
      if (AnyChatCoreSDK.mCameraHelper.GetCameraNumber() > 1)
      {
        localObject = AnyChatCoreSDK.mCameraHelper;
        AnyChatCoreSDK.mCameraHelper.getClass();
        ((AnyChatCameraHelper)localObject).SelectVideoCapture(1);
      }
    }
    label444:
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
            break label444;
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
    this.b.UserCameraControl(this.a.getSeatId(), 1);
    this.b.UserSpeakControl(this.a.getSeatId(), 1);
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
    Toast.makeText(this, "网络连接异常,请退出重试!", 0).show();
    if (this.n)
    {
      this.b.UserCameraControl(this.a.getSeatId(), 0);
      this.b.UserSpeakControl(this.a.getSeatId(), 0);
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
    if (paramString.startsWith(ConfigManager.getInstance().getSystemConfigValue("TEXT_MSG")))
    {
      paramString = paramString.replace(ConfigManager.getInstance().getSystemConfigValue("TEXT_MSG"), "");
      this.e.setText(paramString);
      if (!this.l)
      {
        this.z.postDelayed(this.s, 5000L);
        this.l = true;
      }
    }
  }
  
  public void OnAnyChatTransBuffer(int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    paramArrayOfByte = new String(paramArrayOfByte);
    do
    {
      for (;;)
      {
        try
        {
          String str = URLDecoder.decode(paramArrayOfByte, "utf-8");
          paramArrayOfByte = str;
          localUnsupportedEncodingException1.printStackTrace();
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException1)
        {
          try
          {
            Log.e("asos", "收到透明通道消息：" + paramArrayOfByte);
            if (!paramArrayOfByte.equals(ConfigManager.getInstance().getSystemConfigValue("WITNESS_SUCCESS"))) {
              break;
            }
            b("0");
            this.k = true;
            f();
            return;
          }
          catch (UnsupportedEncodingException localUnsupportedEncodingException2)
          {
            for (;;) {}
          }
          localUnsupportedEncodingException1 = localUnsupportedEncodingException1;
        }
      }
      if ((paramArrayOfByte.contains(ConfigManager.getInstance().getSystemConfigValue("REJECT_REASON1"))) || (paramArrayOfByte.contains(ConfigManager.getInstance().getSystemConfigValue("REJECT_REASON2"))) || (paramArrayOfByte.contains(ConfigManager.getInstance().getSystemConfigValue("REJECT_REASON3"))) || (paramArrayOfByte.contains(ConfigManager.getInstance().getSystemConfigValue("REJECT_REASON4"))) || (paramArrayOfByte.contains(ConfigManager.getInstance().getSystemConfigValue("REJECT_REASON5"))) || (paramArrayOfByte.contains(ConfigManager.getInstance().getSystemConfigValue("REJECT_REASON6"))))
      {
        paramArrayOfByte = paramArrayOfByte.split(":")[1];
        b(String.valueOf(paramArrayOfByte.charAt(paramArrayOfByte.length() - 1)));
        paramArrayOfByte = "SYS:" + paramArrayOfByte;
        this.b.TransBuffer(-1, paramArrayOfByte.getBytes(), paramArrayOfByte.getBytes().length);
        this.k = true;
        f();
        return;
      }
      if (paramArrayOfByte.contains(ConfigManager.getInstance().getSystemConfigValue("SEAT_REFRESH_IE")))
      {
        Toast.makeText(this, "坐席正在刷新界面，请稍后...", 0).show();
        return;
      }
    } while (!paramArrayOfByte.contains(ConfigManager.getInstance().getSystemConfigValue("REJECT_APPLY")));
    this.b.SendTextMessage(-1, 0, ConfigManager.getInstance().getSystemConfigValue("REJECT_APPLY"));
    this.k = true;
    finish();
  }
  
  public void OnAnyChatTransBufferEx(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {}
  
  public void OnAnyChatTransFile(int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {}
  
  public void OnAnyChatUserAtRoomMessage(int paramInt, boolean paramBoolean)
  {
    this.a.setSeatId(paramInt);
    if (!paramBoolean)
    {
      this.b.UserCameraControl(paramInt, 0);
      this.b.UserSpeakControl(paramInt, 0);
      this.n = false;
      Toast.makeText(this, "座席端网络连接异常,请退出重试!", 0).show();
      return;
    }
    this.a.setSeatId(paramInt);
    this.b.UserCameraControl(paramInt, 1);
    this.b.UserSpeakControl(paramInt, 1);
    if (AnyChatCoreSDK.GetSDKOptionInt(83) == 5)
    {
      paramInt = this.b.mVideoHelper.bindVideo(this.c.getHolder());
      this.b.mVideoHelper.SetVideoUser(paramInt, this.a.getSeatId());
    }
    e();
  }
  
  protected void findViews()
  {
    this.e = ((TextView)findViewById(ResourceUtil.getResourceID(this, "id", "fxc_kh_two_way_tv_notice")));
    this.f = ((TextView)findViewById(ResourceUtil.getResourceID(this, "id", "fxc_kh_two_way_hold_down")));
    this.g = ((TextView)findViewById(ResourceUtil.getResourceID(this, "id", "fxc_kh_two_way_tv_custom_id")));
  }
  
  protected void initData()
  {
    super.initData();
    this.w = ((PowerManager)getSystemService("power")).newWakeLock(536870922, "TwoWayVideoActivity");
    getWindow().setFlags(128, 128);
    this.s = new TwoWayVideoActivity.2(this);
    this.t = new TwoWayVideoActivity.3(this);
    this.q = new TwoWayVideoActivity.4(this);
    this.o.schedule(this.q, 1000L, 1000L);
    this.r = new TwoWayVideoActivity.5(this);
    this.p.schedule(this.r, 0L, 800L);
  }
  
  protected void initViews() {}
  
  public void onClick(View paramView)
  {
    if (paramView.getId() == ResourceUtil.getResourceID(this, "id", "fxc_kh_two_way_hold_down"))
    {
      paramView = ConfigManager.getInstance().getSystemConfigValue("USER_LEAVE_ROOM");
      this.b.TransBuffer(-1, paramView.getBytes(), paramView.getBytes().length);
      paramView = new Parameter();
      paramView.addParameter("user_id", this.a.getUserId());
      paramView.addParameter("url", this.a.getUrl());
      a("0");
      f();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    setContentView(ResourceUtil.getResourceID(this, "layout", "fxc_kh_two_way_video"));
    super.onCreate(paramBundle);
    if (this.b == null) {
      this.b = new AnyChatCoreSDK();
    }
    this.b.SetBaseEvent(this);
    this.b.mSensorHelper.InitSensor(this);
    this.b.SetTextMessageEvent(this);
    this.b.SetTransDataEvent(this);
    paramBundle = this.b.GetUserName(this.a.getSeatId());
    this.a.setCustomId(paramBundle);
    d();
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      Object localObject = ConfigManager.getInstance().getSystemConfigValue("USER_LEAVE_ROOM");
      this.b.TransBuffer(-1, ((String)localObject).getBytes(), ((String)localObject).getBytes().length);
      localObject = new Parameter();
      ((Parameter)localObject).addParameter("user_id", this.a.getUserId());
      ((Parameter)localObject).addParameter("url", this.a.getUrl());
      a("0");
      f();
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPause()
  {
    super.onPause();
    this.j = true;
    if (!this.k)
    {
      this.b.UserCameraControl(this.a.getSeatId(), 0);
      this.b.UserSpeakControl(this.a.getSeatId(), 0);
      this.b.UserCameraControl(-1, 0);
      this.b.UserSpeakControl(-1, 0);
    }
    if (this.w != null) {
      this.w.release();
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    if (AnyChatCoreSDK.GetSDKOptionInt(83) == 5)
    {
      int i1 = this.b.mVideoHelper.bindVideo(this.c.getHolder());
      this.b.mVideoHelper.SetVideoUser(i1, this.a.getSeatId());
    }
    e();
    this.j = false;
    this.w.acquire();
  }
  
  protected void setListeners()
  {
    this.f.setOnClickListener(this);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\thinkive\mobile\video\activities\TwoWayVideoActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */