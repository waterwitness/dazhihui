package de.greenrobot.event;

import android.os.Handler;
import android.os.Looper;

final class HandlerPoster
  extends Handler
{
  private final EventBus eventBus;
  private boolean handlerActive;
  private final int maxMillisInsideHandleMessage;
  private final PendingPostQueue queue;
  
  HandlerPoster(EventBus paramEventBus, Looper paramLooper, int paramInt)
  {
    super(paramLooper);
    this.eventBus = paramEventBus;
    this.maxMillisInsideHandleMessage = paramInt;
    this.queue = new PendingPostQueue();
  }
  
  void enqueue(Subscription paramSubscription, Object paramObject)
  {
    paramSubscription = PendingPost.obtainPendingPost(paramSubscription, paramObject);
    try
    {
      this.queue.enqueue(paramSubscription);
      if (!this.handlerActive)
      {
        this.handlerActive = true;
        if (!sendMessage(obtainMessage())) {
          throw new EventBusException("Could not send handler message");
        }
      }
    }
    finally {}
  }
  
  /* Error */
  public void handleMessage(android.os.Message paramMessage)
  {
    // Byte code:
    //   0: invokestatic 65	android/os/SystemClock:uptimeMillis	()J
    //   3: lstore_3
    //   4: aload_0
    //   5: getfield 28	de/greenrobot/event/HandlerPoster:queue	Lde/greenrobot/event/PendingPostQueue;
    //   8: invokevirtual 69	de/greenrobot/event/PendingPostQueue:poll	()Lde/greenrobot/event/PendingPost;
    //   11: astore_2
    //   12: aload_2
    //   13: astore_1
    //   14: aload_2
    //   15: ifnonnull +32 -> 47
    //   18: aload_0
    //   19: monitorenter
    //   20: aload_0
    //   21: getfield 28	de/greenrobot/event/HandlerPoster:queue	Lde/greenrobot/event/PendingPostQueue;
    //   24: invokevirtual 69	de/greenrobot/event/PendingPostQueue:poll	()Lde/greenrobot/event/PendingPost;
    //   27: astore_1
    //   28: aload_1
    //   29: ifnonnull +16 -> 45
    //   32: aload_0
    //   33: iconst_0
    //   34: putfield 42	de/greenrobot/event/HandlerPoster:handlerActive	Z
    //   37: aload_0
    //   38: monitorexit
    //   39: aload_0
    //   40: iconst_0
    //   41: putfield 42	de/greenrobot/event/HandlerPoster:handlerActive	Z
    //   44: return
    //   45: aload_0
    //   46: monitorexit
    //   47: aload_0
    //   48: getfield 19	de/greenrobot/event/HandlerPoster:eventBus	Lde/greenrobot/event/EventBus;
    //   51: aload_1
    //   52: invokevirtual 74	de/greenrobot/event/EventBus:invokeSubscriber	(Lde/greenrobot/event/PendingPost;)V
    //   55: invokestatic 65	android/os/SystemClock:uptimeMillis	()J
    //   58: lload_3
    //   59: lsub
    //   60: aload_0
    //   61: getfield 21	de/greenrobot/event/HandlerPoster:maxMillisInsideHandleMessage	I
    //   64: i2l
    //   65: lcmp
    //   66: iflt -62 -> 4
    //   69: aload_0
    //   70: aload_0
    //   71: invokevirtual 46	de/greenrobot/event/HandlerPoster:obtainMessage	()Landroid/os/Message;
    //   74: invokevirtual 50	de/greenrobot/event/HandlerPoster:sendMessage	(Landroid/os/Message;)Z
    //   77: ifne +26 -> 103
    //   80: new 52	de/greenrobot/event/EventBusException
    //   83: dup
    //   84: ldc 54
    //   86: invokespecial 57	de/greenrobot/event/EventBusException:<init>	(Ljava/lang/String;)V
    //   89: athrow
    //   90: astore_1
    //   91: aload_0
    //   92: iconst_0
    //   93: putfield 42	de/greenrobot/event/HandlerPoster:handlerActive	Z
    //   96: aload_1
    //   97: athrow
    //   98: astore_1
    //   99: aload_0
    //   100: monitorexit
    //   101: aload_1
    //   102: athrow
    //   103: aload_0
    //   104: iconst_1
    //   105: putfield 42	de/greenrobot/event/HandlerPoster:handlerActive	Z
    //   108: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	109	0	this	HandlerPoster
    //   0	109	1	paramMessage	android.os.Message
    //   11	4	2	localPendingPost	PendingPost
    //   3	56	3	l	long
    // Exception table:
    //   from	to	target	type
    //   0	4	90	finally
    //   4	12	90	finally
    //   18	20	90	finally
    //   47	90	90	finally
    //   101	103	90	finally
    //   20	28	98	finally
    //   32	39	98	finally
    //   45	47	98	finally
    //   99	101	98	finally
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\de\greenrobot\event\HandlerPoster.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */