package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class e
  implements Parcelable.Creator<MediaSessionCompat.ResultReceiverWrapper>
{
  public MediaSessionCompat.ResultReceiverWrapper a(Parcel paramParcel)
  {
    return new MediaSessionCompat.ResultReceiverWrapper(paramParcel);
  }
  
  public MediaSessionCompat.ResultReceiverWrapper[] a(int paramInt)
  {
    return new MediaSessionCompat.ResultReceiverWrapper[paramInt];
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\media\session\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */