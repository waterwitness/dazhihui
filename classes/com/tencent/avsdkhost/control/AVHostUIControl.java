package com.tencent.avsdkhost.control;

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
import com.tencent.av.opengl.utils.Utils;
import com.tencent.av.sdk.AVAudioCtrl;
import com.tencent.av.sdk.AVContext;
import com.tencent.av.sdk.AVRoom;
import com.tencent.av.sdk.AVVideoCtrl;
import com.tencent.avsdk.control.GLVideoView;
import com.tencent.avsdk.control.QavsdkControl;

public class AVHostUIControl
  extends GLViewGroup
{
  static final String TAG = "ilvb";
  int mBottomOffset = 0;
  boolean mCameraSurfaceCreated = false;
  private int mConstHeight = 0;
  private int mConstWidth = 0;
  Context mContext = null;
  GLRootView mGlRootView = null;
  GLVideoView mGlVideoView = null;
  GraphicRendererMgr mGraphicRenderMgr = null;
  Handler mHandler = null;
  boolean mIsLocalHasVideo = false;
  int mPosition = 1;
  View mRootView = null;
  private int mRotation = 0;
  private SurfaceHolder.Callback mSurfaceHolderListener = new AVHostUIControl.1(this);
  private SurfaceView mSurfaceView = null;
  int mTopOffset = 0;
  
  public AVHostUIControl() {}
  
  public AVHostUIControl(Context paramContext, View paramView, Handler paramHandler)
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
    this.mGlVideoView.mIsCreator = true;
    this.mGlVideoView.setVisibility(1);
    addView(this.mGlVideoView);
    this.mGlRootView.setContentPane(this);
  }
  
  public void initSurfacePreview()
  {
    Log.d("ilvb", "AVHostUIControl initSurfacePreview");
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
      Log.d("ilvb", "AVHostUIControl add camera surface view fail: IllegalStateException." + localIllegalStateException);
      return;
    }
    catch (Exception localException)
    {
      Log.d("ilvb", "AVHostUIControl add camera surface view fail." + localException);
    }
  }
  
  public boolean isSurfacePreviewInited()
  {
    return this.mSurfaceView != null;
  }
  
  void layoutVideoView(boolean paramBoolean)
  {
    Log.d("ilvb", "AVHostUIControl layoutVideoView virtical: " + paramBoolean);
    if (this.mContext == null) {
      return;
    }
    this.mConstWidth = getWidth();
    this.mConstHeight = getHeight();
    Log.d("ilvb", "AVHostUIControl layoutVideoView width=" + getWidth() + " height=" + getHeight());
    this.mGlVideoView.layout(0, 0, this.mConstWidth, this.mConstHeight);
    this.mGlVideoView.setBackgroundColor(-16777216);
    invalidate();
  }
  
  public void onDestroy()
  {
    Log.d("ilvb", "AVHostUIControl onDestroy");
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
    Log.d("ilvb", "AVHostUIControl onLayout|left: " + paramInt1 + ", top: " + paramInt2 + ", right: " + paramInt3 + ", bottom: " + paramInt4);
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
  
  public void setIsLand(boolean paramBoolean) {}
  
  public boolean setLocalHasVideo(boolean paramBoolean, String paramString)
  {
    if ((this.mContext == null) || (TextUtils.isEmpty(paramString)) || (this.mGlVideoView == null) || (Utils.getGLVersion(this.mContext) == 1)) {
      return false;
    }
    if (paramBoolean)
    {
      Log.d("ilvb", "AVHostUIControl setLocalHasVideo 打开摄像头");
      this.mGlVideoView.setRender(paramString, 1);
      this.mGlVideoView.setIsPC(false);
      this.mGlVideoView.enableLoading(false);
      this.mGlVideoView.setVisibility(0);
      this.mGlVideoView.setNeedRenderVideo(true);
    }
    for (;;)
    {
      this.mIsLocalHasVideo = paramBoolean;
      return true;
      if (!paramBoolean)
      {
        Log.d("ilvb", "AVHostUIControl setLocalHasVideo 关闭摄像头");
        this.mGlVideoView.setVisibility(1);
        this.mGlVideoView.setNeedRenderVideo(false);
        this.mGlVideoView.enableLoading(false);
        this.mGlVideoView.setIsPC(false);
        this.mGlVideoView.clearRender();
        layoutVideoView(false);
      }
    }
  }
  
  public void setMirror(boolean paramBoolean)
  {
    if (this.mGlVideoView != null) {
      this.mGlVideoView.setMirror(paramBoolean);
    }
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
      Log.d("ilvb", "AVHostUIControl setRotation setRotation=" + this.mRotation);
    }
    this.mGlVideoView.setRotation(this.mRotation);
  }
  
  public void setSelfId(String paramString)
  {
    if (this.mGraphicRenderMgr != null) {
      this.mGraphicRenderMgr.setSelfId(paramString + "_" + 1);
    }
  }
  
  public void setSmallVideoViewLayout(boolean paramBoolean, String paramString, int paramInt) {}
  
  public void setText(String paramString1, int paramInt1, String paramString2, float paramFloat, int paramInt2)
  {
    if (TextUtils.isEmpty(paramString1))
    {
      Log.d("ilvb", "AVHostUIControl setText identifier: " + paramString1 + ", videoSrcType: " + paramInt1 + ", text: " + paramString2 + ", textSize: " + paramFloat + ", color: " + paramInt2 + ", identifier Error!");
      return;
    }
    if ((paramString1.equals(this.mGlVideoView.getIdentifier())) && (this.mGlVideoView.getVideoSrcType() == paramInt1) && (this.mGlVideoView.getVisibility() == 0))
    {
      GLVideoView localGLVideoView = this.mGlVideoView;
      localGLVideoView.setVisibility(0);
      localGLVideoView.setText(paramString2, paramFloat, paramInt2);
      Log.d("ilvb", "AVHostUIControl setText identifier: " + paramString1 + ", videoSrcType: " + paramInt1 + ", text: " + paramString2 + ", textSize: " + paramFloat + ", color: " + paramInt2 + ", Success!");
      return;
    }
    Log.d("ilvb", "AVHostUIControl setText identifier: " + paramString1 + ", videoSrcType: " + paramInt1 + ", text: " + paramString2 + ", textSize: " + paramFloat + ", color: " + paramInt2 + ", Error no layer!");
  }
  
  void unInitCameraaPreview()
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
      Log.d("ilvb", "AVHostUIControl remove camera view fail.", localException);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\control\AVHostUIControl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */