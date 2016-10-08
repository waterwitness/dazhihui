package org.apache.cordova;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class App
  extends CordovaPlugin
{
  protected static final String TAG = "CordovaApp";
  private BroadcastReceiver telephonyReceiver;
  
  private void initTelephonyReceiver()
  {
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.intent.action.PHONE_STATE");
    this.telephonyReceiver = new App.4(this);
    this.cordova.getActivity().registerReceiver(this.telephonyReceiver, localIntentFilter);
  }
  
  public void backHistory()
  {
    this.cordova.getActivity().runOnUiThread(new App.3(this));
  }
  
  public void clearCache()
  {
    this.cordova.getActivity().runOnUiThread(new App.2(this));
  }
  
  public void clearHistory()
  {
    this.webView.clearHistory();
  }
  
  public boolean execute(String paramString, JSONArray paramJSONArray, CallbackContext paramCallbackContext)
  {
    PluginResult.Status localStatus = PluginResult.Status.OK;
    for (;;)
    {
      try
      {
        if (paramString.equals("clearCache"))
        {
          clearCache();
          paramCallbackContext.sendPluginResult(new PluginResult(localStatus, ""));
          return true;
        }
        if (paramString.equals("show"))
        {
          this.cordova.getActivity().runOnUiThread(new App.1(this));
          continue;
        }
        if (!paramString.equals("loadUrl")) {
          break label110;
        }
      }
      catch (JSONException paramString)
      {
        paramCallbackContext.sendPluginResult(new PluginResult(PluginResult.Status.JSON_EXCEPTION));
        return false;
      }
      loadUrl(paramJSONArray.getString(0), paramJSONArray.optJSONObject(1));
      continue;
      label110:
      if (!paramString.equals("cancelLoadUrl")) {
        if (paramString.equals("clearHistory")) {
          clearHistory();
        } else if (paramString.equals("backHistory")) {
          backHistory();
        } else if (paramString.equals("overrideButton")) {
          overrideButton(paramJSONArray.getString(0), paramJSONArray.getBoolean(1));
        } else if (paramString.equals("overrideBackbutton")) {
          overrideBackbutton(paramJSONArray.getBoolean(0));
        } else if (paramString.equals("exitApp")) {
          exitApp();
        }
      }
    }
  }
  
  public void exitApp()
  {
    this.webView.postMessage("exit", null);
  }
  
  public void initialize(CordovaInterface paramCordovaInterface, CordovaWebView paramCordovaWebView)
  {
    super.initialize(paramCordovaInterface, paramCordovaWebView);
    initTelephonyReceiver();
  }
  
  public boolean isBackbuttonOverridden()
  {
    return this.webView.isBackButtonBound();
  }
  
  public void loadUrl(String paramString, JSONObject paramJSONObject)
  {
    LOG.d("App", "App.loadUrl(" + paramString + "," + paramJSONObject + ")");
    HashMap localHashMap = new HashMap();
    JSONArray localJSONArray;
    int j;
    boolean bool1;
    boolean bool2;
    int i;
    if (paramJSONObject != null)
    {
      localJSONArray = paramJSONObject.names();
      j = 0;
      bool1 = false;
      bool2 = false;
      i = 0;
      if (j < localJSONArray.length()) {}
    }
    for (;;)
    {
      if (i > 0) {}
      for (;;)
      {
        try
        {
          l = i;
        }
        catch (InterruptedException paramJSONObject)
        {
          long l;
          String str;
          int k;
          boolean bool4;
          boolean bool3;
          paramJSONObject.printStackTrace();
          continue;
        }
        try
        {
          wait(l);
          this.webView.showWebPage(paramString, bool2, bool1, localHashMap);
          return;
        }
        finally {}
      }
      str = localJSONArray.getString(j);
      if (str.equals("wait"))
      {
        k = paramJSONObject.getInt(str);
        bool4 = bool2;
        bool3 = bool1;
      }
      for (;;)
      {
        j += 1;
        bool1 = bool3;
        bool2 = bool4;
        i = k;
        break;
        if (str.equalsIgnoreCase("openexternal"))
        {
          bool4 = paramJSONObject.getBoolean(str);
          bool3 = bool1;
          k = i;
        }
        else if (str.equalsIgnoreCase("clearhistory"))
        {
          bool3 = paramJSONObject.getBoolean(str);
          bool4 = bool2;
          k = i;
        }
        else
        {
          Object localObject = paramJSONObject.get(str);
          bool3 = bool1;
          bool4 = bool2;
          k = i;
          if (localObject != null) {
            if (localObject.getClass().equals(String.class))
            {
              localHashMap.put(str, (String)localObject);
              bool3 = bool1;
              bool4 = bool2;
              k = i;
            }
            else if (localObject.getClass().equals(Boolean.class))
            {
              localHashMap.put(str, (Boolean)localObject);
              bool3 = bool1;
              bool4 = bool2;
              k = i;
            }
            else
            {
              bool3 = bool1;
              bool4 = bool2;
              k = i;
              if (localObject.getClass().equals(Integer.class))
              {
                localHashMap.put(str, (Integer)localObject);
                bool3 = bool1;
                bool4 = bool2;
                k = i;
              }
            }
          }
        }
      }
      bool1 = false;
      bool2 = false;
      i = 0;
    }
  }
  
  public void onDestroy()
  {
    this.cordova.getActivity().unregisterReceiver(this.telephonyReceiver);
  }
  
  public void overrideBackbutton(boolean paramBoolean)
  {
    LOG.i("App", "WARNING: Back Button Default Behavior will be overridden.  The backbutton event will be fired!");
    this.webView.bindButton(paramBoolean);
  }
  
  public void overrideButton(String paramString, boolean paramBoolean)
  {
    LOG.i("App", "WARNING: Volume Button Default Behavior will be overridden.  The volume event will be fired!");
    this.webView.bindButton(paramString, paramBoolean);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\cordova\App.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */