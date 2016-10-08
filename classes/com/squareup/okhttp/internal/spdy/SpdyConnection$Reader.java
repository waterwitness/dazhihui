package com.squareup.okhttp.internal.spdy;

import com.squareup.okhttp.internal.Util;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ExecutorService;

class SpdyConnection$Reader
  implements FrameReader.Handler, Runnable
{
  private SpdyConnection$Reader(SpdyConnection paramSpdyConnection) {}
  
  public void data(boolean paramBoolean, int paramInt1, InputStream paramInputStream, int paramInt2)
  {
    SpdyStream localSpdyStream = SpdyConnection.access$3(this.this$0, paramInt1);
    if (localSpdyStream == null)
    {
      this.this$0.writeSynResetLater(paramInt1, ErrorCode.INVALID_STREAM);
      Util.skipByReading(paramInputStream, paramInt2);
    }
    do
    {
      return;
      localSpdyStream.receiveData(paramInputStream, paramInt2);
    } while (!paramBoolean);
    localSpdyStream.receiveFin();
  }
  
  public void goAway(int paramInt, ErrorCode arg2)
  {
    synchronized (this.this$0)
    {
      SpdyConnection.access$14(this.this$0, true);
      Iterator localIterator = SpdyConnection.access$8(this.this$0).entrySet().iterator();
      Map.Entry localEntry;
      do
      {
        if (!localIterator.hasNext()) {
          return;
        }
        localEntry = (Map.Entry)localIterator.next();
      } while ((((Integer)localEntry.getKey()).intValue() <= paramInt) || (!((SpdyStream)localEntry.getValue()).isLocallyInitiated()));
      ((SpdyStream)localEntry.getValue()).receiveRstStream(ErrorCode.REFUSED_STREAM);
      localIterator.remove();
    }
  }
  
  public void headers(boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2, int paramInt3, List<String> paramList, HeadersMode paramHeadersMode)
  {
    SpdyStream localSpdyStream;
    synchronized (this.this$0)
    {
      if (SpdyConnection.access$4(this.this$0)) {
        return;
      }
      localSpdyStream = SpdyConnection.access$3(this.this$0, paramInt1);
      if (localSpdyStream != null) {
        break label203;
      }
      if (paramHeadersMode.failIfStreamAbsent())
      {
        this.this$0.writeSynResetLater(paramInt1, ErrorCode.INVALID_STREAM);
        return;
      }
    }
    if (paramInt1 <= SpdyConnection.access$5(this.this$0)) {
      return;
    }
    if (paramInt1 % 2 == SpdyConnection.access$6(this.this$0) % 2) {
      return;
    }
    paramList = new SpdyStream(paramInt1, this.this$0, paramBoolean1, paramBoolean2, paramInt3, paramList, this.this$0.settings);
    SpdyConnection.access$7(this.this$0, paramInt1);
    SpdyConnection.access$8(this.this$0).put(Integer.valueOf(paramInt1), paramList);
    SpdyConnection.access$9().submit(new SpdyConnection.Reader.1(this, "OkHttp Callback %s stream %d", new Object[] { SpdyConnection.access$10(this.this$0), Integer.valueOf(paramInt1) }, paramList));
    return;
    label203:
    if (paramHeadersMode.failIfStreamPresent())
    {
      localSpdyStream.closeLater(ErrorCode.PROTOCOL_ERROR);
      this.this$0.removeStream(paramInt1);
      return;
    }
    localSpdyStream.receiveHeaders(paramList, paramHeadersMode);
    if (paramBoolean2) {
      localSpdyStream.receiveFin();
    }
  }
  
  public void noop() {}
  
  public void ping(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    if (paramBoolean)
    {
      Ping localPing = SpdyConnection.access$12(this.this$0, paramInt1);
      if (localPing != null) {
        localPing.receive();
      }
      return;
    }
    SpdyConnection.access$13(this.this$0, true, paramInt1, paramInt2, null);
  }
  
  public void priority(int paramInt1, int paramInt2) {}
  
  public void rstStream(int paramInt, ErrorCode paramErrorCode)
  {
    SpdyStream localSpdyStream = this.this$0.removeStream(paramInt);
    if (localSpdyStream != null) {
      localSpdyStream.receiveRstStream(paramErrorCode);
    }
  }
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: getstatic 216	com/squareup/okhttp/internal/spdy/ErrorCode:INTERNAL_ERROR	Lcom/squareup/okhttp/internal/spdy/ErrorCode;
    //   3: astore_3
    //   4: getstatic 216	com/squareup/okhttp/internal/spdy/ErrorCode:INTERNAL_ERROR	Lcom/squareup/okhttp/internal/spdy/ErrorCode;
    //   7: astore 4
    //   9: aload_3
    //   10: astore_2
    //   11: aload_3
    //   12: astore_1
    //   13: aload_0
    //   14: getfield 14	com/squareup/okhttp/internal/spdy/SpdyConnection$Reader:this$0	Lcom/squareup/okhttp/internal/spdy/SpdyConnection;
    //   17: invokestatic 220	com/squareup/okhttp/internal/spdy/SpdyConnection:access$2	(Lcom/squareup/okhttp/internal/spdy/SpdyConnection;)Lcom/squareup/okhttp/internal/spdy/FrameReader;
    //   20: aload_0
    //   21: invokeinterface 226 2 0
    //   26: ifne -17 -> 9
    //   29: aload_3
    //   30: astore_2
    //   31: aload_3
    //   32: astore_1
    //   33: getstatic 229	com/squareup/okhttp/internal/spdy/ErrorCode:NO_ERROR	Lcom/squareup/okhttp/internal/spdy/ErrorCode;
    //   36: astore_3
    //   37: aload_3
    //   38: astore_2
    //   39: aload_3
    //   40: astore_1
    //   41: getstatic 232	com/squareup/okhttp/internal/spdy/ErrorCode:CANCEL	Lcom/squareup/okhttp/internal/spdy/ErrorCode;
    //   44: astore 5
    //   46: aload_0
    //   47: getfield 14	com/squareup/okhttp/internal/spdy/SpdyConnection$Reader:this$0	Lcom/squareup/okhttp/internal/spdy/SpdyConnection;
    //   50: aload_3
    //   51: aload 5
    //   53: invokestatic 235	com/squareup/okhttp/internal/spdy/SpdyConnection:access$1	(Lcom/squareup/okhttp/internal/spdy/SpdyConnection;Lcom/squareup/okhttp/internal/spdy/ErrorCode;Lcom/squareup/okhttp/internal/spdy/ErrorCode;)V
    //   56: return
    //   57: astore_1
    //   58: aload_2
    //   59: astore_1
    //   60: getstatic 178	com/squareup/okhttp/internal/spdy/ErrorCode:PROTOCOL_ERROR	Lcom/squareup/okhttp/internal/spdy/ErrorCode;
    //   63: astore_3
    //   64: getstatic 178	com/squareup/okhttp/internal/spdy/ErrorCode:PROTOCOL_ERROR	Lcom/squareup/okhttp/internal/spdy/ErrorCode;
    //   67: astore_1
    //   68: aload_0
    //   69: getfield 14	com/squareup/okhttp/internal/spdy/SpdyConnection$Reader:this$0	Lcom/squareup/okhttp/internal/spdy/SpdyConnection;
    //   72: aload_3
    //   73: aload_1
    //   74: invokestatic 235	com/squareup/okhttp/internal/spdy/SpdyConnection:access$1	(Lcom/squareup/okhttp/internal/spdy/SpdyConnection;Lcom/squareup/okhttp/internal/spdy/ErrorCode;Lcom/squareup/okhttp/internal/spdy/ErrorCode;)V
    //   77: return
    //   78: astore_1
    //   79: return
    //   80: astore_2
    //   81: aload_1
    //   82: astore_3
    //   83: aload_2
    //   84: astore_1
    //   85: aload_0
    //   86: getfield 14	com/squareup/okhttp/internal/spdy/SpdyConnection$Reader:this$0	Lcom/squareup/okhttp/internal/spdy/SpdyConnection;
    //   89: aload_3
    //   90: aload 4
    //   92: invokestatic 235	com/squareup/okhttp/internal/spdy/SpdyConnection:access$1	(Lcom/squareup/okhttp/internal/spdy/SpdyConnection;Lcom/squareup/okhttp/internal/spdy/ErrorCode;Lcom/squareup/okhttp/internal/spdy/ErrorCode;)V
    //   95: aload_1
    //   96: athrow
    //   97: astore_1
    //   98: return
    //   99: astore_2
    //   100: goto -5 -> 95
    //   103: astore_1
    //   104: goto -19 -> 85
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	107	0	this	Reader
    //   12	29	1	localObject1	Object
    //   57	1	1	localIOException1	java.io.IOException
    //   59	15	1	localObject2	Object
    //   78	4	1	localIOException2	java.io.IOException
    //   84	12	1	localObject3	Object
    //   97	1	1	localIOException3	java.io.IOException
    //   103	1	1	localObject4	Object
    //   10	49	2	localObject5	Object
    //   80	4	2	localObject6	Object
    //   99	1	2	localIOException4	java.io.IOException
    //   3	87	3	localObject7	Object
    //   7	84	4	localErrorCode1	ErrorCode
    //   44	8	5	localErrorCode2	ErrorCode
    // Exception table:
    //   from	to	target	type
    //   13	29	57	java/io/IOException
    //   33	37	57	java/io/IOException
    //   41	46	57	java/io/IOException
    //   68	77	78	java/io/IOException
    //   13	29	80	finally
    //   33	37	80	finally
    //   41	46	80	finally
    //   60	64	80	finally
    //   46	56	97	java/io/IOException
    //   85	95	99	java/io/IOException
    //   64	68	103	finally
  }
  
  public void settings(boolean paramBoolean, Settings paramSettings)
  {
    for (;;)
    {
      int i;
      synchronized (this.this$0)
      {
        if ((this.this$0.settings == null) || (paramBoolean))
        {
          this.this$0.settings = paramSettings;
          if (SpdyConnection.access$8(this.this$0).isEmpty()) {
            break label172;
          }
          paramSettings = (SpdyStream[])SpdyConnection.access$8(this.this$0).values().toArray(new SpdyStream[SpdyConnection.access$8(this.this$0).size()]);
          if (paramSettings != null)
          {
            int j = paramSettings.length;
            i = 0;
            if (i < j) {
              break label120;
            }
          }
        }
        else
        {
          this.this$0.settings.merge(paramSettings);
        }
      }
      label120:
      synchronized (paramSettings[i])
      {
        synchronized (this.this$0)
        {
          ???.receiveSettings(this.this$0.settings);
          i += 1;
        }
      }
      label172:
      paramSettings = null;
    }
  }
  
  public void windowUpdate(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramInt1 == 0) {}
    SpdyStream localSpdyStream;
    do
    {
      return;
      localSpdyStream = SpdyConnection.access$3(this.this$0, paramInt1);
    } while (localSpdyStream == null);
    localSpdyStream.receiveWindowUpdate(paramInt2);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\spdy\SpdyConnection$Reader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */