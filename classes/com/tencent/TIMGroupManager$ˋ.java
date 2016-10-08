package com.tencent;

import android.os.Handler;
import com.tencent.imcore.GroupMemberInfoVec;
import com.tencent.imcore.IGroupMemberCallback;
import com.tencent.imsdk.IMMsfCoreProxy;
import java.util.ArrayList;
import java.util.List;

abstract class TIMGroupManager$ˋ<T>
  extends IGroupMemberCallback
{
  public TIMValueCallBack<T> a;
  
  public TIMGroupManager$ˋ(TIMValueCallBack<T> paramTIMValueCallBack)
  {
    swigReleaseOwnership();
    TIMValueCallBack localTIMValueCallBack;
    this.a = localTIMValueCallBack;
  }
  
  public abstract void a(int paramInt, String paramString);
  
  public abstract void a(List<TIMGroupSelfInfo> paramList);
  
  public void done(GroupMemberInfoVec paramGroupMemberInfoVec)
  {
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < paramGroupMemberInfoVec.size())
    {
      localArrayList.add(new TIMGroupSelfInfo(paramGroupMemberInfoVec.get(i)));
      i += 1;
    }
    IMMsfCoreProxy.mainHandler.post(new ˆʿ(this, localArrayList));
    swigTakeOwnership();
  }
  
  public void fail(int paramInt, String paramString)
  {
    IMMsfCoreProxy.mainHandler.post(new ˆˈ(this, paramInt, paramString));
    swigTakeOwnership();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMGroupManager$ˋ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */