package com.iflytek.speech.aidl;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import com.iflytek.speech.SynthesizerListener;

class ISpeechSynthesizer$Stub$Proxy
  implements ISpeechSynthesizer
{
  private IBinder mRemote;
  
  ISpeechSynthesizer$Stub$Proxy(IBinder paramIBinder)
  {
    this.mRemote = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.mRemote;
  }
  
  public String getInterfaceDescriptor()
  {
    return "com.iflytek.speech.aidl.ISpeechSynthesizer";
  }
  
  public String getLocalSpeakerList()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.iflytek.speech.aidl.ISpeechSynthesizer");
      this.mRemote.transact(7, localParcel1, localParcel2, 0);
      localParcel2.readException();
      String str = localParcel2.readString();
      return str;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public boolean isSpeaking()
  {
    boolean bool = false;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.iflytek.speech.aidl.ISpeechSynthesizer");
      this.mRemote.transact(6, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      if (i != 0) {
        bool = true;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  /* Error */
  public int pauseSpeaking(SynthesizerListener paramSynthesizerListener)
  {
    // Byte code:
    //   0: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: aload_2
    //   9: ldc 22
    //   11: invokevirtual 33	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_1
    //   15: ifnull +50 -> 65
    //   18: aload_1
    //   19: invokeinterface 60 1 0
    //   24: astore_1
    //   25: aload_2
    //   26: aload_1
    //   27: invokevirtual 63	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   30: aload_0
    //   31: getfield 15	com/iflytek/speech/aidl/ISpeechSynthesizer$Stub$Proxy:mRemote	Landroid/os/IBinder;
    //   34: iconst_3
    //   35: aload_2
    //   36: aload_3
    //   37: iconst_0
    //   38: invokeinterface 39 5 0
    //   43: pop
    //   44: aload_3
    //   45: invokevirtual 42	android/os/Parcel:readException	()V
    //   48: aload_3
    //   49: invokevirtual 54	android/os/Parcel:readInt	()I
    //   52: istore 4
    //   54: aload_3
    //   55: invokevirtual 48	android/os/Parcel:recycle	()V
    //   58: aload_2
    //   59: invokevirtual 48	android/os/Parcel:recycle	()V
    //   62: iload 4
    //   64: ireturn
    //   65: aconst_null
    //   66: astore_1
    //   67: goto -42 -> 25
    //   70: astore_1
    //   71: aload_3
    //   72: invokevirtual 48	android/os/Parcel:recycle	()V
    //   75: aload_2
    //   76: invokevirtual 48	android/os/Parcel:recycle	()V
    //   79: aload_1
    //   80: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	81	0	this	Proxy
    //   0	81	1	paramSynthesizerListener	SynthesizerListener
    //   3	73	2	localParcel1	Parcel
    //   7	65	3	localParcel2	Parcel
    //   52	11	4	i	int
    // Exception table:
    //   from	to	target	type
    //   8	14	70	finally
    //   18	25	70	finally
    //   25	54	70	finally
  }
  
  /* Error */
  public int resumeSpeaking(SynthesizerListener paramSynthesizerListener)
  {
    // Byte code:
    //   0: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: aload_2
    //   9: ldc 22
    //   11: invokevirtual 33	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_1
    //   15: ifnull +50 -> 65
    //   18: aload_1
    //   19: invokeinterface 60 1 0
    //   24: astore_1
    //   25: aload_2
    //   26: aload_1
    //   27: invokevirtual 63	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   30: aload_0
    //   31: getfield 15	com/iflytek/speech/aidl/ISpeechSynthesizer$Stub$Proxy:mRemote	Landroid/os/IBinder;
    //   34: iconst_4
    //   35: aload_2
    //   36: aload_3
    //   37: iconst_0
    //   38: invokeinterface 39 5 0
    //   43: pop
    //   44: aload_3
    //   45: invokevirtual 42	android/os/Parcel:readException	()V
    //   48: aload_3
    //   49: invokevirtual 54	android/os/Parcel:readInt	()I
    //   52: istore 4
    //   54: aload_3
    //   55: invokevirtual 48	android/os/Parcel:recycle	()V
    //   58: aload_2
    //   59: invokevirtual 48	android/os/Parcel:recycle	()V
    //   62: iload 4
    //   64: ireturn
    //   65: aconst_null
    //   66: astore_1
    //   67: goto -42 -> 25
    //   70: astore_1
    //   71: aload_3
    //   72: invokevirtual 48	android/os/Parcel:recycle	()V
    //   75: aload_2
    //   76: invokevirtual 48	android/os/Parcel:recycle	()V
    //   79: aload_1
    //   80: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	81	0	this	Proxy
    //   0	81	1	paramSynthesizerListener	SynthesizerListener
    //   3	73	2	localParcel1	Parcel
    //   7	65	3	localParcel2	Parcel
    //   52	11	4	i	int
    // Exception table:
    //   from	to	target	type
    //   8	14	70	finally
    //   18	25	70	finally
    //   25	54	70	finally
  }
  
  public int startSpeaking(Intent paramIntent, SynthesizerListener paramSynthesizerListener)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.iflytek.speech.aidl.ISpeechSynthesizer");
        if (paramIntent != null)
        {
          localParcel1.writeInt(1);
          paramIntent.writeToParcel(localParcel1, 0);
          if (paramSynthesizerListener != null)
          {
            paramIntent = paramSynthesizerListener.asBinder();
            localParcel1.writeStrongBinder(paramIntent);
            this.mRemote.transact(2, localParcel1, localParcel2, 0);
            localParcel2.readException();
            int i = localParcel2.readInt();
            return i;
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        paramIntent = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  /* Error */
  public int stopSpeaking(SynthesizerListener paramSynthesizerListener)
  {
    // Byte code:
    //   0: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: aload_2
    //   9: ldc 22
    //   11: invokevirtual 33	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_1
    //   15: ifnull +50 -> 65
    //   18: aload_1
    //   19: invokeinterface 60 1 0
    //   24: astore_1
    //   25: aload_2
    //   26: aload_1
    //   27: invokevirtual 63	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   30: aload_0
    //   31: getfield 15	com/iflytek/speech/aidl/ISpeechSynthesizer$Stub$Proxy:mRemote	Landroid/os/IBinder;
    //   34: iconst_5
    //   35: aload_2
    //   36: aload_3
    //   37: iconst_0
    //   38: invokeinterface 39 5 0
    //   43: pop
    //   44: aload_3
    //   45: invokevirtual 42	android/os/Parcel:readException	()V
    //   48: aload_3
    //   49: invokevirtual 54	android/os/Parcel:readInt	()I
    //   52: istore 4
    //   54: aload_3
    //   55: invokevirtual 48	android/os/Parcel:recycle	()V
    //   58: aload_2
    //   59: invokevirtual 48	android/os/Parcel:recycle	()V
    //   62: iload 4
    //   64: ireturn
    //   65: aconst_null
    //   66: astore_1
    //   67: goto -42 -> 25
    //   70: astore_1
    //   71: aload_3
    //   72: invokevirtual 48	android/os/Parcel:recycle	()V
    //   75: aload_2
    //   76: invokevirtual 48	android/os/Parcel:recycle	()V
    //   79: aload_1
    //   80: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	81	0	this	Proxy
    //   0	81	1	paramSynthesizerListener	SynthesizerListener
    //   3	73	2	localParcel1	Parcel
    //   7	65	3	localParcel2	Parcel
    //   52	11	4	i	int
    // Exception table:
    //   from	to	target	type
    //   8	14	70	finally
    //   18	25	70	finally
    //   25	54	70	finally
  }
  
  public int synthesizeToUrl(Intent paramIntent, SynthesizerListener paramSynthesizerListener)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.iflytek.speech.aidl.ISpeechSynthesizer");
        if (paramIntent != null)
        {
          localParcel1.writeInt(1);
          paramIntent.writeToParcel(localParcel1, 0);
          if (paramSynthesizerListener != null)
          {
            paramIntent = paramSynthesizerListener.asBinder();
            localParcel1.writeStrongBinder(paramIntent);
            this.mRemote.transact(1, localParcel1, localParcel2, 0);
            localParcel2.readException();
            int i = localParcel2.readInt();
            return i;
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        paramIntent = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\speech\aidl\ISpeechSynthesizer$Stub$Proxy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */