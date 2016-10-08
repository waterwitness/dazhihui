package com.android.dazhihui.ui.model.stock;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class JpMornPostVo
{
  private List<MorningPostVo> dataList;
  private String errorCount;
  
  public void decode(String paramString)
  {
    int i = 0;
    Object localObject = paramString;
    if (paramString != null) {
      localObject = paramString;
    }
    try
    {
      if (paramString.length() > 1) {
        localObject = paramString.substring(paramString.indexOf("["));
      }
      this.dataList = new ArrayList();
      paramString = new JSONArray((String)localObject).getJSONObject(0);
      localObject = paramString.getJSONArray("data");
      while (i < ((JSONArray)localObject).length())
      {
        MorningPostVo localMorningPostVo = new MorningPostVo();
        localMorningPostVo.decode(((JSONArray)localObject).getJSONObject(i));
        this.dataList.add(localMorningPostVo);
        i += 1;
      }
      this.errorCount = paramString.getJSONObject("header").optString("error");
      return;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
  }
  
  public List<MorningPostVo> getDataList()
  {
    return this.dataList;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\JpMornPostVo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */