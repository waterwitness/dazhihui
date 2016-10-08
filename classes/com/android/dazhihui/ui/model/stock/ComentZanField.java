package com.android.dazhihui.ui.model.stock;

public class ComentZanField
  extends FieldBase
{
  private String mac;
  private String nick;
  private String opid;
  private String position;
  private String price;
  private String stock;
  private String token;
  private String type = "";
  private String user;
  
  public ComentZanField(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    this.type = paramString1;
    this.token = paramString2;
    this.mac = paramString3;
    this.user = paramString4;
    this.opid = paramString5;
  }
  
  public ComentZanField(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    this.type = paramString1;
    this.token = paramString2;
    this.mac = paramString3;
    this.user = paramString4;
    this.opid = paramString5;
    this.nick = paramString6;
  }
  
  public ComentZanField(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9)
  {
    this.type = paramString1;
    this.token = paramString2;
    this.mac = paramString3;
    this.user = paramString4;
    this.opid = paramString5;
    this.nick = paramString6;
    this.stock = paramString7;
    this.position = paramString8;
    this.price = paramString9;
  }
  
  public String getMac()
  {
    return this.mac;
  }
  
  public String getNick()
  {
    return this.nick;
  }
  
  public String getOpid()
  {
    return this.opid;
  }
  
  public String getPosition()
  {
    return this.position;
  }
  
  public String getPrice()
  {
    return this.price;
  }
  
  public String getStock()
  {
    return this.stock;
  }
  
  public String getToken()
  {
    return this.token;
  }
  
  public String getType()
  {
    return this.type;
  }
  
  public String getUser()
  {
    return this.user;
  }
  
  public void setMac(String paramString)
  {
    this.mac = paramString;
  }
  
  public void setNick(String paramString)
  {
    this.nick = paramString;
  }
  
  public void setOpid(String paramString)
  {
    this.opid = paramString;
  }
  
  public void setPosition(String paramString)
  {
    this.position = paramString;
  }
  
  public void setPrice(String paramString)
  {
    this.price = paramString;
  }
  
  public void setStock(String paramString)
  {
    this.stock = paramString;
  }
  
  public void setToken(String paramString)
  {
    this.token = paramString;
  }
  
  public void setType(String paramString)
  {
    this.type = paramString;
  }
  
  public void setUser(String paramString)
  {
    this.user = paramString;
  }
  
  public String toString()
  {
    return "ComentZanField{type='" + this.type + '\'' + ", token='" + this.token + '\'' + ", mac='" + this.mac + '\'' + ", user='" + this.user + '\'' + ", opid='" + this.opid + '\'' + ", nick='" + this.nick + '\'' + ", stock='" + this.stock + '\'' + ", position='" + this.position + '\'' + ", price='" + this.price + '\'' + '}';
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\ComentZanField.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */