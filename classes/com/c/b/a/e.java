package com.c.b.a;

import com.c.b.i;

public final class e
  extends h
{
  public a a(a parama, int paramInt1, int paramInt2, j paramj)
  {
    if ((paramInt1 <= 0) || (paramInt2 <= 0)) {
      throw i.a();
    }
    a locala = new a(paramInt1, paramInt2);
    float[] arrayOfFloat = new float[paramInt1 * 2];
    paramInt1 = 0;
    while (paramInt1 < paramInt2)
    {
      int j = arrayOfFloat.length;
      float f = paramInt1;
      int i = 0;
      while (i < j)
      {
        arrayOfFloat[i] = (i / 2 + 0.5F);
        arrayOfFloat[(i + 1)] = (f + 0.5F);
        i += 2;
      }
      paramj.a(arrayOfFloat);
      a(parama, arrayOfFloat);
      i = 0;
      while (i < j) {
        try
        {
          if (parama.a((int)arrayOfFloat[i], (int)arrayOfFloat[(i + 1)])) {
            locala.b(i / 2, paramInt1);
          }
          i += 2;
        }
        catch (ArrayIndexOutOfBoundsException parama)
        {
          throw i.a();
        }
      }
      paramInt1 += 1;
    }
    return locala;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\b\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */