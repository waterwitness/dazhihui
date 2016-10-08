package com.android.dazhihui.ui.delegate.b;

import java.util.Vector;

public class m
{
  private int a;
  private byte[] b;
  
  private m() {}
  
  public m(int paramInt, byte[] paramArrayOfByte)
  {
    this.a = paramInt;
    this.b = paramArrayOfByte;
  }
  
  public static m[] a(byte[] paramArrayOfByte)
  {
    new g(paramArrayOfByte);
    Vector localVector = new Vector(1);
    m localm = new m();
    localm.b = paramArrayOfByte;
    localVector.addElement(localm);
    paramArrayOfByte = new m[localVector.size()];
    int i = 0;
    while (i < paramArrayOfByte.length)
    {
      paramArrayOfByte[i] = ((m)localVector.elementAt(i));
      i += 1;
    }
    return paramArrayOfByte;
  }
  
  public int a()
  {
    return this.a;
  }
  
  public byte[] b()
  {
    return this.b;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\b\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */