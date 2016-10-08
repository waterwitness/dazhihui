package com.alipay.c.h;

final class c
  implements Runnable
{
  c(b paramb) {}
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: iconst_0
    //   1: invokestatic 25	android/os/Process:setThreadPriority	(I)V
    //   4: aload_0
    //   5: getfield 12	com/alipay/c/h/c:a	Lcom/alipay/c/h/b;
    //   8: invokestatic 30	com/alipay/c/h/b:a	(Lcom/alipay/c/h/b;)Ljava/util/LinkedList;
    //   11: invokevirtual 36	java/util/LinkedList:isEmpty	()Z
    //   14: ifne +40 -> 54
    //   17: aload_0
    //   18: getfield 12	com/alipay/c/h/c:a	Lcom/alipay/c/h/b;
    //   21: invokestatic 30	com/alipay/c/h/b:a	(Lcom/alipay/c/h/b;)Ljava/util/LinkedList;
    //   24: invokevirtual 40	java/util/LinkedList:pollFirst	()Ljava/lang/Object;
    //   27: checkcast 6	java/lang/Runnable
    //   30: astore_1
    //   31: aload_1
    //   32: ifnull -28 -> 4
    //   35: aload_1
    //   36: invokeinterface 42 1 0
    //   41: goto -37 -> 4
    //   44: astore_1
    //   45: aload_0
    //   46: getfield 12	com/alipay/c/h/c:a	Lcom/alipay/c/h/b;
    //   49: invokestatic 46	com/alipay/c/h/b:b	(Lcom/alipay/c/h/b;)Ljava/lang/Thread;
    //   52: pop
    //   53: return
    //   54: aload_0
    //   55: getfield 12	com/alipay/c/h/c:a	Lcom/alipay/c/h/b;
    //   58: invokestatic 46	com/alipay/c/h/b:b	(Lcom/alipay/c/h/b;)Ljava/lang/Thread;
    //   61: pop
    //   62: return
    //   63: astore_1
    //   64: aload_0
    //   65: getfield 12	com/alipay/c/h/c:a	Lcom/alipay/c/h/b;
    //   68: invokestatic 46	com/alipay/c/h/b:b	(Lcom/alipay/c/h/b;)Ljava/lang/Thread;
    //   71: pop
    //   72: aload_1
    //   73: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	74	0	this	c
    //   30	6	1	localRunnable	Runnable
    //   44	1	1	localException	Exception
    //   63	10	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   0	4	44	java/lang/Exception
    //   4	31	44	java/lang/Exception
    //   35	41	44	java/lang/Exception
    //   0	4	63	finally
    //   4	31	63	finally
    //   35	41	63	finally
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\c\h\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */