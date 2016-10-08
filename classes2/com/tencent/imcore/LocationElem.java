package com.tencent.imcore;

public class LocationElem
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public LocationElem()
  {
    this(internalJNI.new_LocationElem(), true);
  }
  
  protected LocationElem(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(LocationElem paramLocationElem)
  {
    if (paramLocationElem == null) {
      return 0L;
    }
    return paramLocationElem.swigCPtr;
  }
  
  public void delete()
  {
    try
    {
      if (this.swigCPtr != 0L)
      {
        if (this.swigCMemOwn)
        {
          this.swigCMemOwn = false;
          internalJNI.delete_LocationElem(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  protected void finalize()
  {
    delete();
  }
  
  public byte[] getDesc()
  {
    return internalJNI.LocationElem_desc_get(this.swigCPtr, this);
  }
  
  public double getLatitude()
  {
    return internalJNI.LocationElem_latitude_get(this.swigCPtr, this);
  }
  
  public double getLongitude()
  {
    return internalJNI.LocationElem_longitude_get(this.swigCPtr, this);
  }
  
  public void setDesc(byte[] paramArrayOfByte)
  {
    internalJNI.LocationElem_desc_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setLatitude(double paramDouble)
  {
    internalJNI.LocationElem_latitude_set(this.swigCPtr, this, paramDouble);
  }
  
  public void setLongitude(double paramDouble)
  {
    internalJNI.LocationElem_longitude_set(this.swigCPtr, this, paramDouble);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\LocationElem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */