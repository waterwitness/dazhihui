package com.kwlopen.sdk.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Rect;
import android.hardware.Camera;
import android.hardware.Camera.Area;
import android.hardware.Camera.AutoFocusCallback;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.Parameters;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.kwl.common.utils.LogUtil;
import com.kwl.common.utils.ResourceUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Timer;

public class CaptureVideo
  extends Activity
  implements View.OnClickListener, View.OnTouchListener
{
  private static final int PLAY_AREA = 7;
  private int FrameRate;
  private int HResolution;
  private int VResolution;
  private ImageView backBtn;
  public Button btnStartPlay;
  private Button btnStopRecord;
  private Button btnVideoButton;
  private Camera camera;
  private Camera.Parameters cameraParams;
  private Context context;
  private String fileName;
  private List<Integer> fps;
  Handler handler = new CaptureVideo.1(this);
  private SparseIntArray heightArray = new SparseIntArray();
  private boolean isTaking;
  private boolean isVideoAuto = true;
  private boolean isVideoSizeSupport = true;
  private ImageView kuangkuangImageView;
  private Intent lastIntent;
  private FrameLayout layout;
  private int limit = 30;
  private MediaRecorder mediaRecorder;
  private int minute = 0;
  private Camera.AutoFocusCallback myAutoFocusCallback = null;
  private String path;
  private boolean perm = true;
  private CameraPreview preview;
  private RelativeLayout recordBtnlayout;
  private FrameLayout recordVideoFrameLayout;
  private LinearLayout repeatLayout;
  private int second = 0;
  private int sizeIndex = 0;
  private LinearLayout timer;
  private Timer timerCount;
  public TextView timerTextView;
  private LinearLayout uploadLayout;
  private LinearLayout uploadVideoLayout;
  private RelativeLayout userReadLayout;
  private TextView userReadTextView;
  private String vercode;
  private FrameLayout videoLogicFrameLayout;
  private FrameLayout videoPlayFrameLayout;
  private SparseIntArray widthArray = new SparseIntArray();
  
  @SuppressLint({"NewApi"})
  private int FindBackCamera()
  {
    Camera.CameraInfo localCameraInfo = new Camera.CameraInfo();
    int k = Camera.getNumberOfCameras();
    int i = 0;
    for (;;)
    {
      int j;
      if (i >= k) {
        j = -1;
      }
      do
      {
        return j;
        Camera.getCameraInfo(i, localCameraInfo);
        j = i;
      } while (localCameraInfo.facing == 0);
      i += 1;
    }
  }
  
  @SuppressLint({"NewApi"})
  private int FindFrontCamera()
  {
    Camera.CameraInfo localCameraInfo = new Camera.CameraInfo();
    int k = Camera.getNumberOfCameras();
    int i = 0;
    for (;;)
    {
      int j;
      if (i >= k) {
        j = -1;
      }
      do
      {
        return j;
        Camera.getCameraInfo(i, localCameraInfo);
        j = i;
      } while (localCameraInfo.facing == 1);
      i += 1;
    }
  }
  
  private void cancelTimer()
  {
    if (this.timerCount != null)
    {
      this.timerCount.cancel();
      this.timerCount = null;
    }
  }
  
  public static String getSDPath()
  {
    File localFile = null;
    if (Environment.getExternalStorageState().equals("mounted")) {
      localFile = Environment.getExternalStorageDirectory();
    }
    return localFile.toString();
  }
  
  /* Error */
  @SuppressLint({"NewApi"})
  private void initCamera()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 194	com/kwlopen/sdk/activity/CaptureVideo:timer	Landroid/widget/LinearLayout;
    //   4: bipush 8
    //   6: invokevirtual 200	android/widget/LinearLayout:setVisibility	(I)V
    //   9: aload_0
    //   10: getfield 202	com/kwlopen/sdk/activity/CaptureVideo:timerTextView	Landroid/widget/TextView;
    //   13: ldc -52
    //   15: invokevirtual 210	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   18: aload_0
    //   19: invokespecial 212	com/kwlopen/sdk/activity/CaptureVideo:FindFrontCamera	()I
    //   22: istore_3
    //   23: iload_3
    //   24: istore_2
    //   25: iload_3
    //   26: iconst_m1
    //   27: if_icmpne +8 -> 35
    //   30: aload_0
    //   31: invokespecial 214	com/kwlopen/sdk/activity/CaptureVideo:FindBackCamera	()I
    //   34: istore_2
    //   35: iload_2
    //   36: iconst_m1
    //   37: if_icmpne +198 -> 235
    //   40: aload_0
    //   41: invokestatic 218	android/hardware/Camera:open	()Landroid/hardware/Camera;
    //   44: putfield 220	com/kwlopen/sdk/activity/CaptureVideo:camera	Landroid/hardware/Camera;
    //   47: aload_0
    //   48: new 222	com/kwlopen/sdk/activity/CameraPreview
    //   51: dup
    //   52: aload_0
    //   53: aload_0
    //   54: getfield 220	com/kwlopen/sdk/activity/CaptureVideo:camera	Landroid/hardware/Camera;
    //   57: invokespecial 225	com/kwlopen/sdk/activity/CameraPreview:<init>	(Landroid/content/Context;Landroid/hardware/Camera;)V
    //   60: putfield 227	com/kwlopen/sdk/activity/CaptureVideo:preview	Lcom/kwlopen/sdk/activity/CameraPreview;
    //   63: aload_0
    //   64: getfield 227	com/kwlopen/sdk/activity/CaptureVideo:preview	Lcom/kwlopen/sdk/activity/CameraPreview;
    //   67: iconst_0
    //   68: invokevirtual 231	com/kwlopen/sdk/activity/CameraPreview:setFocusable	(Z)V
    //   71: aload_0
    //   72: getfield 227	com/kwlopen/sdk/activity/CaptureVideo:preview	Lcom/kwlopen/sdk/activity/CameraPreview;
    //   75: iconst_0
    //   76: invokevirtual 234	com/kwlopen/sdk/activity/CameraPreview:setEnabled	(Z)V
    //   79: aload_0
    //   80: aload_0
    //   81: getfield 220	com/kwlopen/sdk/activity/CaptureVideo:camera	Landroid/hardware/Camera;
    //   84: invokevirtual 238	android/hardware/Camera:getParameters	()Landroid/hardware/Camera$Parameters;
    //   87: putfield 240	com/kwlopen/sdk/activity/CaptureVideo:cameraParams	Landroid/hardware/Camera$Parameters;
    //   90: aload_0
    //   91: getfield 240	com/kwlopen/sdk/activity/CaptureVideo:cameraParams	Landroid/hardware/Camera$Parameters;
    //   94: invokevirtual 246	android/hardware/Camera$Parameters:getSupportedPreviewSizes	()Ljava/util/List;
    //   97: astore_1
    //   98: aload_1
    //   99: ifnull +258 -> 357
    //   102: aload_1
    //   103: invokeinterface 251 1 0
    //   108: ifle +249 -> 357
    //   111: iconst_0
    //   112: istore_2
    //   113: iload_2
    //   114: aload_1
    //   115: invokeinterface 251 1 0
    //   120: if_icmplt +126 -> 246
    //   123: aload_0
    //   124: getfield 240	com/kwlopen/sdk/activity/CaptureVideo:cameraParams	Landroid/hardware/Camera$Parameters;
    //   127: ldc -3
    //   129: ldc -1
    //   131: invokevirtual 259	android/hardware/Camera$Parameters:set	(Ljava/lang/String;Ljava/lang/String;)V
    //   134: aload_0
    //   135: getfield 220	com/kwlopen/sdk/activity/CaptureVideo:camera	Landroid/hardware/Camera;
    //   138: bipush 90
    //   140: invokevirtual 262	android/hardware/Camera:setDisplayOrientation	(I)V
    //   143: aload_0
    //   144: getfield 220	com/kwlopen/sdk/activity/CaptureVideo:camera	Landroid/hardware/Camera;
    //   147: aload_0
    //   148: getfield 240	com/kwlopen/sdk/activity/CaptureVideo:cameraParams	Landroid/hardware/Camera$Parameters;
    //   151: invokevirtual 266	android/hardware/Camera:setParameters	(Landroid/hardware/Camera$Parameters;)V
    //   154: aload_0
    //   155: aload_0
    //   156: getfield 240	com/kwlopen/sdk/activity/CaptureVideo:cameraParams	Landroid/hardware/Camera$Parameters;
    //   159: invokevirtual 269	android/hardware/Camera$Parameters:getSupportedPreviewFrameRates	()Ljava/util/List;
    //   162: putfield 271	com/kwlopen/sdk/activity/CaptureVideo:fps	Ljava/util/List;
    //   165: aload_0
    //   166: getfield 220	com/kwlopen/sdk/activity/CaptureVideo:camera	Landroid/hardware/Camera;
    //   169: aload_0
    //   170: getfield 227	com/kwlopen/sdk/activity/CaptureVideo:preview	Lcom/kwlopen/sdk/activity/CameraPreview;
    //   173: invokevirtual 275	com/kwlopen/sdk/activity/CameraPreview:getHolder	()Landroid/view/SurfaceHolder;
    //   176: invokevirtual 279	android/hardware/Camera:setPreviewDisplay	(Landroid/view/SurfaceHolder;)V
    //   179: aload_0
    //   180: getfield 281	com/kwlopen/sdk/activity/CaptureVideo:layout	Landroid/widget/FrameLayout;
    //   183: aload_0
    //   184: getfield 227	com/kwlopen/sdk/activity/CaptureVideo:preview	Lcom/kwlopen/sdk/activity/CameraPreview;
    //   187: invokevirtual 287	android/widget/FrameLayout:addView	(Landroid/view/View;)V
    //   190: aload_0
    //   191: getfield 281	com/kwlopen/sdk/activity/CaptureVideo:layout	Landroid/widget/FrameLayout;
    //   194: aload_0
    //   195: invokevirtual 291	android/widget/FrameLayout:setOnTouchListener	(Landroid/view/View$OnTouchListener;)V
    //   198: return
    //   199: astore_1
    //   200: aload_0
    //   201: invokestatic 122	android/hardware/Camera:getNumberOfCameras	()I
    //   204: iconst_1
    //   205: isub
    //   206: invokestatic 294	android/hardware/Camera:open	(I)Landroid/hardware/Camera;
    //   209: putfield 220	com/kwlopen/sdk/activity/CaptureVideo:camera	Landroid/hardware/Camera;
    //   212: getstatic 300	java/lang/System:out	Ljava/io/PrintStream;
    //   215: ldc_w 302
    //   218: invokevirtual 308	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   221: goto -174 -> 47
    //   224: astore_1
    //   225: aload_0
    //   226: iconst_0
    //   227: putfield 101	com/kwlopen/sdk/activity/CaptureVideo:perm	Z
    //   230: aload_1
    //   231: invokevirtual 311	java/lang/Exception:printStackTrace	()V
    //   234: return
    //   235: aload_0
    //   236: iload_2
    //   237: invokestatic 294	android/hardware/Camera:open	(I)Landroid/hardware/Camera;
    //   240: putfield 220	com/kwlopen/sdk/activity/CaptureVideo:camera	Landroid/hardware/Camera;
    //   243: goto -196 -> 47
    //   246: new 313	java/lang/StringBuilder
    //   249: dup
    //   250: ldc_w 315
    //   253: invokespecial 317	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   256: aload_1
    //   257: iload_2
    //   258: invokeinterface 321 2 0
    //   263: checkcast 323	android/hardware/Camera$Size
    //   266: getfield 326	android/hardware/Camera$Size:width	I
    //   269: invokevirtual 330	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   272: invokevirtual 331	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   275: new 313	java/lang/StringBuilder
    //   278: dup
    //   279: ldc_w 333
    //   282: invokespecial 317	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   285: aload_1
    //   286: iload_2
    //   287: invokeinterface 321 2 0
    //   292: checkcast 323	android/hardware/Camera$Size
    //   295: getfield 336	android/hardware/Camera$Size:height	I
    //   298: invokevirtual 330	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   301: invokevirtual 331	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   304: invokestatic 342	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   307: pop
    //   308: aload_0
    //   309: getfield 83	com/kwlopen/sdk/activity/CaptureVideo:widthArray	Landroid/util/SparseIntArray;
    //   312: iload_2
    //   313: aload_1
    //   314: iload_2
    //   315: invokeinterface 321 2 0
    //   320: checkcast 323	android/hardware/Camera$Size
    //   323: getfield 326	android/hardware/Camera$Size:width	I
    //   326: invokevirtual 346	android/util/SparseIntArray:put	(II)V
    //   329: aload_0
    //   330: getfield 85	com/kwlopen/sdk/activity/CaptureVideo:heightArray	Landroid/util/SparseIntArray;
    //   333: iload_2
    //   334: aload_1
    //   335: iload_2
    //   336: invokeinterface 321 2 0
    //   341: checkcast 323	android/hardware/Camera$Size
    //   344: getfield 336	android/hardware/Camera$Size:height	I
    //   347: invokevirtual 346	android/util/SparseIntArray:put	(II)V
    //   350: iload_2
    //   351: iconst_1
    //   352: iadd
    //   353: istore_2
    //   354: goto -241 -> 113
    //   357: aload_0
    //   358: iconst_0
    //   359: putfield 95	com/kwlopen/sdk/activity/CaptureVideo:isVideoSizeSupport	Z
    //   362: goto -239 -> 123
    //   365: astore_1
    //   366: aload_1
    //   367: invokevirtual 347	java/io/IOException:printStackTrace	()V
    //   370: goto -191 -> 179
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	373	0	this	CaptureVideo
    //   97	18	1	localList	List
    //   199	1	1	localRuntimeException	RuntimeException
    //   224	111	1	localException	Exception
    //   365	2	1	localIOException	java.io.IOException
    //   24	330	2	i	int
    //   22	6	3	j	int
    // Exception table:
    //   from	to	target	type
    //   40	47	199	java/lang/RuntimeException
    //   0	23	224	java/lang/Exception
    //   30	35	224	java/lang/Exception
    //   40	47	224	java/lang/Exception
    //   47	98	224	java/lang/Exception
    //   102	111	224	java/lang/Exception
    //   113	123	224	java/lang/Exception
    //   123	165	224	java/lang/Exception
    //   165	179	224	java/lang/Exception
    //   179	198	224	java/lang/Exception
    //   200	221	224	java/lang/Exception
    //   235	243	224	java/lang/Exception
    //   246	350	224	java/lang/Exception
    //   357	362	224	java/lang/Exception
    //   366	370	224	java/lang/Exception
    //   165	179	365	java/io/IOException
  }
  
  private void initView()
  {
    this.vercode = getIntent().getStringExtra("vercode");
    this.HResolution = Integer.parseInt(getProperties(this, "HResolution"));
    this.VResolution = Integer.parseInt(getProperties(this, "VResolution"));
    this.FrameRate = Integer.parseInt(getProperties(this, "FrameRate"));
    this.layout = ((FrameLayout)findViewById(ResourceUtil.getId(this, "take_video_layout")));
    this.btnVideoButton = ((Button)findViewById(ResourceUtil.getId(this, "arc_hf_video_start")));
    this.btnStopRecord = ((Button)findViewById(ResourceUtil.getId(this, "arc_hf_video_stop")));
    this.timer = ((LinearLayout)findViewById(ResourceUtil.getId(this, "arc_hf_video_timer")));
    this.timerTextView = ((TextView)findViewById(ResourceUtil.getId(this, "arc_hf_video_timer_tv")));
    this.videoPlayFrameLayout = ((FrameLayout)findViewById(ResourceUtil.getId(this, "video_play_framelayout")));
    this.videoLogicFrameLayout = ((FrameLayout)findViewById(ResourceUtil.getId(this, "video_logic_framelayout")));
    this.userReadLayout = ((RelativeLayout)findViewById(ResourceUtil.getId(this, "user_read_layout")));
    this.recordBtnlayout = ((RelativeLayout)findViewById(ResourceUtil.getId(this, "record_btn_layout")));
    this.userReadTextView = ((TextView)findViewById(ResourceUtil.getId(this, "user_read_textview")));
    this.kuangkuangImageView = ((ImageView)findViewById(ResourceUtil.getId(this, "kuangkuang")));
    this.backBtn = ((ImageView)findViewById(ResourceUtil.getId(this, "back_btn")));
    this.userReadTextView.setText(this.vercode);
    this.timer.setVisibility(8);
    this.btnStopRecord.setOnClickListener(this);
    this.btnVideoButton.setOnClickListener(this);
    this.backBtn.setOnClickListener(this);
    initCamera();
  }
  
  private void showDialog()
  {
    new AlertDialog.Builder(this).setTitle("退出").setMessage("确定退出视频录制吗？").setPositiveButton("确定", new CaptureVideo.2(this)).setNegativeButton("取消", new CaptureVideo.3(this)).show();
  }
  
  /* Error */
  @SuppressLint({"NewApi"})
  private void startCamera()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 101	com/kwlopen/sdk/activity/CaptureVideo:perm	Z
    //   4: ifne +22 -> 26
    //   7: aload_0
    //   8: getfield 486	com/kwlopen/sdk/activity/CaptureVideo:context	Landroid/content/Context;
    //   11: aload_0
    //   12: ldc_w 488
    //   15: invokestatic 491	com/kwl/common/utils/ResourceUtil:getStringIdByName	(Landroid/content/Context;Ljava/lang/String;)I
    //   18: iconst_0
    //   19: invokestatic 497	android/widget/Toast:makeText	(Landroid/content/Context;II)Landroid/widget/Toast;
    //   22: invokevirtual 499	android/widget/Toast:show	()V
    //   25: return
    //   26: aload_0
    //   27: getfield 398	com/kwlopen/sdk/activity/CaptureVideo:btnVideoButton	Landroid/widget/Button;
    //   30: bipush 8
    //   32: invokevirtual 500	android/widget/Button:setVisibility	(I)V
    //   35: aload_0
    //   36: iconst_0
    //   37: putfield 91	com/kwlopen/sdk/activity/CaptureVideo:second	I
    //   40: aload_0
    //   41: iconst_0
    //   42: putfield 89	com/kwlopen/sdk/activity/CaptureVideo:minute	I
    //   45: aload_0
    //   46: getfield 220	com/kwlopen/sdk/activity/CaptureVideo:camera	Landroid/hardware/Camera;
    //   49: invokevirtual 503	android/hardware/Camera:startPreview	()V
    //   52: aload_0
    //   53: getfield 220	com/kwlopen/sdk/activity/CaptureVideo:camera	Landroid/hardware/Camera;
    //   56: invokevirtual 506	android/hardware/Camera:unlock	()V
    //   59: aload_0
    //   60: new 508	android/media/MediaRecorder
    //   63: dup
    //   64: invokespecial 509	android/media/MediaRecorder:<init>	()V
    //   67: putfield 146	com/kwlopen/sdk/activity/CaptureVideo:mediaRecorder	Landroid/media/MediaRecorder;
    //   70: aload_0
    //   71: getfield 146	com/kwlopen/sdk/activity/CaptureVideo:mediaRecorder	Landroid/media/MediaRecorder;
    //   74: aload_0
    //   75: getfield 220	com/kwlopen/sdk/activity/CaptureVideo:camera	Landroid/hardware/Camera;
    //   78: invokevirtual 513	android/media/MediaRecorder:setCamera	(Landroid/hardware/Camera;)V
    //   81: aload_0
    //   82: getfield 146	com/kwlopen/sdk/activity/CaptureVideo:mediaRecorder	Landroid/media/MediaRecorder;
    //   85: iconst_1
    //   86: invokevirtual 516	android/media/MediaRecorder:setAudioSource	(I)V
    //   89: aload_0
    //   90: getfield 146	com/kwlopen/sdk/activity/CaptureVideo:mediaRecorder	Landroid/media/MediaRecorder;
    //   93: iconst_1
    //   94: invokevirtual 519	android/media/MediaRecorder:setVideoSource	(I)V
    //   97: aload_0
    //   98: getfield 146	com/kwlopen/sdk/activity/CaptureVideo:mediaRecorder	Landroid/media/MediaRecorder;
    //   101: iconst_0
    //   102: invokevirtual 522	android/media/MediaRecorder:setOutputFormat	(I)V
    //   105: aload_0
    //   106: getfield 146	com/kwlopen/sdk/activity/CaptureVideo:mediaRecorder	Landroid/media/MediaRecorder;
    //   109: iconst_3
    //   110: invokevirtual 525	android/media/MediaRecorder:setAudioEncoder	(I)V
    //   113: aload_0
    //   114: getfield 146	com/kwlopen/sdk/activity/CaptureVideo:mediaRecorder	Landroid/media/MediaRecorder;
    //   117: iconst_2
    //   118: invokevirtual 528	android/media/MediaRecorder:setVideoEncoder	(I)V
    //   121: aload_0
    //   122: getfield 146	com/kwlopen/sdk/activity/CaptureVideo:mediaRecorder	Landroid/media/MediaRecorder;
    //   125: sipush 270
    //   128: invokevirtual 531	android/media/MediaRecorder:setOrientationHint	(I)V
    //   131: aload_0
    //   132: getfield 146	com/kwlopen/sdk/activity/CaptureVideo:mediaRecorder	Landroid/media/MediaRecorder;
    //   135: aload_0
    //   136: getfield 374	com/kwlopen/sdk/activity/CaptureVideo:HResolution	I
    //   139: aload_0
    //   140: getfield 377	com/kwlopen/sdk/activity/CaptureVideo:VResolution	I
    //   143: invokevirtual 534	android/media/MediaRecorder:setVideoSize	(II)V
    //   146: aload_0
    //   147: getfield 146	com/kwlopen/sdk/activity/CaptureVideo:mediaRecorder	Landroid/media/MediaRecorder;
    //   150: ldc_w 535
    //   153: invokevirtual 538	android/media/MediaRecorder:setVideoEncodingBitRate	(I)V
    //   156: aload_0
    //   157: getfield 146	com/kwlopen/sdk/activity/CaptureVideo:mediaRecorder	Landroid/media/MediaRecorder;
    //   160: new 313	java/lang/StringBuilder
    //   163: dup
    //   164: aload_0
    //   165: getfield 540	com/kwlopen/sdk/activity/CaptureVideo:path	Ljava/lang/String;
    //   168: invokestatic 544	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   171: invokespecial 317	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   174: aload_0
    //   175: getfield 546	com/kwlopen/sdk/activity/CaptureVideo:fileName	Ljava/lang/String;
    //   178: invokevirtual 549	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   181: invokevirtual 331	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   184: invokevirtual 552	android/media/MediaRecorder:setOutputFile	(Ljava/lang/String;)V
    //   187: aload_0
    //   188: getfield 146	com/kwlopen/sdk/activity/CaptureVideo:mediaRecorder	Landroid/media/MediaRecorder;
    //   191: aload_0
    //   192: getfield 227	com/kwlopen/sdk/activity/CaptureVideo:preview	Lcom/kwlopen/sdk/activity/CameraPreview;
    //   195: invokevirtual 275	com/kwlopen/sdk/activity/CameraPreview:getHolder	()Landroid/view/SurfaceHolder;
    //   198: invokeinterface 558 1 0
    //   203: invokevirtual 561	android/media/MediaRecorder:setPreviewDisplay	(Landroid/view/Surface;)V
    //   206: aload_0
    //   207: getfield 146	com/kwlopen/sdk/activity/CaptureVideo:mediaRecorder	Landroid/media/MediaRecorder;
    //   210: aload_0
    //   211: getfield 99	com/kwlopen/sdk/activity/CaptureVideo:limit	I
    //   214: sipush 10000
    //   217: imul
    //   218: invokevirtual 564	android/media/MediaRecorder:setMaxDuration	(I)V
    //   221: aload_0
    //   222: getfield 146	com/kwlopen/sdk/activity/CaptureVideo:mediaRecorder	Landroid/media/MediaRecorder;
    //   225: invokevirtual 567	android/media/MediaRecorder:prepare	()V
    //   228: aload_0
    //   229: getfield 194	com/kwlopen/sdk/activity/CaptureVideo:timer	Landroid/widget/LinearLayout;
    //   232: iconst_0
    //   233: invokevirtual 200	android/widget/LinearLayout:setVisibility	(I)V
    //   236: aload_0
    //   237: getfield 146	com/kwlopen/sdk/activity/CaptureVideo:mediaRecorder	Landroid/media/MediaRecorder;
    //   240: invokevirtual 570	android/media/MediaRecorder:start	()V
    //   243: aload_0
    //   244: invokespecial 573	com/kwlopen/sdk/activity/CaptureVideo:startTimer	()V
    //   247: aload_0
    //   248: ldc_w 575
    //   251: iconst_0
    //   252: invokestatic 578	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   255: invokevirtual 499	android/widget/Toast:show	()V
    //   258: return
    //   259: astore_1
    //   260: aload_0
    //   261: invokevirtual 581	com/kwlopen/sdk/activity/CaptureVideo:finish	()V
    //   264: aload_0
    //   265: ldc_w 583
    //   268: iconst_0
    //   269: invokestatic 578	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   272: invokevirtual 499	android/widget/Toast:show	()V
    //   275: aload_1
    //   276: invokevirtual 584	java/lang/IllegalStateException:printStackTrace	()V
    //   279: return
    //   280: astore_1
    //   281: aload_1
    //   282: invokevirtual 584	java/lang/IllegalStateException:printStackTrace	()V
    //   285: goto -49 -> 236
    //   288: astore_1
    //   289: aload_1
    //   290: invokevirtual 347	java/io/IOException:printStackTrace	()V
    //   293: goto -57 -> 236
    //   296: astore_1
    //   297: aload_1
    //   298: invokevirtual 311	java/lang/Exception:printStackTrace	()V
    //   301: goto -65 -> 236
    //   304: astore_1
    //   305: aload_0
    //   306: invokevirtual 581	com/kwlopen/sdk/activity/CaptureVideo:finish	()V
    //   309: aload_1
    //   310: invokevirtual 311	java/lang/Exception:printStackTrace	()V
    //   313: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	314	0	this	CaptureVideo
    //   259	17	1	localIllegalStateException1	IllegalStateException
    //   280	2	1	localIllegalStateException2	IllegalStateException
    //   288	2	1	localIOException	java.io.IOException
    //   296	2	1	localException1	Exception
    //   304	6	1	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   236	258	259	java/lang/IllegalStateException
    //   221	236	280	java/lang/IllegalStateException
    //   221	236	288	java/io/IOException
    //   221	236	296	java/lang/Exception
    //   236	258	304	java/lang/Exception
  }
  
  private void startTimer()
  {
    cancelTimer();
    this.second = 0;
    this.timerCount = new Timer();
    this.timerCount.schedule(new CaptureVideo.4(this), 1000L, 1000L);
  }
  
  private void stopRecord()
  {
    cancelTimer();
    try
    {
      this.mediaRecorder.setOnErrorListener(null);
      this.mediaRecorder.stop();
      this.mediaRecorder.release();
      this.mediaRecorder = null;
      this.camera.stopPreview();
      this.camera.lock();
      this.camera.release();
      this.camera = null;
      this.layout.removeView(this.preview);
      this.preview = null;
      Toast.makeText(this, "录制完成，已保存", 0).show();
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  private void stopVideo()
  {
    stopRecord();
    Intent localIntent = new Intent();
    localIntent.putExtra("videoPath", this.path + this.fileName);
    localIntent.setClass(this, VideoPlayActivity.class);
    startActivityForResult(localIntent, 7);
  }
  
  @SuppressLint({"NewApi"})
  private void submitFocusAreaRect(Rect paramRect)
  {
    Camera.Parameters localParameters = this.camera.getParameters();
    if ((localParameters == null) || (localParameters.getMaxNumFocusAreas() == 0)) {
      return;
    }
    Rect localRect = new Rect();
    localRect.set(paramRect.left * 2000 / this.preview.getWidth() - 1000, paramRect.top * 2000 / this.preview.getHeight() - 1000, paramRect.right * 2000 / this.preview.getWidth() - 1000, paramRect.bottom * 2000 / this.preview.getHeight() - 1000);
    paramRect = new ArrayList();
    paramRect.add(new Camera.Area(localRect, 1000));
    localParameters.setFocusMode("auto");
    localParameters.setFocusAreas(paramRect);
    try
    {
      this.camera.setParameters(localParameters);
      this.camera.autoFocus(this.myAutoFocusCallback);
      return;
    }
    catch (Exception paramRect)
    {
      paramRect.printStackTrace();
    }
  }
  
  public String format(int paramInt)
  {
    String str2 = paramInt;
    String str1 = str2;
    if (str2.length() == 1) {
      str1 = "0" + str2;
    }
    return str1;
  }
  
  public String getProperties(Context paramContext, String paramString)
  {
    Object localObject = null;
    Properties localProperties = new Properties();
    try
    {
      localProperties.load(paramContext.getAssets().open("property.properties"));
      paramContext = localProperties.getProperty(paramString);
      return paramContext.trim();
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        paramContext.printStackTrace();
        paramContext = (Context)localObject;
      }
    }
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    LogUtil.writeLog("onActivityResult cordovaOlugin");
    if ((paramInt2 == -1) && (paramInt1 == 7))
    {
      paramIntent = paramIntent.getStringExtra("type");
      if (!"1".equals(paramIntent)) {
        break label91;
      }
      this.lastIntent.putExtra("videoPath", this.path + this.fileName);
      setResult(-1, this.lastIntent);
      finish();
    }
    label91:
    do
    {
      return;
      if ("2".equals(paramIntent))
      {
        this.btnVideoButton.setVisibility(0);
        this.btnStopRecord.setVisibility(8);
        this.timer.setVisibility(8);
        initCamera();
        return;
      }
    } while (!"3".equals(paramIntent));
    finish();
  }
  
  public void onClick(View paramView)
  {
    if (paramView.getId() == ResourceUtil.getId(this, "arc_hf_video_start")) {
      startCamera();
    }
    do
    {
      do
      {
        return;
        if (paramView.getId() == ResourceUtil.getId(this, "arc_hf_video_stop"))
        {
          stopVideo();
          return;
        }
      } while (paramView.getId() == ResourceUtil.getId(this, "start_play_btn"));
      if (paramView.getId() == ResourceUtil.getId(this, "upload_record_layout"))
      {
        finish();
        return;
      }
    } while (paramView.getId() != ResourceUtil.getId(this, "back_btn"));
    showDialog();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    setContentView(ResourceUtil.getLayoutIdByName(this, "kwlopen_capture_video"));
    this.context = this;
    this.path = (getSDPath() + "/");
    this.fileName = "video.mp4";
    initView();
    this.lastIntent = getIntent();
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if (this.mediaRecorder != null) {
      this.mediaRecorder.release();
    }
    if (this.camera != null)
    {
      this.camera.lock();
      this.camera.release();
    }
    cancelTimer();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      showDialog();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPause()
  {
    super.onPause();
    if (this.mediaRecorder != null)
    {
      stopRecord();
      Intent localIntent = new Intent();
      localIntent.putExtra("videoPath", this.path + this.fileName);
      localIntent.setClass(this, VideoPlayActivity.class);
      startActivityForResult(localIntent, 7);
    }
  }
  
  protected void onResume()
  {
    super.onResume();
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
  }
  
  protected void onStart()
  {
    super.onStart();
  }
  
  protected void onStop()
  {
    super.onStop();
  }
  
  @SuppressLint({"NewApi"})
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if ((paramMotionEvent.getAction() == 1) && (this.camera != null) && (this.isVideoAuto))
    {
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      float f3 = paramMotionEvent.getTouchMajor();
      float f4 = paramMotionEvent.getTouchMinor();
      submitFocusAreaRect(new Rect((int)(f1 - f3 / 2.0F), (int)(f2 - f4 / 2.0F), (int)(f1 + f3 / 2.0F), (int)(f2 + f4 / 2.0F)));
    }
    return false;
  }
  
  public String paserTime(int paramInt)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    int i;
    if (paramInt / 3600 < 10)
    {
      new StringBuilder("0").append(paramInt / 3600).toString();
      i = paramInt % 3600 / 60;
      if (i >= 10) {
        break label154;
      }
      str = "0" + i + ":";
      label82:
      localStringBuffer.append(str);
      paramInt = paramInt % 3600 % 60;
      if (paramInt >= 10) {
        break label179;
      }
    }
    label154:
    label179:
    for (String str = "0" + paramInt;; str = paramInt)
    {
      localStringBuffer.append(str);
      return localStringBuffer.toString();
      new StringBuilder().append(paramInt / 3600).toString();
      break;
      str = i + ":";
      break label82;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwlopen\sdk\activity\CaptureVideo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */