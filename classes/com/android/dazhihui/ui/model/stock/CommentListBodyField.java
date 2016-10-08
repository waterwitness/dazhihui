package com.android.dazhihui.ui.model.stock;

public class CommentListBodyField
  extends FieldBase
{
  private String opid = "";
  private String page = "0";
  private String type = "";
  
  public CommentListBodyField(int paramInt1, String paramString, int paramInt2)
  {
    this.type = String.valueOf(paramInt1);
    this.opid = paramString;
    this.page = String.valueOf(paramInt2);
  }
  
  public String getType()
  {
    return this.type;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\CommentListBodyField.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */