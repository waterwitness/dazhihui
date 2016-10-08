package com.bairuitech.anychat;

public class AnyChatOutParam
{
  private byte[] byteArray;
  private double fValue = 0.0D;
  private int iValue = 0;
  private int[] intArray;
  private String szValue = "";
  
  public byte[] GetByteArray()
  {
    return this.byteArray;
  }
  
  public double GetFloatValue()
  {
    return this.fValue;
  }
  
  public int[] GetIntArray()
  {
    return this.intArray;
  }
  
  public int GetIntValue()
  {
    return this.iValue;
  }
  
  public String GetStrValue()
  {
    return this.szValue;
  }
  
  public void SetByteArray(byte[] paramArrayOfByte)
  {
    this.byteArray = paramArrayOfByte;
  }
  
  public void SetFloatValue(double paramDouble)
  {
    this.fValue = paramDouble;
  }
  
  public void SetIntArray(int[] paramArrayOfInt)
  {
    this.intArray = paramArrayOfInt;
  }
  
  public void SetIntValue(int paramInt)
  {
    this.iValue = paramInt;
  }
  
  public void SetStrValue(String paramString)
  {
    this.szValue = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\bairuitech\anychat\AnyChatOutParam.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */