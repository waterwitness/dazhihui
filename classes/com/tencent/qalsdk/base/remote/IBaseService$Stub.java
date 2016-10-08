package com.tencent.qalsdk.base.remote;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class IBaseService$Stub
  extends Binder
  implements IBaseService
{
  private static final String DESCRIPTOR = "com.tencent.qalsdk.base.remote.IBaseService";
  static final int TRANSACTION_sendSyncToServiceMsg = 1;
  static final int TRANSACTION_sendToServiceMsg = 2;
  
  public IBaseService$Stub()
  {
    attachInterface(this, "com.tencent.qalsdk.base.remote.IBaseService");
  }
  
  public static IBaseService asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.qalsdk.base.remote.IBaseService");
    if ((localIInterface != null) && ((localIInterface instanceof IBaseService))) {
      return (IBaseService)localIInterface;
    }
    return new IBaseService.Stub.a(paramIBinder);
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Object localObject2 = null;
    Object localObject1 = null;
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.tencent.qalsdk.base.remote.IBaseService");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.tencent.qalsdk.base.remote.IBaseService");
      if (paramParcel1.readInt() != 0) {
        localObject1 = (ToServiceMsg)ToServiceMsg.CREATOR.createFromParcel(paramParcel1);
      }
      paramParcel1 = sendSyncToServiceMsg((ToServiceMsg)localObject1);
      paramParcel2.writeNoException();
      if (paramParcel1 != null)
      {
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
      }
      for (;;)
      {
        return true;
        paramParcel2.writeInt(0);
      }
    }
    paramParcel1.enforceInterface("com.tencent.qalsdk.base.remote.IBaseService");
    localObject1 = localObject2;
    if (paramParcel1.readInt() != 0) {
      localObject1 = (ToServiceMsg)ToServiceMsg.CREATOR.createFromParcel(paramParcel1);
    }
    paramInt1 = sendToServiceMsg((ToServiceMsg)localObject1);
    paramParcel2.writeNoException();
    paramParcel2.writeInt(paramInt1);
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\qalsdk\base\remote\IBaseService$Stub.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */