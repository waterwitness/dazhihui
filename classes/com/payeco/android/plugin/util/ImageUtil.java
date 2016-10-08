package com.payeco.android.plugin.util;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.os.Environment;
import android.text.TextUtils;
import com.payeco.android.plugin.http.encryption.Base64;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

public class ImageUtil
{
  public static final int OPTIONS_RECYCLE_INPUT = 2;
  
  public static String bitmaptoString(Bitmap paramBitmap)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, localByteArrayOutputStream);
    return Base64.encodeLines(localByteArrayOutputStream.toByteArray()).replaceAll("\t|\r|\n", "");
  }
  
  public static String bitmaptoString(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {}
    do
    {
      do
      {
        return null;
      } while (!Environment.getExternalStorageState().equals("mounted"));
      paramString = readStream(Environment.getExternalStorageDirectory().getPath() + paramString);
    } while ((paramString == null) || (paramString.length <= 0));
    return Base64.encodeLines(paramString).replaceAll("\t|\r|\n", "");
  }
  
  public static void deleteFile(String paramString)
  {
    if (Environment.getExternalStorageState().equals("mounted"))
    {
      paramString = new File(Environment.getExternalStorageDirectory().getPath() + paramString);
      if (paramString.exists()) {
        paramString.delete();
      }
    }
  }
  
  public static Bitmap extractThumbnail(Bitmap paramBitmap, int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject1;
    if (paramBitmap == null)
    {
      localObject1 = null;
      return (Bitmap)localObject1;
    }
    label31:
    int i;
    if (paramBitmap.getWidth() < paramBitmap.getHeight())
    {
      f1 = paramInt1 / paramBitmap.getWidth();
      localObject1 = new Matrix();
      ((Matrix)localObject1).setScale(f1, f1);
      paramInt3 |= 0x1;
      if ((paramInt3 & 0x1) == 0) {
        break label255;
      }
      i = 1;
      label62:
      if ((paramInt3 & 0x2) == 0) {
        break label261;
      }
    }
    int j;
    Object localObject2;
    label255:
    label261:
    for (paramInt3 = 1;; paramInt3 = 0)
    {
      int k = paramBitmap.getWidth() - paramInt1;
      j = paramBitmap.getHeight() - paramInt2;
      if ((i != 0) || ((k >= 0) && (j >= 0))) {
        break label266;
      }
      localBitmap = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
      localObject1 = new Canvas(localBitmap);
      i = Math.max(0, k / 2);
      j = Math.max(0, j / 2);
      localObject2 = new Rect(i, j, Math.min(paramInt1, paramBitmap.getWidth()) + i, Math.min(paramInt2, paramBitmap.getHeight()) + j);
      i = (paramInt1 - ((Rect)localObject2).width()) / 2;
      j = (paramInt2 - ((Rect)localObject2).height()) / 2;
      ((Canvas)localObject1).drawBitmap(paramBitmap, (Rect)localObject2, new Rect(i, j, paramInt1 - i, paramInt2 - j), null);
      localObject1 = localBitmap;
      if (paramInt3 == 0) {
        break;
      }
      paramBitmap.recycle();
      return localBitmap;
      f1 = paramInt2 / paramBitmap.getHeight();
      break label31;
      i = 0;
      break label62;
    }
    label266:
    float f1 = paramBitmap.getWidth();
    float f2 = paramBitmap.getHeight();
    if (f1 / f2 > paramInt1 / paramInt2)
    {
      f1 = paramInt2 / f2;
      if ((f1 < 0.9F) || (f1 > 1.0F))
      {
        ((Matrix)localObject1).setScale(f1, f1);
        label325:
        if (localObject1 == null) {
          break label485;
        }
      }
    }
    label485:
    for (Bitmap localBitmap = Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight(), (Matrix)localObject1, true);; localBitmap = paramBitmap)
    {
      if ((paramInt3 != 0) && (localBitmap != paramBitmap)) {
        paramBitmap.recycle();
      }
      i = Math.max(0, localBitmap.getWidth() - paramInt1);
      j = Math.max(0, localBitmap.getHeight() - paramInt2);
      localObject2 = Bitmap.createBitmap(localBitmap, i / 2, j / 2, paramInt1, paramInt2);
      localObject1 = localObject2;
      if (localObject2 == localBitmap) {
        break;
      }
      if (paramInt3 == 0)
      {
        localObject1 = localObject2;
        if (localBitmap == paramBitmap) {
          break;
        }
      }
      localBitmap.recycle();
      return (Bitmap)localObject2;
      localObject1 = null;
      break label325;
      f1 = paramInt1 / f1;
      if ((f1 < 0.9F) || (f1 > 1.0F))
      {
        ((Matrix)localObject1).setScale(f1, f1);
        break label325;
      }
      localObject1 = null;
      break label325;
    }
  }
  
  public static int readPictureDegree(String paramString)
  {
    try
    {
      int i = new ExifInterface(paramString).getAttributeInt("Orientation", 1);
      switch (i)
      {
      case 4: 
      case 5: 
      case 7: 
      default: 
        return 0;
      case 6: 
        return 90;
      case 3: 
        return 180;
      }
      return 270;
    }
    catch (IOException paramString)
    {
      paramString.printStackTrace();
    }
    return 0;
  }
  
  /* Error */
  public static byte[] readStream(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aconst_null
    //   4: astore_1
    //   5: new 76	java/io/File
    //   8: dup
    //   9: aload_0
    //   10: invokespecial 99	java/io/File:<init>	(Ljava/lang/String;)V
    //   13: astore_2
    //   14: aload_2
    //   15: invokevirtual 103	java/io/File:exists	()Z
    //   18: ifeq +207 -> 225
    //   21: new 191	java/io/FileInputStream
    //   24: dup
    //   25: aload_2
    //   26: invokespecial 194	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   29: astore_0
    //   30: aload_2
    //   31: invokevirtual 198	java/io/File:length	()J
    //   34: l2i
    //   35: newarray <illegal type>
    //   37: astore 4
    //   39: new 16	java/io/ByteArrayOutputStream
    //   42: dup
    //   43: invokespecial 17	java/io/ByteArrayOutputStream:<init>	()V
    //   46: astore_1
    //   47: aload_1
    //   48: astore_3
    //   49: aload_0
    //   50: astore_2
    //   51: aload_0
    //   52: aload 4
    //   54: invokevirtual 202	java/io/FileInputStream:read	([B)I
    //   57: istore 6
    //   59: iload 6
    //   61: iconst_m1
    //   62: if_icmpne +42 -> 104
    //   65: aload_1
    //   66: astore_3
    //   67: aload_0
    //   68: astore_2
    //   69: aload_1
    //   70: invokevirtual 33	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   73: astore 4
    //   75: aload 4
    //   77: astore_3
    //   78: aload_0
    //   79: astore_2
    //   80: aload_3
    //   81: astore_0
    //   82: aload_1
    //   83: ifnull +7 -> 90
    //   86: aload_1
    //   87: invokevirtual 205	java/io/ByteArrayOutputStream:close	()V
    //   90: aload_0
    //   91: astore_1
    //   92: aload_2
    //   93: ifnull +9 -> 102
    //   96: aload_2
    //   97: invokevirtual 206	java/io/FileInputStream:close	()V
    //   100: aload_0
    //   101: astore_1
    //   102: aload_1
    //   103: areturn
    //   104: aload_1
    //   105: astore_3
    //   106: aload_0
    //   107: astore_2
    //   108: aload_1
    //   109: aload 4
    //   111: iconst_0
    //   112: iload 6
    //   114: invokevirtual 210	java/io/ByteArrayOutputStream:write	([BII)V
    //   117: goto -70 -> 47
    //   120: astore 4
    //   122: aload_1
    //   123: astore_3
    //   124: aload_0
    //   125: astore_2
    //   126: aload 4
    //   128: invokevirtual 211	java/lang/Exception:printStackTrace	()V
    //   131: aload_1
    //   132: ifnull +7 -> 139
    //   135: aload_1
    //   136: invokevirtual 205	java/io/ByteArrayOutputStream:close	()V
    //   139: aload 5
    //   141: astore_1
    //   142: aload_0
    //   143: ifnull -41 -> 102
    //   146: aload_0
    //   147: invokevirtual 206	java/io/FileInputStream:close	()V
    //   150: aconst_null
    //   151: areturn
    //   152: astore_0
    //   153: aload_0
    //   154: invokevirtual 187	java/io/IOException:printStackTrace	()V
    //   157: aconst_null
    //   158: areturn
    //   159: astore_1
    //   160: aconst_null
    //   161: astore_3
    //   162: aconst_null
    //   163: astore_0
    //   164: aload_3
    //   165: ifnull +7 -> 172
    //   168: aload_3
    //   169: invokevirtual 205	java/io/ByteArrayOutputStream:close	()V
    //   172: aload_0
    //   173: ifnull +7 -> 180
    //   176: aload_0
    //   177: invokevirtual 206	java/io/FileInputStream:close	()V
    //   180: aload_1
    //   181: athrow
    //   182: astore_0
    //   183: aload_0
    //   184: invokevirtual 187	java/io/IOException:printStackTrace	()V
    //   187: goto -7 -> 180
    //   190: astore_1
    //   191: aload_1
    //   192: invokevirtual 187	java/io/IOException:printStackTrace	()V
    //   195: aload_0
    //   196: areturn
    //   197: astore_1
    //   198: aconst_null
    //   199: astore_3
    //   200: goto -36 -> 164
    //   203: astore_1
    //   204: aload_2
    //   205: astore_0
    //   206: goto -42 -> 164
    //   209: astore 4
    //   211: aconst_null
    //   212: astore_1
    //   213: aconst_null
    //   214: astore_0
    //   215: goto -93 -> 122
    //   218: astore 4
    //   220: aconst_null
    //   221: astore_1
    //   222: goto -100 -> 122
    //   225: aconst_null
    //   226: astore_3
    //   227: aconst_null
    //   228: astore_2
    //   229: aload_1
    //   230: astore_0
    //   231: aload_3
    //   232: astore_1
    //   233: goto -151 -> 82
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	236	0	paramString	String
    //   4	138	1	localObject1	Object
    //   159	22	1	localObject2	Object
    //   190	2	1	localIOException	IOException
    //   197	1	1	localObject3	Object
    //   203	1	1	localObject4	Object
    //   212	21	1	localObject5	Object
    //   13	216	2	localObject6	Object
    //   48	184	3	localObject7	Object
    //   37	73	4	arrayOfByte	byte[]
    //   120	7	4	localException1	Exception
    //   209	1	4	localException2	Exception
    //   218	1	4	localException3	Exception
    //   1	139	5	localObject8	Object
    //   57	56	6	i	int
    // Exception table:
    //   from	to	target	type
    //   51	59	120	java/lang/Exception
    //   69	75	120	java/lang/Exception
    //   108	117	120	java/lang/Exception
    //   135	139	152	java/io/IOException
    //   146	150	152	java/io/IOException
    //   14	30	159	finally
    //   168	172	182	java/io/IOException
    //   176	180	182	java/io/IOException
    //   86	90	190	java/io/IOException
    //   96	100	190	java/io/IOException
    //   30	47	197	finally
    //   51	59	203	finally
    //   69	75	203	finally
    //   108	117	203	finally
    //   126	131	203	finally
    //   14	30	209	java/lang/Exception
    //   30	47	218	java/lang/Exception
  }
  
  /* Error */
  public static void savePhoto(Bitmap paramBitmap, String paramString)
  {
    // Byte code:
    //   0: invokestatic 62	android/os/Environment:getExternalStorageState	()Ljava/lang/String;
    //   3: ldc 64
    //   5: invokevirtual 68	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   8: ifeq +107 -> 115
    //   11: new 70	java/lang/StringBuilder
    //   14: dup
    //   15: invokestatic 74	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   18: invokevirtual 79	java/io/File:getPath	()Ljava/lang/String;
    //   21: invokestatic 83	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   24: invokespecial 86	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   27: aload_1
    //   28: invokevirtual 90	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   31: invokevirtual 93	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   34: astore 5
    //   36: aload_0
    //   37: ifnull +78 -> 115
    //   40: aconst_null
    //   41: astore 4
    //   43: aconst_null
    //   44: astore_2
    //   45: aconst_null
    //   46: astore_3
    //   47: new 76	java/io/File
    //   50: dup
    //   51: aload 5
    //   53: invokespecial 99	java/io/File:<init>	(Ljava/lang/String;)V
    //   56: astore 6
    //   58: aload_2
    //   59: astore_1
    //   60: aload 6
    //   62: invokevirtual 103	java/io/File:exists	()Z
    //   65: ifeq +11 -> 76
    //   68: aload_2
    //   69: astore_1
    //   70: aload 6
    //   72: invokevirtual 106	java/io/File:delete	()Z
    //   75: pop
    //   76: aload_2
    //   77: astore_1
    //   78: aload 6
    //   80: invokevirtual 218	java/io/File:createNewFile	()Z
    //   83: pop
    //   84: aload_2
    //   85: astore_1
    //   86: new 220	java/io/FileOutputStream
    //   89: dup
    //   90: aload 5
    //   92: invokespecial 221	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   95: astore_2
    //   96: aload_0
    //   97: getstatic 224	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   100: bipush 100
    //   102: aload_2
    //   103: invokevirtual 29	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   106: pop
    //   107: aload_2
    //   108: invokevirtual 227	java/io/FileOutputStream:flush	()V
    //   111: aload_2
    //   112: invokevirtual 228	java/io/FileOutputStream:close	()V
    //   115: return
    //   116: astore_2
    //   117: aload_3
    //   118: astore_0
    //   119: aload_0
    //   120: astore_1
    //   121: aload_2
    //   122: invokevirtual 229	java/io/FileNotFoundException:printStackTrace	()V
    //   125: aload_0
    //   126: ifnull -11 -> 115
    //   129: aload_0
    //   130: invokevirtual 227	java/io/FileOutputStream:flush	()V
    //   133: aload_0
    //   134: invokevirtual 228	java/io/FileOutputStream:close	()V
    //   137: return
    //   138: astore_0
    //   139: aload_0
    //   140: invokevirtual 187	java/io/IOException:printStackTrace	()V
    //   143: return
    //   144: astore_2
    //   145: aload 4
    //   147: astore_0
    //   148: aload_0
    //   149: astore_1
    //   150: aload_2
    //   151: invokevirtual 187	java/io/IOException:printStackTrace	()V
    //   154: aload_0
    //   155: ifnull -40 -> 115
    //   158: aload_0
    //   159: invokevirtual 227	java/io/FileOutputStream:flush	()V
    //   162: aload_0
    //   163: invokevirtual 228	java/io/FileOutputStream:close	()V
    //   166: return
    //   167: astore_0
    //   168: aload_0
    //   169: invokevirtual 187	java/io/IOException:printStackTrace	()V
    //   172: return
    //   173: astore_0
    //   174: aload_1
    //   175: ifnull +11 -> 186
    //   178: aload_1
    //   179: invokevirtual 227	java/io/FileOutputStream:flush	()V
    //   182: aload_1
    //   183: invokevirtual 228	java/io/FileOutputStream:close	()V
    //   186: aload_0
    //   187: athrow
    //   188: astore_1
    //   189: aload_1
    //   190: invokevirtual 187	java/io/IOException:printStackTrace	()V
    //   193: goto -7 -> 186
    //   196: astore_0
    //   197: aload_0
    //   198: invokevirtual 187	java/io/IOException:printStackTrace	()V
    //   201: return
    //   202: astore_0
    //   203: aload_2
    //   204: astore_1
    //   205: goto -31 -> 174
    //   208: astore_1
    //   209: aload_2
    //   210: astore_0
    //   211: aload_1
    //   212: astore_2
    //   213: goto -65 -> 148
    //   216: astore_1
    //   217: aload_2
    //   218: astore_0
    //   219: aload_1
    //   220: astore_2
    //   221: goto -102 -> 119
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	224	0	paramBitmap	Bitmap
    //   0	224	1	paramString	String
    //   44	68	2	localFileOutputStream	java.io.FileOutputStream
    //   116	6	2	localFileNotFoundException	java.io.FileNotFoundException
    //   144	66	2	localIOException	IOException
    //   212	9	2	str1	String
    //   46	72	3	localObject1	Object
    //   41	105	4	localObject2	Object
    //   34	57	5	str2	String
    //   56	23	6	localFile	File
    // Exception table:
    //   from	to	target	type
    //   60	68	116	java/io/FileNotFoundException
    //   70	76	116	java/io/FileNotFoundException
    //   78	84	116	java/io/FileNotFoundException
    //   86	96	116	java/io/FileNotFoundException
    //   129	137	138	java/io/IOException
    //   60	68	144	java/io/IOException
    //   70	76	144	java/io/IOException
    //   78	84	144	java/io/IOException
    //   86	96	144	java/io/IOException
    //   158	166	167	java/io/IOException
    //   60	68	173	finally
    //   70	76	173	finally
    //   78	84	173	finally
    //   86	96	173	finally
    //   121	125	173	finally
    //   150	154	173	finally
    //   178	186	188	java/io/IOException
    //   107	115	196	java/io/IOException
    //   96	107	202	finally
    //   96	107	208	java/io/IOException
    //   96	107	216	java/io/FileNotFoundException
  }
  
  public static Bitmap scalePicture(Bitmap paramBitmap, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt3 = paramBitmap.getWidth();
    paramInt4 = paramBitmap.getHeight();
    if (paramInt3 > paramInt4) {
      paramInt2 = paramInt1 * paramInt4 / paramInt3;
    }
    if (paramInt4 > paramInt3) {
      paramInt1 = paramInt3 * paramInt2 / paramInt4;
    }
    return Bitmap.createScaledBitmap(paramBitmap, paramInt1, paramInt2, true);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\util\ImageUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */