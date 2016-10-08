package com.android.dazhihui.ui.model.stock;

public class BodyField
  extends FieldBase
{
  private String key = "";
  private String mac = "";
  private String opid = "";
  private String page = "0";
  private String stock = "";
  private String stocks = "";
  private String subtype = "";
  private String token = "";
  private String type = "";
  private String user = "";
  
  public BodyField(int paramInt1, int paramInt2, String paramString)
  {
    this.type = String.valueOf(paramInt1);
    this.page = String.valueOf(paramInt2);
    this.stocks = paramString;
  }
  
  public BodyField(int paramInt1, int paramInt2, String paramString, int paramInt3)
  {
    this.type = String.valueOf(paramInt1);
    this.subtype = String.valueOf(paramInt2);
    this.token = paramString;
    this.page = String.valueOf(paramInt3);
  }
  
  public BodyField(int paramInt1, int paramInt2, String paramString, boolean paramBoolean)
  {
    this.type = String.valueOf(paramInt1);
    this.page = String.valueOf(paramInt2);
    this.stock = paramString;
  }
  
  public BodyField(int paramInt, String paramString)
  {
    this.type = String.valueOf(paramInt);
    this.page = String.valueOf(this.page);
    this.stock = paramString;
  }
  
  public BodyField(int paramInt1, String paramString, int paramInt2)
  {
    this.type = String.valueOf(paramInt1);
    this.opid = paramString;
    this.page = String.valueOf(paramInt2);
  }
  
  public BodyField(int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    this.type = String.valueOf(paramInt1);
    this.mac = paramString1;
    this.user = paramString2;
    this.page = String.valueOf(paramInt2);
  }
  
  public BodyField(int paramInt1, String paramString1, String paramString2, int paramInt2, String paramString3)
  {
    this.type = String.valueOf(paramInt1);
    this.mac = paramString1;
    this.user = paramString2;
    this.page = String.valueOf(paramInt2);
    this.stocks = paramString3;
  }
  
  public BodyField(String paramString)
  {
    this.key = paramString;
  }
  
  public String getToken()
  {
    return this.token;
  }
  
  public String getType()
  {
    return this.type;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\BodyField.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */