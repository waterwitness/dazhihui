package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class MediaBrowserCompat$MediaItem
  implements Parcelable
{
  public static final Parcelable.Creator<MediaItem> CREATOR = new d();
  private final int a;
  private final MediaDescriptionCompat b;
  
  private MediaBrowserCompat$MediaItem(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
    this.b = ((MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(paramParcel));
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("MediaItem{");
    localStringBuilder.append("mFlags=").append(this.a);
    localStringBuilder.append(", mDescription=").append(this.b);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
    this.b.writeToParcel(paramParcel, paramInt);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\media\MediaBrowserCompat$MediaItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */