package com.tencent.imcore;

public class GroupTipsElem_GroupInfo
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public GroupTipsElem_GroupInfo()
  {
    this(internalJNI.new_GroupTipsElem_GroupInfo(), true);
  }
  
  protected GroupTipsElem_GroupInfo(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(GroupTipsElem_GroupInfo paramGroupTipsElem_GroupInfo)
  {
    if (paramGroupTipsElem_GroupInfo == null) {
      return 0L;
    }
    return paramGroupTipsElem_GroupInfo.swigCPtr;
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
          internalJNI.delete_GroupTipsElem_GroupInfo(this.swigCPtr);
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
  
  public GroupInfoChangeType getType()
  {
    return GroupInfoChangeType.swigToEnum(internalJNI.GroupTipsElem_GroupInfo_type_get(this.swigCPtr, this));
  }
  
  public byte[] getValue()
  {
    return internalJNI.GroupTipsElem_GroupInfo_value_get(this.swigCPtr, this);
  }
  
  public void setType(GroupInfoChangeType paramGroupInfoChangeType)
  {
    internalJNI.GroupTipsElem_GroupInfo_type_set(this.swigCPtr, this, paramGroupInfoChangeType.swigValue());
  }
  
  public void setValue(byte[] paramArrayOfByte)
  {
    internalJNI.GroupTipsElem_GroupInfo_value_set(this.swigCPtr, this, paramArrayOfByte);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\GroupTipsElem_GroupInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */