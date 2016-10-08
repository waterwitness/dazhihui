package com.thinkive.mobile.video.activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.Size;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import bc;
import bq;
import com.android.thinkive.framework.compatible.DialogFrame;
import com.android.thinkive.framework.compatible.Parameter;
import com.android.thinkive.framework.util.ResourceUtil;
import com.thinkive.android.ui.OpenAcBaseActivity;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import org.apache.http.entity.mime.content.FileBody;

@SuppressLint({"HandlerLeak"})
public class OfflineVideoActivity
  extends OpenAcBaseActivity
  implements SurfaceHolder.Callback
{
  private static String H;
  private static String I;
  private static String J;
  public static String e;
  public static String f;
  private static OfflineVideoActivity u;
  private static String y = "";
  private int A;
  private int B;
  private int C;
  private long D = 0L;
  private File E;
  private LinearLayout F;
  private Button G;
  private String K;
  private int L = -1;
  private MediaRecorder M;
  private int N = 0;
  private long O;
  private long P;
  private String Q;
  private Handler R = new Handler();
  public int b = 0;
  public String c = "1";
  public String d = "0";
  private String g = Build.MODEL;
  private Button h;
  private Button i;
  private Button j;
  private Button k;
  private ProgressBar l;
  private TextView m;
  private RelativeLayout n;
  private MediaRecorder o;
  private SurfaceView p;
  private MediaPlayer q;
  private TextView r;
  private Camera s;
  private SurfaceHolder t;
  private Timer v;
  private OfflineVideoActivity.a w;
  private int x;
  private int z;
  
  private void a(File paramFile)
  {
    if (paramFile.exists())
    {
      if (!paramFile.isFile()) {
        break label25;
      }
      paramFile.delete();
    }
    for (;;)
    {
      paramFile.delete();
      return;
      label25:
      if (paramFile.isDirectory())
      {
        File[] arrayOfFile = paramFile.listFiles();
        int i1 = 0;
        while (i1 < arrayOfFile.length)
        {
          a(arrayOfFile[i1]);
          i1 += 1;
        }
      }
    }
  }
  
  public static OfflineVideoActivity d()
  {
    if (u != null) {
      return u;
    }
    return null;
  }
  
  private void l()
  {
    this.h.setEnabled(false);
    this.k.setEnabled(false);
    this.R.postDelayed(new OfflineVideoActivity.6(this), 666L);
  }
  
  private void m()
  {
    try
    {
      if (this.o != null)
      {
        this.o.stop();
        this.o.release();
        this.o = null;
      }
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      return;
    }
    finally
    {
      if (this.s != null)
      {
        this.s.lock();
        this.s.stopPreview();
        this.s.release();
        this.s = null;
      }
    }
  }
  
  protected final String a()
  {
    return getIntent().getStringExtra("url");
  }
  
  public final void a(long paramLong)
  {
    this.R.postDelayed(new OfflineVideoActivity.8(this), paramLong);
  }
  
  public final void b(long paramLong)
  {
    this.R.postDelayed(new OfflineVideoActivity.9(this), paramLong);
  }
  
  public final void e()
  {
    l();
    f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date(System.currentTimeMillis()));
    this.c = "2";
    this.x = 0;
    this.m.setText("00:00");
    this.l.setMax(this.B);
    this.l.setProgress(0);
    this.p.setVisibility(0);
    this.h.setVisibility(8);
    this.k.setVisibility(0);
    this.F.setVisibility(8);
    this.r.setVisibility(0);
    this.d = "2";
    for (;;)
    {
      try
      {
        this.o = new MediaRecorder();
        this.o.setCamera(this.s);
        this.o.setPreviewDisplay(this.t.getSurface());
        this.o.setAudioSource(1);
        this.o.setVideoSource(1);
        this.o.setOutputFormat(2);
        this.o.setVideoEncoder(2);
        if ((this.g.equals("PE-TL00M")) || (this.g.equals("PE-TL20")) || (this.g.equals("PE-UL00")) || (this.g.equals("PE-CL00")) || (this.g.equals("HM NOTE 1LTETD")))
        {
          this.o.setAudioEncoder(5);
          this.o.setAudioEncodingBitRate(48);
          this.o.setAudioSamplingRate(44100);
          if ((this.g.equals("N9180")) || (this.g.equals("U9180")))
          {
            this.o.setOrientationHint(90);
            this.o.setVideoSize(this.z, this.A);
            this.o.setVideoEncodingBitRate(393216);
            if (this.L != -1) {
              this.o.setVideoFrameRate(this.L);
            }
            if (!"".equals(y))
            {
              File localFile = new File(y);
              if (localFile.exists()) {
                localFile.delete();
              }
            }
            y = (String)bq.c().get(0) + "/openAccount.mp4";
            this.o.setOutputFile(y);
            this.o.prepare();
            this.p.setVisibility(0);
            this.o.start();
            this.v = new Timer(true);
            this.w = new OfflineVideoActivity.a(this);
            if (this.v == null) {
              break;
            }
            this.v.schedule(this.w, 1000L, 1000L);
          }
        }
        else
        {
          this.o.setAudioEncoder(3);
          continue;
        }
        this.o.setOrientationHint(270);
      }
      catch (Exception localException)
      {
        Toast.makeText(this, "录制异常，请重试！", 0).show();
        localException.printStackTrace();
        m();
        finish();
        return;
      }
    }
  }
  
  public final void f()
  {
    l();
    if (this.x < this.C)
    {
      if (System.currentTimeMillis() - this.D < 2000L) {
        return;
      }
      this.D = System.currentTimeMillis();
      Toast.makeText(this, "录制时间不得少于" + this.C + "秒", 0).show();
      return;
    }
    m();
    if (this.v != null) {
      this.v.cancel();
    }
    this.n.setVisibility(0);
    this.h.setVisibility(0);
    this.k.setVisibility(8);
    this.F.setVisibility(0);
    this.r.setVisibility(8);
    this.d = "1";
    e = this.m.getText().toString();
  }
  
  public void findViews()
  {
    this.n = ((RelativeLayout)findViewById(ResourceUtil.getResourceID(this, "id", "fxc_kh_linear_stop")));
    this.h = ((Button)findViewById(ResourceUtil.getResourceID(this, "id", "fxc_kh_btn_video")));
    this.i = ((Button)findViewById(ResourceUtil.getResourceID(this, "id", "fxc_kh_btn_delete")));
    this.j = ((Button)findViewById(ResourceUtil.getResourceID(this, "id", "fxc_kh_btn_upload")));
    this.k = ((Button)findViewById(ResourceUtil.getResourceID(this, "id", "fxc_kh_btn_video_cancel")));
    this.p = ((SurfaceView)findViewById(ResourceUtil.getResourceID(this, "id", "fxc_kh_offline_surfaceview")));
    this.m = ((TextView)findViewById(ResourceUtil.getResourceID(this, "id", "fxc_kh_tv_record_time")));
    this.l = ((ProgressBar)findViewById(ResourceUtil.getResourceID(this, "id", "fxc_kh_progress_bar")));
    this.r = ((TextView)findViewById(ResourceUtil.getResourceID(this, "id", "fxc_kh_notice_text")));
    this.F = ((LinearLayout)findViewById(ResourceUtil.getResourceID(this, "id", "fxc_kh_ok_layout")));
    this.G = ((Button)findViewById(ResourceUtil.getResourceID(this, "id", "fxc_kh_btn_play")));
  }
  
  public final void g()
  {
    if (!new File(y).exists())
    {
      Toast.makeText(this, "你没有录制好的视频", 0).show();
      return;
    }
    this.F.setVisibility(8);
    this.q = new MediaPlayer();
    this.q.reset();
    this.q.setDisplay(this.t);
    try
    {
      this.q.setDataSource(y);
      this.q.prepare();
      this.l.setMax(this.q.getDuration() / 1000);
      this.l.setProgress(0);
      this.x = 0;
      this.v = new Timer(true);
      this.w = new OfflineVideoActivity.a(this);
      if (this.v != null) {
        this.v.schedule(this.w, 1000L, 1000L);
      }
      this.b = 1;
      this.q.start();
      this.q.setOnCompletionListener(new OfflineVideoActivity.7(this));
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
  
  public final void h()
  {
    this.F.setVisibility(0);
    this.b = 0;
    this.v.cancel();
    this.q.reset();
    this.q.release();
  }
  
  public final void i()
  {
    this.E = new File(y);
    new DialogFrame(this).waitDialog("提示", "正在上传...", false);
    Parameter localParameter = new Parameter();
    localParameter.addParameter("user_id", getIntent().getStringExtra("user_id"));
    localParameter.addParameter("fileType", "VIDEO");
    localParameter.addParameter("videoExist", "1");
    localParameter.addParameter("start_time", f);
    localParameter.addParameter("suffix", ".mp4");
    localParameter.addParameter("video_length", e);
    localParameter.addParameter("jsessionid", H);
    localParameter.addParameter("media_stream", new FileBody(this.E));
    localParameter.addParameter("autentication_type", "1");
    localParameter.addParameter("url", this.K);
    localParameter.addParameter("saveVideo", "1");
    startTask(new bc(this, localParameter));
  }
  
  protected void initData()
  {
    this.B = Integer.valueOf(getIntent().getStringExtra("longestTime")).intValue();
    this.C = Integer.valueOf(getIntent().getStringExtra("shortestTime")).intValue();
    H = getIntent().getStringExtra("jsessionid");
    I = getIntent().getStringExtra("user_name");
    this.K = getIntent().getStringExtra("url");
    J = getIntent().getStringExtra("strContent");
  }
  
  protected void initViews()
  {
    this.Q = "视频录制过程中，请用普通话宣读下列文字：我是%s本人，自愿开设上海A股、深圳A股账户。本人已知晓相关市场的投资风险，并承担一切盈亏。";
    this.Q = String.format(this.Q, new Object[] { I });
    this.r.getBackground().setAlpha(100);
    if (!TextUtils.isEmpty(J)) {
      this.r.setText(J);
    }
    for (;;)
    {
      this.t = this.p.getHolder();
      this.t.addCallback(this);
      this.t.setType(3);
      this.t.setKeepScreenOn(true);
      this.l.setMax(this.B);
      this.l.setProgress(0);
      return;
      this.r.setText(this.Q);
    }
  }
  
  @SuppressLint({"NewApi"})
  public final void j()
  {
    try
    {
      m();
      i1 = 0;
    }
    catch (Exception localException2)
    {
      for (;;)
      {
        int i1;
        int i2;
        try
        {
          Camera.Parameters localParameters;
          List localList;
          ArrayList localArrayList;
          int i3;
          label361:
          if (this.v != null) {
            this.v.cancel();
          }
          label416:
          label441:
          label461:
          Boolean localBoolean;
          if (this.N >= 2)
          {
            m();
            Toast.makeText(this, "无法启动相机服务，请您检测下相机状态和相机权限！", 0).show();
            finish();
            return;
            if (((Integer)localException2.get(i2)).intValue() != 15) {
              break label637;
            }
            i1 = 1;
            break label650;
            this.L = ((Integer)localException2.get(0)).intValue();
            continue;
            if (((Camera.Size)localList.get(i1)).width - 320 == 0)
            {
              localParameters.setPreviewSize(320, 240);
              this.z = 320;
              this.A = 240;
              localBoolean = Boolean.valueOf(true);
              continue;
            }
            localArrayList.add(i1, Integer.valueOf(Math.abs(((Camera.Size)localList.get(i1)).width - 320)));
            i1 += 1;
            continue;
            label554:
            if (((Integer)localArrayList.get(i1)).intValue() < i2)
            {
              int i4 = ((Integer)localArrayList.get(i1)).intValue();
              localArrayList.set(i1, Integer.valueOf(i2));
              i3 = i1;
              i2 = i4;
              i1 += 1;
              continue;
            }
          }
          else
          {
            m();
            j();
            localBoolean.printStackTrace();
            return;
          }
        }
        catch (Exception localException3)
        {
          continue;
          continue;
        }
        label637:
        break label650;
        label640:
        return;
        label641:
        i1 += 1;
        continue;
        label650:
        i2 += 1;
      }
    }
    if (i1 >= Camera.getNumberOfCameras())
    {
      if (this.s == null) {
        break label640;
      }
      if ((!this.g.equals("N9180")) && (!this.g.equals("U9180"))) {
        break label361;
      }
      this.s.setDisplayOrientation(270);
    }
    for (;;)
    {
      Object localObject = this.s.getParameters().getSupportedPreviewFrameRates();
      if ((localObject != null) && (((List)localObject).size() > 0))
      {
        i2 = 0;
        i1 = 0;
        if (i2 < ((List)localObject).size()) {
          break label416;
        }
        if (i1 == 0) {
          break label441;
        }
        this.L = 15;
      }
      localParameters = this.s.getParameters();
      localList = localParameters.getSupportedPreviewSizes();
      localArrayList = new ArrayList();
      i1 = 0;
      if (i1 < localList.size()) {
        break label461;
      }
      localObject = Boolean.valueOf(false);
      if (!((Boolean)localObject).booleanValue())
      {
        i2 = ((Integer)localArrayList.get(0)).intValue();
        i1 = 1;
        i3 = 0;
        if (i1 < localArrayList.size()) {
          break label554;
        }
        localParameters.setPreviewSize(((Camera.Size)localList.get(i3)).width, ((Camera.Size)localList.get(i3)).height);
        this.z = ((Camera.Size)localList.get(i3)).width;
        this.A = ((Camera.Size)localList.get(i3)).height;
      }
      this.s.setParameters(localParameters);
      this.s.setPreviewDisplay(this.t);
      this.s.startPreview();
      this.s.unlock();
      return;
      localObject = new Camera.CameraInfo();
      Camera.getCameraInfo(i1, (Camera.CameraInfo)localObject);
      i2 = ((Camera.CameraInfo)localObject).facing;
      if (i2 != 1) {
        break label641;
      }
      try
      {
        this.s = Camera.open(i1);
      }
      catch (Exception localException1)
      {
        this.N += 1;
        if (this.N < 2) {
          break label641;
        }
      }
      Toast.makeText(this, "请打开手机照相机权限", 0).show();
      break label641;
      this.s.setDisplayOrientation(90);
    }
  }
  
  public final void k()
  {
    a(new File(Environment.getExternalStorageDirectory().getPath() + "/openAccount.mp4"));
    this.m.setText("00:00");
    this.l.setProgress(0);
    this.d = "0";
    this.r.setVisibility(0);
    this.F.setVisibility(8);
    Toast.makeText(this, "删除视频成功", 0).show();
    j();
    this.p.setVisibility(0);
  }
  
  /* Error */
  public void onCreate(android.os.Bundle paramBundle)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 4
    //   3: aload_0
    //   4: aload_1
    //   5: invokespecial 771	com/thinkive/android/ui/OpenAcBaseActivity:onCreate	(Landroid/os/Bundle;)V
    //   8: aload_0
    //   9: putstatic 149	com/thinkive/mobile/video/activities/OfflineVideoActivity:u	Lcom/thinkive/mobile/video/activities/OfflineVideoActivity;
    //   12: aload_0
    //   13: aload_0
    //   14: ldc_w 773
    //   17: ldc_w 775
    //   20: invokestatic 472	com/android/thinkive/framework/util/ResourceUtil:getResourceID	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I
    //   23: invokevirtual 778	com/thinkive/mobile/video/activities/OfflineVideoActivity:setContentView	(I)V
    //   26: aload_0
    //   27: invokevirtual 782	com/thinkive/mobile/video/activities/OfflineVideoActivity:getWindow	()Landroid/view/Window;
    //   30: bipush -3
    //   32: invokevirtual 787	android/view/Window:setFormat	(I)V
    //   35: aload_0
    //   36: invokevirtual 789	com/thinkive/mobile/video/activities/OfflineVideoActivity:initData	()V
    //   39: aload_0
    //   40: invokevirtual 791	com/thinkive/mobile/video/activities/OfflineVideoActivity:findViews	()V
    //   43: aload_0
    //   44: invokevirtual 793	com/thinkive/mobile/video/activities/OfflineVideoActivity:initViews	()V
    //   47: aload_0
    //   48: invokevirtual 796	com/thinkive/mobile/video/activities/OfflineVideoActivity:setListeners	()V
    //   51: aload_0
    //   52: new 178	android/media/MediaRecorder
    //   55: dup
    //   56: invokespecial 285	android/media/MediaRecorder:<init>	()V
    //   59: putfield 798	com/thinkive/mobile/video/activities/OfflineVideoActivity:M	Landroid/media/MediaRecorder;
    //   62: aload_0
    //   63: getfield 798	com/thinkive/mobile/video/activities/OfflineVideoActivity:M	Landroid/media/MediaRecorder;
    //   66: iconst_1
    //   67: invokevirtual 304	android/media/MediaRecorder:setAudioSource	(I)V
    //   70: aload_0
    //   71: getfield 798	com/thinkive/mobile/video/activities/OfflineVideoActivity:M	Landroid/media/MediaRecorder;
    //   74: iconst_0
    //   75: invokevirtual 310	android/media/MediaRecorder:setOutputFormat	(I)V
    //   78: aload_0
    //   79: getfield 798	com/thinkive/mobile/video/activities/OfflineVideoActivity:M	Landroid/media/MediaRecorder;
    //   82: iconst_0
    //   83: invokevirtual 332	android/media/MediaRecorder:setAudioEncoder	(I)V
    //   86: new 366	java/lang/StringBuilder
    //   89: dup
    //   90: invokestatic 371	bq:c	()Ljava/util/List;
    //   93: iconst_0
    //   94: invokeinterface 377 2 0
    //   99: checkcast 317	java/lang/String
    //   102: invokestatic 381	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   105: invokespecial 382	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   108: ldc_w 800
    //   111: invokevirtual 388	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   114: invokevirtual 391	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   117: astore_1
    //   118: aload_0
    //   119: getfield 798	com/thinkive/mobile/video/activities/OfflineVideoActivity:M	Landroid/media/MediaRecorder;
    //   122: aload_1
    //   123: invokevirtual 394	android/media/MediaRecorder:setOutputFile	(Ljava/lang/String;)V
    //   126: aload_0
    //   127: getfield 798	com/thinkive/mobile/video/activities/OfflineVideoActivity:M	Landroid/media/MediaRecorder;
    //   130: invokevirtual 397	android/media/MediaRecorder:prepare	()V
    //   133: aload_0
    //   134: getfield 798	com/thinkive/mobile/video/activities/OfflineVideoActivity:M	Landroid/media/MediaRecorder;
    //   137: invokevirtual 400	android/media/MediaRecorder:start	()V
    //   140: aload_0
    //   141: getfield 798	com/thinkive/mobile/video/activities/OfflineVideoActivity:M	Landroid/media/MediaRecorder;
    //   144: invokevirtual 181	android/media/MediaRecorder:stop	()V
    //   147: aload_0
    //   148: getfield 798	com/thinkive/mobile/video/activities/OfflineVideoActivity:M	Landroid/media/MediaRecorder;
    //   151: invokevirtual 184	android/media/MediaRecorder:release	()V
    //   154: aload_0
    //   155: aconst_null
    //   156: putfield 798	com/thinkive/mobile/video/activities/OfflineVideoActivity:M	Landroid/media/MediaRecorder;
    //   159: new 117	java/io/File
    //   162: dup
    //   163: aload_1
    //   164: invokespecial 364	java/io/File:<init>	(Ljava/lang/String;)V
    //   167: astore_1
    //   168: aload_1
    //   169: invokevirtual 121	java/io/File:exists	()Z
    //   172: ifeq +8 -> 180
    //   175: aload_1
    //   176: invokevirtual 127	java/io/File:delete	()Z
    //   179: pop
    //   180: aload_0
    //   181: invokevirtual 804	com/thinkive/mobile/video/activities/OfflineVideoActivity:getPackageManager	()Landroid/content/pm/PackageManager;
    //   184: astore_1
    //   185: aload_1
    //   186: ldc_w 806
    //   189: aload_0
    //   190: invokevirtual 810	com/thinkive/mobile/video/activities/OfflineVideoActivity:getApplicationContext	()Landroid/content/Context;
    //   193: invokevirtual 815	android/content/Context:getPackageName	()Ljava/lang/String;
    //   196: invokevirtual 821	android/content/pm/PackageManager:checkPermission	(Ljava/lang/String;Ljava/lang/String;)I
    //   199: ifne +71 -> 270
    //   202: iconst_1
    //   203: istore_3
    //   204: aload_1
    //   205: ldc_w 823
    //   208: aload_0
    //   209: invokevirtual 810	com/thinkive/mobile/video/activities/OfflineVideoActivity:getApplicationContext	()Landroid/content/Context;
    //   212: invokevirtual 815	android/content/Context:getPackageName	()Ljava/lang/String;
    //   215: invokevirtual 821	android/content/pm/PackageManager:checkPermission	(Ljava/lang/String;Ljava/lang/String;)I
    //   218: ifne +57 -> 275
    //   221: iload_3
    //   222: ifeq +8 -> 230
    //   225: iload 4
    //   227: ifne +18 -> 245
    //   230: aload_0
    //   231: ldc_w 825
    //   234: iconst_0
    //   235: invokestatic 425	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   238: invokevirtual 428	android/widget/Toast:show	()V
    //   241: aload_0
    //   242: invokevirtual 433	com/thinkive/mobile/video/activities/OfflineVideoActivity:finish	()V
    //   245: return
    //   246: astore_2
    //   247: aload_2
    //   248: invokevirtual 826	java/lang/IllegalStateException:printStackTrace	()V
    //   251: goto -111 -> 140
    //   254: astore_1
    //   255: aload_1
    //   256: invokevirtual 198	java/lang/Exception:printStackTrace	()V
    //   259: goto -79 -> 180
    //   262: astore_2
    //   263: aload_2
    //   264: invokevirtual 827	java/io/IOException:printStackTrace	()V
    //   267: goto -127 -> 140
    //   270: iconst_0
    //   271: istore_3
    //   272: goto -68 -> 204
    //   275: iconst_0
    //   276: istore 4
    //   278: goto -57 -> 221
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	281	0	this	OfflineVideoActivity
    //   0	281	1	paramBundle	android.os.Bundle
    //   246	2	2	localIllegalStateException	IllegalStateException
    //   262	2	2	localIOException	java.io.IOException
    //   203	69	3	i1	int
    //   1	276	4	i2	int
    // Exception table:
    //   from	to	target	type
    //   126	140	246	java/lang/IllegalStateException
    //   51	126	254	java/lang/Exception
    //   126	140	254	java/lang/Exception
    //   140	180	254	java/lang/Exception
    //   247	251	254	java/lang/Exception
    //   263	267	254	java/lang/Exception
    //   126	140	262	java/io/IOException
  }
  
  protected void onPause()
  {
    super.onPause();
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    if (this.F.getVisibility() == 8)
    {
      if (this.b == 1) {
        h();
      }
    }
    else {
      return;
    }
    if (paramBoolean)
    {
      j();
      return;
    }
    if (this.v != null) {
      this.v.cancel();
    }
    m();
    this.p.setVisibility(0);
    this.k.setVisibility(8);
    this.h.setVisibility(0);
    this.F.setVisibility(8);
    this.r.setVisibility(0);
    this.l.setProgress(0);
    this.m.setText("00:00");
  }
  
  public void setListeners()
  {
    this.h.setOnClickListener(new OfflineVideoActivity.1(this));
    this.i.setOnClickListener(new OfflineVideoActivity.2(this));
    this.j.setOnClickListener(new OfflineVideoActivity.3(this));
    this.k.setOnClickListener(new OfflineVideoActivity.4(this));
    this.G.setOnClickListener(new OfflineVideoActivity.5(this));
  }
  
  public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void surfaceCreated(SurfaceHolder paramSurfaceHolder) {}
  
  public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\thinkive\mobile\video\activities\OfflineVideoActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */