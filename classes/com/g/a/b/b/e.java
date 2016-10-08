package com.g.a.b.b;

import android.annotation.TargetApi;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import com.g.a.b.a.f;
import com.g.a.b.a.i;
import com.g.a.b.d;
import com.g.a.b.d.c;

public class e
{
  private final String a;
  private final String b;
  private final String c;
  private final f d;
  private final com.g.a.b.a.e e;
  private final i f;
  private final c g;
  private final Object h;
  private final boolean i;
  private final BitmapFactory.Options j;
  
  public e(String paramString1, String paramString2, String paramString3, f paramf, i parami, c paramc, d paramd)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramString3;
    this.d = paramf;
    this.e = paramd.j();
    this.f = parami;
    this.g = paramc;
    this.h = paramd.n();
    this.i = paramd.m();
    this.j = new BitmapFactory.Options();
    a(paramd.k(), this.j);
  }
  
  private void a(BitmapFactory.Options paramOptions1, BitmapFactory.Options paramOptions2)
  {
    paramOptions2.inDensity = paramOptions1.inDensity;
    paramOptions2.inDither = paramOptions1.inDither;
    paramOptions2.inInputShareable = paramOptions1.inInputShareable;
    paramOptions2.inJustDecodeBounds = paramOptions1.inJustDecodeBounds;
    paramOptions2.inPreferredConfig = paramOptions1.inPreferredConfig;
    paramOptions2.inPurgeable = paramOptions1.inPurgeable;
    paramOptions2.inSampleSize = paramOptions1.inSampleSize;
    paramOptions2.inScaled = paramOptions1.inScaled;
    paramOptions2.inScreenDensity = paramOptions1.inScreenDensity;
    paramOptions2.inTargetDensity = paramOptions1.inTargetDensity;
    paramOptions2.inTempStorage = paramOptions1.inTempStorage;
    if (Build.VERSION.SDK_INT >= 10) {
      b(paramOptions1, paramOptions2);
    }
    if (Build.VERSION.SDK_INT >= 11) {
      c(paramOptions1, paramOptions2);
    }
  }
  
  @TargetApi(10)
  private void b(BitmapFactory.Options paramOptions1, BitmapFactory.Options paramOptions2)
  {
    paramOptions2.inPreferQualityOverSpeed = paramOptions1.inPreferQualityOverSpeed;
  }
  
  @TargetApi(11)
  private void c(BitmapFactory.Options paramOptions1, BitmapFactory.Options paramOptions2)
  {
    paramOptions2.inBitmap = paramOptions1.inBitmap;
    paramOptions2.inMutable = paramOptions1.inMutable;
  }
  
  public String a()
  {
    return this.a;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public f c()
  {
    return this.d;
  }
  
  public com.g.a.b.a.e d()
  {
    return this.e;
  }
  
  public i e()
  {
    return this.f;
  }
  
  public c f()
  {
    return this.g;
  }
  
  public Object g()
  {
    return this.h;
  }
  
  public boolean h()
  {
    return this.i;
  }
  
  public BitmapFactory.Options i()
  {
    return this.j;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\g\a\b\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */