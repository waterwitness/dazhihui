package com.iflytek.speech;

import android.os.IBinder;
import android.os.Parcel;

class SynthesizeToUrlListener$Stub$Proxy
  implements SynthesizeToUrlListener
{
  private IBinder mRemote;
  
  SynthesizeToUrlListener$Stub$Proxy(IBinder paramIBinder)
  {
    this.mRemote = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.mRemote;
  }
  
  public String getInterfaceDescriptor()
  {
    return "com.iflytek.speech.SynthesizeToUrlListener";
  }
  
  public void onSynthesizeCompleted(String paramString, int paramInt)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.iflytek.speech.SynthesizeToUrlListener");
      localParcel.writeString(paramString);
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\speech\SynthesizeToUrlListener$Stub$Proxy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */