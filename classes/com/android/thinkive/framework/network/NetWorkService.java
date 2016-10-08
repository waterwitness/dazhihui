package com.android.thinkive.framework.network;

import android.content.Context;
import android.text.TextUtils;
import com.android.thinkive.framework.ThinkiveInitializer;
import com.android.thinkive.framework.cache.Cache;
import com.android.thinkive.framework.cache.Cache.Entry;
import com.android.thinkive.framework.cache.DataDiskCache;
import com.android.thinkive.framework.cache.DataMemoryCache;
import com.android.thinkive.framework.config.ConfigManager;
import com.android.thinkive.framework.network.http.HttpRequestBean;
import com.android.thinkive.framework.network.http.HttpService;
import com.android.thinkive.framework.network.socket.SocketService;
import com.android.thinkive.framework.storage.MemoryStorage;
import com.android.thinkive.framework.util.FormatUtil;
import com.android.thinkive.framework.util.Log;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class NetWorkService
{
  private static final String DEFAULT_CACHE_DIR = "thinkive_network";
  private static NetWorkService sInstance;
  private Context mContext = ThinkiveInitializer.getInstance().getContext();
  private DataDiskCache mDiskCache = new DataDiskCache(new File(this.mContext.getCacheDir(), "thinkive_network"));
  private HttpService mHttpService = HttpService.getInstance();
  private DataMemoryCache mMemoryCache;
  private SocketService mSocketService = SocketService.getInstance();
  
  private NetWorkService()
  {
    this.mDiskCache.initialize();
    this.mMemoryCache = DataMemoryCache.getInstance();
  }
  
  private JSONObject getCacheData(RequestBean paramRequestBean, Cache paramCache)
  {
    String str = paramRequestBean.getUrlName();
    if ((paramRequestBean instanceof HttpRequestBean)) {}
    for (str = ((HttpRequestBean)paramRequestBean).getUrlAddress();; str = ConfigManager.getInstance().getAddressConfigValue(str))
    {
      paramRequestBean = paramCache.get(buildCacheKey(str, paramRequestBean.getParam()));
      if ((paramRequestBean == null) || (paramRequestBean.isExpired())) {
        break label93;
      }
      try
      {
        paramRequestBean = new JSONObject(new String(paramRequestBean.data, "UTF-8"));
        return paramRequestBean;
      }
      catch (JSONException paramRequestBean)
      {
        paramRequestBean.printStackTrace();
        return null;
      }
      catch (UnsupportedEncodingException paramRequestBean)
      {
        paramRequestBean.printStackTrace();
      }
    }
    label93:
    return null;
  }
  
  public static NetWorkService getInstance()
  {
    try
    {
      if (sInstance == null) {
        sInstance = new NetWorkService();
      }
      NetWorkService localNetWorkService = sInstance;
      return localNetWorkService;
    }
    finally {}
  }
  
  public String buildCacheKey(String paramString, HashMap<String, String> paramHashMap)
  {
    if (paramHashMap == null) {
      return paramString;
    }
    paramHashMap = paramHashMap.entrySet().iterator();
    StringBuilder localStringBuilder = new StringBuilder();
    for (;;)
    {
      if (!paramHashMap.hasNext())
      {
        if (localStringBuilder.length() <= 1) {
          break;
        }
        return paramString + localStringBuilder.subSequence(0, localStringBuilder.length() - 1);
      }
      Object localObject = (Map.Entry)paramHashMap.next();
      String str = (String)((Map.Entry)localObject).getKey();
      localObject = (String)((Map.Entry)localObject).getValue();
      localStringBuilder.append(str).append("=").append((String)localObject).append("&");
    }
  }
  
  /* Error */
  public void clearCache(CacheType paramCacheType)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic 218	com/android/thinkive/framework/network/CacheType:DISK	Lcom/android/thinkive/framework/network/CacheType;
    //   5: aload_1
    //   6: if_acmpeq +17 -> 23
    //   9: getstatic 221	com/android/thinkive/framework/network/CacheType:DISKANDUPDATE	Lcom/android/thinkive/framework/network/CacheType;
    //   12: aload_1
    //   13: if_acmpeq +10 -> 23
    //   16: getstatic 224	com/android/thinkive/framework/network/CacheType:DISK_W	Lcom/android/thinkive/framework/network/CacheType;
    //   19: aload_1
    //   20: if_acmpne +13 -> 33
    //   23: aload_0
    //   24: getfield 68	com/android/thinkive/framework/network/NetWorkService:mDiskCache	Lcom/android/thinkive/framework/cache/DataDiskCache;
    //   27: invokevirtual 227	com/android/thinkive/framework/cache/DataDiskCache:clear	()V
    //   30: aload_0
    //   31: monitorexit
    //   32: return
    //   33: getstatic 230	com/android/thinkive/framework/network/CacheType:MEMORY	Lcom/android/thinkive/framework/network/CacheType;
    //   36: aload_1
    //   37: if_acmpeq +17 -> 54
    //   40: getstatic 233	com/android/thinkive/framework/network/CacheType:MEMORYANDUPDATE	Lcom/android/thinkive/framework/network/CacheType;
    //   43: aload_1
    //   44: if_acmpeq +10 -> 54
    //   47: getstatic 236	com/android/thinkive/framework/network/CacheType:MEMORY_W	Lcom/android/thinkive/framework/network/CacheType;
    //   50: aload_1
    //   51: if_acmpne -21 -> 30
    //   54: aload_0
    //   55: getfield 78	com/android/thinkive/framework/network/NetWorkService:mMemoryCache	Lcom/android/thinkive/framework/cache/DataMemoryCache;
    //   58: invokevirtual 237	com/android/thinkive/framework/cache/DataMemoryCache:clear	()V
    //   61: goto -31 -> 30
    //   64: astore_1
    //   65: aload_0
    //   66: monitorexit
    //   67: aload_1
    //   68: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	69	0	this	NetWorkService
    //   0	69	1	paramCacheType	CacheType
    // Exception table:
    //   from	to	target	type
    //   2	23	64	finally
    //   23	30	64	finally
    //   33	54	64	finally
    //   54	61	64	finally
  }
  
  public JSONObject getCacheData(RequestBean paramRequestBean, CacheType paramCacheType)
  {
    paramCacheType = null;
    if ((paramRequestBean.getCacheType() == CacheType.DISK) || (paramRequestBean.getCacheType() == CacheType.DISKANDUPDATE) || (paramRequestBean.getCacheType() == CacheType.DISK_W)) {
      paramCacheType = getCacheData(paramRequestBean, this.mDiskCache);
    }
    while ((paramRequestBean.getCacheType() != CacheType.MEMORY) && (paramRequestBean.getCacheType() != CacheType.MEMORYANDUPDATE) && (paramRequestBean.getCacheType() != CacheType.MEMORY_W)) {
      return paramCacheType;
    }
    return getCacheData(paramRequestBean, this.mMemoryCache);
  }
  
  public String getCookie(String paramString)
  {
    paramString = FormatUtil.formatUrlToKey(paramString);
    return new MemoryStorage().loadData(paramString);
  }
  
  /* Error */
  public void putCache(String paramString, Cache.Entry paramEntry, CacheType paramCacheType)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic 218	com/android/thinkive/framework/network/CacheType:DISK	Lcom/android/thinkive/framework/network/CacheType;
    //   5: aload_3
    //   6: if_acmpeq +17 -> 23
    //   9: getstatic 221	com/android/thinkive/framework/network/CacheType:DISKANDUPDATE	Lcom/android/thinkive/framework/network/CacheType;
    //   12: aload_3
    //   13: if_acmpeq +10 -> 23
    //   16: getstatic 224	com/android/thinkive/framework/network/CacheType:DISK_W	Lcom/android/thinkive/framework/network/CacheType;
    //   19: aload_3
    //   20: if_acmpne +15 -> 35
    //   23: aload_0
    //   24: getfield 68	com/android/thinkive/framework/network/NetWorkService:mDiskCache	Lcom/android/thinkive/framework/cache/DataDiskCache;
    //   27: aload_1
    //   28: aload_2
    //   29: invokevirtual 262	com/android/thinkive/framework/cache/DataDiskCache:put	(Ljava/lang/String;Lcom/android/thinkive/framework/cache/Cache$Entry;)V
    //   32: aload_0
    //   33: monitorexit
    //   34: return
    //   35: getstatic 230	com/android/thinkive/framework/network/CacheType:MEMORY	Lcom/android/thinkive/framework/network/CacheType;
    //   38: aload_3
    //   39: if_acmpeq +17 -> 56
    //   42: getstatic 233	com/android/thinkive/framework/network/CacheType:MEMORYANDUPDATE	Lcom/android/thinkive/framework/network/CacheType;
    //   45: aload_3
    //   46: if_acmpeq +10 -> 56
    //   49: getstatic 236	com/android/thinkive/framework/network/CacheType:MEMORY_W	Lcom/android/thinkive/framework/network/CacheType;
    //   52: aload_3
    //   53: if_acmpne -21 -> 32
    //   56: aload_0
    //   57: getfield 78	com/android/thinkive/framework/network/NetWorkService:mMemoryCache	Lcom/android/thinkive/framework/cache/DataMemoryCache;
    //   60: aload_1
    //   61: aload_2
    //   62: invokevirtual 263	com/android/thinkive/framework/cache/DataMemoryCache:put	(Ljava/lang/String;Lcom/android/thinkive/framework/cache/Cache$Entry;)V
    //   65: goto -33 -> 32
    //   68: astore_1
    //   69: aload_0
    //   70: monitorexit
    //   71: aload_1
    //   72: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	73	0	this	NetWorkService
    //   0	73	1	paramString	String
    //   0	73	2	paramEntry	Cache.Entry
    //   0	73	3	paramCacheType	CacheType
    // Exception table:
    //   from	to	target	type
    //   2	23	68	finally
    //   23	32	68	finally
    //   35	56	68	finally
    //   56	65	68	finally
  }
  
  public void release()
  {
    if (this.mSocketService != null) {
      this.mSocketService.release();
    }
    if (this.mHttpService != null) {
      this.mHttpService.release();
    }
    if (this.mMemoryCache != null) {
      this.mMemoryCache.clear();
    }
    if (sInstance != null) {
      sInstance = null;
    }
  }
  
  /* Error */
  public void removeCache(String paramString, CacheType paramCacheType)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic 218	com/android/thinkive/framework/network/CacheType:DISK	Lcom/android/thinkive/framework/network/CacheType;
    //   5: aload_2
    //   6: if_acmpeq +17 -> 23
    //   9: getstatic 221	com/android/thinkive/framework/network/CacheType:DISKANDUPDATE	Lcom/android/thinkive/framework/network/CacheType;
    //   12: aload_2
    //   13: if_acmpeq +10 -> 23
    //   16: getstatic 224	com/android/thinkive/framework/network/CacheType:DISK_W	Lcom/android/thinkive/framework/network/CacheType;
    //   19: aload_2
    //   20: if_acmpne +14 -> 34
    //   23: aload_0
    //   24: getfield 68	com/android/thinkive/framework/network/NetWorkService:mDiskCache	Lcom/android/thinkive/framework/cache/DataDiskCache;
    //   27: aload_1
    //   28: invokevirtual 272	com/android/thinkive/framework/cache/DataDiskCache:remove	(Ljava/lang/String;)V
    //   31: aload_0
    //   32: monitorexit
    //   33: return
    //   34: getstatic 230	com/android/thinkive/framework/network/CacheType:MEMORY	Lcom/android/thinkive/framework/network/CacheType;
    //   37: aload_2
    //   38: if_acmpeq +17 -> 55
    //   41: getstatic 233	com/android/thinkive/framework/network/CacheType:MEMORYANDUPDATE	Lcom/android/thinkive/framework/network/CacheType;
    //   44: aload_2
    //   45: if_acmpeq +10 -> 55
    //   48: getstatic 236	com/android/thinkive/framework/network/CacheType:MEMORY_W	Lcom/android/thinkive/framework/network/CacheType;
    //   51: aload_2
    //   52: if_acmpne -21 -> 31
    //   55: aload_0
    //   56: getfield 78	com/android/thinkive/framework/network/NetWorkService:mMemoryCache	Lcom/android/thinkive/framework/cache/DataMemoryCache;
    //   59: aload_1
    //   60: invokevirtual 273	com/android/thinkive/framework/cache/DataMemoryCache:remove	(Ljava/lang/String;)V
    //   63: goto -32 -> 31
    //   66: astore_1
    //   67: aload_0
    //   68: monitorexit
    //   69: aload_1
    //   70: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	71	0	this	NetWorkService
    //   0	71	1	paramString	String
    //   0	71	2	paramCacheType	CacheType
    // Exception table:
    //   from	to	target	type
    //   2	23	66	finally
    //   23	31	66	finally
    //   34	55	66	finally
    //   55	63	66	finally
  }
  
  public void request(RequestBean paramRequestBean, ResponseListener<JSONObject> paramResponseListener)
  {
    if (paramRequestBean == null) {}
    for (;;)
    {
      try
      {
        Log.w("network request error,requestBean is null!!!");
        return;
      }
      finally {}
      ProtocolType localProtocolType = paramRequestBean.getProtocolType();
      Object localObject = paramRequestBean.getUrlName();
      HashMap localHashMap = paramRequestBean.getParam();
      if (TextUtils.isEmpty((CharSequence)localObject))
      {
        Log.w("network request error,request urlName is null !!!");
      }
      else
      {
        if (paramRequestBean.shouldCache())
        {
          localObject = null;
          if ((paramRequestBean.getCacheType() != CacheType.DISK) && (paramRequestBean.getCacheType() != CacheType.DISKANDUPDATE)) {
            break label169;
          }
        }
        for (localObject = getCacheData(paramRequestBean, this.mDiskCache);; localObject = getCacheData(paramRequestBean, this.mMemoryCache)) {
          label169:
          do
          {
            if (localObject != null)
            {
              Log.d("return cache data!!!");
              paramResponseListener.onResponse(localObject);
              if ((paramRequestBean.getCacheType() == CacheType.DISK) || (paramRequestBean.getCacheType() == CacheType.MEMORY)) {
                break;
              }
            }
            if (localHashMap == null) {
              new HashMap();
            }
            paramRequestBean.setStartTime(System.currentTimeMillis());
            if (localProtocolType != ProtocolType.HTTP) {
              break label202;
            }
            this.mHttpService.jsonRequest(paramRequestBean, paramResponseListener);
            break;
          } while ((paramRequestBean.getCacheType() != CacheType.MEMORY) && (paramRequestBean.getCacheType() != CacheType.MEMORYANDUPDATE));
        }
        label202:
        if (localProtocolType == ProtocolType.SOCKET) {
          this.mSocketService.jsonRequest(paramRequestBean, paramResponseListener);
        }
      }
    }
  }
  
  public void setCookie(String paramString1, String paramString2)
  {
    Object localObject1 = "";
    String str = FormatUtil.formatUrlToDomain(paramString1);
    Object localObject2 = FormatUtil.formatUrlToIp(paramString1);
    int i = FormatUtil.formatUrlToPort(paramString1);
    if (!TextUtils.isEmpty(str)) {
      paramString1 = str + ":" + i;
    }
    for (;;)
    {
      new MemoryStorage().saveData(paramString1, paramString2);
      localObject1 = new LinkedHashMap();
      paramString2 = paramString2.split(";");
      i = 0;
      if (i < paramString2.length) {
        break;
      }
      HttpService.sCookieMap.put(paramString1, localObject1);
      return;
      paramString1 = (String)localObject1;
      if (!TextUtils.isEmpty((CharSequence)localObject2)) {
        paramString1 = localObject2 + ":" + i;
      }
    }
    localObject2 = paramString2[i].split("=");
    if (localObject2.length >= 2) {
      ((LinkedHashMap)localObject1).put(localObject2[0], localObject2[1]);
    }
    for (;;)
    {
      i += 1;
      break;
      ((LinkedHashMap)localObject1).put(localObject2[0], null);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\network\NetWorkService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */