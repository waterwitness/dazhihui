package tencent.tls.platform;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class TLSErrInfo$1
  implements Parcelable.Creator<TLSErrInfo>
{
  public TLSErrInfo createFromParcel(Parcel paramParcel)
  {
    return new TLSErrInfo(paramParcel, null);
  }
  
  public TLSErrInfo[] newArray(int paramInt)
  {
    return new TLSErrInfo[paramInt];
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\platform\TLSErrInfo$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */