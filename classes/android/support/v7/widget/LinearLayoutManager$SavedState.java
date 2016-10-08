package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class LinearLayoutManager$SavedState
  implements Parcelable
{
  public static final Parcelable.Creator<SavedState> CREATOR = new z();
  int a;
  int b;
  boolean c;
  
  public LinearLayoutManager$SavedState() {}
  
  LinearLayoutManager$SavedState(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
    this.b = paramParcel.readInt();
    if (paramParcel.readInt() == 1) {}
    for (;;)
    {
      this.c = bool;
      return;
      bool = false;
    }
  }
  
  public LinearLayoutManager$SavedState(SavedState paramSavedState)
  {
    this.a = paramSavedState.a;
    this.b = paramSavedState.b;
    this.c = paramSavedState.c;
  }
  
  boolean a()
  {
    return this.a >= 0;
  }
  
  void b()
  {
    this.a = -1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
    paramParcel.writeInt(this.b);
    if (this.c) {}
    for (paramInt = 1;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v7\widget\LinearLayoutManager$SavedState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */