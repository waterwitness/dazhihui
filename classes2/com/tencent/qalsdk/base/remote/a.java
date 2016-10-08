package com.tencent.qalsdk.base.remote;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class a
  implements Parcelable.Creator<FromServiceMsg>
{
  public FromServiceMsg a(Parcel paramParcel)
  {
    return new FromServiceMsg(paramParcel);
  }
  
  public FromServiceMsg[] a(int paramInt)
  {
    return new FromServiceMsg[paramInt];
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\base\remote\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */