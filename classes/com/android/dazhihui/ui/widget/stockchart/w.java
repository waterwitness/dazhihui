package com.android.dazhihui.ui.widget.stockchart;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class w
{
  private String a;
  private List<x> b = new ArrayList();
  
  public List<x> a()
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
        x localx = new x(this);
        localx.a = localJSONObject.optString("cjje");
        localx.b = localJSONObject.optString("cjl");
        localx.c = localJSONObject.optString("drsp");
        localx.d = localJSONObject.optString("jg");
        localx.e = localJSONObject.optString("jyrq");
        localx.f = localJSONObject.optString("mcf");
        localx.g = localJSONObject.optString("mrf");
        localx.h = localJSONObject.optString("newsid");
        localx.i = localJSONObject.optString("zyjbl");
        this.b.add(localx);
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */