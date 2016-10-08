package com.tencent.av.opengl.glrenderer;

class GLES11Canvas$ConfigState
{
  float mAlpha;
  float[] mMatrix = new float[16];
  ConfigState mNextFree;
  
  public void restore(GLES11Canvas paramGLES11Canvas)
  {
    if (this.mAlpha >= 0.0F) {
      paramGLES11Canvas.setAlpha(this.mAlpha);
    }
    if (this.mMatrix[0] != Float.NEGATIVE_INFINITY) {
      System.arraycopy(this.mMatrix, 0, GLES11Canvas.access$100(paramGLES11Canvas), 0, 16);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\opengl\glrenderer\GLES11Canvas$ConfigState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */