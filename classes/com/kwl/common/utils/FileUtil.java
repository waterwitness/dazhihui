package com.kwl.common.utils;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.Stack;

public class FileUtil
{
  private static final String APP_CONFIGS_FILE_NAME = "account_configs";
  public static final String FILE_EXTENSION_SEPARATOR = ".";
  
  public static int CopyRowDataToDisk(Resources paramResources, int paramInt, String paramString, boolean paramBoolean)
  {
    try
    {
      if (!makeFolders(paramString))
      {
        LogUtil.d("目录创建失败");
        return -1;
      }
      paramString = new File(paramString);
      if ((!paramBoolean) && (paramString.exists())) {
        break label50;
      }
      writeFile(paramString, paramResources.openRawResource(paramInt));
    }
    catch (Exception paramResources)
    {
      for (;;) {}
    }
    return 0;
    label50:
    return -1;
  }
  
  public static boolean ExistSDCard(Context paramContext)
  {
    return Environment.getExternalStorageState().equals("mounted");
  }
  
  public static boolean checkFileExist(File paramFile, String paramString)
  {
    File[] arrayOfFile = paramFile.listFiles();
    if (arrayOfFile == null) {
      return false;
    }
    int i = 0;
    label13:
    if (i < arrayOfFile.length)
    {
      if (!arrayOfFile[i].isDirectory()) {
        break label43;
      }
      checkFileExist(arrayOfFile[i], paramString);
    }
    label43:
    while (!arrayOfFile[i].getName().equals(paramString))
    {
      i += 1;
      break label13;
      break;
    }
    LogUtil.d(paramFile.getAbsolutePath() + "===" + arrayOfFile[i].getName());
    return true;
  }
  
  public static void copyAssetsToFiles(Context paramContext, String paramString1, String paramString2)
  {
    byte[] arrayOfByte = new byte['Ѐ'];
    try
    {
      paramString1 = StreamUtils.getAssetsAsStream(paramContext, paramString1);
      if (paramString1 != null)
      {
        paramContext = paramContext.openFileOutput(paramString2, 0);
        for (;;)
        {
          int i = paramString1.read(arrayOfByte);
          if (i == -1)
          {
            paramContext.close();
            paramString1.close();
            return;
          }
          paramContext.write(arrayOfByte, 0, i);
        }
      }
      return;
    }
    catch (FileNotFoundException paramContext)
    {
      paramContext.printStackTrace();
      return;
    }
    catch (IOException paramContext)
    {
      paramContext.printStackTrace();
    }
  }
  
  public static void copyAssetsToSDFiles(Context paramContext, String paramString1, String paramString2)
  {
    byte[] arrayOfByte = new byte['Ѐ'];
    try
    {
      paramContext = StreamUtils.getAssetsAsStream(paramContext, paramString1);
      if (paramContext != null)
      {
        paramString1 = new FileOutputStream(paramString2);
        for (;;)
        {
          int i = paramContext.read(arrayOfByte);
          if (i == -1)
          {
            paramString1.close();
            paramContext.close();
            return;
          }
          paramString1.write(arrayOfByte, 0, i);
        }
      }
      return;
    }
    catch (FileNotFoundException paramContext)
    {
      paramContext.printStackTrace();
      return;
    }
    catch (IOException paramContext)
    {
      paramContext.printStackTrace();
    }
  }
  
  /* Error */
  public static void copyFile(File paramFile1, File paramFile2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: new 143	java/io/BufferedInputStream
    //   8: dup
    //   9: new 145	java/io/FileInputStream
    //   12: dup
    //   13: aload_0
    //   14: invokespecial 148	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   17: invokespecial 151	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   20: astore_2
    //   21: new 153	java/io/BufferedOutputStream
    //   24: dup
    //   25: new 125	java/io/FileOutputStream
    //   28: dup
    //   29: aload_1
    //   30: invokespecial 154	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   33: invokespecial 157	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   36: astore_0
    //   37: sipush 5120
    //   40: newarray <illegal type>
    //   42: astore_1
    //   43: aload_2
    //   44: aload_1
    //   45: invokevirtual 158	java/io/BufferedInputStream:read	([B)I
    //   48: istore 5
    //   50: iload 5
    //   52: iconst_m1
    //   53: if_icmpne +24 -> 77
    //   56: aload_0
    //   57: invokevirtual 161	java/io/BufferedOutputStream:flush	()V
    //   60: aload_2
    //   61: ifnull +7 -> 68
    //   64: aload_2
    //   65: invokevirtual 162	java/io/BufferedInputStream:close	()V
    //   68: aload_0
    //   69: ifnull +7 -> 76
    //   72: aload_0
    //   73: invokevirtual 163	java/io/BufferedOutputStream:close	()V
    //   76: return
    //   77: aload_0
    //   78: aload_1
    //   79: iconst_0
    //   80: iload 5
    //   82: invokevirtual 164	java/io/BufferedOutputStream:write	([BII)V
    //   85: goto -42 -> 43
    //   88: astore_3
    //   89: aload_2
    //   90: astore_1
    //   91: aload_3
    //   92: astore_2
    //   93: aload_2
    //   94: invokevirtual 165	java/lang/Exception:printStackTrace	()V
    //   97: aload_1
    //   98: ifnull +7 -> 105
    //   101: aload_1
    //   102: invokevirtual 162	java/io/BufferedInputStream:close	()V
    //   105: aload_0
    //   106: ifnull -30 -> 76
    //   109: aload_0
    //   110: invokevirtual 163	java/io/BufferedOutputStream:close	()V
    //   113: return
    //   114: astore_0
    //   115: return
    //   116: astore_0
    //   117: aconst_null
    //   118: astore_2
    //   119: aload_3
    //   120: astore_1
    //   121: aload_2
    //   122: ifnull +7 -> 129
    //   125: aload_2
    //   126: invokevirtual 162	java/io/BufferedInputStream:close	()V
    //   129: aload_1
    //   130: ifnull +7 -> 137
    //   133: aload_1
    //   134: invokevirtual 163	java/io/BufferedOutputStream:close	()V
    //   137: aload_0
    //   138: athrow
    //   139: astore_0
    //   140: return
    //   141: astore_1
    //   142: goto -5 -> 137
    //   145: astore_0
    //   146: aload_3
    //   147: astore_1
    //   148: goto -27 -> 121
    //   151: astore_3
    //   152: aload_0
    //   153: astore_1
    //   154: aload_3
    //   155: astore_0
    //   156: goto -35 -> 121
    //   159: astore_3
    //   160: aload_1
    //   161: astore_2
    //   162: aload_0
    //   163: astore_1
    //   164: aload_3
    //   165: astore_0
    //   166: goto -45 -> 121
    //   169: astore_2
    //   170: aconst_null
    //   171: astore_0
    //   172: aload 4
    //   174: astore_1
    //   175: goto -82 -> 93
    //   178: astore_3
    //   179: aconst_null
    //   180: astore_0
    //   181: aload_2
    //   182: astore_1
    //   183: aload_3
    //   184: astore_2
    //   185: goto -92 -> 93
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	188	0	paramFile1	File
    //   0	188	1	paramFile2	File
    //   20	142	2	localObject1	Object
    //   169	13	2	localException1	Exception
    //   184	1	2	localException2	Exception
    //   1	1	3	localObject2	Object
    //   88	59	3	localException3	Exception
    //   151	4	3	localObject3	Object
    //   159	6	3	localObject4	Object
    //   178	6	3	localException4	Exception
    //   3	170	4	localObject5	Object
    //   48	33	5	i	int
    // Exception table:
    //   from	to	target	type
    //   37	43	88	java/lang/Exception
    //   43	50	88	java/lang/Exception
    //   56	60	88	java/lang/Exception
    //   77	85	88	java/lang/Exception
    //   101	105	114	java/io/IOException
    //   109	113	114	java/io/IOException
    //   5	21	116	finally
    //   64	68	139	java/io/IOException
    //   72	76	139	java/io/IOException
    //   125	129	141	java/io/IOException
    //   133	137	141	java/io/IOException
    //   21	37	145	finally
    //   37	43	151	finally
    //   43	50	151	finally
    //   56	60	151	finally
    //   77	85	151	finally
    //   93	97	159	finally
    //   5	21	169	java/lang/Exception
    //   21	37	178	java/lang/Exception
  }
  
  public static boolean copyFile(String paramString1, String paramString2, boolean paramBoolean)
  {
    try
    {
      paramString1 = readFileToByte(paramString1);
      if (paramBoolean) {}
      for (paramBoolean = false;; paramBoolean = true)
      {
        writeDataToFile(paramString1, paramString2, paramBoolean);
        return true;
      }
      return false;
    }
    catch (Exception paramString1) {}
  }
  
  /* Error */
  public static void cutFile(File paramFile1, File paramFile2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aconst_null
    //   4: astore_3
    //   5: new 143	java/io/BufferedInputStream
    //   8: dup
    //   9: new 145	java/io/FileInputStream
    //   12: dup
    //   13: aload_0
    //   14: invokespecial 148	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   17: invokespecial 151	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   20: astore_2
    //   21: new 153	java/io/BufferedOutputStream
    //   24: dup
    //   25: new 125	java/io/FileOutputStream
    //   28: dup
    //   29: aload_1
    //   30: invokespecial 154	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   33: invokespecial 157	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   36: astore_3
    //   37: sipush 5120
    //   40: newarray <illegal type>
    //   42: astore_1
    //   43: aload_2
    //   44: aload_1
    //   45: invokevirtual 158	java/io/BufferedInputStream:read	([B)I
    //   48: istore 5
    //   50: iload 5
    //   52: iconst_m1
    //   53: if_icmpne +33 -> 86
    //   56: aload_3
    //   57: invokevirtual 161	java/io/BufferedOutputStream:flush	()V
    //   60: aload_0
    //   61: invokevirtual 178	java/io/File:delete	()Z
    //   64: pop
    //   65: aload_0
    //   66: invokevirtual 181	java/io/File:deleteOnExit	()V
    //   69: aload_2
    //   70: ifnull +7 -> 77
    //   73: aload_2
    //   74: invokevirtual 162	java/io/BufferedInputStream:close	()V
    //   77: aload_3
    //   78: ifnull +7 -> 85
    //   81: aload_3
    //   82: invokevirtual 163	java/io/BufferedOutputStream:close	()V
    //   85: return
    //   86: aload_3
    //   87: aload_1
    //   88: iconst_0
    //   89: iload 5
    //   91: invokevirtual 164	java/io/BufferedOutputStream:write	([BII)V
    //   94: goto -51 -> 43
    //   97: astore 4
    //   99: aload_2
    //   100: astore_1
    //   101: aload_3
    //   102: astore_0
    //   103: aload 4
    //   105: astore_2
    //   106: aload_2
    //   107: invokevirtual 165	java/lang/Exception:printStackTrace	()V
    //   110: aload_1
    //   111: ifnull +7 -> 118
    //   114: aload_1
    //   115: invokevirtual 162	java/io/BufferedInputStream:close	()V
    //   118: aload_0
    //   119: ifnull -34 -> 85
    //   122: aload_0
    //   123: invokevirtual 163	java/io/BufferedOutputStream:close	()V
    //   126: return
    //   127: astore_0
    //   128: return
    //   129: astore_0
    //   130: aconst_null
    //   131: astore_2
    //   132: aload 4
    //   134: astore_1
    //   135: aload_2
    //   136: ifnull +7 -> 143
    //   139: aload_2
    //   140: invokevirtual 162	java/io/BufferedInputStream:close	()V
    //   143: aload_1
    //   144: ifnull +7 -> 151
    //   147: aload_1
    //   148: invokevirtual 163	java/io/BufferedOutputStream:close	()V
    //   151: aload_0
    //   152: athrow
    //   153: astore_0
    //   154: return
    //   155: astore_1
    //   156: goto -5 -> 151
    //   159: astore_0
    //   160: aload 4
    //   162: astore_1
    //   163: goto -28 -> 135
    //   166: astore_0
    //   167: aload_3
    //   168: astore_1
    //   169: goto -34 -> 135
    //   172: astore_3
    //   173: aload_1
    //   174: astore_2
    //   175: aload_0
    //   176: astore_1
    //   177: aload_3
    //   178: astore_0
    //   179: goto -44 -> 135
    //   182: astore_2
    //   183: aconst_null
    //   184: astore_0
    //   185: aload_3
    //   186: astore_1
    //   187: goto -81 -> 106
    //   190: astore_3
    //   191: aconst_null
    //   192: astore_0
    //   193: aload_2
    //   194: astore_1
    //   195: aload_3
    //   196: astore_2
    //   197: goto -91 -> 106
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	200	0	paramFile1	File
    //   0	200	1	paramFile2	File
    //   20	155	2	localObject1	Object
    //   182	12	2	localException1	Exception
    //   196	1	2	localException2	Exception
    //   4	164	3	localBufferedOutputStream	java.io.BufferedOutputStream
    //   172	14	3	localObject2	Object
    //   190	6	3	localException3	Exception
    //   1	1	4	localObject3	Object
    //   97	64	4	localException4	Exception
    //   48	42	5	i	int
    // Exception table:
    //   from	to	target	type
    //   37	43	97	java/lang/Exception
    //   43	50	97	java/lang/Exception
    //   56	69	97	java/lang/Exception
    //   86	94	97	java/lang/Exception
    //   114	118	127	java/io/IOException
    //   122	126	127	java/io/IOException
    //   5	21	129	finally
    //   73	77	153	java/io/IOException
    //   81	85	153	java/io/IOException
    //   139	143	155	java/io/IOException
    //   147	151	155	java/io/IOException
    //   21	37	159	finally
    //   37	43	166	finally
    //   43	50	166	finally
    //   56	69	166	finally
    //   86	94	166	finally
    //   106	110	172	finally
    //   5	21	182	java/lang/Exception
    //   21	37	190	java/lang/Exception
  }
  
  public static void deleteDir(File paramFile)
  {
    File[] arrayOfFile;
    int j;
    int i;
    if (paramFile.isDirectory())
    {
      arrayOfFile = paramFile.listFiles();
      j = arrayOfFile.length;
      i = 0;
    }
    for (;;)
    {
      if (i >= j)
      {
        paramFile.delete();
        return;
      }
      deleteDir(arrayOfFile[i]);
      i += 1;
    }
  }
  
  public static boolean deleteDir(String paramString)
  {
    Object localObject1 = new File(paramString);
    if ((!((File)localObject1).exists()) || (!((File)localObject1).isDirectory())) {
      return false;
    }
    paramString = new Stack();
    paramString.add(localObject1);
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.add(localObject1);
    if (localLinkedList.isEmpty()) {}
    for (;;)
    {
      if (paramString.isEmpty())
      {
        return true;
        localObject1 = ((File)localLinkedList.poll()).listFiles();
        if (localObject1 == null) {
          break;
        }
        int j = localObject1.length;
        int i = 0;
        label91:
        Object localObject2;
        if (i < j)
        {
          localObject2 = localObject1[i];
          if (!((File)localObject2).isDirectory()) {
            break label131;
          }
          localLinkedList.offer(localObject2);
          paramString.push(localObject2);
        }
        for (;;)
        {
          i += 1;
          break label91;
          break;
          label131:
          ((File)localObject2).delete();
        }
      }
      ((File)paramString.pop()).delete();
    }
  }
  
  public static boolean deleteFile(String paramString)
  {
    int i = 0;
    if (StringUtil.isBlank(paramString)) {}
    do
    {
      return true;
      paramString = new File(paramString);
    } while (!paramString.exists());
    if (paramString.isFile()) {
      return paramString.delete();
    }
    if (!paramString.isDirectory()) {
      return false;
    }
    File[] arrayOfFile = paramString.listFiles();
    int j = arrayOfFile.length;
    if (i >= j) {
      return paramString.delete();
    }
    File localFile = arrayOfFile[i];
    if (localFile.isFile()) {
      localFile.delete();
    }
    for (;;)
    {
      i += 1;
      break;
      if (localFile.isDirectory()) {
        deleteFile(localFile.getAbsolutePath());
      }
    }
  }
  
  public static File getExternalCacheDir(Context paramContext, String paramString)
  {
    File localFile = new File(new File(Environment.getExternalStorageDirectory(), "Android"), "data");
    paramString = new File(new File(new File(localFile, paramContext.getPackageName()), "cache"), paramString);
    paramContext = paramString;
    if (!paramString.exists()) {}
    try
    {
      new File(localFile, ".nomedia").createNewFile();
      paramContext = paramString;
      if (!paramString.mkdirs())
      {
        Log.w("创建目录", "Unable to create external cache directory");
        paramContext = null;
      }
      return paramContext;
    }
    catch (IOException paramContext)
    {
      for (;;)
      {
        Log.w("创建目录", "Can't create \".nomedia\" file in application external cache directory", paramContext);
      }
    }
  }
  
  public static String getFileExtension(String paramString)
  {
    if (StringUtil.isBlank(paramString)) {
      return paramString;
    }
    int i = paramString.lastIndexOf(".");
    int j = paramString.lastIndexOf(File.separator);
    if (i == -1) {
      return "";
    }
    if (j >= i) {}
    for (paramString = "";; paramString = paramString.substring(i + 1)) {
      return paramString;
    }
  }
  
  public static String getFileName(String paramString)
  {
    if (StringUtil.isEmpty(paramString)) {}
    int i;
    do
    {
      return paramString;
      i = paramString.lastIndexOf(File.separator);
    } while (i == -1);
    return paramString.substring(i + 1);
  }
  
  public static String getFileNameWithoutExtension(String paramString)
  {
    if (StringUtil.isEmpty(paramString)) {}
    int i;
    int j;
    do
    {
      return paramString;
      i = paramString.lastIndexOf(".");
      j = paramString.lastIndexOf(File.separator);
      if (j != -1) {
        break;
      }
    } while (i == -1);
    return paramString.substring(0, i);
    if (i == -1) {
      return paramString.substring(j + 1);
    }
    if (j < i) {}
    for (paramString = paramString.substring(j + 1, i);; paramString = paramString.substring(j + 1)) {
      return paramString;
    }
  }
  
  public static long getFileSize(String paramString)
  {
    if (StringUtil.isBlank(paramString)) {}
    do
    {
      return -1L;
      paramString = new File(paramString);
    } while ((!paramString.exists()) || (!paramString.isFile()));
    return paramString.length();
  }
  
  public static String getFolderName(String paramString)
  {
    if (StringUtil.isEmpty(paramString)) {
      return paramString;
    }
    int i = paramString.lastIndexOf(File.separator);
    if (i == -1) {}
    for (paramString = "";; paramString = paramString.substring(0, i)) {
      return paramString;
    }
  }
  
  public static long getSDFreeSize()
  {
    StatFs localStatFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
    long l = localStatFs.getBlockSize();
    return localStatFs.getAvailableBlocks() * l / 1024L / 1024L;
  }
  
  public static boolean isExist(String paramString)
  {
    return new File(paramString).exists();
  }
  
  public static boolean isFileExist(String paramString)
  {
    if (StringUtil.isBlank(paramString)) {}
    do
    {
      return false;
      paramString = new File(paramString);
    } while ((!paramString.exists()) || (!paramString.isFile()));
    return true;
  }
  
  public static boolean isFolderExist(String paramString)
  {
    if (StringUtil.isBlank(paramString)) {}
    do
    {
      return false;
      paramString = new File(paramString);
    } while ((!paramString.exists()) || (!paramString.isDirectory()));
    return true;
  }
  
  public static boolean makeDirAll(String paramString)
  {
    paramString = new File(paramString);
    if (!paramString.exists()) {
      return paramString.mkdirs();
    }
    return true;
  }
  
  public static boolean makeDirs(String paramString)
  {
    paramString = getFolderName(paramString);
    if (StringUtil.isEmpty(paramString)) {
      return false;
    }
    paramString = new File(paramString);
    if ((paramString.exists()) && (paramString.isDirectory())) {
      return true;
    }
    return paramString.mkdirs();
  }
  
  public static boolean makeFolders(String paramString)
  {
    return makeDirs(paramString);
  }
  
  public static boolean moveFile(String paramString1, String paramString2)
  {
    paramString1 = new File(paramString1);
    paramString2 = new File(paramString2);
    if (paramString1.exists())
    {
      paramString2.delete();
      return paramString1.renameTo(paramString2);
    }
    return false;
  }
  
  /* Error */
  public static StringBuilder readFile(File paramFile)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: new 82	java/lang/StringBuilder
    //   5: dup
    //   6: ldc_w 275
    //   9: invokespecial 90	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   12: astore_3
    //   13: aload_0
    //   14: ifnull +10 -> 24
    //   17: aload_0
    //   18: invokevirtual 221	java/io/File:isFile	()Z
    //   21: ifne +7 -> 28
    //   24: aconst_null
    //   25: astore_0
    //   26: aload_0
    //   27: areturn
    //   28: new 330	java/io/BufferedReader
    //   31: dup
    //   32: new 332	java/io/FileReader
    //   35: dup
    //   36: aload_0
    //   37: invokespecial 333	java/io/FileReader:<init>	(Ljava/io/File;)V
    //   40: invokespecial 336	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   43: astore_1
    //   44: aload_1
    //   45: invokevirtual 339	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   48: astore_0
    //   49: aload_0
    //   50: ifnonnull +32 -> 82
    //   53: aload_1
    //   54: invokevirtual 340	java/io/BufferedReader:close	()V
    //   57: aload_3
    //   58: astore_0
    //   59: aload_1
    //   60: ifnull -34 -> 26
    //   63: aload_1
    //   64: invokevirtual 340	java/io/BufferedReader:close	()V
    //   67: aload_3
    //   68: areturn
    //   69: astore_0
    //   70: new 342	java/lang/RuntimeException
    //   73: dup
    //   74: ldc_w 344
    //   77: aload_0
    //   78: invokespecial 347	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   81: athrow
    //   82: aload_3
    //   83: invokevirtual 99	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   86: ldc_w 275
    //   89: invokevirtual 66	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   92: ifne +11 -> 103
    //   95: aload_3
    //   96: ldc_w 349
    //   99: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: pop
    //   103: aload_3
    //   104: aload_0
    //   105: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   108: pop
    //   109: goto -65 -> 44
    //   112: astore_2
    //   113: aload_1
    //   114: astore_0
    //   115: aload_2
    //   116: astore_1
    //   117: new 342	java/lang/RuntimeException
    //   120: dup
    //   121: ldc_w 344
    //   124: aload_1
    //   125: invokespecial 347	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   128: athrow
    //   129: astore_2
    //   130: aload_0
    //   131: astore_1
    //   132: aload_2
    //   133: astore_0
    //   134: aload_1
    //   135: ifnull +7 -> 142
    //   138: aload_1
    //   139: invokevirtual 340	java/io/BufferedReader:close	()V
    //   142: aload_0
    //   143: athrow
    //   144: astore_0
    //   145: new 342	java/lang/RuntimeException
    //   148: dup
    //   149: ldc_w 344
    //   152: aload_0
    //   153: invokespecial 347	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   156: athrow
    //   157: astore_0
    //   158: aconst_null
    //   159: astore_1
    //   160: goto -26 -> 134
    //   163: astore_0
    //   164: goto -30 -> 134
    //   167: astore_1
    //   168: aload_2
    //   169: astore_0
    //   170: goto -53 -> 117
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	173	0	paramFile	File
    //   43	117	1	localObject1	Object
    //   167	1	1	localIOException1	IOException
    //   1	1	2	localObject2	Object
    //   112	4	2	localIOException2	IOException
    //   129	40	2	localObject3	Object
    //   12	92	3	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   63	67	69	java/io/IOException
    //   44	49	112	java/io/IOException
    //   53	57	112	java/io/IOException
    //   82	103	112	java/io/IOException
    //   103	109	112	java/io/IOException
    //   117	129	129	finally
    //   138	142	144	java/io/IOException
    //   28	44	157	finally
    //   44	49	163	finally
    //   53	57	163	finally
    //   82	103	163	finally
    //   103	109	163	finally
    //   28	44	167	java/io/IOException
  }
  
  /* Error */
  public static byte[] readFile(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aconst_null
    //   3: astore_2
    //   4: new 145	java/io/FileInputStream
    //   7: dup
    //   8: new 34	java/io/File
    //   11: dup
    //   12: aload_0
    //   13: invokespecial 36	java/io/File:<init>	(Ljava/lang/String;)V
    //   16: invokespecial 148	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   19: astore_1
    //   20: aload_3
    //   21: astore_0
    //   22: aload_1
    //   23: invokevirtual 352	java/io/FileInputStream:available	()I
    //   26: newarray <illegal type>
    //   28: astore_2
    //   29: aload_2
    //   30: astore_0
    //   31: aload_1
    //   32: aload_2
    //   33: invokevirtual 353	java/io/FileInputStream:read	([B)I
    //   36: pop
    //   37: aload_1
    //   38: invokevirtual 354	java/io/FileInputStream:close	()V
    //   41: aload_2
    //   42: areturn
    //   43: astore_0
    //   44: aconst_null
    //   45: astore_1
    //   46: aload_2
    //   47: astore_0
    //   48: aload_1
    //   49: invokevirtual 354	java/io/FileInputStream:close	()V
    //   52: aload_0
    //   53: areturn
    //   54: astore_0
    //   55: aconst_null
    //   56: astore_1
    //   57: aload_1
    //   58: invokevirtual 354	java/io/FileInputStream:close	()V
    //   61: aload_0
    //   62: athrow
    //   63: astore_0
    //   64: goto -7 -> 57
    //   67: astore_2
    //   68: goto -20 -> 48
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	71	0	paramString	String
    //   19	39	1	localFileInputStream	java.io.FileInputStream
    //   3	44	2	arrayOfByte	byte[]
    //   67	1	2	localException	Exception
    //   1	20	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   4	20	43	java/lang/Exception
    //   4	20	54	finally
    //   22	29	63	finally
    //   31	37	63	finally
    //   22	29	67	java/lang/Exception
    //   31	37	67	java/lang/Exception
  }
  
  /* Error */
  public static byte[] readFileToByte(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aconst_null
    //   3: astore_2
    //   4: new 145	java/io/FileInputStream
    //   7: dup
    //   8: new 34	java/io/File
    //   11: dup
    //   12: aload_0
    //   13: invokespecial 36	java/io/File:<init>	(Ljava/lang/String;)V
    //   16: invokespecial 148	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   19: astore_1
    //   20: aload_3
    //   21: astore_0
    //   22: aload_1
    //   23: invokevirtual 352	java/io/FileInputStream:available	()I
    //   26: newarray <illegal type>
    //   28: astore_2
    //   29: aload_2
    //   30: astore_0
    //   31: aload_1
    //   32: aload_2
    //   33: invokevirtual 353	java/io/FileInputStream:read	([B)I
    //   36: pop
    //   37: aload_1
    //   38: invokevirtual 354	java/io/FileInputStream:close	()V
    //   41: aload_2
    //   42: areturn
    //   43: astore_0
    //   44: aconst_null
    //   45: astore_1
    //   46: aload_2
    //   47: astore_0
    //   48: aload_1
    //   49: invokevirtual 354	java/io/FileInputStream:close	()V
    //   52: aload_0
    //   53: areturn
    //   54: astore_0
    //   55: aconst_null
    //   56: astore_1
    //   57: aload_1
    //   58: invokevirtual 354	java/io/FileInputStream:close	()V
    //   61: aload_0
    //   62: athrow
    //   63: astore_0
    //   64: goto -7 -> 57
    //   67: astore_2
    //   68: goto -20 -> 48
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	71	0	paramString	String
    //   19	39	1	localFileInputStream	java.io.FileInputStream
    //   3	44	2	arrayOfByte	byte[]
    //   67	1	2	localException	Exception
    //   1	20	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   4	20	43	java/lang/Exception
    //   4	20	54	finally
    //   22	29	63	finally
    //   31	37	63	finally
    //   22	29	67	java/lang/Exception
    //   31	37	67	java/lang/Exception
  }
  
  /* Error */
  public static java.util.List<String> readFileToList(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: new 34	java/io/File
    //   7: dup
    //   8: aload_0
    //   9: invokespecial 36	java/io/File:<init>	(Ljava/lang/String;)V
    //   12: astore 4
    //   14: new 358	java/util/ArrayList
    //   17: dup
    //   18: invokespecial 359	java/util/ArrayList:<init>	()V
    //   21: astore_3
    //   22: aload 4
    //   24: ifnull +11 -> 35
    //   27: aload 4
    //   29: invokevirtual 221	java/io/File:isFile	()Z
    //   32: ifne +7 -> 39
    //   35: aconst_null
    //   36: astore_0
    //   37: aload_0
    //   38: areturn
    //   39: aload_1
    //   40: astore_0
    //   41: new 330	java/io/BufferedReader
    //   44: dup
    //   45: new 332	java/io/FileReader
    //   48: dup
    //   49: aload 4
    //   51: invokespecial 333	java/io/FileReader:<init>	(Ljava/io/File;)V
    //   54: invokespecial 336	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   57: astore_1
    //   58: aload_1
    //   59: invokevirtual 339	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   62: astore_0
    //   63: aload_0
    //   64: ifnonnull +32 -> 96
    //   67: aload_1
    //   68: invokevirtual 340	java/io/BufferedReader:close	()V
    //   71: aload_3
    //   72: astore_0
    //   73: aload_1
    //   74: ifnull -37 -> 37
    //   77: aload_1
    //   78: invokevirtual 340	java/io/BufferedReader:close	()V
    //   81: aload_3
    //   82: areturn
    //   83: astore_0
    //   84: new 342	java/lang/RuntimeException
    //   87: dup
    //   88: ldc_w 344
    //   91: aload_0
    //   92: invokespecial 347	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   95: athrow
    //   96: aload_3
    //   97: aload_0
    //   98: invokeinterface 362 2 0
    //   103: pop
    //   104: goto -46 -> 58
    //   107: astore_2
    //   108: aload_1
    //   109: astore_0
    //   110: aload_2
    //   111: astore_1
    //   112: new 342	java/lang/RuntimeException
    //   115: dup
    //   116: ldc_w 344
    //   119: aload_1
    //   120: invokespecial 347	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   123: athrow
    //   124: astore_2
    //   125: aload_0
    //   126: astore_1
    //   127: aload_2
    //   128: astore_0
    //   129: aload_1
    //   130: ifnull +7 -> 137
    //   133: aload_1
    //   134: invokevirtual 340	java/io/BufferedReader:close	()V
    //   137: aload_0
    //   138: athrow
    //   139: astore_0
    //   140: new 342	java/lang/RuntimeException
    //   143: dup
    //   144: ldc_w 344
    //   147: aload_0
    //   148: invokespecial 347	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   151: athrow
    //   152: astore_0
    //   153: goto -24 -> 129
    //   156: astore_1
    //   157: aload_2
    //   158: astore_0
    //   159: goto -47 -> 112
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	162	0	paramString	String
    //   1	133	1	localObject1	Object
    //   156	1	1	localIOException1	IOException
    //   3	1	2	localObject2	Object
    //   107	4	2	localIOException2	IOException
    //   124	34	2	localObject3	Object
    //   21	76	3	localArrayList	java.util.ArrayList
    //   12	38	4	localFile	File
    // Exception table:
    //   from	to	target	type
    //   77	81	83	java/io/IOException
    //   58	63	107	java/io/IOException
    //   67	71	107	java/io/IOException
    //   96	104	107	java/io/IOException
    //   41	58	124	finally
    //   112	124	124	finally
    //   133	137	139	java/io/IOException
    //   58	63	152	finally
    //   67	71	152	finally
    //   96	104	152	finally
    //   41	58	156	java/io/IOException
  }
  
  public static String readPreferencesValue(Context paramContext, String paramString1, String paramString2)
  {
    paramContext = paramContext.getSharedPreferences("account_configs", 0).getString(paramString1, "");
    if (paramContext.equals("")) {
      return paramString2;
    }
    return paramContext;
  }
  
  public static String readStream(InputStream paramInputStream)
  {
    byte[] arrayOfByte = new byte['Ѐ'];
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      for (;;)
      {
        int i = paramInputStream.read(arrayOfByte, 0, 1024);
        if (i == -1) {
          return localByteArrayOutputStream.toString();
        }
        localByteArrayOutputStream.write(arrayOfByte, 0, i);
      }
      return null;
    }
    catch (IOException paramInputStream)
    {
      Log.e("ReadStream", "读取文件流失败");
    }
  }
  
  public static File uriToFile(Activity paramActivity, Uri paramUri)
  {
    paramActivity = paramActivity.managedQuery(paramUri, new String[] { "_data" }, null, null, null);
    int i = paramActivity.getColumnIndexOrThrow("_data");
    paramActivity.moveToFirst();
    return new File(paramActivity.getString(i));
  }
  
  public static void writeDataToFile(byte[] paramArrayOfByte, File paramFile)
  {
    paramFile = new FileOutputStream(paramFile);
    try
    {
      paramFile.write(paramArrayOfByte);
      paramFile.flush();
      paramFile.close();
      return;
    }
    catch (IOException paramArrayOfByte)
    {
      paramArrayOfByte = paramArrayOfByte;
      paramFile.close();
      return;
    }
    finally
    {
      paramArrayOfByte = finally;
      paramFile.close();
      throw paramArrayOfByte;
    }
  }
  
  public static void writeDataToFile(byte[] paramArrayOfByte, String paramString, boolean paramBoolean)
  {
    FileOutputStream localFileOutputStream = new FileOutputStream(new File(paramString), paramBoolean);
    try
    {
      paramString = new File(paramString.substring(0, paramString.lastIndexOf("/")));
      if (!paramString.exists()) {
        paramString.mkdirs();
      }
      localFileOutputStream.write(paramArrayOfByte);
      localFileOutputStream.flush();
      return;
    }
    catch (IOException paramArrayOfByte) {}finally
    {
      localFileOutputStream.close();
    }
  }
  
  /* Error */
  public static boolean writeFile(File paramFile, InputStream paramInputStream)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 40	java/io/File:exists	()Z
    //   4: ifeq +8 -> 12
    //   7: aload_0
    //   8: invokevirtual 178	java/io/File:delete	()Z
    //   11: pop
    //   12: new 125	java/io/FileOutputStream
    //   15: dup
    //   16: aload_0
    //   17: invokespecial 154	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   20: astore_2
    //   21: aload_2
    //   22: astore_0
    //   23: sipush 1024
    //   26: newarray <illegal type>
    //   28: astore_3
    //   29: aload_2
    //   30: astore_0
    //   31: aload_1
    //   32: aload_3
    //   33: invokevirtual 123	java/io/InputStream:read	([B)I
    //   36: istore 4
    //   38: iload 4
    //   40: iconst_m1
    //   41: if_icmpne +23 -> 64
    //   44: aload_2
    //   45: astore_0
    //   46: aload_2
    //   47: invokevirtual 426	java/io/OutputStream:flush	()V
    //   50: aload_2
    //   51: ifnull +11 -> 62
    //   54: aload_2
    //   55: invokevirtual 427	java/io/OutputStream:close	()V
    //   58: aload_1
    //   59: invokevirtual 129	java/io/InputStream:close	()V
    //   62: iconst_1
    //   63: ireturn
    //   64: aload_2
    //   65: astore_0
    //   66: aload_2
    //   67: aload_3
    //   68: iconst_0
    //   69: iload 4
    //   71: invokevirtual 428	java/io/OutputStream:write	([BII)V
    //   74: goto -45 -> 29
    //   77: astore_3
    //   78: aload_2
    //   79: astore_0
    //   80: aload_3
    //   81: astore_2
    //   82: new 342	java/lang/RuntimeException
    //   85: dup
    //   86: ldc_w 430
    //   89: aload_2
    //   90: invokespecial 347	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   93: athrow
    //   94: astore_3
    //   95: aload_0
    //   96: astore_2
    //   97: aload_3
    //   98: astore_0
    //   99: aload_2
    //   100: ifnull +11 -> 111
    //   103: aload_2
    //   104: invokevirtual 427	java/io/OutputStream:close	()V
    //   107: aload_1
    //   108: invokevirtual 129	java/io/InputStream:close	()V
    //   111: aload_0
    //   112: athrow
    //   113: astore_0
    //   114: new 342	java/lang/RuntimeException
    //   117: dup
    //   118: ldc_w 344
    //   121: aload_0
    //   122: invokespecial 347	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   125: athrow
    //   126: astore_3
    //   127: aconst_null
    //   128: astore_0
    //   129: new 342	java/lang/RuntimeException
    //   132: dup
    //   133: ldc_w 344
    //   136: aload_3
    //   137: invokespecial 347	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   140: athrow
    //   141: astore_0
    //   142: new 342	java/lang/RuntimeException
    //   145: dup
    //   146: ldc_w 344
    //   149: aload_0
    //   150: invokespecial 347	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   153: athrow
    //   154: astore_0
    //   155: aconst_null
    //   156: astore_2
    //   157: goto -58 -> 99
    //   160: astore_3
    //   161: aload_2
    //   162: astore_0
    //   163: goto -34 -> 129
    //   166: astore_2
    //   167: aconst_null
    //   168: astore_0
    //   169: goto -87 -> 82
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	172	0	paramFile	File
    //   0	172	1	paramInputStream	InputStream
    //   20	142	2	localObject1	Object
    //   166	1	2	localFileNotFoundException1	FileNotFoundException
    //   28	40	3	arrayOfByte	byte[]
    //   77	4	3	localFileNotFoundException2	FileNotFoundException
    //   94	4	3	localObject2	Object
    //   126	11	3	localIOException1	IOException
    //   160	1	3	localIOException2	IOException
    //   36	34	4	i	int
    // Exception table:
    //   from	to	target	type
    //   23	29	77	java/io/FileNotFoundException
    //   31	38	77	java/io/FileNotFoundException
    //   46	50	77	java/io/FileNotFoundException
    //   66	74	77	java/io/FileNotFoundException
    //   23	29	94	finally
    //   31	38	94	finally
    //   46	50	94	finally
    //   66	74	94	finally
    //   82	94	94	finally
    //   129	141	94	finally
    //   54	62	113	java/io/IOException
    //   12	21	126	java/io/IOException
    //   103	111	141	java/io/IOException
    //   12	21	154	finally
    //   23	29	160	java/io/IOException
    //   31	38	160	java/io/IOException
    //   46	50	160	java/io/IOException
    //   66	74	160	java/io/IOException
    //   12	21	166	java/io/FileNotFoundException
  }
  
  /* Error */
  public static boolean writeFile(File paramFile, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: new 433	java/io/FileWriter
    //   3: dup
    //   4: aload_0
    //   5: iload_2
    //   6: invokespecial 434	java/io/FileWriter:<init>	(Ljava/io/File;Z)V
    //   9: astore_3
    //   10: aload_3
    //   11: astore_0
    //   12: aload_3
    //   13: aload_1
    //   14: invokevirtual 436	java/io/FileWriter:write	(Ljava/lang/String;)V
    //   17: aload_3
    //   18: astore_0
    //   19: aload_3
    //   20: invokevirtual 437	java/io/FileWriter:close	()V
    //   23: aload_3
    //   24: ifnull +7 -> 31
    //   27: aload_3
    //   28: invokevirtual 437	java/io/FileWriter:close	()V
    //   31: iconst_1
    //   32: ireturn
    //   33: astore_0
    //   34: new 342	java/lang/RuntimeException
    //   37: dup
    //   38: ldc_w 344
    //   41: aload_0
    //   42: invokespecial 347	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   45: athrow
    //   46: astore_1
    //   47: aconst_null
    //   48: astore_0
    //   49: new 342	java/lang/RuntimeException
    //   52: dup
    //   53: ldc_w 344
    //   56: aload_1
    //   57: invokespecial 347	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   60: athrow
    //   61: astore_3
    //   62: aload_0
    //   63: astore_1
    //   64: aload_3
    //   65: astore_0
    //   66: aload_1
    //   67: ifnull +7 -> 74
    //   70: aload_1
    //   71: invokevirtual 437	java/io/FileWriter:close	()V
    //   74: aload_0
    //   75: athrow
    //   76: astore_0
    //   77: new 342	java/lang/RuntimeException
    //   80: dup
    //   81: ldc_w 344
    //   84: aload_0
    //   85: invokespecial 347	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   88: athrow
    //   89: astore_0
    //   90: aconst_null
    //   91: astore_1
    //   92: goto -26 -> 66
    //   95: astore_1
    //   96: aload_3
    //   97: astore_0
    //   98: goto -49 -> 49
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	101	0	paramFile	File
    //   0	101	1	paramString	String
    //   0	101	2	paramBoolean	boolean
    //   9	19	3	localFileWriter	java.io.FileWriter
    //   61	36	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   27	31	33	java/io/IOException
    //   0	10	46	java/io/IOException
    //   12	17	61	finally
    //   19	23	61	finally
    //   49	61	61	finally
    //   70	74	76	java/io/IOException
    //   0	10	89	finally
    //   12	17	95	java/io/IOException
    //   19	23	95	java/io/IOException
  }
  
  /* Error */
  public static boolean writeFile(String paramString, InputStream paramInputStream)
  {
    // Byte code:
    //   0: new 125	java/io/FileOutputStream
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 139	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   8: astore_2
    //   9: aload_2
    //   10: astore_0
    //   11: sipush 1024
    //   14: newarray <illegal type>
    //   16: astore_3
    //   17: aload_2
    //   18: astore_0
    //   19: aload_1
    //   20: aload_3
    //   21: invokevirtual 123	java/io/InputStream:read	([B)I
    //   24: istore 4
    //   26: iload 4
    //   28: iconst_m1
    //   29: if_icmpne +23 -> 52
    //   32: aload_2
    //   33: astore_0
    //   34: aload_2
    //   35: invokevirtual 426	java/io/OutputStream:flush	()V
    //   38: aload_2
    //   39: ifnull +11 -> 50
    //   42: aload_2
    //   43: invokevirtual 427	java/io/OutputStream:close	()V
    //   46: aload_1
    //   47: invokevirtual 129	java/io/InputStream:close	()V
    //   50: iconst_1
    //   51: ireturn
    //   52: aload_2
    //   53: astore_0
    //   54: aload_2
    //   55: aload_3
    //   56: iconst_0
    //   57: iload 4
    //   59: invokevirtual 428	java/io/OutputStream:write	([BII)V
    //   62: goto -45 -> 17
    //   65: astore_3
    //   66: aload_2
    //   67: astore_0
    //   68: aload_3
    //   69: astore_2
    //   70: new 342	java/lang/RuntimeException
    //   73: dup
    //   74: ldc_w 430
    //   77: aload_2
    //   78: invokespecial 347	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   81: athrow
    //   82: astore_3
    //   83: aload_0
    //   84: astore_2
    //   85: aload_3
    //   86: astore_0
    //   87: aload_2
    //   88: ifnull +11 -> 99
    //   91: aload_2
    //   92: invokevirtual 427	java/io/OutputStream:close	()V
    //   95: aload_1
    //   96: invokevirtual 129	java/io/InputStream:close	()V
    //   99: aload_0
    //   100: athrow
    //   101: astore_0
    //   102: new 342	java/lang/RuntimeException
    //   105: dup
    //   106: ldc_w 344
    //   109: aload_0
    //   110: invokespecial 347	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   113: athrow
    //   114: astore_3
    //   115: aconst_null
    //   116: astore_0
    //   117: new 342	java/lang/RuntimeException
    //   120: dup
    //   121: ldc_w 344
    //   124: aload_3
    //   125: invokespecial 347	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   128: athrow
    //   129: astore_0
    //   130: new 342	java/lang/RuntimeException
    //   133: dup
    //   134: ldc_w 344
    //   137: aload_0
    //   138: invokespecial 347	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   141: athrow
    //   142: astore_0
    //   143: aconst_null
    //   144: astore_2
    //   145: goto -58 -> 87
    //   148: astore_3
    //   149: aload_2
    //   150: astore_0
    //   151: goto -34 -> 117
    //   154: astore_2
    //   155: aconst_null
    //   156: astore_0
    //   157: goto -87 -> 70
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	160	0	paramString	String
    //   0	160	1	paramInputStream	InputStream
    //   8	142	2	localObject1	Object
    //   154	1	2	localFileNotFoundException1	FileNotFoundException
    //   16	40	3	arrayOfByte	byte[]
    //   65	4	3	localFileNotFoundException2	FileNotFoundException
    //   82	4	3	localObject2	Object
    //   114	11	3	localIOException1	IOException
    //   148	1	3	localIOException2	IOException
    //   24	34	4	i	int
    // Exception table:
    //   from	to	target	type
    //   11	17	65	java/io/FileNotFoundException
    //   19	26	65	java/io/FileNotFoundException
    //   34	38	65	java/io/FileNotFoundException
    //   54	62	65	java/io/FileNotFoundException
    //   11	17	82	finally
    //   19	26	82	finally
    //   34	38	82	finally
    //   54	62	82	finally
    //   70	82	82	finally
    //   117	129	82	finally
    //   42	50	101	java/io/IOException
    //   0	9	114	java/io/IOException
    //   91	99	129	java/io/IOException
    //   0	9	142	finally
    //   11	17	148	java/io/IOException
    //   19	26	148	java/io/IOException
    //   34	38	148	java/io/IOException
    //   54	62	148	java/io/IOException
    //   0	9	154	java/io/FileNotFoundException
  }
  
  /* Error */
  public static boolean writeFile(String paramString1, String paramString2, boolean paramBoolean)
  {
    // Byte code:
    //   0: new 433	java/io/FileWriter
    //   3: dup
    //   4: aload_0
    //   5: iload_2
    //   6: invokespecial 441	java/io/FileWriter:<init>	(Ljava/lang/String;Z)V
    //   9: astore_3
    //   10: aload_3
    //   11: astore_0
    //   12: aload_3
    //   13: aload_1
    //   14: invokevirtual 436	java/io/FileWriter:write	(Ljava/lang/String;)V
    //   17: aload_3
    //   18: astore_0
    //   19: aload_3
    //   20: invokevirtual 437	java/io/FileWriter:close	()V
    //   23: aload_3
    //   24: ifnull +7 -> 31
    //   27: aload_3
    //   28: invokevirtual 437	java/io/FileWriter:close	()V
    //   31: iconst_1
    //   32: ireturn
    //   33: astore_0
    //   34: new 342	java/lang/RuntimeException
    //   37: dup
    //   38: ldc_w 344
    //   41: aload_0
    //   42: invokespecial 347	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   45: athrow
    //   46: astore_1
    //   47: aconst_null
    //   48: astore_0
    //   49: new 342	java/lang/RuntimeException
    //   52: dup
    //   53: ldc_w 344
    //   56: aload_1
    //   57: invokespecial 347	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   60: athrow
    //   61: astore_3
    //   62: aload_0
    //   63: astore_1
    //   64: aload_3
    //   65: astore_0
    //   66: aload_1
    //   67: ifnull +7 -> 74
    //   70: aload_1
    //   71: invokevirtual 437	java/io/FileWriter:close	()V
    //   74: aload_0
    //   75: athrow
    //   76: astore_0
    //   77: new 342	java/lang/RuntimeException
    //   80: dup
    //   81: ldc_w 344
    //   84: aload_0
    //   85: invokespecial 347	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   88: athrow
    //   89: astore_0
    //   90: aconst_null
    //   91: astore_1
    //   92: goto -26 -> 66
    //   95: astore_1
    //   96: aload_3
    //   97: astore_0
    //   98: goto -49 -> 49
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	101	0	paramString1	String
    //   0	101	1	paramString2	String
    //   0	101	2	paramBoolean	boolean
    //   9	19	3	localFileWriter	java.io.FileWriter
    //   61	36	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   27	31	33	java/io/IOException
    //   0	10	46	java/io/IOException
    //   12	17	61	finally
    //   19	23	61	finally
    //   49	61	61	finally
    //   70	74	76	java/io/IOException
    //   0	10	89	finally
    //   12	17	95	java/io/IOException
    //   19	23	95	java/io/IOException
  }
  
  public static void writePreferencesValue(Context paramContext, String paramString1, String paramString2)
  {
    paramContext = paramContext.getSharedPreferences("account_configs", 0).edit();
    paramContext.putString(paramString1, paramString2);
    paramContext.commit();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwl\common\utils\FileUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */