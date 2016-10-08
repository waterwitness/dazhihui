package com.kwl.common.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Environment;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

public class BitmapUtils
{
  private static final String TAG = "ImageUtils";
  public static String jarFileName = "yunva_dynamic_sdk.jar";
  public static final String jarOutputPath = Environment.getExternalStorageDirectory().toString() + "/yunva_sdk/jar";
  private static final String res_path = "com/yunva/sdk/actual/res/skin";
  
  public static Drawable bitmap2Drawable(Bitmap paramBitmap)
  {
    return new BitmapDrawable(paramBitmap);
  }
  
  public static byte[] bitmapToBytes(Bitmap paramBitmap)
  {
    Object localObject = null;
    if (paramBitmap != null)
    {
      localObject = new ByteArrayOutputStream();
      paramBitmap.compress(Bitmap.CompressFormat.JPEG, 100, (OutputStream)localObject);
      localObject = ((ByteArrayOutputStream)localObject).toByteArray();
    }
    return (byte[])localObject;
  }
  
  public static Drawable bitmapToDrawable(Bitmap paramBitmap)
  {
    return new BitmapDrawable(paramBitmap);
  }
  
  public static Bitmap byteToBitmap(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte.length != 0) {
      return BitmapFactory.decodeByteArray(paramArrayOfByte, 0, paramArrayOfByte.length);
    }
    return null;
  }
  
  public static Drawable byteToDrawable(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null) {}
    for (paramArrayOfByte = new ByteArrayInputStream(paramArrayOfByte);; paramArrayOfByte = null) {
      return Drawable.createFromStream(paramArrayOfByte, null);
    }
  }
  
  public static boolean checkSDCardAvailable()
  {
    return Environment.getExternalStorageState().equals("mounted");
  }
  
  public static Bitmap compressBmp(Bitmap paramBitmap)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    int i = 80;
    paramBitmap.compress(Bitmap.CompressFormat.JPEG, 80, localByteArrayOutputStream);
    LogUtil.d("image length--->" + localByteArrayOutputStream.toByteArray().length / 1024);
    ByteArrayInputStream localByteArrayInputStream;
    int j;
    if (localByteArrayOutputStream.toByteArray().length / 1024 <= 1024)
    {
      localByteArrayInputStream = new ByteArrayInputStream(localByteArrayOutputStream.toByteArray());
      paramBitmap = new BitmapFactory.Options();
      paramBitmap.inJustDecodeBounds = true;
      BitmapFactory.decodeStream(localByteArrayInputStream, null, paramBitmap);
      paramBitmap.inJustDecodeBounds = false;
      i = paramBitmap.outWidth;
      j = paramBitmap.outHeight;
      if ((i <= j) || (i <= 480.0F)) {
        break label208;
      }
      i = (int)(paramBitmap.outWidth / 480.0F);
    }
    for (;;)
    {
      j = i;
      if (i <= 0) {
        j = 1;
      }
      paramBitmap.inSampleSize = j;
      localByteArrayInputStream = new ByteArrayInputStream(localByteArrayOutputStream.toByteArray());
      paramBitmap = BitmapFactory.decodeStream(localByteArrayInputStream, null, paramBitmap);
      StreamUtils.closeInputStream(localByteArrayInputStream);
      StreamUtils.closeOutputStream(localByteArrayOutputStream);
      return compressImage(paramBitmap);
      localByteArrayOutputStream.reset();
      i -= 10;
      paramBitmap.compress(Bitmap.CompressFormat.JPEG, i, localByteArrayOutputStream);
      break;
      label208:
      if ((i < j) && (j > 800.0F)) {
        i = (int)(paramBitmap.outHeight / 800.0F);
      } else {
        i = 1;
      }
    }
  }
  
  public static Bitmap compressImage(Bitmap paramBitmap)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    paramBitmap.compress(Bitmap.CompressFormat.JPEG, 100, localByteArrayOutputStream);
    int i = 100;
    for (;;)
    {
      if (localByteArrayOutputStream.toByteArray().length / 1024 <= 100)
      {
        paramBitmap = new ByteArrayInputStream(localByteArrayOutputStream.toByteArray());
        Bitmap localBitmap = BitmapFactory.decodeStream(paramBitmap, null, null);
        StreamUtils.closeInputStream(paramBitmap);
        StreamUtils.closeOutputStream(localByteArrayOutputStream);
        return localBitmap;
      }
      localByteArrayOutputStream.reset();
      paramBitmap.compress(Bitmap.CompressFormat.JPEG, i, localByteArrayOutputStream);
      i -= 10;
    }
  }
  
  public static Bitmap createReflectionImageWithOrigin(Bitmap paramBitmap)
  {
    int i = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    Object localObject1 = new Matrix();
    ((Matrix)localObject1).preScale(1.0F, -1.0F);
    Object localObject2 = Bitmap.createBitmap(paramBitmap, 0, j / 2, i, j / 2, (Matrix)localObject1, false);
    localObject1 = Bitmap.createBitmap(i, j / 2 + j, Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas((Bitmap)localObject1);
    localCanvas.drawBitmap(paramBitmap, 0.0F, 0.0F, null);
    Paint localPaint = new Paint();
    localCanvas.drawRect(0.0F, j, i, j + 4, localPaint);
    localCanvas.drawBitmap((Bitmap)localObject2, 0.0F, j + 4, null);
    localObject2 = new Paint();
    ((Paint)localObject2).setShader(new LinearGradient(0.0F, paramBitmap.getHeight(), 0.0F, ((Bitmap)localObject1).getHeight() + 4, 1895825407, 16777215, Shader.TileMode.CLAMP));
    ((Paint)localObject2).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    localCanvas.drawRect(0.0F, j, i, ((Bitmap)localObject1).getHeight() + 4, (Paint)localObject2);
    return (Bitmap)localObject1;
  }
  
  public static Bitmap decodeFile(File paramFile)
  {
    int i = 1;
    try
    {
      BitmapFactory.Options localOptions = new BitmapFactory.Options();
      localOptions.inJustDecodeBounds = true;
      BitmapFactory.decodeStream(new FileInputStream(paramFile), null, localOptions);
      int k = localOptions.outWidth;
      int j = localOptions.outHeight;
      for (;;)
      {
        if ((k / 2 < 400) || (j / 2 < 400))
        {
          localOptions = new BitmapFactory.Options();
          localOptions.inSampleSize = i;
          return BitmapFactory.decodeStream(new FileInputStream(paramFile), null, localOptions);
        }
        k /= 2;
        j /= 2;
        i *= 2;
      }
      return null;
    }
    catch (FileNotFoundException paramFile) {}
  }
  
  public static void deleteAllPhoto(String paramString)
  {
    int i;
    if (checkSDCardAvailable())
    {
      paramString = new File(paramString).listFiles();
      i = 0;
    }
    for (;;)
    {
      if (i >= paramString.length) {
        return;
      }
      paramString[i].delete();
      i += 1;
    }
  }
  
  public static void deletePhotoAtPathAndName(String paramString1, String paramString2)
  {
    int i;
    if (checkSDCardAvailable())
    {
      paramString1 = new File(paramString1).listFiles();
      i = 0;
    }
    for (;;)
    {
      if (i >= paramString1.length) {
        return;
      }
      if (paramString1[i].getName().equals(paramString2)) {
        paramString1[i].delete();
      }
      i += 1;
    }
  }
  
  public static Bitmap drawableToBitmap(Drawable paramDrawable)
  {
    int i = paramDrawable.getIntrinsicWidth();
    int j = paramDrawable.getIntrinsicHeight();
    if (paramDrawable.getOpacity() != -1) {}
    for (Object localObject = Bitmap.Config.ARGB_8888;; localObject = Bitmap.Config.RGB_565)
    {
      localObject = Bitmap.createBitmap(i, j, (Bitmap.Config)localObject);
      Canvas localCanvas = new Canvas((Bitmap)localObject);
      paramDrawable.setBounds(0, 0, i, j);
      paramDrawable.draw(localCanvas);
      return (Bitmap)localObject;
    }
  }
  
  public static byte[] drawableToBytes(Drawable paramDrawable)
  {
    return bitmapToBytes(((BitmapDrawable)paramDrawable).getBitmap());
  }
  
  public static boolean findPhotoFromSDCard(String paramString1, String paramString2)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    int i;
    if (checkSDCardAvailable())
    {
      bool1 = bool2;
      if (new File(paramString1).exists())
      {
        paramString1 = new File(paramString1).listFiles();
        i = 0;
        bool1 = false;
      }
    }
    for (;;)
    {
      if (i >= paramString1.length) {
        return bool1;
      }
      if (paramString1[i].getName().split("\\.")[0].equals(paramString2)) {
        bool1 = true;
      }
      i += 1;
    }
  }
  
  public static Drawable getDrawable(Activity paramActivity, String paramString)
  {
    return new BitmapDrawable(loadImage(paramActivity, paramString));
  }
  
  public static Bitmap getImage(String paramString)
  {
    int j = 1;
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = true;
    BitmapFactory.decodeFile(paramString, localOptions);
    localOptions.inJustDecodeBounds = false;
    int i = localOptions.outWidth;
    int k = localOptions.outHeight;
    if ((i > k) && (i > 480.0F)) {
      i = (int)(localOptions.outWidth / 480.0F);
    }
    for (;;)
    {
      if (i <= 0) {
        i = j;
      }
      for (;;)
      {
        localOptions.inSampleSize = i;
        return compressImage(BitmapFactory.decodeFile(paramString, localOptions));
        if ((i >= k) || (k <= 800.0F)) {
          break label112;
        }
        i = (int)(localOptions.outHeight / 800.0F);
        break;
      }
      label112:
      i = 1;
    }
  }
  
  public static Bitmap getPhotoFromSDCard(String paramString)
  {
    Bitmap localBitmap = BitmapFactory.decodeFile(paramString);
    paramString = localBitmap;
    if (localBitmap == null) {
      paramString = null;
    }
    return paramString;
  }
  
  public static Bitmap getPhotoFromSDCard(String paramString1, String paramString2)
  {
    paramString2 = BitmapFactory.decodeFile(paramString1 + "/" + paramString2 + ".png");
    paramString1 = paramString2;
    if (paramString2 == null) {
      paramString1 = null;
    }
    return paramString1;
  }
  
  public static Bitmap getRoundedCornerBitmap(Bitmap paramBitmap, float paramFloat)
  {
    int i = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    Bitmap localBitmap = Bitmap.createBitmap(i, j, Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    Paint localPaint = new Paint();
    Rect localRect = new Rect(0, 0, i, j);
    RectF localRectF = new RectF(localRect);
    localPaint.setAntiAlias(true);
    localCanvas.drawARGB(0, 0, 0, 0);
    localPaint.setColor(-12434878);
    localCanvas.drawRoundRect(localRectF, paramFloat, paramFloat, localPaint);
    localPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    localCanvas.drawBitmap(paramBitmap, localRect, localRect, localPaint);
    return localBitmap;
  }
  
  public static Bitmap inputStreamToBitmap(InputStream paramInputStream)
  {
    return BitmapFactory.decodeStream(paramInputStream);
  }
  
  /* Error */
  public static Bitmap loadImage(Activity paramActivity, String paramString)
  {
    // Byte code:
    //   0: new 17	java/lang/StringBuilder
    //   3: dup
    //   4: ldc_w 370
    //   7: invokespecial 39	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   10: aload_1
    //   11: invokevirtual 45	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   14: ldc_w 327
    //   17: invokevirtual 45	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   20: invokevirtual 46	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   23: astore_1
    //   24: aload_0
    //   25: invokevirtual 376	android/app/Activity:getClassLoader	()Ljava/lang/ClassLoader;
    //   28: aload_1
    //   29: invokevirtual 382	java/lang/ClassLoader:getResourceAsStream	(Ljava/lang/String;)Ljava/io/InputStream;
    //   32: astore_0
    //   33: aload_0
    //   34: ifnull +34 -> 68
    //   37: aload_0
    //   38: astore_1
    //   39: aload_0
    //   40: invokestatic 364	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   43: astore_2
    //   44: aload_2
    //   45: astore_1
    //   46: aload_0
    //   47: ifnull +7 -> 54
    //   50: aload_0
    //   51: invokevirtual 387	java/io/InputStream:close	()V
    //   54: iconst_0
    //   55: ifeq +11 -> 66
    //   58: new 389	java/lang/NullPointerException
    //   61: dup
    //   62: invokespecial 390	java/lang/NullPointerException:<init>	()V
    //   65: athrow
    //   66: aload_1
    //   67: areturn
    //   68: aload_0
    //   69: astore_1
    //   70: ldc_w 392
    //   73: invokestatic 128	com/kwl/common/utils/LogUtil:d	(Ljava/lang/String;)V
    //   76: aconst_null
    //   77: astore_1
    //   78: goto -32 -> 46
    //   81: astore_2
    //   82: aconst_null
    //   83: astore_0
    //   84: aload_0
    //   85: astore_1
    //   86: new 17	java/lang/StringBuilder
    //   89: dup
    //   90: ldc_w 394
    //   93: invokespecial 39	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   96: aload_2
    //   97: invokevirtual 395	java/lang/Exception:toString	()Ljava/lang/String;
    //   100: invokevirtual 45	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: invokevirtual 46	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   106: invokestatic 398	com/kwl/common/utils/LogUtil:w	(Ljava/lang/String;)V
    //   109: aload_0
    //   110: ifnull +7 -> 117
    //   113: aload_0
    //   114: invokevirtual 387	java/io/InputStream:close	()V
    //   117: iconst_0
    //   118: ifeq +66 -> 184
    //   121: new 389	java/lang/NullPointerException
    //   124: dup
    //   125: invokespecial 390	java/lang/NullPointerException:<init>	()V
    //   128: athrow
    //   129: astore_0
    //   130: aload_0
    //   131: invokevirtual 401	java/io/IOException:printStackTrace	()V
    //   134: aconst_null
    //   135: areturn
    //   136: astore_0
    //   137: aconst_null
    //   138: astore_1
    //   139: aload_1
    //   140: ifnull +7 -> 147
    //   143: aload_1
    //   144: invokevirtual 387	java/io/InputStream:close	()V
    //   147: iconst_0
    //   148: ifeq +11 -> 159
    //   151: new 389	java/lang/NullPointerException
    //   154: dup
    //   155: invokespecial 390	java/lang/NullPointerException:<init>	()V
    //   158: athrow
    //   159: aload_0
    //   160: athrow
    //   161: astore_1
    //   162: aload_1
    //   163: invokevirtual 401	java/io/IOException:printStackTrace	()V
    //   166: goto -7 -> 159
    //   169: astore_0
    //   170: aload_0
    //   171: invokevirtual 401	java/io/IOException:printStackTrace	()V
    //   174: aload_1
    //   175: areturn
    //   176: astore_0
    //   177: goto -38 -> 139
    //   180: astore_2
    //   181: goto -97 -> 84
    //   184: aconst_null
    //   185: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	186	0	paramActivity	Activity
    //   0	186	1	paramString	String
    //   43	2	2	localBitmap	Bitmap
    //   81	16	2	localException1	Exception
    //   180	1	2	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   0	33	81	java/lang/Exception
    //   113	117	129	java/io/IOException
    //   121	129	129	java/io/IOException
    //   0	33	136	finally
    //   143	147	161	java/io/IOException
    //   151	159	161	java/io/IOException
    //   50	54	169	java/io/IOException
    //   58	66	169	java/io/IOException
    //   39	44	176	finally
    //   70	76	176	finally
    //   86	109	176	finally
    //   39	44	180	java/lang/Exception
    //   70	76	180	java/lang/Exception
  }
  
  public static void releaseBitmap(List<Bitmap> paramList)
  {
    int i;
    if (paramList != null) {
      i = 0;
    }
    for (;;)
    {
      if (i >= paramList.size())
      {
        paramList.clear();
        return;
      }
      if ((paramList.get(i) != null) && (!((Bitmap)paramList.get(i)).isRecycled())) {
        ((Bitmap)paramList.get(i)).recycle();
      }
      i += 1;
    }
  }
  
  public static void releaseBitmap(Bitmap... paramVarArgs)
  {
    int i;
    if (paramVarArgs != null) {
      i = 0;
    }
    for (;;)
    {
      if (i >= paramVarArgs.length) {
        return;
      }
      if ((paramVarArgs[i] != null) && (!paramVarArgs[i].isRecycled()))
      {
        paramVarArgs[i].recycle();
        paramVarArgs[i] = null;
      }
      i += 1;
    }
  }
  
  public static void savePhotoToCache(Context paramContext, Bitmap paramBitmap, String paramString)
  {
    Context localContext2 = null;
    Object localObject = null;
    Context localContext1 = null;
    try
    {
      paramContext = paramContext.openFileOutput(paramString, 0);
      if (paramBitmap != null)
      {
        localContext1 = paramContext;
        localContext2 = paramContext;
        localObject = paramContext;
        if (paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, paramContext))
        {
          localContext1 = paramContext;
          localContext2 = paramContext;
          localObject = paramContext;
          paramContext.flush();
        }
      }
      return;
    }
    catch (FileNotFoundException paramContext)
    {
      paramContext = paramContext;
      localObject = localContext1;
      paramContext.printStackTrace();
      try
      {
        localContext1.close();
        return;
      }
      catch (IOException paramContext)
      {
        paramContext.printStackTrace();
        return;
      }
    }
    catch (IOException paramContext)
    {
      localObject = localContext2;
      paramContext.printStackTrace();
      try
      {
        localContext2.close();
        return;
      }
      catch (IOException paramContext)
      {
        paramContext.printStackTrace();
        return;
      }
    }
    finally
    {
      try
      {
        ((FileOutputStream)localObject).close();
        throw paramContext;
      }
      catch (IOException paramBitmap)
      {
        for (;;)
        {
          paramBitmap.printStackTrace();
        }
      }
    }
  }
  
  /* Error */
  public static void savePhotoToSDCard(Bitmap paramBitmap, String paramString)
  {
    // Byte code:
    //   0: invokestatic 254	com/kwl/common/utils/BitmapUtils:checkSDCardAvailable	()Z
    //   3: ifeq +82 -> 85
    //   6: new 25	java/io/File
    //   9: dup
    //   10: aload_1
    //   11: iconst_0
    //   12: aload_1
    //   13: ldc_w 325
    //   16: invokevirtual 448	java/lang/String:lastIndexOf	(Ljava/lang/String;)I
    //   19: invokevirtual 452	java/lang/String:substring	(II)Ljava/lang/String;
    //   22: invokespecial 255	java/io/File:<init>	(Ljava/lang/String;)V
    //   25: astore_2
    //   26: aload_2
    //   27: invokevirtual 302	java/io/File:exists	()Z
    //   30: ifne +8 -> 38
    //   33: aload_2
    //   34: invokevirtual 455	java/io/File:mkdirs	()Z
    //   37: pop
    //   38: new 25	java/io/File
    //   41: dup
    //   42: aload_1
    //   43: invokespecial 255	java/io/File:<init>	(Ljava/lang/String;)V
    //   46: astore_3
    //   47: new 437	java/io/FileOutputStream
    //   50: dup
    //   51: aload_3
    //   52: invokespecial 456	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   55: astore_2
    //   56: aload_0
    //   57: ifnull +24 -> 81
    //   60: aload_2
    //   61: astore_1
    //   62: aload_0
    //   63: getstatic 435	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   66: bipush 100
    //   68: aload_2
    //   69: invokevirtual 79	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   72: ifeq +9 -> 81
    //   75: aload_2
    //   76: astore_1
    //   77: aload_2
    //   78: invokevirtual 440	java/io/FileOutputStream:flush	()V
    //   81: aload_2
    //   82: invokevirtual 441	java/io/FileOutputStream:close	()V
    //   85: return
    //   86: astore_0
    //   87: aconst_null
    //   88: astore_2
    //   89: aload_2
    //   90: astore_1
    //   91: aload_3
    //   92: invokevirtual 262	java/io/File:delete	()Z
    //   95: pop
    //   96: aload_2
    //   97: astore_1
    //   98: aload_0
    //   99: invokevirtual 442	java/io/FileNotFoundException:printStackTrace	()V
    //   102: aload_2
    //   103: invokevirtual 441	java/io/FileOutputStream:close	()V
    //   106: return
    //   107: astore_0
    //   108: aload_0
    //   109: invokevirtual 401	java/io/IOException:printStackTrace	()V
    //   112: return
    //   113: astore_0
    //   114: aconst_null
    //   115: astore_2
    //   116: aload_2
    //   117: astore_1
    //   118: aload_3
    //   119: invokevirtual 262	java/io/File:delete	()Z
    //   122: pop
    //   123: aload_2
    //   124: astore_1
    //   125: aload_0
    //   126: invokevirtual 401	java/io/IOException:printStackTrace	()V
    //   129: aload_2
    //   130: invokevirtual 441	java/io/FileOutputStream:close	()V
    //   133: return
    //   134: astore_0
    //   135: aload_0
    //   136: invokevirtual 401	java/io/IOException:printStackTrace	()V
    //   139: return
    //   140: astore_0
    //   141: aconst_null
    //   142: astore_1
    //   143: aload_1
    //   144: invokevirtual 441	java/io/FileOutputStream:close	()V
    //   147: aload_0
    //   148: athrow
    //   149: astore_1
    //   150: aload_1
    //   151: invokevirtual 401	java/io/IOException:printStackTrace	()V
    //   154: goto -7 -> 147
    //   157: astore_0
    //   158: aload_0
    //   159: invokevirtual 401	java/io/IOException:printStackTrace	()V
    //   162: return
    //   163: astore_0
    //   164: goto -21 -> 143
    //   167: astore_0
    //   168: goto -52 -> 116
    //   171: astore_0
    //   172: goto -83 -> 89
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	175	0	paramBitmap	Bitmap
    //   0	175	1	paramString	String
    //   25	105	2	localObject	Object
    //   46	73	3	localFile	File
    // Exception table:
    //   from	to	target	type
    //   47	56	86	java/io/FileNotFoundException
    //   102	106	107	java/io/IOException
    //   47	56	113	java/io/IOException
    //   129	133	134	java/io/IOException
    //   47	56	140	finally
    //   143	147	149	java/io/IOException
    //   81	85	157	java/io/IOException
    //   62	75	163	finally
    //   77	81	163	finally
    //   91	96	163	finally
    //   98	102	163	finally
    //   118	123	163	finally
    //   125	129	163	finally
    //   62	75	167	java/io/IOException
    //   77	81	167	java/io/IOException
    //   62	75	171	java/io/FileNotFoundException
    //   77	81	171	java/io/FileNotFoundException
  }
  
  public static Bitmap zoomBitmap(Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    int i = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    Matrix localMatrix = new Matrix();
    localMatrix.postScale(paramInt1 / i, paramInt2 / j);
    return Bitmap.createBitmap(paramBitmap, 0, 0, i, j, localMatrix, true);
  }
  
  public static Drawable zoomDrawable(Drawable paramDrawable, int paramInt1, int paramInt2)
  {
    int i = paramDrawable.getIntrinsicWidth();
    int j = paramDrawable.getIntrinsicHeight();
    paramDrawable = drawableToBitmap(paramDrawable);
    Matrix localMatrix = new Matrix();
    localMatrix.postScale(paramInt1 / i, paramInt2 / j);
    return new BitmapDrawable(Bitmap.createBitmap(paramDrawable, 0, 0, i, j, localMatrix, true));
  }
  
  public byte[] Bitmap2Bytes(Bitmap paramBitmap)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, localByteArrayOutputStream);
    return localByteArrayOutputStream.toByteArray();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwl\common\utils\BitmapUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */