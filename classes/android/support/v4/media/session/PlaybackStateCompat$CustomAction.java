package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public final class PlaybackStateCompat$CustomAction
  implements Parcelable
{
  public static final Parcelable.Creator<CustomAction> CREATOR = new i();
  private final String a;
  private final CharSequence b;
  private final int c;
  private final Bundle d;
  
  private PlaybackStateCompat$CustomAction(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.c = paramParcel.readInt();
    this.d = paramParcel.readBundle();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    return "Action:mName='" + this.b + ", mIcon=" + this.c + ", mExtras=" + this.d;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    TextUtils.writeToParcel(this.b, paramParcel, paramInt);
    paramParcel.writeInt(this.c);
    paramParcel.writeBundle(this.d);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\media\session\PlaybackStateCompat$CustomAction.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */