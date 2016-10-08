package com.iflytek.sunflower.task;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.iflytek.sunflower.config.a;
import com.iflytek.sunflower.config.b;
import com.iflytek.sunflower.d;
import com.iflytek.sunflower.f;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

public class g
  extends Thread
{
  private Context a;
  
  public g(Context paramContext)
  {
    this.a = paramContext.getApplicationContext();
  }
  
  public SharedPreferences.Editor a(SharedPreferences paramSharedPreferences, ArrayList<com.iflytek.sunflower.a.e> paramArrayList, long paramLong1, long paramLong2)
  {
    paramLong1 = paramLong2 - paramLong1;
    paramLong2 = paramSharedPreferences.getLong(b.d, 0L);
    SharedPreferences.Editor localEditor = paramSharedPreferences.edit();
    Object localObject2;
    Object localObject1;
    if (a.i.booleanValue())
    {
      com.iflytek.sunflower.c.g.b("Collector", "saveActivity start");
      if (paramArrayList.size() > 0)
      {
        localObject2 = paramSharedPreferences.getString(b.e, "");
        localObject1 = new StringBuilder();
        if (!TextUtils.isEmpty((CharSequence)localObject2))
        {
          ((StringBuilder)localObject1).append((String)localObject2);
          ((StringBuilder)localObject1).append(";");
        }
        paramArrayList = paramArrayList.iterator();
        while (paramArrayList.hasNext())
        {
          localObject2 = (com.iflytek.sunflower.a.e)paramArrayList.next();
          ((StringBuilder)localObject1).append(String.format("[\"%s\",%d]", new Object[] { ((com.iflytek.sunflower.a.e)localObject2).a, Long.valueOf(((com.iflytek.sunflower.a.e)localObject2).b) }));
          ((StringBuilder)localObject1).append(";");
        }
        ((StringBuilder)localObject1).deleteCharAt(((StringBuilder)localObject1).length() - 1);
        localEditor.remove(b.e);
        localEditor.putString(b.e, ((StringBuilder)localObject1).toString());
      }
      com.iflytek.sunflower.c.g.b("Collector", "saveActivity end");
    }
    for (;;)
    {
      localEditor.putLong(b.d, paramLong1 + paramLong2);
      localEditor.commit();
      paramSharedPreferences = paramSharedPreferences.getString(b.e, "");
      com.iflytek.sunflower.c.g.b("Collector", "page sp:" + paramSharedPreferences);
      return localEditor;
      localObject1 = paramSharedPreferences.getString(b.e, "");
      localObject2 = a.h;
      paramArrayList = (ArrayList<com.iflytek.sunflower.a.e>)localObject1;
      if (!TextUtils.isEmpty((CharSequence)localObject1)) {
        paramArrayList = (String)localObject1 + ";";
      }
      paramArrayList = paramArrayList + String.format("[\"%s\",%d]", new Object[] { localObject2, Long.valueOf(paramLong1) });
      localEditor.remove(b.e);
      localEditor.putString(b.e, paramArrayList);
    }
  }
  
  public void a()
  {
    Object localObject1 = d.a(this.a);
    if (localObject1 == null)
    {
      com.iflytek.sunflower.c.g.c("Collector", "sharedpreferences is null");
      return;
    }
    a.f = ((SharedPreferences)localObject1).getString(b.a, null);
    long l1 = ((SharedPreferences)localObject1).getLong(b.b, -1L);
    if ((l1 == -1L) || (a.f == null))
    {
      com.iflytek.sunflower.c.g.c("Collector", "onPause called before onResume");
      return;
    }
    long l2 = System.currentTimeMillis();
    ((SharedPreferences)localObject1).edit();
    if (a.i.booleanValue())
    {
      localObject1 = a((SharedPreferences)localObject1, f.b, l1, l2);
      f.g();
    }
    for (;;)
    {
      ((SharedPreferences.Editor)localObject1).putLong(b.b, -1L);
      ((SharedPreferences.Editor)localObject1).putLong(b.c, l2);
      ((SharedPreferences.Editor)localObject1).commit();
      Object localObject2 = d.e(this.a);
      ArrayList localArrayList = f.a();
      localObject1 = localObject2;
      if (localArrayList.size() != 0)
      {
        localObject1 = com.iflytek.sunflower.e.b(com.iflytek.sunflower.e.a(localArrayList), (JSONObject)localObject2);
        f.e();
      }
      localArrayList = f.b();
      localObject2 = localObject1;
      if (localArrayList.size() != 0)
      {
        localObject2 = com.iflytek.sunflower.e.a(com.iflytek.sunflower.e.b(localArrayList), (JSONObject)localObject1);
        f.f();
      }
      if (localObject2 == null) {
        break;
      }
      d.a(this.a, ((JSONObject)localObject2).toString(), null, 0);
      return;
      localObject1 = a((SharedPreferences)localObject1, null, l1, l2);
    }
  }
  
  public void run()
  {
    try
    {
      a();
      return;
    }
    catch (Exception localException)
    {
      com.iflytek.sunflower.c.g.d("Collector", "call onPause error:" + localException);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\sunflower\task\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */