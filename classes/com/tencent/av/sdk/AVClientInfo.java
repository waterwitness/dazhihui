package com.tencent.av.sdk;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.tencent.av.config.Common;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AVClientInfo
{
  public static final int CHIP_ARM_V5 = 1;
  public static final int CHIP_ARM_V6 = 2;
  public static final int CHIP_ARM_V7_NENO = 4;
  public static final int CHIP_ARM_V7_NO_NENO = 3;
  public static final int CHIP_ARM_V8 = 5;
  public static final int CHIP_MIPS = 6;
  public static final int CHIP_UNKNOW = 0;
  public static final int CHIP_X86 = 7;
  static final String TAG = "AVClientInfo";
  static int mChip;
  static int mCoreNumber;
  static int mCpuArchitecture;
  static String mFeature;
  static String mHardware;
  static boolean mIsMarvell;
  static boolean mIsSupportSharpAudio;
  static boolean mIsSupportSharpVideo;
  static long mMaxCpuFreq;
  static int mOpenGLVersion;
  static String mProcessorName = "";
  static String mVendorId;
  public static Context m_Context;
  static boolean mfReadCpuInfo;
  static long mgMaxCpuFreq = 0L;
  static int mgNumCores;
  
  static
  {
    mFeature = "";
    mVendorId = null;
    mHardware = null;
    mCpuArchitecture = 5;
    mMaxCpuFreq = 0L;
    mCoreNumber = 1;
    mfReadCpuInfo = false;
    mOpenGLVersion = 2;
    mChip = 1;
    mIsSupportSharpAudio = true;
    mIsSupportSharpVideo = true;
    mIsMarvell = false;
    m_Context = null;
    mgNumCores = 0;
  }
  
  public static void Init(Context paramContext)
  {
    m_Context = paramContext;
  }
  
  public static String getAppVersion()
  {
    return Common.getVersion(m_Context);
  }
  
  public static String getCPUName()
  {
    getCpuInfo();
    return mProcessorName;
  }
  
  public static int getCpuArchitecture()
  {
    getCpuInfo();
    return mChip;
  }
  
  /* Error */
  public static void getCpuInfo()
  {
    // Byte code:
    //   0: getstatic 64	com/tencent/av/sdk/AVClientInfo:mfReadCpuInfo	Z
    //   3: iconst_1
    //   4: if_icmpne +4 -> 8
    //   7: return
    //   8: aconst_null
    //   9: astore_3
    //   10: ldc2_w 107
    //   13: lstore 8
    //   15: ldc 109
    //   17: fstore_0
    //   18: new 111	java/io/BufferedReader
    //   21: dup
    //   22: new 113	java/io/FileReader
    //   25: dup
    //   26: ldc 115
    //   28: invokespecial 118	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   31: invokespecial 121	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   34: astore_2
    //   35: aload_2
    //   36: invokevirtual 124	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   39: astore_3
    //   40: aload_3
    //   41: ifnonnull +84 -> 125
    //   44: iconst_1
    //   45: putstatic 64	com/tencent/av/sdk/AVClientInfo:mfReadCpuInfo	Z
    //   48: lload 8
    //   50: lstore 10
    //   52: fload_0
    //   53: fstore_1
    //   54: aload_2
    //   55: ifnull +13 -> 68
    //   58: aload_2
    //   59: invokevirtual 127	java/io/BufferedReader:close	()V
    //   62: fload_0
    //   63: fstore_1
    //   64: lload 8
    //   66: lstore 10
    //   68: invokestatic 130	com/tencent/av/sdk/AVClientInfo:readNumCores	()I
    //   71: istore 6
    //   73: iload 6
    //   75: ifle +649 -> 724
    //   78: iload 6
    //   80: putstatic 62	com/tencent/av/sdk/AVClientInfo:mCoreNumber	I
    //   83: invokestatic 134	com/tencent/av/sdk/AVClientInfo:readMaxCpuFreq	()J
    //   86: lstore 8
    //   88: lload 8
    //   90: lconst_0
    //   91: lcmp
    //   92: ifle +648 -> 740
    //   95: lload 8
    //   97: putstatic 60	com/tencent/av/sdk/AVClientInfo:mMaxCpuFreq	J
    //   100: getstatic 62	com/tencent/av/sdk/AVClientInfo:mCoreNumber	I
    //   103: ifle +11 -> 114
    //   106: getstatic 60	com/tencent/av/sdk/AVClientInfo:mMaxCpuFreq	J
    //   109: lconst_0
    //   110: lcmp
    //   111: ifgt +694 -> 805
    //   114: iconst_0
    //   115: putstatic 64	com/tencent/av/sdk/AVClientInfo:mfReadCpuInfo	Z
    //   118: invokestatic 137	com/tencent/av/sdk/AVClientInfo:readCpuArchitecture	()I
    //   121: putstatic 68	com/tencent/av/sdk/AVClientInfo:mChip	I
    //   124: return
    //   125: aload_3
    //   126: ldc -117
    //   128: invokevirtual 145	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   131: ifeq +82 -> 213
    //   134: aload_3
    //   135: bipush 58
    //   137: invokevirtual 149	java/lang/String:indexOf	(I)I
    //   140: istore 6
    //   142: iload 6
    //   144: iconst_1
    //   145: if_icmple -110 -> 35
    //   148: aload_3
    //   149: iload 6
    //   151: iconst_1
    //   152: iadd
    //   153: aload_3
    //   154: invokevirtual 152	java/lang/String:length	()I
    //   157: invokevirtual 156	java/lang/String:substring	(II)Ljava/lang/String;
    //   160: putstatic 50	com/tencent/av/sdk/AVClientInfo:mProcessorName	Ljava/lang/String;
    //   163: getstatic 50	com/tencent/av/sdk/AVClientInfo:mProcessorName	Ljava/lang/String;
    //   166: invokevirtual 159	java/lang/String:trim	()Ljava/lang/String;
    //   169: putstatic 50	com/tencent/av/sdk/AVClientInfo:mProcessorName	Ljava/lang/String;
    //   172: goto -137 -> 35
    //   175: astore_3
    //   176: lload 8
    //   178: lstore 10
    //   180: fload_0
    //   181: fstore_1
    //   182: aload_2
    //   183: ifnull -115 -> 68
    //   186: aload_2
    //   187: invokevirtual 127	java/io/BufferedReader:close	()V
    //   190: lload 8
    //   192: lstore 10
    //   194: fload_0
    //   195: fstore_1
    //   196: goto -128 -> 68
    //   199: astore_2
    //   200: aload_2
    //   201: invokevirtual 162	java/io/IOException:printStackTrace	()V
    //   204: lload 8
    //   206: lstore 10
    //   208: fload_0
    //   209: fstore_1
    //   210: goto -142 -> 68
    //   213: aload_3
    //   214: ldc -92
    //   216: invokevirtual 145	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   219: ifeq +182 -> 401
    //   222: aload_3
    //   223: bipush 58
    //   225: invokevirtual 149	java/lang/String:indexOf	(I)I
    //   228: istore 6
    //   230: iload 6
    //   232: iconst_1
    //   233: if_icmple +48 -> 281
    //   236: aload_3
    //   237: iload 6
    //   239: iconst_1
    //   240: iadd
    //   241: aload_3
    //   242: invokevirtual 152	java/lang/String:length	()I
    //   245: invokevirtual 156	java/lang/String:substring	(II)Ljava/lang/String;
    //   248: invokevirtual 159	java/lang/String:trim	()Ljava/lang/String;
    //   251: astore 4
    //   253: aload 4
    //   255: ifnull +26 -> 281
    //   258: aload 4
    //   260: invokevirtual 152	java/lang/String:length	()I
    //   263: ifle +18 -> 281
    //   266: aload 4
    //   268: ldc -90
    //   270: invokevirtual 169	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   273: ifeq +62 -> 335
    //   276: bipush 8
    //   278: putstatic 58	com/tencent/av/sdk/AVClientInfo:mCpuArchitecture	I
    //   281: aload_3
    //   282: ldc -85
    //   284: invokevirtual 175	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   287: ifeq -252 -> 35
    //   290: iconst_5
    //   291: putstatic 58	com/tencent/av/sdk/AVClientInfo:mCpuArchitecture	I
    //   294: goto -259 -> 35
    //   297: astore_3
    //   298: lload 8
    //   300: lstore 10
    //   302: fload_0
    //   303: fstore_1
    //   304: aload_2
    //   305: ifnull -237 -> 68
    //   308: aload_2
    //   309: invokevirtual 127	java/io/BufferedReader:close	()V
    //   312: lload 8
    //   314: lstore 10
    //   316: fload_0
    //   317: fstore_1
    //   318: goto -250 -> 68
    //   321: astore_2
    //   322: aload_2
    //   323: invokevirtual 162	java/io/IOException:printStackTrace	()V
    //   326: lload 8
    //   328: lstore 10
    //   330: fload_0
    //   331: fstore_1
    //   332: goto -264 -> 68
    //   335: aload 4
    //   337: invokestatic 181	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   340: l2i
    //   341: putstatic 58	com/tencent/av/sdk/AVClientInfo:mCpuArchitecture	I
    //   344: goto -63 -> 281
    //   347: astore 5
    //   349: iconst_1
    //   350: istore 6
    //   352: aload 4
    //   354: invokevirtual 152	java/lang/String:length	()I
    //   357: istore 7
    //   359: iload 6
    //   361: iload 7
    //   363: if_icmpge -82 -> 281
    //   366: aload 4
    //   368: iconst_0
    //   369: aload 4
    //   371: invokevirtual 152	java/lang/String:length	()I
    //   374: iload 6
    //   376: isub
    //   377: invokevirtual 156	java/lang/String:substring	(II)Ljava/lang/String;
    //   380: invokestatic 181	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   383: l2i
    //   384: putstatic 58	com/tencent/av/sdk/AVClientInfo:mCpuArchitecture	I
    //   387: goto -106 -> 281
    //   390: astore 5
    //   392: iload 6
    //   394: iconst_1
    //   395: iadd
    //   396: istore 6
    //   398: goto -46 -> 352
    //   401: aload_3
    //   402: ldc -73
    //   404: invokevirtual 145	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   407: ifeq +76 -> 483
    //   410: aload_3
    //   411: bipush 58
    //   413: invokevirtual 149	java/lang/String:indexOf	(I)I
    //   416: istore 6
    //   418: iload 6
    //   420: iconst_1
    //   421: if_icmple -386 -> 35
    //   424: aload_3
    //   425: iload 6
    //   427: iconst_1
    //   428: iadd
    //   429: aload_3
    //   430: invokevirtual 152	java/lang/String:length	()I
    //   433: invokevirtual 156	java/lang/String:substring	(II)Ljava/lang/String;
    //   436: invokevirtual 159	java/lang/String:trim	()Ljava/lang/String;
    //   439: putstatic 52	com/tencent/av/sdk/AVClientInfo:mFeature	Ljava/lang/String;
    //   442: goto -407 -> 35
    //   445: astore_3
    //   446: lload 8
    //   448: lstore 10
    //   450: fload_0
    //   451: fstore_1
    //   452: aload_2
    //   453: ifnull -385 -> 68
    //   456: aload_2
    //   457: invokevirtual 127	java/io/BufferedReader:close	()V
    //   460: lload 8
    //   462: lstore 10
    //   464: fload_0
    //   465: fstore_1
    //   466: goto -398 -> 68
    //   469: astore_2
    //   470: aload_2
    //   471: invokevirtual 162	java/io/IOException:printStackTrace	()V
    //   474: lload 8
    //   476: lstore 10
    //   478: fload_0
    //   479: fstore_1
    //   480: goto -412 -> 68
    //   483: aload_3
    //   484: ldc -71
    //   486: invokevirtual 145	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   489: ifeq +55 -> 544
    //   492: aload_3
    //   493: bipush 58
    //   495: invokevirtual 149	java/lang/String:indexOf	(I)I
    //   498: istore 6
    //   500: iload 6
    //   502: iconst_1
    //   503: if_icmple -468 -> 35
    //   506: aload_3
    //   507: iload 6
    //   509: iconst_1
    //   510: iadd
    //   511: aload_3
    //   512: invokevirtual 152	java/lang/String:length	()I
    //   515: invokevirtual 156	java/lang/String:substring	(II)Ljava/lang/String;
    //   518: invokevirtual 159	java/lang/String:trim	()Ljava/lang/String;
    //   521: putstatic 54	com/tencent/av/sdk/AVClientInfo:mVendorId	Ljava/lang/String;
    //   524: goto -489 -> 35
    //   527: astore 4
    //   529: aload_2
    //   530: astore_3
    //   531: aload 4
    //   533: astore_2
    //   534: aload_3
    //   535: ifnull +7 -> 542
    //   538: aload_3
    //   539: invokevirtual 127	java/io/BufferedReader:close	()V
    //   542: aload_2
    //   543: athrow
    //   544: aload_3
    //   545: ldc -69
    //   547: invokevirtual 145	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   550: ifeq +26 -> 576
    //   553: aload_3
    //   554: invokevirtual 159	java/lang/String:trim	()Ljava/lang/String;
    //   557: putstatic 56	com/tencent/av/sdk/AVClientInfo:mHardware	Ljava/lang/String;
    //   560: aload_3
    //   561: ldc -67
    //   563: invokevirtual 175	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   566: ifeq -531 -> 35
    //   569: iconst_1
    //   570: putstatic 74	com/tencent/av/sdk/AVClientInfo:mIsMarvell	Z
    //   573: goto -538 -> 35
    //   576: aload_3
    //   577: ldc -65
    //   579: invokevirtual 145	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   582: ifeq +65 -> 647
    //   585: aload_3
    //   586: bipush 58
    //   588: invokevirtual 149	java/lang/String:indexOf	(I)I
    //   591: istore 6
    //   593: iload 6
    //   595: iconst_1
    //   596: if_icmple -561 -> 35
    //   599: aload_3
    //   600: iload 6
    //   602: iconst_1
    //   603: iadd
    //   604: aload_3
    //   605: invokevirtual 152	java/lang/String:length	()I
    //   608: invokevirtual 156	java/lang/String:substring	(II)Ljava/lang/String;
    //   611: invokevirtual 159	java/lang/String:trim	()Ljava/lang/String;
    //   614: astore_3
    //   615: aload_3
    //   616: invokestatic 181	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   619: lstore 10
    //   621: lload 10
    //   623: lconst_0
    //   624: lcmp
    //   625: iflt -590 -> 35
    //   628: lconst_1
    //   629: lload 10
    //   631: ladd
    //   632: lload 8
    //   634: lcmp
    //   635: ifle -600 -> 35
    //   638: lconst_1
    //   639: lload 10
    //   641: ladd
    //   642: lstore 8
    //   644: goto -609 -> 35
    //   647: aload_3
    //   648: ldc -63
    //   650: invokevirtual 145	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   653: ifeq -618 -> 35
    //   656: aload_3
    //   657: bipush 58
    //   659: invokevirtual 149	java/lang/String:indexOf	(I)I
    //   662: istore 6
    //   664: iload 6
    //   666: iconst_1
    //   667: if_icmple -632 -> 35
    //   670: aload_3
    //   671: iload 6
    //   673: iconst_1
    //   674: iadd
    //   675: aload_3
    //   676: invokevirtual 152	java/lang/String:length	()I
    //   679: invokevirtual 156	java/lang/String:substring	(II)Ljava/lang/String;
    //   682: invokevirtual 159	java/lang/String:trim	()Ljava/lang/String;
    //   685: astore_3
    //   686: aload_3
    //   687: invokestatic 199	java/lang/Float:parseFloat	(Ljava/lang/String;)F
    //   690: fstore_1
    //   691: fload_1
    //   692: fload_0
    //   693: fcmpl
    //   694: ifle +150 -> 844
    //   697: fload_1
    //   698: fstore_0
    //   699: goto -664 -> 35
    //   702: astore_2
    //   703: aload_2
    //   704: invokevirtual 162	java/io/IOException:printStackTrace	()V
    //   707: lload 8
    //   709: lstore 10
    //   711: fload_0
    //   712: fstore_1
    //   713: goto -645 -> 68
    //   716: astore_3
    //   717: aload_3
    //   718: invokevirtual 162	java/io/IOException:printStackTrace	()V
    //   721: goto -179 -> 542
    //   724: lload 10
    //   726: lconst_0
    //   727: lcmp
    //   728: ifle -645 -> 83
    //   731: lload 10
    //   733: l2i
    //   734: putstatic 62	com/tencent/av/sdk/AVClientInfo:mCoreNumber	I
    //   737: goto -654 -> 83
    //   740: fload_1
    //   741: fconst_0
    //   742: fcmpl
    //   743: ifle -643 -> 100
    //   746: fload_1
    //   747: ldc -56
    //   749: fcmpg
    //   750: ifge +20 -> 770
    //   753: fload_1
    //   754: f2d
    //   755: ldc2_w 201
    //   758: dmul
    //   759: ldc2_w 203
    //   762: dmul
    //   763: d2l
    //   764: putstatic 60	com/tencent/av/sdk/AVClientInfo:mMaxCpuFreq	J
    //   767: goto -667 -> 100
    //   770: fload_1
    //   771: ldc -51
    //   773: fcmpl
    //   774: ifle +20 -> 794
    //   777: fload_1
    //   778: f2d
    //   779: ldc2_w 206
    //   782: ddiv
    //   783: ldc2_w 203
    //   786: dmul
    //   787: d2l
    //   788: putstatic 60	com/tencent/av/sdk/AVClientInfo:mMaxCpuFreq	J
    //   791: goto -691 -> 100
    //   794: ldc -48
    //   796: fload_1
    //   797: fmul
    //   798: f2l
    //   799: putstatic 60	com/tencent/av/sdk/AVClientInfo:mMaxCpuFreq	J
    //   802: goto -702 -> 100
    //   805: iconst_1
    //   806: putstatic 64	com/tencent/av/sdk/AVClientInfo:mfReadCpuInfo	Z
    //   809: goto -691 -> 118
    //   812: astore_3
    //   813: goto -778 -> 35
    //   816: astore_3
    //   817: goto -782 -> 35
    //   820: astore_2
    //   821: aconst_null
    //   822: astore_3
    //   823: goto -289 -> 534
    //   826: astore_2
    //   827: aconst_null
    //   828: astore_2
    //   829: goto -383 -> 446
    //   832: astore_2
    //   833: aconst_null
    //   834: astore_2
    //   835: goto -537 -> 298
    //   838: astore_2
    //   839: aload_3
    //   840: astore_2
    //   841: goto -665 -> 176
    //   844: goto -145 -> 699
    // Local variable table:
    //   start	length	slot	name	signature
    //   17	695	0	f1	float
    //   53	744	1	f2	float
    //   34	153	2	localBufferedReader	BufferedReader
    //   199	110	2	localIOException1	IOException
    //   321	136	2	localIOException2	IOException
    //   469	61	2	localIOException3	IOException
    //   533	10	2	localObject1	Object
    //   702	2	2	localIOException4	IOException
    //   820	1	2	localObject2	Object
    //   826	1	2	localNumberFormatException1	NumberFormatException
    //   828	1	2	localObject3	Object
    //   832	1	2	localIOException5	IOException
    //   834	1	2	localObject4	Object
    //   838	1	2	localFileNotFoundException1	FileNotFoundException
    //   840	1	2	localObject5	Object
    //   9	145	3	str1	String
    //   175	107	3	localFileNotFoundException2	FileNotFoundException
    //   297	133	3	localIOException6	IOException
    //   445	67	3	localNumberFormatException2	NumberFormatException
    //   530	157	3	localObject6	Object
    //   716	2	3	localIOException7	IOException
    //   812	1	3	localNumberFormatException3	NumberFormatException
    //   816	1	3	localNumberFormatException4	NumberFormatException
    //   822	18	3	localObject7	Object
    //   251	119	4	str2	String
    //   527	5	4	localObject8	Object
    //   347	1	5	localNumberFormatException5	NumberFormatException
    //   390	1	5	localNumberFormatException6	NumberFormatException
    //   71	604	6	i	int
    //   357	7	7	j	int
    //   13	695	8	l1	long
    //   50	682	10	l2	long
    // Exception table:
    //   from	to	target	type
    //   35	40	175	java/io/FileNotFoundException
    //   44	48	175	java/io/FileNotFoundException
    //   125	142	175	java/io/FileNotFoundException
    //   148	172	175	java/io/FileNotFoundException
    //   213	230	175	java/io/FileNotFoundException
    //   236	253	175	java/io/FileNotFoundException
    //   258	281	175	java/io/FileNotFoundException
    //   281	294	175	java/io/FileNotFoundException
    //   335	344	175	java/io/FileNotFoundException
    //   352	359	175	java/io/FileNotFoundException
    //   366	387	175	java/io/FileNotFoundException
    //   401	418	175	java/io/FileNotFoundException
    //   424	442	175	java/io/FileNotFoundException
    //   483	500	175	java/io/FileNotFoundException
    //   506	524	175	java/io/FileNotFoundException
    //   544	573	175	java/io/FileNotFoundException
    //   576	593	175	java/io/FileNotFoundException
    //   599	615	175	java/io/FileNotFoundException
    //   615	621	175	java/io/FileNotFoundException
    //   647	664	175	java/io/FileNotFoundException
    //   670	686	175	java/io/FileNotFoundException
    //   686	691	175	java/io/FileNotFoundException
    //   186	190	199	java/io/IOException
    //   35	40	297	java/io/IOException
    //   44	48	297	java/io/IOException
    //   125	142	297	java/io/IOException
    //   148	172	297	java/io/IOException
    //   213	230	297	java/io/IOException
    //   236	253	297	java/io/IOException
    //   258	281	297	java/io/IOException
    //   281	294	297	java/io/IOException
    //   335	344	297	java/io/IOException
    //   352	359	297	java/io/IOException
    //   366	387	297	java/io/IOException
    //   401	418	297	java/io/IOException
    //   424	442	297	java/io/IOException
    //   483	500	297	java/io/IOException
    //   506	524	297	java/io/IOException
    //   544	573	297	java/io/IOException
    //   576	593	297	java/io/IOException
    //   599	615	297	java/io/IOException
    //   615	621	297	java/io/IOException
    //   647	664	297	java/io/IOException
    //   670	686	297	java/io/IOException
    //   686	691	297	java/io/IOException
    //   308	312	321	java/io/IOException
    //   335	344	347	java/lang/NumberFormatException
    //   366	387	390	java/lang/NumberFormatException
    //   35	40	445	java/lang/NumberFormatException
    //   44	48	445	java/lang/NumberFormatException
    //   125	142	445	java/lang/NumberFormatException
    //   148	172	445	java/lang/NumberFormatException
    //   213	230	445	java/lang/NumberFormatException
    //   236	253	445	java/lang/NumberFormatException
    //   258	281	445	java/lang/NumberFormatException
    //   281	294	445	java/lang/NumberFormatException
    //   352	359	445	java/lang/NumberFormatException
    //   401	418	445	java/lang/NumberFormatException
    //   424	442	445	java/lang/NumberFormatException
    //   483	500	445	java/lang/NumberFormatException
    //   506	524	445	java/lang/NumberFormatException
    //   544	573	445	java/lang/NumberFormatException
    //   576	593	445	java/lang/NumberFormatException
    //   599	615	445	java/lang/NumberFormatException
    //   647	664	445	java/lang/NumberFormatException
    //   670	686	445	java/lang/NumberFormatException
    //   456	460	469	java/io/IOException
    //   35	40	527	finally
    //   44	48	527	finally
    //   125	142	527	finally
    //   148	172	527	finally
    //   213	230	527	finally
    //   236	253	527	finally
    //   258	281	527	finally
    //   281	294	527	finally
    //   335	344	527	finally
    //   352	359	527	finally
    //   366	387	527	finally
    //   401	418	527	finally
    //   424	442	527	finally
    //   483	500	527	finally
    //   506	524	527	finally
    //   544	573	527	finally
    //   576	593	527	finally
    //   599	615	527	finally
    //   615	621	527	finally
    //   647	664	527	finally
    //   670	686	527	finally
    //   686	691	527	finally
    //   58	62	702	java/io/IOException
    //   538	542	716	java/io/IOException
    //   615	621	812	java/lang/NumberFormatException
    //   686	691	816	java/lang/NumberFormatException
    //   18	35	820	finally
    //   18	35	826	java/lang/NumberFormatException
    //   18	35	832	java/io/IOException
    //   18	35	838	java/io/FileNotFoundException
  }
  
  public static String getCpuReport()
  {
    getCpuInfo();
    return "prcs(" + mProcessorName + ") " + "arch(" + mCpuArchitecture + ") " + "hard(" + mHardware + ") " + "chip(" + mChip + ") " + "freq(" + mMaxCpuFreq + ") " + "num(" + mCoreNumber + ")";
  }
  
  public static long getCurrentCpuFreq()
  {
    long l2 = 0L;
    String str1 = "";
    long l3 = l2;
    long l4 = l2;
    long l5 = l2;
    try
    {
      BufferedReader localBufferedReader = new BufferedReader(new FileReader("/sys/devices/system/cpu/cpu0/cpufreq/scaling_cur_freq"));
      long l1 = l2;
      if (localBufferedReader != null)
      {
        l3 = l2;
        l4 = l2;
        l5 = l2;
        String str2 = localBufferedReader.readLine();
        l3 = l2;
        l4 = l2;
        l5 = l2;
        if (!TextUtils.isEmpty(str2))
        {
          l3 = l2;
          l4 = l2;
          l5 = l2;
          str1 = str2.trim();
        }
        l1 = l2;
        if (str1 != null)
        {
          l1 = l2;
          l3 = l2;
          l4 = l2;
          l5 = l2;
          if (str1.length() > 0)
          {
            l3 = l2;
            l4 = l2;
            l5 = l2;
            l1 = Long.parseLong(str1);
          }
        }
        l3 = l1;
        l4 = l1;
        l5 = l1;
        localBufferedReader.close();
      }
      return l1;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      return l3;
    }
    catch (IOException localIOException)
    {
      return l4;
    }
    catch (FileNotFoundException localFileNotFoundException) {}
    return l5;
  }
  
  public static String getDeviceName()
  {
    return Build.MODEL;
  }
  
  public static String getDeviceNameForConfigSystem()
  {
    return Build.MANUFACTURER + "_" + Build.MODEL;
  }
  
  public static int getDeviceType()
  {
    return 101;
  }
  
  public static long getMaxCpuFreq()
  {
    getCpuInfo();
    return mMaxCpuFreq;
  }
  
  public static String getModelReport()
  {
    getCpuInfo();
    return "model(" + Build.MODEL + ") " + "Mnfc(" + Build.MANUFACTURER + ") " + "dev(" + Build.VERSION.INCREMENTAL + ") " + "sdk(" + Build.VERSION.SDK_INT + ") " + "gl(" + mOpenGLVersion + ")";
  }
  
  public static int getNumCores()
  {
    getCpuInfo();
    return mCoreNumber;
  }
  
  public static String getOSVersion()
  {
    return Build.VERSION.RELEASE;
  }
  
  public static int getOsType()
  {
    try
    {
      String str = Build.VERSION.RELEASE;
      if (str.equals("L")) {
        return 118;
      }
      if (Build.VERSION.SDK_INT == 20) {
        return 118;
      }
      if (Build.VERSION.SDK_INT <= 20)
      {
        int j = str.charAt(0);
        int k = str.charAt(2);
        int i = 0;
        if (str.length() >= 5) {
          i = str.charAt(4);
        }
        switch (j)
        {
        default: 
          return 200;
        case 49: 
          if (k == 49) {
            return 101;
          }
          if (k == 53) {
            return 102;
          }
          if (k == 54) {
            return 103;
          }
          break;
        case 50: 
          if (k == 48)
          {
            if (i == 49) {
              return 105;
            }
            return 104;
          }
          if (k == 49) {
            return 106;
          }
          if (k == 50)
          {
            if (i == 49) {
              return 108;
            }
            return 107;
          }
          if ((k == 51) && (i >= 48) && (i <= 57)) {
            return 109;
          }
          break;
        case 51: 
          if (k == 48) {
            return 110;
          }
          if (k == 49) {
            return 111;
          }
          if (k == 50) {
            return 112;
          }
          break;
        case 52: 
          if (k == 48) {
            return 113;
          }
          if (k == 49) {
            return 114;
          }
          if (k == 50) {
            return 115;
          }
          if (k == 51) {
            return 116;
          }
          if (k == 52) {
            return 117;
          }
          break;
        case 53: 
          if (k == 48) {
            return 118;
          }
          break;
        }
      }
    }
    catch (Exception localException) {}
    return 200;
  }
  
  public static boolean isLowLevelDevice()
  {
    if (Build.VERSION.SDK_INT < 11) {}
    do
    {
      return true;
      if (mgNumCores == 0) {
        mgNumCores = getNumCores();
      }
      if (mgMaxCpuFreq == 0L) {
        mgMaxCpuFreq = getMaxCpuFreq();
      }
    } while ((mgNumCores <= 1) && (mgMaxCpuFreq <= 1025000L));
    return false;
  }
  
  static int readCpuArchitecture()
  {
    if (mProcessorName.contains("ARMv6")) {}
    do
    {
      return 2;
      if (Build.CPU_ABI.equalsIgnoreCase("armeabi-v7a")) {
        return 4;
      }
    } while (Build.CPU_ABI.equalsIgnoreCase("armeabi"));
    if ((mCpuArchitecture == 7) && (mFeature.indexOf("neon") < 0))
    {
      long l = getMaxCpuFreq();
      int i = getNumCores();
      if ((l < 1100000L) || (i < 2)) {
        return 3;
      }
    }
    if (Build.CPU_ABI.equalsIgnoreCase("x86")) {
      return 7;
    }
    switch (mCpuArchitecture)
    {
    case 6: 
    default: 
      if ((mVendorId != null) && ((mVendorId.equalsIgnoreCase("AuthenticAMD")) || (mVendorId.equalsIgnoreCase("GenuineIntel")))) {
        return 7;
      }
      break;
    case 5: 
      return 1;
    case 7: 
      return 4;
    case 8: 
      return 5;
    }
    return 0;
  }
  
  static long readMaxCpuFreq()
  {
    if (mCoreNumber < 1) {
      mCoreNumber = 8;
    }
    int i = 0;
    long l1 = 0L;
    long l2;
    for (;;)
    {
      l2 = l1;
      String str1;
      if (i < mCoreNumber) {
        str1 = "";
      }
      try
      {
        BufferedReader localBufferedReader = new BufferedReader(new FileReader("/sys/devices/system/cpu/cpu" + i + "/cpufreq/cpuinfo_max_freq"));
        l2 = l1;
        if (localBufferedReader != null)
        {
          String str2 = localBufferedReader.readLine();
          if (!TextUtils.isEmpty(str2)) {
            str1 = str2.trim();
          }
          l2 = l1;
          if (str1 != null)
          {
            l2 = l1;
            if (str1.length() > 0) {
              l2 = Long.parseLong(str1);
            }
          }
          localBufferedReader.close();
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          l2 = 0L;
        }
        i += 1;
        l1 = l2;
      }
      if (l2 > 0L) {
        return l2;
      }
    }
  }
  
  static int readNumCores()
  {
    try
    {
      int i = new File("/sys/devices/system/cpu/").listFiles(new AVClientInfo.1CpuFilter()).length;
      return i;
    }
    catch (Exception localException) {}
    return 0;
  }
  
  public int getCameraFacing()
  {
    int i = 1;
    if (Build.VERSION.SDK_INT > 9) {
      i = 2;
    }
    return i;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\sdk\AVClientInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */