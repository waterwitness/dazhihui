package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class RatingCompat
  implements Parcelable
{
  public static final Parcelable.Creator<RatingCompat> CREATOR = new l();
  private final int a;
  private final float b;
  
  private RatingCompat(int paramInt, float paramFloat)
  {
    this.a = paramInt;
    this.b = paramFloat;
  }
  
  public int describeContents()
  {
    return this.a;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder().append("Rating:style=").append(this.a).append(" rating=");
    if (this.b < 0.0F) {}
    for (String str = "unrated";; str = String.valueOf(this.b)) {
      return str;
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
    paramParcel.writeFloat(this.b);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\media\RatingCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */