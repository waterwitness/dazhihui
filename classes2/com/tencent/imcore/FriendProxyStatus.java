package com.tencent.imcore;

public final class FriendProxyStatus
{
  public static final FriendProxyStatus kFriendProxyStatusNone = new FriendProxyStatus("kFriendProxyStatusNone", internalJNI.kFriendProxyStatusNone_get());
  public static final FriendProxyStatus kFriendProxyStatusSyncFailed;
  public static final FriendProxyStatus kFriendProxyStatusSynced;
  public static final FriendProxyStatus kFriendProxyStatusSyncing = new FriendProxyStatus("kFriendProxyStatusSyncing", internalJNI.kFriendProxyStatusSyncing_get());
  private static int swigNext = 0;
  private static FriendProxyStatus[] swigValues;
  private final String swigName;
  private final int swigValue;
  
  static
  {
    kFriendProxyStatusSynced = new FriendProxyStatus("kFriendProxyStatusSynced", internalJNI.kFriendProxyStatusSynced_get());
    kFriendProxyStatusSyncFailed = new FriendProxyStatus("kFriendProxyStatusSyncFailed", internalJNI.kFriendProxyStatusSyncFailed_get());
    swigValues = new FriendProxyStatus[] { kFriendProxyStatusNone, kFriendProxyStatusSyncing, kFriendProxyStatusSynced, kFriendProxyStatusSyncFailed };
  }
  
  private FriendProxyStatus(String paramString)
  {
    this.swigName = paramString;
    int i = swigNext;
    swigNext = i + 1;
    this.swigValue = i;
  }
  
  private FriendProxyStatus(String paramString, int paramInt)
  {
    this.swigName = paramString;
    this.swigValue = paramInt;
    swigNext = paramInt + 1;
  }
  
  private FriendProxyStatus(String paramString, FriendProxyStatus paramFriendProxyStatus)
  {
    this.swigName = paramString;
    this.swigValue = paramFriendProxyStatus.swigValue;
    swigNext = this.swigValue + 1;
  }
  
  public static FriendProxyStatus swigToEnum(int paramInt)
  {
    if ((paramInt < swigValues.length) && (paramInt >= 0) && (swigValues[paramInt].swigValue == paramInt)) {
      return swigValues[paramInt];
    }
    int i = 0;
    while (i < swigValues.length)
    {
      if (swigValues[i].swigValue == paramInt) {
        return swigValues[i];
      }
      i += 1;
    }
    throw new IllegalArgumentException("No enum " + FriendProxyStatus.class + " with value " + paramInt);
  }
  
  public final int swigValue()
  {
    return this.swigValue;
  }
  
  public final String toString()
  {
    return this.swigName;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\FriendProxyStatus.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */