package com.android.dazhihui.ui.model.stock;

import org.json.JSONObject;

public class NewsContentVo
{
  public static final int fontsize_big = 20;
  public static final int fontsize_big_big = 24;
  public static final int fontsize_middle = 18;
  public static final int fontsize_small = 14;
  public static final int fontsize_small_small = 12;
  private String content;
  private String source;
  private String time;
  private String title;
  private String web1 = "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01//EN\" \"http://www.w3.org/TR/html4/strict.dtd\"><html><head><meta name=\"viewport\" content=\"width=device-width,minimum-scale=1.0, maximum-scale=1.0\" /><meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\"><meta http-equiv=\"Content-Style-Type\" content=\"text/css\"><title></title><meta name=\"Generator\" content=\"Cocoa HTML Writer\"><meta name=\"CocoaVersion\" content=\"1138.47\"><style type=\"text/css\"> body {font-size:";
  private String web2 = "px;color:#323232;line-height:150%;padding-bottom:10px;padding-top:10px;} img { max-width: 300px; width: expression(this.width > 300 ? 300: true);}</style></head><body>";
  private String webEnd = "</body></html>";
  
  private String createWebData(int paramInt)
  {
    String str = this.web1 + paramInt + this.web2;
    str = str + this.content;
    return str + this.webEnd;
  }
  
  public void decode(JSONObject paramJSONObject)
  {
    if (paramJSONObject == null) {
      return;
    }
    try
    {
      this.content = paramJSONObject.getString("content");
      this.title = paramJSONObject.getString("title");
      this.time = paramJSONObject.getString("otime");
      this.source = paramJSONObject.getString("source");
      return;
    }
    catch (Exception paramJSONObject)
    {
      paramJSONObject.printStackTrace();
    }
  }
  
  public String getContent(int paramInt)
  {
    int j = 14;
    int i = j;
    switch (paramInt)
    {
    default: 
      i = j;
    }
    for (;;)
    {
      return createWebData(i);
      i = 12;
      continue;
      i = 18;
      continue;
      i = 20;
      continue;
      i = 24;
    }
  }
  
  public String getSource()
  {
    return this.source;
  }
  
  public String getTime()
  {
    return this.time;
  }
  
  public String getTitle()
  {
    return this.title;
  }
  
  public void setContent(String paramString)
  {
    this.content = paramString;
  }
  
  public void setSource(String paramString)
  {
    this.source = paramString;
  }
  
  public void setTime(String paramString)
  {
    this.time = paramString;
  }
  
  public void setTitle(String paramString)
  {
    this.title = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\NewsContentVo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */