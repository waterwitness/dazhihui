package com.tencent.avsdkhost.control;

import android.os.Handler;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import com.tencent.av.sdk.AVContext;
import com.tencent.avsdk.control.QavsdkControl;

class AVHostUIControl$1
  implements SurfaceHolder.Callback
{
  AVHostUIControl$1(AVHostUIControl paramAVHostUIControl) {}
  
  public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramSurfaceHolder.getSurface() == null) {
      return;
    }
    paramSurfaceHolder.setFixedSize(paramInt2, paramInt3);
    Log.d("ilvb", "AVHostUIControl memoryLeak surfaceChanged format=" + paramInt1 + " width=" + paramInt2 + " height=" + paramInt3);
  }
  
  public void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    if (this.this$0.mHandler != null) {
      this.this$0.mHandler.sendEmptyMessage(317);
    }
    this.this$0.mCameraSurfaceCreated = true;
    QavsdkControl.getInstance().getAVContext().setRenderMgrAndHolder(this.this$0.mGraphicRenderMgr, paramSurfaceHolder);
    Log.d("ilvb", "AVHostUIControl memoryLeak surfaceCreated");
  }
  
  public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    Log.d("ilvb", "AVHostUIControl memoryLeak surfaceDestroyed");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\control\AVHostUIControl$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */