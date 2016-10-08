package com.tencent.avsdk;

import android.util.Log;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

public class HttpUtil
{
  public static final int FAIL = 500;
  public static final String SERVER_DZH_URL = "http://10.15.107.28:9999/";
  public static final int SUCCESS = 200;
  private static String TAG = "HttpUtil";
  public static final String dzh_clearAllRoomUrl = "http://10.15.107.28:9999/clear";
  public static final String dzh_createNewRoomUrl = "http://10.15.107.28:9999/create?";
  public static final String dzh_listAllRoomUrl = "http://10.15.107.28:9999/list";
  
  public static String PostUrl(String paramString, List<NameValuePair> paramList)
  {
    DefaultHttpClient localDefaultHttpClient = new DefaultHttpClient();
    paramString = new HttpPost(paramString);
    try
    {
      paramString.setEntity(new UrlEncodedFormEntity(paramList, "utf-8"));
      paramString = localDefaultHttpClient.execute(paramString);
      if (paramString.getStatusLine().getStatusCode() > 0) {
        return EntityUtils.toString(paramString.getEntity(), "utf-8");
      }
      Log.e("error", "Httpresponse error");
    }
    catch (UnsupportedEncodingException paramString)
    {
      for (;;)
      {
        Log.e("error", paramString.toString());
        paramString.printStackTrace();
      }
    }
    catch (ClientProtocolException paramString)
    {
      for (;;)
      {
        Log.e("error", paramString.toString());
        paramString.printStackTrace();
      }
    }
    catch (IOException paramString)
    {
      for (;;)
      {
        Log.e("error", paramString.toString());
        paramString.printStackTrace();
      }
    }
    return "";
  }
  
  /* Error */
  public static String httpGet(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 120	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   4: ifeq +5 -> 9
    //   7: aconst_null
    //   8: areturn
    //   9: new 122	org/apache/http/client/methods/HttpGet
    //   12: dup
    //   13: aload_0
    //   14: invokespecial 123	org/apache/http/client/methods/HttpGet:<init>	(Ljava/lang/String;)V
    //   17: astore_0
    //   18: new 43	org/apache/http/impl/client/DefaultHttpClient
    //   21: dup
    //   22: invokespecial 44	org/apache/http/impl/client/DefaultHttpClient:<init>	()V
    //   25: astore_1
    //   26: aload_1
    //   27: aload_0
    //   28: invokeinterface 66 2 0
    //   33: astore_0
    //   34: aload_0
    //   35: invokeinterface 72 1 0
    //   40: invokeinterface 78 1 0
    //   45: sipush 200
    //   48: if_icmpne -41 -> 7
    //   51: aload_0
    //   52: invokeinterface 82 1 0
    //   57: ldc 125
    //   59: invokestatic 88	org/apache/http/util/EntityUtils:toString	(Lorg/apache/http/HttpEntity;Ljava/lang/String;)Ljava/lang/String;
    //   62: astore_0
    //   63: aload_0
    //   64: areturn
    //   65: astore_0
    //   66: aload_0
    //   67: invokevirtual 108	org/apache/http/client/ClientProtocolException:printStackTrace	()V
    //   70: aconst_null
    //   71: areturn
    //   72: astore_0
    //   73: aload_0
    //   74: athrow
    //   75: astore_0
    //   76: aload_0
    //   77: invokevirtual 110	java/io/IOException:printStackTrace	()V
    //   80: aconst_null
    //   81: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	82	0	paramString	String
    //   25	2	1	localDefaultHttpClient	DefaultHttpClient
    // Exception table:
    //   from	to	target	type
    //   26	63	65	org/apache/http/client/ClientProtocolException
    //   26	63	72	finally
    //   66	70	72	finally
    //   76	80	72	finally
    //   26	63	75	java/io/IOException
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\HttpUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */