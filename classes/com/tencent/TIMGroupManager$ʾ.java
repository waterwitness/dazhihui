package com.tencent;

import android.os.Handler;
import com.tencent.imcore.GroupMemberInfoVec;
import com.tencent.imcore.IGroupMemberCallback;
import com.tencent.imsdk.IMMsfCoreProxy;
import java.util.ArrayList;
import java.util.List;

abstract class TIMGroupManager$ʾ
  extends IGroupMemberCallback
{
  public TIMValueCallBack<List<TIMGroupMemberInfo>> a;
  
  public TIMGroupManager$ʾ(TIMValueCallBack<List<TIMGroupMemberInfo>> paramTIMValueCallBack)
  {
    swigReleaseOwnership();
    TIMValueCallBack localTIMValueCallBack;
    this.a = localTIMValueCallBack;
  }
  
  public abstract void a(int paramInt, String paramString);
  
  public abstract void a(List<TIMGroupMemberInfo> paramList);
  
  public void done(GroupMemberInfoVec paramGroupMemberInfoVec)
  {
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < paramGroupMemberInfoVec.size())
    {
      localArrayList.add(new TIMGroupMemberInfo(paramGroupMemberInfoVec.get(i)));
      i += 1;
    }
    IMMsfCoreProxy.mainHandler.post(new ʿᵔ(this, localArrayList));
    swigTakeOwnership();
  }
  
  public void fail(int paramInt, String paramString)
  {
    IMMsfCoreProxy.mainHandler.post(new ʿᵢ(this, paramInt, paramString));
    swigTakeOwnership();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMGroupManager$ʾ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */