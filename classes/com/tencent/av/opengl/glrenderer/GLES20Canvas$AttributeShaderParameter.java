package com.tencent.av.opengl.glrenderer;

import android.opengl.GLES20;

class GLES20Canvas$AttributeShaderParameter
  extends GLES20Canvas.ShaderParameter
{
  public GLES20Canvas$AttributeShaderParameter(String paramString)
  {
    super(paramString);
  }
  
  public void loadHandle(int paramInt)
  {
    this.handle = GLES20.glGetAttribLocation(paramInt, this.mName);
    GLES20Canvas.checkError();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\opengl\glrenderer\GLES20Canvas$AttributeShaderParameter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */