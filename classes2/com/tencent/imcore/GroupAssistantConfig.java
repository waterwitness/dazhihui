package com.tencent.imcore;

public class GroupAssistantConfig
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public GroupAssistantConfig()
  {
    this(internalJNI.new_GroupAssistantConfig(), true);
  }
  
  protected GroupAssistantConfig(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(GroupAssistantConfig paramGroupAssistantConfig)
  {
    if (paramGroupAssistantConfig == null) {
      return 0L;
    }
    return paramGroupAssistantConfig.swigCPtr;
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
          internalJNI.delete_GroupAssistantConfig(this.swigCPtr);
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
  
  public IGroupAssistantCallback getCallback()
  {
    long l = internalJNI.GroupAssistantConfig_callback_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new IGroupAssistantCallback(l, false);
  }
  
  public GroupSettings getSettings()
  {
    long l = internalJNI.GroupAssistantConfig_settings_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new GroupSettings(l, false);
  }
  
  public void setCallback(IGroupAssistantCallback paramIGroupAssistantCallback)
  {
    internalJNI.GroupAssistantConfig_callback_set(this.swigCPtr, this, IGroupAssistantCallback.getCPtr(paramIGroupAssistantCallback), paramIGroupAssistantCallback);
  }
  
  public void setSettings(GroupSettings paramGroupSettings)
  {
    internalJNI.GroupAssistantConfig_settings_set(this.swigCPtr, this, GroupSettings.getCPtr(paramGroupSettings), paramGroupSettings);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\GroupAssistantConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */