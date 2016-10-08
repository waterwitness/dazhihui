package com.tencent.qalhttp;

import com.tencent.qalsdk.im_open.http.ResponsePrivate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class QALHttpResponse
{
  private JSONObject JSONResp = null;
  private long age = 0L;
  private byte[] body = new byte[0];
  public int bodyLen = 0;
  private List<String> cache_control = null;
  private String content_type = null;
  private String date = null;
  private String etag = null;
  private String expires = null;
  private String last_modified = null;
  private String location = null;
  private Map<String, String> otherHeaders = null;
  private String pragma = null;
  public http.ResponsePrivate responsePrivate;
  private String server = null;
  private List<String> set_cookie = null;
  private int status;
  private String strResp = null;
  private String via = null;
  private List<String> x_cache = null;
  private List<String> x_cache_lookup = null;
  
  private String listToString(List<String> paramList)
  {
    if (paramList == null) {
      return null;
    }
    String str = new String();
    int i = 0;
    while (i < paramList.size())
    {
      str = str + (String)paramList.get(i);
      str = str + ",";
      i += 1;
    }
    if (str.length() > 2)
    {
      str.substring(0, str.length() - 1);
      return str;
    }
    return null;
  }
  
  public long getAge()
  {
    return this.age;
  }
  
  public Map<String, String> getAllHeaders()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("Content-Type", this.content_type);
    localHashMap.put("Location", this.location);
    localHashMap.put("Date", this.date);
    localHashMap.put("Server", this.server);
    localHashMap.put("Via", this.via);
    localHashMap.put("X-Cache", listToString(this.x_cache));
    localHashMap.put("X-Cache-Lookup", listToString(this.x_cache_lookup));
    localHashMap.put("Age", String.valueOf(this.age));
    localHashMap.put("Last_Modified", this.last_modified);
    localHashMap.put("Etag", this.etag);
    localHashMap.put("Cache-Control", listToString(this.cache_control));
    localHashMap.put("Expires", this.expires);
    localHashMap.put("Pragma", this.pragma);
    localHashMap.put("Set-Cookie", listToString(this.set_cookie));
    if (this.otherHeaders != null) {
      localHashMap.putAll(this.otherHeaders);
    }
    return localHashMap;
  }
  
  public byte[] getBody()
  {
    return this.body;
  }
  
  public List<String> getCacheControl()
  {
    return this.cache_control;
  }
  
  public String getContentType()
  {
    return this.content_type;
  }
  
  public String getDate()
  {
    return this.date;
  }
  
  public String getEtag()
  {
    return this.etag;
  }
  
  public String getExpires()
  {
    return this.expires;
  }
  
  public JSONObject getJSONObjectResp()
  {
    return this.JSONResp;
  }
  
  public String getLastModified()
  {
    return this.last_modified;
  }
  
  public String getLocation()
  {
    return this.location;
  }
  
  public Map<String, String> getOtherHeaders()
  {
    return this.otherHeaders;
  }
  
  public String getPragma()
  {
    return this.pragma;
  }
  
  public String getServer()
  {
    return this.server;
  }
  
  public List<String> getSetCookie()
  {
    return this.set_cookie;
  }
  
  public int getStatus()
  {
    return this.status;
  }
  
  public String getStringResp()
  {
    return this.strResp;
  }
  
  public String getVia()
  {
    return this.via;
  }
  
  public List<String> getXCache()
  {
    return this.x_cache;
  }
  
  public List<String> getXCacheLookup()
  {
    return this.x_cache_lookup;
  }
  
  void setAge(long paramLong)
  {
    this.age = paramLong;
  }
  
  void setBody(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return;
    }
    this.body = paramArrayOfByte;
  }
  
  void setCacheControl(List<String> paramList)
  {
    this.cache_control = paramList;
  }
  
  void setContentType(String paramString)
  {
    this.content_type = paramString;
  }
  
  void setDate(String paramString)
  {
    this.date = paramString;
  }
  
  void setEtag(String paramString)
  {
    this.etag = paramString;
  }
  
  void setExpires(String paramString)
  {
    this.expires = paramString;
  }
  
  void setJSONObjectResp(JSONObject paramJSONObject)
  {
    this.JSONResp = paramJSONObject;
  }
  
  void setLastModified(String paramString)
  {
    this.last_modified = paramString;
  }
  
  void setLocation(String paramString)
  {
    this.location = paramString;
  }
  
  void setOtherHeaders(Map<String, String> paramMap)
  {
    this.otherHeaders = paramMap;
  }
  
  void setPragma(String paramString)
  {
    this.pragma = paramString;
  }
  
  void setServer(String paramString)
  {
    this.server = paramString;
  }
  
  void setSetCookie(List<String> paramList)
  {
    this.set_cookie = paramList;
  }
  
  void setStatus(int paramInt)
  {
    this.status = paramInt;
  }
  
  void setStringResp(String paramString)
  {
    this.strResp = paramString;
  }
  
  void setVia(String paramString)
  {
    this.via = paramString;
  }
  
  void setXCache(List<String> paramList)
  {
    this.x_cache = paramList;
  }
  
  void setXCacheLookup(List<String> paramList)
  {
    this.x_cache_lookup = paramList;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalhttp\QALHttpResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */