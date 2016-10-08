package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class h
  implements Parcelable.Creator<PlaybackStateCompat>
{
  public PlaybackStateCompat a(Parcel paramParcel)
  {
    return new PlaybackStateCompat(paramParcel, null);
  }
  
  public PlaybackStateCompat[] a(int paramInt)
  {
    return new PlaybackStateCompat[paramInt];
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\media\session\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */