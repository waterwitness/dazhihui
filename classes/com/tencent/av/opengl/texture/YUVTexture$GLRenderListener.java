package com.tencent.av.opengl.texture;

public abstract interface YUVTexture$GLRenderListener
{
  public abstract void onRenderFlush();
  
  public abstract void onRenderFrame();
  
  public abstract void onRenderInfoNotify(int paramInt1, int paramInt2, int paramInt3);
  
  public abstract void onRenderReset();
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\opengl\texture\YUVTexture$GLRenderListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */