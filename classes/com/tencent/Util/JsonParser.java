package com.tencent.Util;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonParser
{
  public static String parseGrammarResult(String paramString)
  {
    localStringBuffer = new StringBuffer();
    try
    {
      paramString = new JSONObject(new JSONTokener(paramString)).getJSONArray("ws");
      int i = 0;
      while (i < paramString.length())
      {
        JSONArray localJSONArray = paramString.getJSONObject(i).getJSONArray("cw");
        int j = 0;
        while (j < localJSONArray.length())
        {
          JSONObject localJSONObject = localJSONArray.getJSONObject(j);
          if (localJSONObject.getString("w").contains("nomatch"))
          {
            localStringBuffer.append("没有匹配结果.");
            return localStringBuffer.toString();
          }
          localStringBuffer.append("【结果】" + localJSONObject.getString("w"));
          localStringBuffer.append("【置信度】" + localJSONObject.getInt("sc"));
          localStringBuffer.append("\n");
          j += 1;
        }
        i += 1;
      }
      return localStringBuffer.toString();
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
      localStringBuffer.append("没有匹配结果.");
    }
  }
  
  public static String parseIatResult(String paramString)
  {
    int i = 0;
    localStringBuffer = new StringBuffer();
    try
    {
      paramString = new JSONObject(new JSONTokener(paramString)).getJSONArray("ws");
      while (i < paramString.length())
      {
        localStringBuffer.append(paramString.getJSONObject(i).getJSONArray("cw").getJSONObject(0).getString("w"));
        i += 1;
      }
      return localStringBuffer.toString();
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
  }
  
  public static String parseLocalGrammarResult(String paramString)
  {
    localStringBuffer = new StringBuffer();
    try
    {
      paramString = new JSONObject(new JSONTokener(paramString));
      localJSONArray1 = paramString.getJSONArray("ws");
      i = 0;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        JSONArray localJSONArray1;
        int i;
        JSONArray localJSONArray2;
        int j;
        paramString.printStackTrace();
        localStringBuffer.append("没有匹配结果.");
        continue;
        i += 1;
      }
    }
    if (i < localJSONArray1.length())
    {
      localJSONArray2 = localJSONArray1.getJSONObject(i).getJSONArray("cw");
      j = 0;
      while (j < localJSONArray2.length())
      {
        JSONObject localJSONObject = localJSONArray2.getJSONObject(j);
        if (localJSONObject.getString("w").contains("nomatch"))
        {
          localStringBuffer.append("没有匹配结果.");
          return localStringBuffer.toString();
        }
        localStringBuffer.append("【结果】" + localJSONObject.getString("w"));
        localStringBuffer.append("\n");
        j += 1;
      }
    }
    localStringBuffer.append("【置信度】" + paramString.optInt("sc"));
    return localStringBuffer.toString();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\Util\JsonParser.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */