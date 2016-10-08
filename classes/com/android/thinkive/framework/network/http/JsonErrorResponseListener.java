package com.android.thinkive.framework.network.http;

import com.android.thinkive.framework.network.ResponseListener;
import com.android.volley.Response.ErrorListener;
import com.android.volley.VolleyError;
import org.json.JSONObject;

public class JsonErrorResponseListener
  implements Response.ErrorListener
{
  private ResponseListener<JSONObject> mResponseListener;
  
  public JsonErrorResponseListener(ResponseListener<JSONObject> paramResponseListener)
  {
    this.mResponseListener = paramResponseListener;
  }
  
  public void onErrorResponse(VolleyError paramVolleyError)
  {
    this.mResponseListener.onErrorResponse(paramVolleyError);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\network\http\JsonErrorResponseListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */