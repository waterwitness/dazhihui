package com.android.thinkive.framework.message.handler;

import com.android.thinkive.framework.ThinkiveInitializer;
import com.android.thinkive.framework.network.ResponseListener;
import com.android.thinkive.framework.util.Log;
import org.json.JSONObject;

class Message50118$1
  implements ResponseListener<JSONObject>
{
  Message50118$1(Message50118 paramMessage50118) {}
  
  public void onErrorResponse(Exception paramException)
  {
    paramException.printStackTrace();
    Message50118.access$2(this.this$0, null, paramException.getMessage(), -1);
  }
  
  public void onResponse(JSONObject paramJSONObject)
  {
    Log.e("message 50118 response = " + paramJSONObject.toString());
    Message50118.access$1(this.this$0, ThinkiveInitializer.getInstance().getContext(), Message50118.access$0(this.this$0));
    Message50118.access$2(this.this$0, paramJSONObject, "数据返回成功", 0);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\message\handler\Message50118$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */