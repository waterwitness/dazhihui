package com.iflytek.speech.aidl;

import android.os.IBinder;
import android.os.Parcel;

class ISpeakerVerifier$Stub$Proxy
  implements ISpeakerVerifier
{
  private IBinder mRemote;
  
  ISpeakerVerifier$Stub$Proxy(IBinder paramIBinder)
  {
    this.mRemote = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.mRemote;
  }
  
  public void endSpeak()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.iflytek.speech.aidl.ISpeakerVerifier");
      this.mRemote.transact(3, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public String getInterfaceDescriptor()
  {
    return "com.iflytek.speech.aidl.ISpeakerVerifier";
  }
  
  public String getParameter(String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.iflytek.speech.aidl.ISpeakerVerifier");
      localParcel1.writeString(paramString);
      this.mRemote.transact(6, localParcel1, localParcel2, 0);
      localParcel2.readException();
      paramString = localParcel2.readString();
      return paramString;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  /* Error */
  public int register(String paramString1, String paramString2, com.iflytek.speech.VerifierListener paramVerifierListener)
  {
    // Byte code:
    //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 4
    //   5: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   8: astore 5
    //   10: aload 4
    //   12: ldc 27
    //   14: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   17: aload 4
    //   19: aload_1
    //   20: invokevirtual 50	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   23: aload 4
    //   25: aload_2
    //   26: invokevirtual 50	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   29: aload_3
    //   30: ifnull +57 -> 87
    //   33: aload_3
    //   34: invokeinterface 59 1 0
    //   39: astore_1
    //   40: aload 4
    //   42: aload_1
    //   43: invokevirtual 62	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   46: aload_0
    //   47: getfield 15	com/iflytek/speech/aidl/ISpeakerVerifier$Stub$Proxy:mRemote	Landroid/os/IBinder;
    //   50: iconst_2
    //   51: aload 4
    //   53: aload 5
    //   55: iconst_0
    //   56: invokeinterface 37 5 0
    //   61: pop
    //   62: aload 5
    //   64: invokevirtual 40	android/os/Parcel:readException	()V
    //   67: aload 5
    //   69: invokevirtual 66	android/os/Parcel:readInt	()I
    //   72: istore 6
    //   74: aload 5
    //   76: invokevirtual 43	android/os/Parcel:recycle	()V
    //   79: aload 4
    //   81: invokevirtual 43	android/os/Parcel:recycle	()V
    //   84: iload 6
    //   86: ireturn
    //   87: aconst_null
    //   88: astore_1
    //   89: goto -49 -> 40
    //   92: astore_1
    //   93: aload 5
    //   95: invokevirtual 43	android/os/Parcel:recycle	()V
    //   98: aload 4
    //   100: invokevirtual 43	android/os/Parcel:recycle	()V
    //   103: aload_1
    //   104: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	105	0	this	Proxy
    //   0	105	1	paramString1	String
    //   0	105	2	paramString2	String
    //   0	105	3	paramVerifierListener	com.iflytek.speech.VerifierListener
    //   3	96	4	localParcel1	Parcel
    //   8	86	5	localParcel2	Parcel
    //   72	13	6	i	int
    // Exception table:
    //   from	to	target	type
    //   10	29	92	finally
    //   33	40	92	finally
    //   40	74	92	finally
  }
  
  public int setParameter(String paramString1, String paramString2)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.iflytek.speech.aidl.ISpeakerVerifier");
      localParcel1.writeString(paramString1);
      localParcel1.writeString(paramString2);
      this.mRemote.transact(5, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      return i;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public void stopSpeak()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.iflytek.speech.aidl.ISpeakerVerifier");
      this.mRemote.transact(4, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  /* Error */
  public int verify(String paramString1, String paramString2, com.iflytek.speech.VerifierListener paramVerifierListener)
  {
    // Byte code:
    //   0: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 4
    //   5: invokestatic 25	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   8: astore 5
    //   10: aload 4
    //   12: ldc 27
    //   14: invokevirtual 31	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   17: aload 4
    //   19: aload_1
    //   20: invokevirtual 50	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   23: aload 4
    //   25: aload_2
    //   26: invokevirtual 50	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   29: aload_3
    //   30: ifnull +57 -> 87
    //   33: aload_3
    //   34: invokeinterface 59 1 0
    //   39: astore_1
    //   40: aload 4
    //   42: aload_1
    //   43: invokevirtual 62	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   46: aload_0
    //   47: getfield 15	com/iflytek/speech/aidl/ISpeakerVerifier$Stub$Proxy:mRemote	Landroid/os/IBinder;
    //   50: iconst_1
    //   51: aload 4
    //   53: aload 5
    //   55: iconst_0
    //   56: invokeinterface 37 5 0
    //   61: pop
    //   62: aload 5
    //   64: invokevirtual 40	android/os/Parcel:readException	()V
    //   67: aload 5
    //   69: invokevirtual 66	android/os/Parcel:readInt	()I
    //   72: istore 6
    //   74: aload 5
    //   76: invokevirtual 43	android/os/Parcel:recycle	()V
    //   79: aload 4
    //   81: invokevirtual 43	android/os/Parcel:recycle	()V
    //   84: iload 6
    //   86: ireturn
    //   87: aconst_null
    //   88: astore_1
    //   89: goto -49 -> 40
    //   92: astore_1
    //   93: aload 5
    //   95: invokevirtual 43	android/os/Parcel:recycle	()V
    //   98: aload 4
    //   100: invokevirtual 43	android/os/Parcel:recycle	()V
    //   103: aload_1
    //   104: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	105	0	this	Proxy
    //   0	105	1	paramString1	String
    //   0	105	2	paramString2	String
    //   0	105	3	paramVerifierListener	com.iflytek.speech.VerifierListener
    //   3	96	4	localParcel1	Parcel
    //   8	86	5	localParcel2	Parcel
    //   72	13	6	i	int
    // Exception table:
    //   from	to	target	type
    //   10	29	92	finally
    //   33	40	92	finally
    //   40	74	92	finally
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\speech\aidl\ISpeakerVerifier$Stub$Proxy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */