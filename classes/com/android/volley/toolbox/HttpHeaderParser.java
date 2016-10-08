package com.android.volley.toolbox;

import com.android.volley.Cache.Entry;
import com.android.volley.NetworkResponse;
import java.util.Date;
import java.util.Map;
import org.apache.http.impl.cookie.DateParseException;
import org.apache.http.impl.cookie.DateUtils;

public class HttpHeaderParser
{
  public static Cache.Entry parseCacheHeaders(NetworkResponse paramNetworkResponse)
  {
    long l6 = System.currentTimeMillis();
    Map localMap = paramNetworkResponse.headers;
    long l3 = 0L;
    long l2 = 0L;
    long l1 = 0L;
    Object localObject1 = (String)localMap.get("Date");
    if (localObject1 != null) {
      l3 = parseDateAsEpoch((String)localObject1);
    }
    localObject1 = (String)localMap.get("Cache-Control");
    int i;
    if (localObject1 != null)
    {
      localObject1 = ((String)localObject1).split(",");
      j = 0;
      i = 0;
      l1 = 0L;
      l2 = 0L;
      if (j < localObject1.length) {}
    }
    for (int j = 1;; j = 0)
    {
      localObject1 = (String)localMap.get("Expires");
      if (localObject1 != null) {}
      for (long l5 = parseDateAsEpoch((String)localObject1);; l5 = 0L)
      {
        localObject1 = (String)localMap.get("Last-Modified");
        if (localObject1 != null) {}
        for (long l4 = parseDateAsEpoch((String)localObject1);; l4 = 0L)
        {
          localObject1 = (String)localMap.get("ETag");
          if (j != 0)
          {
            l2 = l6 + 1000L * l2;
            if (i != 0) {
              l1 = l2;
            }
          }
          for (;;)
          {
            label167:
            Object localObject2 = new Cache.Entry();
            ((Cache.Entry)localObject2).data = paramNetworkResponse.data;
            ((Cache.Entry)localObject2).etag = ((String)localObject1);
            ((Cache.Entry)localObject2).softTtl = l2;
            ((Cache.Entry)localObject2).ttl = l1;
            ((Cache.Entry)localObject2).serverDate = l3;
            ((Cache.Entry)localObject2).lastModified = l4;
            ((Cache.Entry)localObject2).responseHeaders = localMap;
            return (Cache.Entry)localObject2;
            localObject2 = localObject1[j].trim();
            if ((((String)localObject2).equals("no-cache")) || (((String)localObject2).equals("no-store"))) {
              return null;
            }
            if (((String)localObject2).startsWith("max-age=")) {}
            for (;;)
            {
              try
              {
                l5 = Long.parseLong(((String)localObject2).substring(8));
                l4 = l1;
              }
              catch (Exception localException2)
              {
                l4 = l1;
                l5 = l2;
                continue;
                l1 = 0L;
                l2 = 0L;
              }
              j += 1;
              l1 = l4;
              l2 = l5;
              break;
              if (((String)localObject2).startsWith("stale-while-revalidate=")) {}
              try
              {
                l4 = Long.parseLong(((String)localObject2).substring(23));
                l5 = l2;
              }
              catch (Exception localException1)
              {
                l4 = l1;
                l5 = l2;
              }
              if (!((String)localObject2).equals("must-revalidate"))
              {
                l4 = l1;
                l5 = l2;
                if (!((String)localObject2).equals("proxy-revalidate")) {}
              }
              else
              {
                i = 1;
                l4 = l1;
                l5 = l2;
                continue;
                l1 = 1000L * l1 + l2;
                break label167;
                if ((l3 <= 0L) || (l5 < l3)) {
                  continue;
                }
                l1 = l5 - l3 + l6;
                l2 = l1;
                break label167;
              }
            }
          }
        }
      }
      i = 0;
    }
  }
  
  public static String parseCharset(Map<String, String> paramMap)
  {
    return parseCharset(paramMap, "ISO-8859-1");
  }
  
  public static String parseCharset(Map<String, String> paramMap, String paramString)
  {
    paramMap = (String)paramMap.get("Content-Type");
    int i;
    if (paramMap != null)
    {
      paramMap = paramMap.split(";");
      i = 1;
    }
    for (;;)
    {
      if (i >= paramMap.length) {
        return paramString;
      }
      String[] arrayOfString = paramMap[i].trim().split("=");
      if ((arrayOfString.length == 2) && (arrayOfString[0].equals("charset"))) {
        return arrayOfString[1];
      }
      i += 1;
    }
  }
  
  public static long parseDateAsEpoch(String paramString)
  {
    try
    {
      long l = DateUtils.parseDate(paramString).getTime();
      return l;
    }
    catch (DateParseException paramString) {}
    return 0L;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\volley\toolbox\HttpHeaderParser.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */