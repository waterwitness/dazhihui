package com.alipay.sdk.h;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.alipay.sdk.j.j;
import org.json.JSONObject;

public final class a
{
  private String a = "";
  private String b = "";
  private Context c = null;
  
  public a(Context paramContext)
  {
    try
    {
      PackageInfo localPackageInfo = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0);
      this.a = localPackageInfo.versionName;
      this.b = localPackageInfo.packageName;
      this.c = paramContext.getApplicationContext();
      return;
    }
    catch (Exception paramContext) {}
  }
  
  private static String a(String paramString1, String paramString2, String paramString3)
  {
    if (TextUtils.isEmpty(paramString1)) {
      return null;
    }
    paramString1 = paramString1.split(paramString2);
    int i = 0;
    if (i < paramString1.length) {
      if ((TextUtils.isEmpty(paramString1[i])) || (!paramString1[i].startsWith(paramString3))) {}
    }
    for (paramString1 = paramString1[i];; paramString1 = null)
    {
      return paramString1;
      i += 1;
      break;
    }
  }
  
  private String b(String paramString)
  {
    try
    {
      String str1 = a(paramString, "&", "bizcontext=");
      if (TextUtils.isEmpty(str1)) {
        return paramString + "&" + b("bizcontext=", "");
      }
      int i = paramString.indexOf(str1);
      String str2 = paramString.substring(0, i);
      String str3 = paramString.substring(i + str1.length());
      str1 = str2 + b(str1, "bizcontext=", "") + str3;
      return str1;
    }
    catch (Throwable localThrowable) {}
    return paramString;
  }
  
  private String b(String paramString1, String paramString2)
  {
    String str = a("", "");
    return paramString1 + str + paramString2;
  }
  
  private String b(String paramString1, String paramString2, String paramString3)
  {
    paramString1 = paramString1.substring(paramString2.length());
    paramString1 = new JSONObject(paramString1.substring(0, paramString1.length() - paramString3.length()));
    if (!paramString1.has("appkey")) {
      paramString1.put("appkey", "2014052600006128");
    }
    if (!paramString1.has("ty")) {
      paramString1.put("ty", "and_lite");
    }
    if (!paramString1.has("sv")) {
      paramString1.put("sv", "h.a.3.2.2");
    }
    if ((!paramString1.has("an")) && ((!this.b.contains("setting")) || (!j.c(this.c)))) {
      paramString1.put("an", this.b);
    }
    if (!paramString1.has("av")) {
      paramString1.put("av", this.a);
    }
    if (!paramString1.has("sdk_start_time")) {
      paramString1.put("sdk_start_time", System.currentTimeMillis());
    }
    paramString1 = paramString1.toString();
    return paramString2 + paramString1 + paramString3;
  }
  
  private String c(String paramString)
  {
    try
    {
      String str2 = a(paramString, "\"&", "bizcontext=\"");
      if (TextUtils.isEmpty(str2)) {
        return paramString + "&" + b("bizcontext=\"", "\"");
      }
      String str1 = str2;
      if (!str2.endsWith("\"")) {
        str1 = str2 + "\"";
      }
      int i = paramString.indexOf(str1);
      str2 = paramString.substring(0, i);
      String str3 = paramString.substring(i + str1.length());
      str1 = str2 + b(str1, "bizcontext=\"", "\"") + str3;
      return str1;
    }
    catch (Throwable localThrowable) {}
    return paramString;
  }
  
  public final String a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {}
    while (paramString.startsWith("new_external_info==")) {
      return paramString;
    }
    if (!paramString.contains("\"&")) {}
    for (int i = 1; i != 0; i = 0) {
      return b(paramString);
    }
    return c(paramString);
  }
  
  public final String a(String paramString1, String paramString2)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("appkey", "2014052600006128");
      localJSONObject.put("ty", "and_lite");
      localJSONObject.put("sv", "h.a.3.2.2");
      if ((!this.b.contains("setting")) || (!j.c(this.c))) {
        localJSONObject.put("an", this.b);
      }
      localJSONObject.put("av", this.a);
      localJSONObject.put("sdk_start_time", System.currentTimeMillis());
      if (!TextUtils.isEmpty(paramString1)) {
        localJSONObject.put(paramString1, paramString2);
      }
      paramString1 = localJSONObject.toString();
      return paramString1;
    }
    catch (Throwable paramString1) {}
    return "";
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\sdk\h\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */