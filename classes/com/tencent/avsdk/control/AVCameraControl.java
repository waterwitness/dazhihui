package com.tencent.avsdk.control;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import com.tencent.av.sdk.AVContext;
import com.tencent.av.sdk.AVVideoCtrl;
import com.tencent.av.sdk.AVVideoCtrl.EnableCameraCompleteCallback;
import com.tencent.av.sdk.AVVideoCtrl.SwitchCameraCompleteCallback;
import java.lang.ref.WeakReference;

public class AVCameraControl
{
  public static final int BACK_CAMERA = 1;
  public static final int CAMERA_NONE = -1;
  public static final int FRONT_CAMERA = 0;
  private static final String TAG = "ilvb";
  private boolean mCurrentFrontCamera = true;
  private AVVideoCtrl.EnableCameraCompleteCallback mEnableCameraCompleteCallback = new AVCameraControl.1(this);
  private boolean mIsCameraOpened = false;
  private boolean mIsInOnOffCamera = false;
  private boolean mIsInSwitchCamera = false;
  private WeakReference<Handler> mRefHandler = null;
  private AVVideoCtrl.SwitchCameraCompleteCallback mSwitchCameraCompleteCallback = new AVCameraControl.2(this);
  
  public AVCameraControl(Context paramContext, Handler paramHandler)
  {
    this.mRefHandler = new WeakReference(paramHandler);
  }
  
  private void enableCamera(int paramInt, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (this.mIsCameraOpened = true;; this.mIsCameraOpened = false)
    {
      QavsdkControl.getInstance().getAVContext().getVideoCtrl().enableCamera(paramInt, paramBoolean, new AVCameraControl.3(this, paramInt));
      return;
    }
  }
  
  private void openCamera()
  {
    if (this.mCurrentFrontCamera)
    {
      enableCamera(0, true);
      return;
    }
    enableCamera(1, true);
  }
  
  public void closeCamera()
  {
    if (this.mCurrentFrontCamera)
    {
      enableCamera(0, false);
      return;
    }
    enableCamera(1, false);
  }
  
  public void destroy()
  {
    if (this.mRefHandler != null) {
      this.mRefHandler.clear();
    }
    this.mRefHandler = null;
  }
  
  public void dump(String paramString)
  {
    Log.d("ilvb", "AVCameraControl " + paramString + "  mIsCameraOpened = " + this.mIsCameraOpened + " mCurrentFrontCamera=" + this.mCurrentFrontCamera + " mIsInOnOffCamera = " + this.mIsInOnOffCamera + " mIsInSwitchCamera = " + this.mIsInSwitchCamera);
  }
  
  public int enableCamera(boolean paramBoolean)
  {
    int j = 0;
    int i = j;
    if (this.mIsCameraOpened != paramBoolean)
    {
      Object localObject = QavsdkControl.getInstance();
      i = j;
      if (((QavsdkControl)localObject).getAVContext() != null)
      {
        i = j;
        if (((QavsdkControl)localObject).getAVContext().getVideoCtrl() != null)
        {
          localObject = ((QavsdkControl)localObject).getAVContext().getVideoCtrl();
          this.mIsInOnOffCamera = true;
          i = ((AVVideoCtrl)localObject).enableCamera(0, paramBoolean, this.mEnableCameraCompleteCallback);
          this.mCurrentFrontCamera = true;
        }
      }
    }
    dump("enableCamera");
    return i;
  }
  
  public boolean getIsCameraOpened()
  {
    return this.mIsCameraOpened;
  }
  
  public boolean getIsFrontCamera()
  {
    return this.mCurrentFrontCamera;
  }
  
  public boolean getIsInOnOffCamera()
  {
    return this.mIsInOnOffCamera;
  }
  
  public boolean getIsInSwitchCamera()
  {
    return this.mIsInSwitchCamera;
  }
  
  public void init()
  {
    this.mIsCameraOpened = false;
    this.mCurrentFrontCamera = true;
    this.mIsInOnOffCamera = false;
    this.mIsInSwitchCamera = false;
  }
  
  public boolean isContextOk()
  {
    if ((this.mRefHandler == null) || (this.mRefHandler.get() == null))
    {
      Log.e("ilvb", "AVCameraControl isContextOk mContext is null");
      return false;
    }
    return true;
  }
  
  public int switchCamera(boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    Object localObject;
    if (this.mCurrentFrontCamera != paramBoolean)
    {
      localObject = QavsdkControl.getInstance();
      if (((QavsdkControl)localObject).getAVContext() == null) {
        break label107;
      }
      localObject = ((QavsdkControl)localObject).getAVContext().getVideoCtrl();
      if (localObject == null) {
        break label97;
      }
      this.mIsInSwitchCamera = true;
      if (!this.mCurrentFrontCamera) {
        break label81;
      }
      Log.i("ilvb", "AVCameraControl switchCamera to backCamera ");
      if (!paramBoolean) {
        break label92;
      }
    }
    label81:
    label92:
    for (i = j;; i = 1)
    {
      i = ((AVVideoCtrl)localObject).switchCamera(i, this.mSwitchCameraCompleteCallback);
      dump("switchCamera");
      return i;
      Log.i("ilvb", "AVCameraControl switchCamera to frontCamera ");
      break;
    }
    label97:
    Log.e("ilvb", "AVCameraControl switchCamera fail VideoCtrl=null");
    return 1;
    label107:
    Log.e("ilvb", "AVCameraControl switchCamera fail context=null");
    return 1;
  }
  
  public void toggleCamera()
  {
    if (this.mIsCameraOpened)
    {
      closeCamera();
      return;
    }
    openCamera();
  }
  
  public int toggleEnableCamera()
  {
    dump("toggleEnableCamera");
    if (!this.mIsCameraOpened) {}
    for (boolean bool = true;; bool = false) {
      return enableCamera(bool);
    }
  }
  
  public int toggleSwitchCamera()
  {
    dump("toggleSwitchCamera");
    if (!this.mCurrentFrontCamera) {}
    for (boolean bool = true;; bool = false) {
      return switchCamera(bool);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\control\AVCameraControl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */