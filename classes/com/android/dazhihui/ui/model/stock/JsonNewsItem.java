package com.android.dazhihui.ui.model.stock;

public class JsonNewsItem
{
  private String advTypeShare = "";
  private String id = "";
  private String img = "";
  private boolean isShow = false;
  private String otime = "";
  private String resType;
  private String source = "";
  private String stockcode = "";
  private String stockname = "";
  private String summary = "";
  private String title = "";
  private String type = "";
  private String url = "";
  
  public String getAdvTypeShare()
  {
    return this.advTypeShare;
  }
  
  public String getId()
  {
    return this.id;
  }
  
  public String getImg()
  {
    return this.img;
  }
  
  public String getOtime()
  {
    return this.otime;
  }
  
  public String getResType()
  {
    return this.resType;
  }
  
  public String getSource()
  {
    return this.source;
  }
  
  public String getStockcode()
  {
    return this.stockcode;
  }
  
  public String getStockname()
  {
    return this.stockname;
  }
  
  public String getSummary()
  {
    return this.summary;
  }
  
  public String getTitle()
  {
    return this.title;
  }
  
  public String getType()
  {
    return this.type;
  }
  
  public String getUrl()
  {
    this.isShow = true;
    return this.url;
  }
  
  public void setAdvTypeShare(String paramString)
  {
    this.advTypeShare = paramString;
  }
  
  public void setResType(String paramString)
  {
    this.resType = paramString;
  }
  
  public void setTitle(String paramString)
  {
    this.title = paramString;
  }
  
  public String toString()
  {
    return "id" + this.id + " |　" + "summary" + this.summary + " | title" + this.title + " |otime:" + this.otime + " |source:" + this.source + " |img:" + this.img + " |url:" + this.url + "\n";
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\JsonNewsItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */