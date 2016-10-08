package com.tencent.open.utils;

public class Util$Statistic
{
  public long reqSize;
  public String response;
  public long rspSize;
  
  public Util$Statistic(String paramString, int paramInt)
  {
    this.response = paramString;
    this.reqSize = paramInt;
    if (this.response != null) {
      this.rspSize = this.response.length();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\open\utils\Util$Statistic.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */