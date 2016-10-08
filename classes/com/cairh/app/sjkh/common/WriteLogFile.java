package com.cairh.app.sjkh.common;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class WriteLogFile
{
  private static String APPDIR = "/sdcard";
  private static String BRANCH_FILE_NAME = "SJKH_branch.txt";
  private static String MOBILE_FILE_NAME;
  private static String MYLOGFILEName;
  private static String MYLOG_PATH_SDCARD_DIR = "";
  private static String SJKH_DIR = "sjkh";
  public static File branchFile;
  public static File logFile;
  public static File mobileFile;
  
  static
  {
    MYLOGFILEName = "SJKH_Log.txt";
    MOBILE_FILE_NAME = "SJKH_temp.txt";
  }
  
  public static void clearLog()
  {
    witeFile(logFile, "", false);
  }
  
  public static void initLogFile(Context paramContext)
  {
    if (Environment.getExternalStorageState().equals("mounted"))
    {
      paramContext = new File(APPDIR);
      if (!paramContext.exists()) {
        paramContext.mkdirs();
      }
      MYLOG_PATH_SDCARD_DIR = APPDIR + "/";
    }
    for (;;)
    {
      paramContext = MYLOG_PATH_SDCARD_DIR + SJKH_DIR;
      File localFile = new File(paramContext);
      if (!localFile.exists()) {
        localFile.mkdirs();
      }
      logFile = new File(paramContext, MYLOGFILEName);
      if (!logFile.exists()) {}
      try
      {
        logFile.createNewFile();
        mobileFile = new File(paramContext, MOBILE_FILE_NAME);
        if (mobileFile.exists()) {}
      }
      catch (IOException localIOException1)
      {
        try
        {
          mobileFile.createNewFile();
          branchFile = new File(paramContext, BRANCH_FILE_NAME);
          if (!branchFile.exists()) {}
          try
          {
            branchFile.createNewFile();
            return;
          }
          catch (IOException paramContext)
          {
            paramContext.printStackTrace();
          }
          MYLOG_PATH_SDCARD_DIR = paramContext.getFilesDir().getPath() + "/";
          continue;
          localIOException1 = localIOException1;
          localIOException1.printStackTrace();
        }
        catch (IOException localIOException2)
        {
          for (;;)
          {
            localIOException2.printStackTrace();
          }
        }
      }
    }
  }
  
  /* Error */
  public static String readBranchInfo()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aconst_null
    //   4: astore_0
    //   5: new 125	java/io/FileReader
    //   8: dup
    //   9: getstatic 108	com/cairh/app/sjkh/common/WriteLogFile:branchFile	Ljava/io/File;
    //   12: invokespecial 128	java/io/FileReader:<init>	(Ljava/io/File;)V
    //   15: astore_1
    //   16: new 130	java/io/BufferedReader
    //   19: dup
    //   20: aload_1
    //   21: invokespecial 133	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   24: astore 4
    //   26: aload 4
    //   28: astore_3
    //   29: aload_1
    //   30: astore_2
    //   31: aload 4
    //   33: invokevirtual 136	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   36: astore 6
    //   38: aload 6
    //   40: ifnull +6 -> 46
    //   43: aload 6
    //   45: astore_0
    //   46: aload 4
    //   48: ifnull +8 -> 56
    //   51: aload 4
    //   53: invokevirtual 139	java/io/BufferedReader:close	()V
    //   56: aload_0
    //   57: astore_2
    //   58: aload_1
    //   59: ifnull +9 -> 68
    //   62: aload_1
    //   63: invokevirtual 140	java/io/FileReader:close	()V
    //   66: aload_0
    //   67: astore_2
    //   68: aload_2
    //   69: areturn
    //   70: astore 6
    //   72: aload 4
    //   74: astore_3
    //   75: aload_1
    //   76: astore_2
    //   77: aload 6
    //   79: invokevirtual 141	java/lang/Exception:printStackTrace	()V
    //   82: goto -36 -> 46
    //   85: astore_2
    //   86: aload 4
    //   88: astore_0
    //   89: aload_2
    //   90: astore 4
    //   92: aload_0
    //   93: astore_3
    //   94: aload_1
    //   95: astore_2
    //   96: aload 4
    //   98: invokevirtual 141	java/lang/Exception:printStackTrace	()V
    //   101: aload_0
    //   102: ifnull +7 -> 109
    //   105: aload_0
    //   106: invokevirtual 139	java/io/BufferedReader:close	()V
    //   109: aload 5
    //   111: astore_2
    //   112: aload_1
    //   113: ifnull -45 -> 68
    //   116: aload_1
    //   117: invokevirtual 140	java/io/FileReader:close	()V
    //   120: aconst_null
    //   121: areturn
    //   122: astore_0
    //   123: aload_0
    //   124: invokevirtual 120	java/io/IOException:printStackTrace	()V
    //   127: aconst_null
    //   128: areturn
    //   129: astore_0
    //   130: aload_0
    //   131: invokevirtual 120	java/io/IOException:printStackTrace	()V
    //   134: goto -25 -> 109
    //   137: astore_0
    //   138: aconst_null
    //   139: astore_3
    //   140: aconst_null
    //   141: astore_1
    //   142: aload_3
    //   143: ifnull +7 -> 150
    //   146: aload_3
    //   147: invokevirtual 139	java/io/BufferedReader:close	()V
    //   150: aload_1
    //   151: ifnull +7 -> 158
    //   154: aload_1
    //   155: invokevirtual 140	java/io/FileReader:close	()V
    //   158: aload_0
    //   159: athrow
    //   160: astore_2
    //   161: aload_2
    //   162: invokevirtual 120	java/io/IOException:printStackTrace	()V
    //   165: goto -15 -> 150
    //   168: astore_1
    //   169: aload_1
    //   170: invokevirtual 120	java/io/IOException:printStackTrace	()V
    //   173: goto -15 -> 158
    //   176: astore_2
    //   177: aload_2
    //   178: invokevirtual 120	java/io/IOException:printStackTrace	()V
    //   181: goto -125 -> 56
    //   184: astore_1
    //   185: aload_1
    //   186: invokevirtual 120	java/io/IOException:printStackTrace	()V
    //   189: aload_0
    //   190: areturn
    //   191: astore_0
    //   192: aconst_null
    //   193: astore_3
    //   194: goto -52 -> 142
    //   197: astore_0
    //   198: aload_2
    //   199: astore_1
    //   200: goto -58 -> 142
    //   203: astore 4
    //   205: aconst_null
    //   206: astore_0
    //   207: aconst_null
    //   208: astore_1
    //   209: goto -117 -> 92
    //   212: astore 4
    //   214: aconst_null
    //   215: astore_0
    //   216: goto -124 -> 92
    // Local variable table:
    //   start	length	slot	name	signature
    //   4	102	0	localObject1	Object
    //   122	2	0	localIOException1	IOException
    //   129	2	0	localIOException2	IOException
    //   137	53	0	str1	String
    //   191	1	0	localObject2	Object
    //   197	1	0	localObject3	Object
    //   206	10	0	localObject4	Object
    //   15	140	1	localFileReader	java.io.FileReader
    //   168	2	1	localIOException3	IOException
    //   184	2	1	localIOException4	IOException
    //   199	10	1	localObject5	Object
    //   30	47	2	localObject6	Object
    //   85	5	2	localException1	Exception
    //   95	17	2	localObject7	Object
    //   160	2	2	localIOException5	IOException
    //   176	23	2	localIOException6	IOException
    //   28	166	3	localObject8	Object
    //   24	73	4	localObject9	Object
    //   203	1	4	localException2	Exception
    //   212	1	4	localException3	Exception
    //   1	109	5	localObject10	Object
    //   36	8	6	str2	String
    //   70	8	6	localException4	Exception
    // Exception table:
    //   from	to	target	type
    //   31	38	70	java/lang/Exception
    //   77	82	85	java/lang/Exception
    //   116	120	122	java/io/IOException
    //   105	109	129	java/io/IOException
    //   5	16	137	finally
    //   146	150	160	java/io/IOException
    //   154	158	168	java/io/IOException
    //   51	56	176	java/io/IOException
    //   62	66	184	java/io/IOException
    //   16	26	191	finally
    //   31	38	197	finally
    //   77	82	197	finally
    //   96	101	197	finally
    //   5	16	203	java/lang/Exception
    //   16	26	212	java/lang/Exception
  }
  
  /* Error */
  public static String readMobile()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aconst_null
    //   4: astore_0
    //   5: new 125	java/io/FileReader
    //   8: dup
    //   9: getstatic 106	com/cairh/app/sjkh/common/WriteLogFile:mobileFile	Ljava/io/File;
    //   12: invokespecial 128	java/io/FileReader:<init>	(Ljava/io/File;)V
    //   15: astore_1
    //   16: new 130	java/io/BufferedReader
    //   19: dup
    //   20: aload_1
    //   21: invokespecial 133	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   24: astore 4
    //   26: aload 4
    //   28: astore_3
    //   29: aload_1
    //   30: astore_2
    //   31: aload 4
    //   33: invokevirtual 136	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   36: astore 6
    //   38: aload 6
    //   40: ifnull +6 -> 46
    //   43: aload 6
    //   45: astore_0
    //   46: aload 4
    //   48: ifnull +8 -> 56
    //   51: aload 4
    //   53: invokevirtual 139	java/io/BufferedReader:close	()V
    //   56: aload_0
    //   57: astore_2
    //   58: aload_1
    //   59: ifnull +9 -> 68
    //   62: aload_1
    //   63: invokevirtual 140	java/io/FileReader:close	()V
    //   66: aload_0
    //   67: astore_2
    //   68: aload_2
    //   69: areturn
    //   70: astore 6
    //   72: aload 4
    //   74: astore_3
    //   75: aload_1
    //   76: astore_2
    //   77: aload 6
    //   79: invokevirtual 141	java/lang/Exception:printStackTrace	()V
    //   82: goto -36 -> 46
    //   85: astore_2
    //   86: aload 4
    //   88: astore_0
    //   89: aload_2
    //   90: astore 4
    //   92: aload_0
    //   93: astore_3
    //   94: aload_1
    //   95: astore_2
    //   96: aload 4
    //   98: invokevirtual 141	java/lang/Exception:printStackTrace	()V
    //   101: aload_0
    //   102: ifnull +7 -> 109
    //   105: aload_0
    //   106: invokevirtual 139	java/io/BufferedReader:close	()V
    //   109: aload 5
    //   111: astore_2
    //   112: aload_1
    //   113: ifnull -45 -> 68
    //   116: aload_1
    //   117: invokevirtual 140	java/io/FileReader:close	()V
    //   120: aconst_null
    //   121: areturn
    //   122: astore_0
    //   123: aload_0
    //   124: invokevirtual 120	java/io/IOException:printStackTrace	()V
    //   127: aconst_null
    //   128: areturn
    //   129: astore_0
    //   130: aload_0
    //   131: invokevirtual 120	java/io/IOException:printStackTrace	()V
    //   134: goto -25 -> 109
    //   137: astore_0
    //   138: aconst_null
    //   139: astore_3
    //   140: aconst_null
    //   141: astore_1
    //   142: aload_3
    //   143: ifnull +7 -> 150
    //   146: aload_3
    //   147: invokevirtual 139	java/io/BufferedReader:close	()V
    //   150: aload_1
    //   151: ifnull +7 -> 158
    //   154: aload_1
    //   155: invokevirtual 140	java/io/FileReader:close	()V
    //   158: aload_0
    //   159: athrow
    //   160: astore_2
    //   161: aload_2
    //   162: invokevirtual 120	java/io/IOException:printStackTrace	()V
    //   165: goto -15 -> 150
    //   168: astore_1
    //   169: aload_1
    //   170: invokevirtual 120	java/io/IOException:printStackTrace	()V
    //   173: goto -15 -> 158
    //   176: astore_2
    //   177: aload_2
    //   178: invokevirtual 120	java/io/IOException:printStackTrace	()V
    //   181: goto -125 -> 56
    //   184: astore_1
    //   185: aload_1
    //   186: invokevirtual 120	java/io/IOException:printStackTrace	()V
    //   189: aload_0
    //   190: areturn
    //   191: astore_0
    //   192: aconst_null
    //   193: astore_3
    //   194: goto -52 -> 142
    //   197: astore_0
    //   198: aload_2
    //   199: astore_1
    //   200: goto -58 -> 142
    //   203: astore 4
    //   205: aconst_null
    //   206: astore_0
    //   207: aconst_null
    //   208: astore_1
    //   209: goto -117 -> 92
    //   212: astore 4
    //   214: aconst_null
    //   215: astore_0
    //   216: goto -124 -> 92
    // Local variable table:
    //   start	length	slot	name	signature
    //   4	102	0	localObject1	Object
    //   122	2	0	localIOException1	IOException
    //   129	2	0	localIOException2	IOException
    //   137	53	0	str1	String
    //   191	1	0	localObject2	Object
    //   197	1	0	localObject3	Object
    //   206	10	0	localObject4	Object
    //   15	140	1	localFileReader	java.io.FileReader
    //   168	2	1	localIOException3	IOException
    //   184	2	1	localIOException4	IOException
    //   199	10	1	localObject5	Object
    //   30	47	2	localObject6	Object
    //   85	5	2	localException1	Exception
    //   95	17	2	localObject7	Object
    //   160	2	2	localIOException5	IOException
    //   176	23	2	localIOException6	IOException
    //   28	166	3	localObject8	Object
    //   24	73	4	localObject9	Object
    //   203	1	4	localException2	Exception
    //   212	1	4	localException3	Exception
    //   1	109	5	localObject10	Object
    //   36	8	6	str2	String
    //   70	8	6	localException4	Exception
    // Exception table:
    //   from	to	target	type
    //   31	38	70	java/lang/Exception
    //   77	82	85	java/lang/Exception
    //   116	120	122	java/io/IOException
    //   105	109	129	java/io/IOException
    //   5	16	137	finally
    //   146	150	160	java/io/IOException
    //   154	158	168	java/io/IOException
    //   51	56	176	java/io/IOException
    //   62	66	184	java/io/IOException
    //   16	26	191	finally
    //   31	38	197	finally
    //   77	82	197	finally
    //   96	101	197	finally
    //   5	16	203	java/lang/Exception
    //   16	26	212	java/lang/Exception
  }
  
  public static void saveBranchInfo(String paramString1, String paramString2)
  {
    witeFile(branchFile, paramString1 + "#" + paramString2, false);
  }
  
  private static void witeFile(File paramFile, String paramString, boolean paramBoolean)
  {
    try
    {
      paramFile = new OutputStreamWriter(new FileOutputStream(paramFile, paramBoolean), "UTF-8");
      BufferedWriter localBufferedWriter = new BufferedWriter(paramFile);
      localBufferedWriter.write(paramString);
      localBufferedWriter.newLine();
      localBufferedWriter.flush();
      localBufferedWriter.close();
      paramFile.close();
      return;
    }
    catch (IOException paramFile)
    {
      paramFile.printStackTrace();
    }
  }
  
  public static void witeLog(String paramString)
  {
    Log.i("MainActivity", ">>>>>>>>>>> witeLog>>>>>>>>>>>>>>>" + paramString);
  }
  
  public static void witeMobile(String paramString)
  {
    witeFile(mobileFile, paramString, false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\common\WriteLogFile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */