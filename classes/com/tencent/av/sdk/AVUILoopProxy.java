package com.tencent.av.sdk;

import android.os.Handler;
import android.os.Looper;

public class AVUILoopProxy
{
  public static void OnPostTask(long paramLong)
  {
    new Handler(Looper.getMainLooper()).post(new AVUILoopProxy.1(paramLong));
  }
  
  public static void postTaskToMainLooper(Runnable paramRunnable)
  {
    new Handler(Looper.getMainLooper()).post(paramRunnable);
  }
  
  public static native void processTask(long paramLong);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\sdk\AVUILoopProxy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */