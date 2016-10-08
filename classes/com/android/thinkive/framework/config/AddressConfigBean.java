package com.android.thinkive.framework.config;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public class AddressConfigBean
{
  private String certificatePath;
  private String description;
  private AtomicBoolean isSpeeded = new AtomicBoolean(false);
  private String method;
  private String name;
  private String priorityValue;
  private int retry;
  private boolean route;
  private String socketType;
  private String speedPath;
  private int timeout;
  private ArrayList<String> value;
  
  public void addressConfigBean(ArrayList<String> paramArrayList)
  {
    this.value = paramArrayList;
  }
  
  public String getCertificatePath()
  {
    return this.certificatePath;
  }
  
  public String getDescription()
  {
    return this.description;
  }
  
  public AtomicBoolean getIsSpeeded()
  {
    return this.isSpeeded;
  }
  
  public String getMethod()
  {
    return this.method;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public String getPriorityValue()
  {
    return this.priorityValue;
  }
  
  public int getRetry()
  {
    return this.retry;
  }
  
  public String getSocketType()
  {
    return this.socketType;
  }
  
  public String getSpeedPath()
  {
    return this.speedPath;
  }
  
  public int getTimeout()
  {
    return this.timeout;
  }
  
  public ArrayList<String> getValue()
  {
    return this.value;
  }
  
  public boolean isRoute()
  {
    return this.route;
  }
  
  public void setCertificatePath(String paramString)
  {
    this.certificatePath = paramString;
  }
  
  public void setDescription(String paramString)
  {
    this.description = paramString;
  }
  
  public void setMethod(String paramString)
  {
    this.method = paramString;
  }
  
  public void setName(String paramString)
  {
    this.name = paramString;
  }
  
  public void setPriorityValue(String paramString)
  {
    this.priorityValue = paramString;
  }
  
  public void setRetry(int paramInt)
  {
    this.retry = paramInt;
  }
  
  public void setRoute(boolean paramBoolean)
  {
    this.route = paramBoolean;
  }
  
  public void setSocketType(String paramString)
  {
    this.socketType = paramString;
  }
  
  public void setSpeedPath(String paramString)
  {
    this.speedPath = paramString;
  }
  
  public void setTimeout(int paramInt)
  {
    this.timeout = paramInt;
  }
  
  public void setValue(ArrayList<String> paramArrayList)
  {
    this.value = paramArrayList;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\config\AddressConfigBean.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */