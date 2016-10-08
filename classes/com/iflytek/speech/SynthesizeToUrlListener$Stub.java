package com.iflytek.speech;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class SynthesizeToUrlListener$Stub
  extends Binder
  implements SynthesizeToUrlListener
{
  private static final String DESCRIPTOR = "com.iflytek.speech.SynthesizeToUrlListener";
  static final int TRANSACTION_onSynthesizeCompleted = 1;
  
  public SynthesizeToUrlListener$Stub()
  {
    attachInterface(this, "com.iflytek.speech.SynthesizeToUrlListener");
  }
  
  public static SynthesizeToUrlListener asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.iflytek.speech.SynthesizeToUrlListener");
    if ((localIInterface != null) && ((localIInterface instanceof SynthesizeToUrlListener))) {
      return (SynthesizeToUrlListener)localIInterface;
    }
    return new SynthesizeToUrlListener.Stub.Proxy(paramIBinder);
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
      paramParcel2.writeString("com.iflytek.speech.SynthesizeToUrlListener");
      return true;
    }
    paramParcel1.enforceInterface("com.iflytek.speech.SynthesizeToUrlListener");
    onSynthesizeCompleted(paramParcel1.readString(), paramParcel1.readInt());
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\speech\SynthesizeToUrlListener$Stub.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */