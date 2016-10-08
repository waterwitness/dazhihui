package com.android.dazhihui.ui.model.stock;

import android.util.Log;
import com.c.a.k;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public class SearchPeopleVo
{
  public static final String KEY_0 = "UserName";
  public static final String KEY_1 = "ImageURL";
  public static final String KEY_2 = "RoomName";
  public static final String KEY_3 = "BigvInfo";
  public static final String KEY_4 = "HomePageURL";
  public static final String KEY_5 = "DzhName";
  public static final String KEY_6 = "VbarId";
  public static final String KEY_7 = "NickName";
  public int Counter;
  public SearchPeopleVo.DataValue Data;
  public int Err;
  public String Qid;
  
  public static ArrayList<SearchPeopleVo.SearchPeopleValue> parseData_(String paramString, HashMap<String, String> paramHashMap)
  {
    if (paramString == null) {
      return null;
    }
    ArrayList localArrayList1 = new ArrayList();
    System.out.println("data = " + paramString);
    for (;;)
    {
      try
      {
        Object localObject = new JSONObject(paramString);
        paramString = ((JSONObject)localObject).getJSONArray("head");
        localObject = ((JSONObject)localObject).getJSONArray("data");
        if ((paramString != null) && (localObject != null))
        {
          int j = paramString.length();
          ArrayList localArrayList2 = new ArrayList();
          i = 0;
          if (i >= j) {
            break label521;
          }
          localArrayList2.add(paramString.getString(i));
          i += 1;
          continue;
          if (i < ((JSONArray)localObject).length())
          {
            SearchPeopleVo.SearchPeopleValue localSearchPeopleValue = new SearchPeopleVo.SearchPeopleValue();
            JSONArray localJSONArray1 = new JSONArray(((JSONArray)localObject).get(i).toString());
            if ((localJSONArray1 == null) || (localJSONArray1.length() != paramString.length())) {
              break;
            }
            j = localArrayList2.indexOf("UserName");
            if (j != -1) {
              localSearchPeopleValue.userName = localJSONArray1.getString(j);
            }
            j = localArrayList2.indexOf("ImageURL");
            if (j != -1) {
              localSearchPeopleValue.imageURL = localJSONArray1.getString(j);
            }
            j = localArrayList2.indexOf("RoomName");
            if (j != -1) {
              localSearchPeopleValue.roomName = localJSONArray1.getString(j);
            }
            j = localArrayList2.indexOf("BigvInfo");
            if (j != -1)
            {
              JSONArray localJSONArray2 = new JSONArray(localJSONArray1.get(j).toString());
              if (localJSONArray2 == null) {
                return null;
              }
              localSearchPeopleValue.bigvInfo = new ArrayList();
              j = 0;
              if (j < localJSONArray2.length())
              {
                SearchPeopleVo.PeopleItem localPeopleItem = new SearchPeopleVo.PeopleItem();
                localPeopleItem.item = localJSONArray2.getString(j);
                localPeopleItem.itemColor = ((String)paramHashMap.get(localPeopleItem.item));
                localSearchPeopleValue.bigvInfo.add(localPeopleItem);
                j += 1;
                continue;
              }
            }
            j = localArrayList2.indexOf("HomePageURL");
            if (j != -1) {
              localSearchPeopleValue.homePageURL = localJSONArray1.getString(j);
            }
            j = localArrayList2.indexOf("DzhName");
            if (j != -1) {
              localSearchPeopleValue.dzhName = localJSONArray1.getString(j);
            }
            j = localArrayList2.indexOf("VbarId");
            if (j != -1) {
              localSearchPeopleValue.vbarId = localJSONArray1.getString(j);
            }
            j = localArrayList2.indexOf("NickName");
            if (j != -1) {
              localSearchPeopleValue.nickName = localJSONArray1.getString(j);
            }
            localArrayList1.add(localSearchPeopleValue);
            i += 1;
            continue;
          }
          return localArrayList1;
        }
      }
      catch (Exception paramString)
      {
        Log.e("ilvb", "search parseData_ error");
        paramString.printStackTrace();
      }
      return null;
      label521:
      int i = 0;
    }
    return null;
  }
  
  public static HashMap<String, String> parseKuozhan(String paramString)
  {
    int i = 0;
    localHashMap = new HashMap();
    try
    {
      paramString = new JSONObject(paramString).getJSONArray("data");
      while (i < paramString.length())
      {
        JSONArray localJSONArray = paramString.getJSONArray(i);
        localHashMap.put(localJSONArray.getString(0), localJSONArray.getString(1));
        i += 1;
      }
      return localHashMap;
    }
    catch (Exception paramString)
    {
      Log.e("ilvb", "search parseKuozhan error");
      paramString.printStackTrace();
    }
  }
  
  public ArrayList<SearchPeopleVo.SearchPeopleValue> parseData(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    try
    {
      paramString = (SearchPeopleVo)new k().a(paramString, SearchPeopleVo.class);
      if ((paramString != null) && (paramString.Data != null) && (paramString.Data.RepDataRichSearchResult != null) && (paramString.Data.RepDataRichSearchResult.size() >= 0))
      {
        HashMap localHashMap = parseKuozhan(((SearchPeopleVo.SearchResult)paramString.Data.RepDataRichSearchResult.get(0)).Kuozhan);
        paramString = parseData_(((SearchPeopleVo.SearchResult)paramString.Data.RepDataRichSearchResult.get(0)).JieGuo.toString(), localHashMap);
        return paramString;
      }
    }
    catch (Exception paramString)
    {
      Log.e("ilvb", "search parseData error");
      paramString.printStackTrace();
    }
    return null;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\SearchPeopleVo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */