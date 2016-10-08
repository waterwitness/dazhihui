package com.android.dazhihui.ui.model.stock;

import com.android.dazhihui.DzhApplication;
import com.android.dazhihui.a.b.g;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.c.b.a;
import com.android.dazhihui.ui.screen.BaseActivity;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class MenuManager
  implements i
{
  private static MenuManager s_Instance;
  private com.android.dazhihui.a.b.f jsonRequest;
  private MenuConfigVo mMenuConfigVo;
  private Runnable mRunnable;
  
  private void decode(String paramString)
  {
    try
    {
      this.mMenuConfigVo = new MenuConfigVo();
      this.mMenuConfigVo.header = new MenuConfigVo.Header();
      paramString = new JSONObject(paramString);
      Object localObject1 = paramString.getJSONObject("header");
      this.mMenuConfigVo.header.error = ((JSONObject)localObject1).optString("error", "");
      this.mMenuConfigVo.header.vs = ((JSONObject)localObject1).optString("vs", "");
      this.mMenuConfigVo.data = new MenuConfigVo.Data();
      this.mMenuConfigVo.data.indexdb = new ArrayList();
      this.mMenuConfigVo.data.newsIndex = new ArrayList();
      this.mMenuConfigVo.data.transIndex = new ArrayList();
      Object localObject2 = paramString.getJSONObject("data");
      paramString = ((JSONObject)localObject2).optJSONArray("indexdb");
      localObject1 = ((JSONObject)localObject2).optJSONArray("newsIndex");
      localObject2 = ((JSONObject)localObject2).optJSONArray("transIndex");
      manage(paramString, this.mMenuConfigVo.data.indexdb);
      manage((JSONArray)localObject1, this.mMenuConfigVo.data.newsIndex);
      manage((JSONArray)localObject2, this.mMenuConfigVo.data.transIndex);
      return;
    }
    catch (Exception paramString) {}
  }
  
  public static MenuManager getInstance()
  {
    if (s_Instance == null) {}
    try
    {
      if (s_Instance == null) {
        s_Instance = new MenuManager();
      }
      return s_Instance;
    }
    finally {}
  }
  
  private void manage(JSONArray paramJSONArray, List<MenuConfigVo.FirstMenuItem> paramList)
  {
    if (paramJSONArray != null)
    {
      int i = 0;
      while (i < paramJSONArray.length())
      {
        MenuConfigVo.FirstMenuItem localFirstMenuItem = new MenuConfigVo.FirstMenuItem();
        Object localObject = paramJSONArray.optJSONObject(i);
        localFirstMenuItem.id = ((JSONObject)localObject).optInt("id", 0);
        localFirstMenuItem.type = ((JSONObject)localObject).optInt("type", 0);
        localFirstMenuItem.countid = ((JSONObject)localObject).optInt("countid", 0);
        localFirstMenuItem.menuflag = ((JSONObject)localObject).optInt("menuflag", 0);
        localFirstMenuItem.fname = ((JSONObject)localObject).optString("fname", "");
        localFirstMenuItem.urlPath = ((JSONObject)localObject).optString("urlPath", "");
        localFirstMenuItem.subnames = new ArrayList();
        localObject = ((JSONObject)localObject).optJSONArray("subnames");
        if (localObject != null)
        {
          int j = 0;
          while (j < ((JSONArray)localObject).length())
          {
            MenuConfigVo.SecondMenuItem localSecondMenuItem = new MenuConfigVo.SecondMenuItem();
            JSONObject localJSONObject = ((JSONArray)localObject).optJSONObject(j);
            localSecondMenuItem.id = localJSONObject.optInt("id", 0);
            localSecondMenuItem.type = localJSONObject.optInt("type", 0);
            localSecondMenuItem.countid = localJSONObject.optInt("countid", 0);
            localSecondMenuItem.menuflag = localJSONObject.optInt("menuflag", 0);
            localSecondMenuItem.name = localJSONObject.optString("name", "");
            localSecondMenuItem.urlPath = localJSONObject.optString("urlPath", "");
            localFirstMenuItem.subnames.add(localSecondMenuItem);
            j += 1;
          }
        }
        paramList.add(localFirstMenuItem);
        i += 1;
      }
    }
  }
  
  private void sendJsonRequest(BaseActivity paramBaseActivity)
  {
    this.jsonRequest = new com.android.dazhihui.a.b.f();
    this.jsonRequest.c(com.android.dazhihui.a.f.V);
    this.jsonRequest.a(this);
    paramBaseActivity.sendRequest(this.jsonRequest);
  }
  
  public List<MenuConfigVo.FirstMenuItem> getMarketMenu()
  {
    if ((this.mMenuConfigVo != null) && (this.mMenuConfigVo.data != null)) {
      return this.mMenuConfigVo.data.indexdb;
    }
    return null;
  }
  
  public List<MenuConfigVo.FirstMenuItem> getNewsMenu()
  {
    if ((this.mMenuConfigVo != null) && (this.mMenuConfigVo.data != null)) {
      return this.mMenuConfigVo.data.newsIndex;
    }
    return null;
  }
  
  public List<MenuConfigVo.FirstMenuItem> getTradeMenu()
  {
    if ((this.mMenuConfigVo != null) && (this.mMenuConfigVo.data != null)) {
      return this.mMenuConfigVo.data.transIndex;
    }
    return null;
  }
  
  public String getVs()
  {
    if ((this.mMenuConfigVo != null) && (this.mMenuConfigVo.header != null)) {
      return this.mMenuConfigVo.header.vs;
    }
    return "";
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    if (paramh == this.jsonRequest) {}
    try
    {
      decode(new String(((g)paramj).a()));
      if (this.mMenuConfigVo != null)
      {
        this.mMenuConfigVo.time = System.currentTimeMillis();
        DzhApplication.a().b().a("MenuConfigVo", this.mMenuConfigVo);
        if (this.mRunnable != null) {
          this.mRunnable.run();
        }
      }
      return;
    }
    catch (Exception paramh) {}
  }
  
  public void handleTimeout(h paramh) {}
  
  public void loadMenuConfig(BaseActivity paramBaseActivity)
  {
    MenuConfigVo localMenuConfigVo = (MenuConfigVo)DzhApplication.a().b().a("MenuConfigVo", new MenuManager.1(this));
    if ((localMenuConfigVo == null) || (localMenuConfigVo.data == null) || (localMenuConfigVo.header == null)) {}
    for (this.mMenuConfigVo = null;; this.mMenuConfigVo = localMenuConfigVo)
    {
      if ((this.mMenuConfigVo == null) || (!this.mMenuConfigVo.isSameDay())) {
        sendJsonRequest(paramBaseActivity);
      }
      return;
    }
  }
  
  public void netException(h paramh, Exception paramException) {}
  
  public void setMenuLoadListener(Runnable paramRunnable)
  {
    this.mRunnable = paramRunnable;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\MenuManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */