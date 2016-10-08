package org.a.a;

import java.util.Enumeration;

public class bz
  extends bj
{
  private byte[] a;
  private boolean b = false;
  private int c = -1;
  
  bz(byte[] paramArrayOfByte)
  {
    this.a = paramArrayOfByte;
  }
  
  private void g()
  {
    by localby = new by(this.a);
    while (localby.hasMoreElements()) {
      a((ar)localby.nextElement());
    }
    this.b = true;
  }
  
  public ar a(int paramInt)
  {
    try
    {
      if (!this.b) {
        g();
      }
      ar localar = super.a(paramInt);
      return localar;
    }
    finally {}
  }
  
  void a(bh parambh)
  {
    parambh.a(48, this.a);
  }
  
  /* Error */
  public Enumeration e()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 17	org/a/a/bz:b	Z
    //   6: ifeq +12 -> 18
    //   9: aload_0
    //   10: invokespecial 57	org/a/a/bj:e	()Ljava/util/Enumeration;
    //   13: astore_1
    //   14: aload_0
    //   15: monitorexit
    //   16: aload_1
    //   17: areturn
    //   18: new 25	org/a/a/by
    //   21: dup
    //   22: aload_0
    //   23: getfield 21	org/a/a/bz:a	[B
    //   26: invokespecial 27	org/a/a/by:<init>	([B)V
    //   29: astore_1
    //   30: goto -16 -> 14
    //   33: astore_1
    //   34: aload_0
    //   35: monitorexit
    //   36: aload_1
    //   37: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	38	0	this	bz
    //   13	17	1	localObject1	Object
    //   33	4	1	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   2	14	33	finally
    //   18	30	33	finally
  }
  
  public int f()
  {
    if (this.c < 0)
    {
      by localby = new by(this.a);
      for (this.c = 0; localby.hasMoreElements(); this.c += 1) {
        localby.nextElement();
      }
    }
    return this.c;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\bz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */