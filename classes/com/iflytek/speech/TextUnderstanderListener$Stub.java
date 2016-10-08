package com.iflytek.speech;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class TextUnderstanderListener$Stub
  extends Binder
  implements TextUnderstanderListener
{
  private static final String DESCRIPTOR = "com.iflytek.speech.TextUnderstanderListener";
  static final int TRANSACTION_onError = 2;
  static final int TRANSACTION_onResult = 1;
  
  public TextUnderstanderListener$Stub()
  {
    attachInterface(this, "com.iflytek.speech.TextUnderstanderListener");
  }
  
  public static TextUnderstanderListener asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.iflytek.speech.TextUnderstanderListener");
    if ((localIInterface != null) && ((localIInterface instanceof TextUnderstanderListener))) {
      return (TextUnderstanderListener)localIInterface;
    }
    return new TextUnderstanderListener.Stub.Proxy(paramIBinder);
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.iflytek.speech.TextUnderstanderListener");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.iflytek.speech.TextUnderstanderListener");
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = (UnderstanderResult)UnderstanderResult.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        onResult(paramParcel1);
        return true;
      }
    }
    paramParcel1.enforceInterface("com.iflytek.speech.TextUnderstanderListener");
    onError(paramParcel1.readInt());
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\speech\TextUnderstanderListener$Stub.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */