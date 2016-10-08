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

public class EditPhotoView
  extends FrameLayout
{
  public static boolean a;
  public static int b;
  private Context c;
  private Camera d;
  private SurfaceView e = null;
  private SurfaceHolder f = null;
  private boolean g = false;
  private int h = 1;
  private int i = 0;
  private Camera.ShutterCallback j = new EditPhotoView.1(this);
  private Camera.PictureCallback k = new EditPhotoView.2(this);
  private Camera.PictureCallback l = new EditPhotoView.3(this);
  
  public EditPhotoView(Context paramContext)
  {
    super(paramContext);
  }
  
  public EditPhotoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.c = paramContext;
    this.e = ((SurfaceView)LayoutInflater.from(paramContext).inflate(ResourceUtil.getResourceID(paramContext, "layout", "fxc_kh_control_photo_view"), this, true).findViewById(ResourceUtil.getResourceID(paramContext, "id", "photo_view")));
    this.e.setOnTouchListener(new EditPhotoView.4(this));
    this.f = this.e.getHolder();
    this.f.setType(3);
    this.f.addCallback(new EditPhotoView.5(this));
  }
  
  public EditPhotoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final void a()
  {
    if ((this.d != null) && (this.g))
    {
      this.d.setPreviewCallback(null);
      this.d.stopPreview();
      this.d.release();
      this.d = null;
      this.g = false;
    }
  }
  
  /* Error */
  public final void a(int paramInt)
  {
    // Byte code:
    //   0: iload_1
    //   1: putstatic 148	com/thinkive/mobile/account/tools/EditPhotoView:b	I
    //   4: aload_0
    //   5: getfield 34	com/thinkive/mobile/account/tools/EditPhotoView:g	Z
    //   8: ifne +133 -> 141
    //   11: iload_1
    //   12: ifne +170 -> 182
    //   15: aload_0
    //   16: invokestatic 152	android/hardware/Camera:open	()Landroid/hardware/Camera;
    //   19: putfield 124	com/thinkive/mobile/account/tools/EditPhotoView:d	Landroid/hardware/Camera;
    //   22: aload_0
    //   23: getfield 124	com/thinkive/mobile/account/tools/EditPhotoView:d	Landroid/hardware/Camera;
    //   26: ifnull +115 -> 141
    //   29: aload_0
    //   30: getfield 124	com/thinkive/mobile/account/tools/EditPhotoView:d	Landroid/hardware/Camera;
    //   33: bipush 90
    //   35: invokevirtual 155	android/hardware/Camera:setDisplayOrientation	(I)V
    //   38: aload_0
    //   39: getfield 124	com/thinkive/mobile/account/tools/EditPhotoView:d	Landroid/hardware/Camera;
    //   42: invokevirtual 159	android/hardware/Camera:getParameters	()Landroid/hardware/Camera$Parameters;
    //   45: astore_2
    //   46: getstatic 164	com/thinkive/mobile/account/activitys/PhotographActivity:a	Ljava/lang/String;
    //   49: ldc -90
    //   51: invokevirtual 172	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   54: ifeq +18 -> 72
    //   57: iload_1
    //   58: aload_0
    //   59: getfield 36	com/thinkive/mobile/account/tools/EditPhotoView:h	I
    //   62: if_icmpne +181 -> 243
    //   65: aload_2
    //   66: sipush 270
    //   69: invokevirtual 177	android/hardware/Camera$Parameters:setRotation	(I)V
    //   72: aload_2
    //   73: invokevirtual 181	android/hardware/Camera$Parameters:getSupportedPictureSizes	()Ljava/util/List;
    //   76: astore_3
    //   77: invokestatic 186	q:a	()Lq;
    //   80: aload_3
    //   81: sipush 1024
    //   84: sipush 768
    //   87: invokevirtual 189	q:a	(Ljava/util/List;II)Landroid/hardware/Camera$Size;
    //   90: astore_3
    //   91: aload_2
    //   92: aload_3
    //   93: getfield 194	android/hardware/Camera$Size:width	I
    //   96: aload_3
    //   97: getfield 197	android/hardware/Camera$Size:height	I
    //   100: invokevirtual 201	android/hardware/Camera$Parameters:setPictureSize	(II)V
    //   103: aload_2
    //   104: sipush 256
    //   107: invokevirtual 204	android/hardware/Camera$Parameters:setPictureFormat	(I)V
    //   110: aload_0
    //   111: getfield 124	com/thinkive/mobile/account/tools/EditPhotoView:d	Landroid/hardware/Camera;
    //   114: aload_2
    //   115: invokevirtual 208	android/hardware/Camera:setParameters	(Landroid/hardware/Camera$Parameters;)V
    //   118: aload_0
    //   119: getfield 124	com/thinkive/mobile/account/tools/EditPhotoView:d	Landroid/hardware/Camera;
    //   122: aload_0
    //   123: getfield 32	com/thinkive/mobile/account/tools/EditPhotoView:f	Landroid/view/SurfaceHolder;
    //   126: invokevirtual 212	android/hardware/Camera:setPreviewDisplay	(Landroid/view/SurfaceHolder;)V
    //   129: aload_0
    //   130: getfield 124	com/thinkive/mobile/account/tools/EditPhotoView:d	Landroid/hardware/Camera;
    //   133: invokevirtual 215	android/hardware/Camera:startPreview	()V
    //   136: aload_0
    //   137: iconst_1
    //   138: putfield 34	com/thinkive/mobile/account/tools/EditPhotoView:g	Z
    //   141: aload_0
    //   142: getfield 124	com/thinkive/mobile/account/tools/EditPhotoView:d	Landroid/hardware/Camera;
    //   145: new 217	com/thinkive/mobile/account/tools/EditPhotoView$6
    //   148: dup
    //   149: aload_0
    //   150: invokespecial 218	com/thinkive/mobile/account/tools/EditPhotoView$6:<init>	(Lcom/thinkive/mobile/account/tools/EditPhotoView;)V
    //   153: invokevirtual 222	android/hardware/Camera:autoFocus	(Landroid/hardware/Camera$AutoFocusCallback;)V
    //   156: return
    //   157: astore_2
    //   158: aload_0
    //   159: getfield 61	com/thinkive/mobile/account/tools/EditPhotoView:c	Landroid/content/Context;
    //   162: ldc -32
    //   164: iconst_1
    //   165: invokestatic 230	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   168: invokevirtual 233	android/widget/Toast:show	()V
    //   171: goto -149 -> 22
    //   174: astore_2
    //   175: aload_0
    //   176: invokevirtual 235	com/thinkive/mobile/account/tools/EditPhotoView:a	()V
    //   179: goto -38 -> 141
    //   182: iload_1
    //   183: aload_0
    //   184: getfield 36	com/thinkive/mobile/account/tools/EditPhotoView:h	I
    //   187: if_icmpne -165 -> 22
    //   190: getstatic 240	android/os/Build$VERSION:SDK_INT	I
    //   193: bipush 9
    //   195: if_icmplt -173 -> 22
    //   198: iconst_0
    //   199: istore 4
    //   201: iload 4
    //   203: invokestatic 244	android/hardware/Camera:getNumberOfCameras	()I
    //   206: if_icmpge -184 -> 22
    //   209: new 246	android/hardware/Camera$CameraInfo
    //   212: dup
    //   213: invokespecial 248	android/hardware/Camera$CameraInfo:<init>	()V
    //   216: astore_2
    //   217: iload 4
    //   219: aload_2
    //   220: invokestatic 252	android/hardware/Camera:getCameraInfo	(ILandroid/hardware/Camera$CameraInfo;)V
    //   223: aload_2
    //   224: getfield 255	android/hardware/Camera$CameraInfo:facing	I
    //   227: iconst_1
    //   228: if_icmpne +34 -> 262
    //   231: aload_0
    //   232: iload 4
    //   234: invokestatic 258	android/hardware/Camera:open	(I)Landroid/hardware/Camera;
    //   237: putfield 124	com/thinkive/mobile/account/tools/EditPhotoView:d	Landroid/hardware/Camera;
    //   240: goto -218 -> 22
    //   243: aload_2
    //   244: bipush 90
    //   246: invokevirtual 177	android/hardware/Camera$Parameters:setRotation	(I)V
    //   249: goto -177 -> 72
    //   252: astore_2
    //   253: aload_2
    //   254: invokevirtual 261	java/lang/Exception:printStackTrace	()V
    //   257: goto -139 -> 118
    //   260: astore_2
    //   261: return
    //   262: iload 4
    //   264: iconst_1
    //   265: iadd
    //   266: istore 4
    //   268: goto -67 -> 201
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	271	0	this	EditPhotoView
    //   0	271	1	paramInt	int
    //   45	70	2	localParameters	android.hardware.Camera.Parameters
    //   157	1	2	localThrowable	Throwable
    //   174	1	2	localIOException	java.io.IOException
    //   216	28	2	localCameraInfo	android.hardware.Camera.CameraInfo
    //   252	2	2	localException1	Exception
    //   260	1	2	localException2	Exception
    //   76	21	3	localObject	Object
    //   199	68	4	m	int
    // Exception table:
    //   from	to	target	type
    //   15	22	157	java/lang/Throwable
    //   15	22	174	java/io/IOException
    //   22	72	174	java/io/IOException
    //   72	110	174	java/io/IOException
    //   110	118	174	java/io/IOException
    //   118	141	174	java/io/IOException
    //   158	171	174	java/io/IOException
    //   182	198	174	java/io/IOException
    //   201	240	174	java/io/IOException
    //   243	249	174	java/io/IOException
    //   253	257	174	java/io/IOException
    //   110	118	252	java/lang/Exception
    //   141	156	260	java/lang/Exception
  }
  
  public final void b()
  {
    if ((this.d != null) && (this.g))
    {
      if (a) {
        this.d.takePicture(this.j, this.k, this.l);
      }
    }
    else {
      return;
    }
    try
    {
      this.d.autoFocus(new EditPhotoView.7(this));
      return;
    }
    catch (Exception localException) {}
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\thinkive\mobile\account\tools\EditPhotoView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */