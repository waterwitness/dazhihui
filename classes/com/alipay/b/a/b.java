package com.alipay.b.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class b
  extends Binder
  implements a
{
  public static a a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.alipay.android.app.IAlixPay");
    if ((localIInterface != null) && ((localIInterface instanceof a))) {
      return (a)localIInterface;
    }
    return new c(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.alipay.android.app.IAlixPay");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.alipay.android.app.IAlixPay");
      paramParcel1 = a(paramParcel1.readString());
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.alipay.android.app.IAlixPay");
      paramParcel1 = a();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.alipay.android.app.IAlixPay");
      a(e.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.alipay.android.app.IAlixPay");
      b(e.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    }
    paramParcel1.enforceInterface("com.alipay.android.app.IAlixPay");
    paramParcel1 = b(paramParcel1.readString());
    paramParcel2.writeNoException();
    paramParcel2.writeString(paramParcel1);
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\b\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */