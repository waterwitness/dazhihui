package com.android.dazhihui.richscan.b;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.android.dazhihui.richscan.RichScanActivity;
import com.android.dazhihui.richscan.a.c;
import com.c.b.l;
import java.util.Vector;

public final class a
  extends Handler
{
  private static final String a = a.class.getSimpleName();
  private final RichScanActivity b;
  private final e c;
  private b d;
  
  public a(RichScanActivity paramRichScanActivity, Vector<com.c.b.a> paramVector, String paramString)
  {
    this.b = paramRichScanActivity;
    this.c = new e(paramRichScanActivity, paramVector, paramString, new com.android.dazhihui.richscan.view.a(paramRichScanActivity.a()));
    this.c.start();
    this.d = b.b;
    c.a().d();
    b();
  }
  
  private void b()
  {
    if (this.d == b.b)
    {
      this.d = b.a;
      c.a().a(this.c.a(), 6);
      c.a().b(this, 0);
      this.b.c();
    }
  }
  
  public void a()
  {
    this.d = b.c;
    c.a().e();
    Message.obtain(this.c.a(), 7).sendToTarget();
    try
    {
      this.c.join();
      removeMessages(2);
      removeMessages(3);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
  }
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
    case 0: 
      do
      {
        return;
      } while (this.d != b.a);
      c.a().b(this, 0);
      return;
    case 1: 
      Log.d(a, "Got restart preview message");
      b();
      return;
    case 2: 
      Log.d(a, "Got decode succeeded message");
      this.d = b.b;
      Object localObject = paramMessage.getData();
      if (localObject == null) {}
      for (localObject = null;; localObject = (Bitmap)((Bundle)localObject).getParcelable("barcode_bitmap"))
      {
        this.b.a((l)paramMessage.obj, (Bitmap)localObject);
        return;
      }
    case 3: 
      this.d = b.a;
      c.a().a(this.c.a(), 6);
      return;
    case 4: 
      Log.d(a, "Got return scan result message");
      this.b.setResult(-1, (Intent)paramMessage.obj);
      this.b.finish();
      return;
    }
    Log.d(a, "Got product query message");
    paramMessage = new Intent("android.intent.action.VIEW", Uri.parse((String)paramMessage.obj));
    paramMessage.addFlags(524288);
    this.b.startActivity(paramMessage);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\richscan\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */