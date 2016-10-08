package com.tencent.av.opengl.ui;

import java.util.Collections;

class GLViewGroup$1
  implements GLView.OnZOrderChangedListener
{
  GLViewGroup$1(GLViewGroup paramGLViewGroup) {}
  
  public void OnZOrderChanged(GLView paramGLView, int paramInt1, int paramInt2)
  {
    Collections.sort(GLViewGroup.access$000(this.this$0), GLViewGroup.access$100(this.this$0));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\opengl\ui\GLViewGroup$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */