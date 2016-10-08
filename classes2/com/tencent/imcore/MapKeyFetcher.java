package com.tencent.imcore;

public class MapKeyFetcher
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public MapKeyFetcher()
  {
    this(internalJNI.new_MapKeyFetcher(), true);
  }
  
  protected MapKeyFetcher(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(MapKeyFetcher paramMapKeyFetcher)
  {
    if (paramMapKeyFetcher == null) {
      return 0L;
    }
    return paramMapKeyFetcher.swigCPtr;
  }
  
  public void delete()
  {
    try
    {
      if (this.swigCPtr != 0L)
      {
        if (this.swigCMemOwn)
        {
          this.swigCMemOwn = false;
          internalJNI.delete_MapKeyFetcher(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public void fetchMapKeys(BytesMap paramBytesMap)
  {
    internalJNI.MapKeyFetcher_fetchMapKeys(this.swigCPtr, this, BytesMap.getCPtr(paramBytesMap), paramBytesMap);
  }
  
  protected void finalize()
  {
    delete();
  }
  
  public byte[] getKey(int paramInt)
  {
    return internalJNI.MapKeyFetcher_getKey(this.swigCPtr, this, paramInt);
  }
  
  public BytesVec getKeys()
  {
    long l = internalJNI.MapKeyFetcher_keys_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new BytesVec(l, false);
  }
  
  public byte[] getValue(BytesMap paramBytesMap, int paramInt)
  {
    return internalJNI.MapKeyFetcher_getValue(this.swigCPtr, this, BytesMap.getCPtr(paramBytesMap), paramBytesMap, paramInt);
  }
  
  public void setKeys(BytesVec paramBytesVec)
  {
    internalJNI.MapKeyFetcher_keys_set(this.swigCPtr, this, BytesVec.getCPtr(paramBytesVec), paramBytesVec);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\MapKeyFetcher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */