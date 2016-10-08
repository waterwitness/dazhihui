package com.android.dazhihui.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class z
  extends Binder
  implements y
{
  public z()
  {
    attachInterface(this, "com.android.dazhihui.service.IDzhServiceCallback");
  }
  
  public static y a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.android.dazhihui.service.IDzhServiceCallback");
    if ((localIInterface != null) && ((localIInterface instanceof y))) {
      return (y)localIInterface;
    }
    return new aa(paramIBinder);
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.android.dazhihui.service.IDzhServiceCallback");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.android.dazhihui.service.IDzhServiceCallback");
      a();
      paramParcel2.writeNoException();
      return true;
    }
    paramParcel1.enforceInterface("com.android.dazhihui.service.IDzhServiceCallback");
    b();
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\service\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */