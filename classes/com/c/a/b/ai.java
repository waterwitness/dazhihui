package com.c.a.b;

import java.io.Writer;

final class ai
  extends Writer
{
  private final Appendable a;
  private final aj b = new aj();
  
  private ai(Appendable paramAppendable)
  {
    this.a = paramAppendable;
  }
  
  public void close() {}
  
  public void flush() {}
  
  public void write(int paramInt)
  {
    this.a.append((char)paramInt);
  }
  
  public void write(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    this.b.a = paramArrayOfChar;
    this.a.append(this.b, paramInt1, paramInt1 + paramInt2);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\a\b\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */