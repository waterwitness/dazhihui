package android.support.v4.widget;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class k
  implements Parcelable.Creator<DrawerLayout.SavedState>
{
  public DrawerLayout.SavedState a(Parcel paramParcel)
  {
    return new DrawerLayout.SavedState(paramParcel);
  }
  
  public DrawerLayout.SavedState[] a(int paramInt)
  {
    return new DrawerLayout.SavedState[paramInt];
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\widget\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */