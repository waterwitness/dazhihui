package com.sina.weibo.sdk.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class c
  implements Parcelable.Creator<MusicObject>
{
  public MusicObject a(Parcel paramParcel)
  {
    return new MusicObject(paramParcel);
  }
  
  public MusicObject[] a(int paramInt)
  {
    return new MusicObject[paramInt];
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\sina\weibo\sdk\api\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */