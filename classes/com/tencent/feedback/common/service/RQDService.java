package com.tencent.feedback.common.service;

import android.app.IntentService;
import android.content.Intent;
import android.os.IBinder;
import com.tencent.feedback.common.e;
import java.util.concurrent.atomic.AtomicInteger;

public class RQDService
  extends IntentService
{
  protected static AtomicInteger currentPendingNum = new AtomicInteger(0);
  
  public RQDService()
  {
    super("RQDSERVICE");
  }
  
  /* Error */
  protected void handleIntent(Intent paramIntent)
  {
    // Byte code:
    //   0: ldc 28
    //   2: aload_1
    //   3: invokevirtual 34	android/content/Intent:getAction	()Ljava/lang/String;
    //   6: invokevirtual 40	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   9: ifne +4 -> 13
    //   12: return
    //   13: aload_1
    //   14: invokestatic 46	com/tencent/feedback/common/service/a:a	(Landroid/content/Intent;)Lcom/tencent/feedback/common/service/RQDServiceTask;
    //   17: astore_2
    //   18: aload_2
    //   19: ifnull -7 -> 12
    //   22: ldc 48
    //   24: iconst_2
    //   25: anewarray 50	java/lang/Object
    //   28: dup
    //   29: iconst_0
    //   30: aload_2
    //   31: invokeinterface 56 1 0
    //   36: invokestatic 62	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   39: aastore
    //   40: dup
    //   41: iconst_1
    //   42: aload_2
    //   43: invokeinterface 65 1 0
    //   48: aastore
    //   49: invokestatic 71	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   52: getstatic 16	com/tencent/feedback/common/service/RQDService:currentPendingNum	Ljava/util/concurrent/atomic/AtomicInteger;
    //   55: iconst_1
    //   56: invokevirtual 75	java/util/concurrent/atomic/AtomicInteger:addAndGet	(I)I
    //   59: pop
    //   60: aload_2
    //   61: aload_0
    //   62: aload_1
    //   63: invokeinterface 79 3 0
    //   68: getstatic 16	com/tencent/feedback/common/service/RQDService:currentPendingNum	Ljava/util/concurrent/atomic/AtomicInteger;
    //   71: iconst_m1
    //   72: invokevirtual 75	java/util/concurrent/atomic/AtomicInteger:addAndGet	(I)I
    //   75: pop
    //   76: ldc 81
    //   78: iconst_1
    //   79: anewarray 50	java/lang/Object
    //   82: dup
    //   83: iconst_0
    //   84: getstatic 16	com/tencent/feedback/common/service/RQDService:currentPendingNum	Ljava/util/concurrent/atomic/AtomicInteger;
    //   87: invokevirtual 84	java/util/concurrent/atomic/AtomicInteger:get	()I
    //   90: invokestatic 62	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   93: aastore
    //   94: invokestatic 71	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   97: return
    //   98: astore_1
    //   99: aload_1
    //   100: invokevirtual 87	java/lang/Throwable:printStackTrace	()V
    //   103: getstatic 16	com/tencent/feedback/common/service/RQDService:currentPendingNum	Ljava/util/concurrent/atomic/AtomicInteger;
    //   106: iconst_m1
    //   107: invokevirtual 75	java/util/concurrent/atomic/AtomicInteger:addAndGet	(I)I
    //   110: pop
    //   111: ldc 81
    //   113: iconst_1
    //   114: anewarray 50	java/lang/Object
    //   117: dup
    //   118: iconst_0
    //   119: getstatic 16	com/tencent/feedback/common/service/RQDService:currentPendingNum	Ljava/util/concurrent/atomic/AtomicInteger;
    //   122: invokevirtual 84	java/util/concurrent/atomic/AtomicInteger:get	()I
    //   125: invokestatic 62	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   128: aastore
    //   129: invokestatic 71	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   132: return
    //   133: astore_1
    //   134: getstatic 16	com/tencent/feedback/common/service/RQDService:currentPendingNum	Ljava/util/concurrent/atomic/AtomicInteger;
    //   137: iconst_m1
    //   138: invokevirtual 75	java/util/concurrent/atomic/AtomicInteger:addAndGet	(I)I
    //   141: pop
    //   142: ldc 81
    //   144: iconst_1
    //   145: anewarray 50	java/lang/Object
    //   148: dup
    //   149: iconst_0
    //   150: getstatic 16	com/tencent/feedback/common/service/RQDService:currentPendingNum	Ljava/util/concurrent/atomic/AtomicInteger;
    //   153: invokevirtual 84	java/util/concurrent/atomic/AtomicInteger:get	()I
    //   156: invokestatic 62	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   159: aastore
    //   160: invokestatic 71	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   163: aload_1
    //   164: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	165	0	this	RQDService
    //   0	165	1	paramIntent	Intent
    //   17	44	2	localRQDServiceTask	RQDServiceTask
    // Exception table:
    //   from	to	target	type
    //   52	68	98	java/lang/Throwable
    //   52	68	133	finally
    //   99	103	133	finally
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }
  
  public void onCreate()
  {
    e.a = true;
    super.onCreate();
  }
  
  public void onDestroy()
  {
    e.b("service destory", new Object[0]);
    super.onDestroy();
  }
  
  protected void onHandleIntent(Intent paramIntent)
  {
    handleIntent(paramIntent);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\feedback\common\service\RQDService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */