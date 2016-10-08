package com.sina.weibo.sdk.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class e
  implements Parcelable.Creator<VideoObject>
{
  public VideoObject a(Parcel paramParcel)
  {
    return new VideoObject(paramParcel);
  }
  
  public VideoObject[] a(int paramInt)
  {
    return new VideoObject[paramInt];
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\sina\weibo\sdk\api\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */