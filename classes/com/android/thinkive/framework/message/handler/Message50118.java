package com.android.thinkive.framework.message.handler;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.android.thinkive.framework.ThinkiveInitializer;
import com.android.thinkive.framework.config.ConfigManager;
import com.android.thinkive.framework.message.AppMessage;
import com.android.thinkive.framework.message.IMessageHandler;
import com.android.thinkive.framework.message.MessageManager;
import com.android.thinkive.framework.network.NetWorkService;
import com.android.thinkive.framework.network.ResponseListener;
import com.android.thinkive.framework.network.http.HttpRequestBean;
import com.android.thinkive.framework.network.http.RequestMethod;
import com.android.thinkive.framework.util.Log;
import com.android.thinkive.framework.view.MyWebView;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public class Message50118
  implements IMessageHandler
{
  private String isPost;
  private String mFlowNo;
  private ResponseListener<JSONObject> mListener = new Message50118.1(this);
  private HashMap<String, String> mParam;
  private int mTimeOut;
  private String mUrl;
  private MyWebView myWebView;
  
  private void sendMessageToH5(JSONObject paramJSONObject, String paramString, int paramInt)
  {
    ThinkiveInitializer.getInstance().getHandler().post(new Message50118.2(this, paramJSONObject, paramInt, paramString));
  }
  
  private void synCookies(Context paramContext, String paramString)
  {
    String str = NetWorkService.getInstance().getCookie(paramString);
    Log.d("mUrl = " + paramString + " cookies = " + str);
    if (TextUtils.isEmpty(str)) {
      return;
    }
    CookieSyncManager.createInstance(paramContext);
    paramContext = CookieManager.getInstance();
    paramContext.setAcceptCookie(true);
    paramContext.removeSessionCookie();
    paramContext.setCookie(paramString, str);
    CookieSyncManager.getInstance().sync();
  }
  
  public String handlerMessage(Context paramContext, AppMessage paramAppMessage)
  {
    this.myWebView = paramAppMessage.getWebView();
    localObject = paramAppMessage.getContent();
    if (this.myWebView == null) {
      return null;
    }
    this.mParam = new HashMap();
    for (;;)
    {
      try
      {
        paramAppMessage = ((JSONObject)localObject).getString("timeOut");
        if (!TextUtils.isEmpty(paramAppMessage)) {
          continue;
        }
        this.mTimeOut = 30000;
        this.isPost = ((JSONObject)localObject).getString("isPost");
        this.mUrl = ((JSONObject)localObject).getString("url");
        paramAppMessage = ((JSONObject)localObject).getJSONObject("paramMap");
        this.mFlowNo = ((JSONObject)localObject).getString("flowNo");
        localObject = paramAppMessage.keys();
      }
      catch (JSONException paramAppMessage)
      {
        boolean bool;
        paramAppMessage.printStackTrace();
        continue;
        String str1 = (String)((Iterator)localObject).next();
        String str2 = paramAppMessage.getString(str1);
        this.mParam.put(str1, str2);
        continue;
        paramAppMessage.setRequestMethod(RequestMethod.GET);
        continue;
      }
      bool = ((Iterator)localObject).hasNext();
      if (bool) {
        continue;
      }
      paramAppMessage = new HttpRequestBean();
      localObject = ConfigManager.getInstance().getUrlName(this.mUrl);
      paramAppMessage.setUrlName((String)localObject);
      paramAppMessage.setUrlAddress(this.mUrl);
      paramAppMessage.setParam(this.mParam);
      paramAppMessage.setTimeOut(this.mTimeOut);
      if (!"1".equals(this.isPost)) {
        continue;
      }
      paramAppMessage.setRequestMethod(RequestMethod.POST);
      Log.d("flow = " + this.mFlowNo + "name = " + (String)localObject + " mUrl = " + this.mUrl + " mParam = " + this.mParam);
      NetWorkService.getInstance().request(paramAppMessage, this.mListener);
      return MessageManager.getInstance(paramContext).buildMessageReturn(1, null, null);
      this.mTimeOut = (Integer.parseInt(paramAppMessage) * 1000);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\message\handler\Message50118.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */