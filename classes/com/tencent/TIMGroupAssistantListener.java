package com.tencent;

import java.util.List;

public abstract interface TIMGroupAssistantListener
{
  public abstract void onGroupAdd(TIMGroupCacheInfo paramTIMGroupCacheInfo);
  
  public abstract void onGroupDelete(String paramString);
  
  public abstract void onGroupUpdate(TIMGroupCacheInfo paramTIMGroupCacheInfo);
  
  public abstract void onMemberJoin(String paramString, List<TIMGroupMemberInfo> paramList);
  
  public abstract void onMemberQuit(String paramString, List<String> paramList);
  
  public abstract void onMemberUpdate(String paramString, List<TIMGroupMemberInfo> paramList);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMGroupAssistantListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */