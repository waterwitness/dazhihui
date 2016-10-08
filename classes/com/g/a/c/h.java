package com.g.a.c;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.io.IOException;

public final class h
{
  public static File a(Context paramContext)
  {
    return a(paramContext, true);
  }
  
  public static File a(Context paramContext, String paramString)
  {
    paramContext = a(paramContext);
    paramString = new File(paramContext, paramString);
    if ((!paramString.exists()) && (!paramString.mkdir())) {
      return paramContext;
    }
    return paramString;
  }
  
  public static File a(Context paramContext, boolean paramBoolean)
  {
    Object localObject3 = null;
    try
    {
      localObject2 = Environment.getExternalStorageState();
      Object localObject1 = localObject3;
      if (paramBoolean)
      {
        localObject1 = localObject3;
        if ("mounted".equals(localObject2))
        {
          localObject1 = localObject3;
          if (d(paramContext)) {
            localObject1 = c(paramContext);
          }
        }
      }
      localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = paramContext.getCacheDir();
      }
      localObject1 = localObject2;
      if (localObject2 == null)
      {
        paramContext = "/data/data/" + paramContext.getPackageName() + "/cache/";
        e.c("Can't define system cache directory! '%s' will be used.", new Object[] { paramContext });
        localObject1 = new File(paramContext);
      }
      return (File)localObject1;
    }
    catch (NullPointerException localNullPointerException)
    {
      for (;;)
      {
        localObject2 = "";
      }
    }
    catch (IncompatibleClassChangeError localIncompatibleClassChangeError)
    {
      for (;;)
      {
        Object localObject2 = "";
      }
    }
  }
  
  public static File b(Context paramContext)
  {
    return a(paramContext, "uil-images");
  }
  
  private static File c(Context paramContext)
  {
    File localFile = new File(new File(new File(new File(Environment.getExternalStorageDirectory(), "Android"), "data"), paramContext.getPackageName()), "cache");
    paramContext = localFile;
    if (!localFile.exists())
    {
      if (!localFile.mkdirs())
      {
        e.c("Unable to create external cache directory", new Object[0]);
        paramContext = null;
      }
    }
    else {
      return paramContext;
    }
    try
    {
      new File(localFile, ".nomedia").createNewFile();
      return localFile;
    }
    catch (IOException paramContext)
    {
      e.b("Can't create \".nomedia\" file in application external cache directory", new Object[0]);
    }
    return localFile;
  }
  
  private static boolean d(Context paramContext)
  {
    return paramContext.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\g\a\c\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */