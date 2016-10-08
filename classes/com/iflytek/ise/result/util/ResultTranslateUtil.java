package com.iflytek.ise.result.util;

import java.util.HashMap;

public class ResultTranslateUtil
{
  private static HashMap<Integer, String> dp_message_map = new HashMap();
  private static HashMap<String, String> special_content_map = new HashMap();
  
  static
  {
    dp_message_map.put(Integer.valueOf(0), "正常");
    dp_message_map.put(Integer.valueOf(16), "漏读");
    dp_message_map.put(Integer.valueOf(32), "增读");
    dp_message_map.put(Integer.valueOf(64), "回读");
    dp_message_map.put(Integer.valueOf(128), "替换");
    special_content_map.put("sil", "静音");
    special_content_map.put("silv", "静音");
    special_content_map.put("fil", "噪音");
  }
  
  public static String getContent(String paramString)
  {
    String str = (String)special_content_map.get(paramString);
    if (str == null) {
      return paramString;
    }
    return str;
  }
  
  public static String getDpMessageInfo(int paramInt)
  {
    return (String)dp_message_map.get(Integer.valueOf(paramInt));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\ise\result\util\ResultTranslateUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */