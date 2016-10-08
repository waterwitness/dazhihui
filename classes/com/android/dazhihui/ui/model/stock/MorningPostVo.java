package com.android.dazhihui.ui.model.stock;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONObject;

public class MorningPostVo
{
  private String id;
  private String imgurl;
  private String otime;
  private String star;
  private String title;
  private String topical;
  private String url;
  
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
      this.title = paramJSONObject.getString("title");
      this.otime = paramJSONObject.getString("otime");
      this.url = paramJSONObject.getString("url");
      this.id = paramJSONObject.optString("id");
      this.star = paramJSONObject.optString("star");
      this.topical = paramJSONObject.optString("topical");
      this.imgurl = paramJSONObject.optString("imgurl");
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
  
  public String getDate()
  {
    if (this.otime.length() > 11) {
      return this.otime.substring(0, 11);
    }
    return this.otime;
  }
  
  public String getId()
  {
    return this.id;
  }
  
  public String getImgurl()
  {
    return this.imgurl;
  }
  
  public String getOtime()
  {
    return this.otime;
  }
  
  public String getStar()
  {
    return this.star;
  }
  
  public String getTitle()
  {
    return this.title;
  }
  
  public String getTopical()
  {
    return this.topical;
  }
  
  public String getUrl()
  {
    return this.url;
  }
  
  public boolean isTotay()
  {
    String str = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    return getDate().equals(str);
  }
  
  public boolean isYestoday()
  {
    Object localObject = new Date(new Date().getTime() - 86400000L);
    localObject = new SimpleDateFormat("yyyy-MM-dd").format((Date)localObject);
    return getDate().equals(localObject);
  }
  
  public void setId(String paramString)
  {
    this.id = paramString;
  }
  
  public void setImgurl(String paramString)
  {
    this.imgurl = paramString;
  }
  
  public void setOtime(String paramString)
  {
    this.otime = paramString;
  }
  
  public void setStar(String paramString)
  {
    this.star = paramString;
  }
  
  public void setTitle(String paramString)
  {
    this.title = paramString;
  }
  
  public void setTopical(String paramString)
  {
    this.topical = paramString;
  }
  
  public void setUrl(String paramString)
  {
    this.url = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\MorningPostVo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */