package com.android.thinkive.framework.network.http;

import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class GzipJsonRequest
  extends JsonRequest
{
  public GzipJsonRequest(String paramString, int paramInt, JSONObject paramJSONObject, Response.Listener<JSONObject> paramListener, Response.ErrorListener paramErrorListener)
  {
    super(paramString, paramInt, paramJSONObject, paramListener, paramErrorListener);
  }
  
  public GzipJsonRequest(String paramString, JSONObject paramJSONObject, Response.Listener<JSONObject> paramListener, Response.ErrorListener paramErrorListener)
  {
    super(paramString, 1, paramJSONObject, paramListener, paramErrorListener);
  }
  
  /* Error */
  public byte[] getBody()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 19	com/android/thinkive/framework/network/http/JsonRequest:getBody	()[B
    //   4: astore_2
    //   5: new 21	java/io/ByteArrayOutputStream
    //   8: dup
    //   9: aload_2
    //   10: arraylength
    //   11: invokespecial 24	java/io/ByteArrayOutputStream:<init>	(I)V
    //   14: astore_3
    //   15: new 26	java/util/zip/GZIPOutputStream
    //   18: dup
    //   19: aload_3
    //   20: invokespecial 29	java/util/zip/GZIPOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   23: astore_1
    //   24: aload_1
    //   25: aload_2
    //   26: invokevirtual 33	java/util/zip/GZIPOutputStream:write	([B)V
    //   29: aload_1
    //   30: invokevirtual 37	java/util/zip/GZIPOutputStream:close	()V
    //   33: aload_3
    //   34: invokevirtual 38	java/io/ByteArrayOutputStream:close	()V
    //   37: aload_3
    //   38: invokevirtual 41	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   41: areturn
    //   42: astore_2
    //   43: aconst_null
    //   44: astore_1
    //   45: aload_2
    //   46: invokevirtual 44	java/io/IOException:printStackTrace	()V
    //   49: goto -20 -> 29
    //   52: astore_1
    //   53: aload_1
    //   54: invokevirtual 44	java/io/IOException:printStackTrace	()V
    //   57: goto -20 -> 37
    //   60: astore_2
    //   61: goto -16 -> 45
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	64	0	this	GzipJsonRequest
    //   23	22	1	localGZIPOutputStream	java.util.zip.GZIPOutputStream
    //   52	2	1	localIOException1	java.io.IOException
    //   4	22	2	arrayOfByte	byte[]
    //   42	4	2	localIOException2	java.io.IOException
    //   60	1	2	localIOException3	java.io.IOException
    //   14	24	3	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    // Exception table:
    //   from	to	target	type
    //   15	24	42	java/io/IOException
    //   29	37	52	java/io/IOException
    //   24	29	60	java/io/IOException
  }
  
  public Map<String, String> getHeaders()
  {
    Map localMap = super.getHeaders();
    Object localObject;
    if (localMap != null)
    {
      localObject = localMap;
      if (!localMap.equals(Collections.emptyMap())) {}
    }
    else
    {
      localObject = new HashMap();
    }
    ((Map)localObject).put("Accept-Encoding", "gzip,deflate");
    return super.getHeaders();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\network\http\GzipJsonRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */