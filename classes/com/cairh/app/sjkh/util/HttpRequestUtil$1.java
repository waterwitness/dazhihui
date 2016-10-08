package com.cairh.app.sjkh.util;

import com.e.a.a.i;
import org.apache.http.Header;
import org.json.JSONException;
import org.json.JSONObject;

class HttpRequestUtil$1
  extends i
{
  HttpRequestUtil$1(HttpRequestUtil paramHttpRequestUtil) {}
  
  public void onFailure(int paramInt, Header[] paramArrayOfHeader, byte[] paramArrayOfByte, Throwable paramThrowable)
  {
    HttpRequestUtil.access$0(this.this$0).onFailure("");
  }
  
  public void onSuccess(int paramInt, Header[] paramArrayOfHeader, byte[] paramArrayOfByte)
  {
    String str = new String(paramArrayOfByte);
    try
    {
      paramArrayOfByte = new JSONObject(str);
      paramArrayOfHeader = paramArrayOfByte;
      if (paramArrayOfByte.has("resMap")) {
        paramArrayOfHeader = paramArrayOfByte.getJSONObject("resMap");
      }
      if (paramArrayOfHeader.getInt("errorNo") == 0)
      {
        HttpRequestUtil.access$0(this.this$0).onSuccess(str);
        return;
      }
      paramArrayOfHeader = paramArrayOfHeader.optString("errorInfo");
      HttpRequestUtil.access$0(this.this$0).onFailure(paramArrayOfHeader);
      return;
    }
    catch (JSONException paramArrayOfHeader)
    {
      paramArrayOfHeader.printStackTrace();
      HttpRequestUtil.access$0(this.this$0).onFailure("");
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\util\HttpRequestUtil$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */