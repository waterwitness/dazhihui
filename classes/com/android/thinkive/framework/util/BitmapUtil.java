package com.android.thinkive.framework.util;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Build.VERSION;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public class BitmapUtil
{
  @TargetApi(14)
  public static byte[] convertBitmapToBytes(Bitmap paramBitmap)
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      localObject = ByteBuffer.allocate(paramBitmap.getByteCount());
      paramBitmap.copyPixelsToBuffer((Buffer)localObject);
      return ((ByteBuffer)localObject).array();
    }
    Object localObject = new ByteArrayOutputStream();
    paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, (OutputStream)localObject);
    return ((ByteArrayOutputStream)localObject).toByteArray();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\util\BitmapUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */