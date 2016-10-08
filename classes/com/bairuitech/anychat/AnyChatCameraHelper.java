package com.bairuitech.anychat;

import android.content.Context;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.Size;
import android.view.Display;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.WindowManager;

public class AnyChatCameraHelper
  implements SurfaceHolder.Callback
{
  private static final String TAG = "ANYCHAT";
  public final int CAMERA_FACING_BACK = 0;
  public final int CAMERA_FACING_FRONT = 1;
  private boolean bIfPreview = false;
  private boolean bNeedCapture = false;
  private SurfaceHolder currentHolder = null;
  private final int iCaptureBuffers = 3;
  private int iCurrentCameraId = 0;
  private Camera mCamera = null;
  private int mCameraFacing = 0;
  private int mCameraOrientation = 0;
  private Context mContext = null;
  private int mDeviceOrientation = 0;
  private int mVideoPixfmt = -1;
  
  private int getDeviceOrientation()
  {
    if (this.mContext != null)
    {
      switch (((WindowManager)this.mContext.getSystemService("window")).getDefaultDisplay().getRotation())
      {
      default: 
        return 0;
      case 1: 
        return 90;
      case 2: 
        return 180;
      }
      return 270;
    }
    return 0;
  }
  
  /* Error */
  private void initCamera()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 34	com/bairuitech/anychat/AnyChatCameraHelper:mCamera	Landroid/hardware/Camera;
    //   4: ifnonnull +4 -> 8
    //   7: return
    //   8: aload_0
    //   9: getfield 36	com/bairuitech/anychat/AnyChatCameraHelper:bIfPreview	Z
    //   12: ifeq +18 -> 30
    //   15: aload_0
    //   16: getfield 34	com/bairuitech/anychat/AnyChatCameraHelper:mCamera	Landroid/hardware/Camera;
    //   19: invokevirtual 92	android/hardware/Camera:stopPreview	()V
    //   22: aload_0
    //   23: getfield 34	com/bairuitech/anychat/AnyChatCameraHelper:mCamera	Landroid/hardware/Camera;
    //   26: aconst_null
    //   27: invokevirtual 96	android/hardware/Camera:setPreviewCallbackWithBuffer	(Landroid/hardware/Camera$PreviewCallback;)V
    //   30: new 98	android/hardware/Camera$CameraInfo
    //   33: dup
    //   34: invokespecial 99	android/hardware/Camera$CameraInfo:<init>	()V
    //   37: astore_1
    //   38: aload_0
    //   39: getfield 40	com/bairuitech/anychat/AnyChatCameraHelper:iCurrentCameraId	I
    //   42: aload_1
    //   43: invokestatic 103	android/hardware/Camera:getCameraInfo	(ILandroid/hardware/Camera$CameraInfo;)V
    //   46: aload_0
    //   47: aload_1
    //   48: getfield 106	android/hardware/Camera$CameraInfo:orientation	I
    //   51: putfield 50	com/bairuitech/anychat/AnyChatCameraHelper:mCameraOrientation	I
    //   54: aload_0
    //   55: aload_1
    //   56: getfield 109	android/hardware/Camera$CameraInfo:facing	I
    //   59: putfield 52	com/bairuitech/anychat/AnyChatCameraHelper:mCameraFacing	I
    //   62: aload_0
    //   63: aload_0
    //   64: invokespecial 111	com/bairuitech/anychat/AnyChatCameraHelper:getDeviceOrientation	()I
    //   67: putfield 54	com/bairuitech/anychat/AnyChatCameraHelper:mDeviceOrientation	I
    //   70: ldc 10
    //   72: new 113	java/lang/StringBuilder
    //   75: dup
    //   76: ldc 115
    //   78: invokespecial 118	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   81: aload_0
    //   82: getfield 54	com/bairuitech/anychat/AnyChatCameraHelper:mDeviceOrientation	I
    //   85: invokevirtual 122	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   88: ldc 124
    //   90: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   93: aload_0
    //   94: getfield 50	com/bairuitech/anychat/AnyChatCameraHelper:mCameraOrientation	I
    //   97: invokevirtual 122	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   100: ldc -127
    //   102: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   105: aload_0
    //   106: getfield 52	com/bairuitech/anychat/AnyChatCameraHelper:mCameraFacing	I
    //   109: invokevirtual 122	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   112: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   115: invokestatic 139	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;)I
    //   118: pop
    //   119: aload_0
    //   120: invokevirtual 142	com/bairuitech/anychat/AnyChatCameraHelper:setCameraDisplayOrientation	()V
    //   123: aload_0
    //   124: getfield 34	com/bairuitech/anychat/AnyChatCameraHelper:mCamera	Landroid/hardware/Camera;
    //   127: invokevirtual 146	android/hardware/Camera:getParameters	()Landroid/hardware/Camera$Parameters;
    //   130: astore_2
    //   131: aload_0
    //   132: getfield 34	com/bairuitech/anychat/AnyChatCameraHelper:mCamera	Landroid/hardware/Camera;
    //   135: invokevirtual 146	android/hardware/Camera:getParameters	()Landroid/hardware/Camera$Parameters;
    //   138: invokevirtual 152	android/hardware/Camera$Parameters:getSupportedPreviewSizes	()Ljava/util/List;
    //   141: astore_3
    //   142: bipush 38
    //   144: invokestatic 158	com/bairuitech/anychat/AnyChatCoreSDK:GetSDKOptionInt	(I)I
    //   147: istore 6
    //   149: bipush 39
    //   151: invokestatic 158	com/bairuitech/anychat/AnyChatCoreSDK:GetSDKOptionInt	(I)I
    //   154: istore 7
    //   156: iconst_0
    //   157: istore 5
    //   159: iload 5
    //   161: aload_3
    //   162: invokeinterface 163 1 0
    //   167: if_icmplt +217 -> 384
    //   170: iconst_0
    //   171: istore 5
    //   173: iload 5
    //   175: ifne +13 -> 188
    //   178: aload_2
    //   179: sipush 320
    //   182: sipush 240
    //   185: invokevirtual 167	android/hardware/Camera$Parameters:setPreviewSize	(II)V
    //   188: aload_2
    //   189: invokevirtual 170	android/hardware/Camera$Parameters:getSupportedPreviewFpsRange	()Ljava/util/List;
    //   192: astore_3
    //   193: iconst_0
    //   194: istore 5
    //   196: iload 5
    //   198: aload_3
    //   199: invokeinterface 163 1 0
    //   204: if_icmplt +227 -> 431
    //   207: aload_2
    //   208: bipush 17
    //   210: invokevirtual 174	android/hardware/Camera$Parameters:setPreviewFormat	(I)V
    //   213: aload_0
    //   214: getfield 34	com/bairuitech/anychat/AnyChatCameraHelper:mCamera	Landroid/hardware/Camera;
    //   217: aload_2
    //   218: invokevirtual 178	android/hardware/Camera:setParameters	(Landroid/hardware/Camera$Parameters;)V
    //   221: aload_0
    //   222: getfield 34	com/bairuitech/anychat/AnyChatCameraHelper:mCamera	Landroid/hardware/Camera;
    //   225: invokevirtual 146	android/hardware/Camera:getParameters	()Landroid/hardware/Camera$Parameters;
    //   228: invokevirtual 182	android/hardware/Camera$Parameters:getPreviewSize	()Landroid/hardware/Camera$Size;
    //   231: astore_3
    //   232: aload_3
    //   233: getfield 187	android/hardware/Camera$Size:width	I
    //   236: istore 5
    //   238: aload_3
    //   239: getfield 190	android/hardware/Camera$Size:height	I
    //   242: iload 5
    //   244: imul
    //   245: bipush 17
    //   247: invokestatic 195	android/graphics/ImageFormat:getBitsPerPixel	(I)I
    //   250: imul
    //   251: bipush 8
    //   253: idiv
    //   254: istore 6
    //   256: iconst_0
    //   257: istore 5
    //   259: iload 5
    //   261: iconst_3
    //   262: if_icmplt +217 -> 479
    //   265: aload_0
    //   266: getfield 34	com/bairuitech/anychat/AnyChatCameraHelper:mCamera	Landroid/hardware/Camera;
    //   269: new 197	com/bairuitech/anychat/AnyChatCameraHelper$1
    //   272: dup
    //   273: aload_0
    //   274: invokespecial 200	com/bairuitech/anychat/AnyChatCameraHelper$1:<init>	(Lcom/bairuitech/anychat/AnyChatCameraHelper;)V
    //   277: invokevirtual 96	android/hardware/Camera:setPreviewCallbackWithBuffer	(Landroid/hardware/Camera$PreviewCallback;)V
    //   280: aload_0
    //   281: getfield 34	com/bairuitech/anychat/AnyChatCameraHelper:mCamera	Landroid/hardware/Camera;
    //   284: invokevirtual 203	android/hardware/Camera:startPreview	()V
    //   287: aload_0
    //   288: iconst_1
    //   289: putfield 36	com/bairuitech/anychat/AnyChatCameraHelper:bIfPreview	Z
    //   292: aload_0
    //   293: getfield 34	com/bairuitech/anychat/AnyChatCameraHelper:mCamera	Landroid/hardware/Camera;
    //   296: invokevirtual 146	android/hardware/Camera:getParameters	()Landroid/hardware/Camera$Parameters;
    //   299: invokevirtual 206	android/hardware/Camera$Parameters:getPreviewFormat	()I
    //   302: bipush 17
    //   304: if_icmpne +195 -> 499
    //   307: aload_0
    //   308: bipush 8
    //   310: putfield 44	com/bairuitech/anychat/AnyChatCameraHelper:mVideoPixfmt	I
    //   313: aload_0
    //   314: getfield 34	com/bairuitech/anychat/AnyChatCameraHelper:mCamera	Landroid/hardware/Camera;
    //   317: invokevirtual 146	android/hardware/Camera:getParameters	()Landroid/hardware/Camera$Parameters;
    //   320: invokevirtual 182	android/hardware/Camera$Parameters:getPreviewSize	()Landroid/hardware/Camera$Size;
    //   323: astore_3
    //   324: bipush 26
    //   326: iconst_1
    //   327: invokestatic 210	com/bairuitech/anychat/AnyChatCoreSDK:SetSDKOptionInt	(II)I
    //   330: pop
    //   331: iconst_2
    //   332: newarray <illegal type>
    //   334: astore 4
    //   336: aload_2
    //   337: aload 4
    //   339: invokevirtual 214	android/hardware/Camera$Parameters:getPreviewFpsRange	([I)V
    //   342: aload_0
    //   343: getfield 44	com/bairuitech/anychat/AnyChatCameraHelper:mVideoPixfmt	I
    //   346: aload_3
    //   347: getfield 187	android/hardware/Camera$Size:width	I
    //   350: aload_3
    //   351: getfield 190	android/hardware/Camera$Size:height	I
    //   354: aload 4
    //   356: iconst_1
    //   357: iaload
    //   358: sipush 1000
    //   361: idiv
    //   362: iconst_0
    //   363: invokestatic 218	com/bairuitech/anychat/AnyChatCoreSDK:SetInputVideoFormat	(IIIII)I
    //   366: pop
    //   367: bipush 100
    //   369: aload_1
    //   370: getfield 109	android/hardware/Camera$CameraInfo:facing	I
    //   373: invokestatic 210	com/bairuitech/anychat/AnyChatCoreSDK:SetSDKOptionInt	(II)I
    //   376: pop
    //   377: return
    //   378: astore_1
    //   379: aload_1
    //   380: invokevirtual 221	java/lang/Exception:printStackTrace	()V
    //   383: return
    //   384: aload_3
    //   385: iload 5
    //   387: invokeinterface 225 2 0
    //   392: checkcast 184	android/hardware/Camera$Size
    //   395: astore 4
    //   397: aload 4
    //   399: getfield 187	android/hardware/Camera$Size:width	I
    //   402: iload 6
    //   404: if_icmpne +225 -> 629
    //   407: aload 4
    //   409: getfield 190	android/hardware/Camera$Size:height	I
    //   412: iload 7
    //   414: if_icmpne +215 -> 629
    //   417: aload_2
    //   418: iload 6
    //   420: iload 7
    //   422: invokevirtual 167	android/hardware/Camera$Parameters:setPreviewSize	(II)V
    //   425: iconst_1
    //   426: istore 5
    //   428: goto -255 -> 173
    //   431: aload_3
    //   432: iload 5
    //   434: invokeinterface 225 2 0
    //   439: checkcast 227	[I
    //   442: astore 4
    //   444: aload 4
    //   446: iconst_0
    //   447: iaload
    //   448: sipush 25000
    //   451: if_icmplt +187 -> 638
    //   454: aload 4
    //   456: iconst_1
    //   457: iaload
    //   458: sipush 25000
    //   461: if_icmplt +177 -> 638
    //   464: aload_2
    //   465: aload 4
    //   467: iconst_0
    //   468: iaload
    //   469: aload 4
    //   471: iconst_1
    //   472: iaload
    //   473: invokevirtual 230	android/hardware/Camera$Parameters:setPreviewFpsRange	(II)V
    //   476: goto -269 -> 207
    //   479: aload_0
    //   480: getfield 34	com/bairuitech/anychat/AnyChatCameraHelper:mCamera	Landroid/hardware/Camera;
    //   483: iload 6
    //   485: newarray <illegal type>
    //   487: invokevirtual 234	android/hardware/Camera:addCallbackBuffer	([B)V
    //   490: iload 5
    //   492: iconst_1
    //   493: iadd
    //   494: istore 5
    //   496: goto -237 -> 259
    //   499: aload_0
    //   500: getfield 34	com/bairuitech/anychat/AnyChatCameraHelper:mCamera	Landroid/hardware/Camera;
    //   503: invokevirtual 146	android/hardware/Camera:getParameters	()Landroid/hardware/Camera$Parameters;
    //   506: invokevirtual 206	android/hardware/Camera$Parameters:getPreviewFormat	()I
    //   509: ldc -21
    //   511: if_icmpne +11 -> 522
    //   514: aload_0
    //   515: iconst_2
    //   516: putfield 44	com/bairuitech/anychat/AnyChatCameraHelper:mVideoPixfmt	I
    //   519: goto -206 -> 313
    //   522: aload_0
    //   523: getfield 34	com/bairuitech/anychat/AnyChatCameraHelper:mCamera	Landroid/hardware/Camera;
    //   526: invokevirtual 146	android/hardware/Camera:getParameters	()Landroid/hardware/Camera$Parameters;
    //   529: invokevirtual 206	android/hardware/Camera$Parameters:getPreviewFormat	()I
    //   532: bipush 16
    //   534: if_icmpne +12 -> 546
    //   537: aload_0
    //   538: bipush 9
    //   540: putfield 44	com/bairuitech/anychat/AnyChatCameraHelper:mVideoPixfmt	I
    //   543: goto -230 -> 313
    //   546: aload_0
    //   547: getfield 34	com/bairuitech/anychat/AnyChatCameraHelper:mCamera	Landroid/hardware/Camera;
    //   550: invokevirtual 146	android/hardware/Camera:getParameters	()Landroid/hardware/Camera$Parameters;
    //   553: invokevirtual 206	android/hardware/Camera$Parameters:getPreviewFormat	()I
    //   556: bipush 20
    //   558: if_icmpne +11 -> 569
    //   561: aload_0
    //   562: iconst_3
    //   563: putfield 44	com/bairuitech/anychat/AnyChatCameraHelper:mVideoPixfmt	I
    //   566: goto -253 -> 313
    //   569: aload_0
    //   570: getfield 34	com/bairuitech/anychat/AnyChatCameraHelper:mCamera	Landroid/hardware/Camera;
    //   573: invokevirtual 146	android/hardware/Camera:getParameters	()Landroid/hardware/Camera$Parameters;
    //   576: invokevirtual 206	android/hardware/Camera$Parameters:getPreviewFormat	()I
    //   579: iconst_4
    //   580: if_icmpne +11 -> 591
    //   583: aload_0
    //   584: iconst_5
    //   585: putfield 44	com/bairuitech/anychat/AnyChatCameraHelper:mVideoPixfmt	I
    //   588: goto -275 -> 313
    //   591: ldc 10
    //   593: new 113	java/lang/StringBuilder
    //   596: dup
    //   597: ldc -19
    //   599: invokespecial 118	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   602: aload_0
    //   603: getfield 34	com/bairuitech/anychat/AnyChatCameraHelper:mCamera	Landroid/hardware/Camera;
    //   606: invokevirtual 146	android/hardware/Camera:getParameters	()Landroid/hardware/Camera$Parameters;
    //   609: invokevirtual 206	android/hardware/Camera$Parameters:getPreviewFormat	()I
    //   612: invokevirtual 122	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   615: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   618: invokestatic 240	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   621: pop
    //   622: goto -309 -> 313
    //   625: astore_3
    //   626: goto -405 -> 221
    //   629: iload 5
    //   631: iconst_1
    //   632: iadd
    //   633: istore 5
    //   635: goto -476 -> 159
    //   638: iload 5
    //   640: iconst_1
    //   641: iadd
    //   642: istore 5
    //   644: goto -448 -> 196
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	647	0	this	AnyChatCameraHelper
    //   37	333	1	localCameraInfo	Camera.CameraInfo
    //   378	2	1	localException1	Exception
    //   130	335	2	localParameters	Camera.Parameters
    //   141	291	3	localObject1	Object
    //   625	1	3	localException2	Exception
    //   334	136	4	localObject2	Object
    //   157	486	5	i	int
    //   147	337	6	j	int
    //   154	267	7	k	int
    // Exception table:
    //   from	to	target	type
    //   8	30	378	java/lang/Exception
    //   30	156	378	java/lang/Exception
    //   159	170	378	java/lang/Exception
    //   178	188	378	java/lang/Exception
    //   188	193	378	java/lang/Exception
    //   196	207	378	java/lang/Exception
    //   207	213	378	java/lang/Exception
    //   221	256	378	java/lang/Exception
    //   265	313	378	java/lang/Exception
    //   313	377	378	java/lang/Exception
    //   384	425	378	java/lang/Exception
    //   431	444	378	java/lang/Exception
    //   464	476	378	java/lang/Exception
    //   479	490	378	java/lang/Exception
    //   499	519	378	java/lang/Exception
    //   522	543	378	java/lang/Exception
    //   546	566	378	java/lang/Exception
    //   569	588	378	java/lang/Exception
    //   591	622	378	java/lang/Exception
    //   213	221	625	java/lang/Exception
  }
  
  public void CameraAutoFocus()
  {
    if ((this.mCamera == null) || (!this.bIfPreview)) {
      return;
    }
    try
    {
      this.mCamera.autoFocus(null);
      return;
    }
    catch (Exception localException) {}
  }
  
  public void CaptureControl(boolean paramBoolean)
  {
    this.bNeedCapture = paramBoolean;
    if ((this.bNeedCapture) && (this.mVideoPixfmt != -1)) {}
    try
    {
      Camera.Size localSize = this.mCamera.getParameters().getPreviewSize();
      AnyChatCoreSDK.SetSDKOptionInt(26, 1);
      AnyChatCoreSDK.SetInputVideoFormat(this.mVideoPixfmt, localSize.width, localSize.height, this.mCamera.getParameters().getPreviewFrameRate(), 0);
      AnyChatCoreSDK.SetSDKOptionInt(100, this.mCameraFacing);
      return;
    }
    catch (Exception localException) {}
    AnyChatCoreSDK.SetSDKOptionInt(26, 0);
    return;
  }
  
  public int GetCameraNumber()
  {
    try
    {
      int i = Camera.getNumberOfCameras();
      return i;
    }
    catch (Exception localException) {}
    return 0;
  }
  
  public void SelectCamera(int paramInt)
  {
    try
    {
      if ((this.iCurrentCameraId != paramInt) && (Camera.getNumberOfCameras() > paramInt))
      {
        if (this.currentHolder == null) {
          return;
        }
        this.iCurrentCameraId = paramInt;
        if (this.mCamera != null)
        {
          this.mCamera.stopPreview();
          this.mCamera.setPreviewCallbackWithBuffer(null);
          this.bIfPreview = false;
          this.mVideoPixfmt = -1;
          this.mCamera.release();
          this.mCamera = null;
        }
        this.mCamera = Camera.open(paramInt);
        this.mCamera.setPreviewDisplay(this.currentHolder);
        initCamera();
        return;
      }
    }
    catch (Exception localException)
    {
      if (this.mCamera != null)
      {
        this.mCamera.release();
        this.mCamera = null;
        this.mVideoPixfmt = -1;
      }
    }
  }
  
  public void SelectVideoCapture(int paramInt)
  {
    int i = 0;
    for (;;)
    {
      if (i >= Camera.getNumberOfCameras()) {
        return;
      }
      Camera.CameraInfo localCameraInfo = new Camera.CameraInfo();
      Camera.getCameraInfo(i, localCameraInfo);
      if (localCameraInfo.facing == paramInt)
      {
        this.iCurrentCameraId = i;
        return;
      }
      i += 1;
    }
  }
  
  public void SetContext(Context paramContext)
  {
    this.mContext = paramContext;
  }
  
  public void SwitchCamera()
  {
    int i = 1;
    try
    {
      if (Camera.getNumberOfCameras() == 1) {
        return;
      }
      if (this.currentHolder == null) {
        return;
      }
      if (this.iCurrentCameraId != 0) {
        break label126;
      }
    }
    catch (Exception localException)
    {
      while (this.mCamera != null)
      {
        this.mCamera.release();
        this.mCamera = null;
        this.mVideoPixfmt = -1;
        return;
        i = 0;
      }
    }
    this.iCurrentCameraId = i;
    if (this.mCamera != null)
    {
      this.mCamera.stopPreview();
      this.mCamera.setPreviewCallbackWithBuffer(null);
      this.bIfPreview = false;
      this.mVideoPixfmt = -1;
      this.mCamera.release();
      this.mCamera = null;
    }
    this.mCamera = Camera.open(this.iCurrentCameraId);
    this.mCamera.setPreviewDisplay(this.currentHolder);
    initCamera();
    return;
    label126:
  }
  
  public void setCameraDisplayOrientation()
  {
    if (this.mContext == null) {
      return;
    }
    for (;;)
    {
      try
      {
        Camera.CameraInfo localCameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(this.iCurrentCameraId, localCameraInfo);
        switch (((WindowManager)this.mContext.getSystemService("window")).getDefaultDisplay().getRotation())
        {
        default: 
          if (localCameraInfo.facing == 1)
          {
            i = (360 - (i + localCameraInfo.orientation) % 360) % 360;
            this.mCamera.setDisplayOrientation(i);
            return;
          }
          i = (localCameraInfo.orientation - i + 360) % 360;
          continue;
          i = 0;
          break;
        case 0: 
          i = 0;
        }
      }
      catch (Exception localException)
      {
        return;
      }
      continue;
      int i = 90;
      continue;
      i = 180;
      continue;
      i = 270;
    }
  }
  
  public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    try
    {
      this.mCamera = Camera.open(this.iCurrentCameraId);
      this.currentHolder = paramSurfaceHolder;
      this.mCamera.setPreviewDisplay(paramSurfaceHolder);
      initCamera();
      return;
    }
    catch (Exception paramSurfaceHolder)
    {
      while (this.mCamera == null) {}
      this.mCamera.release();
      this.mCamera = null;
      this.mVideoPixfmt = -1;
    }
  }
  
  public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    if (this.mCamera != null) {}
    try
    {
      this.mCamera.stopPreview();
      this.mCamera.setPreviewCallbackWithBuffer(null);
      this.bIfPreview = false;
      this.mCamera.release();
      this.mCamera = null;
      this.currentHolder = null;
      this.mVideoPixfmt = -1;
      return;
    }
    catch (Exception paramSurfaceHolder)
    {
      for (;;)
      {
        this.mCamera = null;
        this.bIfPreview = false;
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\bairuitech\anychat\AnyChatCameraHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */