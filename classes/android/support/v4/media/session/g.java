package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class g
  implements Parcelable.Creator<ParcelableVolumeInfo>
{
  public ParcelableVolumeInfo a(Parcel paramParcel)
  {
    return new ParcelableVolumeInfo(paramParcel);
  }
  
  public ParcelableVolumeInfo[] a(int paramInt)
  {
    return new ParcelableVolumeInfo[paramInt];
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\media\session\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */