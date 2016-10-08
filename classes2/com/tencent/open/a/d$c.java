package com.tencent.open.a;

import android.os.StatFs;
import java.io.File;

public class d$c
{
  private File a;
  private long b;
  private long c;
  
  public static c b(File paramFile)
  {
    c localc = new c();
    localc.a(paramFile);
    paramFile = new StatFs(paramFile.getAbsolutePath());
    long l1 = paramFile.getBlockSize();
    long l2 = paramFile.getBlockCount();
    long l3 = paramFile.getAvailableBlocks();
    localc.a(l2 * l1);
    localc.b(l1 * l3);
    return localc;
  }
  
  public File a()
  {
    return this.a;
  }
  
  public void a(long paramLong)
  {
    this.b = paramLong;
  }
  
  public void a(File paramFile)
  {
    this.a = paramFile;
  }
  
  public long b()
  {
    return this.b;
  }
  
  public void b(long paramLong)
  {
    this.c = paramLong;
  }
  
  public long c()
  {
    return this.c;
  }
  
  public String toString()
  {
    return String.format("[%s : %d / %d]", new Object[] { a().getAbsolutePath(), Long.valueOf(c()), Long.valueOf(b()) });
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\open\a\d$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */