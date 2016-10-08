package com.android.thinkive.framework.network.socket;

import com.android.thinkive.framework.network.ResponseListener;
import org.json.JSONObject;

class SocketService$2
  implements SocketResponseListener
{
  SocketService$2(SocketService paramSocketService, ResponseListener paramResponseListener) {}
  
  public void onErrorResponse(SocketException paramSocketException)
  {
    this.val$responseListener.onErrorResponse(paramSocketException);
  }
  
  public void onResponse(JSONObject paramJSONObject)
  {
    this.val$responseListener.onResponse(paramJSONObject);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\network\socket\SocketService$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */