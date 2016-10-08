package com.kwlopen.sdk;

import org.apache.cordova.CallbackContext;
import org.json.JSONArray;

class KwlSignCertificatePlugin$5
  implements Runnable
{
  KwlSignCertificatePlugin$5(KwlSignCertificatePlugin paramKwlSignCertificatePlugin, JSONArray paramJSONArray, CallbackContext paramCallbackContext) {}
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: new 29	org/json/JSONObject
    //   5: dup
    //   6: invokespecial 30	org/json/JSONObject:<init>	()V
    //   9: astore 6
    //   11: aload_0
    //   12: getfield 18	com/kwlopen/sdk/KwlSignCertificatePlugin$5:val$args	Lorg/json/JSONArray;
    //   15: iconst_0
    //   16: invokevirtual 36	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   19: ldc 38
    //   21: invokevirtual 41	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   24: astore_1
    //   25: aload_0
    //   26: getfield 18	com/kwlopen/sdk/KwlSignCertificatePlugin$5:val$args	Lorg/json/JSONArray;
    //   29: iconst_0
    //   30: invokevirtual 36	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   33: ldc 43
    //   35: invokevirtual 47	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   38: checkcast 49	java/lang/String
    //   41: astore_2
    //   42: aload_0
    //   43: getfield 18	com/kwlopen/sdk/KwlSignCertificatePlugin$5:val$args	Lorg/json/JSONArray;
    //   46: iconst_0
    //   47: invokevirtual 36	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   50: ldc 51
    //   52: invokevirtual 47	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   55: checkcast 49	java/lang/String
    //   58: astore_3
    //   59: aload_0
    //   60: getfield 18	com/kwlopen/sdk/KwlSignCertificatePlugin$5:val$args	Lorg/json/JSONArray;
    //   63: iconst_0
    //   64: invokevirtual 36	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   67: ldc 53
    //   69: invokevirtual 47	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   72: checkcast 49	java/lang/String
    //   75: invokestatic 59	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   78: istore 9
    //   80: aload_3
    //   81: astore 4
    //   83: aload_2
    //   84: astore_3
    //   85: aload 4
    //   87: astore_2
    //   88: aload_1
    //   89: invokevirtual 63	org/json/JSONObject:keys	()Ljava/util/Iterator;
    //   92: astore 4
    //   94: new 29	org/json/JSONObject
    //   97: dup
    //   98: invokespecial 30	org/json/JSONObject:<init>	()V
    //   101: astore 5
    //   103: aload 4
    //   105: invokeinterface 69 1 0
    //   110: ifne +76 -> 186
    //   113: aload 6
    //   115: ldc 71
    //   117: new 73	java/lang/StringBuilder
    //   120: dup
    //   121: invokespecial 74	java/lang/StringBuilder:<init>	()V
    //   124: aload_0
    //   125: getfield 16	com/kwlopen/sdk/KwlSignCertificatePlugin$5:this$0	Lcom/kwlopen/sdk/KwlSignCertificatePlugin;
    //   128: invokestatic 80	com/kwlopen/sdk/KwlSignCertificatePlugin:access$0	(Lcom/kwlopen/sdk/KwlSignCertificatePlugin;)Lorg/apache/cordova/CordovaInterface;
    //   131: invokeinterface 86 1 0
    //   136: invokestatic 92	com/kwlopen/sdk/ca/CaManage:getError	(Landroid/app/Activity;)Ljava/lang/String;
    //   139: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   142: invokevirtual 100	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   145: invokevirtual 104	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   148: pop
    //   149: aload 6
    //   151: ldc 106
    //   153: aload 5
    //   155: invokevirtual 104	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   158: pop
    //   159: aload_0
    //   160: getfield 20	com/kwlopen/sdk/KwlSignCertificatePlugin$5:val$callbackContext	Lorg/apache/cordova/CallbackContext;
    //   163: aload 6
    //   165: invokevirtual 112	org/apache/cordova/CallbackContext:success	(Lorg/json/JSONObject;)V
    //   168: return
    //   169: astore 4
    //   171: aconst_null
    //   172: astore_2
    //   173: aconst_null
    //   174: astore_1
    //   175: aload 4
    //   177: invokevirtual 115	org/json/JSONException:printStackTrace	()V
    //   180: iconst_0
    //   181: istore 9
    //   183: goto -95 -> 88
    //   186: aload 4
    //   188: invokeinterface 119 1 0
    //   193: checkcast 49	java/lang/String
    //   196: astore 7
    //   198: aload_1
    //   199: aload 7
    //   201: invokevirtual 123	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   204: astore 8
    //   206: aload 5
    //   208: aload 7
    //   210: aload_0
    //   211: getfield 16	com/kwlopen/sdk/KwlSignCertificatePlugin$5:this$0	Lcom/kwlopen/sdk/KwlSignCertificatePlugin;
    //   214: invokestatic 80	com/kwlopen/sdk/KwlSignCertificatePlugin:access$0	(Lcom/kwlopen/sdk/KwlSignCertificatePlugin;)Lorg/apache/cordova/CordovaInterface;
    //   217: invokeinterface 86 1 0
    //   222: aload 8
    //   224: aload_3
    //   225: aload_2
    //   226: iload 9
    //   228: invokestatic 127	com/kwlopen/sdk/ca/CaManage:signMessage	(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    //   231: invokevirtual 104	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   234: pop
    //   235: goto -132 -> 103
    //   238: astore 7
    //   240: aload 7
    //   242: invokevirtual 115	org/json/JSONException:printStackTrace	()V
    //   245: goto -142 -> 103
    //   248: astore_1
    //   249: aload_1
    //   250: invokevirtual 115	org/json/JSONException:printStackTrace	()V
    //   253: goto -94 -> 159
    //   256: astore 4
    //   258: aconst_null
    //   259: astore_2
    //   260: goto -85 -> 175
    //   263: astore 4
    //   265: aconst_null
    //   266: astore 5
    //   268: aload_2
    //   269: astore_3
    //   270: aload 5
    //   272: astore_2
    //   273: goto -98 -> 175
    //   276: astore 5
    //   278: aload_2
    //   279: astore 4
    //   281: aload_3
    //   282: astore_2
    //   283: aload 4
    //   285: astore_3
    //   286: aload 5
    //   288: astore 4
    //   290: goto -115 -> 175
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	293	0	this	5
    //   24	175	1	localJSONObject1	org.json.JSONObject
    //   248	2	1	localJSONException1	org.json.JSONException
    //   41	242	2	localObject1	Object
    //   1	285	3	localObject2	Object
    //   81	23	4	localObject3	Object
    //   169	18	4	localJSONException2	org.json.JSONException
    //   256	1	4	localJSONException3	org.json.JSONException
    //   263	1	4	localJSONException4	org.json.JSONException
    //   279	10	4	localObject4	Object
    //   101	170	5	localJSONObject2	org.json.JSONObject
    //   276	11	5	localJSONException5	org.json.JSONException
    //   9	155	6	localJSONObject3	org.json.JSONObject
    //   196	13	7	str1	String
    //   238	3	7	localJSONException6	org.json.JSONException
    //   204	19	8	str2	String
    //   78	149	9	i	int
    // Exception table:
    //   from	to	target	type
    //   11	25	169	org/json/JSONException
    //   198	235	238	org/json/JSONException
    //   113	159	248	org/json/JSONException
    //   25	42	256	org/json/JSONException
    //   42	59	263	org/json/JSONException
    //   59	80	276	org/json/JSONException
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwlopen\sdk\KwlSignCertificatePlugin$5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */