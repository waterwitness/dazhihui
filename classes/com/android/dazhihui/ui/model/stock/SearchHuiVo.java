package com.android.dazhihui.ui.model.stock;

import com.c.a.k;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public class SearchHuiVo
{
  public static ArrayList<SearchHuiVo.SearchSuggestResult> parseData(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    localArrayList = new ArrayList();
    k localk = new k();
    try
    {
      paramString = new JSONArray(paramString);
      int i = 0;
      while (i < paramString.length())
      {
        localArrayList.add((SearchHuiVo.SearchSuggestResult)localk.a(paramString.getJSONObject(i).toString(), SearchHuiVo.SearchSuggestResult.class));
        i += 1;
      }
      return localArrayList;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\SearchHuiVo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */