package com.android.dazhihui.ui.model.stock;

public class JsonHeader
{
  private String error;
  private String key;
  private String msg;
  private String next;
  private String prev;
  private String service;
  private String subtype;
  private String type;
  
  public String getError()
  {
    return this.error;
  }
  
  public String getKey()
  {
    return this.key;
  }
  
  public String getMsg()
  {
    return this.msg;
  }
  
  public String getNext()
  {
    return this.next;
  }
  
  public String getPrev()
  {
    return this.prev;
  }
  
  public String getService()
  {
    return this.service;
  }
  
  public String getSubtype()
  {
    return this.subtype;
  }
  
  public String getType()
  {
    return this.type;
  }
  
  public String toString()
  {
    return "type:" + this.type + " | error:" + this.error + " prev:" + this.prev + " |next:" + this.next;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\JsonHeader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */