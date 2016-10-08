package com.tencent.qalsdk;

class a
  implements Runnable
{
  a(QALBroadcastReceiver paramQALBroadcastReceiver, String paramString1, String paramString2, byte[] paramArrayOfByte, QALOfflinePushListener paramQALOfflinePushListener) {}
  
  public void run()
  {
    if (QALSDKManager.getInstance().getOffLinePushListener() != null)
    {
      QALOffLineMsg localQALOffLineMsg = new QALOffLineMsg();
      localQALOffLineMsg.setID(this.a);
      localQALOffLineMsg.setCmd(this.b);
      localQALOffLineMsg.setBody(this.c);
      this.d.onPushMsg(localQALOffLineMsg);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\qalsdk\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */