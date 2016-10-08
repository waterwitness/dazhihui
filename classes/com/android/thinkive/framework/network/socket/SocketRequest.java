package com.android.thinkive.framework.network.socket;

import java.io.OutputStream;
import java.util.concurrent.BlockingQueue;

public class SocketRequest
  extends Thread
{
  private ConnectManager mConnectManager;
  private OutputStream mOut;
  private final BlockingQueue<SocketRequestBean> mQueue;
  private volatile boolean mQuit = false;
  
  public SocketRequest(ConnectManager paramConnectManager, BlockingQueue<SocketRequestBean> paramBlockingQueue)
  {
    this.mQueue = paramBlockingQueue;
    this.mConnectManager = paramConnectManager;
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
    //   2: invokestatic 44	android/os/Process:setThreadPriority	(I)V
    //   5: aconst_null
    //   6: astore_1
    //   7: aload_0
    //   8: getfield 22	com/android/thinkive/framework/network/socket/SocketRequest:mQueue	Ljava/util/concurrent/BlockingQueue;
    //   11: invokeinterface 50 1 0
    //   16: checkcast 52	com/android/thinkive/framework/network/socket/SocketRequestBean
    //   19: astore_2
    //   20: aload_2
    //   21: invokevirtual 56	com/android/thinkive/framework/network/socket/SocketRequestBean:getListener	()Lcom/android/thinkive/framework/network/socket/SocketResponseListener;
    //   24: astore_3
    //   25: aload_3
    //   26: astore_1
    //   27: aload_0
    //   28: aload_0
    //   29: getfield 24	com/android/thinkive/framework/network/socket/SocketRequest:mConnectManager	Lcom/android/thinkive/framework/network/socket/ConnectManager;
    //   32: invokevirtual 62	com/android/thinkive/framework/network/socket/ConnectManager:getOutPutStream	()Ljava/io/OutputStream;
    //   35: putfield 64	com/android/thinkive/framework/network/socket/SocketRequest:mOut	Ljava/io/OutputStream;
    //   38: new 66	com/android/thinkive/framework/network/packet/RequestPacket
    //   41: dup
    //   42: aload_2
    //   43: invokespecial 69	com/android/thinkive/framework/network/packet/RequestPacket:<init>	(Lcom/android/thinkive/framework/network/socket/SocketRequestBean;)V
    //   46: astore_3
    //   47: aload_3
    //   48: invokeinterface 75 1 0
    //   53: istore 4
    //   55: aload_0
    //   56: getfield 24	com/android/thinkive/framework/network/socket/SocketRequest:mConnectManager	Lcom/android/thinkive/framework/network/socket/ConnectManager;
    //   59: invokevirtual 79	com/android/thinkive/framework/network/socket/ConnectManager:getSocketResponse	()Lcom/android/thinkive/framework/network/socket/SocketResponse;
    //   62: ifnull +19 -> 81
    //   65: aload_0
    //   66: getfield 24	com/android/thinkive/framework/network/socket/SocketRequest:mConnectManager	Lcom/android/thinkive/framework/network/socket/ConnectManager;
    //   69: invokevirtual 79	com/android/thinkive/framework/network/socket/ConnectManager:getSocketResponse	()Lcom/android/thinkive/framework/network/socket/SocketResponse;
    //   72: iload 4
    //   74: invokestatic 85	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   77: aload_2
    //   78: invokevirtual 91	com/android/thinkive/framework/network/socket/SocketResponse:addRequest	(Ljava/lang/String;Lcom/android/thinkive/framework/network/socket/SocketRequestBean;)V
    //   81: aload_0
    //   82: getfield 64	com/android/thinkive/framework/network/socket/SocketRequest:mOut	Ljava/io/OutputStream;
    //   85: astore_2
    //   86: aload_2
    //   87: monitorenter
    //   88: aload_3
    //   89: aload_0
    //   90: getfield 64	com/android/thinkive/framework/network/socket/SocketRequest:mOut	Ljava/io/OutputStream;
    //   93: invokeinterface 95 2 0
    //   98: aload_2
    //   99: monitorexit
    //   100: goto -93 -> 7
    //   103: astore_3
    //   104: aload_2
    //   105: monitorexit
    //   106: aload_3
    //   107: athrow
    //   108: astore_2
    //   109: aload_2
    //   110: invokevirtual 98	java/io/IOException:printStackTrace	()V
    //   113: aload_0
    //   114: getfield 24	com/android/thinkive/framework/network/socket/SocketRequest:mConnectManager	Lcom/android/thinkive/framework/network/socket/ConnectManager;
    //   117: aload_1
    //   118: ldc 100
    //   120: getstatic 106	com/android/thinkive/framework/network/socket/SocketException$ExceptionType:IO	Lcom/android/thinkive/framework/network/socket/SocketException$ExceptionType;
    //   123: invokevirtual 110	com/android/thinkive/framework/network/socket/ConnectManager:handlerSocketException	(Lcom/android/thinkive/framework/network/socket/SocketResponseListener;Ljava/lang/String;Lcom/android/thinkive/framework/network/socket/SocketException$ExceptionType;)V
    //   126: goto -119 -> 7
    //   129: astore_2
    //   130: aconst_null
    //   131: astore_2
    //   132: aload_0
    //   133: getfield 20	com/android/thinkive/framework/network/socket/SocketRequest:mQuit	Z
    //   136: ifeq +4 -> 140
    //   139: return
    //   140: aload_2
    //   141: ifnull -134 -> 7
    //   144: aload_1
    //   145: new 112	com/android/thinkive/framework/network/socket/SocketException
    //   148: dup
    //   149: ldc 114
    //   151: getstatic 117	com/android/thinkive/framework/network/socket/SocketException$ExceptionType:NETWORK	Lcom/android/thinkive/framework/network/socket/SocketException$ExceptionType;
    //   154: invokespecial 120	com/android/thinkive/framework/network/socket/SocketException:<init>	(Ljava/lang/String;Lcom/android/thinkive/framework/network/socket/SocketException$ExceptionType;)V
    //   157: invokeinterface 126 2 0
    //   162: goto -155 -> 7
    //   165: astore_2
    //   166: aload_2
    //   167: invokevirtual 127	java/lang/Exception:printStackTrace	()V
    //   170: aload_2
    //   171: instanceof 34
    //   174: ifeq +24 -> 198
    //   177: aload_1
    //   178: new 112	com/android/thinkive/framework/network/socket/SocketException
    //   181: dup
    //   182: ldc 100
    //   184: getstatic 106	com/android/thinkive/framework/network/socket/SocketException$ExceptionType:IO	Lcom/android/thinkive/framework/network/socket/SocketException$ExceptionType;
    //   187: invokespecial 120	com/android/thinkive/framework/network/socket/SocketException:<init>	(Ljava/lang/String;Lcom/android/thinkive/framework/network/socket/SocketException$ExceptionType;)V
    //   190: invokeinterface 126 2 0
    //   195: goto -188 -> 7
    //   198: aload_0
    //   199: getfield 24	com/android/thinkive/framework/network/socket/SocketRequest:mConnectManager	Lcom/android/thinkive/framework/network/socket/ConnectManager;
    //   202: aload_1
    //   203: ldc -127
    //   205: getstatic 117	com/android/thinkive/framework/network/socket/SocketException$ExceptionType:NETWORK	Lcom/android/thinkive/framework/network/socket/SocketException$ExceptionType;
    //   208: invokevirtual 110	com/android/thinkive/framework/network/socket/ConnectManager:handlerSocketException	(Lcom/android/thinkive/framework/network/socket/SocketResponseListener;Ljava/lang/String;Lcom/android/thinkive/framework/network/socket/SocketException$ExceptionType;)V
    //   211: goto -204 -> 7
    //   214: astore_3
    //   215: goto -83 -> 132
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	218	0	this	SocketRequest
    //   6	197	1	localObject1	Object
    //   108	2	2	localIOException	java.io.IOException
    //   129	1	2	localInterruptedException1	InterruptedException
    //   131	10	2	localObject3	Object
    //   165	6	2	localException	Exception
    //   24	65	3	localObject4	Object
    //   103	4	3	localObject5	Object
    //   214	1	3	localInterruptedException2	InterruptedException
    //   53	20	4	i	int
    // Exception table:
    //   from	to	target	type
    //   88	100	103	finally
    //   104	106	103	finally
    //   27	81	108	java/io/IOException
    //   81	88	108	java/io/IOException
    //   106	108	108	java/io/IOException
    //   7	20	129	java/lang/InterruptedException
    //   27	81	165	java/lang/Exception
    //   81	88	165	java/lang/Exception
    //   106	108	165	java/lang/Exception
    //   20	25	214	java/lang/InterruptedException
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\network\socket\SocketRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */