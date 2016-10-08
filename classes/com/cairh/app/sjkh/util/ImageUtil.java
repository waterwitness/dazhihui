package com.cairh.app.sjkh.util;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ImageUtil
{
  private static final float STANDARD_HEIGHT = 768.0F;
  private static final float STANDARD_SIZE_100K = 153600.0F;
  private static final float STANDARD_SIZE_1M = 1048576.0F;
  private static final float STANDARD_WIDTH = 1024.0F;
  
  public static byte[] File2byte(String paramString)
  {
    try
    {
      paramString = new FileInputStream(new File(paramString));
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      byte[] arrayOfByte = new byte['Ѐ'];
      for (;;)
      {
        int i = paramString.read(arrayOfByte);
        if (i == -1)
        {
          paramString.close();
          localByteArrayOutputStream.close();
          return localByteArrayOutputStream.toByteArray();
        }
        localByteArrayOutputStream.write(arrayOfByte, 0, i);
      }
      return null;
    }
    catch (FileNotFoundException paramString)
    {
      paramString.printStackTrace();
      return null;
    }
    catch (IOException paramString)
    {
      paramString.printStackTrace();
    }
  }
  
  /* Error */
  public static void byte2File(byte[] paramArrayOfByte, File paramFile)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: aconst_null
    //   6: astore 5
    //   8: new 63	java/io/FileOutputStream
    //   11: dup
    //   12: aload_1
    //   13: invokespecial 64	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   16: astore_1
    //   17: aload_1
    //   18: astore_2
    //   19: aload 4
    //   21: astore_3
    //   22: new 66	java/io/BufferedOutputStream
    //   25: dup
    //   26: aload_1
    //   27: invokespecial 69	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   30: astore 4
    //   32: aload 4
    //   34: aload_0
    //   35: invokevirtual 72	java/io/BufferedOutputStream:write	([B)V
    //   38: aload 4
    //   40: ifnull +8 -> 48
    //   43: aload 4
    //   45: invokevirtual 73	java/io/BufferedOutputStream:close	()V
    //   48: aload_1
    //   49: ifnull +7 -> 56
    //   52: aload_1
    //   53: invokevirtual 74	java/io/FileOutputStream:close	()V
    //   56: return
    //   57: astore_0
    //   58: aconst_null
    //   59: astore_1
    //   60: aload 5
    //   62: astore 4
    //   64: aload_1
    //   65: astore_2
    //   66: aload 4
    //   68: astore_3
    //   69: aload_0
    //   70: invokevirtual 75	java/lang/Exception:printStackTrace	()V
    //   73: aload 4
    //   75: ifnull +8 -> 83
    //   78: aload 4
    //   80: invokevirtual 73	java/io/BufferedOutputStream:close	()V
    //   83: aload_1
    //   84: ifnull -28 -> 56
    //   87: aload_1
    //   88: invokevirtual 74	java/io/FileOutputStream:close	()V
    //   91: return
    //   92: astore_0
    //   93: aload_0
    //   94: invokevirtual 57	java/io/IOException:printStackTrace	()V
    //   97: return
    //   98: astore_0
    //   99: aload_0
    //   100: invokevirtual 57	java/io/IOException:printStackTrace	()V
    //   103: goto -20 -> 83
    //   106: astore_0
    //   107: aconst_null
    //   108: astore_1
    //   109: aload_3
    //   110: ifnull +7 -> 117
    //   113: aload_3
    //   114: invokevirtual 73	java/io/BufferedOutputStream:close	()V
    //   117: aload_1
    //   118: ifnull +7 -> 125
    //   121: aload_1
    //   122: invokevirtual 74	java/io/FileOutputStream:close	()V
    //   125: aload_0
    //   126: athrow
    //   127: astore_2
    //   128: aload_2
    //   129: invokevirtual 57	java/io/IOException:printStackTrace	()V
    //   132: goto -15 -> 117
    //   135: astore_1
    //   136: aload_1
    //   137: invokevirtual 57	java/io/IOException:printStackTrace	()V
    //   140: goto -15 -> 125
    //   143: astore_0
    //   144: aload_0
    //   145: invokevirtual 57	java/io/IOException:printStackTrace	()V
    //   148: goto -100 -> 48
    //   151: astore_0
    //   152: aload_0
    //   153: invokevirtual 57	java/io/IOException:printStackTrace	()V
    //   156: return
    //   157: astore_0
    //   158: aload_2
    //   159: astore_1
    //   160: goto -51 -> 109
    //   163: astore_0
    //   164: aload 4
    //   166: astore_3
    //   167: goto -58 -> 109
    //   170: astore_0
    //   171: aload 5
    //   173: astore 4
    //   175: goto -111 -> 64
    //   178: astore_0
    //   179: goto -115 -> 64
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	182	0	paramArrayOfByte	byte[]
    //   0	182	1	paramFile	File
    //   18	48	2	localFile	File
    //   127	32	2	localIOException	IOException
    //   1	166	3	localObject1	Object
    //   3	171	4	localObject2	Object
    //   6	166	5	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   8	17	57	java/lang/Exception
    //   87	91	92	java/io/IOException
    //   78	83	98	java/io/IOException
    //   8	17	106	finally
    //   113	117	127	java/io/IOException
    //   121	125	135	java/io/IOException
    //   43	48	143	java/io/IOException
    //   52	56	151	java/io/IOException
    //   22	32	157	finally
    //   69	73	157	finally
    //   32	38	163	finally
    //   22	32	170	java/lang/Exception
    //   32	38	178	java/lang/Exception
  }
  
  public static Bitmap comp(Bitmap paramBitmap)
  {
    int j = 1;
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    paramBitmap.compress(Bitmap.CompressFormat.JPEG, 100, localByteArrayOutputStream);
    if (localByteArrayOutputStream.toByteArray().length > 1048576.0F)
    {
      localByteArrayOutputStream.reset();
      paramBitmap.compress(Bitmap.CompressFormat.JPEG, 50, localByteArrayOutputStream);
    }
    paramBitmap = new ByteArrayInputStream(localByteArrayOutputStream.toByteArray());
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inPreferredConfig = Bitmap.Config.RGB_565;
    localOptions.inJustDecodeBounds = true;
    BitmapFactory.decodeStream(paramBitmap, null, localOptions);
    localOptions.inJustDecodeBounds = false;
    int i = localOptions.outWidth;
    int k = localOptions.outHeight;
    if ((i > k) && (i > 1024.0F)) {
      i = (int)(localOptions.outWidth / 1024.0F);
    }
    for (;;)
    {
      if (i <= 0) {
        i = j;
      }
      for (;;)
      {
        localOptions.inSampleSize = i;
        return BitmapFactory.decodeStream(new ByteArrayInputStream(localByteArrayOutputStream.toByteArray()), null, localOptions);
        if ((i >= k) || (k <= 768.0F)) {
          break label188;
        }
        i = (int)(localOptions.outHeight / 768.0F);
        break;
      }
      label188:
      i = 1;
    }
  }
  
  public static File compressImage(Bitmap paramBitmap, File paramFile)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    paramBitmap.compress(Bitmap.CompressFormat.JPEG, 90, localByteArrayOutputStream);
    int j = localByteArrayOutputStream.toByteArray().length;
    Log.i("ImageUtil size --> ", j);
    if (j < 153600.0F)
    {
      byte2File(localByteArrayOutputStream.toByteArray(), paramFile);
      return paramFile;
    }
    int i = 80;
    for (;;)
    {
      if (j <= 153600.0F)
      {
        byte2File(localByteArrayOutputStream.toByteArray(), paramFile);
        return paramFile;
      }
      localByteArrayOutputStream.reset();
      paramBitmap.compress(Bitmap.CompressFormat.JPEG, i, localByteArrayOutputStream);
      i -= 10;
      j = localByteArrayOutputStream.toByteArray().length;
      Log.i("ImageUtil size --> ", j);
    }
  }
  
  @SuppressLint({"NewApi"})
  public static int getBitmapSize(Bitmap paramBitmap)
  {
    if (Build.VERSION.SDK_INT >= 12) {
      return paramBitmap.getByteCount();
    }
    return paramBitmap.getRowBytes() * paramBitmap.getHeight();
  }
  
  private static long getFileSize(File paramFile)
  {
    if (paramFile.exists()) {
      return new FileInputStream(paramFile).available();
    }
    paramFile.createNewFile();
    Log.e("无法获取文件大小", "文件不存在!");
    return 0L;
  }
  
  public static void imageInProportion(String paramString, File paramFile)
  {
    int j = 1;
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = true;
    BitmapFactory.decodeFile(paramString, localOptions);
    localOptions.inJustDecodeBounds = false;
    int i = localOptions.outWidth;
    int k = localOptions.outHeight;
    Log.i("ImageUtil w --> ", i + ", h --> " + k);
    if ((i > k) && (i > 1024.0F))
    {
      i = (int)(localOptions.outWidth / 1024.0F);
      if (i > 0) {
        break label176;
      }
      i = j;
    }
    label176:
    for (;;)
    {
      Log.i("ImageUtil be --> ", i);
      localOptions.inSampleSize = i;
      compressImage(BitmapFactory.decodeFile(paramString, localOptions), paramFile);
      return;
      if ((i < k) && (k > 768.0F))
      {
        i = (int)(localOptions.outHeight / 768.0F);
        break;
      }
      i = (int)(localOptions.outWidth / 1024.0F);
      break;
    }
  }
  
  /* Error */
  public static String imgToBase64(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnull +117 -> 118
    //   4: aload_0
    //   5: invokevirtual 215	java/lang/String:length	()I
    //   8: ifle +110 -> 118
    //   11: aload_0
    //   12: invokestatic 219	com/cairh/app/sjkh/util/ImageUtil:readBitmap	(Ljava/lang/String;)Landroid/graphics/Bitmap;
    //   15: astore_1
    //   16: new 36	java/io/ByteArrayOutputStream
    //   19: dup
    //   20: invokespecial 37	java/io/ByteArrayOutputStream:<init>	()V
    //   23: astore_0
    //   24: aload_1
    //   25: getstatic 83	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   28: bipush 100
    //   30: aload_0
    //   31: invokevirtual 89	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   34: pop
    //   35: aload_0
    //   36: invokevirtual 222	java/io/ByteArrayOutputStream:flush	()V
    //   39: aload_0
    //   40: invokevirtual 45	java/io/ByteArrayOutputStream:close	()V
    //   43: aload_0
    //   44: invokevirtual 49	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   47: iconst_0
    //   48: invokestatic 228	android/util/Base64:encodeToString	([BI)Ljava/lang/String;
    //   51: astore_1
    //   52: aload_0
    //   53: invokevirtual 222	java/io/ByteArrayOutputStream:flush	()V
    //   56: aload_0
    //   57: invokevirtual 45	java/io/ByteArrayOutputStream:close	()V
    //   60: aload_1
    //   61: areturn
    //   62: astore_0
    //   63: aload_0
    //   64: invokevirtual 57	java/io/IOException:printStackTrace	()V
    //   67: aload_1
    //   68: areturn
    //   69: astore_0
    //   70: aconst_null
    //   71: astore_0
    //   72: aload_0
    //   73: invokevirtual 222	java/io/ByteArrayOutputStream:flush	()V
    //   76: aload_0
    //   77: invokevirtual 45	java/io/ByteArrayOutputStream:close	()V
    //   80: aconst_null
    //   81: areturn
    //   82: astore_0
    //   83: aload_0
    //   84: invokevirtual 57	java/io/IOException:printStackTrace	()V
    //   87: aconst_null
    //   88: areturn
    //   89: astore_1
    //   90: aconst_null
    //   91: astore_0
    //   92: aload_0
    //   93: invokevirtual 222	java/io/ByteArrayOutputStream:flush	()V
    //   96: aload_0
    //   97: invokevirtual 45	java/io/ByteArrayOutputStream:close	()V
    //   100: aload_1
    //   101: athrow
    //   102: astore_0
    //   103: aload_0
    //   104: invokevirtual 57	java/io/IOException:printStackTrace	()V
    //   107: goto -7 -> 100
    //   110: astore_1
    //   111: goto -19 -> 92
    //   114: astore_1
    //   115: goto -43 -> 72
    //   118: aconst_null
    //   119: astore_1
    //   120: goto -104 -> 16
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	123	0	paramString	String
    //   15	53	1	localObject1	Object
    //   89	12	1	localObject2	Object
    //   110	1	1	localObject3	Object
    //   114	1	1	localException	Exception
    //   119	1	1	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   52	60	62	java/io/IOException
    //   16	24	69	java/lang/Exception
    //   72	80	82	java/io/IOException
    //   16	24	89	finally
    //   92	100	102	java/io/IOException
    //   24	52	110	finally
    //   24	52	114	java/lang/Exception
  }
  
  private static Bitmap readBitmap(String paramString)
  {
    try
    {
      paramString = BitmapFactory.decodeFile(paramString);
      return paramString;
    }
    catch (Exception paramString) {}
    return null;
  }
  
  /* Error */
  public static void saveBitmap(Bitmap paramBitmap, File paramFile)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 178	java/io/File:exists	()Z
    //   4: ifeq +42 -> 46
    //   7: aload_1
    //   8: new 28	java/io/File
    //   11: dup
    //   12: new 134	java/lang/StringBuilder
    //   15: dup
    //   16: aload_1
    //   17: invokevirtual 235	java/io/File:getPath	()Ljava/lang/String;
    //   20: invokestatic 239	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   23: invokespecial 240	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   26: ldc -14
    //   28: invokevirtual 204	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   31: invokevirtual 143	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   34: invokespecial 31	java/io/File:<init>	(Ljava/lang/String;)V
    //   37: invokevirtual 246	java/io/File:renameTo	(Ljava/io/File;)Z
    //   40: pop
    //   41: aload_1
    //   42: invokevirtual 184	java/io/File:createNewFile	()Z
    //   45: pop
    //   46: new 63	java/io/FileOutputStream
    //   49: dup
    //   50: aload_1
    //   51: invokespecial 64	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   54: astore_1
    //   55: aload_0
    //   56: getstatic 83	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   59: bipush 100
    //   61: aload_1
    //   62: invokevirtual 89	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   65: pop
    //   66: aload_1
    //   67: invokevirtual 247	java/io/FileOutputStream:flush	()V
    //   70: aload_1
    //   71: invokevirtual 74	java/io/FileOutputStream:close	()V
    //   74: return
    //   75: astore_2
    //   76: aload_2
    //   77: invokevirtual 57	java/io/IOException:printStackTrace	()V
    //   80: goto -34 -> 46
    //   83: astore_0
    //   84: aload_0
    //   85: invokevirtual 56	java/io/FileNotFoundException:printStackTrace	()V
    //   88: return
    //   89: astore_0
    //   90: aload_0
    //   91: invokevirtual 57	java/io/IOException:printStackTrace	()V
    //   94: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	95	0	paramBitmap	Bitmap
    //   0	95	1	paramFile	File
    //   75	2	2	localIOException	IOException
    // Exception table:
    //   from	to	target	type
    //   7	46	75	java/io/IOException
    //   46	74	83	java/io/FileNotFoundException
    //   46	74	89	java/io/IOException
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\util\ImageUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */