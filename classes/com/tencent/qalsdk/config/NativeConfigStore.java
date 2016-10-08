package com.tencent.qalsdk.config;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

public class NativeConfigStore
{
  private static final String NATIVE_LIB_NAME = "msfbootV2";
  private static String tag = "MSF.C.NativeConfigStore";
  Context context;
  public AtomicBoolean loadSaveRootSucc = new AtomicBoolean(true);
  
  public NativeConfigStore(Context paramContext)
  {
    this.context = paramContext;
  }
  
  public synchronized native String getConfig(String paramString);
  
  public synchronized native String[] getConfigList(String paramString);
  
  public synchronized native void loadConfig(Context paramContext, boolean paramBoolean);
  
  /* Error */
  public void n_removeConfig(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 31	com/tencent/qalsdk/config/NativeConfigStore:loadSaveRootSucc	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   6: invokevirtual 45	java/util/concurrent/atomic/AtomicBoolean:get	()Z
    //   9: ifne +15 -> 24
    //   12: getstatic 19	com/tencent/qalsdk/config/NativeConfigStore:tag	Ljava/lang/String;
    //   15: iconst_1
    //   16: ldc 47
    //   18: invokestatic 53	com/tencent/qalsdk/util/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   21: aload_0
    //   22: monitorexit
    //   23: return
    //   24: aload_0
    //   25: aload_1
    //   26: invokevirtual 56	com/tencent/qalsdk/config/NativeConfigStore:removeConfig	(Ljava/lang/String;)V
    //   29: goto -8 -> 21
    //   32: astore_1
    //   33: aload_0
    //   34: monitorexit
    //   35: aload_1
    //   36: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	37	0	this	NativeConfigStore
    //   0	37	1	paramString	String
    // Exception table:
    //   from	to	target	type
    //   2	21	32	finally
    //   24	29	32	finally
  }
  
  /* Error */
  public void n_setConfig(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 31	com/tencent/qalsdk/config/NativeConfigStore:loadSaveRootSucc	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   6: invokevirtual 45	java/util/concurrent/atomic/AtomicBoolean:get	()Z
    //   9: ifne +15 -> 24
    //   12: getstatic 19	com/tencent/qalsdk/config/NativeConfigStore:tag	Ljava/lang/String;
    //   15: iconst_1
    //   16: ldc 47
    //   18: invokestatic 53	com/tencent/qalsdk/util/QLog:w	(Ljava/lang/String;ILjava/lang/String;)V
    //   21: aload_0
    //   22: monitorexit
    //   23: return
    //   24: aload_0
    //   25: aload_1
    //   26: aload_2
    //   27: invokevirtual 61	com/tencent/qalsdk/config/NativeConfigStore:setConfig	(Ljava/lang/String;Ljava/lang/String;)V
    //   30: goto -9 -> 21
    //   33: astore_1
    //   34: aload_0
    //   35: monitorexit
    //   36: aload_1
    //   37: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	38	0	this	NativeConfigStore
    //   0	38	1	paramString1	String
    //   0	38	2	paramString2	String
    // Exception table:
    //   from	to	target	type
    //   2	21	33	finally
    //   24	30	33	finally
  }
  
  public synchronized native void removeConfig(String paramString);
  
  public synchronized native void setConfig(String paramString1, String paramString2);
  
  public synchronized native void setSaveRootPath(String paramString);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\qalsdk\config\NativeConfigStore.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */