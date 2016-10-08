package com.payeco.android.plugin.util;

public class LocationData
{
  String M;
  String co;
  String cp;
  
  public LocationData() {}
  
  public LocationData(String paramString1, String paramString2, String paramString3)
  {
    this.co = paramString1;
    this.cp = paramString2;
    this.M = paramString3;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      do
      {
        return true;
        if (paramObject == null) {
          return false;
        }
        if (getClass() != paramObject.getClass()) {
          return false;
        }
        paramObject = (LocationData)paramObject;
        if (this.M == null)
        {
          if (((LocationData)paramObject).M != null) {
            return false;
          }
        }
        else if (!this.M.equals(((LocationData)paramObject).M)) {
          return false;
        }
        if (this.co == null)
        {
          if (((LocationData)paramObject).co != null) {
            return false;
          }
        }
        else if (!this.co.equals(((LocationData)paramObject).co)) {
          return false;
        }
        if (this.cp != null) {
          break;
        }
      } while (((LocationData)paramObject).cp == null);
      return false;
    } while (this.cp.equals(((LocationData)paramObject).cp));
    return false;
  }
  
  public String getAddress()
  {
    return this.M;
  }
  
  public String getLat()
  {
    return this.co;
  }
  
  public String getLon()
  {
    return this.cp;
  }
  
  public int hashCode()
  {
    int k = 0;
    int i;
    int j;
    if (this.M == null)
    {
      i = 0;
      if (this.co != null) {
        break label53;
      }
      j = 0;
      label20:
      if (this.cp != null) {
        break label64;
      }
    }
    for (;;)
    {
      return (j + (i + 31) * 31) * 31 + k;
      i = this.M.hashCode();
      break;
      label53:
      j = this.co.hashCode();
      break label20;
      label64:
      k = this.cp.hashCode();
    }
  }
  
  public void setAddress(String paramString)
  {
    this.M = paramString;
  }
  
  public void setLat(String paramString)
  {
    this.co = paramString;
  }
  
  public void setLon(String paramString)
  {
    this.cp = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\util\LocationData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */