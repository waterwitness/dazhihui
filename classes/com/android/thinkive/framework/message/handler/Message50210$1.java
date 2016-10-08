package com.android.thinkive.framework.message.handler;

import com.android.thinkive.framework.keyboard.KeyboardEventListener;
import com.android.thinkive.framework.keyboard.KeyboardManager;
import com.android.thinkive.framework.message.AppMessage;
import com.android.thinkive.framework.message.MessageManager;
import org.json.JSONException;
import org.json.JSONObject;

class Message50210$1
  implements KeyboardEventListener
{
  Message50210$1(Message50210 paramMessage50210) {}
  
  public void onKeyEvent(int paramInt)
  {
    Object localObject;
    if (paramInt > 0) {
      localObject = String.valueOf((char)paramInt);
    }
    for (;;)
    {
      JSONObject localJSONObject = new JSONObject();
      try
      {
        localJSONObject.put("pageId", Message50210.access$1(this.this$0));
        localJSONObject.put("eleId", Message50210.access$2(this.this$0));
        localJSONObject.put("keyCode", localObject);
        localObject = new AppMessage("common", 50212, localJSONObject);
        ((AppMessage)localObject).setSourceModule(Message50210.access$3(this.this$0));
        ((AppMessage)localObject).setWebView(Message50210.access$4(this.this$0));
        MessageManager.getInstance(Message50210.access$5(this.this$0)).sendMessage((AppMessage)localObject);
        return;
        switch (paramInt)
        {
        default: 
          localObject = String.valueOf(paramInt);
          break;
        case -4: 
        case -3: 
          Message50210.access$0(this.this$0).dismiss();
          localObject = String.valueOf(-3);
          break;
        case -23: 
          localObject = "000";
          break;
        case -25: 
          localObject = "300";
          break;
        case -24: 
          localObject = "002";
          break;
        case -22: 
          localObject = "601";
          break;
        case -21: 
          localObject = "600";
          break;
        case -27: 
          localObject = "00";
          break;
        case -26: 
          localObject = ".";
        }
      }
      catch (JSONException localJSONException)
      {
        for (;;)
        {
          localJSONException.printStackTrace();
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\message\handler\Message50210$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */