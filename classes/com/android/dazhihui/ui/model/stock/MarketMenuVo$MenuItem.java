package com.android.dazhihui.ui.model.stock;

public class MarketMenuVo$MenuItem
{
  public int countid;
  public int id;
  public String menuflag;
  public String name;
  public String type;
  public String urlPath;
  
  public MarketMenuVo$MenuItem(MarketMenuVo paramMarketMenuVo) {}
  
  public int getCountid()
  {
    return this.countid;
  }
  
  public int getId()
  {
    return this.id;
  }
  
  public String getMenuflag()
  {
    return this.menuflag;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public String getType()
  {
    return this.type;
  }
  
  public String getUrlPath()
  {
    return this.urlPath;
  }
  
  public void setCountid(int paramInt)
  {
    this.countid = paramInt;
  }
  
  public void setId(int paramInt)
  {
    this.id = paramInt;
  }
  
  public void setMenuflag(String paramString)
  {
    this.menuflag = paramString;
  }
  
  public void setName(String paramString)
  {
    this.name = paramString;
  }
  
  public void setType(String paramString)
  {
    this.type = paramString;
  }
  
  public void setUrlPath(String paramString)
  {
    this.urlPath = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[id=" + this.id + ";name=" + this.name + ";urlPath=" + this.urlPath + ";countid=" + this.countid + ";menuflag=" + this.menuflag + ";type=" + this.type + "]");
    return localStringBuilder.toString();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\MarketMenuVo$MenuItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */