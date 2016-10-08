package org.a.a.k;

import org.a.a.bd;
import org.a.a.be;
import org.a.e.b;

public abstract class i
{
  protected bd a(String paramString, int paramInt)
  {
    paramString = b.c(paramString);
    byte[] arrayOfByte = new byte[(paramString.length() - paramInt) / 2];
    int i = 0;
    if (i != arrayOfByte.length)
    {
      int j = paramString.charAt(i * 2 + paramInt);
      int k = paramString.charAt(i * 2 + paramInt + 1);
      if (j < 97)
      {
        arrayOfByte[i] = ((byte)(j - 48 << 4));
        label71:
        if (k >= 97) {
          break label121;
        }
        arrayOfByte[i] = ((byte)(arrayOfByte[i] | (byte)(k - 48)));
      }
      for (;;)
      {
        i += 1;
        break;
        arrayOfByte[i] = ((byte)(j - 97 + 10 << 4));
        break label71;
        label121:
        arrayOfByte[i] = ((byte)(arrayOfByte[i] | (byte)(k - 97 + 10)));
      }
    }
    return new org.a.a.i(arrayOfByte).c();
  }
  
  public abstract bd a(be parambe, String paramString);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\k\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */