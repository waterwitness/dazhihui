package com.tencent.qalsdk.service;

import android.os.DeadObjectException;
import com.tencent.qalsdk.base.remote.FromServiceMsg;
import com.tencent.qalsdk.base.remote.IMsfServiceCallbacker;
import com.tencent.qalsdk.sdk.MsfCommand;
import com.tencent.qalsdk.sdk.w;
import com.tencent.qalsdk.util.QLog;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

class a
  extends Thread
{
  private static final String e = "im_open_push.msg_push";
  private static final int f = 10;
  volatile Object a = new Object();
  volatile boolean b = false;
  volatile boolean c = true;
  int d = 0;
  
  /* Error */
  private static void a(FromServiceMsg paramFromServiceMsg)
  {
    // Byte code:
    //   0: new 40	com/tencent/qalsdk/protocol/imsdk/msg_push$ReqBody
    //   3: dup
    //   4: invokespecial 41	com/tencent/qalsdk/protocol/imsdk/msg_push$ReqBody:<init>	()V
    //   7: astore_2
    //   8: aload_2
    //   9: aload_0
    //   10: invokestatic 46	com/tencent/qalsdk/service/b:a	(Lcom/tencent/qalsdk/base/remote/FromServiceMsg;)[B
    //   13: invokevirtual 50	com/tencent/qalsdk/protocol/imsdk/msg_push$ReqBody:mergeFrom	([B)Lcom/tencent/mobileqq/pb/MessageMicro;
    //   16: pop
    //   17: new 52	com/tencent/qalsdk/protocol/imsdk/msg_push$RspBody
    //   20: dup
    //   21: invokespecial 53	com/tencent/qalsdk/protocol/imsdk/msg_push$RspBody:<init>	()V
    //   24: astore_1
    //   25: aload_1
    //   26: getfield 57	com/tencent/qalsdk/protocol/imsdk/msg_push$RspBody:bytes_session_data	Lcom/tencent/mobileqq/pb/PBBytesField;
    //   29: iconst_1
    //   30: invokevirtual 63	com/tencent/mobileqq/pb/PBBytesField:setHasFlag	(Z)V
    //   33: aload_1
    //   34: getfield 57	com/tencent/qalsdk/protocol/imsdk/msg_push$RspBody:bytes_session_data	Lcom/tencent/mobileqq/pb/PBBytesField;
    //   37: aload_2
    //   38: getfield 64	com/tencent/qalsdk/protocol/imsdk/msg_push$ReqBody:bytes_session_data	Lcom/tencent/mobileqq/pb/PBBytesField;
    //   41: invokevirtual 68	com/tencent/mobileqq/pb/PBBytesField:get	()Lcom/tencent/mobileqq/pb/ByteStringMicro;
    //   44: invokevirtual 74	com/tencent/mobileqq/pb/ByteStringMicro:toByteArray	()[B
    //   47: invokestatic 78	com/tencent/mobileqq/pb/ByteStringMicro:copyFrom	([B)Lcom/tencent/mobileqq/pb/ByteStringMicro;
    //   50: invokevirtual 82	com/tencent/mobileqq/pb/PBBytesField:set	(Lcom/tencent/mobileqq/pb/ByteStringMicro;)V
    //   53: new 84	com/tencent/qalsdk/base/remote/ToServiceMsg
    //   56: dup
    //   57: ldc 86
    //   59: aload_0
    //   60: invokevirtual 92	com/tencent/qalsdk/base/remote/FromServiceMsg:getUin	()Ljava/lang/String;
    //   63: ldc 8
    //   65: invokespecial 95	com/tencent/qalsdk/base/remote/ToServiceMsg:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   68: astore_0
    //   69: aload_1
    //   70: invokevirtual 96	com/tencent/qalsdk/protocol/imsdk/msg_push$RspBody:toByteArray	()[B
    //   73: astore_1
    //   74: aload_0
    //   75: ldc 97
    //   77: invokevirtual 101	com/tencent/qalsdk/base/remote/ToServiceMsg:setAppId	(I)V
    //   80: aload_0
    //   81: iconst_0
    //   82: invokevirtual 104	com/tencent/qalsdk/base/remote/ToServiceMsg:setNeedCallback	(Z)V
    //   85: aload_0
    //   86: ldc2_w 105
    //   89: invokevirtual 110	com/tencent/qalsdk/base/remote/ToServiceMsg:setTimeout	(J)V
    //   92: aload_0
    //   93: invokestatic 115	com/tencent/qalsdk/core/j:f	()I
    //   96: invokevirtual 118	com/tencent/qalsdk/base/remote/ToServiceMsg:setRequestSsoSeq	(I)V
    //   99: aload_0
    //   100: aload_1
    //   101: invokestatic 123	com/tencent/qalsdk/core/o:b	([B)[B
    //   104: invokevirtual 127	com/tencent/qalsdk/base/remote/ToServiceMsg:putWupBuffer	([B)V
    //   107: invokestatic 133	com/tencent/qalsdk/service/QalService:getCore	()Lcom/tencent/qalsdk/core/j;
    //   110: aload_0
    //   111: invokevirtual 136	com/tencent/qalsdk/core/j:a	(Lcom/tencent/qalsdk/base/remote/ToServiceMsg;)I
    //   114: pop
    //   115: return
    //   116: astore_0
    //   117: aload_0
    //   118: invokevirtual 139	com/tencent/mobileqq/pb/InvalidProtocolBufferMicroException:printStackTrace	()V
    //   121: return
    //   122: astore_0
    //   123: ldc -115
    //   125: iconst_1
    //   126: new 143	java/lang/StringBuilder
    //   129: dup
    //   130: invokespecial 144	java/lang/StringBuilder:<init>	()V
    //   133: ldc -110
    //   135: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   138: aload_0
    //   139: invokevirtual 153	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   142: invokevirtual 156	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   145: aload_0
    //   146: invokestatic 162	com/tencent/qalsdk/util/QLog:w	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V
    //   149: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	150	0	paramFromServiceMsg	FromServiceMsg
    //   24	77	1	localObject	Object
    //   7	31	2	localReqBody	com.tencent.qalsdk.protocol.imsdk.msg_push.ReqBody
    // Exception table:
    //   from	to	target	type
    //   8	17	116	com/tencent/mobileqq/pb/InvalidProtocolBufferMicroException
    //   107	115	122	java/lang/Exception
  }
  
  private static boolean a(String paramString, b paramb)
  {
    boolean bool2 = false;
    int i = 0;
    int j;
    w localw;
    if (!paramb.g.isEmpty())
    {
      j = i + 1;
      i = j;
      if (j <= 10)
      {
        localw = (w)paramb.g.peek();
        if (localw != null) {
          break label69;
        }
        i = j;
      }
    }
    for (;;)
    {
      label52:
      boolean bool1 = bool2;
      if (i > 10) {
        bool1 = true;
      }
      label66:
      return bool1;
      label69:
      IMsfServiceCallbacker localIMsfServiceCallbacker = paramb.c();
      if (localIMsfServiceCallbacker == null)
      {
        i = 1;
        label81:
        if (i != 0) {
          break label515;
        }
      }
      label515:
      for (;;)
      {
        try
        {
          if (localw.a == null)
          {
            localIMsfServiceCallbacker.onRecvPushResp(localw.b);
            QLog.d("MSF.S.AppProcessManager", 2, "send push " + paramString + " from:" + localw.b.getUin() + "|" + localw.b.getServiceCmd() + "|" + localw.b.getRequestSsoSeq());
            if (i != 0) {
              continue;
            }
            paramb.g.poll();
            i = j;
            break;
            i = 0;
            break label81;
          }
          localIMsfServiceCallbacker.onResponse(localw.a, localw.b);
          QLog.d("MSF.S.AppProcessManager", 2, "send resp " + paramString + " from:" + localw.b.getUin() + "|" + localw.b.getServiceCmd() + "|" + localw.b.getRequestSsoSeq());
        }
        catch (DeadObjectException localDeadObjectException)
        {
          paramb.d();
          QLog.i("MSF.S.AppProcessManager", 2, "DeadObjectException");
          i = 1;
        }
        catch (Exception localException2)
        {
          QLog.e("MSF.S.AppProcessManager", 2, localw.toString() + " " + localw.b, localException2);
          continue;
          QLog.d("MSF.S.AppProcessManager", 2, "boot proccess" + paramString + " from:" + localw.b.getUin() + ":" + localw.b.getMsfCommand() + ":" + localw.b.getServiceCmd());
          if (localw.b.getMsfCommand() != MsfCommand.onRecvPushMsg)
          {
            QLog.d("MSF.S.AppProcessManager", "proccess died,msf command need no boot");
            paramb.g.poll();
            i = j;
            break label52;
          }
          try
          {
            paramb.a(localw.b.getUin(), localw.b);
            paramb.g.poll();
            bool1 = bool2;
            if (!localw.b.getServiceCmd().equals("im_open_push.msg_push")) {
              break label66;
            }
            a(localw.b);
            return false;
          }
          catch (Exception localException1)
          {
            QLog.d("MSF.S.AppProcessManager", 1, "Boot exception", localException1);
          }
        }
      }
    }
  }
  
  public void a()
  {
    synchronized (this.a)
    {
      this.c = true;
      this.b = false;
      this.a.notify();
      return;
    }
  }
  
  public void run()
  {
    if (this.c)
    {
      this.c = false;
      this.d = 0;
      ??? = c.c.keySet().iterator();
      while (((Iterator)???).hasNext())
      {
        String str = (String)((Iterator)???).next();
        b localb = (b)c.c.get(str);
        if (localb != null)
        {
          if (a(str, localb)) {
            this.c = true;
          }
          this.d += localb.g.size();
        }
      }
    }
    this.b = true;
    for (;;)
    {
      synchronized (this.a)
      {
        boolean bool = this.b;
        if (bool) {}
        try
        {
          if (this.d == 0)
          {
            this.a.wait(61440L);
            this.c = true;
          }
        }
        catch (InterruptedException localInterruptedException)
        {
          localInterruptedException.printStackTrace();
          continue;
        }
      }
      this.a.wait(600L);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\service\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */