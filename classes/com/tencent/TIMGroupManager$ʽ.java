package com.tencent;

import android.os.Handler;
import com.tencent.imcore.GroupBaseInfo;
import com.tencent.imcore.GroupBaseInfoVec;
import com.tencent.imcore.IGroupListCallback;
import com.tencent.imsdk.IMMsfCoreProxy;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

abstract class TIMGroupManager$ʽ
  extends IGroupListCallback
{
  public TIMValueCallBack<List<TIMGroupBaseInfo>> a;
  
  public TIMGroupManager$ʽ(TIMValueCallBack<List<TIMGroupBaseInfo>> paramTIMValueCallBack)
  {
    swigReleaseOwnership();
    TIMValueCallBack localTIMValueCallBack;
    this.a = localTIMValueCallBack;
  }
  
  public abstract void a(int paramInt, String paramString);
  
  public abstract void a(List<TIMGroupBaseInfo> paramList);
  
  public final void done(GroupBaseInfoVec paramGroupBaseInfoVec)
  {
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    if (i < paramGroupBaseInfoVec.size())
    {
      GroupBaseInfo localGroupBaseInfo = paramGroupBaseInfoVec.get(i);
      TIMGroupBaseInfo localTIMGroupBaseInfo = new TIMGroupBaseInfo();
      for (;;)
      {
        try
        {
          localObject1 = new String(localGroupBaseInfo.getSGroupName(), "utf-8");
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException1)
        {
          try
          {
            String str = new String(localGroupBaseInfo.getSFaceUrl(), "utf-8");
            Object localObject2 = localObject1;
            localObject1 = str;
            localTIMGroupBaseInfo.setGroupName((String)localObject2);
            localTIMGroupBaseInfo.setGroupId(localGroupBaseInfo.getSGroupId());
            localTIMGroupBaseInfo.setGroupType(localGroupBaseInfo.getSGroupType());
            localTIMGroupBaseInfo.setFaceUrl((String)localObject1);
            localArrayList.add(localTIMGroupBaseInfo);
            i += 1;
          }
          catch (UnsupportedEncodingException localUnsupportedEncodingException2)
          {
            Object localObject1;
            Object localObject3;
            for (;;) {}
          }
          localUnsupportedEncodingException1 = localUnsupportedEncodingException1;
          localObject1 = "";
        }
        localUnsupportedEncodingException1.printStackTrace();
        localObject3 = localObject1;
        localObject1 = "";
      }
    }
    IMMsfCoreProxy.mainHandler.post(new ʿᴵ(this, localArrayList));
    swigTakeOwnership();
  }
  
  public void fail(int paramInt, String paramString)
  {
    IMMsfCoreProxy.mainHandler.post(new ʿᵎ(this, paramInt, paramString));
    swigTakeOwnership();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMGroupManager$ʽ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */