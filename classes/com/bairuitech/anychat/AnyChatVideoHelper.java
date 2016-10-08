package com.bairuitech.anychat;

import android.view.SurfaceHolder;

public class AnyChatVideoHelper
{
  private int MAX_VIDEO_NUM = 10;
  VideoRenderer[] render = new VideoRenderer[this.MAX_VIDEO_NUM];
  
  private VideoRenderer GetRenderByUserId(int paramInt)
  {
    int i = 0;
    for (;;)
    {
      if (i >= this.MAX_VIDEO_NUM) {
        return null;
      }
      if ((this.render[i] != null) && (this.render[i].GetUserId() == paramInt)) {
        return this.render[i];
      }
      i += 1;
    }
  }
  
  public int SetVideoFmt(int paramInt1, int paramInt2, int paramInt3)
  {
    VideoRenderer localVideoRenderer = GetRenderByUserId(paramInt1);
    if (localVideoRenderer == null) {
      return -1;
    }
    try
    {
      localVideoRenderer.CreateBitmap(paramInt2, paramInt3);
      return 0;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public void SetVideoUser(int paramInt1, int paramInt2)
  {
    if ((paramInt1 < 0) || (paramInt1 >= this.MAX_VIDEO_NUM)) {}
    while (this.render[paramInt1] == null) {
      return;
    }
    this.render[paramInt1].SetUserId(paramInt2);
  }
  
  public void ShowVideo(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    VideoRenderer localVideoRenderer = GetRenderByUserId(paramInt1);
    if (localVideoRenderer == null) {
      return;
    }
    localVideoRenderer.DrawByteBuffer(paramArrayOfByte, paramInt2, paramInt3);
  }
  
  public int bindVideo(SurfaceHolder paramSurfaceHolder)
  {
    int j = 0;
    int i = 0;
    if (i >= this.MAX_VIDEO_NUM) {
      i = j;
    }
    for (;;)
    {
      if (i >= this.MAX_VIDEO_NUM)
      {
        return -1;
        if ((this.render[i] != null) && (this.render[i].GetUserId() == -1)) {
          this.render[i] = null;
        }
        i += 1;
        break;
      }
      if (this.render[i] == null)
      {
        this.render[i] = new VideoRenderer(paramSurfaceHolder);
        return i;
      }
      i += 1;
    }
  }
  
  public void setMaxCutScale(int paramInt, float paramFloat)
  {
    GetRenderByUserId(paramInt).setMaxCutScale(paramFloat);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\bairuitech\anychat\AnyChatVideoHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */