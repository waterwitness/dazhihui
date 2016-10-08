package com.android.dazhihui.ui.delegate.screen.jinzheng;

import org.json.JSONException;
import org.json.JSONObject;

public class BindingMobileRequest
{
  private String Channel;
  private String MarketCode;
  private String Mobile;
  private String SourceNo;
  private String UserName;
  private String tradeName;
  
  public String BindingMoileJson()
  {
    JSONObject localJSONObject1 = new JSONObject();
    JSONObject localJSONObject2 = new JSONObject();
    try
    {
      localJSONObject1.put("SourceNo", "5");
      localJSONObject1.put("MarketCode", "3754");
      localJSONObject2.put("tradeName", getTradeName());
      localJSONObject1.put("Remark", localJSONObject2);
      localJSONObject1.put("UserName", "dzh-crp-sms");
      localJSONObject1.put("Mobile", getMobile());
      localJSONObject1.put("Channel", "Web");
      return localJSONObject1.toString();
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        localJSONException.printStackTrace();
      }
    }
  }
  
  public String getChannel()
  {
    return this.Channel;
  }
  
  public String getMarketCode()
  {
    return this.MarketCode;
  }
  
  public String getMobile()
  {
    return this.Mobile;
  }
  
  public String getSourceNo()
  {
    return this.SourceNo;
  }
  
  public String getTradeName()
  {
    return this.tradeName;
  }
  
  public String getUserName()
  {
    return this.UserName;
  }
  
  public void setChannel(String paramString)
  {
    this.Channel = paramString;
  }
  
  public void setMarketCode(String paramString)
  {
    this.MarketCode = paramString;
  }
  
  public void setMobile(String paramString)
  {
    this.Mobile = paramString;
  }
  
  public void setSourceNo(String paramString)
  {
    this.SourceNo = paramString;
  }
  
  public void setTradeName(String paramString)
  {
    this.tradeName = paramString;
  }
  
  public void setUserName(String paramString)
  {
    this.UserName = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\jinzheng\BindingMobileRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */