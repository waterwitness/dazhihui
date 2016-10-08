package com.android.thinkive.framework.network.http;

import com.android.thinkive.framework.network.ResponseListener;
import com.android.volley.Response.Listener;
import org.json.JSONObject;

public class JsonResponseListener
  implements Response.Listener<JSONObject>
{
  private ResponseListener<JSONObject> mResponseListener;
  
  public JsonResponseListener(ResponseListener<JSONObject> paramResponseListener)
  {
    this.mResponseListener = paramResponseListener;
  }
  
  public void onResponse(JSONObject paramJSONObject)
  {
    this.mResponseListener.onResponse(paramJSONObject);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\network\http\JsonResponseListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */