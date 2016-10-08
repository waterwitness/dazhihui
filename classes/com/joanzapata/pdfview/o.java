package com.joanzapata.pdfview;

class o
{
  private p a;
  
  public o(p paramp)
  {
    if (paramp == null) {
      throw new IllegalArgumentException("SpiralLoopListener must not be null");
    }
    this.a = paramp;
  }
  
  private boolean b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return (paramInt1 >= 0) && (paramInt1 < paramInt3) && (paramInt2 >= 0) && (paramInt2 < paramInt4);
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.a.a(paramInt3, paramInt4);
    int j = 1;
    int k = 1;
    int m = 1;
    int i = paramInt3;
    paramInt3 = m;
    for (;;)
    {
      int n;
      if (paramInt3 < paramInt2 * paramInt1)
      {
        m = i;
        i = paramInt3;
        n = 0;
        paramInt3 = m;
        m = n;
      }
      while (m < k)
      {
        n = paramInt3 + j;
        paramInt3 = i;
        if (b(n, paramInt4, paramInt1, paramInt2))
        {
          paramInt3 = i + 1;
          if (!this.a.a(n, paramInt4)) {
            return;
          }
        }
        m += 1;
        i = paramInt3;
        paramInt3 = n;
      }
      m = 0;
      for (;;)
      {
        if (m >= k) {
          break label189;
        }
        n = paramInt4 + j;
        paramInt4 = i;
        if (b(paramInt3, n, paramInt1, paramInt2))
        {
          paramInt4 = i + 1;
          if (!this.a.a(paramInt3, n)) {
            break;
          }
        }
        m += 1;
        i = paramInt4;
        paramInt4 = n;
      }
      label189:
      k += 1;
      m = j * -1;
      j = i;
      i = paramInt3;
      paramInt3 = j;
      j = m;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\joanzapata\pdfview\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */