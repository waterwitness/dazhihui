package com.alipay.sdk.g;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class b
{
  public a a;
  public String[] b;
  private String c;
  
  private b(String paramString, a parama)
  {
    this.c = paramString;
    this.a = parama;
  }
  
  public static List<b> a(JSONObject paramJSONObject)
  {
    ArrayList localArrayList = new ArrayList();
    if (paramJSONObject == null) {
      return localArrayList;
    }
    Object localObject = paramJSONObject.optString("name", "");
    paramJSONObject = null;
    if (!TextUtils.isEmpty((CharSequence)localObject)) {
      paramJSONObject = ((String)localObject).split(";");
    }
    int i = 0;
    while (i < paramJSONObject.length)
    {
      localObject = a.a(paramJSONObject[i]);
      if (localObject != a.a)
      {
        localObject = new b(paramJSONObject[i], (a)localObject);
        ((b)localObject).b = a(paramJSONObject[i]);
        localArrayList.add(localObject);
      }
      i += 1;
    }
    return localArrayList;
  }
  
  private static String[] a(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    int i = paramString.indexOf('(');
    int j = paramString.lastIndexOf(')');
    if ((i == -1) || (j == -1) || (j <= i)) {
      return null;
    }
    paramString = paramString.substring(i + 1, j).split(",");
    if (paramString != null)
    {
      i = 0;
      while (i < paramString.length)
      {
        if (!TextUtils.isEmpty(paramString[i])) {
          localArrayList.add(paramString[i].trim().replaceAll("'", "").replaceAll("\"", ""));
        }
        i += 1;
      }
    }
    return (String[])localArrayList.toArray(new String[0]);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\sdk\g\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */