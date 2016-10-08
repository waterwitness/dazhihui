package com.iflytek.cloud.util;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;

public class ResourceUtil
{
  public static final String ASR_RES_PATH = "asr_res_path";
  public static final String ENGINE_DESTROY = "engine_destroy";
  public static final String ENGINE_START = "engine_start";
  public static final String GRM_BUILD_PATH = "grm_build_path";
  public static final String IVW_RES_PATH = "ivw_res_path";
  public static final String TTS_RES_PATH = "tts_res_path";
  
  /* Error */
  private static String a(Context paramContext, ResourceUtil.RESOURCE_TYPE paramRESOURCE_TYPE, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aconst_null
    //   4: astore 5
    //   6: aload 5
    //   8: astore_3
    //   9: aload_2
    //   10: invokestatic 38	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   13: ifne +10 -> 23
    //   16: aload_0
    //   17: ifnonnull +8 -> 25
    //   20: aload 5
    //   22: astore_3
    //   23: aload_3
    //   24: areturn
    //   25: aload_0
    //   26: invokevirtual 44	android/content/Context:getPackageResourcePath	()Ljava/lang/String;
    //   29: astore_3
    //   30: aload_1
    //   31: getstatic 50	com/iflytek/cloud/util/ResourceUtil$RESOURCE_TYPE:assets	Lcom/iflytek/cloud/util/ResourceUtil$RESOURCE_TYPE;
    //   34: if_acmpne +97 -> 131
    //   37: aload_0
    //   38: invokevirtual 54	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   41: aload_2
    //   42: invokevirtual 60	android/content/res/AssetManager:openFd	(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
    //   45: astore_2
    //   46: aload_2
    //   47: astore_0
    //   48: aload_2
    //   49: astore_1
    //   50: aload_2
    //   51: invokevirtual 66	android/content/res/AssetFileDescriptor:getStartOffset	()J
    //   54: lstore 9
    //   56: aload_2
    //   57: astore_0
    //   58: aload_2
    //   59: astore_1
    //   60: aload_2
    //   61: invokevirtual 69	android/content/res/AssetFileDescriptor:getLength	()J
    //   64: lstore 7
    //   66: aload_2
    //   67: astore_0
    //   68: aload_2
    //   69: astore_1
    //   70: new 71	java/lang/StringBuilder
    //   73: dup
    //   74: invokespecial 72	java/lang/StringBuilder:<init>	()V
    //   77: ldc 74
    //   79: invokevirtual 78	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   82: aload_3
    //   83: invokevirtual 78	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   86: ldc 80
    //   88: invokevirtual 78	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   91: lload 9
    //   93: invokevirtual 83	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   96: ldc 80
    //   98: invokevirtual 78	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: lload 7
    //   103: invokevirtual 83	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   106: invokevirtual 86	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   109: astore_3
    //   110: aload_3
    //   111: astore_0
    //   112: aload_0
    //   113: astore_3
    //   114: aload_2
    //   115: ifnull -92 -> 23
    //   118: aload_2
    //   119: invokevirtual 89	android/content/res/AssetFileDescriptor:close	()V
    //   122: aload_0
    //   123: areturn
    //   124: astore_1
    //   125: aload_1
    //   126: invokevirtual 92	java/lang/Exception:printStackTrace	()V
    //   129: aload_0
    //   130: areturn
    //   131: aload_2
    //   132: invokestatic 98	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   135: invokevirtual 102	java/lang/Integer:intValue	()I
    //   138: istore 6
    //   140: aload_0
    //   141: invokevirtual 106	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   144: iload 6
    //   146: invokevirtual 112	android/content/res/Resources:openRawResourceFd	(I)Landroid/content/res/AssetFileDescriptor;
    //   149: astore_2
    //   150: aload_2
    //   151: astore_0
    //   152: aload_2
    //   153: astore_1
    //   154: aload_2
    //   155: invokevirtual 66	android/content/res/AssetFileDescriptor:getStartOffset	()J
    //   158: lstore 9
    //   160: aload_2
    //   161: astore_0
    //   162: aload_2
    //   163: astore_1
    //   164: aload_2
    //   165: invokevirtual 69	android/content/res/AssetFileDescriptor:getLength	()J
    //   168: lstore 7
    //   170: goto -104 -> 66
    //   173: astore_2
    //   174: aconst_null
    //   175: astore_1
    //   176: aload_1
    //   177: astore_0
    //   178: aload_2
    //   179: invokestatic 117	com/iflytek/thirdparty/X:a	(Ljava/lang/Throwable;)V
    //   182: aload 5
    //   184: astore_3
    //   185: aload_1
    //   186: ifnull -163 -> 23
    //   189: aload_1
    //   190: invokevirtual 89	android/content/res/AssetFileDescriptor:close	()V
    //   193: aconst_null
    //   194: areturn
    //   195: astore_1
    //   196: aload 4
    //   198: astore_0
    //   199: goto -74 -> 125
    //   202: astore_1
    //   203: aconst_null
    //   204: astore_0
    //   205: aload_0
    //   206: ifnull +7 -> 213
    //   209: aload_0
    //   210: invokevirtual 89	android/content/res/AssetFileDescriptor:close	()V
    //   213: aload_1
    //   214: athrow
    //   215: astore_0
    //   216: aload_0
    //   217: invokevirtual 92	java/lang/Exception:printStackTrace	()V
    //   220: goto -7 -> 213
    //   223: astore_1
    //   224: goto -19 -> 205
    //   227: astore_2
    //   228: goto -52 -> 176
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	231	0	paramContext	Context
    //   0	231	1	paramRESOURCE_TYPE	ResourceUtil.RESOURCE_TYPE
    //   0	231	2	paramString	String
    //   8	177	3	localObject1	Object
    //   1	196	4	localObject2	Object
    //   4	179	5	localObject3	Object
    //   138	7	6	i	int
    //   64	105	7	l1	long
    //   54	105	9	l2	long
    // Exception table:
    //   from	to	target	type
    //   118	122	124	java/lang/Exception
    //   30	46	173	java/lang/Exception
    //   131	150	173	java/lang/Exception
    //   189	193	195	java/lang/Exception
    //   30	46	202	finally
    //   131	150	202	finally
    //   209	213	215	java/lang/Exception
    //   50	56	223	finally
    //   60	66	223	finally
    //   70	110	223	finally
    //   154	160	223	finally
    //   164	170	223	finally
    //   178	182	223	finally
    //   50	56	227	java/lang/Exception
    //   60	66	227	java/lang/Exception
    //   70	110	227	java/lang/Exception
    //   154	160	227	java/lang/Exception
    //   164	170	227	java/lang/Exception
  }
  
  private static String a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {}
    File localFile;
    do
    {
      return null;
      localFile = new File(paramString);
    } while ((!localFile.exists()) || (!localFile.isFile()));
    long l = localFile.length();
    return "fo|" + paramString + "|" + 0L + "|" + l;
  }
  
  public static String generateResourcePath(Context paramContext, ResourceUtil.RESOURCE_TYPE paramRESOURCE_TYPE, String paramString)
  {
    if (paramRESOURCE_TYPE == ResourceUtil.RESOURCE_TYPE.path) {
      return a(paramString);
    }
    return a(paramContext, paramRESOURCE_TYPE, paramString);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\util\ResourceUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */