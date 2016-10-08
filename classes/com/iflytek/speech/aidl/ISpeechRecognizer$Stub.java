package com.iflytek.speech.aidl;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.iflytek.speech.GrammarListener.Stub;
import com.iflytek.speech.LexiconListener.Stub;
import com.iflytek.speech.RecognizerListener.Stub;

public abstract class ISpeechRecognizer$Stub
  extends Binder
  implements ISpeechRecognizer
{
  private static final String DESCRIPTOR = "com.iflytek.speech.aidl.ISpeechRecognizer";
  static final int TRANSACTION_buildGrammar = 5;
  static final int TRANSACTION_cancel = 3;
  static final int TRANSACTION_isListening = 4;
  static final int TRANSACTION_startListening = 1;
  static final int TRANSACTION_stopListening = 2;
  static final int TRANSACTION_updateLexicon = 6;
  static final int TRANSACTION_writeAudio = 7;
  
  public ISpeechRecognizer$Stub()
  {
    attachInterface(this, "com.iflytek.speech.aidl.ISpeechRecognizer");
  }
  
  public static ISpeechRecognizer asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.iflytek.speech.aidl.ISpeechRecognizer");
    if ((localIInterface != null) && ((localIInterface instanceof ISpeechRecognizer))) {
      return (ISpeechRecognizer)localIInterface;
    }
    return new ISpeechRecognizer.Stub.Proxy(paramIBinder);
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject4 = null;
    Object localObject1 = null;
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.iflytek.speech.aidl.ISpeechRecognizer");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.iflytek.speech.aidl.ISpeechRecognizer");
      if (paramParcel1.readInt() != 0) {
        localObject1 = (Intent)Intent.CREATOR.createFromParcel(paramParcel1);
      }
      startListening((Intent)localObject1, RecognizerListener.Stub.asInterface(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.iflytek.speech.aidl.ISpeechRecognizer");
      stopListening(RecognizerListener.Stub.asInterface(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.iflytek.speech.aidl.ISpeechRecognizer");
      cancel(RecognizerListener.Stub.asInterface(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.iflytek.speech.aidl.ISpeechRecognizer");
      boolean bool = isListening();
      paramParcel2.writeNoException();
      if (bool) {}
      for (paramInt1 = 1;; paramInt1 = 0)
      {
        paramParcel2.writeInt(paramInt1);
        return true;
      }
    case 5: 
      paramParcel1.enforceInterface("com.iflytek.speech.aidl.ISpeechRecognizer");
      localObject1 = localObject2;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (Intent)Intent.CREATOR.createFromParcel(paramParcel1);
      }
      buildGrammar((Intent)localObject1, GrammarListener.Stub.asInterface(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 6: 
      paramParcel1.enforceInterface("com.iflytek.speech.aidl.ISpeechRecognizer");
      localObject1 = localObject3;
      if (paramParcel1.readInt() != 0) {
        localObject1 = (Intent)Intent.CREATOR.createFromParcel(paramParcel1);
      }
      updateLexicon((Intent)localObject1, LexiconListener.Stub.asInterface(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    }
    paramParcel1.enforceInterface("com.iflytek.speech.aidl.ISpeechRecognizer");
    localObject1 = localObject4;
    if (paramParcel1.readInt() != 0) {
      localObject1 = (Intent)Intent.CREATOR.createFromParcel(paramParcel1);
    }
    writeAudio((Intent)localObject1, paramParcel1.createByteArray(), paramParcel1.readInt(), paramParcel1.readInt());
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\speech\aidl\ISpeechRecognizer$Stub.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */