package com.android.thinkive.framework.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.codehaus.jackson.map.DeserializationConfig.Feature;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.type.TypeFactory;
import org.json.JSONObject;

public class JsonParseUtil
{
  private static ObjectMapper mapper = new ObjectMapper();
  
  static
  {
    mapper.disable(new DeserializationConfig.Feature[] { DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES });
    mapper.configure(DeserializationConfig.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
  }
  
  public static JSONObject buildJsonFromObject()
  {
    return null;
  }
  
  public static HashMap<String, String> parseJsonToMap(String paramString)
  {
    try
    {
      paramString = (HashMap)mapper.readValue(paramString, HashMap.class);
      return paramString;
    }
    catch (IOException paramString)
    {
      paramString.printStackTrace();
    }
    return null;
  }
  
  public static HashMap<String, String> parseJsonToMap(JSONObject paramJSONObject)
  {
    try
    {
      paramJSONObject = (HashMap)mapper.readValue(paramJSONObject.toString(), HashMap.class);
      return paramJSONObject;
    }
    catch (IOException paramJSONObject)
    {
      paramJSONObject.printStackTrace();
    }
    return null;
  }
  
  public static <T> T parseJsonToObject(String paramString, Class<T> paramClass)
  {
    try
    {
      paramString = mapper.readValue(paramString.getBytes(), paramClass);
      return paramString;
    }
    catch (IOException paramString)
    {
      paramString.printStackTrace();
    }
    return null;
  }
  
  public static <T> T parseJsonToObject(JSONObject paramJSONObject, Class<T> paramClass)
  {
    try
    {
      paramJSONObject = mapper.readValue(paramJSONObject.toString().getBytes(), paramClass);
      return paramJSONObject;
    }
    catch (IOException paramJSONObject)
    {
      paramJSONObject.printStackTrace();
    }
    return null;
  }
  
  public static <T> List<T> paseJsonToList(String paramString, Class<T> paramClass)
  {
    try
    {
      paramString = (List)mapper.readValue(paramString.getBytes(), TypeFactory.collectionType(ArrayList.class, paramClass));
      return paramString;
    }
    catch (IOException paramString)
    {
      paramString.printStackTrace();
    }
    return null;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\util\JsonParseUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */