package tencent.tls.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class SigInfo$1
  implements Parcelable.Creator<SigInfo>
{
  public SigInfo createFromParcel(Parcel paramParcel)
  {
    return new SigInfo(paramParcel, null);
  }
  
  public SigInfo[] newArray(int paramInt)
  {
    return new SigInfo[paramInt];
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\request\SigInfo$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */