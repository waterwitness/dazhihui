package com.e.a.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.net.URI;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpResponseException;

public abstract class i
  implements ac
{
  protected static final int BUFFER_SIZE = 4096;
  protected static final int CANCEL_MESSAGE = 6;
  public static final String DEFAULT_CHARSET = "UTF-8";
  protected static final int FAILURE_MESSAGE = 1;
  protected static final int FINISH_MESSAGE = 3;
  private static final String LOG_TAG = "AsyncHttpResponseHandler";
  protected static final int PROGRESS_MESSAGE = 4;
  protected static final int RETRY_MESSAGE = 5;
  protected static final int START_MESSAGE = 2;
  protected static final int SUCCESS_MESSAGE = 0;
  public static final String UTF8_BOM = "﻿";
  private Handler handler;
  private Looper looper = null;
  private Header[] requestHeaders = null;
  private URI requestURI = null;
  private String responseCharset = "UTF-8";
  private boolean useSynchronousMode;
  
  public i()
  {
    this(null);
  }
  
  public i(Looper paramLooper)
  {
    Looper localLooper = paramLooper;
    if (paramLooper == null) {
      localLooper = Looper.myLooper();
    }
    this.looper = localLooper;
    setUseSynchronousMode(false);
  }
  
  public String getCharset()
  {
    if (this.responseCharset == null) {
      return "UTF-8";
    }
    return this.responseCharset;
  }
  
  public Header[] getRequestHeaders()
  {
    return this.requestHeaders;
  }
  
  public URI getRequestURI()
  {
    return this.requestURI;
  }
  
  /* Error */
  byte[] getResponseData(org.apache.http.HttpEntity paramHttpEntity)
  {
    // Byte code:
    //   0: sipush 4096
    //   3: istore 5
    //   5: aload_1
    //   6: ifnull +188 -> 194
    //   9: aload_1
    //   10: invokeinterface 86 1 0
    //   15: astore_2
    //   16: aload_2
    //   17: ifnull +177 -> 194
    //   20: aload_1
    //   21: invokeinterface 90 1 0
    //   26: lstore 9
    //   28: lload 9
    //   30: ldc2_w 91
    //   33: lcmp
    //   34: ifle +13 -> 47
    //   37: new 94	java/lang/IllegalArgumentException
    //   40: dup
    //   41: ldc 96
    //   43: invokespecial 99	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   46: athrow
    //   47: lload 9
    //   49: lconst_0
    //   50: lcmp
    //   51: ifgt +65 -> 116
    //   54: new 101	org/apache/http/util/ByteArrayBuffer
    //   57: dup
    //   58: iload 5
    //   60: invokespecial 104	org/apache/http/util/ByteArrayBuffer:<init>	(I)V
    //   63: astore_3
    //   64: sipush 4096
    //   67: newarray <illegal type>
    //   69: astore 4
    //   71: iconst_0
    //   72: istore 5
    //   74: aload_2
    //   75: aload 4
    //   77: invokevirtual 110	java/io/InputStream:read	([B)I
    //   80: istore 6
    //   82: iload 6
    //   84: iconst_m1
    //   85: if_icmpeq +16 -> 101
    //   88: invokestatic 116	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   91: invokevirtual 120	java/lang/Thread:isInterrupted	()Z
    //   94: istore 11
    //   96: iload 11
    //   98: ifeq +26 -> 124
    //   101: aload_2
    //   102: invokestatic 126	com/e/a/a/b:a	(Ljava/io/InputStream;)V
    //   105: aload_1
    //   106: invokestatic 129	com/e/a/a/b:a	(Lorg/apache/http/HttpEntity;)V
    //   109: aload_3
    //   110: invokevirtual 133	org/apache/http/util/ByteArrayBuffer:toByteArray	()[B
    //   113: astore_1
    //   114: aload_1
    //   115: areturn
    //   116: lload 9
    //   118: l2i
    //   119: istore 5
    //   121: goto -67 -> 54
    //   124: iload 5
    //   126: iload 6
    //   128: iadd
    //   129: istore 5
    //   131: aload_3
    //   132: aload 4
    //   134: iconst_0
    //   135: iload 6
    //   137: invokevirtual 137	org/apache/http/util/ByteArrayBuffer:append	([BII)V
    //   140: lload 9
    //   142: lconst_0
    //   143: lcmp
    //   144: ifgt +18 -> 162
    //   147: lconst_1
    //   148: lstore 7
    //   150: aload_0
    //   151: iload 5
    //   153: lload 7
    //   155: l2i
    //   156: invokevirtual 141	com/e/a/a/i:sendProgressMessage	(II)V
    //   159: goto -85 -> 74
    //   162: lload 9
    //   164: lstore 7
    //   166: goto -16 -> 150
    //   169: astore_3
    //   170: aload_2
    //   171: invokestatic 126	com/e/a/a/b:a	(Ljava/io/InputStream;)V
    //   174: aload_1
    //   175: invokestatic 129	com/e/a/a/b:a	(Lorg/apache/http/HttpEntity;)V
    //   178: aload_3
    //   179: athrow
    //   180: astore_1
    //   181: invokestatic 146	java/lang/System:gc	()V
    //   184: new 148	java/io/IOException
    //   187: dup
    //   188: ldc -106
    //   190: invokespecial 151	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   193: athrow
    //   194: aconst_null
    //   195: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	196	0	this	i
    //   0	196	1	paramHttpEntity	org.apache.http.HttpEntity
    //   15	156	2	localInputStream	java.io.InputStream
    //   63	69	3	localByteArrayBuffer	org.apache.http.util.ByteArrayBuffer
    //   169	10	3	localObject	Object
    //   69	64	4	arrayOfByte	byte[]
    //   3	149	5	i	int
    //   80	56	6	j	int
    //   148	17	7	l1	long
    //   26	137	9	l2	long
    //   94	3	11	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   64	71	169	finally
    //   74	82	169	finally
    //   88	96	169	finally
    //   131	140	169	finally
    //   150	159	169	finally
    //   54	64	180	java/lang/OutOfMemoryError
    //   101	114	180	java/lang/OutOfMemoryError
    //   170	180	180	java/lang/OutOfMemoryError
  }
  
  public boolean getUseSynchronousMode()
  {
    return this.useSynchronousMode;
  }
  
  protected void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      return;
    case 0: 
      paramMessage = (Object[])paramMessage.obj;
      if ((paramMessage != null) && (paramMessage.length >= 3))
      {
        onSuccess(((Integer)paramMessage[0]).intValue(), (Header[])paramMessage[1], (byte[])paramMessage[2]);
        return;
      }
      Log.e("AsyncHttpResponseHandler", "SUCCESS_MESSAGE didn't got enough params");
      return;
    case 1: 
      paramMessage = (Object[])paramMessage.obj;
      if ((paramMessage != null) && (paramMessage.length >= 4))
      {
        onFailure(((Integer)paramMessage[0]).intValue(), (Header[])paramMessage[1], (byte[])paramMessage[2], (Throwable)paramMessage[3]);
        return;
      }
      Log.e("AsyncHttpResponseHandler", "FAILURE_MESSAGE didn't got enough params");
      return;
    case 2: 
      onStart();
      return;
    case 3: 
      onFinish();
      return;
    case 4: 
      paramMessage = (Object[])paramMessage.obj;
      if ((paramMessage != null) && (paramMessage.length >= 2)) {
        try
        {
          onProgress(((Integer)paramMessage[0]).intValue(), ((Integer)paramMessage[1]).intValue());
          return;
        }
        catch (Throwable paramMessage)
        {
          Log.e("AsyncHttpResponseHandler", "custom onProgress contains an error", paramMessage);
          return;
        }
      }
      Log.e("AsyncHttpResponseHandler", "PROGRESS_MESSAGE didn't got enough params");
      return;
    case 5: 
      paramMessage = (Object[])paramMessage.obj;
      if ((paramMessage != null) && (paramMessage.length == 1))
      {
        onRetry(((Integer)paramMessage[0]).intValue());
        return;
      }
      Log.e("AsyncHttpResponseHandler", "RETRY_MESSAGE didn't get enough params");
      return;
    }
    onCancel();
  }
  
  protected Message obtainMessage(int paramInt, Object paramObject)
  {
    return Message.obtain(this.handler, paramInt, paramObject);
  }
  
  public void onCancel()
  {
    Log.d("AsyncHttpResponseHandler", "Request got cancelled");
  }
  
  public abstract void onFailure(int paramInt, Header[] paramArrayOfHeader, byte[] paramArrayOfByte, Throwable paramThrowable);
  
  public void onFinish() {}
  
  public void onPostProcessResponse(ac paramac, HttpResponse paramHttpResponse) {}
  
  public void onPreProcessResponse(ac paramac, HttpResponse paramHttpResponse) {}
  
  public void onProgress(int paramInt1, int paramInt2)
  {
    if (paramInt2 > 0) {}
    for (double d = paramInt1 * 1.0D / paramInt2 * 100.0D;; d = -1.0D)
    {
      Log.v("AsyncHttpResponseHandler", String.format("Progress %d from %d (%2.0f%%)", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Double.valueOf(d) }));
      return;
    }
  }
  
  public void onRetry(int paramInt)
  {
    Log.d("AsyncHttpResponseHandler", String.format("Request retry no. %d", new Object[] { Integer.valueOf(paramInt) }));
  }
  
  public void onStart() {}
  
  public abstract void onSuccess(int paramInt, Header[] paramArrayOfHeader, byte[] paramArrayOfByte);
  
  protected void postRunnable(Runnable paramRunnable)
  {
    if (paramRunnable != null)
    {
      if ((getUseSynchronousMode()) || (this.handler == null)) {
        paramRunnable.run();
      }
    }
    else {
      return;
    }
    if (this.handler != null) {}
    for (boolean bool = true;; bool = false)
    {
      a.a(bool, "handler should not be null!");
      this.handler.post(paramRunnable);
      return;
    }
  }
  
  public final void sendCancelMessage()
  {
    sendMessage(obtainMessage(6, null));
  }
  
  public final void sendFailureMessage(int paramInt, Header[] paramArrayOfHeader, byte[] paramArrayOfByte, Throwable paramThrowable)
  {
    sendMessage(obtainMessage(1, new Object[] { Integer.valueOf(paramInt), paramArrayOfHeader, paramArrayOfByte, paramThrowable }));
  }
  
  public final void sendFinishMessage()
  {
    sendMessage(obtainMessage(3, null));
  }
  
  protected void sendMessage(Message paramMessage)
  {
    if ((getUseSynchronousMode()) || (this.handler == null)) {
      handleMessage(paramMessage);
    }
    while (Thread.currentThread().isInterrupted()) {
      return;
    }
    if (this.handler != null) {}
    for (boolean bool = true;; bool = false)
    {
      a.a(bool, "handler should not be null!");
      this.handler.sendMessage(paramMessage);
      return;
    }
  }
  
  public final void sendProgressMessage(int paramInt1, int paramInt2)
  {
    sendMessage(obtainMessage(4, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }));
  }
  
  public void sendResponseMessage(HttpResponse paramHttpResponse)
  {
    StatusLine localStatusLine;
    byte[] arrayOfByte;
    if (!Thread.currentThread().isInterrupted())
    {
      localStatusLine = paramHttpResponse.getStatusLine();
      arrayOfByte = getResponseData(paramHttpResponse.getEntity());
      if (!Thread.currentThread().isInterrupted())
      {
        if (localStatusLine.getStatusCode() < 300) {
          break label85;
        }
        sendFailureMessage(localStatusLine.getStatusCode(), paramHttpResponse.getAllHeaders(), arrayOfByte, new HttpResponseException(localStatusLine.getStatusCode(), localStatusLine.getReasonPhrase()));
      }
    }
    return;
    label85:
    sendSuccessMessage(localStatusLine.getStatusCode(), paramHttpResponse.getAllHeaders(), arrayOfByte);
  }
  
  public final void sendRetryMessage(int paramInt)
  {
    sendMessage(obtainMessage(5, new Object[] { Integer.valueOf(paramInt) }));
  }
  
  public final void sendStartMessage()
  {
    sendMessage(obtainMessage(2, null));
  }
  
  public final void sendSuccessMessage(int paramInt, Header[] paramArrayOfHeader, byte[] paramArrayOfByte)
  {
    sendMessage(obtainMessage(0, new Object[] { Integer.valueOf(paramInt), paramArrayOfHeader, paramArrayOfByte }));
  }
  
  public void setCharset(String paramString)
  {
    this.responseCharset = paramString;
  }
  
  public void setRequestHeaders(Header[] paramArrayOfHeader)
  {
    this.requestHeaders = paramArrayOfHeader;
  }
  
  public void setRequestURI(URI paramURI)
  {
    this.requestURI = paramURI;
  }
  
  public void setUseSynchronousMode(boolean paramBoolean)
  {
    boolean bool = paramBoolean;
    if (!paramBoolean)
    {
      bool = paramBoolean;
      if (this.looper == null)
      {
        bool = true;
        Log.w("AsyncHttpResponseHandler", "Current thread has not called Looper.prepare(). Forcing synchronous mode.");
      }
    }
    if ((!bool) && (this.handler == null)) {}
    for (this.handler = new j(this, this.looper);; this.handler = null) {
      do
      {
        this.useSynchronousMode = bool;
        return;
      } while ((!bool) || (this.handler == null));
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\e\a\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */