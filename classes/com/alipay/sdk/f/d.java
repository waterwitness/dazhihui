package com.alipay.sdk.f;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.text.TextUtils;
import android.widget.TextView;
import com.alipay.sdk.j.i;
import com.alipay.sdk.j.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.message.BasicHeader;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class d
{
  private static com.alipay.sdk.e.a c;
  protected boolean a = true;
  protected boolean b = true;
  
  public static String a(HashMap<String, String> paramHashMap1, HashMap<String, String> paramHashMap2)
  {
    JSONObject localJSONObject1 = new JSONObject();
    JSONObject localJSONObject2 = new JSONObject();
    paramHashMap1 = paramHashMap1.entrySet().iterator();
    Map.Entry localEntry;
    while (paramHashMap1.hasNext())
    {
      localEntry = (Map.Entry)paramHashMap1.next();
      localJSONObject2.put((String)localEntry.getKey(), localEntry.getValue());
    }
    paramHashMap1 = new JSONObject();
    paramHashMap2 = paramHashMap2.entrySet().iterator();
    while (paramHashMap2.hasNext())
    {
      localEntry = (Map.Entry)paramHashMap2.next();
      paramHashMap1.put((String)localEntry.getKey(), localEntry.getValue());
    }
    localJSONObject2.put("params", paramHashMap1);
    localJSONObject1.put("data", localJSONObject2);
    return localJSONObject1.toString();
  }
  
  public static JSONObject a(String paramString1, String paramString2)
  {
    JSONObject localJSONObject1 = new JSONObject();
    JSONObject localJSONObject2 = new JSONObject();
    localJSONObject2.put("type", paramString1);
    localJSONObject2.put("method", paramString2);
    localJSONObject1.put("action", localJSONObject2);
    return localJSONObject1;
  }
  
  private static boolean a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {}
    for (;;)
    {
      return false;
      try
      {
        paramString = new JSONObject(paramString).getJSONObject("data");
        if (paramString.has("params"))
        {
          paramString = paramString.getJSONObject("params").optString("public_key", null);
          if (!TextUtils.isEmpty(paramString))
          {
            com.alipay.sdk.h.b.a();
            com.alipay.sdk.c.c.a().a(paramString);
            return true;
          }
        }
      }
      catch (JSONException paramString) {}
    }
    return false;
  }
  
  /* Error */
  private static byte[] a(HttpResponse paramHttpResponse)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: sipush 1024
    //   5: newarray <illegal type>
    //   7: astore_3
    //   8: aload_0
    //   9: invokeinterface 121 1 0
    //   14: invokeinterface 127 1 0
    //   19: astore_1
    //   20: new 129	java/io/ByteArrayOutputStream
    //   23: dup
    //   24: invokespecial 130	java/io/ByteArrayOutputStream:<init>	()V
    //   27: astore_0
    //   28: aload_1
    //   29: aload_3
    //   30: invokevirtual 136	java/io/InputStream:read	([B)I
    //   33: istore 4
    //   35: iload 4
    //   37: iconst_m1
    //   38: if_icmpeq +37 -> 75
    //   41: aload_0
    //   42: aload_3
    //   43: iconst_0
    //   44: iload 4
    //   46: invokevirtual 140	java/io/ByteArrayOutputStream:write	([BII)V
    //   49: goto -21 -> 28
    //   52: astore_3
    //   53: aload_0
    //   54: astore_2
    //   55: aload_3
    //   56: astore_0
    //   57: aload_1
    //   58: ifnull +7 -> 65
    //   61: aload_1
    //   62: invokevirtual 143	java/io/InputStream:close	()V
    //   65: aload_2
    //   66: ifnull +7 -> 73
    //   69: aload_2
    //   70: invokevirtual 144	java/io/ByteArrayOutputStream:close	()V
    //   73: aload_0
    //   74: athrow
    //   75: aload_0
    //   76: invokevirtual 148	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   79: astore_2
    //   80: aload_1
    //   81: ifnull +7 -> 88
    //   84: aload_1
    //   85: invokevirtual 143	java/io/InputStream:close	()V
    //   88: aload_0
    //   89: invokevirtual 144	java/io/ByteArrayOutputStream:close	()V
    //   92: aload_2
    //   93: areturn
    //   94: astore_1
    //   95: goto -7 -> 88
    //   98: astore_0
    //   99: aload_2
    //   100: areturn
    //   101: astore_1
    //   102: goto -37 -> 65
    //   105: astore_1
    //   106: goto -33 -> 73
    //   109: astore_0
    //   110: aconst_null
    //   111: astore_1
    //   112: goto -55 -> 57
    //   115: astore_0
    //   116: goto -59 -> 57
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	119	0	paramHttpResponse	HttpResponse
    //   19	66	1	localInputStream	java.io.InputStream
    //   94	1	1	localException1	Exception
    //   101	1	1	localException2	Exception
    //   105	1	1	localException3	Exception
    //   111	1	1	localObject1	Object
    //   1	99	2	localObject2	Object
    //   7	36	3	arrayOfByte	byte[]
    //   52	4	3	localObject3	Object
    //   33	12	4	i	int
    // Exception table:
    //   from	to	target	type
    //   28	35	52	finally
    //   41	49	52	finally
    //   75	80	52	finally
    //   84	88	94	java/lang/Exception
    //   88	92	98	java/lang/Exception
    //   61	65	101	java/lang/Exception
    //   69	73	105	java/lang/Exception
    //   8	20	109	finally
    //   20	28	115	finally
  }
  
  public b a(Context paramContext, String paramString)
  {
    return a(paramContext, paramString, i.a(paramContext), true);
  }
  
  public final b a(Context paramContext, String paramString1, String paramString2, boolean paramBoolean)
  {
    Object localObject2 = null;
    int i = 0;
    e locale = new e(this.b);
    Object localObject1;
    Object localObject4;
    do
    {
      do
      {
        try
        {
          localObject1 = locale.a(new b(c(), a(paramString1, a())), this.a);
          if (c == null) {
            c = new com.alipay.sdk.e.a(paramContext, paramString2);
          }
          Object localObject3;
          for (;;)
          {
            localObject3 = c;
            localObject4 = a(((c)localObject1).a, paramString1);
            localObject3 = ((com.alipay.sdk.e.a)localObject3).a(((c)localObject1).b, (List)localObject4);
            if (localObject3 != null) {
              break;
            }
            localObject1 = localObject2;
            localObject1 = locale.a(new c(Boolean.valueOf((String)localObject1).booleanValue(), a((HttpResponse)localObject3)));
            if ((localObject1 == null) || (!a(((b)localObject1).a)) || (!paramBoolean)) {
              break label292;
            }
            return a(paramContext, paramString1, paramString2, false);
            if (!TextUtils.equals(paramString2, c.a)) {
              c.a = paramString2;
            }
          }
          localObject4 = ((HttpResponse)localObject3).getAllHeaders();
        }
        catch (Throwable paramContext)
        {
          throw paramContext;
        }
        localObject1 = localObject2;
      } while (localObject4 == null);
      localObject1 = localObject2;
    } while (localObject4.length <= 0);
    int j = localObject4.length;
    for (;;)
    {
      localObject1 = localObject2;
      if (i >= j) {
        break;
      }
      localObject1 = localObject4[i];
      if (localObject1 != null)
      {
        String str = ((Header)localObject1).getName();
        if ((str != null) && (str.equalsIgnoreCase("msp-gzip")))
        {
          localObject1 = ((Header)localObject1).getValue();
          break;
        }
      }
      i += 1;
    }
    label292:
    return (b)localObject1;
  }
  
  public String a(String paramString, JSONObject paramJSONObject)
  {
    com.alipay.sdk.h.b localb = com.alipay.sdk.h.b.a();
    com.alipay.sdk.i.b localb1 = com.alipay.sdk.i.b.a();
    JSONObject localJSONObject = com.alipay.sdk.j.b.a(new JSONObject(), paramJSONObject);
    try
    {
      localJSONObject.put("tid", localb1.a);
      localc = com.alipay.sdk.c.c.a();
      localContext = com.alipay.sdk.h.b.a().a;
      localObject3 = com.alipay.sdk.j.a.a(localContext);
      if (TextUtils.isEmpty(localc.a))
      {
        paramJSONObject = j.a();
        localObject1 = j.b();
        localObject2 = j.e(localContext);
        str1 = i.a(localContext);
        str1 = str1.substring(0, str1.indexOf("://"));
        str2 = j.f(localContext);
        str3 = Float.toString(new TextView(localContext).getTextSize());
        localc.a = ("Msp/15.2.2" + " (" + paramJSONObject + ";" + (String)localObject1 + ";" + (String)localObject2 + ";" + str1 + ";" + str2 + ";" + str3);
      }
      str1 = com.alipay.sdk.j.a.b(localContext).p;
      str2 = ((com.alipay.sdk.j.a)localObject3).a();
      str3 = ((com.alipay.sdk.j.a)localObject3).b();
      localObject4 = com.alipay.sdk.h.b.a().a;
      localObject2 = ((Context)localObject4).getSharedPreferences("virtualImeiAndImsi", 0);
      paramJSONObject = ((SharedPreferences)localObject2).getString("virtual_imsi", null);
      localObject1 = paramJSONObject;
      if (TextUtils.isEmpty(paramJSONObject))
      {
        if (!TextUtils.isEmpty(com.alipay.sdk.i.b.a().a)) {
          break label907;
        }
        paramJSONObject = com.alipay.sdk.h.b.a().c();
        if (!TextUtils.isEmpty(paramJSONObject)) {
          break label896;
        }
        paramJSONObject = com.alipay.sdk.c.c.b();
        ((SharedPreferences)localObject2).edit().putString("virtual_imsi", paramJSONObject).commit();
        localObject1 = paramJSONObject;
      }
      localObject5 = com.alipay.sdk.h.b.a().a;
      localObject4 = ((Context)localObject5).getSharedPreferences("virtualImeiAndImsi", 0);
      localObject2 = ((SharedPreferences)localObject4).getString("virtual_imei", null);
      paramJSONObject = (JSONObject)localObject2;
      if (TextUtils.isEmpty((CharSequence)localObject2))
      {
        if (!TextUtils.isEmpty(com.alipay.sdk.i.b.a().a)) {
          break label919;
        }
        paramJSONObject = com.alipay.sdk.c.c.b();
        label391:
        ((SharedPreferences)localObject4).edit().putString("virtual_imei", paramJSONObject).commit();
      }
      if (localb1 != null) {
        localc.c = localb1.b;
      }
      localObject4 = Build.MANUFACTURER.replace(";", " ");
      localObject5 = Build.MODEL.replace(";", " ");
      bool = com.alipay.sdk.h.b.b();
      str4 = ((com.alipay.sdk.j.a)localObject3).a;
      localObject2 = ((WifiManager)localContext.getSystemService("wifi")).getConnectionInfo();
      if (localObject2 == null) {
        break label943;
      }
      localObject2 = ((WifiInfo)localObject2).getSSID();
    }
    catch (Throwable paramString)
    {
      for (;;)
      {
        com.alipay.sdk.c.c localc;
        Context localContext;
        Object localObject3;
        Object localObject1;
        String str1;
        String str2;
        String str3;
        Object localObject4;
        Object localObject5;
        boolean bool;
        String str4;
        label896:
        label907:
        label919:
        continue;
        Object localObject2 = "-1";
      }
    }
    localObject3 = ((WifiManager)localContext.getSystemService("wifi")).getConnectionInfo();
    if (localObject3 != null) {}
    for (localObject3 = ((WifiInfo)localObject3).getBSSID();; localObject3 = "00")
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(localc.a).append(";").append(str1).append(";").append("-1;-1").append(";").append("1").append(";").append(str2).append(";").append(str3).append(";").append(localc.c).append(";").append((String)localObject4).append(";").append((String)localObject5).append(";").append(bool).append(";").append(str4).append(";-1;-1;").append(localc.b).append(";").append((String)localObject1).append(";").append(paramJSONObject).append(";").append((String)localObject2).append(";").append((String)localObject3);
      if (localb1 != null)
      {
        paramJSONObject = new HashMap();
        paramJSONObject.put("tid", localb1.a);
        paramJSONObject.put("utdid", com.alipay.sdk.h.b.a().c());
        paramJSONObject = localc.b(localContext, paramJSONObject);
        if (!TextUtils.isEmpty(paramJSONObject)) {
          localStringBuilder.append(";").append(paramJSONObject);
        }
      }
      localStringBuilder.append(")");
      localJSONObject.put("user_agent", localStringBuilder.toString());
      localJSONObject.put("has_alipay", j.b(localb.a));
      localJSONObject.put("has_msp_app", j.a(localb.a));
      localJSONObject.put("external_info", paramString);
      localJSONObject.put("app_key", "2014052600006128");
      localJSONObject.put("utdid", localb.c());
      localJSONObject.put("new_client_key", localb1.b);
      return localJSONObject.toString();
      paramJSONObject = paramJSONObject.substring(3, 18);
      break;
      paramJSONObject = com.alipay.sdk.j.a.a((Context)localObject4).a();
      break;
      paramJSONObject = com.alipay.sdk.j.a.a((Context)localObject5).b();
      break label391;
    }
  }
  
  public List<Header> a(boolean paramBoolean, String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new BasicHeader("msp-gzip", String.valueOf(paramBoolean)));
    localArrayList.add(new BasicHeader("Operation-Type", "alipay.msp.cashier.dispatch.bytes"));
    localArrayList.add(new BasicHeader("content-type", "application/octet-stream"));
    localArrayList.add(new BasicHeader("Version", "2.0"));
    localArrayList.add(new BasicHeader("AppId", "TAOBAO"));
    localArrayList.add(new BasicHeader("Msp-Param", a.a(paramString)));
    localArrayList.add(new BasicHeader("des-mode", "CBC"));
    return localArrayList;
  }
  
  public abstract JSONObject a();
  
  public String b()
  {
    return "4.9.0";
  }
  
  public String c()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("device", Build.MODEL);
    localHashMap.put("namespace", "com.alipay.mobilecashier");
    localHashMap.put("api_name", "com.alipay.mcpay");
    localHashMap.put("api_version", b());
    return a(localHashMap, new HashMap());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\sdk\f\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */