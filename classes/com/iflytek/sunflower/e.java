package com.iflytek.sunflower;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.text.TextUtils;
import com.iflytek.sunflower.a.b;
import com.iflytek.sunflower.a.c;
import com.iflytek.sunflower.c.g;
import com.iflytek.sunflower.config.Version;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class e
{
  public static JSONObject a(Context paramContext)
  {
    Object localObject1 = com.iflytek.sunflower.c.a.a(paramContext);
    ((com.iflytek.sunflower.c.f)localObject1).a("lang", com.iflytek.sunflower.config.a.o);
    if (TextUtils.isEmpty(com.iflytek.sunflower.config.a.v)) {
      ((com.iflytek.sunflower.c.f)localObject1).a("deviceid", com.iflytek.sunflower.c.e.b(paramContext));
    }
    for (;;)
    {
      if (!TextUtils.isEmpty(com.iflytek.sunflower.config.a.x)) {
        ((com.iflytek.sunflower.c.f)localObject1).a("net.mac", com.iflytek.sunflower.config.a.x);
      }
      ((com.iflytek.sunflower.c.f)localObject1).a("appid", com.iflytek.sunflower.c.e.f(paramContext));
      ((com.iflytek.sunflower.c.f)localObject1).a("caller.appid", com.iflytek.sunflower.config.a.w);
      com.iflytek.sunflower.config.a.e = com.iflytek.sunflower.c.e.g(paramContext);
      ((com.iflytek.sunflower.c.f)localObject1).a("channel", com.iflytek.sunflower.config.a.e);
      ((com.iflytek.sunflower.c.f)localObject1).a("ver", Version.getVersion());
      ((com.iflytek.sunflower.c.f)localObject1).a("logtime", "" + System.currentTimeMillis());
      Object localObject2 = e(paramContext);
      if (!TextUtils.isEmpty((CharSequence)localObject2)) {
        ((com.iflytek.sunflower.c.f)localObject1).a("userId", (String)localObject2);
      }
      ((com.iflytek.sunflower.c.f)localObject1).a("carrier", com.iflytek.sunflower.c.e.c(paramContext));
      localObject1 = a(false, (com.iflytek.sunflower.c.f)localObject1, "header");
      int i = d(paramContext);
      if (i != -1) {}
      try
      {
        ((JSONObject)localObject1).put("gender", i);
        i = c(paramContext);
        if (i != -1) {}
        try
        {
          ((JSONObject)localObject1).put("age", i);
          if (com.iflytek.sunflower.config.a.n.booleanValue()) {}
          try
          {
            localObject2 = com.iflytek.sunflower.c.e.d(paramContext);
            if (localObject2 != null)
            {
              DecimalFormat localDecimalFormat = new DecimalFormat("#.########");
              ((JSONObject)localObject1).put("lat", localDecimalFormat.format(((Location)localObject2).getLatitude()));
              ((JSONObject)localObject1).put("lng", localDecimalFormat.format(((Location)localObject2).getLongitude()));
              ((JSONObject)localObject1).put("gpstime", ((Location)localObject2).getTime());
            }
          }
          catch (JSONException localJSONException1)
          {
            for (;;) {}
          }
          paramContext = b(paramContext);
          if (paramContext != null) {}
          try
          {
            if (paramContext.length == 2)
            {
              ((JSONObject)localObject1).put("dntr", paramContext[0]);
              ((JSONObject)localObject1).put("uptr", paramContext[1]);
            }
            return (JSONObject)localObject1;
          }
          catch (JSONException paramContext)
          {
            return (JSONObject)localObject1;
          }
          ((com.iflytek.sunflower.c.f)localObject1).a("deviceid", com.iflytek.sunflower.config.a.v);
        }
        catch (JSONException localJSONException2)
        {
          for (;;) {}
        }
      }
      catch (JSONException localJSONException3)
      {
        for (;;) {}
      }
    }
  }
  
  public static JSONObject a(com.iflytek.sunflower.a.a parama, JSONObject paramJSONObject)
  {
    for (;;)
    {
      try
      {
        localJSONObject = new JSONObject();
        localJSONObject.put("sid", parama.a);
        localJSONObject.put("ts", parama.b);
        if (paramJSONObject != null) {
          continue;
        }
        parama = new JSONObject();
      }
      catch (JSONException parama)
      {
        JSONObject localJSONObject;
        parama = paramJSONObject;
        continue;
        parama = paramJSONObject;
        continue;
      }
      try
      {
        if (parama.has("boot"))
        {
          JSONArray localJSONArray = parama.getJSONArray("boot");
          paramJSONObject = localJSONArray;
          if (localJSONArray == null) {
            paramJSONObject = new JSONArray();
          }
          paramJSONObject.put(localJSONObject);
          parama.put("boot", paramJSONObject);
          return parama;
        }
        paramJSONObject = new JSONArray();
        continue;
        g.d("Collector", "add boot to json error");
      }
      catch (JSONException paramJSONObject) {}
    }
    return parama;
  }
  
  public static JSONObject a(b paramb, JSONObject paramJSONObject)
  {
    JSONObject localJSONObject;
    JSONArray localJSONArray;
    try
    {
      localJSONObject = new JSONObject();
      localJSONObject.put("sid", paramb.a);
      localJSONObject.put("ts", paramb.b);
      localJSONObject.put("dur", paramb.c);
      localJSONArray = new JSONArray();
      if (paramb.d != null)
      {
        paramb = paramb.d.iterator();
        while (paramb.hasNext())
        {
          localJSONArray.put((String)paramb.next());
          continue;
          g.d("Collector", "add close to json error");
        }
      }
    }
    catch (JSONException paramb)
    {
      paramb = paramJSONObject;
    }
    for (;;)
    {
      return paramb;
      localJSONObject.put("page", localJSONArray);
      if (paramJSONObject == null) {
        paramb = new JSONObject();
      }
      try
      {
        for (;;)
        {
          if (paramb.has("close"))
          {
            localJSONArray = paramb.getJSONArray("close");
            paramJSONObject = localJSONArray;
            if (localJSONArray != null) {}
          }
          for (paramJSONObject = new JSONArray();; paramJSONObject = new JSONArray())
          {
            paramJSONObject.put(localJSONObject);
            paramb.put("close", paramJSONObject);
            return paramb;
          }
          paramb = paramJSONObject;
        }
      }
      catch (JSONException paramJSONObject) {}
    }
  }
  
  public static JSONObject a(com.iflytek.sunflower.a.d paramd)
  {
    JSONObject localJSONObject1 = new JSONObject();
    localJSONObject1.put("id", paramd.b);
    localJSONObject1.put("ts", paramd.f);
    if ((paramd.c != null) && (!"".equals(paramd.c))) {
      localJSONObject1.put("label", paramd.c);
    }
    if (paramd.d != null)
    {
      JSONObject localJSONObject2 = new JSONObject();
      Iterator localIterator = paramd.d.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        localJSONObject2.put((String)localEntry.getKey(), localEntry.getValue());
      }
      localJSONObject1.put("udmap", localJSONObject2);
    }
    localJSONObject1.put("dur", paramd.e);
    return localJSONObject1;
  }
  
  public static JSONObject a(ArrayList<com.iflytek.sunflower.a.d> paramArrayList)
  {
    JSONObject localJSONObject = new JSONObject();
    JSONArray localJSONArray;
    try
    {
      localJSONArray = new JSONArray();
      synchronized (f.c)
      {
        paramArrayList = paramArrayList.iterator();
        if (paramArrayList.hasNext()) {
          localJSONArray.put(a((com.iflytek.sunflower.a.d)paramArrayList.next()));
        }
      }
    }
    catch (JSONException paramArrayList)
    {
      g.d("Collector", "convert event to Json error.");
      f.e();
      return null;
    }
    localJSONObject.put(com.iflytek.sunflower.config.a.f, localJSONArray);
    return localJSONObject;
  }
  
  public static JSONObject a(JSONArray paramJSONArray, JSONObject paramJSONObject)
  {
    if (paramJSONObject == null)
    {
      paramJSONObject = new JSONObject();
      try
      {
        paramJSONObject.put("error", paramJSONArray);
        return paramJSONObject;
      }
      catch (JSONException paramJSONArray)
      {
        g.d("Collector", "mergeError error");
        return paramJSONObject;
      }
    }
    try
    {
      JSONArray localJSONArray = paramJSONObject.optJSONArray("error");
      if (localJSONArray != null)
      {
        int i = 0;
        while (i < localJSONArray.length())
        {
          paramJSONArray.put(localJSONArray.get(i));
          i += 1;
        }
      }
      paramJSONObject.put("error", paramJSONArray);
      return paramJSONObject;
    }
    catch (JSONException paramJSONArray)
    {
      g.d("Collector", "mergeError error");
    }
    return paramJSONObject;
  }
  
  public static JSONObject a(JSONObject paramJSONObject1, JSONObject paramJSONObject2)
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("header", paramJSONObject2);
      localJSONObject.put("body", paramJSONObject1);
      return localJSONObject;
    }
    catch (JSONException paramJSONObject1)
    {
      g.d("Collector", "package to json error");
    }
    return localJSONObject;
  }
  
  public static JSONObject a(boolean paramBoolean, com.iflytek.sunflower.c.f paramf, String paramString)
  {
    JSONObject localJSONObject1 = new JSONObject();
    localJSONObject2 = new JSONObject();
    paramf = paramf.c().entrySet().iterator();
    try
    {
      while (paramf.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramf.next();
        localJSONObject2.put((String)localEntry.getKey(), localEntry.getValue());
      }
      return localJSONObject2;
    }
    catch (JSONException paramf)
    {
      g.d("Collector", "convert hashParam to json error");
      while (paramBoolean)
      {
        return localJSONObject1;
        localJSONObject1.put(paramString, localJSONObject2);
      }
    }
  }
  
  public static JSONArray b(ArrayList<c> paramArrayList)
  {
    localJSONArray = new JSONArray();
    try
    {
      paramArrayList = paramArrayList.iterator();
      while (paramArrayList.hasNext())
      {
        c localc = (c)paramArrayList.next();
        JSONObject localJSONObject = new JSONObject();
        localJSONObject.put("sid", localc.a);
        localJSONObject.put("ts", localc.c);
        localJSONObject.put("msg", localc.b);
        localJSONArray.put(localJSONObject);
      }
      return localJSONArray;
    }
    catch (JSONException paramArrayList)
    {
      g.d("Collector", "convert error to Json error.");
      f.f();
      return null;
    }
  }
  
  public static JSONObject b(JSONObject paramJSONObject1, JSONObject paramJSONObject2)
  {
    int j = 0;
    if (paramJSONObject1 == null) {
      return paramJSONObject2;
    }
    if (paramJSONObject2 == null)
    {
      paramJSONObject2 = new JSONObject();
      localJSONArray = new JSONArray();
      localJSONArray.put(paramJSONObject1);
      try
      {
        paramJSONObject2.put("event", localJSONArray);
        return paramJSONObject2;
      }
      catch (JSONException paramJSONObject1)
      {
        g.d("Collector", "mergeEvent error");
        return paramJSONObject2;
      }
    }
    JSONArray localJSONArray = paramJSONObject2.optJSONArray("event");
    if (localJSONArray == null)
    {
      localJSONArray = new JSONArray();
      localJSONArray.put(paramJSONObject1);
      try
      {
        paramJSONObject2.put("event", localJSONArray);
        return paramJSONObject2;
      }
      catch (JSONException paramJSONObject1)
      {
        g.d("Collector", "mergeEvent error");
        return paramJSONObject2;
      }
    }
    int i = 0;
    if ((i >= localJSONArray.length()) || (localJSONArray.optJSONObject(i).has(com.iflytek.sunflower.config.a.f)))
    {
      if (i < localJSONArray.length()) {
        break label172;
      }
      localJSONArray.put(paramJSONObject1);
    }
    for (;;)
    {
      try
      {
        paramJSONObject2.put("event", localJSONArray);
        return paramJSONObject2;
      }
      catch (JSONException paramJSONObject1)
      {
        g.d("Collector", "mergeEvent error");
        return paramJSONObject2;
      }
      i += 1;
      break;
      label172:
      paramJSONObject1 = paramJSONObject1.optJSONArray(com.iflytek.sunflower.config.a.f);
      while (j < paramJSONObject1.length())
      {
        localJSONArray.optJSONObject(i).optJSONArray(com.iflytek.sunflower.config.a.f).put(paramJSONObject1.optJSONObject(j));
        j += 1;
      }
    }
  }
  
  public static long[] b(Context paramContext)
  {
    try
    {
      com.iflytek.sunflower.c.a.a = com.iflytek.sunflower.c.e.e(paramContext);
      g.a("Collector", "dntr:" + com.iflytek.sunflower.c.a.a[0] + ",updr:" + com.iflytek.sunflower.c.a.a[1]);
      long[] arrayOfLong = new long[2];
      arrayOfLong[0] = com.iflytek.sunflower.c.a.a[0];
      arrayOfLong[1] = com.iflytek.sunflower.c.a.a[1];
      if ((arrayOfLong[0] > 0L) && (arrayOfLong[1] > 0L))
      {
        paramContext = d.a(paramContext);
        long l1 = paramContext.getLong("dntr", -2L);
        long l2 = paramContext.getLong("uptr", -2L);
        if ((l2 < -1L) || (l1 < -1L)) {
          break label193;
        }
        arrayOfLong[0] -= l1;
        arrayOfLong[1] -= l2;
        if (arrayOfLong[0] > 0L)
        {
          l1 = arrayOfLong[1];
          paramContext = arrayOfLong;
          if (l1 > 0L) {
            break label191;
          }
        }
        return null;
      }
    }
    catch (Exception paramContext)
    {
      g.c("Collector", "sdk less than 2.2 has get no traffic");
      return null;
    }
    paramContext = null;
    label191:
    return paramContext;
    label193:
    return null;
  }
  
  public static int c(Context paramContext)
  {
    return d.a(paramContext).getInt("age", -1);
  }
  
  public static int d(Context paramContext)
  {
    return d.a(paramContext).getInt("gender", -1);
  }
  
  public static String e(Context paramContext)
  {
    return d.a(paramContext).getString("user_id", "");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\sunflower\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */