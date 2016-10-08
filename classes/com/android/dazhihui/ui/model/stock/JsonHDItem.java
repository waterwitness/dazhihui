package com.android.dazhihui.ui.model.stock;

import java.io.Serializable;

public class JsonHDItem
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  private String browsec = "";
  private String good = "";
  private String id = "";
  private String img = "";
  private String ip = "";
  private String istop = "";
  private String mac = "";
  private String otime = "";
  private String ptype = "";
  private String recoverc = "";
  private String source = "";
  private String summary = "";
  private String title = "";
  private String type = "";
  private String udtype = "";
  private String url = "";
  
  public String getBrowsec()
  {
    return this.browsec;
  }
  
  public String getGood()
  {
    return this.good;
  }
  
  public String getId()
  {
    return this.id;
  }
  
  public String getImg()
  {
    return this.img;
  }
  
  public String getIp()
  {
    return this.ip;
  }
  
  public String getIstop()
  {
    return this.istop;
  }
  
  public String getMac()
  {
    return this.mac;
  }
  
  public String getOtime()
  {
    return this.otime;
  }
  
  public String getPtype()
  {
    return this.ptype;
  }
  
  public String getRecoverc()
  {
    return this.recoverc;
  }
  
  public String getSource()
  {
    return this.source;
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
  
  public String getUdType()
  {
    return this.udtype;
  }
  
  public String getUrl()
  {
    return this.url;
  }
  
  public void setBrowsec(String paramString)
  {
    this.browsec = paramString;
  }
  
  public void setGood(String paramString)
  {
    this.good = paramString;
  }
  
  public void setId(String paramString)
  {
    this.id = paramString;
  }
  
  public void setImg(String paramString)
  {
    this.img = paramString;
  }
  
  public void setIp(String paramString)
  {
    this.ip = paramString;
  }
  
  public void setOtime(String paramString)
  {
    this.otime = paramString;
  }
  
  public void setRecoverc(String paramString)
  {
    this.recoverc = paramString;
  }
  
  public void setSource(String paramString)
  {
    this.source = paramString;
  }
  
  public void setSummary(String paramString)
  {
    this.summary = paramString;
  }
  
  public void setTitle(String paramString)
  {
    this.title = paramString;
  }
  
  public void setType(String paramString)
  {
    this.type = paramString;
  }
  
  public void setUrl(String paramString)
  {
    this.url = paramString;
  }
  
  public String toString()
  {
    return "id" + this.id + " |　" + "ip" + this.ip + " |　" + "summary" + this.summary + " | title" + this.title + " |otime:" + this.otime + " |source:" + this.source + " |img:" + this.img + " |url:" + this.url + "\n";
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\JsonHDItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */