package com.android.dazhihui.ui.model.stock;

public class CommentBodyField
  extends FieldBase
{
  private String content = "0";
  private String mac = "";
  private String nick = "";
  private String opid = "";
  private String rpid = "";
  private String stock;
  private String title;
  private String token;
  private String type = "";
  private String user = "";
  
  public CommentBodyField(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    this.type = String.valueOf(paramInt);
    this.mac = paramString1;
    this.user = paramString2;
    this.nick = paramString3;
    this.opid = paramString4;
    this.content = paramString5;
  }
  
  public CommentBodyField(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    this.type = String.valueOf(paramInt);
    this.mac = paramString1;
    this.user = paramString2;
    this.nick = paramString3;
    this.opid = paramString4;
    this.rpid = paramString5;
    this.content = paramString6;
  }
  
  public CommentBodyField(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8)
  {
    this.type = paramString1;
    this.mac = paramString2;
    this.user = paramString3;
    this.nick = paramString4;
    this.opid = paramString5;
    this.content = paramString6;
    this.token = paramString7;
    this.stock = paramString8;
  }
  
  public CommentBodyField(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9)
  {
    this.type = paramString1;
    this.mac = paramString2;
    this.user = paramString3;
    this.nick = paramString4;
    this.opid = paramString5;
    this.content = paramString6;
    this.token = paramString7;
    this.stock = paramString8;
    this.title = paramString9;
  }
  
  public String getContent()
  {
    return this.content;
  }
  
  public String getMac()
  {
    return this.mac;
  }
  
  public String getOpid()
  {
    return this.opid;
  }
  
  public String getType()
  {
    return this.type;
  }
  
  public String getUser()
  {
    return this.user;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\CommentBodyField.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */