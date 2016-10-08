package com.c.b.a;

import com.c.b.f;
import java.util.HashMap;
import java.util.Map;

public enum c
{
  private static final Map<Integer, c> B;
  private static final Map<String, c> C;
  private final int[] D;
  private final String[] E;
  
  static
  {
    A = new c("EUC_KR", 26, 30, new String[] { "EUC-KR" });
    F = new c[] { a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, A };
    B = new HashMap();
    C = new HashMap();
    c[] arrayOfc = values();
    int i3 = arrayOfc.length;
    int i1 = 0;
    while (i1 < i3)
    {
      c localc = arrayOfc[i1];
      Object localObject1 = localc.D;
      int i4 = localObject1.length;
      int i2 = 0;
      while (i2 < i4)
      {
        int i5 = localObject1[i2];
        B.put(Integer.valueOf(i5), localc);
        i2 += 1;
      }
      C.put(localc.name(), localc);
      localObject1 = localc.E;
      i4 = localObject1.length;
      i2 = 0;
      while (i2 < i4)
      {
        Object localObject2 = localObject1[i2];
        C.put(localObject2, localc);
        i2 += 1;
      }
      i1 += 1;
    }
  }
  
  private c(int paramInt)
  {
    this(new int[] { paramInt }, new String[0]);
  }
  
  private c(int paramInt, String... paramVarArgs)
  {
    this.D = new int[] { paramInt };
    this.E = paramVarArgs;
  }
  
  private c(int[] paramArrayOfInt, String... paramVarArgs)
  {
    this.D = paramArrayOfInt;
    this.E = paramVarArgs;
  }
  
  public static c a(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= 900)) {
      throw f.a();
    }
    return (c)B.get(Integer.valueOf(paramInt));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\b\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */