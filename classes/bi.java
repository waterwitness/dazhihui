import com.android.thinkive.framework.message.IMessageHandler;

public final class bi
  implements IMessageHandler
{
  /* Error */
  public final String handlerMessage(android.content.Context paramContext, com.android.thinkive.framework.message.AppMessage paramAppMessage)
  {
    // Byte code:
    //   0: aload_2
    //   1: invokevirtual 29	com/android/thinkive/framework/message/AppMessage:getContent	()Lorg/json/JSONObject;
    //   4: astore_2
    //   5: aload_2
    //   6: ldc 31
    //   8: invokevirtual 37	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   11: astore_3
    //   12: aload_2
    //   13: ldc 39
    //   15: invokevirtual 37	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   18: astore 4
    //   20: aload_2
    //   21: ldc 41
    //   23: invokevirtual 37	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   26: astore_2
    //   27: aload_3
    //   28: invokestatic 47	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   31: ifeq +16 -> 47
    //   34: aload_1
    //   35: invokestatic 53	com/android/thinkive/framework/message/MessageManager:getInstance	(Landroid/content/Context;)Lcom/android/thinkive/framework/message/MessageManager;
    //   38: ldc 54
    //   40: ldc 56
    //   42: aconst_null
    //   43: invokevirtual 60	com/android/thinkive/framework/message/MessageManager:buildMessageReturn	(ILjava/lang/String;Lorg/json/JSONArray;)Ljava/lang/String;
    //   46: areturn
    //   47: aload 4
    //   49: invokestatic 47	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   52: ifeq +16 -> 68
    //   55: aload_1
    //   56: invokestatic 53	com/android/thinkive/framework/message/MessageManager:getInstance	(Landroid/content/Context;)Lcom/android/thinkive/framework/message/MessageManager;
    //   59: ldc 61
    //   61: ldc 63
    //   63: aconst_null
    //   64: invokevirtual 60	com/android/thinkive/framework/message/MessageManager:buildMessageReturn	(ILjava/lang/String;Lorg/json/JSONArray;)Ljava/lang/String;
    //   67: areturn
    //   68: aload_2
    //   69: invokestatic 47	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   72: ifeq +16 -> 88
    //   75: aload_1
    //   76: invokestatic 53	com/android/thinkive/framework/message/MessageManager:getInstance	(Landroid/content/Context;)Lcom/android/thinkive/framework/message/MessageManager;
    //   79: ldc 64
    //   81: ldc 66
    //   83: aconst_null
    //   84: invokevirtual 60	com/android/thinkive/framework/message/MessageManager:buildMessageReturn	(ILjava/lang/String;Lorg/json/JSONArray;)Ljava/lang/String;
    //   87: areturn
    //   88: aload_1
    //   89: aload_1
    //   90: invokestatic 71	com/android/thinkive/framework/config/ConfigManager:getInstance	(Landroid/content/Context;)Lcom/android/thinkive/framework/config/ConfigManager;
    //   93: ldc 73
    //   95: invokevirtual 76	com/android/thinkive/framework/config/ConfigManager:getSystemConfigValue	(Ljava/lang/String;)Ljava/lang/String;
    //   98: invokestatic 82	g:a	(Landroid/content/Context;Ljava/lang/String;)Lg;
    //   101: astore 5
    //   103: aload 5
    //   105: ifnonnull +15 -> 120
    //   108: aload_1
    //   109: invokestatic 53	com/android/thinkive/framework/message/MessageManager:getInstance	(Landroid/content/Context;)Lcom/android/thinkive/framework/message/MessageManager;
    //   112: iconst_m1
    //   113: ldc 84
    //   115: aconst_null
    //   116: invokevirtual 60	com/android/thinkive/framework/message/MessageManager:buildMessageReturn	(ILjava/lang/String;Lorg/json/JSONArray;)Ljava/lang/String;
    //   119: areturn
    //   120: aload 5
    //   122: aload_1
    //   123: aload_2
    //   124: ldc 86
    //   126: sipush 1024
    //   129: invokevirtual 89	g:a	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    //   132: astore_2
    //   133: new 91	org/json/JSONArray
    //   136: dup
    //   137: invokespecial 92	org/json/JSONArray:<init>	()V
    //   140: astore 5
    //   142: new 33	org/json/JSONObject
    //   145: dup
    //   146: invokespecial 93	org/json/JSONObject:<init>	()V
    //   149: astore 6
    //   151: aload 6
    //   153: ldc 95
    //   155: aload_3
    //   156: aload 4
    //   158: invokestatic 100	bq:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   161: invokevirtual 104	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   164: pop
    //   165: aload 6
    //   167: ldc 106
    //   169: aload_2
    //   170: invokevirtual 104	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   173: pop
    //   174: aload 6
    //   176: ldc 108
    //   178: aload_3
    //   179: invokevirtual 104	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   182: pop
    //   183: aload 5
    //   185: aload 6
    //   187: invokevirtual 111	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   190: pop
    //   191: aload_1
    //   192: invokestatic 53	com/android/thinkive/framework/message/MessageManager:getInstance	(Landroid/content/Context;)Lcom/android/thinkive/framework/message/MessageManager;
    //   195: iconst_1
    //   196: aconst_null
    //   197: aload 5
    //   199: invokevirtual 60	com/android/thinkive/framework/message/MessageManager:buildMessageReturn	(ILjava/lang/String;Lorg/json/JSONArray;)Ljava/lang/String;
    //   202: areturn
    //   203: astore_2
    //   204: aload_2
    //   205: invokevirtual 114	java/security/InvalidKeyException:printStackTrace	()V
    //   208: aconst_null
    //   209: astore_2
    //   210: goto -77 -> 133
    //   213: astore_2
    //   214: aload_2
    //   215: invokevirtual 115	java/security/NoSuchAlgorithmException:printStackTrace	()V
    //   218: aconst_null
    //   219: astore_2
    //   220: goto -87 -> 133
    //   223: astore_2
    //   224: aload_2
    //   225: invokevirtual 116	java/security/NoSuchProviderException:printStackTrace	()V
    //   228: aconst_null
    //   229: astore_2
    //   230: goto -97 -> 133
    //   233: astore_2
    //   234: aload_2
    //   235: invokevirtual 117	java/security/SignatureException:printStackTrace	()V
    //   238: aconst_null
    //   239: astore_2
    //   240: goto -107 -> 133
    //   243: astore_2
    //   244: ldc 119
    //   246: invokestatic 125	com/android/thinkive/framework/util/Log:d	(Ljava/lang/String;)V
    //   249: goto -58 -> 191
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	252	0	this	bi
    //   0	252	1	paramContext	android.content.Context
    //   0	252	2	paramAppMessage	com.android.thinkive.framework.message.AppMessage
    //   11	168	3	str1	String
    //   18	139	4	str2	String
    //   101	97	5	localObject	Object
    //   149	37	6	localJSONObject	org.json.JSONObject
    // Exception table:
    //   from	to	target	type
    //   120	133	203	java/security/InvalidKeyException
    //   120	133	213	java/security/NoSuchAlgorithmException
    //   120	133	223	java/security/NoSuchProviderException
    //   120	133	233	java/security/SignatureException
    //   151	191	243	org/json/JSONException
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\bi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */