package com.cairh.app.sjkh.handle;

import java.util.Map;

public class AbsBaseRunable
  implements Runnable
{
  private Map<String, String> p;
  private int type;
  
  public AbsBaseRunable(int paramInt)
  {
    this.type = paramInt;
  }
  
  public AbsBaseRunable(Map<String, String> paramMap)
  {
    this.p = paramMap;
  }
  
  public Map<String, String> getP()
  {
    return this.p;
  }
  
  public int getType()
  {
    return this.type;
  }
  
  public void run() {}
  
  public void setP(Map<String, String> paramMap)
  {
    this.p = paramMap;
  }
  
  public void setType(int paramInt)
  {
    this.type = paramInt;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\handle\AbsBaseRunable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */