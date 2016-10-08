package com.payeco.android.plugin.http;

import android.app.Activity;
import android.app.Dialog;
import com.payeco.android.plugin.PayecoBaseUtil;
import com.payeco.android.plugin.PayecoBasicActivity;
import com.payeco.android.plugin.PayecoPluginApplication;
import com.payeco.android.plugin.http.encryption.PluginAlgorithm;
import com.payeco.android.plugin.http.objects.PluginObject;
import com.payeco.android.plugin.http.parse.XmlTool;
import java.io.UnsupportedEncodingException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.TrustManager;

public class HttpAction
{
  static TrustManager[] bs = { new e() };
  static HostnameVerifier bt = new a();
  
  private static String a(Activity paramActivity, PluginObject paramPluginObject, PluginAlgorithm paramPluginAlgorithm, String paramString)
  {
    paramPluginObject = XmlTool.objectToXml(paramPluginObject);
    String str1 = String.valueOf(PayecoBaseUtil.getConfigValue(paramActivity, "frontModulus"));
    String str2 = String.valueOf(PayecoBaseUtil.getConfigValue(paramActivity, "frontPublicExponent"));
    String str3 = String.valueOf(PayecoBaseUtil.getConfigValue(paramActivity, "frontPubKeyversion"));
    try
    {
      paramActivity = new String(paramPluginObject.getBytes(), "UTF-8");
      return paramPluginAlgorithm.dataEncode(str3, str1, str2, paramString, paramActivity);
    }
    catch (UnsupportedEncodingException paramActivity)
    {
      for (;;)
      {
        paramActivity.printStackTrace();
        paramActivity = paramPluginObject;
      }
    }
  }
  
  /* Error */
  private static String c(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: new 78	java/lang/StringBuilder
    //   8: dup
    //   9: invokespecial 79	java/lang/StringBuilder:<init>	()V
    //   12: astore 5
    //   14: new 81	java/net/URL
    //   17: dup
    //   18: aload_1
    //   19: invokespecial 84	java/net/URL:<init>	(Ljava/lang/String;)V
    //   22: astore_1
    //   23: aload_1
    //   24: invokevirtual 88	java/net/URL:getProtocol	()Ljava/lang/String;
    //   27: invokevirtual 91	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   30: ldc 93
    //   32: invokevirtual 97	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   35: istore 6
    //   37: iload 6
    //   39: ifeq +232 -> 271
    //   42: ldc 99
    //   44: invokestatic 105	javax/net/ssl/SSLContext:getInstance	(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;
    //   47: astore_2
    //   48: aload_2
    //   49: aconst_null
    //   50: getstatic 17	com/payeco/android/plugin/http/HttpAction:bs	[Ljavax/net/ssl/TrustManager;
    //   53: new 107	java/security/SecureRandom
    //   56: dup
    //   57: invokespecial 108	java/security/SecureRandom:<init>	()V
    //   60: invokevirtual 112	javax/net/ssl/SSLContext:init	([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V
    //   63: aload_2
    //   64: invokevirtual 116	javax/net/ssl/SSLContext:getSocketFactory	()Ljavax/net/ssl/SSLSocketFactory;
    //   67: invokestatic 122	javax/net/ssl/HttpsURLConnection:setDefaultSSLSocketFactory	(Ljavax/net/ssl/SSLSocketFactory;)V
    //   70: getstatic 22	com/payeco/android/plugin/http/HttpAction:bt	Ljavax/net/ssl/HostnameVerifier;
    //   73: invokestatic 126	javax/net/ssl/HttpsURLConnection:setDefaultHostnameVerifier	(Ljavax/net/ssl/HostnameVerifier;)V
    //   76: aload_1
    //   77: invokevirtual 130	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   80: checkcast 118	javax/net/ssl/HttpsURLConnection
    //   83: astore_2
    //   84: aload_2
    //   85: checkcast 118	javax/net/ssl/HttpsURLConnection
    //   88: getstatic 22	com/payeco/android/plugin/http/HttpAction:bt	Ljavax/net/ssl/HostnameVerifier;
    //   91: invokevirtual 133	javax/net/ssl/HttpsURLConnection:setHostnameVerifier	(Ljavax/net/ssl/HostnameVerifier;)V
    //   94: aload_2
    //   95: ldc -122
    //   97: invokevirtual 140	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   100: aload_2
    //   101: ldc -122
    //   103: invokevirtual 143	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   106: aload_2
    //   107: ldc -111
    //   109: invokevirtual 148	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   112: aload_2
    //   113: iconst_1
    //   114: invokevirtual 152	java/net/HttpURLConnection:setDoInput	(Z)V
    //   117: aload_2
    //   118: iconst_1
    //   119: invokevirtual 155	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   122: aload_2
    //   123: ldc -99
    //   125: ldc -97
    //   127: invokevirtual 163	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   130: getstatic 169	com/payeco/android/plugin/PayecoPluginApplication:sessionId	Ljava/lang/String;
    //   133: astore_1
    //   134: aload_1
    //   135: ifnull +10 -> 145
    //   138: aload_2
    //   139: ldc -86
    //   141: aload_1
    //   142: invokevirtual 163	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   145: aload_2
    //   146: invokevirtual 173	java/net/HttpURLConnection:connect	()V
    //   149: new 175	java/io/DataOutputStream
    //   152: dup
    //   153: aload_2
    //   154: invokevirtual 179	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   157: invokespecial 182	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   160: astore_1
    //   161: aload_1
    //   162: aload_0
    //   163: invokevirtual 185	java/io/DataOutputStream:writeBytes	(Ljava/lang/String;)V
    //   166: aload_1
    //   167: invokevirtual 188	java/io/DataOutputStream:flush	()V
    //   170: aload_2
    //   171: invokevirtual 192	java/net/HttpURLConnection:getResponseCode	()I
    //   174: sipush 200
    //   177: if_icmpne +105 -> 282
    //   180: new 194	java/io/BufferedReader
    //   183: dup
    //   184: new 196	java/io/InputStreamReader
    //   187: dup
    //   188: aload_2
    //   189: invokevirtual 200	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   192: invokespecial 203	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   195: invokespecial 206	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   198: astore_0
    //   199: aload_0
    //   200: invokevirtual 209	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   203: astore_3
    //   204: aload_3
    //   205: ifnonnull +105 -> 310
    //   208: aload_2
    //   209: invokevirtual 212	java/net/HttpURLConnection:disconnect	()V
    //   212: aload_1
    //   213: invokevirtual 215	java/io/DataOutputStream:close	()V
    //   216: aload_0
    //   217: invokevirtual 216	java/io/BufferedReader:close	()V
    //   220: aload 5
    //   222: invokevirtual 219	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   225: areturn
    //   226: astore_2
    //   227: aload_2
    //   228: invokevirtual 220	java/lang/Exception:printStackTrace	()V
    //   231: goto -155 -> 76
    //   234: astore_2
    //   235: aconst_null
    //   236: astore_0
    //   237: aload 4
    //   239: astore_1
    //   240: aload_2
    //   241: invokevirtual 220	java/lang/Exception:printStackTrace	()V
    //   244: aload_1
    //   245: ifnull +7 -> 252
    //   248: aload_1
    //   249: invokevirtual 215	java/io/DataOutputStream:close	()V
    //   252: aload_0
    //   253: ifnull -33 -> 220
    //   256: aload_0
    //   257: invokevirtual 216	java/io/BufferedReader:close	()V
    //   260: goto -40 -> 220
    //   263: astore_0
    //   264: aload_0
    //   265: invokevirtual 221	java/io/IOException:printStackTrace	()V
    //   268: goto -48 -> 220
    //   271: aload_1
    //   272: invokevirtual 130	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   275: checkcast 136	java/net/HttpURLConnection
    //   278: astore_2
    //   279: goto -185 -> 94
    //   282: new 194	java/io/BufferedReader
    //   285: dup
    //   286: new 196	java/io/InputStreamReader
    //   289: dup
    //   290: aload_2
    //   291: invokevirtual 224	java/net/HttpURLConnection:getErrorStream	()Ljava/io/InputStream;
    //   294: invokespecial 203	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   297: invokespecial 206	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   300: astore_0
    //   301: goto -102 -> 199
    //   304: astore_2
    //   305: aconst_null
    //   306: astore_0
    //   307: goto -67 -> 240
    //   310: aload_3
    //   311: invokevirtual 227	java/lang/String:length	()I
    //   314: ifle -115 -> 199
    //   317: aload 5
    //   319: aload_3
    //   320: invokevirtual 230	java/lang/String:trim	()Ljava/lang/String;
    //   323: invokevirtual 234	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   326: pop
    //   327: goto -128 -> 199
    //   330: astore_2
    //   331: goto -91 -> 240
    //   334: astore_0
    //   335: aconst_null
    //   336: astore_1
    //   337: aload_3
    //   338: astore_2
    //   339: aload_1
    //   340: ifnull +7 -> 347
    //   343: aload_1
    //   344: invokevirtual 215	java/io/DataOutputStream:close	()V
    //   347: aload_2
    //   348: ifnull +7 -> 355
    //   351: aload_2
    //   352: invokevirtual 216	java/io/BufferedReader:close	()V
    //   355: aload_0
    //   356: athrow
    //   357: astore_1
    //   358: aload_1
    //   359: invokevirtual 221	java/io/IOException:printStackTrace	()V
    //   362: goto -7 -> 355
    //   365: astore_0
    //   366: aload_0
    //   367: invokevirtual 221	java/io/IOException:printStackTrace	()V
    //   370: goto -150 -> 220
    //   373: astore_0
    //   374: aload_3
    //   375: astore_2
    //   376: goto -37 -> 339
    //   379: astore_3
    //   380: aload_0
    //   381: astore_2
    //   382: aload_3
    //   383: astore_0
    //   384: goto -45 -> 339
    //   387: astore_3
    //   388: aload_0
    //   389: astore_2
    //   390: aload_3
    //   391: astore_0
    //   392: goto -53 -> 339
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	395	0	paramString1	String
    //   0	395	1	paramString2	String
    //   47	162	2	localObject1	Object
    //   226	2	2	localException1	Exception
    //   234	7	2	localException2	Exception
    //   278	13	2	localHttpURLConnection	java.net.HttpURLConnection
    //   304	1	2	localException3	Exception
    //   330	1	2	localException4	Exception
    //   338	52	2	str1	String
    //   1	374	3	str2	String
    //   379	4	3	localObject2	Object
    //   387	4	3	localObject3	Object
    //   3	235	4	localObject4	Object
    //   12	306	5	localStringBuilder	StringBuilder
    //   35	3	6	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   42	76	226	java/lang/Exception
    //   14	37	234	java/lang/Exception
    //   76	94	234	java/lang/Exception
    //   94	134	234	java/lang/Exception
    //   138	145	234	java/lang/Exception
    //   145	161	234	java/lang/Exception
    //   227	231	234	java/lang/Exception
    //   271	279	234	java/lang/Exception
    //   248	252	263	java/io/IOException
    //   256	260	263	java/io/IOException
    //   161	199	304	java/lang/Exception
    //   282	301	304	java/lang/Exception
    //   199	204	330	java/lang/Exception
    //   208	212	330	java/lang/Exception
    //   310	327	330	java/lang/Exception
    //   14	37	334	finally
    //   42	76	334	finally
    //   76	94	334	finally
    //   94	134	334	finally
    //   138	145	334	finally
    //   145	161	334	finally
    //   227	231	334	finally
    //   271	279	334	finally
    //   343	347	357	java/io/IOException
    //   351	355	357	java/io/IOException
    //   212	220	365	java/io/IOException
    //   161	199	373	finally
    //   282	301	373	finally
    //   199	204	379	finally
    //   208	212	379	finally
    //   310	327	379	finally
    //   240	244	387	finally
  }
  
  public static void doPostAction(PayecoBasicActivity paramPayecoBasicActivity, String paramString, PluginObject paramPluginObject, Dialog paramDialog)
  {
    paramPayecoBasicActivity.doAsync(new b(paramPayecoBasicActivity, paramString, paramPluginObject), new c(paramString, paramPayecoBasicActivity, paramPluginObject), new d(paramPayecoBasicActivity), false, paramDialog);
  }
  
  public static String sendRequestData(Activity paramActivity, String paramString, PluginObject paramPluginObject)
  {
    String str1 = PayecoBaseUtil.getIMEI(paramActivity);
    String str2 = PayecoPluginApplication.terminalModel;
    String str3 = PayecoPluginApplication.terminalOs;
    String str4 = PayecoPluginApplication.plugin_version;
    String str5 = PayecoPluginApplication.pluginSerinalNo;
    paramPluginObject.setApplication(paramString);
    paramPluginObject.setVersion("1.1.0");
    paramPluginObject.setTerminalModel(str2);
    paramPluginObject.setTerminalOs(str3);
    paramPluginObject.setPluginVersion(str4);
    paramPluginObject.setPluginSerialNo(str5);
    paramPluginObject.setTerminalPhysicalNo(str1);
    paramString = new PluginAlgorithm();
    str1 = PluginAlgorithm.getSymmetryKey();
    return paramString.dataDecode(c(a(paramActivity, paramPluginObject, paramString, str1), "https://m.payeco.com/payeco_imsi/servlet/PandapayServlet"), str1);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\http\HttpAction.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */