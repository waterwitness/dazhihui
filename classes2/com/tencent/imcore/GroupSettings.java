package com.tencent.imcore;

public class GroupSettings
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public GroupSettings()
  {
    this(internalJNI.new_GroupSettings(), true);
  }
  
  protected GroupSettings(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(GroupSettings paramGroupSettings)
  {
    if (paramGroupSettings == null) {
      return 0L;
    }
    return paramGroupSettings.swigCPtr;
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
          internalJNI.delete_GroupSettings(this.swigCPtr);
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
  
  public UpdateInfoOpt getGroupInfoOpt()
  {
    long l = internalJNI.GroupSettings_groupInfoOpt_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new UpdateInfoOpt(l, false);
  }
  
  public UpdateInfoOpt getMemberInfoOpt()
  {
    long l = internalJNI.GroupSettings_memberInfoOpt_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new UpdateInfoOpt(l, false);
  }
  
  public boolean getStorageEnabled()
  {
    return internalJNI.GroupSettings_storageEnabled_get(this.swigCPtr, this);
  }
  
  public void setGroupInfoOpt(UpdateInfoOpt paramUpdateInfoOpt)
  {
    internalJNI.GroupSettings_groupInfoOpt_set(this.swigCPtr, this, UpdateInfoOpt.getCPtr(paramUpdateInfoOpt), paramUpdateInfoOpt);
  }
  
  public void setMemberInfoOpt(UpdateInfoOpt paramUpdateInfoOpt)
  {
    internalJNI.GroupSettings_memberInfoOpt_set(this.swigCPtr, this, UpdateInfoOpt.getCPtr(paramUpdateInfoOpt), paramUpdateInfoOpt);
  }
  
  public void setStorageEnabled(boolean paramBoolean)
  {
    internalJNI.GroupSettings_storageEnabled_set(this.swigCPtr, this, paramBoolean);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\GroupSettings.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */