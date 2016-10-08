package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class l
  implements Parcelable.Creator<RatingCompat>
{
  public RatingCompat a(Parcel paramParcel)
  {
    return new RatingCompat(paramParcel.readInt(), paramParcel.readFloat(), null);
  }
  
  public RatingCompat[] a(int paramInt)
  {
    return new RatingCompat[paramInt];
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\media\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */