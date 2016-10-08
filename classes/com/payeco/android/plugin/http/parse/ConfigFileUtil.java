package com.payeco.android.plugin.http.parse;

import android.content.Context;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;

public class ConfigFileUtil
{
  public static byte[] readConfigFile(File paramFile)
  {
    try
    {
      FileInputStream localFileInputStream = new FileInputStream(paramFile);
      paramFile = new byte[localFileInputStream.available()];
      localIOException1.printStackTrace();
    }
    catch (IOException localIOException1)
    {
      try
      {
        localFileInputStream.read(paramFile);
        localFileInputStream.close();
        return paramFile;
      }
      catch (IOException localIOException2)
      {
        for (;;) {}
      }
      localIOException1 = localIOException1;
      paramFile = null;
    }
    return paramFile;
  }
  
  public static byte[] readConfigFile(InputStream paramInputStream)
  {
    try
    {
      byte[] arrayOfByte = new byte[paramInputStream.available()];
      localIOException1.printStackTrace();
    }
    catch (IOException localIOException1)
    {
      try
      {
        paramInputStream.read(arrayOfByte);
        return arrayOfByte;
      }
      catch (IOException localIOException2)
      {
        for (;;)
        {
          paramInputStream = localIOException1;
          Object localObject = localIOException2;
        }
      }
      localIOException1 = localIOException1;
      paramInputStream = null;
    }
    return paramInputStream;
  }
  
  public static boolean writeConfigFile(Context paramContext, String paramString1, String paramString2, int paramInt)
  {
    try
    {
      paramContext = paramContext.openFileOutput(paramString2, paramInt);
      paramString2 = new BufferedWriter(new OutputStreamWriter(paramContext));
      paramString2.write(paramString1);
      paramString2.close();
      paramContext.close();
      return true;
    }
    catch (FileNotFoundException paramContext)
    {
      paramContext.printStackTrace();
      return false;
    }
    catch (IOException paramContext)
    {
      paramContext.printStackTrace();
    }
    return false;
  }
  
  public static boolean writeConfigFile(Context paramContext, byte[] paramArrayOfByte, String paramString, int paramInt)
  {
    try
    {
      paramContext = paramContext.openFileOutput(paramString, paramInt);
      paramContext.write(paramArrayOfByte);
      paramContext.close();
      return true;
    }
    catch (FileNotFoundException paramContext)
    {
      paramContext.printStackTrace();
      return false;
    }
    catch (IOException paramContext)
    {
      paramContext.printStackTrace();
    }
    return false;
  }
  
  public static boolean writeConfigFile(byte[] paramArrayOfByte, File paramFile)
  {
    try
    {
      paramFile = new FileOutputStream(paramFile);
      paramFile.write(paramArrayOfByte);
      paramFile.close();
      return true;
    }
    catch (FileNotFoundException paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
      return false;
    }
    catch (IOException paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
    }
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\http\parse\ConfigFileUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */