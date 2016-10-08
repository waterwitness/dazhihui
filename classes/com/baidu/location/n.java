package com.baidu.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class n
  implements Parcelable.Creator
{
  public BDLocation a(Parcel paramParcel)
  {
    return new BDLocation(paramParcel, null);
  }
  
  public BDLocation[] a(int paramInt)
  {
    return new BDLocation[paramInt];
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */