package android.support.v4.view;

import android.os.Parcel;
import android.support.v4.os.f;

final class di
  implements f<ViewPager.SavedState>
{
  public ViewPager.SavedState b(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    return new ViewPager.SavedState(paramParcel, paramClassLoader);
  }
  
  public ViewPager.SavedState[] b(int paramInt)
  {
    return new ViewPager.SavedState[paramInt];
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\view\di.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */