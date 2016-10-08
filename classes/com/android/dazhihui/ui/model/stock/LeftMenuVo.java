package com.android.dazhihui.ui.model.stock;

import com.c.a.k;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class LeftMenuVo
  implements Serializable
{
  private static final long serialVersionUID = 8584392639069175039L;
  private int IsExistence = 1;
  private String Url_Link;
  private String cChangType = "0";
  private Map<String, List<LeftMenuVo.LeftMenuItem>> leftMenuMap = new HashMap();
  private String mIsComplete = "0";
  private String mIsIq = "0";
  private List<LeftMenuVo.LivePage> mLivePageList = new ArrayList();
  private int mLiveState = 1;
  private String mLiveWapPage;
  private String page_Url;
  private int period;
  private List<LeftMenuVo.ShowTime> showTime;
  private long time;
  private String version;
  
  public void decode(String paramString)
  {
    paramString = new JSONObject(paramString);
    Object localObject1 = paramString.optJSONObject("header");
    this.version = ((JSONObject)localObject1).getString("vs");
    this.period = ((JSONObject)localObject1).optInt("period", 0);
    this.IsExistence = ((JSONObject)localObject1).optInt("IsExistence", 1);
    this.Url_Link = ((JSONObject)localObject1).optString("Url_Link", "");
    this.page_Url = ((JSONObject)localObject1).optString("page_Url", "");
    this.mIsComplete = ((JSONObject)localObject1).optString("isComplete", "0");
    this.cChangType = ((JSONObject)localObject1).optString("cChangType", "0");
    this.mIsIq = ((JSONObject)localObject1).optString("isIq", "0");
    Object localObject2 = ((JSONObject)localObject1).optJSONObject("liveC");
    Object localObject3;
    if (localObject2 != null)
    {
      this.mLiveState = ((JSONObject)localObject2).optInt("state", 1);
      this.mLiveWapPage = ((JSONObject)localObject2).optString("url_webpage");
      localObject2 = ((JSONObject)localObject2).optJSONArray("url_Page");
      if (localObject2 != null)
      {
        this.mLivePageList.clear();
        i = 0;
        while (i < ((JSONArray)localObject2).length())
        {
          localObject3 = ((JSONArray)localObject2).optJSONObject(i);
          if (localObject3 != null)
          {
            LeftMenuVo.LivePage localLivePage = new LeftMenuVo.LivePage(this);
            localLivePage.type = ((JSONObject)localObject3).optInt("type");
            localLivePage.url = ((JSONObject)localObject3).optString("url");
            localLivePage.name = ((JSONObject)localObject3).optString("sName");
            localLivePage.countid = ((JSONObject)localObject3).optInt("countid");
            this.mLivePageList.add(localLivePage);
          }
          i += 1;
        }
      }
    }
    localObject1 = ((JSONObject)localObject1).optJSONArray("indexApp");
    if (localObject1 != null)
    {
      if (this.showTime == null) {
        this.showTime = new ArrayList();
      }
      i = 0;
      while (i < ((JSONArray)localObject1).length())
      {
        localObject2 = ((JSONArray)localObject1).optJSONObject(i);
        localObject3 = new LeftMenuVo.ShowTime(this);
        ((LeftMenuVo.ShowTime)localObject3).starTime = ((JSONObject)localObject2).optString("starTime", "");
        ((LeftMenuVo.ShowTime)localObject3).endTime = ((JSONObject)localObject2).optString("endTime", "");
        this.showTime.add(localObject3);
        i += 1;
      }
    }
    paramString = paramString.optJSONObject("data").optJSONArray("config");
    int i = 0;
    if (i < paramString.length())
    {
      int j;
      if (paramString.optJSONObject(i).getString("nodename").equals("频道"))
      {
        localObject1 = new ArrayList();
        localObject2 = paramString.optJSONObject(i).getJSONArray("nodelist");
        j = 0;
        while (j < ((JSONArray)localObject2).length())
        {
          ((List)localObject1).add((LeftMenuVo.LeftMenuItem)new k().a(((JSONArray)localObject2).optJSONObject(j).toString(), LeftMenuVo.LeftMenuItem.class));
          j += 1;
        }
        this.leftMenuMap.put("channel", localObject1);
      }
      for (;;)
      {
        i += 1;
        break;
        localObject1 = new ArrayList();
        localObject2 = paramString.optJSONObject(i).getJSONArray("nodelist");
        j = 0;
        while (j < ((JSONArray)localObject2).length())
        {
          ((List)localObject1).add((LeftMenuVo.LeftMenuItem)new k().a(((JSONArray)localObject2).optJSONObject(j).toString(), LeftMenuVo.LeftMenuItem.class));
          j += 1;
        }
        this.leftMenuMap.put("normal", localObject1);
      }
    }
    this.time = System.currentTimeMillis();
  }
  
  public String getIsComplete()
  {
    return this.mIsComplete;
  }
  
  public int getIsExistence()
  {
    return this.IsExistence;
  }
  
  public String getIsIq()
  {
    return this.mIsIq;
  }
  
  public Map<String, List<LeftMenuVo.LeftMenuItem>> getLeftMenuMap()
  {
    return this.leftMenuMap;
  }
  
  public List<LeftMenuVo.LivePage> getLivePageList()
  {
    return this.mLivePageList;
  }
  
  public int getLiveState()
  {
    return this.mLiveState;
  }
  
  public String getLiveWapPage()
  {
    return this.mLiveWapPage;
  }
  
  public String getPage_Url()
  {
    return this.page_Url;
  }
  
  public int getPeriod()
  {
    return this.period;
  }
  
  public List<LeftMenuVo.ShowTime> getShowTime()
  {
    return this.showTime;
  }
  
  public String getUrl_Link()
  {
    return this.Url_Link;
  }
  
  public String getVersion()
  {
    return this.version;
  }
  
  public String getcChangType()
  {
    return this.cChangType;
  }
  
  public boolean isSameDay()
  {
    long l = System.currentTimeMillis();
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
    return localSimpleDateFormat.format(Long.valueOf(this.time)).equals(localSimpleDateFormat.format(Long.valueOf(l)));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\LeftMenuVo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */