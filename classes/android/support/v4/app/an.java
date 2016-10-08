package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class an
  implements Parcelable.Creator<FragmentManagerState>
{
  public FragmentManagerState a(Parcel paramParcel)
  {
    return new FragmentManagerState(paramParcel);
  }
  
  public FragmentManagerState[] a(int paramInt)
  {
    return new FragmentManagerState[paramInt];
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\app\an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */