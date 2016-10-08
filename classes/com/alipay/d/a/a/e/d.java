package com.alipay.d.a.a.e;

import com.alipay.d.a.a.a.a;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class d
{
  private static String a = "";
  private static String b = "";
  private static String c = "";
  
  public static void a(String paramString)
  {
    try
    {
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(paramString);
      a(localArrayList);
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public static void a(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      a = paramString1;
      b = paramString2;
      c = paramString3;
      return;
    }
    finally
    {
      paramString1 = finally;
      throw paramString1;
    }
  }
  
  /* Error */
  public static void a(Throwable paramThrowable)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: new 22	java/util/ArrayList
    //   6: dup
    //   7: invokespecial 25	java/util/ArrayList:<init>	()V
    //   10: astore_1
    //   11: aload_0
    //   12: ifnull +44 -> 56
    //   15: new 38	java/io/StringWriter
    //   18: dup
    //   19: invokespecial 39	java/io/StringWriter:<init>	()V
    //   22: astore_2
    //   23: aload_0
    //   24: new 41	java/io/PrintWriter
    //   27: dup
    //   28: aload_2
    //   29: invokespecial 44	java/io/PrintWriter:<init>	(Ljava/io/Writer;)V
    //   32: invokevirtual 50	java/lang/Throwable:printStackTrace	(Ljava/io/PrintWriter;)V
    //   35: aload_2
    //   36: invokevirtual 54	java/lang/Object:toString	()Ljava/lang/String;
    //   39: astore_0
    //   40: aload_1
    //   41: aload_0
    //   42: invokeinterface 31 2 0
    //   47: pop
    //   48: aload_1
    //   49: invokestatic 34	com/alipay/d/a/a/e/d:a	(Ljava/util/List;)V
    //   52: ldc 2
    //   54: monitorexit
    //   55: return
    //   56: ldc 12
    //   58: astore_0
    //   59: goto -19 -> 40
    //   62: astore_0
    //   63: ldc 2
    //   65: monitorexit
    //   66: aload_0
    //   67: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	68	0	paramThrowable	Throwable
    //   10	39	1	localArrayList	ArrayList
    //   22	14	2	localStringWriter	java.io.StringWriter
    // Exception table:
    //   from	to	target	type
    //   3	11	62	finally
    //   15	40	62	finally
    //   40	52	62	finally
  }
  
  private static void a(List<String> paramList)
  {
    for (;;)
    {
      StringBuffer localStringBuffer;
      try
      {
        if (!a.a(b))
        {
          boolean bool = a.a(c);
          if (!bool) {}
        }
        else
        {
          return;
        }
        localStringBuffer = new StringBuffer();
        localStringBuffer.append(c);
        paramList = paramList.iterator();
        if (paramList.hasNext())
        {
          String str = (String)paramList.next();
          localStringBuffer.append(", " + str);
          continue;
        }
        localStringBuffer.append("\n");
      }
      finally {}
      try
      {
        paramList = new File(a);
        if (!paramList.exists()) {
          paramList.mkdirs();
        }
        paramList = new File(a, b);
        if (!paramList.exists()) {
          paramList.createNewFile();
        }
        if (paramList.length() + localStringBuffer.length() <= 51200L) {}
        for (paramList = new FileWriter(paramList, true);; paramList = new FileWriter(paramList))
        {
          paramList.write(localStringBuffer.toString());
          paramList.flush();
          paramList.close();
          break;
        }
      }
      catch (Exception paramList) {}
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\d\a\a\e\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */