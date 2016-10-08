package com.android.dazhihui.ui.model.stock;

public class DZLHItem
{
  private String sszt;
  private String stockcode;
  private String stockname;
  
  public DZLHItem(String paramString1, String paramString2, String paramString3)
  {
    this.stockcode = paramString1;
    this.stockname = paramString2;
    this.sszt = paramString3;
  }
  
  public String getSszt()
  {
    return this.sszt;
  }
  
  public String getStockcode()
  {
    return this.stockcode;
  }
  
  public String getStockname()
  {
    return this.stockname;
  }
  
  public void setSszt(String paramString)
  {
    this.sszt = paramString;
  }
  
  public void setStockcode(String paramString)
  {
    this.stockcode = paramString;
  }
  
  public void setStockname(String paramString)
  {
    this.stockname = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\DZLHItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */