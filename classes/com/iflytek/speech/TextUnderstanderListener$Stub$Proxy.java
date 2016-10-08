package com.iflytek.speech;

import android.os.IBinder;
import android.os.Parcel;

class TextUnderstanderListener$Stub$Proxy
  implements TextUnderstanderListener
{
  private IBinder mRemote;
  
  TextUnderstanderListener$Stub$Proxy(IBinder paramIBinder)
  {
    this.mRemote = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.mRemote;
  }
  
  public String getInterfaceDescriptor()
  {
    return "com.iflytek.speech.TextUnderstanderListener";
  }
  
  public void onError(int paramInt)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.iflytek.speech.TextUnderstanderListener");
      localParcel.writeInt(paramInt);
      this.mRemote.transact(2, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  /* Error */
  public void onResult(UnderstanderResult paramUnderstanderResult)
  {
    // Byte code:
    //   0: invokestatic 30	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: aload_2
    //   5: ldc 22
    //   7: invokevirtual 34	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   10: aload_1
    //   11: ifnull +33 -> 44
    //   14: aload_2
    //   15: iconst_1
    //   16: invokevirtual 37	android/os/Parcel:writeInt	(I)V
    //   19: aload_1
    //   20: aload_2
    //   21: iconst_0
    //   22: invokevirtual 54	com/iflytek/speech/UnderstanderResult:writeToParcel	(Landroid/os/Parcel;I)V
    //   25: aload_0
    //   26: getfield 15	com/iflytek/speech/TextUnderstanderListener$Stub$Proxy:mRemote	Landroid/os/IBinder;
    //   29: iconst_1
    //   30: aload_2
    //   31: aconst_null
    //   32: iconst_1
    //   33: invokeinterface 43 5 0
    //   38: pop
    //   39: aload_2
    //   40: invokevirtual 46	android/os/Parcel:recycle	()V
    //   43: return
    //   44: aload_2
    //   45: iconst_0
    //   46: invokevirtual 37	android/os/Parcel:writeInt	(I)V
    //   49: goto -24 -> 25
    //   52: astore_1
    //   53: aload_2
    //   54: invokevirtual 46	android/os/Parcel:recycle	()V
    //   57: aload_1
    //   58: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	59	0	this	Proxy
    //   0	59	1	paramUnderstanderResult	UnderstanderResult
    //   3	51	2	localParcel	Parcel
    // Exception table:
    //   from	to	target	type
    //   4	10	52	finally
    //   14	25	52	finally
    //   25	39	52	finally
    //   44	49	52	finally
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\speech\TextUnderstanderListener$Stub$Proxy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */