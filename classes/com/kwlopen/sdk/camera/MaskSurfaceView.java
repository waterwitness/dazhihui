package com.kwlopen.sdk.camera;

import android.content.Context;
import android.hardware.Camera.AutoFocusCallback;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.kwl.common.utils.ResourceUtil;

public class MaskSurfaceView
  extends FrameLayout
{
  public static final float idCardScale = 0.63F;
  private final Camera.AutoFocusCallback autoFocusCallback = new MaskSurfaceView.1(this);
  public float height;
  private MaskSurfaceView.MaskView imageView;
  private FocusImageView mFocusImageView;
  public float maskHeight = 648.0F;
  public float maskWidth = 1027.2F;
  private int screenHeight;
  private int screenWidth;
  private MaskSurfaceView.MSurfaceView surfaceView;
  public float width;
  
  public MaskSurfaceView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramAttributeSet = new DisplayMetrics();
    ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getMetrics(paramAttributeSet);
    this.screenWidth = paramAttributeSet.widthPixels;
    this.screenHeight = paramAttributeSet.heightPixels;
    this.width = this.screenWidth;
    this.height = this.screenHeight;
    this.surfaceView = new MaskSurfaceView.MSurfaceView(this, paramContext);
    this.imageView = new MaskSurfaceView.MaskView(this, paramContext);
    addView(this.surfaceView, -2, -2);
    addView(this.imageView, -1, -1);
    CameraHelper.getInstance().setMaskSurfaceView(this);
    inflate(paramContext, ResourceUtil.getLayoutIdByName(paramContext, "kwlopen_cameracontainer"), this);
    this.mFocusImageView = ((FocusImageView)findViewById(ResourceUtil.getId(paramContext, "focusImageView")));
    setOnTouchListener(new MaskSurfaceView.TouchListener(this, null));
  }
  
  private float distance(MotionEvent paramMotionEvent)
  {
    float f1 = paramMotionEvent.getX(1) - paramMotionEvent.getX(0);
    float f2 = paramMotionEvent.getY(1) - paramMotionEvent.getY(0);
    return (float)Math.sqrt(f1 * f1 + f2 * f2);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwlopen\sdk\camera\MaskSurfaceView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */