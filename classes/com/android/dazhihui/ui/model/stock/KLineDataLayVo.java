package com.android.dazhihui.ui.model.stock;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class KLineDataLayVo
{
  private List<KLineDataLayVo.DataLayItem> dataItems = new ArrayList();
  private String errorType;
  private Map<String, String> typeMap = new HashMap();
  
  public void clear()
  {
    this.dataItems.clear();
  }
  
  public void decode(String paramString)
  {
    this.dataItems.clear();
    JSONObject localJSONObject;
    Object localObject1;
    Object localObject2;
    try
    {
      localJSONObject = new JSONArray(paramString.substring(paramString.indexOf("["))).getJSONObject(0);
      paramString = localJSONObject.getJSONArray("data");
      localJSONObject = localJSONObject.getJSONObject("header");
      this.errorType = localJSONObject.optString("error");
      localJSONObject = localJSONObject.getJSONObject("type");
      localObject1 = localJSONObject.keys();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (String)((Iterator)localObject1).next();
        String str = localJSONObject.optString((String)localObject2);
        this.typeMap.put(localObject2, str);
        continue;
        return;
      }
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
    int i = 0;
    while (i < paramString.length())
    {
      localJSONObject = paramString.getJSONObject(i);
      localObject1 = new KLineDataLayVo.DataLayItem(this);
      ((KLineDataLayVo.DataLayItem)localObject1).title = localJSONObject.optString("title");
      ((KLineDataLayVo.DataLayItem)localObject1).newsDate = localJSONObject.optString("newsDate");
      ((KLineDataLayVo.DataLayItem)localObject1).foramtDate = ((KLineDataLayVo.DataLayItem)localObject1).newsDate;
      try
      {
        localObject2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(((KLineDataLayVo.DataLayItem)localObject1).foramtDate);
        ((KLineDataLayVo.DataLayItem)localObject1).foramtDate = new SimpleDateFormat("yyyy-MM-dd").format((Date)localObject2);
        ((KLineDataLayVo.DataLayItem)localObject1).type = localJSONObject.optString("type");
        ((KLineDataLayVo.DataLayItem)localObject1).newsid = localJSONObject.optString("newsid");
        ((KLineDataLayVo.DataLayItem)localObject1).url = localJSONObject.optString("url");
        this.dataItems.add(localObject1);
        i += 1;
      }
      catch (ParseException localParseException)
      {
        for (;;) {}
      }
    }
  }
  
  public String getError()
  {
    return this.errorType;
  }
  
  public List<KLineDataLayVo.DataLayItem> getItems()
  {
    return this.dataItems;
  }
  
  public Map<String, String> getMap()
  {
    return this.typeMap;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\KLineDataLayVo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */