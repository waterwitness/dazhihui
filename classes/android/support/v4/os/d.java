package android.support.v4.os;

import android.os.Build.VERSION;
import android.os.Parcelable.Creator;

public class d
{
  public static <T> Parcelable.Creator<T> a(f<T> paramf)
  {
    if (Build.VERSION.SDK_INT >= 13) {
      return h.a(paramf);
    }
    return new e(paramf);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\os\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */