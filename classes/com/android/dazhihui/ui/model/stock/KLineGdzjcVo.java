package com.android.dazhihui.ui.model.stock;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class KLineGdzjcVo
{
  private String errorType;
  private List<KLineGdzjcVo.GdzjcItem> items = new ArrayList();
  
  public void decode(String paramString)
  {
    int i = 0;
    this.items.clear();
    try
    {
      JSONObject localJSONObject = new JSONArray(paramString.substring(paramString.indexOf("["))).getJSONObject(0);
      paramString = localJSONObject.getJSONArray("data");
      this.errorType = localJSONObject.getJSONObject("header").optString("error");
      while (i < paramString.length())
      {
        localJSONObject = paramString.getJSONObject(i);
        KLineGdzjcVo.GdzjcItem localGdzjcItem = new KLineGdzjcVo.GdzjcItem(this);
        localGdzjcItem.bdfx = localJSONObject.optString("bdfx");
        localGdzjcItem.bdjz = localJSONObject.optString("bdjz");
        localGdzjcItem.bdsl = localJSONObject.optString("bdsl");
        localGdzjcItem.gdlx = localJSONObject.optString("gdlx");
        localGdzjcItem.gdmc = localJSONObject.optString("gdmc");
        localGdzjcItem.newsid = localJSONObject.optString("newsid");
        localGdzjcItem.zzgb = localJSONObject.optString("zzgb");
        this.items.add(localGdzjcItem);
        i += 1;
      }
      return;
    }
    catch (Exception paramString) {}
  }
  
  public String getErrorType()
  {
    return this.errorType;
  }
  
  public List<KLineGdzjcVo.GdzjcItem> getItems()
  {
    return this.items;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\KLineGdzjcVo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */