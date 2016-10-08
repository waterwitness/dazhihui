package com.android.thinkive.framework.network.socket;

import android.content.Context;
import android.text.TextUtils;
import com.android.thinkive.framework.ThinkiveInitializer;
import com.android.thinkive.framework.config.AddressConfigBean;
import com.android.thinkive.framework.config.ConfigManager;
import com.android.thinkive.framework.network.RequestBean;
import com.android.thinkive.framework.network.ResponseListener;
import com.android.thinkive.framework.util.FlowNoGenerater;
import com.android.thinkive.framework.util.FormatUtil;
import com.android.thinkive.framework.util.Log;
import com.android.thinkive.framework.util.NetWorkUtil;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONObject;

public class SocketService
{
  private static SocketService sInstance;
  private HashMap<String, SocketService.CacheHolder> mCacheHolderMap = new HashMap();
  private HashMap<String, ConnectManager> mConnectManagerMap = new HashMap();
  private Context mContext = ThinkiveInitializer.getInstance().getContext();
  
  private SocketResponseListener buildSocketResponseListener(ResponseListener<JSONObject> paramResponseListener)
  {
    return new SocketService.2(this, paramResponseListener);
  }
  
  private void connect(ConnectManager paramConnectManager, String paramString, int paramInt)
  {
    new SocketService.1(this, paramConnectManager, paramString, paramInt).start();
  }
  
  public static SocketService getInstance()
  {
    try
    {
      if (sInstance == null) {
        sInstance = new SocketService();
      }
      SocketService localSocketService = sInstance;
      return localSocketService;
    }
    finally {}
  }
  
  public void jsonRequest(RequestBean paramRequestBean, ResponseListener<JSONObject> paramResponseListener)
  {
    if (NetWorkUtil.isNetworkConnected(this.mContext))
    {
      Object localObject1 = paramRequestBean.getUrlName();
      paramRequestBean.setSequence(FlowNoGenerater.getInstance().generaterFlowNo());
      SocketResponseListener localSocketResponseListener = buildSocketResponseListener(paramResponseListener);
      localObject1 = ConfigManager.getInstance().getAddressConfigBean((String)localObject1);
      String str = ((AddressConfigBean)localObject1).getPriorityValue();
      Object localObject2 = (SocketService.CacheHolder)this.mCacheHolderMap.get(str);
      int i;
      if (localObject2 == null)
      {
        localObject2 = new SocketService.CacheHolder(this);
        paramResponseListener = FormatUtil.formatUrlToHost(str);
        i = FormatUtil.formatUrlToPort(str);
        ((SocketService.CacheHolder)localObject2).port = i;
        ((SocketService.CacheHolder)localObject2).host = paramResponseListener;
        this.mCacheHolderMap.put(str, localObject2);
        Log.d("socket request host = " + paramResponseListener + " port = " + i);
        str = paramResponseListener + ":" + i;
        localObject2 = new SocketRequestBean(paramRequestBean);
        ((SocketRequestBean)localObject2).setListener(localSocketResponseListener);
        paramRequestBean = ((AddressConfigBean)localObject1).getSocketType();
        if (TextUtils.isEmpty(paramRequestBean)) {
          break label388;
        }
        if (!"A".equals(paramRequestBean)) {
          break label308;
        }
        ((SocketRequestBean)localObject2).setSocketType(SocketType.A);
      }
      for (;;)
      {
        localObject1 = (ConnectManager)this.mConnectManagerMap.get(str);
        paramRequestBean = (RequestBean)localObject1;
        if (localObject1 == null)
        {
          paramRequestBean = new ConnectManager(((SocketRequestBean)localObject2).getSocketType());
          this.mConnectManagerMap.put(str, paramRequestBean);
        }
        paramRequestBean.addRequest((SocketRequestBean)localObject2);
        if ((!paramRequestBean.isAuthed()) && (!paramRequestBean.isConnecting()))
        {
          paramRequestBean.registerSocketResponseListener(localSocketResponseListener);
          connect(paramRequestBean, paramResponseListener, i);
        }
        return;
        paramResponseListener = ((SocketService.CacheHolder)localObject2).host;
        i = ((SocketService.CacheHolder)localObject2).port;
        break;
        label308:
        if ("HK".equals(paramRequestBean)) {
          ((SocketRequestBean)localObject2).setSocketType(SocketType.HK);
        } else if ("TRADE".equals(paramRequestBean)) {
          ((SocketRequestBean)localObject2).setSocketType(SocketType.TRADE);
        } else if ("BF".equals(paramRequestBean)) {
          ((SocketRequestBean)localObject2).setSocketType(SocketType.BF);
        } else if ("INFO".equals(paramRequestBean)) {
          ((SocketRequestBean)localObject2).setSocketType(SocketType.INFO);
        }
      }
      label388:
      Log.e("没有指定socket请求类型!!!");
      return;
    }
    paramResponseListener.onErrorResponse(new SocketException("无网络连接!"));
  }
  
  public void release()
  {
    Iterator localIterator = this.mConnectManagerMap.entrySet().iterator();
    for (;;)
    {
      if (!localIterator.hasNext())
      {
        this.mConnectManagerMap.clear();
        this.mCacheHolderMap.clear();
        if (sInstance != null) {
          sInstance = null;
        }
        return;
      }
      ConnectManager localConnectManager = (ConnectManager)((Map.Entry)localIterator.next()).getValue();
      localConnectManager.setIsExit(true);
      localConnectManager.releaseCTX();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\network\socket\SocketService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */