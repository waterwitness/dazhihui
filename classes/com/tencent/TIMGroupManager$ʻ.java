package com.tencent;

import android.os.Handler;
import com.tencent.imcore.GroupDetailInfoVec;
import com.tencent.imcore.IGroupInfoListCallback;
import com.tencent.imsdk.IMMsfCoreProxy;
import java.util.ArrayList;
import java.util.List;

abstract class TIMGroupManager$ʻ
  extends IGroupInfoListCallback
{
  public TIMValueCallBack<List<TIMGroupDetailInfo>> a;
  
  public TIMGroupManager$ʻ(TIMValueCallBack<List<TIMGroupDetailInfo>> paramTIMValueCallBack)
  {
    swigReleaseOwnership();
    TIMValueCallBack localTIMValueCallBack;
    this.a = localTIMValueCallBack;
  }
  
  public abstract void a(int paramInt, String paramString);
  
  public abstract void a(List<TIMGroupDetailInfo> paramList);
  
  public void done(GroupDetailInfoVec paramGroupDetailInfoVec)
  {
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < paramGroupDetailInfoVec.size())
    {
      localArrayList.add(new TIMGroupDetailInfo(paramGroupDetailInfoVec.get(i)));
      i += 1;
    }
    IMMsfCoreProxy.mainHandler.post(new ʿי(this, localArrayList));
    swigTakeOwnership();
  }
  
  public void fail(int paramInt, String paramString)
  {
    IMMsfCoreProxy.mainHandler.post(new ʿـ(this, paramInt, paramString));
    swigTakeOwnership();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMGroupManager$ʻ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */