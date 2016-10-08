package com.c.b.b.a;

import com.c.b.a.b.c;
import com.c.b.e;
import java.util.Map;

public final class n
{
  private final c a = new c(com.c.b.a.b.a.e);
  
  private com.c.b.a.d a(a parama, Map<e, ?> paramMap)
  {
    s locals = parama.b();
    o localo = parama.a().a();
    parama = b.a(parama.c(), locals, localo);
    int k = parama.length;
    int i = 0;
    int j = 0;
    while (i < k)
    {
      j += parama[i].a();
      i += 1;
    }
    byte[] arrayOfByte1 = new byte[j];
    int m = parama.length;
    j = 0;
    i = 0;
    while (j < m)
    {
      Object localObject = parama[j];
      byte[] arrayOfByte2 = ((b)localObject).b();
      int n = ((b)localObject).a();
      a(arrayOfByte2, n);
      k = 0;
      while (k < n)
      {
        arrayOfByte1[i] = arrayOfByte2[k];
        k += 1;
        i += 1;
      }
      j += 1;
    }
    return m.a(arrayOfByte1, locals, localo, paramMap);
  }
  
  private void a(byte[] paramArrayOfByte, int paramInt)
  {
    int j = 0;
    int k = paramArrayOfByte.length;
    int[] arrayOfInt = new int[k];
    int i = 0;
    while (i < k)
    {
      paramArrayOfByte[i] &= 0xFF;
      i += 1;
    }
    i = paramArrayOfByte.length;
    try
    {
      this.a.a(arrayOfInt, i - paramInt);
      i = j;
      while (i < paramInt)
      {
        paramArrayOfByte[i] = ((byte)arrayOfInt[i]);
        i += 1;
      }
      return;
    }
    catch (com.c.b.a.b.d paramArrayOfByte)
    {
      throw com.c.b.d.a();
    }
  }
  
  /* Error */
  public com.c.b.a.d a(com.c.b.a.a parama, Map<e, ?> paramMap)
  {
    // Byte code:
    //   0: new 27	com/c/b/b/a/a
    //   3: dup
    //   4: aload_1
    //   5: invokespecial 79	com/c/b/b/a/a:<init>	(Lcom/c/b/a/a;)V
    //   8: astore 4
    //   10: aload_0
    //   11: aload 4
    //   13: aload_2
    //   14: invokespecial 81	com/c/b/b/a/n:a	(Lcom/c/b/b/a/a;Ljava/util/Map;)Lcom/c/b/a/d;
    //   17: astore_1
    //   18: aload_1
    //   19: areturn
    //   20: astore_3
    //   21: aconst_null
    //   22: astore_1
    //   23: aload 4
    //   25: invokevirtual 84	com/c/b/b/a/a:d	()V
    //   28: aload 4
    //   30: iconst_1
    //   31: invokevirtual 87	com/c/b/b/a/a:a	(Z)V
    //   34: aload 4
    //   36: invokevirtual 31	com/c/b/b/a/a:b	()Lcom/c/b/b/a/s;
    //   39: pop
    //   40: aload 4
    //   42: invokevirtual 34	com/c/b/b/a/a:a	()Lcom/c/b/b/a/p;
    //   45: pop
    //   46: aload 4
    //   48: invokevirtual 89	com/c/b/b/a/a:e	()V
    //   51: aload_0
    //   52: aload 4
    //   54: aload_2
    //   55: invokespecial 81	com/c/b/b/a/n:a	(Lcom/c/b/b/a/a;Ljava/util/Map;)Lcom/c/b/a/d;
    //   58: astore_2
    //   59: aload_2
    //   60: new 91	com/c/b/b/a/r
    //   63: dup
    //   64: iconst_1
    //   65: invokespecial 93	com/c/b/b/a/r:<init>	(Z)V
    //   68: invokevirtual 98	com/c/b/a/d:a	(Ljava/lang/Object;)V
    //   71: aload_2
    //   72: areturn
    //   73: astore_2
    //   74: aload_3
    //   75: ifnull +11 -> 86
    //   78: aload_3
    //   79: athrow
    //   80: astore_1
    //   81: aconst_null
    //   82: astore_3
    //   83: goto -60 -> 23
    //   86: aload_1
    //   87: ifnull +5 -> 92
    //   90: aload_1
    //   91: athrow
    //   92: aload_2
    //   93: athrow
    //   94: astore_2
    //   95: aload_3
    //   96: ifnull +5 -> 101
    //   99: aload_3
    //   100: athrow
    //   101: aload_1
    //   102: ifnull +5 -> 107
    //   105: aload_1
    //   106: athrow
    //   107: aload_2
    //   108: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	109	0	this	n
    //   0	109	1	parama	com.c.b.a.a
    //   0	109	2	paramMap	Map<e, ?>
    //   20	59	3	localf	com.c.b.f
    //   82	18	3	localObject	Object
    //   8	45	4	locala	a
    // Exception table:
    //   from	to	target	type
    //   10	18	20	com/c/b/f
    //   23	71	73	com/c/b/f
    //   10	18	80	com/c/b/d
    //   23	71	94	com/c/b/d
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\b\b\a\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */