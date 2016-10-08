package com.android.dazhihui.ui.model.stock;

import com.android.dazhihui.g;

public class HeaderField
  extends FieldBase
{
  private String apiVersion = "1.0";
  private String channelNum = "";
  private String client = "2";
  private String clientVersion = "";
  private String service = "";
  
  public HeaderField(int paramInt)
  {
    this.service = String.valueOf(paramInt);
  }
  
  public HeaderField(int paramInt, String paramString)
  {
    this.service = String.valueOf(paramInt);
    this.channelNum = paramString;
    this.clientVersion = g.a().r();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\HeaderField.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */