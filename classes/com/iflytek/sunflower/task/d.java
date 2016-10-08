package com.iflytek.sunflower.task;

import android.app.ActivityManager;
import android.app.ActivityManager.RecentTaskInfo;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.iflytek.sunflower.c.g;
import com.iflytek.sunflower.config.a;
import com.iflytek.sunflower.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class d
  extends Thread
{
  private com.iflytek.sunflower.b.b a;
  private JSONObject b;
  private Context c;
  private String d;
  private HashMap<String, String> e;
  
  public d(Context paramContext, JSONObject paramJSONObject, String paramString, HashMap<String, String> paramHashMap)
  {
    this.c = paramContext.getApplicationContext();
    this.b = paramJSONObject;
    this.d = paramString;
    this.e = paramHashMap;
  }
  
  private boolean c()
  {
    if (this.e != null) {
      return Boolean.parseBoolean((String)this.e.get(com.iflytek.sunflower.config.b.j));
    }
    return false;
  }
  
  private boolean d()
  {
    if (this.e != null) {
      return Boolean.parseBoolean((String)this.e.get(com.iflytek.sunflower.config.b.k));
    }
    return false;
  }
  
  private boolean e()
  {
    boolean bool2 = true;
    boolean bool1;
    if (this.e != null) {
      bool1 = Boolean.parseBoolean((String)this.e.get(com.iflytek.sunflower.config.b.i));
    }
    String str;
    do
    {
      long l;
      do
      {
        return bool1;
        l = com.iflytek.sunflower.d.a(this.c).getLong(com.iflytek.sunflower.config.b.h, 0L);
        bool1 = bool2;
      } while (System.currentTimeMillis() - l >= a.r);
      str = com.iflytek.sunflower.d.d(this.c);
      bool1 = bool2;
    } while (com.iflytek.sunflower.d.a(this.c, str) >= a.s);
    return false;
  }
  
  private JSONObject f()
  {
    JSONObject localJSONObject = this.b;
    if (localJSONObject == null) {
      return null;
    }
    try
    {
      localJSONObject.put("type", this.d);
      return localJSONObject;
    }
    catch (Exception localException)
    {
      g.d("Collector", "input error " + localException);
    }
    return localJSONObject;
  }
  
  public JSONArray a()
  {
    try
    {
      JSONArray localJSONArray = new JSONArray();
      PackageManager localPackageManager = this.c.getPackageManager();
      List localList = localPackageManager.getInstalledPackages(0);
      int i = 0;
      while (i < localList.size())
      {
        PackageInfo localPackageInfo = (PackageInfo)localList.get(i);
        if ((localPackageInfo.applicationInfo.flags & 0x1) == 0)
        {
          JSONObject localJSONObject = new JSONObject();
          localJSONObject.put(localPackageInfo.packageName, localPackageInfo.applicationInfo.loadLabel(localPackageManager).toString());
          localJSONArray.put(localJSONObject);
        }
        i += 1;
      }
      return localException;
    }
    catch (Exception localException)
    {
      return null;
    }
  }
  
  public void a(String paramString)
  {
    String str = com.iflytek.sunflower.d.d(this.c);
    paramString = str;
    try
    {
      Object localObject;
      JSONObject localJSONObject;
      if (c())
      {
        paramString = str;
        localObject = a();
        if (localObject != null)
        {
          paramString = str;
          localJSONObject = new JSONObject();
          paramString = str;
          localJSONObject.put("appinfo", localObject);
          paramString = str;
          localJSONObject.put("ts", System.currentTimeMillis());
          paramString = str;
          localObject = "," + localJSONObject.toString();
          paramString = str;
          com.iflytek.sunflower.d.a(this.c, (String)localObject, str, 32768);
        }
      }
      paramString = str;
      if (d())
      {
        paramString = str;
        localObject = b();
        if (localObject != null)
        {
          paramString = str;
          localJSONObject = new JSONObject();
          paramString = str;
          localJSONObject.put("hisinfo", localObject);
          paramString = str;
          localJSONObject.put("ts", System.currentTimeMillis());
          paramString = str;
          localObject = "," + localJSONObject.toString();
          paramString = str;
          com.iflytek.sunflower.d.a(this.c, (String)localObject, str, 32768);
        }
      }
      paramString = str;
      if (e())
      {
        paramString = str;
        localObject = com.iflytek.sunflower.d.f(this.c);
        if (localObject == null) {
          return;
        }
        paramString = str;
        localObject = "[" + ((String)localObject).substring(1) + "]";
        paramString = str;
        str = com.iflytek.sunflower.d.d(this.c);
        paramString = str;
        if (!TextUtils.isEmpty(str))
        {
          paramString = str;
          this.c.deleteFile(str);
        }
        paramString = str;
        localObject = new JSONArray((String)localObject);
        paramString = str;
        localJSONObject = new JSONObject();
        paramString = str;
        localJSONObject.put("log", localObject);
        paramString = str;
        localObject = e.a(localJSONObject, e.a(this.c));
        paramString = str;
        g.e("Collector", "send: " + ((JSONObject)localObject).toString());
        paramString = str;
        this.a = new com.iflytek.sunflower.b.b(this.c);
        paramString = str;
        this.a.a((JSONObject)localObject, 1);
        return;
      }
    }
    catch (JSONException localJSONException)
    {
      this.c.deleteFile(paramString);
      return;
    }
    catch (Exception paramString)
    {
      g.f("Collector", "send error" + paramString);
    }
  }
  
  public JSONArray b()
  {
    try
    {
      JSONArray localJSONArray = new JSONArray();
      PackageManager localPackageManager = this.c.getPackageManager();
      Iterator localIterator = ((ActivityManager)this.c.getSystemService("activity")).getRecentTasks(20, 1).iterator();
      while (localIterator.hasNext())
      {
        ResolveInfo localResolveInfo = localPackageManager.resolveActivity(((ActivityManager.RecentTaskInfo)localIterator.next()).baseIntent, 0);
        if (localResolveInfo != null)
        {
          JSONObject localJSONObject = new JSONObject();
          localJSONObject.put(localResolveInfo.activityInfo.packageName, localResolveInfo.loadLabel(localPackageManager).toString());
          localJSONArray.put(localJSONObject);
        }
      }
      return localException;
    }
    catch (Exception localException)
    {
      return null;
    }
  }
  
  public void run()
  {
    Object localObject = f();
    String str = "";
    if (localObject != null) {}
    try
    {
      str = "," + ((JSONObject)localObject).toString();
      localObject = com.iflytek.sunflower.d.d(this.c);
      com.iflytek.sunflower.d.a(this.c, str, (String)localObject, 32768);
      a(str);
      return;
    }
    catch (Exception localException)
    {
      g.f("Collector", "send error" + localException);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\sunflower\task\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */