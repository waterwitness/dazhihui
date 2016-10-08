package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.ResultReceiver;

final class MediaSessionCompat$ResultReceiverWrapper
  implements Parcelable
{
  public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new e();
  private ResultReceiver a;
  
  MediaSessionCompat$ResultReceiverWrapper(Parcel paramParcel)
  {
    this.a = ((ResultReceiver)ResultReceiver.CREATOR.createFromParcel(paramParcel));
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    this.a.writeToParcel(paramParcel, paramInt);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\media\session\MediaSessionCompat$ResultReceiverWrapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */