package com.android.dazhihui.ui.model.stock;

public class ComentHideField
  extends FieldBase
{
  private String opid = "";
  private String page = "1";
  private String type = "";
  
  public ComentHideField(int paramInt, String paramString)
  {
    this.type = String.valueOf(paramInt);
    this.opid = paramString;
  }
  
  public ComentHideField(int paramInt, String paramString1, String paramString2)
  {
    this.type = String.valueOf(paramInt);
    this.opid = paramString1;
    this.page = paramString2;
  }
  
  public String getType()
  {
    return this.type;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\ComentHideField.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */