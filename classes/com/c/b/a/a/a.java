package com.c.b.a.a;

public final class a
{
  public static float a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    paramFloat1 -= paramFloat3;
    paramFloat2 -= paramFloat4;
    return (float)Math.sqrt(paramFloat1 * paramFloat1 + paramFloat2 * paramFloat2);
  }
  
  public static float a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt1 -= paramInt3;
    paramInt2 -= paramInt4;
    return (float)Math.sqrt(paramInt1 * paramInt1 + paramInt2 * paramInt2);
  }
  
  public static int a(float paramFloat)
  {
    if (paramFloat < 0.0F) {}
    for (float f = -0.5F;; f = 0.5F) {
      return (int)(f + paramFloat);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\b\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */