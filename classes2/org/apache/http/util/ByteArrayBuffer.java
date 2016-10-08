package org.apache.http.util;

import java.io.Serializable;
import org.apache.http.annotation.NotThreadSafe;

@NotThreadSafe
public final class ByteArrayBuffer
  implements Serializable
{
  private static final long serialVersionUID = 4359112959524048036L;
  private byte[] buffer;
  private int len;
  
  public ByteArrayBuffer(int paramInt)
  {
    Args.notNegative(paramInt, "Buffer capacity");
    this.buffer = new byte[paramInt];
  }
  
  private void expand(int paramInt)
  {
    byte[] arrayOfByte = new byte[Math.max(this.buffer.length << 1, paramInt)];
    System.arraycopy(this.buffer, 0, arrayOfByte, 0, this.len);
    this.buffer = arrayOfByte;
  }
  
  public void append(int paramInt)
  {
    int i = this.len + 1;
    if (i > this.buffer.length) {
      expand(i);
    }
    this.buffer[this.len] = ((byte)paramInt);
    this.len = i;
  }
  
  public void append(CharArrayBuffer paramCharArrayBuffer, int paramInt1, int paramInt2)
  {
    if (paramCharArrayBuffer == null) {
      return;
    }
    append(paramCharArrayBuffer.buffer(), paramInt1, paramInt2);
  }
  
  public void append(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramArrayOfByte == null) {}
    do
    {
      return;
      if ((paramInt1 < 0) || (paramInt1 > paramArrayOfByte.length) || (paramInt2 < 0) || (paramInt1 + paramInt2 < 0) || (paramInt1 + paramInt2 > paramArrayOfByte.length)) {
        throw new IndexOutOfBoundsException("off: " + paramInt1 + " len: " + paramInt2 + " b.length: " + paramArrayOfByte.length);
      }
    } while (paramInt2 == 0);
    int i = this.len + paramInt2;
    if (i > this.buffer.length) {
      expand(i);
    }
    System.arraycopy(paramArrayOfByte, paramInt1, this.buffer, this.len, paramInt2);
    this.len = i;
  }
  
  public void append(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    if (paramArrayOfChar == null) {}
    do
    {
      return;
      if ((paramInt1 < 0) || (paramInt1 > paramArrayOfChar.length) || (paramInt2 < 0) || (paramInt1 + paramInt2 < 0) || (paramInt1 + paramInt2 > paramArrayOfChar.length)) {
        throw new IndexOutOfBoundsException("off: " + paramInt1 + " len: " + paramInt2 + " b.length: " + paramArrayOfChar.length);
      }
    } while (paramInt2 == 0);
    int j = this.len;
    int k = j + paramInt2;
    paramInt2 = j;
    int i = paramInt1;
    if (k > this.buffer.length)
    {
      expand(k);
      i = paramInt1;
      paramInt2 = j;
    }
    while (paramInt2 < k)
    {
      this.buffer[paramInt2] = ((byte)paramArrayOfChar[i]);
      i += 1;
      paramInt2 += 1;
    }
    this.len = k;
  }
  
  public byte[] buffer()
  {
    return this.buffer;
  }
  
  public int byteAt(int paramInt)
  {
    return this.buffer[paramInt];
  }
  
  public int capacity()
  {
    return this.buffer.length;
  }
  
  public void clear()
  {
    this.len = 0;
  }
  
  public void ensureCapacity(int paramInt)
  {
    if (paramInt <= 0) {}
    while (paramInt <= this.buffer.length - this.len) {
      return;
    }
    expand(this.len + paramInt);
  }
  
  public int indexOf(byte paramByte)
  {
    return indexOf(paramByte, 0, this.len);
  }
  
  public int indexOf(byte paramByte, int paramInt1, int paramInt2)
  {
    int i = paramInt1;
    if (paramInt1 < 0) {
      i = 0;
    }
    paramInt1 = paramInt2;
    if (paramInt2 > this.len) {
      paramInt1 = this.len;
    }
    if (i > paramInt1) {}
    for (;;)
    {
      return -1;
      while (i < paramInt1)
      {
        if (this.buffer[i] == paramByte) {
          return i;
        }
        i += 1;
      }
    }
  }
  
  public boolean isEmpty()
  {
    return this.len == 0;
  }
  
  public boolean isFull()
  {
    return this.len == this.buffer.length;
  }
  
  public int length()
  {
    return this.len;
  }
  
  public void setLength(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > this.buffer.length)) {
      throw new IndexOutOfBoundsException("len: " + paramInt + " < 0 or > buffer len: " + this.buffer.length);
    }
    this.len = paramInt;
  }
  
  public byte[] toByteArray()
  {
    byte[] arrayOfByte = new byte[this.len];
    if (this.len > 0) {
      System.arraycopy(this.buffer, 0, arrayOfByte, 0, this.len);
    }
    return arrayOfByte;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\util\ByteArrayBuffer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */