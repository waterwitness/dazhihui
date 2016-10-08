package com.d.a.c.d;

import java.util.concurrent.CountDownLatch;

final class z
{
  private final CountDownLatch a = new CountDownLatch(1);
  private long b = -1L;
  private long c = -1L;
  
  public void a()
  {
    if (this.b != -1L) {
      throw new IllegalStateException();
    }
    this.b = System.nanoTime();
  }
  
  public void b()
  {
    if ((this.c != -1L) || (this.b == -1L)) {
      throw new IllegalStateException();
    }
    this.c = System.nanoTime();
    this.a.countDown();
  }
  
  void cancel()
  {
    if ((this.c != -1L) || (this.b == -1L)) {
      throw new IllegalStateException();
    }
    this.c = (this.b - 1L);
    this.a.countDown();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\d\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */