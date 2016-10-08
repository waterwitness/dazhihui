package com.kwlopen.sdk;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;

public class KwlSignCertificatePlugin
  extends CordovaPlugin
{
  private static KwlSignCertificatePlugin kwlSignCertificatePlugin;
  private CallbackContext callbackContext;
  private CordovaInterface cordovaInterface;
  private CordovaPlugin cordovaPlugin;
  
  public static KwlSignCertificatePlugin getInstance()
  {
    if (kwlSignCertificatePlugin == null) {
      kwlSignCertificatePlugin = new KwlSignCertificatePlugin();
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
    //   0: aconst_null
    //   1: astore 7
    //   3: iconst_0
    //   4: istore 8
    //   6: aload_0
    //   7: aload_1
    //   8: putfield 21	com/kwlopen/sdk/KwlSignCertificatePlugin:cordovaInterface	Lorg/apache/cordova/CordovaInterface;
    //   11: aload_0
    //   12: aload_2
    //   13: putfield 38	com/kwlopen/sdk/KwlSignCertificatePlugin:cordovaPlugin	Lorg/apache/cordova/CordovaPlugin;
    //   16: aload_0
    //   17: aload 5
    //   19: putfield 40	com/kwlopen/sdk/KwlSignCertificatePlugin:callbackContext	Lorg/apache/cordova/CallbackContext;
    //   22: aload_3
    //   23: ldc 42
    //   25: invokevirtual 48	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   28: ifeq +194 -> 222
    //   31: aload 4
    //   33: iconst_0
    //   34: invokevirtual 54	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   37: ldc 56
    //   39: invokevirtual 62	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   42: checkcast 44	java/lang/String
    //   45: astore_1
    //   46: aload 4
    //   48: iconst_0
    //   49: invokevirtual 54	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   52: ldc 64
    //   54: invokevirtual 62	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   57: checkcast 44	java/lang/String
    //   60: astore_2
    //   61: aload 4
    //   63: iconst_0
    //   64: invokevirtual 54	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   67: ldc 66
    //   69: invokevirtual 62	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   72: checkcast 44	java/lang/String
    //   75: astore_3
    //   76: aload 4
    //   78: iconst_0
    //   79: invokevirtual 54	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   82: ldc 68
    //   84: invokevirtual 62	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   87: checkcast 44	java/lang/String
    //   90: astore 6
    //   92: aload_1
    //   93: astore 4
    //   95: aload 4
    //   97: invokestatic 74	com/kwlopen/sdk/ca/CaManage:setLicense	(Ljava/lang/String;)V
    //   100: aload_0
    //   101: getfield 21	com/kwlopen/sdk/KwlSignCertificatePlugin:cordovaInterface	Lorg/apache/cordova/CordovaInterface;
    //   104: invokeinterface 80 1 0
    //   109: aload_2
    //   110: aload_3
    //   111: aload 6
    //   113: invokestatic 83	com/kwlopen/sdk/ca/CaManage:initCert	(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    //   116: istore 8
    //   118: new 58	org/json/JSONObject
    //   121: dup
    //   122: invokespecial 84	org/json/JSONObject:<init>	()V
    //   125: astore_1
    //   126: aload_1
    //   127: ldc 86
    //   129: iload 8
    //   131: invokevirtual 90	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   134: pop
    //   135: aload_1
    //   136: ldc 92
    //   138: new 94	java/lang/StringBuilder
    //   141: dup
    //   142: invokespecial 95	java/lang/StringBuilder:<init>	()V
    //   145: aload_0
    //   146: getfield 21	com/kwlopen/sdk/KwlSignCertificatePlugin:cordovaInterface	Lorg/apache/cordova/CordovaInterface;
    //   149: invokeinterface 80 1 0
    //   154: invokestatic 99	com/kwlopen/sdk/ca/CaManage:getError	(Landroid/app/Activity;)Ljava/lang/String;
    //   157: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   160: invokevirtual 107	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   163: invokevirtual 110	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   166: pop
    //   167: aload_0
    //   168: getfield 21	com/kwlopen/sdk/KwlSignCertificatePlugin:cordovaInterface	Lorg/apache/cordova/CordovaInterface;
    //   171: invokeinterface 114 1 0
    //   176: new 116	com/kwlopen/sdk/KwlSignCertificatePlugin$1
    //   179: dup
    //   180: aload_0
    //   181: aload 5
    //   183: aload_1
    //   184: invokespecial 119	com/kwlopen/sdk/KwlSignCertificatePlugin$1:<init>	(Lcom/kwlopen/sdk/KwlSignCertificatePlugin;Lorg/apache/cordova/CallbackContext;Lorg/json/JSONObject;)V
    //   187: invokeinterface 124 2 0
    //   192: iconst_1
    //   193: ireturn
    //   194: astore_3
    //   195: aconst_null
    //   196: astore_1
    //   197: aconst_null
    //   198: astore_2
    //   199: aconst_null
    //   200: astore 4
    //   202: aload_3
    //   203: invokevirtual 127	org/json/JSONException:printStackTrace	()V
    //   206: aconst_null
    //   207: astore 6
    //   209: aload_1
    //   210: astore_3
    //   211: goto -116 -> 95
    //   214: astore_1
    //   215: aload_1
    //   216: invokevirtual 127	org/json/JSONException:printStackTrace	()V
    //   219: goto -27 -> 192
    //   222: aload_3
    //   223: ldc -127
    //   225: invokevirtual 48	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   228: ifeq +31 -> 259
    //   231: aload_0
    //   232: getfield 21	com/kwlopen/sdk/KwlSignCertificatePlugin:cordovaInterface	Lorg/apache/cordova/CordovaInterface;
    //   235: invokeinterface 114 1 0
    //   240: new 131	com/kwlopen/sdk/KwlSignCertificatePlugin$2
    //   243: dup
    //   244: aload_0
    //   245: aload 4
    //   247: aload 5
    //   249: invokespecial 134	com/kwlopen/sdk/KwlSignCertificatePlugin$2:<init>	(Lcom/kwlopen/sdk/KwlSignCertificatePlugin;Lorg/json/JSONArray;Lorg/apache/cordova/CallbackContext;)V
    //   252: invokeinterface 124 2 0
    //   257: iconst_1
    //   258: ireturn
    //   259: aload_3
    //   260: ldc -120
    //   262: invokevirtual 48	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   265: ifeq +145 -> 410
    //   268: aload 4
    //   270: iconst_0
    //   271: invokevirtual 54	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   274: ldc 64
    //   276: invokevirtual 62	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   279: checkcast 44	java/lang/String
    //   282: astore_1
    //   283: aload 4
    //   285: iconst_0
    //   286: invokevirtual 54	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   289: ldc -118
    //   291: invokevirtual 62	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   294: checkcast 44	java/lang/String
    //   297: astore_2
    //   298: aload_0
    //   299: getfield 21	com/kwlopen/sdk/KwlSignCertificatePlugin:cordovaInterface	Lorg/apache/cordova/CordovaInterface;
    //   302: invokeinterface 80 1 0
    //   307: aload_1
    //   308: aload_2
    //   309: invokestatic 141	com/kwlopen/sdk/ca/CaManage:installCert	(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)I
    //   312: istore 8
    //   314: new 58	org/json/JSONObject
    //   317: dup
    //   318: invokespecial 84	org/json/JSONObject:<init>	()V
    //   321: astore_1
    //   322: aload_1
    //   323: ldc 86
    //   325: iload 8
    //   327: invokevirtual 90	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   330: pop
    //   331: aload_1
    //   332: ldc 92
    //   334: new 94	java/lang/StringBuilder
    //   337: dup
    //   338: invokespecial 95	java/lang/StringBuilder:<init>	()V
    //   341: aload_0
    //   342: getfield 21	com/kwlopen/sdk/KwlSignCertificatePlugin:cordovaInterface	Lorg/apache/cordova/CordovaInterface;
    //   345: invokeinterface 80 1 0
    //   350: invokestatic 99	com/kwlopen/sdk/ca/CaManage:getError	(Landroid/app/Activity;)Ljava/lang/String;
    //   353: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   356: invokevirtual 107	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   359: invokevirtual 110	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   362: pop
    //   363: aload_0
    //   364: getfield 21	com/kwlopen/sdk/KwlSignCertificatePlugin:cordovaInterface	Lorg/apache/cordova/CordovaInterface;
    //   367: invokeinterface 114 1 0
    //   372: new 143	com/kwlopen/sdk/KwlSignCertificatePlugin$3
    //   375: dup
    //   376: aload_0
    //   377: aload 5
    //   379: aload_1
    //   380: invokespecial 144	com/kwlopen/sdk/KwlSignCertificatePlugin$3:<init>	(Lcom/kwlopen/sdk/KwlSignCertificatePlugin;Lorg/apache/cordova/CallbackContext;Lorg/json/JSONObject;)V
    //   383: invokeinterface 124 2 0
    //   388: iconst_1
    //   389: ireturn
    //   390: astore_2
    //   391: aconst_null
    //   392: astore_1
    //   393: aload_2
    //   394: invokevirtual 127	org/json/JSONException:printStackTrace	()V
    //   397: aconst_null
    //   398: astore_2
    //   399: goto -101 -> 298
    //   402: astore_1
    //   403: aload_1
    //   404: invokevirtual 127	org/json/JSONException:printStackTrace	()V
    //   407: goto -19 -> 388
    //   410: aload_3
    //   411: ldc -110
    //   413: invokevirtual 48	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   416: ifeq +252 -> 668
    //   419: aload 4
    //   421: iconst_0
    //   422: invokevirtual 54	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   425: ldc -108
    //   427: invokevirtual 62	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   430: checkcast 44	java/lang/String
    //   433: astore_1
    //   434: aload 4
    //   436: iconst_0
    //   437: invokevirtual 54	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   440: ldc -106
    //   442: invokevirtual 62	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   445: checkcast 44	java/lang/String
    //   448: astore_3
    //   449: aload 4
    //   451: iconst_0
    //   452: invokevirtual 54	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   455: ldc -104
    //   457: invokevirtual 62	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   460: checkcast 44	java/lang/String
    //   463: astore_2
    //   464: aload 4
    //   466: iconst_0
    //   467: invokevirtual 54	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   470: ldc -102
    //   472: invokevirtual 62	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   475: checkcast 44	java/lang/String
    //   478: invokestatic 160	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   481: istore 9
    //   483: iload 9
    //   485: istore 8
    //   487: new 94	java/lang/StringBuilder
    //   490: dup
    //   491: invokespecial 95	java/lang/StringBuilder:<init>	()V
    //   494: aload 4
    //   496: iconst_0
    //   497: invokevirtual 54	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   500: ldc -94
    //   502: invokevirtual 62	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   505: checkcast 44	java/lang/String
    //   508: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   511: invokevirtual 107	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   514: astore 4
    //   516: aload_1
    //   517: astore 6
    //   519: aload 4
    //   521: astore_1
    //   522: aload_2
    //   523: astore 4
    //   525: iload 9
    //   527: istore 8
    //   529: aload_0
    //   530: getfield 21	com/kwlopen/sdk/KwlSignCertificatePlugin:cordovaInterface	Lorg/apache/cordova/CordovaInterface;
    //   533: invokeinterface 80 1 0
    //   538: aload 6
    //   540: aload_3
    //   541: aload 4
    //   543: iload 8
    //   545: invokestatic 165	com/kwlopen/sdk/ca/CaManage:signMessage	(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    //   548: astore_2
    //   549: new 58	org/json/JSONObject
    //   552: dup
    //   553: invokespecial 84	org/json/JSONObject:<init>	()V
    //   556: astore_3
    //   557: aload_3
    //   558: ldc -94
    //   560: aload_1
    //   561: invokevirtual 110	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   564: pop
    //   565: aload_3
    //   566: ldc 92
    //   568: new 94	java/lang/StringBuilder
    //   571: dup
    //   572: invokespecial 95	java/lang/StringBuilder:<init>	()V
    //   575: aload_0
    //   576: getfield 21	com/kwlopen/sdk/KwlSignCertificatePlugin:cordovaInterface	Lorg/apache/cordova/CordovaInterface;
    //   579: invokeinterface 80 1 0
    //   584: invokestatic 99	com/kwlopen/sdk/ca/CaManage:getError	(Landroid/app/Activity;)Ljava/lang/String;
    //   587: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   590: invokevirtual 107	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   593: invokevirtual 110	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   596: pop
    //   597: aload_3
    //   598: ldc -89
    //   600: aload_2
    //   601: invokevirtual 110	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   604: pop
    //   605: aload_0
    //   606: getfield 21	com/kwlopen/sdk/KwlSignCertificatePlugin:cordovaInterface	Lorg/apache/cordova/CordovaInterface;
    //   609: invokeinterface 114 1 0
    //   614: new 169	com/kwlopen/sdk/KwlSignCertificatePlugin$4
    //   617: dup
    //   618: aload_0
    //   619: aload 5
    //   621: aload_3
    //   622: invokespecial 170	com/kwlopen/sdk/KwlSignCertificatePlugin$4:<init>	(Lcom/kwlopen/sdk/KwlSignCertificatePlugin;Lorg/apache/cordova/CallbackContext;Lorg/json/JSONObject;)V
    //   625: invokeinterface 124 2 0
    //   630: iconst_1
    //   631: ireturn
    //   632: astore 4
    //   634: aconst_null
    //   635: astore_1
    //   636: aconst_null
    //   637: astore_3
    //   638: aconst_null
    //   639: astore_2
    //   640: iconst_0
    //   641: istore 8
    //   643: aload 4
    //   645: invokevirtual 127	org/json/JSONException:printStackTrace	()V
    //   648: aload_1
    //   649: astore 4
    //   651: aload_2
    //   652: astore 6
    //   654: aload 7
    //   656: astore_1
    //   657: goto -128 -> 529
    //   660: astore_1
    //   661: aload_1
    //   662: invokevirtual 127	org/json/JSONException:printStackTrace	()V
    //   665: goto -35 -> 630
    //   668: aload_3
    //   669: ldc -84
    //   671: invokevirtual 48	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   674: ifeq +31 -> 705
    //   677: aload_0
    //   678: getfield 21	com/kwlopen/sdk/KwlSignCertificatePlugin:cordovaInterface	Lorg/apache/cordova/CordovaInterface;
    //   681: invokeinterface 114 1 0
    //   686: new 174	com/kwlopen/sdk/KwlSignCertificatePlugin$5
    //   689: dup
    //   690: aload_0
    //   691: aload 4
    //   693: aload 5
    //   695: invokespecial 175	com/kwlopen/sdk/KwlSignCertificatePlugin$5:<init>	(Lcom/kwlopen/sdk/KwlSignCertificatePlugin;Lorg/json/JSONArray;Lorg/apache/cordova/CallbackContext;)V
    //   698: invokeinterface 124 2 0
    //   703: iconst_1
    //   704: ireturn
    //   705: iconst_0
    //   706: ireturn
    //   707: astore 4
    //   709: aconst_null
    //   710: astore 6
    //   712: aload_1
    //   713: astore_2
    //   714: iconst_0
    //   715: istore 8
    //   717: aconst_null
    //   718: astore_3
    //   719: aload 6
    //   721: astore_1
    //   722: goto -79 -> 643
    //   725: astore 4
    //   727: aload_1
    //   728: astore_2
    //   729: iconst_0
    //   730: istore 8
    //   732: aconst_null
    //   733: astore_1
    //   734: goto -91 -> 643
    //   737: astore 6
    //   739: aload_1
    //   740: astore 4
    //   742: aload_2
    //   743: astore_1
    //   744: aload 4
    //   746: astore_2
    //   747: aload 6
    //   749: astore 4
    //   751: goto -108 -> 643
    //   754: astore_2
    //   755: goto -362 -> 393
    //   758: astore_3
    //   759: aconst_null
    //   760: astore 6
    //   762: aconst_null
    //   763: astore_2
    //   764: aload_1
    //   765: astore 4
    //   767: aload 6
    //   769: astore_1
    //   770: goto -568 -> 202
    //   773: astore_3
    //   774: aconst_null
    //   775: astore 6
    //   777: aload_1
    //   778: astore 4
    //   780: aload 6
    //   782: astore_1
    //   783: goto -581 -> 202
    //   786: astore 6
    //   788: aload_1
    //   789: astore 4
    //   791: aload_3
    //   792: astore_1
    //   793: aload 6
    //   795: astore_3
    //   796: goto -594 -> 202
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	799	0	this	KwlSignCertificatePlugin
    //   0	799	1	paramCordovaInterface	CordovaInterface
    //   0	799	2	paramCordovaPlugin	CordovaPlugin
    //   0	799	3	paramString	String
    //   0	799	4	paramJSONArray	JSONArray
    //   0	799	5	paramCallbackContext	CallbackContext
    //   90	630	6	localObject1	Object
    //   737	11	6	localJSONException1	org.json.JSONException
    //   760	21	6	localObject2	Object
    //   786	8	6	localJSONException2	org.json.JSONException
    //   1	654	7	localObject3	Object
    //   4	727	8	i	int
    //   481	45	9	j	int
    // Exception table:
    //   from	to	target	type
    //   31	46	194	org/json/JSONException
    //   126	192	214	org/json/JSONException
    //   268	283	390	org/json/JSONException
    //   322	388	402	org/json/JSONException
    //   419	434	632	org/json/JSONException
    //   557	630	660	org/json/JSONException
    //   434	449	707	org/json/JSONException
    //   449	464	725	org/json/JSONException
    //   464	483	737	org/json/JSONException
    //   487	516	737	org/json/JSONException
    //   283	298	754	org/json/JSONException
    //   46	61	758	org/json/JSONException
    //   61	76	773	org/json/JSONException
    //   76	92	786	org/json/JSONException
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwlopen\sdk\KwlSignCertificatePlugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */