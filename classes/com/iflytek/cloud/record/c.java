package com.iflytek.cloud.record;

import android.content.Context;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import com.iflytek.thirdparty.X;

public class c
{
  AudioManager.OnAudioFocusChangeListener a = new c.1(this);
  private AudioTrack b = null;
  private b c = null;
  private Context d = null;
  private c.b e = null;
  private c.a f = null;
  private volatile int g = 0;
  private int h = 3;
  private boolean i = true;
  private int j;
  private boolean k = false;
  private boolean l = false;
  private Object m = new Object();
  private Object n = this;
  private int o = 0;
  private Handler p = new c.2(this, Looper.getMainLooper());
  
  public c(Context paramContext)
  {
    this.d = paramContext;
  }
  
  public c(Context paramContext, int paramInt, boolean paramBoolean)
  {
    this.d = paramContext;
    this.h = paramInt;
    this.k = paramBoolean;
  }
  
  private boolean a(int paramInt1, int paramInt2)
  {
    boolean bool = false;
    synchronized (this.n)
    {
      if (paramInt1 == this.g)
      {
        this.g = paramInt2;
        bool = true;
      }
      return bool;
    }
  }
  
  private void f()
  {
    X.a("PcmPlayer", "createAudio start");
    int i1 = this.c.a();
    this.j = AudioTrack.getMinBufferSize(i1, 2, 2);
    if (this.b != null) {
      b();
    }
    X.a("PcmPlayer", "createAudio || mStreamType = " + this.h);
    this.b = new AudioTrack(this.h, i1, 2, 2, this.j * 2, 1);
    if ((this.j == -2) || (this.j == -1)) {
      throw new Exception();
    }
    X.a("PcmPlayer", "createAudio end");
  }
  
  private void g()
  {
    c.b localb = this.e;
    if ((this.b == null) || ((localb != null) && (localb.a() != this.h)))
    {
      X.a("PcmPlayer", "prepAudioPlayer || audiotrack is null or stream type is change.");
      f();
      if (localb != null) {
        localb.a(this.h);
      }
    }
  }
  
  public int a()
  {
    return this.g;
  }
  
  public boolean a(b paramb, c.a parama)
  {
    X.a("PcmPlayer", "play mPlaytate= " + this.g + ",mAudioFocus= " + this.i);
    boolean bool = true;
    synchronized (this.n)
    {
      if ((this.g != 4) && (this.g != 0) && (this.g != 3) && (this.e != null))
      {
        bool = false;
        return bool;
      }
      this.c = paramb;
      this.f = parama;
      this.e = new c.b(this, null);
      this.e.start();
    }
  }
  
  public void b()
  {
    synchronized (this.m)
    {
      if (this.b != null)
      {
        if (this.b.getPlayState() == 3) {
          this.b.stop();
        }
        this.b.release();
        this.b = null;
      }
      X.a("PcmPlayer", "mAudioTrack released");
      return;
    }
  }
  
  public boolean c()
  {
    if ((this.g == 4) || (this.g == 3)) {
      return false;
    }
    this.g = 3;
    return true;
  }
  
  public boolean d()
  {
    return a(3, 2);
  }
  
  public void e()
  {
    synchronized (this.n)
    {
      this.g = 4;
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\record\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */