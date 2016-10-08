package com.iflytek.thirdparty;

import android.content.Context;
import android.text.TextUtils;
import com.iflytek.cloud.RequestListener;
import com.iflytek.cloud.util.FileDownloadListener;
import com.iflytek.msc.MSC;
import com.iflytek.msc.MSCSessionInfo;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

public class s
{
  private static String A = "http://wke.openspeech.cn/wakeup/";
  public P.a a = new s.1(this);
  private String b = "athinfo";
  private String c = "respath";
  private String d = "appid";
  private String e = "resid";
  private String f = "wakelist";
  private String g = "restype";
  private String h = "uid";
  private String i = "expiredate";
  private String j = "resver";
  private String k = "restime";
  private String l = "wakever";
  private String m = "ivwword";
  private String n = "words";
  private String o = "text";
  private String p = "threshold";
  private String q = "d";
  private String r = "netval";
  private String s = ":";
  private String t = "unkown";
  private String u = "header";
  private String v = "info";
  private Context w = null;
  private P x = null;
  private RequestListener y = null;
  private L z = null;
  
  public s(Context paramContext)
  {
    this.w = paramContext;
    this.z = L.a(this.w);
    this.x = new P();
  }
  
  private JSONObject a(JSONObject paramJSONObject1, JSONObject paramJSONObject2)
  {
    try
    {
      if (paramJSONObject1.getString(this.j).equalsIgnoreCase(this.t))
      {
        X.c("user ivw resver unkown");
        return null;
      }
      if ((paramJSONObject2.getString(this.j).equalsIgnoreCase(this.t)) || (!paramJSONObject1.getString(this.j).equalsIgnoreCase(paramJSONObject2.getString(this.j))))
      {
        X.c("cfg ivw resver unkown or unequal");
        return paramJSONObject1;
      }
    }
    catch (JSONException paramJSONObject1)
    {
      paramJSONObject1.printStackTrace();
      return null;
    }
    JSONObject localJSONObject = paramJSONObject1;
    if (J.a(this.d, paramJSONObject1, paramJSONObject2))
    {
      localJSONObject = paramJSONObject1;
      if (J.a(this.e, paramJSONObject1, paramJSONObject2))
      {
        localJSONObject = paramJSONObject1;
        if (J.a(this.g, paramJSONObject1, paramJSONObject2))
        {
          localJSONObject = paramJSONObject1;
          if (J.a(this.f, paramJSONObject1, paramJSONObject2))
          {
            boolean bool = J.b(this.k, paramJSONObject1, paramJSONObject2);
            localJSONObject = paramJSONObject1;
            if (bool) {
              localJSONObject = paramJSONObject2;
            }
          }
        }
      }
    }
    return localJSONObject;
  }
  
  /* Error */
  private JSONObject c(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 5
    //   3: new 160	org/json/JSONObject
    //   6: dup
    //   7: invokespecial 193	org/json/JSONObject:<init>	()V
    //   10: astore_3
    //   11: aload_3
    //   12: aload_0
    //   13: getfield 56	com/iflytek/thirdparty/s:c	Ljava/lang/String;
    //   16: aload_1
    //   17: invokevirtual 197	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   20: pop
    //   21: new 160	org/json/JSONObject
    //   24: dup
    //   25: new 199	org/json/JSONTokener
    //   28: dup
    //   29: aload_2
    //   30: invokespecial 201	org/json/JSONTokener:<init>	(Ljava/lang/String;)V
    //   33: invokespecial 204	org/json/JSONObject:<init>	(Lorg/json/JSONTokener;)V
    //   36: astore_2
    //   37: aload_2
    //   38: aload_0
    //   39: getfield 52	com/iflytek/thirdparty/s:b	Ljava/lang/String;
    //   42: invokevirtual 208	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   45: astore_1
    //   46: aload_3
    //   47: aload_0
    //   48: getfield 60	com/iflytek/thirdparty/s:d	Ljava/lang/String;
    //   51: aload_1
    //   52: aload_0
    //   53: getfield 60	com/iflytek/thirdparty/s:d	Ljava/lang/String;
    //   56: invokevirtual 164	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   59: invokevirtual 197	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   62: pop
    //   63: aload_3
    //   64: aload_0
    //   65: getfield 64	com/iflytek/thirdparty/s:e	Ljava/lang/String;
    //   68: aload_1
    //   69: aload_0
    //   70: getfield 64	com/iflytek/thirdparty/s:e	Ljava/lang/String;
    //   73: invokevirtual 164	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   76: invokevirtual 197	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   79: pop
    //   80: aload_1
    //   81: aload_0
    //   82: getfield 72	com/iflytek/thirdparty/s:g	Ljava/lang/String;
    //   85: invokevirtual 164	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   88: astore 4
    //   90: aload_3
    //   91: aload_0
    //   92: getfield 72	com/iflytek/thirdparty/s:g	Ljava/lang/String;
    //   95: aload 4
    //   97: invokevirtual 197	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   100: pop
    //   101: aload_0
    //   102: getfield 111	com/iflytek/thirdparty/s:q	Ljava/lang/String;
    //   105: aload 4
    //   107: invokevirtual 170	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   110: ifne +37 -> 147
    //   113: aload_3
    //   114: aload_0
    //   115: getfield 76	com/iflytek/thirdparty/s:h	Ljava/lang/String;
    //   118: aload_1
    //   119: aload_0
    //   120: getfield 76	com/iflytek/thirdparty/s:h	Ljava/lang/String;
    //   123: invokevirtual 164	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   126: invokevirtual 197	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   129: pop
    //   130: aload_3
    //   131: aload_0
    //   132: getfield 80	com/iflytek/thirdparty/s:i	Ljava/lang/String;
    //   135: aload_1
    //   136: aload_0
    //   137: getfield 80	com/iflytek/thirdparty/s:i	Ljava/lang/String;
    //   140: invokevirtual 164	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   143: invokevirtual 197	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   146: pop
    //   147: aload_2
    //   148: aload_0
    //   149: getfield 96	com/iflytek/thirdparty/s:m	Ljava/lang/String;
    //   152: invokevirtual 208	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   155: aload_0
    //   156: getfield 100	com/iflytek/thirdparty/s:n	Ljava/lang/String;
    //   159: invokevirtual 212	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   162: astore 4
    //   164: ldc -42
    //   166: astore_1
    //   167: iload 5
    //   169: aload 4
    //   171: invokevirtual 220	org/json/JSONArray:length	()I
    //   174: if_icmpge +118 -> 292
    //   177: new 222	java/lang/StringBuilder
    //   180: dup
    //   181: invokespecial 223	java/lang/StringBuilder:<init>	()V
    //   184: aload_1
    //   185: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   188: aload 4
    //   190: iload 5
    //   192: invokevirtual 230	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   195: aload_0
    //   196: getfield 104	com/iflytek/thirdparty/s:o	Ljava/lang/String;
    //   199: invokevirtual 164	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   202: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   205: invokevirtual 234	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   208: astore_1
    //   209: new 222	java/lang/StringBuilder
    //   212: dup
    //   213: invokespecial 223	java/lang/StringBuilder:<init>	()V
    //   216: aload_1
    //   217: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   220: aload_0
    //   221: getfield 119	com/iflytek/thirdparty/s:s	Ljava/lang/String;
    //   224: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   227: invokevirtual 234	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   230: astore_1
    //   231: new 222	java/lang/StringBuilder
    //   234: dup
    //   235: invokespecial 223	java/lang/StringBuilder:<init>	()V
    //   238: aload_1
    //   239: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   242: aload 4
    //   244: iload 5
    //   246: invokevirtual 230	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   249: aload_0
    //   250: getfield 108	com/iflytek/thirdparty/s:p	Ljava/lang/String;
    //   253: invokevirtual 238	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   256: invokevirtual 241	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   259: invokevirtual 234	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   262: astore_1
    //   263: new 222	java/lang/StringBuilder
    //   266: dup
    //   267: invokespecial 223	java/lang/StringBuilder:<init>	()V
    //   270: aload_1
    //   271: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   274: ldc -13
    //   276: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   279: invokevirtual 234	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   282: astore_1
    //   283: iload 5
    //   285: iconst_1
    //   286: iadd
    //   287: istore 5
    //   289: goto -122 -> 167
    //   292: aload_1
    //   293: iconst_0
    //   294: aload_1
    //   295: invokevirtual 244	java/lang/String:length	()I
    //   298: iconst_1
    //   299: isub
    //   300: invokevirtual 248	java/lang/String:substring	(II)Ljava/lang/String;
    //   303: astore_1
    //   304: aload_3
    //   305: aload_0
    //   306: getfield 68	com/iflytek/thirdparty/s:f	Ljava/lang/String;
    //   309: aload_1
    //   310: invokevirtual 197	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   313: pop
    //   314: aload_3
    //   315: aload_0
    //   316: getfield 84	com/iflytek/thirdparty/s:j	Ljava/lang/String;
    //   319: aload_2
    //   320: aload_0
    //   321: getfield 84	com/iflytek/thirdparty/s:j	Ljava/lang/String;
    //   324: invokevirtual 164	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   327: invokevirtual 197	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   330: pop
    //   331: aload_3
    //   332: aload_0
    //   333: getfield 88	com/iflytek/thirdparty/s:k	Ljava/lang/String;
    //   336: aload_2
    //   337: aload_0
    //   338: getfield 88	com/iflytek/thirdparty/s:k	Ljava/lang/String;
    //   341: invokevirtual 252	org/json/JSONObject:getLong	(Ljava/lang/String;)J
    //   344: invokevirtual 255	org/json/JSONObject:put	(Ljava/lang/String;J)Lorg/json/JSONObject;
    //   347: pop
    //   348: ldc -42
    //   350: astore_1
    //   351: invokestatic 261	com/iflytek/cloud/SpeechUtility:getUtility	()Lcom/iflytek/cloud/SpeechUtility;
    //   354: ifnull +13 -> 367
    //   357: invokestatic 261	com/iflytek/cloud/SpeechUtility:getUtility	()Lcom/iflytek/cloud/SpeechUtility;
    //   360: ldc_w 263
    //   363: invokevirtual 266	com/iflytek/cloud/SpeechUtility:getParameter	(Ljava/lang/String;)Ljava/lang/String;
    //   366: astore_1
    //   367: aload_3
    //   368: aload_0
    //   369: getfield 92	com/iflytek/thirdparty/s:l	Ljava/lang/String;
    //   372: aload_1
    //   373: invokevirtual 197	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   376: pop
    //   377: new 222	java/lang/StringBuilder
    //   380: dup
    //   381: invokespecial 223	java/lang/StringBuilder:<init>	()V
    //   384: ldc_w 268
    //   387: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   390: aload_3
    //   391: invokevirtual 269	org/json/JSONObject:toString	()Ljava/lang/String;
    //   394: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   397: invokevirtual 234	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   400: invokestatic 177	com/iflytek/thirdparty/X:c	(Ljava/lang/String;)V
    //   403: aload_3
    //   404: areturn
    //   405: astore_1
    //   406: aload_3
    //   407: aload_0
    //   408: getfield 84	com/iflytek/thirdparty/s:j	Ljava/lang/String;
    //   411: aload_0
    //   412: getfield 123	com/iflytek/thirdparty/s:t	Ljava/lang/String;
    //   415: invokevirtual 197	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   418: pop
    //   419: goto -88 -> 331
    //   422: astore_1
    //   423: aload_1
    //   424: invokevirtual 182	org/json/JSONException:printStackTrace	()V
    //   427: aconst_null
    //   428: areturn
    //   429: astore_1
    //   430: aload_3
    //   431: aload_0
    //   432: getfield 88	com/iflytek/thirdparty/s:k	Ljava/lang/String;
    //   435: lconst_0
    //   436: invokevirtual 255	org/json/JSONObject:put	(Ljava/lang/String;J)Lorg/json/JSONObject;
    //   439: pop
    //   440: goto -92 -> 348
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	443	0	this	s
    //   0	443	1	paramString1	String
    //   0	443	2	paramString2	String
    //   10	421	3	localJSONObject	JSONObject
    //   88	155	4	localObject	Object
    //   1	287	5	i1	int
    // Exception table:
    //   from	to	target	type
    //   314	331	405	org/json/JSONException
    //   11	147	422	org/json/JSONException
    //   147	164	422	org/json/JSONException
    //   167	283	422	org/json/JSONException
    //   292	314	422	org/json/JSONException
    //   351	367	422	org/json/JSONException
    //   367	403	422	org/json/JSONException
    //   406	419	422	org/json/JSONException
    //   430	440	422	org/json/JSONException
    //   331	348	429	org/json/JSONException
  }
  
  public int a(String paramString1, String paramString2, String paramString3, FileDownloadListener paramFileDownloadListener)
  {
    if ((TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2))) {
      return 20012;
    }
    return this.z.a(paramString1, paramString2, paramString3, paramFileDownloadListener);
  }
  
  public int a(JSONObject paramJSONObject, RequestListener paramRequestListener)
  {
    if (paramJSONObject == null) {
      return 20014;
    }
    if (paramRequestListener != null) {}
    try
    {
      this.y = paramRequestListener;
      paramRequestListener = new JSONObject();
      paramRequestListener.put(this.u, ac.d(this.w, new aa()));
      paramRequestListener.put(this.v, paramJSONObject);
      X.c("post data:" + paramRequestListener);
      paramJSONObject = K.b(paramRequestListener.toString().getBytes());
      this.x.a(1);
      this.x.a(A, null, paramJSONObject);
      this.x.a(this.a);
      return 0;
    }
    catch (Exception paramJSONObject)
    {
      X.a(paramJSONObject);
    }
    return 20003;
  }
  
  /* Error */
  public JSONObject a(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_2
    //   3: invokestatic 276	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   6: ifeq +15 -> 21
    //   9: aload_0
    //   10: aload_1
    //   11: ldc -42
    //   13: invokevirtual 317	com/iflytek/thirdparty/s:b	(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;
    //   16: astore_1
    //   17: aload_0
    //   18: monitorexit
    //   19: aload_1
    //   20: areturn
    //   21: aload_0
    //   22: aload_1
    //   23: ldc -42
    //   25: invokevirtual 317	com/iflytek/thirdparty/s:b	(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;
    //   28: astore_3
    //   29: aload_3
    //   30: ifnonnull +8 -> 38
    //   33: aconst_null
    //   34: astore_1
    //   35: goto -18 -> 17
    //   38: aload_0
    //   39: aload_2
    //   40: ldc -42
    //   42: invokevirtual 317	com/iflytek/thirdparty/s:b	(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;
    //   45: astore_2
    //   46: aload_3
    //   47: astore_1
    //   48: aload_2
    //   49: ifnull -32 -> 17
    //   52: aload_0
    //   53: aload_3
    //   54: aload_2
    //   55: invokespecial 319	com/iflytek/thirdparty/s:a	(Lorg/json/JSONObject;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    //   58: astore_1
    //   59: goto -42 -> 17
    //   62: astore_1
    //   63: aload_0
    //   64: monitorexit
    //   65: aload_1
    //   66: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	67	0	this	s
    //   0	67	1	paramString1	String
    //   0	67	2	paramString2	String
    //   28	26	3	localJSONObject	JSONObject
    // Exception table:
    //   from	to	target	type
    //   2	17	62	finally
    //   21	29	62	finally
    //   38	46	62	finally
    //   52	59	62	finally
  }
  
  public void a()
  {
    if (this.x != null)
    {
      this.x.a();
      this.x = null;
    }
    this.y = null;
  }
  
  public JSONObject b(String paramString1, String paramString2)
  {
    MSCSessionInfo localMSCSessionInfo = new MSCSessionInfo();
    int i1 = MSC.QIVWGetResInfo(paramString1.getBytes(), paramString2.getBytes(), localMSCSessionInfo);
    if (i1 != 0)
    {
      X.b("read ivw resoure error:" + i1);
      return null;
    }
    try
    {
      paramString2 = new String(localMSCSessionInfo.buffer, "utf-8");
      X.c("resInfo:" + new String(localMSCSessionInfo.buffer));
      return c(paramString1, paramString2);
    }
    catch (UnsupportedEncodingException paramString1)
    {
      paramString1.printStackTrace();
    }
    return null;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */