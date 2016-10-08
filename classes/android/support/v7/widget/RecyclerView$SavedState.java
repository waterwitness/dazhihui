package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

public class RecyclerView$SavedState
  extends View.BaseSavedState
{
  public static final Parcelable.Creator<SavedState> CREATOR = new be();
  Parcelable a;
  
  RecyclerView$SavedState(Parcel paramParcel)
  {
    super(paramParcel);
    this.a = paramParcel.readParcelable(aw.class.getClassLoader());
  }
  
  RecyclerView$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  private void a(SavedState paramSavedState)
  {
    this.a = paramSavedState.a;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeParcelable(this.a, 0);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v7\widget\RecyclerView$SavedState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */