package com.android.thinkive.framework.js;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.android.thinkive.framework.message.AppMessage;
import com.android.thinkive.framework.message.MessageManager;
import com.android.thinkive.framework.util.Log;
import com.android.thinkive.framework.view.MyWebView;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class BaseJsInterface
{
  private Context mContext;
  private HashMap<String, ICallBack> mH5CallBackMap;
  private MessageManager mMessageManager;
  private MyWebView mWebView;
  
  public BaseJsInterface(Context paramContext)
  {
    this.mContext = paramContext;
    this.mMessageManager = MessageManager.getInstance(this.mContext);
    this.mH5CallBackMap = new HashMap();
  }
  
  public BaseJsInterface(Context paramContext, MyWebView paramMyWebView)
  {
    this(paramContext);
    this.mWebView = paramMyWebView;
  }
  
  @JavascriptInterface
  public String callMessage(String paramString)
  {
    return sendMessage(paramString);
  }
  
  @JavascriptInterface
  public void callback(String paramString)
  {
    Log.d("h5 callback = " + paramString);
    try
    {
      String str = new JSONObject(paramString).getString("flowNo");
      ICallBack localICallBack = (ICallBack)this.mH5CallBackMap.get(str);
      if (localICallBack != null) {
        localICallBack.callBack(paramString);
      }
      for (;;)
      {
        this.mH5CallBackMap.remove(str);
        return;
        Log.d("there is't register flowNo = " + str + " callback!!!");
      }
      return;
    }
    catch (JSONException paramString)
    {
      paramString.printStackTrace();
    }
  }
  
  public void registerCallBack(String paramString, ICallBack paramICallBack)
  {
    this.mH5CallBackMap.put(paramString, paramICallBack);
  }
  
  @JavascriptInterface
  public String sendMessage(String paramString)
  {
    Log.d("h5 send Message = " + paramString);
    String str = "";
    if (TextUtils.isEmpty(paramString)) {
      return "";
    }
    try
    {
      paramString = new JSONObject(paramString);
      paramString = new AppMessage(paramString.optString("sourceModule"), paramString.optString("targetModule"), Integer.parseInt(paramString.optString("funcNo")), paramString);
      paramString.setWebView(this.mWebView);
      paramString = this.mMessageManager.sendMessage(paramString);
      Log.d("return h5 result = " + paramString);
      return paramString;
    }
    catch (JSONException paramString)
    {
      for (;;)
      {
        paramString.printStackTrace();
        paramString = str;
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\js\BaseJsInterface.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */