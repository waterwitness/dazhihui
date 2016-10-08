package com.tencent;

import android.os.Handler;
import com.tencent.imcore.GroupCacheInfo;
import com.tencent.imcore.GroupMemberInfoVec;
import com.tencent.imcore.IGroupAssistantCallback;
import com.tencent.imcore.StrVec;
import com.tencent.imsdk.IMMsfCoreProxy;
import java.util.ArrayList;
import java.util.List;

public class IMCoreGroupAssistantCallback
  extends IGroupAssistantCallback
{
  private String identifier;
  
  public IMCoreGroupAssistantCallback(String paramString)
  {
    this.identifier = paramString;
    swigReleaseOwnership();
  }
  
  public void onGroupAdd(GroupCacheInfo paramGroupCacheInfo)
  {
    if (paramGroupCacheInfo == null) {}
    TIMGroupAssistantListener localTIMGroupAssistantListener;
    do
    {
      return;
      localTIMGroupAssistantListener = TIMManager.getInstanceById(this.identifier).getGroupAssistantListener();
    } while (localTIMGroupAssistantListener == null);
    paramGroupCacheInfo = new TIMGroupCacheInfo(paramGroupCacheInfo);
    IMMsfCoreProxy.mainHandler.post(new י(this, localTIMGroupAssistantListener, paramGroupCacheInfo));
  }
  
  public void onGroupDelete(String paramString)
  {
    if (paramString == null) {}
    TIMGroupAssistantListener localTIMGroupAssistantListener;
    do
    {
      return;
      localTIMGroupAssistantListener = TIMManager.getInstanceById(this.identifier).getGroupAssistantListener();
    } while (localTIMGroupAssistantListener == null);
    IMMsfCoreProxy.mainHandler.post(new ـ(this, localTIMGroupAssistantListener, paramString));
  }
  
  public void onGroupUpdate(GroupCacheInfo paramGroupCacheInfo)
  {
    if (paramGroupCacheInfo == null) {}
    TIMGroupAssistantListener localTIMGroupAssistantListener;
    do
    {
      return;
      localTIMGroupAssistantListener = TIMManager.getInstanceById(this.identifier).getGroupAssistantListener();
    } while (localTIMGroupAssistantListener == null);
    paramGroupCacheInfo = new TIMGroupCacheInfo(paramGroupCacheInfo);
    IMMsfCoreProxy.mainHandler.post(new ٴ(this, localTIMGroupAssistantListener, paramGroupCacheInfo));
  }
  
  public void onMemberJoin(String paramString, GroupMemberInfoVec paramGroupMemberInfoVec)
  {
    if ((paramString == null) || (paramGroupMemberInfoVec == null)) {}
    long l;
    TIMGroupAssistantListener localTIMGroupAssistantListener;
    do
    {
      do
      {
        return;
        l = paramGroupMemberInfoVec.size();
      } while (l <= 0L);
      localTIMGroupAssistantListener = TIMManager.getInstanceById(this.identifier).getGroupAssistantListener();
    } while (localTIMGroupAssistantListener == null);
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < l)
    {
      localArrayList.add(new TIMGroupMemberInfo(paramGroupMemberInfoVec.get(i)));
      i += 1;
    }
    IMMsfCoreProxy.mainHandler.post(new ˎ(this, localTIMGroupAssistantListener, paramString, localArrayList));
  }
  
  public void onMemberQuit(String paramString, StrVec paramStrVec)
  {
    if ((paramString == null) || (paramStrVec == null)) {}
    long l;
    TIMGroupAssistantListener localTIMGroupAssistantListener;
    do
    {
      do
      {
        return;
        l = paramStrVec.size();
      } while (l <= 0L);
      localTIMGroupAssistantListener = TIMManager.getInstanceById(this.identifier).getGroupAssistantListener();
    } while (localTIMGroupAssistantListener == null);
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < l)
    {
      localArrayList.add(paramStrVec.get(i));
      i += 1;
    }
    IMMsfCoreProxy.mainHandler.post(new ˏ(this, localTIMGroupAssistantListener, paramString, localArrayList));
  }
  
  public void onMemberUpdate(String paramString, GroupMemberInfoVec paramGroupMemberInfoVec)
  {
    if ((paramString == null) || (paramGroupMemberInfoVec == null)) {}
    long l;
    TIMGroupAssistantListener localTIMGroupAssistantListener;
    do
    {
      do
      {
        return;
        l = paramGroupMemberInfoVec.size();
      } while (l <= 0L);
      localTIMGroupAssistantListener = TIMManager.getInstanceById(this.identifier).getGroupAssistantListener();
    } while (localTIMGroupAssistantListener == null);
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < l)
    {
      localArrayList.add(new TIMGroupMemberInfo(paramGroupMemberInfoVec.get(i)));
      i += 1;
    }
    IMMsfCoreProxy.mainHandler.post(new ˑ(this, localTIMGroupAssistantListener, paramString, localArrayList));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\IMCoreGroupAssistantCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */