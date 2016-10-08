package com.c.b.a;

public final class j
{
  private final float a;
  private final float b;
  private final float c;
  private final float d;
  private final float e;
  private final float f;
  private final float g;
  private final float h;
  private final float i;
  
  private j(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8, float paramFloat9)
  {
    this.a = paramFloat1;
    this.b = paramFloat4;
    this.c = paramFloat7;
    this.d = paramFloat2;
    this.e = paramFloat5;
    this.f = paramFloat8;
    this.g = paramFloat3;
    this.h = paramFloat6;
    this.i = paramFloat9;
  }
  
  public static j a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8)
  {
    float f1 = paramFloat1 - paramFloat3 + paramFloat5 - paramFloat7;
    float f2 = paramFloat2 - paramFloat4 + paramFloat6 - paramFloat8;
    if ((f1 == 0.0F) && (f2 == 0.0F)) {
      return new j(paramFloat3 - paramFloat1, paramFloat5 - paramFloat3, paramFloat1, paramFloat4 - paramFloat2, paramFloat6 - paramFloat4, paramFloat2, 0.0F, 0.0F, 1.0F);
    }
    float f3 = paramFloat3 - paramFloat5;
    float f4 = paramFloat7 - paramFloat5;
    paramFloat5 = paramFloat4 - paramFloat6;
    float f5 = paramFloat8 - paramFloat6;
    paramFloat6 = f3 * f5 - f4 * paramFloat5;
    f4 = (f5 * f1 - f4 * f2) / paramFloat6;
    paramFloat5 = (f2 * f3 - f1 * paramFloat5) / paramFloat6;
    return new j(paramFloat3 - paramFloat1 + f4 * paramFloat3, paramFloat7 - paramFloat1 + paramFloat5 * paramFloat7, paramFloat1, f4 * paramFloat4 + (paramFloat4 - paramFloat2), paramFloat5 * paramFloat8 + (paramFloat8 - paramFloat2), paramFloat2, f4, paramFloat5, 1.0F);
  }
  
  public static j a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8, float paramFloat9, float paramFloat10, float paramFloat11, float paramFloat12, float paramFloat13, float paramFloat14, float paramFloat15, float paramFloat16)
  {
    j localj = b(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramFloat7, paramFloat8);
    return a(paramFloat9, paramFloat10, paramFloat11, paramFloat12, paramFloat13, paramFloat14, paramFloat15, paramFloat16).a(localj);
  }
  
  public static j b(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8)
  {
    return a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramFloat7, paramFloat8).a();
  }
  
  j a()
  {
    return new j(this.e * this.i - this.f * this.h, this.f * this.g - this.d * this.i, this.d * this.h - this.e * this.g, this.c * this.h - this.b * this.i, this.a * this.i - this.c * this.g, this.b * this.g - this.a * this.h, this.b * this.f - this.c * this.e, this.c * this.d - this.a * this.f, this.a * this.e - this.b * this.d);
  }
  
  j a(j paramj)
  {
    return new j(this.a * paramj.a + this.d * paramj.b + this.g * paramj.c, this.a * paramj.d + this.d * paramj.e + this.g * paramj.f, this.a * paramj.g + this.d * paramj.h + this.g * paramj.i, this.b * paramj.a + this.e * paramj.b + this.h * paramj.c, this.b * paramj.d + this.e * paramj.e + this.h * paramj.f, this.b * paramj.g + this.e * paramj.h + this.h * paramj.i, this.c * paramj.a + this.f * paramj.b + this.i * paramj.c, this.c * paramj.d + this.f * paramj.e + this.i * paramj.f, this.c * paramj.g + this.f * paramj.h + this.i * paramj.i);
  }
  
  public void a(float[] paramArrayOfFloat)
  {
    int k = paramArrayOfFloat.length;
    float f1 = this.a;
    float f2 = this.b;
    float f3 = this.c;
    float f4 = this.d;
    float f5 = this.e;
    float f6 = this.f;
    float f7 = this.g;
    float f8 = this.h;
    float f9 = this.i;
    int j = 0;
    while (j < k)
    {
      float f10 = paramArrayOfFloat[j];
      float f11 = paramArrayOfFloat[(j + 1)];
      float f12 = f3 * f10 + f6 * f11 + f9;
      paramArrayOfFloat[j] = ((f1 * f10 + f4 * f11 + f7) / f12);
      paramArrayOfFloat[(j + 1)] = ((f10 * f2 + f11 * f5 + f8) / f12);
      j += 2;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\b\a\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */