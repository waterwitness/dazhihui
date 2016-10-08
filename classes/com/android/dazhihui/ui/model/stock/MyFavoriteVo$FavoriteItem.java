package com.android.dazhihui.ui.model.stock;

import org.json.JSONObject;

public class MyFavoriteVo$FavoriteItem
{
  private String mClickurl;
  private String mStoretime;
  private String mTitle;
  
  public MyFavoriteVo$FavoriteItem(MyFavoriteVo paramMyFavoriteVo) {}
  
  public void decodeFromJSON(JSONObject paramJSONObject)
  {
    this.mTitle = paramJSONObject.optString("title");
    this.mClickurl = paramJSONObject.optString("clickurl");
    this.mStoretime = paramJSONObject.optString("storetime");
  }
  
  public String getClickurl()
  {
    return this.mClickurl;
  }
  
  public String getStoretime()
  {
    return this.mStoretime;
  }
  
  public String getTitle()
  {
    return this.mTitle;
  }
  
  public void setClickurl(String paramString)
  {
    this.mClickurl = paramString;
  }
  
  public void setStoretime(String paramString)
  {
    this.mStoretime = paramString;
  }
  
  public void setTitle(String paramString)
  {
    this.mTitle = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\MyFavoriteVo$FavoriteItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */