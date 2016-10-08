package com.tencent.avsdk.control;

import com.tencent.av.opengl.ui.GLRootView;

class GLVideoView$2
  implements Runnable
{
  GLVideoView$2(GLVideoView paramGLVideoView) {}
  
  public void run()
  {
    GLRootView localGLRootView = this.this$0.getGLRootView();
    if (localGLRootView != null)
    {
      this.this$0.invalidate();
      localGLRootView.postDelayed(GLVideoView.access$400(this.this$0), 80L);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\control\GLVideoView$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */