package com.iflytek.sunflower.b;

import android.content.Context;
import android.text.TextUtils;
import com.iflytek.sunflower.c.g;
import com.iflytek.sunflower.c.h;
import com.iflytek.sunflower.config.Version;
import com.iflytek.sunflower.d;
import org.json.JSONArray;
import org.json.JSONObject;

public class b
{
  public final String a = "cmd=statsdklog&logver=";
  private Context b;
  private int c = 0;
  
  public b(Context paramContext)
  {
    this.b = paramContext;
  }
  
  private void a()
  {
    switch (this.c)
    {
    }
    String str;
    do
    {
      return;
      str = d.c(this.b);
    } while (TextUtils.isEmpty(str));
    this.b.deleteFile(str);
  }
  
  private void a(JSONObject paramJSONObject)
  {
    Object localObject1 = null;
    if (paramJSONObject == null) {
      return;
    }
    try
    {
      switch (this.c)
      {
      case 0: 
        d.a(this.b, paramJSONObject.optJSONObject("body").toString(), null, 0);
        return;
      }
    }
    catch (Exception paramJSONObject)
    {
      g.c("Collector", "write to local error.", paramJSONObject);
      return;
    }
    String str = d.d(this.b);
    Object localObject2 = paramJSONObject.optJSONObject("body");
    paramJSONObject = (JSONObject)localObject1;
    if (localObject2 != null)
    {
      localObject2 = ((JSONObject)localObject2).optJSONArray("log");
      paramJSONObject = (JSONObject)localObject1;
      if (localObject2 != null)
      {
        paramJSONObject = ((JSONArray)localObject2).toString();
        paramJSONObject = "," + paramJSONObject.substring(1, paramJSONObject.length() - 1);
      }
    }
    d.a(this.b, paramJSONObject, str, 32768);
    return;
  }
  
  public void a(JSONObject paramJSONObject, int paramInt)
  {
    this.c = paramInt;
    try
    {
      if (h.a(this.b))
      {
        Object localObject = paramJSONObject.toString().getBytes("utf-8");
        byte[] arrayOfByte = com.iflytek.sunflower.c.c.a((byte[])localObject);
        a locala = new a();
        locala.b(20000);
        locala.a(1);
        c localc = new c(this, paramJSONObject);
        if (this.c == 0)
        {
          localObject = "cmd=statsdklog&logver=" + Version.getLogVersion() + "&size=" + localObject.length;
          locala.a(com.iflytek.sunflower.config.a.t, (String)localObject, arrayOfByte);
          d.a(this.b, com.iflytek.sunflower.config.b.g, Long.valueOf(System.currentTimeMillis()));
          locala.a(localc);
          locala.a();
          return;
        }
        localObject = "cmd=statsdklog&logver=" + Version.getCustomLogVersion() + "&size=" + localObject.length;
        locala.a(com.iflytek.sunflower.config.a.t, (String)localObject, arrayOfByte);
        d.a(this.b, com.iflytek.sunflower.config.b.h, Long.valueOf(System.currentTimeMillis()));
        locala.b(localc);
        return;
      }
    }
    catch (Exception localException)
    {
      g.d("Collector", "upload error.", localException);
      a(paramJSONObject);
      return;
    }
    g.d("Collector", "upload error please check net state");
    a(paramJSONObject);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\sunflower\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */