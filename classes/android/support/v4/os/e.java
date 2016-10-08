package android.support.v4.os;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class e<T>
  implements Parcelable.Creator<T>
{
  final f<T> a;
  
  public e(f<T> paramf)
  {
    this.a = paramf;
  }
  
  public T createFromParcel(Parcel paramParcel)
  {
    return (T)this.a.a(paramParcel, null);
  }
  
  public T[] newArray(int paramInt)
  {
    return this.a.a(paramInt);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\os\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */