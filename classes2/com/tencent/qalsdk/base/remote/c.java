package com.tencent.qalsdk.base.remote;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class c
  implements Parcelable.Creator<ToServiceMsg>
{
  public ToServiceMsg a(Parcel paramParcel)
  {
    return new ToServiceMsg(paramParcel);
  }
  
  public ToServiceMsg[] a(int paramInt)
  {
    return new ToServiceMsg[paramInt];
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\base\remote\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */