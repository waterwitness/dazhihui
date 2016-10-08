package com.tencent;

import android.os.Handler;
import com.tencent.imcore.GroupDetailInfoVec;
import com.tencent.imcore.IGroupInfoListCallbackV2;
import com.tencent.imsdk.IMMsfCoreProxy;
import java.util.ArrayList;
import java.util.List;

abstract class TIMGroupManager$ʼ
  extends IGroupInfoListCallbackV2
{
  public TIMValueCallBack<TIMGroupSearchSucc> a;
  
  public TIMGroupManager$ʼ(TIMValueCallBack<TIMGroupSearchSucc> paramTIMValueCallBack)
  {
    swigReleaseOwnership();
    TIMValueCallBack localTIMValueCallBack;
    this.a = localTIMValueCallBack;
  }
  
  public abstract void a(int paramInt, String paramString);
  
  public abstract void a(TIMGroupSearchSucc paramTIMGroupSearchSucc);
  
  public void done(long paramLong, GroupDetailInfoVec paramGroupDetailInfoVec)
  {
    TIMGroupSearchSucc localTIMGroupSearchSucc = new TIMGroupSearchSucc();
    localTIMGroupSearchSucc.totalNum = paramLong;
    localTIMGroupSearchSucc.infoList = new ArrayList();
    int i = 0;
    while (i < paramGroupDetailInfoVec.size())
    {
      TIMGroupDetailInfo localTIMGroupDetailInfo = new TIMGroupDetailInfo(paramGroupDetailInfoVec.get(i));
      localTIMGroupSearchSucc.infoList.add(localTIMGroupDetailInfo);
      i += 1;
    }
    IMMsfCoreProxy.mainHandler.post(new ʿٴ(this, localTIMGroupSearchSucc));
    swigTakeOwnership();
  }
  
  public void fail(int paramInt, String paramString)
  {
    IMMsfCoreProxy.mainHandler.post(new ʿᐧ(this, paramInt, paramString));
    swigTakeOwnership();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMGroupManager$ʼ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */