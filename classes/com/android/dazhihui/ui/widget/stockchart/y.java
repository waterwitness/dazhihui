package com.android.dazhihui.ui.widget.stockchart;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class y
{
  private String a;
  private List<z> b = new ArrayList();
  
  public List<z> a()
  {
    return this.b;
  }
  
  public void a(String paramString)
  {
    int i = 0;
    this.b.clear();
    try
    {
      JSONObject localJSONObject = new JSONArray(paramString.substring(paramString.indexOf("["))).getJSONObject(0);
      paramString = localJSONObject.getJSONArray("data");
      this.a = localJSONObject.getJSONObject("header").optString("error");
      while (i < paramString.length())
      {
        localJSONObject = paramString.getJSONObject(i);
        z localz = new z(this);
        localz.a = localJSONObject.optString("jzrq");
        localz.b = localJSONObject.optString("newsid");
        localz.c = localJSONObject.optString("rqmcl");
        localz.d = localJSONObject.optString("rqye");
        localz.e = localJSONObject.optString("rqyl");
        localz.f = localJSONObject.optString("rzmre");
        localz.g = localJSONObject.optString("rzye");
        this.b.add(localz);
        i += 1;
      }
      return;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */