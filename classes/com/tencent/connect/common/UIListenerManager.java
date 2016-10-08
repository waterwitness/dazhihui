package com.tencent.connect.common;

import android.content.Intent;
import com.tencent.open.a.f;
import com.tencent.open.utils.SystemUtils;
import com.tencent.open.utils.Util;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class UIListenerManager
{
  private static final String TAG = "openSDK_LOG.UIListenerManager";
  private static UIListenerManager mInstance = null;
  private Map<String, UIListenerManager.ApiTask> mListenerMap = Collections.synchronizedMap(new HashMap());
  
  private UIListenerManager()
  {
    if (this.mListenerMap == null) {
      this.mListenerMap = Collections.synchronizedMap(new HashMap());
    }
  }
  
  private IUiListener buildListener(int paramInt, IUiListener paramIUiListener)
  {
    if (paramInt == 11101) {
      f.e("openSDK_LOG.UIListenerManager", "登录的接口回调不能重新构建，暂时无法提供，先记录下来这种情况是否存在");
    }
    do
    {
      return paramIUiListener;
      if (paramInt == 11105)
      {
        f.e("openSDK_LOG.UIListenerManager", "Social Api 的接口回调需要使用param来重新构建，暂时无法提供，先记录下来这种情况是否存在");
        return paramIUiListener;
      }
    } while (paramInt != 11106);
    f.e("openSDK_LOG.UIListenerManager", "Social Api 的H5接口回调需要使用param来重新构建，暂时无法提供，先记录下来这种情况是否存在");
    return paramIUiListener;
  }
  
  public static UIListenerManager getInstance()
  {
    if (mInstance == null) {
      mInstance = new UIListenerManager();
    }
    return mInstance;
  }
  
  public IUiListener getListnerWithAction(String paramString)
  {
    if (paramString == null)
    {
      f.e("openSDK_LOG.UIListenerManager", "getListnerWithAction action is null!");
      return null;
    }
    UIListenerManager.ApiTask localApiTask;
    synchronized (this.mListenerMap)
    {
      localApiTask = (UIListenerManager.ApiTask)this.mListenerMap.get(paramString);
      this.mListenerMap.remove(paramString);
      if (localApiTask == null) {
        return null;
      }
    }
    return localApiTask.mListener;
  }
  
  public IUiListener getListnerWithRequestCode(int paramInt)
  {
    String str = SystemUtils.getActionFromRequestcode(paramInt);
    if (str == null)
    {
      f.e("openSDK_LOG.UIListenerManager", "getListner action is null! rquestCode=" + paramInt);
      return null;
    }
    return getListnerWithAction(str);
  }
  
  public void handleDataToListener(Intent paramIntent, IUiListener paramIUiListener)
  {
    f.c("openSDK_LOG.UIListenerManager", "handleDataToListener");
    if (paramIntent == null) {
      paramIUiListener.onCancel();
    }
    String str3;
    String str2;
    do
    {
      do
      {
        return;
        String str1 = paramIntent.getStringExtra("key_action");
        if ("action_login".equals(str1))
        {
          int i = paramIntent.getIntExtra("key_error_code", 0);
          if (i == 0)
          {
            paramIntent = paramIntent.getStringExtra("key_response");
            if (paramIntent != null) {
              try
              {
                paramIUiListener.onComplete(Util.parseJson(paramIntent));
                return;
              }
              catch (JSONException localJSONException)
              {
                paramIUiListener.onError(new UiError(-4, "服务器返回数据格式有误!", paramIntent));
                f.b("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, json error", localJSONException);
                return;
              }
            }
            f.b("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, onComplete");
            paramIUiListener.onComplete(new JSONObject());
            return;
          }
          f.e("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, onError = " + i + "");
          paramIUiListener.onError(new UiError(i, paramIntent.getStringExtra("key_error_msg"), paramIntent.getStringExtra("key_error_detail")));
          return;
        }
      } while (!"action_share".equals(localJSONException));
      str3 = paramIntent.getStringExtra("result");
      str2 = paramIntent.getStringExtra("response");
      if ("cancel".equals(str3))
      {
        paramIUiListener.onCancel();
        return;
      }
      if ("error".equals(str3))
      {
        paramIUiListener.onError(new UiError(-6, "unknown error", str2 + ""));
        return;
      }
    } while (!"complete".equals(str3));
    if (str2 == null) {}
    for (paramIntent = "{\"ret\": 0}";; paramIntent = str2) {
      try
      {
        paramIUiListener.onComplete(new JSONObject(paramIntent));
        return;
      }
      catch (JSONException paramIntent)
      {
        paramIntent.printStackTrace();
        paramIUiListener.onError(new UiError(-4, "json error", str2 + ""));
        return;
      }
    }
  }
  
  public boolean onActivityResult(int paramInt1, int paramInt2, Intent paramIntent, IUiListener paramIUiListener)
  {
    f.c("openSDK_LOG.UIListenerManager", "onActivityResult req=" + paramInt1 + " res=" + paramInt2);
    Object localObject = getListnerWithRequestCode(paramInt1);
    if (localObject == null) {
      if (paramIUiListener == null) {}
    }
    for (paramIUiListener = buildListener(paramInt1, paramIUiListener);; paramIUiListener = localJSONException2)
    {
      if (paramInt2 == -1)
      {
        if (paramIntent == null)
        {
          paramIUiListener.onError(new UiError(-6, "onActivityResult intent data is null.", "onActivityResult intent data is null."));
          return true;
          f.e("openSDK_LOG.UIListenerManager", "onActivityResult can't find the listener");
          return false;
        }
        localObject = paramIntent.getStringExtra("key_action");
        if ("action_login".equals(localObject))
        {
          paramInt1 = paramIntent.getIntExtra("key_error_code", 0);
          if (paramInt1 == 0)
          {
            paramIntent = paramIntent.getStringExtra("key_response");
            if (paramIntent == null) {}
          }
        }
      }
      for (;;)
      {
        try
        {
          paramIUiListener.onComplete(Util.parseJson(paramIntent));
          return true;
        }
        catch (JSONException localJSONException1)
        {
          paramIUiListener.onError(new UiError(-4, "服务器返回数据格式有误!", paramIntent));
          f.b("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, json error", localJSONException1);
          continue;
        }
        f.b("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, onComplete");
        paramIUiListener.onComplete(new JSONObject());
        continue;
        f.e("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, onError = " + paramInt1 + "");
        paramIUiListener.onError(new UiError(paramInt1, paramIntent.getStringExtra("key_error_msg"), paramIntent.getStringExtra("key_error_detail")));
        continue;
        if ("action_share".equals(localJSONException1))
        {
          String str2 = paramIntent.getStringExtra("result");
          String str1 = paramIntent.getStringExtra("response");
          if ("cancel".equals(str2))
          {
            paramIUiListener.onCancel();
          }
          else if ("error".equals(str2))
          {
            paramIUiListener.onError(new UiError(-6, "unknown error", str1 + ""));
          }
          else if ("complete".equals(str2))
          {
            if (str1 == null) {}
            for (paramIntent = "{\"ret\": 0}";; paramIntent = str1)
            {
              try
              {
                paramIUiListener.onComplete(new JSONObject(paramIntent));
              }
              catch (JSONException paramIntent)
              {
                paramIntent.printStackTrace();
                paramIUiListener.onError(new UiError(-4, "json error", str1 + ""));
              }
              break;
            }
          }
        }
        else
        {
          paramInt1 = paramIntent.getIntExtra("key_error_code", 0);
          if (paramInt1 == 0)
          {
            paramIntent = paramIntent.getStringExtra("key_response");
            if (paramIntent != null) {
              try
              {
                paramIUiListener.onComplete(Util.parseJson(paramIntent));
              }
              catch (JSONException localJSONException2)
              {
                paramIUiListener.onError(new UiError(-4, "服务器返回数据格式有误!", paramIntent));
              }
            } else {
              paramIUiListener.onComplete(new JSONObject());
            }
          }
          else
          {
            paramIUiListener.onError(new UiError(paramInt1, paramIntent.getStringExtra("key_error_msg"), paramIntent.getStringExtra("key_error_detail")));
            continue;
            paramIUiListener.onCancel();
          }
        }
      }
    }
  }
  
  public Object setListenerWithRequestcode(int paramInt, IUiListener paramIUiListener)
  {
    String str = SystemUtils.getActionFromRequestcode(paramInt);
    if (str == null)
    {
      f.e("openSDK_LOG.UIListenerManager", "setListener action is null! rquestCode=" + paramInt);
      return null;
    }
    synchronized (this.mListenerMap)
    {
      paramIUiListener = (UIListenerManager.ApiTask)this.mListenerMap.put(str, new UIListenerManager.ApiTask(this, paramInt, paramIUiListener));
      if (paramIUiListener == null) {
        return null;
      }
    }
    return paramIUiListener.mListener;
  }
  
  public Object setListnerWithAction(String paramString, IUiListener paramIUiListener)
  {
    int i = SystemUtils.getRequestCodeFromCallback(paramString);
    if (i == -1)
    {
      f.e("openSDK_LOG.UIListenerManager", "setListnerWithAction fail, action = " + paramString);
      return null;
    }
    synchronized (this.mListenerMap)
    {
      paramString = (UIListenerManager.ApiTask)this.mListenerMap.put(paramString, new UIListenerManager.ApiTask(this, i, paramIUiListener));
      if (paramString == null) {
        return null;
      }
    }
    return paramString.mListener;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\connect\common\UIListenerManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */