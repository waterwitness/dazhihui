package com.iflytek.speech;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class SynthesizerListener$Stub
  extends Binder
  implements SynthesizerListener
{
  private static final String DESCRIPTOR = "com.iflytek.speech.SynthesizerListener";
  static final int TRANSACTION_onBufferProgress = 6;
  static final int TRANSACTION_onCompleted = 4;
  static final int TRANSACTION_onEvent = 7;
  static final int TRANSACTION_onSpeakBegin = 1;
  static final int TRANSACTION_onSpeakPaused = 2;
  static final int TRANSACTION_onSpeakProgress = 5;
  static final int TRANSACTION_onSpeakResumed = 3;
  
  public SynthesizerListener$Stub()
  {
    attachInterface(this, "com.iflytek.speech.SynthesizerListener");
  }
  
  public static SynthesizerListener asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.iflytek.speech.SynthesizerListener");
    if ((localIInterface != null) && ((localIInterface instanceof SynthesizerListener))) {
      return (SynthesizerListener)localIInterface;
    }
    return new SynthesizerListener.Stub.Proxy(paramIBinder);
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
      paramParcel2.writeString("com.iflytek.speech.SynthesizerListener");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.iflytek.speech.SynthesizerListener");
      onSpeakBegin();
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.iflytek.speech.SynthesizerListener");
      onSpeakPaused();
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.iflytek.speech.SynthesizerListener");
      onSpeakResumed();
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.iflytek.speech.SynthesizerListener");
      onCompleted(paramParcel1.readInt());
      return true;
    case 5: 
      paramParcel1.enforceInterface("com.iflytek.speech.SynthesizerListener");
      onSpeakProgress(paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readInt());
      return true;
    case 6: 
      paramParcel1.enforceInterface("com.iflytek.speech.SynthesizerListener");
      onBufferProgress(paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readString());
      return true;
    }
    paramParcel1.enforceInterface("com.iflytek.speech.SynthesizerListener");
    paramInt1 = paramParcel1.readInt();
    paramInt2 = paramParcel1.readInt();
    int i = paramParcel1.readInt();
    if (paramParcel1.readInt() != 0) {}
    for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
    {
      onEvent(paramInt1, paramInt2, i, paramParcel1);
      return true;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\speech\SynthesizerListener$Stub.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */