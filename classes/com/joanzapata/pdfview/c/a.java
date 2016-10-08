package com.joanzapata.pdfview.c;

import android.graphics.Bitmap;
import android.graphics.RectF;

public class a
{
  private int a;
  private int b;
  private Bitmap c;
  private float d;
  private float e;
  private RectF f;
  private boolean g;
  private int h;
  
  public a(int paramInt1, int paramInt2, Bitmap paramBitmap, float paramFloat1, float paramFloat2, RectF paramRectF, boolean paramBoolean, int paramInt3)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramBitmap;
    this.f = paramRectF;
    this.g = paramBoolean;
    this.h = paramInt3;
  }
  
  public int a()
  {
    return this.h;
  }
  
  public void a(int paramInt)
  {
    this.h = paramInt;
  }
  
  public int b()
  {
    return this.b;
  }
  
  public int c()
  {
    return this.a;
  }
  
  public Bitmap d()
  {
    return this.c;
  }
  
  public RectF e()
  {
    return this.f;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof a)) {}
    do
    {
      return false;
      paramObject = (a)paramObject;
    } while ((((a)paramObject).b() != this.b) || (((a)paramObject).c() != this.a) || (((a)paramObject).f() != this.d) || (((a)paramObject).g() != this.e) || (((a)paramObject).e().left != this.f.left) || (((a)paramObject).e().right != this.f.right) || (((a)paramObject).e().top != this.f.top) || (((a)paramObject).e().bottom != this.f.bottom));
    return true;
  }
  
  public float f()
  {
    return this.d;
  }
  
  public float g()
  {
    return this.e;
  }
  
  public boolean h()
  {
    return this.g;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\joanzapata\pdfview\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */