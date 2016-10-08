package com.android.thinkive.framework.util;

import android.text.TextUtils;
import android.util.Base64;
import com.android.thinkive.framework.config.ConfigManager;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class DataSignHelper
{
  private static final String AESKey = "thinkivethinkivethinkivethinkive";
  private static String SIGN_KEY = "";
  
  public static HashMap<String, String> generateSignDataMap(HashMap<String, String> paramHashMap)
  {
    HashMap localHashMap = new HashMap();
    String str1;
    if (TextUtils.isEmpty(SIGN_KEY))
    {
      str1 = ConfigManager.getInstance().getSystemConfigValue("signKey");
      if (TextUtils.isEmpty(str1)) {
        return paramHashMap;
      }
    }
    try
    {
      SIGN_KEY = new String(AESUtil.decrypt(Base64.decode(str1, 0), "thinkivethinkivethinkivethinkive".getBytes()));
      str1 = ConfigManager.getInstance().getSystemConfigValue("merchantId");
      localHashMap.put("bizcode", (String)paramHashMap.get("funcno"));
      localHashMap.put("sign_type", "md5");
      localHashMap.put("charset", "utf8");
      localHashMap.put("format", "json");
      localHashMap.put("merchant_id", str1);
      localHashMap.put("timestamp", String.valueOf(System.currentTimeMillis()));
      String str2 = ConfigManager.getInstance().getSystemConfigValue("shouldEncrypt");
      str1 = ConfigManager.getInstance().getSystemConfigValue("encryptMode").toLowerCase();
      if ((!TextUtils.isEmpty(str2)) && (Boolean.parseBoolean(str2))) {
        localHashMap.put("encry_mode", str1);
      }
      localHashMap.put("request_id", get32UUID());
      localHashMap.put("signKey", SIGN_KEY);
      localJSONObject = new JSONObject();
      paramHashMap = paramHashMap.entrySet().iterator();
      try
      {
        if (paramHashMap.hasNext()) {
          break label360;
        }
        Log.i("shouldEncrypt = " + str2 + " param json str = " + localJSONObject.toString());
        if ((TextUtils.isEmpty(str2)) || (!Boolean.parseBoolean(str2))) {
          break label457;
        }
        paramHashMap = null;
        if (!"aes".equals(str1)) {
          break label428;
        }
        SIGN_KEY = SIGN_KEY.substring(0, 16);
        paramHashMap = AESUtil.encrypt(localJSONObject.toString().getBytes(), SIGN_KEY.getBytes());
      }
      catch (JSONException paramHashMap)
      {
        for (;;)
        {
          Object localObject;
          String str3;
          paramHashMap.printStackTrace();
          paramHashMap = "";
          continue;
          if ("des".equals(localException))
          {
            paramHashMap = DESUtil.encrypt(localJSONObject.toString().getBytes(), SIGN_KEY.getBytes());
            continue;
            paramHashMap = Base64.encodeToString(localJSONObject.toString().getBytes("UTF-8"), 0);
          }
        }
      }
      catch (UnsupportedEncodingException paramHashMap)
      {
        for (;;)
        {
          paramHashMap.printStackTrace();
          paramHashMap = "";
        }
      }
      catch (Exception paramHashMap)
      {
        for (;;)
        {
          paramHashMap.printStackTrace();
          paramHashMap = "";
        }
      }
      paramHashMap = Base64.encodeToString(paramHashMap, 0);
      localHashMap.put("data", paramHashMap);
      paramHashMap = signData(localHashMap);
      Log.e("signDataMap = " + paramHashMap);
      return paramHashMap;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
        continue;
        label360:
        localObject = (Map.Entry)paramHashMap.next();
        str3 = (String)((Map.Entry)localObject).getKey();
        localObject = (String)((Map.Entry)localObject).getValue();
        if (!str3.equals("funcno")) {
          localJSONObject.put(str3, localObject);
        }
      }
    }
  }
  
  private static String get32UUID()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    Random localRandom = new Random();
    int i = 0;
    for (;;)
    {
      if (i >= 32) {
        return localStringBuffer.toString();
      }
      localStringBuffer.append(localRandom.nextInt(10));
      i += 1;
    }
  }
  
  public static String getAESSignKeyBase64Str(String paramString)
  {
    try
    {
      paramString = Base64.encodeToString(AESUtil.encrypt(paramString.getBytes(), "thinkivethinkivethinkivethinkive".getBytes()), 0);
      localException1.printStackTrace();
    }
    catch (Exception localException1)
    {
      try
      {
        Log.e("sign key base64 result = " + paramString);
        return paramString;
      }
      catch (Exception localException2)
      {
        for (;;) {}
      }
      localException1 = localException1;
      paramString = "";
    }
    return paramString;
  }
  
  private static HashMap<String, String> signData(HashMap<String, String> paramHashMap)
  {
    String str1 = (String)paramHashMap.get("timestamp");
    String str2 = (String)paramHashMap.get("signKey");
    paramHashMap.remove("timestamp");
    paramHashMap.remove("signKey");
    Object localObject = new ArrayList();
    Iterator localIterator = paramHashMap.keySet().iterator();
    if (!localIterator.hasNext())
    {
      Collections.sort((List)localObject);
      localIterator = ((List)localObject).iterator();
    }
    String str3;
    for (localObject = "";; localObject = localObject + str3 + "=" + (String)paramHashMap.get(str3) + "&")
    {
      if (!localIterator.hasNext())
      {
        paramHashMap.put("sign", EncryptUtil.encryptToMD5(localObject + "signKey=" + str2 + "&timestamp=" + str1));
        paramHashMap.put("timestamp", str1);
        return paramHashMap;
        str3 = (String)localIterator.next();
        if ((paramHashMap.get(str3) == null) || (((String)paramHashMap.get(str3)).equals(""))) {
          break;
        }
        ((List)localObject).add(str3);
        break;
      }
      str3 = (String)localIterator.next();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\util\DataSignHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */