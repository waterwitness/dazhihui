package com.android.volley;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

class VolleyLog$MarkerLog
{
  public static final boolean ENABLED = VolleyLog.DEBUG;
  private static final long MIN_DURATION_FOR_LOGGING_MS = 0L;
  private boolean mFinished = false;
  private final List<VolleyLog.MarkerLog.Marker> mMarkers = new ArrayList();
  
  private long getTotalDuration()
  {
    if (this.mMarkers.size() == 0) {
      return 0L;
    }
    long l = ((VolleyLog.MarkerLog.Marker)this.mMarkers.get(0)).time;
    return ((VolleyLog.MarkerLog.Marker)this.mMarkers.get(this.mMarkers.size() - 1)).time - l;
  }
  
  public void add(String paramString, long paramLong)
  {
    try
    {
      if (this.mFinished) {
        throw new IllegalStateException("Marker added to finished log");
      }
    }
    finally {}
    this.mMarkers.add(new VolleyLog.MarkerLog.Marker(paramString, paramLong, SystemClock.elapsedRealtime()));
  }
  
  protected void finalize()
  {
    if (!this.mFinished)
    {
      finish("Request on the loose");
      VolleyLog.e("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
  }
  
  /* Error */
  public void finish(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iconst_1
    //   4: putfield 34	com/android/volley/VolleyLog$MarkerLog:mFinished	Z
    //   7: aload_0
    //   8: invokespecial 85	com/android/volley/VolleyLog$MarkerLog:getTotalDuration	()J
    //   11: lstore 5
    //   13: lload 5
    //   15: lconst_0
    //   16: lcmp
    //   17: ifgt +6 -> 23
    //   20: aload_0
    //   21: monitorexit
    //   22: return
    //   23: aload_0
    //   24: getfield 32	com/android/volley/VolleyLog$MarkerLog:mMarkers	Ljava/util/List;
    //   27: iconst_0
    //   28: invokeinterface 46 2 0
    //   33: checkcast 48	com/android/volley/VolleyLog$MarkerLog$Marker
    //   36: getfield 51	com/android/volley/VolleyLog$MarkerLog$Marker:time	J
    //   39: lstore_3
    //   40: ldc 87
    //   42: iconst_2
    //   43: anewarray 4	java/lang/Object
    //   46: dup
    //   47: iconst_0
    //   48: lload 5
    //   50: invokestatic 93	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   53: aastore
    //   54: dup
    //   55: iconst_1
    //   56: aload_1
    //   57: aastore
    //   58: invokestatic 96	com/android/volley/VolleyLog:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   61: aload_0
    //   62: getfield 32	com/android/volley/VolleyLog$MarkerLog:mMarkers	Ljava/util/List;
    //   65: invokeinterface 100 1 0
    //   70: astore_1
    //   71: aload_1
    //   72: invokeinterface 106 1 0
    //   77: ifeq -57 -> 20
    //   80: aload_1
    //   81: invokeinterface 110 1 0
    //   86: checkcast 48	com/android/volley/VolleyLog$MarkerLog$Marker
    //   89: astore_2
    //   90: aload_2
    //   91: getfield 51	com/android/volley/VolleyLog$MarkerLog$Marker:time	J
    //   94: lstore 5
    //   96: ldc 112
    //   98: iconst_3
    //   99: anewarray 4	java/lang/Object
    //   102: dup
    //   103: iconst_0
    //   104: lload 5
    //   106: lload_3
    //   107: lsub
    //   108: invokestatic 93	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   111: aastore
    //   112: dup
    //   113: iconst_1
    //   114: aload_2
    //   115: getfield 115	com/android/volley/VolleyLog$MarkerLog$Marker:thread	J
    //   118: invokestatic 93	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   121: aastore
    //   122: dup
    //   123: iconst_2
    //   124: aload_2
    //   125: getfield 119	com/android/volley/VolleyLog$MarkerLog$Marker:name	Ljava/lang/String;
    //   128: aastore
    //   129: invokestatic 96	com/android/volley/VolleyLog:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   132: lload 5
    //   134: lstore_3
    //   135: goto -64 -> 71
    //   138: astore_1
    //   139: aload_0
    //   140: monitorexit
    //   141: aload_1
    //   142: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	143	0	this	MarkerLog
    //   0	143	1	paramString	String
    //   89	36	2	localMarker	VolleyLog.MarkerLog.Marker
    //   39	96	3	l1	long
    //   11	122	5	l2	long
    // Exception table:
    //   from	to	target	type
    //   2	13	138	finally
    //   23	71	138	finally
    //   71	132	138	finally
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\volley\VolleyLog$MarkerLog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */