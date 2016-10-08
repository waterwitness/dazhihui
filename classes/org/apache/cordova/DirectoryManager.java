package org.apache.cordova;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;

@Deprecated
public class DirectoryManager
{
  private static final String LOG_TAG = "DirectoryManager";
  
  private static File constructFilePaths(String paramString1, String paramString2)
  {
    if (paramString2.startsWith(paramString1)) {
      return new File(paramString2);
    }
    return new File(paramString1 + "/" + paramString2);
  }
  
  private static long freeSpaceCalculation(String paramString)
  {
    paramString = new StatFs(paramString);
    long l = paramString.getBlockSize();
    return paramString.getAvailableBlocks() * l / 1024L;
  }
  
  public static long getFreeDiskSpace(boolean paramBoolean)
  {
    if (Environment.getExternalStorageState().equals("mounted")) {
      return freeSpaceCalculation(Environment.getExternalStorageDirectory().getPath());
    }
    if (paramBoolean) {
      return freeSpaceCalculation("/");
    }
    return -1L;
  }
  
  public static String getTempDirectoryPath(Context paramContext)
  {
    if (Environment.getExternalStorageState().equals("mounted")) {}
    for (paramContext = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/data/" + paramContext.getPackageName() + "/cache/");; paramContext = paramContext.getCacheDir())
    {
      if (!paramContext.exists()) {
        paramContext.mkdirs();
      }
      return paramContext.getAbsolutePath();
    }
  }
  
  public static boolean testFileExists(String paramString)
  {
    if ((testSaveLocationExists()) && (!paramString.equals(""))) {
      return constructFilePaths(Environment.getExternalStorageDirectory().toString(), paramString).exists();
    }
    return false;
  }
  
  public static boolean testSaveLocationExists()
  {
    return Environment.getExternalStorageState().equals("mounted");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\org\apache\cordova\DirectoryManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */