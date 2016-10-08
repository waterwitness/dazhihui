package com.android.dazhihui.ui.model.stock;

public class JsonCommentItem
{
  private String content = "";
  private String ctime = "";
  private String id = "";
  private String ip = "";
  private String mac = "";
  private String ptype = "";
  private String reip = "";
  private String remac = "";
  private String title = "";
  private String udtype = "";
  
  public String getContent()
  {
    return this.content;
  }
  
  public String getCtime()
  {
    return this.ctime.substring(0, this.ctime.lastIndexOf(":"));
  }
  
  public String getId()
  {
    return this.id;
  }
  
  public String getIp()
  {
    return this.ip;
  }
  
  public String getPtype()
  {
    return this.ptype;
  }
  
  public String getReip()
  {
    return this.reip;
  }
  
  public String getTitle()
  {
    return this.title;
  }
  
  public void setContent(String paramString)
  {
    this.content = paramString;
  }
  
  public void setCtime(String paramString)
  {
    this.ctime = paramString;
  }
  
  public void setId(String paramString)
  {
    this.id = paramString;
  }
  
  public void setIp(String paramString)
  {
    this.ip = paramString;
  }
  
  public void setTitle(String paramString)
  {
    this.title = paramString;
  }
  
  public String toString()
  {
    return "id" + this.id + " |　" + "ip" + this.ip;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\JsonCommentItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */