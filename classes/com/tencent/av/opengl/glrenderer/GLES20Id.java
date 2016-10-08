package com.tencent.av.opengl.glrenderer;

import android.opengl.GLES20;
import javax.microedition.khronos.opengles.GL11;
import javax.microedition.khronos.opengles.GL11ExtensionPack;

public class GLES20Id
  implements GLId
{
  private final int[] mTempIntArray = new int[1];
  
  public int generateTexture()
  {
    GLES20.glGenTextures(1, this.mTempIntArray, 0);
    GLES20Canvas.checkError();
    return this.mTempIntArray[0];
  }
  
  public void glDeleteBuffers(GL11 paramGL11, int paramInt1, int[] paramArrayOfInt, int paramInt2)
  {
    GLES20.glDeleteBuffers(paramInt1, paramArrayOfInt, paramInt2);
    GLES20Canvas.checkError();
  }
  
  public void glDeleteFramebuffers(GL11ExtensionPack paramGL11ExtensionPack, int paramInt1, int[] paramArrayOfInt, int paramInt2)
  {
    GLES20.glDeleteFramebuffers(paramInt1, paramArrayOfInt, paramInt2);
    GLES20Canvas.checkError();
  }
  
  public void glDeleteTextures(GL11 paramGL11, int paramInt1, int[] paramArrayOfInt, int paramInt2)
  {
    GLES20.glDeleteTextures(paramInt1, paramArrayOfInt, paramInt2);
    GLES20Canvas.checkError();
  }
  
  public void glGenBuffers(int paramInt1, int[] paramArrayOfInt, int paramInt2)
  {
    GLES20.glGenBuffers(paramInt1, paramArrayOfInt, paramInt2);
    GLES20Canvas.checkError();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\opengl\glrenderer\GLES20Id.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */