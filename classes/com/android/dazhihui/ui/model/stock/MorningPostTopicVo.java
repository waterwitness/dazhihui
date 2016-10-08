package com.android.dazhihui.ui.model.stock;

import org.json.JSONObject;

public class MorningPostTopicVo
{
  private String date;
  private String id;
  private String scode;
  private String sname;
  private String summary;
  private String time;
  
  public void decode(String paramString)
  {
    if ((paramString != null) && (paramString.length() > 2)) {}
    try
    {
      decode(new JSONObject(paramString));
      return;
    }
    catch (Exception paramString) {}
  }
  
  public void decode(JSONObject paramJSONObject)
  {
    if (paramJSONObject == null) {
      return;
    }
    try
    {
      this.scode = paramJSONObject.getString("scode");
      this.sname = paramJSONObject.getString("sname");
      this.summary = paramJSONObject.getString("summary");
      this.time = paramJSONObject.getString("otime");
      this.date = paramJSONObject.optString("odate");
      this.id = paramJSONObject.optString("id");
      if (this.id != null)
      {
        this.id = this.id.trim();
        return;
      }
      this.id = paramJSONObject.optString("countid");
      return;
    }
    catch (Exception paramJSONObject) {}
  }
  
  public String getFormatTimeString()
  {
    return this.date + " " + this.time;
  }
  
  public String getId()
  {
    return this.id;
  }
  
  public String getScode()
  {
    return this.scode;
  }
  
  public String getSname()
  {
    return this.sname;
  }
  
  public String getSummary()
  {
    return this.summary;
  }
  
  public String getTime()
  {
    if (this.time.length() > 5)
    {
      String str2 = this.time.substring(5);
      String str1 = str2;
      if (str2.length() > 11) {
        str1 = str2.substring(0, 11);
      }
      return str1;
    }
    return this.time;
  }
  
  public void setDate(String paramString)
  {
    this.date = paramString;
  }
  
  public void setId(String paramString)
  {
    this.id = paramString;
  }
  
  public void setScode(String paramString)
  {
    this.scode = paramString;
  }
  
  public void setSname(String paramString)
  {
    this.sname = paramString;
  }
  
  public void setSummary(String paramString)
  {
    this.summary = paramString;
  }
  
  public void setTime(String paramString)
  {
    this.time = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\MorningPostTopicVo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */