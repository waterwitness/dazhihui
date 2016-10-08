package com.android.dazhihui.ui.model.stock;

public class UpDownItem
{
  private String mCode = null;
  private String mName = null;
  private String mRate = null;
  private int mType;
  
  public UpDownItem() {}
  
  public UpDownItem(String paramString1, String paramString2, String paramString3)
  {
    this.mCode = paramString1;
    this.mName = paramString2;
    this.mRate = paramString3;
  }
  
  public String getCode()
  {
    return this.mCode;
  }
  
  public String getName()
  {
    return this.mName;
  }
  
  public String getRate()
  {
    return this.mRate;
  }
  
  public int getType()
  {
    return this.mType;
  }
  
  public void setCode(String paramString)
  {
    this.mCode = paramString;
  }
  
  public void setName(String paramString)
  {
    this.mName = paramString;
  }
  
  public void setRate(String paramString)
  {
    this.mRate = paramString;
  }
  
  public void setType(int paramInt)
  {
    this.mType = paramInt;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\UpDownItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */