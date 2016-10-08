package com.android.dazhihui.ui.model.stock;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class JpMornPostTopicVo
{
  private List<MorningPostTopicVo> dataList;
  private String errorCount;
  private String star;
  private String summary;
  private String title;
  
  public void decode(String paramString)
  {
    int i = 0;
    Object localObject = paramString;
    if (paramString != null) {
      localObject = paramString;
    }
    try
    {
      if (paramString.length() > 1) {
        localObject = paramString.substring(paramString.indexOf("["));
      }
      this.dataList = new ArrayList();
      paramString = new JSONArray((String)localObject).getJSONObject(0);
      localObject = paramString.getJSONArray("data");
      while (i < ((JSONArray)localObject).length())
      {
        MorningPostTopicVo localMorningPostTopicVo = new MorningPostTopicVo();
        localMorningPostTopicVo.decode(((JSONArray)localObject).getJSONObject(i));
        this.dataList.add(localMorningPostTopicVo);
        i += 1;
      }
      paramString = paramString.getJSONObject("header");
      this.errorCount = paramString.optString("error");
      this.title = paramString.optString("title");
      this.star = paramString.optString("star");
      this.summary = paramString.optString("Summary");
      return;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
  }
  
  public List<MorningPostTopicVo> getDataList()
  {
    return this.dataList;
  }
  
  public String getStar()
  {
    return this.star;
  }
  
  public String getSummary()
  {
    return this.summary;
  }
  
  public String getTitle()
  {
    return this.title;
  }
  
  public void setStar(String paramString)
  {
    this.star = paramString;
  }
  
  public void setSummary(String paramString)
  {
    this.summary = paramString;
  }
  
  public void setTitle(String paramString)
  {
    this.title = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\JpMornPostTopicVo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */