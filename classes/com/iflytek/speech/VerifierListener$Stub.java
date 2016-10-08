package com.iflytek.speech;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class VerifierListener$Stub
  extends Binder
  implements VerifierListener
{
  private static final String DESCRIPTOR = "com.iflytek.speech.VerifierListener";
  static final int TRANSACTION_onBeginOfSpeech = 2;
  static final int TRANSACTION_onCancel = 6;
  static final int TRANSACTION_onEnd = 5;
  static final int TRANSACTION_onEndOfSpeech = 3;
  static final int TRANSACTION_onError = 7;
  static final int TRANSACTION_onRegister = 4;
  static final int TRANSACTION_onVolumeChanged = 1;
  
  public VerifierListener$Stub()
  {
    attachInterface(this, "com.iflytek.speech.VerifierListener");
  }
  
  public static VerifierListener asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.iflytek.speech.VerifierListener");
    if ((localIInterface != null) && ((localIInterface instanceof VerifierListener))) {
      return (VerifierListener)localIInterface;
    }
    return new VerifierListener.Stub.Proxy(paramIBinder);
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Object localObject2 = null;
    Object localObject1 = null;
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.iflytek.speech.VerifierListener");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.iflytek.speech.VerifierListener");
      onVolumeChanged(paramParcel1.readInt());
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.iflytek.speech.VerifierListener");
      onBeginOfSpeech();
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.iflytek.speech.VerifierListener");
      onEndOfSpeech();
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.iflytek.speech.VerifierListener");
      paramParcel2 = (Parcel)localObject1;
      if (paramParcel1.readInt() != 0) {
        paramParcel2 = (VerifierResult)VerifierResult.CREATOR.createFromParcel(paramParcel1);
      }
      onRegister(paramParcel2);
      return true;
    case 5: 
      paramParcel1.enforceInterface("com.iflytek.speech.VerifierListener");
      paramParcel2 = (Parcel)localObject2;
      if (paramParcel1.readInt() != 0) {
        paramParcel2 = (VerifierResult)VerifierResult.CREATOR.createFromParcel(paramParcel1);
      }
      onEnd(paramParcel2, paramParcel1.readInt());
      return true;
    case 6: 
      paramParcel1.enforceInterface("com.iflytek.speech.VerifierListener");
      onCancel();
      return true;
    }
    paramParcel1.enforceInterface("com.iflytek.speech.VerifierListener");
    onError(paramParcel1.readInt());
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\speech\VerifierListener$Stub.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */