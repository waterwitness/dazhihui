package com.tencent;

public class TIMLocationElem
  extends TIMElem
{
  private String desc;
  private double latitude;
  private double longitude;
  
  public TIMLocationElem()
  {
    this.type = TIMElemType.Location;
  }
  
  public String getDesc()
  {
    return this.desc;
  }
  
  public double getLatitude()
  {
    return this.latitude;
  }
  
  public double getLongitude()
  {
    return this.longitude;
  }
  
  public void setDesc(String paramString)
  {
    this.desc = paramString;
  }
  
  public void setLatitude(double paramDouble)
  {
    this.latitude = paramDouble;
  }
  
  public void setLongitude(double paramDouble)
  {
    this.longitude = paramDouble;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMLocationElem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */