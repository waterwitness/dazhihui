package com.tencent.avsdk.control;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import com.tencent.av.opengl.GraphicRendererMgr;
import com.tencent.av.opengl.ui.GLRootView;
import com.tencent.av.opengl.ui.GLViewGroup;
import com.tencent.av.sdk.AVAudioCtrl;
import com.tencent.av.sdk.AVContext;
import com.tencent.av.sdk.AVRoom;
import com.tencent.av.sdk.AVVideoCtrl;

public class AVGuestUIControl
  extends GLViewGroup
{
  static final String TAG = "ilvb";
  private int mConstHeight = 0;
  private int mConstWidth = 0;
  Context mContext = null;
  GLRootView mGlRootView = null;
  GLVideoView mGlVideoView = null;
  GraphicRendererMgr mGraphicRenderMgr = null;
  Handler mHandler = null;
  int mPosition = 1;
  View mRootView = null;
  private int mRotation = 0;
  private SurfaceHolder.Callback mSurfaceHolderListener = new AVGuestUIControl.1(this);
  private SurfaceView mSurfaceView = null;
  
  public AVGuestUIControl(Context paramContext, View paramView, Handler paramHandler)
  {
    this.mContext = paramContext;
    this.mHandler = paramHandler;
    this.mRootView = paramView;
    this.mGraphicRenderMgr = new GraphicRendererMgr();
    initQQGlView();
  }
  
  public int getPosition()
  {
    return this.mPosition;
  }
  
  public String getQualityTips()
  {
    QavsdkControl localQavsdkControl = QavsdkControl.getInstance();
    Object localObject2 = "";
    Object localObject1 = "";
    Object localObject4 = localObject2;
    Object localObject3 = localObject1;
    if (localQavsdkControl != null)
    {
      if (localQavsdkControl.getAVContext() != null) {
        localObject2 = localQavsdkControl.getAVContext().getAudioCtrl().getQualityTips();
      }
      if (localQavsdkControl.getAVContext() != null) {
        localObject1 = localQavsdkControl.getAVContext().getVideoCtrl().getQualityTips();
      }
      localObject4 = localObject2;
      localObject3 = localObject1;
      if (localQavsdkControl.getRoom() != null)
      {
        localObject4 = localQavsdkControl.getRoom().getQualityTips();
        localObject3 = localObject2;
        localObject2 = localObject4;
      }
    }
    for (;;)
    {
      if ((localObject3 != null) && (localObject1 != null) && (localObject2 != null)) {
        return (String)localObject3 + (String)localObject1 + (String)localObject2;
      }
      return "";
      localObject2 = "";
      localObject1 = localObject3;
      localObject3 = localObject4;
    }
  }
  
  void initQQGlView()
  {
    this.mGlRootView = ((GLRootView)this.mRootView.findViewById(2131559398));
    this.mGlVideoView = new GLVideoView(this.mContext.getApplicationContext(), this.mGraphicRenderMgr, this.mHandler);
    this.mGlVideoView.setVisibility(1);
    addView(this.mGlVideoView);
    this.mGlRootView.setContentPane(this);
  }
  
  public void initSurfacePreview()
  {
    Log.d("ilvb", "AVGuestUIControl initSurfacePreview");
    WindowManager localWindowManager = (WindowManager)this.mContext.getSystemService("window");
    WindowManager.LayoutParams localLayoutParams = new WindowManager.LayoutParams();
    localLayoutParams.width = 1;
    localLayoutParams.height = 1;
    localLayoutParams.flags = 776;
    localLayoutParams.format = -3;
    localLayoutParams.windowAnimations = 0;
    localLayoutParams.type = 2005;
    localLayoutParams.gravity = 51;
    try
    {
      this.mSurfaceView = new SurfaceView(this.mContext);
      SurfaceHolder localSurfaceHolder = this.mSurfaceView.getHolder();
      localSurfaceHolder.addCallback(this.mSurfaceHolderListener);
      localSurfaceHolder.setType(3);
      this.mSurfaceView.setZOrderMediaOverlay(true);
      localWindowManager.addView(this.mSurfaceView, localLayoutParams);
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      localWindowManager.updateViewLayout(this.mSurfaceView, localLayoutParams);
      Log.d("ilvb", "AVGuestUIControl add camera surface view fail: IllegalStateException." + localIllegalStateException);
      return;
    }
    catch (Exception localException)
    {
      Log.d("ilvb", "AVGuestUIControl add camera surface view fail." + localException);
    }
  }
  
  public boolean isSurfacePreviewInited()
  {
    return this.mSurfaceView != null;
  }
  
  void layoutVideoView(boolean paramBoolean)
  {
    Log.d("ilvb", "AVGuestUIControl layoutVideoView virtical: " + paramBoolean);
    if (this.mContext == null) {
      return;
    }
    this.mConstWidth = getWidth();
    this.mConstHeight = getHeight();
    Log.d("ilvb", "AVGuestUIControl layoutVideoView width=" + getWidth() + " height=" + getHeight());
    this.mGlVideoView.layout(0, 0, this.mConstWidth, this.mConstHeight);
    this.mGlVideoView.setBackgroundColor(-14277082);
    invalidate();
  }
  
  public void onDestroy()
  {
    Log.d("ilvb", "AVGuestUIControl onDestroy");
    unInitCameraaPreview();
    this.mContext = null;
    this.mHandler = null;
    this.mRootView = null;
    removeAllView();
    this.mGlVideoView.flush();
    this.mGlVideoView.clearRender();
    this.mGlVideoView.onDestroy();
    this.mGlVideoView = null;
    this.mGlRootView.setOnTouchListener(null);
    this.mGlRootView.setContentPane(null);
    this.mGraphicRenderMgr = null;
    this.mGlRootView = null;
    this.mGlVideoView = null;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Log.d("ilvb", "AVGuestUIControl onLayout|left: " + paramInt1 + ", top: " + paramInt2 + ", right: " + paramInt3 + ", bottom: " + paramInt4);
    layoutVideoView(false);
  }
  
  public void onPause()
  {
    if (this.mGlRootView != null) {
      this.mGlRootView.onPause();
    }
  }
  
  public void onResume()
  {
    if (this.mGlRootView != null) {
      this.mGlRootView.onResume();
    }
    setRotation(this.mRotation);
  }
  
  public void resetRenderFlag()
  {
    if (this.mGlVideoView != null) {
      this.mGlVideoView.resetRenderFlag();
    }
  }
  
  public void setIsLand(boolean paramBoolean)
  {
    if ((this.mContext == null) || (this.mGlVideoView == null)) {
      return;
    }
    this.mGlVideoView.setIsLand(paramBoolean);
  }
  
  public void setRotation(int paramInt)
  {
    if ((this.mContext == null) || (this.mGlVideoView == null)) {
      return;
    }
    this.mRotation = paramInt;
    QavsdkControl localQavsdkControl = QavsdkControl.getInstance();
    if ((localQavsdkControl != null) && (localQavsdkControl.getAVContext() != null) && (localQavsdkControl.getAVContext().getVideoCtrl() != null))
    {
      localQavsdkControl.getAVContext().getVideoCtrl().setRotation(this.mRotation);
      Log.d("ilvb", "AVGuestUIControl setRotation setRotation=" + this.mRotation);
    }
    this.mGlVideoView.setRotation(this.mRotation);
  }
  
  public void setSmallVideoViewLayout(boolean paramBoolean, String paramString, int paramInt)
  {
    Log.d("ilvb", "AVGuestUIControl setSmallVideoViewLayout=" + paramString + " isRemoteHasVideo=" + paramBoolean + " index=" + paramInt);
    if ((this.mContext == null) || (TextUtils.isEmpty(paramString))) {
      return;
    }
    if (paramBoolean)
    {
      if (paramInt == 1) {
        if ((paramString.equals(this.mGlVideoView.getIdentifier())) && (this.mGlVideoView.getVideoSrcType() == 1) && (this.mGlVideoView.getVisibility() == 0)) {
          Log.d("ilvb", "AVGuestUIControl setSmallVideoViewLayout 摄像头 继续渲染");
        }
      }
      for (;;)
      {
        this.mGlVideoView.setIsPC(false);
        this.mGlVideoView.enableLoading(false);
        this.mGlVideoView.setVisibility(0);
        this.mGlVideoView.setNeedRenderVideo(true);
        return;
        if ((paramString.equals(this.mGlVideoView.getIdentifier())) && (this.mGlVideoView.getVideoSrcType() == 2) && (this.mGlVideoView.getVisibility() == 0))
        {
          Log.d("ilvb", "AVGuestUIControl setSmallVideoViewLayout 屏幕分享切换到摄像头 继续渲染");
          this.mGlVideoView.setRender(paramString, 1);
        }
        else if ((!paramString.equals(this.mGlVideoView.getIdentifier())) || (this.mGlVideoView.getVisibility() == 1))
        {
          Log.d("ilvb", "AVGuestUIControl setSmallVideoViewLayout 摄像头 启动渲染");
          this.mGlVideoView.setRender(paramString, 1);
          continue;
          if (paramInt == 2) {
            if ((paramString.equals(this.mGlVideoView.getIdentifier())) && (this.mGlVideoView.getVideoSrcType() == 2) && (this.mGlVideoView.getVisibility() == 0))
            {
              Log.d("ilvb", "AVGuestUIControl setSmallVideoViewLayout 屏幕分享 继续渲染");
            }
            else if ((paramString.equals(this.mGlVideoView.getIdentifier())) && (this.mGlVideoView.getVideoSrcType() == 1) && (this.mGlVideoView.getVisibility() == 0))
            {
              Log.d("ilvb", "AVGuestUIControl setSmallVideoViewLayout 摄像头切换到屏幕分享 继续渲染");
              this.mGlVideoView.setRender(paramString, 2);
            }
            else if ((!paramString.equals(this.mGlVideoView.getIdentifier())) || (this.mGlVideoView.getVisibility() == 1))
            {
              Log.d("ilvb", "AVGuestUIControl setSmallVideoViewLayout 屏幕分享 启动渲染");
              this.mGlVideoView.setRender(paramString, 2);
            }
          }
        }
      }
    }
    if (paramInt == 1) {
      Log.d("ilvb", "AVGuestUIControl closeVideoView 摄像头");
    }
    for (;;)
    {
      this.mGlVideoView.setVisibility(1);
      this.mGlVideoView.setNeedRenderVideo(true);
      this.mGlVideoView.enableLoading(false);
      this.mGlVideoView.setIsPC(false);
      this.mGlVideoView.clearRender();
      return;
      if (paramInt == 2) {
        Log.d("ilvb", "AVGuestUIControl closeVideoView 屏幕分享");
      }
    }
  }
  
  public void setText(String paramString1, int paramInt1, String paramString2, float paramFloat, int paramInt2)
  {
    if (TextUtils.isEmpty(paramString1))
    {
      Log.d("ilvb", "AVGuestUIControl setText identifier: " + paramString1 + ", videoSrcType: " + paramInt1 + ", text: " + paramString2 + ", textSize: " + paramFloat + ", color: " + paramInt2 + ", identifier Error!");
      return;
    }
    if ((paramString1.equals(this.mGlVideoView.getIdentifier())) && (this.mGlVideoView.getVideoSrcType() == paramInt1) && (this.mGlVideoView.getVisibility() == 0))
    {
      GLVideoView localGLVideoView = this.mGlVideoView;
      localGLVideoView.setVisibility(0);
      localGLVideoView.setText(paramString2, paramFloat, paramInt2);
      Log.d("ilvb", "AVGuestUIControl setText identifier: " + paramString1 + ", videoSrcType: " + paramInt1 + ", text: " + paramString2 + ", textSize: " + paramFloat + ", color: " + paramInt2 + ", Success!");
      return;
    }
    Log.d("ilvb", "AVGuestUIControl setText identifier: " + paramString1 + ", videoSrcType: " + paramInt1 + ", text: " + paramString2 + ", textSize: " + paramFloat + ", color: " + paramInt2 + ", Error no layer!");
  }
  
  public void unInitCameraaPreview()
  {
    WindowManager localWindowManager;
    if (this.mSurfaceView != null) {
      localWindowManager = (WindowManager)this.mContext.getSystemService("window");
    }
    try
    {
      localWindowManager.removeView(this.mSurfaceView);
      this.mSurfaceView = null;
      return;
    }
    catch (Exception localException)
    {
      Log.d("ilvb", "AVGuestUIControl remove camera view fail.", localException);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\control\AVGuestUIControl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */