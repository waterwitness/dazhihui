package com.android.dazhihui.richscan.b;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.android.dazhihui.richscan.RichScanActivity;
import com.c.b.a.i;
import com.c.b.g;
import com.c.b.h;
import com.c.b.k;
import java.util.Hashtable;

final class d
  extends Handler
{
  private static final String a = d.class.getSimpleName();
  private final RichScanActivity b;
  private final h c = new h();
  
  d(RichScanActivity paramRichScanActivity, Hashtable<com.c.b.e, Object> paramHashtable)
  {
    this.c.a(paramHashtable);
    this.b = paramRichScanActivity;
  }
  
  private void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    Object localObject2 = new byte[paramArrayOfByte.length];
    int i = 0;
    while (i < paramInt2)
    {
      int j = 0;
      while (j < paramInt1)
      {
        localObject2[(j * paramInt2 + paramInt2 - i - 1)] = paramArrayOfByte[(i * paramInt1 + j)];
        j += 1;
      }
      i += 1;
    }
    long l1 = System.currentTimeMillis();
    Object localObject1 = null;
    localObject2 = com.android.dazhihui.richscan.a.c.a().a((byte[])localObject2, paramInt2, paramInt1);
    paramArrayOfByte = (byte[])localObject1;
    if (localObject2 != null) {
      paramArrayOfByte = new com.c.b.c(new i((g)localObject2));
    }
    try
    {
      paramArrayOfByte = this.c.a(paramArrayOfByte);
      this.c.a();
    }
    catch (k paramArrayOfByte)
    {
      for (;;)
      {
        paramArrayOfByte = paramArrayOfByte;
        this.c.a();
        paramArrayOfByte = (byte[])localObject1;
      }
    }
    finally
    {
      paramArrayOfByte = finally;
      this.c.a();
      throw paramArrayOfByte;
    }
    localObject1 = this.b.b();
    if (paramArrayOfByte != null)
    {
      l2 = System.currentTimeMillis();
      Log.d(a, "Found barcode in " + (l2 - l1) + " ms");
      if (localObject1 != null)
      {
        paramArrayOfByte = Message.obtain((Handler)localObject1, 2, paramArrayOfByte);
        localObject1 = new Bundle();
        ((Bundle)localObject1).putParcelable("barcode_bitmap", ((com.android.dazhihui.richscan.a.e)localObject2).b());
        paramArrayOfByte.setData((Bundle)localObject1);
        paramArrayOfByte.sendToTarget();
      }
    }
    while (localObject1 == null)
    {
      long l2;
      return;
    }
    Message.obtain((Handler)localObject1, 3).sendToTarget();
  }
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      return;
    case 6: 
      a((byte[])paramMessage.obj, paramMessage.arg1, paramMessage.arg2);
      return;
    }
    Looper.myLooper().quit();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\richscan\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */