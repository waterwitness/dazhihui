package com.android.thinkive.framework.displayingbitmap;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import java.io.FileDescriptor;

public class ImageResizer
  extends ImageWorker
{
  private static final String TAG = "ImageResizer";
  protected int mImageHeight;
  protected int mImageWidth;
  
  public ImageResizer(Context paramContext, int paramInt)
  {
    super(paramContext);
    setImageSize(paramInt);
  }
  
  public ImageResizer(Context paramContext, int paramInt1, int paramInt2)
  {
    super(paramContext);
    setImageSize(paramInt1, paramInt2);
  }
  
  @TargetApi(11)
  private static void addInBitmapOptions(BitmapFactory.Options paramOptions, ImageCache paramImageCache)
  {
    paramOptions.inMutable = true;
    if (paramImageCache != null)
    {
      paramImageCache = paramImageCache.getBitmapFromReusableSet(paramOptions);
      if (paramImageCache != null) {
        paramOptions.inBitmap = paramImageCache;
      }
    }
  }
  
  public static int calculateInSampleSize(BitmapFactory.Options paramOptions, int paramInt1, int paramInt2)
  {
    int k = paramOptions.outHeight;
    int m = paramOptions.outWidth;
    int i = 1;
    int j = 1;
    long l1;
    long l2;
    if ((k > paramInt2) || (m > paramInt1))
    {
      int n = k / 2;
      int i1 = m / 2;
      i = j;
      if ((n / i > paramInt2) && (i1 / i > paramInt1)) {
        break label88;
      }
      l1 = k * m / i;
      l2 = paramInt1 * paramInt2 * 2;
    }
    for (;;)
    {
      if (l1 <= l2)
      {
        return i;
        label88:
        i *= 2;
        break;
      }
      l1 /= 2L;
      i *= 2;
    }
  }
  
  public static Bitmap decodeSampledBitmapFromDescriptor(FileDescriptor paramFileDescriptor, int paramInt1, int paramInt2, ImageCache paramImageCache)
  {
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = true;
    BitmapFactory.decodeFileDescriptor(paramFileDescriptor, null, localOptions);
    localOptions.inSampleSize = calculateInSampleSize(localOptions, paramInt1, paramInt2);
    localOptions.inJustDecodeBounds = false;
    if (Utils.hasHoneycomb()) {
      addInBitmapOptions(localOptions, paramImageCache);
    }
    return BitmapFactory.decodeFileDescriptor(paramFileDescriptor, null, localOptions);
  }
  
  public static Bitmap decodeSampledBitmapFromFile(String paramString, int paramInt1, int paramInt2, ImageCache paramImageCache)
  {
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = true;
    BitmapFactory.decodeFile(paramString, localOptions);
    localOptions.inSampleSize = calculateInSampleSize(localOptions, paramInt1, paramInt2);
    if (Utils.hasHoneycomb()) {
      addInBitmapOptions(localOptions, paramImageCache);
    }
    localOptions.inJustDecodeBounds = false;
    return BitmapFactory.decodeFile(paramString, localOptions);
  }
  
  public static Bitmap decodeSampledBitmapFromResource(Resources paramResources, int paramInt1, int paramInt2, int paramInt3, ImageCache paramImageCache)
  {
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = true;
    BitmapFactory.decodeResource(paramResources, paramInt1, localOptions);
    localOptions.inSampleSize = calculateInSampleSize(localOptions, paramInt2, paramInt3);
    if (Utils.hasHoneycomb()) {
      addInBitmapOptions(localOptions, paramImageCache);
    }
    localOptions.inJustDecodeBounds = false;
    return BitmapFactory.decodeResource(paramResources, paramInt1, localOptions);
  }
  
  private Bitmap processBitmap(int paramInt)
  {
    if (com.android.thinkive.framework.util.Log.isDebug) {
      android.util.Log.d("ImageResizer", "processBitmap - " + paramInt);
    }
    return decodeSampledBitmapFromResource(this.mResources, paramInt, this.mImageWidth, this.mImageHeight, getImageCache());
  }
  
  protected Bitmap processBitmap(Object paramObject)
  {
    return processBitmap(Integer.parseInt(String.valueOf(paramObject)));
  }
  
  public void setImageSize(int paramInt)
  {
    setImageSize(paramInt, paramInt);
  }
  
  public void setImageSize(int paramInt1, int paramInt2)
  {
    this.mImageWidth = paramInt1;
    this.mImageHeight = paramInt2;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\displayingbitmap\ImageResizer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */