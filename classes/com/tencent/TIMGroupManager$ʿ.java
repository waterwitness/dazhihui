package com.tencent;

import android.os.Handler;
import com.tencent.imcore.GroupMemberInfoVec;
import com.tencent.imcore.IGroupMemberCallbackV2;
import com.tencent.imsdk.IMMsfCoreProxy;
import java.util.ArrayList;

abstract class TIMGroupManager$ʿ
  extends IGroupMemberCallbackV2
{
  public TIMValueCallBack<TIMGroupMemberSuccV2> a;
  
  public TIMGroupManager$ʿ(TIMValueCallBack<TIMGroupMemberSuccV2> paramTIMValueCallBack)
  {
    swigReleaseOwnership();
    TIMValueCallBack localTIMValueCallBack;
    this.a = localTIMValueCallBack;
  }
  
  public abstract void a(int paramInt, String paramString);
  
  public abstract void a(TIMGroupMemberSuccV2 paramTIMGroupMemberSuccV2);
  
  public void done(long paramLong, GroupMemberInfoVec paramGroupMemberInfoVec)
  {
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < paramGroupMemberInfoVec.size())
    {
      localArrayList.add(new TIMGroupMemberInfo(paramGroupMemberInfoVec.get(i)));
      i += 1;
    }
    paramGroupMemberInfoVec = new TIMGroupMemberSuccV2();
    paramGroupMemberInfoVec.setNextSeq(paramLong);
    paramGroupMemberInfoVec.setMemberInfoList(localArrayList);
    IMMsfCoreProxy.mainHandler.post(new ʿⁱ(this, paramGroupMemberInfoVec));
    swigTakeOwnership();
  }
  
  public void fail(int paramInt, String paramString)
  {
    IMMsfCoreProxy.mainHandler.post(new ʿﹳ(this, paramInt, paramString));
    swigTakeOwnership();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMGroupManager$ʿ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */