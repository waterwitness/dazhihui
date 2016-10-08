package android.support.v13.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class b
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v13\app\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */