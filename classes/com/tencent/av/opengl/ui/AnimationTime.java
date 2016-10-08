package com.tencent.av.opengl.ui;

import android.os.SystemClock;

public class AnimationTime
{
  private static volatile long sTime;
  
  public static long get()
  {
    return sTime;
  }
  
  public static long startTime()
  {
    sTime = SystemClock.uptimeMillis();
    return sTime;
  }
  
  public static void update()
  {
    sTime = SystemClock.uptimeMillis();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\opengl\ui\AnimationTime.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */