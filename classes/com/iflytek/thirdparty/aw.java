package com.iflytek.thirdparty;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class aw
{
  public static int a(String paramString1, String paramString2, boolean paramBoolean)
  {
    int j = 0;
    i = j;
    try
    {
      Object localObject = new File(paramString1);
      i = j;
      if (!((File)localObject).exists())
      {
        i = j;
        ((File)localObject).createNewFile();
      }
      for (;;)
      {
        i = j;
        localObject = new RandomAccessFile((File)localObject, "rw");
        i = j;
        ((RandomAccessFile)localObject).seek(((RandomAccessFile)localObject).length());
        i = j;
        ((RandomAccessFile)localObject).write(paramString2.getBytes("utf-8"));
        i = j;
        j = (int)((RandomAccessFile)localObject).length();
        i = j;
        ((RandomAccessFile)localObject).close();
        return j;
        if (paramBoolean)
        {
          i = j;
          ((File)localObject).delete();
          i = j;
          ((File)localObject).createNewFile();
        }
      }
      return i;
    }
    catch (IOException paramString2)
    {
      X.a("iFly_ContactManager", "save file failed. " + paramString1);
    }
  }
  
  /* Error */
  public static String a(String paramString)
  {
    // Byte code:
    //   0: new 80	java/io/FileInputStream
    //   3: dup
    //   4: new 10	java/io/File
    //   7: dup
    //   8: aload_0
    //   9: invokespecial 14	java/io/File:<init>	(Ljava/lang/String;)V
    //   12: invokespecial 83	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   15: astore_2
    //   16: aload_2
    //   17: invokevirtual 87	java/io/FileInputStream:available	()I
    //   20: newarray <illegal type>
    //   22: astore_1
    //   23: aload_2
    //   24: aload_1
    //   25: invokevirtual 91	java/io/FileInputStream:read	([B)I
    //   28: pop
    //   29: new 40	java/lang/String
    //   32: dup
    //   33: aload_1
    //   34: ldc 38
    //   36: invokespecial 94	java/lang/String:<init>	([BLjava/lang/String;)V
    //   39: astore_1
    //   40: aload_2
    //   41: invokevirtual 95	java/io/FileInputStream:close	()V
    //   44: aload_1
    //   45: areturn
    //   46: astore_1
    //   47: aconst_null
    //   48: astore_1
    //   49: ldc 57
    //   51: new 59	java/lang/StringBuilder
    //   54: dup
    //   55: invokespecial 61	java/lang/StringBuilder:<init>	()V
    //   58: ldc 97
    //   60: invokevirtual 67	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   63: aload_0
    //   64: invokevirtual 67	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: invokevirtual 71	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   70: invokestatic 76	com/iflytek/thirdparty/X:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   73: aload_1
    //   74: areturn
    //   75: astore_2
    //   76: goto -27 -> 49
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	79	0	paramString	String
    //   22	23	1	localObject	Object
    //   46	1	1	localIOException1	IOException
    //   48	26	1	str	String
    //   15	26	2	localFileInputStream	java.io.FileInputStream
    //   75	1	2	localIOException2	IOException
    // Exception table:
    //   from	to	target	type
    //   0	40	46	java/io/IOException
    //   40	44	75	java/io/IOException
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */