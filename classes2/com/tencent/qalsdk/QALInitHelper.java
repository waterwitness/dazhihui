package com.tencent.qalsdk;

import com.tencent.qalsdk.base.remote.IBaseActionListener;
import com.tencent.qalsdk.sdk.e;
import com.tencent.qalsdk.util.QLog;
import java.util.concurrent.ConcurrentLinkedQueue;

public class QALInitHelper
{
  private static int MAX_LEN = 5000;
  private static QALInitHelper inst = new QALInitHelper();
  private static String tag = "QALInitHelper";
  private ConcurrentLinkedQueue<QALSendData> waitQueue = new ConcurrentLinkedQueue();
  
  public static QALInitHelper instance()
  {
    return inst;
  }
  
  public void addToQueue(String paramString, byte[] paramArrayOfByte, IBaseActionListener paramIBaseActionListener)
  {
    QLog.d(tag, "init not ok,add to queue:" + paramString);
    QALSendData localQALSendData = new QALSendData();
    localQALSendData.cmd = paramString;
    localQALSendData.body = paramArrayOfByte;
    localQALSendData.listener = paramIBaseActionListener;
    if (this.waitQueue.size() > MAX_LEN) {
      QLog.e("QALInitHelper", 1, " queue full:" + MAX_LEN);
    }
    while (this.waitQueue.add(localQALSendData)) {
      return;
    }
    QLog.e("QALInitHelper", 1, "add queue error");
  }
  
  public void sendMsg()
  {
    synchronized (this.waitQueue)
    {
      while (!this.waitQueue.isEmpty())
      {
        QALSendData localQALSendData = (QALSendData)this.waitQueue.poll();
        if (localQALSendData != null)
        {
          QLog.i(tag, 4, "init ok,send saved msg :" + localQALSendData.cmd + ":" + localQALSendData.body.length);
          e.b().a(e.b().e(), localQALSendData.cmd, localQALSendData.body, localQALSendData.listener, e.b().b(localQALSendData.body.length), true);
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\QALInitHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */