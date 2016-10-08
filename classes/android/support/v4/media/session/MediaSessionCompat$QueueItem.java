package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.media.MediaDescriptionCompat;

public final class MediaSessionCompat$QueueItem
  implements Parcelable
{
  public static final Parcelable.Creator<QueueItem> CREATOR = new d();
  private final MediaDescriptionCompat a;
  private final long b;
  
  private MediaSessionCompat$QueueItem(Parcel paramParcel)
  {
    this.a = ((MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(paramParcel));
    this.b = paramParcel.readLong();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    return "MediaSession.QueueItem {Description=" + this.a + ", Id=" + this.b + " }";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    this.a.writeToParcel(paramParcel, paramInt);
    paramParcel.writeLong(this.b);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\media\session\MediaSessionCompat$QueueItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */