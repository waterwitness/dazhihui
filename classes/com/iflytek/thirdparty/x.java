package com.iflytek.thirdparty;

import android.os.SystemClock;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class x
{
  JSONObject a = new JSONObject();
  long b = 0L;
  long c = 0L;
  
  public String a()
  {
    try
    {
      String str = this.a.toString();
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void a(aa paramaa)
  {
    this.c = System.currentTimeMillis();
    this.b = SystemClock.elapsedRealtime();
    a("app_start", J.a(this.c), false);
    paramaa = paramaa.e("caller.appid");
    if (!TextUtils.isEmpty(paramaa)) {
      a("app_caller_appid", paramaa, false);
    }
    paramaa = G.a(null).e("app.ver.code");
    if (!TextUtils.isEmpty(paramaa)) {
      a("app_cver", paramaa, false);
    }
  }
  
  public void a(String paramString)
  {
    try
    {
      a(paramString, SystemClock.elapsedRealtime() - this.b, false);
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public void a(String paramString, long paramLong, boolean paramBoolean)
  {
    for (;;)
    {
      try
      {
        boolean bool = TextUtils.isEmpty(paramString);
        if (bool) {
          return;
        }
        if (!paramBoolean)
        {
          try
          {
            this.a.put(paramString, paramLong);
          }
          catch (JSONException paramString)
          {
            X.a(paramString);
          }
          continue;
        }
        localJSONArray2 = this.a.optJSONArray(paramString);
      }
      finally {}
      JSONArray localJSONArray2;
      JSONArray localJSONArray1 = localJSONArray2;
      if (localJSONArray2 == null)
      {
        localJSONArray1 = new JSONArray();
        this.a.put(paramString, localJSONArray1);
      }
      if (localJSONArray1 != null) {
        localJSONArray1.put(paramLong);
      }
    }
  }
  
  public void a(String paramString1, String paramString2, boolean paramBoolean)
  {
    for (;;)
    {
      try
      {
        if (!TextUtils.isEmpty(paramString1))
        {
          boolean bool = TextUtils.isEmpty(paramString2);
          if (!bool) {}
        }
        else
        {
          return;
        }
        if (!paramBoolean)
        {
          try
          {
            this.a.put(paramString1, paramString2);
          }
          catch (JSONException paramString1)
          {
            X.a(paramString1);
          }
          continue;
        }
        localJSONArray2 = this.a.optJSONArray(paramString1);
      }
      finally {}
      JSONArray localJSONArray2;
      JSONArray localJSONArray1 = localJSONArray2;
      if (localJSONArray2 == null)
      {
        localJSONArray1 = new JSONArray();
        this.a.put(paramString1, localJSONArray1);
      }
      if (localJSONArray1 != null) {
        localJSONArray1.put(paramString2);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */