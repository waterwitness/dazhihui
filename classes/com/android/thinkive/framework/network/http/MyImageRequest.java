package com.android.thinkive.framework.network.http;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.text.TextUtils;
import com.android.thinkive.framework.config.ConfigManager;
import com.android.thinkive.framework.storage.IStorage;
import com.android.thinkive.framework.storage.MemoryStorage;
import com.android.thinkive.framework.util.FormatUtil;
import com.android.thinkive.framework.util.Log;
import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.toolbox.ImageRequest;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MyImageRequest
  extends ImageRequest
{
  public static final String SET_COOKIE_KEY = "Set-Cookie";
  protected String COOKIE_KEY = "Cookie";
  
  public MyImageRequest(String paramString, Response.Listener<Bitmap> paramListener, int paramInt1, int paramInt2, Bitmap.Config paramConfig, Response.ErrorListener paramErrorListener)
  {
    super(paramString, paramListener, paramInt1, paramInt2, paramConfig, paramErrorListener);
    this.COOKIE_KEY = FormatUtil.formatUrlToKey(paramString);
    Log.d("myImage request COOKIE_KEY = " + this.COOKIE_KEY);
  }
  
  public void addSessionCookie(Map<String, String> paramMap)
  {
    String str = new MemoryStorage().loadData(this.COOKIE_KEY);
    if (!TextUtils.isEmpty(str))
    {
      Log.d("add session fullcookie to header: " + str);
      paramMap.put("Cookie", str);
    }
  }
  
  public Map<String, String> getHeaders()
  {
    Object localObject1 = super.getHeaders();
    if ((localObject1 == null) || (((Map)localObject1).equals(Collections.emptyMap()))) {
      localObject1 = new HashMap();
    }
    for (;;)
    {
      addSessionCookie((Map)localObject1);
      Object localObject2 = ConfigManager.getInstance().getSystemConfigValue("charset");
      if ((localObject2 == null) || (TextUtils.isEmpty((CharSequence)localObject2)))
      {
        ((Map)localObject1).put("charset", "UTF-8");
        localObject2 = ((Map)localObject1).keySet().iterator();
      }
      for (;;)
      {
        if (!((Iterator)localObject2).hasNext())
        {
          return (Map<String, String>)localObject1;
          ((Map)localObject1).put("charset", localObject2);
          break;
        }
        String str1 = (String)((Iterator)localObject2).next();
        String str2 = (String)((Map)localObject1).get(str1);
        Log.d("http headers key = " + str1 + "; value = " + str2);
      }
    }
  }
  
  protected Response<Bitmap> parseNetworkResponse(NetworkResponse paramNetworkResponse)
  {
    saveSessionCookie(paramNetworkResponse.headers);
    return super.parseNetworkResponse(paramNetworkResponse);
  }
  
  public void saveSessionCookie(Map<String, String> paramMap)
  {
    String str;
    Object localObject2;
    Object localObject1;
    int i;
    if (paramMap.containsKey("Set-Cookie"))
    {
      str = (String)paramMap.get("Set-Cookie");
      localObject2 = str.split(";");
      localObject1 = (LinkedHashMap)HttpService.sCookieMap.get(this.COOKIE_KEY);
      paramMap = (Map<String, String>)localObject1;
      if (localObject1 == null) {
        paramMap = new LinkedHashMap();
      }
      i = 0;
      if (i < localObject2.length) {
        break label167;
      }
      HttpService.sCookieMap.put(this.COOKIE_KEY, paramMap);
      paramMap = paramMap.entrySet().iterator();
      localObject1 = new StringBuilder();
    }
    for (;;)
    {
      if (!paramMap.hasNext())
      {
        paramMap = ((StringBuilder)localObject1).substring(0, ((StringBuilder)localObject1).length() - 1);
        Log.d("save image request header fullcookie = " + paramMap + " cookie = " + str);
        new MemoryStorage().saveData(this.COOKIE_KEY, paramMap);
        return;
        label167:
        localObject1 = localObject2[i].split("=");
        if (localObject1.length >= 2) {
          paramMap.put(localObject1[0], localObject1[1]);
        }
        for (;;)
        {
          i += 1;
          break;
          paramMap.put(localObject1[0], null);
        }
      }
      Object localObject3 = (Map.Entry)paramMap.next();
      localObject2 = (String)((Map.Entry)localObject3).getKey();
      localObject3 = (String)((Map.Entry)localObject3).getValue();
      if (localObject3 == null) {
        ((StringBuilder)localObject1).append((String)localObject2).append(";");
      } else {
        ((StringBuilder)localObject1).append((String)localObject2).append("=").append((String)localObject3).append(";");
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\network\http\MyImageRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */