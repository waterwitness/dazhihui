package com.iflytek.speech.aidl;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.iflytek.speech.WakeuperListener.Stub;

public abstract class IWakeuper$Stub
  extends Binder
  implements IWakeuper
{
  private static final String DESCRIPTOR = "com.iflytek.speech.aidl.IWakeuper";
  static final int TRANSACTION_cancel = 3;
  static final int TRANSACTION_destroy = 5;
  static final int TRANSACTION_isListening = 4;
  static final int TRANSACTION_startListening = 1;
  static final int TRANSACTION_stopListening = 2;
  
  public IWakeuper$Stub()
  {
    attachInterface(this, "com.iflytek.speech.aidl.IWakeuper");
  }
  
  public static IWakeuper asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.iflytek.speech.aidl.IWakeuper");
    if ((localIInterface != null) && ((localIInterface instanceof IWakeuper))) {
      return (IWakeuper)localIInterface;
    }
    return new IWakeuper.Stub.Proxy(paramIBinder);
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
      paramParcel2.writeString("com.iflytek.speech.aidl.IWakeuper");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.iflytek.speech.aidl.IWakeuper");
      if (paramParcel1.readInt() != 0) {}
      for (Intent localIntent = (Intent)Intent.CREATOR.createFromParcel(paramParcel1);; localIntent = null)
      {
        startListening(localIntent, WakeuperListener.Stub.asInterface(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      }
    case 2: 
      paramParcel1.enforceInterface("com.iflytek.speech.aidl.IWakeuper");
      stopListening(WakeuperListener.Stub.asInterface(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.iflytek.speech.aidl.IWakeuper");
      cancel(WakeuperListener.Stub.asInterface(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.iflytek.speech.aidl.IWakeuper");
      boolean bool = isListening();
      paramParcel2.writeNoException();
      if (bool) {}
      for (paramInt1 = 1;; paramInt1 = 0)
      {
        paramParcel2.writeInt(paramInt1);
        return true;
      }
    }
    paramParcel1.enforceInterface("com.iflytek.speech.aidl.IWakeuper");
    destroy();
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\speech\aidl\IWakeuper$Stub.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */