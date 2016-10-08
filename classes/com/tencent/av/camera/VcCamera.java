package com.tencent.av.camera;

import android.content.Context;
import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PreviewCallback;
import android.hardware.Camera.Size;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.view.Display;
import android.view.SurfaceHolder;
import android.view.WindowManager;
import com.tencent.av.config.ConfigSystemImpl;
import com.tencent.av.utils.PhoneStatusTools;
import com.tencent.av.utils.QLog;
import com.tencent.av.utils.VcSystemInfo;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public class VcCamera
{
  static final int BACK_CAMERA = 1;
  static final int CAMERA_NONE = -1;
  static final String CAMERA_THREAD_NAME = "CAMERA";
  static final int FRONT_CAMERA = 0;
  static VcCamera.CameraInformation Info = new VcCamera.CameraInformation();
  static final String TAG = "VcCamera";
  static boolean isCameraOpened = false;
  public static volatile Object mCameraPreviewChangeCallback;
  static volatile int nInFPS;
  int CUR_CAMERA = -1;
  int CameraId = -1;
  int CompenSateRecvAngle = 0;
  int CompenSateSendAngle = 0;
  String DEV_MANUFACTURER;
  String DEV_MODEL;
  int LAST_CAMERA = -1;
  int NUM_CAMERA = 0;
  int SDK_VERSION;
  private Camera.PreviewCallback cameraCallback = new VcCamera.6(this);
  boolean cameraInitialed = false;
  Display devDisplay;
  int mBackCameraAngle = 0;
  Camera mCamera = null;
  private Handler mCameraHandler = null;
  HandlerThread mCameraThread = null;
  Context mContext = null;
  List<Camera.Size> mFrameSizes = null;
  int mFrontCameraAngle = 0;
  SurfaceHolder mHolder = null;
  byte[] mPreBuffer = null;
  boolean mbIsTablet = false;
  int nativeObj = 0;
  
  public VcCamera() {}
  
  public VcCamera(Context paramContext)
  {
    this.mContext = paramContext;
    this.devDisplay = ((WindowManager)this.mContext.getSystemService("window")).getDefaultDisplay();
    this.mbIsTablet = PhoneStatusTools.isTablet(paramContext);
    this.SDK_VERSION = getVersion();
    this.DEV_MODEL = Build.MODEL;
    this.DEV_MANUFACTURER = Build.MANUFACTURER;
    Info.orientation = -1;
    Info.rotation = -1;
    if (QLog.isColorLevel())
    {
      QLog.d("VcCamera", 0, "Device_Tag = " + this.DEV_MANUFACTURER + ": " + this.DEV_MODEL);
      QLog.d("VcCamera", 0, "Rom_Tag = " + Build.VERSION.INCREMENTAL);
    }
  }
  
  private static int GetNumberOfCamera()
  {
    try
    {
      int i = Integer.parseInt(Class.forName("android.hardware.Camera").getMethod("getNumberOfCameras", new Class[0]).invoke(null, (Object[])null).toString());
      return i;
    }
    catch (Exception localException)
    {
      if (QLog.isColorLevel()) {
        QLog.d("VcCamera", 0, "GetNumberOfCamera", localException);
      }
    }
    return 1;
  }
  
  private void adjustDirection(Camera paramCamera)
  {
    try
    {
      Method localMethod = paramCamera.getClass().getMethod("setDisplayOrientation", new Class[] { Integer.TYPE });
      if (this.CUR_CAMERA == 0) {}
      for (int i = getPreviewAngleForFrontCamera() % 360;; i = getPreviewAngleForBackCamera() % 360)
      {
        localMethod.invoke(paramCamera, new Object[] { Integer.valueOf(i) });
        return;
      }
      return;
    }
    catch (Exception paramCamera)
    {
      if (QLog.isColorLevel()) {
        QLog.d("VcCamera", 0, "adjustDirection", paramCamera);
      }
    }
  }
  
  private boolean fitSdkVersion()
  {
    return this.SDK_VERSION >= 10;
  }
  
  public static String get(Context paramContext, String paramString)
  {
    try
    {
      paramContext = paramContext.getClassLoader().loadClass("android.os.SystemProperties");
      paramContext = (String)paramContext.getMethod("get", new Class[] { String.class }).invoke(paramContext, new Object[] { new String(paramString) });
      return paramContext;
    }
    catch (IllegalArgumentException paramContext)
    {
      throw paramContext;
    }
    catch (Exception paramContext) {}
    return "";
  }
  
  private VcCamera.CameraInformation getCameraDisplayOrientation(int paramInt, Camera paramCamera)
  {
    paramCamera = new VcCamera.CameraInformation();
    try
    {
      Object localObject2 = Class.forName("android.hardware.Camera");
      Class localClass = Class.forName("android.hardware.Camera$CameraInfo");
      if (localClass == null)
      {
        paramCamera.rotation = -1;
        paramCamera.orientation = -1;
        return paramCamera;
      }
      Object localObject1 = localClass.newInstance();
      if (localObject1 == null)
      {
        paramCamera.rotation = -1;
        paramCamera.orientation = -1;
        return paramCamera;
      }
      Field localField1 = localObject1.getClass().getField("facing");
      Field localField2 = localObject1.getClass().getField("orientation");
      if ((localField1 == null) || (localField2 == null))
      {
        paramCamera.rotation = -1;
        paramCamera.orientation = -1;
        return paramCamera;
      }
      localObject2 = ((Class)localObject2).getMethod("getCameraInfo", new Class[] { Integer.TYPE, localClass });
      if (localObject2 == null)
      {
        paramCamera.rotation = -1;
        paramCamera.orientation = -1;
        return paramCamera;
      }
      ((Method)localObject2).invoke(null, new Object[] { Integer.valueOf(paramInt), localObject1 });
      paramCamera.facing = localField1.getInt(localObject1);
      paramCamera.orientation = localField2.getInt(localObject1);
      if (this.devDisplay == null)
      {
        paramCamera.rotation = -1;
        return paramCamera;
      }
      localObject1 = this.devDisplay.getClass().getMethod("getRotation", new Class[0]);
      if (localObject1 == null)
      {
        paramCamera.rotation = -1;
        return paramCamera;
      }
      switch (Integer.parseInt(((Method)localObject1).invoke(this.devDisplay, (Object[])null).toString()))
      {
      case 0: 
        paramCamera.rotation = 0;
      }
    }
    catch (Exception localException)
    {
      paramCamera.rotation = 0;
      return paramCamera;
    }
    paramCamera.rotation = 90;
    return paramCamera;
    paramCamera.rotation = 180;
    return paramCamera;
    paramCamera.rotation = 270;
    return paramCamera;
  }
  
  public static int getCameraNum()
  {
    return GetNumberOfCamera();
  }
  
  private Camera getFrontCamera()
  {
    if (fitSdkVersion()) {
      return openFrontFacingCamera();
    }
    if (this.DEV_MANUFACTURER.equalsIgnoreCase("motorola")) {
      return tryMotoFrontCamera();
    }
    if (this.DEV_MANUFACTURER.equalsIgnoreCase("samsung")) {
      return trySamsungFrontCamera();
    }
    return null;
  }
  
  private Camera.Size getOptimalEqualPreviewSize(List<Camera.Size> paramList, int paramInt1, int paramInt2)
  {
    int i = paramInt1;
    int j = paramInt2;
    if (!VcSystemInfo.isNormalSharp()) {
      if (paramInt1 == 192)
      {
        i = paramInt1;
        j = paramInt2;
        if (paramInt2 == 144) {}
      }
      else
      {
        j = 144;
        i = 192;
      }
    }
    Iterator localIterator = paramList.iterator();
    Camera.Size localSize;
    for (;;)
    {
      if (localIterator.hasNext())
      {
        localSize = (Camera.Size)localIterator.next();
        QLog.d("VcCamera", 0, "previewsize ,w= " + localSize.width + ",h=" + localSize.height);
        if ((localSize.width == i) && (localSize.height == j))
        {
          paramList = localSize;
          if (QLog.isColorLevel())
          {
            QLog.d("VcCamera", 0, "previewsize ,w= " + i + ",h=" + j);
            paramList = localSize;
          }
        }
      }
    }
    do
    {
      return paramList;
      if ((VcSystemInfo.isNormalSharp()) || ((i == 320) && (j == 240))) {
        break label478;
      }
      localIterator = paramList.iterator();
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        localSize = (Camera.Size)localIterator.next();
      } while ((localSize.width != 320) || (localSize.height != 240));
      paramList = localSize;
    } while (!QLog.isColorLevel());
    QLog.d("VcCamera", 0, "previewsize 2, w= " + 320 + ",h=" + 240);
    return localSize;
    paramInt1 = 240;
    for (paramInt2 = 320;; paramInt2 = i)
    {
      j = paramInt1;
      i = paramInt2;
      if (paramInt2 == 320)
      {
        j = paramInt1;
        i = paramInt2;
        if (paramInt1 == 240)
        {
          localIterator = paramList.iterator();
          for (;;)
          {
            if (localIterator.hasNext())
            {
              localSize = (Camera.Size)localIterator.next();
              if ((localSize.width == 640) && (localSize.height == 480))
              {
                paramList = localSize;
                if (!QLog.isColorLevel()) {
                  break;
                }
                QLog.d("VcCamera", 0, "previewsize ,w= " + 640 + ",h=" + 480);
                return localSize;
              }
            }
          }
          j = 480;
          i = 640;
        }
      }
      if (0 == 0) {
        return getOptimalPreviewSize(paramList, i, j);
      }
      return null;
      label478:
      paramInt1 = j;
    }
  }
  
  private Camera.Size getOptimalPreviewSize(List<Camera.Size> paramList, int paramInt1, int paramInt2)
  {
    if (paramList == null) {
      return null;
    }
    Collections.sort(paramList, new CameraSizeComparator());
    Iterator localIterator = paramList.iterator();
    paramList = null;
    Camera.Size localSize;
    while (localIterator.hasNext())
    {
      localSize = (Camera.Size)localIterator.next();
      QLog.i("VcCamera", 0, "ordered size list width: " + localSize.width + "height: " + localSize.height);
      if ((localSize.width > paramInt1) && (localSize.height > paramInt2))
      {
        Object localObject = paramList;
        if (paramList == null)
        {
          QLog.i("VcCamera", 0, "better size width: " + localSize.width + "height: " + localSize.height);
          localObject = localSize;
        }
        paramList = (List<Camera.Size>)localObject;
        if (localSize.width * paramInt2 == localSize.height * paramInt1)
        {
          QLog.i("VcCamera", 0, "best size width: " + localSize.width + "height: " + localSize.height + "w*h1: " + localSize.width * paramInt2 + "w*h2: " + localSize.height * paramInt1);
          paramList = (List<Camera.Size>)localObject;
        }
      }
    }
    for (;;)
    {
      if (localSize != null) {
        return localSize;
      }
      if (paramList == null) {
        break;
      }
      return paramList;
      localSize = null;
    }
  }
  
  private int getRecvAngleCompensation()
  {
    return 0;
  }
  
  private int getSendAngleCompensation()
  {
    return 0;
  }
  
  public static int getVersion()
  {
    return Build.VERSION.SDK_INT;
  }
  
  private boolean openBackCamera()
  {
    try
    {
      this.mCamera = Camera.open();
      this.CUR_CAMERA = 1;
      isCameraOpened = true;
      this.CameraId = 0;
      if (QLog.isColorLevel()) {
        QLog.d("VcCamera", 0, "openBackCamera success");
      }
      return true;
    }
    catch (Exception localException)
    {
      isCameraOpened = false;
      if (this.mCamera != null) {
        this.mCamera.release();
      }
      if (QLog.isColorLevel()) {
        QLog.d("VcCamera", 0, "openBackCamera exception" + localException.getStackTrace());
      }
    }
    return false;
  }
  
  private boolean openFrontCamera()
  {
    this.mCamera = getFrontCamera();
    if (this.mCamera == null)
    {
      if (QLog.isColorLevel()) {
        QLog.d("VcCamera", 0, "openFrontCamera camera == null");
      }
      isCameraOpened = false;
      return false;
    }
    if (this.NUM_CAMERA == 0) {
      this.NUM_CAMERA = 2;
    }
    this.CUR_CAMERA = 0;
    isCameraOpened = true;
    if (QLog.isColorLevel()) {
      QLog.d("VcCamera", 0, "openFrontCamera success");
    }
    return true;
  }
  
  /* Error */
  private Camera openFrontFacingCamera()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aconst_null
    //   3: astore 6
    //   5: aconst_null
    //   6: astore 7
    //   8: aconst_null
    //   9: astore 8
    //   11: aconst_null
    //   12: astore 9
    //   14: aconst_null
    //   15: astore 10
    //   17: aconst_null
    //   18: astore 11
    //   20: aconst_null
    //   21: astore 12
    //   23: aconst_null
    //   24: astore 5
    //   26: aload_0
    //   27: iconst_m1
    //   28: putfield 87	com/tencent/av/camera/VcCamera:CameraId	I
    //   31: ldc -58
    //   33: invokestatic 204	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   36: astore 13
    //   38: aload_0
    //   39: getfield 83	com/tencent/av/camera/VcCamera:NUM_CAMERA	I
    //   42: ifne +10 -> 52
    //   45: aload_0
    //   46: invokestatic 240	com/tencent/av/camera/VcCamera:GetNumberOfCamera	()I
    //   49: putfield 83	com/tencent/av/camera/VcCamera:NUM_CAMERA	I
    //   52: aload_2
    //   53: astore_1
    //   54: aload_0
    //   55: getfield 83	com/tencent/av/camera/VcCamera:NUM_CAMERA	I
    //   58: iconst_1
    //   59: if_icmplt +247 -> 306
    //   62: ldc_w 303
    //   65: invokestatic 204	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   68: astore 15
    //   70: aload 15
    //   72: ifnull +497 -> 569
    //   75: aload 15
    //   77: invokevirtual 307	java/lang/Class:newInstance	()Ljava/lang/Object;
    //   80: astore_3
    //   81: aload_3
    //   82: ifnull +481 -> 563
    //   85: aload_3
    //   86: invokevirtual 259	java/lang/Object:getClass	()Ljava/lang/Class;
    //   89: ldc_w 309
    //   92: invokevirtual 313	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   95: astore 4
    //   97: aload 13
    //   99: ldc_w 316
    //   102: iconst_2
    //   103: anewarray 200	java/lang/Class
    //   106: dup
    //   107: iconst_0
    //   108: getstatic 265	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   111: aastore
    //   112: dup
    //   113: iconst_1
    //   114: aload 15
    //   116: aastore
    //   117: invokevirtual 210	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   120: astore 14
    //   122: aload_2
    //   123: astore_1
    //   124: aload 14
    //   126: ifnull +180 -> 306
    //   129: aload_2
    //   130: astore_1
    //   131: aload 15
    //   133: ifnull +173 -> 306
    //   136: aload_2
    //   137: astore_1
    //   138: aload 4
    //   140: ifnull +166 -> 306
    //   143: iconst_0
    //   144: istore 16
    //   146: aconst_null
    //   147: astore_1
    //   148: iload 16
    //   150: aload_0
    //   151: getfield 83	com/tencent/av/camera/VcCamera:NUM_CAMERA	I
    //   154: if_icmpge +407 -> 561
    //   157: aload 14
    //   159: aconst_null
    //   160: iconst_2
    //   161: anewarray 4	java/lang/Object
    //   164: dup
    //   165: iconst_0
    //   166: iload 16
    //   168: invokestatic 272	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   171: aastore
    //   172: dup
    //   173: iconst_1
    //   174: aload_3
    //   175: aastore
    //   176: invokevirtual 218	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   179: pop
    //   180: aload 4
    //   182: aload_3
    //   183: invokevirtual 322	java/lang/reflect/Field:getInt	(Ljava/lang/Object;)I
    //   186: istore 17
    //   188: iload 17
    //   190: iconst_1
    //   191: if_icmpne +365 -> 556
    //   194: aload 13
    //   196: ldc_w 463
    //   199: iconst_1
    //   200: anewarray 200	java/lang/Class
    //   203: dup
    //   204: iconst_0
    //   205: getstatic 265	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   208: aastore
    //   209: invokevirtual 210	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   212: astore_2
    //   213: aload_2
    //   214: ifnull +342 -> 556
    //   217: aload_2
    //   218: aconst_null
    //   219: iconst_1
    //   220: anewarray 4	java/lang/Object
    //   223: dup
    //   224: iconst_0
    //   225: iload 16
    //   227: invokestatic 272	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   230: aastore
    //   231: invokevirtual 218	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   234: checkcast 423	android/hardware/Camera
    //   237: astore_2
    //   238: aload_0
    //   239: iload 16
    //   241: putfield 87	com/tencent/av/camera/VcCamera:CameraId	I
    //   244: iload 16
    //   246: iconst_1
    //   247: iadd
    //   248: istore 16
    //   250: aload_2
    //   251: astore_1
    //   252: goto -104 -> 148
    //   255: astore_1
    //   256: aload_0
    //   257: iconst_0
    //   258: putfield 87	com/tencent/av/camera/VcCamera:CameraId	I
    //   261: invokestatic 167	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   264: ifeq +13 -> 277
    //   267: ldc 20
    //   269: iconst_0
    //   270: ldc_w 464
    //   273: aload_1
    //   274: invokestatic 467	com/tencent/av/utils/QLog:e	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Exception;)V
    //   277: aconst_null
    //   278: astore_2
    //   279: goto -35 -> 244
    //   282: astore_3
    //   283: aload 5
    //   285: astore_2
    //   286: aload_2
    //   287: astore_1
    //   288: invokestatic 167	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   291: ifeq +15 -> 306
    //   294: ldc 20
    //   296: iconst_0
    //   297: ldc_w 469
    //   300: aload_3
    //   301: invokestatic 467	com/tencent/av/utils/QLog:e	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Exception;)V
    //   304: aload_2
    //   305: astore_1
    //   306: aload_1
    //   307: areturn
    //   308: astore_3
    //   309: aload 6
    //   311: astore_2
    //   312: aload_2
    //   313: astore_1
    //   314: invokestatic 167	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   317: ifeq -11 -> 306
    //   320: ldc 20
    //   322: iconst_0
    //   323: ldc_w 471
    //   326: aload_3
    //   327: invokestatic 467	com/tencent/av/utils/QLog:e	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Exception;)V
    //   330: aload_2
    //   331: areturn
    //   332: astore_3
    //   333: aload 7
    //   335: astore_2
    //   336: aload_2
    //   337: astore_1
    //   338: invokestatic 167	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   341: ifeq -35 -> 306
    //   344: ldc 20
    //   346: iconst_0
    //   347: ldc_w 473
    //   350: aload_3
    //   351: invokestatic 467	com/tencent/av/utils/QLog:e	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Exception;)V
    //   354: aload_2
    //   355: areturn
    //   356: astore_3
    //   357: aload 8
    //   359: astore_2
    //   360: aload_2
    //   361: astore_1
    //   362: invokestatic 167	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   365: ifeq -59 -> 306
    //   368: ldc 20
    //   370: iconst_0
    //   371: ldc_w 475
    //   374: aload_3
    //   375: invokestatic 467	com/tencent/av/utils/QLog:e	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Exception;)V
    //   378: aload_2
    //   379: areturn
    //   380: astore_3
    //   381: aload 9
    //   383: astore_2
    //   384: aload_2
    //   385: astore_1
    //   386: invokestatic 167	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   389: ifeq -83 -> 306
    //   392: ldc 20
    //   394: iconst_0
    //   395: ldc_w 477
    //   398: aload_3
    //   399: invokestatic 467	com/tencent/av/utils/QLog:e	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Exception;)V
    //   402: aload_2
    //   403: areturn
    //   404: astore_3
    //   405: aload 10
    //   407: astore_2
    //   408: aload_2
    //   409: astore_1
    //   410: invokestatic 167	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   413: ifeq -107 -> 306
    //   416: ldc 20
    //   418: iconst_0
    //   419: ldc_w 479
    //   422: aload_3
    //   423: invokestatic 467	com/tencent/av/utils/QLog:e	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Exception;)V
    //   426: aload_2
    //   427: areturn
    //   428: astore_3
    //   429: aload 11
    //   431: astore_2
    //   432: aload_2
    //   433: astore_1
    //   434: invokestatic 167	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   437: ifeq -131 -> 306
    //   440: ldc 20
    //   442: iconst_0
    //   443: ldc_w 481
    //   446: aload_3
    //   447: invokestatic 467	com/tencent/av/utils/QLog:e	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Exception;)V
    //   450: aload_2
    //   451: areturn
    //   452: astore_3
    //   453: aload 12
    //   455: astore_2
    //   456: aload_2
    //   457: astore_1
    //   458: invokestatic 167	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   461: ifeq -155 -> 306
    //   464: ldc 20
    //   466: iconst_0
    //   467: ldc_w 464
    //   470: aload_3
    //   471: invokestatic 467	com/tencent/av/utils/QLog:e	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Exception;)V
    //   474: aload_2
    //   475: areturn
    //   476: astore_3
    //   477: aload_1
    //   478: astore_2
    //   479: goto -23 -> 456
    //   482: astore_3
    //   483: goto -27 -> 456
    //   486: astore_3
    //   487: aload_1
    //   488: astore_2
    //   489: goto -57 -> 432
    //   492: astore_3
    //   493: goto -61 -> 432
    //   496: astore_3
    //   497: aload_1
    //   498: astore_2
    //   499: goto -91 -> 408
    //   502: astore_3
    //   503: goto -95 -> 408
    //   506: astore_3
    //   507: aload_1
    //   508: astore_2
    //   509: goto -125 -> 384
    //   512: astore_3
    //   513: goto -129 -> 384
    //   516: astore_3
    //   517: aload_1
    //   518: astore_2
    //   519: goto -159 -> 360
    //   522: astore_3
    //   523: goto -163 -> 360
    //   526: astore_3
    //   527: aload_1
    //   528: astore_2
    //   529: goto -193 -> 336
    //   532: astore_3
    //   533: goto -197 -> 336
    //   536: astore_3
    //   537: aload_1
    //   538: astore_2
    //   539: goto -227 -> 312
    //   542: astore_3
    //   543: goto -231 -> 312
    //   546: astore_3
    //   547: aload_1
    //   548: astore_2
    //   549: goto -263 -> 286
    //   552: astore_3
    //   553: goto -267 -> 286
    //   556: aload_1
    //   557: astore_2
    //   558: goto -314 -> 244
    //   561: aload_1
    //   562: areturn
    //   563: aconst_null
    //   564: astore 4
    //   566: goto -469 -> 97
    //   569: aconst_null
    //   570: astore_3
    //   571: goto -490 -> 81
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	574	0	this	VcCamera
    //   53	199	1	localObject1	Object
    //   255	19	1	localRuntimeException	RuntimeException
    //   287	275	1	localObject2	Object
    //   1	557	2	localObject3	Object
    //   80	103	3	localObject4	Object
    //   282	19	3	localClassNotFoundException1	ClassNotFoundException
    //   308	19	3	localNoSuchMethodException1	NoSuchMethodException
    //   332	19	3	localNoSuchFieldException1	NoSuchFieldException
    //   356	19	3	localIllegalAccessException1	IllegalAccessException
    //   380	19	3	localInvocationTargetException1	java.lang.reflect.InvocationTargetException
    //   404	19	3	localInstantiationException1	InstantiationException
    //   428	19	3	localSecurityException1	SecurityException
    //   452	19	3	localException1	Exception
    //   476	1	3	localException2	Exception
    //   482	1	3	localException3	Exception
    //   486	1	3	localSecurityException2	SecurityException
    //   492	1	3	localSecurityException3	SecurityException
    //   496	1	3	localInstantiationException2	InstantiationException
    //   502	1	3	localInstantiationException3	InstantiationException
    //   506	1	3	localInvocationTargetException2	java.lang.reflect.InvocationTargetException
    //   512	1	3	localInvocationTargetException3	java.lang.reflect.InvocationTargetException
    //   516	1	3	localIllegalAccessException2	IllegalAccessException
    //   522	1	3	localIllegalAccessException3	IllegalAccessException
    //   526	1	3	localNoSuchFieldException2	NoSuchFieldException
    //   532	1	3	localNoSuchFieldException3	NoSuchFieldException
    //   536	1	3	localNoSuchMethodException2	NoSuchMethodException
    //   542	1	3	localNoSuchMethodException3	NoSuchMethodException
    //   546	1	3	localClassNotFoundException2	ClassNotFoundException
    //   552	1	3	localClassNotFoundException3	ClassNotFoundException
    //   570	1	3	localObject5	Object
    //   95	470	4	localField	Field
    //   24	260	5	localObject6	Object
    //   3	307	6	localObject7	Object
    //   6	328	7	localObject8	Object
    //   9	349	8	localObject9	Object
    //   12	370	9	localObject10	Object
    //   15	391	10	localObject11	Object
    //   18	412	11	localObject12	Object
    //   21	433	12	localObject13	Object
    //   36	159	13	localClass1	Class
    //   120	38	14	localMethod	Method
    //   68	64	15	localClass2	Class
    //   144	105	16	i	int
    //   186	6	17	j	int
    // Exception table:
    //   from	to	target	type
    //   194	213	255	java/lang/RuntimeException
    //   217	238	255	java/lang/RuntimeException
    //   238	244	255	java/lang/RuntimeException
    //   31	52	282	java/lang/ClassNotFoundException
    //   54	70	282	java/lang/ClassNotFoundException
    //   75	81	282	java/lang/ClassNotFoundException
    //   85	97	282	java/lang/ClassNotFoundException
    //   97	122	282	java/lang/ClassNotFoundException
    //   256	277	282	java/lang/ClassNotFoundException
    //   31	52	308	java/lang/NoSuchMethodException
    //   54	70	308	java/lang/NoSuchMethodException
    //   75	81	308	java/lang/NoSuchMethodException
    //   85	97	308	java/lang/NoSuchMethodException
    //   97	122	308	java/lang/NoSuchMethodException
    //   256	277	308	java/lang/NoSuchMethodException
    //   31	52	332	java/lang/NoSuchFieldException
    //   54	70	332	java/lang/NoSuchFieldException
    //   75	81	332	java/lang/NoSuchFieldException
    //   85	97	332	java/lang/NoSuchFieldException
    //   97	122	332	java/lang/NoSuchFieldException
    //   256	277	332	java/lang/NoSuchFieldException
    //   31	52	356	java/lang/IllegalAccessException
    //   54	70	356	java/lang/IllegalAccessException
    //   75	81	356	java/lang/IllegalAccessException
    //   85	97	356	java/lang/IllegalAccessException
    //   97	122	356	java/lang/IllegalAccessException
    //   256	277	356	java/lang/IllegalAccessException
    //   31	52	380	java/lang/reflect/InvocationTargetException
    //   54	70	380	java/lang/reflect/InvocationTargetException
    //   75	81	380	java/lang/reflect/InvocationTargetException
    //   85	97	380	java/lang/reflect/InvocationTargetException
    //   97	122	380	java/lang/reflect/InvocationTargetException
    //   256	277	380	java/lang/reflect/InvocationTargetException
    //   31	52	404	java/lang/InstantiationException
    //   54	70	404	java/lang/InstantiationException
    //   75	81	404	java/lang/InstantiationException
    //   85	97	404	java/lang/InstantiationException
    //   97	122	404	java/lang/InstantiationException
    //   256	277	404	java/lang/InstantiationException
    //   31	52	428	java/lang/SecurityException
    //   54	70	428	java/lang/SecurityException
    //   75	81	428	java/lang/SecurityException
    //   85	97	428	java/lang/SecurityException
    //   97	122	428	java/lang/SecurityException
    //   256	277	428	java/lang/SecurityException
    //   31	52	452	java/lang/Exception
    //   54	70	452	java/lang/Exception
    //   75	81	452	java/lang/Exception
    //   85	97	452	java/lang/Exception
    //   97	122	452	java/lang/Exception
    //   256	277	452	java/lang/Exception
    //   148	188	476	java/lang/Exception
    //   194	213	476	java/lang/Exception
    //   217	238	476	java/lang/Exception
    //   238	244	482	java/lang/Exception
    //   148	188	486	java/lang/SecurityException
    //   194	213	486	java/lang/SecurityException
    //   217	238	486	java/lang/SecurityException
    //   238	244	492	java/lang/SecurityException
    //   148	188	496	java/lang/InstantiationException
    //   194	213	496	java/lang/InstantiationException
    //   217	238	496	java/lang/InstantiationException
    //   238	244	502	java/lang/InstantiationException
    //   148	188	506	java/lang/reflect/InvocationTargetException
    //   194	213	506	java/lang/reflect/InvocationTargetException
    //   217	238	506	java/lang/reflect/InvocationTargetException
    //   238	244	512	java/lang/reflect/InvocationTargetException
    //   148	188	516	java/lang/IllegalAccessException
    //   194	213	516	java/lang/IllegalAccessException
    //   217	238	516	java/lang/IllegalAccessException
    //   238	244	522	java/lang/IllegalAccessException
    //   148	188	526	java/lang/NoSuchFieldException
    //   194	213	526	java/lang/NoSuchFieldException
    //   217	238	526	java/lang/NoSuchFieldException
    //   238	244	532	java/lang/NoSuchFieldException
    //   148	188	536	java/lang/NoSuchMethodException
    //   194	213	536	java/lang/NoSuchMethodException
    //   217	238	536	java/lang/NoSuchMethodException
    //   238	244	542	java/lang/NoSuchMethodException
    //   148	188	546	java/lang/ClassNotFoundException
    //   194	213	546	java/lang/ClassNotFoundException
    //   217	238	546	java/lang/ClassNotFoundException
    //   238	244	552	java/lang/ClassNotFoundException
  }
  
  private boolean setCameraDisplayOrientation(int paramInt, Camera paramCamera)
  {
    VcCamera.CameraInformation localCameraInformation = getCameraDisplayOrientation(paramInt, paramCamera);
    this.CompenSateSendAngle = getSendAngleCompensation();
    this.CompenSateRecvAngle = getRecvAngleCompensation();
    if (localCameraInformation.facing == 1)
    {
      paramInt = (360 - (getOrientation() + getRotation()) % 360) % 360;
      if (localCameraInformation.facing != 1) {
        break label121;
      }
    }
    label121:
    for (paramInt = (paramInt + getPreviewAngleForFrontCamera()) % 360;; paramInt = (paramInt + getPreviewAngleForBackCamera()) % 360)
    {
      setDisplayOrientation(paramCamera, paramInt);
      Info.facing = localCameraInformation.facing;
      Info.orientation = localCameraInformation.orientation;
      return true;
      paramInt = (getOrientation() - getRotation() + 360) % 360;
      break;
    }
  }
  
  private void setCameraFps(int paramInt)
  {
    try
    {
      Camera.Parameters localParameters1 = this.mCamera.getParameters();
      if (localParameters1 == null) {
        return;
      }
    }
    catch (Exception localException1)
    {
      Camera.Parameters localParameters2;
      for (;;)
      {
        QLog.d("VcCamera", 0, "getParameters exception", localException1);
        localParameters2 = null;
      }
      nInFPS = paramInt;
      localParameters2.setPreviewFrameRate(paramInt);
      try
      {
        this.mCamera.setParameters(localParameters2);
        return;
      }
      catch (Exception localException2) {}
    }
  }
  
  private void setCameraPara(int paramInt1, int paramInt2)
  {
    if (this.mCamera == null) {
      QLog.d("VcCamera", 0, "openCamera camera == null");
    }
    for (;;)
    {
      synchronized (Info)
      {
        if (fitSdkVersion()) {
          setCameraDisplayOrientation(this.CameraId, this.mCamera);
        }
      }
      try
      {
        ??? = this.mCamera.getParameters();
        if (??? == null)
        {
          QLog.d("VcCamera", 0, "getParameters parameters == null ");
          if ((paramInt1 > VideoChatSettings.width) && (paramInt2 > VideoChatSettings.height))
          {
            QLog.d("VcCamera", 0, "save parasw" + paramInt1 + "h" + paramInt2);
            VideoChatSettings.width = paramInt1;
            VideoChatSettings.height = paramInt2;
          }
          return;
          adjustDirection(this.mCamera);
          continue;
          localObject3 = finally;
          throw ((Throwable)localObject3);
        }
      }
      catch (Exception localException1)
      {
        for (;;)
        {
          QLog.d("VcCamera", 0, "getParameters exception", localException1);
          localObject2 = null;
        }
      }
    }
    try
    {
      localObject4 = (List)localObject2.getClass().getMethod("getSupportedPreviewFormats", new Class[0]).invoke(localObject2, (Object[])null);
      if (localObject4 == null) {
        break label1360;
      }
      i = 0;
    }
    catch (Exception localException3)
    {
      for (;;)
      {
        Object localObject4;
        boolean bool;
        localException3.printStackTrace();
        int i = 0;
        continue;
        i = 0;
        continue;
        i += 1;
      }
    }
    if (i < ((List)localObject4).size())
    {
      if (QLog.isColorLevel()) {
        QLog.d("VcCamera", 0, "format: " + ((List)localObject4).get(i));
      }
    }
    else
    {
      bool = ((List)localObject4).contains(Integer.valueOf(17));
      if (bool) {
        i = 17;
      }
      for (;;)
      {
        try
        {
          localObject4 = localObject2.getClass().getMethod("getSupportedPreviewSizes", new Class[0]);
          if (localObject4 != null)
          {
            localObject4 = (List)((Method)localObject4).invoke(localObject2, (Object[])null);
            if (localObject4 != null)
            {
              this.mFrameSizes = ((List)localObject4);
              localObject4 = getOptimalEqualPreviewSize((List)localObject4, paramInt1, paramInt2);
              if (localObject4 != null)
              {
                VideoChatSettings.width = ((Camera.Size)localObject4).width;
                VideoChatSettings.height = ((Camera.Size)localObject4).height;
              }
            }
          }
        }
        catch (Exception localException4)
        {
          localException4.printStackTrace();
          continue;
          nInFPS = paramInt1;
          if ((nInFPS <= 30) && (nInFPS >= 10)) {
            continue;
          }
          nInFPS = 10;
          Log.d("setCameraPara", "fps = " + nInFPS);
          if (((!this.DEV_MANUFACTURER.equalsIgnoreCase("samsung")) || (!this.DEV_MODEL.equalsIgnoreCase("GT-I9003"))) && ((!this.DEV_MANUFACTURER.equalsIgnoreCase("samsung")) || (!this.DEV_MODEL.equalsIgnoreCase("GT-I9220"))) && ((!this.DEV_MANUFACTURER.equalsIgnoreCase("samsung")) || (!this.DEV_MODEL.equalsIgnoreCase("GT-I7000")))) {
            continue;
          }
          ((Camera.Parameters)localObject2).setPreviewSize(320, 240);
          if (i == 0) {
            continue;
          }
          if (!QLog.isColorLevel()) {
            continue;
          }
          QLog.d("VcCamera", 0, "supportFormat = " + i);
          ((Camera.Parameters)localObject2).setPreviewFormat(i);
          ((Camera.Parameters)localObject2).setPreviewFrameRate(nInFPS);
          ((Camera.Parameters)localObject2).set("Rotation", 180);
          paramInt1 = 1;
          try
          {
            this.mCamera.setParameters((Camera.Parameters)localObject2);
            localSize = ((Camera.Parameters)localObject2).getPreviewSize();
            paramInt2 = ((Camera.Parameters)localObject2).getPreviewFormat();
            if (!QLog.isColorLevel()) {
              continue;
            }
            QLog.d("VcCamera", 0, "videoFormat = " + paramInt2);
            VideoChatSettings.width = localSize.width;
            VideoChatSettings.height = localSize.height;
            VideoChatSettings.format = paramInt2;
            if ((!this.DEV_MANUFACTURER.equalsIgnoreCase("meizu")) || (!this.DEV_MODEL.equalsIgnoreCase("meizu_m9"))) {
              continue;
            }
            VideoChatSettings.format = 18;
            if (paramInt1 != 0) {
              continue;
            }
            try
            {
              localObject2 = this.mCamera.getParameters();
              if (localObject2 != null)
              {
                VideoChatSettings.width = ((Camera.Parameters)localObject2).getPreviewSize().width;
                VideoChatSettings.height = ((Camera.Parameters)localObject2).getPreviewSize().height;
                VideoChatSettings.format = ((Camera.Parameters)localObject2).getPreviewFormat();
              }
            }
            catch (Exception localException2)
            {
              localException2.printStackTrace();
              continue;
            }
            if (17 != VideoChatSettings.format) {
              continue;
            }
            paramInt1 = VideoChatSettings.width * VideoChatSettings.height * 3 / 2;
            this.mPreBuffer = new byte[paramInt1];
            QLog.d("setCameraPara", 0, "i420 format, add buffer, buffer size: " + paramInt1);
            QLog.d("setCameraPara", 0, "width: " + VideoChatSettings.width + "height: " + VideoChatSettings.height + "format: " + VideoChatSettings.format);
            return;
            ((Camera.Parameters)localObject2).setPreviewSize(VideoChatSettings.width, VideoChatSettings.height);
            continue;
            if (!QLog.isColorLevel()) {
              continue;
            }
            QLog.d("VcCamera", 0, "supportFormat = 17(default value)");
            ((Camera.Parameters)localObject2).setPreviewFormat(17);
          }
          catch (Exception localException5)
          {
            localException5.printStackTrace();
            paramInt1 = 0;
            continue;
            if ((!this.DEV_MANUFACTURER.equalsIgnoreCase("ZTE")) || (!this.DEV_MODEL.equalsIgnoreCase("ZTE-T U880"))) {
              continue;
            }
            VideoChatSettings.format = 100;
            continue;
          }
        }
        if ((nInFPS > 30) || (nInFPS < 10)) {
          nInFPS = 10;
        }
        try
        {
          localObject4 = localObject2.getClass().getMethod("getSupportedPreviewFrameRates", new Class[0]);
          if (localObject4 == null) {
            continue;
          }
          localObject4 = (List)((Method)localObject4).invoke(localObject2, (Object[])null);
          if (localObject4 == null) {
            continue;
          }
          localObject4 = ((List)localObject4).iterator();
          paramInt1 = 10;
          if (!((Iterator)localObject4).hasNext()) {
            continue;
          }
          Integer localInteger = (Integer)((Iterator)localObject4).next();
          if ((localInteger.intValue() > nInFPS) || (localInteger.intValue() < paramInt1)) {
            break label1357;
          }
          paramInt1 = localInteger.intValue();
          continue;
        }
        catch (Exception localException6)
        {
          Camera.Size localSize;
          continue;
          continue;
        }
        if (((List)localObject4).contains(Integer.valueOf(16)))
        {
          i = 16;
        }
        else if (((List)localObject4).contains(Integer.valueOf(20)))
        {
          i = 20;
        }
        else if (((List)localObject4).contains(Integer.valueOf(842094169)))
        {
          i = 842094169;
        }
        else if (((List)localObject4).contains(Integer.valueOf(4)))
        {
          i = 4;
        }
        else if (((List)localObject4).contains(Integer.valueOf(17)))
        {
          i = 17;
        }
        else if (((List)localObject4).contains(Integer.valueOf(16)))
        {
          i = 16;
        }
        else if (((List)localObject4).contains(Integer.valueOf(3)))
        {
          i = 3;
        }
        else if (((List)localObject4).contains(Integer.valueOf(2)))
        {
          i = 2;
        }
        else if (((List)localObject4).contains(Integer.valueOf(4)))
        {
          i = 4;
        }
        else if (((List)localObject4).contains(Integer.valueOf(100)))
        {
          i = 100;
        }
        else if (((List)localObject4).contains(Integer.valueOf(101)))
        {
          i = 101;
        }
        else if (((List)localObject4).contains(Integer.valueOf(102)))
        {
          i = 102;
        }
        else if (((List)localObject4).contains(Integer.valueOf(103)))
        {
          i = 103;
        }
        else
        {
          bool = ((List)localObject4).contains(Integer.valueOf(104));
          if (!bool) {
            break label1360;
          }
          i = 104;
        }
      }
    }
  }
  
  private void setDisplayOrientation(Camera paramCamera, int paramInt)
  {
    try
    {
      paramCamera.getClass().getMethod("setDisplayOrientation", new Class[] { Integer.TYPE }).invoke(paramCamera, new Object[] { Integer.valueOf(paramInt) });
      return;
    }
    catch (Exception paramCamera)
    {
      while (!QLog.isColorLevel()) {}
      QLog.d("VcCamera", 0, "setDisplayOrientation", paramCamera);
    }
  }
  
  private static ArrayList<Integer> splitInt(String paramString)
  {
    if (paramString == null)
    {
      paramString = null;
      return paramString;
    }
    StringTokenizer localStringTokenizer = new StringTokenizer(paramString, ",");
    ArrayList localArrayList = new ArrayList();
    for (;;)
    {
      paramString = localArrayList;
      if (!localStringTokenizer.hasMoreElements()) {
        break;
      }
      localArrayList.add(Integer.valueOf(Integer.parseInt(localStringTokenizer.nextToken())));
    }
  }
  
  private Camera tryMotoFrontCamera()
  {
    Camera localCamera2 = this.mCamera;
    Camera localCamera1;
    if (localCamera2 != null) {
      localCamera1 = localCamera2;
    }
    try
    {
      localCamera2.release();
      localCamera1 = localCamera2;
      localCamera2 = Camera.open();
      if (localCamera2 == null) {
        return null;
      }
      localCamera1 = localCamera2;
      Camera.Parameters localParameters = (Camera.Parameters)localCamera2.getClass().getMethod("getCustomParameters", new Class[0]).invoke(localCamera2, new Object[0]);
      localCamera1 = localCamera2;
      ArrayList localArrayList = splitInt(localParameters.get("camera-sensor-values"));
      localCamera1 = localCamera2;
      Method localMethod = localCamera2.getClass().getMethod("setCustomParameters", new Class[] { localParameters.getClass() });
      if (localArrayList != null)
      {
        localCamera1 = localCamera2;
        if (localArrayList.indexOf(Integer.valueOf(1)) != -1)
        {
          localCamera1 = localCamera2;
          localParameters.set("camera-sensor", "1");
          localCamera1 = localCamera2;
          localMethod.invoke(localCamera2, new Object[] { localParameters });
          return localCamera2;
        }
      }
    }
    catch (Exception localException)
    {
      if (QLog.isColorLevel()) {
        QLog.d("VcCamera", 0, "tryMotoFrontCamera", localException);
      }
      if (localCamera1 != null) {
        localCamera1.release();
      }
      return null;
    }
    return localException;
  }
  
  private Camera trySamsungFrontCamera()
  {
    Camera localCamera = this.mCamera;
    if (localCamera != null) {}
    try
    {
      localCamera.release();
      localCamera = Camera.open();
      if (localCamera == null) {
        return null;
      }
      Camera.Parameters localParameters = localCamera.getParameters();
      localParameters.set("camera-id", 2);
      localCamera.setParameters(localParameters);
      this.mCamera = localCamera;
      return localCamera;
    }
    catch (Exception localException)
    {
      if (QLog.isColorLevel()) {
        QLog.d("VcCamera", 0, "trySamsungFrontCamera", localException);
      }
    }
    return null;
  }
  
  public void close()
  {
    if (this.mCameraHandler == null) {
      return;
    }
    this.mCameraHandler.post(new VcCamera.4(this));
  }
  
  void closeInternal()
  {
    if (QLog.isColorLevel()) {
      QLog.d("VcCamera", 0, "closeCamera begin.");
    }
    if ((this.mCamera == null) && (!isCameraOpened) && (QLog.isColorLevel())) {
      QLog.d("VcCamera", 0, "Camera not open.");
    }
    if (this.mCamera != null) {
      if (isCameraOpened)
      {
        if (this.mPreBuffer == null) {
          break label110;
        }
        this.mCamera.setPreviewCallbackWithBuffer(null);
      }
    }
    for (;;)
    {
      this.mCamera.stopPreview();
      this.mCamera.release();
      this.mCamera = null;
      isCameraOpened = false;
      if (QLog.isColorLevel()) {
        QLog.d("VcCamera", 0, "closeCamera end.");
      }
      return;
      label110:
      this.mCamera.setPreviewCallback(null);
    }
  }
  
  public boolean finish()
  {
    if (this.mCameraHandler == null) {
      return false;
    }
    this.mCameraHandler.post(new VcCamera.5(this));
    return true;
  }
  
  public Object getCamera()
  {
    if ((!isCameraOpened) || (this.mCamera == null)) {
      return null;
    }
    return this.mCamera;
  }
  
  public Object getCameraHandler()
  {
    return this.mCameraHandler;
  }
  
  public Object getCameraParameter()
  {
    if ((!isCameraOpened) || (this.mCamera == null)) {
      return null;
    }
    return this.mCamera.getParameters();
  }
  
  public int getCompenSateRecvAngle()
  {
    return this.CompenSateRecvAngle;
  }
  
  public int getCompenSateSendAngle()
  {
    return this.CompenSateSendAngle;
  }
  
  public int getOrientation()
  {
    if (Info.orientation == -1)
    {
      if (this.CUR_CAMERA == 0) {
        return 270;
      }
      if (this.CUR_CAMERA == 1) {
        return 90;
      }
    }
    return Info.orientation;
  }
  
  int getPreviewAngleForBackCamera()
  {
    return ConfigSystemImpl.GetAngleForCamera(this.mContext, false, true, (byte)0) * 90;
  }
  
  int getPreviewAngleForFrontCamera()
  {
    return 360 - ConfigSystemImpl.GetAngleForCamera(this.mContext, true, true, (byte)0) * 90;
  }
  
  int getRemoteAngleForBackCamera(int paramInt)
  {
    byte b;
    switch (paramInt)
    {
    default: 
      b = 0;
    }
    for (;;)
    {
      return ConfigSystemImpl.GetAngleForCamera(this.mContext, false, false, b) * 90;
      b = 0;
      continue;
      b = 1;
      continue;
      b = 2;
      continue;
      b = 3;
    }
  }
  
  int getRemoteAngleForFrontCamera(int paramInt)
  {
    byte b;
    switch (paramInt)
    {
    default: 
      b = 0;
    }
    for (;;)
    {
      return ConfigSystemImpl.GetAngleForCamera(this.mContext, true, false, b) * 90;
      b = 0;
      continue;
      b = 1;
      continue;
      b = 2;
      continue;
      b = 3;
    }
  }
  
  public int getRotation()
  {
    if (Info.rotation == -1) {
      return 0;
    }
    return Info.rotation;
  }
  
  public int getUserCameraAngle(boolean paramBoolean)
  {
    if (paramBoolean == true) {
      return this.mFrontCameraAngle;
    }
    return this.mBackCameraAngle;
  }
  
  public boolean isFrontCamera()
  {
    if (this.CUR_CAMERA == -1) {}
    while (this.CUR_CAMERA == 0) {
      return true;
    }
    return false;
  }
  
  native void onCaptureFrame(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
  
  native void onCloseCamera();
  
  native void onFinishCamera();
  
  native void onOpenCamera(boolean paramBoolean);
  
  public void open(int paramInt)
  {
    QLog.d("VcCamera", 0, "openCamera begin.");
    if (this.mCameraThread == null)
    {
      this.mCameraThread = new HandlerThread("CAMERA");
      this.mCameraThread.start();
      this.mCameraHandler = new Handler(this.mCameraThread.getLooper());
    }
    this.mCameraHandler.post(new VcCamera.3(this, paramInt));
  }
  
  public void setCameraAngleFix(boolean paramBoolean, int paramInt)
  {
    if (paramBoolean) {
      this.mFrontCameraAngle = (paramInt % 360);
    }
    for (;;)
    {
      if (QLog.isColorLevel()) {
        QLog.d("VcCamera", 0, "mFrontCameraAngle" + this.mFrontCameraAngle + "mBackCameraAngle" + this.mBackCameraAngle);
      }
      return;
      this.mBackCameraAngle = (paramInt % 360);
    }
  }
  
  public void setCameraParaDynamic(int paramInt1, int paramInt2)
  {
    QLog.d("VcCamera", 0, "setCameraParaDynamic w: " + paramInt1 + " h: " + paramInt2);
    if (this.mCameraHandler == null) {
      return;
    }
    this.mCameraHandler.post(new VcCamera.1(this, paramInt1, paramInt2));
  }
  
  public void setCameraParameter(Object paramObject)
  {
    this.mCameraHandler.post(new VcCamera.2(this, paramObject));
  }
  
  public void setCameraPreviewChangeCallback(Object paramObject)
  {
    try
    {
      mCameraPreviewChangeCallback = paramObject;
      return;
    }
    finally
    {
      paramObject = finally;
      throw ((Throwable)paramObject);
    }
  }
  
  public void setPreviewDisplay(Object paramObject)
  {
    this.mHolder = ((SurfaceHolder)paramObject);
  }
  
  public void setRotation(int paramInt)
  {
    Info.rotation = ((this.CompenSateSendAngle + paramInt) % 360);
  }
  
  public void setWebConfigFps(int paramInt)
  {
    Log.d("setWebConfigFps", "fps = " + paramInt);
    nInFPS = paramInt;
  }
  
  public void switchCamera(int paramInt)
  {
    this.mCameraHandler.post(new VcCamera.SwitchCameraRunnable(this, paramInt));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\camera\VcCamera.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */