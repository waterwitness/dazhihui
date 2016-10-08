package com.sina.weibo.sdk.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class d
  implements Parcelable.Creator<TextObject>
{
  public TextObject a(Parcel paramParcel)
  {
    return new TextObject(paramParcel);
  }
  
  public TextObject[] a(int paramInt)
  {
    return new TextObject[paramInt];
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\sina\weibo\sdk\api\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */