package org.a.a;

import java.io.ByteArrayOutputStream;

public class au
  extends l
{
  private be a;
  private ba b;
  private l c;
  private int d;
  private bd e;
  
  public au(e parame)
  {
    int j = 0;
    Object localObject2 = a(parame, 0);
    Object localObject1 = localObject2;
    if ((localObject2 instanceof be))
    {
      this.a = ((be)localObject2);
      j = 1;
      localObject1 = a(parame, 1);
    }
    localObject2 = localObject1;
    int i = j;
    if ((localObject1 instanceof ba))
    {
      this.b = ((ba)localObject1);
      i = j + 1;
      localObject2 = a(parame, i);
    }
    localObject1 = localObject2;
    j = i;
    if (!(localObject2 instanceof bp))
    {
      this.c = ((l)localObject2);
      j = i + 1;
      localObject1 = a(parame, j);
    }
    if (parame.a() != j + 1) {
      throw new IllegalArgumentException("input vector too large");
    }
    if (!(localObject1 instanceof bp)) {
      throw new IllegalArgumentException("No tagged object found in vector. Structure doesn't seem to be of type External");
    }
    parame = (bp)localObject1;
    a(parame.e());
    this.e = parame.h();
  }
  
  private bd a(e parame, int paramInt)
  {
    if (parame.a() <= paramInt) {
      throw new IllegalArgumentException("too few objects in input vector");
    }
    return parame.a(paramInt).c();
  }
  
  private void a(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 2)) {
      throw new IllegalArgumentException("invalid encoding value: " + paramInt);
    }
    this.d = paramInt;
  }
  
  void a(bh parambh)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    if (this.a != null) {
      localByteArrayOutputStream.write(this.a.b());
    }
    if (this.b != null) {
      localByteArrayOutputStream.write(this.b.b());
    }
    if (this.c != null) {
      localByteArrayOutputStream.write(this.c.b());
    }
    localByteArrayOutputStream.write(new bp(this.d, this.e).b());
    parambh.a(32, 8, localByteArrayOutputStream.toByteArray());
  }
  
  boolean a(bd parambd)
  {
    if (!(parambd instanceof au)) {}
    do
    {
      return false;
      if (this == parambd) {
        return true;
      }
      parambd = (au)parambd;
    } while (((this.a != null) && ((parambd.a == null) || (!parambd.a.equals(this.a)))) || ((this.b != null) && ((parambd.b == null) || (!parambd.b.equals(this.b)))) || ((this.c != null) && ((parambd.c == null) || (!parambd.c.equals(this.c)))));
    return this.e.equals(parambd.e);
  }
  
  public int hashCode()
  {
    int j = 0;
    if (this.a != null) {
      j = this.a.hashCode();
    }
    int i = j;
    if (this.b != null) {
      i = j ^ this.b.hashCode();
    }
    j = i;
    if (this.c != null) {
      j = i ^ this.c.hashCode();
    }
    return j ^ this.e.hashCode();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */