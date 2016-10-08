package com.iflytek.speech.aidl;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.iflytek.speech.SynthesizerListener.Stub;

public abstract class ISpeechSynthesizer$Stub
  extends Binder
  implements ISpeechSynthesizer
{
  private static final String DESCRIPTOR = "com.iflytek.speech.aidl.ISpeechSynthesizer";
  static final int TRANSACTION_getLocalSpeakerList = 7;
  static final int TRANSACTION_isSpeaking = 6;
  static final int TRANSACTION_pauseSpeaking = 3;
  static final int TRANSACTION_resumeSpeaking = 4;
  static final int TRANSACTION_startSpeaking = 2;
  static final int TRANSACTION_stopSpeaking = 5;
  static final int TRANSACTION_synthesizeToUrl = 1;
  
  public ISpeechSynthesizer$Stub()
  {
    attachInterface(this, "com.iflytek.speech.aidl.ISpeechSynthesizer");
  }
  
  public static ISpeechSynthesizer asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.iflytek.speech.aidl.ISpeechSynthesizer");
    if ((localIInterface != null) && ((localIInterface instanceof ISpeechSynthesizer))) {
      return (ISpeechSynthesizer)localIInterface;
    }
    return new ISpeechSynthesizer.Stub.Proxy(paramIBinder);
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
      paramParcel2.writeString("com.iflytek.speech.aidl.ISpeechSynthesizer");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.iflytek.speech.aidl.ISpeechSynthesizer");
      if (paramParcel1.readInt() != 0) {
        localObject1 = (Intent)Intent.CREATOR.createFromParcel(paramParcel1);
      }
      paramInt1 = synthesizeToUrl((Intent)localObject1, SynthesizerListener.Stub.asInterface(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.iflytek.speech.aidl.ISpeechSynthesizer");
      localObject1 = localObject2;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (Intent)Intent.CREATOR.createFromParcel(paramParcel1);
      }
      paramInt1 = startSpeaking((Intent)localObject1, SynthesizerListener.Stub.asInterface(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.iflytek.speech.aidl.ISpeechSynthesizer");
      paramInt1 = pauseSpeaking(SynthesizerListener.Stub.asInterface(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.iflytek.speech.aidl.ISpeechSynthesizer");
      paramInt1 = resumeSpeaking(SynthesizerListener.Stub.asInterface(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      return true;
    case 5: 
      paramParcel1.enforceInterface("com.iflytek.speech.aidl.ISpeechSynthesizer");
      paramInt1 = stopSpeaking(SynthesizerListener.Stub.asInterface(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      return true;
    case 6: 
      paramParcel1.enforceInterface("com.iflytek.speech.aidl.ISpeechSynthesizer");
      boolean bool = isSpeaking();
      paramParcel2.writeNoException();
      if (bool) {}
      for (paramInt1 = 1;; paramInt1 = 0)
      {
        paramParcel2.writeInt(paramInt1);
        return true;
      }
    }
    paramParcel1.enforceInterface("com.iflytek.speech.aidl.ISpeechSynthesizer");
    paramParcel1 = getLocalSpeakerList();
    paramParcel2.writeNoException();
    paramParcel2.writeString(paramParcel1);
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\speech\aidl\ISpeechSynthesizer$Stub.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */