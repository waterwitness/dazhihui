package com.iflytek.sunflower.task;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.iflytek.sunflower.OnlineConfigListener;
import com.iflytek.sunflower.c.c;
import com.iflytek.sunflower.c.f;
import com.iflytek.sunflower.c.g;
import com.iflytek.sunflower.c.h;
import com.iflytek.sunflower.config.b;
import com.iflytek.sunflower.d;
import org.json.JSONObject;

public class a
  extends e
{
  private Context b;
  
  public a(Context paramContext, OnlineConfigListener paramOnlineConfigListener)
  {
    super(paramContext, paramOnlineConfigListener);
    this.b = paramContext;
  }
  
  private JSONObject b()
  {
    com.iflytek.sunflower.c.a.a(new f(), this.b);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("type", "app_list");
      localJSONObject.put("appid", com.iflytek.sunflower.c.e.f(this.b));
      localJSONObject.put("pver", "2");
      g.e("Collector", localJSONObject.toString());
      return localJSONObject;
    }
    catch (Exception localException)
    {
      g.f("Collector", "exception occur while upload app list");
    }
    return null;
  }
  
  protected void a()
  {
    super.a();
    try
    {
      Object localObject = b();
      if (h.a(this.b))
      {
        localObject = c.a(((JSONObject)localObject).toString().getBytes("utf-8"));
        com.iflytek.sunflower.b.a locala = new com.iflytek.sunflower.b.a();
        locala.b(20000);
        locala.a(1);
        locala.a("http://data.openspeech.cn/index.php/clientrequest/clientcollect/isCollect", "", (byte[])localObject);
        locala.b(this.a);
        return;
      }
      g.f("Collector", "upload app list error, please check net state");
      return;
    }
    catch (Exception localException)
    {
      g.f("Collector", "exception occur while upload app list");
    }
  }
  
  protected void a(JSONObject paramJSONObject)
  {
    super.a(paramJSONObject);
    g.e("Collector", "get app list config result: " + paramJSONObject.toString());
    long l1 = (Float.parseFloat(paramJSONObject.optString(b.q)) * 3600.0F);
    long l2 = (Float.parseFloat(paramJSONObject.optString(b.s)) * 3600.0F);
    long l3 = (Float.parseFloat(paramJSONObject.optString(b.u)) * 3600.0F);
    Boolean localBoolean = Boolean.valueOf(false);
    if ("yes".equalsIgnoreCase(paramJSONObject.optString(b.w))) {
      localBoolean = Boolean.valueOf(true);
    }
    paramJSONObject = d.a(this.b).edit();
    paramJSONObject.putLong(b.q, Long.valueOf(l1).longValue());
    paramJSONObject.putLong(b.s, Long.valueOf(l2).longValue());
    paramJSONObject.putLong(b.u, Long.valueOf(l3).longValue());
    paramJSONObject.putBoolean(b.w, localBoolean.booleanValue());
    paramJSONObject.commit();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\sunflower\task\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */