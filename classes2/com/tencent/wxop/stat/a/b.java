package com.tencent.wxop.stat.a;

import org.json.JSONArray;
import org.json.JSONObject;

public final class b
{
  public String a;
  public JSONArray bl;
  public JSONObject bm = null;
  
  public b() {}
  
  public b(String paramString)
  {
    this.a = paramString;
    this.bm = new JSONObject();
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == null) {}
    do
    {
      return false;
      if (this == paramObject) {
        return true;
      }
    } while (!(paramObject instanceof b));
    paramObject = (b)paramObject;
    return toString().equals(((b)paramObject).toString());
  }
  
  public final int hashCode()
  {
    return toString().hashCode();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(32);
    localStringBuilder.append(this.a).append(",");
    if (this.bl != null) {
      localStringBuilder.append(this.bl.toString());
    }
    if (this.bm != null) {
      localStringBuilder.append(this.bm.toString());
    }
    return localStringBuilder.toString();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\wxop\stat\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */