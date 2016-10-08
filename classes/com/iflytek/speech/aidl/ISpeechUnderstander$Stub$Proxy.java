package com.iflytek.speech.aidl;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import com.iflytek.speech.SpeechUnderstanderListener;

class ISpeechUnderstander$Stub$Proxy
  implements ISpeechUnderstander
{
  private IBinder mRemote;
  
  ISpeechUnderstander$Stub$Proxy(IBinder paramIBinder)
  {
    this.mRemote = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.mRemote;
  }
  
  /* Error */
  public void cancel(SpeechUnderstanderListener paramSpeechUnderstanderListener)
  {
    // Byte code:
    //   0: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: aload_2
    //   9: ldc 28
    //   11: invokevirtual 32	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_1
    //   15: ifnull +42 -> 57
    //   18: aload_1
    //   19: invokeinterface 36 1 0
    //   24: astore_1
    //   25: aload_2
    //   26: aload_1
    //   27: invokevirtual 39	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   30: aload_0
    //   31: getfield 15	com/iflytek/speech/aidl/ISpeechUnderstander$Stub$Proxy:mRemote	Landroid/os/IBinder;
    //   34: iconst_3
    //   35: aload_2
    //   36: aload_3
    //   37: iconst_0
    //   38: invokeinterface 45 5 0
    //   43: pop
    //   44: aload_3
    //   45: invokevirtual 48	android/os/Parcel:readException	()V
    //   48: aload_3
    //   49: invokevirtual 51	android/os/Parcel:recycle	()V
    //   52: aload_2
    //   53: invokevirtual 51	android/os/Parcel:recycle	()V
    //   56: return
    //   57: aconst_null
    //   58: astore_1
    //   59: goto -34 -> 25
    //   62: astore_1
    //   63: aload_3
    //   64: invokevirtual 51	android/os/Parcel:recycle	()V
    //   67: aload_2
    //   68: invokevirtual 51	android/os/Parcel:recycle	()V
    //   71: aload_1
    //   72: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	73	0	this	Proxy
    //   0	73	1	paramSpeechUnderstanderListener	SpeechUnderstanderListener
    //   3	65	2	localParcel1	Parcel
    //   7	57	3	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   8	14	62	finally
    //   18	25	62	finally
    //   25	48	62	finally
  }
  
  public String getInterfaceDescriptor()
  {
    return "com.iflytek.speech.aidl.ISpeechUnderstander";
  }
  
  public boolean isUnderstanding()
  {
    boolean bool = false;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.iflytek.speech.aidl.ISpeechUnderstander");
      this.mRemote.transact(4, localParcel1, localParcel2, 0);
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
  
  public void startUnderstanding(Intent paramIntent, SpeechUnderstanderListener paramSpeechUnderstanderListener)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.iflytek.speech.aidl.ISpeechUnderstander");
        if (paramIntent != null)
        {
          localParcel1.writeInt(1);
          paramIntent.writeToParcel(localParcel1, 0);
          if (paramSpeechUnderstanderListener != null)
          {
            paramIntent = paramSpeechUnderstanderListener.asBinder();
            localParcel1.writeStrongBinder(paramIntent);
            this.mRemote.transact(1, localParcel1, localParcel2, 0);
            localParcel2.readException();
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
  public void stopUnderstanding(SpeechUnderstanderListener paramSpeechUnderstanderListener)
  {
    // Byte code:
    //   0: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: aload_2
    //   9: ldc 28
    //   11: invokevirtual 32	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_1
    //   15: ifnull +42 -> 57
    //   18: aload_1
    //   19: invokeinterface 36 1 0
    //   24: astore_1
    //   25: aload_2
    //   26: aload_1
    //   27: invokevirtual 39	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   30: aload_0
    //   31: getfield 15	com/iflytek/speech/aidl/ISpeechUnderstander$Stub$Proxy:mRemote	Landroid/os/IBinder;
    //   34: iconst_2
    //   35: aload_2
    //   36: aload_3
    //   37: iconst_0
    //   38: invokeinterface 45 5 0
    //   43: pop
    //   44: aload_3
    //   45: invokevirtual 48	android/os/Parcel:readException	()V
    //   48: aload_3
    //   49: invokevirtual 51	android/os/Parcel:recycle	()V
    //   52: aload_2
    //   53: invokevirtual 51	android/os/Parcel:recycle	()V
    //   56: return
    //   57: aconst_null
    //   58: astore_1
    //   59: goto -34 -> 25
    //   62: astore_1
    //   63: aload_3
    //   64: invokevirtual 51	android/os/Parcel:recycle	()V
    //   67: aload_2
    //   68: invokevirtual 51	android/os/Parcel:recycle	()V
    //   71: aload_1
    //   72: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	73	0	this	Proxy
    //   0	73	1	paramSpeechUnderstanderListener	SpeechUnderstanderListener
    //   3	65	2	localParcel1	Parcel
    //   7	57	3	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   8	14	62	finally
    //   18	25	62	finally
    //   25	48	62	finally
  }
  
  /* Error */
  public void writeAudio(Intent paramIntent, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 5
    //   5: invokestatic 26	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   8: astore 6
    //   10: aload 5
    //   12: ldc 28
    //   14: invokevirtual 32	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   17: aload_1
    //   18: ifnull +67 -> 85
    //   21: aload 5
    //   23: iconst_1
    //   24: invokevirtual 65	android/os/Parcel:writeInt	(I)V
    //   27: aload_1
    //   28: aload 5
    //   30: iconst_0
    //   31: invokevirtual 71	android/content/Intent:writeToParcel	(Landroid/os/Parcel;I)V
    //   34: aload 5
    //   36: aload_2
    //   37: invokevirtual 78	android/os/Parcel:writeByteArray	([B)V
    //   40: aload 5
    //   42: iload_3
    //   43: invokevirtual 65	android/os/Parcel:writeInt	(I)V
    //   46: aload 5
    //   48: iload 4
    //   50: invokevirtual 65	android/os/Parcel:writeInt	(I)V
    //   53: aload_0
    //   54: getfield 15	com/iflytek/speech/aidl/ISpeechUnderstander$Stub$Proxy:mRemote	Landroid/os/IBinder;
    //   57: iconst_5
    //   58: aload 5
    //   60: aload 6
    //   62: iconst_0
    //   63: invokeinterface 45 5 0
    //   68: pop
    //   69: aload 6
    //   71: invokevirtual 48	android/os/Parcel:readException	()V
    //   74: aload 6
    //   76: invokevirtual 51	android/os/Parcel:recycle	()V
    //   79: aload 5
    //   81: invokevirtual 51	android/os/Parcel:recycle	()V
    //   84: return
    //   85: aload 5
    //   87: iconst_0
    //   88: invokevirtual 65	android/os/Parcel:writeInt	(I)V
    //   91: goto -57 -> 34
    //   94: astore_1
    //   95: aload 6
    //   97: invokevirtual 51	android/os/Parcel:recycle	()V
    //   100: aload 5
    //   102: invokevirtual 51	android/os/Parcel:recycle	()V
    //   105: aload_1
    //   106: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	107	0	this	Proxy
    //   0	107	1	paramIntent	Intent
    //   0	107	2	paramArrayOfByte	byte[]
    //   0	107	3	paramInt1	int
    //   0	107	4	paramInt2	int
    //   3	98	5	localParcel1	Parcel
    //   8	88	6	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   10	17	94	finally
    //   21	34	94	finally
    //   34	74	94	finally
    //   85	91	94	finally
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\speech\aidl\ISpeechUnderstander$Stub$Proxy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */