package android.support.v4.media.session;

import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class MediaSessionCompat$Token
  implements Parcelable
{
  public static final Parcelable.Creator<Token> CREATOR = new f();
  private final Object a;
  
  MediaSessionCompat$Token(Object paramObject)
  {
    this.a = paramObject;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramParcel.writeParcelable((Parcelable)this.a, paramInt);
      return;
    }
    paramParcel.writeStrongBinder((IBinder)this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\media\session\MediaSessionCompat$Token.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */