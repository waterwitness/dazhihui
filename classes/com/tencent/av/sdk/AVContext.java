package com.tencent.av.sdk;

import android.content.Context;
import android.view.SurfaceHolder;
import com.tencent.av.opengl.GraphicRendererMgr;

public abstract class AVContext
{
  public static AVContext createInstance(Context paramContext, AVContext.Config paramConfig)
  {
    AVContextImpl localAVContextImpl = new AVContextImpl();
    if (localAVContextImpl.create(paramContext, paramConfig)) {
      return localAVContextImpl;
    }
    return null;
  }
  
  public static String getVersion()
  {
    return AVContextImpl.getVersion();
  }
  
  public abstract void destroy();
  
  public abstract int enterRoom(int paramInt, AVRoom.Delegate paramDelegate, AVRoom.EnterRoomParam paramEnterRoomParam);
  
  public abstract int exitRoom();
  
  public abstract AVAudioCtrl getAudioCtrl();
  
  public abstract AVRoom getRoom();
  
  public abstract AVVideoCtrl getVideoCtrl();
  
  public abstract void setHolder(SurfaceHolder paramSurfaceHolder);
  
  public abstract void setRenderFunctionPtr(int paramInt);
  
  public abstract void setRenderMgrAndHolder(GraphicRendererMgr paramGraphicRendererMgr, SurfaceHolder paramSurfaceHolder);
  
  public abstract int start(AVContext.StartCallback paramStartCallback);
  
  public abstract int stop(AVContext.StopCallback paramStopCallback);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\sdk\AVContext.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */