package com.android.thinkive.framework.cache;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public class Util
{
  static final Charset US_ASCII = Charset.forName("US-ASCII");
  static final Charset UTF_8 = Charset.forName("UTF-8");
  
  static void closeQuietly(Closeable paramCloseable)
  {
    if (paramCloseable != null) {}
    try
    {
      paramCloseable.close();
      return;
    }
    catch (RuntimeException paramCloseable)
    {
      throw paramCloseable;
    }
    catch (Exception paramCloseable) {}
  }
  
  static void deleteContents(File paramFile)
  {
    File[] arrayOfFile = paramFile.listFiles();
    if (arrayOfFile == null) {
      throw new IOException("not a readable directory: " + paramFile);
    }
    int j = arrayOfFile.length;
    int i = 0;
    for (;;)
    {
      if (i >= j) {
        return;
      }
      paramFile = arrayOfFile[i];
      if (paramFile.isDirectory()) {
        deleteContents(paramFile);
      }
      if (!paramFile.delete()) {
        throw new IOException("failed to delete file: " + paramFile);
      }
      i += 1;
    }
  }
  
  /* Error */
  static String readFully(java.io.Reader paramReader)
  {
    // Byte code:
    //   0: new 79	java/io/StringWriter
    //   3: dup
    //   4: invokespecial 80	java/io/StringWriter:<init>	()V
    //   7: astore_1
    //   8: sipush 1024
    //   11: newarray <illegal type>
    //   13: astore_2
    //   14: aload_0
    //   15: aload_2
    //   16: invokevirtual 86	java/io/Reader:read	([C)I
    //   19: istore_3
    //   20: iload_3
    //   21: iconst_m1
    //   22: if_icmpne +14 -> 36
    //   25: aload_1
    //   26: invokevirtual 87	java/io/StringWriter:toString	()Ljava/lang/String;
    //   29: astore_1
    //   30: aload_0
    //   31: invokevirtual 88	java/io/Reader:close	()V
    //   34: aload_1
    //   35: areturn
    //   36: aload_1
    //   37: aload_2
    //   38: iconst_0
    //   39: iload_3
    //   40: invokevirtual 92	java/io/StringWriter:write	([CII)V
    //   43: goto -29 -> 14
    //   46: astore_1
    //   47: aload_0
    //   48: invokevirtual 88	java/io/Reader:close	()V
    //   51: aload_1
    //   52: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	53	0	paramReader	java.io.Reader
    //   7	30	1	localObject1	Object
    //   46	6	1	localObject2	Object
    //   13	25	2	arrayOfChar	char[]
    //   19	21	3	i	int
    // Exception table:
    //   from	to	target	type
    //   0	14	46	finally
    //   14	20	46	finally
    //   25	30	46	finally
    //   36	43	46	finally
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\cache\Util.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */