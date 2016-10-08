package org.a.e;

public final class a
{
  public static int a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
    {
      j = 0;
      return j;
    }
    int j = paramArrayOfByte.length;
    int i = j + 1;
    for (;;)
    {
      int k = j - 1;
      j = i;
      if (k < 0) {
        break;
      }
      i = i * 257 ^ paramArrayOfByte[k];
      j = k;
    }
  }
  
  public static boolean a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    boolean bool2 = false;
    boolean bool1;
    if (paramArrayOfByte1 == paramArrayOfByte2) {
      bool1 = true;
    }
    do
    {
      do
      {
        do
        {
          return bool1;
          bool1 = bool2;
        } while (paramArrayOfByte1 == null);
        bool1 = bool2;
      } while (paramArrayOfByte2 == null);
      bool1 = bool2;
    } while (paramArrayOfByte1.length != paramArrayOfByte2.length);
    int i = 0;
    for (;;)
    {
      if (i == paramArrayOfByte1.length) {
        break label63;
      }
      bool1 = bool2;
      if (paramArrayOfByte1[i] != paramArrayOfByte2[i]) {
        break;
      }
      i += 1;
    }
    label63:
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\e\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */