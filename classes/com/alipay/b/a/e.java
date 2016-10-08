package com.alipay.b.a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class e
  extends Binder
  implements d
{
  public e()
  {
    attachInterface(this, "com.alipay.android.app.IRemoteServiceCallback");
  }
  
  public static d a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.alipay.android.app.IRemoteServiceCallback");
    if ((localIInterface != null) && ((localIInterface instanceof d))) {
      return (d)localIInterface;
    }
    return new f(paramIBinder);
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 0;
    boolean bool = false;
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.alipay.android.app.IRemoteServiceCallback");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.alipay.android.app.IRemoteServiceCallback");
      String str1 = paramParcel1.readString();
      String str2 = paramParcel1.readString();
      paramInt1 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        a(str1, str2, paramInt1, paramParcel1);
        paramParcel2.writeNoException();
        return true;
      }
    case 2: 
      paramParcel1.enforceInterface("com.alipay.android.app.IRemoteServiceCallback");
      if (paramParcel1.readInt() != 0) {
        bool = true;
      }
      a(bool, paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    }
    paramParcel1.enforceInterface("com.alipay.android.app.IRemoteServiceCallback");
    bool = a();
    paramParcel2.writeNoException();
    paramInt1 = i;
    if (bool) {
      paramInt1 = 1;
    }
    paramParcel2.writeInt(paramInt1);
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\b\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */