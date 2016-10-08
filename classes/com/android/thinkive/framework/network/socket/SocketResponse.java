package com.android.thinkive.framework.network.socket;

import android.os.Process;
import com.android.thinkive.framework.cache.Cache.Entry;
import com.android.thinkive.framework.config.ConfigManager;
import com.android.thinkive.framework.network.NetWorkService;
import com.android.thinkive.framework.network.RequestBean;
import com.android.thinkive.framework.util.ArrayUtil;
import com.android.thinkive.framework.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import org.json.JSONObject;

public class SocketResponse
  extends Thread
{
  private ConnectManager mConnectManager;
  private HashMap<String, SocketRequestBean> mFlowToRequestMap;
  private InputStream mIn;
  private IOHandler mIoHandler;
  private volatile boolean mQuit = false;
  private SimpleDateFormat myDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
  
  public SocketResponse(InputStream paramInputStream, ConnectManager paramConnectManager)
  {
    this.mIn = paramInputStream;
    this.mFlowToRequestMap = new HashMap();
    this.mIoHandler = new IOHandler();
    this.mConnectManager = paramConnectManager;
  }
  
  /* Error */
  private void notifyAllRequestListener(SocketException paramSocketException, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 40	com/android/thinkive/framework/network/socket/SocketResponse:mFlowToRequestMap	Ljava/util/HashMap;
    //   6: invokevirtual 54	java/util/HashMap:entrySet	()Ljava/util/Set;
    //   9: invokeinterface 60 1 0
    //   14: astore_3
    //   15: aload_3
    //   16: invokeinterface 66 1 0
    //   21: ifne +26 -> 47
    //   24: aload_0
    //   25: getfield 40	com/android/thinkive/framework/network/socket/SocketResponse:mFlowToRequestMap	Ljava/util/HashMap;
    //   28: invokevirtual 69	java/util/HashMap:clear	()V
    //   31: iload_2
    //   32: ifne +12 -> 44
    //   35: aload_0
    //   36: getfield 47	com/android/thinkive/framework/network/socket/SocketResponse:mConnectManager	Lcom/android/thinkive/framework/network/socket/ConnectManager;
    //   39: aconst_null
    //   40: aload_1
    //   41: invokevirtual 75	com/android/thinkive/framework/network/socket/ConnectManager:handlerSocketException	(Lcom/android/thinkive/framework/network/socket/SocketResponseListener;Lcom/android/thinkive/framework/network/socket/SocketException;)V
    //   44: aload_0
    //   45: monitorexit
    //   46: return
    //   47: aload_3
    //   48: invokeinterface 79 1 0
    //   53: checkcast 81	java/util/Map$Entry
    //   56: invokeinterface 84 1 0
    //   61: checkcast 86	com/android/thinkive/framework/network/socket/SocketRequestBean
    //   64: invokevirtual 90	com/android/thinkive/framework/network/socket/SocketRequestBean:getListener	()Lcom/android/thinkive/framework/network/socket/SocketResponseListener;
    //   67: aload_1
    //   68: invokeinterface 96 2 0
    //   73: goto -58 -> 15
    //   76: astore_1
    //   77: aload_0
    //   78: monitorexit
    //   79: aload_1
    //   80: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	81	0	this	SocketResponse
    //   0	81	1	paramSocketException	SocketException
    //   0	81	2	paramBoolean	boolean
    //   14	34	3	localIterator	java.util.Iterator
    // Exception table:
    //   from	to	target	type
    //   2	15	76	finally
    //   15	31	76	finally
    //   35	44	76	finally
    //   47	73	76	finally
  }
  
  private void saveDataCache(String paramString, JSONObject paramJSONObject)
  {
    paramString = getRequest(paramString);
    String str = paramString.getUrlName();
    str = ConfigManager.getInstance().getAddressConfigValue(str);
    if ((paramString != null) && (paramString.shouldCache()))
    {
      str = NetWorkService.getInstance().buildCacheKey(str, paramString.getParam());
      Cache.Entry localEntry = new Cache.Entry();
      localEntry.data = paramJSONObject.toString().getBytes();
      localEntry.ttl = (System.currentTimeMillis() + paramString.getCacheTimeout());
      NetWorkService.getInstance().putCache(str, localEntry, paramString.getCacheType());
    }
  }
  
  public void addRequest(String paramString, SocketRequestBean paramSocketRequestBean)
  {
    try
    {
      this.mFlowToRequestMap.put(paramString, paramSocketRequestBean);
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public void clearRequest()
  {
    try
    {
      this.mFlowToRequestMap.clear();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public SocketRequestBean getRequest(String paramString)
  {
    try
    {
      paramString = (SocketRequestBean)this.mFlowToRequestMap.get(paramString);
      return paramString;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  protected void quit()
  {
    this.mQuit = true;
    interrupt();
    clearRequest();
  }
  
  public void removeRequest(String paramString)
  {
    try
    {
      this.mFlowToRequestMap.remove(paramString);
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public void run()
  {
    Process.setThreadPriority(10);
    byte[] arrayOfByte1 = new byte[2];
    byte[] arrayOfByte2 = new byte[33];
    byte[] arrayOfByte3 = new byte[8];
    byte[] arrayOfByte4 = new byte[35];
    byte[] arrayOfByte5 = new byte[35];
    try
    {
      for (;;)
      {
        if (this.mIn.read(arrayOfByte1) == -1)
        {
          label44:
          Log.e("socket read body return -1 !!!");
          notifyAllRequestListener(new SocketException("服务访问异常,请稍后再试!", SocketException.ExceptionType.IO), false);
          return;
        }
        i = 0;
        String str1 = new String(arrayOfByte1, "UTF-8");
        if (!str1.equals("TH")) {
          break label244;
        }
        i = this.mIn.read(arrayOfByte3);
        if (i == -1) {
          break;
        }
        Log.d("read thHeader len = " + i + " 接收到服务端响应的心跳包，不处理!");
      }
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        localIOException.printStackTrace();
        Log.e("io error = " + localIOException.getMessage());
        notifyAllRequestListener(new SocketException("服务访问异常,请稍后再试!", SocketException.ExceptionType.IO), false);
        return;
        Log.e("socket read thHeader return  -1 !!!");
      }
    }
    catch (Exception localException)
    {
      int i;
      label244:
      String str2;
      SocketResponseListener localSocketResponseListener;
      for (;;)
      {
        localException.printStackTrace();
        Log.e("error = " + localException.getMessage());
        if (!(localException instanceof InterruptedException)) {
          break label801;
        }
        notifyAllRequestListener(new SocketException("网络异常,请稍后再试!", SocketException.ExceptionType.NETWORK), true);
        return;
        if (localException.equals("TK")) {
          if (this.mIn.read(arrayOfByte2) != -1) {
            i = this.mIoHandler.handerHeader(arrayOfByte2, "TK");
          }
        }
        for (;;)
        {
          str2 = String.valueOf(this.mIoHandler.getFlowNo());
          j = this.mIoHandler.getFunNo();
          k = this.mIoHandler.getResponseCode();
          localSocketResponseListener = getRequest(str2).getListener();
          if (k == 0) {
            break label490;
          }
          localObject1 = new SocketException(String.valueOf(j) + "请求暂无数据!", SocketException.ExceptionType.DATA);
          ((SocketException)localObject1).setResponseCode(k);
          localSocketResponseListener.onErrorResponse((SocketException)localObject1);
          removeRequest(str2);
          break;
          Log.e("socket read tkHeader return  -1 !!!");
          break label44;
          if (((String)localObject1).equals("TD"))
          {
            if (this.mIn.read(arrayOfByte4) != -1)
            {
              i = this.mIoHandler.handerHeader(arrayOfByte4, "TD");
              continue;
            }
            Log.e("socket read tdHeader return  -1 !!!");
            break label44;
          }
          if (((String)localObject1).equals("TN"))
          {
            if (this.mIn.read(arrayOfByte5) == -1) {
              break label481;
            }
            i = this.mIoHandler.handerHeader(arrayOfByte5, "TN");
          }
        }
        label481:
        Log.e("socket read tnHeader return  -1 !!!");
      }
      label490:
      Object localObject1 = new byte[i];
      Object localObject2 = ByteBuffer.allocate(i);
      ((ByteBuffer)localObject2).order(ByteOrder.LITTLE_ENDIAN);
      int k = 0;
      int j = 0;
      for (;;)
      {
        int m = this.mIn.read((byte[])localObject1);
        if (m == -1) {}
        while (m == -1)
        {
          Log.e("socket read body return -1 !!!");
          break label44;
          ((ByteBuffer)localObject2).put(ArrayUtil.cutArray((byte[])localObject1, 0, m));
          k += m;
          j += 1;
          if (k != i) {
            break label790;
          }
          ((ByteBuffer)localObject2).flip();
          localObject1 = getRequest(str2);
          long l1 = System.currentTimeMillis();
          localObject2 = this.mIoHandler.handerBody((ByteBuffer)localObject2, (SocketRequestBean)localObject1);
          if (localObject2 != null)
          {
            saveDataCache(str2, (JSONObject)localObject2);
            long l2 = System.currentTimeMillis();
            long l3 = ((SocketRequestBean)localObject1).getStartTime();
            String str3 = this.myDate.format(new Date(l3));
            String str4 = this.myDate.format(new Date(l2));
            Log.e("socket请求 = " + ((SocketRequestBean)localObject1).getParam() + " flowNo = " + str2 + " 结束！" + " 请求开始时间:" + str3 + " 当前时间:" + str4 + " ms" + " 网络响应耗时:" + (l1 - l3) + " ms" + " 总耗时:" + (l2 - l3));
            localSocketResponseListener.onResponse((JSONObject)localObject2);
          }
          removeRequest(str2);
        }
        label790:
        localObject1 = new byte[i - k];
      }
      label801:
      notifyAllRequestListener(new SocketException("网络异常,请稍后再试!", SocketException.ExceptionType.NETWORK), false);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\network\socket\SocketResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */