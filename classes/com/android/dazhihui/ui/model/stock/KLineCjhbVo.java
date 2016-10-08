package com.android.dazhihui.ui.model.stock;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class KLineCjhbVo
{
  private String cjje;
  private String cjl;
  private String dw;
  private String error;
  private List<KLineCjhbVo.CjhbItem> items = new ArrayList();
  private String mcje;
  private String mrje;
  private String yybmc;
  private String zdfname;
  private String zdfvalue;
  
  public void decode(String paramString)
  {
    this.items.clear();
    try
    {
      Object localObject1 = new JSONArray(paramString.substring(paramString.indexOf("["))).getJSONObject(0);
      paramString = ((JSONObject)localObject1).getJSONArray("data");
      localObject1 = ((JSONObject)localObject1).getJSONObject("header");
      this.dw = ((JSONObject)localObject1).optString("dw");
      this.mrje = ((JSONObject)localObject1).optString("mrje");
      this.cjl = ((JSONObject)localObject1).optString("cjl");
      this.error = ((JSONObject)localObject1).optString("error");
      this.yybmc = ((JSONObject)localObject1).optString("yybmc");
      this.mcje = ((JSONObject)localObject1).optString("mcje");
      this.zdfvalue = ((JSONObject)localObject1).optString("zdfvalue");
      this.zdfname = ((JSONObject)localObject1).optString("zdfname");
      this.cjje = ((JSONObject)localObject1).optString("cjje");
      int i = 0;
      while (i < paramString.length())
      {
        Object localObject2 = paramString.getJSONObject(i);
        localObject1 = new KLineCjhbVo.CjhbItem(this);
        ((KLineCjhbVo.CjhbItem)localObject1).cjl = ((JSONObject)localObject2).optString("cjl");
        ((KLineCjhbVo.CjhbItem)localObject1).zdfvalue = ((JSONObject)localObject2).optString("zdfvalue");
        ((KLineCjhbVo.CjhbItem)localObject1).zdfname = ((JSONObject)localObject2).optString("zdfname");
        ((KLineCjhbVo.CjhbItem)localObject1).cjje = ((JSONObject)localObject2).optString("cjje");
        ((KLineCjhbVo.CjhbItem)localObject1).newsid = ((JSONObject)localObject2).optString("newsid");
        ((KLineCjhbVo.CjhbItem)localObject1).jzrq = ((JSONObject)localObject2).optString("jzrq");
        localObject2 = ((JSONObject)localObject2).getJSONArray("mindata");
        int j = 0;
        while (j < ((JSONArray)localObject2).length())
        {
          JSONObject localJSONObject = ((JSONArray)localObject2).getJSONObject(j);
          KLineCjhbVo.MinData localMinData = new KLineCjhbVo.MinData(this);
          localMinData.mrje = localJSONObject.optString("mrje");
          localMinData.yybmc = localJSONObject.optString("yybmc");
          localMinData.mcje = localJSONObject.optString("mcje");
          ((KLineCjhbVo.CjhbItem)localObject1).minDataItems.add(localMinData);
          j += 1;
        }
        this.items.add(localObject1);
        i += 1;
      }
      return;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
  }
  
  public String getCjje()
  {
    return this.cjje;
  }
  
  public String getCjl()
  {
    return this.cjl;
  }
  
  public String getDw()
  {
    return this.dw;
  }
  
  public String getError()
  {
    return this.error;
  }
  
  public List<KLineCjhbVo.CjhbItem> getItems()
  {
    return this.items;
  }
  
  public String getMcje()
  {
    return this.mcje;
  }
  
  public String getMrje()
  {
    return this.mrje;
  }
  
  public String getYybmc()
  {
    return this.yybmc;
  }
  
  public String getZdfName()
  {
    return this.zdfname;
  }
  
  public String getZdfValue()
  {
    return this.zdfvalue;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\KLineCjhbVo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */