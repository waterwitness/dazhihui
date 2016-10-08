package com.android.dazhihui.ui.model.stock;

import java.io.Serializable;
import java.util.List;

public class JsonPLItem
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  public JsonPLItem.Attr attr;
  private String authorlink = "";
  private String authortype = "";
  private String avatar = "";
  private String calltype = "";
  private String callurl = "";
  private String cap = "";
  private String content = "";
  private String floor = "";
  private String good = "";
  private String id = "";
  private String ip = "";
  private Boolean isAdv = Boolean.valueOf(false);
  private String mac = "";
  private String otime = "";
  private List<JsonPLItem.UtilsItem> remarks;
  private String reply = "";
  private String stockcode = "";
  private String stockname = "";
  private String title = "";
  private String view = "";
  
  public JsonPLItem() {}
  
  public JsonPLItem(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, String paramString11, String paramString12, String paramString13)
  {
    this.id = paramString1;
    this.ip = paramString2;
    this.cap = paramString3;
    this.title = paramString4;
    this.content = paramString5;
    this.otime = paramString6;
    this.good = paramString7;
    this.reply = paramString8;
    this.view = paramString9;
    this.calltype = paramString10;
    this.callurl = paramString11;
    this.authortype = paramString12;
    this.authorlink = paramString13;
  }
  
  public JsonPLItem(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, List<JsonPLItem.UtilsItem> paramList)
  {
    this.id = paramString1;
    this.ip = paramString2;
    this.cap = paramString3;
    this.content = paramString4;
    this.otime = paramString5;
    this.good = paramString6;
    this.mac = paramString7;
    this.floor = paramString8;
    this.remarks = paramList;
  }
  
  public JsonPLItem(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, List<JsonPLItem.UtilsItem> paramList)
  {
    this.id = paramString1;
    this.ip = paramString2;
    this.content = paramString3;
    this.otime = paramString4;
    this.good = paramString5;
    this.mac = paramString6;
    this.floor = paramString7;
    this.remarks = paramList;
  }
  
  public String getAuthorlink()
  {
    return this.authorlink;
  }
  
  public String getAuthortype()
  {
    return this.authortype;
  }
  
  public String getAvatar()
  {
    return this.avatar;
  }
  
  public String getCalltype()
  {
    return this.calltype;
  }
  
  public String getCallurl()
  {
    return this.callurl;
  }
  
  public String getCap()
  {
    return this.cap;
  }
  
  public String getContent()
  {
    return this.content;
  }
  
  public String getFloor()
  {
    return this.floor;
  }
  
  public String getGood()
  {
    return this.good;
  }
  
  public String getId()
  {
    return this.id;
  }
  
  public String getIp()
  {
    return this.ip;
  }
  
  public Boolean getIsAdv()
  {
    return this.isAdv;
  }
  
  public String getMac()
  {
    return this.mac;
  }
  
  public String getOtime()
  {
    return this.otime;
  }
  
  public List<JsonPLItem.UtilsItem> getRemarks()
  {
    return this.remarks;
  }
  
  public String getReply()
  {
    return this.reply;
  }
  
  public String getStockcode()
  {
    return this.stockcode;
  }
  
  public String getStockname()
  {
    return this.stockname;
  }
  
  public String getTitle()
  {
    return this.title;
  }
  
  public String getView()
  {
    return this.view;
  }
  
  public void setAuthorlink(String paramString)
  {
    this.authorlink = paramString;
  }
  
  public void setAuthortype(String paramString)
  {
    this.authortype = paramString;
  }
  
  public void setAvatar(String paramString)
  {
    this.avatar = paramString;
  }
  
  public void setCalltype(String paramString)
  {
    this.calltype = paramString;
  }
  
  public void setCallurl(String paramString)
  {
    this.callurl = paramString;
  }
  
  public void setCap(String paramString)
  {
    this.cap = paramString;
  }
  
  public void setContent(String paramString)
  {
    this.content = paramString;
  }
  
  public void setFloor(String paramString)
  {
    this.floor = paramString;
  }
  
  public void setGood(String paramString)
  {
    this.good = paramString;
  }
  
  public void setId(String paramString)
  {
    this.id = paramString;
  }
  
  public void setIp(String paramString)
  {
    this.ip = paramString;
  }
  
  public void setIsAdv(Boolean paramBoolean)
  {
    this.isAdv = paramBoolean;
  }
  
  public void setMac(String paramString)
  {
    this.mac = paramString;
  }
  
  public void setOtime(String paramString)
  {
    this.otime = paramString;
  }
  
  public void setRemarks(List<JsonPLItem.UtilsItem> paramList)
  {
    this.remarks = paramList;
  }
  
  public void setReply(String paramString)
  {
    this.reply = paramString;
  }
  
  public void setStockcode(String paramString)
  {
    this.stockcode = paramString;
  }
  
  public void setStockname(String paramString)
  {
    this.stockname = paramString;
  }
  
  public void setTitle(String paramString)
  {
    this.title = paramString;
  }
  
  public void setView(String paramString)
  {
    this.view = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\JsonPLItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */