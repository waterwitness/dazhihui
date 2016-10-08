package com.tencent.av.opengl.glrenderer;

abstract class GLES20Canvas$ShaderParameter
{
  public int handle;
  protected final String mName;
  
  public GLES20Canvas$ShaderParameter(String paramString)
  {
    this.mName = paramString;
  }
  
  public abstract void loadHandle(int paramInt);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\opengl\glrenderer\GLES20Canvas$ShaderParameter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */