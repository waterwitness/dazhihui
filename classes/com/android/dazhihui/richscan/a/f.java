package com.android.dazhihui.richscan.a;

import android.graphics.Point;
import android.hardware.Camera;
import android.hardware.Camera.PreviewCallback;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

final class f
  implements Camera.PreviewCallback
{
  private static final String a = f.class.getSimpleName();
  private final b b;
  private final boolean c;
  private Handler d;
  private int e;
  
  f(b paramb, boolean paramBoolean)
  {
    this.b = paramb;
    this.c = paramBoolean;
  }
  
  void a(Handler paramHandler, int paramInt)
  {
    this.d = paramHandler;
    this.e = paramInt;
  }
  
  public void onPreviewFrame(byte[] paramArrayOfByte, Camera paramCamera)
  {
    Point localPoint = this.b.a();
    if (!this.c) {
      paramCamera.setPreviewCallback(null);
    }
    if (this.d != null)
    {
      this.d.obtainMessage(this.e, localPoint.x, localPoint.y, paramArrayOfByte).sendToTarget();
      this.d = null;
      return;
    }
    Log.d(a, "Got preview callback, but no handler for it");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\richscan\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */