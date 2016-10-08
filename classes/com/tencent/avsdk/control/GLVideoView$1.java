package com.tencent.avsdk.control;

import android.os.Handler;
import android.util.Log;
import com.tencent.av.opengl.texture.YUVTexture;
import com.tencent.av.opengl.texture.YUVTexture.GLRenderListener;

class GLVideoView$1
  implements YUVTexture.GLRenderListener
{
  GLVideoView$1(GLVideoView paramGLVideoView) {}
  
  public void onRenderFlush()
  {
    this.this$0.flush();
    this.this$0.invalidate();
  }
  
  public void onRenderFrame()
  {
    this.this$0.invalidate();
  }
  
  public void onRenderInfoNotify(int paramInt1, int paramInt2, int paramInt3)
  {
    Log.d("ilvb", "GLVideoView onRenderInfoNotify uin: " + GLVideoView.access$000(this.this$0) + ", mVideoSrcType: " + GLVideoView.access$100(this.this$0) + ", width: " + paramInt1 + ", height: " + paramInt2 + ", angle: " + paramInt3);
    if (!GLVideoView.access$200(this.this$0))
    {
      if (this.this$0.mHandler != null) {
        this.this$0.mHandler.sendEmptyMessage(303);
      }
      GLVideoView.access$202(this.this$0, true);
    }
    GLVideoView.access$300(this.this$0).setTextureSize(paramInt1, paramInt2);
    this.this$0.invalidate();
  }
  
  public void onRenderReset()
  {
    this.this$0.flush();
    this.this$0.invalidate();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\control\GLVideoView$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */