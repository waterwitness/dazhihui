package org.apache.http.util;

import java.io.Serializable;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.protocol.HTTP;

@NotThreadSafe
public final class CharArrayBuffer
  implements Serializable
{
  private static final long serialVersionUID = -6208952725094867135L;
  private char[] buffer;
  private int len;
  
  public CharArrayBuffer(int paramInt)
  {
    Args.notNegative(paramInt, "Buffer capacity");
    this.buffer = new char[paramInt];
  }
  
  private void expand(int paramInt)
  {
    char[] arrayOfChar = new char[Math.max(this.buffer.length << 1, paramInt)];
    System.arraycopy(this.buffer, 0, arrayOfChar, 0, this.len);
    this.buffer = arrayOfChar;
  }
  
  public void append(char paramChar)
  {
    int i = this.len + 1;
    if (i > this.buffer.length) {
      expand(i);
    }
    this.buffer[this.len] = paramChar;
    this.len = i;
  }
  
  public void append(Object paramObject)
  {
    append(String.valueOf(paramObject));
  }
  
  public void append(String paramString)
  {
    if (paramString != null) {}
    for (;;)
    {
      int i = paramString.length();
      int j = this.len + i;
      if (j > this.buffer.length) {
        expand(j);
      }
      paramString.getChars(0, i, this.buffer, this.len);
      this.len = j;
      return;
      paramString = "null";
    }
  }
  
  public void append(ByteArrayBuffer paramByteArrayBuffer, int paramInt1, int paramInt2)
  {
    if (paramByteArrayBuffer == null) {
      return;
    }
    append(paramByteArrayBuffer.buffer(), paramInt1, paramInt2);
  }
  
  public void append(CharArrayBuffer paramCharArrayBuffer)
  {
    if (paramCharArrayBuffer == null) {
      return;
    }
    append(paramCharArrayBuffer.buffer, 0, paramCharArrayBuffer.len);
  }
  
  public void append(CharArrayBuffer paramCharArrayBuffer, int paramInt1, int paramInt2)
  {
    if (paramCharArrayBuffer == null) {
      return;
    }
    append(paramCharArrayBuffer.buffer, paramInt1, paramInt2);
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
      this.buffer[paramInt2] = ((char)(paramArrayOfByte[i] & 0xFF));
      i += 1;
      paramInt2 += 1;
    }
    this.len = k;
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
    int i = this.len + paramInt2;
    if (i > this.buffer.length) {
      expand(i);
    }
    System.arraycopy(paramArrayOfChar, paramInt1, this.buffer, this.len, paramInt2);
    this.len = i;
  }
  
  public char[] buffer()
  {
    return this.buffer;
  }
  
  public int capacity()
  {
    return this.buffer.length;
  }
  
  public char charAt(int paramInt)
  {
    return this.buffer[paramInt];
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
  
  public int indexOf(int paramInt)
  {
    return indexOf(paramInt, 0, this.len);
  }
  
  public int indexOf(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramInt2;
    if (paramInt2 < 0) {
      i = 0;
    }
    paramInt2 = paramInt3;
    if (paramInt3 > this.len) {
      paramInt2 = this.len;
    }
    if (i > paramInt2) {}
    for (;;)
    {
      return -1;
      while (i < paramInt2)
      {
        if (this.buffer[i] == paramInt1) {
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
  
  public String substring(int paramInt1, int paramInt2)
  {
    return new String(this.buffer, paramInt1, paramInt2 - paramInt1);
  }
  
  public String substringTrimmed(int paramInt1, int paramInt2)
  {
    if (paramInt1 < 0) {
      throw new IndexOutOfBoundsException("Negative beginIndex: " + paramInt1);
    }
    if (paramInt2 > this.len) {
      throw new IndexOutOfBoundsException("endIndex: " + paramInt2 + " > length: " + this.len);
    }
    int i = paramInt1;
    if (paramInt1 > paramInt2) {
      throw new IndexOutOfBoundsException("beginIndex: " + paramInt1 + " > endIndex: " + paramInt2);
    }
    for (;;)
    {
      paramInt1 = paramInt2;
      if (i >= paramInt2) {
        break;
      }
      paramInt1 = paramInt2;
      if (!HTTP.isWhitespace(this.buffer[i])) {
        break;
      }
      i += 1;
    }
    while ((paramInt1 > i) && (HTTP.isWhitespace(this.buffer[(paramInt1 - 1)]))) {
      paramInt1 -= 1;
    }
    return new String(this.buffer, i, paramInt1 - i);
  }
  
  public char[] toCharArray()
  {
    char[] arrayOfChar = new char[this.len];
    if (this.len > 0) {
      System.arraycopy(this.buffer, 0, arrayOfChar, 0, this.len);
    }
    return arrayOfChar;
  }
  
  public String toString()
  {
    return new String(this.buffer, 0, this.len);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\util\CharArrayBuffer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */