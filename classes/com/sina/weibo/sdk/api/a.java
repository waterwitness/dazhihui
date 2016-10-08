package com.sina.weibo.sdk.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class a
  implements Parcelable.Creator<CmdObject>
{
  public CmdObject a(Parcel paramParcel)
  {
    return new CmdObject(paramParcel);
  }
  
  public CmdObject[] a(int paramInt)
  {
    return new CmdObject[paramInt];
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\sina\weibo\sdk\api\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */