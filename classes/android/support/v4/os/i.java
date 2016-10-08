package android.support.v4.os;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class i
  implements Parcelable.Creator<ResultReceiver>
{
  public ResultReceiver a(Parcel paramParcel)
  {
    return new ResultReceiver(paramParcel);
  }
  
  public ResultReceiver[] a(int paramInt)
  {
    return new ResultReceiver[paramInt];
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\os\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */