package com.tencent.qalsdk.base.remote;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class b
  implements Parcelable.Creator<MsfServiceBindInfo>
{
  public MsfServiceBindInfo a(Parcel paramParcel)
  {
    return new MsfServiceBindInfo(paramParcel);
  }
  
  public MsfServiceBindInfo[] a(int paramInt)
  {
    return new MsfServiceBindInfo[paramInt];
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\base\remote\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */