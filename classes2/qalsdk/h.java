package qalsdk;

import org.json.JSONObject;

public class h
{
  public String a;
  public long b;
  public boolean c;
  
  public h() {}
  
  public h(String paramString, long paramLong, boolean paramBoolean)
  {
    this.a = paramString;
    this.b = paramLong;
    this.c = paramBoolean;
  }
  
  public static h a(JSONObject paramJSONObject)
  {
    try
    {
      paramJSONObject = new h(paramJSONObject.getString("ssid"), paramJSONObject.getLong("time"), paramJSONObject.getBoolean("available"));
      return paramJSONObject;
    }
    catch (Exception paramJSONObject)
    {
      paramJSONObject.printStackTrace();
    }
    return null;
  }
  
  public JSONObject a()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("ssid", this.a);
      localJSONObject.put("time", this.b);
      localJSONObject.put("available", this.c);
      return localJSONObject;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return null;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\qalsdk\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */