package com.android.dazhihui.ui.model.stock;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public class StockNewsVo
{
  private String mCurPage = null;
  private int mError = 0;
  private String mFirstPage = null;
  private String mLastPage = null;
  private ArrayList<StockNewItem> mNews = new ArrayList();
  private String mNextPage = null;
  private HashMap<Integer, String> mTypes = new HashMap();
  private String mUpPage = null;
  
  public void decode(String paramString)
  {
    int j = 0;
    try
    {
      paramString = new JSONArray(paramString).getJSONObject(0);
      Object localObject1;
      int i;
      if (!paramString.isNull("header"))
      {
        localObject1 = paramString.getJSONObject("header");
        this.mError = ((JSONObject)localObject1).optInt("error");
        this.mFirstPage = ((JSONObject)localObject1).optString("firstPage");
        this.mLastPage = ((JSONObject)localObject1).optString("lastPage");
        this.mNextPage = ((JSONObject)localObject1).optString("nextPage");
        this.mUpPage = ((JSONObject)localObject1).optString("upPage");
        localObject1 = ((JSONObject)localObject1).optJSONArray("columns");
        if (localObject1 != null)
        {
          i = 0;
          while (i < ((JSONArray)localObject1).length())
          {
            Object localObject2 = ((JSONArray)localObject1).getJSONObject(i);
            int k = ((JSONObject)localObject2).optInt("type");
            localObject2 = ((JSONObject)localObject2).optString("typeName");
            this.mTypes.put(Integer.valueOf(k), localObject2);
            i += 1;
          }
        }
      }
      if (!paramString.isNull("data"))
      {
        paramString = paramString.optJSONArray("data");
        if (paramString != null)
        {
          i = j;
          while (i < paramString.length())
          {
            localObject1 = new StockNewItem();
            ((StockNewItem)localObject1).decodeFromJSON(paramString.getJSONObject(i));
            this.mNews.add(localObject1);
            i += 1;
          }
        }
      }
      return;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
  }
  
  public String getCurPage()
  {
    return this.mCurPage;
  }
  
  public int getError()
  {
    return this.mError;
  }
  
  public String getFirstPage()
  {
    return this.mFirstPage;
  }
  
  public String getLastPage()
  {
    return this.mLastPage;
  }
  
  public ArrayList<StockNewItem> getNews()
  {
    return this.mNews;
  }
  
  public String getNextPage()
  {
    return this.mNextPage;
  }
  
  public HashMap<Integer, String> getTypes()
  {
    return this.mTypes;
  }
  
  public String getUpPage()
  {
    return this.mUpPage;
  }
  
  public boolean isLastPage()
  {
    return (TextUtils.isEmpty(this.mLastPage)) || (TextUtils.isEmpty(this.mNextPage)) || (TextUtils.isEmpty(this.mCurPage)) || (this.mCurPage.equals(this.mLastPage));
  }
  
  public void setCurPage(String paramString)
  {
    this.mCurPage = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\StockNewsVo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */