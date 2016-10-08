package com.android.thinkive.framework.config;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;

public class RequestQueueBean
{
  private String description;
  private ArrayList<String> key;
  private String name;
  private int threadCount;
  private ArrayList<String> value;
  
  public String getDescription()
  {
    return this.description;
  }
  
  public ArrayList<String> getKey()
  {
    return this.key;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public int getThreadCount()
  {
    return this.threadCount;
  }
  
  public ArrayList<String> getValue()
  {
    return this.value;
  }
  
  public void setDescription(String paramString)
  {
    this.description = paramString;
  }
  
  public void setName(String paramString)
  {
    this.name = paramString;
  }
  
  public void setThreadCount(int paramInt)
  {
    this.threadCount = paramInt;
  }
  
  public void setValue(ArrayList<String> paramArrayList)
  {
    this.value = paramArrayList;
    this.key = new ArrayList();
    paramArrayList = paramArrayList.iterator();
    for (;;)
    {
      if (!paramArrayList.hasNext()) {
        return;
      }
      Object localObject = Uri.parse((String)paramArrayList.next());
      String str = ((Uri)localObject).getHost();
      int j = ((Uri)localObject).getPort();
      int i = j;
      if (j < 0) {
        i = 80;
      }
      localObject = str + ":" + i;
      if (!this.key.contains(localObject)) {
        this.key.add(localObject);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\config\RequestQueueBean.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */