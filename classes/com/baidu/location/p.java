package com.baidu.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class p
  implements Parcelable.Creator
{
  public Poi a(Parcel paramParcel)
  {
    return new Poi(paramParcel.readString(), paramParcel.readString(), paramParcel.readDouble());
  }
  
  public Poi[] a(int paramInt)
  {
    return new Poi[paramInt];
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */