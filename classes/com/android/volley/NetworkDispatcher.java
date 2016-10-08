package com.android.volley;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.os.Build.VERSION;
import java.util.concurrent.BlockingQueue;

public class NetworkDispatcher
  extends Thread
{
  private final Cache mCache;
  private final ResponseDelivery mDelivery;
  private final Network mNetwork;
  private final BlockingQueue<Request<?>> mQueue;
  private volatile boolean mQuit = false;
  
  public NetworkDispatcher(BlockingQueue<Request<?>> paramBlockingQueue, Network paramNetwork, Cache paramCache, ResponseDelivery paramResponseDelivery)
  {
    this.mQueue = paramBlockingQueue;
    this.mNetwork = paramNetwork;
    this.mCache = paramCache;
    this.mDelivery = paramResponseDelivery;
  }
  
  @TargetApi(14)
  private void addTrafficStatsTag(Request<?> paramRequest)
  {
    if (Build.VERSION.SDK_INT >= 14) {
      TrafficStats.setThreadStatsTag(paramRequest.getTrafficStatsTag());
    }
  }
  
  private void parseAndDeliverNetworkError(Request<?> paramRequest, VolleyError paramVolleyError)
  {
    paramVolleyError = paramRequest.parseNetworkError(paramVolleyError);
    this.mDelivery.postError(paramRequest, paramVolleyError);
  }
  
  public void quit()
  {
    this.mQuit = true;
    interrupt();
  }
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: bipush 10
    //   2: invokestatic 86	android/os/Process:setThreadPriority	(I)V
    //   5: invokestatic 92	android/os/SystemClock:elapsedRealtime	()J
    //   8: lstore_3
    //   9: aload_0
    //   10: getfield 24	com/android/volley/NetworkDispatcher:mQueue	Ljava/util/concurrent/BlockingQueue;
    //   13: invokeinterface 98 1 0
    //   18: checkcast 46	com/android/volley/Request
    //   21: astore_1
    //   22: aload_1
    //   23: ldc 100
    //   25: invokevirtual 104	com/android/volley/Request:addMarker	(Ljava/lang/String;)V
    //   28: aload_1
    //   29: invokevirtual 108	com/android/volley/Request:isCanceled	()Z
    //   32: ifeq +40 -> 72
    //   35: aload_1
    //   36: ldc 110
    //   38: invokevirtual 113	com/android/volley/Request:finish	(Ljava/lang/String;)V
    //   41: goto -36 -> 5
    //   44: astore_2
    //   45: aload_2
    //   46: invokestatic 92	android/os/SystemClock:elapsedRealtime	()J
    //   49: lload_3
    //   50: lsub
    //   51: invokevirtual 117	com/android/volley/VolleyError:setNetworkTimeMs	(J)V
    //   54: aload_0
    //   55: aload_1
    //   56: aload_2
    //   57: invokespecial 119	com/android/volley/NetworkDispatcher:parseAndDeliverNetworkError	(Lcom/android/volley/Request;Lcom/android/volley/VolleyError;)V
    //   60: goto -55 -> 5
    //   63: astore_1
    //   64: aload_0
    //   65: getfield 22	com/android/volley/NetworkDispatcher:mQuit	Z
    //   68: ifeq -63 -> 5
    //   71: return
    //   72: aload_0
    //   73: aload_1
    //   74: invokespecial 121	com/android/volley/NetworkDispatcher:addTrafficStatsTag	(Lcom/android/volley/Request;)V
    //   77: aload_0
    //   78: getfield 26	com/android/volley/NetworkDispatcher:mNetwork	Lcom/android/volley/Network;
    //   81: aload_1
    //   82: invokeinterface 127 2 0
    //   87: astore_2
    //   88: aload_1
    //   89: ldc -127
    //   91: invokevirtual 104	com/android/volley/Request:addMarker	(Ljava/lang/String;)V
    //   94: aload_2
    //   95: getfield 134	com/android/volley/NetworkResponse:notModified	Z
    //   98: ifeq +69 -> 167
    //   101: aload_1
    //   102: invokevirtual 137	com/android/volley/Request:hasHadResponseDelivered	()Z
    //   105: ifeq +62 -> 167
    //   108: aload_1
    //   109: ldc -117
    //   111: invokevirtual 113	com/android/volley/Request:finish	(Ljava/lang/String;)V
    //   114: goto -109 -> 5
    //   117: astore_2
    //   118: aload_2
    //   119: ldc -115
    //   121: iconst_1
    //   122: anewarray 143	java/lang/Object
    //   125: dup
    //   126: iconst_0
    //   127: aload_2
    //   128: invokevirtual 147	java/lang/Exception:toString	()Ljava/lang/String;
    //   131: aastore
    //   132: invokestatic 153	com/android/volley/VolleyLog:e	(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   135: new 79	com/android/volley/VolleyError
    //   138: dup
    //   139: aload_2
    //   140: invokespecial 156	com/android/volley/VolleyError:<init>	(Ljava/lang/Throwable;)V
    //   143: astore_2
    //   144: aload_2
    //   145: invokestatic 92	android/os/SystemClock:elapsedRealtime	()J
    //   148: lload_3
    //   149: lsub
    //   150: invokevirtual 117	com/android/volley/VolleyError:setNetworkTimeMs	(J)V
    //   153: aload_0
    //   154: getfield 30	com/android/volley/NetworkDispatcher:mDelivery	Lcom/android/volley/ResponseDelivery;
    //   157: aload_1
    //   158: aload_2
    //   159: invokeinterface 69 3 0
    //   164: goto -159 -> 5
    //   167: aload_1
    //   168: aload_2
    //   169: invokevirtual 160	com/android/volley/Request:parseNetworkResponse	(Lcom/android/volley/NetworkResponse;)Lcom/android/volley/Response;
    //   172: astore_2
    //   173: aload_1
    //   174: ldc -94
    //   176: invokevirtual 104	com/android/volley/Request:addMarker	(Ljava/lang/String;)V
    //   179: aload_1
    //   180: invokevirtual 165	com/android/volley/Request:shouldCache	()Z
    //   183: ifeq +33 -> 216
    //   186: aload_2
    //   187: getfield 171	com/android/volley/Response:cacheEntry	Lcom/android/volley/Cache$Entry;
    //   190: ifnull +26 -> 216
    //   193: aload_0
    //   194: getfield 28	com/android/volley/NetworkDispatcher:mCache	Lcom/android/volley/Cache;
    //   197: aload_1
    //   198: invokevirtual 174	com/android/volley/Request:getCacheKey	()Ljava/lang/String;
    //   201: aload_2
    //   202: getfield 171	com/android/volley/Response:cacheEntry	Lcom/android/volley/Cache$Entry;
    //   205: invokeinterface 180 3 0
    //   210: aload_1
    //   211: ldc -74
    //   213: invokevirtual 104	com/android/volley/Request:addMarker	(Ljava/lang/String;)V
    //   216: aload_1
    //   217: invokevirtual 185	com/android/volley/Request:markDelivered	()V
    //   220: aload_0
    //   221: getfield 30	com/android/volley/NetworkDispatcher:mDelivery	Lcom/android/volley/ResponseDelivery;
    //   224: aload_1
    //   225: aload_2
    //   226: invokeinterface 189 3 0
    //   231: goto -226 -> 5
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	234	0	this	NetworkDispatcher
    //   21	35	1	localRequest	Request
    //   63	162	1	localInterruptedException	InterruptedException
    //   44	13	2	localVolleyError	VolleyError
    //   87	8	2	localNetworkResponse	NetworkResponse
    //   117	23	2	localException	Exception
    //   143	83	2	localObject	Object
    //   8	141	3	l	long
    // Exception table:
    //   from	to	target	type
    //   22	41	44	com/android/volley/VolleyError
    //   72	114	44	com/android/volley/VolleyError
    //   167	216	44	com/android/volley/VolleyError
    //   216	231	44	com/android/volley/VolleyError
    //   9	22	63	java/lang/InterruptedException
    //   22	41	117	java/lang/Exception
    //   72	114	117	java/lang/Exception
    //   167	216	117	java/lang/Exception
    //   216	231	117	java/lang/Exception
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\volley\NetworkDispatcher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */