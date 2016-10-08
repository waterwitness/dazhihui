package com.thinkive.mobile.account.tools;

import android.app.Activity;
import android.content.Context;
import android.hardware.Camera;
import android.hardware.Camera.Size;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.android.thinkive.framework.util.ResourceUtil;
import java.util.Iterator;
import java.util.List;

public class IdentityPhotoView
  extends FrameLayout
{
  public static boolean a;
  private Context b;
  private Camera c;
  private SurfaceView d;
  private SurfaceHolder e;
  private boolean f = false;
  private int g = 1;
  private int h = 0;
  
  public IdentityPhotoView(Context paramContext)
  {
    super(paramContext);
    new IdentityPhotoView.1(this);
    new IdentityPhotoView.2(this);
    new IdentityPhotoView.3(this);
  }
  
  public IdentityPhotoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    new IdentityPhotoView.1(this);
    new IdentityPhotoView.2(this);
    new IdentityPhotoView.3(this);
    this.b = paramContext;
    this.d = ((SurfaceView)LayoutInflater.from(paramContext).inflate(ResourceUtil.getResourceID(paramContext, "layout", "fxc_kh_control_photo_view"), this, true).findViewById(ResourceUtil.getResourceID(paramContext, "id", "photo_view")));
    this.d.setOnTouchListener(new IdentityPhotoView.4(this));
    this.e = this.d.getHolder();
    this.e.setType(3);
    this.e.addCallback(new IdentityPhotoView.5(this));
  }
  
  public IdentityPhotoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    new IdentityPhotoView.1(this);
    new IdentityPhotoView.2(this);
    new IdentityPhotoView.3(this);
  }
  
  private Camera.Size a(List<Camera.Size> paramList)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    double d2 = Double.MAX_VALUE;
    Object localObject3 = ((Activity)this.b).getWindowManager().getDefaultDisplay();
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    ((Display)localObject3).getMetrics(localDisplayMetrics);
    int i = localDisplayMetrics.widthPixels;
    int j = localDisplayMetrics.heightPixels;
    double d3 = i / j;
    if (paramList == null) {
      return (Camera.Size)localObject2;
    }
    localObject3 = paramList.iterator();
    double d1 = Double.MAX_VALUE;
    for (;;)
    {
      if (!((Iterator)localObject3).hasNext())
      {
        localObject2 = localObject1;
        if (localObject1 != null) {
          break;
        }
        localObject3 = paramList.iterator();
        d1 = d2;
        for (;;)
        {
          localObject2 = localObject1;
          if (!((Iterator)localObject3).hasNext()) {
            break;
          }
          paramList = (Camera.Size)((Iterator)localObject3).next();
          if (Math.abs(paramList.height - j) < d1)
          {
            d1 = Math.abs(paramList.height - j);
            localObject1 = paramList;
          }
        }
      }
      localObject2 = (Camera.Size)((Iterator)localObject3).next();
      if ((Math.abs(((Camera.Size)localObject2).width / ((Camera.Size)localObject2).height - d3) <= 0.05D) && (Math.abs(((Camera.Size)localObject2).height - j) < d1))
      {
        d1 = Math.abs(((Camera.Size)localObject2).height - j);
        localObject1 = localObject2;
      }
    }
  }
  
  public final void a()
  {
    post(new IdentityPhotoView.6(this));
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\thinkive\mobile\account\tools\IdentityPhotoView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */