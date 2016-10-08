package org.vudroid.pdfdroid.codec;

import org.vudroid.a.a.b;
import org.vudroid.a.a.c;

public class PdfDocument
  implements b
{
  private long a;
  
  private PdfDocument(long paramLong)
  {
    this.a = paramLong;
  }
  
  static PdfDocument a(String paramString1, String paramString2)
  {
    try
    {
      paramString1 = new PdfDocument(open(524288, paramString1, paramString2));
      return paramString1;
    }
    catch (Exception paramString1)
    {
      paramString1.printStackTrace();
    }
    return null;
  }
  
  private static native void free(long paramLong);
  
  private static native int getPageCount(long paramLong);
  
  private static native long open(int paramInt, String paramString1, String paramString2);
  
  public int a()
  {
    return getPageCount(this.a);
  }
  
  public c a(int paramInt)
  {
    return PdfPage.a(this.a, paramInt + 1);
  }
  
  public void b()
  {
    try
    {
      if (this.a != 0L)
      {
        free(this.a);
        this.a = 0L;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  protected void finalize()
  {
    b();
    super.finalize();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\vudroid\pdfdroid\codec\PdfDocument.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */