package com.tencent.qalsdk.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Environment;
import com.tencent.qalsdk.util.QLog;
import java.io.File;

public class b
{
  static int a = -1;
  private static final String b = "MSF.C.CoreUtil";
  private static String c = Environment.getExternalStorageDirectory().getPath() + "/qalsdk/files";
  
  public static int a(byte[] paramArrayOfByte, int paramInt)
  {
    return paramArrayOfByte[(paramInt + 3)] & 0xFF | paramArrayOfByte[(paramInt + 2)] << 8 & 0xFF00 | paramArrayOfByte[(paramInt + 1)] << 16 & 0xFF0000 | paramArrayOfByte[(paramInt + 0)] << 24 & 0xFF000000;
  }
  
  public static String a(Context paramContext)
  {
    Object localObject1 = null;
    for (;;)
    {
      try
      {
        localObject2 = paramContext.getFilesDir();
        if (localObject2 != null) {
          continue;
        }
        paramContext = paramContext.getCacheDir();
        if (paramContext != null) {
          continue;
        }
        if (!QLog.isColorLevel()) {
          break label251;
        }
        QLog.w("MSF.C.CoreUtil", 2, "load cache dir is null");
        paramContext = null;
        if (paramContext != null) {
          continue;
        }
        localObject2 = c;
        File localFile = new File((String)localObject2);
        paramContext = (Context)localObject2;
        if (!localFile.exists())
        {
          localFile.mkdirs();
          paramContext = (Context)localObject2;
        }
        if (QLog.isColorLevel()) {
          QLog.d("MSF.C.CoreUtil", 2, "load save root dir is " + paramContext);
        }
      }
      catch (Throwable localThrowable)
      {
        Object localObject2;
        int i;
        paramContext = (Context)localObject1;
        if (!QLog.isColorLevel()) {
          continue;
        }
        QLog.w("MSF.C.CoreUtil", 2, "getSaveRootPath error ", localThrowable);
        paramContext = (Context)localObject1;
        continue;
      }
      finally {}
      return paramContext;
      localObject2 = paramContext.getAbsolutePath();
      i = ((String)localObject2).lastIndexOf('/');
      paramContext = (Context)localObject2;
      if (i != -1)
      {
        paramContext = ((String)localObject2).substring(0, i);
        paramContext = paramContext + "/files/";
        continue;
        paramContext = ((File)localObject2).getAbsolutePath();
        continue;
        localObject2 = new File(paramContext);
        if (!((File)localObject2).exists()) {
          ((File)localObject2).mkdirs();
        }
        if ((!((File)localObject2).exists()) || (!((File)localObject2).canWrite()))
        {
          paramContext = c;
          new File(paramContext).mkdirs();
          continue;
          label251:
          paramContext = null;
        }
      }
    }
  }
  
  public static byte[] a(int paramInt)
  {
    return new byte[] { (byte)(paramInt >>> 24 & 0xFF), (byte)(paramInt >>> 16 & 0xFF), (byte)(paramInt >>> 8 & 0xFF), (byte)(paramInt & 0xFF) };
  }
  
  public static int b(Context paramContext)
  {
    PackageManager localPackageManager;
    if ((a == -1) && (paramContext != null)) {
      localPackageManager = paramContext.getPackageManager();
    }
    try
    {
      a = localPackageManager.getPackageInfo(paramContext.getPackageName(), 0).versionCode;
      return a;
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        paramContext.printStackTrace();
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\core\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */