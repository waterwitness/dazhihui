package com.tencent;

import android.os.Handler;
import com.tencent.imcore.GroupMemberResultVec;
import com.tencent.imcore.IGroupMemberResultCallback;
import com.tencent.imcore.MemberResult;
import com.tencent.imsdk.IMMsfCoreProxy;
import java.util.ArrayList;
import java.util.List;

abstract class TIMGroupManager$ˆ
  extends IGroupMemberResultCallback
{
  public TIMValueCallBack<List<TIMGroupMemberResult>> a;
  
  public TIMGroupManager$ˆ(TIMValueCallBack<List<TIMGroupMemberResult>> paramTIMValueCallBack)
  {
    swigReleaseOwnership();
    TIMValueCallBack localTIMValueCallBack;
    this.a = localTIMValueCallBack;
  }
  
  public abstract void a(int paramInt, String paramString);
  
  public abstract void a(List<TIMGroupMemberResult> paramList);
  
  public void done(GroupMemberResultVec paramGroupMemberResultVec)
  {
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < paramGroupMemberResultVec.size())
    {
      MemberResult localMemberResult = paramGroupMemberResultVec.get(i);
      TIMGroupMemberResult localTIMGroupMemberResult = new TIMGroupMemberResult();
      localTIMGroupMemberResult.setUser(localMemberResult.getUser());
      localTIMGroupMemberResult.setResult(localMemberResult.getStatus());
      localArrayList.add(localTIMGroupMemberResult);
      i += 1;
    }
    IMMsfCoreProxy.mainHandler.post(new ʿﹶ(this, localArrayList));
    swigTakeOwnership();
  }
  
  public void fail(int paramInt, String paramString)
  {
    IMMsfCoreProxy.mainHandler.post(new ʿﾞ(this, paramInt, paramString));
    swigTakeOwnership();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMGroupManager$ˆ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */