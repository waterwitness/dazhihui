package com.kwlopen.sdk;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;

public class KwlSignCertificatePluginOrg
  extends CordovaPlugin
{
  private static KwlSignCertificatePluginOrg kwlSignCertificatePlugin;
  private CallbackContext callbackContext;
  private CordovaInterface cordovaInterface;
  private CordovaPlugin cordovaPlugin;
  
  public static KwlSignCertificatePluginOrg getInstance()
  {
    if (kwlSignCertificatePlugin == null) {
      kwlSignCertificatePlugin = new KwlSignCertificatePluginOrg();
    }
    return kwlSignCertificatePlugin;
  }
  
  public boolean execute(String paramString, JSONArray paramJSONArray, CallbackContext paramCallbackContext)
  {
    return execute(this.cordova, this, paramString, paramJSONArray, paramCallbackContext);
  }
  
  /* Error */
  public boolean execute(CordovaInterface paramCordovaInterface, CordovaPlugin paramCordovaPlugin, String paramString, JSONArray paramJSONArray, CallbackContext paramCallbackContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: putfield 34	com/kwlopen/sdk/KwlSignCertificatePluginOrg:cordovaInterface	Lorg/apache/cordova/CordovaInterface;
    //   5: aload_0
    //   6: aload_2
    //   7: putfield 36	com/kwlopen/sdk/KwlSignCertificatePluginOrg:cordovaPlugin	Lorg/apache/cordova/CordovaPlugin;
    //   10: aload_0
    //   11: aload 5
    //   13: putfield 38	com/kwlopen/sdk/KwlSignCertificatePluginOrg:callbackContext	Lorg/apache/cordova/CallbackContext;
    //   16: aload_3
    //   17: ldc 40
    //   19: invokevirtual 46	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   22: ifeq +194 -> 216
    //   25: aload 4
    //   27: iconst_0
    //   28: invokevirtual 52	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   31: ldc 54
    //   33: invokevirtual 60	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   36: checkcast 42	java/lang/String
    //   39: astore_1
    //   40: aload 4
    //   42: iconst_0
    //   43: invokevirtual 52	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   46: ldc 62
    //   48: invokevirtual 60	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   51: checkcast 42	java/lang/String
    //   54: astore_2
    //   55: aload 4
    //   57: iconst_0
    //   58: invokevirtual 52	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   61: ldc 64
    //   63: invokevirtual 60	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   66: checkcast 42	java/lang/String
    //   69: astore_3
    //   70: aload 4
    //   72: iconst_0
    //   73: invokevirtual 52	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   76: ldc 66
    //   78: invokevirtual 60	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   81: checkcast 42	java/lang/String
    //   84: astore 6
    //   86: aload_1
    //   87: astore 4
    //   89: aload 4
    //   91: invokestatic 72	com/kwlopen/sdk/ca/CaManage:setLicense	(Ljava/lang/String;)V
    //   94: aload_0
    //   95: getfield 34	com/kwlopen/sdk/KwlSignCertificatePluginOrg:cordovaInterface	Lorg/apache/cordova/CordovaInterface;
    //   98: invokeinterface 78 1 0
    //   103: aload_2
    //   104: aload_3
    //   105: aload 6
    //   107: invokestatic 81	com/kwlopen/sdk/ca/CaManage:initCert	(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    //   110: istore 13
    //   112: new 56	org/json/JSONObject
    //   115: dup
    //   116: invokespecial 82	org/json/JSONObject:<init>	()V
    //   119: astore_1
    //   120: aload_1
    //   121: ldc 84
    //   123: iload 13
    //   125: invokevirtual 88	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   128: pop
    //   129: aload_1
    //   130: ldc 90
    //   132: new 92	java/lang/StringBuilder
    //   135: dup
    //   136: invokespecial 93	java/lang/StringBuilder:<init>	()V
    //   139: aload_0
    //   140: getfield 34	com/kwlopen/sdk/KwlSignCertificatePluginOrg:cordovaInterface	Lorg/apache/cordova/CordovaInterface;
    //   143: invokeinterface 78 1 0
    //   148: invokestatic 97	com/kwlopen/sdk/ca/CaManage:getError	(Landroid/app/Activity;)Ljava/lang/String;
    //   151: invokevirtual 101	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   154: invokevirtual 105	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   157: invokevirtual 108	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   160: pop
    //   161: aload_0
    //   162: getfield 34	com/kwlopen/sdk/KwlSignCertificatePluginOrg:cordovaInterface	Lorg/apache/cordova/CordovaInterface;
    //   165: invokeinterface 112 1 0
    //   170: new 114	com/kwlopen/sdk/KwlSignCertificatePluginOrg$1
    //   173: dup
    //   174: aload_0
    //   175: aload 5
    //   177: aload_1
    //   178: invokespecial 117	com/kwlopen/sdk/KwlSignCertificatePluginOrg$1:<init>	(Lcom/kwlopen/sdk/KwlSignCertificatePluginOrg;Lorg/apache/cordova/CallbackContext;Lorg/json/JSONObject;)V
    //   181: invokeinterface 122 2 0
    //   186: iconst_1
    //   187: ireturn
    //   188: astore_3
    //   189: aconst_null
    //   190: astore 4
    //   192: aconst_null
    //   193: astore_2
    //   194: aconst_null
    //   195: astore_1
    //   196: aload_3
    //   197: invokevirtual 125	org/json/JSONException:printStackTrace	()V
    //   200: aconst_null
    //   201: astore 6
    //   203: aload_1
    //   204: astore_3
    //   205: goto -116 -> 89
    //   208: astore_1
    //   209: aload_1
    //   210: invokevirtual 125	org/json/JSONException:printStackTrace	()V
    //   213: goto -27 -> 186
    //   216: aload_3
    //   217: ldc 127
    //   219: invokevirtual 46	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   222: ifeq +300 -> 522
    //   225: aconst_null
    //   226: astore_2
    //   227: aconst_null
    //   228: astore_3
    //   229: aconst_null
    //   230: astore 11
    //   232: aconst_null
    //   233: astore 10
    //   235: aconst_null
    //   236: astore 9
    //   238: sipush 1024
    //   241: istore 13
    //   243: ldc -127
    //   245: astore 8
    //   247: aload 4
    //   249: iconst_0
    //   250: invokevirtual 52	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   253: ldc 62
    //   255: invokevirtual 60	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   258: checkcast 42	java/lang/String
    //   261: astore_1
    //   262: aload 4
    //   264: iconst_0
    //   265: invokevirtual 52	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   268: ldc -125
    //   270: invokevirtual 60	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   273: checkcast 42	java/lang/String
    //   276: astore_2
    //   277: aload 4
    //   279: iconst_0
    //   280: invokevirtual 52	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   283: ldc -123
    //   285: invokevirtual 60	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   288: checkcast 42	java/lang/String
    //   291: astore_3
    //   292: aload 4
    //   294: iconst_0
    //   295: invokevirtual 52	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   298: ldc -121
    //   300: invokevirtual 60	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   303: checkcast 42	java/lang/String
    //   306: astore 6
    //   308: aload 4
    //   310: iconst_0
    //   311: invokevirtual 52	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   314: ldc -119
    //   316: invokevirtual 60	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   319: checkcast 42	java/lang/String
    //   322: astore 7
    //   324: aload 4
    //   326: iconst_0
    //   327: invokevirtual 52	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   330: ldc -117
    //   332: invokevirtual 60	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   335: checkcast 42	java/lang/String
    //   338: invokestatic 145	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   341: istore 14
    //   343: iload 14
    //   345: istore 13
    //   347: aload 4
    //   349: iconst_0
    //   350: invokevirtual 52	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   353: ldc -109
    //   355: invokevirtual 60	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   358: checkcast 42	java/lang/String
    //   361: astore 4
    //   363: iload 14
    //   365: istore 13
    //   367: aload_0
    //   368: getfield 34	com/kwlopen/sdk/KwlSignCertificatePluginOrg:cordovaInterface	Lorg/apache/cordova/CordovaInterface;
    //   371: invokeinterface 78 1 0
    //   376: aload_1
    //   377: aload_2
    //   378: aload_3
    //   379: aload 6
    //   381: aload 7
    //   383: iload 13
    //   385: aload 4
    //   387: invokestatic 150	com/kwlopen/sdk/ca/CaManage:getPKCS10	(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    //   390: astore_1
    //   391: new 56	org/json/JSONObject
    //   394: dup
    //   395: invokespecial 82	org/json/JSONObject:<init>	()V
    //   398: astore_2
    //   399: aload_2
    //   400: ldc 90
    //   402: new 92	java/lang/StringBuilder
    //   405: dup
    //   406: invokespecial 93	java/lang/StringBuilder:<init>	()V
    //   409: aload_0
    //   410: getfield 34	com/kwlopen/sdk/KwlSignCertificatePluginOrg:cordovaInterface	Lorg/apache/cordova/CordovaInterface;
    //   413: invokeinterface 78 1 0
    //   418: invokestatic 97	com/kwlopen/sdk/ca/CaManage:getError	(Landroid/app/Activity;)Ljava/lang/String;
    //   421: invokevirtual 101	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   424: invokevirtual 105	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   427: invokevirtual 108	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   430: pop
    //   431: aload_2
    //   432: ldc -104
    //   434: new 92	java/lang/StringBuilder
    //   437: dup
    //   438: invokespecial 93	java/lang/StringBuilder:<init>	()V
    //   441: aload_1
    //   442: invokevirtual 101	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   445: invokevirtual 105	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   448: invokevirtual 108	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   451: pop
    //   452: aload_0
    //   453: getfield 34	com/kwlopen/sdk/KwlSignCertificatePluginOrg:cordovaInterface	Lorg/apache/cordova/CordovaInterface;
    //   456: invokeinterface 112 1 0
    //   461: new 154	com/kwlopen/sdk/KwlSignCertificatePluginOrg$2
    //   464: dup
    //   465: aload_0
    //   466: aload 5
    //   468: aload_2
    //   469: invokespecial 155	com/kwlopen/sdk/KwlSignCertificatePluginOrg$2:<init>	(Lcom/kwlopen/sdk/KwlSignCertificatePluginOrg;Lorg/apache/cordova/CallbackContext;Lorg/json/JSONObject;)V
    //   472: invokeinterface 122 2 0
    //   477: iconst_1
    //   478: ireturn
    //   479: astore 12
    //   481: aload 9
    //   483: astore 7
    //   485: aload 10
    //   487: astore 6
    //   489: aload 11
    //   491: astore 4
    //   493: aload_2
    //   494: astore_1
    //   495: aload 12
    //   497: astore_2
    //   498: aload_2
    //   499: invokevirtual 125	org/json/JSONException:printStackTrace	()V
    //   502: aload_3
    //   503: astore_2
    //   504: aload 4
    //   506: astore_3
    //   507: aload 8
    //   509: astore 4
    //   511: goto -144 -> 367
    //   514: astore_1
    //   515: aload_1
    //   516: invokevirtual 125	org/json/JSONException:printStackTrace	()V
    //   519: goto -42 -> 477
    //   522: aload_3
    //   523: ldc -99
    //   525: invokevirtual 46	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   528: ifeq +145 -> 673
    //   531: aload 4
    //   533: iconst_0
    //   534: invokevirtual 52	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   537: ldc 62
    //   539: invokevirtual 60	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   542: checkcast 42	java/lang/String
    //   545: astore_1
    //   546: aload 4
    //   548: iconst_0
    //   549: invokevirtual 52	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   552: ldc -97
    //   554: invokevirtual 60	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   557: checkcast 42	java/lang/String
    //   560: astore_2
    //   561: aload_0
    //   562: getfield 34	com/kwlopen/sdk/KwlSignCertificatePluginOrg:cordovaInterface	Lorg/apache/cordova/CordovaInterface;
    //   565: invokeinterface 78 1 0
    //   570: aload_1
    //   571: aload_2
    //   572: invokestatic 162	com/kwlopen/sdk/ca/CaManage:installCert	(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)I
    //   575: istore 13
    //   577: new 56	org/json/JSONObject
    //   580: dup
    //   581: invokespecial 82	org/json/JSONObject:<init>	()V
    //   584: astore_1
    //   585: aload_1
    //   586: ldc 84
    //   588: iload 13
    //   590: invokevirtual 88	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   593: pop
    //   594: aload_1
    //   595: ldc 90
    //   597: new 92	java/lang/StringBuilder
    //   600: dup
    //   601: invokespecial 93	java/lang/StringBuilder:<init>	()V
    //   604: aload_0
    //   605: getfield 34	com/kwlopen/sdk/KwlSignCertificatePluginOrg:cordovaInterface	Lorg/apache/cordova/CordovaInterface;
    //   608: invokeinterface 78 1 0
    //   613: invokestatic 97	com/kwlopen/sdk/ca/CaManage:getError	(Landroid/app/Activity;)Ljava/lang/String;
    //   616: invokevirtual 101	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   619: invokevirtual 105	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   622: invokevirtual 108	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   625: pop
    //   626: aload_0
    //   627: getfield 34	com/kwlopen/sdk/KwlSignCertificatePluginOrg:cordovaInterface	Lorg/apache/cordova/CordovaInterface;
    //   630: invokeinterface 112 1 0
    //   635: new 164	com/kwlopen/sdk/KwlSignCertificatePluginOrg$3
    //   638: dup
    //   639: aload_0
    //   640: aload 5
    //   642: aload_1
    //   643: invokespecial 165	com/kwlopen/sdk/KwlSignCertificatePluginOrg$3:<init>	(Lcom/kwlopen/sdk/KwlSignCertificatePluginOrg;Lorg/apache/cordova/CallbackContext;Lorg/json/JSONObject;)V
    //   646: invokeinterface 122 2 0
    //   651: iconst_1
    //   652: ireturn
    //   653: astore_2
    //   654: aconst_null
    //   655: astore_1
    //   656: aload_2
    //   657: invokevirtual 125	org/json/JSONException:printStackTrace	()V
    //   660: aconst_null
    //   661: astore_2
    //   662: goto -101 -> 561
    //   665: astore_1
    //   666: aload_1
    //   667: invokevirtual 125	org/json/JSONException:printStackTrace	()V
    //   670: goto -19 -> 651
    //   673: aload_3
    //   674: ldc -89
    //   676: invokevirtual 46	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   679: ifeq +260 -> 939
    //   682: iconst_0
    //   683: istore 13
    //   685: aload 4
    //   687: iconst_0
    //   688: invokevirtual 52	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   691: ldc -87
    //   693: invokevirtual 60	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   696: checkcast 42	java/lang/String
    //   699: astore_1
    //   700: aload 4
    //   702: iconst_0
    //   703: invokevirtual 52	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   706: ldc -85
    //   708: invokevirtual 60	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   711: checkcast 42	java/lang/String
    //   714: astore_3
    //   715: aload 4
    //   717: iconst_0
    //   718: invokevirtual 52	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   721: ldc -83
    //   723: invokevirtual 60	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   726: checkcast 42	java/lang/String
    //   729: astore_2
    //   730: aload 4
    //   732: iconst_0
    //   733: invokevirtual 52	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   736: ldc -81
    //   738: invokevirtual 60	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   741: checkcast 42	java/lang/String
    //   744: invokestatic 145	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   747: istore 14
    //   749: iload 14
    //   751: istore 13
    //   753: new 92	java/lang/StringBuilder
    //   756: dup
    //   757: invokespecial 93	java/lang/StringBuilder:<init>	()V
    //   760: aload 4
    //   762: iconst_0
    //   763: invokevirtual 52	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   766: ldc -79
    //   768: invokevirtual 60	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   771: checkcast 42	java/lang/String
    //   774: invokevirtual 101	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   777: invokevirtual 105	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   780: astore 6
    //   782: aload_1
    //   783: astore 4
    //   785: aload 6
    //   787: astore_1
    //   788: aload_3
    //   789: astore 6
    //   791: aload_2
    //   792: astore_3
    //   793: aload_1
    //   794: astore_2
    //   795: iload 14
    //   797: istore 13
    //   799: aload_0
    //   800: getfield 34	com/kwlopen/sdk/KwlSignCertificatePluginOrg:cordovaInterface	Lorg/apache/cordova/CordovaInterface;
    //   803: invokeinterface 78 1 0
    //   808: aload 4
    //   810: aload 6
    //   812: aload_3
    //   813: iload 13
    //   815: invokestatic 180	com/kwlopen/sdk/ca/CaManage:signMessage	(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    //   818: astore_1
    //   819: new 56	org/json/JSONObject
    //   822: dup
    //   823: invokespecial 82	org/json/JSONObject:<init>	()V
    //   826: astore_3
    //   827: aload_3
    //   828: ldc -79
    //   830: aload_2
    //   831: invokevirtual 108	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   834: pop
    //   835: aload_3
    //   836: ldc 90
    //   838: new 92	java/lang/StringBuilder
    //   841: dup
    //   842: invokespecial 93	java/lang/StringBuilder:<init>	()V
    //   845: aload_0
    //   846: getfield 34	com/kwlopen/sdk/KwlSignCertificatePluginOrg:cordovaInterface	Lorg/apache/cordova/CordovaInterface;
    //   849: invokeinterface 78 1 0
    //   854: invokestatic 97	com/kwlopen/sdk/ca/CaManage:getError	(Landroid/app/Activity;)Ljava/lang/String;
    //   857: invokevirtual 101	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   860: invokevirtual 105	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   863: invokevirtual 108	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   866: pop
    //   867: aload_3
    //   868: ldc -104
    //   870: aload_1
    //   871: invokevirtual 108	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   874: pop
    //   875: aload_0
    //   876: getfield 34	com/kwlopen/sdk/KwlSignCertificatePluginOrg:cordovaInterface	Lorg/apache/cordova/CordovaInterface;
    //   879: invokeinterface 112 1 0
    //   884: new 182	com/kwlopen/sdk/KwlSignCertificatePluginOrg$4
    //   887: dup
    //   888: aload_0
    //   889: aload 5
    //   891: aload_3
    //   892: invokespecial 183	com/kwlopen/sdk/KwlSignCertificatePluginOrg$4:<init>	(Lcom/kwlopen/sdk/KwlSignCertificatePluginOrg;Lorg/apache/cordova/CallbackContext;Lorg/json/JSONObject;)V
    //   895: invokeinterface 122 2 0
    //   900: iconst_1
    //   901: ireturn
    //   902: astore 4
    //   904: iconst_0
    //   905: istore 13
    //   907: aconst_null
    //   908: astore_2
    //   909: aconst_null
    //   910: astore_3
    //   911: aconst_null
    //   912: astore_1
    //   913: aload 4
    //   915: invokevirtual 125	org/json/JSONException:printStackTrace	()V
    //   918: aload_2
    //   919: astore 4
    //   921: aload_3
    //   922: astore 6
    //   924: aconst_null
    //   925: astore_2
    //   926: aload_1
    //   927: astore_3
    //   928: goto -129 -> 799
    //   931: astore_1
    //   932: aload_1
    //   933: invokevirtual 125	org/json/JSONException:printStackTrace	()V
    //   936: goto -36 -> 900
    //   939: aload_3
    //   940: ldc -71
    //   942: invokevirtual 46	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   945: ifeq +280 -> 1225
    //   948: new 56	org/json/JSONObject
    //   951: dup
    //   952: invokespecial 82	org/json/JSONObject:<init>	()V
    //   955: astore 7
    //   957: aload 4
    //   959: iconst_0
    //   960: invokevirtual 52	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   963: ldc -69
    //   965: invokevirtual 190	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   968: astore_1
    //   969: aload 4
    //   971: iconst_0
    //   972: invokevirtual 52	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   975: ldc -85
    //   977: invokevirtual 60	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   980: checkcast 42	java/lang/String
    //   983: astore_2
    //   984: aload 4
    //   986: iconst_0
    //   987: invokevirtual 52	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   990: ldc -83
    //   992: invokevirtual 60	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   995: checkcast 42	java/lang/String
    //   998: astore_3
    //   999: aload 4
    //   1001: iconst_0
    //   1002: invokevirtual 52	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   1005: ldc -81
    //   1007: invokevirtual 60	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   1010: checkcast 42	java/lang/String
    //   1013: invokestatic 145	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   1016: istore 13
    //   1018: aload_3
    //   1019: astore 4
    //   1021: aload_2
    //   1022: astore_3
    //   1023: aload 4
    //   1025: astore_2
    //   1026: aload_1
    //   1027: invokevirtual 194	org/json/JSONObject:keys	()Ljava/util/Iterator;
    //   1030: astore 4
    //   1032: new 56	org/json/JSONObject
    //   1035: dup
    //   1036: invokespecial 82	org/json/JSONObject:<init>	()V
    //   1039: astore 6
    //   1041: aload 4
    //   1043: invokeinterface 200 1 0
    //   1048: ifne +110 -> 1158
    //   1051: aload_0
    //   1052: getfield 34	com/kwlopen/sdk/KwlSignCertificatePluginOrg:cordovaInterface	Lorg/apache/cordova/CordovaInterface;
    //   1055: invokeinterface 78 1 0
    //   1060: aconst_null
    //   1061: aload_3
    //   1062: aload_2
    //   1063: iload 13
    //   1065: invokestatic 180	com/kwlopen/sdk/ca/CaManage:signMessage	(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    //   1068: astore_1
    //   1069: aload 7
    //   1071: ldc 90
    //   1073: new 92	java/lang/StringBuilder
    //   1076: dup
    //   1077: invokespecial 93	java/lang/StringBuilder:<init>	()V
    //   1080: aload_0
    //   1081: getfield 34	com/kwlopen/sdk/KwlSignCertificatePluginOrg:cordovaInterface	Lorg/apache/cordova/CordovaInterface;
    //   1084: invokeinterface 78 1 0
    //   1089: invokestatic 97	com/kwlopen/sdk/ca/CaManage:getError	(Landroid/app/Activity;)Ljava/lang/String;
    //   1092: invokevirtual 101	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1095: invokevirtual 105	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1098: invokevirtual 108	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   1101: pop
    //   1102: aload 7
    //   1104: ldc -104
    //   1106: aload_1
    //   1107: invokevirtual 108	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   1110: pop
    //   1111: aload_0
    //   1112: getfield 34	com/kwlopen/sdk/KwlSignCertificatePluginOrg:cordovaInterface	Lorg/apache/cordova/CordovaInterface;
    //   1115: invokeinterface 112 1 0
    //   1120: new 202	com/kwlopen/sdk/KwlSignCertificatePluginOrg$5
    //   1123: dup
    //   1124: aload_0
    //   1125: aload 5
    //   1127: aload 7
    //   1129: invokespecial 203	com/kwlopen/sdk/KwlSignCertificatePluginOrg$5:<init>	(Lcom/kwlopen/sdk/KwlSignCertificatePluginOrg;Lorg/apache/cordova/CallbackContext;Lorg/json/JSONObject;)V
    //   1132: invokeinterface 122 2 0
    //   1137: iconst_1
    //   1138: ireturn
    //   1139: astore 4
    //   1141: aconst_null
    //   1142: astore_1
    //   1143: aconst_null
    //   1144: astore_3
    //   1145: aconst_null
    //   1146: astore_2
    //   1147: aload 4
    //   1149: invokevirtual 125	org/json/JSONException:printStackTrace	()V
    //   1152: iconst_0
    //   1153: istore 13
    //   1155: goto -129 -> 1026
    //   1158: aload 4
    //   1160: invokeinterface 207 1 0
    //   1165: checkcast 42	java/lang/String
    //   1168: astore 8
    //   1170: aload_1
    //   1171: aload 8
    //   1173: invokevirtual 211	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   1176: astore 9
    //   1178: aload 6
    //   1180: aload 8
    //   1182: aload_0
    //   1183: getfield 34	com/kwlopen/sdk/KwlSignCertificatePluginOrg:cordovaInterface	Lorg/apache/cordova/CordovaInterface;
    //   1186: invokeinterface 78 1 0
    //   1191: aload 9
    //   1193: aload_3
    //   1194: aload_2
    //   1195: iload 13
    //   1197: invokestatic 180	com/kwlopen/sdk/ca/CaManage:signMessage	(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    //   1200: invokevirtual 108	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   1203: pop
    //   1204: goto -163 -> 1041
    //   1207: astore 8
    //   1209: aload 8
    //   1211: invokevirtual 125	org/json/JSONException:printStackTrace	()V
    //   1214: goto -173 -> 1041
    //   1217: astore_1
    //   1218: aload_1
    //   1219: invokevirtual 125	org/json/JSONException:printStackTrace	()V
    //   1222: goto -85 -> 1137
    //   1225: iconst_0
    //   1226: ireturn
    //   1227: astore 4
    //   1229: aconst_null
    //   1230: astore_3
    //   1231: aconst_null
    //   1232: astore_2
    //   1233: goto -86 -> 1147
    //   1236: astore 4
    //   1238: aconst_null
    //   1239: astore 6
    //   1241: aload_2
    //   1242: astore_3
    //   1243: aload 6
    //   1245: astore_2
    //   1246: goto -99 -> 1147
    //   1249: astore 6
    //   1251: aload_2
    //   1252: astore 4
    //   1254: aload_3
    //   1255: astore_2
    //   1256: aload 4
    //   1258: astore_3
    //   1259: aload 6
    //   1261: astore 4
    //   1263: goto -116 -> 1147
    //   1266: astore 4
    //   1268: aconst_null
    //   1269: astore_3
    //   1270: aconst_null
    //   1271: astore 6
    //   1273: aload_1
    //   1274: astore_2
    //   1275: iconst_0
    //   1276: istore 13
    //   1278: aload 6
    //   1280: astore_1
    //   1281: goto -368 -> 913
    //   1284: astore 4
    //   1286: aconst_null
    //   1287: astore 6
    //   1289: aload_1
    //   1290: astore_2
    //   1291: iconst_0
    //   1292: istore 13
    //   1294: aload 6
    //   1296: astore_1
    //   1297: goto -384 -> 913
    //   1300: astore 6
    //   1302: aload_1
    //   1303: astore 4
    //   1305: aload_2
    //   1306: astore_1
    //   1307: aload 4
    //   1309: astore_2
    //   1310: aload 6
    //   1312: astore 4
    //   1314: goto -401 -> 913
    //   1317: astore_2
    //   1318: goto -662 -> 656
    //   1321: astore_2
    //   1322: aload 11
    //   1324: astore 4
    //   1326: aload 10
    //   1328: astore 6
    //   1330: aload 9
    //   1332: astore 7
    //   1334: goto -836 -> 498
    //   1337: astore 4
    //   1339: aload_2
    //   1340: astore_3
    //   1341: aload 4
    //   1343: astore_2
    //   1344: aload 11
    //   1346: astore 4
    //   1348: aload 10
    //   1350: astore 6
    //   1352: aload 9
    //   1354: astore 7
    //   1356: goto -858 -> 498
    //   1359: astore 6
    //   1361: aload_3
    //   1362: astore 4
    //   1364: aload_2
    //   1365: astore_3
    //   1366: aload 6
    //   1368: astore_2
    //   1369: aload 10
    //   1371: astore 6
    //   1373: aload 9
    //   1375: astore 7
    //   1377: goto -879 -> 498
    //   1380: astore 7
    //   1382: aload_3
    //   1383: astore 4
    //   1385: aload_2
    //   1386: astore_3
    //   1387: aload 7
    //   1389: astore_2
    //   1390: aload 9
    //   1392: astore 7
    //   1394: goto -896 -> 498
    //   1397: astore 9
    //   1399: aload_3
    //   1400: astore 4
    //   1402: aload_2
    //   1403: astore_3
    //   1404: aload 9
    //   1406: astore_2
    //   1407: goto -909 -> 498
    //   1410: astore_3
    //   1411: aconst_null
    //   1412: astore_2
    //   1413: aconst_null
    //   1414: astore 6
    //   1416: aload_1
    //   1417: astore 4
    //   1419: aload 6
    //   1421: astore_1
    //   1422: goto -1226 -> 196
    //   1425: astore_3
    //   1426: aconst_null
    //   1427: astore 6
    //   1429: aload_1
    //   1430: astore 4
    //   1432: aload 6
    //   1434: astore_1
    //   1435: goto -1239 -> 196
    //   1438: astore 6
    //   1440: aload_1
    //   1441: astore 4
    //   1443: aload_3
    //   1444: astore_1
    //   1445: aload 6
    //   1447: astore_3
    //   1448: goto -1252 -> 196
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1451	0	this	KwlSignCertificatePluginOrg
    //   0	1451	1	paramCordovaInterface	CordovaInterface
    //   0	1451	2	paramCordovaPlugin	CordovaPlugin
    //   0	1451	3	paramString	String
    //   0	1451	4	paramJSONArray	JSONArray
    //   0	1451	5	paramCallbackContext	CallbackContext
    //   84	1160	6	localObject1	Object
    //   1249	11	6	localJSONException1	org.json.JSONException
    //   1271	24	6	localObject2	Object
    //   1300	11	6	localJSONException2	org.json.JSONException
    //   1328	23	6	localObject3	Object
    //   1359	8	6	localJSONException3	org.json.JSONException
    //   1371	62	6	localObject4	Object
    //   1438	8	6	localJSONException4	org.json.JSONException
    //   322	1054	7	localObject5	Object
    //   1380	8	7	localJSONException5	org.json.JSONException
    //   1392	1	7	str1	String
    //   245	936	8	str2	String
    //   1207	3	8	localJSONException6	org.json.JSONException
    //   236	1155	9	str3	String
    //   1397	8	9	localJSONException7	org.json.JSONException
    //   233	1137	10	localObject6	Object
    //   230	1115	11	localObject7	Object
    //   479	17	12	localJSONException8	org.json.JSONException
    //   110	1183	13	i	int
    //   341	455	14	j	int
    // Exception table:
    //   from	to	target	type
    //   25	40	188	org/json/JSONException
    //   120	186	208	org/json/JSONException
    //   247	262	479	org/json/JSONException
    //   399	477	514	org/json/JSONException
    //   531	546	653	org/json/JSONException
    //   585	651	665	org/json/JSONException
    //   685	700	902	org/json/JSONException
    //   827	900	931	org/json/JSONException
    //   957	969	1139	org/json/JSONException
    //   1170	1204	1207	org/json/JSONException
    //   1069	1137	1217	org/json/JSONException
    //   969	984	1227	org/json/JSONException
    //   984	999	1236	org/json/JSONException
    //   999	1018	1249	org/json/JSONException
    //   700	715	1266	org/json/JSONException
    //   715	730	1284	org/json/JSONException
    //   730	749	1300	org/json/JSONException
    //   753	782	1300	org/json/JSONException
    //   546	561	1317	org/json/JSONException
    //   262	277	1321	org/json/JSONException
    //   277	292	1337	org/json/JSONException
    //   292	308	1359	org/json/JSONException
    //   308	324	1380	org/json/JSONException
    //   324	343	1397	org/json/JSONException
    //   347	363	1397	org/json/JSONException
    //   40	55	1410	org/json/JSONException
    //   55	70	1425	org/json/JSONException
    //   70	86	1438	org/json/JSONException
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwlopen\sdk\KwlSignCertificatePluginOrg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */