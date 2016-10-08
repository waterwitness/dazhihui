package com.sina.weibo.sdk.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class f
  implements Parcelable.Creator<VoiceObject>
{
  public VoiceObject a(Parcel paramParcel)
  {
    return new VoiceObject(paramParcel);
  }
  
  public VoiceObject[] a(int paramInt)
  {
    return new VoiceObject[paramInt];
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\sina\weibo\sdk\api\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */