package com.android.thinkive.framework.network.http;

import android.content.Context;
import com.android.thinkive.framework.util.JsonParseUtil;
import com.android.thinkive.framework.util.Log;
import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.NetworkResponse;
import com.android.volley.NoConnectionError;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import java.util.HashMap;

public class VolleyErrorHelper
{
  public static String getMessage(Object paramObject, Context paramContext)
  {
    if ((paramObject instanceof TimeoutError)) {
      return "连接服务器失败!";
    }
    if (isServerProblem(paramObject)) {
      return handleServerError(paramObject, paramContext);
    }
    if (isNetworkProblem(paramObject)) {
      return "无网络连接!";
    }
    return "网络异常,请稍后再试!";
  }
  
  private static String handleServerError(Object paramObject, Context paramContext)
  {
    paramObject = (VolleyError)paramObject;
    paramContext = ((VolleyError)paramObject).networkResponse;
    if (paramContext != null)
    {
      switch (paramContext.statusCode)
      {
      default: 
        return "连接服务器失败!";
      }
      try
      {
        Log.d("volley error = " + new String(paramContext.data));
        paramContext = JsonParseUtil.parseJsonToMap(new String(paramContext.data));
        if ((paramContext != null) && (paramContext.containsKey("error")))
        {
          paramContext = (String)paramContext.get("error");
          return paramContext;
        }
      }
      catch (Exception paramContext)
      {
        paramContext.printStackTrace();
        Log.e("return error.getMessage = " + ((VolleyError)paramObject).getMessage());
        return "连接服务器失败!";
      }
    }
    return "网络异常,请稍后再试!";
  }
  
  private static boolean isNetworkProblem(Object paramObject)
  {
    return ((paramObject instanceof NetworkError)) || ((paramObject instanceof NoConnectionError));
  }
  
  private static boolean isServerProblem(Object paramObject)
  {
    return ((paramObject instanceof ServerError)) || ((paramObject instanceof AuthFailureError));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\network\http\VolleyErrorHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */