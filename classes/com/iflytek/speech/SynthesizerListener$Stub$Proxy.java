package com.iflytek.speech;

import android.os.IBinder;
import android.os.Parcel;

class SynthesizerListener$Stub$Proxy
  implements SynthesizerListener
{
  private IBinder mRemote;
  
  SynthesizerListener$Stub$Proxy(IBinder paramIBinder)
  {
    this.mRemote = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.mRemote;
  }
  
  public String getInterfaceDescriptor()
  {
    return "com.iflytek.speech.SynthesizerListener";
  }
  
  public void onBufferProgress(int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.iflytek.speech.SynthesizerListener");
      localParcel.writeInt(paramInt1);
      localParcel.writeInt(paramInt2);
      localParcel.writeInt(paramInt3);
      localParcel.writeString(paramString);
      this.mRemote.transact(6, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void onCompleted(int paramInt)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.iflytek.speech.SynthesizerListener");
      localParcel.writeInt(paramInt);
      this.mRemote.transact(4, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  /* Error */
  public void onEvent(int paramInt1, int paramInt2, int paramInt3, android.os.Bundle paramBundle)
  {
    // Byte code:
    //   0: invokestatic 30	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 5
    //   5: aload 5
    //   7: ldc 22
    //   9: invokevirtual 34	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   12: aload 5
    //   14: iload_1
    //   15: invokevirtual 38	android/os/Parcel:writeInt	(I)V
    //   18: aload 5
    //   20: iload_2
    //   21: invokevirtual 38	android/os/Parcel:writeInt	(I)V
    //   24: aload 5
    //   26: iload_3
    //   27: invokevirtual 38	android/os/Parcel:writeInt	(I)V
    //   30: aload 4
    //   32: ifnull +39 -> 71
    //   35: aload 5
    //   37: iconst_1
    //   38: invokevirtual 38	android/os/Parcel:writeInt	(I)V
    //   41: aload 4
    //   43: aload 5
    //   45: iconst_0
    //   46: invokevirtual 59	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
    //   49: aload_0
    //   50: getfield 15	com/iflytek/speech/SynthesizerListener$Stub$Proxy:mRemote	Landroid/os/IBinder;
    //   53: bipush 7
    //   55: aload 5
    //   57: aconst_null
    //   58: iconst_1
    //   59: invokeinterface 47 5 0
    //   64: pop
    //   65: aload 5
    //   67: invokevirtual 50	android/os/Parcel:recycle	()V
    //   70: return
    //   71: aload 5
    //   73: iconst_0
    //   74: invokevirtual 38	android/os/Parcel:writeInt	(I)V
    //   77: goto -28 -> 49
    //   80: astore 4
    //   82: aload 5
    //   84: invokevirtual 50	android/os/Parcel:recycle	()V
    //   87: aload 4
    //   89: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	90	0	this	Proxy
    //   0	90	1	paramInt1	int
    //   0	90	2	paramInt2	int
    //   0	90	3	paramInt3	int
    //   0	90	4	paramBundle	android.os.Bundle
    //   3	80	5	localParcel	Parcel
    // Exception table:
    //   from	to	target	type
    //   5	30	80	finally
    //   35	49	80	finally
    //   49	65	80	finally
    //   71	77	80	finally
  }
  
  public void onSpeakBegin()
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.iflytek.speech.SynthesizerListener");
      this.mRemote.transact(1, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void onSpeakPaused()
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.iflytek.speech.SynthesizerListener");
      this.mRemote.transact(2, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void onSpeakProgress(int paramInt1, int paramInt2, int paramInt3)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.iflytek.speech.SynthesizerListener");
      localParcel.writeInt(paramInt1);
      localParcel.writeInt(paramInt2);
      localParcel.writeInt(paramInt3);
      this.mRemote.transact(5, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void onSpeakResumed()
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.iflytek.speech.SynthesizerListener");
      this.mRemote.transact(3, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\speech\SynthesizerListener$Stub$Proxy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */