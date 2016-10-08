package com.kwlopen.sdk;

import org.apache.cordova.CallbackContext;
import org.json.JSONArray;

class KwlSignCertificatePlugin$2
  implements Runnable
{
  KwlSignCertificatePlugin$2(KwlSignCertificatePlugin paramKwlSignCertificatePlugin, JSONArray paramJSONArray, CallbackContext paramCallbackContext) {}
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 8
    //   3: sipush 1024
    //   6: istore 9
    //   8: ldc 29
    //   10: astore 7
    //   12: aload_0
    //   13: getfield 18	com/kwlopen/sdk/KwlSignCertificatePlugin$2:val$args	Lorg/json/JSONArray;
    //   16: iconst_0
    //   17: invokevirtual 35	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   20: ldc 37
    //   22: invokevirtual 43	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   25: checkcast 45	java/lang/String
    //   28: astore_1
    //   29: aload_0
    //   30: getfield 18	com/kwlopen/sdk/KwlSignCertificatePlugin$2:val$args	Lorg/json/JSONArray;
    //   33: iconst_0
    //   34: invokevirtual 35	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   37: ldc 47
    //   39: invokevirtual 43	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   42: checkcast 45	java/lang/String
    //   45: astore_2
    //   46: aload_0
    //   47: getfield 18	com/kwlopen/sdk/KwlSignCertificatePlugin$2:val$args	Lorg/json/JSONArray;
    //   50: iconst_0
    //   51: invokevirtual 35	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   54: ldc 49
    //   56: invokevirtual 43	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   59: checkcast 45	java/lang/String
    //   62: astore_3
    //   63: aload_0
    //   64: getfield 18	com/kwlopen/sdk/KwlSignCertificatePlugin$2:val$args	Lorg/json/JSONArray;
    //   67: iconst_0
    //   68: invokevirtual 35	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   71: ldc 51
    //   73: invokevirtual 43	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   76: checkcast 45	java/lang/String
    //   79: astore 4
    //   81: aload_0
    //   82: getfield 18	com/kwlopen/sdk/KwlSignCertificatePlugin$2:val$args	Lorg/json/JSONArray;
    //   85: iconst_0
    //   86: invokevirtual 35	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   89: ldc 53
    //   91: invokevirtual 43	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   94: checkcast 45	java/lang/String
    //   97: astore 6
    //   99: aload_0
    //   100: getfield 18	com/kwlopen/sdk/KwlSignCertificatePlugin$2:val$args	Lorg/json/JSONArray;
    //   103: iconst_0
    //   104: invokevirtual 35	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   107: ldc 55
    //   109: invokevirtual 43	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   112: checkcast 45	java/lang/String
    //   115: invokestatic 61	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   118: istore 10
    //   120: iload 10
    //   122: istore 9
    //   124: aload_0
    //   125: getfield 18	com/kwlopen/sdk/KwlSignCertificatePlugin$2:val$args	Lorg/json/JSONArray;
    //   128: iconst_0
    //   129: invokevirtual 35	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   132: ldc 63
    //   134: invokevirtual 43	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   137: checkcast 45	java/lang/String
    //   140: astore 5
    //   142: iload 10
    //   144: istore 9
    //   146: aload_0
    //   147: getfield 16	com/kwlopen/sdk/KwlSignCertificatePlugin$2:this$0	Lcom/kwlopen/sdk/KwlSignCertificatePlugin;
    //   150: invokestatic 69	com/kwlopen/sdk/KwlSignCertificatePlugin:access$0	(Lcom/kwlopen/sdk/KwlSignCertificatePlugin;)Lorg/apache/cordova/CordovaInterface;
    //   153: invokeinterface 75 1 0
    //   158: aload_1
    //   159: aload_2
    //   160: aload_3
    //   161: aload 4
    //   163: aload 6
    //   165: iload 9
    //   167: aload 5
    //   169: invokestatic 81	com/kwlopen/sdk/ca/CaManage:getPKCS10	(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    //   172: astore_2
    //   173: new 39	org/json/JSONObject
    //   176: dup
    //   177: invokespecial 82	org/json/JSONObject:<init>	()V
    //   180: astore_1
    //   181: aload_1
    //   182: ldc 84
    //   184: new 86	java/lang/StringBuilder
    //   187: dup
    //   188: invokespecial 87	java/lang/StringBuilder:<init>	()V
    //   191: aload_0
    //   192: getfield 16	com/kwlopen/sdk/KwlSignCertificatePlugin$2:this$0	Lcom/kwlopen/sdk/KwlSignCertificatePlugin;
    //   195: invokestatic 69	com/kwlopen/sdk/KwlSignCertificatePlugin:access$0	(Lcom/kwlopen/sdk/KwlSignCertificatePlugin;)Lorg/apache/cordova/CordovaInterface;
    //   198: invokeinterface 75 1 0
    //   203: invokestatic 91	com/kwlopen/sdk/ca/CaManage:getError	(Landroid/app/Activity;)Ljava/lang/String;
    //   206: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   209: invokevirtual 99	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   212: invokevirtual 103	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   215: pop
    //   216: aload_1
    //   217: ldc 105
    //   219: new 86	java/lang/StringBuilder
    //   222: dup
    //   223: invokespecial 87	java/lang/StringBuilder:<init>	()V
    //   226: aload_2
    //   227: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   230: invokevirtual 99	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   233: invokevirtual 103	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   236: pop
    //   237: aload_0
    //   238: getfield 20	com/kwlopen/sdk/KwlSignCertificatePlugin$2:val$callbackContext	Lorg/apache/cordova/CallbackContext;
    //   241: aload_1
    //   242: invokevirtual 111	org/apache/cordova/CallbackContext:success	(Lorg/json/JSONObject;)V
    //   245: return
    //   246: astore 5
    //   248: aconst_null
    //   249: astore 4
    //   251: aconst_null
    //   252: astore_3
    //   253: aconst_null
    //   254: astore_2
    //   255: aconst_null
    //   256: astore_1
    //   257: aload 8
    //   259: astore 6
    //   261: aload 5
    //   263: invokevirtual 114	org/json/JSONException:printStackTrace	()V
    //   266: aload 7
    //   268: astore 5
    //   270: goto -124 -> 146
    //   273: astore_2
    //   274: aload_2
    //   275: invokevirtual 114	org/json/JSONException:printStackTrace	()V
    //   278: goto -41 -> 237
    //   281: astore 5
    //   283: aconst_null
    //   284: astore 4
    //   286: aconst_null
    //   287: astore_3
    //   288: aconst_null
    //   289: astore_2
    //   290: aload 8
    //   292: astore 6
    //   294: goto -33 -> 261
    //   297: astore 5
    //   299: aconst_null
    //   300: astore 4
    //   302: aconst_null
    //   303: astore_3
    //   304: aload 8
    //   306: astore 6
    //   308: goto -47 -> 261
    //   311: astore 5
    //   313: aconst_null
    //   314: astore 4
    //   316: aload 8
    //   318: astore 6
    //   320: goto -59 -> 261
    //   323: astore 5
    //   325: aload 8
    //   327: astore 6
    //   329: goto -68 -> 261
    //   332: astore 5
    //   334: goto -73 -> 261
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	337	0	this	2
    //   28	229	1	localObject1	Object
    //   45	210	2	str1	String
    //   273	2	2	localJSONException1	org.json.JSONException
    //   289	1	2	localObject2	Object
    //   62	242	3	str2	String
    //   79	236	4	str3	String
    //   140	28	5	str4	String
    //   246	16	5	localJSONException2	org.json.JSONException
    //   268	1	5	str5	String
    //   281	1	5	localJSONException3	org.json.JSONException
    //   297	1	5	localJSONException4	org.json.JSONException
    //   311	1	5	localJSONException5	org.json.JSONException
    //   323	1	5	localJSONException6	org.json.JSONException
    //   332	1	5	localJSONException7	org.json.JSONException
    //   97	231	6	localObject3	Object
    //   10	257	7	str6	String
    //   1	325	8	localObject4	Object
    //   6	160	9	i	int
    //   118	25	10	j	int
    // Exception table:
    //   from	to	target	type
    //   12	29	246	org/json/JSONException
    //   181	237	273	org/json/JSONException
    //   29	46	281	org/json/JSONException
    //   46	63	297	org/json/JSONException
    //   63	81	311	org/json/JSONException
    //   81	99	323	org/json/JSONException
    //   99	120	332	org/json/JSONException
    //   124	142	332	org/json/JSONException
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwlopen\sdk\KwlSignCertificatePlugin$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */