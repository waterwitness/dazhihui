package com.payeco.android.plugin.http.encryption;

import android.text.TextUtils;

public class PluginAlgorithm
{
  public static String getSymmetryKey()
  {
    String str2 = Base64.encodeLines(new MD5().getMD5(String.valueOf(System.currentTimeMillis())));
    String str1 = str2;
    if (str2.length() >= 24) {
      return str2.substring(1, 25);
    }
    while (str1.length() < 24) {
      str1 = str1 + "0";
    }
    return str1;
  }
  
  public String dataDecode(String paramString1, String paramString2)
  {
    if ((TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2))) {
      return "-1";
    }
    Object localObject = paramString1.split("\\|");
    if ((localObject != null) && (localObject.length > 2))
    {
      paramString1 = localObject[1];
      localObject = localObject[2];
      paramString1 = ThreeDES.decryptMode(paramString2.getBytes(), Base64.decodeLines(paramString1));
      if (!Base64.encodeLines(new MD5().getMD5(paramString1)).equalsIgnoreCase(Base64.encodeLines(Base64.decodeLines((String)localObject)))) {
        return "-2";
      }
      return new String(paramString1);
    }
    return "-1";
  }
  
  public String dataEncode(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    StringBuffer localStringBuffer = new StringBuffer("");
    if ((TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2)) || (TextUtils.isEmpty(paramString3)) || (TextUtils.isEmpty(paramString4)) || (TextUtils.isEmpty(paramString5))) {
      return localStringBuffer.toString();
    }
    localStringBuffer.append(Base64.encodeString(paramString1)).append("|");
    localStringBuffer.append(RSA.encryptForConfig(paramString4, paramString2, paramString3)).append("|");
    localStringBuffer.append(Base64.encodeLines(ThreeDES.encryptMode(paramString4.getBytes(), paramString5.getBytes()))).append("|");
    localStringBuffer.append(Base64.encodeLines(new MD5().getMD5(paramString5)));
    return localStringBuffer.toString();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\http\encryption\PluginAlgorithm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */