package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class ar
  implements Parcelable.Creator<FragmentTabHost.SavedState>
{
  public FragmentTabHost.SavedState a(Parcel paramParcel)
  {
    return new FragmentTabHost.SavedState(paramParcel, null);
  }
  
  public FragmentTabHost.SavedState[] a(int paramInt)
  {
    return new FragmentTabHost.SavedState[paramInt];
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\app\ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */