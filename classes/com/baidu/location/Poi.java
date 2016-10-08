package com.baidu.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class Poi
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new p();
  private final double a;
  private final String b;
  private final String c;
  
  public Poi(String paramString1, String paramString2, double paramDouble)
  {
    this.b = paramString1;
    this.c = paramString2;
    this.a = paramDouble;
  }
  
  public String a()
  {
    return this.b;
  }
  
  public double b()
  {
    return this.a;
  }
  
  public String c()
  {
    return this.c;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
    paramParcel.writeDouble(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\Poi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */