package tencent.tls.tools;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;

public class FileTracer
  implements Handler.Callback
{
  private static final int MSG_FLUSH = 1024;
  private static String bufferA = "";
  private static String bufferB = "";
  private static FileTracer instance = null;
  private Context context;
  private Handler handler;
  private volatile boolean isFlushing = false;
  private HandlerThread thread;
  
  private FileTracer(Context paramContext)
  {
    this.context = paramContext;
    this.thread = new HandlerThread("FileTracer");
    if (this.thread != null) {
      this.thread.start();
    }
    if (this.thread.isAlive()) {
      this.handler = new Handler(this.thread.getLooper(), this);
    }
    this.handler.sendEmptyMessage(1024);
  }
  
  private void flushBuffer()
  {
    if (Thread.currentThread() != this.thread) {}
    while (this.isFlushing) {
      return;
    }
    this.isFlushing = true;
    writeFile();
    this.isFlushing = false;
  }
  
  private void prepareNextFlush()
  {
    try
    {
      this.handler.sendEmptyMessageDelayed(1024, 1000L);
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  private void writeFile()
  {
    byte[] arrayOfByte1;
    if ((bufferB != null) && (bufferB.length() > 0))
    {
      bufferA = bufferB;
      bufferB = "";
      arrayOfByte1 = util.compress(bufferA.getBytes());
      if ((arrayOfByte1 != null) && (arrayOfByte1.length != 0)) {}
    }
    else
    {
      return;
    }
    byte[] arrayOfByte2 = new byte[arrayOfByte1.length + 4];
    util.int32_to_buf(arrayOfByte2, 0, arrayOfByte1.length);
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 4, arrayOfByte1.length);
    util.writeFile(util.getLogFileName(this.context, util.getCurrentDay()), arrayOfByte2);
  }
  
  public static void writeLog(Context arg0, String paramString1, String paramString2)
  {
    if ((??? == null) || (paramString2 == null)) {
      return;
    }
    if (instance == null) {
      instance = new FileTracer(???);
    }
    synchronized (bufferB)
    {
      if (bufferB.length() > 4096) {
        bufferB = "";
      }
      bufferB = bufferB + util.getDate() + util.getThreadId() + util.getLineInfo(3) + util.getSdkVersion() + util.getUser(paramString1) + paramString2 + "\n";
      return;
    }
  }
  
  public void flush()
  {
    if (this.handler.hasMessages(1024)) {
      this.handler.removeMessages(1024);
    }
    this.handler.sendEmptyMessage(1024);
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    }
    for (;;)
    {
      return true;
      flushBuffer();
      prepareNextFlush();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\tools\FileTracer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */