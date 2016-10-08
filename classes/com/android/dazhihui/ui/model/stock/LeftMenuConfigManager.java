package com.android.dazhihui.ui.model.stock;

import com.android.dazhihui.DzhApplication;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.c.b.a;
import com.android.dazhihui.ui.model.stock.market.LeftMenuConfigVo;
import com.android.dazhihui.ui.model.stock.market.LeftMenuConfigVo.Data;
import com.android.dazhihui.ui.model.stock.market.LeftMenuConfigVo.Header;
import com.android.dazhihui.ui.model.stock.market.LeftMenuConfigVo.LeftMenuItem;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class LeftMenuConfigManager
  implements i
{
  public static LeftMenuConfigManager s_Instance;
  private com.android.dazhihui.a.b.f leftMenuConfigRequest;
  private LeftMenuConfigVo mLeftMenuConfigVo;
  private LeftMenuConfigManager.leftDataHaveListener mleftDataHaveListener;
  
  public static LeftMenuConfigManager getInstace()
  {
    if (s_Instance == null) {
      s_Instance = new LeftMenuConfigManager();
    }
    return s_Instance;
  }
  
  public void LoadLeftMenuConfig()
  {
    LeftMenuConfigVo localLeftMenuConfigVo = (LeftMenuConfigVo)DzhApplication.a().b().a("LeftMenuConfigVo", new LeftMenuConfigManager.1(this));
    if ((localLeftMenuConfigVo == null) || (localLeftMenuConfigVo.header == null) || (localLeftMenuConfigVo.data == null)) {}
    for (this.mLeftMenuConfigVo = null;; this.mLeftMenuConfigVo = localLeftMenuConfigVo)
    {
      if ((this.mLeftMenuConfigVo == null) || (!this.mLeftMenuConfigVo.isSameDay())) {
        sendLeftMenuConfigRequest();
      }
      return;
    }
  }
  
  public void decode(String paramString)
  {
    try
    {
      this.mLeftMenuConfigVo = new LeftMenuConfigVo();
      this.mLeftMenuConfigVo.header = new LeftMenuConfigVo.Header();
      this.mLeftMenuConfigVo.data = new LeftMenuConfigVo.Data();
      paramString = new JSONObject(paramString);
      Object localObject = paramString.getJSONObject("header");
      this.mLeftMenuConfigVo.header.vs = ((JSONObject)localObject).getString("vs");
      this.mLeftMenuConfigVo.header.isTable = ((JSONObject)localObject).getInt("isTable");
      paramString = paramString.getJSONObject("data");
      this.mLeftMenuConfigVo.data.menuItems = new ArrayList();
      paramString = paramString.getJSONArray("config");
      if (paramString != null)
      {
        int i = 0;
        while (i < paramString.length())
        {
          localObject = new LeftMenuConfigVo.LeftMenuItem();
          JSONObject localJSONObject = paramString.optJSONObject(i);
          ((LeftMenuConfigVo.LeftMenuItem)localObject).countId = localJSONObject.getInt("countid");
          ((LeftMenuConfigVo.LeftMenuItem)localObject).imagepath = localJSONObject.getString("imagepath");
          ((LeftMenuConfigVo.LeftMenuItem)localObject).menuname = localJSONObject.getString("menuname");
          ((LeftMenuConfigVo.LeftMenuItem)localObject).callurl = localJSONObject.getString("callurl");
          this.mLeftMenuConfigVo.data.menuItems.add(localObject);
          i += 1;
        }
      }
      return;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
  }
  
  public List<LeftMenuConfigVo.LeftMenuItem> getLeftMenu()
  {
    if ((this.mLeftMenuConfigVo != null) && (this.mLeftMenuConfigVo.data != null)) {
      return this.mLeftMenuConfigVo.data.menuItems;
    }
    return null;
  }
  
  public LeftMenuConfigVo.Header getLeftMenuHeader()
  {
    if ((this.mLeftMenuConfigVo != null) && (this.mLeftMenuConfigVo.header != null)) {
      return this.mLeftMenuConfigVo.header;
    }
    return null;
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    if (paramh == this.leftMenuConfigRequest) {}
    try
    {
      decode(new String(((com.android.dazhihui.a.b.g)paramj).a()));
      if ((this.mLeftMenuConfigVo != null) && (this.mLeftMenuConfigVo.data.menuItems.size() > 0))
      {
        paramh = new SimpleDateFormat("yyyyMMdd").format(new Date(System.currentTimeMillis()));
        this.mLeftMenuConfigVo.time = paramh;
        DzhApplication.a().b().a("LeftMenuConfigVo", this.mLeftMenuConfigVo);
        this.mleftDataHaveListener.leftDataHave();
      }
      return;
    }
    catch (Exception paramh)
    {
      paramh.printStackTrace();
    }
  }
  
  public void handleTimeout(h paramh) {}
  
  public void netException(h paramh, Exception paramException) {}
  
  public void sendLeftMenuConfigRequest()
  {
    this.leftMenuConfigRequest = new com.android.dazhihui.a.b.f();
    this.leftMenuConfigRequest.c(com.android.dazhihui.a.f.g);
    this.leftMenuConfigRequest.a(this);
    com.android.dazhihui.a.g.a().a(this.leftMenuConfigRequest);
  }
  
  public void setLeftDataHaveListener(LeftMenuConfigManager.leftDataHaveListener paramleftDataHaveListener)
  {
    this.mleftDataHaveListener = paramleftDataHaveListener;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\LeftMenuConfigManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */