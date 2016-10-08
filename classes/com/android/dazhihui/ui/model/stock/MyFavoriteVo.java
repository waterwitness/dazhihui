package com.android.dazhihui.ui.model.stock;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MyFavoriteVo
{
  private int mCounter;
  private String mCurPage = null;
  private int mError = 0;
  private ArrayList<MyFavoriteVo.FavoriteItem> mFavoriteList = new ArrayList();
  private String mFirstPage = null;
  private int mId;
  private String mLastPage = null;
  private String mNextPage = null;
  private String mPageSize;
  private String mQid;
  private String mTotalPage;
  private String mTotalsize;
  private String mUpPage = null;
  
  public void decode(String paramString)
  {
    for (;;)
    {
      try
      {
        paramString = new JSONObject(paramString);
        this.mQid = paramString.optString("Qid");
        this.mError = paramString.optInt("Err");
        this.mCounter = paramString.optInt("Counter");
        if (!paramString.isNull("Data"))
        {
          paramString = paramString.getJSONObject("Data");
          this.mId = paramString.optInt("Id");
          paramString = paramString.optJSONArray("RepDataFavoriteNews");
          if (paramString != null)
          {
            paramString = paramString.optJSONObject(0);
            Object localObject = paramString.optJSONObject("header");
            if (localObject != null)
            {
              this.mPageSize = ((JSONObject)localObject).optString("pagesize");
              this.mFirstPage = ((JSONObject)localObject).optString("first");
              this.mLastPage = ((JSONObject)localObject).optString("last");
              this.mNextPage = ((JSONObject)localObject).optString("next");
              this.mUpPage = ((JSONObject)localObject).optString("pre");
              this.mTotalsize = ((JSONObject)localObject).optString("totalsize");
              this.mTotalPage = ((JSONObject)localObject).optString("totalpage");
            }
            paramString = paramString.optJSONArray("news");
            if (paramString != null)
            {
              int i = 0;
              if (i < paramString.length())
              {
                localObject = new MyFavoriteVo.FavoriteItem(this);
                ((MyFavoriteVo.FavoriteItem)localObject).decodeFromJSON(paramString.getJSONObject(i));
                Iterator localIterator = this.mFavoriteList.iterator();
                if (!localIterator.hasNext()) {
                  break label295;
                }
                MyFavoriteVo.FavoriteItem localFavoriteItem = (MyFavoriteVo.FavoriteItem)localIterator.next();
                if ((!localFavoriteItem.getTitle().equals(((MyFavoriteVo.FavoriteItem)localObject).getTitle())) || (!localFavoriteItem.getClickurl().equals(((MyFavoriteVo.FavoriteItem)localObject).getClickurl()))) {
                  continue;
                }
                j = 1;
                if (j == 0) {
                  this.mFavoriteList.add(localObject);
                }
                i += 1;
                continue;
              }
            }
          }
        }
        return;
      }
      catch (JSONException paramString)
      {
        paramString.printStackTrace();
      }
      label295:
      int j = 0;
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
  
  public ArrayList<MyFavoriteVo.FavoriteItem> getFavoriteList()
  {
    return this.mFavoriteList;
  }
  
  public String getFirstPage()
  {
    return this.mFirstPage;
  }
  
  public String getLastPage()
  {
    return this.mLastPage;
  }
  
  public String getNextPage()
  {
    return this.mNextPage;
  }
  
  public String getUpPage()
  {
    return this.mUpPage;
  }
  
  public boolean isLastPage()
  {
    return this.mCurPage.equals(this.mLastPage);
  }
  
  public void setCurPage(String paramString)
  {
    this.mCurPage = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\MyFavoriteVo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */