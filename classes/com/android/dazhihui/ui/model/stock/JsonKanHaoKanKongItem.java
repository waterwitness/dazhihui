package com.android.dazhihui.ui.model.stock;

public class JsonKanHaoKanKongItem
{
  private String lp = "0";
  private String sp = "0";
  private String stock = "";
  
  public String getLp()
  {
    return this.lp;
  }
  
  public String getSp()
  {
    return this.sp;
  }
  
  public String getStock()
  {
    return this.stock;
  }
  
  public void setLp(String paramString)
  {
    this.lp = paramString;
  }
  
  public void setSp(String paramString)
  {
    this.sp = paramString;
  }
  
  public void setStock(String paramString)
  {
    this.stock = paramString;
  }
  
  public String toString()
  {
    return "JsonKanHaoKanKongItem{stock='" + this.stock + '\'' + ", lp='" + this.lp + '\'' + ", sp='" + this.sp + '\'' + '}';
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\JsonKanHaoKanKongItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */