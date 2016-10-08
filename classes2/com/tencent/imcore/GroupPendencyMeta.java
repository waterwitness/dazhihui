package com.tencent.imcore;

public class GroupPendencyMeta
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public GroupPendencyMeta()
  {
    this(internalJNI.new_GroupPendencyMeta(), true);
  }
  
  protected GroupPendencyMeta(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(GroupPendencyMeta paramGroupPendencyMeta)
  {
    if (paramGroupPendencyMeta == null) {
      return 0L;
    }
    return paramGroupPendencyMeta.swigCPtr;
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
          internalJNI.delete_GroupPendencyMeta(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  protected void finalize()
  {
    delete();
  }
  
  public long getNext_start_time()
  {
    return internalJNI.GroupPendencyMeta_next_start_time_get(this.swigCPtr, this);
  }
  
  public long getRead_time_seq()
  {
    return internalJNI.GroupPendencyMeta_read_time_seq_get(this.swigCPtr, this);
  }
  
  public long getUnread_num()
  {
    return internalJNI.GroupPendencyMeta_unread_num_get(this.swigCPtr, this);
  }
  
  public void setNext_start_time(long paramLong)
  {
    internalJNI.GroupPendencyMeta_next_start_time_set(this.swigCPtr, this, paramLong);
  }
  
  public void setRead_time_seq(long paramLong)
  {
    internalJNI.GroupPendencyMeta_read_time_seq_set(this.swigCPtr, this, paramLong);
  }
  
  public void setUnread_num(long paramLong)
  {
    internalJNI.GroupPendencyMeta_unread_num_set(this.swigCPtr, this, paramLong);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\GroupPendencyMeta.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */