package android.support.v4.os;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

class g<T>
  implements Parcelable.ClassLoaderCreator<T>
{
  private final f<T> a;
  
  public g(f<T> paramf)
  {
    this.a = paramf;
  }
  
  public T createFromParcel(Parcel paramParcel)
  {
    return (T)this.a.a(paramParcel, null);
  }
  
  public T createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    return (T)this.a.a(paramParcel, paramClassLoader);
  }
  
  public T[] newArray(int paramInt)
  {
    return this.a.a(paramInt);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\os\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */