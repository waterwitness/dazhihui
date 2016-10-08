package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class d
  implements Parcelable.Creator<MediaSessionCompat.QueueItem>
{
  public MediaSessionCompat.QueueItem a(Parcel paramParcel)
  {
    return new MediaSessionCompat.QueueItem(paramParcel, null);
  }
  
  public MediaSessionCompat.QueueItem[] a(int paramInt)
  {
    return new MediaSessionCompat.QueueItem[paramInt];
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\media\session\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */