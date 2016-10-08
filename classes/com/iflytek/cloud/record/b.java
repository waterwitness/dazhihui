package com.iflytek.cloud.record;

import android.content.Context;
import android.media.AudioTrack;
import android.os.MemoryFile;
import android.text.TextUtils;
import com.iflytek.thirdparty.M;
import com.iflytek.thirdparty.X;
import java.util.ArrayList;
import java.util.Iterator;

public class b
{
  private int a = 3145728;
  private ArrayList<b.a> b = null;
  private Context c = null;
  private int d = 16000;
  private volatile long e = 0L;
  private MemoryFile f = null;
  private volatile long g = 0L;
  private volatile int h = 0;
  private b.a i = null;
  private String j = "";
  private String k = null;
  private byte[] l = null;
  private int m = 0;
  private int n = 0;
  
  public b(Context paramContext, int paramInt, String paramString)
  {
    this.c = paramContext;
    this.e = 0L;
    this.b = new ArrayList();
    this.g = 0L;
    this.d = paramInt;
    this.k = paramString;
  }
  
  private void a(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0)) {
      return;
    }
    try
    {
      if (this.f == null)
      {
        this.j = i();
        this.f = new MemoryFile(this.j, this.a);
        this.f.allowPurging(false);
      }
      this.f.writeBytes(paramArrayOfByte, 0, (int)this.g, paramArrayOfByte.length);
      this.g += paramArrayOfByte.length;
      return;
    }
    finally {}
  }
  
  private void b(int paramInt)
  {
    if (this.l == null) {
      this.l = new byte[paramInt * 10];
    }
    int i1 = this.l.length;
    paramInt = (int)(this.g - this.h);
    if (paramInt < i1) {
      i1 = paramInt;
    }
    for (int i2 = paramInt;; i2 = i1)
    {
      this.f.readBytes(this.l, this.h, 0, i1);
      this.h = (i1 + this.h);
      this.m = 0;
      this.n = i2;
      X.a("readAudio leave, dataSize=" + i2 + ", bufLen=" + paramInt);
      return;
    }
  }
  
  private String i()
  {
    String str = M.a(this.c);
    return str + System.currentTimeMillis() + "tts.pcm";
  }
  
  public int a()
  {
    return this.d;
  }
  
  public void a(AudioTrack paramAudioTrack, int paramInt)
  {
    if (this.m >= this.n) {
      b(paramInt);
    }
    if (paramInt * 2 > this.n - this.m) {}
    for (int i1 = this.n - this.m;; i1 = paramInt)
    {
      paramAudioTrack.write(this.l, this.m, i1);
      this.m = (i1 + this.m);
      if (f()) {
        b(paramAudioTrack, paramInt);
      }
      return;
    }
  }
  
  public void a(String paramString)
  {
    int i1 = 614400;
    if (TextUtils.isEmpty(paramString)) {
      return;
    }
    this.a = (paramString.length() / 5 * 4 * 32 * 1024);
    if (this.a > 614400) {
      i1 = this.a;
    }
    this.a = i1;
  }
  
  public void a(ArrayList<byte[]> arg1, int paramInt1, int paramInt2, int paramInt3)
  {
    X.a("buffer percent = " + paramInt1 + " beg=" + paramInt2 + " end=" + paramInt3);
    b.a locala = new b.a(this, this.g, this.g, paramInt2, paramInt3);
    paramInt2 = 0;
    while (paramInt2 < ???.size())
    {
      a((byte[])???.get(paramInt2));
      paramInt2 += 1;
    }
    locala.b = this.g;
    this.e = paramInt1;
    synchronized (this.b)
    {
      this.b.add(locala);
      X.a("allSize = " + this.g + " maxSize=" + this.a);
      return;
    }
  }
  
  public boolean a(int paramInt)
  {
    if (this.e > 95L) {}
    while ((this.g / 32L >= paramInt) && (0L < this.g)) {
      return true;
    }
    return false;
  }
  
  public int b()
  {
    if (this.f != null) {
      return this.f.length();
    }
    return 0;
  }
  
  public void b(AudioTrack paramAudioTrack, int paramInt)
  {
    X.a("mBuffer.writeTrack writeTrackBlankBlock:" + paramInt);
    paramInt += 4096;
    paramAudioTrack.write(new byte[paramInt], 0, paramInt);
  }
  
  public boolean b(String paramString)
  {
    X.a("save to local: format = " + paramString + " totalSize = " + this.g + " maxSize=" + this.a);
    if (M.a(this.f, this.g, this.k)) {
      return M.a(paramString, this.k, a());
    }
    return false;
  }
  
  public void c()
  {
    this.h = 0;
    this.i = null;
    if (this.b.size() > 0) {
      this.i = ((b.a)this.b.get(0));
    }
  }
  
  public int d()
  {
    if (this.g <= 0L) {
      return 0;
    }
    return (int)((this.h - (this.n - this.m)) * this.e / this.g);
  }
  
  public b.a e()
  {
    if (this.i != null)
    {
      long l1 = this.h - (this.n - this.m);
      if ((l1 >= this.i.a) && (l1 <= this.i.b)) {
        return this.i;
      }
      synchronized (this.b)
      {
        Object localObject1 = this.b.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          this.i = ((b.a)((Iterator)localObject1).next());
          if ((l1 >= this.i.a) && (l1 <= this.i.b))
          {
            localObject1 = this.i;
            return (b.a)localObject1;
          }
        }
      }
    }
    return null;
  }
  
  public boolean f()
  {
    return (100L == this.e) && (this.h >= this.g) && (this.m >= this.n);
  }
  
  protected void finalize()
  {
    h();
    super.finalize();
  }
  
  public boolean g()
  {
    return (this.h < this.g) || (this.m < this.n);
  }
  
  public void h()
  {
    X.a("deleteFile");
    try
    {
      if (this.f != null)
      {
        this.f.close();
        this.f = null;
      }
      return;
    }
    catch (Exception localException)
    {
      X.a(localException);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\record\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */