package com.tencent.qalsdk.base.remote;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

class IBaseService$Stub$a
  implements IBaseService
{
  private IBinder a;
  
  IBaseService$Stub$a(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  public String a()
  {
    return "com.tencent.qalsdk.base.remote.IBaseService";
  }
  
  public IBinder asBinder()
  {
    return this.a;
  }
  
  public FromServiceMsg sendSyncToServiceMsg(ToServiceMsg paramToServiceMsg)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.tencent.qalsdk.base.remote.IBaseService");
        if (paramToServiceMsg != null)
        {
          localParcel1.writeInt(1);
          paramToServiceMsg.writeToParcel(localParcel1, 0);
          this.a.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
          if (localParcel2.readInt() != 0)
          {
            paramToServiceMsg = (FromServiceMsg)FromServiceMsg.CREATOR.createFromParcel(localParcel2);
            return paramToServiceMsg;
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        paramToServiceMsg = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  /* Error */
  public int sendToServiceMsg(ToServiceMsg paramToServiceMsg)
  {
    // Byte code:
    //   0: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: aload_2
    //   9: ldc 19
    //   11: invokevirtual 33	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_1
    //   15: ifnull +49 -> 64
    //   18: aload_2
    //   19: iconst_1
    //   20: invokevirtual 37	android/os/Parcel:writeInt	(I)V
    //   23: aload_1
    //   24: aload_2
    //   25: iconst_0
    //   26: invokevirtual 43	com/tencent/qalsdk/base/remote/ToServiceMsg:writeToParcel	(Landroid/os/Parcel;I)V
    //   29: aload_0
    //   30: getfield 15	com/tencent/qalsdk/base/remote/IBaseService$Stub$a:a	Landroid/os/IBinder;
    //   33: iconst_2
    //   34: aload_2
    //   35: aload_3
    //   36: iconst_0
    //   37: invokeinterface 49 5 0
    //   42: pop
    //   43: aload_3
    //   44: invokevirtual 52	android/os/Parcel:readException	()V
    //   47: aload_3
    //   48: invokevirtual 56	android/os/Parcel:readInt	()I
    //   51: istore 4
    //   53: aload_3
    //   54: invokevirtual 71	android/os/Parcel:recycle	()V
    //   57: aload_2
    //   58: invokevirtual 71	android/os/Parcel:recycle	()V
    //   61: iload 4
    //   63: ireturn
    //   64: aload_2
    //   65: iconst_0
    //   66: invokevirtual 37	android/os/Parcel:writeInt	(I)V
    //   69: goto -40 -> 29
    //   72: astore_1
    //   73: aload_3
    //   74: invokevirtual 71	android/os/Parcel:recycle	()V
    //   77: aload_2
    //   78: invokevirtual 71	android/os/Parcel:recycle	()V
    //   81: aload_1
    //   82: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	83	0	this	a
    //   0	83	1	paramToServiceMsg	ToServiceMsg
    //   3	75	2	localParcel1	Parcel
    //   7	67	3	localParcel2	Parcel
    //   51	11	4	i	int
    // Exception table:
    //   from	to	target	type
    //   8	14	72	finally
    //   18	29	72	finally
    //   29	53	72	finally
    //   64	69	72	finally
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\qalsdk\base\remote\IBaseService$Stub$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */