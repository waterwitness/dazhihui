package com.iflytek.speech;

import android.os.IBinder;
import android.os.Parcel;

class VerifierListener$Stub$Proxy
  implements VerifierListener
{
  private IBinder mRemote;
  
  VerifierListener$Stub$Proxy(IBinder paramIBinder)
  {
    this.mRemote = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.mRemote;
  }
  
  public String getInterfaceDescriptor()
  {
    return "com.iflytek.speech.VerifierListener";
  }
  
  public void onBeginOfSpeech()
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.iflytek.speech.VerifierListener");
      this.mRemote.transact(2, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void onCancel()
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.iflytek.speech.VerifierListener");
      this.mRemote.transact(6, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  /* Error */
  public void onEnd(VerifierResult paramVerifierResult, int paramInt)
  {
    // Byte code:
    //   0: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_3
    //   4: aload_3
    //   5: ldc 22
    //   7: invokevirtual 33	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   10: aload_1
    //   11: ifnull +38 -> 49
    //   14: aload_3
    //   15: iconst_1
    //   16: invokevirtual 49	android/os/Parcel:writeInt	(I)V
    //   19: aload_1
    //   20: aload_3
    //   21: iconst_0
    //   22: invokevirtual 55	com/iflytek/speech/VerifierResult:writeToParcel	(Landroid/os/Parcel;I)V
    //   25: aload_3
    //   26: iload_2
    //   27: invokevirtual 49	android/os/Parcel:writeInt	(I)V
    //   30: aload_0
    //   31: getfield 15	com/iflytek/speech/VerifierListener$Stub$Proxy:mRemote	Landroid/os/IBinder;
    //   34: iconst_5
    //   35: aload_3
    //   36: aconst_null
    //   37: iconst_1
    //   38: invokeinterface 39 5 0
    //   43: pop
    //   44: aload_3
    //   45: invokevirtual 42	android/os/Parcel:recycle	()V
    //   48: return
    //   49: aload_3
    //   50: iconst_0
    //   51: invokevirtual 49	android/os/Parcel:writeInt	(I)V
    //   54: goto -29 -> 25
    //   57: astore_1
    //   58: aload_3
    //   59: invokevirtual 42	android/os/Parcel:recycle	()V
    //   62: aload_1
    //   63: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	64	0	this	Proxy
    //   0	64	1	paramVerifierResult	VerifierResult
    //   0	64	2	paramInt	int
    //   3	56	3	localParcel	Parcel
    // Exception table:
    //   from	to	target	type
    //   4	10	57	finally
    //   14	25	57	finally
    //   25	44	57	finally
    //   49	54	57	finally
  }
  
  public void onEndOfSpeech()
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.iflytek.speech.VerifierListener");
      this.mRemote.transact(3, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void onError(int paramInt)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.iflytek.speech.VerifierListener");
      localParcel.writeInt(paramInt);
      this.mRemote.transact(7, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  /* Error */
  public void onRegister(VerifierResult paramVerifierResult)
  {
    // Byte code:
    //   0: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: aload_2
    //   5: ldc 22
    //   7: invokevirtual 33	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   10: aload_1
    //   11: ifnull +33 -> 44
    //   14: aload_2
    //   15: iconst_1
    //   16: invokevirtual 49	android/os/Parcel:writeInt	(I)V
    //   19: aload_1
    //   20: aload_2
    //   21: iconst_0
    //   22: invokevirtual 55	com/iflytek/speech/VerifierResult:writeToParcel	(Landroid/os/Parcel;I)V
    //   25: aload_0
    //   26: getfield 15	com/iflytek/speech/VerifierListener$Stub$Proxy:mRemote	Landroid/os/IBinder;
    //   29: iconst_4
    //   30: aload_2
    //   31: aconst_null
    //   32: iconst_1
    //   33: invokeinterface 39 5 0
    //   38: pop
    //   39: aload_2
    //   40: invokevirtual 42	android/os/Parcel:recycle	()V
    //   43: return
    //   44: aload_2
    //   45: iconst_0
    //   46: invokevirtual 49	android/os/Parcel:writeInt	(I)V
    //   49: goto -24 -> 25
    //   52: astore_1
    //   53: aload_2
    //   54: invokevirtual 42	android/os/Parcel:recycle	()V
    //   57: aload_1
    //   58: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	59	0	this	Proxy
    //   0	59	1	paramVerifierResult	VerifierResult
    //   3	51	2	localParcel	Parcel
    // Exception table:
    //   from	to	target	type
    //   4	10	52	finally
    //   14	25	52	finally
    //   25	39	52	finally
    //   44	49	52	finally
  }
  
  public void onVolumeChanged(int paramInt)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.iflytek.speech.VerifierListener");
      localParcel.writeInt(paramInt);
      this.mRemote.transact(1, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\speech\VerifierListener$Stub$Proxy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */