package com.thinkive.mobile.account.tools;

import android.content.Context;
import android.hardware.Camera;
import android.hardware.Camera.PictureCallback;
import android.hardware.Camera.ShutterCallback;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import com.android.thinkive.framework.util.ResourceUtil;

public class FaceEditPhotoView
  extends FrameLayout
{
  public static boolean a;
  private Context b;
  private Camera c;
  private SurfaceView d = null;
  private SurfaceHolder e = null;
  private boolean f = false;
  private int g = 1;
  private int h = 0;
  private Camera.ShutterCallback i = new FaceEditPhotoView.1(this);
  private Camera.PictureCallback j = new FaceEditPhotoView.2(this);
  private Camera.PictureCallback k = new FaceEditPhotoView.3(this);
  
  public FaceEditPhotoView(Context paramContext)
  {
    super(paramContext);
  }
  
  public FaceEditPhotoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.b = paramContext;
    this.d = ((SurfaceView)LayoutInflater.from(paramContext).inflate(ResourceUtil.getResourceID(paramContext, "layout", "fxc_kh_control_photo_view"), this, true).findViewById(ResourceUtil.getResourceID(paramContext, "id", "photo_view")));
    this.d.setOnTouchListener(new FaceEditPhotoView.4(this));
    this.e = this.d.getHolder();
    this.e.setType(3);
    this.e.addCallback(new FaceEditPhotoView.5(this));
  }
  
  public FaceEditPhotoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final void a()
  {
    if ((this.c != null) && (this.f))
    {
      this.c.stopPreview();
      this.c.release();
      this.c = null;
      this.f = false;
    }
  }
  
  /* Error */
  public final void a(int paramInt)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 5
    //   3: aload_0
    //   4: getfield 33	com/thinkive/mobile/account/tools/FaceEditPhotoView:f	Z
    //   7: ifne +156 -> 163
    //   10: iload_1
    //   11: ifne +230 -> 241
    //   14: aload_0
    //   15: invokestatic 143	android/hardware/Camera:open	()Landroid/hardware/Camera;
    //   18: putfield 123	com/thinkive/mobile/account/tools/FaceEditPhotoView:c	Landroid/hardware/Camera;
    //   21: aload_0
    //   22: getfield 123	com/thinkive/mobile/account/tools/FaceEditPhotoView:c	Landroid/hardware/Camera;
    //   25: ifnull +138 -> 163
    //   28: getstatic 149	android/os/Build:MODEL	Ljava/lang/String;
    //   31: ldc -105
    //   33: invokevirtual 157	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   36: ifne +14 -> 50
    //   39: getstatic 149	android/os/Build:MODEL	Ljava/lang/String;
    //   42: ldc -97
    //   44: invokevirtual 157	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   47: ifeq +295 -> 342
    //   50: aload_0
    //   51: getfield 123	com/thinkive/mobile/account/tools/FaceEditPhotoView:c	Landroid/hardware/Camera;
    //   54: sipush 270
    //   57: invokevirtual 162	android/hardware/Camera:setDisplayOrientation	(I)V
    //   60: aload_0
    //   61: getfield 123	com/thinkive/mobile/account/tools/FaceEditPhotoView:c	Landroid/hardware/Camera;
    //   64: invokevirtual 166	android/hardware/Camera:getParameters	()Landroid/hardware/Camera$Parameters;
    //   67: astore_2
    //   68: getstatic 170	com/thinkive/mobile/account/activitys/FacePhotographActivity:c	Ljava/lang/String;
    //   71: ldc -84
    //   73: invokevirtual 157	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   76: ifeq +18 -> 94
    //   79: iload_1
    //   80: aload_0
    //   81: getfield 35	com/thinkive/mobile/account/tools/FaceEditPhotoView:g	I
    //   84: if_icmpne +270 -> 354
    //   87: aload_2
    //   88: sipush 270
    //   91: invokevirtual 177	android/hardware/Camera$Parameters:setRotation	(I)V
    //   94: aload_2
    //   95: invokevirtual 181	android/hardware/Camera$Parameters:getSupportedPictureSizes	()Ljava/util/List;
    //   98: astore_3
    //   99: invokestatic 186	q:a	()Lq;
    //   102: aload_3
    //   103: sipush 1024
    //   106: sipush 768
    //   109: invokevirtual 189	q:a	(Ljava/util/List;II)Landroid/hardware/Camera$Size;
    //   112: astore_3
    //   113: aload_2
    //   114: aload_3
    //   115: getfield 194	android/hardware/Camera$Size:width	I
    //   118: aload_3
    //   119: getfield 197	android/hardware/Camera$Size:height	I
    //   122: invokevirtual 201	android/hardware/Camera$Parameters:setPictureSize	(II)V
    //   125: aload_2
    //   126: sipush 256
    //   129: invokevirtual 204	android/hardware/Camera$Parameters:setPictureFormat	(I)V
    //   132: aload_0
    //   133: getfield 123	com/thinkive/mobile/account/tools/FaceEditPhotoView:c	Landroid/hardware/Camera;
    //   136: aload_2
    //   137: invokevirtual 208	android/hardware/Camera:setParameters	(Landroid/hardware/Camera$Parameters;)V
    //   140: aload_0
    //   141: getfield 123	com/thinkive/mobile/account/tools/FaceEditPhotoView:c	Landroid/hardware/Camera;
    //   144: aload_0
    //   145: getfield 31	com/thinkive/mobile/account/tools/FaceEditPhotoView:e	Landroid/view/SurfaceHolder;
    //   148: invokevirtual 212	android/hardware/Camera:setPreviewDisplay	(Landroid/view/SurfaceHolder;)V
    //   151: aload_0
    //   152: getfield 123	com/thinkive/mobile/account/tools/FaceEditPhotoView:c	Landroid/hardware/Camera;
    //   155: invokevirtual 215	android/hardware/Camera:startPreview	()V
    //   158: aload_0
    //   159: iconst_1
    //   160: putfield 33	com/thinkive/mobile/account/tools/FaceEditPhotoView:f	Z
    //   163: aload_0
    //   164: getfield 123	com/thinkive/mobile/account/tools/FaceEditPhotoView:c	Landroid/hardware/Camera;
    //   167: new 217	com/thinkive/mobile/account/tools/FaceEditPhotoView$6
    //   170: dup
    //   171: aload_0
    //   172: invokespecial 218	com/thinkive/mobile/account/tools/FaceEditPhotoView$6:<init>	(Lcom/thinkive/mobile/account/tools/FaceEditPhotoView;)V
    //   175: invokevirtual 222	android/hardware/Camera:autoFocus	(Landroid/hardware/Camera$AutoFocusCallback;)V
    //   178: return
    //   179: astore_2
    //   180: aload_0
    //   181: getfield 60	com/thinkive/mobile/account/tools/FaceEditPhotoView:b	Landroid/content/Context;
    //   184: ldc -32
    //   186: iconst_1
    //   187: invokestatic 230	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   190: invokevirtual 233	android/widget/Toast:show	()V
    //   193: goto -172 -> 21
    //   196: astore_2
    //   197: aload_0
    //   198: getfield 60	com/thinkive/mobile/account/tools/FaceEditPhotoView:b	Landroid/content/Context;
    //   201: ldc -21
    //   203: iconst_1
    //   204: invokestatic 230	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   207: invokevirtual 233	android/widget/Toast:show	()V
    //   210: aload_2
    //   211: invokevirtual 238	java/lang/Exception:printStackTrace	()V
    //   214: aload_0
    //   215: invokevirtual 240	com/thinkive/mobile/account/tools/FaceEditPhotoView:a	()V
    //   218: aload_0
    //   219: getfield 60	com/thinkive/mobile/account/tools/FaceEditPhotoView:b	Landroid/content/Context;
    //   222: instanceof 242
    //   225: ifeq -62 -> 163
    //   228: aload_0
    //   229: getfield 60	com/thinkive/mobile/account/tools/FaceEditPhotoView:b	Landroid/content/Context;
    //   232: checkcast 242	android/app/Activity
    //   235: invokevirtual 245	android/app/Activity:finish	()V
    //   238: goto -75 -> 163
    //   241: iload_1
    //   242: aload_0
    //   243: getfield 35	com/thinkive/mobile/account/tools/FaceEditPhotoView:g	I
    //   246: if_icmpne -225 -> 21
    //   249: iconst_0
    //   250: istore 4
    //   252: iload 4
    //   254: invokestatic 249	android/hardware/Camera:getNumberOfCameras	()I
    //   257: if_icmplt +48 -> 305
    //   260: iload 5
    //   262: istore 4
    //   264: iload 4
    //   266: ifne -245 -> 21
    //   269: aload_0
    //   270: getfield 60	com/thinkive/mobile/account/tools/FaceEditPhotoView:b	Landroid/content/Context;
    //   273: ldc -5
    //   275: iconst_1
    //   276: invokestatic 230	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   279: invokevirtual 233	android/widget/Toast:show	()V
    //   282: aload_0
    //   283: getfield 60	com/thinkive/mobile/account/tools/FaceEditPhotoView:b	Landroid/content/Context;
    //   286: instanceof 242
    //   289: ifeq -268 -> 21
    //   292: aload_0
    //   293: getfield 60	com/thinkive/mobile/account/tools/FaceEditPhotoView:b	Landroid/content/Context;
    //   296: checkcast 242	android/app/Activity
    //   299: invokevirtual 245	android/app/Activity:finish	()V
    //   302: goto -281 -> 21
    //   305: new 253	android/hardware/Camera$CameraInfo
    //   308: dup
    //   309: invokespecial 255	android/hardware/Camera$CameraInfo:<init>	()V
    //   312: astore_2
    //   313: iload 4
    //   315: aload_2
    //   316: invokestatic 259	android/hardware/Camera:getCameraInfo	(ILandroid/hardware/Camera$CameraInfo;)V
    //   319: aload_2
    //   320: getfield 262	android/hardware/Camera$CameraInfo:facing	I
    //   323: iconst_1
    //   324: if_icmpne +53 -> 377
    //   327: aload_0
    //   328: iload 4
    //   330: invokestatic 265	android/hardware/Camera:open	(I)Landroid/hardware/Camera;
    //   333: putfield 123	com/thinkive/mobile/account/tools/FaceEditPhotoView:c	Landroid/hardware/Camera;
    //   336: iconst_1
    //   337: istore 4
    //   339: goto -75 -> 264
    //   342: aload_0
    //   343: getfield 123	com/thinkive/mobile/account/tools/FaceEditPhotoView:c	Landroid/hardware/Camera;
    //   346: bipush 90
    //   348: invokevirtual 162	android/hardware/Camera:setDisplayOrientation	(I)V
    //   351: goto -291 -> 60
    //   354: aload_2
    //   355: bipush 90
    //   357: invokevirtual 177	android/hardware/Camera$Parameters:setRotation	(I)V
    //   360: goto -266 -> 94
    //   363: astore_2
    //   364: aload_2
    //   365: invokevirtual 238	java/lang/Exception:printStackTrace	()V
    //   368: goto -228 -> 140
    //   371: astore_2
    //   372: aload_2
    //   373: invokevirtual 238	java/lang/Exception:printStackTrace	()V
    //   376: return
    //   377: iload 4
    //   379: iconst_1
    //   380: iadd
    //   381: istore 4
    //   383: goto -131 -> 252
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	386	0	this	FaceEditPhotoView
    //   0	386	1	paramInt	int
    //   67	70	2	localParameters	android.hardware.Camera.Parameters
    //   179	1	2	localThrowable	Throwable
    //   196	15	2	localException1	Exception
    //   312	43	2	localCameraInfo	android.hardware.Camera.CameraInfo
    //   363	2	2	localException2	Exception
    //   371	2	2	localException3	Exception
    //   98	21	3	localObject	Object
    //   250	132	4	m	int
    //   1	260	5	n	int
    // Exception table:
    //   from	to	target	type
    //   14	21	179	java/lang/Throwable
    //   14	21	196	java/lang/Exception
    //   21	50	196	java/lang/Exception
    //   50	60	196	java/lang/Exception
    //   60	94	196	java/lang/Exception
    //   94	132	196	java/lang/Exception
    //   140	163	196	java/lang/Exception
    //   180	193	196	java/lang/Exception
    //   241	249	196	java/lang/Exception
    //   252	260	196	java/lang/Exception
    //   269	302	196	java/lang/Exception
    //   305	336	196	java/lang/Exception
    //   342	351	196	java/lang/Exception
    //   354	360	196	java/lang/Exception
    //   364	368	196	java/lang/Exception
    //   132	140	363	java/lang/Exception
    //   163	178	371	java/lang/Exception
  }
  
  public final void b()
  {
    if ((this.c != null) && (this.f))
    {
      if (a) {
        this.c.takePicture(this.i, this.j, this.k);
      }
    }
    else {
      return;
    }
    try
    {
      this.c.autoFocus(new FaceEditPhotoView.7(this));
      return;
    }
    catch (Exception localException) {}
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\thinkive\mobile\account\tools\FaceEditPhotoView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */