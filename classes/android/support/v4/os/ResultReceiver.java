package android.support.v4.os;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ResultReceiver
  implements Parcelable
{
  public static final Parcelable.Creator<ResultReceiver> CREATOR = new i();
  final boolean c = false;
  final Handler d = null;
  a e;
  
  ResultReceiver(Parcel paramParcel)
  {
    this.e = b.a(paramParcel.readStrongBinder());
  }
  
  protected void a(int paramInt, Bundle paramBundle) {}
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    try
    {
      if (this.e == null) {
        this.e = new j(this);
      }
      paramParcel.writeStrongBinder(this.e.asBinder());
      return;
    }
    finally {}
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\os\ResultReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */