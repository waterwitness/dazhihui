package com.android.dazhihui.ui.model.stock;

import com.c.a.k;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

public class NewsTitleVo
  implements Serializable
{
  private static final long serialVersionUID = 8584392639069175039L;
  private List<NewsTitleVo.NewsTitleItem> newsTitleList = new ArrayList();
  private long time;
  private String version;
  
  public void decode(String paramString)
  {
    paramString = new JSONObject(paramString);
    this.version = paramString.optJSONObject("header").getString("vs");
    this.newsTitleList.clear();
    paramString = paramString.optJSONObject("config").optJSONArray("nodelist");
    int i = 0;
    while (i < paramString.length())
    {
      NewsTitleVo.NewsTitleItem localNewsTitleItem = (NewsTitleVo.NewsTitleItem)new k().a(paramString.optJSONObject(i).toString(), NewsTitleVo.NewsTitleItem.class);
      this.newsTitleList.add(localNewsTitleItem);
      i += 1;
    }
    this.time = System.currentTimeMillis();
  }
  
  public List<NewsTitleVo.NewsTitleItem> getNewsTitleList()
  {
    return this.newsTitleList;
  }
  
  public String getVersion()
  {
    return this.version;
  }
  
  public boolean isSameDay()
  {
    long l = System.currentTimeMillis();
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
    localSimpleDateFormat.format(Long.valueOf(this.time));
    localSimpleDateFormat.format(Long.valueOf(l));
    return Math.abs(this.time - l) <= 21600000L;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\NewsTitleVo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */