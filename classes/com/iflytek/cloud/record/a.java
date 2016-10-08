package com.iflytek.cloud.record;

import com.iflytek.cloud.SpeechError;
import com.iflytek.thirdparty.X;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class a
  extends PcmRecorder
{
  private int a = 0;
  private int b = 0;
  private int c = 0;
  private boolean d = false;
  private int e = 16000;
  private final short f = 16;
  private int g = 40;
  private int h = 40;
  private byte[] i = null;
  private RandomAccessFile j = null;
  private String k = null;
  private PcmRecorder.PcmRecordListener l = null;
  
  public a(int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    super(paramInt1, paramInt2, paramInt3);
    this.e = paramInt1;
    this.g = paramInt2;
    this.h = paramInt2;
    this.k = paramString;
  }
  
  private int a()
  {
    if ((this.j == null) || (this.l == null)) {}
    do
    {
      return 0;
      if (this.b >= this.a) {
        try
        {
          this.b = 0;
          this.a = this.j.read(this.i, this.b, this.i.length);
          m = this.a;
          if (m < 0) {
            return -1;
          }
        }
        catch (IOException localIOException)
        {
          throw new SpeechError(20006);
        }
      }
    } while ((this.a <= 0) || (this.l == null));
    if (this.a - this.b > this.c) {}
    for (int m = this.c;; m = this.a - this.b)
    {
      this.l.onRecordBuffer(this.i, this.b, m);
      this.b += m;
      return m;
    }
  }
  
  private void b()
  {
    if (this.j != null) {
      X.a("release record begin");
    }
    try
    {
      this.j.close();
      this.j = null;
      if (this.l != null)
      {
        this.l.onRecordReleased();
        this.l = null;
      }
      X.a("release record over");
      if (this.i != null) {
        this.i = null;
      }
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        X.a(localIOException);
      }
    }
  }
  
  protected void a(short paramShort, int paramInt1, int paramInt2)
  {
    this.c = (16 * (paramInt1 * 40 / 1000 * paramShort) / 8);
    this.i = new byte[this.c * 10];
    try
    {
      this.j = new RandomAccessFile(this.k, "r");
      return;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      throw new SpeechError(20006);
    }
  }
  
  protected void finalize()
  {
    b();
    super.finalize();
  }
  
  public void run()
  {
    for (;;)
    {
      try
      {
        a((short)1, this.e, this.g);
        if (this.l != null) {
          this.l.onRecordStarted(true);
        }
        if (!this.d)
        {
          if (a() >= 0) {
            continue;
          }
          this.d = true;
        }
      }
      catch (Exception localException)
      {
        X.a(localException);
        if (this.l == null) {
          continue;
        }
        this.l.onError(new SpeechError(20006));
        continue;
      }
      b();
      return;
      sleep(this.h);
    }
  }
  
  public void startRecording(PcmRecorder.PcmRecordListener paramPcmRecordListener)
  {
    this.l = paramPcmRecordListener;
    setPriority(10);
    start();
  }
  
  public void stopRecord(boolean paramBoolean)
  {
    this.d = true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\record\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */