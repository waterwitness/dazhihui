package com.cairh.app.sjkh.util;

import android.content.Context;
import android.util.Log;
import java.io.File;

public class CacheUtil
{
  public static String APP_CACAHE_DIRNAME = "cache";
  
  public static void clearWebViewCache(Context paramContext, String paramString)
  {
    paramString = new File(paramString);
    Log.e("", "appCacheDir path=" + paramString.getAbsolutePath());
    paramContext = new File(paramContext.getCacheDir().getAbsolutePath() + "/webviewCache");
    Log.e("", "webviewCacheDir path=" + paramContext.getAbsolutePath());
    if (paramContext.exists()) {
      deleteFile(paramContext);
    }
    if (paramString.exists()) {
      deleteFile(paramString);
    }
  }
  
  public static void deleteFile(File paramFile)
  {
    Log.i("", "delete file path=" + paramFile.getAbsolutePath());
    if (paramFile.exists())
    {
      if (paramFile.isFile()) {
        paramFile.delete();
      }
      for (;;)
      {
        paramFile.delete();
        return;
        if (paramFile.isDirectory())
        {
          File[] arrayOfFile = paramFile.listFiles();
          int i = 0;
          while (i < arrayOfFile.length)
          {
            deleteFile(arrayOfFile[i]);
            i += 1;
          }
        }
      }
    }
    Log.e("", "delete file no exists " + paramFile.getAbsolutePath());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\util\CacheUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */