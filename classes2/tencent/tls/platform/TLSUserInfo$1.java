package tencent.tls.platform;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class TLSUserInfo$1
  implements Parcelable.Creator<TLSUserInfo>
{
  public TLSUserInfo createFromParcel(Parcel paramParcel)
  {
    return new TLSUserInfo(paramParcel, null);
  }
  
  public TLSUserInfo[] newArray(int paramInt)
  {
    return new TLSUserInfo[paramInt];
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\platform\TLSUserInfo$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */