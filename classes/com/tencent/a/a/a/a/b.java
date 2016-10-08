package com.tencent.a.a.a.a;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

final class b
  extends f
{
  b(Context paramContext)
  {
    super(paramContext);
  }
  
  protected final boolean a()
  {
    return (h.a(this.e, "android.permission.WRITE_EXTERNAL_STORAGE")) && (Environment.getExternalStorageState().equals("mounted"));
  }
  
  protected final String b()
  {
    for (;;)
    {
      try
      {
        Log.i("MID", "read mid from InternalStorage");
        Object localObject1 = new File(Environment.getExternalStorageDirectory(), h.f("6X8Y4XdM2Vhvn0KfzcEatGnWaNU="));
        try
        {
          localObject1 = a.a((File)localObject1).iterator();
          if (!((Iterator)localObject1).hasNext()) {
            break label130;
          }
          String[] arrayOfString = ((String)((Iterator)localObject1).next()).split(",");
          if ((arrayOfString.length != 2) || (!arrayOfString[0].equals(h.f("4kU71lN96TJUomD1vOU9lgj9Tw==")))) {
            continue;
          }
          Log.i("MID", "read mid from InternalStorage:" + arrayOfString[1]);
          localObject1 = arrayOfString[1];
        }
        catch (IOException localIOException)
        {
          Log.w("MID", localIOException);
          Object localObject2 = null;
          continue;
        }
        return (String)localObject1;
      }
      finally {}
      label130:
      Object localObject4 = null;
    }
  }
  
  /* Error */
  protected final void b(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 41
    //   4: ldc 114
    //   6: invokestatic 49	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;)I
    //   9: pop
    //   10: new 94	java/lang/StringBuilder
    //   13: dup
    //   14: invokespecial 117	java/lang/StringBuilder:<init>	()V
    //   17: invokestatic 55	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   20: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   23: ldc 122
    //   25: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   28: ldc 124
    //   30: invokestatic 61	com/tencent/a/a/a/a/h:f	(Ljava/lang/String;)Ljava/lang/String;
    //   33: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   36: invokevirtual 106	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   39: invokestatic 127	com/tencent/a/a/a/a/a:a	(Ljava/lang/String;)Ljava/io/File;
    //   42: pop
    //   43: new 51	java/io/File
    //   46: dup
    //   47: invokestatic 55	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   50: ldc 57
    //   52: invokestatic 61	com/tencent/a/a/a/a/h:f	(Ljava/lang/String;)Ljava/lang/String;
    //   55: invokespecial 64	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   58: astore_2
    //   59: new 129	java/io/BufferedWriter
    //   62: dup
    //   63: new 131	java/io/FileWriter
    //   66: dup
    //   67: aload_2
    //   68: invokespecial 134	java/io/FileWriter:<init>	(Ljava/io/File;)V
    //   71: invokespecial 137	java/io/BufferedWriter:<init>	(Ljava/io/Writer;)V
    //   74: astore_2
    //   75: aload_2
    //   76: new 94	java/lang/StringBuilder
    //   79: dup
    //   80: invokespecial 117	java/lang/StringBuilder:<init>	()V
    //   83: ldc 92
    //   85: invokestatic 61	com/tencent/a/a/a/a/h:f	(Ljava/lang/String;)Ljava/lang/String;
    //   88: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   91: ldc 86
    //   93: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: aload_1
    //   97: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: invokevirtual 106	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   103: invokevirtual 140	java/io/BufferedWriter:write	(Ljava/lang/String;)V
    //   106: aload_2
    //   107: ldc -114
    //   109: invokevirtual 140	java/io/BufferedWriter:write	(Ljava/lang/String;)V
    //   112: aload_2
    //   113: invokevirtual 145	java/io/BufferedWriter:close	()V
    //   116: aload_0
    //   117: monitorexit
    //   118: return
    //   119: astore_1
    //   120: ldc 41
    //   122: aload_1
    //   123: invokestatic 110	android/util/Log:w	(Ljava/lang/String;Ljava/lang/Throwable;)I
    //   126: pop
    //   127: goto -11 -> 116
    //   130: astore_1
    //   131: aload_0
    //   132: monitorexit
    //   133: aload_1
    //   134: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	135	0	this	b
    //   0	135	1	paramString	String
    //   58	55	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   59	116	119	java/lang/Exception
    //   2	59	130	finally
    //   59	116	130	finally
    //   116	118	130	finally
    //   120	127	130	finally
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\a\a\a\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */