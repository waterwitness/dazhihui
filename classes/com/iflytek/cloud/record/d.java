package com.iflytek.cloud.record;

import java.io.File;
import java.io.RandomAccessFile;

public class d
{
  private RandomAccessFile a;
  private short b;
  private int c;
  private short d;
  
  public d(File paramFile, int paramInt)
  {
    a(paramFile, (short)1, paramInt, (short)16);
  }
  
  private boolean a(File paramFile, short paramShort1, int paramInt, short paramShort2)
  {
    if (paramFile == null) {}
    do
    {
      return false;
      this.a = new RandomAccessFile(paramFile, "rw");
    } while (this.a == null);
    this.b = paramShort1;
    this.c = paramInt;
    this.d = paramShort2;
    paramFile = new byte[44];
    this.a.write(paramFile);
    return true;
  }
  
  public int a()
  {
    return (int)(this.a.length() - 44L);
  }
  
  public void a(int paramInt)
  {
    this.a.write(paramInt >> 0);
    this.a.write(paramInt >> 8);
    this.a.write(paramInt >> 16);
    this.a.write(paramInt >> 24);
  }
  
  public void a(String paramString)
  {
    int i = 0;
    while (i < paramString.length())
    {
      this.a.write(paramString.charAt(i));
      i += 1;
    }
  }
  
  public void a(short paramShort)
  {
    this.a.write(paramShort >> 0);
    this.a.write(paramShort >> 8);
  }
  
  public void b()
  {
    this.a.seek(0L);
    a("RIFF");
    a(a() + 36);
    a("WAVE");
    a("fmt ");
    a(16);
    a((short)1);
    a(this.b);
    a(this.c);
    a(this.b * this.c * this.d / 8);
    a((short)(this.b * this.d / 8));
    a(this.d);
    a("data");
    a(a());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\record\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */