package com.android.dazhihui.ui.model.stock;

public class LargeTradeElem
{
  private String mNum;
  private String mTime;
  private int mType;
  
  public LargeTradeElem() {}
  
  public LargeTradeElem(String paramString1, String paramString2, int paramInt)
  {
    this.mTime = paramString1;
    this.mNum = paramString2;
    this.mType = paramInt;
  }
  
  public String getNum()
  {
    return this.mNum;
  }
  
  public String getTime()
  {
    return this.mTime;
  }
  
  public int getType()
  {
    return this.mType;
  }
  
  public void setNum(String paramString)
  {
    this.mNum = paramString;
  }
  
  public void setTime(String paramString)
  {
    this.mTime = paramString;
  }
  
  public void setType(int paramInt)
  {
    this.mType = paramInt;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\LargeTradeElem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */