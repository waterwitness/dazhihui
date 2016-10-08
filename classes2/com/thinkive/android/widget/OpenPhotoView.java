package com.thinkive.android.widget;

import android.content.Context;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.PictureCallback;
import android.hardware.Camera.ShutterCallback;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import br;
import bu;
import com.android.thinkive.framework.util.ResourceUtil;

public class OpenPhotoView
  extends FrameLayout
{
  public static int a = 1;
  public static int b = 0;
  public static boolean c;
  private static SurfaceView g;
  private static SurfaceHolder h;
  private Context d;
  private Camera e;
  private br f;
  private boolean i = false;
  private bu j;
  private int k = 0;
  private boolean l;
  private Camera.ShutterCallback m = new OpenPhotoView.1(this);
  private Camera.PictureCallback n = new OpenPhotoView.2(this);
  private Camera.PictureCallback o = new OpenPhotoView.3(this);
  
  public OpenPhotoView(Context paramContext)
  {
    super(paramContext);
  }
  
  public OpenPhotoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.d = paramContext;
    paramContext = (SurfaceView)LayoutInflater.from(paramContext).inflate(ResourceUtil.getResourceID(paramContext, "layout", "fxc_kh_control_photo_view"), this, true).findViewById(ResourceUtil.getResourceID(paramContext, "id", "photo_view"));
    g = paramContext;
    paramContext.setOnTouchListener(new OpenPhotoView.4(this));
    paramContext = g.getHolder();
    h = paramContext;
    paramContext.setType(3);
    h.setKeepScreenOn(true);
    g.setFocusable(true);
    this.l = true;
    h.addCallback(new OpenPhotoView.5(this));
  }
  
  public OpenPhotoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private boolean d()
  {
    int i1 = 0;
    for (;;)
    {
      try
      {
        if (i1 >= Camera.getNumberOfCameras()) {
          return false;
        }
        Camera.CameraInfo localCameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i1, localCameraInfo);
        if (localCameraInfo.facing == 1)
        {
          this.e = Camera.open(i1);
          return true;
        }
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        return false;
      }
      i1 += 1;
    }
  }
  
  public final void a()
  {
    if (this.e != null)
    {
      Log.e("asos", "openPhotoView close");
      this.e.setPreviewCallback(null);
      if (this.i)
      {
        this.e.stopPreview();
        this.i = false;
      }
      this.e.release();
      this.e = null;
    }
  }
  
  public final void a(int paramInt)
  {
    Log.e("asos", "openPhotoView open");
    post(new OpenPhotoView.7(this, paramInt));
  }
  
  public final void b()
  {
    a(this.k);
  }
  
  public final void c()
  {
    if ((this.e != null) && (this.i)) {
      try
      {
        if (c)
        {
          this.e.takePicture(this.m, this.n, this.o);
          return;
        }
        this.e.autoFocus(new OpenPhotoView.8(this));
        return;
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
      }
    }
  }
  
  public void setCamera_Orientation(int paramInt)
  {
    this.k = paramInt;
  }
  
  public void setMyJpegCallback(bu parambu)
  {
    this.j = parambu;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\thinkive\android\widget\OpenPhotoView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */