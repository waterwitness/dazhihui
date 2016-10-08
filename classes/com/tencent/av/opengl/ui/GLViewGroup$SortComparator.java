package com.tencent.av.opengl.ui;

import java.util.Comparator;

class GLViewGroup$SortComparator
  implements Comparator<GLView>
{
  GLViewGroup$SortComparator(GLViewGroup paramGLViewGroup) {}
  
  public int compare(GLView paramGLView1, GLView paramGLView2)
  {
    if (paramGLView1.getZOrder() >= paramGLView2.getZOrder()) {
      return 1;
    }
    return -1;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\opengl\ui\GLViewGroup$SortComparator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */