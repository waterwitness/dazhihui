package com.kwlopen.sdk.camera;

import android.content.Context;
import android.graphics.Point;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import com.kwl.common.utils.ResourceUtil;

public class FocusImageView
  extends ImageView
{
  private static final int NO_ID = -1;
  public static final String TAG = "FocusImageView";
  private Animation mAnimation;
  private int mFocusFailedImg = -1;
  private int mFocusImg = -1;
  private int mFocusSucceedImg = -1;
  private Handler mHandler;
  
  public FocusImageView(Context paramContext)
  {
    super(paramContext);
    this.mAnimation = AnimationUtils.loadAnimation(getContext(), ResourceUtil.getAnimIdByName(paramContext, "kwlopen_focusview_show"));
    setVisibility(8);
    this.mHandler = new Handler();
  }
  
  public FocusImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mAnimation = AnimationUtils.loadAnimation(getContext(), ResourceUtil.getAnimIdByName(paramContext, "kwlopen_focusview_show"));
    this.mHandler = new Handler();
    this.mFocusImg = ResourceUtil.getDrawableIdByName(paramContext, "kwlopen_focus_focusing");
    this.mFocusSucceedImg = ResourceUtil.getDrawableIdByName(paramContext, "kwlopen_focus_focused");
    this.mFocusFailedImg = ResourceUtil.getDrawableIdByName(paramContext, "kwlopen_focus_focus_failed");
    if ((this.mFocusImg == -1) || (this.mFocusSucceedImg == -1) || (this.mFocusFailedImg == -1)) {
      throw new RuntimeException("Animation is null");
    }
  }
  
  public void onFocusFailed()
  {
    setImageResource(this.mFocusFailedImg);
    this.mHandler.removeCallbacks(null, null);
    this.mHandler.postDelayed(new FocusImageView.3(this), 1000L);
  }
  
  public void onFocusSuccess()
  {
    setImageResource(this.mFocusSucceedImg);
    this.mHandler.removeCallbacks(null, null);
    this.mHandler.postDelayed(new FocusImageView.2(this), 1000L);
  }
  
  public void setFocusImg(int paramInt)
  {
    this.mFocusImg = paramInt;
  }
  
  public void setFocusSucceedImg(int paramInt)
  {
    this.mFocusSucceedImg = paramInt;
  }
  
  public void startFocus(Point paramPoint)
  {
    if ((this.mFocusImg == -1) || (this.mFocusSucceedImg == -1) || (this.mFocusFailedImg == -1)) {
      throw new RuntimeException("focus image is null");
    }
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)getLayoutParams();
    localLayoutParams.topMargin = (paramPoint.y - getHeight() / 2);
    localLayoutParams.leftMargin = (paramPoint.x - getWidth() / 2);
    setLayoutParams(localLayoutParams);
    setVisibility(0);
    setImageResource(this.mFocusImg);
    startAnimation(this.mAnimation);
    this.mHandler.postDelayed(new FocusImageView.1(this), 3500L);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwlopen\sdk\camera\FocusImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */