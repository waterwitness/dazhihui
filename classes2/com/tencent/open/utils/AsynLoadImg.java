package com.tencent.open.utils;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.os.Handler;
import com.tencent.open.a.f;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class AsynLoadImg
{
  private static String c;
  private String a;
  private AsynLoadImgBack b;
  private long d;
  private Handler e;
  private Runnable f = new AsynLoadImg.2(this);
  
  public AsynLoadImg(Activity paramActivity)
  {
    this.e = new AsynLoadImg.1(this, paramActivity.getMainLooper());
  }
  
  public static Bitmap getbitmap(String paramString)
  {
    f.a("AsynLoadImg", "getbitmap:" + paramString);
    try
    {
      Object localObject = (HttpURLConnection)new URL(paramString).openConnection();
      ((HttpURLConnection)localObject).setDoInput(true);
      ((HttpURLConnection)localObject).connect();
      localObject = ((HttpURLConnection)localObject).getInputStream();
      Bitmap localBitmap = BitmapFactory.decodeStream((InputStream)localObject);
      ((InputStream)localObject).close();
      f.a("AsynLoadImg", "image download finished." + paramString);
      return localBitmap;
    }
    catch (OutOfMemoryError paramString)
    {
      paramString.printStackTrace();
      f.a("AsynLoadImg", "getbitmap bmp fail---");
      return null;
    }
    catch (IOException paramString)
    {
      paramString.printStackTrace();
      f.a("AsynLoadImg", "getbitmap bmp fail---");
    }
    return null;
  }
  
  public void save(String paramString, AsynLoadImgBack paramAsynLoadImgBack)
  {
    f.a("AsynLoadImg", "--save---");
    if ((paramString == null) || (paramString.equals("")))
    {
      paramAsynLoadImgBack.saved(1, null);
      return;
    }
    if (!Util.hasSDCard())
    {
      paramAsynLoadImgBack.saved(2, null);
      return;
    }
    c = Environment.getExternalStorageDirectory() + "/tmp/";
    this.d = System.currentTimeMillis();
    this.a = paramString;
    this.b = paramAsynLoadImgBack;
    new Thread(this.f).start();
  }
  
  /* Error */
  public boolean saveFile(Bitmap paramBitmap, String paramString)
  {
    // Byte code:
    //   0: getstatic 47	com/tencent/open/utils/AsynLoadImg:c	Ljava/lang/String;
    //   3: astore 6
    //   5: aconst_null
    //   6: astore 5
    //   8: aconst_null
    //   9: astore 4
    //   11: aload 5
    //   13: astore_3
    //   14: new 173	java/io/File
    //   17: dup
    //   18: aload 6
    //   20: invokespecial 174	java/io/File:<init>	(Ljava/lang/String;)V
    //   23: astore 7
    //   25: aload 5
    //   27: astore_3
    //   28: aload 7
    //   30: invokevirtual 177	java/io/File:exists	()Z
    //   33: ifne +12 -> 45
    //   36: aload 5
    //   38: astore_3
    //   39: aload 7
    //   41: invokevirtual 180	java/io/File:mkdir	()Z
    //   44: pop
    //   45: aload 5
    //   47: astore_3
    //   48: new 64	java/lang/StringBuilder
    //   51: dup
    //   52: invokespecial 65	java/lang/StringBuilder:<init>	()V
    //   55: aload 6
    //   57: invokevirtual 71	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   60: aload_2
    //   61: invokevirtual 71	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   64: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   67: astore 6
    //   69: aload 5
    //   71: astore_3
    //   72: ldc 62
    //   74: new 64	java/lang/StringBuilder
    //   77: dup
    //   78: invokespecial 65	java/lang/StringBuilder:<init>	()V
    //   81: ldc -74
    //   83: invokevirtual 71	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   86: aload_2
    //   87: invokevirtual 71	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   90: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   93: invokestatic 79	com/tencent/open/a/f:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   96: aload 5
    //   98: astore_3
    //   99: new 184	java/io/BufferedOutputStream
    //   102: dup
    //   103: new 186	java/io/FileOutputStream
    //   106: dup
    //   107: new 173	java/io/File
    //   110: dup
    //   111: aload 6
    //   113: invokespecial 174	java/io/File:<init>	(Ljava/lang/String;)V
    //   116: invokespecial 189	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   119: invokespecial 192	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   122: astore_2
    //   123: aload_1
    //   124: getstatic 198	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   127: bipush 80
    //   129: aload_2
    //   130: invokevirtual 204	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   133: pop
    //   134: aload_2
    //   135: invokevirtual 207	java/io/BufferedOutputStream:flush	()V
    //   138: aload_2
    //   139: ifnull +7 -> 146
    //   142: aload_2
    //   143: invokevirtual 208	java/io/BufferedOutputStream:close	()V
    //   146: iconst_1
    //   147: istore 8
    //   149: iload 8
    //   151: ireturn
    //   152: astore_1
    //   153: aload_1
    //   154: invokevirtual 120	java/io/IOException:printStackTrace	()V
    //   157: goto -11 -> 146
    //   160: astore_2
    //   161: aload 4
    //   163: astore_1
    //   164: aload_1
    //   165: astore_3
    //   166: aload_2
    //   167: invokevirtual 120	java/io/IOException:printStackTrace	()V
    //   170: aload_1
    //   171: astore_3
    //   172: ldc 62
    //   174: ldc -46
    //   176: aload_2
    //   177: invokestatic 213	com/tencent/open/a/f:b	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   180: iconst_0
    //   181: istore 8
    //   183: aload_1
    //   184: ifnull -35 -> 149
    //   187: aload_1
    //   188: invokevirtual 208	java/io/BufferedOutputStream:close	()V
    //   191: iconst_0
    //   192: ireturn
    //   193: astore_1
    //   194: aload_1
    //   195: invokevirtual 120	java/io/IOException:printStackTrace	()V
    //   198: iconst_0
    //   199: ireturn
    //   200: astore_1
    //   201: aload_3
    //   202: ifnull +7 -> 209
    //   205: aload_3
    //   206: invokevirtual 208	java/io/BufferedOutputStream:close	()V
    //   209: aload_1
    //   210: athrow
    //   211: astore_2
    //   212: aload_2
    //   213: invokevirtual 120	java/io/IOException:printStackTrace	()V
    //   216: goto -7 -> 209
    //   219: astore_1
    //   220: aload_2
    //   221: astore_3
    //   222: goto -21 -> 201
    //   225: astore_3
    //   226: aload_2
    //   227: astore_1
    //   228: aload_3
    //   229: astore_2
    //   230: goto -66 -> 164
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	233	0	this	AsynLoadImg
    //   0	233	1	paramBitmap	Bitmap
    //   0	233	2	paramString	String
    //   13	209	3	localObject1	Object
    //   225	4	3	localIOException	IOException
    //   9	153	4	localObject2	Object
    //   6	91	5	localObject3	Object
    //   3	109	6	str	String
    //   23	17	7	localFile	java.io.File
    //   147	35	8	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   142	146	152	java/io/IOException
    //   14	25	160	java/io/IOException
    //   28	36	160	java/io/IOException
    //   39	45	160	java/io/IOException
    //   48	69	160	java/io/IOException
    //   72	96	160	java/io/IOException
    //   99	123	160	java/io/IOException
    //   187	191	193	java/io/IOException
    //   14	25	200	finally
    //   28	36	200	finally
    //   39	45	200	finally
    //   48	69	200	finally
    //   72	96	200	finally
    //   99	123	200	finally
    //   166	170	200	finally
    //   172	180	200	finally
    //   205	209	211	java/io/IOException
    //   123	138	219	finally
    //   123	138	225	java/io/IOException
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\open\utils\AsynLoadImg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */