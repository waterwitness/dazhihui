package com.g.a.b.e;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.g.a.b.a.f;
import com.g.a.b.a.i;

public class c
  implements a
{
  protected final String a;
  protected final f b;
  protected final i c;
  
  public c(String paramString, f paramf, i parami)
  {
    if (paramf == null) {
      throw new IllegalArgumentException("imageSize must not be null");
    }
    if (parami == null) {
      throw new IllegalArgumentException("scaleType must not be null");
    }
    this.a = paramString;
    this.b = paramf;
    this.c = parami;
  }
  
  public int a()
  {
    return this.b.a();
  }
  
  public boolean a(Bitmap paramBitmap)
  {
    return true;
  }
  
  public boolean a(Drawable paramDrawable)
  {
    return true;
  }
  
  public int b()
  {
    return this.b.b();
  }
  
  public i c()
  {
    return this.c;
  }
  
  public View d()
  {
    return null;
  }
  
  public boolean e()
  {
    return false;
  }
  
  public int f()
  {
    if (TextUtils.isEmpty(this.a)) {
      return super.hashCode();
    }
    return this.a.hashCode();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\g\a\b\e\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */