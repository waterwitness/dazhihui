package com.android.dazhihui.ui.model.stock;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class JpNewsVo
{
  private String currentUrl;
  private List<NewsVo> dataList = new ArrayList();
  private String firstUrl;
  private List<NewsVo> headList = new ArrayList();
  private String lastUrl;
  private String nextUrl;
  private String preUrl;
  
  public void addData(NewsVo paramNewsVo)
  {
    if (paramNewsVo != null)
    {
      if (this.dataList == null) {
        this.dataList = new ArrayList();
      }
      this.dataList.add(paramNewsVo);
    }
  }
  
  public void clear()
  {
    if (this.dataList != null) {
      this.dataList.clear();
    }
    if (this.headList != null) {
      this.headList.clear();
    }
  }
  
  public void decode(String paramString)
  {
    int j = 0;
    try
    {
      paramString = new JSONArray(paramString.substring(paramString.indexOf("["))).getJSONObject(0);
      JSONArray localJSONArray = paramString.getJSONArray("data");
      int i = 0;
      NewsVo localNewsVo;
      JSONObject localJSONObject;
      while (i < localJSONArray.length())
      {
        localNewsVo = new NewsVo();
        localJSONObject = localJSONArray.getJSONObject(i);
        localNewsVo.setTitle(localJSONObject.getString("title"));
        localNewsVo.setTime(localJSONObject.getString("otime"));
        localNewsVo.setUrl(localJSONObject.getString("url"));
        localNewsVo.setImgUrl(localJSONObject.optString("img"));
        localNewsVo.setOrigins(localJSONObject.optString("source"));
        localNewsVo.setId(String.valueOf(localJSONObject.optInt("id")));
        localNewsVo.setCountId(localJSONObject.optString("countid", ""));
        localNewsVo.setContent(localJSONObject.optString("summary", ""));
        localNewsVo.setResType(localJSONObject.optString("resType", ""));
        localNewsVo.setAdvTypeShare(localJSONObject.optString("advTypeShare", ""));
        this.dataList.add(localNewsVo);
        i += 1;
      }
      paramString = paramString.getJSONObject("header");
      localJSONArray = paramString.optJSONArray("bigImgNews");
      if (localJSONArray != null)
      {
        i = j;
        while (i < localJSONArray.length())
        {
          localNewsVo = new NewsVo();
          localJSONObject = localJSONArray.getJSONObject(i);
          localNewsVo.setTitle(localJSONObject.optString("title"));
          localNewsVo.setTime(localJSONObject.optString("otime"));
          localNewsVo.setUrl(localJSONObject.optString("url"));
          localNewsVo.setImgUrl(localJSONObject.optString("img"));
          localNewsVo.setOrigins(localJSONObject.optString("source"));
          localNewsVo.setContent(localJSONObject.optString("summary"));
          localNewsVo.setId(String.valueOf(localJSONObject.optInt("id")));
          localNewsVo.setCountId(localJSONObject.optString("countid", ""));
          localNewsVo.setAdvTypeShare(localJSONObject.optString("advTypeShare", ""));
          this.headList.add(localNewsVo);
          i += 1;
        }
      }
      this.firstUrl = paramString.optString("first");
      this.lastUrl = paramString.optString("last");
      this.preUrl = paramString.optString("pre");
      this.nextUrl = paramString.optString("next");
      return;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
  }
  
  public String getCurrentUrl()
  {
    return this.currentUrl;
  }
  
  public List<NewsVo> getDataList()
  {
    return this.dataList;
  }
  
  public String getFirstUrl()
  {
    if (this.currentUrl == null) {
      return null;
    }
    return this.currentUrl.substring(0, this.currentUrl.lastIndexOf("/") + 1) + this.firstUrl;
  }
  
  public List<NewsVo> getHeadList()
  {
    return this.headList;
  }
  
  public String getNext()
  {
    return this.nextUrl;
  }
  
  public String getNextUrl()
  {
    if (this.currentUrl == null) {
      return null;
    }
    return this.currentUrl.substring(0, this.currentUrl.lastIndexOf("/") + 1) + this.nextUrl;
  }
  
  public String getPreUrl()
  {
    if (this.currentUrl == null) {
      return null;
    }
    return this.currentUrl.substring(0, this.currentUrl.lastIndexOf("/") + 1) + this.preUrl;
  }
  
  public boolean isFirst(String paramString)
  {
    if ((paramString == null) || (this.firstUrl == null)) {
      return true;
    }
    return paramString.substring(paramString.lastIndexOf("/") + 1).trim().equals(this.firstUrl.trim());
  }
  
  public boolean isLast(String paramString)
  {
    if ((paramString == null) || (this.lastUrl == null)) {
      return true;
    }
    return paramString.substring(paramString.lastIndexOf("/") + 1).trim().equals(this.lastUrl.trim());
  }
  
  public void setCurrentUrl(String paramString)
  {
    this.currentUrl = paramString;
  }
  
  public void setFirstUrl(String paramString)
  {
    this.firstUrl = paramString;
  }
  
  public void setLastUrl(String paramString)
  {
    this.lastUrl = paramString;
  }
  
  public void setNextUrl(String paramString)
  {
    this.nextUrl = paramString;
  }
  
  public void setPreUrl(String paramString)
  {
    this.preUrl = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\JpNewsVo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */