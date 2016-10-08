package com.tencent.xplatform;

import android.os.Handler;
import android.os.Looper;

public class MainThreadHelp
{
  public static native void nativeProcessTask(long paramLong);
  
  public static void postTask(long paramLong)
  {
    new Handler(Looper.getMainLooper()).post(new MainThreadHelp.1(paramLong));
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\xplatform\MainThreadHelp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */