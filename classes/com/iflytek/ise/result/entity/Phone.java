package com.iflytek.ise.result.entity;

import java.util.HashMap;

public class Phone
{
  public static HashMap<String, String> phone_map = new HashMap();
  public int beg_pos;
  public String content;
  public int dp_message;
  public int end_pos;
  public int time_len;
  
  static
  {
    phone_map.put("aa", "ɑ:");
    phone_map.put("oo", "ɔ");
    phone_map.put("ae", "æ");
    phone_map.put("ah", "ʌ");
    phone_map.put("ao", "ɔ:");
    phone_map.put("aw", "aʊ");
    phone_map.put("ax", "ə");
    phone_map.put("ay", "aɪ");
    phone_map.put("eh", "e");
    phone_map.put("er", "ə:");
    phone_map.put("ey", "eɪ");
    phone_map.put("ih", "ɪ");
    phone_map.put("iy", "i:");
    phone_map.put("ow", "əʊ");
    phone_map.put("oy", "ɔɪ");
    phone_map.put("uh", "ʊ");
    phone_map.put("uw", "ʊ:");
    phone_map.put("ch", "tʃ");
    phone_map.put("dh", "ð");
    phone_map.put("hh", "h");
    phone_map.put("jh", "dʒ");
    phone_map.put("ng", "ŋ");
    phone_map.put("sh", "ʃ");
    phone_map.put("th", "θ");
    phone_map.put("zh", "ʒ");
    phone_map.put("y", "j");
    phone_map.put("d", "d");
    phone_map.put("k", "k");
    phone_map.put("l", "l");
    phone_map.put("m", "m");
    phone_map.put("n", "n");
    phone_map.put("b", "b");
    phone_map.put("f", "f");
    phone_map.put("g", "g");
    phone_map.put("p", "p");
    phone_map.put("r", "r");
    phone_map.put("s", "s");
    phone_map.put("t", "t");
    phone_map.put("v", "v");
    phone_map.put("w", "w");
    phone_map.put("z", "z");
    phone_map.put("ar", "eə");
    phone_map.put("ir", "iə");
    phone_map.put("ur", "ʊə");
    phone_map.put("tr", "tr");
    phone_map.put("dr", "dr");
    phone_map.put("ts", "ts");
    phone_map.put("dz", "dz");
  }
  
  public static String getStdSymbol(String paramString)
  {
    String str = (String)phone_map.get(paramString);
    if (str == null) {
      return paramString;
    }
    return str;
  }
  
  public String getStdSymbol()
  {
    return getStdSymbol(this.content);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\ise\result\entity\Phone.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */