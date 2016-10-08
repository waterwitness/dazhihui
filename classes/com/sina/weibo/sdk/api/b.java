package com.sina.weibo.sdk.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class b
  implements Parcelable.Creator<ImageObject>
{
  public ImageObject a(Parcel paramParcel)
  {
    return new ImageObject(paramParcel);
  }
  
  public ImageObject[] a(int paramInt)
  {
    return new ImageObject[paramInt];
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\sina\weibo\sdk\api\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */