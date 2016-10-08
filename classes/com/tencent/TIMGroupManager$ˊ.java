package com.tencent;

import android.os.Handler;
import com.tencent.imcore.GroupPendencyItemVec;
import com.tencent.imcore.GroupPendencyMeta;
import com.tencent.imcore.IGroupGetPendencyCallback;
import com.tencent.imsdk.IMMsfCoreProxy;

abstract class TIMGroupManager$ˊ
  extends IGroupGetPendencyCallback
{
  public TIMValueCallBack<TIMGroupPendencyListGetSucc> a;
  
  public TIMGroupManager$ˊ(TIMValueCallBack<TIMGroupPendencyListGetSucc> paramTIMValueCallBack)
  {
    swigReleaseOwnership();
    TIMValueCallBack localTIMValueCallBack;
    this.a = localTIMValueCallBack;
  }
  
  public abstract void a(int paramInt, String paramString);
  
  public abstract void a(TIMGroupPendencyListGetSucc paramTIMGroupPendencyListGetSucc);
  
  public void done(GroupPendencyMeta paramGroupPendencyMeta, GroupPendencyItemVec paramGroupPendencyItemVec)
  {
    paramGroupPendencyMeta = new TIMGroupPendencyListGetSucc(TIMGroupManager.access$000(this.b), paramGroupPendencyMeta, paramGroupPendencyItemVec);
    IMMsfCoreProxy.mainHandler.post(new ˆʽ(this, paramGroupPendencyMeta));
    swigTakeOwnership();
  }
  
  public void fail(int paramInt, String paramString)
  {
    IMMsfCoreProxy.mainHandler.post(new ˆʾ(this, paramInt, paramString));
    swigTakeOwnership();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMGroupManager$ˊ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */