package com.android.dazhihui.ui.model.stock;

public class ContributeItem
{
  private String mCode = null;
  private String mName = null;
  private String mPoint = null;
  private String mRise = null;
  
  public ContributeItem() {}
  
  public ContributeItem(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.mCode = paramString1;
    this.mName = paramString2;
    this.mRise = paramString3;
    this.mPoint = paramString4;
  }
  
  public String getCode()
  {
    return this.mCode;
  }
  
  public String getName()
  {
    return this.mName;
  }
  
  public String getPoint()
  {
    return this.mPoint;
  }
  
  public String getRise()
  {
    return this.mRise;
  }
  
  public void setCode(String paramString)
  {
    this.mCode = paramString;
  }
  
  public void setName(String paramString)
  {
    this.mName = paramString;
  }
  
  public void setPoint(String paramString)
  {
    this.mPoint = paramString;
  }
  
  public void setRise(String paramString)
  {
    this.mRise = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\ContributeItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */