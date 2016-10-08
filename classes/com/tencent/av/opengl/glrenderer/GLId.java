package com.tencent.av.opengl.glrenderer;

import javax.microedition.khronos.opengles.GL11;
import javax.microedition.khronos.opengles.GL11ExtensionPack;

public abstract interface GLId
{
  public abstract int generateTexture();
  
  public abstract void glDeleteBuffers(GL11 paramGL11, int paramInt1, int[] paramArrayOfInt, int paramInt2);
  
  public abstract void glDeleteFramebuffers(GL11ExtensionPack paramGL11ExtensionPack, int paramInt1, int[] paramArrayOfInt, int paramInt2);
  
  public abstract void glDeleteTextures(GL11 paramGL11, int paramInt1, int[] paramArrayOfInt, int paramInt2);
  
  public abstract void glGenBuffers(int paramInt1, int[] paramArrayOfInt, int paramInt2);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\opengl\glrenderer\GLId.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */