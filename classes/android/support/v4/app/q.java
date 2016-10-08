package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class q
  implements Parcelable.Creator<BackStackState>
{
  public BackStackState a(Parcel paramParcel)
  {
    return new BackStackState(paramParcel);
  }
  
  public BackStackState[] a(int paramInt)
  {
    return new BackStackState[paramInt];
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\app\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */