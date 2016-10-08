package android.support.v4.media;

import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.Creator;

final class e
  implements Parcelable.Creator<MediaDescriptionCompat>
{
  public MediaDescriptionCompat a(Parcel paramParcel)
  {
    if (Build.VERSION.SDK_INT < 21) {
      return new MediaDescriptionCompat(paramParcel, null);
    }
    return MediaDescriptionCompat.a(g.a(paramParcel));
  }
  
  public MediaDescriptionCompat[] a(int paramInt)
  {
    return new MediaDescriptionCompat[paramInt];
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\media\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */