package com.kwlopen.sdk.camera;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.hardware.Camera.Area;
import android.hardware.Camera.AutoFocusCallback;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.Size;
import android.media.ToneGenerator;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.Toast;
import com.kwl.common.utils.ResourceUtil;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

@SuppressLint({"NewApi"})
public class CameraHelper
{
  private static CameraHelper helper;
  private final String TAG = "CameraHelper";
  private Camera camera;
  private boolean isPreviewing;
  private Camera.Size pictureSize;
  private int screenW;
  private float surfaceHeight;
  private MaskSurfaceView surfaceView;
  private float surfaceWidth;
  private ToneGenerator tone;
  
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
  
  private Bitmap cutImage(byte[] paramArrayOfByte)
  {
    Bitmap localBitmap = BitmapFactory.decodeByteArray(paramArrayOfByte, 0, paramArrayOfByte.length);
    paramArrayOfByte = localBitmap;
    if (this.surfaceView.getWidth() < this.surfaceView.getHeight())
    {
      paramArrayOfByte = new Matrix();
      paramArrayOfByte.reset();
      paramArrayOfByte.setRotate(90.0F);
      paramArrayOfByte = Bitmap.createBitmap(localBitmap, 0, 0, localBitmap.getWidth(), localBitmap.getHeight(), paramArrayOfByte, true);
    }
    int i = (int)(Float.valueOf(this.screenW).floatValue() / this.surfaceWidth * paramArrayOfByte.getWidth());
    int j = (int)(i * 0.63F);
    return Bitmap.createBitmap(paramArrayOfByte, 0, paramArrayOfByte.getHeight() - j >> 1, i, j);
  }
  
  private String generateFileName()
  {
    String str = new SimpleDateFormat("yyyyMMddhhmmss", Locale.getDefault()).format(new Date());
    return "img_" + str + ".jpg";
  }
  
  public static CameraHelper getInstance()
  {
    try
    {
      if (helper == null) {
        helper = new CameraHelper();
      }
      CameraHelper localCameraHelper = helper;
      return localCameraHelper;
    }
    finally {}
  }
  
  private static Camera.Size getOptimalPreviewSize(List<Camera.Size> paramList, int paramInt1, int paramInt2)
  {
    double d2 = paramInt1 / paramInt2;
    Object localObject2;
    if (paramList == null)
    {
      localObject2 = null;
      return (Camera.Size)localObject2;
    }
    Iterator localIterator = paramList.iterator();
    Object localObject1 = null;
    double d1 = Double.MAX_VALUE;
    for (;;)
    {
      if (!localIterator.hasNext())
      {
        localObject2 = localObject1;
        if (localObject1 != null) {
          break;
        }
        d1 = Double.MAX_VALUE;
        localIterator = paramList.iterator();
        for (;;)
        {
          localObject2 = localObject1;
          if (!localIterator.hasNext()) {
            break;
          }
          paramList = (Camera.Size)localIterator.next();
          if (Math.abs(paramList.height - paramInt2) < d1)
          {
            d1 = Math.abs(paramList.height - paramInt2);
            localObject1 = paramList;
          }
        }
      }
      localObject2 = (Camera.Size)localIterator.next();
      if ((Math.abs(((Camera.Size)localObject2).width / ((Camera.Size)localObject2).height - d2) <= 0.1D) && (Math.abs(((Camera.Size)localObject2).height - paramInt2) < d1))
      {
        d1 = Math.abs(((Camera.Size)localObject2).height - paramInt2);
        localObject1 = localObject2;
      }
    }
  }
  
  private void initParameters(SurfaceView paramSurfaceView, SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    try
    {
      Camera.Parameters localParameters = this.camera.getParameters();
      this.camera.setPreviewDisplay(paramSurfaceHolder);
      this.camera.setDisplayOrientation(90);
      localParameters.setPictureFormat(256);
      localParameters.setJpegQuality(100);
      localParameters.setFlashMode("off");
      paramSurfaceHolder = getOptimalPreviewSize(localParameters.getSupportedPictureSizes(), paramInt4, paramInt3);
      localParameters.setPictureSize(paramSurfaceHolder.width, paramSurfaceHolder.height);
      paramSurfaceHolder = getOptimalPreviewSize(localParameters.getSupportedPreviewSizes(), paramSurfaceHolder.width, paramSurfaceHolder.height);
      localParameters.setPreviewSize(paramSurfaceHolder.width, paramSurfaceHolder.height);
      this.camera.setParameters(localParameters);
      paramSurfaceHolder = this.camera.getParameters().getPreviewSize();
      float f = paramSurfaceView.getHeight() / Float.parseFloat(paramSurfaceHolder.width);
      this.surfaceWidth = (paramSurfaceHolder.height * f);
      if (this.surfaceWidth < this.screenW)
      {
        paramSurfaceView.getLayoutParams().width = this.screenW;
        paramSurfaceView.getLayoutParams().height = ((int)(paramSurfaceView.getHeight() * (this.screenW / this.surfaceWidth)));
      }
      for (;;)
      {
        this.surfaceWidth = paramSurfaceView.getWidth();
        this.surfaceHeight = paramSurfaceView.getHeight();
        return;
        paramSurfaceView.getLayoutParams().width = ((int)this.surfaceWidth);
      }
      return;
    }
    catch (Exception paramSurfaceView)
    {
      Log.e("CameraHelper", "相机参数设置错误");
    }
  }
  
  /* Error */
  private String savePicture(android.content.Context paramContext, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: new 300	java/io/File
    //   3: dup
    //   4: new 150	java/lang/StringBuilder
    //   7: dup
    //   8: aload_1
    //   9: invokestatic 306	com/kwl/common/utils/Utils:getSDPath	(Landroid/content/Context;)Ljava/lang/String;
    //   12: invokestatic 309	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   15: invokespecial 155	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   18: ldc_w 311
    //   21: invokevirtual 159	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   24: invokevirtual 164	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   27: invokespecial 312	java/io/File:<init>	(Ljava/lang/String;)V
    //   30: astore_1
    //   31: aload_1
    //   32: invokevirtual 315	java/io/File:exists	()Z
    //   35: ifne +12 -> 47
    //   38: aload_1
    //   39: invokevirtual 318	java/io/File:mkdirs	()Z
    //   42: ifne +5 -> 47
    //   45: aconst_null
    //   46: areturn
    //   47: new 150	java/lang/StringBuilder
    //   50: dup
    //   51: aload_1
    //   52: invokevirtual 321	java/io/File:getPath	()Ljava/lang/String;
    //   55: invokestatic 309	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   58: invokespecial 155	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   61: getstatic 324	java/io/File:separator	Ljava/lang/String;
    //   64: invokevirtual 159	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: aload_0
    //   68: invokespecial 326	com/kwlopen/sdk/camera/CameraHelper:generateFileName	()Ljava/lang/String;
    //   71: invokevirtual 159	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   74: invokevirtual 164	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   77: astore 4
    //   79: aload_0
    //   80: aload_2
    //   81: invokespecial 328	com/kwlopen/sdk/camera/CameraHelper:cutImage	([B)Landroid/graphics/Bitmap;
    //   84: astore_2
    //   85: new 300	java/io/File
    //   88: dup
    //   89: aload 4
    //   91: invokespecial 312	java/io/File:<init>	(Ljava/lang/String;)V
    //   94: astore_1
    //   95: new 330	java/io/FileOutputStream
    //   98: dup
    //   99: aload_1
    //   100: invokespecial 333	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   103: astore_1
    //   104: new 335	java/io/BufferedOutputStream
    //   107: dup
    //   108: aload_1
    //   109: invokespecial 338	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   112: astore_3
    //   113: aload_2
    //   114: getstatic 344	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   117: bipush 100
    //   119: aload_1
    //   120: invokevirtual 348	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   123: pop
    //   124: aload_1
    //   125: ifnull +11 -> 136
    //   128: aload_1
    //   129: invokevirtual 351	java/io/FileOutputStream:flush	()V
    //   132: aload_1
    //   133: invokevirtual 354	java/io/FileOutputStream:close	()V
    //   136: aload_3
    //   137: ifnull +11 -> 148
    //   140: aload_3
    //   141: invokevirtual 355	java/io/BufferedOutputStream:flush	()V
    //   144: aload_3
    //   145: invokevirtual 356	java/io/BufferedOutputStream:close	()V
    //   148: aload 4
    //   150: areturn
    //   151: astore_1
    //   152: aconst_null
    //   153: astore_1
    //   154: aconst_null
    //   155: astore_2
    //   156: aload_2
    //   157: ifnull +11 -> 168
    //   160: aload_2
    //   161: invokevirtual 351	java/io/FileOutputStream:flush	()V
    //   164: aload_2
    //   165: invokevirtual 354	java/io/FileOutputStream:close	()V
    //   168: aload_1
    //   169: ifnull -124 -> 45
    //   172: aload_1
    //   173: invokevirtual 355	java/io/BufferedOutputStream:flush	()V
    //   176: aload_1
    //   177: invokevirtual 356	java/io/BufferedOutputStream:close	()V
    //   180: aconst_null
    //   181: areturn
    //   182: astore_1
    //   183: aconst_null
    //   184: areturn
    //   185: astore_2
    //   186: aconst_null
    //   187: astore_3
    //   188: aconst_null
    //   189: astore_1
    //   190: aload_1
    //   191: ifnull +11 -> 202
    //   194: aload_1
    //   195: invokevirtual 351	java/io/FileOutputStream:flush	()V
    //   198: aload_1
    //   199: invokevirtual 354	java/io/FileOutputStream:close	()V
    //   202: aload_3
    //   203: ifnull +11 -> 214
    //   206: aload_3
    //   207: invokevirtual 355	java/io/BufferedOutputStream:flush	()V
    //   210: aload_3
    //   211: invokevirtual 356	java/io/BufferedOutputStream:close	()V
    //   214: aload_2
    //   215: athrow
    //   216: astore_1
    //   217: goto -69 -> 148
    //   220: astore_1
    //   221: goto -7 -> 214
    //   224: astore_2
    //   225: aconst_null
    //   226: astore_3
    //   227: goto -37 -> 190
    //   230: astore_2
    //   231: goto -41 -> 190
    //   234: astore_2
    //   235: aconst_null
    //   236: astore_3
    //   237: aload_1
    //   238: astore_2
    //   239: aload_3
    //   240: astore_1
    //   241: goto -85 -> 156
    //   244: astore_2
    //   245: aload_1
    //   246: astore_2
    //   247: aload_3
    //   248: astore_1
    //   249: goto -93 -> 156
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	252	0	this	CameraHelper
    //   0	252	1	paramContext	android.content.Context
    //   0	252	2	paramArrayOfByte	byte[]
    //   112	136	3	localBufferedOutputStream	java.io.BufferedOutputStream
    //   77	72	4	str	String
    // Exception table:
    //   from	to	target	type
    //   95	104	151	java/lang/Exception
    //   160	168	182	java/io/IOException
    //   172	180	182	java/io/IOException
    //   95	104	185	finally
    //   128	136	216	java/io/IOException
    //   140	148	216	java/io/IOException
    //   194	202	220	java/io/IOException
    //   206	214	220	java/io/IOException
    //   104	113	224	finally
    //   113	124	230	finally
    //   104	113	234	java/lang/Exception
    //   113	124	244	java/lang/Exception
  }
  
  private void setPicutreSize(List<Camera.Size> paramList, int paramInt1, int paramInt2)
  {
    paramList = paramList.iterator();
    int i = Integer.MAX_VALUE;
    for (;;)
    {
      if (!paramList.hasNext()) {
        return;
      }
      Camera.Size localSize = (Camera.Size)paramList.next();
      int j = Math.abs(localSize.width - paramInt1 + localSize.height - paramInt2);
      System.out.println("approach: " + i + ", temp: " + j + ", size.width: " + localSize.width + ", size.height: " + localSize.height);
      if (i > j)
      {
        this.pictureSize = localSize;
        i = j;
      }
    }
  }
  
  private void stopPreview()
  {
    if ((this.camera != null) && (this.isPreviewing))
    {
      this.camera.stopPreview();
      this.isPreviewing = false;
    }
  }
  
  protected void onFocus(Point paramPoint, Camera.AutoFocusCallback paramAutoFocusCallback)
  {
    int m = 1000;
    int j = 64536;
    for (;;)
    {
      int n;
      try
      {
        Camera.Parameters localParameters = this.camera.getParameters();
        if (localParameters.getMaxNumFocusAreas() <= 0)
        {
          this.camera.autoFocus(paramAutoFocusCallback);
          return;
        }
        ArrayList localArrayList = new ArrayList();
        int i2 = paramPoint.x - 300;
        int k = paramPoint.y - 300;
        int i1 = paramPoint.x + 300;
        n = paramPoint.y + 300;
        int i = i2;
        if (i2 < 64536)
        {
          i = 64536;
          continue;
          localArrayList.add(new Camera.Area(new Rect(i, j, k, m), 100));
          localParameters.setFocusAreas(localArrayList);
          try
          {
            this.camera.setParameters(localParameters);
            this.camera.autoFocus(paramAutoFocusCallback);
            return;
          }
          catch (Exception paramPoint)
          {
            paramPoint.printStackTrace();
            continue;
          }
        }
        if (k < 64536)
        {
          k = i1;
          if (i1 > 1000) {
            k = 1000;
          }
          if (n <= 1000) {
            break label211;
          }
          continue;
        }
        j = k;
      }
      catch (Exception paramPoint)
      {
        return;
      }
      continue;
      label211:
      m = n;
    }
  }
  
  public void openCamera(SurfaceView paramSurfaceView, SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    for (;;)
    {
      try
      {
        if (this.camera != null) {
          this.camera.release();
        }
        int j = FindBackCamera();
        int i = j;
        if (j == -1) {
          i = FindFrontCamera();
        }
        if (i == -1) {
          try
          {
            this.camera = Camera.open();
            initParameters(paramSurfaceView, paramSurfaceHolder, paramInt1, paramInt2, paramInt3, paramInt4);
            startPreview();
            return;
          }
          catch (RuntimeException localRuntimeException)
          {
            this.camera = Camera.open(Camera.getNumberOfCameras() - 1);
            System.out.println("open()方法有问题");
            continue;
          }
        }
        this.camera = Camera.open(i);
      }
      catch (Exception paramSurfaceHolder)
      {
        Toast.makeText(paramSurfaceView.getContext(), ResourceUtil.getStringIdByName(paramSurfaceView.getContext(), "kwlopen_msg_camera_error"), 0).show();
        paramSurfaceHolder.printStackTrace();
        return;
      }
    }
  }
  
  public void releaseCamera()
  {
    if ((this.camera != null) && (this.isPreviewing))
    {
      stopPreview();
      this.camera.setPreviewCallback(null);
      this.isPreviewing = false;
      this.camera.release();
      this.camera = null;
      helper = null;
    }
  }
  
  public Bitmap scaleBitmap(Bitmap paramBitmap)
  {
    float f3 = paramBitmap.getWidth();
    float f4 = paramBitmap.getHeight();
    int i = (int)this.surfaceView.maskWidth;
    int j = (int)this.surfaceView.maskHeight;
    float f2;
    if (i < j) {
      f2 = j;
    }
    for (float f1 = i;; f1 = j)
    {
      f2 /= this.surfaceView.getWidth();
      f1 = f1 / this.surfaceView.getHeight() * f4 + 50.0F;
      f2 = (f3 - f2 * f3) / 2.0F;
      return Bitmap.createBitmap(paramBitmap, 0, (int)((f4 - f1) / 2.0F), (int)f3, (int)f1);
      f2 = i;
    }
  }
  
  public CameraHelper setMaskSurfaceView(MaskSurfaceView paramMaskSurfaceView)
  {
    this.screenW = ((int)paramMaskSurfaceView.width);
    this.surfaceView = paramMaskSurfaceView;
    return helper;
  }
  
  public CameraHelper setPicQuality(int paramInt)
  {
    return helper;
  }
  
  public CameraHelper setPictureSaveDictionaryPath(String paramString)
  {
    return helper;
  }
  
  public void startPreview()
  {
    try
    {
      if (this.camera != null)
      {
        this.camera.startPreview();
        this.camera.autoFocus(null);
        this.isPreviewing = true;
      }
      return;
    }
    catch (Exception localException) {}
  }
  
  public void tackPicture(Activity paramActivity, OnCaptureCallback paramOnCaptureCallback)
  {
    try
    {
      this.camera.autoFocus(new CameraHelper.1(this, paramActivity, paramOnCaptureCallback));
      return;
    }
    catch (Exception paramActivity) {}
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwlopen\sdk\camera\CameraHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */