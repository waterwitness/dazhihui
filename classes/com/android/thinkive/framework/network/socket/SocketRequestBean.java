package com.android.thinkive.framework.network.socket;

import com.android.thinkive.framework.network.RequestBean;

public class SocketRequestBean
  extends RequestBean
{
  private SocketResponseListener listener;
  private SocketType socketType;
  
  public SocketRequestBean() {}
  
  public SocketRequestBean(RequestBean paramRequestBean)
  {
    setCacheTimeout(paramRequestBean.getCacheTimeout());
    setParam(paramRequestBean.getParam());
    setCacheType(paramRequestBean.getCacheType());
    setSequence(paramRequestBean.getSequence());
    setProtocolType(paramRequestBean.getProtocolType());
    setUrlName(paramRequestBean.getUrlName());
    setShouldCache(paramRequestBean.shouldCache());
    setStartTime(paramRequestBean.getStartTime());
    setHeader(paramRequestBean.getHeader());
  }
  
  public SocketResponseListener getListener()
  {
    return this.listener;
  }
  
  public SocketType getSocketType()
  {
    return this.socketType;
  }
  
  public void setListener(SocketResponseListener paramSocketResponseListener)
  {
    this.listener = paramSocketResponseListener;
  }
  
  public void setSocketType(SocketType paramSocketType)
  {
    this.socketType = paramSocketType;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\network\socket\SocketRequestBean.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */