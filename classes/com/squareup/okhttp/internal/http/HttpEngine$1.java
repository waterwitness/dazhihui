package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.internal.Util;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.CacheResponse;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class HttpEngine$1
  extends CacheResponse
{
  public InputStream getBody()
  {
    return new ByteArrayInputStream(Util.EMPTY_BYTE_ARRAY);
  }
  
  public Map<String, List<String>> getHeaders()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put(null, Collections.singletonList("HTTP/1.1 504 Gateway Timeout"));
    return localHashMap;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\http\HttpEngine$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */