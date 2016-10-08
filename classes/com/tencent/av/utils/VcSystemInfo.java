package com.tencent.av.utils;

import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class VcSystemInfo
{
  public static final int CHIP_ARM_V5 = 1;
  public static final int CHIP_ARM_V6 = 2;
  public static final int CHIP_ARM_V7_NENO = 4;
  public static final int CHIP_ARM_V7_NO_NENO = 3;
  public static final int CHIP_ARM_V8 = 5;
  public static final int CHIP_MIPS = 6;
  public static final int CHIP_UNKNOW = 0;
  public static final int CHIP_X86 = 7;
  static final String TAG = "VcSystemInfo";
  static int mChip;
  static int mCoreNumber;
  static int mCpuArchitecture;
  static long mCurrCpuFreq;
  static String mFeature;
  static String mHardware;
  static boolean mIsMarvell;
  static boolean mIsSupportSharpAudio;
  static boolean mIsSupportSharpVideo;
  static long mMaxCpuFreq;
  static int mOpenGLVersion;
  static String mProcessorName = "";
  static String mVendorId;
  static boolean mfReadCpuInfo;
  static long mgMaxCpuFreq = 0L;
  static int mgNumCores;
  int mScreenHeight = 480;
  int mScreenWidth = 320;
  public int mdispHeight = 240;
  public int mdispWidth = 320;
  
  static
  {
    mFeature = "";
    mVendorId = null;
    mHardware = null;
    mCpuArchitecture = 5;
    mMaxCpuFreq = 0L;
    mCoreNumber = 1;
    mCurrCpuFreq = 0L;
    mfReadCpuInfo = false;
    mOpenGLVersion = 2;
    mChip = 1;
    mIsSupportSharpAudio = true;
    mIsSupportSharpVideo = true;
    mIsMarvell = false;
    mgNumCores = 0;
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
    //   0: getstatic 69	com/tencent/av/utils/VcSystemInfo:mfReadCpuInfo	Z
    //   3: iconst_1
    //   4: if_icmpne +4 -> 8
    //   7: return
    //   8: aconst_null
    //   9: astore_3
    //   10: ldc2_w 109
    //   13: lstore 8
    //   15: ldc 111
    //   17: fstore_0
    //   18: new 113	java/io/BufferedReader
    //   21: dup
    //   22: new 115	java/io/FileReader
    //   25: dup
    //   26: ldc 117
    //   28: invokespecial 120	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   31: invokespecial 123	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   34: astore_2
    //   35: aload_2
    //   36: invokevirtual 126	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   39: astore_3
    //   40: aload_3
    //   41: ifnonnull +253 -> 294
    //   44: iconst_1
    //   45: putstatic 69	com/tencent/av/utils/VcSystemInfo:mfReadCpuInfo	Z
    //   48: lload 8
    //   50: lstore 10
    //   52: fload_0
    //   53: fstore_1
    //   54: aload_2
    //   55: ifnull +13 -> 68
    //   58: aload_2
    //   59: invokevirtual 129	java/io/BufferedReader:close	()V
    //   62: fload_0
    //   63: fstore_1
    //   64: lload 8
    //   66: lstore 10
    //   68: invokestatic 133	com/tencent/av/utils/VcSystemInfo:readMaxCpuFreq	()J
    //   71: lstore 8
    //   73: lload 8
    //   75: lconst_0
    //   76: lcmp
    //   77: ifle +1012 -> 1089
    //   80: lload 8
    //   82: putstatic 63	com/tencent/av/utils/VcSystemInfo:mMaxCpuFreq	J
    //   85: invokestatic 139	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   88: ifeq +30 -> 118
    //   91: ldc 25
    //   93: iconst_0
    //   94: new 141	java/lang/StringBuilder
    //   97: dup
    //   98: invokespecial 142	java/lang/StringBuilder:<init>	()V
    //   101: ldc -112
    //   103: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   106: getstatic 63	com/tencent/av/utils/VcSystemInfo:mMaxCpuFreq	J
    //   109: invokevirtual 151	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   112: invokevirtual 154	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   115: invokestatic 158	com/tencent/av/utils/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   118: invokestatic 161	com/tencent/av/utils/VcSystemInfo:getCurrentCpuFreq	()J
    //   121: lstore 8
    //   123: lload 8
    //   125: lconst_0
    //   126: lcmp
    //   127: ifle +41 -> 168
    //   130: lload 8
    //   132: putstatic 67	com/tencent/av/utils/VcSystemInfo:mCurrCpuFreq	J
    //   135: invokestatic 139	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   138: ifeq +30 -> 168
    //   141: ldc 25
    //   143: iconst_0
    //   144: new 141	java/lang/StringBuilder
    //   147: dup
    //   148: invokespecial 142	java/lang/StringBuilder:<init>	()V
    //   151: ldc -93
    //   153: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   156: getstatic 67	com/tencent/av/utils/VcSystemInfo:mCurrCpuFreq	J
    //   159: invokevirtual 151	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   162: invokevirtual 154	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   165: invokestatic 158	com/tencent/av/utils/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   168: invokestatic 166	com/tencent/av/utils/VcSystemInfo:readNumCores	()I
    //   171: istore 6
    //   173: iload 6
    //   175: ifle +1004 -> 1179
    //   178: iload 6
    //   180: putstatic 65	com/tencent/av/utils/VcSystemInfo:mCoreNumber	I
    //   183: invokestatic 139	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   186: ifeq +30 -> 216
    //   189: ldc 25
    //   191: iconst_0
    //   192: new 141	java/lang/StringBuilder
    //   195: dup
    //   196: invokespecial 142	java/lang/StringBuilder:<init>	()V
    //   199: ldc -88
    //   201: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   204: getstatic 65	com/tencent/av/utils/VcSystemInfo:mCoreNumber	I
    //   207: invokevirtual 171	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   210: invokevirtual 154	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   213: invokestatic 158	com/tencent/av/utils/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   216: invokestatic 174	com/tencent/av/utils/VcSystemInfo:readCpuArchitecture	()I
    //   219: putstatic 73	com/tencent/av/utils/VcSystemInfo:mChip	I
    //   222: invokestatic 177	com/tencent/av/utils/VcSystemInfo:readSupportSharpAudio	()Z
    //   225: putstatic 75	com/tencent/av/utils/VcSystemInfo:mIsSupportSharpAudio	Z
    //   228: getstatic 75	com/tencent/av/utils/VcSystemInfo:mIsSupportSharpAudio	Z
    //   231: ifeq +998 -> 1229
    //   234: iconst_1
    //   235: putstatic 77	com/tencent/av/utils/VcSystemInfo:mIsSupportSharpVideo	Z
    //   238: invokestatic 139	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   241: ifeq -234 -> 7
    //   244: ldc 25
    //   246: iconst_0
    //   247: new 141	java/lang/StringBuilder
    //   250: dup
    //   251: invokespecial 142	java/lang/StringBuilder:<init>	()V
    //   254: ldc -77
    //   256: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   259: getstatic 73	com/tencent/av/utils/VcSystemInfo:mChip	I
    //   262: invokevirtual 171	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   265: ldc -75
    //   267: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   270: getstatic 77	com/tencent/av/utils/VcSystemInfo:mIsSupportSharpVideo	Z
    //   273: invokevirtual 184	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   276: ldc -70
    //   278: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   281: getstatic 75	com/tencent/av/utils/VcSystemInfo:mIsSupportSharpAudio	Z
    //   284: invokevirtual 184	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   287: invokevirtual 154	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   290: invokestatic 158	com/tencent/av/utils/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   293: return
    //   294: aload_3
    //   295: ldc -68
    //   297: invokevirtual 194	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   300: ifeq +124 -> 424
    //   303: aload_3
    //   304: bipush 58
    //   306: invokevirtual 198	java/lang/String:indexOf	(I)I
    //   309: istore 6
    //   311: iload 6
    //   313: iconst_1
    //   314: if_icmple -279 -> 35
    //   317: aload_3
    //   318: iload 6
    //   320: iconst_1
    //   321: iadd
    //   322: aload_3
    //   323: invokevirtual 201	java/lang/String:length	()I
    //   326: invokevirtual 205	java/lang/String:substring	(II)Ljava/lang/String;
    //   329: putstatic 53	com/tencent/av/utils/VcSystemInfo:mProcessorName	Ljava/lang/String;
    //   332: getstatic 53	com/tencent/av/utils/VcSystemInfo:mProcessorName	Ljava/lang/String;
    //   335: invokevirtual 208	java/lang/String:trim	()Ljava/lang/String;
    //   338: putstatic 53	com/tencent/av/utils/VcSystemInfo:mProcessorName	Ljava/lang/String;
    //   341: invokestatic 139	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   344: ifeq -309 -> 35
    //   347: ldc 25
    //   349: iconst_0
    //   350: new 141	java/lang/StringBuilder
    //   353: dup
    //   354: invokespecial 142	java/lang/StringBuilder:<init>	()V
    //   357: ldc -46
    //   359: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   362: getstatic 53	com/tencent/av/utils/VcSystemInfo:mProcessorName	Ljava/lang/String;
    //   365: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   368: ldc -44
    //   370: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   373: aload_3
    //   374: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   377: invokevirtual 154	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   380: invokestatic 158	com/tencent/av/utils/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   383: goto -348 -> 35
    //   386: astore_3
    //   387: lload 8
    //   389: lstore 10
    //   391: fload_0
    //   392: fstore_1
    //   393: aload_2
    //   394: ifnull -326 -> 68
    //   397: aload_2
    //   398: invokevirtual 129	java/io/BufferedReader:close	()V
    //   401: lload 8
    //   403: lstore 10
    //   405: fload_0
    //   406: fstore_1
    //   407: goto -339 -> 68
    //   410: astore_2
    //   411: aload_2
    //   412: invokevirtual 215	java/io/IOException:printStackTrace	()V
    //   415: lload 8
    //   417: lstore 10
    //   419: fload_0
    //   420: fstore_1
    //   421: goto -353 -> 68
    //   424: aload_3
    //   425: ldc -39
    //   427: invokevirtual 194	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   430: ifeq +210 -> 640
    //   433: aload_3
    //   434: bipush 58
    //   436: invokevirtual 198	java/lang/String:indexOf	(I)I
    //   439: istore 6
    //   441: iload 6
    //   443: iconst_1
    //   444: if_icmple +46 -> 490
    //   447: aload_3
    //   448: iload 6
    //   450: iconst_1
    //   451: iadd
    //   452: aload_3
    //   453: invokevirtual 201	java/lang/String:length	()I
    //   456: invokevirtual 205	java/lang/String:substring	(II)Ljava/lang/String;
    //   459: invokevirtual 208	java/lang/String:trim	()Ljava/lang/String;
    //   462: astore 4
    //   464: aload 4
    //   466: ifnull +24 -> 490
    //   469: aload 4
    //   471: invokevirtual 201	java/lang/String:length	()I
    //   474: istore 6
    //   476: iload 6
    //   478: ifle +12 -> 490
    //   481: aload 4
    //   483: invokestatic 223	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   486: l2i
    //   487: putstatic 61	com/tencent/av/utils/VcSystemInfo:mCpuArchitecture	I
    //   490: aload_3
    //   491: ldc -31
    //   493: invokevirtual 229	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   496: ifeq +7 -> 503
    //   499: iconst_5
    //   500: putstatic 61	com/tencent/av/utils/VcSystemInfo:mCpuArchitecture	I
    //   503: invokestatic 139	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   506: ifeq -471 -> 35
    //   509: ldc 25
    //   511: iconst_0
    //   512: new 141	java/lang/StringBuilder
    //   515: dup
    //   516: invokespecial 142	java/lang/StringBuilder:<init>	()V
    //   519: ldc -25
    //   521: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   524: getstatic 61	com/tencent/av/utils/VcSystemInfo:mCpuArchitecture	I
    //   527: invokevirtual 171	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   530: ldc -44
    //   532: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   535: aload_3
    //   536: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   539: invokevirtual 154	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   542: invokestatic 158	com/tencent/av/utils/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   545: goto -510 -> 35
    //   548: astore_3
    //   549: lload 8
    //   551: lstore 10
    //   553: fload_0
    //   554: fstore_1
    //   555: aload_2
    //   556: ifnull -488 -> 68
    //   559: aload_2
    //   560: invokevirtual 129	java/io/BufferedReader:close	()V
    //   563: lload 8
    //   565: lstore 10
    //   567: fload_0
    //   568: fstore_1
    //   569: goto -501 -> 68
    //   572: astore_2
    //   573: aload_2
    //   574: invokevirtual 215	java/io/IOException:printStackTrace	()V
    //   577: lload 8
    //   579: lstore 10
    //   581: fload_0
    //   582: fstore_1
    //   583: goto -515 -> 68
    //   586: astore 5
    //   588: iconst_1
    //   589: istore 6
    //   591: aload 4
    //   593: invokevirtual 201	java/lang/String:length	()I
    //   596: istore 7
    //   598: iload 6
    //   600: iload 7
    //   602: if_icmpge -112 -> 490
    //   605: aload 4
    //   607: iconst_0
    //   608: aload 4
    //   610: invokevirtual 201	java/lang/String:length	()I
    //   613: iload 6
    //   615: isub
    //   616: invokevirtual 205	java/lang/String:substring	(II)Ljava/lang/String;
    //   619: invokestatic 223	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   622: l2i
    //   623: putstatic 61	com/tencent/av/utils/VcSystemInfo:mCpuArchitecture	I
    //   626: goto -136 -> 490
    //   629: astore 5
    //   631: iload 6
    //   633: iconst_1
    //   634: iadd
    //   635: istore 6
    //   637: goto -46 -> 591
    //   640: aload_3
    //   641: ldc -23
    //   643: invokevirtual 194	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   646: ifeq +118 -> 764
    //   649: aload_3
    //   650: bipush 58
    //   652: invokevirtual 198	java/lang/String:indexOf	(I)I
    //   655: istore 6
    //   657: iload 6
    //   659: iconst_1
    //   660: if_icmple +21 -> 681
    //   663: aload_3
    //   664: iload 6
    //   666: iconst_1
    //   667: iadd
    //   668: aload_3
    //   669: invokevirtual 201	java/lang/String:length	()I
    //   672: invokevirtual 205	java/lang/String:substring	(II)Ljava/lang/String;
    //   675: invokevirtual 208	java/lang/String:trim	()Ljava/lang/String;
    //   678: putstatic 55	com/tencent/av/utils/VcSystemInfo:mFeature	Ljava/lang/String;
    //   681: invokestatic 139	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   684: ifeq -649 -> 35
    //   687: ldc 25
    //   689: iconst_0
    //   690: new 141	java/lang/StringBuilder
    //   693: dup
    //   694: invokespecial 142	java/lang/StringBuilder:<init>	()V
    //   697: ldc -21
    //   699: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   702: getstatic 55	com/tencent/av/utils/VcSystemInfo:mFeature	Ljava/lang/String;
    //   705: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   708: ldc -44
    //   710: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   713: aload_3
    //   714: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   717: invokevirtual 154	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   720: invokestatic 158	com/tencent/av/utils/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   723: goto -688 -> 35
    //   726: astore_3
    //   727: lload 8
    //   729: lstore 10
    //   731: fload_0
    //   732: fstore_1
    //   733: aload_2
    //   734: ifnull -666 -> 68
    //   737: aload_2
    //   738: invokevirtual 129	java/io/BufferedReader:close	()V
    //   741: lload 8
    //   743: lstore 10
    //   745: fload_0
    //   746: fstore_1
    //   747: goto -679 -> 68
    //   750: astore_2
    //   751: aload_2
    //   752: invokevirtual 215	java/io/IOException:printStackTrace	()V
    //   755: lload 8
    //   757: lstore 10
    //   759: fload_0
    //   760: fstore_1
    //   761: goto -693 -> 68
    //   764: aload_3
    //   765: ldc -19
    //   767: invokevirtual 194	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   770: ifeq +97 -> 867
    //   773: aload_3
    //   774: bipush 58
    //   776: invokevirtual 198	java/lang/String:indexOf	(I)I
    //   779: istore 6
    //   781: iload 6
    //   783: iconst_1
    //   784: if_icmple +21 -> 805
    //   787: aload_3
    //   788: iload 6
    //   790: iconst_1
    //   791: iadd
    //   792: aload_3
    //   793: invokevirtual 201	java/lang/String:length	()I
    //   796: invokevirtual 205	java/lang/String:substring	(II)Ljava/lang/String;
    //   799: invokevirtual 208	java/lang/String:trim	()Ljava/lang/String;
    //   802: putstatic 57	com/tencent/av/utils/VcSystemInfo:mVendorId	Ljava/lang/String;
    //   805: invokestatic 139	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   808: ifeq -773 -> 35
    //   811: ldc 25
    //   813: iconst_0
    //   814: new 141	java/lang/StringBuilder
    //   817: dup
    //   818: invokespecial 142	java/lang/StringBuilder:<init>	()V
    //   821: ldc -17
    //   823: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   826: getstatic 57	com/tencent/av/utils/VcSystemInfo:mVendorId	Ljava/lang/String;
    //   829: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   832: ldc -44
    //   834: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   837: aload_3
    //   838: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   841: invokevirtual 154	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   844: invokestatic 158	com/tencent/av/utils/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   847: goto -812 -> 35
    //   850: astore 4
    //   852: aload_2
    //   853: astore_3
    //   854: aload 4
    //   856: astore_2
    //   857: aload_3
    //   858: ifnull +7 -> 865
    //   861: aload_3
    //   862: invokevirtual 129	java/io/BufferedReader:close	()V
    //   865: aload_2
    //   866: athrow
    //   867: aload_3
    //   868: ldc -15
    //   870: invokevirtual 194	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   873: ifeq +68 -> 941
    //   876: aload_3
    //   877: invokevirtual 208	java/lang/String:trim	()Ljava/lang/String;
    //   880: putstatic 59	com/tencent/av/utils/VcSystemInfo:mHardware	Ljava/lang/String;
    //   883: aload_3
    //   884: ldc -13
    //   886: invokevirtual 229	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   889: ifeq +7 -> 896
    //   892: iconst_1
    //   893: putstatic 79	com/tencent/av/utils/VcSystemInfo:mIsMarvell	Z
    //   896: invokestatic 139	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   899: ifeq -864 -> 35
    //   902: ldc 25
    //   904: iconst_0
    //   905: new 141	java/lang/StringBuilder
    //   908: dup
    //   909: invokespecial 142	java/lang/StringBuilder:<init>	()V
    //   912: ldc -11
    //   914: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   917: getstatic 79	com/tencent/av/utils/VcSystemInfo:mIsMarvell	Z
    //   920: invokevirtual 184	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   923: ldc -44
    //   925: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   928: aload_3
    //   929: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   932: invokevirtual 154	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   935: invokestatic 158	com/tencent/av/utils/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   938: goto -903 -> 35
    //   941: aload_3
    //   942: ldc -9
    //   944: invokevirtual 194	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   947: ifeq +65 -> 1012
    //   950: aload_3
    //   951: bipush 58
    //   953: invokevirtual 198	java/lang/String:indexOf	(I)I
    //   956: istore 6
    //   958: iload 6
    //   960: iconst_1
    //   961: if_icmple -926 -> 35
    //   964: aload_3
    //   965: iload 6
    //   967: iconst_1
    //   968: iadd
    //   969: aload_3
    //   970: invokevirtual 201	java/lang/String:length	()I
    //   973: invokevirtual 205	java/lang/String:substring	(II)Ljava/lang/String;
    //   976: invokevirtual 208	java/lang/String:trim	()Ljava/lang/String;
    //   979: astore_3
    //   980: aload_3
    //   981: invokestatic 223	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   984: lstore 10
    //   986: lload 10
    //   988: lconst_0
    //   989: lcmp
    //   990: iflt -955 -> 35
    //   993: lconst_1
    //   994: lload 10
    //   996: ladd
    //   997: lload 8
    //   999: lcmp
    //   1000: ifle -965 -> 35
    //   1003: lconst_1
    //   1004: lload 10
    //   1006: ladd
    //   1007: lstore 8
    //   1009: goto -974 -> 35
    //   1012: aload_3
    //   1013: ldc -7
    //   1015: invokevirtual 194	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   1018: ifeq -983 -> 35
    //   1021: aload_3
    //   1022: bipush 58
    //   1024: invokevirtual 198	java/lang/String:indexOf	(I)I
    //   1027: istore 6
    //   1029: iload 6
    //   1031: iconst_1
    //   1032: if_icmple -997 -> 35
    //   1035: aload_3
    //   1036: iload 6
    //   1038: iconst_1
    //   1039: iadd
    //   1040: aload_3
    //   1041: invokevirtual 201	java/lang/String:length	()I
    //   1044: invokevirtual 205	java/lang/String:substring	(II)Ljava/lang/String;
    //   1047: invokevirtual 208	java/lang/String:trim	()Ljava/lang/String;
    //   1050: astore_3
    //   1051: aload_3
    //   1052: invokestatic 255	java/lang/Float:parseFloat	(Ljava/lang/String;)F
    //   1055: fstore_1
    //   1056: fload_1
    //   1057: fload_0
    //   1058: fcmpl
    //   1059: ifle +209 -> 1268
    //   1062: fload_1
    //   1063: fstore_0
    //   1064: goto -1029 -> 35
    //   1067: astore_2
    //   1068: aload_2
    //   1069: invokevirtual 215	java/io/IOException:printStackTrace	()V
    //   1072: lload 8
    //   1074: lstore 10
    //   1076: fload_0
    //   1077: fstore_1
    //   1078: goto -1010 -> 68
    //   1081: astore_3
    //   1082: aload_3
    //   1083: invokevirtual 215	java/io/IOException:printStackTrace	()V
    //   1086: goto -221 -> 865
    //   1089: fload_1
    //   1090: fconst_0
    //   1091: fcmpl
    //   1092: ifle -974 -> 118
    //   1095: fload_1
    //   1096: ldc_w 256
    //   1099: fcmpg
    //   1100: ifge +54 -> 1154
    //   1103: fload_1
    //   1104: f2d
    //   1105: ldc2_w 257
    //   1108: dmul
    //   1109: ldc2_w 259
    //   1112: dmul
    //   1113: d2l
    //   1114: putstatic 63	com/tencent/av/utils/VcSystemInfo:mMaxCpuFreq	J
    //   1117: invokestatic 139	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   1120: ifeq -1002 -> 118
    //   1123: ldc 25
    //   1125: iconst_0
    //   1126: new 141	java/lang/StringBuilder
    //   1129: dup
    //   1130: invokespecial 142	java/lang/StringBuilder:<init>	()V
    //   1133: ldc_w 262
    //   1136: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1139: getstatic 63	com/tencent/av/utils/VcSystemInfo:mMaxCpuFreq	J
    //   1142: invokevirtual 151	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1145: invokevirtual 154	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1148: invokestatic 158	com/tencent/av/utils/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   1151: goto -1033 -> 118
    //   1154: fload_1
    //   1155: ldc_w 263
    //   1158: fcmpl
    //   1159: ifle -42 -> 1117
    //   1162: fload_1
    //   1163: f2d
    //   1164: ldc2_w 264
    //   1167: ddiv
    //   1168: ldc2_w 259
    //   1171: dmul
    //   1172: d2l
    //   1173: putstatic 63	com/tencent/av/utils/VcSystemInfo:mMaxCpuFreq	J
    //   1176: goto -59 -> 1117
    //   1179: lload 10
    //   1181: lconst_0
    //   1182: lcmp
    //   1183: ifle -967 -> 216
    //   1186: lload 10
    //   1188: l2i
    //   1189: putstatic 65	com/tencent/av/utils/VcSystemInfo:mCoreNumber	I
    //   1192: invokestatic 139	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   1195: ifeq -979 -> 216
    //   1198: ldc 25
    //   1200: iconst_0
    //   1201: new 141	java/lang/StringBuilder
    //   1204: dup
    //   1205: invokespecial 142	java/lang/StringBuilder:<init>	()V
    //   1208: ldc_w 267
    //   1211: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1214: getstatic 65	com/tencent/av/utils/VcSystemInfo:mCoreNumber	I
    //   1217: invokevirtual 171	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1220: invokevirtual 154	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1223: invokestatic 158	com/tencent/av/utils/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   1226: goto -1010 -> 216
    //   1229: iconst_0
    //   1230: putstatic 77	com/tencent/av/utils/VcSystemInfo:mIsSupportSharpVideo	Z
    //   1233: goto -995 -> 238
    //   1236: astore_3
    //   1237: goto -1202 -> 35
    //   1240: astore_3
    //   1241: goto -1206 -> 35
    //   1244: astore_2
    //   1245: aconst_null
    //   1246: astore_3
    //   1247: goto -390 -> 857
    //   1250: astore_2
    //   1251: aconst_null
    //   1252: astore_2
    //   1253: goto -526 -> 727
    //   1256: astore_2
    //   1257: aconst_null
    //   1258: astore_2
    //   1259: goto -710 -> 549
    //   1262: astore_2
    //   1263: aload_3
    //   1264: astore_2
    //   1265: goto -878 -> 387
    //   1268: goto -204 -> 1064
    // Local variable table:
    //   start	length	slot	name	signature
    //   17	1060	0	f1	float
    //   53	1110	1	f2	float
    //   34	364	2	localBufferedReader	BufferedReader
    //   410	150	2	localIOException1	IOException
    //   572	166	2	localIOException2	IOException
    //   750	103	2	localIOException3	IOException
    //   856	10	2	localObject1	Object
    //   1067	2	2	localIOException4	IOException
    //   1244	1	2	localObject2	Object
    //   1250	1	2	localNumberFormatException1	NumberFormatException
    //   1252	1	2	localObject3	Object
    //   1256	1	2	localIOException5	IOException
    //   1258	1	2	localObject4	Object
    //   1262	1	2	localFileNotFoundException1	FileNotFoundException
    //   1264	1	2	localObject5	Object
    //   9	365	3	str1	String
    //   386	150	3	localFileNotFoundException2	FileNotFoundException
    //   548	166	3	localIOException6	IOException
    //   726	112	3	localNumberFormatException2	NumberFormatException
    //   853	199	3	localObject6	Object
    //   1081	2	3	localIOException7	IOException
    //   1236	1	3	localNumberFormatException3	NumberFormatException
    //   1240	1	3	localNumberFormatException4	NumberFormatException
    //   1246	18	3	localObject7	Object
    //   462	147	4	str2	String
    //   850	5	4	localObject8	Object
    //   586	1	5	localNumberFormatException5	NumberFormatException
    //   629	1	5	localNumberFormatException6	NumberFormatException
    //   171	869	6	i	int
    //   596	7	7	j	int
    //   13	1060	8	l1	long
    //   50	1137	10	l2	long
    // Exception table:
    //   from	to	target	type
    //   35	40	386	java/io/FileNotFoundException
    //   44	48	386	java/io/FileNotFoundException
    //   294	311	386	java/io/FileNotFoundException
    //   317	383	386	java/io/FileNotFoundException
    //   424	441	386	java/io/FileNotFoundException
    //   447	464	386	java/io/FileNotFoundException
    //   469	476	386	java/io/FileNotFoundException
    //   481	490	386	java/io/FileNotFoundException
    //   490	503	386	java/io/FileNotFoundException
    //   503	545	386	java/io/FileNotFoundException
    //   591	598	386	java/io/FileNotFoundException
    //   605	626	386	java/io/FileNotFoundException
    //   640	657	386	java/io/FileNotFoundException
    //   663	681	386	java/io/FileNotFoundException
    //   681	723	386	java/io/FileNotFoundException
    //   764	781	386	java/io/FileNotFoundException
    //   787	805	386	java/io/FileNotFoundException
    //   805	847	386	java/io/FileNotFoundException
    //   867	896	386	java/io/FileNotFoundException
    //   896	938	386	java/io/FileNotFoundException
    //   941	958	386	java/io/FileNotFoundException
    //   964	980	386	java/io/FileNotFoundException
    //   980	986	386	java/io/FileNotFoundException
    //   1012	1029	386	java/io/FileNotFoundException
    //   1035	1051	386	java/io/FileNotFoundException
    //   1051	1056	386	java/io/FileNotFoundException
    //   397	401	410	java/io/IOException
    //   35	40	548	java/io/IOException
    //   44	48	548	java/io/IOException
    //   294	311	548	java/io/IOException
    //   317	383	548	java/io/IOException
    //   424	441	548	java/io/IOException
    //   447	464	548	java/io/IOException
    //   469	476	548	java/io/IOException
    //   481	490	548	java/io/IOException
    //   490	503	548	java/io/IOException
    //   503	545	548	java/io/IOException
    //   591	598	548	java/io/IOException
    //   605	626	548	java/io/IOException
    //   640	657	548	java/io/IOException
    //   663	681	548	java/io/IOException
    //   681	723	548	java/io/IOException
    //   764	781	548	java/io/IOException
    //   787	805	548	java/io/IOException
    //   805	847	548	java/io/IOException
    //   867	896	548	java/io/IOException
    //   896	938	548	java/io/IOException
    //   941	958	548	java/io/IOException
    //   964	980	548	java/io/IOException
    //   980	986	548	java/io/IOException
    //   1012	1029	548	java/io/IOException
    //   1035	1051	548	java/io/IOException
    //   1051	1056	548	java/io/IOException
    //   559	563	572	java/io/IOException
    //   481	490	586	java/lang/NumberFormatException
    //   605	626	629	java/lang/NumberFormatException
    //   35	40	726	java/lang/NumberFormatException
    //   44	48	726	java/lang/NumberFormatException
    //   294	311	726	java/lang/NumberFormatException
    //   317	383	726	java/lang/NumberFormatException
    //   424	441	726	java/lang/NumberFormatException
    //   447	464	726	java/lang/NumberFormatException
    //   469	476	726	java/lang/NumberFormatException
    //   490	503	726	java/lang/NumberFormatException
    //   503	545	726	java/lang/NumberFormatException
    //   591	598	726	java/lang/NumberFormatException
    //   640	657	726	java/lang/NumberFormatException
    //   663	681	726	java/lang/NumberFormatException
    //   681	723	726	java/lang/NumberFormatException
    //   764	781	726	java/lang/NumberFormatException
    //   787	805	726	java/lang/NumberFormatException
    //   805	847	726	java/lang/NumberFormatException
    //   867	896	726	java/lang/NumberFormatException
    //   896	938	726	java/lang/NumberFormatException
    //   941	958	726	java/lang/NumberFormatException
    //   964	980	726	java/lang/NumberFormatException
    //   1012	1029	726	java/lang/NumberFormatException
    //   1035	1051	726	java/lang/NumberFormatException
    //   737	741	750	java/io/IOException
    //   35	40	850	finally
    //   44	48	850	finally
    //   294	311	850	finally
    //   317	383	850	finally
    //   424	441	850	finally
    //   447	464	850	finally
    //   469	476	850	finally
    //   481	490	850	finally
    //   490	503	850	finally
    //   503	545	850	finally
    //   591	598	850	finally
    //   605	626	850	finally
    //   640	657	850	finally
    //   663	681	850	finally
    //   681	723	850	finally
    //   764	781	850	finally
    //   787	805	850	finally
    //   805	847	850	finally
    //   867	896	850	finally
    //   896	938	850	finally
    //   941	958	850	finally
    //   964	980	850	finally
    //   980	986	850	finally
    //   1012	1029	850	finally
    //   1035	1051	850	finally
    //   1051	1056	850	finally
    //   58	62	1067	java/io/IOException
    //   861	865	1081	java/io/IOException
    //   980	986	1236	java/lang/NumberFormatException
    //   1051	1056	1240	java/lang/NumberFormatException
    //   18	35	1244	finally
    //   18	35	1250	java/lang/NumberFormatException
    //   18	35	1256	java/io/IOException
    //   18	35	1262	java/io/FileNotFoundException
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
  
  public static boolean hasFeature(String paramString)
  {
    try
    {
      if ((mFeature == null) || (mFeature.equals(""))) {
        getCpuInfo();
      }
      int i = mFeature.indexOf(paramString);
      if (i > 0) {
        return true;
      }
    }
    catch (Exception paramString) {}
    return false;
  }
  
  public static boolean isBeautySupported()
  {
    return ((hasFeature("neon")) || (hasFeature("asimd"))) && (getNumCores() >= 2) && (getCpuArchitecture() >= 4);
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
  
  public static boolean isNormalSharp()
  {
    getCpuInfo();
    return (mChip >= 3) && (mMaxCpuFreq / 1000L >= 800L) && (Build.VERSION.SDK_INT >= 9);
  }
  
  public static boolean isSupportSharpAudio()
  {
    getCpuInfo();
    return mIsSupportSharpAudio;
  }
  
  public static boolean isSupportSharpVideo()
  {
    
    if (QLog.isColorLevel()) {
      QLog.d("VcSystemInfo", 0, "[isSupportSharpVideo] [CpuInfo] mProcessorName=" + mProcessorName + " \n" + "mCpuArchitecture=" + mCpuArchitecture + " \n" + "mFeature=" + mFeature + " \n" + "mVendorId=" + mVendorId + " \n" + "mMaxCpuFreq=" + mMaxCpuFreq + " \n" + "mCoreNumber=" + mCoreNumber + " \n" + "mOpenGLVersion=" + mOpenGLVersion + " \n" + "mIsMarvell=" + mIsMarvell + " \n" + "Chip=" + mChip + ", Video=" + mIsSupportSharpVideo + ", Audio=" + mIsSupportSharpAudio + " \n" + "devModel=" + Build.MODEL + " \n" + "devVersion=" + Build.VERSION.INCREMENTAL + " \n" + "devManufacturer=" + Build.MANUFACTURER + " \n" + "sdkVersion=" + Build.VERSION.SDK_INT + " \n");
    }
    return mIsSupportSharpVideo;
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
    long l2 = 0L;
    String str1 = "";
    long l3 = l2;
    long l4 = l2;
    long l5 = l2;
    try
    {
      BufferedReader localBufferedReader = new BufferedReader(new FileReader("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"));
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
  
  static int readNumCores()
  {
    try
    {
      int i = new File("/sys/devices/system/cpu/").listFiles(new VcSystemInfo.1CpuFilter()).length;
      return i;
    }
    catch (Exception localException) {}
    return 0;
  }
  
  static boolean readSupportSharpAudio()
  {
    String str1 = Build.MODEL;
    String str2 = Build.VERSION.INCREMENTAL;
    String str3 = Build.MANUFACTURER;
    int i = Build.VERSION.SDK_INT;
    if (QLog.isColorLevel()) {
      QLog.d("VcSystemInfo", 0, "Model: " + str1 + "\n" + "Version: " + str2 + "\n" + "Manufacturer: " + str3 + "\n" + "SDK Version: " + i);
    }
    if ((mChip < 1) || (i < 8)) {
      if (QLog.isColorLevel()) {
        QLog.d("VcSystemInfo", 0, "CHIP or SDK NOT_SUPPORT");
      }
    }
    do
    {
      do
      {
        do
        {
          return false;
          if ((!str3.equalsIgnoreCase("HUAWEI")) || (!str1.equalsIgnoreCase("C8500"))) {
            break;
          }
        } while (!QLog.isColorLevel());
        QLog.d("VcSystemInfo", 0, "DEVICE_NOT_SUPPORT");
        return false;
        if ((!str3.equalsIgnoreCase("Samsung")) || (!str1.equalsIgnoreCase("GT-I5508"))) {
          break;
        }
      } while (!QLog.isColorLevel());
      QLog.d("VcSystemInfo", 0, "DEVICE_NOT_SUPPORT");
      return false;
      if ((!str3.equalsIgnoreCase("FIH")) || (!str1.equalsIgnoreCase("SH8128U"))) {
        break;
      }
    } while (!QLog.isColorLevel());
    QLog.d("VcSystemInfo", 0, "DEVICE_NOT_SUPPORT");
    return false;
    return true;
  }
  
  public int getCameraFacing()
  {
    int i = 1;
    if (Build.VERSION.SDK_INT > 9) {
      i = 2;
    }
    return i;
  }
  
  public int getOsType()
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
  
  public void setDispSize(int paramInt1, int paramInt2)
  {
    this.mdispWidth = paramInt1;
    this.mdispHeight = paramInt2;
  }
  
  public void setScreenSize(int paramInt1, int paramInt2)
  {
    this.mScreenWidth = paramInt1;
    this.mScreenHeight = paramInt2;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\utils\VcSystemInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */