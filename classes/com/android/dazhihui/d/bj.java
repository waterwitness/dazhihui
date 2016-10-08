package com.android.dazhihui.d;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore.Images.Media;
import android.widget.Toast;
import com.android.dazhihui.c.b.c;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class bj
{
  public String a;
  private File b;
  private File c;
  private Activity d;
  private ProgressDialog e;
  private bl f;
  
  public bj(Activity paramActivity)
  {
    this.d = paramActivity;
    if (c.a())
    {
      if ((paramActivity != null) && (paramActivity.getExternalCacheDir() != null) && (paramActivity.getExternalCacheDir().getAbsolutePath() != null)) {}
    }
    else {
      while ((paramActivity == null) || (paramActivity.getCacheDir() == null) || (paramActivity.getCacheDir().getAbsolutePath() == null)) {
        return;
      }
    }
    if (c.a()) {}
    for (paramActivity = paramActivity.getExternalCacheDir().getAbsolutePath();; paramActivity = paramActivity.getCacheDir().getAbsolutePath())
    {
      this.c = new File(paramActivity + File.separator + "CropPhoto.jpg");
      a(this.c);
      return;
    }
  }
  
  private String a()
  {
    Date localDate = new Date(System.currentTimeMillis());
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("'IMG'_yyyyMMdd_HHmmss", Locale.getDefault());
    return localSimpleDateFormat.format(localDate) + ".jpg";
  }
  
  private void a(File paramFile)
  {
    paramFile = new File(paramFile.getParent());
    if (!paramFile.exists()) {
      paramFile.mkdirs();
    }
  }
  
  /* Error */
  private boolean b(String paramString)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 10
    //   3: aconst_null
    //   4: astore 6
    //   6: aconst_null
    //   7: astore_2
    //   8: new 121	java/net/URL
    //   11: dup
    //   12: aload_1
    //   13: invokespecial 122	java/net/URL:<init>	(Ljava/lang/String;)V
    //   16: invokevirtual 126	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   19: checkcast 128	java/net/HttpURLConnection
    //   22: astore_1
    //   23: aload_1
    //   24: iconst_1
    //   25: invokevirtual 132	java/net/HttpURLConnection:setDoInput	(Z)V
    //   28: aload_1
    //   29: iconst_1
    //   30: invokevirtual 135	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   33: aload_1
    //   34: ldc -119
    //   36: invokevirtual 140	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   39: aload_1
    //   40: sipush 10000
    //   43: invokevirtual 144	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   46: aload_1
    //   47: sipush 10000
    //   50: invokevirtual 147	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   53: aload_1
    //   54: invokevirtual 151	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   57: astore_3
    //   58: bipush 100
    //   60: newarray <illegal type>
    //   62: astore 4
    //   64: new 153	java/io/FileInputStream
    //   67: dup
    //   68: aload_0
    //   69: getfield 62	com/android/dazhihui/d/bj:c	Ljava/io/File;
    //   72: invokespecial 155	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   75: astore 5
    //   77: aload 5
    //   79: aload 4
    //   81: invokevirtual 159	java/io/FileInputStream:read	([B)I
    //   84: istore 9
    //   86: iload 9
    //   88: iconst_m1
    //   89: if_icmpeq +91 -> 180
    //   92: aload_3
    //   93: aload 4
    //   95: iconst_0
    //   96: iload 9
    //   98: invokevirtual 165	java/io/OutputStream:write	([BII)V
    //   101: goto -24 -> 77
    //   104: astore 7
    //   106: aconst_null
    //   107: astore_2
    //   108: aconst_null
    //   109: astore 8
    //   111: aload_1
    //   112: astore 4
    //   114: aload 5
    //   116: astore 6
    //   118: aload 8
    //   120: astore_1
    //   121: aload 7
    //   123: astore 5
    //   125: aload 5
    //   127: invokevirtual 168	java/lang/Exception:printStackTrace	()V
    //   130: aload_1
    //   131: ifnull +7 -> 138
    //   134: aload_1
    //   135: invokevirtual 173	java/io/ByteArrayOutputStream:close	()V
    //   138: aload 6
    //   140: ifnull +8 -> 148
    //   143: aload 6
    //   145: invokevirtual 174	java/io/FileInputStream:close	()V
    //   148: aload_2
    //   149: ifnull +7 -> 156
    //   152: aload_2
    //   153: invokevirtual 177	java/io/InputStream:close	()V
    //   156: aload_3
    //   157: ifnull +7 -> 164
    //   160: aload_3
    //   161: invokevirtual 178	java/io/OutputStream:close	()V
    //   164: aload 4
    //   166: ifnull +8 -> 174
    //   169: aload 4
    //   171: invokevirtual 181	java/net/HttpURLConnection:disconnect	()V
    //   174: iconst_0
    //   175: istore 11
    //   177: iload 11
    //   179: ireturn
    //   180: aload_3
    //   181: invokevirtual 184	java/io/OutputStream:flush	()V
    //   184: aload_3
    //   185: invokevirtual 178	java/io/OutputStream:close	()V
    //   188: aload_1
    //   189: invokevirtual 188	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   192: astore 4
    //   194: new 170	java/io/ByteArrayOutputStream
    //   197: dup
    //   198: invokespecial 189	java/io/ByteArrayOutputStream:<init>	()V
    //   201: astore_2
    //   202: aload 4
    //   204: invokevirtual 192	java/io/InputStream:read	()I
    //   207: istore 9
    //   209: iload 9
    //   211: iconst_m1
    //   212: if_icmpeq +12 -> 224
    //   215: aload_2
    //   216: iload 9
    //   218: invokevirtual 194	java/io/ByteArrayOutputStream:write	(I)V
    //   221: goto -19 -> 202
    //   224: aload_2
    //   225: invokevirtual 195	java/io/ByteArrayOutputStream:toString	()Ljava/lang/String;
    //   228: ldc -59
    //   230: invokevirtual 203	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   233: istore 11
    //   235: iload 11
    //   237: ifeq +347 -> 584
    //   240: aload_2
    //   241: ifnull +7 -> 248
    //   244: aload_2
    //   245: invokevirtual 173	java/io/ByteArrayOutputStream:close	()V
    //   248: aload 5
    //   250: ifnull +8 -> 258
    //   253: aload 5
    //   255: invokevirtual 174	java/io/FileInputStream:close	()V
    //   258: aload 4
    //   260: ifnull +8 -> 268
    //   263: aload 4
    //   265: invokevirtual 177	java/io/InputStream:close	()V
    //   268: aload_3
    //   269: ifnull +7 -> 276
    //   272: aload_3
    //   273: invokevirtual 178	java/io/OutputStream:close	()V
    //   276: iload 10
    //   278: istore 11
    //   280: aload_1
    //   281: ifnull -104 -> 177
    //   284: aload_1
    //   285: invokevirtual 181	java/net/HttpURLConnection:disconnect	()V
    //   288: iload 10
    //   290: ireturn
    //   291: astore_1
    //   292: aconst_null
    //   293: astore 5
    //   295: aconst_null
    //   296: astore 4
    //   298: aconst_null
    //   299: astore_3
    //   300: aconst_null
    //   301: astore_2
    //   302: aload 6
    //   304: ifnull +8 -> 312
    //   307: aload 6
    //   309: invokevirtual 173	java/io/ByteArrayOutputStream:close	()V
    //   312: aload 5
    //   314: ifnull +8 -> 322
    //   317: aload 5
    //   319: invokevirtual 174	java/io/FileInputStream:close	()V
    //   322: aload 4
    //   324: ifnull +8 -> 332
    //   327: aload 4
    //   329: invokevirtual 177	java/io/InputStream:close	()V
    //   332: aload_3
    //   333: ifnull +7 -> 340
    //   336: aload_3
    //   337: invokevirtual 178	java/io/OutputStream:close	()V
    //   340: aload_2
    //   341: ifnull +7 -> 348
    //   344: aload_2
    //   345: invokevirtual 181	java/net/HttpURLConnection:disconnect	()V
    //   348: aload_1
    //   349: athrow
    //   350: astore_2
    //   351: goto -103 -> 248
    //   354: astore_2
    //   355: goto -97 -> 258
    //   358: astore_2
    //   359: goto -91 -> 268
    //   362: astore_2
    //   363: goto -87 -> 276
    //   366: astore_1
    //   367: goto -229 -> 138
    //   370: astore_1
    //   371: goto -223 -> 148
    //   374: astore_1
    //   375: goto -219 -> 156
    //   378: astore_1
    //   379: goto -215 -> 164
    //   382: astore 6
    //   384: goto -72 -> 312
    //   387: astore 5
    //   389: goto -67 -> 322
    //   392: astore 4
    //   394: goto -62 -> 332
    //   397: astore_3
    //   398: goto -58 -> 340
    //   401: astore 7
    //   403: aconst_null
    //   404: astore 5
    //   406: aconst_null
    //   407: astore 4
    //   409: aconst_null
    //   410: astore_3
    //   411: aload_1
    //   412: astore_2
    //   413: aload 7
    //   415: astore_1
    //   416: goto -114 -> 302
    //   419: astore 7
    //   421: aconst_null
    //   422: astore 5
    //   424: aconst_null
    //   425: astore 4
    //   427: aload_1
    //   428: astore_2
    //   429: aload 7
    //   431: astore_1
    //   432: goto -130 -> 302
    //   435: astore 7
    //   437: aconst_null
    //   438: astore 4
    //   440: aload_1
    //   441: astore_2
    //   442: aload 7
    //   444: astore_1
    //   445: goto -143 -> 302
    //   448: astore 7
    //   450: aload_1
    //   451: astore_2
    //   452: aload 7
    //   454: astore_1
    //   455: goto -153 -> 302
    //   458: astore 7
    //   460: aload_2
    //   461: astore 6
    //   463: aload_1
    //   464: astore_2
    //   465: aload 7
    //   467: astore_1
    //   468: goto -166 -> 302
    //   471: astore 8
    //   473: aload 6
    //   475: astore 5
    //   477: aload_1
    //   478: astore 6
    //   480: aload 4
    //   482: astore 7
    //   484: aload_2
    //   485: astore 4
    //   487: aload 8
    //   489: astore_1
    //   490: aload 7
    //   492: astore_2
    //   493: goto -191 -> 302
    //   496: astore 5
    //   498: aconst_null
    //   499: astore_1
    //   500: aconst_null
    //   501: astore 7
    //   503: aconst_null
    //   504: astore_3
    //   505: aconst_null
    //   506: astore 4
    //   508: aload_2
    //   509: astore 6
    //   511: aload 7
    //   513: astore_2
    //   514: goto -389 -> 125
    //   517: astore 5
    //   519: aconst_null
    //   520: astore 7
    //   522: aconst_null
    //   523: astore_3
    //   524: aload_1
    //   525: astore 4
    //   527: aconst_null
    //   528: astore_1
    //   529: aload_2
    //   530: astore 6
    //   532: aload 7
    //   534: astore_2
    //   535: goto -410 -> 125
    //   538: astore 5
    //   540: aconst_null
    //   541: astore 7
    //   543: aload_1
    //   544: astore 4
    //   546: aconst_null
    //   547: astore_1
    //   548: aload_2
    //   549: astore 6
    //   551: aload 7
    //   553: astore_2
    //   554: goto -429 -> 125
    //   557: astore 6
    //   559: aload 4
    //   561: astore_2
    //   562: aload_1
    //   563: astore 4
    //   565: aload 6
    //   567: astore_1
    //   568: aconst_null
    //   569: astore 7
    //   571: aload 5
    //   573: astore 6
    //   575: aload_1
    //   576: astore 5
    //   578: aload 7
    //   580: astore_1
    //   581: goto -456 -> 125
    //   584: iconst_0
    //   585: istore 10
    //   587: goto -347 -> 240
    //   590: astore 8
    //   592: aload 5
    //   594: astore 6
    //   596: aload_2
    //   597: astore 7
    //   599: aload 4
    //   601: astore_2
    //   602: aload_1
    //   603: astore 4
    //   605: aload 8
    //   607: astore 5
    //   609: aload 7
    //   611: astore_1
    //   612: goto -487 -> 125
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	615	0	this	bj
    //   0	615	1	paramString	String
    //   7	338	2	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   350	1	2	localIOException1	java.io.IOException
    //   354	1	2	localIOException2	java.io.IOException
    //   358	1	2	localIOException3	java.io.IOException
    //   362	1	2	localIOException4	java.io.IOException
    //   412	190	2	localObject1	Object
    //   57	280	3	localOutputStream	java.io.OutputStream
    //   397	1	3	localIOException5	java.io.IOException
    //   410	114	3	localObject2	Object
    //   62	266	4	localObject3	Object
    //   392	1	4	localIOException6	java.io.IOException
    //   407	197	4	localObject4	Object
    //   75	243	5	localObject5	Object
    //   387	1	5	localIOException7	java.io.IOException
    //   404	72	5	localObject6	Object
    //   496	1	5	localException1	Exception
    //   517	1	5	localException2	Exception
    //   538	34	5	localException3	Exception
    //   576	32	5	localObject7	Object
    //   4	304	6	localObject8	Object
    //   382	1	6	localIOException8	java.io.IOException
    //   461	89	6	localObject9	Object
    //   557	9	6	localException4	Exception
    //   573	22	6	localObject10	Object
    //   104	18	7	localException5	Exception
    //   401	13	7	localObject11	Object
    //   419	11	7	localObject12	Object
    //   435	8	7	localObject13	Object
    //   448	5	7	localObject14	Object
    //   458	8	7	localObject15	Object
    //   482	128	7	localObject16	Object
    //   109	10	8	localObject17	Object
    //   471	17	8	localObject18	Object
    //   590	16	8	localException6	Exception
    //   84	133	9	i	int
    //   1	585	10	bool1	boolean
    //   175	104	11	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   77	86	104	java/lang/Exception
    //   92	101	104	java/lang/Exception
    //   180	194	104	java/lang/Exception
    //   8	23	291	finally
    //   244	248	350	java/io/IOException
    //   253	258	354	java/io/IOException
    //   263	268	358	java/io/IOException
    //   272	276	362	java/io/IOException
    //   134	138	366	java/io/IOException
    //   143	148	370	java/io/IOException
    //   152	156	374	java/io/IOException
    //   160	164	378	java/io/IOException
    //   307	312	382	java/io/IOException
    //   317	322	387	java/io/IOException
    //   327	332	392	java/io/IOException
    //   336	340	397	java/io/IOException
    //   23	58	401	finally
    //   58	77	419	finally
    //   77	86	435	finally
    //   92	101	435	finally
    //   180	194	435	finally
    //   194	202	448	finally
    //   202	209	458	finally
    //   215	221	458	finally
    //   224	235	458	finally
    //   125	130	471	finally
    //   8	23	496	java/lang/Exception
    //   23	58	517	java/lang/Exception
    //   58	77	538	java/lang/Exception
    //   194	202	557	java/lang/Exception
    //   202	209	590	java/lang/Exception
    //   215	221	590	java/lang/Exception
    //   224	235	590	java/lang/Exception
  }
  
  public void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (this.d == null) {}
    do
    {
      do
      {
        return;
      } while (paramInt2 != -1);
      if (paramInt1 == 13)
      {
        a(paramIntent.getData());
        return;
      }
      if (paramInt1 == 15)
      {
        if (this.e == null) {
          this.e = ProgressDialog.show(this.d, null, "头像上传中...", true, false);
        }
        for (;;)
        {
          new bk(this).execute(new String[] { this.a });
          return;
          this.e.show();
        }
      }
    } while (paramInt1 != 14);
    paramIntent = new ContentValues();
    paramIntent.put("datetaken", new Date().toString());
    paramIntent.put("mime_type", "image/jpg");
    paramIntent.put("_data", this.b.getAbsolutePath());
    this.d.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, paramIntent);
    a(Uri.fromFile(this.b));
  }
  
  public void a(Uri paramUri)
  {
    Intent localIntent = new Intent("com.android.camera.action.CROP");
    localIntent.setDataAndType(paramUri, "image/*");
    localIntent.putExtra("crop", "true");
    localIntent.putExtra("aspectX", 100);
    localIntent.putExtra("aspectY", 100);
    localIntent.putExtra("outputX", 100);
    localIntent.putExtra("outputY", 100);
    localIntent.putExtra("scale", true);
    localIntent.putExtra("return-data", false);
    localIntent.putExtra("noFaceDetection", true);
    localIntent.putExtra("output", Uri.fromFile(this.c));
    localIntent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
    if (this.d != null) {
      this.d.startActivityForResult(localIntent, 15);
    }
  }
  
  public void a(String paramString)
  {
    if (this.d != null) {
      Toast.makeText(this.d, paramString, 0).show();
    }
  }
  
  public void a(String paramString, bl parambl)
  {
    this.a = paramString;
    this.f = parambl;
    if (!Environment.getExternalStorageState().equals("mounted")) {
      a("请插入SD卡!");
    }
    do
    {
      return;
      Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
      this.b = new File(Environment.getExternalStorageDirectory() + "/DCIM/Camera/", a());
      a(this.b);
      paramString = new Intent("android.media.action.IMAGE_CAPTURE");
      paramString.putExtra("output", Uri.fromFile(this.b));
    } while (this.d == null);
    this.d.startActivityForResult(paramString, 14);
  }
  
  public void b(String paramString, bl parambl)
  {
    this.a = paramString;
    this.f = parambl;
    paramString = new Intent("android.intent.action.PICK");
    paramString.setType("image/*");
    if (this.d != null) {
      this.d.startActivityForResult(paramString, 13);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\d\bj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */