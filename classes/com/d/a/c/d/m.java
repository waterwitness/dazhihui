package com.d.a.c.d;

import java.util.zip.Inflater;

class m
  extends Inflater
{
  m(l paraml) {}
  
  public int inflate(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int j = super.inflate(paramArrayOfByte, paramInt1, paramInt2);
    int i = j;
    if (j == 0)
    {
      i = j;
      if (needsDictionary())
      {
        setDictionary(ab.a);
        i = super.inflate(paramArrayOfByte, paramInt1, paramInt2);
      }
    }
    return i;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\d\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */