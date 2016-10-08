package com.iflytek.speech;

import android.os.IBinder;
import android.os.Parcel;

class GrammarListener$Stub$Proxy
  implements GrammarListener
{
  private IBinder mRemote;
  
  GrammarListener$Stub$Proxy(IBinder paramIBinder)
  {
    this.mRemote = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.mRemote;
  }
  
  public String getInterfaceDescriptor()
  {
    return "com.iflytek.speech.GrammarListener";
  }
  
  public void onBuildFinish(String paramString, int paramInt)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.iflytek.speech.GrammarListener");
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\speech\GrammarListener$Stub$Proxy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */