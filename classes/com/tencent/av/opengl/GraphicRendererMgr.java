package com.tencent.av.opengl;

import com.tencent.av.opengl.texture.YUVTexture;

public class GraphicRendererMgr
{
  private static boolean mIsSoLoaded = false;
  
  public GraphicRendererMgr()
  {
    loadSo();
  }
  
  private void loadSo()
  {
    if (!mIsSoLoaded) {}
    try
    {
      System.loadLibrary("qav_graphics");
      mIsSoLoaded = true;
      return;
    }
    catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
    {
      localUnsatisfiedLinkError.printStackTrace();
    }
  }
  
  native void clearCameraFrames();
  
  public native void flushGlRender(String paramString);
  
  public native int getRecvDecoderFrameFunctionptr();
  
  public native void setGlRender(String paramString, YUVTexture paramYUVTexture);
  
  public native void setSelfId(String paramString);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\opengl\GraphicRendererMgr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */