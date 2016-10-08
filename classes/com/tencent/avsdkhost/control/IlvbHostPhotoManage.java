package com.tencent.avsdkhost.control;

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

public class IlvbHostPhotoManage
{
  public static final int RequestCodeCropPicture = 17429;
  public static final int RequestCodeOpenCamera = 17428;
  public static final int RequestCodeSelectGallery = 17427;
  private static final String TAG = "ilvb";
  private Activity mActivity;
  private File mCropIlvbPhotoFile;
  public String mImageUrl;
  private ProgressDialog mProgressDialog;
  private File mTempFile;
  private IlvbHostPhotoManage.UploadListener mUploadListener;
  private int outputX = 100;
  private int outputY = 100;
  
  public IlvbHostPhotoManage(Activity paramActivity)
  {
    this.mActivity = paramActivity;
    if (c.a())
    {
      if ((this.mActivity != null) && (this.mActivity.getExternalCacheDir() != null) && (this.mActivity.getExternalCacheDir().getAbsolutePath() != null)) {}
    }
    else {
      while ((this.mActivity == null) || (this.mActivity.getCacheDir() == null) || (this.mActivity.getCacheDir().getAbsolutePath() == null)) {
        return;
      }
    }
    if (c.a()) {}
    for (paramActivity = this.mActivity.getExternalCacheDir().getAbsolutePath();; paramActivity = this.mActivity.getCacheDir().getAbsolutePath())
    {
      this.mCropIlvbPhotoFile = new File(paramActivity + File.separator + "IlvbCropPhoto.jpg");
      createDir(this.mCropIlvbPhotoFile);
      return;
    }
  }
  
  private void createDir(File paramFile)
  {
    paramFile = new File(paramFile.getParent());
    if (!paramFile.exists()) {
      paramFile.mkdirs();
    }
  }
  
  private String getPhotoFileName()
  {
    Date localDate = new Date(System.currentTimeMillis());
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("'IMG'_yyyyMMdd_HHmmss", Locale.getDefault());
    return localSimpleDateFormat.format(localDate) + ".jpg";
  }
  
  /* Error */
  private String upLoading(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 7
    //   3: aconst_null
    //   4: astore 8
    //   6: new 140	java/net/URL
    //   9: dup
    //   10: aload_1
    //   11: invokespecial 141	java/net/URL:<init>	(Ljava/lang/String;)V
    //   14: invokevirtual 145	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   17: checkcast 147	java/net/HttpURLConnection
    //   20: astore_1
    //   21: aload_1
    //   22: iconst_1
    //   23: invokevirtual 151	java/net/HttpURLConnection:setDoInput	(Z)V
    //   26: aload_1
    //   27: iconst_1
    //   28: invokevirtual 154	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   31: aload_1
    //   32: ldc -100
    //   34: invokevirtual 159	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   37: aload_1
    //   38: sipush 10000
    //   41: invokevirtual 163	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   44: aload_1
    //   45: sipush 10000
    //   48: invokevirtual 166	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   51: aload_1
    //   52: invokevirtual 170	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   55: astore_2
    //   56: bipush 100
    //   58: newarray <illegal type>
    //   60: astore_3
    //   61: new 172	java/io/FileInputStream
    //   64: dup
    //   65: aload_0
    //   66: getfield 79	com/tencent/avsdkhost/control/IlvbHostPhotoManage:mCropIlvbPhotoFile	Ljava/io/File;
    //   69: invokespecial 174	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   72: astore 4
    //   74: aload 4
    //   76: aload_3
    //   77: invokevirtual 178	java/io/FileInputStream:read	([B)I
    //   80: istore 10
    //   82: iload 10
    //   84: iconst_m1
    //   85: if_icmpeq +93 -> 178
    //   88: aload_2
    //   89: aload_3
    //   90: iconst_0
    //   91: iload 10
    //   93: invokevirtual 184	java/io/OutputStream:write	([BII)V
    //   96: goto -22 -> 74
    //   99: astore 6
    //   101: aconst_null
    //   102: astore 9
    //   104: ldc -70
    //   106: astore 5
    //   108: aconst_null
    //   109: astore 8
    //   111: aload 4
    //   113: astore 7
    //   115: aload_1
    //   116: astore 4
    //   118: aload_2
    //   119: astore_3
    //   120: aload 9
    //   122: astore_2
    //   123: aload 8
    //   125: astore_1
    //   126: aload 6
    //   128: invokevirtual 189	java/lang/Exception:printStackTrace	()V
    //   131: aload_1
    //   132: ifnull +7 -> 139
    //   135: aload_1
    //   136: invokevirtual 194	java/io/ByteArrayOutputStream:close	()V
    //   139: aload 7
    //   141: ifnull +8 -> 149
    //   144: aload 7
    //   146: invokevirtual 195	java/io/FileInputStream:close	()V
    //   149: aload_2
    //   150: ifnull +7 -> 157
    //   153: aload_2
    //   154: invokevirtual 198	java/io/InputStream:close	()V
    //   157: aload_3
    //   158: ifnull +7 -> 165
    //   161: aload_3
    //   162: invokevirtual 199	java/io/OutputStream:close	()V
    //   165: aload 4
    //   167: ifnull +8 -> 175
    //   170: aload 4
    //   172: invokevirtual 202	java/net/HttpURLConnection:disconnect	()V
    //   175: aload 5
    //   177: areturn
    //   178: aload_2
    //   179: invokevirtual 205	java/io/OutputStream:flush	()V
    //   182: aload_2
    //   183: invokevirtual 199	java/io/OutputStream:close	()V
    //   186: aload_1
    //   187: invokevirtual 209	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   190: astore 5
    //   192: new 191	java/io/ByteArrayOutputStream
    //   195: dup
    //   196: invokespecial 210	java/io/ByteArrayOutputStream:<init>	()V
    //   199: astore_3
    //   200: aload 5
    //   202: invokevirtual 213	java/io/InputStream:read	()I
    //   205: istore 10
    //   207: iload 10
    //   209: iconst_m1
    //   210: if_icmpeq +12 -> 222
    //   213: aload_3
    //   214: iload 10
    //   216: invokevirtual 215	java/io/ByteArrayOutputStream:write	(I)V
    //   219: goto -19 -> 200
    //   222: aload_3
    //   223: invokevirtual 216	java/io/ByteArrayOutputStream:toString	()Ljava/lang/String;
    //   226: astore 6
    //   228: ldc 15
    //   230: new 61	java/lang/StringBuilder
    //   233: dup
    //   234: invokespecial 62	java/lang/StringBuilder:<init>	()V
    //   237: ldc -38
    //   239: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   242: aload 6
    //   244: invokevirtual 66	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   247: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   250: invokestatic 224	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;)I
    //   253: pop
    //   254: aload_3
    //   255: ifnull +7 -> 262
    //   258: aload_3
    //   259: invokevirtual 194	java/io/ByteArrayOutputStream:close	()V
    //   262: aload 4
    //   264: ifnull +8 -> 272
    //   267: aload 4
    //   269: invokevirtual 195	java/io/FileInputStream:close	()V
    //   272: aload 5
    //   274: ifnull +8 -> 282
    //   277: aload 5
    //   279: invokevirtual 198	java/io/InputStream:close	()V
    //   282: aload_2
    //   283: ifnull +7 -> 290
    //   286: aload_2
    //   287: invokevirtual 199	java/io/OutputStream:close	()V
    //   290: aload_1
    //   291: ifnull +7 -> 298
    //   294: aload_1
    //   295: invokevirtual 202	java/net/HttpURLConnection:disconnect	()V
    //   298: aload 6
    //   300: areturn
    //   301: astore_1
    //   302: aconst_null
    //   303: astore 6
    //   305: aconst_null
    //   306: astore 4
    //   308: aconst_null
    //   309: astore_2
    //   310: aconst_null
    //   311: astore_3
    //   312: aload 7
    //   314: ifnull +8 -> 322
    //   317: aload 7
    //   319: invokevirtual 194	java/io/ByteArrayOutputStream:close	()V
    //   322: aload 6
    //   324: ifnull +8 -> 332
    //   327: aload 6
    //   329: invokevirtual 195	java/io/FileInputStream:close	()V
    //   332: aload 4
    //   334: ifnull +8 -> 342
    //   337: aload 4
    //   339: invokevirtual 198	java/io/InputStream:close	()V
    //   342: aload_2
    //   343: ifnull +7 -> 350
    //   346: aload_2
    //   347: invokevirtual 199	java/io/OutputStream:close	()V
    //   350: aload_3
    //   351: ifnull +7 -> 358
    //   354: aload_3
    //   355: invokevirtual 202	java/net/HttpURLConnection:disconnect	()V
    //   358: aload_1
    //   359: athrow
    //   360: astore_3
    //   361: goto -99 -> 262
    //   364: astore_3
    //   365: goto -93 -> 272
    //   368: astore_3
    //   369: goto -87 -> 282
    //   372: astore_2
    //   373: goto -83 -> 290
    //   376: astore_1
    //   377: goto -238 -> 139
    //   380: astore_1
    //   381: goto -232 -> 149
    //   384: astore_1
    //   385: goto -228 -> 157
    //   388: astore_1
    //   389: goto -224 -> 165
    //   392: astore 5
    //   394: goto -72 -> 322
    //   397: astore 5
    //   399: goto -67 -> 332
    //   402: astore 4
    //   404: goto -62 -> 342
    //   407: astore_2
    //   408: goto -58 -> 350
    //   411: astore 5
    //   413: aconst_null
    //   414: astore 6
    //   416: aconst_null
    //   417: astore 4
    //   419: aconst_null
    //   420: astore_2
    //   421: aload_1
    //   422: astore_3
    //   423: aload 5
    //   425: astore_1
    //   426: goto -114 -> 312
    //   429: astore 5
    //   431: aconst_null
    //   432: astore 6
    //   434: aconst_null
    //   435: astore 4
    //   437: aload_1
    //   438: astore_3
    //   439: aload 5
    //   441: astore_1
    //   442: goto -130 -> 312
    //   445: astore 6
    //   447: aconst_null
    //   448: astore 5
    //   450: aload_1
    //   451: astore_3
    //   452: aload 6
    //   454: astore_1
    //   455: aload 4
    //   457: astore 6
    //   459: aload 5
    //   461: astore 4
    //   463: goto -151 -> 312
    //   466: astore 6
    //   468: aload_1
    //   469: astore_3
    //   470: aload 6
    //   472: astore_1
    //   473: aload 4
    //   475: astore 6
    //   477: aload 5
    //   479: astore 4
    //   481: goto -169 -> 312
    //   484: astore 6
    //   486: aload_3
    //   487: astore 7
    //   489: aload_1
    //   490: astore_3
    //   491: aload 6
    //   493: astore_1
    //   494: aload 4
    //   496: astore 6
    //   498: aload 5
    //   500: astore 4
    //   502: goto -190 -> 312
    //   505: astore 8
    //   507: aload_3
    //   508: astore 5
    //   510: aload 4
    //   512: astore_3
    //   513: aload 7
    //   515: astore 6
    //   517: aload_1
    //   518: astore 7
    //   520: aload 8
    //   522: astore_1
    //   523: aload_2
    //   524: astore 4
    //   526: aload 5
    //   528: astore_2
    //   529: goto -217 -> 312
    //   532: astore 6
    //   534: aconst_null
    //   535: astore_2
    //   536: aconst_null
    //   537: astore_3
    //   538: aconst_null
    //   539: astore 4
    //   541: ldc -70
    //   543: astore 5
    //   545: aconst_null
    //   546: astore_1
    //   547: aload 8
    //   549: astore 7
    //   551: goto -425 -> 126
    //   554: astore 6
    //   556: aconst_null
    //   557: astore_2
    //   558: aconst_null
    //   559: astore_3
    //   560: aload_1
    //   561: astore 4
    //   563: ldc -70
    //   565: astore 5
    //   567: aconst_null
    //   568: astore_1
    //   569: aload 8
    //   571: astore 7
    //   573: goto -447 -> 126
    //   576: astore 6
    //   578: aconst_null
    //   579: astore 9
    //   581: aload_2
    //   582: astore_3
    //   583: aload_1
    //   584: astore 4
    //   586: ldc -70
    //   588: astore 5
    //   590: aconst_null
    //   591: astore_1
    //   592: aload 8
    //   594: astore 7
    //   596: aload 9
    //   598: astore_2
    //   599: goto -473 -> 126
    //   602: astore 6
    //   604: aload 5
    //   606: astore_3
    //   607: aload_1
    //   608: astore 8
    //   610: ldc -70
    //   612: astore 5
    //   614: aconst_null
    //   615: astore_1
    //   616: aload 4
    //   618: astore 7
    //   620: aload_2
    //   621: astore 4
    //   623: aload_3
    //   624: astore_2
    //   625: aload 4
    //   627: astore_3
    //   628: aload 8
    //   630: astore 4
    //   632: goto -506 -> 126
    //   635: astore 9
    //   637: aload 4
    //   639: astore 7
    //   641: aload_2
    //   642: astore 4
    //   644: aload 5
    //   646: astore_2
    //   647: aload_1
    //   648: astore 8
    //   650: aload 6
    //   652: astore 5
    //   654: aload 9
    //   656: astore 6
    //   658: aload_3
    //   659: astore_1
    //   660: aload 4
    //   662: astore_3
    //   663: aload 8
    //   665: astore 4
    //   667: goto -541 -> 126
    //   670: astore 6
    //   672: aload 4
    //   674: astore 7
    //   676: aload_2
    //   677: astore 4
    //   679: aload 5
    //   681: astore_2
    //   682: aload_1
    //   683: astore 8
    //   685: ldc -70
    //   687: astore 5
    //   689: aload_3
    //   690: astore_1
    //   691: aload 4
    //   693: astore_3
    //   694: aload 8
    //   696: astore 4
    //   698: goto -572 -> 126
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	701	0	this	IlvbHostPhotoManage
    //   0	701	1	paramString	String
    //   55	292	2	localObject1	Object
    //   372	1	2	localIOException1	java.io.IOException
    //   407	1	2	localIOException2	java.io.IOException
    //   420	262	2	localObject2	Object
    //   60	295	3	localObject3	Object
    //   360	1	3	localIOException3	java.io.IOException
    //   364	1	3	localIOException4	java.io.IOException
    //   368	1	3	localIOException5	java.io.IOException
    //   422	272	3	localObject4	Object
    //   72	266	4	localObject5	Object
    //   402	1	4	localIOException6	java.io.IOException
    //   417	280	4	localObject6	Object
    //   106	172	5	localObject7	Object
    //   392	1	5	localIOException7	java.io.IOException
    //   397	1	5	localIOException8	java.io.IOException
    //   411	13	5	localObject8	Object
    //   429	11	5	localObject9	Object
    //   448	240	5	localObject10	Object
    //   99	28	6	localException1	Exception
    //   226	207	6	str1	String
    //   445	8	6	localObject11	Object
    //   457	1	6	localObject12	Object
    //   466	5	6	localObject13	Object
    //   475	1	6	localObject14	Object
    //   484	8	6	localObject15	Object
    //   496	20	6	localObject16	Object
    //   532	1	6	localException2	Exception
    //   554	1	6	localException3	Exception
    //   576	1	6	localException4	Exception
    //   602	49	6	localException5	Exception
    //   656	1	6	localObject17	Object
    //   670	1	6	localException6	Exception
    //   1	674	7	localObject18	Object
    //   4	120	8	localObject19	Object
    //   505	88	8	localObject20	Object
    //   608	87	8	str2	String
    //   102	495	9	localObject21	Object
    //   635	20	9	localException7	Exception
    //   80	135	10	i	int
    // Exception table:
    //   from	to	target	type
    //   74	82	99	java/lang/Exception
    //   88	96	99	java/lang/Exception
    //   178	192	99	java/lang/Exception
    //   6	21	301	finally
    //   258	262	360	java/io/IOException
    //   267	272	364	java/io/IOException
    //   277	282	368	java/io/IOException
    //   286	290	372	java/io/IOException
    //   135	139	376	java/io/IOException
    //   144	149	380	java/io/IOException
    //   153	157	384	java/io/IOException
    //   161	165	388	java/io/IOException
    //   317	322	392	java/io/IOException
    //   327	332	397	java/io/IOException
    //   337	342	402	java/io/IOException
    //   346	350	407	java/io/IOException
    //   21	56	411	finally
    //   56	74	429	finally
    //   74	82	445	finally
    //   88	96	445	finally
    //   178	192	445	finally
    //   192	200	466	finally
    //   200	207	484	finally
    //   213	219	484	finally
    //   222	228	484	finally
    //   228	254	484	finally
    //   126	131	505	finally
    //   6	21	532	java/lang/Exception
    //   21	56	554	java/lang/Exception
    //   56	74	576	java/lang/Exception
    //   192	200	602	java/lang/Exception
    //   228	254	635	java/lang/Exception
    //   200	207	670	java/lang/Exception
    //   213	219	670	java/lang/Exception
    //   222	228	670	java/lang/Exception
  }
  
  /* Error */
  private void upLoadingMultipart(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aconst_null
    //   4: astore_3
    //   5: new 229	com/android/dazhihui/ui/model/stock/ProgressMultipartEntity
    //   8: dup
    //   9: invokespecial 230	com/android/dazhihui/ui/model/stock/ProgressMultipartEntity:<init>	()V
    //   12: astore 6
    //   14: invokestatic 233	com/android/dazhihui/ui/model/stock/ProgressMultipartEntity:enable	()V
    //   17: aload_0
    //   18: getfield 79	com/tencent/avsdkhost/control/IlvbHostPhotoManage:mCropIlvbPhotoFile	Ljava/io/File;
    //   21: invokevirtual 236	java/io/File:length	()J
    //   24: l2i
    //   25: istore 8
    //   27: new 172	java/io/FileInputStream
    //   30: dup
    //   31: aload_0
    //   32: getfield 79	com/tencent/avsdkhost/control/IlvbHostPhotoManage:mCropIlvbPhotoFile	Ljava/io/File;
    //   35: invokespecial 174	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   38: astore 4
    //   40: iload 8
    //   42: istore 7
    //   44: aload 4
    //   46: astore_2
    //   47: aload 5
    //   49: astore_3
    //   50: aload 4
    //   52: invokevirtual 239	java/io/FileInputStream:available	()I
    //   55: iload 8
    //   57: if_icmplt +16 -> 73
    //   60: aload 4
    //   62: astore_2
    //   63: aload 5
    //   65: astore_3
    //   66: aload 4
    //   68: invokevirtual 239	java/io/FileInputStream:available	()I
    //   71: istore 7
    //   73: aload 4
    //   75: astore_2
    //   76: aload 5
    //   78: astore_3
    //   79: iload 7
    //   81: newarray <illegal type>
    //   83: astore 5
    //   85: aload 4
    //   87: astore_2
    //   88: aload 5
    //   90: astore_3
    //   91: aload 4
    //   93: aload 5
    //   95: invokevirtual 178	java/io/FileInputStream:read	([B)I
    //   98: pop
    //   99: aload 5
    //   101: astore_2
    //   102: aload 4
    //   104: ifnull +11 -> 115
    //   107: aload 4
    //   109: invokevirtual 195	java/io/FileInputStream:close	()V
    //   112: aload 5
    //   114: astore_2
    //   115: aload_2
    //   116: ifnull +8 -> 124
    //   119: aload_2
    //   120: arraylength
    //   121: ifgt +81 -> 202
    //   124: ldc 15
    //   126: ldc -15
    //   128: invokestatic 244	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   131: pop
    //   132: aload_0
    //   133: getfield 88	com/tencent/avsdkhost/control/IlvbHostPhotoManage:mProgressDialog	Landroid/app/ProgressDialog;
    //   136: ifnull +10 -> 146
    //   139: aload_0
    //   140: getfield 88	com/tencent/avsdkhost/control/IlvbHostPhotoManage:mProgressDialog	Landroid/app/ProgressDialog;
    //   143: invokevirtual 249	android/app/ProgressDialog:dismiss	()V
    //   146: aload_0
    //   147: ldc -5
    //   149: invokevirtual 254	com/tencent/avsdkhost/control/IlvbHostPhotoManage:showToast	(Ljava/lang/String;)V
    //   152: return
    //   153: astore 5
    //   155: aconst_null
    //   156: astore 4
    //   158: aload 4
    //   160: astore_2
    //   161: aload 5
    //   163: invokevirtual 189	java/lang/Exception:printStackTrace	()V
    //   166: aload_3
    //   167: astore_2
    //   168: aload 4
    //   170: ifnull -55 -> 115
    //   173: aload 4
    //   175: invokevirtual 195	java/io/FileInputStream:close	()V
    //   178: aload_3
    //   179: astore_2
    //   180: goto -65 -> 115
    //   183: astore_2
    //   184: aload_3
    //   185: astore_2
    //   186: goto -71 -> 115
    //   189: astore_1
    //   190: aconst_null
    //   191: astore_2
    //   192: aload_2
    //   193: ifnull +7 -> 200
    //   196: aload_2
    //   197: invokevirtual 195	java/io/FileInputStream:close	()V
    //   200: aload_1
    //   201: athrow
    //   202: aload 6
    //   204: ldc_w 256
    //   207: new 258	org/apache/http/entity/mime/content/StringBody
    //   210: dup
    //   211: invokestatic 263	com/android/dazhihui/o:a	()Lcom/android/dazhihui/o;
    //   214: invokevirtual 266	com/android/dazhihui/o:b	()Ljava/lang/String;
    //   217: ldc_w 268
    //   220: ldc_w 270
    //   223: invokestatic 276	java/nio/charset/Charset:forName	(Ljava/lang/String;)Ljava/nio/charset/Charset;
    //   226: invokespecial 279	org/apache/http/entity/mime/content/StringBody:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/nio/charset/Charset;)V
    //   229: invokevirtual 283	com/android/dazhihui/ui/model/stock/ProgressMultipartEntity:addPart	(Ljava/lang/String;Lorg/apache/http/entity/mime/content/ContentBody;)V
    //   232: aload 6
    //   234: ldc_w 285
    //   237: new 287	org/apache/http/entity/mime/content/ByteArrayBody
    //   240: dup
    //   241: aload_2
    //   242: ldc_w 289
    //   245: invokespecial 292	org/apache/http/entity/mime/content/ByteArrayBody:<init>	([BLjava/lang/String;)V
    //   248: invokevirtual 283	com/android/dazhihui/ui/model/stock/ProgressMultipartEntity:addPart	(Ljava/lang/String;Lorg/apache/http/entity/mime/content/ContentBody;)V
    //   251: new 294	com/android/dazhihui/ui/model/stock/HttpPostAsyncTask
    //   254: dup
    //   255: new 296	com/tencent/avsdkhost/control/IlvbHostPhotoManage$2
    //   258: dup
    //   259: aload_0
    //   260: invokespecial 299	com/tencent/avsdkhost/control/IlvbHostPhotoManage$2:<init>	(Lcom/tencent/avsdkhost/control/IlvbHostPhotoManage;)V
    //   263: aload 6
    //   265: invokespecial 302	com/android/dazhihui/ui/model/stock/HttpPostAsyncTask:<init>	(Lcom/android/dazhihui/ui/model/stock/HttpPostAsyncTask$PostListener;Lcom/android/dazhihui/ui/model/stock/ProgressMultipartEntity;)V
    //   268: iconst_1
    //   269: anewarray 304	java/lang/String
    //   272: dup
    //   273: iconst_0
    //   274: aload_1
    //   275: aastore
    //   276: invokevirtual 308	com/android/dazhihui/ui/model/stock/HttpPostAsyncTask:execute	([Ljava/lang/Object;)Landroid/os/AsyncTask;
    //   279: pop
    //   280: return
    //   281: astore_2
    //   282: aload_2
    //   283: invokevirtual 309	java/io/UnsupportedEncodingException:printStackTrace	()V
    //   286: goto -35 -> 251
    //   289: astore_2
    //   290: aload 5
    //   292: astore_2
    //   293: goto -178 -> 115
    //   296: astore_2
    //   297: goto -97 -> 200
    //   300: astore_1
    //   301: goto -109 -> 192
    //   304: astore 5
    //   306: goto -148 -> 158
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	309	0	this	IlvbHostPhotoManage
    //   0	309	1	paramString	String
    //   46	134	2	localObject	Object
    //   183	1	2	localException1	Exception
    //   185	57	2	arrayOfByte1	byte[]
    //   281	2	2	localUnsupportedEncodingException	java.io.UnsupportedEncodingException
    //   289	1	2	localException2	Exception
    //   292	1	2	localException3	Exception
    //   296	1	2	localException4	Exception
    //   4	181	3	arrayOfByte2	byte[]
    //   38	136	4	localFileInputStream	java.io.FileInputStream
    //   1	112	5	arrayOfByte3	byte[]
    //   153	138	5	localException5	Exception
    //   304	1	5	localException6	Exception
    //   12	252	6	localProgressMultipartEntity	com.android.dazhihui.ui.model.stock.ProgressMultipartEntity
    //   42	38	7	i	int
    //   25	33	8	j	int
    // Exception table:
    //   from	to	target	type
    //   27	40	153	java/lang/Exception
    //   173	178	183	java/lang/Exception
    //   27	40	189	finally
    //   202	251	281	java/io/UnsupportedEncodingException
    //   107	112	289	java/lang/Exception
    //   196	200	296	java/lang/Exception
    //   50	60	300	finally
    //   66	73	300	finally
    //   79	85	300	finally
    //   91	99	300	finally
    //   161	166	300	finally
    //   50	60	304	java/lang/Exception
    //   66	73	304	java/lang/Exception
    //   79	85	304	java/lang/Exception
    //   91	99	304	java/lang/Exception
  }
  
  public void getCropImageIntent(Uri paramUri)
  {
    Intent localIntent = new Intent("com.android.camera.action.CROP");
    localIntent.setDataAndType(paramUri, "image/*");
    localIntent.putExtra("crop", "true");
    localIntent.putExtra("aspectX", this.outputX);
    localIntent.putExtra("aspectY", this.outputY);
    float f = this.outputX / this.outputY;
    if (f == 1.0F)
    {
      localIntent.putExtra("outputX", 540);
      localIntent.putExtra("outputY", 540);
    }
    for (;;)
    {
      localIntent.putExtra("scale", true);
      localIntent.putExtra("return-data", false);
      localIntent.putExtra("noFaceDetection", true);
      localIntent.putExtra("output", Uri.fromFile(this.mCropIlvbPhotoFile));
      localIntent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
      this.mActivity.startActivityForResult(localIntent, 17429);
      return;
      if (f == 1.7777777777777777D)
      {
        localIntent.putExtra("outputX", 480);
        localIntent.putExtra("outputY", 270);
      }
      else
      {
        localIntent.putExtra("outputX", this.outputX * 30);
        localIntent.putExtra("outputY", this.outputY * 30);
      }
    }
  }
  
  /* Error */
  public String httpPost(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aconst_null
    //   4: astore_3
    //   5: aload_1
    //   6: invokestatic 383	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   9: ifeq +8 -> 17
    //   12: ldc -70
    //   14: astore_2
    //   15: aload_2
    //   16: areturn
    //   17: aload_0
    //   18: getfield 79	com/tencent/avsdkhost/control/IlvbHostPhotoManage:mCropIlvbPhotoFile	Ljava/io/File;
    //   21: invokevirtual 236	java/io/File:length	()J
    //   24: l2i
    //   25: istore 7
    //   27: new 172	java/io/FileInputStream
    //   30: dup
    //   31: aload_0
    //   32: getfield 79	com/tencent/avsdkhost/control/IlvbHostPhotoManage:mCropIlvbPhotoFile	Ljava/io/File;
    //   35: invokespecial 174	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   38: astore 4
    //   40: iload 7
    //   42: istore 6
    //   44: aload 4
    //   46: astore_2
    //   47: aload 5
    //   49: astore_3
    //   50: aload 4
    //   52: invokevirtual 239	java/io/FileInputStream:available	()I
    //   55: iload 7
    //   57: if_icmplt +16 -> 73
    //   60: aload 4
    //   62: astore_2
    //   63: aload 5
    //   65: astore_3
    //   66: aload 4
    //   68: invokevirtual 239	java/io/FileInputStream:available	()I
    //   71: istore 6
    //   73: aload 4
    //   75: astore_2
    //   76: aload 5
    //   78: astore_3
    //   79: iload 6
    //   81: newarray <illegal type>
    //   83: astore 5
    //   85: aload 4
    //   87: astore_2
    //   88: aload 5
    //   90: astore_3
    //   91: aload 4
    //   93: aload 5
    //   95: invokevirtual 178	java/io/FileInputStream:read	([B)I
    //   98: pop
    //   99: aload 5
    //   101: astore_2
    //   102: aload 4
    //   104: ifnull +11 -> 115
    //   107: aload 4
    //   109: invokevirtual 195	java/io/FileInputStream:close	()V
    //   112: aload 5
    //   114: astore_2
    //   115: aload_2
    //   116: ifnull +8 -> 124
    //   119: aload_2
    //   120: arraylength
    //   121: ifgt +83 -> 204
    //   124: ldc 15
    //   126: ldc -15
    //   128: invokestatic 244	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   131: pop
    //   132: aload_0
    //   133: getfield 88	com/tencent/avsdkhost/control/IlvbHostPhotoManage:mProgressDialog	Landroid/app/ProgressDialog;
    //   136: ifnull +10 -> 146
    //   139: aload_0
    //   140: getfield 88	com/tencent/avsdkhost/control/IlvbHostPhotoManage:mProgressDialog	Landroid/app/ProgressDialog;
    //   143: invokevirtual 249	android/app/ProgressDialog:dismiss	()V
    //   146: aload_0
    //   147: ldc -5
    //   149: invokevirtual 254	com/tencent/avsdkhost/control/IlvbHostPhotoManage:showToast	(Ljava/lang/String;)V
    //   152: ldc -70
    //   154: areturn
    //   155: astore 5
    //   157: aconst_null
    //   158: astore 4
    //   160: aload 4
    //   162: astore_2
    //   163: aload 5
    //   165: invokevirtual 189	java/lang/Exception:printStackTrace	()V
    //   168: aload_3
    //   169: astore_2
    //   170: aload 4
    //   172: ifnull -57 -> 115
    //   175: aload 4
    //   177: invokevirtual 195	java/io/FileInputStream:close	()V
    //   180: aload_3
    //   181: astore_2
    //   182: goto -67 -> 115
    //   185: astore_2
    //   186: aload_3
    //   187: astore_2
    //   188: goto -73 -> 115
    //   191: astore_1
    //   192: aconst_null
    //   193: astore_2
    //   194: aload_2
    //   195: ifnull +7 -> 202
    //   198: aload_2
    //   199: invokevirtual 195	java/io/FileInputStream:close	()V
    //   202: aload_1
    //   203: athrow
    //   204: ldc -70
    //   206: astore_3
    //   207: new 385	org/apache/http/client/methods/HttpPost
    //   210: dup
    //   211: aload_1
    //   212: invokespecial 386	org/apache/http/client/methods/HttpPost:<init>	(Ljava/lang/String;)V
    //   215: astore_1
    //   216: aload_1
    //   217: new 388	org/apache/http/entity/ByteArrayEntity
    //   220: dup
    //   221: aload_2
    //   222: invokespecial 391	org/apache/http/entity/ByteArrayEntity:<init>	([B)V
    //   225: invokevirtual 395	org/apache/http/client/methods/HttpPost:setEntity	(Lorg/apache/http/HttpEntity;)V
    //   228: new 397	org/apache/http/impl/client/DefaultHttpClient
    //   231: dup
    //   232: invokespecial 398	org/apache/http/impl/client/DefaultHttpClient:<init>	()V
    //   235: aload_1
    //   236: invokeinterface 403 2 0
    //   241: astore_2
    //   242: aload_3
    //   243: astore_1
    //   244: aload_2
    //   245: invokeinterface 409 1 0
    //   250: invokeinterface 414 1 0
    //   255: sipush 200
    //   258: if_icmpne +16 -> 274
    //   261: aload_2
    //   262: invokeinterface 418 1 0
    //   267: ldc_w 270
    //   270: invokestatic 423	org/apache/http/util/EntityUtils:toString	(Lorg/apache/http/HttpEntity;Ljava/lang/String;)Ljava/lang/String;
    //   273: astore_1
    //   274: aload_1
    //   275: astore_2
    //   276: aload_1
    //   277: ifnonnull -262 -> 15
    //   280: ldc -70
    //   282: areturn
    //   283: astore_1
    //   284: aload_1
    //   285: invokevirtual 424	org/apache/http/client/ClientProtocolException:printStackTrace	()V
    //   288: aload_3
    //   289: astore_1
    //   290: goto -16 -> 274
    //   293: astore_1
    //   294: aload_1
    //   295: athrow
    //   296: astore_1
    //   297: aload_1
    //   298: invokevirtual 425	java/io/IOException:printStackTrace	()V
    //   301: aload_3
    //   302: astore_1
    //   303: goto -29 -> 274
    //   306: astore_1
    //   307: aload_1
    //   308: invokevirtual 189	java/lang/Exception:printStackTrace	()V
    //   311: aload_3
    //   312: astore_1
    //   313: goto -39 -> 274
    //   316: astore_2
    //   317: aload 5
    //   319: astore_2
    //   320: goto -205 -> 115
    //   323: astore_2
    //   324: goto -122 -> 202
    //   327: astore_1
    //   328: goto -134 -> 194
    //   331: astore 5
    //   333: goto -173 -> 160
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	336	0	this	IlvbHostPhotoManage
    //   0	336	1	paramString	String
    //   14	168	2	localObject1	Object
    //   185	1	2	localException1	Exception
    //   187	89	2	localObject2	Object
    //   316	1	2	localException2	Exception
    //   319	1	2	localException3	Exception
    //   323	1	2	localException4	Exception
    //   4	308	3	localObject3	Object
    //   38	138	4	localFileInputStream	java.io.FileInputStream
    //   1	112	5	arrayOfByte	byte[]
    //   155	163	5	localException5	Exception
    //   331	1	5	localException6	Exception
    //   42	38	6	i	int
    //   25	33	7	j	int
    // Exception table:
    //   from	to	target	type
    //   27	40	155	java/lang/Exception
    //   175	180	185	java/lang/Exception
    //   27	40	191	finally
    //   216	242	283	org/apache/http/client/ClientProtocolException
    //   244	274	283	org/apache/http/client/ClientProtocolException
    //   216	242	293	finally
    //   244	274	293	finally
    //   284	288	293	finally
    //   297	301	293	finally
    //   307	311	293	finally
    //   216	242	296	java/io/IOException
    //   244	274	296	java/io/IOException
    //   216	242	306	java/lang/Exception
    //   244	274	306	java/lang/Exception
    //   107	112	316	java/lang/Exception
    //   198	202	323	java/lang/Exception
    //   50	60	327	finally
    //   66	73	327	finally
    //   79	85	327	finally
    //   91	99	327	finally
    //   163	168	327	finally
    //   50	60	331	java/lang/Exception
    //   66	73	331	java/lang/Exception
    //   79	85	331	java/lang/Exception
    //   91	99	331	java/lang/Exception
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt2 != -1) {}
    do
    {
      return;
      if (paramInt1 == 17427)
      {
        getCropImageIntent(paramIntent.getData());
        return;
      }
      if (paramInt1 == 17429)
      {
        if (this.mProgressDialog == null) {
          this.mProgressDialog = ProgressDialog.show(this.mActivity, null, "图片上传中...", true, false);
        }
        for (;;)
        {
          new IlvbHostPhotoManage.1(this).execute(new String[] { this.mImageUrl });
          return;
          this.mProgressDialog.show();
        }
      }
    } while (paramInt1 != 17428);
    paramIntent = new ContentValues();
    paramIntent.put("datetaken", new Date().toString());
    paramIntent.put("mime_type", "image/jpg");
    paramIntent.put("_data", this.mTempFile.getAbsolutePath());
    this.mActivity.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, paramIntent);
    getCropImageIntent(Uri.fromFile(this.mTempFile));
  }
  
  public void setOutput(int paramInt1, int paramInt2)
  {
    this.outputX = paramInt1;
    this.outputY = paramInt2;
  }
  
  public void showToast(String paramString)
  {
    Toast.makeText(this.mActivity, paramString, 0).show();
  }
  
  public void takeGallery(String paramString, IlvbHostPhotoManage.UploadListener paramUploadListener)
  {
    this.mImageUrl = paramString;
    this.mUploadListener = paramUploadListener;
    paramString = new Intent("android.intent.action.PICK");
    paramString.setType("image/*");
    this.mActivity.startActivityForResult(paramString, 17427);
  }
  
  public void takePhoto(String paramString, IlvbHostPhotoManage.UploadListener paramUploadListener)
  {
    this.mImageUrl = paramString;
    this.mUploadListener = paramUploadListener;
    if (!Environment.getExternalStorageState().equals("mounted"))
    {
      showToast("请插入SD卡!");
      return;
    }
    Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
    this.mTempFile = new File(Environment.getExternalStorageDirectory() + "/DCIM/Camera/", getPhotoFileName());
    createDir(this.mTempFile);
    paramString = new Intent("android.media.action.IMAGE_CAPTURE");
    paramString.putExtra("output", Uri.fromFile(this.mTempFile));
    this.mActivity.startActivityForResult(paramString, 17428);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\control\IlvbHostPhotoManage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */