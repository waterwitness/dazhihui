package com.android.thinkive.framework.network.socket;

import com.android.thinkive.framework.network.packet.AESPacket;
import com.android.thinkive.framework.network.packet.AuthPacket;
import com.android.thinkive.framework.network.packet.IPacket;
import com.android.thinkive.framework.network.packet.handler.AESPacketHandler;
import com.android.thinkive.framework.network.packet.handler.AuthPacketHandler;
import com.android.thinkive.framework.network.packet.handler.SessionPacketHandler;
import com.android.thinkive.framework.util.EncryptUtil;
import com.android.thinkive.framework.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.PriorityBlockingQueue;

public class ConnectManager
{
  private static String mAuthPassword = "thinkive";
  private static String mAuthUserName = "thinkive";
  private boolean isExit;
  private Socket mClient;
  private String mHost;
  private InputStream mInputStream;
  private boolean mIsAuthed;
  private boolean mIsConnecting;
  private boolean mIsSendHeartBeat;
  private OutputStream mOutputStream;
  private IPacket mPacket;
  private int mPort;
  private ReconnectionThread mReConThread;
  private PriorityBlockingQueue<SocketRequestBean> mRequestQueue;
  private Thread mSendHeartThread;
  private String mServerAddr;
  private SocketRequest mSocketRequest;
  private SocketResponse mSocketResponse;
  private SocketResponseListener mSocketResponseListener;
  private SocketType mSocketType;
  
  public ConnectManager(SocketType paramSocketType)
  {
    this.mSocketType = paramSocketType;
    this.mRequestQueue = new PriorityBlockingQueue();
  }
  
  private void buildSession()
  {
    try
    {
      Object localObject = new byte[18];
      int i = this.mInputStream.read((byte[])localObject);
      Log.d("connect serverAddr = " + this.mServerAddr + " session response packet len = " + i);
      if ((i > 0) && (i <= localObject.length))
      {
        byte[] arrayOfByte = new byte[i];
        System.arraycopy(localObject, 0, arrayOfByte, 0, i);
        localObject = new SessionPacketHandler().parse(arrayOfByte);
        Log.d("build session success, sessionKey = " + (String)localObject);
        localObject = EncryptUtil.encryptPwd((String)localObject, mAuthUserName, mAuthPassword);
        Log.d("encrypt pwd = " + (String)localObject);
        startServerAuth(mAuthUserName, (String)localObject);
        return;
      }
      handlerSocketException(this.mSocketResponseListener, "连接服务器失败!", SocketException.ExceptionType.IO);
      return;
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
      handlerSocketException(this.mSocketResponseListener, "网络异常,请稍后再试!", SocketException.ExceptionType.IO);
    }
  }
  
  private void processError(SocketException paramSocketException)
  {
    if ((paramSocketException.getExceptionType() == SocketException.ExceptionType.IO) || (paramSocketException.getExceptionType() == SocketException.ExceptionType.NETWORK))
    {
      releaseCTX();
      if ((!isAuthed()) && (!this.isExit) && (!isConnecting()))
      {
        if (this.mReConThread != null) {
          break label80;
        }
        this.mReConThread = new ReconnectionThread(this, this.mHost, this.mPort);
        this.mReConThread.start();
      }
    }
    return;
    label80:
    Log.d("之前已经创建了一个断线重连线程了！！！");
  }
  
  private void sendHeartBeatPacket()
  {
    this.mSendHeartThread = new Thread(new ConnectManager.1(this));
    this.mSendHeartThread.start();
  }
  
  private void startRequestThread()
  {
    this.mSocketRequest = new SocketRequest(this, this.mRequestQueue);
    this.mSocketRequest.start();
  }
  
  private void startResponseThread()
  {
    this.mSocketResponse = new SocketResponse(this.mInputStream, this);
    this.mSocketResponse.start();
  }
  
  private void startServerAuth(String paramString1, String paramString2)
  {
    this.mPacket = new AuthPacket(paramString1, paramString2);
    try
    {
      this.mPacket.sendPacket(this.mOutputStream);
      paramString1 = new byte['Ѐ'];
      int i = this.mInputStream.read(paramString1);
      Log.d("connect serverAddr = " + this.mServerAddr + " auth response packet len = " + i);
      if ((i <= 0) || (i > paramString1.length)) {
        break label341;
      }
      paramString2 = new byte[i];
      System.arraycopy(paramString1, 0, paramString2, 0, i);
      i = new AuthPacketHandler().parse(paramString2, this.mSocketType);
      if (i == 0)
      {
        Log.d("auth success !!!");
        if (SocketType.TRADE == this.mSocketType)
        {
          this.mPacket = new AESPacket();
          this.mPacket.sendPacket(this.mOutputStream);
          paramString1 = new byte[20];
          i = this.mInputStream.read(paramString1);
          Log.d("read aes len = " + i);
          if ((i <= 0) || (i > paramString1.length)) {
            break label271;
          }
          paramString2 = new byte[i];
          System.arraycopy(paramString1, 0, paramString2, 0, i);
          if (new AESPacketHandler().parse(paramString2) != 0) {
            handlerSocketException(this.mSocketResponseListener, "AES约定失败!", SocketException.ExceptionType.IO);
          }
        }
        for (;;)
        {
          this.mIsAuthed = true;
          this.mReConThread = null;
          this.mSocketResponseListener = null;
          startResponseThread();
          startRequestThread();
          this.mIsSendHeartBeat = true;
          sendHeartBeatPacket();
          return;
          label271:
          handlerSocketException(this.mSocketResponseListener, "AES约定失败!", SocketException.ExceptionType.IO);
        }
      }
      Log.e("auth failed !!! flag = " + i);
    }
    catch (IOException paramString1)
    {
      paramString1.printStackTrace();
      handlerSocketException(this.mSocketResponseListener, "网络异常,请稍后再试!", SocketException.ExceptionType.IO);
      return;
    }
    handlerSocketException(this.mSocketResponseListener, "连接服务器失败!", SocketException.ExceptionType.IO);
    return;
    label341:
    handlerSocketException(this.mSocketResponseListener, "连接服务器失败!", SocketException.ExceptionType.IO);
  }
  
  private void stopHeartThread()
  {
    if (this.mSendHeartThread != null)
    {
      this.mSendHeartThread.interrupt();
      this.mSendHeartThread = null;
    }
  }
  
  private void stopRequestThread()
  {
    if (this.mSocketRequest != null)
    {
      this.mSocketRequest.quit();
      this.mSocketRequest = null;
    }
  }
  
  private void stopResponseThread()
  {
    if (this.mSocketResponse != null)
    {
      this.mSocketResponse.quit();
      this.mSocketResponse = null;
    }
  }
  
  public void addRequest(SocketRequestBean paramSocketRequestBean)
  {
    this.mRequestQueue.add(paramSocketRequestBean);
  }
  
  /* Error */
  protected void connect(String paramString, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual 191	com/android/thinkive/framework/network/socket/ConnectManager:isConnecting	()Z
    //   6: ifne +109 -> 115
    //   9: aload_0
    //   10: iconst_1
    //   11: putfield 309	com/android/thinkive/framework/network/socket/ConnectManager:mIsConnecting	Z
    //   14: aload_0
    //   15: new 99	java/lang/StringBuilder
    //   18: dup
    //   19: aload_1
    //   20: invokestatic 315	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   23: invokespecial 104	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   26: ldc_w 317
    //   29: invokevirtual 110	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   32: iload_2
    //   33: invokevirtual 115	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   36: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   39: putfield 106	com/android/thinkive/framework/network/socket/ConnectManager:mServerAddr	Ljava/lang/String;
    //   42: aload_0
    //   43: aload_1
    //   44: putfield 197	com/android/thinkive/framework/network/socket/ConnectManager:mHost	Ljava/lang/String;
    //   47: aload_0
    //   48: iload_2
    //   49: putfield 199	com/android/thinkive/framework/network/socket/ConnectManager:mPort	I
    //   52: aload_0
    //   53: new 319	java/net/Socket
    //   56: dup
    //   57: invokespecial 320	java/net/Socket:<init>	()V
    //   60: putfield 322	com/android/thinkive/framework/network/socket/ConnectManager:mClient	Ljava/net/Socket;
    //   63: aload_0
    //   64: getfield 322	com/android/thinkive/framework/network/socket/ConnectManager:mClient	Ljava/net/Socket;
    //   67: sipush 10000
    //   70: invokevirtual 326	java/net/Socket:setSoTimeout	(I)V
    //   73: aload_0
    //   74: getfield 322	com/android/thinkive/framework/network/socket/ConnectManager:mClient	Ljava/net/Socket;
    //   77: new 328	java/net/InetSocketAddress
    //   80: dup
    //   81: aload_1
    //   82: iload_2
    //   83: invokespecial 330	java/net/InetSocketAddress:<init>	(Ljava/lang/String;I)V
    //   86: invokevirtual 333	java/net/Socket:connect	(Ljava/net/SocketAddress;)V
    //   89: aload_0
    //   90: aload_0
    //   91: getfield 322	com/android/thinkive/framework/network/socket/ConnectManager:mClient	Ljava/net/Socket;
    //   94: invokevirtual 337	java/net/Socket:getInputStream	()Ljava/io/InputStream;
    //   97: putfield 91	com/android/thinkive/framework/network/socket/ConnectManager:mInputStream	Ljava/io/InputStream;
    //   100: aload_0
    //   101: aload_0
    //   102: getfield 322	com/android/thinkive/framework/network/socket/ConnectManager:mClient	Ljava/net/Socket;
    //   105: invokevirtual 341	java/net/Socket:getOutputStream	()Ljava/io/OutputStream;
    //   108: putfield 70	com/android/thinkive/framework/network/socket/ConnectManager:mOutputStream	Ljava/io/OutputStream;
    //   111: aload_0
    //   112: invokespecial 343	com/android/thinkive/framework/network/socket/ConnectManager:buildSession	()V
    //   115: aload_0
    //   116: monitorexit
    //   117: return
    //   118: astore_1
    //   119: aload_1
    //   120: invokevirtual 344	java/net/UnknownHostException:printStackTrace	()V
    //   123: aload_0
    //   124: aload_0
    //   125: getfield 153	com/android/thinkive/framework/network/socket/ConnectManager:mSocketResponseListener	Lcom/android/thinkive/framework/network/socket/SocketResponseListener;
    //   128: ldc -101
    //   130: getstatic 179	com/android/thinkive/framework/network/socket/SocketException$ExceptionType:NETWORK	Lcom/android/thinkive/framework/network/socket/SocketException$ExceptionType;
    //   133: invokevirtual 165	com/android/thinkive/framework/network/socket/ConnectManager:handlerSocketException	(Lcom/android/thinkive/framework/network/socket/SocketResponseListener;Ljava/lang/String;Lcom/android/thinkive/framework/network/socket/SocketException$ExceptionType;)V
    //   136: goto -21 -> 115
    //   139: astore_1
    //   140: aload_0
    //   141: monitorexit
    //   142: aload_1
    //   143: athrow
    //   144: astore_1
    //   145: aload_1
    //   146: invokevirtual 168	java/io/IOException:printStackTrace	()V
    //   149: aload_0
    //   150: aload_0
    //   151: getfield 153	com/android/thinkive/framework/network/socket/ConnectManager:mSocketResponseListener	Lcom/android/thinkive/framework/network/socket/SocketResponseListener;
    //   154: ldc -101
    //   156: getstatic 161	com/android/thinkive/framework/network/socket/SocketException$ExceptionType:IO	Lcom/android/thinkive/framework/network/socket/SocketException$ExceptionType;
    //   159: invokevirtual 165	com/android/thinkive/framework/network/socket/ConnectManager:handlerSocketException	(Lcom/android/thinkive/framework/network/socket/SocketResponseListener;Ljava/lang/String;Lcom/android/thinkive/framework/network/socket/SocketException$ExceptionType;)V
    //   162: goto -47 -> 115
    //   165: astore_1
    //   166: aload_1
    //   167: invokevirtual 345	java/lang/Exception:printStackTrace	()V
    //   170: aload_0
    //   171: aload_0
    //   172: getfield 153	com/android/thinkive/framework/network/socket/ConnectManager:mSocketResponseListener	Lcom/android/thinkive/framework/network/socket/SocketResponseListener;
    //   175: ldc -86
    //   177: getstatic 179	com/android/thinkive/framework/network/socket/SocketException$ExceptionType:NETWORK	Lcom/android/thinkive/framework/network/socket/SocketException$ExceptionType;
    //   180: invokevirtual 165	com/android/thinkive/framework/network/socket/ConnectManager:handlerSocketException	(Lcom/android/thinkive/framework/network/socket/SocketResponseListener;Ljava/lang/String;Lcom/android/thinkive/framework/network/socket/SocketException$ExceptionType;)V
    //   183: goto -68 -> 115
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	186	0	this	ConnectManager
    //   0	186	1	paramString	String
    //   0	186	2	paramInt	int
    // Exception table:
    //   from	to	target	type
    //   2	115	118	java/net/UnknownHostException
    //   2	115	139	finally
    //   119	136	139	finally
    //   145	162	139	finally
    //   166	183	139	finally
    //   2	115	144	java/io/IOException
    //   2	115	165	java/lang/Exception
  }
  
  public InputStream getInputStream()
  {
    return this.mInputStream;
  }
  
  public OutputStream getOutPutStream()
  {
    return this.mOutputStream;
  }
  
  public SocketResponse getSocketResponse()
  {
    return this.mSocketResponse;
  }
  
  public void handlerSocketException(SocketResponseListener paramSocketResponseListener, SocketException paramSocketException)
  {
    if (paramSocketResponseListener != null) {
      paramSocketResponseListener.onErrorResponse(paramSocketException);
    }
    processError(paramSocketException);
  }
  
  public void handlerSocketException(SocketResponseListener paramSocketResponseListener, String paramString, SocketException.ExceptionType paramExceptionType)
  {
    try
    {
      paramString = new SocketException(paramString, paramExceptionType);
      Log.e("handlerSocketExcepiton = " + paramString.getMessage());
      if (paramSocketResponseListener != null)
      {
        paramSocketResponseListener.onErrorResponse(paramString);
        if (paramSocketResponseListener == this.mSocketResponseListener) {
          this.mSocketResponseListener = null;
        }
      }
      processError(paramString);
      return;
    }
    finally {}
  }
  
  protected boolean isAuthed()
  {
    return this.mIsAuthed;
  }
  
  protected boolean isConnecting()
  {
    return this.mIsConnecting;
  }
  
  public void registerSocketResponseListener(SocketResponseListener paramSocketResponseListener)
  {
    this.mSocketResponseListener = paramSocketResponseListener;
  }
  
  protected void releaseCTX()
  {
    Log.d("releaseCTX !!!");
    this.mIsSendHeartBeat = false;
    this.mIsConnecting = false;
    this.mIsAuthed = false;
    if (this.mInputStream != null) {}
    try
    {
      this.mInputStream.close();
      this.mInputStream = null;
      if (this.mOutputStream == null) {}
    }
    catch (IOException localIOException2)
    {
      try
      {
        this.mOutputStream.close();
        this.mOutputStream = null;
        if (this.mClient == null) {}
      }
      catch (IOException localIOException2)
      {
        try
        {
          for (;;)
          {
            this.mClient.close();
            this.mClient = null;
            stopResponseThread();
            stopRequestThread();
            stopHeartThread();
            return;
            localIOException1 = localIOException1;
            localIOException1.printStackTrace();
          }
          localIOException2 = localIOException2;
          localIOException2.printStackTrace();
        }
        catch (IOException localIOException3)
        {
          for (;;)
          {
            localIOException3.printStackTrace();
          }
        }
      }
    }
  }
  
  public void setIsExit(boolean paramBoolean)
  {
    this.isExit = paramBoolean;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\network\socket\ConnectManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */