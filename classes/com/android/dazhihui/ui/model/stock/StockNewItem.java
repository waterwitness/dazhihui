package com.android.dazhihui.ui.model.stock;

import org.json.JSONObject;

public class StockNewItem
{
  private String advTypeShare;
  private String mId;
  private String mImg;
  private String mOtime;
  private String mSource;
  private String mSummary;
  private String mTitle;
  private int mType;
  private String mUrl;
  
  public StockNewItem() {}
  
  public StockNewItem(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8)
  {
    this.mType = paramInt;
    this.mId = paramString1;
    this.mSummary = paramString2;
    this.mTitle = paramString3;
    this.mOtime = paramString4;
    this.mSource = paramString5;
    this.mImg = paramString6;
    this.mUrl = paramString7;
    this.advTypeShare = paramString8;
  }
  
  public void decodeFromJSON(JSONObject paramJSONObject)
  {
    this.mType = paramJSONObject.optInt("type");
    this.mId = paramJSONObject.optString("id");
    this.mSummary = paramJSONObject.optString("summary");
    this.mTitle = paramJSONObject.optString("title");
    this.mOtime = paramJSONObject.optString("otime");
    this.mSource = paramJSONObject.optString("source");
    this.mImg = paramJSONObject.optString("img");
    this.mUrl = paramJSONObject.optString("url");
    this.advTypeShare = paramJSONObject.optString("advTypeShare");
  }
  
  public String getAdvTypeShare()
  {
    return this.advTypeShare;
  }
  
  public String getId()
  {
    return this.mId;
  }
  
  public String getImg()
  {
    return this.mImg;
  }
  
  public String getOtime()
  {
    return this.mOtime;
  }
  
  public String getSource()
  {
    return this.mSource;
  }
  
  public String getSummary()
  {
    return this.mSummary;
  }
  
  public String getTitle()
  {
    return this.mTitle;
  }
  
  public int getType()
  {
    return this.mType;
  }
  
  public String getUrl()
  {
    return this.mUrl;
  }
  
  public void setAdvTypeShare(String paramString)
  {
    this.advTypeShare = paramString;
  }
  
  public void setId(String paramString)
  {
    this.mId = paramString;
  }
  
  public void setImg(String paramString)
  {
    this.mImg = paramString;
  }
  
  public void setOtime(String paramString)
  {
    this.mOtime = paramString;
  }
  
  public void setSource(String paramString)
  {
    this.mSource = paramString;
  }
  
  public void setSummary(String paramString)
  {
    this.mSummary = paramString;
  }
  
  public void setTitle(String paramString)
  {
    this.mTitle = paramString;
  }
  
  public void setType(int paramInt)
  {
    this.mType = paramInt;
  }
  
  public void setUrl(String paramString)
  {
    this.mUrl = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\StockNewItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */