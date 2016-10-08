package com.iflytek.speech.util;

import android.content.Context;
import android.content.res.AssetManager;
import com.iflytek.cloud.SpeechUtility;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONArray;
import org.json.JSONObject;

public class FucUtil
{
  public static String checkLocalResource()
  {
    Object localObject = SpeechUtility.getUtility().getParameter("asr");
    int i;
    try
    {
      localObject = new JSONObject((String)localObject);
      i = ((JSONObject)localObject).getInt("ret");
      switch (i)
      {
      default: 
        return "";
      }
    }
    catch (Exception localException)
    {
      SpeechUtility.getUtility().openEngineSettings("asr");
      return "获取结果出错，跳转至资源下载页面";
    }
    localObject = ((JSONObject)localObject).getJSONObject("result").optJSONArray("asr");
    if (localObject != null) {
      i = 0;
    }
    for (;;)
    {
      if ((i >= ((JSONArray)localObject).length()) || ("iat".equals(((JSONArray)localObject).getJSONObject(i).get("domain"))))
      {
        if (i < ((JSONArray)localObject).length()) {
          break;
        }
        SpeechUtility.getUtility().openEngineSettings("asr");
        return "没有听写资源，跳转至资源下载页面";
        SpeechUtility.getUtility().openEngineSettings("asr");
        return "没有听写资源，跳转至资源下载页面";
        SpeechUtility.getUtility().openEngineSettings("asr");
        return "获取结果出错，跳转至资源下载页面";
      }
      i += 1;
    }
    return "语记版本过低，请更新后使用本地功能";
  }
  
  public static byte[] readAudioFile(Context paramContext, String paramString)
  {
    try
    {
      paramContext = paramContext.getAssets().open(paramString);
      paramString = new byte[paramContext.available()];
      paramContext.read(paramString);
      paramContext.close();
      return paramString;
    }
    catch (IOException paramContext)
    {
      paramContext.printStackTrace();
    }
    return null;
  }
  
  public static String readFile(Context paramContext, String paramString1, String paramString2)
  {
    try
    {
      paramContext = paramContext.getAssets().open(paramString1);
      int i = paramContext.available();
      paramString1 = new byte[i];
      paramContext.read(paramString1, 0, i);
      paramContext = new String(paramString1, paramString2);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
    }
    return "";
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\speech\util\FucUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */