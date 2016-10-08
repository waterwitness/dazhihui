package com.iflytek.cloud.util;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.iflytek.msc.MSC;
import java.util.Random;

public class VerifierUtil
{
  public static Bitmap ARGB2Gray(Bitmap paramBitmap)
  {
    Bitmap localBitmap;
    if (paramBitmap.getConfig() == Bitmap.Config.ARGB_8888)
    {
      localBitmap = Bitmap.createBitmap(paramBitmap.getWidth(), paramBitmap.getHeight(), Bitmap.Config.ALPHA_8);
      if (a(paramBitmap, localBitmap)) {}
    }
    else
    {
      return null;
    }
    return localBitmap;
  }
  
  private static boolean a(Bitmap paramBitmap1, Bitmap paramBitmap2)
  {
    return MSC.doARGB2Gray(paramBitmap1, paramBitmap2);
  }
  
  public static String generateNumberPassword(int paramInt)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    Random localRandom = new Random();
    String str = "023456789".charAt(localRandom.nextInt("023456789".length())) + "";
    localStringBuffer.append(str);
    int i = 0;
    while (i < paramInt - 1)
    {
      Boolean localBoolean = Boolean.valueOf(false);
      while (!localBoolean.booleanValue())
      {
        str = "023456789".charAt(localRandom.nextInt("023456789".length())) + "";
        if (localStringBuffer.indexOf(str) >= 0) {
          localBoolean = Boolean.valueOf(false);
        } else if (Integer.parseInt(localStringBuffer.charAt(localStringBuffer.length() - 1) + "") * Integer.parseInt(str) == 10) {
          localBoolean = Boolean.valueOf(false);
        } else {
          localBoolean = Boolean.valueOf(true);
        }
      }
      localStringBuffer.append(str);
      i += 1;
    }
    return localStringBuffer.toString();
  }
  
  public static int getBitmapsize(Bitmap paramBitmap)
  {
    return paramBitmap.getRowBytes() * paramBitmap.getHeight();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\util\VerifierUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */