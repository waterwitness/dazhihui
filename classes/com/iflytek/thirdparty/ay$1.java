package com.iflytek.thirdparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class ay$1
  implements Parcelable.Creator<ay>
{
  public ay a(Parcel paramParcel)
  {
    ay localay = new ay();
    ay.a(localay, paramParcel.readString());
    ay.b(localay, paramParcel.readString());
    ay.c(localay, paramParcel.readString());
    ay.d(localay, paramParcel.readString());
    ay.e(localay, paramParcel.readString());
    ay.f(localay, paramParcel.readString());
    ay.g(localay, paramParcel.readString());
    return localay;
  }
  
  public ay[] a(int paramInt)
  {
    return new ay[paramInt];
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\ay$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */