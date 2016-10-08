package com.android.thinkive.framework;

import android.content.Context;
import android.text.TextUtils;
import com.android.thinkive.framework.config.AddressConfigBean;
import com.android.thinkive.framework.config.ConfigManager;
import com.android.thinkive.framework.util.Log;
import com.android.thinkive.framework.util.NetWorkUtil;
import java.util.ArrayList;
import java.util.Iterator;

public class MultiAddressManager
{
  private static final String PING_COMMAND = "ping -c 1 -w 2 ";
  private Context mContext;
  private ArrayList<MultiAddressManager.HttpConnectThread> mHttpConnectThreads;
  private ArrayList<MultiAddressManager.PingThread> mPingThreads;
  private ArrayList<MultiAddressManager.SocketConnectThread> mSocketConnectThreads;
  
  public MultiAddressManager(Context paramContext)
  {
    this.mContext = paramContext;
    this.mPingThreads = new ArrayList();
    this.mHttpConnectThreads = new ArrayList();
    this.mSocketConnectThreads = new ArrayList();
  }
  
  private void interceptHttpConnectThread(String paramString)
  {
    int i = 0;
    for (;;)
    {
      if (i >= this.mHttpConnectThreads.size()) {
        return;
      }
      MultiAddressManager.HttpConnectThread localHttpConnectThread = (MultiAddressManager.HttpConnectThread)this.mHttpConnectThreads.get(i);
      if (localHttpConnectThread.getUrlName().equals(paramString))
      {
        localHttpConnectThread.interrupt();
        this.mHttpConnectThreads.remove(localHttpConnectThread);
      }
      else
      {
        i += 1;
      }
    }
  }
  
  private void interceptPingThread(String paramString)
  {
    int i = 0;
    for (;;)
    {
      if (i >= this.mPingThreads.size()) {
        return;
      }
      MultiAddressManager.PingThread localPingThread = (MultiAddressManager.PingThread)this.mPingThreads.get(i);
      if (localPingThread.getUrlName().equals(paramString))
      {
        localPingThread.interrupt();
        this.mPingThreads.remove(localPingThread);
      }
      else
      {
        i += 1;
      }
    }
  }
  
  private void interceptSocketConnectThread(String paramString)
  {
    int i = 0;
    for (;;)
    {
      if (i >= this.mSocketConnectThreads.size()) {
        return;
      }
      MultiAddressManager.SocketConnectThread localSocketConnectThread = (MultiAddressManager.SocketConnectThread)this.mSocketConnectThreads.get(i);
      if (localSocketConnectThread.getUrlName().equals(paramString))
      {
        localSocketConnectThread.interrupt();
        this.mSocketConnectThreads.remove(localSocketConnectThread);
      }
      else
      {
        i += 1;
      }
    }
  }
  
  private void speedByConntect(AddressConfigBean paramAddressConfigBean)
  {
    Iterator localIterator = paramAddressConfigBean.getValue().iterator();
    for (;;)
    {
      if (!localIterator.hasNext()) {
        return;
      }
      Object localObject = (String)localIterator.next();
      if (TextUtils.isEmpty(paramAddressConfigBean.getSocketType()))
      {
        localObject = new MultiAddressManager.HttpConnectThread(this, paramAddressConfigBean, (String)localObject);
        this.mHttpConnectThreads.add(localObject);
        ((MultiAddressManager.HttpConnectThread)localObject).start();
      }
      else
      {
        localObject = new MultiAddressManager.SocketConnectThread(this, paramAddressConfigBean, (String)localObject);
        this.mSocketConnectThreads.add(localObject);
        ((MultiAddressManager.SocketConnectThread)localObject).start();
      }
    }
  }
  
  private void speedByPing(AddressConfigBean paramAddressConfigBean)
  {
    Iterator localIterator = paramAddressConfigBean.getValue().iterator();
    for (;;)
    {
      if (!localIterator.hasNext()) {
        return;
      }
      MultiAddressManager.PingThread localPingThread = new MultiAddressManager.PingThread(this, paramAddressConfigBean, (String)localIterator.next());
      this.mPingThreads.add(localPingThread);
      localPingThread.start();
    }
  }
  
  public void routeServerAddress()
  {
    if (NetWorkUtil.isNetworkConnected(this.mContext))
    {
      Iterator localIterator = ConfigManager.getInstance().getAddressConfig().iterator();
      for (;;)
      {
        if (!localIterator.hasNext()) {
          return;
        }
        AddressConfigBean localAddressConfigBean = (AddressConfigBean)localIterator.next();
        if (localAddressConfigBean.isRoute()) {
          if (!TextUtils.isEmpty(localAddressConfigBean.getSpeedPath())) {
            speedByConntect(localAddressConfigBean);
          } else {
            speedByPing(localAddressConfigBean);
          }
        }
      }
    }
    Log.d("network is unavailable,route server address failed!!!");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\MultiAddressManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */