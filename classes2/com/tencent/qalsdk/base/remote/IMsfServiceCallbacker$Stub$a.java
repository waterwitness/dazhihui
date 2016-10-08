package com.tencent.qalsdk.base.remote;

import android.os.IBinder;
import android.os.Parcel;

class IMsfServiceCallbacker$Stub$a
  implements IMsfServiceCallbacker
{
  private IBinder a;
  
  IMsfServiceCallbacker$Stub$a(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  public String a()
  {
    return "com.tencent.qalsdk.base.remote.IMsfServiceCallbacker";
  }
  
  public IBinder asBinder()
  {
    return this.a;
  }
  
  /* Error */
  public void onRecvPushResp(FromServiceMsg paramFromServiceMsg)
  {
    // Byte code:
    //   0: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: aload_2
    //   5: ldc 19
    //   7: invokevirtual 33	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   10: aload_1
    //   11: ifnull +33 -> 44
    //   14: aload_2
    //   15: iconst_1
    //   16: invokevirtual 37	android/os/Parcel:writeInt	(I)V
    //   19: aload_1
    //   20: aload_2
    //   21: iconst_0
    //   22: invokevirtual 43	com/tencent/qalsdk/base/remote/FromServiceMsg:writeToParcel	(Landroid/os/Parcel;I)V
    //   25: aload_0
    //   26: getfield 15	com/tencent/qalsdk/base/remote/IMsfServiceCallbacker$Stub$a:a	Landroid/os/IBinder;
    //   29: iconst_2
    //   30: aload_2
    //   31: aconst_null
    //   32: iconst_1
    //   33: invokeinterface 49 5 0
    //   38: pop
    //   39: aload_2
    //   40: invokevirtual 52	android/os/Parcel:recycle	()V
    //   43: return
    //   44: aload_2
    //   45: iconst_0
    //   46: invokevirtual 37	android/os/Parcel:writeInt	(I)V
    //   49: goto -24 -> 25
    //   52: astore_1
    //   53: aload_2
    //   54: invokevirtual 52	android/os/Parcel:recycle	()V
    //   57: aload_1
    //   58: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	59	0	this	a
    //   0	59	1	paramFromServiceMsg	FromServiceMsg
    //   3	51	2	localParcel	Parcel
    // Exception table:
    //   from	to	target	type
    //   4	10	52	finally
    //   14	25	52	finally
    //   25	39	52	finally
    //   44	49	52	finally
  }
  
  public void onResponse(ToServiceMsg paramToServiceMsg, FromServiceMsg paramFromServiceMsg)
  {
    Parcel localParcel = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel.writeInterfaceToken("com.tencent.qalsdk.base.remote.IMsfServiceCallbacker");
        if (paramToServiceMsg != null)
        {
          localParcel.writeInt(1);
          paramToServiceMsg.writeToParcel(localParcel, 0);
          if (paramFromServiceMsg != null)
          {
            localParcel.writeInt(1);
            paramFromServiceMsg.writeToParcel(localParcel, 0);
            this.a.transact(1, localParcel, null, 1);
          }
        }
        else
        {
          localParcel.writeInt(0);
          continue;
        }
        localParcel.writeInt(0);
      }
      finally
      {
        localParcel.recycle();
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\base\remote\IMsfServiceCallbacker$Stub$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */