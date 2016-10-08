package org.a.a;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class bh
  extends FilterOutputStream
{
  public bh(OutputStream paramOutputStream)
  {
    super(paramOutputStream);
  }
  
  private void a(int paramInt)
  {
    if (paramInt > 127)
    {
      int i = 1;
      int j = paramInt;
      for (;;)
      {
        j >>>= 8;
        if (j == 0) {
          break;
        }
        i += 1;
      }
      write((byte)(i | 0x80));
      i = (i - 1) * 8;
      while (i >= 0)
      {
        write((byte)(paramInt >> i));
        i -= 8;
      }
    }
    write((byte)paramInt);
  }
  
  protected void a()
  {
    write(5);
    write(0);
  }
  
  void a(int paramInt1, int paramInt2)
  {
    if (paramInt2 < 31)
    {
      write(paramInt1 | paramInt2);
      return;
    }
    write(paramInt1 | 0x1F);
    if (paramInt2 < 128)
    {
      write(paramInt2);
      return;
    }
    byte[] arrayOfByte = new byte[5];
    paramInt1 = arrayOfByte.length - 1;
    arrayOfByte[paramInt1] = ((byte)(paramInt2 & 0x7F));
    int i;
    int j;
    do
    {
      i = paramInt2 >> 7;
      j = paramInt1 - 1;
      arrayOfByte[j] = ((byte)(i & 0x7F | 0x80));
      paramInt1 = j;
      paramInt2 = i;
    } while (i > 127);
    write(arrayOfByte, j, arrayOfByte.length - j);
  }
  
  void a(int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    a(paramInt1, paramInt2);
    a(paramArrayOfByte.length);
    write(paramArrayOfByte);
  }
  
  void a(int paramInt, byte[] paramArrayOfByte)
  {
    write(paramInt);
    a(paramArrayOfByte.length);
    write(paramArrayOfByte);
  }
  
  public void a(Object paramObject)
  {
    if (paramObject == null)
    {
      a();
      return;
    }
    if ((paramObject instanceof bd))
    {
      ((bd)paramObject).a(this);
      return;
    }
    if ((paramObject instanceof ar))
    {
      ((ar)paramObject).c().a(this);
      return;
    }
    throw new IOException("object not DEREncodable");
  }
  
  public void write(byte[] paramArrayOfByte)
  {
    this.out.write(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.out.write(paramArrayOfByte, paramInt1, paramInt2);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\bh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */