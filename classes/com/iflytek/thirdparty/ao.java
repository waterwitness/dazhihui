package com.iflytek.thirdparty;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.InputStream;

public class ao
{
  private static int a = 0;
  
  public static Bitmap a(Resources paramResources, TypedValue paramTypedValue, InputStream paramInputStream, Rect paramRect, BitmapFactory.Options paramOptions)
  {
    BitmapFactory.Options localOptions = paramOptions;
    if (paramOptions == null) {
      localOptions = new BitmapFactory.Options();
    }
    int i;
    if ((localOptions.inDensity == 0) && (paramTypedValue != null))
    {
      i = paramTypedValue.density;
      if (i != 0) {
        break label81;
      }
      localOptions.inDensity = 160;
    }
    for (;;)
    {
      if ((localOptions.inTargetDensity == 0) && (paramResources != null)) {
        localOptions.inTargetDensity = paramResources.getDisplayMetrics().densityDpi;
      }
      return BitmapFactory.decodeStream(paramInputStream, paramRect, localOptions);
      label81:
      if (i != 65535) {
        localOptions.inDensity = i;
      }
    }
  }
  
  private static Drawable a(Resources paramResources, Bitmap paramBitmap, byte[] paramArrayOfByte, Rect paramRect, String paramString)
  {
    if (paramArrayOfByte != null) {
      return new NinePatchDrawable(paramResources, paramBitmap, paramArrayOfByte, paramRect, paramString);
    }
    return new BitmapDrawable(paramResources, paramBitmap);
  }
  
  public static Drawable a(Resources paramResources, TypedValue paramTypedValue, InputStream paramInputStream, String paramString, BitmapFactory.Options paramOptions)
  {
    Object localObject = null;
    if (paramInputStream == null) {}
    Rect localRect;
    do
    {
      return null;
      localRect = new Rect();
      BitmapFactory.Options localOptions = paramOptions;
      if (paramOptions == null) {
        localOptions = new BitmapFactory.Options();
      }
      paramOptions = a(paramResources, paramTypedValue, paramInputStream, localRect, localOptions);
    } while (paramOptions == null);
    paramTypedValue = paramOptions.getNinePatchChunk();
    if ((paramTypedValue == null) || (!NinePatch.isNinePatchChunk(paramTypedValue))) {
      paramTypedValue = null;
    }
    for (paramInputStream = (InputStream)localObject;; paramInputStream = localRect) {
      return a(paramResources, paramOptions, paramTypedValue, paramInputStream, paramString);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */