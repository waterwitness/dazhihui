package com.sina.weibo.sdk.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class g
  implements Parcelable.Creator<WebpageObject>
{
  public WebpageObject a(Parcel paramParcel)
  {
    return new WebpageObject(paramParcel);
  }
  
  public WebpageObject[] a(int paramInt)
  {
    return new WebpageObject[paramInt];
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\sina\weibo\sdk\api\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */