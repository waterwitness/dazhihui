package com.android.dazhihui.richscan;

import android.app.AlertDialog.Builder;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.widget.ImageView;
import com.android.dazhihui.richscan.a.c;
import com.android.dazhihui.richscan.view.ViewfinderView;
import com.c.b.l;
import java.io.IOException;
import java.util.Vector;

public abstract class RichScanActivity
  extends FragmentActivity
  implements SurfaceHolder.Callback
{
  private static final String a = RichScanActivity.class.getSimpleName();
  private com.android.dazhihui.richscan.b.a b;
  private ViewfinderView c;
  private boolean d;
  private Vector<com.c.b.a> e;
  private String f;
  private com.android.dazhihui.richscan.b.g g;
  private MediaPlayer h;
  private boolean i;
  private boolean j;
  private final MediaPlayer.OnCompletionListener k = new i(this);
  
  private void a(SurfaceHolder paramSurfaceHolder)
  {
    if (c.a().b()) {
      Log.w(a, "initCamera() while already open -- late SurfaceView callback?");
    }
    for (;;)
    {
      return;
      try
      {
        c.a().a(paramSurfaceHolder);
        if (this.b == null)
        {
          this.b = new com.android.dazhihui.richscan.b.a(this, this.e, this.f);
          return;
        }
      }
      catch (IOException paramSurfaceHolder)
      {
        Log.w(a, paramSurfaceHolder);
        d();
        return;
      }
      catch (RuntimeException paramSurfaceHolder)
      {
        Log.w(a, "Unexpected error initializing camera", paramSurfaceHolder);
        d();
      }
    }
  }
  
  private void d()
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
    localBuilder.setTitle(getString(g.app_name));
    localBuilder.setMessage(getString(g.richscan_msg_camera_framework_bug));
    localBuilder.setPositiveButton(g.button_ok, new com.android.dazhihui.richscan.b.f(this));
    localBuilder.setOnCancelListener(new com.android.dazhihui.richscan.b.f(this));
    localBuilder.show();
  }
  
  private void e()
  {
    AssetFileDescriptor localAssetFileDescriptor;
    if ((this.i) && (this.h == null))
    {
      setVolumeControlStream(3);
      this.h = new MediaPlayer();
      this.h.setAudioStreamType(3);
      this.h.setOnCompletionListener(this.k);
      localAssetFileDescriptor = getResources().openRawResourceFd(f.beep);
    }
    try
    {
      this.h.setDataSource(localAssetFileDescriptor.getFileDescriptor(), localAssetFileDescriptor.getStartOffset(), localAssetFileDescriptor.getLength());
      localAssetFileDescriptor.close();
      this.h.setVolume(0.1F, 0.1F);
      this.h.prepare();
      return;
    }
    catch (IOException localIOException)
    {
      this.h = null;
    }
  }
  
  private void f()
  {
    if ((this.i) && (this.h != null)) {
      this.h.start();
    }
    if (this.j) {
      ((Vibrator)getSystemService("vibrator")).vibrate(200L);
    }
  }
  
  public ViewfinderView a()
  {
    return this.c;
  }
  
  public void a(l paraml, Bitmap paramBitmap)
  {
    this.g.a();
    this.c.a(paramBitmap);
    f();
    a(paraml.a());
  }
  
  protected abstract void a(String paramString);
  
  public Handler b()
  {
    return this.b;
  }
  
  public void c()
  {
    this.c.a();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    setContentView(e.richscan);
    c.a(getApplication());
    this.c = ((ViewfinderView)findViewById(d.viewfinder_view));
    ((ImageView)findViewById(d.head_back)).setOnClickListener(new h(this));
    this.g = new com.android.dazhihui.richscan.b.g(this);
    this.d = false;
  }
  
  protected void onDestroy()
  {
    this.g.b();
    super.onDestroy();
  }
  
  protected void onPause()
  {
    super.onPause();
    if (this.b != null)
    {
      this.b.a();
      this.b = null;
    }
    c.a().c();
  }
  
  protected void onResume()
  {
    super.onResume();
    SurfaceHolder localSurfaceHolder = ((SurfaceView)findViewById(d.preview_view)).getHolder();
    localSurfaceHolder.setType(3);
    if (this.d) {
      a(localSurfaceHolder);
    }
    for (;;)
    {
      this.e = null;
      this.f = null;
      this.i = false;
      if (((AudioManager)getSystemService("audio")).getRingerMode() != 2) {
        this.i = false;
      }
      e();
      this.j = true;
      return;
      localSurfaceHolder.addCallback(this);
      localSurfaceHolder.setType(3);
    }
  }
  
  public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    if (paramSurfaceHolder == null) {
      Log.e(a, "*** WARNING *** surfaceCreated() gave us a null surface!");
    }
    if (!this.d)
    {
      this.d = true;
      a(paramSurfaceHolder);
    }
  }
  
  public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    this.d = false;
    c.a().c();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\richscan\RichScanActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */