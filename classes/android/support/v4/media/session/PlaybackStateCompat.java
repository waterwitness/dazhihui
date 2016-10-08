package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.List;

public final class PlaybackStateCompat
  implements Parcelable
{
  public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new h();
  private final int a;
  private final long b;
  private final long c;
  private final float d;
  private final long e;
  private final CharSequence f;
  private final long g;
  private List<PlaybackStateCompat.CustomAction> h;
  private final long i;
  private final Bundle j;
  
  private PlaybackStateCompat(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
    this.b = paramParcel.readLong();
    this.d = paramParcel.readFloat();
    this.g = paramParcel.readLong();
    this.c = paramParcel.readLong();
    this.e = paramParcel.readLong();
    this.f = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.h = paramParcel.createTypedArrayList(PlaybackStateCompat.CustomAction.CREATOR);
    this.i = paramParcel.readLong();
    this.j = paramParcel.readBundle();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("PlaybackState {");
    localStringBuilder.append("state=").append(this.a);
    localStringBuilder.append(", position=").append(this.b);
    localStringBuilder.append(", buffered position=").append(this.c);
    localStringBuilder.append(", speed=").append(this.d);
    localStringBuilder.append(", updated=").append(this.g);
    localStringBuilder.append(", actions=").append(this.e);
    localStringBuilder.append(", error=").append(this.f);
    localStringBuilder.append(", custom actions=").append(this.h);
    localStringBuilder.append(", active item id=").append(this.i);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
    paramParcel.writeLong(this.b);
    paramParcel.writeFloat(this.d);
    paramParcel.writeLong(this.g);
    paramParcel.writeLong(this.c);
    paramParcel.writeLong(this.e);
    TextUtils.writeToParcel(this.f, paramParcel, paramInt);
    paramParcel.writeTypedList(this.h);
    paramParcel.writeLong(this.i);
    paramParcel.writeBundle(this.j);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\media\session\PlaybackStateCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */