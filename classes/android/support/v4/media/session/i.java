package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class i
  implements Parcelable.Creator<PlaybackStateCompat.CustomAction>
{
  public PlaybackStateCompat.CustomAction a(Parcel paramParcel)
  {
    return new PlaybackStateCompat.CustomAction(paramParcel, null);
  }
  
  public PlaybackStateCompat.CustomAction[] a(int paramInt)
  {
    return new PlaybackStateCompat.CustomAction[paramInt];
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\media\session\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */