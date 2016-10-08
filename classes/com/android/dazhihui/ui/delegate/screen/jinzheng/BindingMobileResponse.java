package com.android.dazhihui.ui.delegate.screen.jinzheng;

import org.json.JSONException;
import org.json.JSONObject;

public class BindingMobileResponse
{
  private String Message;
  private String Status;
  private BindingMobileResponse.BizData bizData;
  private String data;
  
  public BindingMobileResponse(String paramString)
  {
    this.data = paramString;
    try
    {
      paramString = new JSONObject(paramString);
      this.Status = paramString.getString("Status");
      this.Message = paramString.getString("Message");
      paramString = paramString.getJSONObject("BizData");
      paramString.getString("Mobile");
      paramString.getString("UserName");
      return;
    }
    catch (JSONException paramString)
    {
      paramString.printStackTrace();
    }
  }
  
  public BindingMobileResponse.BizData getBizData()
  {
    return this.bizData;
  }
  
  public String getData()
  {
    return this.data;
  }
  
  public String getMessage()
  {
    return this.Message;
  }
  
  public String getStatus()
  {
    return this.Status;
  }
  
  public void setBizData(BindingMobileResponse.BizData paramBizData)
  {
    this.bizData = paramBizData;
  }
  
  public void setData(String paramString)
  {
    this.data = paramString;
  }
  
  public void setMessage(String paramString)
  {
    this.Message = paramString;
  }
  
  public void setStatus(String paramString)
  {
    this.Status = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\jinzheng\BindingMobileResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */